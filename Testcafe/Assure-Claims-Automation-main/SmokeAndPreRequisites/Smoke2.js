import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors';


import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';

const DataIUT = require('../DataFiles/Smoke.json');

const Function_Utility = new Functionality_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Nav_Utility = new Navigation_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Payment_POM = new POM_PaymentsCollections();
const Reserve_Utility = new POM_FinancialReserves();


var faker = require('faker');

//global variables
var StrClaimNumber;

DataIUT.forEach(data => {
    const LoggedInUser = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        //Login into Claims zone
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`Smoke2`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    });

    test('CarrierGCClaimCreation_Test_01', async t => {

        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        console.log("AssureClaims_CarrierGCClaimCreation Function is Called To Create Carrier Claim".yellow);
        StrClaimNumber = await Function_Utility.AssureClaims_CarrierGCClaimCreation(d, d, data.GCCarrierClaimType1, data.ClaimStatus, data.Department, data.GCCarrierPolicyLOB, data.PolicySystem, data.PolicyName)
        console.log("New Carrier General Claim is Created with Claim Number: ".green + StrClaimNumber);
    });

    test('CarrierReserveAddition_Test_02', async t => {
        //Search the created carrier claims
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await t.wait(3000);
        await t.switchToMainWindow();
        await t.wait(1000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        console.log("AssureClaims_CarrierReserveAddition_Utility Function is Called To Create Carrier Reserve".yellow);
        //await Function_Utility.AssureClaims_CarrierReserveAddition_Utility(data.AmountType,data.PolicyCoverage,data.PolicyLossCode,data.PolicyUnit,data.ReserveStatus,data.ReserveType)
        await Function_Utility.AssureClaims_UpdatedCarrierReserveAddition_Utility(1, 1, 1, data.ReserveType, data.AmountType, data.ReserveStatus)
        console.log("New Carrier Reserve is Created".green);
    });

    test('CarrierPaymentAddition_Test_03', async t => {
        //Search the created carrier claims
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Check Button")
        console.log("AssureClaims_CarrierPaymentAddition_Utility Function is Called To Create Carrier Payment".yellow);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
        await Function_Utility.AssureClaims_CarrierCollectionPaymentAddition_Utility(data.BankAccount, data.PayeeTypeClaimant, data.TransactionType, data.Amount, data.PolicyUnit, data.PolicyCoverage, data.PolicyLossCode1)
        console.log("New Carrier Payment is Created".green);
    });

    test('CarrierCollectionAddition_Test_04', async t => {
        //Search the created carrier claims
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Check Button")
        console.log("AssureClaims_CarrierCollectionPaymentAddition_Utility Function is Called To Create Carrier Payment".yellow);
        // Carrier Collection starts
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_AddCollection, "Add collection Button On Payment Creation Screen")
        await Function_Utility.AssureClaims_CarrierCollectionPaymentAddition_Utility(data.BankAccount, data.PayeeTypeClaimant, data.TransactionType, data.Amount, data.PolicyUnit, data.PolicyCoverage, data.PolicyLossCode1)
        console.log("New Carrier Payment is Created".green);
    });


});



