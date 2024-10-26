import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility'
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Home from '../Functional_POM/POM_Home';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_SMS from '../Functional_POM/POM_SMS';
import POM_Search from '../Functional_POM/POM_Search'
import POM_Enhanced_Notes from '../Functional_POM/POM_Enhanced_Notes';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const SMS_POM = new POM_SMS();
const Search_POM = new POM_Search();
const Home_POM = new POM_Home();
const EnhNote_POM = new POM_Enhanced_Notes();
const ConfigMgr_POM = new POM_Config_Manager();

const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
var faker = require('faker');

var date;
var strClaimNumber;
var NoteText = 'CreateNote_' + faker.random.alpha(5).toUpperCase();
var EditNoteText = 'EditNote_' + faker.random.alpha(5).toUpperCase();

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-85710, RMA-107093
// Description     : Refer Jira
//AUTHOR           : Shruti
//Revision         : Tushar Bachchan 09-11-2023
//DEPENDANCY       : None
//PRE-REQUISITE    : Use Drafts In Settings is to be ON
//Preferred Server : 194Automation, DSN2 : RM202REG_Test2
// *******************************************************************************************************************************

DataIUT.forEach(data => {
    const LoggedInUser = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    const ConfigManagerLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Configuration Manager Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`SaveAsDraft`.beforeEach(async t => {

    });

    /* Steps performed by AssureClaims_ConfigManager_01 :
      1. Configuration Manager Settings
      2. check use drafts checkbox
  */

    test('AssureClaims_ConfigManager_01', async t => {
        //============================================== Configuration Manager Settings -> Check 'use drafts' checkbox started ============================================================
        await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin);
        await t.wait(4000)

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "Diaries / Text Fields", "Enhanced Notes")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(ConfigMgr_POM.AssureClaims_POM_UseDraftInNotes, "Check", "Use Draft In Notes Checkbox On General System Parameters Screen");

        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //============================================== Configuration Manager Settings -> Check 'use drafts' checkbox ended ============================================================



    });

    /* Steps performed by AssureClaims_GeneralClaim_Test_02 :
            1. GC Creation
            2. Verification of buttons for Enhanced notes
            3. Creation of enhanced Notes
            4. Editing the created note
            5. Saving as Draft
            6. Verification for drafts
        */

    test('AssureClaims_GeneralClaim_Test_02', async t => {

        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
        date = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -1, "MM/DD/YYYY");
        //=====================================================Claim Creation Started Here====================================================================
        console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(date, date, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("New General Claim is Created with Claim Number: ".green + strClaimNumber);
        //=====================================================Claim Creation ended Here====================================================================
        //=====================================================Claim Creation ended Here====================================================================
        //=====================================================Verification of buttons for Enhanced notes started Here====================================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_Select_Enhanced_Notes(), 'Enhanced Notes Button On General Claim Screen');
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_EnhanceNotesIframe);

        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_EditNotes, "Edit Button On Notes Tab On Enhanced Notes Window");
        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_DeleteNotes, "Delete Button On Notes Tab On Enhanced Notes Window");
        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhNotes_Tab_Drafts, "Drafts Tab On Enhanced Notes Window");
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_CreateNotes, "Create Notes Button On Enhanced Notes Screen");
        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhNotes_Btn_SaveAsDrafts, "Save As Draft Button On Enhanced Notes Screen");
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_Select_Enhanced_Notes_Close_Button, "Close Button On Enhanced Notes Screen");

        //=====================================================Verification of buttons for Enhanced notes ended Here====================================================================

        //=====================================================Enhanced notes Creation Started Here====================================================================

        console.log("AssureClaims_EnhancedNotesCreateEditDelete_Utility Function is Called To Create Enhanced Notes".yellow);
        await Function_Utility.AssureClaims_EnhancedNotesCreateEditDelete_Utility("Create/Edit", NoteText, data.ExNoteType3, EditNoteText);
        console.log("New Enhanced Notes Is Created And Edited Successfully".green);

        //=====================================================Enhanced notes Creation Ended Here====================================================================
        //=====================================================Enhanced notes Editing Started Here====================================================================


        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_Enhanced_Notes_Btn_SelectGrid, "Enhanced Notes Grid Checkbox");
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_EditNotes, "Edit Button On Enhanced Notes Screen");
        await In_Utility.AssureClaims_SetValue_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_TxtArea_ProgressNotes, "Edit For Draft Test", "Enhanced Notes Text Area");

        await t.wait(6000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_EnhNotes_Btn_SaveAsDrafts, "Save As Draft Button On Enhanced Notes Screen");
        //=====================================================Enhanced notes Editing Ended Here====================================================================
        //=====================================================Verification of buttons for Drafts started Here====================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_BackToNotes, "Back To Notes Button On enhanced Notes Screen");

        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhNotes_Drafts_IconOnMainNote, "Drafts Icon On Main Notes Grid");
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_EnhNotes_Tab_Drafts, "Drafts Tab On Enhanced Notes Screen");
        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_EditNotes, "Edit Button On Drafts Tab On Enhanced Notes Window");
        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_DeleteNotes, "Delete Button On Drafts Tab On Enhanced Notes Window");
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_Enhanced_Notes_Btn_SelectGrid, "Enhanced Notes Grid Select Checkbox");
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_EditNotes, "Edit Notes Icon On Enhanced Notes Screen");
        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhNotes_Drafts_Btn_OpenAsMainNote, "Open As Main Notes Button On Edit Draft PopUp");
        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhNotes_Drafts_Btn_OpenAsDraft, "Open As Draft Button On Edit Drafts PopUp");
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_EnhNotes_Drafts_Btn_CloseEditDraft, "Close Alert On Edit Draft Screen");

        //=====================================================Verification of buttons for Drafts Ended Here====================================================================
    });
    /* Steps performed by AssureClaims_ConfigManager_03 :
      1. Configuration Manager Settings
      2. Uncheck use drafts checkbox
  */

    test('AssureClaims_ConfigManager_03', async t => {
        //============================================== Configuration Manager Settings -> UnCheck 'use drafts' checkbox started ============================================================

        await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin);
        await t.wait(4000)
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "Diaries / Text Fields", "Enhanced Notes")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(ConfigMgr_POM.AssureClaims_POM_UseDraftInNotes, "UnCheck", "Use Draft In Notes Checkbox On General System Parameters Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        //============================================== Configuration Manager Settings -> UnCheck 'use drafts' checkbox ended ============================================================

    });
    /* Steps performed by AssureClaims_SaveAsDraft_04 :
            1. GC Creation
            2. Verification of buttons for Drafts started
            3. Creation of enhanced Notes
            4. Editing the created note
            
        */

    test('AssureClaims_SaveAsDraft_04', async t => {

        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
        //=====================================================Claim Search Started Here====================================================================
        console.log("Steps To Search Claim Started Here".yellow);
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Claim");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_ClaimIframe);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_ClaimNumber, strClaimNumber, "Typing Claim Number")
        await Function_Utility.AssureClaims_Search()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_ClaimIframe1);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_ClaimNumber.withText(strClaimNumber), "click link ClaimNumber")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        console.log("Existing Claim is Searched With Claim Number: ".green + strClaimNumber);
        //=====================================================Claim Search Completed Here====================================================================
        await t.wait(5000)
        //=====================================================Verification of buttons for Drafts started Here====================================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_Select_Enhanced_Notes(), 'Enhanced Notes Button On General Claim Screen');
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_EnhanceNotesIframe);
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(EnhNote_POM.AssureClaims_EnhNotes_Drafts_IconOnMainNote, "Drafts Icon On Main Notes Grid");
        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhNotes_Tab_DraftsHidden, "No Drafts Tab On Enhanced Notes Window");
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_CreateNotes, "Create Notes Button On Enhanced Notes Screen");
        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhNotes_Drafts_Btn_SaveAsDraftsHidden, "No Save As Draft Button On Enhanced Notes Screen");
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_Select_Enhanced_Notes_Close_Button, "Close Button On Enhanced Notes Screen");
        //=====================================================Verification of buttons for Drafts Ended Here====================================================================

        //=====================================================Enhanced notes Creation Started Here====================================================================

        console.log("AssureClaims_EnhancedNotesCreateEditDelete_Utility Function is Called To Create Enhanced Notes".yellow);
        await Function_Utility.AssureClaims_EnhancedNotesCreateEditDelete_Utility("Create/Edit", NoteText, data.ExNoteType3, EditNoteText);
        console.log("New Enhanced Notes Is Created And Edited Successfully".green);
        //=====================================================Enhanced notes Creation Ended Here====================================================================
        //=====================================================Enhanced notes Editing Started Here====================================================================


        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_Enhanced_Notes_Btn_SelectGrid, "Enhanced Notes Grid Checkbox");
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_EditNotes, "Edit Button On Enhanced Notes Screen");
        await In_Utility.AssureClaims_SetValue_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_TxtArea_ProgressNotes, "Edit For Draft Test", "Enhanced Notes Text Area");

        await t.wait(10000)

        await Verify_Utility.AssureClaims_ElementNotExist_Utility(EnhNote_POM.AssureClaims_EnhNotes_Drafts_RedLine, "Red Line For Drafts Save");
        //=====================================================Enhanced notes Editing Ended Here====================================================================
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_Select_Enhanced_Notes_Close_Button, "Close Button On Enhanced Notes Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteOK, "Ok Button On Confirm Close PopUp");
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_Select_Enhanced_Notes(), 'Enhanced Notes Button On General Claim Screen');
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_EnhanceNotesIframe);

        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_Enhanced_Notes_Btn_SelectGrid, "Enhanced Notes Grid Select Checkbox");
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_EditNotes, "Edit Notes Icon On Enhanced Notes Screen");
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(EnhNote_POM.AssureClaims_EnhNotes_Drafts_Btn_OpenAsMainNote, "Open As Main Notes Button On Edit Draft PopUp");
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(EnhNote_POM.AssureClaims_EnhNotes_Drafts_Btn_OpenAsDraft, "Open As Draft Button On Edit Drafts PopUp");

    });

    /* Steps performed by AssureClaims_ConfigManager_05 :
      1. Configuration Manager Settings
      2. check use drafts checkbox
  */

    test('AssureClaims_ConfigManager_05', async t => {

        //============================================== Configuration Manager Settings -> Check 'use drafts' checkbox started ============================================================


        await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin);
        await t.wait(4000)
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "Diaries / Text Fields", "Enhanced Notes")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(ConfigMgr_POM.AssureClaims_POM_UseDraftInNotes, "Check", "Use Draft In Notes Checkbox On General System Parameters Screen");

        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        //============================================== Configuration Manager Settings -> Check 'use drafts' checkbox ended ============================================================

    });

    /* Steps performed by AssureClaims_SMS_DraftEdit_06 :
           1. Login into Security Zone
           2. Removing Permission for Edit and delete for Enhanced Notes for the current user
           3. Login into Claim Zone
           4. Searching the GC claim Created
           5. Verification for Edit and Delete Buttons On Main Notes Grid and Enhanced Notes Screen 
       */

    test("AssureClaims_SMS_DraftEdit_06", async t => {
        //============================================== Login into Security Zone started ============================================================


        await t.navigateTo(data.URL).maximizeWindow();
        console.log("AssureClaims_LoginIntoApplication_Utility Function Is Called To Login Again Into The Application!!".yellow)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, "Security");
        await t.wait(5000)
        console.log("Login Into Application!!".green);
        //============================================== Login into Security Zone ended ============================================================
        //============================================== Removing Permission for Edit and delete for Enhanced Notes started ============================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_DataSources, "Expand Icon For Datasources On SMS Screen");
        var DSNExpand = Selector('[id="' + data.DSN + '"]').parent('li').find('[class="tree-branch-head c-iCollapsed"]');
        await Nav_Utility.AssureClaims_ElementClick_Utility(DSNExpand, "Expand Icon For DSN On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_ModuleSecGroups, "Expand Icon for Module Security Group On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Label_Options.withText(data.ModuleSecurityGroup), "Module Security Group on SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(await SMS_POM.AssureClaims_SMS_GenericExpandIcon("RISKMASTER"), "RISKMASTER Expand Option On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(await SMS_POM.AssureClaims_SMS_GenericExpandIcon("General Claims"), "General Claim Expand Option On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(await SMS_POM.AssureClaims_SMS_GenericExpandIcon("Enhanced Notes"), "Enhanced Notes Expand Option On SMS Screen");
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_EnhnDelete, "UnCheck", "Delete Checkbox Under Enhanced Notes Node On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Chk_EnhnEdit, "UnCheck", "Edit Checkbox Under Enhanced Notes Node On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_SaveSettings, "Save Button On SMS Screen");

        //============================================== Removing Permission for Edit and delete for Enhanced Notes ended ============================================================
        console.log("AssureClaims_LogoutFromApplication_Utility Function Is Called To Logout From Application!!".yellow);
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        //============================================== Login into Claim Zone started ============================================================


        console.log("AssureClaims_LoginIntoApplication_Utility Function Is Called To Login Again Into The Application!!".yellow)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, "Claims");
        await t.wait(5000)
        console.log("Login Into Application!!".green)

        //============================================== Login into Claim Zone ended ============================================================
        //=====================================================Claim Search Started Here====================================================================

        console.log("Steps To Search Claim Started Here".yellow);
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Claim");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_ClaimIframe);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_ClaimNumber, strClaimNumber, "Typing Claim Number")
        await Function_Utility.AssureClaims_Search()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_ClaimIframe1);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_ClaimNumber.withText(strClaimNumber), "click link ClaimNumber")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        console.log("Existing Claim is Searched With Claim Number: ".green + strClaimNumber);
        //=====================================================Claim Search Ended Here====================================================================

        //=====================================================Verification for Edit and Delete Buttons On Main Notes Grid and Enhanced Notes Screen Stared Here====================================================================


        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_Select_Enhanced_Notes(), 'Enhanced Notes Button On General Claim Screen');
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_EnhanceNotesIframe);
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_EditNotes, "Edit Notes Button On Main Notes Grid");
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_DeleteNotes, "Delete Notes Button On Main Notes Grid");
        await Nav_Utility.AssureClaims_ElementClick_Utility(EnhNote_POM.AssureClaims_EnhNotes_Tab_Drafts, "Drafts Tab On Enhanced Notes Screen");
        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_EditNotes, "Edit Button On Drafts Tab On Enhanced Notes Screen");
        await Verify_Utility.AssureClaims_ElementExist_Utility(EnhNote_POM.AssureClaims_EnhancedNotes_Btn_DeleteNotes, "Delete Button On Drafts Tab On Enhanced Notes Screen");

        //=====================================================Verification for Edit and Delete Buttons On Main Notes Grid and Enhanced Notes Screen Stared Here====================================================================


        console.log("AssureClaims_LogoutFromApplication_Utility Function Is Called To Logout From Application!!".yellow);
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();

    });

    /* Steps performed by AssureClaims_SMS_SettingsRevert_07 :
            1. Login into Security Zone
            2. Granting Permission for Edit and delete for Enhanced Notes for the current user
            
        */
    test("AssureClaims_SMS_SettingsRevert_07", async t => {
        //============================================== Login into Security Zone started ============================================================

        await t.navigateTo(data.URL).maximizeWindow();
        console.log("AssureClaims_LoginIntoApplication_Utility Function Is Called To Login Again Into The Application!!".yellow)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, "Security");
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //============================================== Login into Security Zone ended ============================================================
        //============================================== Granting Permission for Edit and delete for Enhanced Notes started ============================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_DataSources, "Expand Icon For Datasources On SMS Screen");
        var DSNExpand = Selector('[id="' + data.DSN + '"]').parent('li').find('[class="tree-branch-head c-iCollapsed"]');
        await Nav_Utility.AssureClaims_ElementClick_Utility(DSNExpand, "Expand Icon For DSN On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_ModuleSecGroups, "Expand Icon for Module Security Group On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Label_Options.withText(data.ModuleSecurityGroup), "Module Security Group on SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(await SMS_POM.AssureClaims_SMS_GenericExpandIcon("RISKMASTER"), "RISKMASTER Expand Option On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(await SMS_POM.AssureClaims_SMS_GenericExpandIcon("General Claims"), "General Claim Expand Option On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(await SMS_POM.AssureClaims_SMS_GenericExpandIcon("Enhanced Notes"), "Enhanced Notes Expand Option On SMS Screen");
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_EnhnDelete, "Check", "Delete Checkbox Under Enhanced Notes Node On SMS Screen");
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_EnhnEdit, "Check", "Edit Checkbox Under Enhanced Notes Node On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_SaveSettings, "Save Button On SMS Screen");
        //============================================== Granting Permission for Edit and delete for Enhanced Notes ended ============================================================

        console.log("AssureClaims_LogoutFromApplication_Utility Function Is Called To Logout From Application!!".yellow);
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    });
});
