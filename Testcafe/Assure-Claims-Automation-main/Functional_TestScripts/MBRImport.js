import { Selector, Role } from 'testcafe';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import POM_ClaimScheduler from '../Functional_POM/POM_ClaimScheduler';
import ConfigManager_ClaimScheduler_Utility from '../Functional_Utilities/ConfigurationManager/ClaimScheduler/ConfigManager_ClaimScheduler_Utility';
import GenericUsages_Utility from "../Functional_Utilities/GenericUsages_Utility";
import ExcelUsages_Utility from '../Excel_Utility/ExcelUsages_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import Importtool_Utility from '../Functional_Utilities/ConfigurationManager/ClaimScheduler/ConfigManager_ClaimScheduler_Importtool_Utility';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';


const DataAuto = require('../DataFiles/DataAutoRegDSN_1.json');

const Function_Utility = new Functionality_Utility();
const POM_ClaimSch = new POM_ClaimScheduler();
const Inpt_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const ClaimSche_Utility = new ConfigManager_ClaimScheduler_Utility();
const Excel_Utility = new ExcelUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Generic_Utility = new GenericUsages_Utility();
const Import_Utility = new Importtool_Utility();
const Payment_POM = new POM_PaymentsCollections();


//JIRA ID OF STORY : RMA-109589
//Description      : MBR Import tool
//AUTHOR           : Sukanya Bose
//DEPENDANCY       : NO
//PRE-REQUISITES   : Prerequisite : Import tool setting should be enable from Configuration manager. Details are as provided :
//Import tool - Enabled
//SFTP/S3 Details  : Configuration required on File Location
//Chrome download setting "Ask where to save each file before downloading" should be off
//In Chrome, Download file location should be set to  default download folder of the system


var faker = require('faker');
var OptionSetName = faker.name.lastName();
var NewJobFileName = faker.name.lastName() + '.zip';
const fs = require('fs');
const path = require('path');

