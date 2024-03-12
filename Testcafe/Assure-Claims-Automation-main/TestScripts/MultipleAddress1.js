import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';

import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Home from '../Functional_POM/POM_Home';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import POM_Entity from '../Functional_POM/POM_Entity';
import POM_People from '../Functional_POM/POM_People';
import POM_Claimant from '../Functional_POM/POM_Claimant';
import POM_AddressMaintenance from '../Functional_POM/POM_AddressMaintenance';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const DataAutoReg = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();

const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();
const GenSysPar_POM = new POM_GeneralSystemParameter();
const Entity_POM = new POM_Entity();
const Claimant_POM = new POM_Claimant();
const MaintAddress_POM = new POM_AddressMaintenance();
const ConfigMgr_POM = new POM_Config_Manager();
const People_POM = new POM_People();


//******************************************************************************************************************************//
//JIRA ID OF STORY : RMA-96022,RMA-96161
//Description : 1. When Utilities setting "Enable Multiple Addresses for Entities" is OFF
//              2. When Utilities setting "Enable Multiple Addresses for Entities" is ON
//              3. Entity with multiple addresses attached as Claimant/Defendant/Adjuster
//AUTHOR : Yashaswi Mendhekar
//DEPENDANCY : NO
//PRE-REQUISITE : No
//Preferred Server: STG SQL DSN[RMACDR214_MAINDB_NEW]
//******************************************************************************************************************************//

//Global Variable Declaration

var faker = require('faker');
var StrClaimNumber;
var EntityName = 'Auto1_' + faker.name.lastName();
var EntityName1 = 'Auto1_' + faker.name.lastName();
var Title = faker.name.title();
var NatureOfBusiness = faker.name.jobTitle();
var Address1 = faker.address.streetName();
var Address2 = faker.address.streetAddress();
var Address3 = faker.address.cityPrefix();
var Address4 = faker.address.streetName();
var Address5 = faker.address.streetAddress();
var Address6 = faker.address.cityPrefix();
var County = faker.address.cityPrefix();
var County1 = faker.address.cityPrefix();
var City = faker.address.city();
var City1 = faker.address.city();
var Zip = faker.random.number({ min: 10000, max: 99999 });
var Zip1 = faker.random.number({ min: 10000, max: 99999 });


var FetchPrimaryAddrType;
var FetchPrimaryAddress1;
var FetchPrimaryAddress2;
var FetchPrimaryAddress3;
var FetchPrimaryAddressCity;
var FetchPrimaryAddressCountry;
var FetchPrimaryAddressState;
var FetchPrimaryAddressZipCode;
var FetchAddr1;
var FetchAddr2;
var FetchAddr3;
var FetchCountry;
var FetchState;
var FetchZipCode;
var FetchEntityName1;
var FetchClaimantState;
var FetchClaimantName;
var FetchClaimantAddr1;
var FetchClaimantAddr2;
var FetchClaimantAddr3;
var FetchClaimantCountry;
var FetchClaimantCity;


