import { Selector, t } from 'testcafe';
import Verification_Utility from '../../../Functional_Utilities/Verification_Utility';
import Logs_Utility from './Logs_Utility';


const Verify_Utility = new Verification_Utility();
const Log_Utility = new Logs_Utility();


const fs = require('fs');
const path = require('path');

class Importtool_Utility {
    constructor() { }

    //************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109815
    //Description      : It is used to read from csv file
    //Input Parameters : filePath-->It denotes the filepath where it needs to be read,columnposition-->it denotes the column position of csv file,rowposition-->it denotes the row position of the csv file
    //Revision         : Sukanya Bose 02/23/2024
    // ***********************************************************************************************************************************************************************************************************************************************************************************
    async AssureClaims_ClaimScheduler_getValuebyColumnRowPosition_Utility(filePath, columnPosition, rowPosition) {
        try {
            const resultRows = [];
            const fullPath = filePath;
            const data = fs.readFileSync(fullPath, 'utf8');
            const rows = data.split('\n');

            const nonEmptyRows = rows.filter(row => row.trim() !== '');

            // Return the row count
            const rowCount = nonEmptyRows.length - 1;
            console.log(rowCount)

            // Validate RowPosition
            if (rowPosition < 0 || rowPosition >= rows.length) {
                throw new Error('Start row position out of bounds');
            }

            for (let i = rowPosition; i < rowPosition + rowCount && i < rows.length; i++) {
                const values = rows[i].split(',');

                // Validate columnPosition
                if (columnPosition < 0 || columnPosition >= values.length) {
                    throw new Error('Column position out of bounds');
                }

                // Add the value at the specified column and row position to the result array
                resultRows.push(values[columnPosition]);
            }
            return resultRows;
        } catch (error) {
            throw new Error(`Error reading CSV file: ${error.message}`);
        }
    }
    //*****************************************************************************************************************
    //JIRA ID OF STORY : RMA-109815
    //Description      : It is used to Read Data from Import file and then it will store the data into the array
    //Input Parameters : headerarrayimportfile --> It store the funds data from import file, lineitemsimportfile --> It store the funds_trans_split data from import file , rows --> It denotes the row present in import file
    //Revision       : Sukanya Bose 02/23/2024
    // *******************************************************************************************************************
    async AssureClaims_ReadDatafromImportFile_Utility(headerarrayimportfile, lineitemsimportfile, rows) {
        for (var item of rows) {
            switch (item[0]) {
                case 'H':
                    headerarrayimportfile.push(item)
                    break;
                case 'L':
                    lineitemsimportfile.push(item)
                    break;
            }
        }
    }

    //*****************************************************************************************************************
    //JIRA ID OF STORY : RMA-109815
    //Description      : It is used to Read Data from spec file and then it will store the data into the respective header and lineitems array
    //Input Parameters : excelSpecData --> It is spec file for impor tool of MBR module, headerarrayspecfile --> It store the data header from spec file, lineitemsimportfile --> It store the lineitems data from spec file
    //Revision       : Sukanya Bose 02/23/2024
    // *******************************************************************************************************************
    async AssureClaims_ReadDatafromSpecFile_Utility(excelSpecData, headerarrayspecfile, lineitemsspecfile) {
        for (var item of excelSpecData) {
            switch (item.TABLENAME) {
                case 'HEADER':
                    headerarrayspecfile.push(item)
                    break;
                case 'LINE ITEM':
                    lineitemsspecfile.push(item)
                    break;
                default:
                    break;
            }
        }
    }

