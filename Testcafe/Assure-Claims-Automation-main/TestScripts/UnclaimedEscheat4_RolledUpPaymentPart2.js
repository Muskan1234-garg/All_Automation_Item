import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_Home from '../Functional_POM/POM_Home';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Search from '../Functional_POM/POM_Search';
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';
import { StrClaimNumber } from './UnclaimedEscheat_RolledUpPayment_ExportedVariables';

const DataIUT = require('../DataFiles/DataAutoRegDSN_1.json');
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Payment_POM = new POM_PaymentsCollections();
const Home_POM = new POM_Home();
const Search_POM = new POM_Search();
const Generic_Claims = new POM_Generic_Claims();

//******************************************************************************************************************************//
//JIRA ID OF STORY : RMA-94580,RMA-94320, RMA-99408
//Description : Verify that If the payment is part of a rolled up check all payments in the rolled up check are marked as unclaimed
//Verify that If the payment is part of a rolled up check all payments in the rolled up check are marked as Escheat
//AUTHOR : Muskan Garg
//DEPENDANCY : Run this UnclaimedAndEscheatRolledUpPayment_Part1.js 
//PRE-REQUISITE : NONE
//Preferred Server: 194 Automation DSN1 
//******************************************************************************************************************************//

DataIUT.forEach(data => {
    const LoggedInUser = Role(data.URL, async t => {
        await t.wait(3000)
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`UnclaimedEscheat4_RolledUpPaymentPart2 `.beforeEach(async t => {
        await t.wait(3000)
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    });


    test('PrintCheckOverPrintCheckBatchScreen_Test_01', async t => {

        //========================================Funds->Print Checks-->Print check Batch,print the check started here==============================================================================================================
        var d = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -8, "MM/DD/YYYY")
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Print Checks")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_printCheckIframe);
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_PrintCheck_Tab_PrintCheckBatch, "Print Check Batch")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheckBatch_Lst_BankAccount, data.BankAccount, "Select Bank Account")
        await t.wait(10000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheckBatch_Lst_BankAccount, data.BankAccount, "Bank Account")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheckBatch_Lst_DistributionType, data.DistributionType, "Distribution Type")
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PrintCheckBatch_Txt_CheckDate, d, "Check Date")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_PrintCheckBatch_Btn_PrintButton, "Print button")
        await t.wait(13000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ChecksAndEOBReports_Btn_OkButton, "Ok button on Checks And EOB Reports screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PrintedCheckRange_Btn_OkButton, "Ok button on Printed check range screen");
        //========================================Funds->Print Checks-->Print check Batch,print the check completed here==============================================================================================================

    });


    test('VerifyTrasactionOverTransactionHistoryScreen_Test_02', async t => {

        //======================================================Claim search started here===================================================================================================================
        await t.wait(10000)
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Claim search started completed here=========================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction history")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Externalapp_frame)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_TransactionHistory_Lnk_ControlNumber.nth(0), "Control number link")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0)
        var checkNumber_Cntrl1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, "value");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus, data.FundsDormancyStatus_Unclaimed, "Dormancy Status")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        //========================================Goto the first transaction & Change Dormancy as Unclaimed ended here==============================================================================================================

        //=====================================Verify ---> Check  Status -->is Printed for first transaction Started here=================================================================================================================
        const actualValue_FirstTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus);
        const expectedValue_FirstTransaction = "P Printed";
        if (expectedValue_FirstTransaction === actualValue_FirstTransaction) {
            console.log(expectedValue_FirstTransaction.green + " is matched with ".yellow + " " + actualValue_FirstTransaction.green + " Hence verification successful".green);
        }
        else {
            console.log(expectedValue_FirstTransaction.red + " is matched with ".red + " " + actualValue_FirstTransaction.red + " Hence verification is not successful".red);
        }
        //=====================================Verify ---> Check  Status -->is Printed for first transaction ended here===================================================================================================================================

        //========================================Goto the Seconds transaction & take the check number started here==============================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction history")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Externalapp_frame)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_TransactionHistory_Lnk_ControlNumber.nth(1), "Control number 2 link")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0)
        var checkNumber_Cntrl2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, "value");
        //========================================Goto the Seconds transaction & take the check number ended here==============================================================================================================

        //=====================================Verify ---> Check  Status -->is Printed for second transaction Started here=================================================================================================================
        const actualValue_SecondTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus);
        const expectedValue_SecondTransaction = "P Printed";
        if (expectedValue_SecondTransaction === actualValue_SecondTransaction) {
            console.log(expectedValue_SecondTransaction.green + " is matched with ".yellow + " " + actualValue_SecondTransaction.green + " Hence verification successful".green);
        }
        else {
            console.log(expectedValue_SecondTransaction.red + " is matched with ".red + " " + actualValue_SecondTransaction.red + " Hence verification is not successful".red);
        }
        //=====================================Verify ---> Check  Status -->is Printed for second transaction ended here===================================================================================================================================

        //=====================================Verify check number should be same for both transaction started here===================================================================================================================================
        if (checkNumber_Cntrl1 === checkNumber_Cntrl2) {
            console.log(checkNumber_Cntrl1.green + " is matched with ".yellow + " " + checkNumber_Cntrl2.green + " Hence verification successful".green);
        }
        else {
            console.log(checkNumber_Cntrl1.red + " is matched with ".red + " " + checkNumber_Cntrl2.red + " Hence verification is not successful".red);
        }
        //=====================================Verify check number should be same for both transaction ended here===================================================================================================================================    

        //=======Verify when we change dormancy status as Unclaimed for first transaction,for 2nd transaction dormancy status will automatically changed -->block due to RMA-95038 started here===================================================================================================================================
