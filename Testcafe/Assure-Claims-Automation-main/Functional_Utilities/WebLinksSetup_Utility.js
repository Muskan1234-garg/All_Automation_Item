import { Selector, t } from 'testcafe';
import { ClientFunction } from 'testcafe';
import POM_Login from '../Functional_POM/POM_Login';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Document_Event from '../Functional_POM/POM_Document_Event';
import POM_Arbitration from '../Functional_POM/POM_Arbitration';
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';
import POM_Property_Claims from '../Functional_POM/POM_Property_Claims';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_VehicleAccident_Claims from '../Functional_POM/POM_VehicleAccident';
import POM_WorkersComp_Claims from '../Functional_POM/POM_WorkersComp_Claims';
import POM_CaseManagement from '../Functional_POM/POM_CaseManagement';
import POM_BankAccount from '../Functional_POM/POM_BankAccount';
import POM_DiaryUtilities from '../Functional_POM/POM_DiaryUtilities';
import POM_Claimant from '../Functional_POM/POM_Claimant';
import POM_Defendant from '../Functional_POM/POM_Defendant';
import POM_Adjuster from '../Functional_POM/POM_Adjuster';
import POM_Subrogation from '../Functional_POM/POM_Subrogation';
import POM_Litigation from '../Functional_POM/POM_Litigation';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_ClaimComment from '../Functional_POM/POM_ClaimComment';
import POM_CommentSummary from '../Functional_POM/POM_CommentSummary';
import POM_ScheduleCheck from '../Functional_POM/POM_ScheduleCheck';
import POM_DiaryList from '../Functional_POM/POM_DiaryList';
import POM_MedicalStaff from '../Functional_POM/POM_MedicalStaff';
import POM_Life_Claims from '../Functional_POM/POM_Life_Claims';
import Input_Utility from './Input_Utility'
import Verification_Utility from './Verification_Utility'
import Navigation_Utility from './Navigation_Utility'
import GenericUsages_Utility from './GenericUsages_Utility';
import POM_SMS from '../Functional_POM/POM_SMS';
import POM_Enhanced_Notes from '../Functional_POM/POM_Enhanced_Notes';
import POM_ClaimScan from '../Functional_POM/POM_ClaimScan';
import POM_PremonitionApp from '../Functional_POM/POM_PremonitionApp';
import POM_Search from '../Functional_POM/POM_Search'
import POM_AttachCreateDiary from "../Functional_POM/POM_AttachCreateDiary";
import POM_CombinedPayment from "../Functional_POM/POM_CombinedPayment";
import POM_Quotation from '../Functional_POM/POM_Quotation';
import POM_PropertyLoss from '../Functional_POM/POM_PropertyLoss';
import POM_Tokens from '../Functional_POM/POM_Tokens';
import POM_DisabilityPlanManagement from '../Functional_POM/POM_DisabilityPlanManagement'
import POM_WorkLossRestriction from '../Functional_POM/POM_WorkLossRestriction';
import POM_PowerView from '../Functional_POM/POM_PowerView';
import POM_DC from '../Functional_POM/POM_DataCollection';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

import POM_PolySearchConfig from '../Functional_POM/POM_PolySearchConfig';
import POM_AdminTracking from '../Functional_POM/POM_AdminTracking';
import POM_Okta from '../Functional_POM/POM_Okta'
import POM_QueryDesigner from '../Functional_POM/POM_QueryDesigner';

const PolicySearch_ConfigMgr = new POM_PolySearchConfig();
const Enhanced_Note = new POM_Enhanced_Notes();
const Combined_POM = new POM_CombinedPayment();
const AttachCreateDiary_POM = new POM_AttachCreateDiary();
const Search_POM = new POM_Search();
const POM_LoginPOM = new POM_Login();
const Home_POM = new POM_Home();
const Event_POM = new POM_Document_Event();
const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const Arbitration_POM = new POM_Arbitration();
const Generic_Claims = new POM_Generic_Claims();
const Property_Claims = new POM_Property_Claims();
const Generic_Utility = new GenericUsages_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const Verification_Msg = new POM_VerificationMessage();
const Diary_Creation = new POM_DiaryList();
const Medstaff_POM = new POM_MedicalStaff();
const Claimant_POM = new POM_Claimant();
const CaseMgt_POM = new POM_CaseManagement();
const Adjuster_POM = new POM_Adjuster();
const Defendant_POM = new POM_Defendant();
const Subrogation_POM = new POM_Subrogation();
const Litigation_POM = new POM_Litigation();
const Payment_POM = new POM_PaymentsCollections();
const Comment_Creation = new POM_ClaimComment();
const Claim_Comment_Summary = new POM_CommentSummary();
const ScheduleCheck_POM = new POM_ScheduleCheck();
const Vehicle_Accident = new POM_VehicleAccident_Claims();
const WorkersComp_Claims = new POM_WorkersComp_Claims();
const BankAccount_POM = new POM_BankAccount();
const SMS_POM = new POM_SMS();
const Diary_Utilities = new POM_DiaryUtilities();

const ClaimScan = new POM_ClaimScan();
const Premonition_App = new POM_PremonitionApp();

const PropertyLoss_POM = new POM_PropertyLoss();
const Quotation_POM = new POM_Quotation();
const Tokens_POM = new POM_Tokens();
const DisabilityPlan_Utility = new POM_DisabilityPlanManagement();
const Life_Claims = new POM_Life_Claims();
const WorkLoss_POM = new POM_WorkLossRestriction();
const PowerView_POM = new POM_PowerView();
const POM_DataCollection = new POM_DC();
const ConfigMgr_POM = new POM_Config_Manager();
const AdminTracking_POM =new POM_AdminTracking();
const Okta_POM = new POM_Okta();
const QueryDesigner_POM = new POM_QueryDesigner();

var faker = require('faker');

class WebLinksSetup_Utility {
    constructor() { }
    
//     async AssureClaims_LoginIntoApplication_Utility(Username, Password, DSN, Zone) {
//         await In_Utility.AssureClaims_SetValue_Utility(POM_LoginPOM.AssureClaims_Login_LoginUserNameTextbox, Username, "UserName Textbox")
//         await t.pressKey('tab')
//         await In_Utility.AssureClaims_SetValueForUserAndPassword_Utility(POM_LoginPOM.AssureClaims_Login_LoginPasswordTextbox, Password, "Password Textbox")
//         await t.pressKey('enter')
//         await t.wait(4000)
//         // await Verify_Utility.AssureClaims_ElementExist_Utility(POM_LoginPOM.AssureClaims_Login_DSNComboBoxSelect)
//         await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_DSNComboBoxSelect, "DSN Combobox")
//         await t.wait(2000)
//         await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_DSNSelection.withText(DSN), DSN + ": Value Of DSN")
//         await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_ZoneComboBoxSelect, "Zone Combobox")
//         await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_ZoneSelection.withText(Zone), Zone + ": Value Of Zone")
//         await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_ContinueButtonOnLogin, "Continue Button On DSN selection Screen")
//         //await Verify_Utility.AssureClaims_ElementExist_Utility(POM_LoginPOM.AssureClaims_Login_RecentViewedIcon)
//     }
	
	//************************************************************************************************************************************************************************************************************************************************************************************

    	//JIRA ID OF STORY   : RMA-107123

    	//Description        : It is used for Login to DXC Assure Claims irrespective of landing page setting is on or off.

    	//Input Parameters   : StrUserName : UserName textbox value , StrPassword : Password textbox value , StrDSN : DSN name to select in DSN dropdown list , StrZone : Zone Name in dropdown list incase Landing Page setting is OFF and Card Name in case Landing Page setting is ON

    	//Revision           : 0.0 Parul Sharma 06-10-2023

    	// ***********************************************************************************************************************************************************************************************************************************************************************************
	
	async AssureClaims_LoginIntoApplication_Utility(strUserName, strPassword, strDSN, strZone) {
        var strContinuebuttonvisible;
        await In_Utility.AssureClaims_SetValue_Utility(POM_LoginPOM.AssureClaims_Login_LoginUserNameTextbox, strUserName, "UserName Textbox")
        await t.pressKey('tab')
        await In_Utility.AssureClaims_SetValueForUserAndPassword_Utility(POM_LoginPOM.AssureClaims_Login_LoginPasswordTextbox, strPassword, "Password Textbox")
        await t.pressKey('enter')
        await t.wait(4000)
        strContinuebuttonvisible = await (POM_LoginPOM.AssureClaims_Login_ContinueButtonOnLogin).exists
        //========================================================== If continue button is present : Old Login Page started here ==================================================================
        if (strContinuebuttonvisible){
            console.log("Landing Page Setting is : False");
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_DSNComboBoxSelect, "DSN Combobox")
            await t.wait(2000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_DSNSelection.withText(strDSN), strDSN + ": Value Of DSN")
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_ZoneComboBoxSelect, "Zone Combobox")
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_ZoneSelection.withText(strZone), strZone + ": Value Of Zone")
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_ContinueButtonOnLogin, "Continue Button On DSN selection Screen")
        }
        //========================================================== If continue button is present : Old Login Page ended here ==================================================================
        //========================================================== If continue button is not present : New Login Page started here ==================================================================
        else {
            console.log("Landing Page Setting is : True");
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_Landingpage_DSNComboBoxSelect, "DSN Combobox")
            await t.wait(2000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_Landingpage_DSNSelection.withText(strDSN), strDSN + ": Value Of DSN")
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_Landingpage_ZoneSelectionCard.withText(strZone), strZone + ": Value Of Zone")
        }
        //========================================================== If continue button is not present : New Login Page ended here ==================================================================
    }
	
	
    //************************************************************************************************************************************************************************************************************************************************************************************

    //JIRA ID OF STORY   : RMA-109420

    //Description        : It is used for Login to Okta page and then DXC Assure Claims irrespective of landing page setting is on or off.

    //Input Parameters   : strURL: URL of okta enabled Assure Claims Environment, strOktaUserName : Okta UserName textbox value , strOktaPassword : Okta Password textbox value , strDSN : DSN name to select in DSN dropdown list , strZone : Zone Name in dropdown list incase Landing Page setting is OFF and Card Name in case Landing Page setting is ON

    //Revision           : 0.0 Tushar Bachchan 23-01-2024

    // ***********************************************************************************************************************************************************************************************************************************************************************************

    async AssureClaims_LoginIntoApplicationUsingOkta_Utility(strURL, strOktaUserName, strOktaPassword, strDSN, strZone) {
        // Hit Okta URL and filling credentials
        await t.navigateTo("https://dev-447259.oktapreview.com");
        await t.maximizeWindow()
        await In_Utility.AssureClaims_SetValue_Utility(Okta_POM.AssureClaims_Okta_Txt_UserNameTextBox, strOktaUserName, "Okta Login Box");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Okta_POM.AssureClaims_Okta_Btn_Next, "Next Button");

        await In_Utility.AssureClaims_SetValueForUserAndPassword_Utility(Okta_POM.AssureClaims_Okta_Txt_PasswordTextBox, strOktaPassword, "Okta Password Box");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Okta_POM.AssureClaims_Okta_Btn_SignIn, "Sign in Button");
        
        await t.wait(2000)
        await t.navigateTo(strURL);
        await t.maximizeWindow()
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Authentication_Btn_Okta, "Okta Option");
        await t.wait(10000)

        let strContinuebuttonvisible = await (POM_LoginPOM.AssureClaims_Login_ContinueButtonOnLogin).exists
        //========================================================== If continue button is present : Old Login Page started here ==================================================================
        if (strContinuebuttonvisible){
            console.log("Landing Page Setting is : False");
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_DSNComboBoxSelect, "DSN Combobox")
            await t.wait(2000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_DSNSelection.withText(strDSN), strDSN + ": Value Of DSN")
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_ZoneComboBoxSelect, "Zone Combobox")
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_ZoneSelection.withText(strZone), strZone + ": Value Of Zone")
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_ContinueButtonOnLogin, "Continue Button On DSN selection Screen")
        }
        //========================================================== If continue button is present : Old Login Page ended here ==================================================================
        //========================================================== If continue button is not present : New Login Page started here ==================================================================
        else {
            console.log("Landing Page Setting is : True");
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_Landingpage_DSNComboBoxSelect, "DSN Combobox")
            await t.wait(2000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_Landingpage_DSNSelection.withText(strDSN), strDSN + ": Value Of DSN")
            await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Login_Landingpage_ZoneSelectionCard.withText(strZone), strZone + ": Value Of Zone")
        }
        //========================================================== If continue button is not present : New Login Page ended here ==================================================================

    }

    async AssureClaims_GeneralClaimCreation(GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, GenClaimCreation_Txt_PolicyLOB) {
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:General Claim");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(5000);
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent, GenClaimCreation_Txt_DateOfEvent, "Date Of Event")
        await t.wait(1000);
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfClaim, GenClaimCreation_Txt_DateOfClaim, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept, GenClaimCreation_Txt_Department, "Department")
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele1 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText(GenClaimCreation_Txt_ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Claim Status Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimType, "Claim Type Lookup")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, GenClaimCreation_Txt_ClaimType, "Description Search Textbox On General Claim Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On General Claim Creation Screen");
        const ele2 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withExactText(GenClaimCreation_Txt_ClaimType).with({ visibilityCheck: true })
        await t.expect(ele2.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele2, "Claim Type Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele3 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectPolicyLOB.withExactText(GenClaimCreation_Txt_PolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele3.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele3, "Policy LOB Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");

        var StrClaimNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        // claim_number = ""'
        return StrClaimNumber;
    }

    async AssureClaims_LifeClaimCreation(LifeClaimCreation_Txt_DateOfClaim, LifeClaimCreation_Txt_DateOfEvent, LifeClaimCreation_Txt_ClaimStatus,
        LifeClaimCreation_Txt_ClaimType, LifeClaimCreation_Txt_Client, LifeClaimCreation_Txt_PolicyLOB, LifeClaimCreation_Txt_MannerofDeath,
        LifeClaimCreation_txt_CauseOfDeath, LifeClaimCreation_txt_EstateProbated, LifeClaimCreation_txt_DeceasedMaritalStatus, LifeClaimCreation_txt_SpouseLiving
        , GenClaimCreation_Lst_PolicySystem, LifePolicyName) {
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Life Claim");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe);
        await t.wait(5000);
        await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_LifeClaim_Txt_DateOfEvent, LifeClaimCreation_Txt_DateOfEvent, "Date Of Event")
        await t.wait(1000);
        await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_LifeClaim_Txt_DateOfClaim, LifeClaimCreation_Txt_DateOfClaim, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_LifeClaim_Txt_ClaimInfo_Client, LifeClaimCreation_Txt_Client, "Client")
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele1 = Life_Claims.AssureClaims_LifeClaim_Lnk_SelectClaimStatus.withText(LifeClaimCreation_Txt_ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Claim Status Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele2 = Life_Claims.AssureClaims_LifeClaim_Lnk_SelectClaimType.withExactText(LifeClaimCreation_Txt_ClaimType).with({ visibilityCheck: true })
        await t.expect(ele2.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele2, "Claim Type Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele3 = Life_Claims.AssureClaims_LifeClaim_Lnk_SelectPolicyLOB.withExactText(LifeClaimCreation_Txt_PolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele3.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele3, "Policy LOB Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Btn_MannerOfDeathLookup, "Manner of Death Lookup")
        const ele4 = Life_Claims.AssureClaims_LifeClaim_Lnk_SelectMannerOfDeath.withText(LifeClaimCreation_Txt_MannerofDeath).with({ visibilityCheck: true })
        await t.expect(ele4.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4, "Manner Of Death Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Btn_CauseOfDeath, "Cause of Death Lookup")
        const ele5 = Life_Claims.AssureClaims_LifeClaim_Lnk_CauseOfDeath.withText(LifeClaimCreation_txt_CauseOfDeath).with({ visibilityCheck: true })
        await t.expect(ele5.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele5, "Cause Of Death Option")

        await t.wait(4000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyNameLookup, "Policy Name Lookup")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicyLookup, "Policy System List")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicyName.withText(GenClaimCreation_Lst_PolicySystem), "Select Policy System List")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SubPolicyDownloadIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_SubmitQuery, "Submit Query Button")
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_LifeClaim_Lnk_PolicySearch, LifePolicyName, "Policy Name Is Searched")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Lnk_InternalPolicyName, LifePolicyName, "Policy Name")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyPreview, "Right Click On Policy Preview")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_List.withText('Interest List'), "Open Interest List tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_InterestListClaimant, "Check Claimant")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_List.withText('Unit List'), "Open Unit List tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_UnitList, "Check Unit List")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_PolicyProperty, "Check Policy Property List")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicySave, "Save Internal Policy")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyDownload, "Download Policy")
        await t.wait(8000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe)

        await t.wait(4000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Tab_AdditionalClaimInfo, "Additional Claim Info Tab Is Clicked");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Btn_EstateProbated, "Estate Probated Lookup")
        const ele6 = Life_Claims.AssureClaims_LifeClaim_Lnk_EstateProbated.withText(LifeClaimCreation_txt_EstateProbated).with({ visibilityCheck: true })
        await t.expect(ele6.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele6, "Estate Probated Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Btn_DeceasedMaritalStatus, "Deceased Marital Status Lookup")
        const ele7 = Life_Claims.AssureClaims_LifeClaim_Lnk_DeceasedMaritalStatus.withText(LifeClaimCreation_txt_DeceasedMaritalStatus).with({ visibilityCheck: true })
        await t.expect(ele7.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele7, "Deceased Marital Status Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_LifeClaim_Btn_SpouseLiving, "Deceased Marital Status Lookup")
        const ele8 = Life_Claims.AssureClaims_LifeClaim_Lnk_SpouseLiving.withText(LifeClaimCreation_txt_SpouseLiving).with({ visibilityCheck: true })
        await t.expect(ele8.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele8, "Spouse Living Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Life Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " Life Claim Creation Screen");

        var StrLifeClaimNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        return StrLifeClaimNumber;
    }

    async AssureClaims_PropertyClaimCreation(PropertyClaimCreation_Txt_DateOfClaim, PropertyClaimCreation_Txt_DateOfEvent, PropertyClaimCreation_Txt_ClaimStatus, PropertyClaimCreation_Txt_ClaimType, PropertyClaimCreation_Txt_Department, PropertyClaimCreation_Txt_PolicyLOB, PropertyId) {
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Property Claim")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_ClaimPCIframe);
        await t.wait(5000);
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_DateOfEvent, PropertyClaimCreation_Txt_DateOfEvent, "Date Of Event")
        await t.wait(1000);
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_DateOfClaim, PropertyClaimCreation_Txt_DateOfClaim, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_ClaimInfo_Dept, PropertyClaimCreation_Txt_Department, "Department")
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele_PCStatus = Property_Claims.AssureClaims_PropertyClaim_Lnk_SelectClaimStatus.withText(PropertyClaimCreation_Txt_ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele_PCStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_PCStatus, "Claim Status Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele_PCType = Property_Claims.AssureClaims_PropertyClaim_Lnk_SelectClaimType.withExactText(PropertyClaimCreation_Txt_ClaimType).with({ visibilityCheck: true })
        await t.expect(ele_PCType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_PCType, "Claim Type Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const elePCPolicyLOB = Property_Claims.AssureClaims_PropertyClaim_Lnk_SelectPolicyLOB.withExactText(PropertyClaimCreation_Txt_PolicyLOB).with({ visibilityCheck: true })
        await t.expect(elePCPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(elePCPolicyLOB, "Policy LOB Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Tab_PropertyInfo, "Property Info Tab On Property Claim Creation Page")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_PropertyId, "Property Id Look Up Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_PrportyIdSearchFrame);
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_SearchPropertyId, PropertyId, "Property ID Text Box On Property Lookup")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_SearchCriteria_Btn_SubmitQuery, "Search Image On Property Search Window")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.PropertyClaimCreation_Txt_PropertyId.withText(PropertyId), "Property Id Link On Property Selection Window")
        await t.wait(2000);
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_ClaimPCIframe)

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Property Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " Property Claim Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Tab_ClaimInfo, "Claim Info Tab On Property Claim Creation Page")
        var StrClaimNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");

        return StrClaimNumber;
    }

    async AssureClaims_EventCreation(EventCreation_Txt_DateOfEvent, EventCreation_Txt_DateReported, EventCreation_Txt_EventStatus, EventCreation_Txt_EventType, EventCreation_Txt_Department) {
        var StrEventNumber;
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Event")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_EventFrame);
        //await t.switchToIframe(Event_POM.AssureClaims_EventCreation_EventIframe)
        await t.wait(7000)
        await In_Utility.AssureClaims_SetValue_Utility(Event_POM.AssureClaims_EventCreation_Txt_DateOfEvent, EventCreation_Txt_DateOfEvent, "Date Of Event")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_EventCreation_Txt_TimeOfEvent, "Time Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Event_POM.AssureClaims_EventCreation_Txt_DateReported, EventCreation_Txt_DateReported, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_EventCreation_Txt_TimeReported, "Time Reported")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_EventCreation_Txt_EventStatus, "Event Status Lookup")
        const ele_EventStatus = Event_POM.AssureClaims_EventCreation_Txt_SelectEventStatus.withText(EventCreation_Txt_EventStatus)
        await t.expect(ele_EventStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_EventStatus, "Event Status Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_EventCreation_Txt_EventType, "Event type Lookup")
        const ele_EventType = Event_POM.AssureClaims_EventCreation_Txt_SelectEventType.withText(EventCreation_Txt_EventType)
        await t.expect(ele_EventType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_EventType, "Event Type Option")

        await In_Utility.AssureClaims_SetValue_Utility(Event_POM.AssureClaims_EventCreation_Txt_ClaimInfo_Dept, EventCreation_Txt_Department, "Department selected")
        await t.pressKey('tab')
        //await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_EventCreation_Btn_Save,"Event Saved")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Event creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Event Save");
        StrEventNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Event_POM.AssureClaims_EventCreation_Txt_EventNumber, "value");
        // claim_number = ""'
        return StrEventNumber;

    }

    async AssureClaims_VehicleAccidentClaimCreation(VAClaimCreation_Txt_DateOfClaim, VAClaimCreation_Txt_DateOfEvent, VAClaimCreation_Txt_ClaimStatus, VAClaimCreation_Txt_ClaimType, VAClaimCreation_Txt_Department, VAClaimCreation_Txt_PolicyLOB) {
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Vehicle Accident");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_VehicleAccident_ClaimVCIframe);
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_DateOfEvent, VAClaimCreation_Txt_DateOfEvent, "Date Of Event")
        await t.wait(1000);
        await In_Utility.AssureClaims_SetValue_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_DateOfClaim, VAClaimCreation_Txt_DateOfClaim, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_ClaimInfo_Dept, VAClaimCreation_Txt_Department, "Department")
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele_VehClaimStatus = Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Lnk_SelectClaimStatus.withText(VAClaimCreation_Txt_ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele_VehClaimStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_VehClaimStatus, "Claim Status Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele_VehClaimType = Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Lnk_SelectClaimType.withExactText(VAClaimCreation_Txt_ClaimType).with({ visibilityCheck: true })
        await t.expect(ele_VehClaimType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_VehClaimType, "Claim Type Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele_VehPolicyLOB = Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Lnk_SelectPolicyLOB.withExactText(VAClaimCreation_Txt_PolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele_VehPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_VehPolicyLOB, "Policy LOB Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
        var StrClaimNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");

        return StrClaimNumber;

    }

    async AssureClaims_WorkersCompClaimCreation(WCClaimCreation_Txt_DateOfClaim, WCClaimCreation_Txt_DateOfEvent, WCClaimCreation_Txt_ClaimStatus, WCClaimCreation_Txt_ClaimType, WCClaimCreation_Txt_Department, WCClaimCreation_Txt_PolicyLOB, WCClaimCreation_Txt_Jurisdiction) {
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Workers’ Comp");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);

        //await t.typeText(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent, GenClaimCreation_Txt_DateOfEvent).setTestSpeed(0.6)
        await t.wait(5000);
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_DateOfEvent, WCClaimCreation_Txt_DateOfEvent, "Date Of Event")
        await t.wait(1000);
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_DateOfClaim, WCClaimCreation_Txt_DateOfClaim, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_ClaimInfo_Dept, WCClaimCreation_Txt_Department, "Department")
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Btn_ClaimStatus, "Claim Status Lookup")
        const ele1_WCClaimStatus = WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Lnk_SelectClaimStatus.withText(WCClaimCreation_Txt_ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele1_WCClaimStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele1_WCClaimStatus, "Claim Status Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Btn_ClaimType, "Claim Type Lookup")
        const ele2_WCClaimType = WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Lnk_SelectClaimType.withExactText(WCClaimCreation_Txt_ClaimType).with({ visibilityCheck: true })
        await t.expect(ele2_WCClaimType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele2_WCClaimType, "Claim Type Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele3_WCPolicyLOB = WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Lnk_SelectPolicyLOB.withExactText(WCClaimCreation_Txt_PolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele3_WCPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele3_WCPolicyLOB, "Policy LOB Option")

        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims__Select_EmployeeNum, "111111111", "Empolyee Number")
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Btn_Jurisdiction, "Policy LOB Lookup")
        const ele4_WCJurisdiction = WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Lnk_Jurisdiction.withText(WCClaimCreation_Txt_Jurisdiction).with({ visibilityCheck: true })
        await t.expect(ele4_WCJurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_WCJurisdiction, "Policy LOB Option")


        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Tab_Employeeinfo, "WC Empolyee Info Tab")



        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " Worker's Compensation Creation Screen");
        var StrWCClaimNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Txt_Claimnumber, "value");
        return StrWCClaimNumber;

    }

    async AssureClaims_Reserve_Utility(ReserveType, AmountType, ReserveStatus) {

        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_AddReserve, "Add Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType, "Reserve Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType.find('option').withText(ReserveType), "Reserve Type")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_ReserveAmount, AmountType.toString(), "Amount Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_Status, "Reserve Status")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_Status.find('option').withText(ReserveStatus), "Reserve Status")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Reserve Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Reserve Creation Screen");
    }

    async AssureClaims_PaymentCorpAddition_Utility(BankAccount, payeetype, lastname, transactiontype, amounttype) {
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
        await t.wait(2000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, BankAccount, "Bank Account On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(payeetype), "Payee Payor Type Value On Payment Creation Screen")
        await t.wait(3000)
        if(payeetype !== 'C-Claimant'){
            await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, lastname, "Last Name Text Box On Payment Creation Screen")
            await t.wait(3000)
            await t.pressKey('tab')
        }
        else{
            await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ClaimantLastName, lastname, "Last Name Text Box On Payment Creation Screen")
            await t.wait(3000)
            await t.pressKey('tab')
        }
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(transactiontype), "Transaction Type Value On Funds Split Detail Screen")

        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, amounttype, "Transaction Amount On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")

        // await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FinalTransaction_Save,"save transaction")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        // await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
        var StrControlNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber, "value");
        console.log("StrControlNumber is :" + StrControlNumber);
        return StrControlNumber
    }

    async AssureClaims_CollectionCorpAddition_Utility(BankAccount, payeetype, lastname, reservetype, transactiontype, amounttype) {

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_AddCollection, "Add collection Button On Payment Creation Screen")
        await t.wait(2000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, BankAccount, "Bank Account On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(payeetype), "Payee Payor Type On Payment Creation Screen")
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, lastname, "Last Name Text Box On Payment Creation Screen")
        await t.wait(3000)
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")

        if (reservetype != "NA") {
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType, "Reserve Type List On Funds Split Detail Screen")
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType.find('option').withText(reservetype), "Transaction Type Value On Funds Split Detail Screen")
        }

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen");
        await t.wait(4000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(transactiontype), "Transaction Type Value On Funds Split Detail Screen")

        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, amounttype, "Transaction Amount On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")

        // await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FinalTransaction_Save,"save transaction")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    }

    async AssureClaims_ScheduleCheck_Creation(NumberOfPayments, PayInterval, BankAccount, DistributionType, PayeeType, LastName, TransactionType, TransactionAmount) {



        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Btn_ScheduleCheck, "ScheduleCheck Button on Financial Reserve Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Txt_NumberOfPayments, "Number Of Payments")
        await t.pressKey('ctrl+a delete')
        await In_Utility.AssureClaims_SetValue_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Txt_NumberOfPayments, NumberOfPayments, "Total Payments")
        await t.wait(5000)
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Btn_PayIntervalLookup, "PayInterval Lookup")

        const ele_PayInterval = ScheduleCheck_POM.AssureClaims_ScheduleCheck_Lnk_PayInterval.withText(PayInterval).with({ visibilityCheck: true })
        await t.expect(ele_PayInterval.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_PayInterval, "PayInterval Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Lst_BankAccount, "BankAccount DropDown")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Select_BankAccount.withText(BankAccount), "BankAccount")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Btn_DistributionTypeLookup, "DistributionType Lookup")

        const ele_DistType = ScheduleCheck_POM.AssureClaims_ScheduleCheck_Lnk_DistributionType.withText(DistributionType).with({ visibilityCheck: true })
        await t.expect(ele_DistType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_DistType, "DistributionType Option")

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Lst_PayeeType, PayeeType, "Payee Type DropDown")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Select_PayeeType.withText(PayeeType),"PayeeType")

        await In_Utility.AssureClaims_SetValue_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Txt_LastName, LastName, "LastName")
        await t.wait(3000)
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Tab_DetailedInformation, "click on DetailedInformation")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Btn_AddNew, "AddNew")
	            await In_Utility.AssureClaims_ElementWebListSelect_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Btn_TransactionTypeLookup, TransactionType, "TransactionType DropDown")
