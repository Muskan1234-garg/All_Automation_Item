import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Claimant from '../Functional_POM/POM_Claimant';

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Reserve_Utility = new POM_FinancialReserves();
const Payment_POM = new POM_PaymentsCollections();
const Claimant_POM = new POM_Claimant();

const DataIUT = require('../DataFiles/Smoke.json');
var faker = require('faker');
var StrClaimNumber;
var NoteText = 'CreateNote_' + faker.name.lastname;
var EditNoteText = 'ditNote_' + faker.name.lastname;

//Global Variable Declaration

DataIUT.forEach(data => {
    const LoggedInUser = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`Smoke1`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    });

    test('AssureClaims_GCCreation_Test_01', async t => {
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        //======Claim Creation Started Here=====================
        console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
        StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("New General Claim is Created with Claim Number: ".green + StrClaimNumber);
        //Claim Creation  completed      
    });

    test('EnhanceNoteCreateEditDelete_Test_02', async t => {
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=======================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        //=====================================================Claimant Creation On Created Claim Started Here=====================================================
        await Function_Utility.AssureClaims_EnhancedNotesCreateEditDelete_Utility("Create/Edit", NoteText, data.ExNoteType1, EditNoteText);
        //=======================================================Claimant Creation On Created Claim Completed Here ===========================================================   
    });

    test('ClaimantCreateEditDelete_Test_03', async t => {
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=======================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        //=====================================================Claimant Creation On Created Claim Started Here=====================================================
        console.log("AssureClaims_ClaimEventEntityAddition_Utility Function is Called To Create Claimant".yellow);
        await Function_Utility.AssureClaims_ClaimEventEntityAddition_Utility("Claimant", "Australia", "Victoria", "NA")
        console.log("Claimant is Created on Carrier Claims");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Tab_ClaimantAttorney, "Claimant Attorney Tab On Claimant Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Tab_Supplementals, "Supplementals Tab On Claimant Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Tab_ClaimantInfo, "Claimant Info Tab On Claimant Screen")
        //Verification That All Tabs Are Present For Claimant Screen
        console.log("AssureClaims_ClaimEventEntityEdit_Utility Function is Called To Edit The Created Claimant Tracking".yellow);
        var ClaimantLastName = await Function_Utility.AssureClaims_ClaimEventEntityEdit_Utility("Claimant", "NA", "NA", "NA");
        console.log("Created Claimant is Edited with New Last Name: ".green + ClaimantLastName);
        //Created Claimant Entity Is Edited Here
        await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Claimant Creation Screen", "", "");
        await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Claimant Creation Screen", "", "");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Claimant Creation Screen");
        //Created Claimant Entity Is Deleted Here
        //=======================================================Claimant Creation On Created Claim Completed Here ===========================================================   
    });

    test('ReserveCreation_Test_04', async t => {
        await t.wait(5000)
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=======================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        /*===========================================================New Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
        await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.ReserveAmount, data.ReserveStatus)
        //Reserve created
        /*===========================================================New Reserve Creation Is Completed Here========================================================================================================================================================================================================================================================================================================*/
    });

    test('CollectionCreation_Test_05', async t => {
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=======================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        /*===========================================================Collection Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
        await Function_Utility.AssureClaims_CollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, "NA", data.TransactionType, data.PaymentAmount)
        // Collection is Created 
        /*===========================================================Collection Creation Is Completed Here========================================================================================================================================================================================================================================================================================================*/
    });

    test('PaymentCreation_Test_06', async t => {
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=======================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        /*===========================================================Payment Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
        await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType, data.PaymentAmount);
        // Payment is Created
        /*===========================================================Payment Creation Is Completed Here========================================================================================================================================================================================================================================================================================================*/
    });

});






