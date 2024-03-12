import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import POM_ClaimScheduler from '../Functional_POM/POM_ClaimScheduler';
import ConfigManager_ClaimScheduler_Utility from '../Functional_Utilities/ConfigurationManager/ClaimScheduler/ConfigManager_ClaimScheduler_Utility';


const DataAutoRegDSN_1 = require('../DataFiles/DataAutoRegDSN_1.json');

const Function_Utility = new Functionality_Utility();
const Inpt_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const POM_ClaimSch = new POM_ClaimScheduler();
const ClaimSche_Utility = new ConfigManager_ClaimScheduler_Utility();
//JIRA ID OF STORY : RMA-109660
//Description      : HR Interface Export
//AUTHOR           : Garima Singhal
//DEPENDANCY       : NO
//PRE-REQUISITES   : Prerequisite : Extract tool setting should be enable from Configuration manager. Details are as provided :
//Extract tool     : Enabled
//SFTP/S3 Details  : Configuration required on File Location 
//Preferred Server : Automation, IUT SQL, IUT Oracle
var faker = require('faker');
var OptionSetName = faker.name.lastName();


DataAutoRegDSN_1.forEach(data => {
    fixture`HR_InterfaceExport`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /* 1. Go to Configuration manager -> Claims scheduler
    2. Run HR_Interface Export task (Run immediately)
    3. Enter data in required fields(Optionset name, Export Type).
    4. Save the HR_Interface Export Task.
    5. Task will get appear in Task List.
    6. Check for the availability of task in grid
    7. Check for the status of the task should be completed
    8. Download the job file successfully if task status is completed.
    9. Script will fail if Task not found or task status is completed with error or job file not downloaded sucessfully
    
    */
    test('AssureClaims_ClaimScheduler_HRInterfaceExport', async t => {
        // Code to get the unique name for Task Name
        ClaimSche_Utility.AssureClaimsAPP_ClaimScheduler_TaskUniqueName_Utility(data, data.PrefixUniqueTaskName_HRInterfaceExport);
        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(10000)
        console.log(`Login Into Application with ${data.Username}`)
        //=============================================================Login Into Application with User ended======================================================================
        //==================================Claims Scheduler HR Interface Export task process started============================//
        await ClaimSche_Utility.AssureClaims_FrameSwitch_ClaimSchedulerTab("Claim Scheduler", "taskmanager")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Scheduler_Tab.withText("Scheduler"), "Click on Scheduler Tab")
        await ClaimSche_Utility.AssureClaims_ClaimScheduler_TaskSubTask_Utility(data.ClaimScheduler_TaskTypeHRInterface, data.ClaimScheduler_SubTaskNameExtract, data.TaskName)
        await Inpt_Utility.AssureClaims_SetValue_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Tasks_Txt_OptionsetName, OptionSetName, "Optionset name")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_Lst_HRInterfaceExportType, "Click on Export Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText("Payee"), "Select Export Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Btn_RoleImage.withText("save"), "Click on Save Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsAPP_ClaimScheduler_Lnk_TotalJobExecuted, "Total job executed")
        await ClaimSche_Utility.AssureClaimsAPP_ClaimScheduler_DownloadJobFile_Utility("Job Name", data.TaskName, data.TaskName, data.JobStatusCheckIterations)
        //==================================Claims Scheduler HR Interface Export task process end ============================// 
    }
    )
})