    //*****************************************************************************************************************
    //JIRA ID OF STORY : RMA-109815
    //Description      : It is used to GetValue based on Selector from transaction screen
    //Input Parameters : arraySpecFile -->It contains the import spec files row
    //Revision       : Sukanya Bose 02/23/2024
    // *******************************************************************************************************************
    async AssureClaims_GetAttributeValuebasedonSelector_Utility(arraySpecFile) {
        let outputArray = []
        var outputUIValue;
        const filteredRows = arraySpecFile
            .filter(row => row.VALIDATETHROUGHAUTOMATION === 'yes')
            .map(row => ({
                selector: row['SELECTOR'],
                datatype: row['DATATYPE']
            }));
        for (var item of filteredRows) {
            switch (item.datatype) {
                case 'TEXT':
                    outputUIValue = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Selector(item.selector));
                    break;
                case 'CURRENCY':
                    outputUIValue = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Selector(item.selector).nth(1));
                    break;
                case 'DROPDOWNSHORTCODE':
                    outputUIValue = await Verify_Utility.AssureClaims_AttributeFetchShortCodeforDropDownControl_Utility(item.selector);
                    break;
            }
            outputArray.push(outputUIValue);
        }
        return outputArray;
    }

    //*****************************************************************************************************************
    //JIRA ID OF STORY : RMA-109815
    //Description      : It is used to get the selector values from spec file for which VALIDATETHROUGHAUTOMATION is yes
    //Input Parameters : arrayspecfile --> It denotes the spec file for MBR module
    //Revision       : Sukanya Bose 02/23/2024
    // *******************************************************************************************************************
    async AssureClaims_GetSelectorsfromSpecFile(arrayspecfile) {
        var selectorvalue;
        const selectorvalues = arrayspecfile.filter(row => row.VALIDATETHROUGHAUTOMATION === 'yes').map(filteredrow => filteredrow['SELECTOR'])
        const selectorstr = selectorvalues.join(',')
        selectorvalue = selectorstr.split(',');
        return selectorvalue;
    }

    //*****************************************************************************************************************
    //JIRA ID OF STORY : RMA-109815
    //Description      : It is used to get the value based on seperator form array
    //Input Parameters : seperator --> It denotes the seperator either it is pipe or comma, arrayimportfile --> It denotes the array of import file either it could be header or lineitems
    //Revision       : Sukanya Bose 02/23/2024
    // *******************************************************************************************************************
    async AssureClaims_SplitSeperator_FetchValuefromImportFile_Utility(seperator, arrayimportfile) {
        let finalimportarray = []
        for (var item of arrayimportfile) {
            var splitdata = item.split(seperator)
            finalimportarray.push(splitdata)
        }
        return finalimportarray;
    }

    //*****************************************************************************************************************
    //JIRA ID OF STORY : RMA-109815
    //Description      : It is used to fetching the value from import file and store in the a array
    //Input Parameters : arraySpecFile --> It denotes the spec file array, importArray --> It denotes the import file array
    //Revision       : Sukanya Bose 02/23/2024
    // *******************************************************************************************************************
    async AssureClaims_GetAttributeValuefromImportFile_Utility(arraySpecFile, importArray) {
        let inputArray = []
        arraySpecFile.forEach((element, index) => {
            if (element.VALIDATETHROUGHAUTOMATION === 'yes') {
                importArray.forEach(item => {
                    var importFileValue = item[index];
                    inputArray.push(importFileValue);
                });
            }
        });
        return inputArray;
    }

    //*****************************************************************************************************************
    //JIRA ID OF STORY : RMA-109815
    //Description      : It is used to check for validation between the imported transaction UI value and import file value
    //Input Parameters : outputarray --> It denotes the array of transaction UI level, finalimportarray --> It denotes the array of import file value
    //Revision       : Sukanya Bose 02/23/2024
    // *******************************************************************************************************************
    async AssureClaims_ValidationcheckforPostImportData_Utility(outputarray, inputarray) {
        let ResultArray = [];
        for (let i = 0; i < outputarray.length; i++) {
            const outputItem = outputarray[i].replace(/,/g, '').replace(/-/g, '').replace(/\$/g, ''); // Remove special characters
            const inputItem = inputarray[i].replace(/,/g, '').replace(/-/g, '').replace(/\$/g, ''); // Remove special characters
            const matchResult = outputItem === inputItem;
            ResultArray.push(matchResult);
        }

        return ResultArray;
    }

    //*****************************************************************************************************************
    //JIRA ID OF STORY : RMA-109815
    //Description      : It is used generate the message and print in console based on the fields for which import is sucessful not not
    //Input Parameters : ResultArray --> It store the result value where the validation is passed or not, 
    //arrayspecfile --> It denotes the array of specfile where we can fetch the fieldname
    //uniqueIdentifierName--->It denotes the unique identifier value for each import tool module
    //uniqueIdentifierValue -->It denotes the unique idenfier value for each import tool module
    //Revision       : Sukanya Bose 02/23/2024
    // *******************************************************************************************************************
    async Assureclaims_GenerateMessage_Utility(ResultArray, arrayspecfile, uniqueIdentifierName, uniqueIdentifierValue) {
        const FieldnameArray = arrayspecfile.filter(row => row.VALIDATETHROUGHAUTOMATION === 'yes').map(filteredrow => filteredrow['FIELDNAME'])

        for (let i = 0; i < Math.min(ResultArray.length, FieldnameArray.length); i++) {
            const result = ResultArray[i];
            const field = FieldnameArray[i];
            //console.log(`Import through Automation is ${result} for the fieldname: ${field}`);
            const message = `Data validation for the import file and UI for "${field}": ${result} for the ${uniqueIdentifierName}: ${uniqueIdentifierValue}`;
            await Log_Utility.AssureClaims_ClaimsScheduler_LogMessage(message, result);
        }
    }
    //*****************************************************************************************************************
    //JIRA ID OF STORY : RMA-109588
    //Description      : It is used delete all the files in a specified folder location
    //Input Parameters : folderPath --> It denotes the folder path from where all files needs to be deleted
    //Revision       : Sukanya Bose 02/26/2024
    // *******************************************************************************************************************
    async Assureclaims_DeleteFiles_Utility(folderPath) {
        fs.readdir(folderPath, (err, files) => {
            if (err) {
                console.error('Error reading folder:', err);
                return;
            }
            // Loop through each file and delete it
            files.forEach(file => {
                const filePath = path.join(folderPath, file);
                fs.unlink(filePath, err => {
                    if (err) {
                        console.error('Error deleting file:', filePath, err);
                    } else {
                        console.log('Deleted file:', filePath);
                    }
                });
            });
        });
    }
    //*****************************************************************************************************************
    //JIRA ID OF STORY : RMA-109588
    //Description      : It is used delete all the files in a specified folder location
    //Input Parameters : folderPath --> It denotes the folder path from where folder needs to be deleted
    //Revision       : Sukanya Bose 02/26/2024
    // *******************************************************************************************************************
    async Assureclaims_DeleteFolder_Utility(folderPath) {
        // Check if the folder exists
        if (fs.existsSync(folderPath)) {
            // Check if the folder is empty
            const files = fs.readdirSync(folderPath);
            if (files.length === 0) {
                // Delete the folder
                fs.rmdirSync(folderPath);
                console.log(`Folder ${folderPath} deleted successfully.`);
            } else {
                console.log(`Folder ${folderPath} is not empty.`);
            }
        } else {
            console.log(`Folder ${folderPath} does not exist.`);
        }
    }
}
export default Importtool_Utility;