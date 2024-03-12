import { Role } from 'testcafe';
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
//JIRA ID OF STORY : RMA-109672
//Description      : MBR Extract tool
//AUTHOR           : Vini Sand
//DEPENDANCY       : NO
//PRE-REQUISITES   : Prerequisite : Extract tool setting should be enable from Configuration manager. Details are as provided :
//Extract tool - Enabled
//SFTP/S3 Details  : Configuration required on File Location

var faker = require('faker');
var OptionSetName = faker.name.lastName();

DataAutoRegDSN_1.forEach(data => {
    fixture`MBRExport`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /* 1. Go to Configuration manager -> Claims scheduler
    2. Run MBR Extract task (Run immediately)
    3. Enter data in required fields(Optionset name, Claim extract type, Claim type,Claim Status, Service Code).
    4. Save the MBR Extract Task.
    5. Task will get appear in Task List.
    */
    test('AssureClaims_ClaimScheduler_MBRExtract', async t => {
        // Code to get the unique name for Task Name
        ClaimSche_Utility.AssureClaimsAPP_ClaimScheduler_TaskUniqueNameUtility(data, data.PrefixUniqueTaskName_MBRExport);
        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(10000)
        console.log(`Login Into Application with ${data.Username}`)
        //=============================================================Login Into Application with User ended======================================================================
        //==================================Claims Scheduler MBR Extract tool task process started============================//
        await ClaimSche_Utility.AssureClaims_FrameSwitch_ClaimSchedulerTab("Claim Scheduler", "taskmanager")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Scheduler_Tab.withText("Scheduler"), "Click on Scheduler Tab")
        await ClaimSche_Utility.AssureClaims_ClaimScheduler_TaskSubTask_Utility(data.ClaimScheduler_TaskTypeMBR, data.ClaimScheduler_SubTaskNameExtract, data.TaskName)
        await Inpt_Utility.AssureClaims_SetValue_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Tasks_Txt_OptionsetName, OptionSetName, "Optionset name")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_GenericUsage_Lst_Selection, "Open extract type lookup")
        await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Description", "Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_GenericUsage_Btn_SelectValue.withText("Claim"), "Claim type is selected")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_TabSelectionUnderTask_Tab_ImportExtract.withText("Claim Extract"), "Claimextract tab is clicked")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_GenericUsage_Lst_Selection, "Lne of business is clicked")
        await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Description", "General Claims")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_GenericUsage_Btn_SelectValue.withText("General Claims"), "General claim is selected")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_GenericUsage_Lst_Selection.nth(1), "Click on Claim status lookup")
        await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Description", "Open")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_GenericUsage_Btn_SelectValue.withText("Open"), "Open claim Status is selected")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_GenericUsage_Lst_Selection.nth(2), "Click on Service Code lookup")
        await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Description", "For Report Only")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_GenericUsage_Btn_SelectValue.withText("For Report Only"), "For Report Only Service code is selected")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsApp_ClaimScheduler_Btn_RoleImage.withText("save"), "Click on Save Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_ClaimSch.AssureClaimsAPP_ClaimScheduler_Lnk_TotalJobExecuted, "Total job executed")

        //==================================Claims Scheduler MBR Extract tool task process end ============================// 
    }
    )
})
