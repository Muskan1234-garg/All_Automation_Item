import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';

import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Life_Claims from '../Functional_POM/POM_Life_Claims';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Deductible from '../Functional_POM/POM_Deductible';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Reserve_Utility = new POM_FinancialReserves();
const Deductible_POM = new POM_Deductible();
const Payment_POM = new POM_PaymentsCollections();
const Home_POM = new POM_Home();
const Life_Claims = new POM_Life_Claims();

var faker = require('faker');
const DataIUT = require('../DataFiles/DataAutoRegDSN_3_LC.json');

var StrLifeClaimNumber;
var Strfirstname;
var Strlastname;
var Strfirstname1;
var Strlastname1;
var d;
var Strfullname
var ClaimantHeader;
var ClaimantValue;
var ReserveHeader;
var ReserveValue;

//Global Variable Declaration

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-109548
//Description      : Automating Life Claim script for including coverage with Non Annuity amount for multiple beneficiary..
//AUTHOR           : Parul Sharma
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
*/
//Preferred Server : Any
// *******************************************************************************************************************************

DataIUT.forEach(data => {
  const LoggedInUser = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );

  fixture`LifeClaim_NonAnnuity_Multiple_Beneficiary`.beforeEach(async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });

  /* Steps performed by AssureClaims_LCCreation_Test_01 :
        1. Login to Claims Zone
        2. Create new Life claim and download policy
        3. Save it
    */
  test('AssureClaims_LCCreation_Test_01', async t => {
    d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY"); 
    //======LifeClaim Creation Started Here=====================
    console.log("AssureClaims_LifeClaimCreation Function is Called To Create Claim".yellow);
    StrLifeClaimNumber = await Function_Utility.AssureClaims_LifeClaimCreation(d, d, data.ClaimStatus, data.LCClaimType, data.Department, data.LCPolicyLOB , data.LCMannerOfDeath ,data.LCCauseOfDeath , data.EstateProbated , data.DeceasedMaritalStatus , data.SpouseLiving ,data.PolicySystem,data.LifePolicyName)
    console.log("New Life Claim is Created with Claim Number: ".green + StrLifeClaimNumber);
    //======LifeClaim Creation Completed Here=====================
        
  });

 /* Steps performed by AssureClaims_IncludeCoverage_test_02 :
        1. Open Policy screen
        2. Update record in Product Type field whose parent is  non annuity
        3. Include coverage for this policy by clicking on include coverage button
        4. Select the coverage and include it
        5. update amounts for the given coverage in 2nd grid
    */
 test('AssureClaims_IncludeCoverage_test_02', async t => {
    await t.wait(5000)
     //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrLifeClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe)
    /*==========================================================Including Coverage On Created LC Claim Started Here========================================================================================================================================================================================================================================================================================================*/
    console.log("Including Coverage On Created LC Claim Started".yellow); 
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaim_Btn_PolicyOpen,"Policy Open Button Is Clicked")
    if(data.Annuity_Flag ==="True"){
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Policy_Btn_ProductType,"Policy Type Lookup Button Is Clicked");
    await t.wait(5000)
   const ele1 = Life_Claims.AssureClaims_LifeClaim_Lnk_SelectClaimStatus.withText(data.Policy_product_type_code).with({ visibilityCheck: true })
   await t.expect(ele1.exists).ok('', { timeout: 20000 })
   await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Policy Product Type Option")
   await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Life Claim creation Screen");
   await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " Life Claim Creation Screen");
   await t.wait(5000)
    }
    
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Policy_Btn_CoveragesDetails,"Coverages Details Button Is Clicked")
    console.log("Covergaes Details Screen Is Opened")
    await t.wait(5000)
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Life_Claims.AssureClaims_Policy_CoverageDetails_Chk_Coverage,"Check","Coverage Checkbox")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Policy_CoverageDetails_Confirmpopup_Btn_Ok,"Ok Button On Confirm Popup")
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Policy_Coverage_Edit_Button,"Edit Button Is Clicked")
    
    var Annuity_Flag ="False"
    await Function_Utility.AssureClaims_IncludeCoverageInPolicy(Annuity_Flag,data.FaceAmountWithCode, data.DividendsWithCode,data.PaidUpAddsWithCode,data.AccidentDeathBenefitWithCode);
  
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button On Coverages Details Screen")
  await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button On Policy Tracking Screen")
  console.log("Including Coverage On Created LC Claim Completed".yellow);   
  
    //Coverages Added
   /*==========================================================Including Coverage On Created LC Claim Completed Here========================================================================================================================================================================================================================================================================================================*/

  });

   /* Steps performed by AssureClaims_PersonInvolved_Test_03 :
        1. open Add new person involved screen
        2. Add new entity of type beneficiary
        3. open Add new person involved screen
        4. Add new entity of type beneficiary
    */
  test('AssureClaims_PersonInvolved_Test_03', async t => {

    await t.wait(5000)
     //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrLifeClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
   await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe)
    //await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_ErrorToastMsgClose,"Close button On Error Toaster Is Clicked")
    //==========================================================Adding Party As PI On Created LC Claim Started Here========================================================================================================================================================================================================================================================================================================
    
    console.log("AssureClaims_PersonInvolvedAddNewEntity_Utility Function is Called To Create Party As PI On Created LC Claim".yellow); 
    await Function_Utility.AssureClaims_PersonInvolvedAddNewEntity_Utility("Party", "NA", "NA","NA");
    console.log("Party is added as Person Involved on Created Claim ".green);
    Strfirstname= await Verify_Utility.AssureClaims_AttributeFetch_Utility(Life_Claims.AssureClaims_PIParty_Txt_FirstName,"FirstName Value")
    Strlastname=await Verify_Utility.AssureClaims_AttributeFetch_Utility(Life_Claims.AssureClaims_PIParty_Txt_LastName,"LastName Value")
    console.log("FirstName Is fetched".Strfirstname+Strlastname)

    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button On Claim Screen")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe)

    console.log("AssureClaims_PersonInvolvedAddNewEntity_Utility Function is Called To Create Party 2 As PI On Created LC Claim".yellow); 
    await Function_Utility.AssureClaims_PersonInvolvedAddNewEntity_Utility("Party", "NA", "NA","NA");
    console.log("Party is added as Person Involved on Created Claim ".green);
    Strfirstname1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Life_Claims.AssureClaims_PIParty_Txt_FirstName,"FirstName1 Value")
    Strlastname1 =await Verify_Utility.AssureClaims_AttributeFetch_Utility(Life_Claims.AssureClaims_PIParty_Txt_LastName,"LastName1 Value")
    console.log("FirstName Is fetched".Strfirstname1+Strlastname1)
    
    //Party as PI On Life Claim
   //==========================================================Adding Party As PI On Created LC Claim Completed Here========================================================================================================================================================================================================================================================================================================
});

