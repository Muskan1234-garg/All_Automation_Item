import { t } from 'testcafe';
import fs from 'fs';
import ExcelUsages_Utility from '../../../Excel_Utility/ExcelUsages_Utility';
import LogsUsage_Utility from '../../Logs_Utility';
import FixedLengthFormatterService_Utility from '../ClaimScheduler/ConfigManager_ClaimScheduler_FixedLengthFormatterService_Utility';

const Excel_Utility = new ExcelUsages_Utility();
const FixedLengthService_Utility = new FixedLengthFormatterService_Utility();


class ExtractToolService_Utility {
    constructor(isExcecuteCompareWithConstants, isExcecuteValidateRequiredFields, isExcecuteValidateTotalLengthOfField, isExcecuteCompareTotalLengthOfRow, fileFormat) {
        this.headerRowIndexInExtractFile = 0
        this.headerRowsCountInExtractFile = 0
        this.trailerRowsCountInExtractFile = 0
        this.totalRowsCountInExtractFile = 0
        this.isExcecuteCompareWithConstants = isExcecuteCompareWithConstants
        this.isExcecuteValidateRequiredFields = isExcecuteValidateRequiredFields
        this.isExcecuteValidateTotalLengthOfField = isExcecuteValidateTotalLengthOfField
        this.isExcecuteCompareTotalLengthOfRow = isExcecuteCompareTotalLengthOfRow
        this.fileFormat = fileFormat
        this.isLastRow = false
    }
    //==============================RMA-109641 : Aditi's Code starts here=======================================================================


