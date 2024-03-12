import { Selector, Role } from 'testcafe';

import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_DiaryUtilities from '../Functional_POM/POM_DiaryUtilities';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_AttachCreateDiary from '../Functional_POM/POM_AttachCreateDiary'
import POM_DiaryList from '../Functional_POM/POM_DiaryList';
import POM_Home from '../Functional_POM/POM_Home';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Diary_Creation = new POM_DiaryList();
const Verify_Utility = new Verification_Utility();
const Diary_Utilities = new POM_DiaryUtilities();
const Verification_Msg = new POM_VerificationMessage();
const AttachCreateDiary_POM = new POM_AttachCreateDiary();
const Home_POM = new POM_Home();
const ConfigMgr_POM = new POM_Config_Manager();
const GenSysPar_POM = new POM_GeneralSystemParameter();

var faker = require('faker');

var date = new Date();
var d = (date.getMonth() + 1) + '/' + (date.getDate()) + '/' + date.getFullYear();

var strTaskName1
var strTaskName2
var strUserLastName = faker.name.lastName();
var strUserFirstName = faker.name.firstName();
var strDiaryOwner = strUserFirstName + " " + strUserLastName;

const ColHead = ["Assigned User", "Assigning User"]
const ColVal = [strUserFirstName.toLowerCase(), 'autouser']

//Global Variable Declaration

DataIUT.forEach(data => {
  fixture`Smoke_DiaryPeekTransferPurge`.beforeEach(async t => {
    await t.wait(5000)
    await t.navigateTo(data.URL);
    await t.maximizeWindow();
  });
  
// 1. Create User 
  test('AssureClaims_UserCreation_Test_01', async t => {
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
    console.log("Login Into Application!!".green)
    //=================================================User Is Creation starts here==================================================================================================
    console.log("AssureClaims_SMSUserAddEditDelete_Utility Function is Called To Create User");
    await Function_Utility.AssureClaims_SMSUserAddEditDelete_Utility('Add', strUserLastName, strUserFirstName, 'NA', data.DSN, 'Training')
    console.log("User Created :" + strUserFirstName)
    //=================================================User Is Creation starts here==================================================================================================

  });

// 1. turn on Allow Diary Peek setting from configuration manager
// 2. turn off Default Assigned To Dairy Current User
// 3. create Diary
// 4. Peek Diary
// 5. create 2nd Diary
// 6. route diary
// 7. verify diary

  test('AssureClaims_DiaryPeek_Route_Test_02', async t => {
    // =====================================================Login into application starts here =============================================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
    // ======================================================= Login into application ends here ==============================================================================================

    // ==============================================Configuration Manager Setting OFF/ON starts here===================================================================================

    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "Diaries / Text Fields", "Diary")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser, 'UnCheck', "Uncheck Default Assigned To Diary User Check Box")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Chk_AllowDiaryPeek, 'Check', "Check Allow Global Peek for Diaries CheckBox")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
    // ==============================================Configuration Manager Setting OFF/ON ends here===================================================================================
    // =========================================================Zone Switched to "Claims" starts here ==================================================================================================
    await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims")
    await t.setNativeDialogHandler(() => true);
    await t.eval(() => location.reload(true));
    await t.wait(10000);
    // =========================================================Zone Switched to "Claims" ends here ==================================================================================================

    // ==============================================================Diary creation starts here =======================================================================================================
    console.log("AssureClaims_Diary_Creation_Utility Function is Called To Create Diary");
    strTaskName1 = await Function_Utility.AssureClaims_Diary_Creation_Utility(strUserFirstName);
    console.log("Diary Created with Taskname : " + strTaskName1);
    // ==============================================================Diary creation ends here =======================================================================================================

    //================================================================Steps for Peek Diary starts here ==============================================================================================
    await t.wait(4000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaimsApp_DiariesPeek_Btn_Peek, "Click on peek button")
    await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaims_DiaryCreation_Txt_AvailableUsers, strUserFirstName, "Available User TextBox")
    await t.pressKey('tab');
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Btn_Peek, "Click on peek button")
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaimsApp_Diaries_Img_DropDown, "Click on DropDown")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Diary_Creation.AssureClaimsApp_Diaries_Chk_ActiveDiaries, 'Check', "Checked Active Diaries Check Box")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Diary_Creation.AssureClaimsApp_Diaries_Chk_ShowNotes, 'Check', "Checked Show Notes Check Box")
    await t.pressKey('tab');
    await t.wait(1000);
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Image reload");
    await t.switchToMainWindow();

    //================================================================Diary2 Creation starts here ===================================================================================================
    console.log("AssureClaims_Diary_Creation_Utility Function is Called To Create Diary");
    strTaskName2 = await Function_Utility.AssureClaims_Diary_Creation_Utility(data.Username);
    console.log("Diary Created with Taskname : " + strTaskName2);
    await t.wait(4000)
    //================================================================Diary2 Creation ends here ===================================================================================================

    //=======================================================================Diary Route Begins Here===============================================================================================
    await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaimsApp_Diaries_Txt_TaskName, strTaskName2, "TaskName TextBox")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Click on Search Button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Btn_SelectGrid, "Grid Button Selected")
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiariesRoute_Btn_Route, "Route Diary Button On DiaryList")
    await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaims_DiariesRoute_Btn_RouteDiaryTo, strUserFirstName, "Available User TextBox")
    await t.pressKey('tab');
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiariesRoute_Btn_Route, "Split Button On RouteDiary Page")
    await t.wait(4000)
    //==================================================================Diary Route Ends Here=======================================================================================================

    //====================================================Routed Diary Verification Begins For Assigning User=====================================================================================
    await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaimsApp_Diaries_Txt_TaskName, strTaskName2, "TaskName TextBox")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Click on Search Button")
    await Verify_Utility.AssureClaims_ElementNotExist_Utility(Diary_Creation.AssureClaimsApp_Diaries_Img_RowSelector, "TaskName");
    await t.wait(2000)
  });
  
  // 1.  transfer Diary Purge
  // 2.  Verify  

  test('AssureClaims_TransferDiary_Test_03', async t => {

    //===============================================================Login with New User Starts here ==================================================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Configuration Manager')
    //===============================================================Login with New User ends here ==================================================================================================
    await t.wait(4000);
    //====================================================================Transfer Diary Utility Is Called ===========================================================================================
    var ToOwner = data.Username + " " + data.Username;
    console.log("AssureClaims_DiaryUtilities_TransferPurge_Utilityy Function is Called To TransferDiary");
    await Function_Utility.AssureClaims_DiaryUtilities_TransferPurge_Utility("Transfer", 'NA', strUserFirstName + " " + strUserLastName, ToOwner, 'NA', d, d, strTaskName2)

    //==================================================================Zone Switched To Claims===================================================================================================
    await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims")
    await t.wait(10000)
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Diaries:Diary List");
    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_DiaryFrame, "Diary Frame");
    await t.wait(2000);
    await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaims_Diary_Txt_NoRecordAvailable.withText("No Records Available."), "No records Available text ")
    //=======================================================Diary will not be dispalyed in Diary List now =========================================================================================
  });