/* Steps performed by AssureClaims_AddDesignation_test_04 :
        1. open designee screen
        2. add new record of designee for both the beneficiary
    */
  test('AssureClaims_AddDesignation_test_04', async t => {
    await t.wait(5000)
     //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrLifeClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Btn_Designations,"Designations Button Is Clicked")
    await Verify_Utility.AssureClaims_ElementExist_Utility(Life_Claims.AssureClaims_Designation_Btn_AddDesignee,"Add Designee Button Is Present")
    await Verify_Utility.AssureClaims_ElementExist_Utility(Life_Claims.AssureClaims_Designation_Btn_DeleteDesignee,"Delete Designee Button Is Present")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Life_Claims.AssureClaims_Lst_PartiesInvolved,Strfirstname+" "+Strlastname+" - Beneficiary","Party Involved On Designee Screen")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Life_Claims.AssureClaims_Lst_Policy,data.LifePolicyName,"Policies On Designee Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Designation_Btn_AddDesignee,"Designee Added Successfully")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Designation_Txt_Designee_AmountPercent,"Amount Field Clicked Successfully") 
    await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Designation_Txt_Designee_AmountPercent, data.Beneficiary1_Reserve_Amount,"Amount Field on Designee Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Designation_Btn_Designee_RowSave,"Save Button Is Clicked Successfully") 

   
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Life_Claims.AssureClaims_Lst_PartiesInvolved,Strfirstname1+" "+Strlastname1+" - Beneficiary","Party Involved On Designee Screen")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Life_Claims.AssureClaims_Lst_Policy,data.LifePolicyName,"Policies On Designee Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Designation_Btn_AddDesignee,"Designee2 Added Successfully")
   
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Designee_Name_Filter,"Designee Name Column Filter Clicked Successfully")
    await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Designee_Name_Filter,Strfirstname1,"Second Designee Name Entered In Filter")
    
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Designation_Txt_Designee_AmountPercent,"Amount Field Clicked Successfully") 
    await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Designation_Txt_Designee_AmountPercent, data.Beneficiary2_Reserve_Amount,"Amount Field on Designee Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Designation_Btn_Designee_RowSave,"Save Button Is Clicked Successfully") 
    
  });

