import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_UserPrivilegesSetUp from '../Functional_POM/POM_UserPrivilegesSetUp';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_SupervisoryApproval from '../Functional_POM/POM_SupervisoryApproval';
import POM_PaymentsCollections from "../Functional_POM/POM_PaymentsCollections";
import POM_ClearCheack from "../Functional_POM/POM_ClearCheack";
import {groundUser} from './PerPayclaimUsers'

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const Verify_Utility = new Verification_Utility();
const In_Utility = new Input_Utility();
const SupervisoryApproval_POM=new POM_SupervisoryApproval();
const ClearCheack_POM = new POM_ClearCheack();
const Payment_POM = new POM_PaymentsCollections();


// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-99695
//Description      : Per Claim Pay Limits Are Exceeded
//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : None
/* PRE-REQUISITES  : Run PerClaimPayLimits1_ConfigurationManagerSetting.js
                     "ReserveType": "E Expense" should be added in Data Json.
*/
//Preferred Server : 194AutoReg, DSN : RM202REG_Test2
// *******************************************************************************************************************************
//Global Variable Declaration
var StrClaimNumber;


DataIUT.forEach(data => {
  fixture`PerClaimPayLimits2_ExceedingTransaction`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });
  /* Steps performed by AssureClaims_UserPrivilegeSetup_Test_01 :
     1. Login to Assure claims > Securities > user privilege setup
     2. Select LOB > General claim
     3. Select Limit type >Per Claim Pay limit > enable Per Claim Pay Limit
     4. Select the ground user > add reserve type, amount and claim type and Click on add
     5. Logout
 */
  test('AssureClaims_UserPrivilegeSetup_Test_01', async t => {
    //==============================================================Login to Assure claims > Securities > user privilege setup started==================================================================

    await t.wait(10000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
    await t.wait(10000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
    //==============================================================Login to Assure claims > Securities > user privilege setup ended==================================================================
    //==============================================================Select LOB > General claim started==================================================================
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, "Policy LOB")
    await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB.find('option').withText('GC - General Claims'), "Select LOB")
    //==============================================================Select LOB > General claim ended==================================================================
    //==============================================================Select Limit type > Per Claim Pay Limits > enable Per Claim Pay Limits started==================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, "LimitType")
    await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType.find('option').withText('Per Claim Pay Limits'), "Select Limit Type")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "Check", "Checked Enable Per Claim Pay Limits")
    await t.wait(7000);
    //==============================================================Select Limit type > Per Claim Pay Limits > enable Per Claim Pay Limits ended==================================================================
    //==============================================================Select the ground user > add reserve type, amount and claim type and Click on add started==================================================================
    await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, groundUser, "Ground User")
    await t.pressKey('tab');
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Lst_ReserveType, data.ReserveType, "Reserve Type")
    await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, data.DepositAmount, "Ground User")
    await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_ClaimType, data.GCClaimType, "Claim Type")
    await t.pressKey('tab');
    await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
    //==============================================================Select the ground user > add reserve type, amount and claim type and Click on add ended==================================================================
    await t.wait(3000)
    //===================================== Logout ====================================================================================================================
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
  });

  /* Steps performed by AssureClaims_GCClaimCreationAndPaymentCreation_Test_02 :
      1. Login Into Application with Ground User
      2. Corporate GC Creation
      3. Reserve Creation
      4. Two Payments Creation
      5. Payment hold Verification for second payment 
  */
  test('AssureClaims_GCClaimCreationAndPaymentCreation_Test_02', async t => {

    //==============================================================Login Into Application with User started==================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(groundUser, "abkabk1", data.DSN, 'Claims')
    //=============================================================Login Into Application with User ended=========================================================================

    let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
      "MM/DD/yyyy"
    );
    //=====================================Corporate GC  Creation started here===================================================================================================================================
    StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(
      d,
      d,
      data.ClaimStatus,
      data.GCClaimType,
      data.Department,
      data.GCPolicyLOB
    );
    console.log(
      "New Cooperate General Claim is Created with Claim Number: ".green +
      StrClaimNumber
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
    //=====================================First Payment Creation started here===================================================================================================================================

    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
      data.BankAccount,
      data.PayeeType,
      data.LastName,
      data.TransactionType,
      data.Amount
    );
    //=====================================First Payment Creation completed here===================================================================================================================================
    await t.wait(2000);
    await t.switchToMainWindow();
    await t.wait(3000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
      "back after first payment creation"
    );
    await t.wait(10000);

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow,
      "grid button"
    );
    await t.wait(3000);
    //=====================================Second Payment Creation started here===================================================================================================================================
    
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
      data.BankAccount,
      data.PayeeType,
      data.LastName,
      data.TransactionType,
      data.Amount1
      );
      //=====================================Second Payment Creation completed here===================================================================================================================================
    //====================================================Verification of toast message started============================================================================
    var SaveMessageVerification0 = `A hold requiring supervisory approval has been placed on this payment because Exceeded Per Claim Payment Limit.You do not have authority to pay more than $100.00 per claim for reserve type Expense.`;
    await t.wait(3000);
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
      SaveMessageVerification0,     
      true,
      "Verification for payment on hold"
      );
      //====================================================Verification of toast message ended============================================================================
      
      //=================================================Verification of check status -> hold,  started===================================================================================
      await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusHold, "CheckStatus TextBox");
      await t.switchToMainWindow()
      // ==============================Go to my work> My Pending Transaction for ground user>Select payment tab started========================================
      await Nav_Utility.AssureClaims_MenuOptionClick_Utility("My Work:My Pending Transactions");
      await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PendingTransIframe)
      // ==============================Go to my work> My Pending Transaction for ground user>Select payment tab completed========================================
      await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment,"Payment Tab")
      await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_txt_ClaimNumber,StrClaimNumber,"Claim Number")
      const ColHeader1=["Claim Number"]
      const ColValue1=[StrClaimNumber]
      await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(StrClaimNumber,"Pending Payments Tab View",ColHeader1,ColValue1)
      //=================================================Verification of check status -> hold,  ended===================================================================================
  });
});

