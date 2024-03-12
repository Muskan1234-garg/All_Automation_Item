import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Adjuster from '../Functional_POM/POM_Adjuster';
import POM_MyPendingClaims from '../Functional_POM/POM_MyPendingClaims';
const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();
const Adjuster_POM = new POM_Adjuster();
const MyPendingClaims_POM = new POM_MyPendingClaims();
// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-96129
//Description      : Claims visible on my pending claims
//AUTHOR           : Sai Krishna Maddula
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194 Automation Regression, DSN : DataAutoRegDSN_2
// *******************************************************************************************************************************
var faker = require('faker');
//=========================================================================Global Variable Declaration Start's Here======================================================================================
var SrLastName = "Sr_" + "" + faker.name.lastName();
var SrFirstName = "Sr_" + "" + faker.name.firstName();
var MidLastName = "Mid_" + "" + faker.name.lastName();
var MidFirstName = "Mid_" + "" + faker.name.firstName();
var strAdjusterLastName;
var strClaimNumber;
var strClaimNumber1;
var strClaimNumber2;
var strAdjusterLastName1;
var strAdjusterLastName2;
var strAdjusterLastName3;
var manager;
var groundUser;
//=========================================================================Global Variable Declaration Start's Here======================================================================================
DataIUT.forEach(data => {
  fixture`MyPendingClaims`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });
  /* Steps performed by Security UserCreation_Test_01 :
     1. Login Into Application with User
     2. Creation of Manager User
     3. Creation of Ground User
     4. End
 */
  test('AssureClaims_Security_UserCreation_Test_01', async t => {
    //==============================================================Login Into Application with User started==================================================================
    await t.wait(10000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
    //==============================================================Login Into Application with User ended==================================================================
    console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
    //==============================================================Creation of Manager User started==================================================================
    manager = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", SrLastName, SrFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
    //==============================================================Creation of Manager User ended==================================================================
    //===============================================================Creation of Ground User Ended============================================================================================================
    groundUser = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", MidLastName, MidFirstName, SrFirstName + " " + SrLastName, "NA", data.DSN, data.ModuleName_Administrator)
    //==============================================================Creation of Ground User ended=========================================================================================================
  });
  /* Steps performed by General Claim Creation _Test_02 :
      1. Login Into Application with BaseUser
      2. Creation of Genral Claim
      3. Creation of Adjuster And Assign an Adjuster with RM login of Ground User
      4. End
  */
  test('AssureClaims_Claims_GCClaimCreationAndAdjusterCreation_Test_02', async t => {
    //==============================================================Login Into Application with User started==================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    //=========================================================Login Into Application with Ground User Ends Here================================================================================================
    //========================================================================Claim Creation Starts Here======================================================================
    await t.wait(10000)
    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:" + strClaimNumber)
    //========================================================================Claim Creation Ends Here======================================================================
    //=============================================================================== Creation of Adjuster And Assign an Adjuster with RM login of Ground User Starts Here=================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_AddAdjuster, "Add Adjuster Button on Adjuster Page")
    await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, data.MyPendingClaimAdjusterLastName1, "Adjuster Last Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_RiskmasterLogin, "RiskMaster Login Lookup")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_Users, "Users Button RiskMaster Login Lookup Page On Adjuster Screen")
    await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaimsApp_Adjuster_Txt_LoginName, groundUser, "LoginName TextBox Of RiskMaster Login Lookup Page On Adjuster Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup.nth(0), "Description Search Icon Of RiskMaster Login Lookup Page On Adjuster Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "select grid Of RiskMaster Login Lookup Page On Adjuster Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_Ok, "Click Ok Of RiskMaster Login Lookup Page Button On Adjuster Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Adjuster creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Adjuster Creation Screen");
    strAdjusterLastName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, "value");
    console.log(strAdjusterLastName.yellow);
    //=============================================================================== Creation of Adjuster And Assign an Adjuster with RM login of Ground User Ends Here=================================================================================
    /* Steps performed by General Claim Creation _Test_03 :
        1. Login Into Application with GroundUser
        2. Click On MyPendingClaims
        3. Verify The Claim Number Of Ground User In The MyPendingClaims
        4. End
    */
  })
  /* Steps performed To Verification OF Claim At Mypending Claims _Test_03 :
       1. Login Into Application with GroundUser
       2. Click On MyPendingClaims
       3. Verify The Claim Number Present In The MyPendingClaims
       4. End
   */
  test('AssureClaims_Claims_VerificationOFClaimAtMypendingClains_Test_03', async t => {
    //=========================================================Login Into Application with Ground User Starts Here================================================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(groundUser, "abkabk1", data.DSN, 'Claims')
    console.log(`Login Into Application with ${groundUser}`)
    //=========================================================Login Into Application with Ground User Ends Here================================================================================================
    //========================================================================Verification Of Claim Number Of Ground User Starts's Here==========================================================================
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("My Work:My Pending Claims")
    await t.wait(10000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_MyPendingClaimsIframe);
    await t.wait(5000);
    await In_Utility.AssureClaims_SetValue_Utility(MyPendingClaims_POM.AssureClaimsApp_MyPendingClaims_Txt_ClaimNumber, strClaimNumber, "Claim Number TextBox On MyPending Claims")
    const header5 = ["Claim Number", "My Role"]
    const val5 = [strClaimNumber, "Primary Adjuster"]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, 'Transaction grid view', header5, val5);
    await Nav_Utility.AssureClaims_ElementClick_Utility(MyPendingClaims_POM.AssureClaimsApp_MyPendingClaims_Lnk_ClaimNumber.withText(strClaimNumber), "Clicked On Claim Number On MyPending Claims")
    //========================================================================Verification Of Claim Number Of Ground User Starts's Here==========================================================================
  })
  /* Steps performed by General Claim Creation _Test_04 :
        1. Login Into Application with BaseUser
        2. Creation of Genral Claim Keep Status As Closed
        3. Creation of Adjuster And Assign an Adjuster with RM login of Ground User
        4. End
    */
  test('AssureClaims_ClosedGCClaimCreationAndAdjusterCreation_Test_04', async t => {
    //=================================================================================================Login Into Application with User started======================================================================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    //=================================================================================================Login Into Application with Ground User Ends Here==============================================================================================================
    //=========================================================================================Claim Creation Starts Here====================================================================================================
    await t.wait(10000)
    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    strClaimNumber1 = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatusClose, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:" + strClaimNumber1)
    //==========================================================================================Claim Creation Ends Here======================================================================================================
    //===============================================================================Creation of Adjuster And Assign an Adjuster with RM login of Ground User Starts Here=================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_AddAdjuster, "Add Adjuster Button on Adjuster Page")
    await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, data.PrioritizeAdjusterLastName, "Adjuster Last Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_RiskmasterLogin, "RiskMaster Login Lookup On Adjuster Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_Users, "Users Button RiskMaster Login Lookup Page On Adjuster Screen")
    await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaimsApp_Adjuster_Txt_LoginName, groundUser, "LoginName TextBox Of RiskMaster Login Lookup Page On Adjuster Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup.nth(0), "Description Search Icon Of RiskMaster Login Lookup Page On Adjuster Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "select grid Of RiskMaster Login Lookup Page On Adjuster Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_Ok, "Click Ok Of RiskMaster Login Lookup Page Button On Adjuster Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Adjuster creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Adjuster Creation Screen");
    strAdjusterLastName1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, "value");
    console.log(strAdjusterLastName1.yellow);
    //===============================================================================Creation of Adjuster And Assign an Adjuster with RM login of Ground User Starts Here=================================================================================
  })
  /* Steps performed To Verification OF Closed Claim At Mypending Clains _Test_05 :
       1. Login Into Application with GroundUser
       2. Click On MyPendingClaims
       3. Verify The Claim Number ClaimStatus Is Closed Of Ground User Not Present In The MyPendingClaims
       4. End
   */
  test('AssureClaims_Claim_VerificationOFClosedClaimAtMypendingClains_Test_05', async t => {
    //=========================================================Login Into Application with Ground User Starts Here================================================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(groundUser, 'abkabk1', data.DSN, 'Claims')
    console.log(`Login Into Application with ${groundUser}`)
    //=========================================================Login Into Application with Ground User Ends Here================================================================================================
    //=======================================================================Verification Of The Claim Number ClaimStatus Is Closed Of Ground User Not Present In The MyPendingClaims Start's Here==============================================================
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("My Work:My Pending Claims")
    await t.wait(10000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_MyPendingClaimsIframe);
    await t.wait(5000);
    await Verify_Utility.AssureClaims_ElementNotExist_Utility(MyPendingClaims_POM.AssureClaimsApp_MyPendingClaims_Lnk_ClaimNumber.withText(strClaimNumber1), "Row does not exist for entered Claim Number")
    //=======================================================================Verification Of The Claim Number ClaimStatus Is Closed Of Ground User Not Present In The MyPendingClaims End's Here==============================================================
  })
  /* Steps performed by Claims With Adjuster As Primary Or Claim Adjuster Should Be Visible _Test_06 :
        1. Login Into Application with BaseUser
        2. Creation of Genral Claim 
        3. Creation of First Adjuster As Currnt Adjuster
        4. Creation of Second Adjuster And Assign an Adjuster with RM login of Ground User
        5. End
    */
  test('GCClaimCreationAndCurrentAdjusterCreationAndAdjusterWithRMLoginOfGroundUser_Test_06', async t => {
    //==============================================================Login Into Application with User started==================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    //=========================================================Login Into Application with Ground User Ends Here================================================================================================
    //========================================================================Claim Creation Starts Here======================================================================
    await t.wait(10000)
    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    strClaimNumber2 = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log("AssureClaims General Claim Creation is called to create a claim with Claim Number:" + strClaimNumber2)
    //========================================================================Claim Creation Ends Here======================================================================
    //===============================================================================Current Adjuster Creation Starts Here=================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_AddAdjuster, "Add Adjuster Button on Adjuster Page")
    await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, data.MyPendingClaimAdjusterLastName3, "Adjuster Last Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Adjuster creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Adjuster Creation Screen");
    strAdjusterLastName2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, "value");
    console.log(strAdjusterLastName2.yellow);
    await t.wait(5000)
    await t.switchToMainWindow();
    //===============================================================================Current Adjuster Creation Ends Here=================================================================================
    //===============================================================================Adjuster with RM login of Ground User Creation Starts Here=================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button On Adjuster Screen")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_AddAdjuster, "Add Adjuster Button on Adjuster Page")
    await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, data.MyPendingClaimAdjusterLastName4, "Adjuster Last Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_RiskmasterLogin, "RiskMaster Login Lookup On Adjuster Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_Users, "Users Button RiskMaster Login Lookup Page On Adjuster Screen")
    await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaimsApp_Adjuster_Txt_LoginName, groundUser, "LoginName TextBox Of RiskMaster Login Lookup Page On Adjuster Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup.nth(0), "Description Search Icon Of RiskMaster Login Lookup Page On Adjuster Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "select grid Of RiskMaster Login Lookup Page On Adjuster Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_Ok, "Click Ok Of RiskMaster Login Lookup Page Button On Adjuster Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Adjuster creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Adjuster Creation Screen");
    strAdjusterLastName3 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, "value");
    console.log(strAdjusterLastName3.yellow);
    //===============================================================================Adjuster with RM login of Ground User Creation Ends Here=================================================================================
  })
  /* Steps performed To Verifiy  Claims with adjuster as primary or claim adjuster should be visible _Test_07 :
        1. Login Into Application with GroundUser
        2. Click On MyPendingClaims
        3. Verify The Third Claim Number And MyRole Of Ground User The MyPendingClaims
        4. Verify The First Claim Number And MyRole Of Ground User The MyPendingClaims
        5. End
    */
  test('AssureClaims_Claims_VerifiyClaimsWithAdjusterAsPrimaryOrClaimAdjusterShouldBeVisible_Test_07', async t => {
    //=========================================================Login Into Application with Ground User Starts Here================================================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(groundUser, 'abkabk1', data.DSN, 'Claims')
    console.log(`Login Into Application with ${groundUser}`)
    //=========================================================Login Into Application with Ground User Ends Here================================================================================================
    //========================================================================Verification Of Currnt Adjuster In MyRole & Third Claim Number Of Ground User Starts's Here==========================================================================
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("My Work:My Pending Claims")
    await t.wait(10000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_MyPendingClaimsIframe);
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(MyPendingClaims_POM.AssureClaims_MyPendingClaims_Chk_ShowAllClaims, "Show All Claims Check")
    await In_Utility.AssureClaims_SetValue_Utility(MyPendingClaims_POM.AssureClaimsApp_MyPendingClaims_Txt_ClaimNumber, strClaimNumber2, "Claim Number TextBox")
    const header5 = ["Claim Number", "My Role"]
    const val5 = [strClaimNumber2, "Claim Adjuster"]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber2, 'Transaction grid view', header5, val5);
    //========================================================================Verification Of Currnt Adjuster In MyRole  & ThirdClaim Number Of Ground User End's Here==========================================================================
    //========================================================================Verification Of Claim Number Of First Claim Of Ground User Starts's Here==========================================================================
    await In_Utility.AssureClaims_SetValue_Utility(MyPendingClaims_POM.AssureClaimsApp_MyPendingClaims_Txt_ClaimNumber, strClaimNumber, "Claim Number TextBox")
    const header6 = ["Claim Number", "My Role"]
    const val6 = [strClaimNumber, "Primary Adjuster"]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, 'Transaction grid view', header6, val6);
    //========================================================================Verification Of Claim Number Of First Claim Of Ground User Starts's Here==========================================================================

  })
  /* Steps performed by UserDeletion_Test_08 :
         1. Login Into Application with Ground User
         2. Deletion of Ground User
         3. Deletion of Manager User
     */
  test('AssureClaims_Security_UserDeletion_Test_08', async t => {
    //==============================================================Login Into Application with User started==================================================================

    await t.wait(10000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
    //==============================================================Login Into Application with User ended==========================================================================

    console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
    //==============================================================Deletion of Manager User started====================================================================================
    await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", SrFirstName + " " + SrLastName, data.DSN, data.ModuleName)
    //==============================================================Deletion of Manager User ended===================================================================================
    //==============================================================Deletion of Ground User started==============================================================================
    await t.switchToMainWindow()
    await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", MidFirstName + " " + MidLastName, data.DSN, data.ModuleName)
    //==============================================================Deletion of Ground User ended==================================================================

  });




})