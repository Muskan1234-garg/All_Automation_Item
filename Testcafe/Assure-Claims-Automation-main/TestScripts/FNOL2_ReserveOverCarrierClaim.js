import { Selector, Role } from 'testcafe';
import { ClientFunction } from 'testcafe';
import Colors from 'colors';

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'

import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_FNOL from '../Functional_POM/POM_FNOL';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Deductible from '../Functional_POM/POM_Deductible';

const Deductible_POM=new POM_Deductible();
const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const In_Utility = new Input_Utility();
const Reserve_Utility = new POM_FinancialReserves();

const Home_POM = new POM_Home();
const FNOL_POM = new POM_FNOL();

const DataAutoReg = require('../DataFiles/DataAutoRegDSN_3.json');
var d;
var StrClaimNumber;
var StrClaimNumber1;
var ClaimentLastName;

//Global Variable Declaration


//***********************************************************************************************************************************************
//JIRA ID OF STORY : RMA-94583,RMA-95414, RMA-103318
//Description      : Verify FNOL option is available in toolbar,Create reserve from FNOL – Verify visible in financial reserve screen
//Verify multiple reserves message - FNOL reserve already exists,Verify when same FNOL reserve crested for two different claimants, should be visible in financial reserve listing page.
//Verify when same FNOL reserve crested for two different claimants, should be visible in financial reserve listing page.
//AUTHOR           : Muskan Garg
//DEPENDANCY       : Run this UtilitySettings_FNOL.js
//PRE-REQUISITES   : None
//Preferred Server : 194Automation, DSN1 : RM202REG_Test3
//***********************************************************************************************************************************************


