import { Selector, t } from 'testcafe';
import Navigation_Utility from '../../Navigation_Utility'
import POM_ClaimScheduler from '../../../Functional_POM/POM_ClaimScheduler';
import POM_Config_manager from '../../../Functional_POM/POM_Config_Manager';
import Input_Utility from '../../Input_Utility';
import GenericUsages_Utility from '../../GenericUsages_Utility';
import { execSync } from 'child_process';
import POM_Search from '../../../Functional_POM/POM_Search';
import POM_VerificationMessage from '../../../Functional_POM/POM_VerificationMessage';

const Nav_Utility = new Navigation_Utility();
const POM_ClaimSch = new POM_ClaimScheduler();
const ConfigMgr_POM = new POM_Config_manager();
const Inpt_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Search_POM = new POM_Search();
const Verification_Msg = new POM_VerificationMessage();


const fs = require('fs');
const unzipper = require('unzipper');
const path = require('path');
const csv = require('csv-parser');

class ClaimScheduler_Utility {
  constructor() { }
  //==============================RMA-109671 : Chhavi's Code starts here=======================================================================

  //JIRA ID OF STORY : RMA-109671
  //Description      : Functionality for selection of claim scheduler tabs and their frame
  //Input Parameters : StrClaimScheduler -> It is used to give claim scheduler as input , StrFrameName -> Frame name of claim scheduler page
  //Revision         : Chhavi Dave 01-24-2024

  async AssureClaims_FrameSwitch_ClaimSchedulerTab(StrClaimScheduler, StrFrameName) {


    await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility(StrClaimScheduler);
    await t.wait(2000);
    await t.switchToIframe(Selector("#" + StrFrameName + ""))
    await t.wait(2000);
  }

  //JIRA ID OF STORY : RMA-109671
  //Description      : Functionality for selection of task type, sub task type and task name
  //Input Parameters : StrTaskType -> it will select task type, StrSubTaskName -> it will select task name , TaskName -> It will provide task name
  //Revision         : Chhavi Dave 01-15-2024

  async AssureClaims_ClaimScheduler_TaskSubTask_Utility(StrTaskType, StrSubTaskName, TaskName) {

    await t.click(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_TaskTypeList)
    console.log("Task type is clicked")
    await t.click((POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText(StrTaskType)));
    console.log(StrTaskType + " is selected")
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Txt_TaskName, TaskName, "Task Name")