// 1. Purge Diary
// 2. Verify  

  test('AssureClaims_PurgeDiary_Test_04', async t => {
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log("Login Into Application!!".green)
    //======================================================Login with Data json User to verify the Transfer Dairies==============================================================================
    await t.wait(3000)
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Diaries:Diary List");
    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_DiaryFrame, "Diary Frame");
    await t.wait(3000);
    await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strTaskName2, "TaskName")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
    // ============================================================Logout from application ======================================================================================================
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility()
    // ============================================================Logout from application ======================================================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, "Configuration Manager")
    console.log("Login Into Application!!".green)

    //=======================================================================PurgeDiary Utility Is Called======================================================================================
    console.log("AssureClaims_DiaryUtilities_TransferPurge_Utility Function is Called To Purge Created Diary");
    await Function_Utility.AssureClaims_DiaryUtilities_TransferPurge_Utility("Purge", strDiaryOwner, 'NA', 'NA', 'Open', d, d, 'NA')

    //======================================================================Zone Switched To Claims============================================================================================
    await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims");
    await t.wait(5000);
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Diaries:Diary List");
    await t.wait(2000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_DiaryFrame, "Diary Frame");
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_Diaries_Btn_History, "Click on History button")
    await t.wait(2000)
    await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaims_Diary_History_Lbl_TaskName.withText(strTaskName2), strTaskName2 + ": Created Taskname of Diary")
    await t.wait(3000);
  });

// 1. turn OFF Allow Diary Peek setting from configuration manager
// 2. turn ON Default Assigned To Dairy Current User

  test('AssureClaims_ConfigurationManager_ReverseSettings_Test_05', async t => {

    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, "Configuration Manager")
    console.log("Login Into Application!!".green)
    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "Diaries / Text Fields", "Diary")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser, 'Check', "Uncheck Default Assigned To Diary User Check Box")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Chk_AllowDiaryPeek, 'UnCheck', "Check Allow Global Peek for Diaries CheckBox")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
  });

  // 1. Delete User.
  test('AssureClaims_Security_UserDeletion_Test_06', async t => {
    //==============================================================Login Into Application with User started==================================================================

    await t.wait(10000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
    //==============================================================Login Into Application with User ended==========================================================================

    console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
    //==============================================================Deletion of Manager User started====================================================================================
    await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strUserFirstName + " " + strUserLastName, data.DSN, data.ModuleName)
    //==============================================================Deletion of Manager User ended===================================================================================
    // =================================================================Logout from the application starts here =========================================================================
    await t.wait(3000)
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    console.log("Logout from Application!!")
    // ===============================================================Logout from the application ends here ==========================================================================

  });
});
