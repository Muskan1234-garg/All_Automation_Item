import fs from 'fs';

const node_xlsx = require('node-xlsx');
const xlsx = require('xlsx');

class ExcelUsages_Utility {
    constructor() { }


    //JIRA ID OF STORY : RMA-109659
    //Description      : To Open And Read Spec Excel File Data and Return Excel Json Format
    //Input Parameters : excelFilePath -> It Will be Spec File Path For Comparison, sheetName --> It will Provide spec file sheet Name.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_OpenReadSpecExcelFileData(excelFilePath, sheetName) {
        const excelData = node_xlsx.parse(fs.readFileSync(excelFilePath));
        const excelSheet = excelData.find(sheets => sheets.name == sheetName);
        if (!excelSheet) {
            throw new Error(`Sheet "${sheetName}" not found in the workbook.`);
        }
        const sheetData = excelSheet.data
        const headers = sheetData.shift();
        const excelJsonFormat = sheetData.map((row) => {
            const json = {}
            row.forEach((data, idx) => json[headers[idx]] = data);
            return json;
        });
        return excelJsonFormat;
    }


    //JIRA ID OF STORY : RMA-109659
    //Description      : Return Total Sum of Specified Column inside Spec Excel Sheet
    //Input Parameters : specExcelFilePath --> It will Spec File Path,
    // sheetName --> It will be SheetName for which we have to do testing,
    // columnToSum --> It will be Length column inside spec File for which we have to perform Total length Of Row Test Case.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_CalculateSum_SpecifiedSpecExcelSheetColumn(specExcelFilePath, sheetName, columnToSum) {
        // Read the Spec Excel file
        const workbook = xlsx.readFile(specExcelFilePath);
        const worksheet = workbook.Sheets[sheetName];
        // Get the range of columns
        const range = xlsx.utils.decode_range(worksheet['!ref']);

        // Find the column index of the column to sum
        const columnIndexToSum = await this.AssureClaims_ClaimsScheduler_getSpecExcelColumnIndex(columnToSum)
        //console.log(`Column Index to Sum for ${columnToSum}: ${columnIndexToSum}`);

        // Calculate the sum of values in the specified column
        let total = 0;
        for (let rowIndex = range.s.r + 1; rowIndex <= range.e.r; rowIndex++) {
            const cellAddress = xlsx.utils.encode_cell({ r: rowIndex, c: columnIndexToSum });
            const cellValue = worksheet[cellAddress] ? worksheet[cellAddress].v : 0;
            total += parseFloat(cellValue) || 0;
        }
        //console.log(`Total of column ${columnToSum}: ${total}`);
        return total;
    }


    //JIRA ID OF STORY : RMA-109659
    //Description      : Return Spec Excel Column Index using Column Name
    //Input Parameters : columnLetter --> It will Provide Column Letter for which we have to find index.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_getSpecExcelColumnIndex(columnLetter) {
        let columnIndex = 0;
        for (let i = 0; i < columnLetter.length; i++) {
            columnIndex = columnIndex * 26 + (columnLetter.charCodeAt(i) - 65 + 1);
        }
        return columnIndex - 1; // Subtract 1 to make it zero-based
    }

}; export default ExcelUsages_Utility;