    if (StrSubTaskName != 'NA') {
      await t.click(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_SubTaskNameList)
      console.log("Sub Task name is clicked")
      await t.click((POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText(StrSubTaskName)));
      console.log(StrSubTaskName + " is selected")
    }
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_Claimscheduler_JobDetails_Chk_Select_Runimmediately, "Select Run Immediately button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Btn_Select_Next, "Click on Next button")
  }
  //==============================RMA-109671 : Chhavi's Code ends here=======================================================================


  //************************************************************************************************************************************************************************************************************************************************************************************
  //JIRA ID OF STORY : RMA-109825
  //Description :It is used to check : 
  // 1. Task is available in the grid checking with job name
  // 2. Status of tasks and download the job file , if completed else script will fail 
  //Input Parameter:  strParameter1 -> it will be column name, strParameter2 -> it will be column value, TaskName - It will be faker generated task name
  //Revision   : Chhavi Dave 02-09-2024
  // ********************************************************************************************************************************
  async AssureClaimsAPP_ClaimScheduler_DownloadJobFile_Utility(strParameter1, strParameter2, TaskName, Iterations) {
    let isTaskFound
    for (let i = 1; i <= Iterations; i++) {
      await t.wait(10000);

      try {

        const refresh = POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Btn_RoleImage.withText("refresh");
        await t.click(refresh);
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_SearchField, "Search field")
        await t.pressKey("Enter")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Lst_SelectValue.withExactText(strParameter1), "select " + strParameter1)
        await t.typeText(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_SearchField, strParameter2)
        console.log("write " + strParameter2)
        await t.pressKey("Enter")

        const element = await POM_ClaimSch.AssureClaimsApp_ClaimScheduler_TotalJobs_Txt_JobName.textContent;
        // Check if the element's text content contains the expected TaskName

        isTaskFound = (element).includes(TaskName);

        if (isTaskFound) {
          console.log("Task found:", TaskName);
          console.log("Task found in seconds: ", i * 10);
          break; // Exit the loop if the task is found
        }
      } catch (error) {

        console.error('Matching Task name ' + TaskName, ' not found in the grid');

      }
    }
    if (!isTaskFound) {
      console.log('Matching Task name ' + TaskName, 'not found in the grid');
      await t.expect('').ok();
    }
    try {
      const status = await POM_ClaimSch.AssureClaimsApp_ClaimScheduler_TotalJobs_Txt_JobStatus.textContent
      await t.expect(status).eql("Completed")
      console.log("Task status is ", status)
    }

    catch (error) {
      console.error('Task found but Status of the task is completed with error');
      await t.expect('').ok();
    }
    try {
      await t.click(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_TotalJobs_Btn_JobFile)
      console.log(`Job File is downloaded sucessfully.`)
    }
    catch (error) {
      console.error('File is not downloaded successfully');
      await t.expect('').ok();
    }
  }


  //************************************************************************************************************************************************************************************************************************************************************************************
  //JIRA ID OF STORY : RMA-109590
  //Description      : It is used to create file folder directory if it doesnot exist
  //Input Parameters : outputFolderPath--> The path is defined where the zip/unzip folder needs to be created
  //Revision         : Sukanya Bose 01-15-2024
  // ***********************************************************************************************************************************************************************************************************************************************************************************
  async AssureClaims_ClaimsScheduler_CreateFolderDirectory_Utility(outputFolderPath) {
    if (!fs.existsSync(outputFolderPath)) {
      fs.mkdirSync(outputFolderPath);
      console.log(outputFolderPath + ' folder created sucessfully')
    }
  }

  //************************************************************************************************************************************************************************************************************************************************************************************
  //JIRA ID OF STORY : RMA-109590
  //Description      : It is used to copy the file to a desired location and copied with the provided name, it will pick the first file based on the latest modified datetime
  //Input Parameters : directoryPath--> The path is defined where the folder needs to be copied, NewJobFileName--> The selected file is copied and with the provided name
  //Revision         : Sukanya Bose 01-15-2024
  // ***********************************************************************************************************************************************************************************************************************************************************************************
  async AssureClaims_ClaimsScheduler_CopyJobFiletoFolder_Utility(directoryPath, NewJobFileName) {
    // Use PowerShell to get the most recently modified file
    const command = `powershell -Command "& { $recentFile = Get-ChildItem -Path ${directoryPath} | Sort-Object LastWriteTime -Descending | Select-Object -First 1; Rename-Item -Path $recentFile.FullName -NewName ${NewJobFileName} }"`;

    try {
      execSync(command);
    } catch (error) {
      console.error(error.stderr);
    }
  }

  //************************************************************************************************************************************************************************************************************************************************************************************
  //JIRA ID OF STORY : RMA-109590
  //Description      : It is used to unzip the files from zip file format
  //Input Parameters : zipFilePath-->It denotes where zipFile is placed, OutputFolderPath-->It denotes where the unzip files will be placed
  //Revision         : Sukanya Bose 01-15-2024
  // ***********************************************************************************************************************************************************************************************************************************************************************************
  async AssureClaims_ClaimsScheduler_UnZipFile_Utility(zipFilePath, outputFolderPath) {
    // Open the zip file and extract its contents
    await fs.createReadStream(zipFilePath)
      .pipe(unzipper.Extract({ path: outputFolderPath }))
      .promise();

    console.log(`File successfully unzipped to UnZipJobFiles folder`);
  }


  //************************************************************************************************************************************************************************************************************************************************************************************
  //JIRA ID OF STORY : RMA-109590
  //Description      : It is used to read from csv file
  //Input Parameters : OutputFolderPath-->It denotes the unzip files path and read, LogFileName--> The filename denotes which csv file needs to be read
  //Revision         : Sukanya Bose 01-15-2024
  // ***********************************************************************************************************************************************************************************************************************************************************************************
  async AssureClaims_ClaimsScheduler_FindandRenameLogFile_Utility(outputFolderPath, fileExtension, LogFileName) {
    // Find the CSV file in the directory
    const csvFile = fs.readdirSync(outputFolderPath).find(file => file.endsWith(fileExtension) && file.startsWith(LogFileName));
    if (csvFile) {
      // Generate the new file name 
      const newFileName = LogFileName.toString() + fileExtension;
      // Create the full paths for the old and new file names
      const oldFilePath = path.join(outputFolderPath, csvFile);
      const newFilePath = path.join(outputFolderPath, newFileName);

      // Rename the file
      fs.renameSync(oldFilePath, newFilePath);
      console.log(`CSV file "${csvFile}" renamed to "${newFileName}"`);
    } else {
      console.error('No CSV file found in the specified directory.');
    }
  }

  //************************************************************************************************************************************************************************************************************************************************************************************
  //JIRA ID OF STORY : RMA-109590
  //Description      : It is used to generate unique task name import/extract tool tasks
  //Input Parameters : data -->this store the unique task name, TaskNamePrefix--> This is the prefix for Task name to differentiate
  //Revision         : Chhavi Dave 02-14-2024
  // ***********************************************************************************************************************************************************************************************************************************************************************************

  async AssureClaimsAPP_ClaimScheduler_TaskUniqueName_Utility(data, TaskNamePrefix) {

    const d = new Date();
    var year = d.getFullYear().toString();
    var month = d.getMonth() + 1;
    var date = d.getDate().toString();
    var hours = d.getHours().toString();
    var min = d.getMinutes().toString();
    var seconds = d.getSeconds().toString();
    var millsec = d.getMilliseconds();
    var TasknameNew = TaskNamePrefix + year + month.toString() + date + hours + seconds + millsec;
    data.TaskName = TasknameNew;
  }

  //************************************************************************************************************************************
  //JIRA ID OF STORY : RMA-109815
  //Description      : Utility for searching the left tab over configuration manager
  //Input Parameters : StrLeftTabName->User have to provide left sub tab name
  //Revision	       : Sukanya Bose 02/23/2024
  //************************************************************************************************************************************
  async AssureClaims_ClaimScheduler_ElementClick_Utility(Element) {
    await t.click(Element);
  }

  //*****************************************************************************************************************
  //JIRA ID OF STORY : RMA-109815
  //Description      : It is used to search a particular value
  //Input Parameters : SearchControlNumber : used to provide a Control Number value that needs to be searched
  //Revision       : Sukanya Bose 02/23/2024
  // *******************************************************************************************************************

  async AssureClaims_ClaimScheduler_ControlNumberSearch_Utility(controlNumber) {
    await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims")
    await t.wait(4000)
    await this.AssureClaims_ClaimScheduler_ElementClick_Utility(Search_POM.AssureClaims_Claim_Lnk_Search.withText('Search'))
    await t.wait(4000)
    await this.AssureClaims_ClaimScheduler_ElementClick_Utility(Search_POM.AssureClaims_Claim_Lnk_Funds.withText('Funds'))
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_FundsIframe);
    await Inpt_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_FundsControlnumber, controlNumber, "Control Number")
    await this.AssureClaims_ClaimScheduler_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
    await t.wait(3000)
    await t.switchToMainWindow();
    await t.wait(3000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_FundsIframe);
    await this.AssureClaims_ClaimScheduler_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(controlNumber), "Control Number Link")
    console.log("Search is Completed");
    await t.switchToMainWindow()
  }
  //*****************************************************************************************************************
  //JIRA ID OF STORY : RMA-110369
  //Description      : It is used create folder and sub folder under defined folderPath
  //Input Parameters : folderPath --> It denotes the folder path from where folder needs to be created, 
  //folderName    --> It denotes the folder name under the folderPath ,
  //subfolderName --> It denotes the sub folder name under the folderName 
  //Revision         : Sukanya Bose,Chhavi Dave 03/06/2024
  // *******************************************************************************************************************
  async AssureClaimsAPP_ClaimScheduler_CreateFolderSubFolder_Utility(folderPath, folderName, subfolderName) {

    var finalPath = path.join(folderPath, folderName, subfolderName) + path.sep
    console.log('Final Path:', finalPath)
    try {
      // Create folder if it doesn't exist

      if (!fs.existsSync(folderPath)) {
        fs.mkdirSync(folderPath, { recursive: true });
        console.log(folderName + ' folder is created successfully');
      }

      // Create subfolder
      fs.mkdirSync(finalPath, { recursive: true });
      console.log(subfolderName + ' folder is created successfully');

    }
    catch (error) {
      console.log('Error occurred while creating folder/subfolder:', error);
    }
    return finalPath;
  }

}


export default ClaimScheduler_Utility;