DataAutoReg.forEach(data => {
    fixture`MultipleAddress1`.beforeEach(async t => {

        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

// With Enable Multiple Adddress for entity setting OFF verify Address acordian isn't visible on entity screen starts here
    test('EnableMultipleAddressesForEntities_OFF_Test_01', async t => {

        // ============================================Logging into application starts here =========================================================
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log("Login Into Application!!--> Configuration Manager ".bgCyan)
        await t.wait(4000)
        //  ============================================================ Logged into application ==============================================================

        // ==============================================Configuration Manager Setting OFF--->General System Parameter-->Turn OFF Enable Multiple Adddress for entity starts here============================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "System", "Maintenance")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities,'UnCheck', "Unchecked Enable Multiple Addresses for Entities")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        // ============================================= Configuration Setting OFF--->General System Parameter-->Turn OFF Enable Multiple Adddress for entity ends here====================================================
        // ======================================================Zone Switched to Maintenance starts here==============================================================
        await t.wait(5000)
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Maintenance");
        await t.wait(5000)
        // ======================================================Zone Switched to Maintenance ends here============================================================

        //======================================================Entity creation Starts here=======================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Entity");
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntityFrame)
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Name, EntityName, "Last Name Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Entity_POM.AssureClaims_Entity_Lst_TypeOfEntity, data.EntityType, "Type Of Entity Drop Down On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_NatureOfBusiness, NatureOfBusiness, "Nature Of Business Textbox On Entity Creation screen");
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Title, Title, "Title Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Entity_POM.AssureClaims_Entity_Lst_IDType, data.IdType, "ID Type DropDown On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_AddressMaintenance_Txt_Addr1, Address1, "Address 1 Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr2, Address2, "Address 2 Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr3, Address3, "Address 3 Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_City, City, "City Textbox On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Btn_Country, "Country Lookup Button On Entity Creation Screen");
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.Country, "Description Search Textbox On Entity Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_CountryState.withText(data.Country), data.Country + " on Lookup Window");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_EntityAddress_Btn_State, "State Lookup  Button On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.State, "Description Search Textbox On Entity Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_CountryState.withText(data.State), data.State + " on Lookup Window");
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_County, County, "County Textbox On Entity creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_ZipCode, Zip.toString(), "Zip Code Textbox On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
        await t.wait(1000)
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Name, EntityName, "Name Textbox On Entity Creation Screen");
        console.log("New Entity is Created with Last Name: ".green + EntityName);
        await t.wait(2000)
        //    ===================================Verification of Address accordian not exists starts here==========================================================================
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(MaintAddress_POM.AssureClaims_Entity_Tab_Addresses.withText('Addresses'), "Address Accoridian not exists".green)
        //    ===================================Verification of Address accordian not exists ends here==========================================================================

        //======================================================Entity creation Ends here================================================================================
        //======================================================Logout from Application Starts here======================================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //======================================================Logout from Application ends here =======================================================================
    });
// With Enable Multiple Adddress for entity setting OFF verify Address acordian isn't visible on entity screen ends here


