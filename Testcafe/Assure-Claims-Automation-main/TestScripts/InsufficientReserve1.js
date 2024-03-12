import { Selector,Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_Home from '../Functional_POM/POM_Home';
import POM_SupervisoryApproval from '../Functional_POM/POM_SupervisoryApproval';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_GeneralClaimParameter  from '../Functional_POM/POM_GeneralClaimParameter';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'


const DataSTG = require('../DataFiles/DataAutoRegDSN_1.json');

const Home_POM = new POM_Home();
const GCP_POM =new POM_GeneralClaimParameter();
const Payment_POM = new POM_PaymentsCollections();
const SupervisoryApproval_POM=new POM_SupervisoryApproval();
const ConfigMgr_POM = new POM_Config_Manager();
const Verification_Msg = new POM_VerificationMessage();
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Reserve_Utility = new POM_FinancialReserves();



var strClaimNumber;


// ***************************************************************************************************************
//JIRA ID OF STORY   : RMA-90668, RMA-91093, RMA-98975
//Description        :1.Verify user is able to create any transaction greater than reserve amount if ‘Check for Insufficient Reserve Funds’ is OFF.
// Verify user is able to check setting ‘Check for Insufficient Reserve Funds’ is ON.
// Verify user is able to cancel add/set reserve pop-up.
// Verify user is able to set reserve with default value of insufficient amount
// Verify user is able to set the reserve value successfully with difference of reserve and transaction amount.
//AUTHOR             : Muskan garg
//DEPENDANCY         : NO
//PRE-REQUISITE      : None
//Preferred Env.    : None
// *******************************************************************************************************************

DataSTG.forEach(data => {
const ClaimZoneLogin = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
}, { preserveUrl: true }
);

const ConfigurationManagerLogin = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
}, { preserveUrl: true }
);

 fixture`InsufficientReserve1`.beforeEach(async t => {
    await t.wait(3000)
    await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
 });

 var strExpectedMessage=`The Amount for this Transaction that is to be applied to the Reserve ${data.InsufficientReserveType} Type is greater than the balance amount`;

/*
1) Create Claim
2) Create reserve of amount 15
3) Create payment above than reserve amount i.e. 40
4) Verify balance & status 
*/

//==========================Verify user is able to create any transaction greater than reserve amount if ‘Check for Insufficient Reserve Funds’ is OFF. Started here==================================================================
 test('AssureClaims_WithoutSettingCheck_InsufficientReserve_Test_01', async t => {
    
    //===================================================================Claim Creation Started Here==============================================================================================
    var d=await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d,d,data.ClaimStatus,data.GCClaimType,data.Department,data.GCPolicyLOB)
    console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:"+strClaimNumber)   
    //===================================================================Claim Creation Completeed Here==============================================================================================

    //===================================================================Reserve Creation Started Here==============================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.InSufficientReserve, data.ReserveStatus)
    //===================================================================Reserve Creation Started Here==============================================================================================

    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

    //===================================================================Payment Creation more than reserve amount Started Here==============================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection,"Select First Row")
    var strControlNumber= await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount,data.PayeeType,data.LastName,data.WorkTransactionType,data.InSufficientPayment);
    //===================================================================Payment Creation more than reserve amount completed Here==============================================================================================
  
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

    //===================================================================Verify amount on transaction screen Started Here==============================================================================================
    const ColHeader1=["Status","Balance"]
    const ColValue1=["O - Open","($25.00)"]
    await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve,data.ReserveType,"Enter Reserve Type")
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("O - Open","Financial grid view",ColHeader1,ColValue1)
    //===================================================================Verify amount on transaction screen completed Here==============================================================================================

});
//==========================Verify user is able to create any transaction greater than reserve amount if ‘Check for Insufficient Reserve Funds’ is OFF. completed here================================================================

