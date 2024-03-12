import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility_Sec_Exh from '../Functional_Utilities/Functionality_Utility_Sec_Exh';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Claimant from '../Functional_POM/POM_Claimant';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_Litigation from '../Functional_POM/POM_Litigation';
import POM_Arbitration from '../Functional_POM/POM_Arbitration';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Subrogation from '../Functional_POM/POM_Subrogation';
import POM_Defendant from '../Functional_POM/POM_Defendant';
import POM_Adjuster from '../Functional_POM/POM_Adjuster';
import Input_Utility from '../Functional_Utilities/Input_Utility';
const DataIUT = require('../DataFiles/DataIUTSQL_ExhSmoke.json');
//====================================Client Function Import Statement Starts Here==========================================================
import { ClientFunction } from 'testcafe';
//====================================Client Function Import Statement Starts Here==========================================================

const Adjuster_POM = new POM_Adjuster();
const Function_Utility = new Functionality_Utility_Sec_Exh();
const Generic_Utility = new GenericUsages_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Payment_POM = new POM_PaymentsCollections();
const Reserve_Utility = new POM_FinancialReserves();
const Claimant_POM = new POM_Claimant();
const Maint_Utility = new Maintenance_Functionality_Utility();
const Arbitration_POM = new POM_Arbitration();
const Litigation_POM = new POM_Litigation();
const Home_POM = new POM_Home();
const Subrogation_POM = new POM_Subrogation();
const Defendant_POM = new POM_Defendant();
const In_Utility = new Input_Utility();
var faker = require('faker');
//***********************************************************************************
//JIRA ID OF STORY : RMA-97883
//Description      : ExhSmoke_CarrierGC
//AUTHOR           : Saikrishan,Maddula
//DEPENDANCY       : No
// PRE-REQUISITES  : Check For policy Mapping Before Execution
//Preferred Server : IUTSQL
//***********************************************************************************
//global variables
var NoteText = 'CreateNote_' + faker.name.lastname;
var EditNoteText = 'ditNote_' + faker.name.lastname;
var StrClaimNumber;
var d;

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

        fixture`ExhSmoke_CarrierGC.js`.beforeEach(async t => {
                await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
                await t.wait(10000)
        });
        //============================================================Carrier GC Claim Creation Starts Here==================================================================================================

        test('Carrier_GCClaim_Creation_Test_01', async t => {
                d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
                console.log("AssureClaims_CarrierGCClaimCreation Function is Called To Create Carrier Claim".yellow);
                StrClaimNumber = await Function_Utility.AssureClaims_CarrierGCClaimCreation(d, d, data.GCCarrierClaimType1, data.ClaimStatus, data.Department, data.GCCarrierPolicyLOB, data.PolicySystem, data.PolicyName)
                console.log("New Carrier General Claim is Created with Claim Number: ".green + StrClaimNumber);
        });

        //============================================================Carrier GC Claim Creation Ends Here==================================================================================================
       
        //============================================================Claimant Create Edit Delete On Carrier GC Claim Creation Starts Here==================================================================================================

        test('Claimant_Create_Edit_Delete_Test_02', async t => {
                //==============================================Search the created carrier claim Starts Here========================================================================
                //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
                await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
                //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
                //==============================================Search the created carrier claim Ends Here========================================================================
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)



                const element = Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph
 
                // Check if the element is visible
                if (await element.visible) {
         
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Selector("#showMaximize"), "UnCheck", "Maximize Financial Summary")
                    await t.wait(8000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
                }


                //=====================================================Claimant Creation On Created Claim Started Here=====================================================
                console.log("AssureClaims_ClaimEventEntityAddition_Utility Function is Called To Create Claimant".yellow);
                await Function_Utility.AssureClaims_ClaimEventEntityAddition_Utility("Claimant",  data.Country, data.State, "NA")
                console.log("Claimant is Created on Carrier Claims");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Tab_ClaimantAttorney, "Claimant Attorney Tab On Claimant Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Tab_Supplementals, "Supplementals Tab On Claimant Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Tab_ClaimantInfo, "Claimant Info Tab On Claimant Screen")
                //============================================Verification That All Tabs Are Present For Claimant Screen Is Done=====================================================================
                //============================================Claimant Entity Editing Started Here=====================================================================================================
                console.log("AssureClaims_ClaimEventEntityEdit_Utility Function is Called To Edit The Created Claimant Tracking".yellow);
                var ClaimantLastName = await Function_Utility.AssureClaims_ClaimEventEntityEdit_Utility("Claimant", "NA", "NA", "NA");
                console.log("Created Claimant is Edited with New Last Name: ".green + ClaimantLastName);
                //============================================Claimant Entity Editing Ends Here========================================================================================================
                //================================================Claimant Entity  Delete Starts Here===================================================================================================
                await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Claimant Creation Screen", "", "");
                await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Claimant Creation Screen", "", "");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Claimant Creation Screen");
                //================================================Claimant Entity  Delete Starts Here===================================================================================================
                //=======================================================Claimant Creation On Created Claim Completed Here =============================================================================   
        });
        
        //============================================================Claimant Create Edit Delete On Carrier GC Claim Creation Ends Here==================================================================================================
        
        //============================================================Reserve Creation On Carrier GC Claim Creation Starts Here==================================================================================================

        test('Carrier_Reserve_Addition_Test_03', async t => {
                //==============================================Search the created carrier claim Starts Here========================================================================
                //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
                await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
                //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
                //==============================================Search the created carrier claim Starts Here========================================================================    
                //===============================================Reserve Creation For Carrier Claim Starts Here=======================================================================
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)



                const element = Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph
 
                // Check if the element is visible
                if (await element.visible) {
         
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Selector("#showMaximize"), "UnCheck", "Maximize Financial Summary")
                    await t.wait(8000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
                }


                await t.wait(3000);
                await t.switchToMainWindow();
                await t.wait(1000);
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
                console.log("AssureClaims_CarrierReserveAddition_Utility Function is Called To Create Carrier Reserve".yellow);
                await Function_Utility.AssureClaims_UpdatedCarrierReserveAddition_Utility(1, 1, 1, data.ReserveType, data.ReserveAmount, data.ReserveStatus)
                console.log("New Carrier Reserve is Created".green);
                //===============================================Reserve Creation For Carrier Claim Ends Here===========================================================
        });
        
        //============================================================Reserve Creation On Carrier GC Claim Creation Ends Here==================================================================================================
        
        //============================================================Payment Creation On Carrier GC Claim Creation Starts Here==================================================================================================
        test('Carrier_Payment_Addition_Test_04', async t => {
                await t.wait(10000)
                //==============================================Search the created carrier claim Starts Here========================================================================
                //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
                await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
                //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
                //==============================================Search the created carrier claim Starts Here========================================================================    
                //===============================================Payment Creation For Carrier Claim Starts Here=======================================================================
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)


                
                const element = Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph
 
                // Check if the element is visible
                if (await element.visible) {
         
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Selector("#showMaximize"), "UnCheck", "Maximize Financial Summary")
                    await t.wait(8000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
                }

                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Check Button")
                console.log("AssureClaims_CarrierPaymentAddition_Utility Function is Called To Create Carrier Payment".yellow);
                await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
                await t.wait(10000)
                await Function_Utility.AssureClaims_CarrierCollectionPaymentAddition_Utility(data.BankAccount, data.PayeeTypeClaimant, data.TransactionType, data.TransactionAmount, data.PolicyUnit, data.PolicyCoverage, data.PolicyLossCode)
                console.log("New Carrier Payment is Created".green);
                // await t.switchToMainWindow();
                //===============================================Payment Creation For Carrier Claim Ends Here======================================================================================================
                
        });
        //============================================================Payment Creation On Carrier GC Claim Creation Ends Here==================================================================================================
        //============================================================Schedule Check Creation On Carrier GC Claim Creation Starts Here==================================================================================================
        test('Carrier_Schedule_Check_Test_05', async t => {
                await t.wait(40000)

                //==============================================Search the created carrier claim Starts Here=====================================================================================    
                //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
                await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
                //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
                //==============================================Search the created carrier claim Ends Here========================================================================    
                //===============================================Schedule Check Creation For Carrier Claim Starts Here=======================================================================
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

                const element = Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph
 
                // Check if the element is visible
                if (await element.visible) {
         
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Selector("#showMaximize"), "UnCheck", "Maximize Financial Summary")
                    await t.wait(8000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
                }




                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Check Button")
                console.log("AssureClaims_ScheduleCheck_Creation Function is Called To Create Carrier Payment".yellow);
                await Function_Utility.AssureClaims_ScheduleCheck_Creation(data.NumberOfPayments, data.PayInterval, data.BankAccount, data.DistributionType, data.AutoCheckPayeeType, data.LastName, data.AutoCheckTransactionType, data.TransactionAmount)
                console.log("New Carrier ScheduleCheck is Created".green);
                //===============================================Schedule Check Creation For Carrier Claim Starts Here=======================================================================
        });
        //============================================================Schedule Check Creation On Carrier GC Claim Creation Ends Here==================================================================================================
        //============================================================Collection Creation On Carrier GC Claim Creation Starts Here==================================================================================================
        test('Carrier_Collection_Addition_Test_06', async t => {
                await t.wait(10000)

                //==============================================Search the created carrier claim Starts Here=====================================================================================    
                //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
                await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
                //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
                //==============================================Search the created carrier claim Ends Here========================================================================    
                //===============================================Collection Check Creation For Carrier Claim Starts Here=======================================================================
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)







                const element = Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph
 
                // Check if the element is visible
                if (await element.visible) {
         
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Selector("#showMaximize"), "UnCheck", "Maximize Financial Summary")
                    await t.wait(8000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
                }
                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Check Button")
                console.log("AssureClaims_CarrierCollectionPaymentAddition_Utility Function is Called To Create Carrier Payment".yellow);
                // Carrier Collection starts
                await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_AddCollection, "Add collection Button On Payment Creation Screen")
                await Function_Utility.AssureClaims_CarrierCollectionPaymentAddition_Utility(data.BankAccount, data.PayeeTypeClaimant, data.TransactionType, data.TransactionAmount, data.PolicyUnit, data.PolicyCoverage, data.PolicyLossCode)
                console.log("New Carrier Payment is Created".green);
                //===============================================Collection Check Creation For Carrier Claim Starts Here=======================================================================
        });
        //============================================================Collection Creation On Carrier GC Claim Creation Ends Here==================================================================================================
        //============================================================Enhance Notes Create Edit Delete On Carrier GC Claim Creation Starts Here==================================================================================================
        test('EnhancedNotes_Create_Edit_Delete_Test_07', async t => {
                await t.wait(10000)

                //==============================================Search the created carrier claim Starts Here=====================================================================================    
                //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
                await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
                //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
                //==============================================Search the created carrier claim Ends Here=====================================================================================    
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)


                const element = Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph
 
                // Check if the element is visible
                if (await element.visible) {
         
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Selector("#showMaximize"), "UnCheck", "Maximize Financial Summary")
                    await t.wait(8000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
                }




                //===================================================EnhancedNotes Create and Edit Starts Here===============================================================================================
                await Function_Utility.AssureClaims_EnhancedNotesCreateEditDelete_Utility("Create/Edit", NoteText, data.EnhNotesType, data.ExNoteType, EditNoteText);
                //===================================================EnhancedNotes Create and Edit Ends Here===============================================================================================
                //===================================================EnhancedNotes Create and delete Start Here=============================================================================================
                await Function_Utility.AssureClaims_EnhancedNotesCreateEditDelete_Utility("Delete", "NA", "NA", "NA");
                await t.wait(8000);
                await t.switchToMainWindow();
                //===================================================EnhancedNotes Create and delete Start Here=============================================================================================
        });
        //============================================================Enhance Notes Create Edit Delete Carrier GC Claim Creation Ends Here==================================================================================================
        //============================================================Adjuster Create Edit Delete On Carrier GC Claim Creation Starts Here==================================================================================================
        test('Adjuster_Create_Edit_Delete_Test_08', async t => {
                await t.wait(10000)
                //==============================================Search the created carrier claim Starts Here=====================================================================================    
                //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
                await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
                //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
                //==============================================Search the created carrier claim Starts Here=====================================================================================    
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)




                const element = Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph
 
                // Check if the element is visible
                if (await element.visible) {
         
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Selector("#showMaximize"), "UnCheck", "Maximize Financial Summary")
                    await t.wait(8000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
                }




                //=======================================================Adjuster Creation On Created Claim Started Here====================================================      
                await Function_Utility.AssureClaims_ClaimEventEntityAddition_Utility("Adjuster", data.Country, data.State, "NA")
               
                 //======================================================Scrolling Starts Here======================================================================================================
                const setStyle = ClientFunction((selector, value) =>{document.querySelector(selector).style.overflowY = value; })
                await setStyle('.rightPanEx', 'auto');
                //===============================================================Scrolling Ends Here==============================================================================================
                await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Tab_Supplementals, "Supplementals Tab On Adjuster Creation Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Tab_ClaimAdjusterInfo, "Claim Adjuster Information Tab On Adjuster Creation Screen")
                //===============================================================Verification That All Tabs Are Present For Adjuster Screen Done============================================================
                console.log("AssureClaims_ClaimEventEntityEdit_Utility Function is Called To Edit The Created Adjuster Tracking".yellow);
                var AdjusterLastName = await Function_Utility.AssureClaims_ClaimEventEntityEdit_Utility("Adjuster", "NA", "NA", "NA");
                console.log("Created Adjuster is Edited with New Last Name: ".green + AdjusterLastName);
                //=================================================================Created Adjuster Entity Is Edited Here=====================================================================================
                await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Adjuster Creation Screen", "", "");
                await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Adjuster Creation Screen", "", "");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Adjuster Creation Screen");
                //==================================================================Created Adjuster Entity Is Deleted Here==================================================================================
                //======================================================Adjuster Creation On Created Claim Completed Here==================================================
        });
        //============================================================Adjuster Create Edit Delete On Carrier GC Claim Creation Ends Here==================================================================================================
        //============================================================Defendant Create Edit Delete On Carrier GC Claim Creation Starts Here==================================================================================================
        test('Defendant_Create_Edit_Delete_Test_09', async t => {
                var AttorneyDefendantLasttName = "Attorney_" + faker.name.lastName();
                //==============================================Search the created carrier claim Starts Here=====================================================================================    
                //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
                await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
                //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
                //==============================================Search the created carrier claim Ends Here=====================================================================================    
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)



                const element = Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph
 
                // Check if the element is visible
                if (await element.visible) {
         
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Selector("#showMaximize"), "UnCheck", "Maximize Financial Summary")
                    await t.wait(8000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
                }




                //=======================================================Defendant Creation On Created Claim Started Here==================================================== 
                await Function_Utility.AssureClaims_ClaimEventEntityAddition_Utility("Defendant", data.Country, data.State, "NA")
                //===============================================================Verification That All Tabs Are Present For Defendant Screen Starts Here============================================================
                await Nav_Utility.AssureClaims_ElementClick_Utility(Defendant_POM.AssureClaims_Defendant_Tab_Supplementals, "Supplementals Tab On Defendant Creation Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Defendant_POM.AssureClaims_Defendant_Tab_ClaimDefendantAttorney, "Claim Defendant Attorney Tab On Defendant Creation Screen")
                await In_Utility.AssureClaims_SetValue_Utility(Defendant_POM.AssureClaims_Defendant_Txt_AttorneyMiddleName, "MN", "Attorney Middle Name")
                await In_Utility.AssureClaims_SetValue_Utility(Defendant_POM.AssureClaims_Defendant_Txt_AttorneyLastName, AttorneyDefendantLasttName, "  Attorney Defendant LasttName")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
                //==========================================================Verification That All Tabs Are Present For Defendant Screen Ends Here=========================================================================
                //=======================================================================Scrolling Starts Here=============================================================================================================
                const setStyle = ClientFunction((selector, value) =>{document.querySelector(selector).style.overflowY = value; })
                await setStyle('.rightPanEx', 'auto');
                //===============================================================Scrolling Starts Here==============================================================================================
                //==============================================================Created Defendant Entity Edite Starts Here=================================================================================================
                await Nav_Utility.AssureClaims_ElementClick_Utility(Defendant_POM.AssureClaims_Defendant_Tab_ClaimDefendantInfo, "Claim Defendant Information Tab On Defendant Creation Screen")
                console.log("AssureClaims_ClaimEventEntityEdit_Utility Function is Called To Edit The Created Defendant".yellow);
                var DefendantLastName = await Function_Utility.AssureClaims_ClaimEventEntityEdit_Utility("Defendant", "NA", "NA", "NA");
                console.log("Created Defendant is Edited with New Last Name: ".green + DefendantLastName);
                //===============================================================Created Defendant Entity Edit Ends Here====================================================================================================
                //==================================================================Created Defendant Entity  Delete Starts Here================================================================================================
                await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Defendant Creation Screen", "", "");
                await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Defendant Creation Screen", "", "");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Defendant Creation Screen");
                //==================================================================Created Defendant Entity  Delete Ends Here================================================================================================
                //=======================================================Defendant Creation On Created Claim Completed Here==========================================================================================================
        });
        //============================================================Defendant Create Edit Delete On Carrier GC Claim Creation Ends Here==================================================================================================
        //============================================================Subrogation Create Edit Delete On Carrier GC Claim Creation Starts Here==================================================================================================
        test('Subrogation_Create_Edit_Delete_Test_10', async t => {
                //==============================================Search the created carrier claim Starts Here=====================================================================================    
                //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
                await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
                //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
                //==============================================Search the created carrier claim Ends Here=====================================================================================    
                //=======================================================Subrogation Creation On Created Claim Started Here====================================================  
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

                const element = Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph
 
                // Check if the element is visible
                if (await element.visible) {
         
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Selector("#showMaximize"), "UnCheck", "Maximize Financial Summary")
                    await t.wait(8000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
                }
                await Function_Utility.AssureClaims_ClaimEventEntityAddition_Utility("Subrogation", "Collision", "Open", "Adverse Insured")

                //============================================================Subrogation Screen  Edit Starts Here========================================================================================
                await Nav_Utility.AssureClaims_ElementClick_Utility(Subrogation_POM.AssureClaims_Subrogation_Tab_SubrogationInfo, "Subrogation Info Tab On Subrogation Creation Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Subrogation_POM.AssureClaims_Subrogation_Tab_SubrogationFinancial, "Subrogation Financial Tab On Subrogation Creation Screen")
                await In_Utility.AssureClaims_SetValue_Utility(Subrogation_POM.AssureClaims_Subrogation_Txt_NumberOfYears, "3", "Number Of Years Text Box On Subrogation Financial Tab")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Subrogation_POM.AssureClaims_Subrogation_Tab_Supplementals, "Supplementals Tab On Subrogation Creation Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Subrogation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Subrogation Creation Screen");
                //============================================================Subrogation Screen  Edit Ends Here========================================================================================
                //======================================================================Created Subrogation Entity  Delete Starts Here=====================================================================
                await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Subrogation Creation Screen", "", "");
                await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Subrogation Creation Screen", "", "");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Subrogation Creation Screen");
                //======================================================================Created Subrogation Entity  Delete Ends Here=====================================================================
                //=======================================================Subrogation Creation On Created Claim Completed Here===============================================================
        });
        //============================================================Subrogation Create Edit Delete On Carrier GC Claim Creation Ends Here==================================================================================================
        //============================================================Arbitration Create Edit Delete On Carrier GC Claim Creation Starts Here==================================================================================================
        test('Arbitration_Create_Edit_Delete_Test_11', async t => {
                await t.wait(10000)

                //==============================================Search the created carrier claim Starts Here=====================================================================================    
                //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
                await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
                //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
                //==============================================Search the created carrier claim Ends Here=====================================================================================    
                //=======================================================Arbitration Creation On Created Claim Started Here====================================================  
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)




                const element = Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph
 
                // Check if the element is visible
                if (await element.visible) {
         
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Selector("#showMaximize"), "UnCheck", "Maximize Financial Summary")
                    await t.wait(8000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
                }



                await Function_Utility.AssureClaims_ClaimEventEntityAddition_Utility("Arbitration", "Auto Mobile", "1234", "NA")
                //===========================================================Verification That All Tabs Are Present  And Edit For Arbitration Screen Starts Here=======================================================================
                await In_Utility.AssureClaims_SetValue_Utility(Arbitration_POM.AssureClaims_Arbitration_Txt_ArbitrationParty, "A Applicant", "Arbitration party");
                await t.pressKey('tab');
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Arbitration creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "ArbitrationCreation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Arbitration_POM.AssureClaims_Arbitration_Tab_ArbitrationInfo, "Arbitration Info Tab On Arbitration Creation Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Arbitration_POM.AssureClaims_Arbitration_Tab_Supplementals, "Supplementals Tab On Arbitration Creation Screen")
                //===========================================================Verification That All Tabs Are Present  And Edit For Arbitration Screen Ends Here=======================================================================
                //===========================================================Created Arbitration Entity Delete Starts Here=======================================================================
                await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Arbitration Creation Screen", "", "");
                await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Arbitration Creation Screen", "", "");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Arbitration Creation Screen");
                //===========================================================Created Arbitration Entity Delete Ends Here=============================================================================
                //=======================================================Arbitration Creation On Created Claim Completed Here=====================================================  
        });
        //============================================================Arbitration Create Edit Delete On Carrier GC Claim Creation Ends Here==================================================================================================
        //============================================================Litigation Create Edit Delete On Carrier GC Claim Creation Starts Here==================================================================================================
        test('Litigation_Create_Edit_Delete_Test_12', async t => {
                await t.wait(10000)

                var AttorneyLasttName = "Attorney_" + faker.name.lastName();
                //==============================================Search the created carrier claim Starts Here=====================================================================================    
                //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
                await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
                //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
                //==============================================Search the created carrier claim Ends Here=====================================================================================    
                //=======================================================Litigation Creation On Created Claim Started Here====================================================   
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
                await Function_Utility.AssureClaims_ClaimEventEntityAddition_Utility("Litigation", data.LitigationState, data.LitigationType, data.LitigationStatus)
                //=========================================================Verification That All Tabs Are Present And Edit For Litigation Screen Starts Here===========================================================
                await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Tab_LitigationInfo, "Litigation Info Tab On Litigation Creation Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Tab_AttorneyInformation, "Attorney Information Tab On Litigation Creation Screen")
                await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_ZipCode, "33333", "Zip Code Text Box On Attorney Information Tab")
                await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_AttorneyLasttName, AttorneyLasttName, "Zip Code Text Box On Attorney Information Tab")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Tab_MatterInfo, "Matter info Tab On Litigation Creation Screen")
                await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_MatterInfoFirstName, "Jerry", "Matter Info FirstName Text Box On Attorney Information Tab")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Tab_Supplementals, "Supplementals Tab On Litigation Creation Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Litigation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Litigation Creation Screen");
                //=========================================================Verification That All Tabs Are Present And Edit For Litigation Screen Ends Here===========================================================
                //=========================================================Created Litigation Entity  Delete Starts Here===========================================================
                await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Litigation Creation Screen", "", "");
                await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Litigation Creation Screen", "", "");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Litigation Creation Screen");
                //=========================================================Created Litigation Entity  Delete Ends Here===========================================================
                //=======================================================Litigation Creation On Created Claim Completed Here====================================================  
        });
        //============================================================Litigation Create Edit Delete On Carrier GC Claim Creation Ends Here==================================================================================================
        //============================================================Person Involved Create On Carrier GC Claim Creation Starts Here==================================================================================================
        test('AssureClaims_Person_Involved_Test_13', async t => {
                await t.wait(5000)
                //==============================================Search the created carrier claim Starts Here=====================================================================================    
                //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
                await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
                //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
                //==============================================Search the created carrier claim Ends Here=====================================================================================    
                //=========================================================Adding Med Staff As PI On Created Carrier Gc  Started Here==============================================================================================================================================================================================
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
                console.log("AssureClaims_PersonInvolvedAddNewEntity_Utility Function is Called To Create  Med Staff As PI On Created WC Claim".yellow);
                await Maint_Utility.AssureClaims_PersonInvolvedAddNewEntity_Utility("Medical Staff", "NA", "NA", "NA");
                console.log("Med Sfaff is added as Person Involved on Created Claim ".green);
                //==========================================================Adding Med Staff As PI On Created Carrier Gc Completed Here================================================================================================================================================================================
        });
        //============================================================Person Involved Create On Carrier GC Claim Creation Ends Here==================================================================================================
});



// testcafe chrome ExhSmoke_TestScripts1/ --skip-js-errors -S --reporter html:HTMLREPORT/report_export.html