/* Steps performed by AssureClaims_Adjudication_Test_05 :

  1. Login to the Claims Zone
  2. Open the existing claim created above
  3. Approving the decision to be approved for the Adjudication 
  4. After the decision is being approved the financial are being created 
  */
  test('AssureClaims_Adjudication_Test_05', async t =>{
    await t.wait(5000)

    await t.setNativeDialogHandler(()=>true).useRole(LoggedInUser)
    await t.wait(2000)
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrLifeClaimNumber, "NA");

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Btn_Adjudicate,"Clicking on the ajudicate button")
    await t.wait(2000)
 //=========================================Shubham's Code :RMA-109549 Approving the decision to be approved for the Adjudication started here====================================================.
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_AdjudicationList_lnk_PolicyName.withText(data.LifePolicyName),"clciking on the policy name of the Adjudication List")
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_AdjudicationDetails_Btn_UpdateAdjudication,"Clicking on the update adjucation button")
    await t.wait(4000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Lkp_AdjudicationDecision,"clicking on the Adjudication Decision lookup")
    await t.wait(4000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaim_Lnk_AdjudicationDecision,"Selecting the value from the lookup Adjudication Decision data")
    await t.wait(4000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaim_UpdateAdjudication_Btn_Save,"clicking on the save button")
    await t.wait(4000) 
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaim_UpdateAdjudication_Ok_ConfirmBtn,"clicking on the Ok Button On Confirm Popup")
    await t.wait(5000)
    await t.pressKey('esc')
    await t.pressKey('esc')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaim_Adjucationlist_Btn_GoToFinancicals, "Clicking on the go to financial button");
    await t.wait(9000)
//=========================================Shubham's Code :RMA-109549 Approving the decision to be approved for the Adjudication Completed here====================================================.
//=========================================Shubham's Code :RMA-109549 Verifying the financial creation on the after the adjudication decision made to approved started here====================================================.
    Strfullname = Strlastname + ','+ Strfirstname;
    console.log(Strfullname);

    ClaimantHeader = ["Claimant"]
    ClaimantValue = [Strfullname]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(Strfullname,"Claimant",ClaimantHeader,ClaimantValue)

    ReserveHeader = ["Reserve Type"]
    ReserveValue = [data.ReserveType]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.ReserveType, "Reserve Type", ReserveHeader, ReserveValue)


//=========================================Shubham's Code :RMA-109549 Verifying the financial creation on the after the adjudication decision made to approved Completed here====================================================.
});

/* Steps performed by AssureClaims__NonAnnuity_PMI_Test_06 : 
    1.  Login to Claims Zone
    2.  Create new Life claim 
    3.  Save it
    4.  Click On Financial Reserve
    5.  Check Row exist
    6.  Click Check Button
    7.  Click On PMI Details
    8.  Update Proof of Death Date
    9.  Update Proof of Loss Date
    10.  Select Beneficiary dropdown
    11.  Select Product Type dropdown
    12.  Click on Calculate PMI
    */

  test('AssureClaims_NonAnnuity_PMI_Test_06', async t => {
    await t.wait(10000)
      
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrLifeClaimNumber, "NA");
 //=========================================Kiran's Code :RMA-109560 NonAnnuity_PMI started here====================================================.

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve");
    await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, "Row exist");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "reserve row Check button");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_FinanceReserve_Btn_PMI, "Click On PMI Details");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Externalapp_frame);
    await t.wait(5000);
    await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_LifeClaim_Txt_ProofOfDeathDate,data.ProofOfDeathDate,"Proof of Death Date");
    await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_LifeClaim_Txt_ProofOfLossDate,data.ProofOfLossDate,"Proof of Loss Date");
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Life_Claims.AssureClaims_Lst_Beneficiary, data.Beneficiary1, "Select Beneficiary dropdown");
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Life_Claims.AssureClaims_Lst_ProductType, data.ProductType, "Select ProductType dropdown");  
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_CalcPMI, "Calculate PMI");
    await t.wait(4000);
    await t.pressKey('tab');
     //=========================================Kiran's Code :RMA-109560 NonAnnuity_PMI started here====================================================.

  });   
});