// With Enable Multiple Adddress for entity setting ON, verify Address acordian is visible and primary address data is viible starts here
    test('EnableMultipleAddressesForEntities_ON_Test_02', async t => {
        // ============================================Logging into application starts here =========================================================
        await t.wait(5000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log("Login Into Application!!--> Configuration Manager ".bgCyan)
        await t.wait(4000)
        //  ============================================ Logged into application ========================================================================================

        // ============================================Configuration Setting ON--->General System Parameter-->Turn ON Enable Multiple Adddress for entity starts here===================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "System", "Maintenance")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities,'Check', "Checked Enable Multiple Addresses for Entities")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        // await t.switchToMainWindow();
        // ===========================================Configuration Setting ON--->General System Parameter -->Turn ON Enable Multiple Adddress for entity ends here====================================================
        // =============================================Zone Switched to Maintenance starts here======================================================================
        await t.wait(5000)
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Maintenance");
        await t.wait(5000)
        // =================================================Zone Switched to Maintenance ends here=====================================================================

        //==================================================Entity creation Starts here================================================================================

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Entity");
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntityFrame)
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Name, EntityName1, "Last Name Textbox On Entity Creation Screen");
        FetchEntityName1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Entity_POM.AssureClaims_Entity_Txt_Name, "value");
        console.log(FetchEntityName1.yellow + "Entity name 1 value Is Fetched From Entity Screen ")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Entity_POM.AssureClaims_Entity_Lst_TypeOfEntity, data.EntityType, "Type Of Entity Drop Down On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Title, Title, "Title Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Entity_POM.AssureClaims_Entity_Lst_IDType, data.IdType, "ID Type DropDown On Entity Creation Screen");
        //    ===================================Verification of Address accordian exists starts here==========================================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(MaintAddress_POM.AssureClaims_Entity_Tab_Addresses.withText('Addresses'), "Address Accoridian exists".green)
        await t.wait(5000)
        //    ===================================Verification of Address accordian exists ends here==========================================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Tab_Addresses.withText('Addresses'), "Clicked on address accordian")
        await t.wait(5000)
        // ==========================================Adding and fetching value of 1st address starts here===============================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Btn_AddNewAddress, "Add New Address Button On Entity Creation Screen");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Btn_AddressType, "Lookup for Address Type");
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.AddressType, "Description Search Textbox On Entity Creation Page");
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Entity Creation Screen");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_CountryState.withText(data.AddressType), data.AddressType + " on Lookup Window");
        FetchPrimaryAddrType = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_AddrType, "value");
        console.log(FetchPrimaryAddrType.yellow + "Address Type value Is Fetched From Entity Screen ")
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_AddressMaintenance_Txt_Addr1, Address1, "Address 1 Textbox On Entity Creation Screen");
        await t.wait(5000)
        FetchPrimaryAddress1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_AddressMaintenance_Txt_Addr1, "value");
        console.log(FetchPrimaryAddress1.yellow + "   Address 1 value Is Fetched From Entity Screen ")
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr2, Address2, "Address 2 Textbox On Entity Creation Screen");
        FetchPrimaryAddress2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr2, "value");
        console.log(FetchPrimaryAddress2.yellow + "   Address 2 value Is Fetched From Entity Screen ")
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr3, Address3, "Address 3 Textbox On Entity Creation Screen");
        FetchPrimaryAddress3 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr3, "value");
        console.log(FetchPrimaryAddress3.yellow + "   Address 3 value Is Fetched From Entity Screen ")
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_City, City, "City Textbox On Entity Creation Screen");
        FetchPrimaryAddressCity = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_City, "value");
        console.log(FetchPrimaryAddressCity.yellow + "   City value Is Fetched From Entity Screen ")
        await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_MaintPeople_Btn_Country, "Country Lookup Button On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.Country, "Description Search Textbox On Entity Creation Page");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Entity Creation Screen");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_CountryState.withText(data.Country), data.Country + " on Lookup Window");
        FetchPrimaryAddressCountry = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Entity_Tab_Country, "value");
        console.log(FetchPrimaryAddressCountry.yellow + "   Country value Is Fetched From Entity Screen ")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_MaintEntity_Btn_State, "State Lookup  Button On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.State, "Description Search Textbox On Entity Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_CountryState.withText(data.State), data.State + " on Lookup Window");
        await t.wait(5000)
        FetchPrimaryAddressState = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Entity_Tab_State, "value");
        console.log(FetchPrimaryAddressState.yellow + "   State value Is Fetched From Entity Screen ")
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_County, County, "County Textbox On Entity creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_ZipCode, Zip.toString(), "Zip Code Textbox On Entity Creation Screen");
        FetchPrimaryAddressZipCode = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_MaintPeople_Txt_ZipCode, "value");
        console.log(FetchPrimaryAddressZipCode.yellow + "Country value Is Fetched From Entity Screen ")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Button On Address PopUp");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_People_Txt_Name, EntityName1, "Name Textbox On Entity Creation Screen");
        console.log("New Entity is Created with Last Name: ".green + EntityName1);
        // ==========================================Adding and fetching value of 1st address ends here===============================================================================

        // ====================================================Adding 2nd Address starts here====================================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_EntityAddresses_Btn_AddNewAddress, "Add New Address Button On Entity Creation Screen");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Btn_AddressType, "Add New Address Button On Entity Creation Screen");
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.AddressType1, "Description Search Textbox On Entity Creation Page");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Entity Creation Screen");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_CountryState.withText(data.AddressType1), data.AddressType1 + " on Lookup Window");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_AddressMaintenance_Txt_Addr1, Address4, "Address 1 Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr2, Address5, "Address 2 Textbox On Entity Creation Screen");
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr3, Address6, "Address 3 Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_City, City1, "City Textbox On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_MaintPeople_Btn_Country, "Country Lookup Button On Entity Creation Screen");
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.Country, "Description Search Textbox On Entity Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_CountryState.withText(data.Country), data.Country + " on Lookup Window");
        await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_MaintPeople_Btn_State, "State Lookup  Button On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.State, "Description Search Textbox On Entity Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_CountryState.withText(data.State), data.State + " on Lookup Window");
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_County, County1, "County Textbox On Entity creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_ZipCode, Zip1.toString(), "Zip Code Textbox On Entity Creation Screen");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Button On Address PopUp");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
        console.log("New Entity is Created with Last Name: ".green + EntityName1);
        // ====================================================Adding 2nd Address ends here====================================================================

        //===================================== Verification of primary address as true in the grid starts here =========================================================
        const ColHeader2 = ["Primary Address"]
        const ColVal2 = ["true"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("true", "Entity address grid view", ColHeader2, ColVal2);
        await t.wait(5000)
        console.log("Verification of one Address as Primary is successful".green);
        await t.wait(5000)
        //===================================== Verification of primary address as true in the grid ends here =========================================================
        // ===================================Verification of Primary address address is filled on the above address feild starts here=========================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Entity_Tab_Entity, "clicked on Entity tab");
        FetchAddr1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_AddressMaintenance_Txt_Addr1, "value");
        console.log("VerifyAddressType  ".green + FetchAddr1)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddress1, FetchAddr1, "Address 1 value on entity Creation Page");
        console.log("Verification Of Address 1 Exist In Entity".green)
        FetchAddr2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr2, "value");
        console.log("VerifyAddressType   ".green + FetchAddr2)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddress2, FetchAddr2, "Address 2 value on entity Creation Page");
        console.log("Verification Of Address 2 Exist In Entity".green)
        FetchAddr3 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr3, "value");
        console.log("VerifyAddressType   ".green + FetchAddr3)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddress3, FetchAddr3, "Address 3 value on entity Creation Page");
        console.log("Verification Of Address 3 Exist In Entity".green)
        FetchCountry = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Country, "value");
        console.log("VerifyAddressType   ".green + FetchCountry)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddressCountry, FetchCountry, "Country value on entity Creation Page");
        console.log("Verification Of Country Exist In Entity".green)
        FetchState = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Entity_Address_Txt_State, "value");
        console.log("VerifyAddressType   ".green + FetchState)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddressState, FetchState, "State value on entity Creation Page");
        console.log("Verification Of State Exist In Entity".green)
        FetchZipCode = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Entity_Txt_ZipCode, "value");
        console.log("VerifyAddressType   ".green + FetchZipCode)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddressZipCode, FetchZipCode, "ZipCode value on entity Creation Page");
        console.log("Verification Of ZipCode Exist In Entity".green)
        // ===================================Verification of Primary address address is filled on the above address feild ends here=========================================

        //===============================Entity creation with multiple address Ends here=================================================================================
        //===============================================Logout from Application Starts here============================================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //===============================================Logout from Application ends here ====================================================================
    });