/*
1)Turn on setting 'Check for Insufficient Reserve Funds' from config manager
*/
//==========================Verify user is able to check setting ‘Check for Insufficient Reserve Funds’ is ON. started here===========================================================================================================
test('AssureClaims_TurnOnConfigSetting_InsufficientReserve_Test_02', async t => {
            
    await t.setNativeDialogHandler(() => true).useRole(ConfigurationManagerLogin);
    console.log("Login Into Application!!".green)
    await t.wait(2000);

    //============================================================Setting ->Check for Insufficient Reserve Funds-> on->Started here================================================================================================ 
    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Reserve", "Main Configurations")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Chk_InsuffiecientReserve,"Check","Insufficient Reserve Funds")    
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
    await t.wait(4000);
    //============================================================ Setting ->Check for Insufficient Reserve Funds-> on->completed here================================================================================================

});
//==========================Verify user is able to check setting ‘Check for Insufficient Reserve Funds’ is ON. completed here=========================================================================================================


/*
1) Create Claim
2) Create reserve of amount 15
3) Create payment above than reserve amount i.e. 40
4) While saving the payment get a window of insufficent reserve, cancel it
5) Verify control number is not generated
*/

//==========================Verify user is able to cancel add/set reserve pop-up. started here========================================================================================================================================
test('AssureClaims_Cancel_InsufficientReserve_Test_03', async t => {
        
    //===================================================================Claim Creation Started Here==============================================================================================
    var d=await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d,d,data.ClaimStatus,data.GCClaimType,data.Department,data.GCPolicyLOB)
    console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:"+strClaimNumber)   
    //===================================================================Claim Creation Completeed Here==============================================================================================

    //===================================================================Reserve Creation Started Here==============================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.InSufficientReserve, data.ReserveStatus)
    //===================================================================Reserve Creation Started Here==============================================================================================

    await t.wait(3000)
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

    //===================================================================Payment Creation more than reserve amount Started Here==============================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection,"Select First Row")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment,"Make Payment Button On Payment Creation Screen")
    await t.wait(2000)
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount,data.BankAccount,"Bank Account On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType,"Payee Payor Type List On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType),"Payee Payor Type Value On Payment Creation Screen")
    await t.wait(3000)
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, data.LastName,"Last Name Text Box On Payment Creation Screen")
    await t.wait(3000)
    await t.pressKey('tab')
   
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds,"Add New Funds Button On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType,"Transaction Type List On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.WorkTransactionType),"Transaction Type Value On Funds Split Detail Screen")
   
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,data.InSufficientPayment,"Transaction Amount On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save,"Save Button On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Payment Creation Screen");
    await t.wait(3000)
    //===================================================================Payment Creation more than reserve amount completed Here==============================================================================================

    //===================================================================Click -> cancel ->new open Insufficient Reserves frame Started Here==============================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_CommentFrame,"Switch to new open Insufficient Reserves frame")  
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_Cancel,"Cancel button")
    //===================================================================Click -> cancel ->new open Insufficient Reserves frame completed Here==============================================================================================
           
    //===================================================================Verify Transaction is not created started here==============================================================================================
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    var strControlNumber =await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber,"value");
    console.log("Payment is not created hence controlNumber ="+strControlNumber +" is not genrated")
    //===================================================================Verify Transaction is not created completed here==============================================================================================

});
//==========================Verify user is able to cancel add/set reserve pop-up. completed here======================================================================================================================================