DataAuto.forEach(data => {
    fixture`MBRImport`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    var importfilename = data.ImportFileNameMBR;

    var outputFolderPath;

    var zipFilePath;
    const excelFilePath = data.ImportSpecFilePath.toString() + data.ClaimScheduler_TaskTypeMBR + data.ImportSpecFileName.toString()

    let headerArrayImportFile = []
    let lineitemsImportFile = []
    let headerArraySpecFile = []
    let lineItemsSpecFile = []
    let importHeaderArray = []
    let importLineItemsArray = []
    let outputHeaderArray = []
    let outputLineItemsArray = []
    let inputHeaderArray = []
    let inputLineItemsArray = []
    let fundsResultArray = [];
    let fundsTransSplitResultArray = []

    /* 1. Go to Configuration manager -> Claims scheduler
    2. Run MBR Import task (Run immediately)
    3. Enter data in required fields(Optionset name, File Name,Mode Type, File Format).
    4. Select Read file from configured path option and give file name with extension
    Note : 
        a.Change the file name in Data json file on  "ImportFileNameMBR" For ex: Pipe
        b.Change the file name extension in json file on  "ImportFileExtensionMBR" For ex : .txt or .accdb
    5. Save the MBR Import Task.
    6. Task will get appear in Total job executed List.
    7. Check for the availability of task in grid
    8. Check for the status of the task should be completed
    9. Download the job file successfully if task status is completed.
    10.Script will fail if Task not found or task status is completed with error or job file not downloaded sucessfully
    */


    test('AssureClaims_ClaimScheduler_MBRImport', async t => {
        // Code to get the unique name for Task Name
        await ClaimSche_Utility.AssureClaimsAPP_ClaimScheduler_TaskUniqueName_Utility(data, data.PrefixUniqueTaskName_MBRImport);
        const taskName = data.TaskName
        //Code to take the download folder path of any system
        const downloadFolderPath = await Generic_Utility.AssureClaims_getDefaultDownloadFolderPath_Utility();
        const trimDownloadFolderPath = downloadFolderPath.split('\n')[0].trim();
        console.log('Download Folder Path:', trimDownloadFolderPath);
        // Steps :  1. Create an empty folder namely "UnZipJobFilesFolder" under the current JobName folder in the default downloaded jobfile path
        // 			2. Create an empty folder namely "ZipJobFilesFolder" under the current JobName folder in the default downloaded jobfile path
        zipFilePath = await ClaimSche_Utility.AssureClaimsAPP_ClaimScheduler_CreateFolderSubFolder_Utility(trimDownloadFolderPath, taskName, data.ZipFileFolderName,)
        outputFolderPath = await ClaimSche_Utility.AssureClaimsAPP_ClaimScheduler_CreateFolderSubFolder_Utility(trimDownloadFolderPath, taskName, data.UnZipFileFolderName)
        const ImportFilePath = outputFolderPath + path.sep + importfilename + data.ImportFileExtensionMBR

        //==============================================================Login Into Application with User started==================================================================
        await t.setPageLoadTimeout(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(10000)
        console.log(`Login Into Application with ${data.Username}`)
        //=============================================================Login Into Application with User ended======================================================================
        //==================================Claims Scheduler Import tool task process started============================//
        await t.wait(2000)
        await ClaimSche_Utility.AssureClaims_FrameSwitch_ClaimSchedulerTab("Claim Scheduler", "taskmanager")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Scheduler_Tab.withText("Scheduler"), "Click on Scheduler Tab")
        await ClaimSche_Utility.AssureClaims_ClaimScheduler_TaskSubTask_Utility(data.ClaimScheduler_TaskTypeMBR, data.ClaimScheduler_SubTaskNameImport, taskName)
        await Inpt_Utility.AssureClaims_SetValue_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Tasks_Txt_OptionsetName, OptionSetName, "Optionset name")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_GenericUsage_Lst_Selection, "Mode Type")
        await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Short Code", "Both")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_GenericUsage_Btn_SelectValue.withText("Validation and Data Import (Recommended)"), "Both Mode")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_TabSelectionUnderTask_Tab_ImportExtract.withText("File Detail Option"), "File Detail Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ImportTool_Lst_MBRFileFormat, "Click on File Format")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText(data.MBRImportFileFormat), "Select File Format")
        /*There are two ways to select Import file: First is by selecting Read file from Configured path and giving File name manually.*/
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureclaimsApp_ClaimScheduler_ImportTool_Chk_ReadFileFromConfiguredPath, "Checkbox")
        await Inpt_Utility.AssureClaims_SetValue_Utility(POM_ClaimSch.AssureClaimsAPP_ClaimScheduler_ImportTool_Txt_FileName, importfilename + data.ImportFileExtensionMBR, "Import File Name")
        /*Second way through file upload */
        //await t.setFilesToUpload('#uploadId', ['../upload/' + importfilename+ data.ImportFileExtensionMBR])
        //await t.wait(5000)
        //console.log("File uploaded successfully", importfilename + data.ImportFileExtensionMBR)
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Importtool_Tab_MBREntityMatch.withText("Entity Match Settings"), "Entity Match tab is clicked")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Selector("#ctrl_name-input"), "Check", "Entity Name checkbox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Btn_RoleImage.withText("save"), "Click on Save Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsAPP_ClaimScheduler_Lnk_TotalJobExecuted, "Total job executed")
        await ClaimSche_Utility.AssureClaimsAPP_ClaimScheduler_DownloadJobFile_Utility("Job Name", data.TaskName, data.TaskName, data.JobStatusCheckIterations)
        // Steps : 
        // 			1. Copy file from downloads and put it in "ZipJobFiles" folder
        // 			2. Take file from "ZipJobFiles" folder and extract the files into "UnZipJobFiles" folder
        // 			3. Delete the zip files from "ZipJobFiles" folder location

        await ClaimSche_Utility.AssureClaims_ClaimsScheduler_CopyJobFiletoFolder_Utility(trimDownloadFolderPath, NewJobFileName)
        const downloadpath = trimDownloadFolderPath + NewJobFileName

        const copyFilePath = zipFilePath + NewJobFileName;
        fs.copyFileSync(downloadpath, copyFilePath)
        console.log('File is copied succesfully from Downloads to ZipJobFiles folder')
        await ClaimSche_Utility.AssureClaims_ClaimsScheduler_UnZipFile_Utility(copyFilePath, outputFolderPath)
        await t.wait(3000)
        fs.unlinkSync(copyFilePath); // delete the file from zip(download folder)
        console.log('File is deleted successfully from ZipJobFiles folder.');

        await ClaimSche_Utility.AssureClaims_ClaimsScheduler_FindandRenameLogFile_Utility(outputFolderPath, data.ProcessLogFileExtension, data.ImportExportProcessLogFileName)
        //==================================Claims Scheduler Import tool task process end============================//
        //=============================================================Post Import Funds Data Validation======================================================================

        // From processlog it will fetch the control number
        const controlNumberArray = Import_Utility.AssureClaims_ClaimScheduler_getValuebyColumnRowPosition_Utility(outputFolderPath + path.sep + data.ImportExportProcessLogFileName + data.ProcessLogFileExtension, 1, 1);
        const strControlNumberArray = (await controlNumberArray).join(',')
        const splitStrControlNumberArray = strControlNumberArray.split(',');

        //if record is imported, then fetching the unquieidentifier name and it's correcponsing value
        const infoData = await Excel_Utility.AssureClaims_ClaimsScheduler_OpenReadSpecExcelFileData(excelFilePath, "InfoDetails")
        const uniqueIdentifierName = infoData.map(rowValue => rowValue['UniqueIdentifier'])

        //rename the import file with datajsonimportfilename
        await ClaimSche_Utility.AssureClaims_ClaimsScheduler_FindandRenameLogFile_Utility(outputFolderPath, data.ImportFileExtensionMBR, data.ImportFileNameMBR)

        // Specify the CSV file path and the separator
        const rows = await Generic_Utility.AssureClaims_ReadCSVFile_Utility(ImportFilePath);

        const excelSpecData = await Excel_Utility.AssureClaims_ClaimsScheduler_OpenReadSpecExcelFileData(excelFilePath, "Detail")

        // Reading logic of import file and store data into header and lineitems array
        await Import_Utility.AssureClaims_ReadDatafromImportFile_Utility(headerArrayImportFile, lineitemsImportFile, rows)

        // Reading logic of spec file and store data into header and lineitems array
        await Import_Utility.AssureClaims_ReadDatafromSpecFile_Utility(excelSpecData, headerArraySpecFile, lineItemsSpecFile)

        // Split the rows based on the seperator and store the data into a array
        importHeaderArray = await Import_Utility.AssureClaims_SplitSeperator_FetchValuefromImportFile_Utility('|', headerArrayImportFile)

        for (const controlNumber of splitStrControlNumberArray) {
            // control number is searched in funds screen based from processlog file
            await ClaimSche_Utility.AssureClaims_ClaimScheduler_ControlNumberSearch_Utility(controlNumber);

            // Dynamic frame switching and navigate to the Transaction DOM
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Funds_Transaction_ClaimGCIframe);
            await t.wait(20000)

            // Get attribute value from screen level based on particular transaction
            outputHeaderArray = await Import_Utility.AssureClaims_GetAttributeValuebasedonSelector_Utility(headerArraySpecFile)
            console.log(`output header array is: `, outputHeaderArray)

            // Get attribute value from import file
            inputHeaderArray = await Import_Utility.AssureClaims_GetAttributeValuefromImportFile_Utility(headerArraySpecFile, importHeaderArray)
            console.log(`input header array is: `, inputHeaderArray)

            // comapare the attribute values between import file value and output screen level value and return the result array
            fundsResultArray = await Import_Utility.AssureClaims_ValidationcheckforPostImportData_Utility(outputHeaderArray, inputHeaderArray)
            await Import_Utility.Assureclaims_GenerateMessage_Utility(fundsResultArray, headerArraySpecFile, uniqueIdentifierName, controlNumber)

            // =============================================================Post Import Funds Transaction Details Validation======================================================================

            // Dynamic frame switching and navigate to the Transaction Split DOM
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
            await t.wait(3000)

            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_ClaimScheduler_Btn_TransactionSplitEdit, "Clicking the Funds Split Detail Tab")
            await t.wait(6000)

            // Split the rows based on the seperator and store the data into a array
            importLineItemsArray = await Import_Utility.AssureClaims_SplitSeperator_FetchValuefromImportFile_Utility('|', lineitemsImportFile)

            // Get attribute value from screen level based on particular transaction
            outputLineItemsArray = await Import_Utility.AssureClaims_GetAttributeValuebasedonSelector_Utility(lineItemsSpecFile)

            console.log(`output lineitems array is: `, outputLineItemsArray)

            // Get attribute value from import file
            inputLineItemsArray = await Import_Utility.AssureClaims_GetAttributeValuefromImportFile_Utility(lineItemsSpecFile, importLineItemsArray)
            console.log(`input lineitems array is: `, inputLineItemsArray)

            //comapare the attribute values between import file value and output screen level value and return the result array
            fundsTransSplitResultArray = await Import_Utility.AssureClaims_ValidationcheckforPostImportData_Utility(outputLineItemsArray, inputLineItemsArray)
            await Import_Utility.Assureclaims_GenerateMessage_Utility(fundsTransSplitResultArray, lineItemsSpecFile, uniqueIdentifierName, controlNumber)
            await Import_Utility.Assureclaims_DeleteFiles_Utility(outputFolderPath)
            await t.wait(5000)
            await Import_Utility.Assureclaims_DeleteFolder_Utility(zipFilePath)
            await Import_Utility.Assureclaims_DeleteFolder_Utility(outputFolderPath)
            await Import_Utility.Assureclaims_DeleteFolder_Utility(path.join(trimDownloadFolderPath, taskName))
        }
    });

})

