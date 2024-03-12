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
import Input_Utility from "../Functional_Utilities/Input_Utility";
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';
import POM_AddressMaintenance from '../Functional_POM/POM_AddressMaintenance';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Entity from '../Functional_POM/POM_Entity';

const Entity_POM = new POM_Entity();
const Home_POM = new POM_Home();
const MaintAddress_POM = new POM_AddressMaintenance();
const Generic_Claims = new POM_Generic_Claims();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Reserve_Utility = new POM_FinancialReserves();
const Payment_POM = new POM_PaymentsCollections();
const Claimant_POM = new POM_Claimant();
import POM_Search from '../Functional_POM/POM_Search'
const Search_POM = new POM_Search();

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

    fixture`Smoke7`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    });

    test('AssureClaims_PCCreation_Test_01', async t => {
        await t.wait(8000)
        var date = new Date();
        var d = (date.getMonth() + 1) + '/' + (date.getDate()) + '/' + date.getFullYear();
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Maintenance")

        await t.wait(8000)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Property");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_PropertyIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_PropertyId, "P001", "Property ID")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.wait(3000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_PropertyIframe);
        
        let PolicyID = await Selector('[aria-label="P001"]').exists
        console.log(PolicyID)
        if (PolicyID)
        {
            console.log(`Policy ID Already exists`.yellow);

        }
        else {
        
            await t.wait(5000)
            await t.switchToMainWindow();
            await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Property");
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_PropertyIframe)
            await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_Generic_Claim_Verify_Policy_PropertyID, "P001", "Property ID")
            await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr1, "scbde", "Address1 entered")
            await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_EntityAddress_Btn_State, "State Lookup  Button On Entity Creation Screen");
            await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup,"Alberta", "Description Search Textbox On Entity Creation Page");
            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Entity Creation Screen");
            await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_CountryState.withText("Alberta"), " on Lookup Window");
            await t.wait(5000)
            await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_ZipCode, "21156", "Zip Code Textbox On Entity Creation Screen");
            await t.wait(5000)
            await t.wait(5000)
            await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_City, "sddt", "City Textbox On Entity Creation Screen");
            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button clicked");
        }

        /*=========================================================== PC claim creation started here========================================================================================================================================================================================================================================================================================================*/
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims")
        console.log("assureclaims_pcclaimcreation function is called to create property claim".yellow);
        StrClaimNumber = await Function_Utility.AssureClaims_PropertyClaimCreation(d, d, data.ClaimStatus, data.PCClaimType, data.Department, data.PCPolicyLOB, data.PropertyId1)
        console.log("new property claim is created with claim number: ".green + StrClaimNumber);
       
    });

    test('AssureClaims_VCCreation_Test_02', async t => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
        await t.wait(15000)
        var date = new Date();
        var d = (date.getMonth() + 1) + '/' + (date.getDate()) + '/' + date.getFullYear();
        /*=========================================================== Vehicle claim creation started here========================================================================================================================================================================================================================================================================================================*/
        console.log("assureclaims_vehicleclaimcreation function is called to create vehicle claim".yellow);
        StrClaimNumber = await Function_Utility.AssureClaims_VehicleAccidentClaimCreation(d, d, data.ClaimStatus, data.VAClaimType, data.Department, data.VAPolicyLOB)
        console.log("new vehicle claim is created with claim number: ".green + StrClaimNumber);
        //vehicle claim creation
      
    });



});