/*
1) Create Claim
2) Create reserve of amount 15
3) Create payment above than reserve amount i.e. 40
4) While saving the payment get a window of insufficent reserve, click on continue 
5) Verify transaction over reserve history screen
*/
//==========================Verify user is able to set reserve with default value of insufficient amount started here ==============================================================================================================================
test('AssureClaims_WithoutSetAnyValue_ClickContinue_InsufficientReserve_Test_04', async t => {


    //===================================================================Claim Creation Started Here==============================================================================================
    var d=await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d,d,data.ClaimStatus,data.GCClaimType,data.Department,data.GCPolicyLOB)
    console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:"+strClaimNumber)   
    //===================================================================Claim Creation Completeed Here==============================================================================================

    //===================================================================Reserve Creation Started Here==============================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.InSufficientReserve, data.ReserveStatus)
    //===================================================================Reserve Creation Started Here==============================================================================================

    await t.wait(3000)
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

    //===================================================================Payment Creation more than reserve amount Started Here==============================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection,"Select First Row")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment,"Make Payment Button On Payment Creation Screen")
    await t.wait(2000)
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount,data.BankAccount,"Bank Account On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType,"Payee Payor Type List On Payment Creation Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType),"Payee Payor Type Value On Payment Creation Screen")
   await t.wait(3000)
   await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, data.LastName,"Last Name Text Box On Payment Creation Screen")
   await t.wait(3000)
   await t.pressKey('tab')
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Payment Creation Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds,"Add New Funds Button On Payment Creation Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType,"Transaction Type List On Funds Split Detail Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.WorkTransactionType),"Transaction Type Value On Funds Split Detail Screen")
   await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,data.InSufficientPayment,"Transaction Amount On Funds Split Detail Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save,"Save Button On Funds Split Detail Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Payment Creation Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Payment Creation Screen");
   await t.wait(3000)
  //===================================================================Payment Creation more than reserve amount completed Here==============================================================================================


   //===================================================================Click on->Continue button with default amount on new open Insufficient Reserves frame Started Here==============================================================================================
   await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_CommentFrame,"Switch to new open Insufficient Reserves frame")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Btn_Continue,"Continue Button")
   await t.wait(7000)       
   await t.switchToMainWindow();
   await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    //===================================================================Click on->Continue button with default amount on new open Insufficient Reserves frame completed Here==============================================================================================

   var strControlNumber =await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber,"value");
   
   //===================================================================Verify values over reserve history screen started Here==============================================================================================
   await t.switchToMainWindow();
   await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
   await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
   await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection,"Select First Row")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Btn_ReserveHistory,"Reserve History Button")
   await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
   var iAmount=await Generic_Utility.AssureClaims_FormatANumber_Utility(data.InSufficientReserve);
   const ColHeader1=["Reserve Amount"]
   const ColValue1=[iAmount]
   await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_InsufficientReserveOn_ReserHistory_Txt_ReserveAmount,data.InSufficientReserve,"Reserve Amount")
   await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(iAmount,"Reserve History Screen",ColHeader1,ColValue1)
   //===================================================================Verify values over reserve history screen completed Here==============================================================================================

});
//==========================Verify user is able to set reserve with default value of insufficient amount completed here==============================================================================================================================

