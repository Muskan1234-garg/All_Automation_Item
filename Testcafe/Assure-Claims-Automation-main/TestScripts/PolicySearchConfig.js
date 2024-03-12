import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';

import POM_Life_Claims from '../Functional_POM/POM_Life_Claims';
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';
import POM_PolySearchConfig from '../Functional_POM/POM_PolySearchConfig';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';

const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility(); 
const Function_Utility = new Functionality_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();

const PolicySearch_ConfigMgr = new POM_PolySearchConfig();
const Verification_Msg = new POM_VerificationMessage(); 
const Life_Claims = new POM_Life_Claims();
const Generic_Claims = new POM_Generic_Claims();

const DataIUT = require('../DataFiles/DataIUT.json');

//Global Variable Declaration...
var PolicyNumberLbl;
var StrLifeClaimNumber;
var SearchEntry;
var PolicyNumber_ConfigMgrLbl;

//***********************************************************************************************************************************************************************************************************
//JIRA ID OF STORY : RMA-97924
//Description : Verifying that the Policy Search Configuration Functionality is working properly for Policy Number checkbox control and control is showing at the time of policy search download
//AUTHOR : Shubham Rathod
//DEPENDANCY : No
//PRE-REQUISITE : No
//Preferred Server: IUT SQL 
//****************************************************************************************************************************************************************//
//==============================================================Login Code for Zone starts here =========================================================================================================================
DataIUT.forEach(data => {
        const ConfigManagerLogin = Role(data.URL , async t => {
        await t.maximizeWindow()
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    },{ preserveUrl: true }
    );

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

//==============================================================Login part of zone ends here =========================================================================================================================
fixture`PolicySearchConfig`.beforeEach(async t => {
});
//==============================================================Enabling the setting of policy number in the policy search configuration screen and verifying text & label in the screen starts here=========================================================================================================================
      test('PolicySearchConfiguration_Test_01' , async t => {
      await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin)
      await Nav_Utility.AssureClaims_ElementClick_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicyInterfaceSetting_Lnk_screen.withText('Policy Interface Setting'),'Clicking on the Policy Interface Setting screeen.')
      await t.wait(4000)
      await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_Configuration)
      await t.wait(4000)
      await Nav_Utility.AssureClaims_ElementClick_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_Lnk_screen,'Clicking on the search configuration section screen.')
      await t.wait(2000)
      await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_Chk_PolicyNum,'Check',"Checking the policy number checkbox.")
      await t.wait(2000)
      await Nav_Utility.AssureClaims_ElementClick_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_Btn_PolicyNumDefault.nth(3),'Clicking on the default btn of policy number..')
      await t.wait(2000)
      await Nav_Utility.AssureClaims_ElementClick_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_Btn_UnselectAll,"Clicking on the unselect all checkbox button.")
      await t.wait(2000)
      await Nav_Utility.AssureClaims_ElementClick_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_Btn_SelectAll,"Clicking on the select all checkbox.")
      await t.wait(2000)
      await In_Utility.AssureClaims_SetValue_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_Txt_PolyNum ,data.PolicyNumberRandom,"Inputting the values in the Policy Number textfield.")
      await t.wait(2000)
//===========================================================Verifying the text & Search Entry present in the search configuration screen Starts  here===========================================================
      const ele_Searchconfiglbl = PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_Txt_Screen.withText('Note: Use this page to select the fields you want to see in Policy System Download Search screen.').with({ visibilityCheck: true })
      await t.expect(ele_Searchconfiglbl.exists).ok('', { timeout: 20000 })
      console.log("Labels are being verified in search configuration screen: ".green);
      const ele_Searchconfiglbls = PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_Txt_Screen.withText('Once you have made all of your selections, click the "Save Configuration" button to store the settings').with({ visibilityCheck: true })
      await t.expect(ele_Searchconfiglbls.exists).ok('', { timeout: 20000 })
      console.log("Labels are being verified in search configuration screen: ".green);
      SearchEntry = await Function_Utility.AssureClaims_ScreenSearch_ConfigMgr(data.PolicyNumber_TxtBox)
      await t.wait(2000)
      console.log("Value of Search Entry :".green + SearchEntry.yellow);
      PolicyNumber_ConfigMgrLbl = await Verify_Utility.AssureClaims_AttributeFetch_Utility_InnerText(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_lbl_PolicyNum_ConfigMgr ,"Getting the Label txt of Policy Number label.")
      console.log("PolicyNumber_ConfigMgrLbl :".green + PolicyNumber_ConfigMgrLbl.cyan)
      await Verify_Utility.AssureClaims_VerifyElementValue_UtilityInnerText(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_lbl_PolicyNum_ConfigMgr ,SearchEntry, "verifying the policy number on policy search download..")
      await t.wait(3000)
      console.log("Verification of Search Entry in the Policy Search Configuration is done")
