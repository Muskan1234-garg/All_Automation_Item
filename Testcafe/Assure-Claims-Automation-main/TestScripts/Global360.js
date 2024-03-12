import { Selector,Role } from 'testcafe';

import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_Home from '../Functional_POM/POM_Home';
import POM_RFEScreen from "../Functional_POM/POM_RFEScreen";
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';

const Home_POM = new POM_Home();
const DataIUT = require('../DataFiles/DataIUT_ORA.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility=new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const GenSysPar_POM=new POM_GeneralSystemParameter();
const RFEScreen = new POM_RFEScreen();

var faker = require('faker');
var RepairerName =faker.name.lastName();
var RepairerEmail=faker.internet.email();
var StrClaimNumber;
//Global Variable Declaration


DataIUT.forEach(data => {
  fixture `Global360_Smoke`.beforeEach(async t => {
        await t.wait(5000)
        await t.navigateTo(data.URL);
        await t.maximizeWindow();
      });
       test('AssureClaims_Global360_Test_01', async t => {
         await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Utilities')
         console.log("Login Into Application!!".green)
         await t.wait(4000);
         /*==============Utility Setting for 360 GlobalNet ==============*/
         await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UtilitiesIframe);
         await t.wait(2000)
         await Nav_Utility.AssureClaims_ElementClick_Utility(GenSysPar_POM.AssureClaimsApp_Lnk_GenSysParaSetup.withText('General System Parameter Setup'),"Click on Genreal System Parameter Link")
         await t.wait(4000);
         await t.switchToMainWindow();
         await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GeneralSystemParameterSetupIframe);
         await t.wait(2000);
         await Nav_Utility.AssureClaims_ElementClick_Utility(GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Tab_SystemSettings,"Click on System Settings Button")
         await t.wait(2000)
         await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Chk_Use360Globalnet,'Check',"Check Use 360 Globalnet Integration Check Box")
         await In_Utility.AssureClaims_SetValue_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Lnk_360GlobalnetUrl,data.Global360Url,"360 Globalnet Url")
         await In_Utility.AssureClaims_SetValue_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Lnk_360GlobalnetToken,data.Global360Token,"360 Globalnet Token")
         await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Click on Utilities Save Button")
         await t.wait(4000);  
      
       });
      
      test('AssureClaims_Global360_Test_02', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Claims')
        console.log("Login Into Application!!".green)
        await t.wait(4000);
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        /*======Claim Creation Started Here====================*/
        console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
        StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("New General Claim is Created with Claim Number: ".green + StrClaimNumber);
        /*==============Claim Creation  completed ==============*/ 
        await t.wait(4000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(RFEScreen.AssureClaims_RFE_morebtn, "Three Dot Button On Claim ToolBar")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(RFEScreen.AssureClaims_ClaimScan_ClickRFEButton,"Request for Evidence Option From The List")
        await t.wait(4000)
        /*============== Request for Evidence screen is opened in Pop Up Window================*/
        await Nav_Utility.AssureClaims_ElementClick_Utility(RFEScreen.AssureClaims_RFE_ConfirmBtn,"Confirm Button for not 360 Globalnet initiated Claim")
        await t.wait(8000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_RFEScreenIframe);
        await t.wait(4000)
        /*==============Steps for Request for Evidence ================*/
        await Nav_Utility.AssureClaims_ElementClick_Utility(RFEScreen.AssureClaims_RFE_BrandListBtn,"Brand List dropdown button")
        await t.wait(8000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(RFEScreen.AssureClaims_RFE_BrandList,"Brand List")
        await Nav_Utility.AssureClaims_ElementClick_Utility(RFEScreen.AssureClaims_RFE_TemplateListBtn,"Template list dropdown button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(RFEScreen.AssureClaims_RFE_TemplateList,"Template list")
        await t.wait(4000)
        await In_Utility.AssureClaims_SetValue_Utility(RFEScreen.AssureClaims_RFE_RepairerName,RepairerName,"DI Repairer Name")
        await t.wait(2000); 
        await In_Utility.AssureClaims_SetValue_Utility(RFEScreen.AssureClaims_RFE_RepairerEmail,RepairerEmail,"DI Repairer Email")
        await t.wait(2000); 
        await Nav_Utility.AssureClaims_ElementClick_Utility(RFEScreen.AssureClaims_RFE_SaveButton,"RFE Save Button")
        await t.wait(4000); 
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(RFEScreen.AssureClaims_RFE_BrandListLabel,"Brand List option not availabel")
        await t.wait(2000); 
        await Nav_Utility.AssureClaims_ElementClick_Utility(RFEScreen.AssureClaims_RFE_TemplateListBtn,"Template list dropdown button")
        await t.wait(2000)
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(RFEScreen.AssureClaims_RFE_TemplateList,"DI_Motor_Invoice is not available in Template List")
        await t.wait(2000)
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("LoggedOut!!".green)
      });
});
