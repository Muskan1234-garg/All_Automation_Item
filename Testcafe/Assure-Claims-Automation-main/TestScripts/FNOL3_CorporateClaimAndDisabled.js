import { Selector,Role } from 'testcafe';
import Colors from 'colors';

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'

import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_FNOL from '../Functional_POM/POM_FNOL';
import POM_GeneralSystemParameter from "../Functional_POM/POM_GeneralSystemParameter"
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';


const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const GenSysPar_POM=new POM_GeneralSystemParameter();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const ConfigMgr_POM = new POM_Config_Manager();


const Home_POM = new POM_Home();
const FNOL_POM=new POM_FNOL();


const DataAutoReg = require('../DataFiles/DataAutoRegDSN_3.json');
var d;
var StrClaimNumber1;

//Global Variable Declaration


//***********************************************************************************************************************************************
//JIRA ID OF STORY : RMA-94584, RMA-103318
//Description      : Create claim with Corporate financial key – Make sure no option for FNOL is available, Disable FNOL from Payment Parameters
//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : None
//PRE-REQUISITES   : None
//Preferred Server : 194Automation, DSN1 : RM202REG_Test3
//***********************************************************************************************************************************************


DataAutoReg.forEach(data => {
  const LoggedInUser = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
}, { preserveUrl: true }
);

const ConfigManagerLogin = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    await t.wait(5000)
    console.log("Login Into Configuration Manager Application!!".green)
}, { preserveUrl: true }
);

fixture `FNOL3_CorporateClaimAndDisabled`.beforeEach(async t => {
  await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
});

test('AssureClaims_FNOL_VerifyExistenceOfOptionAddFNOLReserve_Test_01', async t => {
       
    let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
        "MM/DD/yyyy"
      );
      //=====================================Corporate GC  Creation started here===================================================================================================================================
      let StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(
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
    //===============================================Claimant Creation started Here==============================================================================================
    let ClaimentLastName = await Function_Utility.AssureClaims_ClaimEventEntityAddition_Utility("Claimant", data.Country,data.State, "NA")
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===============================================Claimant Creation Completeed Here==============================================================================================
    
    //===============================================Existence Verification for 'Add FNOL Reserve' Started==============================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_LookupBtnOnGeneralClaimPage, "Look up button");
    await Verify_Utility.AssureClaims_ElementNotExist_Utility(FNOL_POM.AssureClaims_FNOL_Txt_AddFNOLReserve,"Add FNOL Reserve")
    //===============================================Existence Verification for 'Add FNOL Reserve' Completed==============================================================================================
  });

  
  
  test('AssureClaims_FNOL_ReversingUtilitySettingsForFNOL_Test_02', async t => {
    
      // =================================== Switching to Configuration Manager zone started==================================================================
      await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin);
      await t.wait(4000)

    // =================================== Switching to Configuration Manager zone Completed==================================================================
    // =================================== Navigating to Payment Parameters Page started===================================================
    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "More Configurations")
    // =================================== Navigating to Payment Parameters Page completed===================================================
    
    // =================================== Disabling “Use FNOL reserve” from Payment Parameters ===================================
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Chk_UseFNOLReserve, "UnCheck", "Use FNOL Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
    await t.wait(2000)
    
    // =================================== “Use FNOL reserve” Disabled in Payment Parameters ======================================

   // =================================== Switching to Claims zone started==================================================================
   await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
   // =================================== Switching to Claims zone completed==================================================================

    //=====================================Carrier Claim Creation started here===================================================================================================================================
     d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    console.log("AssureClaims_CarrierGCClaimCreation Function is Called To Create Carrier Claim".yellow);
    StrClaimNumber1 = await Function_Utility.AssureClaims_CarrierGCClaimCreation_SelectSecondUnit(d, d, data.GCCarrierClaimType_ProfessionalLiability, data.ClaimStatus, data.Department, data.GCPolicyLOB, data.PolicySystem, data.PolicyName)
    console.log("New Carrier General Claim is Created with Claim Number: ".green + StrClaimNumber1);
    //=====================================Carrier Claim Creation completed here===================================================================================================================================
    
    //===============================================Claimant Creation started Here==============================================================================================
    let ClaimentLastName = await Function_Utility.AssureClaims_ClaimEventEntityAddition_Utility("Claimant", data.Country,data.State, "NA")
    //===============================================Claimant Creation Completed Here==============================================================================================
        
    //===============================================Existence Verification for 'Add FNOL Reserve' Started==============================================================================================
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_LookupBtnOnGeneralClaimPage, "Look up button");
    await Verify_Utility.AssureClaims_ElementNotExist_Utility(FNOL_POM.AssureClaims_FNOL_Txt_AddFNOLReserve,"Add FNOL Reserve")
    //===============================================Existence Verification for 'Add FNOL Reserve' Completed==============================================================================================

    //===============================================Logout from application started here======================================================================== 
    await t.switchToMainWindow()
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    console.log("Logout from Application!!")
    //================================================Logout from application completed here===========================================================================
  });
});