//         await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Btn_TransactionTypeLookup, "TransactionType Lookup")

//         const ele_TransType = ScheduleCheck_POM.AssureClaims_ScheduleCheck_Select_Lnk_TransactionType.withText(TransactionType).with({ visibilityCheck: true })
//         await t.expect(ele_TransType.exists).ok('', { timeout: 20000 })
//         await Nav_Utility.AssureClaims_ElementClick_Utility(ele_TransType, "TransactionType Option")

        await In_Utility.AssureClaims_SetValue_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Txt_TransactionAmount, TransactionAmount, "TransactionAmount")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On ScheduleCheck creation Screen");

        // await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "ScheduleCheck Creation Screen");

        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Tab_ScheduleCheck, "GoTo ScheduleCheck Tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On ScheduleCheck creation Screen");
        // await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "ScheduleCheck Creation Screen");
    }

    async AssureClaims_CommentAddition_Utility() {
        await Nav_Utility.AssureClaims_ElementClick_Utility(Comment_Creation.AssureClaims_Comment_ClickComment, "Comment Button On Claim Creation Screen");
        await t.wait(2000);
        // await t.switchToIframe(Comment_Creation.Assureclaims_Comment_switchtoIframe)
        //await t.wait(2000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_CommentFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Comment_Creation.AssureClaims_Comment_Txt_TextEditor, "")
        await t.pressKey('ctrl+a delete')
        await In_Utility.AssureClaims_SetValue_Utility(Comment_Creation.AssureClaims_Comment_Txt_TextEditor, "abc test", "type comment");

        await Nav_Utility.AssureClaims_ElementClick_Utility(Comment_Creation.AssureClaims_Comment_Btn_Save, "Save Button On Comment Creation Screen");
        //await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Comment Creation Screen");
        // await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Comment Creation Screen");

        await Nav_Utility.AssureClaims_ElementClick_Utility(Comment_Creation.AssureClaims_Comment_Btn_Cancel, "Cancle Button On Comment Creation Screen");
        await t.wait(2000);
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        // await t.switchToIframe(Comment_Creation.AssureClaims_Comment_ClaimGCIframe)
        //await t.wait(2000);
    }

    async AssureClaims_ClaimCommentSummary_Utility() {

        await Nav_Utility.AssureClaims_ElementClick_Utility(Claim_Comment_Summary.AssureClaims_CommentSummary_Lst_CommentSummary, "Comment Summary Button On Claim Screen");
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Claim_Comment_Summary.AssureClaims_CommentSummary_ClaimCommentSummary, "Comment Summary Option From The List")
        await t.wait(2000);
        // await t.switchToIframe(Claim_Comment_Summary.Assureclaims_CommentSummary_switchtoIframe)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_CommentSummaryFrame);
        await t.wait(2000);
        //await console.log(Claim_Comment_Summary.AssureClaims_CommentSummary_Txt_TextEditor.innerText);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Claim_Comment_Summary.AssureClaims_CommentSummary_Txt_TextEditor, "Comment on The Comment Summary")
        //await In_Utility.AssureClaims_SetValue_Utility(Claim_Comment_Summary.AssureClaims_Comment_Txt_TextEditor, "abc test", "type comment");

        await Nav_Utility.AssureClaims_ElementClick_Utility(Claim_Comment_Summary.AssureClaims_CommentSummary_Btn_Cancel, "Cancel Button On Comment Summary Screen");

    }

    async AssureClaims_Diary_Creation_Utility(UserFirstName) {
        var TaskName = faker.name.lastName();
        var EstimateTime = faker.random.number({ min: 1, max: 9 });

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Diaries:Diary List");
        await t.wait(8000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_DiaryFrame, "Diary Frame");
        await t.wait(12000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Btn_Create, "Diary Button on Claim Screen");
        await t.wait(10000)
        //Code For Assigned User
        if (UserFirstName != "NA") {
            await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Btn_AssignedUser, "Click on Assigned User")
            await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Img_UserIcon, "Click on User Icon")
            await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaims_SystemUsers_Txt_Filter, UserFirstName, "FirstName TextBox")
            await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_SystemUsers_Btn_FilterSearch, "Click on search Button")
            await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaimsApp_SystemUsers_Img_RowSelector, "Select the user")
            await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Img_Ok, "Click on ok button")
        }
        //End
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaims_DiaryCreation_Txt_TaskName, TaskName, "Task Name On Diary Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Btn_Time, "Diary Time On Diary Screen");
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaims_DiaryCreation_Txt_EstimateTime, EstimateTime.toString(), "Time Estimated On Diary Screen");

        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Btn_WorkActivities, "Work Activities Search Button is Clicked");
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaims_DiaryCreation_Txt_WorkActivities_Activity, 'ABC', "Text For Activity Entered");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Btn_Activity_Done, " Ok Button Clicked");

        await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaims_DiaryCreation_Txt_Notes, 'TestingDiary', "Diary Notes On Diary Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Chk_AutoNotificationCompleted, "Check Box Auto Notify On Completion On Diary Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Chk_AutoNotificationLate, "Check Box Auto Notify On Late On Diary Screen");
        //await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Chk_NotifyByEmail,"Check Notify Email On Diary Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Diary Creation Screen");
        await t.wait(2000);
        if (UserFirstName == "NA") {
            const ColName = ["Work Activity"]
            const ColVal = ["ABC"]
            await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaimsApp_Diaries_Txt_TaskName, TaskName, "TaskName TextBox")
            await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Click on Search Button")
            await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("ABC", 'Diary Grid View', ColName, ColVal)
        }
        return TaskName;
    }

    async AssureClaims_ClaimEventEntityAddition_Utility(EntityType, ReqParam, ReqParam1, ReqParam2) {
        switch (EntityType) {
            case "Adjuster":
                var AdjustertLastName = faker.name.lastName();
                var AdjusterFirstName = faker.name.firstName();
                var AdjusterMiddleName = "NS";
                var Address1 = faker.address.streetName();
                var Address2 = faker.address.streetAddress();
                var Address3 = faker.address.cityPrefix();
                var Address4 = faker.address.cityPrefix();
                //var Address4 = "add4";
                var City = faker.address.city();
                await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_AddAdjuster, "Add Adjuster Button on Adjuster Page")

                await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, AdjustertLastName, "Adjuster Last Name")
                await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_FirstName, AdjusterFirstName, "Adjuster First Name")
                await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_MiddleName, AdjusterMiddleName, "Adjuster Middle Name")
                await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_Addr1, Address1, "Adjuster Address1")
                await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_Addr2, Address2, "Adjuster Address2")
                await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_Addr3, Address3, "Adjuster Address3")
                await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_Addr4, Address4, "Adjuster Address4")
                await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_City, City, "Adjuster City")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_Country, "Country Lookup");
                const ele_AdjusterCountry = Adjuster_POM.AssureClaims_Adjuster_Lnk_SelectCountry.withText(ReqParam).with({ visibilityCheck: true })
                await t.expect(ele_AdjusterCountry.exists).ok('', { timeout: 3000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_AdjusterCountry, "Country Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_State, "State Lookup")
                const ele1_AdjusterState = Adjuster_POM.AssureClaims_Adjuster_Lnk_SelectState.withText(ReqParam1).with({ visibilityCheck: true })
                await t.expect(ele1_AdjusterState.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele1_AdjusterState, "State Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Adjuster creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Adjuster Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, AdjustertLastName, "Last Name Textbox On Adjuster Creation Screen");
                return AdjustertLastName;
                break;
                //==============================================================Rma-99791 Melissa Address Auto Complete and Address Verification Code Starts===========================================
                case "Adjuster Melissa Verification":
                            var AdjustertLastName = faker.name.lastName();
                            var AdjusterFirstName = faker.name.firstName();
                            var AdjusterMiddleName = "NS";
                            var Address1 = faker.address.streetName();
                           
                            await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_AddAdjuster, "Add Adjuster Button on Adjuster Page")
            
                            await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, AdjustertLastName, "Adjuster Last Name")
                            await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_FirstName, AdjusterFirstName, "Adjuster First Name")
                            await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_MiddleName, AdjusterMiddleName, "Adjuster Middle Name")
                            await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_Addr1, Address1, "Adjuster Address1")
                            await t.pressKey('tab')            
                            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Adjuster creation Screen");
                            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Address_VerificationFrame);
                            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Melissa_Btn_SuggestedAddress, "Suggested Address on Melissa Address Verification PopUp is saved")
                            
                            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Melissa_Btn_VerficationOK, "Melissa Address Verification screen popup is saved")
                            await t.switchToMainWindow()
                            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
                            await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Address1 is verified successfully");

                            break;
            ///==============================================================Rma-99791 Melissa Address Auto Complete and Address Verification Code Ends===========================================
            case "Claimant":
                var ClaimantLastName = faker.name.lastName();
                var ClaimantFirstName = faker.name.firstName();
                // var ClaimantMiddleName = faker.name.middleName();
                var Address1 = faker.address.streetName();
                var Address2 = faker.address.streetAddress();
                var Address3 = faker.address.cityPrefix();
                var SSN = faker.random.number({ min: 100000000, max: 999999999 });
                var City = faker.address.city();
                await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Btn_AddClaimant, "Add Claimant Button on Claimant Page")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_LastName, ClaimantLastName, "Claimant Last Name")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_FirstName, ClaimantFirstName, "Claimant First Name")
                // await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_MiddleName,ClaimantMiddleName,"Claimant Middle Name")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_Address1, Address1, "Claimant Address1")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_Address2, Address2, "Claimant Address2")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_Address3, Address3, "Claimant Address3")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_City, City, "Claimant City")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Btn_State, "State Lookup")
                await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, ReqParam1, "Description Search Textbox On Claimant Creation Page");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Claimant Creation Screen");
                const ele_ClaimantState = Claimant_POM.AssureClaims_Claimant_Lnk_SelectState.withText(ReqParam1).with({ visibilityCheck: true })
                await t.expect(ele_ClaimantState.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_ClaimantState, "State Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Btn_Country, "Country Lookup")
                await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, ReqParam, "Description Search Textbox On Claimant Creation Page");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Claimant Creation Screen");
                const ele_ClaimantCountry = Claimant_POM.AssureClaims_Claimant_Lnk_SelectCountry.withText(ReqParam).with({ visibilityCheck: true })
                await t.expect(ele_ClaimantCountry.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_ClaimantCountry, "Country Option")

                //await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Btn_State, "State Lookup")
                //const ele_ClaimantState = Claimant_POM.AssureClaims_Claimant_Lnk_SelectState.withText(ReqParam1).with({ visibilityCheck: true })
                //await t.expect(ele_ClaimantState.exists).ok('', { timeout: 20000 })
                //await Nav_Utility.AssureClaims_ElementClick_Utility(ele_ClaimantState, "State Option")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_SocSecNo, SSN.toString(), "Claimant SSN")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Claimant creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Claimant Creation Screen");
                return ClaimantLastName;
                break;
            case "Defendant":
                var DefendantLastName = faker.name.lastName();
                //var DefendantFirstName = faker.name.firstName();
                // var DefendantMiddleName = faker.name.middleName();
                // var DefendantFirstName = "krishna";
                var Address1 = faker.address.streetName();
                var Address2 = faker.address.streetAddress();
                var Address3 = faker.address.cityPrefix();
                var Zip = faker.random.number({ min: 10000, max: 99999 });
                var City = faker.address.city();
                await Nav_Utility.AssureClaims_ElementClick_Utility(Defendant_POM.AssureClaims_Defendant_Btn_AddDefendant, "Add Defendant Button on Defendant Page")


                await In_Utility.AssureClaims_SetValue_Utility(Defendant_POM.AssureClaims_Defendant_Txt_LastName, DefendantLastName, "Defendant Last Name")
                await In_Utility.AssureClaims_SetValue_Utility(Defendant_POM.AssureClaims_Defendant_Txt_FirstName, "krishna", "Defendant First Name")
                // await In_Utility.AssureClaims_SetValue_Utility(Defendant_POM.AssureClaims_Defendan_Txt_MiddleName,DefendanMiddleName,"Defendan Middle Name")
                await In_Utility.AssureClaims_SetValue_Utility(Defendant_POM.AssureClaims_Defendant_Txt_Address1, Address1, "Defendan Address1")
                await In_Utility.AssureClaims_SetValue_Utility(Defendant_POM.AssureClaims_Defendant_Txt_Address2, Address2, "Defendan Address2")
                await In_Utility.AssureClaims_SetValue_Utility(Defendant_POM.AssureClaims_Defendant_Txt_Address3, Address3, "Defendant Address3")
                await In_Utility.AssureClaims_SetValue_Utility(Defendant_POM.AssureClaims_Defendant_Txt_City, City, "DefendantCity")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Defendant_POM.AssureClaims_Defendant_Btn_Country, "Country Lookup")
                const ele_DefendantCountry = Defendant_POM.AssureClaims_Defendant_Lnk_SelectCountry.withText(ReqParam).with({ visibilityCheck: true })
                await t.expect(ele_DefendantCountry.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_DefendantCountry, "Country Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Defendant_POM.AssureClaims_Defendant_Btn_State, "State Lookup")
                const ele_DefendantState = Defendant_POM.AssureClaims_Defendant_Lnk_SelectState.withText(ReqParam1).with({ visibilityCheck: true })
                await t.expect(ele_DefendantState.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_DefendantState, "State Option")
                await In_Utility.AssureClaims_SetValue_Utility(Defendant_POM.AssureClaims_Defendant_Txt_Zip, Zip.toString(), "Defendant Zip")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Defendant creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Defendant Creation Screen");
                break;
            case "Subrogation":
                var date = new Date();
                //var Subrogation_Date = (date.getMonth()+2)+'/'+(date.getDate()+2)+'/'+date.getFullYear();
                var Subrogation_Date = (date.getMonth() + 1) + '/' + (date.getDate()) + '/' + date.getFullYear();
                await Nav_Utility.AssureClaims_ElementClick_Utility(Subrogation_POM.AssureClaims_Subrogation_Btn_AddSubrogation, "Add Subrogation")
                await t.wait(4000)
                await t.typeText(Subrogation_POM.AssureClaims_Subrogation_Txt_StatusDate, Subrogation_Date).setTestSpeed(0.6)
                await t.wait(1000)

                await Nav_Utility.AssureClaims_ElementClick_Utility(Subrogation_POM.AssureClaims_Subrogation_Btn_SubrogationStatus, "Subrogation Status Lookup")
                const ele_SubStatus = Subrogation_POM.AssureClaims_Subrogation_Lnk_SelectSubrogationStatus.withText(ReqParam1).with({ visibilityCheck: true })
                await t.expect(ele_SubStatus.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_SubStatus, "Subrogation Status Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Subrogation_POM.AssureClaims_Subrogation_Btn_SubrogationType, "Subrogation Type Lookup")
                const ele_SubType = Subrogation_POM.AssureClaims_Subrogation_Lnk_SelectSubrogationType.withText(ReqParam).with({ visibilityCheck: true })
                await t.expect(ele_SubType.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_SubType, "Subrogation Type Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Subrogation_POM.AssureClaims_Subrogation_Btn_SubrogationStatusDescription, "Policy LOB Lookup")
                const ele_SubStatusDesc = Subrogation_POM.AssureClaims_Subrogation_Lnk_SelectSubrogationStatusDescription.withText(ReqParam2).with({ visibilityCheck: true })
                await t.expect(ele_SubStatusDesc.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_SubStatusDesc, "Status desc Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Subrogation creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Subrogation Creation Screen");
                break;

            case "Arbitration":
                await Nav_Utility.AssureClaims_ElementClick_Utility(Arbitration_POM.AddArbitration, "Add Arbitration Button on Adjuster Page")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Arbitration_POM.AssureClaims_Arbitration_Txt_Type, "Arbitration Lookup")
                const ele_Arbtype = Arbitration_POM.AssureClaims_Arbitration_Lnk_SelectType.withText(ReqParam).with({ visibilityCheck: true })
                await t.expect(ele_Arbtype.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_Arbtype, "Text Type")
                await In_Utility.AssureClaims_SetValue_Utility(Arbitration_POM.AssureClaims_Arbitration_Txt_ClaimNumber, ReqParam1, "Add Claim Number")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Arbitration creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "ArbitrationCreation Screen");
                break;

            case "Litigation":
                var DocketNumber = faker.random.number({ min: 1000000, max: 9999999 });
                await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_AddLitigation, "Add Litigation Button On Claim Page")
                await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_DocketNumber, DocketNumber.toString(), "Docket Number Textbox On Litigation Screen");
                var date = new Date();
                var SuitDate = (date.getMonth() + 1) + '/' + (date.getDate()) + '/' + date.getFullYear();
                var date1 = new Date();
                var CourtDate = (date1.getMonth() + 1) + '/' + (date1.getDate() + 1) + '/' + date1.getFullYear();
                await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_SuitDate, SuitDate, " Suit Date")
                await t.pressKey('tab')
                await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_CourtDate, CourtDate, "Court Date")
                await t.pressKey('tab')
                await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_VenueState, "Venue State Lookup")
                const ele1 = Litigation_POM.AssureClaims_Litigation_Lnk_SelectVenueState.withText(ReqParam).with({ visibilityCheck: true })
                await t.expect(ele1.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Venue State Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_LitigationType, "Litigation Type Lookup")
                const ele2 = Litigation_POM.AssureClaims_Litigation_Lnk_LitigationType.withText(ReqParam1).with({ visibilityCheck: true })
                await t.expect(ele2.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele2, "Litigation Type Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_LitigationStatus, "Litigation Status Lookup")
                const ele3 = Litigation_POM.AssureClaims_Litigation_Lnk_LitigationStatus.withText(ReqParam2).with({ visibilityCheck: true })
                await t.expect(ele3.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele3, "Litigation Status Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Litigation creation Screen");
                return DocketNumber;
                break;

            case "PropertyLoss":
                await Nav_Utility.AssureClaims_ElementClick_Utility(PropertyLoss_POM.AssureClaims_PropertyLoss_Btn_AddPropertyLoss, "Add Property Loss Button on Claim Page")
                await Nav_Utility.AssureClaims_ElementClick_Utility(PropertyLoss_POM.AssureClaims_PropertyLoss_Btn_PropertyId, "Property Id Look Up Button")
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_PrportyIdSearchFrame);
                await In_Utility.AssureClaims_SetValue_Utility(PropertyLoss_POM.AssureClaims_PropertyLoss_Txt_SearchPropertyId, ReqParam, "Property ID Text Box On Property Lookup")
                await Nav_Utility.AssureClaims_ElementClick_Utility(PropertyLoss_POM.AssureClaims_SearchCriteria_Btn_SubmitQuery, "Search Image On Property Search Window")
                await Nav_Utility.AssureClaims_ElementClick_Utility(PropertyLoss_POM.AssureClaims_PropertyLoss_Lnk_PropertyId.withText(ReqParam), "Property Id Link On Property Selection Window")
                await t.wait(2000);
                await t.switchToMainWindow();
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Property Loss creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Property Loss Creation Screen");
                break;

            case "PropertyQuotation":
                var date = new Date();
                var QuotationDesc = "QuotationDesc" + faker.random.alpha({ count: 4, upcase: true });
                await Nav_Utility.AssureClaims_ElementClick_Utility(Quotation_POM.AssureClaims_Quotation_Btn_AddQuotation, "Add Quotation Button")
                await t.wait(4000)
                await In_Utility.AssureClaims_SetValue_Utility(Quotation_POM.AssureClaims_PropertyQuote_Txt_QuotationDesc, QuotationDesc, "Quotation Description On Quotation Page")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Quotation_POM.AssureClaims_PropertyQuote_Btn_QuotationStatus, "Quotation Status Lookup")
                const ele_QuoteStatus = Quotation_POM.AssureClaims_PropertyQuote_Lnk_SelectQuotationStatus.withText(ReqParam).with({ visibilityCheck: true })
                await t.expect(ele_QuoteStatus.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_QuoteStatus, "Quotation Status Option")

                var QuoteExpire_Date = (date.getMonth() + 2) + '/' + (date.getDate()) + '/' + date.getFullYear();
                await t.typeText(Quotation_POM.AssureClaims_Quotation_Txt_ExpirationDate, QuoteExpire_Date).setTestSpeed(0.6)
                await t.wait(1000)

                await Nav_Utility.AssureClaims_ElementClick_Utility(Quotation_POM.AssureClaims_Quotation_Tab_QuotationDetails, "Quotation Details Tab On Quotation Creation Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Quotation_POM.AssureClaims_Quotation_Btn_AddQuotationDetails, "Add New Quotation Button On Quotation Creation Screen")
                await t.wait(1000)
                var PartName = "PartName" + faker.random.alpha({ count: 4, upcase: true });
                var PartDesc = "PartDesc" + faker.random.alpha({ count: 4, upcase: true });
                await In_Utility.AssureClaims_SetValue_Utility(Quotation_POM.AssureClaims_QuoteDetail_Txt_PartNameOrNum, PartName, "Part Name On Quotation Details Screen")
                await In_Utility.AssureClaims_SetValue_Utility(Quotation_POM.AssureClaims_QuoteDetail_Txt_Description, PartDesc, "Description On Quotation Details Screen")
                await In_Utility.AssureClaims_SetValue_Utility(Quotation_POM.AssureClaims_QuoteDetail_Txt_Quantity, ReqParam1, "Quantity On Quotation Details Screen")
                await In_Utility.AssureClaims_SetValue_Utility(Quotation_POM.AssureClaims_QuoteDetail_Txt_UnitPrice, ReqParam2, "Unit Price On Quotation Details Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Quotation_POM.AssureClaims_QuoteDetail_Btn_Save, "Save Button On Quotation Details Screen")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Quotation_POM.AssureClaims_Quotation_Tab_VendorInformation, "Vendor Information Tab On Quotation Details Screen")
                var VendorLastName = "AutoVendor"+ faker.name.lastName();
                var VendorFirstName = "AutoVendor"+ faker.name.firstName();
                await In_Utility.AssureClaims_SetValue_Utility(Quotation_POM.AssureClaims_Quotation_Txt_VendLastName, VendorLastName, "Vendor Last Name")
                await In_Utility.AssureClaims_SetValue_Utility(Quotation_POM.AssureClaims_Quotation_Txt_VendFirstName, VendorFirstName, "Vendor First Name")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Property Loss Quotation creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Property Loss Quotation Creation Screen");
                var QuotationNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Quotation_POM.AssureClaims_PropertyQuote_Txt_QuotationNum, "value");
                return QuotationNumber;
                break;
            case "Payee":
                var ClaimantLastName = faker.name.lastName();
                var ClaimantFirstName = faker.name.firstName();
                // var ClaimantMiddleName = faker.name.middleName();
                var Address1 = faker.address.streetName();
                var Address2 = faker.address.streetAddress();
                var Address3 = faker.address.cityPrefix();
                var SSN = faker.random.number({ min: 100000000, max: 999999999 });
                var City = faker.address.city();
                await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Payee_Btn_AddPayee, "Add Payee Button on Claim Page");
                await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Payee_Txt_LastName, ClaimantLastName, "Payee Last Name");
                await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Payee_Txt_FirstName, ClaimantFirstName, "PayeeFirst Name");
                // await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_MiddleName,ClaimantMiddleName,"Claimant Middle Name")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_Address1, Address1, "Claimant Address1")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_Address2, Address2, "Claimant Address2")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_Address3, Address3, "Claimant Address3")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_City, City, "Claimant City")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Btn_Country, "Country Lookup")
                const ele_PayeeCountry = Claimant_POM.AssureClaims_Claimant_Lnk_SelectCountry.withText(ReqParam).with({ visibilityCheck: true })
                await t.expect(ele_PayeeCountry.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_PayeeCountry, "Country Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Btn_State, "State Lookup")
                const ele_PayeeState = Claimant_POM.AssureClaims_Claimant_Lnk_SelectState.withText(ReqParam1).with({ visibilityCheck: true })
                await t.expect(ele_PayeeState.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_PayeeState, "State Option")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_SocSecNo, SSN.toString(), "Claimant SSN")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payee creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payee Creation Screen");
                break;
 //==============================================================Rma-99791 Melissa Address Auto Complete and Address Verification Code Starts===========================================
                case "Adjuster Melissa Verification":
                            var AdjustertLastName = faker.name.lastName();
                            var AdjusterFirstName = faker.name.firstName();
                            var AdjusterMiddleName = "NS";
                            var Address1 = faker.address.streetName();
                           
                            await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_AddAdjuster, "Add Adjuster Button on Adjuster Page")
            
                            await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, AdjustertLastName, "Adjuster Last Name")
                            await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_FirstName, AdjusterFirstName, "Adjuster First Name")
                            await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_MiddleName, AdjusterMiddleName, "Adjuster Middle Name")
                            await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_Addr1, Address1, "Adjuster Address1")
                            await t.pressKey('tab')            
                            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Adjuster creation Screen");
                            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Address_VerificationFrame);
                            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Btn_MelissaSuggested_Address, "Suggested Address on Melissa Address Verification PopUp is saved")
                            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Btn_Melissa_VerficationOK, "Melissa Address Verification screen popup is saved")
                            await t.switchToMainWindow()
                            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
                            await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Address1 is verified successfully");

                            break;
            ///==============================================================Rma-99791 Melissa Address Auto Complete and Address Verification Code Ends===========================================

            default: console.log("This Case is Not Defined In the Function of ClaimEvent Entity creation")
        }
    }

    async AssureClaims_ClaimEventEntityEdit_Utility(EntityType, ReqParam, ReqParam1, ReqParam2) {
        switch (EntityType) {
            case "Adjuster":

                var AdjusterEditedFName = faker.name.firstName();
                await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_FirstName, AdjusterEditedFName, "Correct Adjuster First Name")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Adjuster creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Adjuster Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_FirstName, AdjusterEditedFName, "First Name Textbox On Adjuster Creation Screen");
                return AdjusterEditedFName;
                break;
            case "Claimant":
                var LastEditedName = faker.name.lastName();
                var FirstEditedName = faker.name.firstName();
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_LastName, LastEditedName, "Claimant Last Edited Name")
                await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_FirstName, FirstEditedName, "Claimant First Edited Name")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Claimant creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Claimant Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_LastName, LastEditedName, "Last Name Textbox On Claimant Creation Screen");
                return LastEditedName;
                break;
            case "Defendant":
                var DefendantEditedLName = faker.name.lastName();
                await In_Utility.AssureClaims_SetValue_Utility(Defendant_POM.AssureClaims_Defendant_Txt_LastName, DefendantEditedLName, "Defendant Last Name")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Defendant creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Defendant Creation Screen");
                return DefendantEditedLName;
                break;

            case "Subrogation":
                var date = new Date();
                //var Subrogation_Date = (date.getMonth()+2)+'/'+(date.getDate()+2)+'/'+date.getFullYear();
                var Subrogation_Date = (date.getMonth() + 1) + '/' + (date.getDate() - 1) + '/' + date.getFullYear();
                await Nav_Utility.AssureClaims_ElementClick_Utility(Subrogation_POM.AssureClaims_Subrogation_Btn_AddSubrogation, "Add Subrogation")
                await t.wait(4000)
                await t.typeText(Subrogation_POM.AssureClaims_Subrogation_Txt_StatusDate, Subrogation_Date).setTestSpeed(0.6)
                await t.wait(1000)

                await Nav_Utility.AssureClaims_ElementClick_Utility(Subrogation_POM.AssureClaims_Subrogation_Btn_SubrogationStatus, "Subrogation Status Lookup")
                const ele_SubStatus = Subrogation_POM.AssureClaims_Subrogation_Lnk_SelectSubrogationStatus.withText(ReqParam1).with({ visibilityCheck: true })
                await t.expect(ele_SubStatus.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_SubStatus, "Subrogation Status Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Subrogation_POM.AssureClaims_Subrogation_Btn_SubrogationType, "Subrogation Type Lookup")
                const ele_SubType = Subrogation_POM.AssureClaims_Subrogation_Lnk_SelectSubrogationType.withText(ReqParam).with({ visibilityCheck: true })
                await t.expect(ele_SubType.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_SubType, "Subrogation Type Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Subrogation_POM.AssureClaims_Subrogation_Btn_SubrogationStatusDescription, "Policy LOB Lookup")
                const ele_SubStatusDesc = Subrogation_POM.AssureClaims_Subrogation_Lnk_SelectSubrogationStatusDescription.withText(ReqParam2).with({ visibilityCheck: true })
                await t.expect(ele_SubStatusDesc.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_SubStatusDesc, "Status desc Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Subrogation creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Subrogation Creation Screen");
                break;

            case "Arbitration":
                await Nav_Utility.AssureClaims_ElementClick_Utility(Arbitration_POM.AddArbitration, "Add Arbitration Button on Adjuster Page")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Arbitration_POM.AssureClaims_Arbitration_Txt_Type, "Arbitration Lookup")
                const ele_Arbtype = Arbitration_POM.AssureClaims_Arbitration_Lnk_SelectType.withText(ReqParam).with({ visibilityCheck: true })
                await t.expect(ele_Arbtype.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_Arbtype, "Text Type")
                await In_Utility.AssureClaims_SetValue_Utility(Arbitration_POM.AssureClaims_Arbitration_Txt_ClaimNumber, ReqParam1, "Add Claim Number")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Arbitration creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "ArbitrationCreation Screen");
                break;

            case "Litigation":
                var DocketNumber = faker.random.number({ min: 1000000, max: 9999999 });
                await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_AddLitigation, "Add Litigation Button On Claim Page")
                await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_DocketNumber, DocketNumber.toString(), "Docket Number Textbox On Litigation Screen");
                var date = new Date();
                var SuitDate = (date.getMonth() + 1) + '/' + (date.getDate()) + '/' + date.getFullYear();
                var date1 = new Date();
                var CourtDate = (date1.getMonth() + 1) + '/' + (date1.getDate() + 1) + '/' + date1.getFullYear();
                await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_SuitDate, SuitDate, " Suit Date")
                await t.pressKey('tab')
                await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_CourtDate, CourtDate, "Court Date")
                await t.pressKey('tab')
                await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_VenueState, "Venue State Lookup")
                const ele1 = Litigation_POM.AssureClaims_Litigation_Lnk_SelectVenueState.withText(ReqParam).with({ visibilityCheck: true })
                await t.expect(ele1.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Venue State Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_LitigationType, "Litigation Type Lookup")
                const ele2 = Litigation_POM.AssureClaims_Litigation_Lnk_LitigationType.withText(ReqParam1).with({ visibilityCheck: true })
                await t.expect(ele2.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele2, "Litigation Type Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_LitigationStatus, "Litigation Status Lookup")
                const ele3 = Litigation_POM.AssureClaims_Litigation_Lnk_LitigationStatus.withText(ReqParam2).with({ visibilityCheck: true })
                await t.expect(ele3.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele3, "Litigation Status Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Litigation creation Screen");
                return DocketNumber;
                break;

            default: console.log("This Case is Not Defined In the Function of ClaimEvent Entity creation")
        }
    }

    async AssureClaims_CaseManagementCreateEditDelete_Utility(Case_Management_Txt_DisabilityType, Case_Management_Txt_SubDisabilityType, Case_Management_Txt_HospitalFromDate, Case_Management_Txt_HospitalToDate) {
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Btn_AddCaseManagement, "Add CaseManagement on WC Page")

        switch (Case_Management_Txt_DisabilityType) {
            case "Illness":

                await In_Utility.AssureClaims_SetValue_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Txt_HospitalFromDate, Case_Management_Txt_HospitalFromDate, "From Date in CaseManagement")
                await In_Utility.AssureClaims_SetValue_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Txt_HospitalToDate, Case_Management_Txt_HospitalToDate, "To Date in CaseManagement")

                await Nav_Utility.AssureClaims_ElementClick_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Btn_DisabilityType, "Disability Lookup")
                const ele_IDisabilityType = CaseMgt_POM.AssureClaims_CaseManagement_Lnk_SelectDisabilityType.withText(Case_Management_Txt_DisabilityType).with({ visibilityCheck: true })
                await t.expect(ele_IDisabilityType.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_IDisabilityType, "Disability Option")


                await Nav_Utility.AssureClaims_ElementClick_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Btn_IllnessType, "SubDisability Lookup")
                const ele_SubDisabilityType = CaseMgt_POM.AssureClaims_CaseManagement_Lnk_SelectSubDisabilityType.withText(Case_Management_Txt_SubDisabilityType).with({ visibilityCheck: true })
                await t.expect(ele_SubDisabilityType.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_SubDisabilityType, "IllnessType Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On CaseManagement creation Screen");
                var CaseMangt = Verify_Utility.AssureClaims_AttributeFetch_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Txt_DisabilityType, "value");
                return CaseMangt;
                break;   //Case Executed When Disability Type Is Illness

            case "Injuries":

                await Nav_Utility.AssureClaims_ElementClick_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Btn_DisabilityType, "Disability Lookup")
                const ele1_DisabilityType = CaseMgt_POM.AssureClaims_CaseManagement_Lnk_SelectDisabilityType.withText(Case_Management_Txt_DisabilityType).with({ visibilityCheck: true })
                await t.expect(ele1_DisabilityType.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele1_DisabilityType, "Disability Option")

                await Nav_Utility.AssureClaims_ElementClick_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Btn_InjuriesType, "Injury Lookup")
                const ele1_SubDisabilityType = CaseMgt_POM.AssureClaims_CaseManagement_Lnk_SelectSubDisabilityType.withText(Case_Management_Txt_SubDisabilityType).with({ visibilityCheck: true })
                await t.expect(ele1_SubDisabilityType.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele1_SubDisabilityType, "IllnessType Option")

                await In_Utility.AssureClaims_SetValue_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Txt_HospitalFromDate, Case_Management_Txt_HospitalFromDate, "From Date in CaseManagement")
                await In_Utility.AssureClaims_SetValue_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Txt_HospitalToDate, Case_Management_Txt_HospitalToDate, "To Date in CaseManagement")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On CaseManagement creation Screen");

                var CaseMangt = Verify_Utility.AssureClaims_AttributeFetch_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Txt_DisabilityType, "value");
                return CaseMangt;
                break;
            //Case Executed When Disability Type Is Injuries
        }
    }

    async AssureClaims_LogoutFromApplication_Utility() {
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_LogOut_LogoutBtnOptions, "Logout Options")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_LogOut_LogoutBtn, "Logout Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_LogOut_LogoutOkBtn, "Ok Button On Logout PopUp")
        //await Verify_Utility.AssureClaims_ElementExist_Utility(POM_LoginPOM.AssureClaims_Login_LoginUserNameTextbox);
    }

    async AssureClaims_GenericDelete_Utility(ConfirmDelete, ReqParam, ReqParam1) {
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteRecord, "Delete Record Button On " + ReqParam);
        switch (ConfirmDelete) {
            case "True":
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteOK, "Ok Button On Confirm Delete PopUp On " + ReqParam);
                break;

            case "False":
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteCancel, "Cancel Button On Confirm Delete PopUp On " + ReqParam);
                break;

            default: console.log("This case is Not Defined in Delete Record function");
        }
    }


    async AssureClaims_CarrierGCClaimCreation(GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_Department, GenClaimCreation_Txt_PolicyLOB, GenClaimCreation_Lst_PolicySystem, PolicyName) {

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:General Claim");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(6000);
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent, GenClaimCreation_Txt_DateOfEvent, "Date Of Event")
        await t.wait(1000);
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfClaim, GenClaimCreation_Txt_DateOfClaim, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfClaim, "Time Of Claim")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele_CarrierClaimType = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withExactText(GenClaimCreation_Txt_ClaimType).with({ visibilityCheck: true })
        await t.expect(ele_CarrierClaimType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierClaimType, "Claim Type Option")


        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele_CarrierStatus = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText(GenClaimCreation_Txt_ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele_CarrierStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierStatus, "Claim Status Option")

        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept, GenClaimCreation_Txt_Department, "Department")
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele_CarrierPolicyLOB = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectPolicyLOB.withExactText(GenClaimCreation_Txt_PolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele_CarrierPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierPolicyLOB, "Policy LOB Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");

        // await t.click(Selector('[class="btn btn-primary"]').parent('[class="ctrlHolder"]').find('button').nth(1))
        //Attaching Policy To the Claim
        await t.wait(4000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyNameLookup, "Policy Name Lookup")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicyLookup, "Policy System List")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicyName.withText(GenClaimCreation_Lst_PolicySystem), "Select Policy System List")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SubPolicyDownloadIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_SubmitQuery, "Submit Query Button")
        await t.wait(5000);
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaimsApp_GenericClaim_ClkTxt_PolicyName, PolicyName, "PolicyName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Lnk_InternalPolicyName.withText(PolicyName), "Policy Name")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyPreview, "Right Click On Policy Preview")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_List.withText('Interest List'), "Open Interest List tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_InterestListClaimant, "Check Claimant")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_List.withText('Unit List'), "Open Unit List tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_UnitList, "Check Unit List")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_PolicyProperty, "Check Policy Property List")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicySave, "Save Internal Policy")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyDownload, "Download Policy")
        await t.wait(8000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");

        //Policy Attached To the Claim
        var StrClaimNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        return StrClaimNumber;
    }

    async AssureClaims_CarrierReserveAddition_Utility(ReserveAmount, CoverageType, LossType, ReserveUnit, ReserveStatus, ReserveType) {
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await t.wait(12000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_AddReserve, "Add Reserve")

        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_ReserveAmount, ReserveAmount.toString(), "Amount Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveCoverageType, "Reserve Coverage Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveCoverageType.find('option').withText(CoverageType), "Reserve Coverage Type Value")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveLossType, "Reserve Loss Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveLossType.find('option').withText(LossType), "Reserve Loss Type Value")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveUnit, "Reserve Unit")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveUnit.find('option').withText(ReserveUnit), "Reserve Unit Type Value")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_Status, "Reserve Status")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_Status.find('option').withText(ReserveStatus), "Reserve Status Value")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType, "Reserve Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType.find('option').withText(ReserveType), "Reserve Type Value")


        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Reserve Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Reserve Creation Screen");
    }

    async AssureClaims_CarrierCollectionPaymentAddition_Utility(BankAccount, PayeeType, TransType, Amount, Unit, CoverageType, LossType) {
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, "Bank Account")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(BankAccount), "Select bank account")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(PayeeType), "Payee Payor Type Value On Payment Creation Screen")
        await t.wait(3000)

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await t.wait(20000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(TransType), "Transaction Type Value On Funds Split Detail Screen")

        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, Amount, "Transaction Amount On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundUnit, "PaymentUnit Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundUnit.find('option').withText(Unit), "PaymentUnit Type Value")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundCoverageType, "Fund Coverage Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundCoverageType.find('option').withText(CoverageType), "Fund Coverage Type Value")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundLossType, "Fund Loss Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundLossType.find('option').withText(LossType), "Fund Loss Type Value")


        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    }

    async AssureClaims_BankAccount_AddEdit_Utility(Case, BankLastName, BankAddr1, BankAddr2, BankCountry, BankState, BankCity, ZipCode, BankAccountNo, AccountName, AccountType, NextCheck) {

        switch (Case) {
            case "Create":
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Bank Account");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe);
                await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_BankName, BankLastName, "Bank Name");
                await t.pressKey('tab');
                await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_Adderss1, BankAddr1, "Bank Address1")
                await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_Address2, BankAddr2, "Bank Address2")
                await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_BankCountry, "Bank Country Lookup")
                await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, BankCountry, "Description Search Textbox On Bank Account Creation Page");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Bank Account Creation Screen");
                const ele_BankCountry = BankAccount_POM.AssureClaims_BankAccount_Lnk_SelectBankCountry.withText(BankCountry).with({ visibilityCheck: true });
                await t.expect(ele_BankCountry.exists).ok("", { timeout: 30000 });
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_BankCountry, "Bank State Option");
                await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_BankState, "Bank State Lookup")
                await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, BankState, "Description Search Textbox On Bank Account Creation Page");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Bank Account Creation Screen");
                const ele_BankState = BankAccount_POM.AssureClaims_BankAccount_Lnk_SelectBankState.withText(BankState).with({ visibilityCheck: true });
                await t.expect(ele_BankState.exists).ok("", { timeout: 30000 });
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_BankState, "Bank State Option");
                await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_BankCity, BankCity, "Bank City")
                await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_BankZipCode, ZipCode.toString(), "Bank ZipCode")
                await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_BankAccNo, BankAccountNo, "Bank Account Number")
                await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_AccountName, AccountName, "Bank Account Name")
                await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_AccountType, "Bank Account Type")
                const ele_AccountType = BankAccount_POM.AssureClaims_BankAccount_Lnk_SelectAccountType.withText(AccountType).with({ visibilityCheck: true });
                await t.expect(ele_AccountType.exists).ok("", { timeout: 30000 });
                await Nav_Utility.AssureClaims_ElementClick_Utility(ele_AccountType, "Bank Account Option");
                await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_NextCheckNumber, NextCheck.toString(), "Bank NextCheck Number")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Creation OF BankAccount Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");

                var ReturnValue = Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_AccountName, "value");

                return ReturnValue;
                break;

            case "Edit":

                await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_Adderss1, BankAddr1, "Bank Address1");
                await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_AccountName, AccountName, "Bank Account Name");
                await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_NextCheckNumber, NextCheck.toString(), "Bank NextCheck Number");


                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Creation OF BankAccount Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");

                var ReturnValue = Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_AccountName, "value");
                return ReturnValue;

                break;
        }
    }

    async AssureClaims_BankAccount_CheckStocks_Utility(CheckStockCreation_Txt_StockName, CheckStockCreation_Txt_FontStyle, CheckStockCreation_Txt_FontSize) {
        await t.wait(4000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_CheckStocks, "Check Stocks On BankAccount is Clicked")
        await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_CheckStocksStockName, CheckStockCreation_Txt_StockName, "Bank NextCheck Number");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Lst_CheckStocksFontName, CheckStockCreation_Txt_FontStyle, "Select FontName From List")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Lst_CheckStocksFontSize, CheckStockCreation_Txt_FontSize, "Select FontSize From List")
        await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Tab_CheckStocksAlignmentOptions, "Alignment Options Tab On BankAccount is Clicked")
        await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Tab_CheckStocksRefreshDefaults, "Refresh Defaults On BankAccount is Clicked")
        await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_CheckStocksOk, "Click Ok BankAccount CheckStocks Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Tab_CheckStocksAdvancedOptions, "Advanced Options Tab On BankAccount is Clicked")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Chk_CheckStocksPrintClaimNo_OnCheck, 'Check', "checked Print ClaimNo On Check Check Box")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Chk_CheckStocksPrintControlOnCheckStub, 'Check', "check Print Control On CheckStub Check Box")
        await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_CheckStocks_Save, "Save Image Button On General Claim creation Screen");
        await t.switchToMainWindow()
    }

    async AssureClaims_CombinedPayee_Add_Utility(BankAccount, LastName, PayInterval, DateOfStopAsOf) {
        var DateOfStartingOn = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, 0, "MM/DD/YYYY")
        var DateOfNextScheduledDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 1, 0, "MM/DD/YYYY")
        var DateOfNextScheduledPrint = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 2, 0, "MM/DD/YYYY")

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Combined Payment");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_CombinedPayments_FundsIframe);
        await t.wait(3000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Combined_POM.AssureClaims_CombinedPaySetUp_Lst_BankAccount, BankAccount, "PaymentCollection_Lst_Filter_By_Bank_Account On Payment Creation Screen")

        await In_Utility.AssureClaims_SetValue_Utility(Combined_POM.AssureClaims_CombinedPaySetUp_Txt_LastName, LastName, "Last Name Text Box On Payment Creation Screen")
        await t.wait(3000)
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Combined_POM.AssureClaims_CombinedPaySetUp_Tab_ScheduleSetup, "Schedule Tab On Combined Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Combined_POM.AssureClaims_CombinedPaySetUP_Btn_PayInterval, "PayInterval")
        const Pay = Combined_POM.AssureClaims_CombinedPaySetUP_Lnk_PayInterval.withText(PayInterval).with({ visibilityCheck: true })
        await t.expect(Pay.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(Pay, "PayInterval Option")

        await In_Utility.AssureClaims_SetValue_Utility(Combined_POM.AssureClaims_CombinedPaySetUP_Txt_StartingOn, DateOfStartingOn, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Combined_POM.AssureClaims_CombinedPaySetUP_Txt_NextScheduledDate, DateOfNextScheduledDate, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Combined_POM.AssureClaims_CombinedPaySetUP_Txt_NextScheduledPrint, DateOfNextScheduledPrint, "Date Of Event")

        /* await In_Utility.AssureClaims_SetValue_Utility(Combined_POM.AssureClaims_CombinedPaySetUP_Txt_NextPrintOverride,DateOfNextPrintOverride,"Date Of Event")
         await Nav_Utility.AssureClaims_ElementClick_Utility(Combined_POM.AssureClaims_CombinedPaySetUp_Chk_LastDayofMonthCheckBox,"Check Box ClearCheck Screen")
     
         await Nav_Utility.AssureClaims_ElementClick_Utility(Combined_POM.AssureClaims_CombinedPaySetUp_Tab_StopPay,"Transaction Tab On Payment Creation Screen")
    
         //await Nav_Utility.AssureClaims_ElementClick_Utility(Combined_POM.AssureClaims_CombinedPaySetUp_Chk_StopCombinedPayCheckBox,"Check Box ClearCheck Screen")
     
         await In_Utility.AssureClaims_SetValue_Utility(Combined_POM.AssureClaims_CombinedPaySetUp_Txt_StopAsOf,DateOfStopAsOf,"Date Of Event")
  */
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");

        //await Nav_Utility.AssureClaims_ElementClick_Utility(Combined_POM.AssureClaims_CombinedPaymentSetUP_Btn_PayInterval,"Policy LOB Lookup")
    }

    async AssureClaims_FirstFinalPaymentCorpAddition_Utility(BankAccount, DetailedTrackingClaimant, PayeeType, Policy, Unit, CoverageType, LossType, ReserveType, TransType, Amount) {
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Add Payment Button On Reserve Creation Page")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_VerifyUXSpinnerDisappered, "Ok Button On Reserve Creation Page")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, "Bank Account List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(BankAccount), "Bank Account Value On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Lst_DetailedTrackingClaimant, "Detailed Tracking Claimant List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Lst_DetailedTrackingClaimant.find('option').withText(DetailedTrackingClaimant), "Detail Tracking Claimant Value On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(PayeeType), "Payee Payor Type Value On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundPolicy, "Policy List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundPolicy.find('option').withText(Policy), "Policy Value On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundUnit, "PaymentUnit")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundUnit.find('option').withText(Unit), "Reserve Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundCoverageType, "Fund Coverage Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundCoverageType.find('option').withText(CoverageType), "Fund Coverage Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundLossType, "Fund Loss Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundLossType.find('option').withText(LossType), "Fund Loss Type")
        //Policy Related Information Entered

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType, "Reserve Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType.find('option').withText(ReserveType), "Reserve Type Value On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(TransType), "Transaction Type Value On Funds Split Detail Screen")
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, Amount, "Transaction Amount On Funds Split Detail Screen")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");

        var StrControlNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber, "value");
        await t.switchToMainWindow();
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back btn pressed");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        //Grid
        const header = ["Policy Name", "Status"]
        const val = [Policy, "C - Closed"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(Policy, 'Payment grid view', header, val);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Clicked on Transaction history");
        //switchto external
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_CommentSummaryFrame);
        //Grid 2
        const header1 = ["Policy Name", "IsFirstFinal"]
        const val1 = [Policy, "Yes"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(Policy, 'Transaction grid view', header1, val1);

        return StrControlNumber;

    }

    async AssureClaims_Search() {
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.switchToMainWindow();

    }

    async AssureClaims_SMSUserAddEditDelete_Utility(Case, UserLastName, UserFirstName, LinkName, DSNName, ModuleName) {
        switch (Case) {
            case "Add":
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe)
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_AddNewUser, "Add New User Button")
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSUser_Txt_LastName, UserLastName, "LastName TextBox")
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSUser_Txt_FirstName, UserFirstName, "FirstName TextBox")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Chk_AccessSMS, "CheckBox of AccessSMS")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Chk_AccessUSP, "CheckBOX of AccessUSP")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_Generic_AssureClaimsText.withText('Allowed/Assigned Data-Sources to Login'), "Click on Allowed/Assigned Data-Sources to Login Button")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Rdo_DSNSelection.withText(DSNName).child('input'), "Select Radio Button of DSNName")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Save, "Save Image Button On User Setting Screen");
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSChangePassword_Txt_NewPassword, "abkabk1", "NewPassword TextBox")
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSChangePassword_Txt_ConPassword, "abkabk1", "Confirm TextBox")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Save, "Click on Save Button on Change Password Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUserAccessPer_Lst_AgsndUserToModuleGroup, "Click on Assign User to Module Group")

                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUserAccessPer_Lst_AgsndUserToModuleGroup.find('option').withText(ModuleName), "Select Assign User To Module Group")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSDelete_Btn_Delete, "Click ok on Assign User To Module Group")
                await t.wait(3000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_EditUserPerm, "Click on Edit Button")
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSDS_Txt_SystemLoginName, UserFirstName, "System Login Name TextBox")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Save, "Click on Save Button User Access Permissions Screen")
                break;

            case "Edit":
                const elementWithId = Selector(id => { return document.getElementById(id); });
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe);
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Refresh, "Refresh Button on Security Management System Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_ExpandUsers, "Expand Users")
                await t.click(elementWithId(LinkName));
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_EditUser, "Click on Edit Button")
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSUser_Txt_Address1, faker.address.streetName(), "Address1 TextBox")
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSUser_Txt_Address2, faker.address.streetAddress(), "Address TextBox")
                //Edited Address1 and Address2 Field
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Save, "Click on Save Button on User Setting Screen")
                break;

            case "Delete":
                const elementWithId1 = Selector(id => { return document.getElementById(id); });
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe);
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Refresh, "Refresh Button on Security Management System Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_ExpandUsers, "Expand Users")
                await t.click(elementWithId1(LinkName));
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_DeleteUser, "Delete Created User")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_DeleteConfirmation, "Delete Confirmation")
                //Created User has been deleted
                break;

        }
    }

    async AssureClaims_SMSSuperUserAddEditDelete_Utility(Case, UserLastName, UserFirstName, Manager, LinkName, DSNName, ModuleName) {
        switch (Case) {
            case "Add":
                await t.wait(4000)
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe)
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_AddNewUser, "Add New User Button")
                await t.wait(4000)
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSUser_Txt_LastName, UserLastName, "LastName TextBox")
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSUser_Txt_FirstName, UserFirstName, "FirstName TextBox")
                if (Manager != "NA") {
                    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_UserManager, "Manager Drop down")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_UserManager.find('option').withText(Manager), "Select Manager")
                }
                await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMSUser_Chk_AccessSMS, "Check", "Check Box Of Access SMS")
                await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMSUser_Chk_AccessUSP, "Check", "CheckBox of Access USP")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_Generic_AssureClaimsText.withText('Allowed/Assigned Data-Sources to Login'), "Allowed/Assigned Data-Sources to Login Button")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Rdo_DSNSelection.withText(DSNName).child('input'), "Select Radio Button of DSNName")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Save, "Save Image Button On User Setting Screen");
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSChangePassword_Txt_NewPassword, "abkabk1", "NewPassword TextBox")
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSChangePassword_Txt_ConPassword, "abkabk1", "Confirm TextBox")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Save, "Save Button on Change Password Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUserAccessPer_Lst_AgsndUserToModuleGroup, "Assign User to Module Group")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUserAccessPer_Lst_AgsndUserToModuleGroup.find('option').withText(ModuleName), "Select Assign User To Module Group")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSDelete_Btn_Delete, "Assign User To Module Group")
                await t.wait(3000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_EditUserPerm, "Edit Button")
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSDS_Txt_SystemLoginName, UserFirstName, "System Login Name TextBox")
                await In_Utility.AssureClaims_ElementWebListSelect_Utility(SMS_POM.AssureClaims_SMSUserAccessPer_Lst_AgsndUserToModuleGroup, ModuleName, "Select module name")
                if (await SMS_POM.AssureClaims_SMS_Btn_Ok.exists) 
                { 
                    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_Ok, "Ok Button User Access Permissions Screen") 
                } 
                else {
                     console.log(`Option not Present`); 
                } 
                await t.wait(2000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Save, "Save Button User Access Permissions Screen")
                await t.switchToMainWindow();
                return UserFirstName;
                break;

            case "Edit":
                const elementWithId = Selector(id => { return document.getElementById(id); });
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe);
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Refresh, "Refresh Button on Security Management System Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_ExpandUsers, "Expand Users")
                await t.click(elementWithId(LinkName));
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_EditUser, "Click on Edit Button")
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSUser_Txt_Address1, faker.address.streetName(), "Address1 TextBox")
                await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMSUser_Txt_Address2, faker.address.streetAddress(), "Address TextBox")
                //Edited Address1 and Address2 Field
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Save, "Click on Save Button on User Setting Screen")
                break;

            case "Delete":
                const elementWithId1 = Selector(id => { return document.getElementById(id); });
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe);
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Refresh, "Refresh Button on Security Management System Screen")
	        await t.wait(8000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_ExpandUsers, "Expand Users")
                await t.wait(8000)
	        await t.click(elementWithId1(LinkName));
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_DeleteUser, "Delete Created User")
                await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_DeleteConfirmation, "Delete Confirmation")
                //Created User has been deleted
                break;
        }
    }

    async AssureClaims_Funds_Transaction_Creation(Collection, CheckDate, CollectionTransactionDate, ClaimNumber, DetailedTrackingClaimant, BankAccount, payeetype, lastname, reservetype, transactiontype, AmountType) {

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Transaction")
        await t.wait(4000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Funds_Transaction_ClaimGCIframe);
        await t.wait(4000)
        if (Collection != 'NA') {
            await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Payment_POM.AssureClaims_PaymentCollection_Chk_Collection, 'Check', "check Collection Check Box")
        }
        if (CheckDate != 'NA') {
            await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckDate, CheckDate, "in Check Date TextBox")
        }
        if (CollectionTransactionDate != 'NA') {
            await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, CollectionTransactionDate, "in Transaction Date TextBox")
        }
        if (ClaimNumber != 'NA') {
            await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_ClaimNumber_Lookup, ClaimNumber, "Claim Number TextBox")
            await t.pressKey('tab');
        }
        if (DetailedTrackingClaimant != 'NA') {
            await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_DetailTrackingClaimant, DetailedTrackingClaimant, "Select Detailed Tracking Claimant")
        }
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, BankAccount, "Bank Account On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(payeetype), "Payee Payor Type On Payment Creation Screen")
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, lastname, "Last Name Text Box On Payment Creation Screen")
        await t.wait(3000)
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
       if (DetailedTrackingClaimant != 'NA') {
            await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundPolicy, 'test10', "Bank Account On Payment Creation Screen")
            await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundUnit, '0000054', "Bank Account On Payment Creation Screen")
            await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundCoverageType, '114 Medical Benefits', "Bank Account On Payment Creation Screen")
            await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundLossType, '22', "Bank Account On Payment Creation Screen")

        }

        if (reservetype != 'NA') {

            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType, "Reserve Type List On Funds Split Detail Screen")
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType.find('option').withText(reservetype), "Transaction Type Value On Funds Split Detail Screen")

        }
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(transactiontype), "Transaction Type Value On Funds Split Detail Screen")

        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, AmountType, "Transaction Amount On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FinalTransaction_Save,"save transaction")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        var CtrlNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
        return CtrlNumber;
    }

    async AssureClaims_AttachCreateEdit_Diary_Utility(Case, DiaryNote, WorkActivityNote, DueDate, EstHours) {
        var TaskName = `dxc${faker.name.lastName()}`;

        switch (Case) {
            case "Create":
                await Nav_Utility.AssureClaims_ElementClick_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Diary_Tab_Diary, "Diary click");

                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_DairyIframe);

                const Taskname = Selector("#entryName");
                await t.click(Taskname);
                await t.pressKey("ctrl+a delete");
                //var TaskName = dxc.faker.name.lastName(); 

                await In_Utility.AssureClaims_SetValue_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Diary_Txt_TaskName, TaskName, "Taskname box");

                await In_Utility.AssureClaims_SetValue_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Diary_Txt_DueDate, DueDate, "Diary due date");

                await Nav_Utility.AssureClaims_ElementClick_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_DiaryCreation_Btn_Time, "Diary Time On Diary Screen");

                await Nav_Utility.AssureClaims_ElementClick_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_DiaryCreation_Btn_WorkActivities, "Work activity search btn open");

                await In_Utility.AssureClaims_SetValue_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Diary_Txt_WorkActivitiesNotes, WorkActivityNote, "Activity Txtbox");

                await Nav_Utility.AssureClaims_ElementClick_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Diary_Btn_WorkActivitiesOK, "Save the workactivity");

                await In_Utility.AssureClaims_SetValue_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Diary_Txt_EstimatedHours, EstHours, "Time on diary");

                await Nav_Utility.AssureClaims_ElementClick_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Diary_Lst_Priority, "Select the priority");
                await Nav_Utility.AssureClaims_ElementClick_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Diary_Lst_Priority.find("option").withText("Optional"), "Select the priority");

                await In_Utility.AssureClaims_SetValue_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_DiaryCreation_Txt_Notes, DiaryNote, "Diary Note Txtbox");

                await Nav_Utility.AssureClaims_ElementClick_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Diary_Chk_AutoNotificationCompleted, "Automatic Notification When Completed");

                await Nav_Utility.AssureClaims_ElementClick_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_DiaryCreation_Chk_AutoNotificationLate, "Automatic Notification When Late");

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Dairy creation Screen");

                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, true, " Dairy Creation Screen");

                //  await Generic_Utility.AssureClaims_DynamicFrameSwitching(frame);

                break;

            case "Edit":
                await t.wait(2000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_ViewDiary_Btn, "View Record Diary btn click");
                await t.wait(2000)
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_DairyIframe);
                await t.wait(2000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Btn_SelectGrid, "Select the Grid");
                await Nav_Utility.AssureClaims_ElementClick_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Btn_EditDiary, "Edit btn clicked");
                await t.wait(20000);
                await In_Utility.AssureClaims_SetValue_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_Diary_Txt_TaskName, "dxcTasknameEdited", "Edited Taskname");

                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Dairy creation Screen");

                await Verify_Utility.AssureClaims_ElementExist_Utility(AttachCreateDiary_POM.AssureClaims_AttachCreate_EditTaskName_Label.withText("dxcTasknameEdited"), 'Transaction grid view');
                //   await Nav_Utility.AssureClaims_ElementClick_Utility( AttachCreateDiary_POM.AssureClaims_AttachCreate_DiaryCreation_Btn_Cancel, "cancel btn on EditDairy screen" );


                break;
        }
    }

    async AssureClaims_Event_DatedText() {
        await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_AddDatedTextPlus_Btn, "Click on the Add btn ");

        await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_EditDatedText_Btn, "Click on the edit btn");

        await In_Utility.AssureClaims_SetValue_Utility(Event_POM.AssureClaims_WriteDatedText_Txt, "Dated text test", "Input dated text");

        await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_OkDatedText_Btn, "Ok btn clicked");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button for dated text");
    }

    async AssureClaims_PersonInvolvedAddNewEntity_Utility(EntityType, ReqParam, ReqParam1, ReqParam2) {

        switch (EntityType) {
            case "Medical Staff":
                var MedStaffLastName = faker.name.lastName();
                var MedStaffFirstName = faker.name.firstName();
                var MedStaffNumber = faker.random.number({ min: 10000, max: 99999 });

                await Nav_Utility.AssureClaims_ElementClick_Utility(Medstaff_POM.AssureClaims_AddPersonInvolved, "Add Person Involved Button on WC Page")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Medstaff_POM.AssureClaims_AddMedicalStuff, "Add Medical Stuff Button on WC Page")
                // await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_MedStaffFrame);
                await In_Utility.AssureClaims_SetValue_Utility(Medstaff_POM.AssureClaims_PIMedicalStaff_Txt_LastName, MedStaffLastName, "Medical Staff Last Name Textbox On Medical Staff Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Medstaff_POM.AssureClaims_MedicalStaff_Txt_FirstName, MedStaffFirstName, "Medical Staff First Name Textbox On Medical Staff Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Medstaff_POM.AssureClaims_MedicalStaff_Txt_StaffNumber, MedStaffNumber.toString(), "Staff Number Textbox On Medical Staff Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Medical Staff creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Medical Staff Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Medstaff_POM.AssureClaims_PIMedicalStaff_Txt_LastName, MedStaffLastName, "Last Name Textbox On Medical Staff Creation Screen");
                return MedStaffLastName;
                break;
            case "Party":
                var PartyLastName = faker.name.lastName();
                var PartyFirstName = faker.name.firstName();

                await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_AddPersonInvolved, "Add Person Involved Button on LC Page")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_AddParty, "Add Party Button on LC Page")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_PIParty, "Select Party Type")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_PIParty_Type, "Select Beneficiary As Party Type")
                await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_PIParty_Txt_LastName, PartyLastName, "Party Last Name Textbox On Party Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_PIParty_Txt_FirstName, PartyFirstName, "Party First Name Textbox On Party Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Party creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Party Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Life_Claims.AssureClaims_PIParty_Txt_LastName, PartyLastName, "Last Name Textbox On Party Creation Screen");
                return PartyLastName;
                break;
        }
    }

 async AssureClaims_DiaryUtilities_TransferPurge_Utility(Case, DiaryOwner, FromOwner, ToOwner, ReqPara1, FromDate, ToDate, TaskName) {

        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility('Diary Utilities');
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.Assureclaims_Generic_DiaryUtilitieFrame)
        await t.wait(5000);

        switch (Case) {
            case "Transfer":
                await t.wait(4000)
                await Nav_Utility.AssureClaims_ConfigManagerUpperTab("Transfer Diary")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_DiaryUtilities_Lst_FromOwner, "FromOwner")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_DiaryUtilities_Lst_FromOwnerDropdown.find('span').withExactText(FromOwner), "FromOwner")

                await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_DiaryUtilities_Lst_ToOwner, "ToOwner")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_DiaryUtilities_Lst_ToOwnerDropdown.find('span').find('span').withText(ToOwner), "ToOwner")
                await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_DiaryUtilities_Txt_From, FromDate, "FromDate")
                await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_DiaryUtilities_Txt_To, ToDate, "ToDate")
                await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
                await t.wait(4000)
                await t.switchToMainWindow()
                break;

            case "Purge":
                await Nav_Utility.AssureClaims_ConfigManagerUpperTab("Purge Diary")
                const selectListOptionByText = ClientFunction((selector, text) => {
                    const element = document.querySelector('#purgeDiary');
                    const options = element.options;
                    for (let i = 0; i < options.length; i++) {
                        if (options[i].text === text) {
                            element.selectedIndex = i;
                            element.dispatchEvent(new Event('change'));
                            break;
                        }
                    }
                });

                const List = Diary_Utilities.AssureClaims_DiaryUtilities_Lst_PurgeDiaryOwner;
                const strDiaryOwner = DiaryOwner;

                await t
                    .click(List)
                    .expect(List.exists).ok()
                    .expect(List.visible).ok();

                await selectListOptionByText(List(), strDiaryOwner);
                await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Diary_Utilities.AssureClaimsApp_DiaryUtilities_Chk_PurgeOpenDiary, "Check", "Checked Open Diary Check Box")
                await t.wait(5000)
                await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_DiaryUtilities_Txt_PurgeFromDate,FromDate, "FromDate")
                await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_DiaryUtilities_Txt_PurgeToDate, ToDate, "ToDate")
                await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
                await t.wait(5000)

        }
    }

    async AssureClaims_EnhancedNotesCreateEditDelete_Utility(Case, NoteText, NoteType, EditNoteText) {
        var x = NoteType.substring(0, 2)
        console.log(x)
        switch (Case) {
            case "Create/Edit":

                await t.wait(4000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(Enhanced_Note.AssureClaims_Select_Enhanced_Notes, "Select EnhancedNote Button")
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_EnhanceNotesIframe);
                await Nav_Utility.AssureClaims_ElementClick_Utility(Enhanced_Note.AssureClaims_EnhancedNotes_Btn_CreateNotes, "Select Create Note Button")

                await In_Utility.AssureClaims_SetValue_Utility(Enhanced_Note.AssureClaims_EnhancedNotes_TxtArea_ProgressNotes, NoteText, "Typing Note")

                await In_Utility.AssureClaims_SetValue_Utility(Enhanced_Note.AssureClaims_Enhance_Note_Txt_InputNotesType, x, "fill notes type")
                await t.wait(2000)
                await t.pressKey('tab')
                var NoteType1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Enhanced_Note.AssureClaims_Enhance_Note_Txt_InputNotesType, " Value")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Enhanced_Note.AssureClaims_Enhance_Note_SaveButton, "Save Image Button");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Enhanced_Note.AssureClaims_EnhancedNotes_Btn_BackToNotes, "Click Back Button")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Enhanced_Note.AssureClaims_Enhanced_Notes_Btn_SelectGrid, "Click GridWindow Button")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Enhanced_Note.AssureClaims_EnhancedNotes_Btn_EditNotes, "Click Edit Button")
                await In_Utility.AssureClaims_SetValue_Utility(Enhanced_Note.AssureClaims_EnhancedNotes_TxtArea_ProgressNotes, EditNoteText, "Edited Note")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Enhanced_Note.AssureClaims_Enhance_Note_SaveButton, "Save Image Button");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Enhanced_Note.AssureClaims_EnhancedNotes_Btn_BackToNotes, "Click Back Button")
                await t.wait(4000)
                const ColHeader3 = ["Note Type "]
                const ColValue3 = [NoteType1]
                await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(NoteType1, "EnhanceNotes grid view", ColHeader3, ColValue3)
                break;

            case "Delete":
                await Nav_Utility.AssureClaims_ElementClick_Utility(Enhanced_Note.AssureClaims_Enhanced_Notes_Btn_SelectGrid, "Click GridWindow Button");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Enhanced_Note.AssureClaims_EnhancedNotes_Btn_DeleteNotes, "Delete Record Button");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteCancel, "Cancel Button On Confirm Delete PopUp");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Enhanced_Note.AssureClaims_EnhancedNotes_Btn_DeleteNotes, "Delete Record Button");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteOK, "Ok Button On Confirm Delete PopUp");
                break;
        }
    }

    async AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility(ReserveType, ReserveAmount, Status, SaveMessageVerification, ClaimNumber, StrHold) {

        var Val;
        //await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_AddReserve, "Add Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType, "Reserve Type")
        if (typeof ReserveType === 'number' && ReserveType % 1 == 0) {
            Val = await Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType.find('option').nth(ReserveType).textContent;
            await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType.find('option').nth(ReserveType), "Reserve Type")
        }
        else {
            await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType.find('option').withText(ReserveType), "Reserve Type")
            Val = ReserveType;
        }
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_ReserveAmount, ReserveAmount.toString(), "Amount Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_Status, "Reserve Status")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_Status.find('option').withText(Status), "Reserve Status")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Reserve Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(SaveMessageVerification, true, "Hold status as reserve limit exceed")
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back btn")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        const ColHeader = ["Status", "Reserve Type"]
        const ColValue = ["H - Hold", Val]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, Val, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("H - Hold", "Pending Transaction Grid", ColHeader, ColValue)
        return Val;
    }

    async AssureClaims_ClaimScan_Utility() {

        await Nav_Utility.AssureClaims_ElementClick_Utility(ClaimScan.AssureClaims_ClaimScan_morebtn, "Three Dot Button On Claim ToolBar");
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(ClaimScan.AssureClaims_ClaimScan_ClickClaimScanBtn, "ClaimScan Option From The List");
        await t.wait(30000);
    }


    // Utility for Operations in Premonition App//

    async AssureClaims_PremonitionApp_Utility() {

        await t.switchToWindow(w => w.title === "Claim Scan");
        await t.wait(20000);
        await t.maximizeWindow();
        await t.wait(20000);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Premonition_App.AssureClaims_PremonitionApp_Search_NotificationMsg)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_PreSuitHistory_Btn, "Pre Suit History Button");
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_PreSuitHistory_RecordSelection, "Selecting Transaction ID from History Grid");
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_PreSuitHisotry_Accordian, "History Grid Accordian");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_PreSuitSearchResult_RefreshBtn, "Refresh History Grid");
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_PreSuitHistory_ExportOptionsBtn, " Export Option Button");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_PreSuitHistory_ExportPDFBtn, "Export as PDF");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_PreSuitHistory_ExportExcelBtn, "Export as Excel");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_PreSuitHistory_HomeBtn, "Go back to Home Button");
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_SearchParameters_Accordian, " Open Search Accordian");
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_SearchParameters_ClearBtn, " Clear Search Parameters");
        await t.wait(2000);
        await t.pressKey('Ctrl + W');


    }



    async AssureClaims_LogoutFromApplication_Config_Manager_Utility() {
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Logout, "Logout Options")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_LogoutConfirm, "Confirm Button On Logout PopUp")
   }
    async AssureClaims_LifeClaimPaymentValidation_Utility(LifeClaimNumber) {

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Transaction");
        await t.wait(20000)

        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_FundsTransactionIframe);
        await t.wait(20000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_ClaimNumber_Lookup, LifeClaimNumber, "Claim number look up field")
        await t.wait(10000)
        await t.pressKey('tab')
        const errormesg = Selector('[class="toast toast-error"]');

        await t.expect(errormesg.exists).ok();
        await Verify_Utility.AssureClaims_VerifyUXErrorMessage_Utility(Verification_Msg.AssureClaims_TransactionLifeClaim_ValidationMessage, true, "Life Claim Number entered in Claim Number field")
    }



    async AssureClaims_FundsTransactionPaymentCorpAddition_Utility(CorpClaimNumber, BankAccount, payeetype, lastname, reservetype, transactiontype, amounttype) {


        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Transaction");
        await t.wait(4000)

        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_FundsTransactionIframe);
        await t.wait(4000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_ClaimNumber_Lookup, CorpClaimNumber, "Claim number look up field")
        await t.wait(2000)
        await t.pressKey('tab')
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Combined_POM.AssureClaims_CombinedPaySetUp_Lst_BankAccount, BankAccount, "PaymentCollection_Lst_Filter_By_Bank_Account On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(payeetype), "Payee Payor Type Value On Payment Creation Screen")
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, lastname, "Last Name Text Box On Payment Creation Screen")
        await t.wait(3000)
        await t.pressKey('tab')


        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType, "Reserve Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType.find('option').withText(reservetype), "Reserve Type Value On Funds Split Detail Screen")


        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(transactiontype), "Transaction Type Value On Funds Split Detail Screen")

        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, amounttype, "Transaction Amount On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")


        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    }

    async AssureClaims_FundsTransactionCarrierPaymentAddition_Utility(CarrierClaimNumber, ClaimantTracking, payeetype, lastname, Policy, ResType, TransType, Amount, Unit, CoverageType, LossType) {
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Transaction");
        await t.wait(20000)

        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_FundsTransactionIframe);
        await t.wait(20000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_ClaimNumber_Lookup, CarrierClaimNumber, "Claim number look up field")
        await t.wait(10000)
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Lst_DetailTrackingClaimant, "Detailed Claimant Tracking List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Lst_DetailTrackingClaimant.find('option').withText(ClaimantTracking), "Claimant Type Value On Payment Creation Screen")
        await t.wait(3000)

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(payeetype), "Payee Payor Type Value On Payment Creation Screen")
        await t.wait(3000)

        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, lastname, "Last Name Text Box On Payment Creation Screen")
        await t.wait(3000)
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")


        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundPolicy, "Policy Selection")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundPolicy.find('option').withText(Policy), "Policy Selection")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundUnit, "PaymentUnit")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundUnit.find('option').withText(Unit), "PaymnetUnit")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundCoverageType, "Fund Coverage Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundCoverageType.find('option').withText(CoverageType), "Fund Coverage Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundLossType, "Fund Loss Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundLossType.find('option').withText(LossType), "Fund Loss Type")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType, "Reserve Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType.find('option').withText(ResType), "Reserve Type Value On Funds Split Detail Screen")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(TransType), "Transaction Type Value On Funds Split Detail Screen")

        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, Amount, "Transaction Amount On Funds Split Detail Screen")


        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    }

    async AssureClaims_PaymentCorpAdditionWithSaveMessageVerification_Utility(BankAccount, PayeeType, LastName, ReserveType, TransType, Amount, SaveMessageVerification, DisType, Strclaimnumber, VerificationMessage, AdditionalParameter, Intlogval) {
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
        await t.wait(2000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, BankAccount, "Bank Account On Payment Creation Screen")
        await t.wait(1000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, PayeeType, "Payee Type")
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, LastName, "Last Name Text Box On Payment Creation Screen")
        await t.wait(4000)
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType, "Reserve Type")
        await t.wait(1000)
        if (typeof ReserveType === 'number' && ReserveType % 1 == 0) {
            await Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType.find('option').nth(ReserveType).textContent;
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType.find('option').nth(ReserveType), "Reserve Type")
        }
        else {
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType.find('option').withText(ReserveType), "Reserve Type")
        }

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type")
        await t.wait(1000)
        if (typeof TransType === 'number' && TransType % 1 == 0) {
            await Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').nth(TransType).textContent;
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').nth(TransType), "Transaction Type")
        }
        else {
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(TransType), "Transaction Type")
        }

        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, Amount, "Transaction Amount On Funds Split Detail Screen")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await t.wait(1000)
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(SaveMessageVerification, true, "Hold status as reserve limit exceed")
        var StrControlNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber, "value");
        return StrControlNumber;
    }
    async AssureClaims_CarrierPaymentAddition_Utility(BankAccount, PayeeType, TransType, Amount, Unit, CoverageType, LossType) {
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, BankAccount, "Bank Account On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(PayeeType), "Payee Payor Type Value On Payment Creation Screen")
        await t.wait(3000)

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(TransType), "Transaction Type Value On Funds Split Detail Screen")

        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, Amount, "Transaction Amount On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundUnit, "PaymentUnit")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundUnit.find('option').withText(Unit), "Reserve Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundCoverageType, "Fund Coverage Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundCoverageType.find('option').withText(CoverageType), "Fund Coverage Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundLossType, "Fund Loss Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundLossType.find('option').withText(LossType), "Fund Loss Type")


        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    }

        //Parul's Code : RMA-102664
        async AssureClaims_Audience_Utility(Case, Name, Origin, ForDataCollection, Lifetime, Days, Hour, Minutes, Active) {
        const EleAudNameOnGrid = Tokens_POM.AssureClaims_Audience_Txt_AudienceNameOnGrid.withText(Name)
        const EleForDeleteBtnOnGrid = EleAudNameOnGrid.parent(0).prevSibling(0).find('span').nth(1)
        await t.wait(10000);
        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Tokens");
        await t.wait(5000);
        await t.switchToIframe(Selector("#" + Verification_Msg.AssureClaims_TokensIframe + ""))
        await t.wait(2000);
        console.log("Tokens Screen Is Opened Up".green);
        switch (Case) {
            case "Create":
                await Nav_Utility.AssureClaims_ElementClick_Utility(Tokens_POM.AssureClaims_Tokens_Btn_AddNew, "Click on Add New Button On Tokens Screen")
                await t.wait(5000)
                await In_Utility.AssureClaims_SetValueAndTabOut_Utility(Tokens_POM.AssureClaims_Audience_Txt_Name, Name, "Audience Name")
                await In_Utility.AssureClaims_SetValueAndTabOut_Utility(Tokens_POM.AssureClaims_Audience_Txt_Origin, Origin, "Audience Origin Name")
                if (ForDataCollection === 'Yes') {
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Tokens_POM.AssureClaims_Audience_Chk_ForDataCollection, "Check", "For Assure Claims DataCollection CheckBox On Audience Screen")
                } else {
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Tokens_POM.AssureClaims_Audience_Chk_ForDataCollection, "UnCheck", "For Assure Claims DataCollection CheckBox On Audience Screen")
                }
                if (Lifetime === 'Yes') {
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Tokens_POM.AssureClaims_Audience_Chk_Lifetime, "Check", "Lifetime Checkbox On Audience Screen")
                } else {
                    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Tokens_POM.AssureClaims_Audience_Chk_Lifetime, "UnCheck", "Lifetime Checkbox On Audience Screen")
                    await In_Utility.AssureClaims_SetValue_Utility(Tokens_POM.AssureClaims_Audience_Txt_Days, Days, "Days of Validity Period")
                    await In_Utility.AssureClaims_SetValue_Utility(Tokens_POM.AssureClaims_Audience_Txt_Hours, Hours, "Hours of Validity Period")
                    await In_Utility.AssureClaims_SetValue_Utility(Tokens_POM.AssureClaims_Audience_Txt_Minutes, Minutes, "Minutes of Validity Period")
                }

                await Nav_Utility.AssureClaims_ElementClick_Utility(Tokens_POM.AssureClaims_Audience_Btn_Save, "Click on Save Button On Audience Creation Screen")
                console.log("EleAudNameOnGrid is" + await EleAudNameOnGrid.innerText)
                await Verify_Utility.AssureClaims_ElementExist_Utility(EleAudNameOnGrid)
                console.log("Newly Created Audience with Name: ".green + Name + " is displayed on Audience List Screen")
                break;

            case "Delete":
                console.log("Element on grid with Name: ".green + Name)
                await Nav_Utility.AssureClaims_ElementClick_Utility(EleForDeleteBtnOnGrid, "Click on Delete Button On Audience List Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Tokens_POM.AssureClaims_Tokens_Btn_Delete, "Ok Button On Confirm Delete PopUp On Audience List Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecDeleteMessage, false, "Audience List Screen")
                console.log("Audience is Deleted with Name: ".green + Name)
                break;
        }
    }
    async AssureClaims_NonOccClaimCreation(NonOcc_DateOfEvent, NonOcc_DateOfClaim, NonOcc_ClaimStatus, NonOcc_ClaimType, NonOcc_Department, NonOcc_PolicyLOB, NonOcc_EmployeeNo, NonOcc_Jurisdiction, PlanName, ClassName, DateHired, MonthlyRate) {
        var DisabilityStartDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -1, "MM/DD/YYYY")
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Non-occupational");
        await t.switchToMainWindow()
        await t.wait(8000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_NonOcc_ClaimNonOccIFrame);

        await t.wait(6000)
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent, NonOcc_DateOfEvent, "Date Of Event")
        await t.wait(1000);
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfClaim, NonOcc_DateOfClaim, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept, NonOcc_Department, "Department")
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele1_NonOcc_ClaimStatus = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText(NonOcc_ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele1_NonOcc_ClaimStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele1_NonOcc_ClaimStatus, "Claim Status Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele2_NonOcc_ClaimType = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withExactText(NonOcc_ClaimType).with({ visibilityCheck: true })
        await t.expect(ele2_NonOcc_ClaimType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele2_NonOcc_ClaimType, "Claim Type Option")

        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_txt_PolicyLOBLookup, NonOcc_PolicyLOB, "Policy lob text");
        await t.wait(2000)
        await t.pressKey('tab');

        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyLOBLookup,"Policy LOB Lookup")
        // const ele3_NonOcc_PolicyLOB = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectPolicyLOB.withText(NonOcc_PolicyLOB).with({ visibilityCheck: true })
        // await t.expect(ele3_NonOcc_PolicyLOB.exists).ok('', { timeout: 20000 })
        // await Nav_Utility.AssureClaims_ElementClick_Utility(ele3_NonOcc_PolicyLOB,"Policy LOB Option")

        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_NonOccClaim_Txt_EmployeeNo, NonOcc_EmployeeNo, "Empolyee Number")
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_NonOccClaim_Btn_Jurisdiction, "Jurisdiction Lookup")
        const ele4_NonOcc_Jurisdiction = Generic_Claims.AssureClaims_NonOccClaim_Lnk_Jurisdiction.withText(NonOcc_Jurisdiction).with({ visibilityCheck: true })
        await t.expect(ele4_NonOcc_Jurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_NonOcc_Jurisdiction, "Jurisdiction Option")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_NonOccClaim_Txt_DisabilityStartDate, DisabilityStartDate, "Disabilitystartdate");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_NonOccClaim_Search_PlanName, "Plan name Searched")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_NonOccClaim_Txt_PlanNamescreen, PlanName, "Plan Name")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_NonOccClaim_Lnk_GridPlanName.withText(PlanName), "click link")
        await t.wait(2000);
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Generic_Claims.AssureClaims_NonOccClaims_Txt_ClassName, ClassName, "ClassName");
        //await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_NonOccClaim_Tab_ClaimInfo,"Claim Info Clicked");
        //await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_NonOccClaim_Tab_EmploymentInfo,"Employment Info Clicked");
        //await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_NonOccClaim_Txt_DateHired,DateHired,"Date Hired");
        //await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept,NonOcc_Department,"Department")
        // await t.pressKey('tab')
        //await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_NonOccClaim_Txt_EmpMonthlyRate,MonthlyRate,"Monthly Rate");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " NonOCC Creation Screen");
        var StrNonOccClaimNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_NonOccClaim_Txt_ClaimNumber, "value");
        return StrNonOccClaimNumber;
    }


    async AssureClaims_ClaimsMadePolicy(GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_Department, GenClaimCreation_Txt_ClaimDtReptd, GenClaimCreation_Txt_PolicyLOB, GenClaimCreation_Lst_PolicySystem, PolicyName, PolicyUnit, PolicyCoverage) {
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:General Claim");
        await t.wait(5000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent, GenClaimCreation_Txt_DateOfEvent, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfClaim, GenClaimCreation_Txt_DateOfClaim, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfClaim, "Time Of Claim")

        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimType, GenClaimCreation_Txt_ClaimType, "Claim type")
        await t.pressKey('tab')

        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_SelectClaimType, GenClaimCreation_Txt_PolicyLOB, "Policy LOB")
        await t.wait(2000)
        await t.pressKey('tab')

        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimDateRptd, GenClaimCreation_Txt_ClaimDtReptd, "Claim Date Rptd.")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele_CarrierStatus = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText(GenClaimCreation_Txt_ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele_CarrierStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierStatus, "Claim Status Option")

        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept, GenClaimCreation_Txt_Department, "Department")
        await t.pressKey('tab')
        await t.wait(4000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyNameLookup, "Policy Name Lookup")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicyLookup, "Policy System List")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicyName.withText(GenClaimCreation_Lst_PolicySystem), "Select Policy System List")
        await t.wait(2000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SubPolicyDownloadIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_SubmitQuery, "Submit Query Button")
        await t.wait(5000);

        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaimsApp_GenericClaim_ClkTxt_PolicyName, PolicyName, "PolicyName TextBox");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Lnk_InternalPolicyName.withText(PolicyName), "Policy Name")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyPreview, "Right Click On Policy Preview")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_List.withText('Unit List'), "Open Unit List tab")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_UnitList.parent('[class="ng-scope"]').find('tr').find('td').sibling(1).withText(PolicyUnit).sibling(0).find('input'), "Check Unit List")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaimsApp_GenericClaim_Policy_Coverage_Lst.sibling(1).withText(PolicyCoverage).sibling(0).find('input'), "Check Policy Property List")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicySave, "Save Internal Policy")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyDownload, "Download Policy")
        await t.wait(8000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");

        //Policy Attached To the Claim
        var StrClaimNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        return StrClaimNumber;
    }

    //ANURAG'S CODE :RMA-82420

    async AssureClaims_PremonitionApp_Utility_InSuit() {
        await t.wait(30000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_ClaimScanIframe);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Premonition_App.AssureClaims_PremonitionApp_SearchParameters_Accordian, "Search Parameters")
        await t.wait(2000);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Premonition_App.AssureClaims_PremonitionApp_LitigationScanResultInSuit_Accordian, "In-Suit LitigationScan Search Result")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_SearchParameters_Accordian, "Search Parameters");
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_SearchParameters_ClearBtn, "Clear");
        await t.wait(2000);

    }
    async AssureClaims_PremonitionApp_Utility_PreSuit() {
        await t.wait(30000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_ClaimScanIframe);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Premonition_App.AssureClaims_PremonitionApp_SearchParameters_Accordian, "Search Parameters")
        await t.wait(4000)

        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_PreSuit_CaseTypeComboBoxSelect, "Case Type Combobox")
        await t.wait(4000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_PreSuit_CaseTypeSelection.withText("Contract"), "Contract : Value Of CaseType")

        await t.wait(4000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_SearchParameters_SearchBtn, "Search");
        await t.wait(10000);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Premonition_App.AssureClaims_PremonitionApp_LitigationScanResultPreSuit_Accordian, "Pre-Suit LitigationScan Search Result")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_SearchParameters_Accordian, "Search Parameters");
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Premonition_App.AssureClaims_PremonitionApp_SearchParameters_ClearBtn, "Clear");
        await t.wait(2000);
    }


    async AssureClaims_Create_New_Litigation(CourtName, County, VenueState, MatterName) {
        var DocketNumber = faker.random.number({ min: 1000000, max: 9999999 });
        await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_AddLitigation, "Add Litigation Button On Claim Page")
        await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_DocketNumber, DocketNumber.toString(), "Docket Number Textbox On Litigation Screen");

        //court name
        await t.pressKey('tab')
        await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_CourtName, CourtName, "Court Name")

        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_VenueState, "Venue State Lookup")
        await t.wait(2000);
        const ele1 = Litigation_POM.AssureClaims_Litigation_Lnk_SelectVenueState.withText(VenueState).with({ visibilityCheck: true })
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Venue State Option")

        //county
        await t.pressKey('tab')
        await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_County, County, "County Name")

        //mattername
        await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Tab_MatterInfo, "Matter Info")

        await t.pressKey('tab')
        await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_MatterName, MatterName, "Matter Name")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Litigation creation Screen");
        //  await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " Litigation Creation Screen");
        await t.wait(2000);

    }
    async AssureClaims_BankAccount_SubBankAccount_Utility(SubBankAccountName, SubBankAccountNumber, SubBankAccountCheckStock) {
        await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_SubBankAccount_Btn_AddSubBankAccount, "SubBankAccount On BankAccount is Clicked")

        await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_SubBankAccount_Txt_SubAccountName, SubBankAccountName, "SubBank Account Name is Typed")

        await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_SubBankAccount_Txt_SubAccountNumber, SubBankAccountNumber, "SubBank Account number is Typed")

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_SubBankAccount_Lst_CheckStock, SubBankAccountCheckStock, "Check stock is Selected From the Checkstock DropDown")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Creation OF BankAccount Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");
    }

    async AssureClaims_BankAccount_Deposit_Utility(TransactionDateLess, TransactionDate, BankORSubBankAccount, DepositAmount) {

        await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Deposit_Btn_AddDeposit, "Deposit On BankAccount is Clicked")
        if (TransactionDateLess != 'NA') {
            await t.wait(8000)
            await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Deposit_Txt_DateOfTransaction, TransactionDateLess, "Date Of Transaction")
            await t.pressKey('tab');
        }
        if (TransactionDate != 'NA') {
            await t.wait(8000)
            await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Deposit_Txt_DateOfTransaction, TransactionDate, "Date Of Transaction")
        }
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Deposit_Txt_BankORSubBankAccount, BankORSubBankAccount, "Check stock is Selected From the Checkstock DropDown")

        await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Deposit_Txt_Amount, DepositAmount, "Amount TextBox On Deposit screen")


        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Creation OF BankAccount Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");

    }
    async AssureClaims_NReserve_Utility(NR_ReserveType, AmountType, ReserveStatus) {

        //await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_AddReserve, "Add Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType, "Reserve Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType.find('option').withText(NR_ReserveType), "Reserve Type")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_ReserveAmount, AmountType.toString(), "Amount Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_Status, "Reserve Status")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_Status.find('option').withText(ReserveStatus), "Reserve Status")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SaveandExit_Button, "Save and exit");
        //await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Reserve Creation Screen");

        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Reserve Creation Screen");
    }
    async AssureClaims_NCollectionCorpAddition_Utility(BankAccount, payeetype, lastname, transactiontype, amounttype) {
        var FromDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, 0, "MM/DD/YYYY")
        var ToDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 2, 0, "MM/DD/YYYY")



        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_AddCollection, "Add collection Button On Payment Creation Screen")
        await t.wait(2000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, BankAccount, "Bank Account On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(payeetype), "Payee Payor Type On Payment Creation Screen")
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, lastname, "Last Name Text Box On Payment Creation Screen")
        await t.wait(3000)
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen");
        await t.wait(4000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(transactiontype), "Transaction Type Value On Funds Split Detail Screen")

        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, amounttype, "Transaction Amount On Funds Split Detail Screen")
        //await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_FromDate, FromDate, "Fromdate");
        //await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_ToDate, ToDate, "todate");


        //await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_worklosspopup_handle, "Done");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")

        // await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FinalTransaction_Save,"save transaction")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SaveandExit_Button, "Save and exit");

        //await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    }
    //END

    //RMA-87941
    async AssureClaims_UpdateWorkersCompClaimCreation(WCClaimCreation_Txt_DateOfEvent, WCClaimCreation_Txt_DateOfClaim, WCClaimCreation_Txt_Department, WCClaimCreation_Txt_ClaimStatus, WCClaimCreation_Txt_PolicyLOB, WCClaimCreation_Txt_ClaimType, EmployeeNo, WCClaimCreation_Txt_Jurisdiction) {
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Workers’ Comp");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);
        await t.wait(5000)
        //await t.typeText(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent, GenClaimCreation_Txt_DateOfEvent).setTestSpeed(0.6)
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_DateOfEvent, WCClaimCreation_Txt_DateOfEvent, "Date Of Event")
        await t.wait(1000);
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_DateOfClaim, WCClaimCreation_Txt_DateOfClaim, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_ClaimInfo_Dept, WCClaimCreation_Txt_Department, "Department")
        await t.wait(2000)
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Btn_ClaimStatus, "Claim Status Lookup")
        const ele1_WCClaimStatus = WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Lnk_SelectClaimStatus.withText(WCClaimCreation_Txt_ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele1_WCClaimStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele1_WCClaimStatus, "Claim Status Option")


        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele3_WCPolicyLOB = WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Lnk_SelectPolicyLOB.withExactText(WCClaimCreation_Txt_PolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele3_WCPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele3_WCPolicyLOB, "Policy LOB Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Btn_ClaimType, "Claim Type Lookup")
        const ele2_WCClaimType = WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Lnk_SelectClaimType.withExactText(WCClaimCreation_Txt_ClaimType).with({ visibilityCheck: true })
        await t.expect(ele2_WCClaimType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele2_WCClaimType, "Claim Type Option")


        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims__Select_EmployeeNum, EmployeeNo, "Empolyee Number")
        await t.wait(3000)
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Btn_Jurisdiction, "Jurisdiction Lookup")
        const ele4_WCJurisdiction = WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Lnk_Jurisdiction.withText(WCClaimCreation_Txt_Jurisdiction).with({ visibilityCheck: true })
        await t.expect(ele4_WCJurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_WCJurisdiction, "Jurisdiction Lookup Option")
        await t.wait(5000)

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await t.wait(8000)
        var StrWCClaimNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Txt_Claimnumber, "value")
        return StrWCClaimNumber;

    }

    async AssureClaims_Funds_WorklossTransaction_Creation(ClaimNumber, BankAccount, payeetype, reservetype, transactiontype, AmountType, Check, FromDate, ToDate) {
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Transaction")
        await t.wait(4000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Funds_Transaction_ClaimGCIframe);
        await t.wait(10000)

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Funds_Btn_ClaimNumber, "Open Claim Number Lookup");
        await t.wait(15000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SubBankAccountIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_ClaimNumber, ClaimNumber, "Claim Number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.wait(10000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_ClaimNumber.withText(ClaimNumber), "ClaimNumber link")
        await t.wait(30000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Funds_Transaction_ClaimGCIframe);

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, BankAccount, "Bank Account On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(payeetype), "Payee Payor Type On Payment Creation Screen")
        await t.wait(3000)

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType, "Reserve Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_ReserveType.find('option').withText(reservetype), "Reserve Type Value On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(transactiontype), "Transaction Type Value On Funds Split Detail Screen")
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, AmountType, "Transaction Amount On Funds Split Detail Screen")


        if (Check != 'NA') {
            await In_Utility.AssureClaims_SetValue_Utility(WorkLoss_POM.AssureClaims_FromToDate_Btn_FromDate, FromDate, "insert From date");
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
            await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_FromToDate_Btn_done.withText("done"), "Done with ok from date")
            await Verify_Utility.AssureClaims_ElementExist_Utility(WorkLoss_POM.AssureClaims_FromToDate_Toast_verify.withText("Please enter To Date"), "Verify to date");
            await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_FromToDate_Btn_Close, "Close the toast");

            await t.click(WorkLoss_POM.AssureClaims_FromToDate_Btn_FromDate);
            await t.pressKey('ctrl+a delete')

            await In_Utility.AssureClaims_SetValue_Utility(WorkLoss_POM.AssureClaims_FromToDate_Btn_ToDate, ToDate, "insert To date");
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
            await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_FromToDate_Btn_done.withText("done"), "Done with ok from date")
            await Verify_Utility.AssureClaims_ElementExist_Utility(WorkLoss_POM.AssureClaims_FromToDate_Toast_verify.withText("Please enter From Date"), "Verify From date");
            await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_FromToDate_Btn_Close, "Close the toast");
        }

        await In_Utility.AssureClaims_SetValue_Utility(WorkLoss_POM.AssureClaims_FromToDate_Btn_FromDate, FromDate, "insert From date");
        await In_Utility.AssureClaims_SetValue_Utility(WorkLoss_POM.AssureClaims_FromToDate_Btn_ToDate, ToDate, "insert To date");

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await t.wait(5000)
        var CtrlNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
        return CtrlNumber;

    }
    async AssureClaims_CarrierGCClaimCreation_SelectSecondUnit(GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_Department, GenClaimCreation_Txt_PolicyLOB, GenClaimCreation_Lst_PolicySystem, PolicyName) {

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:General Claim");
        await t.wait(5000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent, GenClaimCreation_Txt_DateOfEvent, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfClaim, GenClaimCreation_Txt_DateOfClaim, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfClaim, "Time Of Claim")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele_CarrierClaimType = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withText(GenClaimCreation_Txt_ClaimType).with({ visibilityCheck: true })
        await t.expect(ele_CarrierClaimType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierClaimType, "Claim Type Option")


        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele_CarrierStatus = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText(GenClaimCreation_Txt_ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele_CarrierStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierStatus, "Claim Status Option")

        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept, GenClaimCreation_Txt_Department, "Department")
        await t.pressKey('tab')
        await t.wait(4000);

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele_CarrierPolicyLOB = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectPolicyLOB.withText(GenClaimCreation_Txt_PolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele_CarrierPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierPolicyLOB, "Policy LOB Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyNameLookup, "Policy Name Lookup")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicyLookup, "Policy System List")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicyName.withExactText(GenClaimCreation_Lst_PolicySystem), "Select Policy System List")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SubPolicyDownloadIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_SubmitQuery, "Submit Query Button")
        await t.wait(5000);
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaimsApp_GenericClaim_ClkTxt_PolicyName, PolicyName, "PolicyName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Lnk_InternalPolicyName.withText(PolicyName), "Policy Name")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyPreview, "Right Click On Policy Preview")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_List.withText('Interest List'), "Open Interest List tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_InterestListClaimant, "Check Claimant")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_List.withText('Unit List'), "Open Unit List tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_UnitList1, "Check Unit List")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_PolicyProperty, "Check", "Check Policy Property List")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicySave, "Save Internal Policy")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyDownload, "Download Policy")
        await t.wait(8000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");

        //Policy Attached To the Claim

        var StrClaimNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        return StrClaimNumber;
    }
    //Tushar's Code : RMA - 96126 started here
    async AssureClaims_UpdatedCarrierReserveAddition_Utility(ReserveUnit, CoverageType, LossType, ReserveType, ReserveAmount, ReserveStatus) {
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await t.wait(12000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_AddReserve, "Add Reserve")
        await t.wait(5000)
        // Unit Value
        if (typeof ReserveUnit === 'number') {
            await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveUnit, ReserveUnit, "Reserve Unit Type Value")
        }
        else {
            await In_Utility.AssureClaims_ElementWebListSelect_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveUnit, ReserveUnit, "Reserve Unit Type Value")
        }
        // Coverage type
        if (typeof CoverageType === 'number') {
            await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveCoverageType, CoverageType, "Reserve Coverage Type Value")
        }
        else {
            await In_Utility.AssureClaims_ElementWebListSelect_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveCoverageType, CoverageType, "Reserve Unit Type Value")
        }
        // Loss Type
        if (typeof LossType === 'number') {
            await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveLossType, LossType, "Reserve Loss Type Value")
        }
        else {
            await In_Utility.AssureClaims_ElementWebListSelect_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveLossType, LossType, "Reserve Loss Type Value")
        }
        // Reserve Type
        if (typeof ReserveType === 'number') {
            await In_Utility.AssureClaims_ElementWebListSelectByIndex_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType, ReserveType, "Reserve Type Value")
        }
        else {
            await In_Utility.AssureClaims_ElementWebListSelect_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType, ReserveType, "Reserve Loss Type Value")
        }
        // Amount Type
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_ReserveAmount, ReserveAmount.toString(), "Amount Type")
        // Reserve Status
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_Status, ReserveStatus, "Reserve Loss Type Value")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Reserve Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Reserve Creation Screen");
    }
    //Tushar's Code : RMA - 96126 ended here

    //=======================================RMA-97663 : Muskan's Code starts here=======================================================================
    async AssureClaims_GenericSearch_Utility(Zone, SearchType, ReqParam1, ReqParam2) {
        switch (SearchType) {

            //===============================================Claim Search starts here=====================================================================
            case "Claim":
                if (Zone === 'ClaimZone' || Zone === 'MaintenanceZone') {
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Claim");
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_ClaimIframe);
                    await t.wait(3000)
                    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_ClaimNumber, ReqParam1, "Claim Number")
                    await t.wait(3000)
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
                    await t.switchToMainWindow();
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_ClaimIframe1);
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(ReqParam1), "ClaimNumber link")
                    console.log("Search is Completed");
                    await t.switchToMainWindow()
                    await t.wait(4000)
                    break;
                }
            //===============================================Claim Search starts here=====================================================================

            //===============================================Diary Search starts here=====================================================================
            case "Diary":
                if (Zone === 'ClaimZone' || Zone === 'MaintenanceZone') {
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Diary");
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_DiaryIframe);
                    await t.wait(3000)
                    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_DiaryTaskName, ReqParam1, "Diary TaskName")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
                    await t.switchToMainWindow();
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_DiaryIframe);
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(ReqParam1), "TaskName link")
                    console.log("Search is Completed");
                    await t.switchToMainWindow()
                    await t.wait(4000)
                    break;
                }
            //===============================================Diary Search starts here=====================================================================

            //===============================================Entity Search starts here=====================================================================
            case "Entity":
                if (Zone === 'ClaimZone') {
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Entity");
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_EntityIframe);
                    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityLastName, ReqParam1, "Entity LastName")
                    if (ReqParam2 != 'NA') {
                        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityFirstName, ReqParam2, "Entity FirstName")
                    }
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
                    await t.wait(3000)
                    await t.switchToMainWindow();
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_EntityIframe);
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.nth(0), "Entity LastName link")
                    console.log("Search is Completed");
                    await t.switchToMainWindow()
                    await t.wait(4000)

                }
                if (Zone === 'MaintenanceZone') {
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Entity");
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntitySearchFrame);
                    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityLastName, ReqParam1, "Entity LastName")
                    if (ReqParam2 != 'NA') {
                        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityFirstName, ReqParam2, "Entity FirstName")
                    }
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
                    await t.wait(3000)
                    await t.switchToMainWindow();
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_EntityIframe);
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.nth(0), "Entity LastName link")
                    console.log("Search is Completed");
                    await t.switchToMainWindow()
                    await t.wait(4000)
                }
                break;
            //===============================================Entity Search starts here=====================================================================

            //===============================================Event Search starts here=====================================================================
            case "Event":
                if (Zone === 'ClaimZone' || Zone === 'MaintenanceZone') {
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Event");
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_EventIframe);
                    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EventNumber, ReqParam1, "Event Number")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
                    await t.wait(3000)
                    await t.switchToMainWindow();
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_EventIframe);
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(ReqParam1), "Event Number Link")
                    console.log("Search is Completed");
                    await t.switchToMainWindow()
                    await t.wait(4000)
                    break;
                }
            //===============================================Event Search starts here=====================================================================

            //===============================================Funds Search starts here=====================================================================
            case "Funds":
                if (Zone === 'ClaimZone' || Zone === 'MaintenanceZone') {
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Claim_Lnk_Search.withText('Search'))
                    await t.wait(2000)
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Claim_Lnk_Funds.withText('Funds'))
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_FundsIframe);
                    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_FundsControlnumber, ReqParam1, "Check Number")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
                    await t.wait(3000)
                    await t.switchToMainWindow();
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_FundsIframe);
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(ReqParam1), "Check Number Link")
                    console.log("Search is Completed");
                    await t.switchToMainWindow()
                    await t.wait(4000)
                    break;
                }
            //===============================================Funds Search starts here=====================================================================

            //===============================================Org. Hierarchy Search starts here=====================================================================
            case "Org. Hierarchy":
                if (Zone === 'ClaimZone' || Zone === 'MaintenanceZone') {
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Org. Hierarchy");
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_OrgHierarchyIframe);
                    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_OrgHierarchyName, ReqParam1, "Org. Hierarchy Name")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
                    await t.wait(3000)
                    await t.switchToMainWindow();
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_OrgHierarchyIframe);
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(ReqParam1), "Org. Hierarchy Name link")
                    console.log("Search is Completed");
                    await t.switchToMainWindow()
                    await t.wait(4000)
                    break;
                }
            //===============================================Org. Hierarchy Search starts here=====================================================================

            //===============================================Policy Search starts here=====================================================================
            case "Policy":
                if (Zone === 'ClaimZone') {
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Policy");
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_PolicyIframe);
                    if (ReqParam1 != 'NA') {
                        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_PolicyName, ReqParam1, "Policy Name")
                    }
                    if (ReqParam2 != 'NA') {
                        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_PolicyNumber, ReqParam2, "Policy Number")
                    }
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
                    await t.wait(3000)
                    await t.switchToMainWindow();
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_PolicyIframe);
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.nth(0), "Policy Number link")
                    console.log("Search is Completed");
                    await t.switchToMainWindow()
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(2), "Close Result window")
                    await t.switchToMainWindow()
                    await t.wait(5000)
                }
                if (Zone === 'MaintenanceZone') {
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Policy");
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_PolicyIframe);
                    if (ReqParam1 != 'NA') {
                        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_PolicyName, ReqParam1, "Policy Name")
                    }
                    if (ReqParam2 != 'NA') {
                        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_PolicyNumber, ReqParam2, "Policy Number")
                    }
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
                    await t.wait(3000)
                    await t.switchToMainWindow();
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_PolicyIframe);
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.nth(0), "Policy Number link")
                    console.log("Search is Completed");
                    await t.switchToMainWindow()
                    await t.wait(5000)
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(1), "Close Result window")
                    await t.switchToMainWindow()
                    await t.wait(5000)
                }
                break;
            //===============================================Policy Search starts here=====================================================================

            //===============================================Property Search starts here=====================================================================
            case "Property":
                if (Zone === 'ClaimZone' || Zone === 'MaintenanceZone') {
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Property");
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_PropertyIframe);
                    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_PropertyId, ReqParam1, "Property ID")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
                    await t.wait(3000)
                    await t.switchToMainWindow();
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_PropertyIframe);
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(ReqParam1), "Property ID link")
                    console.log("Search is Completed");
                    await t.switchToMainWindow()
                    await t.wait(4000)
                    break;
                }
            //===============================================Property Search starts here=====================================================================

            //===============================================Vehicle Search starts here=====================================================================
            case "Vehicle":
                if (Zone === 'ClaimZone' || Zone === 'MaintenanceZone') {
                    await t.wait(8000)
                    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Vehicle");
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_VehicleIframe);
                    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_VehicleId, ReqParam1, "Vehicle ID")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
                    await t.wait(3000)
                    await t.switchToMainWindow();
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_VehicleIframe);
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(ReqParam1), "Vehicle ID link")
                    console.log("Search is Completed");
                    await t.switchToMainWindow()
                    await t.wait(4000)
                    break;
                }
            //===============================================Vehicle Search starts here=====================================================================

            default: console.log("This Case is Not Defined In the Function of Search Entity over Claim Zone Page")
        }
    }
    //=======================================RMA-97663 : Muskan's Code ends here=======================================================================
    
    //*****************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-99470
    //Description      : Utility for navigating over configuration manager over specific setting page
    //Input Parameters : StrSettingPageName->Configuration screen by name, StrFrameName->Frame of the page
    //StrUpperTabName->User have to provide upper tab name, StrLeftTabName->User have to provide left sub tab name
    //Revision	       : 0.0 Muskan Garg 01/11/2023
    //*****************************************************************************************************************************************************************
    async AssureClaims_ConfigManagerNavigation_Utility(StrSettingPageName, StrFrameName, StrUpperTabName, StrLeftTabName) {

            await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility(StrSettingPageName);
            await t.wait(5000);
            await t.switchToIframe(Selector("#" + StrFrameName + ""))
            await t.wait(5000);
            await Nav_Utility.AssureClaims_ConfigManagerUpperTab(StrUpperTabName)
            await t.wait(2000);
            await Nav_Utility.AssureClaims_ConfigManagerLeftTab(StrLeftTabName)
    }
    
    //**********************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-100012
    //Description      : Utility for Power View Creation via Old Utilites
    //Input Parameters : Power_View_Name->User Have To Provide Power View Name ,PowerView_Description->User Have To Provide Power View Description ,Operations-> User Have To Provide Operation To Be Done  
    //Revision         : 0.0 Parul Sharma 01/12/2023
    //**********************************************************************************************************************************************************************************************************
    async AssureClaims_PowerViewCreation(Power_View_Name, PowerView_Description, Operations) {
        switch (Operations) {
            case "Add":

                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Button, "Click on Add Button On PowerView Editor Screen")

                const Power_View_Add_Popup_Heading = PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_Heading.withText('View Detail').with({ visibilityCheck: true })
                await t.expect(Power_View_Add_Popup_Heading.exists).ok('', { timeout: 20000 })
                console.log("View Detail Popup Is Opened ".green);
                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_View_Name, "Click on View Name Field")
                await In_Utility.AssureClaims_SetValue_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_View_Name, Power_View_Name, "ReporterPowerView_Name Entered in View Name Field")
                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_View_Description, "Click on View Description Field")
                await In_Utility.AssureClaims_SetValue_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_View_Description, PowerView_Description, "Value Entered in View Description Field")
                await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_Data_Collection_Enabled, 'Check', "Data Collection Checkbox is Checked")
                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_Save_Button, "Save Button Is Clicked")

                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_Power_View_Add_Message, false, "Power View Editor Screen")
                break;
            case "Edit":
                const Edit_View_Name = PowerView_POM.AssureClaimsApp_Lnk_Power_View_Edit_View_Heading.withText('View Definition for: ' + Power_View_Name).with({ visibilityCheck: true })
                await t.expect(Edit_View_Name.exists).ok('', { timeout: 20000 })
                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Edit_View_Available_Checkbox, "Available Form Checkbox Is Clicked")
                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Edit_View_Save_Button, "Save Button Is Clicked")
                break;
            default: console.log("This Case is Not Defined In the Function of Power View creation")
        }
    }
 //======================================================RMA-99791 Melissa Address Auto Complete and Address Verification Code Starts=======================================================================
     async AssureClaims_MelissaAddress_UpdateWorkersCompClaimCreation(WCClaimCreation_Txt_DateOfEvent, WCClaimCreation_Txt_DateOfClaim, WCClaimCreation_Txt_Department, WCClaimCreation_Txt_ClaimStatus, WCClaimCreation_Txt_PolicyLOB, WCClaimCreation_Txt_ClaimType, EmployeeNo, WCClaimCreation_Txt_Jurisdiction) {
        var EmployeeLastName = faker.name.lastName();
        var EmployeeSSN = faker.random.number({ min: 100000000, max: 999999999 });
        var Address1 = faker.address.streetName();
        var LocAddress1 = faker.address.streetName();
        var LitigationAddress1 = faker.address.streetName();
        var AttorneyLstName = faker.name.lastName();
        var AttorneyAdd1 = faker.address.streetName();
        
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Workers’ Comp");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_DateOfEvent, WCClaimCreation_Txt_DateOfEvent, "Date Of Event")
        await t.wait(1000);
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_DateOfClaim, WCClaimCreation_Txt_DateOfClaim, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Txt_ClaimInfo_Dept, WCClaimCreation_Txt_Department, "Department")
        await t.wait(2000)
        await t.pressKey('tab')

        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Btn_ClaimStatus, "Claim Status Lookup")
        const ele1_WCClaimStatus = WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Lnk_SelectClaimStatus.withText(WCClaimCreation_Txt_ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele1_WCClaimStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele1_WCClaimStatus, "Claim Status Option")


        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele3_WCPolicyLOB = WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Lnk_SelectPolicyLOB.withExactText(WCClaimCreation_Txt_PolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele3_WCPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele3_WCPolicyLOB, "Policy LOB Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Btn_ClaimType, "Claim Type Lookup")
        const ele2_WCClaimType = WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Lnk_SelectClaimType.withExactText(WCClaimCreation_Txt_ClaimType).with({ visibilityCheck: true })
        await t.expect(ele2_WCClaimType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele2_WCClaimType, "Claim Type Option")
        
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Btn_Jurisdiction, "Jurisdiction Lookup")
        const ele4_WCJurisdiction = WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Lnk_Jurisdiction.withText(WCClaimCreation_Txt_Jurisdiction).with({ visibilityCheck: true })
        await t.expect(ele4_WCJurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_WCJurisdiction, "Jurisdiction Lookup Option")
        await t.wait(5000)

       
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Tab_Employeeinfo, "WC Empolyee Info Tab")
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_EmployeeInfo_Tab_LastName, EmployeeLastName, "Employee Last Name")
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Txt_EmployeeSSN, EmployeeSSN.toString(), "Employee SSN")
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Txt_EmployeeAddress1, Address1, "Employee Address1")
        await t.pressKey('tab')
        
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Address_VerificationFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Melissa_Btn_SuggestedAddress, "Suggested Address on Melissa Address Verification PopUp is saved")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Melissa_Btn_VerficationOK, "Melissa Address Verification screen popup is saved")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_ClaimWCIframe);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Employee Address1 is verified successfully");
        
        //////////////////////////////////////Event Tab Details////////////////////////////////////////////////
        
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Claims_Tab_EventDetail, "WC Entity Detail Tab")
        await In_Utility.AssureClaims_SetValue_Utility(WorkersComp_Claims.AssureClaims_WorkersComp_Txt_EventDetail_LocationAddress1, LocAddress1, "Location Address1")
        await t.pressKey('tab')
        
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Address_VerificationFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Melissa_Btn_SuggestedAddress, "Suggested Address on Melissa Address Verification PopUp is saved")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Melissa_Btn_VerficationOK, "Melissa Address Verification screen popup is saved")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_ClaimWCIframe);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Location Address1 is verified successfully");
        
        await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_AddLitigation, "Litigation page open")
        /////////////////////////////////////Attorney Info Tab////////////////////////////////////////////
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Tab_AttorneyInformation, "Attorney Infor tab")       
        await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_AttorneyLasttName , AttorneyLstName , "Attorney Last Name")
        await t.pressKey('tab')
        await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_WorkersComp_Txt_AttorneyAddress1 , AttorneyAdd1 , "Attorney Address1 entered successfully")
        await t.pressKey('tab')
        
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Address_VerificationFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Melissa_Btn_SuggestedAddress, "Suggested Address on Melissa Address Verification PopUp is saved")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Melissa_Btn_VerficationOK, "Melissa Address Verification screen popup is saved")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_ClaimWCIframe);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Attorney Address1 is verified successfully"); 
       
        //////////////////////////////////Litigation Info Tab///////////////////////////////////////////////////////
        
        await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Tab_LitigationInfo, "Litigation Info tab")
        await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_WorkersComp_Txt_LitigationAddress1 , LitigationAddress1 , "Litigation Address1 entered successfully")
        await t.pressKey('tab')
        
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Address_VerificationFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Melissa_Btn_SuggestedAddress, "Suggested Address on Melissa Address Verification PopUp is saved")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Melissa_Btn_VerficationOK, "Melissa Address Verification screen popup is saved")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_ClaimWCIframe);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Litigation Address1 is verified successfully"); 
       
    }    
     //**********************************************************************************************************************************************************************************************************

    //JIRA ID OF STORY : RMA-102664
    //Description      : Utility for Activation Code via Configuration Manage
    //Input Parameters : StrSettingName->User Have To Provide Setting Name ,StrElementDetail->User Have To Provide Element POM ,StrLicenseKey-> User Have To Provide LicenseKey  
    //Revision         : 0.0 Parul Sharma 04/13/2023
    //**********************************************************************************************************************************************************************************************************
    async AssureClaims_ActivationCode(StrSettingName,StrElementDetail, StrLicenseKey) {
        await In_Utility.AssureClaims_SetValue_Utility(StrElementDetail, StrLicenseKey, StrSettingName)
		await t.wait(12000);
		await Nav_Utility.AssureClaims_ElementClick_Utility(POM_DataCollection.AssureClaims_DataCollection_Activation_Code_Button, "Activation code button");
			await t.wait(12000);
        
    }

        //======================================================RMA-99791 Melissa Address Auto Complete and Address Verification Code Ends======================================================================
	
    //************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-104755
    //Description      : It is used to add/update field over administrative tracking page
    //Input Parameters : Case : what operation user want to perform add/edit, strFieldName : which field user want to add, strUserPrompt : User Prompt textbox value , strEditedUserPrompt : Edited User Prompt textbox value ,
    //strSystemFieldName : System field name textbox value, strStateChk1 : state of required checkbox , strStateChk2 : state of lookup field textbox, strStateChk3 : state of additional third check box, strText : value that user want to give to select values from list
    //Revision         : 0.0 Muskan Garg 4-08-2023
    // ***********************************************************************************************************************************************************************************************************************************************************************************

    async AssureClaims_AddEditAdminTrackingField_Utility(Case, strFieldName, strUserPrompt, strEditedUserPrompt, strSystemFieldName, strStateChk1, strStateChk2, strStateChk3, strText) {

        switch (Case) {
            case "Add":
                {
                    await t.wait(2000)
                    await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_Add, "Add button")
                    await t.wait(2000)
                    await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_FieldType, strFieldName, "select field name")
                    await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_UserPrompt, strUserPrompt, "User prompt")
                    await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_SystemFieldName, strSystemFieldName, "System Field Name")

                    if (strFieldName === "Claim Number Lookup" || strFieldName === "Currency" || strFieldName === "Date" || strFieldName === "Email" || strFieldName === "Event Number Lookup" || strFieldName === "Free Text" || strFieldName === "Multi-State" || strFieldName === "Number" || strFieldName === "State" || strFieldName === "Time" || strFieldName === "Vehicle Lookup" || strFieldName === "Attachment (for Data Collection)") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_Required, strStateChk1, "Required Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                    }

                    if (strFieldName === "Admin Tracking Lookup") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_Required, strStateChk1, "Required Checkbox")
                        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Lst_AdminTrackingTable, strText, "Admin Tracking Table")
                    }

                    if (strFieldName === "Checkbox") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                    }

                    if (strFieldName === "Code") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_Required, strStateChk1, "Required Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_IsSearchable, strStateChk3, "Is Searchable Checkbox")
                        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Lst_CodeFile, strText, "code file")
                    }

                    if (strFieldName === "Entity") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_Required, strStateChk1, "Required Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Lst_CodeFile, strText, "code file")
                    }

                    if (strFieldName === "Grid") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_Required, strStateChk1, "Required Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_GridTextBox, strText, "Grid Fields")
                        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_GridTextBox.parent('div').find('div').withAttribute("role", "button"), "add button")
                    }

                    if (strFieldName === "Supplemental History Grid") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_ArrowButtnoOverSupplementalHistoryGrid, "arrow button")
                        await t.wait(2000)
                        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_FieldNameOverSupplementalHistoryGrid.nth(2), "Select field name")
                        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_OkButtonOverSupplementalHistoryGrid, "Ok button")
                        await t.wait(2000)
                    }

                    if (strFieldName === "HTML Text") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_Required, strStateChk1, "Required Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_ConfigureHTMLText, strStateChk3, "Configure HTML Text")
                    }

                    if (strFieldName === "Hyperlink") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_Required, strStateChk1, "Required Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Lst_CodeFile, strText, "code file")
                    }

                    if (strFieldName === "Multi Text/Codes") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_Required, strStateChk1, "Required Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_IsSearchable, strStateChk3, "Is Searchable Checkbox")
                        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Lst_CodeFile, strText, "code file")
                    }

                    if (strFieldName === "Multi-Code") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_Required, strStateChk1, "Required Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_IsSearchable, strStateChk3, "Is Searchable Checkbox")
                        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Lst_CodeFile, strText, "code file")
                    }

                    if (strFieldName === "Multi-Entity") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_Required, strStateChk1, "Required Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Lst_CodeFile, strText, "code file")
                    }

                    if (strFieldName === "String") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_Required, strStateChk1, "Required Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Lst_InputFormat, strText, "code file")
                        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_Size, "5", "size")
                    }

                    if (strFieldName === "User Lookup") {
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_Required, strStateChk1, "Required Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_LookupField, strStateChk2, "Lookup Field Checkbox")
                        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_MultiSelect, strStateChk3, "Lookup Field Checkbox")
                        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Lst_UsersOrGroups, strText, "Users/Groups")
                    }

                    await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_SaveBtn,"Save button")
                    await Verify_Utility.AssureClaims_ElementExist_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Msg_GenericToastMessage.find('div').withText('Saved Successfully'), "Verify Text Saved Successfully.");
                    break;
                }
            case "Edit":
                {
                    const checkboxSelector = AdminTracking_POM.AssureClaims_AdminTracking_Chk_CheckBox;
                    const numberOfCheckboxes = await checkboxSelector.count;
                    console.log(numberOfCheckboxes);
                    for (var i = 0; i < numberOfCheckboxes; i++)
                    {
                        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_CheckBox.nth(i), "select check box")
                        await t.wait(3000)
                        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_EditButton, "edit button")
                        await t.wait(3000)
                        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_UserPrompt, strEditedUserPrompt[i], "User prompt")
                        await t.wait(3000)
                        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_SaveBtn,"Save button")
                        await Verify_Utility.AssureClaims_ElementExist_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Msg_GenericToastMessage.find('div').withText('Saved Successfully'), "Verify Text Saved Successfully.");
                        await t.wait(3000)
			await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_Reload,"Reload button")
			await t.wait(3000)
                        await Verify_Utility.AssureClaims_ElementExist_Utility(Selector('div').withExactText(strEditedUserPrompt[i]), strEditedUserPrompt[i])
                    }
                    break;

                }
                default: console.log("This Case is Not Defined In the Function of Admin tracking field creation")
        }

    }
	    //************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-106953
    //Description      : It is used to Filter By Column Name Over Config Manager
    //Input Parameters : strParameter1 -> it will be column name, strParameter2 -> it will be column value
    //Revision         : 0.0 Muskan Garg 10-26-2023
    // ***********************************************************************************************************************************************************************************************************************************************************************************
   
    async AssureClaims_FilterByColumnNameOverConfigManager_Utility(strParameter1,strParameter2) {

        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_SearchField,"Search field")
        await t.wait(3000)
        await t.pressKey("Enter")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Lst_SelectValue.withExactText(strParameter1),"select "+ strParameter1 )
        await t.wait(3000)
        await t.typeText(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_SearchField,strParameter2)
        console.log("write "+strParameter2)
        await t.wait(1000)
        await t.pressKey("Enter")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_ParentCodeText,"parent code text")
        await t.wait(3000)
   
    }
	
	
    //************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109178
    //Description      : It is used to select values from sub-dropdown for particular selected dropdown value
    //Input Parameters : WebElement -> locator of dropdown, strSearchFieldArray -> array for selecting values
    //Revision         : 0.0 Muskan Garg 23-01-2024
    // ***********************************************************************************************************************************************************************************************************************************************************************************

    async AssureClaim_SelectFieldsForQueryDesigner(WebElement, strSearchFieldArray) {
        for (var strKey in strSearchFieldArray) {
            await Nav_Utility.AssureClaims_ElementClick_Utility(WebElement, "Fields Available for Search")
            await Nav_Utility.AssureClaims_CofigManagerSelectValueFromDropdown(strKey)
            await t.wait(2000)

            // Iterate over the array of values for the current strKey
            for (var i = 0; i < strSearchFieldArray[strKey].length; i++) {
                var strValue = strSearchFieldArray[strKey][i];
                await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QD_Lst_SelectValuesFromSearch.find('option').withText(strValue), "select" + strValue + "from dropdown")
            }

        }
    }

    //************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109178
    //Description      : It is used to create a query designer
    //Input Parameters : strSearchName -> search name, strTypeOfSearch -> type of search, strAdministrackingField -Administrative tracking field(if type of search is Administrative Tracking Search""),
    // strSelectValueToMoveUp -> value to move up, strSelectValueToMoveDown -> value to move down,strSelectValueToMarkAstrik -> value to mark star, 
    //strSearchFieldArray -> array to select value from dropdown on field selection page, strDisplayFieldArray -> array to select value from dropdown on display field page, strSelectUser -> select user
    //Revision         : 0.0 Muskan Garg 23-01-2024
    // ***********************************************************************************************************************************************************************************************************************************************************************************
    async AssureClaim_QueryDesignerCreation(strSearchName, strTypeOfSearch, strAdministrackingField, strSelectValueToMoveUp, strSelectValueToMoveDown, strSelectValueToMarkAstrik, strSearchFieldArray, strDisplayFieldArray, strSelectUser) {

        //Converting list view
        if (await ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_SearchField.exists) {       
        }
        else{
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QD_Btn_ListView, "list view button")
        }

        await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QD_Btn_AddBtn, "Add button")
        await t.wait(1000)

        //==================================================Basic Information Page started here================================================================
        await In_Utility.AssureClaims_SetValue_Utility(QueryDesigner_POM.AssureClaims_QDBasicInfo_Txt_SearchName, strSearchName, "Search Name")
        await In_Utility.AssureClaims_SetValue_Utility(QueryDesigner_POM.AssureClaims_QDBasicInfo_Txt_SearchDescription, strSearchName, "Search description")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDBasicInfo_Lst_TypeOfSearch, "What type of search do you want to create")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_CofigManagerSelectValueFromDropdown(strTypeOfSearch)
        //==================================================Basic Information Page ended here================================================================

        //Next Button
        await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDBasicInfo_Btn_NextBtn, "Next Button")
        await t.wait(2000)

        if (strTypeOfSearch === "Administrative Tracking Search" && strAdministrackingField != "NA") {
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDAdministrativeTrackingTableSelection_Lst_AdministrativeTrackingTableQD, "Administrative tracking table page")
            await Nav_Utility.AssureClaims_CofigManagerSelectValueFromDropdown(strAdministrackingField)
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDAdministrativeTrackingTableSelection_Btn_NextBtn, "Next button")
        }


        //===================================================Field selection page started here=================================================================================
        await this.AssureClaim_SelectFieldsForQueryDesigner(QueryDesigner_POM.AssureClaims_QDFieldSelection_Lst_FieldsAvailableForSearch, strSearchFieldArray)
        //==================================================Field Selection Page ended here================================================================

        if (strSelectValueToMoveUp != "NA") {
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QD_Lst_SelectValuesFromSearch.nth(1).find('option').withText(strSelectValueToMoveUp), "select" + strSelectValueToMoveUp + "from dropdown")
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDFieldSelection_Btn_UpBtn, "Up button")
        }


        if (strSelectValueToMoveDown != "NA") {
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QD_Lst_SelectValuesFromSearch.nth(1).find('option').withText(strSelectValueToMoveDown), "select" + strSelectValueToMoveDown + "from dropdown")
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDFieldSelection_Btn_DownBtn, "Down button")
        }


        if (strSelectValueToMarkAstrik != "NA") {
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QD_Lst_SelectValuesFromSearch.nth(1).find('option').withText(strSelectValueToMarkAstrik), "select" + strSelectValueToMarkAstrik + "from dropdown")
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDFieldSelection_Btn_StarBtn, "Star button")
        }

        //Next Button
        await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDFieldSelection_Btn_NextBtn, "Next Button")
        await t.wait(2000)


        //==========================================================Display Field page started here===================================================
        if (strDisplayFieldArray != "NA") {
            await this.AssureClaim_SelectFieldsForQueryDesigner(QueryDesigner_POM.AssureClaims_QDDisplayField_Lst_FieldsAvailableForDisplaySearch, strDisplayFieldArray)
        }
        //==================================================Display Field Page ended here================================================================

        //Next Button
        await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDDisplayField_Btn_NextBtn, "Next Button")
        await t.wait(2000)

        //===========================================================Permissions page started here=============================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDPermissions_Lst_SelectUsers, "Select Users and/or Groups")
        if (strSelectUser === "All Users") {
            await Nav_Utility.AssureClaims_CofigManagerSelectValueFromDropdown("All Users")
        }
        else {
            await Nav_Utility.AssureClaims_CofigManagerSelectValueFromDropdown("Select Users and/or Groups")
            await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn, "Arrow btn")
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDPermissionsSelectedUsersAndGroups_Btn_UsersTab.nth(1), "Users tab")
            await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_SearchField, "Search field")
            await t.wait(1000)
            await t.pressKey("Enter")
            await t.wait(1000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Lst_SelectValue.withExactText("Login Name"), "select Login Name")
            await t.typeText(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_SearchField, strSelectUser)
            console.log(strSelectUser + "is entered in Filter By Column Name text box")
            await t.wait(1000)
            await t.pressKey("Enter")
            await t.wait(1000)
            await t.pressKey("tab")
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDPermissionSelectedUsersAndGroupss_Chk_SelectUser, "select check box")
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDPermissionSelectedUsersAndGroupss_Btn_DoneBtn, "Done button")
        }
        //=================================================Permission Page ended here================================================================

        //Finish Button
        await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDPermissions_Btn_FinishButton, "Finish button")

    }

    //************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109178
    //Description      : It is used to verify existing query designer, clone query designer, delete query designer
    //Input Parameters : strSearchName -> Search page name,strQueryDesignerName -> query designer name, strCase -> Verify, Clone , Delete , strCloneSearchName -> name of clonned query designer
    //Revision         : 0.0 Muskan Garg 23-01-2024
    // ***********************************************************************************************************************************************************************************************************************************************************************************

    async AssureClaim_OperationOnExistingQueryDesigner(strSearchName,strQueryDesignerName, strCase, strCloneSearchName) {

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ReloadButtton, "reload button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssuereClaims_QueryDesignerIframe)
        await t.wait(3000)

        //Converting list view
        if (await ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_SearchField.exists) {       
        }
        else{
            await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QD_Btn_ListView, "list view button")
        }

        await t.wait(2000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab(strSearchName)

        //=====================================Search QD via -> search view name started here=======================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_SearchField, "Search field")
        await t.wait(1000)
        await t.pressKey("Enter")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Lst_SelectValue.withExactText("Search View Name"), "select Search View Name")
        await t.wait(1000)
        await t.typeText(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_SearchField, strQueryDesignerName)
        console.log(strQueryDesignerName + "is entered in Filter By Column Name text box")
        await t.wait(1000)
        await t.pressKey("Enter")
        await t.wait(1000)
        await t.pressKey("tab")
        //=====================================Search QD via -> search view name ended here=======================================================

        switch (strCase) {

            case "Verify":
                await Verify_Utility.AssureClaims_ElementExist_Utility(Selector('a').withText(strQueryDesignerName), "row exist")
                break;

            case "Clone":
                await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QD_Chk_QDRecord, "record selected")
                await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QD_Btn_CloneQD, "record clonned")
                await In_Utility.AssureClaims_SetValue_Utility(QueryDesigner_POM.AssureClaims_QD_Txt_CloneSearchName, strCloneSearchName, "clone search name")
                await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QDCloneSearch_Btn_SaveButton, "save button")
                await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_SearchField, "Search field")
                await t.wait(1000)
                await t.pressKey("Enter")
                await t.wait(1000)
                await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Lst_SelectValue.withExactText("Search View Name"), "select Search View Name")
                await t.wait(1000)
                await t.typeText(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Txt_SearchField, strCloneSearchName)
                console.log(strQueryDesignerName + "is entered in Filter By Column Name text box")
                await t.wait(1000)
                await Verify_Utility.AssureClaims_ElementExist_Utility(Selector('a').withText(strCloneSearchName), "row exist")
                break;

            case "Delete":
                await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QD_Chk_QDRecord, "record selected")
                await Nav_Utility.AssureClaims_ElementClick_Utility(QueryDesigner_POM.AssureClaims_QD_Btn_DeleteQD, "record deleted")
                await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ConfirmButtton, "Confirm Button")
                await t.wait(1000)
                await Verify_Utility.AssureClaims_ElementNotExist_Utility(Selector('a').withText(strQueryDesignerName), "row does not exist")
                break;
        }



    }

    //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-104824
    //Description      : Utility for Including Coverage On Policy Screen For Life Claim 
    //Input Parameters : bFlag->Annuity Flag ,sParameter1->User Have To Provide AnnuityDateOfDeath Incase Of Annuity Flag Is True and FaceAmountWithCode Incase Of Annuity Flag Is False ,sParameter2-> User Have To Provide AnnuityAsOfDate Incase Of Annuity Flag Is True and DividendsWithCode Incase Of Annuity Flag Is False ,sParameter3-> User Have To Provide DODValue Incase Of Annuity Flag Is True and DPaidUpAddsWithCode Incase Of Annuity Flag Is False ,sParameter4-> User Have To Provide AsOfValue Incase Of Annuity Flag Is True and AccidentDeathBenefitWithCode Incase Of Annuity Flag Is False
    //Revision         : 0.0 Parul Sharma 07/17/2023
    //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************


    async AssureClaims_IncludeCoverageInPolicy(bFlag, sParameter1, sParameter2, sParameter3,sParameter4) {
        if(bFlag ==="True")
        {
            await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Policy_Coverage_AnnuityDateOfDeath, sParameter1, "Annuity Date Of Death")
            await t.wait(1000);
            await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Policy_Coverage_AnnuityAsOfDate, sParameter2, "Annuity As Of Date")
            await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Policy_Coverage_DODValue, sParameter3, "DOD Value")
            await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Policy_Coverage_AsOfValue, sParameter4, "As Of Value")
        }
        if(bFlag ==="False")
        {
            await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Policy_Coverage_FaceAmountWithCode, sParameter1, "Face Amount Value")
            await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Policy_Coverage_DividendsWithCode, sParameter2, "Dividends Value")
            await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Policy_Coverage_PaidUpAddsWithCode, sParameter3, "PaidUp Adds Value")
            await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Policy_Coverage_AccidentDeathBenefitWithCode, sParameter4, "Accident Death Benefit Value")
        }
        await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Policy_Coverage_AnnuityQuote_Save_Button, "Save Image Button On Life Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " Life Claim Creation Screen");
        await t.wait(5000)
        await t.switchToMainWindow();        
    }

    //**********************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109527
    //Description      : Utility for Analystics DashBoard Power View Creation via Configuration Manager
    //Input Parameters : StrPower_View_Name->User Have To Provide Power View Name ,StrPowerView_Description->User Have To Provide Power View Description ,StrOperations-> User Have To Provide Operation To Be Done, StrUserDetail-> User name needs to be given in this field., StrScreenName->Screen name needs to be passed.  
    //Authored         : 0.0 Parul Sharma 03/07/2024
    //Revision         : 1.0 Vikrant Agarwal 03/08/2024
    //**********************************************************************************************************************************************************************************************************

    async AssureClaims_Analytics_PowerViewCreation(StrPower_View_Name, StrPowerView_Description, StrOperations, StrUserDetail, StrScreenName) {
        switch (StrOperations) {
            case "Add":
 
                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Button, "Click on Add Button On PowerView Editor Screen")
 
                const Power_View_Add_Popup_Heading = PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_Heading.withText('View Detail').with({ visibilityCheck: true })
                await t.expect(Power_View_Add_Popup_Heading.exists).ok('', { timeout: 20000 })
                console.log("View Detail Popup Is Opened ".green);
                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_View_Name, "Click on View Name Field")
                await In_Utility.AssureClaims_SetValue_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_View_Name, StrPower_View_Name, "ReporterPowerView_Name Entered in View Name Field")
                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_View_Description, "Click on View Description Field")
                await In_Utility.AssureClaims_SetValue_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_View_Description, StrPowerView_Description, "Value Entered in View Description Field")
                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_Save_Button, "Save Button Is Clicked")
 
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_Power_View_Add_Message, false, "Power View Editor Screen")
                break;
            case "Edit":
                console.log("in edit")
                const Edit_View_Name = PowerView_POM.AssureClaimsApp_Lnk_Power_View_Edit_View_Heading.withText('View Definition for: ' + StrPower_View_Name).with({ visibilityCheck: true })
                await t.expect(Edit_View_Name.exists).ok('', { timeout: 20000 })
               await t.wait(1000)
                await In_Utility.AssureClaims_SetValue_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Search_Form_Search_Filter, StrScreenName, "ReporterPowerView_Name Entered in Search Filter Field")
                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_AvailableForm,"Available form on Power view Configuration Screen")
                await t.wait(14000);
                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_GeneralClaims_Form,"General Claims form on Power view Configuration Screen")
                await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Edit_View_Save_Button, "Save Button Is Clicked")
             
             await t.wait(10000);
                break;
                case "AddUser":
                    await In_Utility.AssureClaims_SetValue_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Users_search_textbox, StrUserDetail, StrUserDetail+" entered in User Search Filter Field")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Users_Selection_Chckbx, "User Checkbox Is Clicked") 
                    await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Edit_View_Save_Button, "Save Button Is Clicked")
                    break;
            default: console.log("This Case is Not Defined In the Function of Power View creation")
        }
    }

    //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109573 starts here
    //Description      : Utility for calling the function for setting filter in claims Grid in configuration manager
    //Input Parameters : StrColumnHeaderName-> Header name of column ,StrColumnsHeaderValue-> Header value of column
    //Revision         : 0.0 Nalayirem Subramanian 06/03/2024
    //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************

    async AssureClaims_FilteringRowsAgainstFilterInClaimsGrid_For_Configuration(StrColumnHeaderName, StrColumnsHeaderValue) {
        await this.AssureClaims_SetFiltersOnColumnHeaderClaimsGrid_Utility_For_Configuration(StrColumnHeaderName, StrColumnsHeaderValue);
        await t.wait(2000);
   }



  //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109573 starts here
    //Description      : Function for implementing setting filter in claims Grid in configuration manager 
    //Input Parameters : StrColumnHeaderName-> Header name of column ,StrColumnsHeaderValue-> Header value of column
    //Revision         : 0.0 Nalayirem Subramanian 06/03/2024
    //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************  
   async AssureClaims_SetFiltersOnColumnHeaderClaimsGrid_Utility_For_Configuration(StrColumnsHeaderName, StrColumnsValue) {
    await t.wait(2000)
    var columnCount = StrColumnsHeaderName.length;
    if (StrColumnsHeaderName.length === StrColumnsValue.length) {
        for (var index = 0; index < columnCount; index++) {
            await this.AssureClaims_FilterByColumnNameOverConfigManager_Utility(StrColumnsHeaderName[index], StrColumnsValue[index]);
            await t.wait(2000);
        }
    }
}



 //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109573 starts here
    //Description      : Function for verifying the rows in the claims grid for deletion in configuration manager 
    //Input Parameters : StrColumnHeaderName-> Header name of column ,StrColumnsHeaderValue-> Header value of column ,StrColumnIdRows-> Header id of the column
    //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