//         var ActualDormancyStatus_UnClaimed =await Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withAttribute('selected').innerText;
//         var ExpectedDormancyStatus_Unclaimed=data.FundsDormancyStatus_Unclaimed;
//         if(ActualDormancyStatus_UnClaimed===ExpectedDormancyStatus_Unclaimed)
//         console.log(ExpectedDormancyStatus_Unclaimed.green+" is matched with ".yellow +" "+ActualDormancyStatus_UnClaimed.green+" Hence verification successful".green)
//         else
//         console.log(ExpectedDormancyStatus_Unclaimed.red+" is matched with ".red +" "+ActualDormancyStatus_UnClaimed.red+" Hence verification is not successful".red)
        //=======Verify when we change dormancy status as Unclaimed for first transaction,for 2nd transaction dormancy status will automatically changed -->block due to RMA-95038 ended here===================================================================================================================================

        //========================================Goto the first transaction & Change Dormancy as Escheat started here==============================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction history")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Externalapp_frame)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_TransactionHistory_Lnk_ControlNumber.nth(0), "Control number 2 link")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus, data.FundsDormancyStatus_Escheat, "Dormancy Status")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        //========================================Goto the first transaction & Change Dormancy as Escheat ended here==============================================================================================================

        //========================================Goto the first transaction & Change Dormancy as Escheat started here==============================================================================================================

        //=======Verify when we change dormancy status as Escheat for first transaction,for 2nd transaction dormancy status will automatically changed -->block due to RMA-95038 started here===================================================================================================================================
//         await t.switchToMainWindow();
//         await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
//         await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
//         await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction history")
//         await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Externalapp_frame)
//         await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_TransactionHistory_Lnk_ControlNumber.nth(1), "Control number 2 link")
//         await t.switchToMainWindow()
//         await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0)
//         var ActualDormancyStatus_Escheat =await Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withAttribute('selected').innerText;
//         var ExpectedDormancyStatus_Escheat=data.FundsDormancyStatus_Escheat;
//         if(ActualDormancyStatus_Escheat===ExpectedDormancyStatus_Escheat)
//         console.log(ExpectedDormancyStatus_Escheat.green+"is matched with".yellow +" "+ActualDormancyStatus_Escheat.green+"Hence verification successful".green)
//         else
//         console.log(ExpectedDormancyStatus_Escheat.red+"is matched with".red +" "+ActualDormancyStatus_Escheat.red+"Hence verification is not successful".red)
        //=======Verify when we change dormancy status as Escheat for first transaction,for 2nd transaction dormancy status will automatically changed -->block due to RMA-95038 ended here===================================================================================================================================

    });
 
});