/*
1) Create Claim
2) Create reserve of amount 15
3) Create payment above than reserve amount i.e. 40
4) While saving the payment get a window of insufficent reserve,Verify values of reserve & payment before set the payment
5) set the payment 
6) Verify values of reserve & payment after set the payment
7) Verify values over reserve history screen
*/
//=========================Verify user is able to set the reserve value successfully with difference of reserve and transaction amount. started here=================================================================================================
test('AssureClaims_Set_InsufficientReserve_Test_05', async t => {
        
 
    //===================================================================Claim Creation Started Here==============================================================================================
    var d=await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d,d,data.ClaimStatus,data.GCClaimType,data.Department,data.GCPolicyLOB)
    console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:"+strClaimNumber)   
    //===================================================================Claim Creation Completeed Here==============================================================================================

    //===================================================================Reserve Creation Started Here==============================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.InSufficientReserve, data.ReserveStatus)
    //===================================================================Reserve Creation Started Here==============================================================================================

    
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

    //===================================================================Payment Creation more than reserve amount Started Here==============================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection,"Select First Row")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment,"Make Payment Button On Payment Creation Screen")
    await t.wait(2000)
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount,data.BankAccount,"Bank Account On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType,"Payee Payor Type List On Payment Creation Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType),"Payee Payor Type Value On Payment Creation Screen")
   await t.wait(3000)
   await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, data.LastName,"Last Name Text Box On Payment Creation Screen")
   await t.wait(3000)
   await t.pressKey('tab')
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Payment Creation Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds,"Add New Funds Button On Payment Creation Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType,"Transaction Type List On Funds Split Detail Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.WorkTransactionType),"Transaction Type Value On Funds Split Detail Screen")
   await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,data.InSufficientPayment,"Transaction Amount On Funds Split Detail Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save,"Save Button On Funds Split Detail Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Payment Creation Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Payment Creation Screen");
  //===================================================================Payment Creation more than reserve amount completed Here==============================================================================================

   //===================================================================Verify Insufficient reserve message started  Here==============================================================================================
   await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_CommentFrame,"Switch to new open Insufficient Reserves frame")
   await Verify_Utility.AssureClaims_ElementExist_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_VerifyMsg, "Insufficient Reserve Msg");
   var strActualInsufficientMsg=await Reserve_Utility.AssureClaims_InsufficientReserve_VerifyMsg.innerText;
   if(strActualInsufficientMsg===strExpectedMessage)
   {
    console.log("Verification Of Existence For ".green+strActualInsufficientMsg.yellow +" is successful".green);
   }
   else
   {
    console.log("Verification Of Existence For "+strActualInsufficientMsg +" is not successful");   
   }
   //===================================================================Verify Insufficient reserve message completed Here==============================================================================================

   //===================================================================Verify Current reserve before set any value started Here==============================================================================================
   var iCurrentReserveBeforeSet =await Verify_Utility.AssureClaims_AttributeFetch_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Txt_ReserveAmount,"value");
   if(iCurrentReserveBeforeSet===data.InSufficientPayment)
   {
       console.log("Before setting the insufficient reserve reserve amount is".green+iCurrentReserveBeforeSet.yellow+"Heance verification successful".green)
   }
   else
   {
    console.log("Before setting the insufficient reserve reserve amount is".red+iCurrentReserveBeforeSet.yellow+"Heance verification is not successful".red)
   }
   //===================================================================Verify Current reserve before set any value completed Here==============================================================================================

    //===================================================================Verify Current payment before set any value started Here==============================================================================================
   var iCurrentPaymentBeforeSet =await Verify_Utility.AssureClaims_AttributeFetch_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Txt_PaymentAmount,"value");
   var iActualPayment=(data.InSufficientPayment-data.InSufficientReserve)
   console.log("iActualPayment : "+iActualPayment)
   console.log("iCurrentPaymentBeforeSet :"+iCurrentPaymentBeforeSet)
   if(iCurrentPaymentBeforeSet==iActualPayment)
   {
       console.log("Before setting the insufficient reserve reserve amount is ".green+iCurrentPaymentBeforeSet.yellow+"Heance verification successful".green)
   }
   else
   {
    console.log("Before setting the insufficient reserve reserve amount is ".red+iCurrentPaymentBeforeSet.yellow+"Heance verification is not successful".red)
   }
   //===================================================================Verify Current payment before set any value completed Here==============================================================================================
   await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Btn_SetReserve,"Set the reserve")
   await t.wait(4000)

   //===================================================================Verify Current payment After set value started Here==============================================================================================
   var iCurrentPaymentAfterSet =await Verify_Utility.AssureClaims_AttributeFetch_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Txt_PaymentAmount,"value");
   if(iCurrentPaymentAfterSet==='0')
   {
       console.log("After setting the insufficient reserve reserve amount is".green+iCurrentPaymentAfterSet.yellow+"Heance verification successful".green)
   }
   else
   {
    console.log("After setting the insufficient reserve reserve amount is".red+iCurrentPaymentAfterSet.yellow+"Heance verification is not successful".red)
   }
    //===================================================================Verify payment reserve after set value completed Here==============================================================================================

     //===================================================================Click on continue and verify payment is created started Here==============================================================================================
   await t.wait(4000)
   await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Btn_Continue,"Continue Button")
   await t.wait(7000)     
   await t.switchToMainWindow();
   await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
   var strControlNumber =await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber,"value");
   //===================================================================Click on continue and verify payment is created completed Here==============================================================================================
     
   await t.switchToMainWindow();
   await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
   await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

   //===================================================================Verify data on reserve history screen started Here==============================================================================================
   await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection,"Select First Row")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Btn_ReserveHistory,"Reserve History Button")
   await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
   var iAmount=await Generic_Utility.AssureClaims_FormatANumber_Utility(data.InSufficientPayment);
   const ColHeader1=["Reserve Amount","Reason"]
   const ColValue1=[iAmount,"Insuff. Reserves"]
   await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_InsufficientReserveOn_ReserHistory_Txt_ReserveAmount,data.InSufficientPayment,"Reserve Amount")
   await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(iAmount,"Reserve History Screen",ColHeader1,ColValue1)
   //===================================================================Verify data on reserve history screen completed Here==============================================================================================
});
//=========================Verify user is able to set the reserve value successfully with difference of reserve and transaction amount. completed here===============================================================================================