DataAutoReg.forEach(data => {
  const LoggedInUser = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    //Login into Claims zone
    await t.wait(10000)
    console.log("Login Into Application!!-->Claims".green)
  }, { preserveUrl: true }
  );

  fixture`FNOL2_ReserveOverCarrierClaim`.beforeEach(async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });


  test('AssureClaims_FNOL_AddFNOLReserveOverCarrierClaim_Test_01', async t => {

    //=====================================Carrier Claim Creation started here===================================================================================================================================
    d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    console.log("AssureClaims_CarrierGCClaimCreation Function is Called To Create Carrier Claim".yellow);
    StrClaimNumber = await Function_Utility.AssureClaims_CarrierGCClaimCreation_SelectSecondUnit(d, d, data.GCCarrierClaimType_ProfessionalLiability, data.ClaimStatus, data.Department, data.GCPolicyLOB, data.PolicySystem, data.PolicyName)
    console.log("New Carrier General Claim is Created with Claim Number: ".green + StrClaimNumber);
    //=====================================Carrier Claim Creation completed here===================================================================================================================================

    //===============================================Add FNOL reserve creation started Here==============================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_LookupBtnOnGeneralClaimPage, "Look up button");

    //===============================================Verify for FNOL reserve option is present or not started Here==============================================================================================
    const ele_AddFNOL = FNOL_POM.AssureClaims_FNOL_Txt_AddFNOLReserve.with({ visibilityCheck: true })
    await t.expect(ele_AddFNOL.exists).ok('', { timeout: 20000 })
    //===============================================Verify for FNOL reserve option is present or not completed Here==============================================================================================

    await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Txt_AddFNOLReserve, "Add FNOL Reserve");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
    await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_AddNew, "Add New");

    //===============================================Add FNOL reserve-->for 1st Claimant started Here==============================================================================================    
    await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Claimant, 1, "Claiment LastName")
    await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Policy, 1, "Policy")
    await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Unit, 1, "Unit")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Coverage, data.PolicyCoverage_Auto, "Policy Coverage")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(FNOL_POM.AssureClaims_FNOL_Lst_TypeOfLoss, data.PolicyLossCode, "Policy Coverage")
    await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_Save, "Save");
    //===============================================Add FNOL reserve-->for 1st Claimant completed Here==============================================================================================

    //===============================================Add FNOL reserve creation completed Here=========================================================================================================

    //===============================================Before Saving FNOL Reserve verify RESERVE CREATED column as 'No' started here==============================================================================================
    var RowMessage_ActualText = await FNOL_POM.AssureClaims_ClaimFNOLReserveSetUp_Data_getText.innerText;
    var RowMessage_ExpectedText = 'No'

    if (RowMessage_ActualText === RowMessage_ExpectedText)
      console.log(RowMessage_ActualText.yellow + " is match with " + RowMessage_ExpectedText.yellow + " Hence verification successful".green)
    else
      console.log(RowMessage_ActualText.yellow + " is not  match with" + RowMessage_ExpectedText.yellow + " Hence verification successful".green)
    //===============================================Before Saving FNOL Reserve verify RESERVE CREATED column as 'No' ended here==============================================================================================

    await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_SaveFNOL, "Save FNOL");
    await t.wait(5000)

    //==============================After Saving FNOL Reserve verify RESERVE CREATED column as 'YES' started here==============================================================================================
    var RowMessage_ActualText1=await FNOL_POM.AssureClaims_ClaimFNOLReserveSetUp_Data_getText.innerText;
    var RowMessage_ExpectedText1='Yes'
    if(RowMessage_ActualText1===RowMessage_ExpectedText1)
    console.log(RowMessage_ActualText1.yellow+ " is match with "+RowMessage_ExpectedText1.yellow+" Hence verification successful".green)
    else
    console.log(RowMessage_ActualText.yellow1+ " is not  match with"+RowMessage_ExpectedText1.yellow+" Hence verification successful".green)
     //==============================After Saving FNOL Reserve verify RESERVE CREATED column as 'Yes' completed here==============================================================================================

  });

  test('AssureClaims_CreateSameFNOLReserve_Test_02', async t => {

    //===============================================Search that carrier claim--> FNOL Reserve Setup screen started here==============================================================================================    

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_LookupBtnOnGeneralClaimPage, "Look up button");
    await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Txt_AddFNOLReserve, "Add FNOL Reserve");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
    await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_AddNew, "Add New");
    //===============================================Search that carrier claim--> FNOL Reserve Setup screen completed here==============================================================================================    

    //===============================================Add FNOL reserve-->for 1st Claimant started Here==============================================================================================    
    await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Claimant, 1, "Claiment LastName")
    await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Policy, 1, "Policy")
    await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Unit, 1, "Unit")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Coverage, data.PolicyCoverage_Auto, "Policy Coverage")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(FNOL_POM.AssureClaims_FNOL_Lst_TypeOfLoss, data.PolicyLossCode, "Policy Coverage")
    // Loss type
    await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_Save, "Save");
    //===============================================Add FNOL reserve-->for 1st Claimant completed Here==============================================================================================

    //===============================================Verify duplicate msg--> when create same FNOL Reserve started Here==============================================================================================
    var SaveMessageVerification = "This FNOL Reserve already exist."
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(SaveMessageVerification, true, "FNOL Reserve setup");
    //===============================================Verify duplicate msg--> when create same FNOL Reserve completed Here==============================================================================================
  });

  test('AssureClaims_FNOL_AddFNOLReserveOverCarrierClaimWithTwoClaimant_Test_03', async t => {

    await t.wait(10000)
    //=====================================Carrier Claim Creation started here===================================================================================================================================
    d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    console.log("AssureClaims_CarrierGCClaimCreation Function is Called To Create Carrier Claim".yellow);
    StrClaimNumber1 = await Function_Utility.AssureClaims_CarrierGCClaimCreation_SelectSecondUnit(d, d, data.GCCarrierClaimType_ProfessionalLiability, data.ClaimStatus, data.Department, data.GCPolicyLOB, data.PolicySystem, data.PolicyName)
    console.log("New Carrier General Claim is Created with Claim Number: ".green + StrClaimNumber1);
    //=====================================Carrier Claim Creation completed here===================================================================================================================================

    //===============================================Claimant Creation started Here==============================================================================================
    ClaimentLastName = await Function_Utility.AssureClaims_ClaimEventEntityAddition_Utility("Claimant", data.Country, data.State, "NA")
    //===============================================Claimant Creation Completeed Here==============================================================================================

    //===============================================Add FNOL reserve creation started Here==============================================================================================
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_LookupBtnOnGeneralClaimPage, "Look up button");
    await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Txt_AddFNOLReserve, "Add FNOL Reserve");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
    await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_AddNew, "Add New");

    //===============================================Add FNOL reserve-->for 1st Claimant started Here==============================================================================================    
    await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Claimant, 1, "Claiment LastName")
    await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Policy, 1, "Policy")
    await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Unit, 1, "Unit")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Coverage, data.PolicyCoverage_Auto, "Policy Coverage")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(FNOL_POM.AssureClaims_FNOL_Lst_TypeOfLoss, data.PolicyLossCode, "Policy Coverage")
    await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_AddMore, "Save and Add More");
    //===============================================Add FNOL reserve-->for 1st Claimant completed Here==============================================================================================

    //===============================================Add FNOL reserve-->for 2nd Claimant started Here==============================================================================================
    await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Claimant, 2, "Claiment LastName")
    await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Policy, 1, "Policy")
    await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Unit, 1, "Unit")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(FNOL_POM.AssureClaims_FNOL_Lst_Coverage, data.PolicyCoverage_Auto, "Bank Account On Payment Creation Screen")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(FNOL_POM.AssureClaims_FNOL_Lst_TypeOfLoss, data.PolicyLossCode, "Policy Coverage")
    await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_Save, "Save");
    //===============================================Add FNOL reserve-->for 2nd Claimant  completed Here==============================================================================================
    //===============================================Add FNOL reserve creation completed Here=========================================================================================================

    //===============================================Before Saving FNOL Reserve verify RESERVE CREATED column as 'No' started here==============================================================================================
    var RowMessage_ActualText = await FNOL_POM.AssureClaims_ClaimFNOLReserveSetUp_Data_getText.innerText;
    var RowMessage_ExpectedText = 'No'

    if (RowMessage_ActualText === RowMessage_ExpectedText)
      console.log(RowMessage_ActualText.yellow + " is match with " + RowMessage_ExpectedText.yellow + " Hence verification successful".green)
    else
      console.log(RowMessage_ActualText.yellow + " is not  match with" + RowMessage_ExpectedText.yellow + " Hence verification successful".green)
    //===============================================Before Saving FNOL Reserve verify RESERVE CREATED column as 'No' ended here==============================================================================================

    await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_SaveFNOL, "Save FNOL");
    await t.wait(5000)

    //==============================After Saving FNOL Reserve verify RESERVE CREATED column as 'YES' started here==============================================================================================
    var RowMessage_ActualText1=await FNOL_POM.AssureClaims_ClaimFNOLReserveSetUp_Data_getText.innerText;
    var RowMessage_ExpectedText1='Yes'
    if(RowMessage_ActualText1===RowMessage_ExpectedText1)
    console.log(RowMessage_ActualText1.yellow+ " is match with "+RowMessage_ExpectedText1.yellow+" Hence verification successful".green)
    else
    console.log(RowMessage_ActualText.yellow1+ " is not  match with"+RowMessage_ExpectedText1.yellow+" Hence verification successful".green)
    //==============================After Saving FNOL Reserve verify RESERVE CREATED column as 'Yes' completed here==============================================================================================

  
  });

  test('AssureClaims_FNOL_AddFNOLReserveOverCarrierClaimWithTwoClaimant_Test_04', async t => {

    await t.wait(5000)

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================

    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber1, "NA");

    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=======================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    
    /*===========================================================Verification of Fnol Reserve Creation for both Claimants Started Here========================================================================================================================================================================================================================================================================================================*/
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    
    await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, data.ReserveType, "Enter Reserve Type")
    await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchClaimant, data.ClaimantName, "Enter Claimant Name")
    await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, "Row exist for entered reserve and Claimant type")
    await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, data.ReserveType, "Enter Reserve Type")
    await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchClaimant, ClaimentLastName, "Enter Claimant Name")
    await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, "Row exist for entered reserve and Claimant type")
    
    /*===========================================================Verification of Fnol Reserve Creation for both Claimants Ended Here========================================================================================================================================================================================================================================================================================================*/
        //===============================================Logout from application started here======================================================================== 
    await t.switchToMainWindow()
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    console.log("Logout from Application!!")
    //================================================Logout from application completed here===========================================================================
    
    
  });


});

