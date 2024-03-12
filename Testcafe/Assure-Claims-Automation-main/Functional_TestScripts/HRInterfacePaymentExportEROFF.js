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
//JIRA ID OF STORY : RMA-109643
//Description      : HR Interface Payment Export (EROFF)
//AUTHOR           : Garima Singhal
//DEPENDANCY       : NO
//PRE-REQUISITES   : Prerequisite : Extract tool setting should be enable from Configuration manager. Details are as provided :
//Extract tool     : Enabled
//SFTP/S3 Details  : Configuration required on File Location 
//Preferred Server : Automation, IUT SQL, IUT Oracle
var faker = require('faker');
var OptionSetName = faker.name.lastName();


DataAutoRegDSN_1.forEach(data => {
    fixture`HR_InterfacePaymentExport_EROFF`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /* 1. Go to Configuration manager -> Claims scheduler
    2. Run HR_Interface Payment Export task (Run immediately)
    3. Enter data in required fields(Optionset name, Export Type).
    4. Save the HR_Interface Export Task.
    5. Task will get appear in Task List.
    6. Check for the availability of task in grid
    7. Check for the status of the task should be completed
    8. Download the job file successfully if task status is completed.
    9. Script will fail if Task not found or task status is completed with error or job file not downloaded sucessfully
    
    */
    test('AssureClaims_ClaimScheduler_HRInterfacePaymentExport', async t => {
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
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Scheduler_Tab.withText("Scheduler"), "Click on Scheduler Tab")
        await ClaimSche_Utility.AssureClaims_ClaimScheduler_TaskSubTask_Utility(data.ClaimScheduler_TaskTypeHRInterface, data.ClaimScheduler_SubTaskNameExtract, data.TaskName)
        await Inpt_Utility.AssureClaims_SetValue_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Tasks_Txt_OptionsetName, OptionSetName, "Optionset name")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_Lst_HRInterfaceExportType, "Click on Export Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText("Payment"), "Select Export Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(POM_ClaimSch.AssureClaimsApp_Claimscheduler_ExtractTool_HRInterface_Chk_Select_TestExport, 'Check', "Select Test Export button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SupplementalTab.withText("Supplemental Field Mapping"), "Click on Supplemental Field Mapping Tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SupplementalMapping, "Click on Supplementals Mapping")
        ////////////////////////////////////////////////////////////////////////Payment Supplementals starts here////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText("Payment Supplementals"), "Payment Supplementals selected")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_Mapping_RUPaymentField, 'Check', "click on RU# Mapped checkbox");
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SuppField.nth(11),"Click on Supplemental Field")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText('LSS_INVOICE_ID'), "RU# Supplemental Field Selected")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_Mapping_AccountPaymentField, 'Check', "click on Account# Mapped checkbox");
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SuppField.nth(23), "Click on Supplemental Field")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText('NETWRK_SRVC_CODE'), "Account# Supplemental Field Selected")
        ////////////////////////////////////////////////////////////////////////Payment Supplementals Ends here////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////Employee Supplementals starts here////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SupplementalMapping, "Click on Supplementals Mapping")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText("Employee Supplementals"),"Employee Supplementals selected")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_Mapping_SuppField, 'Check', "click on Employee Vendor Id Mapped checkbox" )
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SuppField.nth(7), "Click on Supplemental Field")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText('JOINING_TIM_TIME'), "Employee Vendor Id Supplemental Field Selected")
        ////////////////////////////////////////////////////////////////////////Employee Supplementals ends here////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////Entity Supplementals starts here////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SupplementalMapping, "Click on Supplementals Mapping")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText("Entity Supplementals"),"Entity Supplementals selected")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_Mapping_SuppField, 'Check', "click on Entity Vendor Id Mapped checkbox" )
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SuppField.nth(7), "Click on Supplemental Field")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText("INDEX_BUREAU_NUMB"),"Entity Vendor Id Supplemental Field Selected")
        // ////////////////////////////////////////////////////////////////////////Entity Supplementals ends here////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////Physician Supplementals starts here////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SupplementalMapping, "Click on Supplementals Mapping")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText("Physician Supplementals"),"Physician Supplementals selected")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_Mapping_SuppField, 'Check', "click on Physician Vendor Id Mapped checkbox" )
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SuppField.nth(7), "Click on Supplemental Field")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection.withText("ATTY_SUF_TEXT"),"Physician Vendor Id Supplemental Field Selected")
        ////////////////////////////////////////////////////////////////////////Physician Supplementals ends here////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Btn_RoleImage.withText("save"), "Click on Save Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsAPP_ClaimScheduler_Lnk_TotalJobExecuted, "Total job executed")
        await ClaimSche_Utility.AssureClaimsAPP_ClaimScheduler_DownloadJobFile_Utility("Job Name", data.TaskName, data.TaskName, data.JobStatusCheckIterations)
        //==================================Claims Scheduler HR Interface Export task process end ============================// 
    }
    )
})