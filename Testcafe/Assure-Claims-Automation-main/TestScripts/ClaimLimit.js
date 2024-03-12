import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_UserPrivilegesSetUp from '../Functional_POM/POM_UserPrivilegesSetUp';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Generic_Claims = new POM_Generic_Claims();
const Verify_Utility = new Verification_Utility();
const In_Utility = new Input_Utility();
const Verification_Msg = new POM_VerificationMessage();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const Home_POM = new POM_Home();


// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-107064
//Description      : 1. Create 1 user. 
//                   2. Turn on claim Limit settings from Security
//                   3. Add 2 Limits against claim type : 1. if claim type discrimination then enable allow edit/
//                   4. Set claim  limit for Ground user -> select ClaimType Discrimination and Enable Allow Add/Create and Allow Access.
//                   5. Set claim  limit for Ground user -> select  Claim Type Errors And Omissions and Disable Allow Add/Create and Allow Access
//                   6. create 2 claim using both claimtype and with discrimination claim will be created and with Error And Omissions it wont be able to create claim
//                   7. Revert settings

//AUTHOR           : Yashaswi Mendhekar
//DEPENDANCY       : No
//PRE-REQUISITES   : None
//Preferred Server : 194 Automation Regression, DSN : DataAutoRegDSN_2
// *******************************************************************************************************************************

var faker = require('faker');

//Global Variable Declaration

var strUserLastName = "USR_" + "" + faker.name.lastName();
var strUserFirstName = "USR_" + "" + faker.name.firstName();

var strClaimNumber
var strGroundUserName


DataIUT.forEach(data => {
    fixture`ClaimLimit`.beforeEach(async t => {
        await t.wait(8000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /* Steps performed by AssureClaims_UserCreationAndUserPrivilegeSetting_Test_01 :
          1) Login Into Application with User
          2) Creation of Ground User 
          3) Select LOB > General claim
          4) Select Limit type > claim Limit > enable claim limit
          5) Set claim  limit for Ground user -> select ClaimType Discrimination and Enable Allow Add/Create and Allow Access.
          6) Set claim  limit for Ground user -> select  Claim Type Errors And Omissions and Disable Allow Add/Create and Allow Access.
          7) Logout
      */
    test('AssureClaims_UserCreationAndUserPrivilegeSetting_Test_01', async t => {

        //==============================================================Login Into Application with User started==============================================================================================
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended=================================================================================================
        
        //==============================================================Creation of Ground User started=======================================================================================================
        strGroundUserName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strUserLastName, strUserFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
        console.log(strGroundUserName.green)
        //==============================================================Creation of Ground User ended=========================================================================================================

        //============================================================== Securities > user privilege setup ended=========================================================================================
        await t.wait(5000)
        await t.switchToMainWindow()
        await t.wait(5000)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)

        //==============================================================Select LOB > General claim started===============================================================================================
        await t.wait(5000);
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        //==============================================================Select LOB > General claim ended==================================================================================================

        //==============================================================Select Limit type > per claim pay limit > enable per claim pay Limit started==================================================================
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Claim Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbLmt, "Check", "Checked Enable Claim Limits")
        await t.wait(7000);
        //==============================================================Select Limit type > per claim pay limit > enable per claim pay limit ended=============================================================

        //===================================================Set claim limit for User started here===============================================================================================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strUserFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_ClaimType, data.GCClaimType, "Claim Type")
        await t.pressKey('tab');
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_AllowCreateUpdate, "Check", "Add Allow Create/Update ")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_AllowAccess, "Check", "Add Allow Access")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set claim limit for User ended here===============================================================================================================================================================================================

        //===================================================Set claim limit for User started here===============================================================================================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strUserFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_ClaimType, data.ClaimType_ErrorsAndOmissions, "Claim Type")
        await t.pressKey('tab');
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_AllowCreateUpdate, "UnCheck", "Add Allow Create/Update ")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_AllowAccess, "UnCheck", "Add Allow Access")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set claim limit for User ended here===============================================================================================================================================================================================

        // ========================================================== Logout from the application starts here ================================================================================================
        await t.wait(3000)
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        // ========================================================== Logout from the application ends here ================================================================================================

    });

    /*
    1)Login into claim zone
    2)Create 2 claims
    3)Create claims with Claim Type as Discrimination and 2nd with Error and Omissions
    4)Verify Claim Error msg for 2nd Claim
    5)Logout 
    */
    test("AssureClaims_ClaimCreationAndVerification_Test_02", async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(5000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log(`Login Into Application with ${strUserFirstName}`)
        //===================================================Login into claim ended here==================================================================================================================

        //===================================================Claim creation started here==================================================================================================================
        await t.wait(5000)
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:" + strClaimNumber)
        //===================================================Claim creation ended here==================================================================================================================
        //===================================================Claim Creation Start's Here========================================================================================================
        await t.wait(5000)
        await t.switchToMainWindow();
        Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Close button clicked");
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:General Claim");
        await t.wait(5000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(5000);
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent, d, "Date Of Event")
        await t.wait(1000);
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfClaim, d, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept, data.Department, "Department")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele_CarrierClaimType = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withExactText(data.ClaimType_ErrorsAndOmissions).with({ visibilityCheck: true })
        await t.expect(ele_CarrierClaimType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierClaimType, "Claim Type Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele_CarrierStatus = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele_CarrierStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierStatus, "Claim Status Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele_CarrierPolicyLOB = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectPolicyLOB.withExactText(data.GCPolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele_CarrierPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierPolicyLOB, "Policy LOB Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        //==============================================================Claim Creation End's Here========================================================================================================
        var strSaveMessageVerification = `Configured User Limit prevents saving claims of type ${data.ClaimType_ErrorsAndOmissions} and status Open.`;
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(strSaveMessageVerification, true, "Claim not created due to limit")

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });

    /*
    1)Login to Security
    2)Revert setting for claim limit
    3)Logout
    */
    test("AssureClaims_RevertSecuritySetting_Test_03", async t => {

        //===================================================Login into security started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Security')
        console.log(`Login Into Application with ${strUserFirstName}`)
        //===================================================Login into security ended here==================================================================================================================

        //===================================================Uncheck Claim Limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        await t.wait(5000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Claim Limits', "Select Limit Type")

        //===================================================Remove Claim limit for Ground User started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strUserFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove Claim limit for Ground User ended here==================================================================================================================

    });


    /* 
      1)Login Into Application 
      2)Deletion of Ground User
  */
    test('AssureClaims_UserDeletion_Test_04', async t => {
        //==============================================================Login Into Application with User started==================================================================

        await t.wait(30000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(10000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==========================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
 
        //==============================================================Deletion of Ground User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strUserFirstName + " " + strUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Ground User ended==================================================================

    });
});