//===========================================================Verifying the text & Search Entry present in the search configuration screen Ends  here===========================================================
      await Nav_Utility.AssureClaims_ElementClick_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_btn_Save.withText("save"),"Clicking on the save button.")
      await t.wait(2000)
});
//==============================================================Enabling the setting of policy number in the policy search configuration screen and verifying text & label in the screen Ends here=========================================================================================================================
//==================================create life claim & verification of the setting in the PolicySearchConfig starts here================================================
      test('LifeClaimPolicySearch_Test_02', async t => {
      await t.setNativeDialogHandler(() => true).useRole(LoggedInUser)
      var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
      console.log("AssureClaims_LifeClaimCreation Function is Called To Create Claim".yellow);
      StrLifeClaimNumber = await Function_Utility.AssureClaims_LifeClaimCreation(d, d, data.ClaimStatus, data.LCClaimType, data.Department, data.LCPolicyLOB, data.LCMannerOfDeath, data.LCCauseOfDeath, data.EstateProbated, data.DeceasedMaritalStatus, data.SpouseLiving, data.PolicySystem, data.LifePolicyName)
      console.log("New Life Claim is Created with Claim Number: ".green + StrLifeClaimNumber);
//==================================================================Lifeclaimcreation done================================================================================
//==================================================================================Now opening the policy lookup==============================================
      await t.wait(4000)
      await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Tab_ClaimInfo, "Claim Info Tab Is Clicked");
      await t.wait(4000);
      await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyNameLookup, "Policy Name Lookup")
      await t.wait(4000);
      await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SubPolicyDownloadIframe)
      await t.wait(4000); 
//====================================================================LifeClaim Creation and opening policy lookup is Completed  Here ===============================================================================================================================================
      PolicyNumberLbl = await Verify_Utility.AssureClaims_AttributeFetch_Utility_InnerText(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_lbl_PolicyNum_Claimzone,"value of policy number label.");
      console.log("VerifyPolicyNumber  ".green + PolicyNumberLbl);
      await Verify_Utility.AssureClaims_VerifyElementValue_UtilityInnerText(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_lbl_PolicyNum_Claimzone ,data.PolicyNumberRandom, "verifying the policy number on policy search download.")
      await t.wait(3000)
      });
//=========================================================Create life claim & verification of the setting in the PolicySearchConfig ends here========================
//============================================Testcase for reverting the policy number setting of configuration manager start here =========================================================================
      test('RevertingPolicySearchConfigurationChanges_Test_03' , async t => {
      await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin)
      await Nav_Utility.AssureClaims_ElementClick_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicyInterfaceSetting_Lnk_screen.withText('Policy Interface Setting'),'Clicking on the Policy Interface Setting screeen.')
      await t.wait(8000)
      await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_Configuration)
      await t.wait(4000)
      await Nav_Utility.AssureClaims_ElementClick_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_Lnk_screen,'Clicking on the search configuration section screen.')
      await t.wait(2000)
      await Nav_Utility.AssureClaims_ElementClick_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_Btn_PolicyNumDefault.nth(3),'Clicking on the default btn of policy number.')
      await t.wait(7000)
      await In_Utility.AssureClaims_SetValue_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_Txt_PolyNum ,data.PolicyNumber_TxtBox,"Inputting the values in the Policy Number textfield.")
      await t.wait(2000)
      await Nav_Utility.AssureClaims_ElementClick_Utility(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_btn_Save.withText("save"),"Clicking on the save button.")
      await t.wait(3000)
      })
//============================================Testcase for reverting the policy number setting of configurationmanager Ends here =========================================================================
 //============================================Testcase for reverting the policy number setting of Claim zone start here zone===================================================================================     
      test('RevertLifeClaimPolicySearchChanges_Test_04', async t => {
      await t.setNativeDialogHandler(() => true).useRole(LoggedInUser)
      await t.wait(8000);
      await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrLifeClaimNumber, "NA");
      await t.wait(8000);
      await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe);
      await t.wait(5000);
      await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyNameLookup, "Policy Name Lookup")
      await t.wait(4000);
      await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SubPolicyDownloadIframe)
      await t.wait(7000);
      await Verify_Utility.AssureClaims_VerifyElementValue_UtilityInnerText(PolicySearch_ConfigMgr.AssureClaims_PolicySearchConfig_lbl_PolicyNum_Claimzone ,data.PolicyNumber_TxtBox, "verifying the policy number on policy search download.")
      await t.wait(5000)
      });
   });
});

 //============================================Testcase for reverting the policy number setting of Claim zone ends here zone===================================================================================     
 