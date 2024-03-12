import { Selector, Role } from 'testcafe';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import POM_ClaimScheduler from '../Functional_POM/POM_ClaimScheduler';
import ClaimScheduler_Utility from '../Functional_Utilities/ConfigurationManager/ClaimScheduler/ConfigManager_ClaimScheduler_Utility';


const DataAuto = require('../DataFiles/DataAutoRegDSN_4.json');

const Function_Utility = new Functionality_Utility();
const POM_ClaimSch = new POM_ClaimScheduler();
const Inpt_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const ClaimSche_Utility = new ClaimScheduler_Utility();


//JIRA ID OF STORY : RMA-109375
//Description      : HRInterface Import tool
//AUTHOR           : Movva Venkata Sai Kiran 
//DEPENDANCY       : NO
//PRE-REQUISITES   : Prerequisite : Import tool setting should be enable from Configuration manager. Details are as provided :
//Import tool - Enabled
//SFTP Details :-
//Import Tool Database Type : Postgre
//Import Tool Staging Database : ViniTest
//Preferred Server   : IUT SQL, IUT Oracle


var faker = require('faker');
var OptionSetName = faker.name.lastName();
var TasknameNew = faker.name.lastName();


DataAuto.forEach(data => {
    fixture`HRInterfaceImport`.beforeEach(async t => {  
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });
   
    data.TaskName = TasknameNew;
    var importfilename = data.ImportFileNameHRInterface;
    

    /* 1. Go to Configuration manager -> Claims scheduler
    2. Run  HRInterface Import task (Run immediately)
    3. Enter data in required fields(Optionset name, File Name,Mode Type)
    4. Save the HRInterface Import Task.
    6. Task will get appear in Total job executed List.
    7. Check for the availability of task in grid
    8. Check for the status of the task should be completed
    9. Download the job file successfully if task status is completed.
	10.Script will fail if Task not found or task status is completed with error or job file not downloaded sucessfully
    */
  

    test('AssureClaims_ClaimScheduler_HRInterfaceImport', async t => {
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
        await ClaimSche_Utility.AssureClaims_ClaimScheduler_TaskSubTask_Utility(data.ClaimScheduler_TaskTypeHRInterface,data.ClaimScheduler_SubTaskNameImport,TasknameNew)
        await Inpt_Utility.AssureClaims_SetValue_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Tasks_Txt_OptionsetName, OptionSetName, "Optionset name")
        await Inpt_Utility.AssureClaims_SetValue_Utility(POM_ClaimSch.AssureClaimsAPP_ClaimScheduler_ImportTool_Txt_FileName,  importfilename , "Import File Name")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_GenericUsage_Lst_Selection,"Mode Type")
        await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Short Code" ,"Both")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_GenericUsage_Btn_SelectValue.withText("Validation and Data Import (Recommended)"),"Both Mode")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Importtool_Tab_HRInterfaceMatchCriteria.withText("Match Criteria"), "Match Criteria is clicked")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Importtool_Tab_HRInterfaceLimitActions.withText("Limit Actions"), "Limit Actions is clicked")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Importtool_Tab_HRInterfaceImportFileLength.withText("Import File Length"), "Import File Length is clicked")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsAPP_ClaimScheduler_Btn_RoleImage.withText("save"), "Click on Save Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Lnk_TotalJobExecuted, "Total job executed")
        await ClaimSche_Utility.AssureClaimsAPP_ClaimScheduler_DownloadJobFile_Utility("Job Name",data.TaskName,data.TaskName)
         //==================================Claims Scheduler Import tool task process end============================//
    });
})