    //JIRA ID OF STORY : RMA-109659
    //Description      : Create and return a new instance of ExtractToolService_Utility
    //Input Parameters : specFilePath -> Provide Extracted File Path
    //Revision         : Aditi Aggarwal 02-25-2024
    static async ExtractToolService_Utility_createInstance(specFilePath) {
        let isExcecuteCompareWithConstants = await this.AssureClaims_ClaimsScheduler_ReturnValueBasedOnProperty_InSpecFile(specFilePath, "InfoDetails", "ExcecuteTestCase_CompareWithConstants")
        let isExcecuteValidateRequiredFields = await this.AssureClaims_ClaimsScheduler_ReturnValueBasedOnProperty_InSpecFile(specFilePath, "InfoDetails", "ExcecuteTestCase_ValidateRequiredFields")
        let isExcecuteValidateTotalLengthOfField = await this.AssureClaims_ClaimsScheduler_ReturnValueBasedOnProperty_InSpecFile(specFilePath, "InfoDetails", "ExcecuteTestCase_ValidateTotalLengthOfField")
        let isExcecuteCompareTotalLengthOfRow = await this.AssureClaims_ClaimsScheduler_ReturnValueBasedOnProperty_InSpecFile(specFilePath, "InfoDetails", "ExcecuteTestCase_CompareTotalLengthOfRow")
        let fileFormat = await this.AssureClaims_ClaimsScheduler_ReturnValueBasedOnProperty_InSpecFile(specFilePath, "InfoDetails", "FileFormat")
        return new ExtractToolService_Utility(isExcecuteCompareWithConstants, isExcecuteValidateRequiredFields, isExcecuteValidateTotalLengthOfField, isExcecuteCompareTotalLengthOfRow, fileFormat);
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : It is used to return value based on Property inside Spec Excel File
    //Input Parameters : specExcelFilePath -> It will be Spec File Path For Comparison, sheetName --> It will Provide spec file sheet Name, propertyName --> It will be Property whose value to be find
    //Revision         : Aditi Aggarwal 02-25-2024
    static async AssureClaims_ClaimsScheduler_ReturnValueBasedOnProperty_InSpecFile(specExcelFilePath, sheetName, propertyName) {
        let specJsonData = await Excel_Utility.AssureClaims_ClaimsScheduler_OpenReadSpecExcelFileData(specExcelFilePath, sheetName)
        // Use the find() method to find the object with the specified property value
        let valueOfParameter = specJsonData.find(obj => obj.Parameters == propertyName).Values
        return valueOfParameter.toLowerCase()
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : To Open and Read Extacted File and Return Data
    //Input Parameters : filePath -> It Will be Extracted File Path For Comparison
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_ExtractedFile_OpenReadFileData(filePath) {
        const csvData = fs.readFileSync(filePath, 'utf8')
        const rows = csvData.split('\n')
        return rows;
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : Open Read and Return Specific Row Of File
    //Input Parameters : filePath -> It Will be Extracted File Path For Comparison, specificRowIndex --> It will be Row Index for that Particular Row Inside Extracted File.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_ExtractedFile_SpecificRow(filePath, specificRowIndex) {
        const csvData = fs.readFileSync(filePath, 'utf8')
        const rows = csvData.split('\n')
        const specificRow = rows[specificRowIndex]
        return specificRow
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : Return Text without Quotes
    //Input Parameters : textWithQuotes -->It will be any Text including Quotes.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_textWithoutQuotes(textWithQuotes) {
        // Remove inverted commas using JavaScript string methods
        const textWithoutQuotes = textWithQuotes.replace(/["']/g, '');
        return textWithoutQuotes;
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : Function to filter objects based on a specific property value
    //Input Parameters : array -->It will be collection of rows, property --> It will be property for which we  have to filter, value --> It will be value of that property on this basis we  will filter array
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_filterObjectsByPropertyValue(array, property, value) {
        return array.filter(item => item[property] === value);
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : Provide Functionality To Validate Header using Extracted File and Spec File
    // 1. Test Case Include Compare with constants.
    // 2. Test Case Include Validate Required Fields.
    // 3. Test Case Include Validate Total Length Of Field And Data Type should be correct.
    // 4. Test Case Include Compare Total Length Of Row.
    //Input Parameters : headerRow -->It will be Header Row inside Extracted File, filteredExcelSpecRows--> It will be Spec File Rows Which are allowed to be Tested, 
    // specFilePath -->It will be Spec File Path, sheetName --> It will be SheetName for which we have to do testing, columnToSum --> It will be Length column inside spec File for which we have to perform Total length Of Row Test Case,
    // specificRowIndex --> It will be Row Index for that Particular Row Inside Extracted File.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_ExtractedFile_ValidateHeaderRow(headerRow, filteredExcelSpecRows, specFilePath, specificFilePath, sheetName, columnToSum, specificRowIndex) {
        for (const specRow of filteredExcelSpecRows) {
            if (this.isExcecuteCompareWithConstants.toLowerCase() === "yes") {
                await this.AssureClaims_ClaimScheduler_ExtractedFileComparison_CompareWithConstants(headerRow, specRow, sheetName, specificRowIndex)
            }
            if (this.isExcecuteValidateRequiredFields.toLowerCase() === "yes") {
                await this.AssureClaims_ClaimScheduler_ExtractedFileComparison_ValidateRequiredFields(headerRow, specRow, sheetName, specificRowIndex)
            }
            if (this.isExcecuteValidateTotalLengthOfField.toLowerCase() === "yes") {
                await this.AssureClaims_ClaimScheduler_ExtractedFileComparison_ValidateTotalLengthOfField_AndDataType(headerRow, specRow, sheetName, specificRowIndex)
            }
        }
        if (this.isExcecuteCompareTotalLengthOfRow.toLowerCase() === "yes") {
            await this.Assureclaims_ClaimScheduler_ExtractedFileComparison_CompareTotalLengthOfRow(specFilePath, sheetName, columnToSum, specificFilePath, specificRowIndex)
        }
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : Provide Functionality To Validate Header, It is the main method which will called inside Test Case while Testing Header Rows
    //only if ValidateHeader Property is set Yes inside InfoDetails Sheet inside Spec File.
    // Steps Include Below:-
    // 1. Reading Header Meta Data Sheet inside Spec File and Calulate how many headers we have to verify based on property Group Header.
    // 2. Then Read Header Spec Sheet one by one and find out which peroperties have to be validate.
    // 3. Then finally Validate Extracted File with Spec File.
    //Input Parameters : specExcelFilePath --> It will Spec File Path, extractedFilePath --> It will be Extracted File Path,
    // sheetName --> It will be Header Meta Data SheetName where we stored all information Regarding Headers, 
    // columnToSum --> It will be Length column inside spec File for which we have to perform Total length Of Row Test Case.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_ExtractedFile_ValidateHeader_ExtractToolUtility(specExcelFilePath, extractedFilePath, sheetName, columnToSum) {
        await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Reading HeaderMetaData Spec Sheet.");
        let specHeaderMetaData = await Excel_Utility.AssureClaims_ClaimsScheduler_OpenReadSpecExcelFileData(specExcelFilePath, sheetName)
        let headerRowsToBeValidate = await this.AssureClaims_ClaimsScheduler_filterObjectsByPropertyValue(specHeaderMetaData, "GroupHeader", "No")
        this.headerRowsCountInExtractFile = headerRowsToBeValidate.length
        await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Total Header Rows To Be Validate :- " + this.headerRowsCountInExtractFile + ".")
        for (const specRow of headerRowsToBeValidate) {
            await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Validating Spec Sheet :- " + specRow.HeaderSheetName + ".")
            let lastChar = specRow.HeaderSheetName[specRow.HeaderSheetName.length - 1]
            const isLastCharInt = /^\d$/.test(lastChar);
            if (isLastCharInt) {
                //this.headerRowIndexInExtractFile = specRow.HeaderSheetName[specRow.HeaderSheetName.length - 1]
                this.headerRowIndexInExtractFile = parseInt(lastChar, 10);
                let specifictFileRow = await this.AssureClaims_ClaimsScheduler_ExtractedFile_SpecificRow(extractedFilePath, this.headerRowIndexInExtractFile)
                let allHeaderSpecsRows = await Excel_Utility.AssureClaims_ClaimsScheduler_OpenReadSpecExcelFileData(specExcelFilePath, specRow.HeaderSheetName)
                let filteredHeaderSpecFile = await this.AssureClaims_ClaimsScheduler_filterObjectsByPropertyValue(allHeaderSpecsRows, "ValidateThroughAutomation", "Yes")
                await this.AssureClaims_ClaimsScheduler_ExtractedFile_ValidateHeaderRow(specifictFileRow, filteredHeaderSpecFile, specExcelFilePath, extractedFilePath, specRow.HeaderSheetName, columnToSum, this.headerRowIndexInExtractFile)
            } else {
                await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("The last character in Sheet Name " + specRow.HeaderSheetName + " is not an integer so can't able to find index of Header Rows", false);
            }
        }
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : Provide Functionality To Validate Detail Row using Extracted File and Spec File
    // 1. Test Case Include Compare with constants.
    // 2. Test Case Include Validate Required Fields.
    // 3. Test Case Include Validate Total Length Of Field And Data Type should be correct.
    // 4. Test Case Include Compare Total Length Of Row.
    //Input Parameters : detailRow -->It will be Detail Row inside Extracted File, filteredExcelSpecRows--> It will be Spec File Rows Which are allowed to be Tested, 
    // specFilePath -->It will be Spec File Path, filePath --> It will be Extracted File Path, sheetName --> It will be SheetName for which we have to do testing, 
    // columnToSum --> It will be Length column inside spec File for which we have to perform Total length Of Row Test Case,
    // specificRowIndex --> It will be Row Index for that Particular Row Inside Extracted File.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_ExtractedFile_ValidateDetailRow(detailRow, filteredExcelSpecRows, specFilePath, filePath, sheetName, columnToSum, specificRowIndex) {
        for (const specRow of filteredExcelSpecRows) {
            if (this.isExcecuteCompareWithConstants.toLowerCase() === "yes") {
                await this.AssureClaims_ClaimScheduler_ExtractedFileComparison_CompareWithConstants(detailRow, specRow, sheetName, specificRowIndex)
            }
            if (this.isExcecuteValidateRequiredFields.toLowerCase() === "yes") {
                await this.AssureClaims_ClaimScheduler_ExtractedFileComparison_ValidateRequiredFields(detailRow, specRow, sheetName, specificRowIndex)
            }
            if (this.isExcecuteValidateTotalLengthOfField.toLowerCase() === "yes") {
                await this.AssureClaims_ClaimScheduler_ExtractedFileComparison_ValidateTotalLengthOfField_AndDataType(detailRow, specRow, sheetName, specificRowIndex)
            }
        }
        if (this.isExcecuteCompareTotalLengthOfRow.toLowerCase() === "yes") {
            await this.Assureclaims_ClaimScheduler_ExtractedFileComparison_CompareTotalLengthOfRow(specFilePath, sheetName, columnToSum, filePath, specificRowIndex)
        }
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : Provide Functionality To Validate Detail, It is the main method which will called inside Test Case while Testing Detail Rows 
    //only if ValidateDetail Property is set Yes inside InfoDetails Sheet inside Spec File.
    // Steps Include Below:-
    // 1. Firstly Set StartDetailRowIndex  so that we know from where Detail Rows are starting inside File.
    // 2. Then Set Total Detail Rows In ExtractFile which need to be validate except Header and Trailer.
    // 3. Then finally Validate Detail Rows against Spec File.
    //Input Parameters : fileData --> Extracted File Rows, specExcelFilePath --> It will Spec File Path, extractedFilePath --> It will be Extracted File Path,
    // sheetName --> It will be SheetName for which we have to do testing,
    // columnToSum --> It will be Length column inside spec File for which we have to perform Total length Of Row Test Case.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_ExtractedFile_ValidateDetail_ExtractToolUtility(fileData, specExcelFilePath, extractedFilePath, sheetName, columnToSum) {
        //Set Start Row Index for Detail Section
        let headerRowIndex = this.headerRowIndexInExtractFile
        let startDetailRowIndex = headerRowIndex + 1
        await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Detail Rows Starting Index is " + startDetailRowIndex + ".")
        this.totalRowsCountInExtractFile = fileData.length
        await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Total Rows Count inside Extracted File is " + this.totalRowsCountInExtractFile + ".")
        //Set Trailer Rows Count
        let specTrailerMetaData = await Excel_Utility.AssureClaims_ClaimsScheduler_OpenReadSpecExcelFileData(specExcelFilePath, "TrailerMetaData")
        this.trailerRowsCountInExtractFile = specTrailerMetaData.length
        await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Total Trailer Rows Count inside Extracted File is " + this.trailerRowsCountInExtractFile + ".")
        await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Total Header Rows Count inside Extracted File is " + this.headerRowsCountInExtractFile + ".")

        //Calculate TotalDetailRows 
        let totalDetailRowsInExtractFile_ToBeValidate = this.totalRowsCountInExtractFile - this.headerRowsCountInExtractFile - this.trailerRowsCountInExtractFile
        await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Total Detail Rows inside Extracted File which we are going to Validate is " + totalDetailRowsInExtractFile_ToBeValidate + ".")

        //Now set EndDetailRowIndex
        let endDetailRowIndex = startDetailRowIndex + totalDetailRowsInExtractFile_ToBeValidate

        // Extract rows based on start and end indexes
        const selectedDetailRows = fileData.slice(startDetailRowIndex, endDetailRowIndex);
        if (selectedDetailRows.length > 0) {
            let allDetailSpecsRows = await Excel_Utility.AssureClaims_ClaimsScheduler_OpenReadSpecExcelFileData(specExcelFilePath, sheetName)
            let filteredDetailSpecFile = await this.AssureClaims_ClaimsScheduler_filterObjectsByPropertyValue(allDetailSpecsRows, "ValidateThroughAutomation", "Yes")
            for (const detailRow of selectedDetailRows) {
                await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Start Validating Detail Row Having Index " + startDetailRowIndex + ".")
                await this.AssureClaims_ClaimsScheduler_ExtractedFile_ValidateDetailRow(detailRow, filteredDetailSpecFile, specExcelFilePath, extractedFilePath, sheetName, columnToSum, startDetailRowIndex)
                await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Validation Ends for Detail Row Having Index " + startDetailRowIndex + ".")
                startDetailRowIndex++
            }
        }
        else {
            await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("No Detail Record Is available to Validate.")
        }
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : Provide Functionality To Validate Trailer Row using Extracted File and Spec File
    // 1. Test Case Include Compare with constants.
    // 2. Test Case Include Validate Required Fields.
    // 3. Test Case Include Validate Total Length Of Field And Data Type should be correct.
    // 4. Test Case Include Compare Total Length Of Row.
    //Input Parameters : trailerRow -->It will be Trailer Row inside Extracted File, filteredExcelSpecRows--> It will be Spec File Rows Which are allowed to be Tested, 
    // specFilePath -->It will be Spec File Path, filePath --> It will be Extracted File Path, sheetName --> It will be SheetName for which we have to do testing, 
    // columnToSum --> It will be Length column inside spec File for which we have to perform Total length Of Row Test Case,
    // specificRowIndex --> It will be Row Index for that Particular Row Inside Extracted File.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_ExtractedFile_ValidateTrailerRow(trailerRow, filteredExcelSpecRows, specFilePath, filePath, sheetName, columnToSum, specificRowIndex) {
        for (const specRow of filteredExcelSpecRows) {
            if (this.isExcecuteCompareWithConstants.toLowerCase() === "yes") {
                await this.AssureClaims_ClaimScheduler_ExtractedFileComparison_CompareWithConstants(trailerRow, specRow, sheetName, specificRowIndex)
            }
            if (this.isExcecuteValidateRequiredFields.toLowerCase() === "yes") {
                await this.AssureClaims_ClaimScheduler_ExtractedFileComparison_ValidateRequiredFields(trailerRow, specRow, sheetName, specificRowIndex)
            }
            if (this.isExcecuteValidateTotalLengthOfField.toLowerCase() === "yes") {
                await this.AssureClaims_ClaimScheduler_ExtractedFileComparison_ValidateTotalLengthOfField_AndDataType(trailerRow, specRow, sheetName, specificRowIndex)
            }
        }
        if (this.isExcecuteCompareTotalLengthOfRow.toLowerCase() === "yes") {
            await this.Assureclaims_ClaimScheduler_ExtractedFileComparison_CompareTotalLengthOfRow(specFilePath, sheetName, columnToSum, filePath, specificRowIndex)
        }
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : Provide Functionality To Validate Trailer, It is the main method which will called inside Test Case while Testing Trailer Rows
    //only if ValidateTrailer Property is set Yes inside InfoDetails Sheet inside Spec File.
    // Steps Include Below:-
    // 1. Reading Trailer Meta Data Sheet inside Spec File and Calulate how many Trailer Rows we have to verify.
    // 2. Then Read Trailer Spec Sheet one by one and find out which peroperties have to be validate.
    // 3. Then finally Validate Extracted File with Spec File.
    //Input Parameters : specExcelFilePath --> It will Spec File Path, extractedFilePath --> It will be Extracted File Path,
    // sheetName --> It will be Trailer Meta Data SheetName where we stored all information Regarding Trailer, 
    // columnToSum --> It will be Length column inside spec File for which we have to perform Total length Of Row Test Case.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_ExtractedFile_ValidateTrailer_ExtractToolUtility(specExcelFilePath, extractedFilePath, sheetName, columnToSum) {
        await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Reading TrailerMetaData Spec Sheet.")
        let specTrailerMetaData = await Excel_Utility.AssureClaims_ClaimsScheduler_OpenReadSpecExcelFileData(specExcelFilePath, sheetName)
        let endTrailerIndex = 0
        for (const specRow of specTrailerMetaData) {
            endTrailerIndex++
            let trailerIndex = this.totalRowsCountInExtractFile - endTrailerIndex
            await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Trailer Index " + trailerIndex + ".")
            if (endTrailerIndex == 1) {
                this.isLastRow = true
                await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("This is Last Row in Extracted File with Trailer Index is " + trailerIndex)
            } else {
                this.isLastRow = false
            }
            await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Validating Spec Sheet " + specRow.TrailerSheetName + ".")
            let specificTrailerRow = await this.AssureClaims_ClaimsScheduler_ExtractedFile_SpecificRow(extractedFilePath, trailerIndex)
            let allTrailerSpecsRows = await Excel_Utility.AssureClaims_ClaimsScheduler_OpenReadSpecExcelFileData(specExcelFilePath, specRow.TrailerSheetName)
            let filteredTrailerSpecFile = await this.AssureClaims_ClaimsScheduler_filterObjectsByPropertyValue(allTrailerSpecsRows, "ValidateThroughAutomation", "Yes")
            await this.AssureClaims_ClaimsScheduler_ExtractedFile_ValidateTrailerRow(specificTrailerRow, filteredTrailerSpecFile, specExcelFilePath, extractedFilePath, specRow.TrailerSheetName, columnToSum, trailerIndex)

        }
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : It will be used to Compare Total Length of Specific Row inside Extracted File.
    //Input Parameters : specFilePath -> Provide Spec File Path For Comparison,
    // sheetName --> It will be SheetName for which we have to do testing,
    // columnToSum --> It will be Length column inside spec File for which we have to perform Total length Of Row Test Case.,
    // extractedFilePath --> It Will be Extracted File Path, specificRowIndex --> It will be Row Index for that Particular Row Inside Extracted File.
    //Revision         : Aditi Aggarwal 02-25-2024
    async Assureclaims_ClaimScheduler_ExtractedFileComparison_CompareTotalLengthOfRow(specFilePath, sheetName, columnToSum, extractedFilePath, specificRowIndex) {
        let totalLengthOfColumnInExcel = 0;
        let totalLengthOfRow = 0;
        try {
            totalLengthOfColumnInExcel = await Excel_Utility.AssureClaims_ClaimsScheduler_CalculateSum_SpecifiedSpecExcelSheetColumn(specFilePath, sheetName, columnToSum)
            if (this.fileFormat.toLowerCase() === "fixedlength") {
                totalLengthOfRow = await FixedLengthService_Utility.AssureClaims_ClaimsScheduler_ExtractedFixedLengthFile_RowLength(extractedFilePath, specificRowIndex, this.isLastRow)
            }
            await t.expect(totalLengthOfColumnInExcel).eql(totalLengthOfRow);
        }
        catch (error) {
            await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Total Length of Extracted File Row with index " + specificRowIndex + " is not matched with " + sheetName + " Spec Sheet.Total Length of Row in Extract File is " + totalLengthOfRow + " and in Spec File is " + totalLengthOfColumnInExcel + ".", false);
        }
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : It will be used to Compare Extracted Fields with constants using Spec File.
    //Input Parameters : extractedFileRow -> It will be Extracted File Row, specRow --> It will be Specific Spec Row
    // sheetName --> It will be SheetName for which we have to do testing,
    //specificRowIndex --> It will be Row Index for that Particular Row Inside Extracted File.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimScheduler_ExtractedFileComparison_CompareWithConstants(extractedFileRow, specRow, sheetName, specificRowIndex) {
        if (specRow.ConstantValue && specRow.ConstantValue.length > 0) {
            let extractedValue = "";
            let DefaultValueWithoutQuotes = "";
            try {
                if (this.fileFormat.toLowerCase() === "fixedlength") {
                    extractedValue = await FixedLengthService_Utility.AssureClaims_ClaimsScheduler_ExtractContentValueFromFixedLengthFile(extractedFileRow, specRow.Start, specRow.End)
                }
                DefaultValueWithoutQuotes = await this.AssureClaims_ClaimsScheduler_textWithoutQuotes(specRow.ConstantValue)
                await t.expect(extractedValue).eql(DefaultValueWithoutQuotes);
                await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Compare with constants Test case passed for Spec Sheet : " + sheetName + " having Field Name: " + specRow.FieldName + " and Row index of ExtractedFile is " + specificRowIndex + ".", true);
            }
            catch (error) {
                await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Compare with constants Test case failed for Spec Sheet : " + sheetName + " having Field Name: " + specRow.FieldName + " and Row index of ExtractedFile is " + specificRowIndex + ".Constant inside Extract File should be " + DefaultValueWithoutQuotes + " but Extracted Value " + extractedValue + ".", false);
            }
        }
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : It will be used to Validate Required Fields inside Extracted File using Spec File.
    //Input Parameters : extractedFileRow -> It will be Extracted File Row, specRow --> It will be Specific Spec Row
    // sheetName --> It will be SheetName for which we have to do testing,
    //specificRowIndex --> It will be Row Index for that Particular Row Inside Extracted File.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimScheduler_ExtractedFileComparison_ValidateRequiredFields(extractedFileRow, specRow, sheetName, specificRowIndex) {
        if (specRow.Required === "Yes") {
            let extractedValue = "";
            try {
                if (this.fileFormat.toLowerCase() === "fixedlength") {
                    extractedValue = await FixedLengthService_Utility.AssureClaims_ClaimsScheduler_ExtractContentValueFromFixedLengthFile(extractedFileRow, specRow.Start, specRow.End)
                }
                await t.expect(extractedValue.trim().length).notEql(0);
            }
            catch (error) {
                await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("The " + specRow.FieldName + " field is required in " + sheetName + " Spec Sheet but value is blank in Extracted File Row Index :" + specificRowIndex + ".", false)
            }
        }
    }

    //JIRA ID OF STORY : RMA-109659
    //Description      : It will be used to Validate Total length Of Field and Also Validate Data Types inside Extracted File using Spec File.
    //Input Parameters : extractedFileRow -> It will be Extracted File Row, specRow --> It will be Specific Spec Row
    // sheetName --> It will be SheetName for which we have to do testing,
    //specificRowIndex --> It will be Row Index for that Particular Row Inside Extracted File.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimScheduler_ExtractedFileComparison_ValidateTotalLengthOfField_AndDataType(extractedFileRow, specRow, sheetName, specificRowIndex) {
        let extractedValue = ""
        try {
            if (this.fileFormat.toLowerCase() === "fixedlength") {
                extractedValue = await FixedLengthService_Utility.AssureClaims_ClaimsScheduler_ExtractContentValueFromFixedLengthFile(extractedFileRow, specRow.Start, specRow.End)
            }
            if (specRow.DataType.toLowerCase() === "string") {
                try {
                    // Define a regular expression pattern to match alphabetic characters
                    const alphabetPattern = /[a-zA-Z]/;
                    await t.expect(alphabetPattern.test(extractedValue)).ok();
                }
                catch (error) {
                    await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Extracted Value of Field " + specRow.FieldName + " in " + sheetName + " Spec Sheet is " + extractedValue + " and this value does not contain alphabetic characters.", false)
                }
            }
            //Check Numeric Value with Minus Sign Pattern
            if (specRow.DataType.toLowerCase() === "numeric") {
                try {
                    //This pattern matches strings that consist of digits with an optional 
                    //minus sign at the beginning, allowing for negative numeric values, as well as positive numeric values.
                    const numericPattern = /^-?\d*\.?\d+$/;

                    // Check if the value matches the numeric pattern
                    await t.expect(numericPattern.test(extractedValue)).ok();
                }
                catch (error) {
                    await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Extracted Value of Field " + specRow.FieldName + " in " + sheetName + " Spec Sheet is " + extractedValue + " and this value  does not contain Numeric characters.", false)
                }
            }
            //Check Alphanumeric Value with optional Space 
            if (specRow.DataType.toLowerCase() === "alphanumeric") {
                try {
                    // Define the regular expression pattern for an alphanumeric value with optional space
                    const alphanumericPattern = /^[a-zA-Z0-9 ]+$/;

                    //Check if the value matches the alphanumeric pattern
                    await t.expect(alphanumericPattern.test(extractedValue)).ok();
                }
                catch (error) {
                    await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Extracted Value of Field " + specRow.FieldName + " in " + sheetName + " Spec Sheet is " + extractedValue + " and this value  does not contain AlphaNumeric characters.", false)
                }
            }
            await t.expect(extractedValue.length).eql(specRow.Length);
        }
        catch (error) {
            await LogsUsage_Utility.AssureClaims_ClaimsScheduler_LogMessage("Invalid Length of " + specRow.FieldName + " field in " + sheetName + " Spec Sheet. Length of Field in Spec sheet is " + specRow.Length + " and Length of Field in Extracted File Row index " + specificRowIndex + " is " + extractedValue.length + ".", false)
        }
    }

    //==============================RMA-109641 : Aditi's Code ends here=======================================================================
}


export default ExtractToolService_Utility;