// With Enable Multiple Adddress for entity setting ON, verify Address acordian is visible and primary address data is viible ends here

// Verification of primary addresss over claimant screen starts here
    test('VerifyPrimaryAddressDataOnClaimantScreen_Test_03', async t => {

        // ============================================Logging into application starts here =========================================================
        await t.wait(5000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log("Login Into Application!!--> Claims".bgCyan)
        await t.wait(5000)
        //  ========================================================= Logged into application ==============================================================

        //====================================================Corporate GC  Creation started here ==========================================================
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");

        StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB);
        console.log("New Cooperate General Claim is Created with Claim Number: ".green + StrClaimNumber);
        //=============================================================Corporate GC  Creation completed here ===================================================================

        // /=========================================================== Adding Right child Claimant starts here ===========================================================
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Btn_AddClaimant, "Click Add claimant")
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_LastName, FetchEntityName1, "lastname entered")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Claimant creation Screen");
        await t.wait(5000)
        // /================================= Adding Claimant and verification of primary address starts here ============================================================

        FetchClaimantName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Claimant_POM.AssureClaims_Claimant_Txt_LastName, "value");
        console.log("VerifyAddressType   ".green + FetchClaimantName)
        await Verify_Utility.AssureClaims_TextCompare(FetchEntityName1, FetchClaimantName, "Entity name 1 value on claimant Creation Page");
        console.log("Verification Of Entity name 1 Exist In Entity".green)
        await t.wait(5000)
        FetchClaimantAddr1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Claimant_POM.AssureClaims_Claimant_Txt_Address1, "value");
        console.log("VerifyAddressType   ".green + FetchClaimantAddr1)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddress1, FetchClaimantAddr1, "Address 1 value on claimant Creation Page");
        console.log("Verification Of Address 1 Exist In Entity".green)
        await t.wait(5000)
        FetchClaimantAddr2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Claimant_POM.AssureClaims_Claimant_Txt_Address2, "value");
        console.log("VerifyAddressType   ".green + FetchClaimantAddr2)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddress2, FetchClaimantAddr2, "Address 2 value on claimant  Creation Page");
        console.log("Verification Of Address 2 Exist In Entity".green)
        await t.wait(5000)
        FetchClaimantAddr3 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Claimant_POM.AssureClaims_Claimant_Txt_Address3, "value");
        console.log("VerifyAddressType   ".green + FetchClaimantAddr3)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddress3, FetchClaimantAddr3, "Address 3 value on claimant Creation Page");
        console.log("Verification Of Address 3 Exist In Entity".green)
        await t.wait(5000)
        FetchClaimantCity = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Claimant_POM.AssureClaims_Claimant_Txt_City, "value");
        console.log("VerifyAddressType   ".green + FetchClaimantCity)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddressCity, FetchClaimantCity, "City value on claimant Creation Page");
        console.log("Verification Of Address City Exist In Entity".green)
        await t.wait(5000)
        FetchClaimantCountry = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Claimant_POM.AssureClaimsApp_Txt_ClaimantCountry, "value");
        console.log("VerifyAddressType   ".green + FetchClaimantCountry)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddressCountry, FetchClaimantCountry, "Country value on claimant Creation Page");
        console.log("Verification Of Country Exist In Entity".green)
        FetchClaimantState = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Claimant_POM.AssureClaimsApp_Txt_ClaimantState, "value");
        console.log("VerifyAddressType   ".green + FetchClaimantState)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddressState, FetchClaimantState, "State value on claimant Creation Page");
        console.log("Verification Of State Exist In Entity".green)
        await t.wait(5000)
        // /================================= Adding Claimant and verification of primary address ends here ============================================================

        //===============================================Logout from Application Starts here============================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //===============================================Logout from Application ends here ============================================================

    });