/*
1) Create Claim
2) Create reserve of amount 15
3) Create payment above than reserve amount i.e. 40
4) While saving the payment get a window of insufficent reserve,Verify values of reserve & payment before add the payment
5) add the payment 
6) Verify values of reserve & payment after add the payment
7) Verify values over reserve history screen
*/
//=========================Verify user is able to add the reserve value successfully with difference of reserve and transaction amount. started here==================================================================================================
test('AssureClaims_ADD_InsufficientReserve_Test_06', async t => {
        

    //===================================================================Claim Creation Started Here==============================================================================================
    var d=await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d,d,data.ClaimStatus,data.GCClaimType,data.Department,data.GCPolicyLOB)
    console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:"+strClaimNumber)   
    //===================================================================Claim Creation Completeed Here==============================================================================================

    //===================================================================Reserve Creation Started Here==============================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.InSufficientReserve, data.ReserveStatus)
    //===================================================================Reserve Creation Started Here==============================================================================================

    
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

    //===================================================================Payment Creation more than reserve amount Started Here==============================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection,"Select First Row")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment,"Make Payment Button On Payment Creation Screen")
    await t.wait(2000)
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount,data.BankAccount,"Bank Account On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType,"Payee Payor Type List On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType),"Payee Payor Type Value On Payment Creation Screen")
    await t.wait(3000)
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, data.LastName,"Last Name Text Box On Payment Creation Screen")
    await t.wait(3000)
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds,"Add New Funds Button On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType,"Transaction Type List On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.WorkTransactionType),"Transaction Type Value On Funds Split Detail Screen")
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,data.InSufficientPayment,"Transaction Amount On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save,"Save Button On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Payment Creation Screen");
    //===================================================================Payment Creation more than reserve amount completed Here==============================================================================================

    //===================================================================Verify Insufficient reserve message started  Here==============================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_CommentFrame,"Switch to new open Insufficient Reserves frame")
    await Verify_Utility.AssureClaims_ElementExist_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_VerifyMsg, "Insufficient Reserve Msg");
    var strActualInsufficientMsg=await Reserve_Utility.AssureClaims_InsufficientReserve_VerifyMsg.innerText;
    console.log("strActualInsufficientMsg :"+strActualInsufficientMsg);
    if(strActualInsufficientMsg===strExpectedMessage)
    {
    console.log("Verification Of Existence For ".green+strActualInsufficientMsg.yellow +" is successful".green);
    }
    else
    {
    console.log("Verification Of Existence For "+strActualInsufficientMsg +" is not successful");   
    }
    //===================================================================Verify Insufficient reserve message completed  Here==============================================================================================

   //===================================================================Verify Current reserve before set any value started Here==============================================================================================
   var iCurrentReserveBeforeSet =await Verify_Utility.AssureClaims_AttributeFetch_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Txt_ReserveAmount,"value");
   if(iCurrentReserveBeforeSet===data.InSufficientPayment)
   {
       console.log("Before setting the insufficient reserve reserve amount is".green+iCurrentReserveBeforeSet.yellow+"Heance verification successful".green)
   }
   else
   {
    console.log("Before setting the insufficient reserve reserve amount is".red+iCurrentReserveBeforeSet.yellow+"Heance verification is not successful".red)
   }
   //===================================================================Verify Current reserve before set any value completed Here==============================================================================================

   //===================================================================Verify Current payment before set any value started Here==============================================================================================
   var iCurrentPaymentBeforeSet =await Verify_Utility.AssureClaims_AttributeFetch_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Txt_PaymentAmount,"value");
   var iActualPayment=(data.InSufficientPayment-data.InSufficientReserve)
   if(iCurrentPaymentBeforeSet==iActualPayment)
   {
       console.log("Before setting the insufficient reserve reserve amount is".green+iCurrentPaymentBeforeSet.yellow+"Heance verification successful".green)
   }
   else
   {
    console.log("Before setting the insufficient reserve reserve amount is".red+iCurrentPaymentBeforeSet.yellow+"Heance verification is not successful".red)
   }
   //===================================================================Verify Current payment before set any value completed Here==============================================================================================
   
   //===================================================================Verify Current payment After set value started Here==============================================================================================
   await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Btn_AddReserve,"Add the reserve")
   var iCurrentPaymentAfterSet =await Verify_Utility.AssureClaims_AttributeFetch_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Txt_PaymentAmount,"value");
   if(iCurrentPaymentAfterSet==='0')
   {
       console.log("After setting the insufficient reserve  amount is".green+iCurrentPaymentAfterSet.yellow+"Heance verification successful".green)
   }
   else
   {
    console.log("After setting the insufficient reserve  amount is".red+iCurrentPaymentAfterSet.yellow+"Heance verification is not successful".red)
   }
   //===================================================================Verify Current payment After set value completed Here==============================================================================================

   //===================================================================Click on continue and verify payment is created started Here==============================================================================================
   await t.wait(6000) 
   await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Btn_Continue,"Continue Button")
   await t.wait(6000)    
   await t.switchToMainWindow();
   await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
   var strControlNumber =await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber,"value");
   console.log("Transaction is Created with control Number"+strControlNumber);
   //===================================================================Click on continue and verify payment is created completed Here==============================================================================================
     
   await t.switchToMainWindow();
   await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
   await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

    //===================================================================Verify data on reserve history screen started Here==============================================================================================
   await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection,"Select First Row")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Btn_ReserveHistory,"Reserve History Button")
   await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
   var iAmount=await Generic_Utility.AssureClaims_FormatANumber_Utility(data.InSufficientPayment);
   const ColHeader1=["Reserve Amount","Reason"]
   const ColValue1=[iAmount,"Insuff. Reserves"]
   await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_InsufficientReserveOn_ReserHistory_Txt_ReserveAmount,data.InSufficientPayment,"Reserve Amount")
   await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(iAmount,"Reserve History Screen",ColHeader1,ColValue1)
    //===================================================================Verify data on reserve history screen completed Here==============================================================================================


});
//=========================Verify user is able to add the reserve value successfully with difference of reserve and transaction amount.===============================================================================================================


