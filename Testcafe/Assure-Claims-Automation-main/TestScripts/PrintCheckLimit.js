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
import POM_PaymentsCollections from "../Functional_POM/POM_PaymentsCollections";
import POM_ClearCheack from "../Functional_POM/POM_ClearCheack";
import POM_Home from '../Functional_POM/POM_Home';
import POM_StopPay from "../Functional_POM/POM_StopPay";

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const In_Utility = new Input_Utility();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const StopPay_POM = new POM_StopPay();
const ClearCheack_POM = new POM_ClearCheack();
const Payment_POM = new POM_PaymentsCollections();
const Home_POM = new POM_Home();



// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-107091
//Description      :   1. Login to Security > Security Management system.
                    // 2. Create User.
                    // 3. Go to User privilege setup.
                    // 4. Select Limit type.
                    // 5. Print Check Limit.
                    // 6. Set Limit for the created user.
                    // 7. Enter user name and Amount.
                    // 8. Login with the created user.
                    // 9. Create a GC, reserve, Payment.
                    // 10. Negative Verification for Print Check Option and Contol Number in Funds -> Printcheck.
                    // 11.Delete created user.

//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194 Automation Regression, DSN : DataAutoRegDSN_2
// *******************************************************************************************************************************

var faker = require('faker');
//Global Variable Declaration

var strGroundUserLastName = "Usr_" + "" + faker.name.lastName();
var strGroundUserFirstName = "Usr_" + "" + faker.name.firstName();
var strGroundUser;

var strClaimNumber;
var strControlNumber;

DataIUT.forEach(data => {
    fixture`PerClaimPayLimit_AdjusterChain`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /* Steps performed by AssureClaims_UserCreationAndUserPrivilegeSetting_Test_01 :
    1. Login Into Application with User
    2. Creation of Ground User
    3. Go to Security
    4. user privilege setup
    5. Select LOB > General claim
    6. Select Limit type >Print Check limit > enable Print Check Limit
    7. Select the ground user > enter amount and Click on add
    8. Logout
   */
    test('AssureClaims_UserCreationAndUserPrivilegeSetting_Test_01', async t => {
        //==============================================================Login Into Application with User started==================================================================

        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
        //==============================================================Creation of Ground User started==================================================================

        strGroundUser = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strGroundUserLastName, strGroundUserFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)

        //==============================================================Creation of Ground User ended==================================================================
        await t.wait(5000)
        await t.switchToMainWindow()

        await t.wait(5000)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        //==============================================================Login to Assure claims > Securities > user privilege setup ended==================================================================
        //==============================================================Select LOB > General claim started==================================================================
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, "Policy LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB.find('option').withText('GC - General Claims'), "Select LOB")
        //==============================================================Select LOB > General claim ended==================================================================
        //==============================================================Select Limit type > Print Check Limits > enable Print Check Limits started==================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, "LimitType")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType.find('option').withText('Print Check Limits'), "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "Check", "Checked Enable Print Check Limits")
        await t.wait(7000);
        //==============================================================Select Limit type > Print Check Limits > enable Print Check Limits ended==================================================================
        //==============================================================Select the ground user > add amount and Click on add started==================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strGroundUser, "Ground User")
        await t.pressKey('tab');


        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, data.DepositAmount, "Ground User")
        await t.pressKey('tab');


        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //==============================================================Select the ground user > add amount and Click on add ended==================================================================
        await t.wait(3000)
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    });


    /* Steps performed by AssureClaims_GCClaimCreationAndPaymentCreation_Test_02 :
       1. Login Into Application with Ground User
       2. Corporate GC Creation
       3. Reserve Creation
       4. Payments Creation
       5. Negative Verification for Printing Check option and Control No. in Funds Print Check
   */
    test('AssureClaims_GCClaimCreationAndPaymentCreation_Test_02', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUser, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended=========================================================================

        let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
            "MM/DD/yyyy"
        );
        //=====================================Corporate GC  Creation started here===================================================================================================================================
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(
            d,
            d,
            data.ClaimStatus,
            data.GCClaimType,
            data.Department,
            data.GCPolicyLOB
        );
        console.log(
            "New Cooperate General Claim is Created with Claim Number: ".green +
            strClaimNumber
        );
        //=====================================Corporate GC  Creation completed here===================================================================================================================================

        //=====================================Reserve Creation started here===================================================================================================================================

        await Function_Utility.AssureClaims_Reserve_Utility(
            data.ReserveType,
            data.ReserveAmount,
            data.ReserveStatus
        );
        //=====================================Reserve Creation completed here===================================================================================================================================

        await t.wait(2000);
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(
            ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
            "back after reserve creation"
        );
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(
            Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
        );
        await Nav_Utility.AssureClaims_ElementClick_Utility(
            ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow,
            "grid button"
        );
        await t.wait(3000);
        //=====================================Payment Creation started here===================================================================================================================================


        strControlNumber = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
            data.BankAccount,
            data.PayeeType,
            data.LastName,
            data.TransactionType,
            "105"
        );
        //=====================================Payment Creation completed here===================================================================================================================================

        //=====================================Negative Verification for Printing Check started here===================================================================================================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(
            StopPay_POM.AssureClaims_Claims_Btn_Lookup,
            "look up button"
        );
        await t.wait(2000);
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(StopPay_POM.AssureClaims_Claims_Lnk_PrintCheck.withText("Print Check"), "Print Check Option From The List")

        //=====================================Negative Verification for Printing Check ends here===================================================================================================================================
        //========================================Negative Verification for Generated Control Number in Funds -> Print Checks starts==============================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Print Checks")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_printCheckIframe);
        await t.wait(5000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheck_Lst_BankAccount, data.BankAccount, "Select Bank Account")
        await t.wait(5000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheck_Lst_SelectCheck, data.Checks, "Select Check")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PrintCheck_Btn_CheckSelection, "button for check selection")
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_txt_ControlNumber, strControlNumber, "Control Number")
        await t.wait(2000);
        const strNoOfItems = await Home_POM.AssureClaims_Row_NoRowsDisplayed.innerText
        await Verify_Utility.AssureClaims_TextCompare("(Showing Items: 0)", strNoOfItems, "No rows present")
        //========================================Negative Verification for Generated Control Number in Funds -> Print Checks ends==============================================

    });

    /*
       1)Login to Security
       2)Remove Print check Limit from ground User and UnCheck Print check Limit 
       */
    test("AssureClaims_RevertSecuritySetting_Test_03", async t => {

        //===================================================Login into security started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUser, 'abkabk1', data.DSN, 'Security')
        console.log(`Login Into Application with ${strGroundUser}`)
        //===================================================Login into security ended here==================================================================================================================

        //===================================================Uncheck Print Check Limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        await t.wait(5000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Print Check Limits', "Select Limit Type")

        //===================================================Remove Print Check for Ground User 100$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strGroundUser, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove Print Check for Ground User 100$ ended here==================================================================================================================

        await t.wait(3000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Print Check Limits")

        //===================================================Uncheck Print Check ended here==================================================================================================================
    });

    /* 
        1)Login Into Application 
        2)Deletion of Ground User
        3)Logout
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
        //==============================================================Deletion of Ground User started====================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strGroundUserFirstName + " " + strGroundUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Ground User ended===================================================================================

       

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();

    });


});