async AssureClaims_VerifyRowsAgainstFilterInClaimsGrid_For_Deletion_Configuration(StrColumnsHeaderName, StrColumnsHeaderValue, StrColumnIdRows) {
    await this.AssureClaims_SetFiltersOnColumnHeaderClaimsGrid_Utility_For_Configuration(StrColumnsHeaderName, StrColumnsHeaderValue);
    await t.wait(2000);
     var columnCount = StrColumnIdRows.length;
     if (StrColumnIdRows.length === StrColumnsHeaderValue.length) {
         for (var index = 0; index < columnCount; index++) {
             await Verify_Utility.AssureClaims_ElementNotExist_Utility(WebLinkDetailSummary_POM.DetailSummar_ColumnSelector(StrColumnIdRows[index]).withText(StrColumnsHeaderValue[index]), "column Value "+StrColumnsHeaderValue[index]+" is not found in the column. " + StrColumnsHeaderName[index]+"This was deleted".green);
             await t.wait(500);
         }
     }
 }


  //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109573 starts here
    //Description      : Function for verifying the rows in the claims grid in configuration manager  
    //Input Parameters : StrColumnHeaderName-> Header name of column ,StrColumnsHeaderValue-> Header value of column ,StrColumnIdRows-> Header id of the column
    //Revision         : 0.0 Nalayirem Subramanian 06/03/2024
    //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
 async AssureClaims_VerifyRowsAgainstFilterInClaimsGrid_For_Configuration(StrColumnsHeaderName, StrColumnsHeaderValue, StrColumnIdRows) {
    await this.AssureClaims_SetFiltersOnColumnHeaderClaimsGrid_Utility_For_Configuration(StrColumnsHeaderName, StrColumnsHeaderValue);
    await t.wait(2000);
     var columnCount = StrColumnIdRows.length;
     if (StrColumnIdRows.length === StrColumnsHeaderValue.length) {
         for (var index = 0; index < columnCount; index++) {
             await Verify_Utility.AssureClaims_ElementExist_Utility(this.DetailSummar_ColumnSelector_UserLookUp(StrColumnIdRows[index]).withText(StrColumnsHeaderValue[index]), "column Value "+StrColumnsHeaderValue[index]+" is found in the column " + StrColumnsHeaderName[index]);
             await t.wait(500);
         }
     }
 }



  //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109573 starts here
    //Description      : Function for assigning the column id's value 
    //Input Parameters : StrColumnId-> Column id of the column
    //Revision         : 0.0 Nalayirem Subramanian 06/03/2024
    //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
 DetailSummar_ColumnSelector(StrColumnId){
    return this.AssureClaimsApp_DetailSummary_ColumnSelector= Selector('[col-id="'+StrColumnId+'"]');
 }





  //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109573 starts here
    //Description      : Function for assigning the column id's value in user lookup 
    //Input Parameters : StrColumnId-> Column id of the column
    //Revision         : 0.0 Nalayirem Subramanian 06/03/2024
    //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
 DetailSummar_ColumnSelector_UserLookUp(StrColumnId){

 return this.AssureClaimsApp_DetailSummary_ColumnSelector_UserLookUp= Selector('[class="mdc-list-item__primary-text"]');
 }

//****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
                   //RMA-109573 ends here
//****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************    



}
export default WebLinksSetup_Utility;