/*
1)Turn on setting 'Do Not Allow Negative Reserve Adjustments' from config manager
*/
//=========================Verify user is able to check setting ‘Do Not Allow Negative Reserve Adjustments’ is ON. started here==========================================================================================================================
test('AssureClaims_TurnOnConfigSettingNotAllowNegativeReserve_InsufficientReserve_Test_07', async t => {
            
    await t.setNativeDialogHandler(() => true).useRole(ConfigurationManagerLogin);
    console.log("Login Into Application!!".green)
    await t.wait(2000);

    //============================================================Setting ->Check for Insufficient Reserve Funds-> on->Started here================================================================================================ 
    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Reserve", "Main Configurations")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Chk_DoNotAllowNegativeReserve,"Check","Do Not Allow Negative Reserve Adjustments")    
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
    await t.wait(4000);
    //============================================================ Setting ->Check for Insufficient Reserve Funds-> on->completed here================================================================================================
});
//=========================Verify user is able to check setting ‘Do Not Allow Negative Reserve Adjustments’ is ON. completed here=============================================================================================================================


/*
1) Create Claim
2) Create reserve of amount 15
3) Create payment above than reserve amount i.e. 40
4) Verify payment can not be cretaed, getting msg 'There are insufficient reserves for this payment'
*/
//=========================Verify user is unable to create transaction if ‘Do Not Allow Negative Reserve Adjustments’ is ON & ‘Check for Insufficient Reserve Funds’ is ON started here=======================================================================
test('AssureClaims_PaymentNotCreated_InsufficientReserve_Test_08', async t => {
        

    //===================================================================Claim Creation Started Here==============================================================================================
    var d=await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d,d,data.ClaimStatus,data.GCClaimType,data.Department,data.GCPolicyLOB)
    console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:"+strClaimNumber)   
    //===================================================================Claim Creation Completeed Here==============================================================================================

    //===================================================================Reserve Creation Started Here==============================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.InSufficientReserve, data.ReserveStatus)
    //===================================================================Reserve Creation Started Here==============================================================================================

    //==================================================================create payment and verify user is not able to create payment started here====================================================
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection,"Select First Row")

    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment,"Make Payment Button On Payment Creation Screen")
    await t.wait(2000)
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount,data.BankAccount,"Bank Account On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType,"Payee Payor Type List On Payment Creation Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType),"Payee Payor Type Value On Payment Creation Screen")
   await t.wait(3000)
   await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, data.LastName,"Last Name Text Box On Payment Creation Screen")
   await t.wait(3000)
   await t.pressKey('tab')
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Payment Creation Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds,"Add New Funds Button On Payment Creation Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType,"Transaction Type List On Funds Split Detail Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.WorkTransactionType),"Transaction Type Value On Funds Split Detail Screen")
   await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,data.InSufficientPayment,"Transaction Amount On Funds Split Detail Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save,"Save Button On Funds Split Detail Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Payment Creation Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Payment Creation Screen");
   var SaveMessageVerification="There are insufficient reserves for this payment.";
   await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(SaveMessageVerification,true,"Payment can not be created")
       //==================================================================create payment and verify user is not able to create payment completed here====================================================

});
//=========================Verify user is unable to create transaction if ‘Do Not Allow Negative Reserve Adjustments’ is ON & ‘Check for Insufficient Reserve Funds’ is ON completed here=====================================================================

/*
1)Turn off setting 'Do Not Allow Negative Reserve Adjustments' from config manager
*/
//=========================Verify user is able to Uncheck setting ‘Do Not Allow Negative Reserve Adjustments’ started here==========================================================================================================================
test('AssureClaims_TurnOffConfigSettingNotAllowNegativeReserve_InsufficientReserve_Test_09', async t => {
            
  await t.setNativeDialogHandler(() => true).useRole(ConfigurationManagerLogin);
  console.log("Login Into Application!!".green)
  await t.wait(2000);

  //============================================================Setting ->Check for Insufficient Reserve Funds-> on->Started here================================================================================================
  await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Reserve", "Main Configurations")
  await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Chk_DoNotAllowNegativeReserve,"UnCheck","Do Not Allow Negative Reserve Adjustments")    
  await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
  await t.wait(4000);
  //============================================================ Setting ->Check for Insufficient Reserve Funds-> on->completed here================================================================================================
});
//=========================Verify user is able to Uncheck setting ‘Do Not Allow Negative Reserve Adjustments’ completed here=============================================================================================================================

})