// Verification of primary addresss over claimant screen ends here
     //Delete Created entity 
    test('AssureClaims_DeleteEntityOnMaintenanceScreen_Test_04', async t => {
        console.log("Delete Entity On Maintenance Screen Started".rainbow);
        //======================================================Login Into Application Starts Here===========================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        console.log(`Login Into Application-> Maintenance`)
        //======================================================Login Into Application Ends Here===========================================================================
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('MaintenanceZone', 'Entity', EntityName, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureCliams_MaintenanceERON_EnityIframe );
        await t.wait(5000)
        //==========================================================Entity Delete Starts Here====================================================================================================================
        await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Entity Creation Screen", "", "");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Entity Creation Screen");
        //==========================================================Entity Delete Starts Here====================================================================================================================
    })
    test('AssureClaims_DeleteEntityOnMaintenanceScreen_Test_05', async t => {
        console.log("Delete Entity On Maintenance Screen Started".rainbow);
        //======================================================Login Into Application Starts Here===========================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        console.log(`Login Into Application->Maintenance`)
        //======================================================Login Into Application Ends Here===========================================================================
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('MaintenanceZone', 'Entity', EntityName1, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureCliams_MaintenanceERON_EnityIframe );
        await t.wait(5000)
        //==========================================================Entity Delete Starts Here====================================================================================================================
        await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Entity Creation Screen", "", "");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Entity Creation Screen");
        //==========================================================Entity Delete Starts Here====================================================================================================================
    })
});

