import { t } from 'testcafe';
import fs from 'fs';

class FixedLengthFormatterService_Utility {
    constructor() { }

    //==============================RMA-109659 : Aditi's Code starts here=======================================================================

    //JIRA ID OF STORY : RMA-109659
    //Description      : Return Specific Row Length Of Fixed Length File
    //Input Parameters : filePath -> It Will be Extracted File Path For Comparison, specificRowIndex --> It will be Row Index for that Particular Row Inside Extracted File.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_ExtractedFixedLengthFile_RowLength(filePath, specificRowIndex) {
        const csvData = fs.readFileSync(filePath, 'utf8')
        const rows = csvData.split('\n')
        const specificRowLength = rows[specificRowIndex].length - 1;
        return specificRowLength;
    }


    //JIRA ID OF STORY : RMA-109659
    //Description      : To Extract Content Value From Fixed Length File Using Start and End Position
    //Input Parameters : fileRowData -> It Will be Extracted File Row Data, startPosition --> It will be Start Position Index of Content Value, EndPosition --> It will be End Position Index of Content Value.
    //Revision         : Aditi Aggarwal 02-25-2024
    async AssureClaims_ClaimsScheduler_ExtractContentValueFromFixedLengthFile(fileRowData, startPosition, EndPosition) {
        // Adjust the positions based on your fixed-length format
        const value = fileRowData.substring(startPosition - 1, EndPosition);
        return value;
    }


    //==============================RMA-109659 : Aditi's Code ends here=======================================================================
}

export default FixedLengthFormatterService_Utility;