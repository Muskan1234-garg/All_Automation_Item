import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
// import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Home from '../Functional_POM/POM_Home';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import POM_Entity from '../Functional_POM/POM_Entity';
import POM_People from '../Functional_POM/POM_People';
import POM_AddressMaintenance from '../Functional_POM/POM_AddressMaintenance';
import POM_Search from '../Functional_POM/POM_Search';

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
const MaintAddress_POM = new POM_AddressMaintenance();
const People_POM = new POM_People();
const Search_POM = new POM_Search();
// const ConfigMgr_POM = new POM_Config_Manager();

//******************************************************************************************************************************//
//JIRA ID OF STORY : RMA-96022,RMA-96162
//Description : 4.  Entity with multiple addresses attached as payee in transaction screen
//AUTHOR : Yashaswi Mendhekar
//DEPENDANCY : Yes . Execute MultipleAddress1.js
//PRE-REQUISITE : Turn On Configuration Setting ---->General System Parameter-->Turn ON Enable Multiple Adddress for entity
//Preferred Server: AutoReg
//******************************************************************************************************************************//

//Global Variable Declaration

var faker = require('faker');

var EntityName = 'Auto2_' + faker.name.lastName();
var EntityName = 'Auto2_' + faker.name.lastName();
var Title = faker.name.title();
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
var FetchEntityName;
var FetchEntityState;
var FetchLastName;
var FetchEntityAddr1;
var FetchEntityAddr2;
var FetchEntityAddr3;
var FetchEntityCountry;
var FetchEntityCity;
var FetchEntityZipCode;
var StrControlNumber

DataAutoReg.forEach(data => {
    fixture`MultipleAddress2_Transaction`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });
    
// With Enable Multiple Adddress for entity setting ON and creation of entity with multiple Address starts here
    test('EnableMultipleAddressesForEntities_ON_Test_01', async t => {
        // ============================================Logging into application starts here ===================================================================================
        await t.wait(5000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        console.log("Login Into Application!!--> Maintenance".bgCyan)
        await t.wait(5000)
        //  ============================================ Logged into application =======================================================================================================

        //==================================================Entity creation Starts here==================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Entity");
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntityFrame)
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Name, EntityName, "Last Name Textbox On Entity Creation Screen");
        FetchEntityName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Entity_POM.AssureClaims_Entity_Txt_Name, "value");
        console.log(FetchEntityName.yellow + "Entity name 1 value Is Fetched From Entity Screen ")
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
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.AddressType, "Description Search Textbox On Entity Creation Page");
        await t.wait(5000)
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
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_People_Txt_Name, EntityName, "Name Textbox On Entity Creation Screen");
        console.log("New Entity is Created with Last Name: ".green + EntityName);
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
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_AddressMaintenance_Txt_Addr1, Address4, "Address 4 Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr2, Address5, "Address 5 Textbox On Entity Creation Screen");
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr3, Address6, "Address 6 Textbox On Entity Creation Screen");
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
        console.log("New Entity is Created with Last Name: ".green + EntityName);
        // ====================================================Adding 2nd Address ends here====================================================================

        //===================================== Verification of primary address as true in the grid starts here =========================================================
        const ColHeader2 = ["Primary Address"]
        const ColVal2 = ["true"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("true", "Entity address grid view", ColHeader2, ColVal2);
        await t.wait(5000)
        console.log("Verification of one Address as Primary is successful".green);
        await t.wait(5000)
        //===================================== Verification of primary address as true in the grid ends here =========================================================

        //===============================Entity creation with multiple address Ends here=================================================================================
        //===============================================Logout from Application Starts here============================================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //===============================================Logout from Application ends here ====================================================================
    });
// With Enable Multiple Adddress for entity setting ON and creation of entity with multiple Address ends here

// creation of transaction and changing Secondary address Effective and Expiration date as future starts here
    test('SecondaryAddressEffectiveAndExpirationDate_Future_Test_02', async t => {
        // ============================================Logging into application starts here =========================================================
        await t.wait(5000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log("Login Into Application!!--> Claims".bgCyan)
        await t.wait(5000)
        //  ============================================ Logged into application ========================================================================================
        console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Transaction ".yellow);
        await t.switchToMainWindow();
        StrControlNumber = await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA", "NA", "NA", 'NA', 'NA', data.MultiAddress_Bank, data.PayeeType, EntityName, "NA", data.TransactionType, data.AmountType)
        console.log("Funds Transaction is Created");

        //===================================== Verification of primary address as true in the grid ends here =========================================================
        FetchLastName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Funds_Transaction_Txt_LastName, "value");
        console.log("VerifyAddressType   ".green + FetchLastName)
        await Verify_Utility.AssureClaims_TextCompare(FetchEntityName, FetchLastName, "Entity name 1 value on transaction Screen");
        console.log("Verification Of Entity name 1 Exist In Entity".green)
        await t.wait(5000)
        FetchEntityAddr1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Funds_Transaction_Txt_Addr1, "value");
        console.log("VerifyAddressType   ".green + FetchEntityAddr1)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddress1, FetchEntityAddr1, "Address 1 value on transaction Screen");
        console.log("Verification Of Address 1 Exist In Entity".green)
        await t.wait(5000)
        FetchEntityAddr2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Funds_Transaction_Txt_Addr2, "value");
        console.log("VerifyAddressType   ".green + FetchEntityAddr2)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddress2, FetchEntityAddr2, "Address 2 value on transaction Screen");
        console.log("Verification Of Address 2 Exist In Entity".green)
        await t.wait(5000)
        FetchEntityAddr3 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Funds_Transaction_Txt_Addr3, "value");
        console.log("VerifyAddressType   ".green + FetchEntityAddr3)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddress3, FetchEntityAddr3, "Address 3 value on transaction Screen");
        console.log("Verification Of Address 3 Exist In Entity".green)
        await t.wait(5000)
        FetchEntityCity = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Funds_Transaction_Txt_City, "value");
        console.log("VerifyAddressType   ".green + FetchEntityCity)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddressCity, FetchEntityCity, "City value on transaction Screen");
        console.log("Verification Of Address City Exist In Entity".green)
        await t.wait(5000)
        FetchEntityCountry = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Funds_Transaction_Txt_countryCode, "value");
        console.log("VerifyAddressType   ".green + FetchEntityCountry)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddressCountry, FetchEntityCountry, "Country value on transaction Screen");
        console.log("Verification Of Country Exist In Entity".green)
        FetchEntityState = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Funds_Transaction_Txt_State, "value");
        console.log("VerifyAddressType   ".green + FetchEntityState)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddressState, FetchEntityState, "State value on transaction Screen");
        console.log("Verification Of State Exist In Entity".green)
        await t.wait(5000)
        FetchEntityZipCode = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Funds_Transaction_Txt_Zipcode, "value");
        console.log("VerifyAddressType   ".green + FetchEntityZipCode)
        await Verify_Utility.AssureClaims_TextCompare(FetchPrimaryAddressZipCode, FetchEntityZipCode, "Zip code on transaction Screen");
        console.log("Verification Of State Exist In Entity".green)
        await t.wait(5000)
        // =========================verification completed here=========================================================

        // =============================================Zone Switched to Maintenance starts here======================================================================
        await t.wait(5000)
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Maintenance");
        await t.wait(5000)
        // =================================================Zone Switched to Maintenance ends here=====================================================================

        //    =============================================================Search Entity starts here=========================================================================
        var d = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, 8, "MM/DD/YYYY")

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Entity");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenanceERON_SearchEntityFrame);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Entity_lastName, FetchEntityName, "Enter Entity Name")
        console.log("AssureClaims_Search Function is Called To Search Entity ");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenenceERON_LinkSelectFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_Generic.withText(data.EntityType), "EnityName link")
        console.log("Search is Completed");
        //=============================================================Search Entity ends here=========================================================================

        await t.switchToMainWindow();
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntityFrame)
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Tab_Addresses.withText('Addresses'), "Clicked on address accordian")
        await t.wait(5000)
        //=====================================Effective Date and Expiration Date set as Future date starts here=========================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Btn_Edit.nth(0), "Clicked on non primary address edit button")
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_EffectiveDate, d, "Set future Effective Date")
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_ExpirationDate, d, "Set future Expiration Date")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Button On Address PopUp");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
        //=====================================Effective Date and Expiration Date set as Future date ends here=========================================================

        //===============================================Logout from Application Starts here============================================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //===============================================Logout from Application ends here ===============================================================================
    });
// creation of transaction and changing Secondary address Effective and Expiration date as future ends here

// Verification of secondary address not visible on address 1 Lookup on Transaction Screen Starts here
    test('VerificationOfSecondaryAddressEffectiveAndExpirationDate_Future_Test_03', async t => {
        // ============================================Logging into application starts here ===============================================================================
        await t.wait(5000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log("Login Into Application!!--> Claims".bgCyan)
        await t.wait(5000)
        //  ============================================ Logged into application ========================================================================================

        // ============================================= Funds search Starts here ======================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Funds_Label_MenuOption, "Funds Menu");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_FundsIframe);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Funds_Txt_CheckControlnumber, StrControlNumber, "Typing Control Number")
        console.log("AssureClaims_Search Function is Called To search Transaction ".yellow);
        await Function_Utility.AssureClaims_Search()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_Funds_PaymentIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_ClaimNumber.withText(StrControlNumber), "click link ControlNumber")
        console.log("Search is Completed");
        // ============================================= Funds search ends here =========================================================================================
        await t.switchToMainWindow();
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_TransactionSearchFrame)
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Transaction_Txt_Address1Lookup, "clicking on Address 1 Lookup")
        await t.wait(5000)
        //===================================== Verification of Secondary address grid Not visible starts here =========================================================
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(MaintAddress_POM.AssureClaims_Claims_Row_CheckRowExist.withText(Address4), " Address Not Exist");
        console.log("Verification of Non Primary Address doesn't exist".green);
        //===================================== Verification of Secondary address grid Not visible ends here =========================================================

        //===============================================Logout from Application Starts here============================================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //===============================================Logout from Application ends here ====================================================================
    });
// Verification of secondary address not visible on address 1 Lookup on Transaction Screen ends here

// changing Secondary address Effective and Expiration date as Past Date starts here
    test('SecondaryAddressEffectiveAndExpirationDate_Past_Test_04', async t => {

        // ============================================Logging into application starts here =========================================================
        await t.wait(5000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        console.log("Login Into Application!!--> Maintenance".bgCyan)
        await t.wait(5000)
        //  ============================================ Logged into application ========================================================================================

        // ============================================= Entity search starts here =========================================================================================
        var d = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -8, "MM/DD/YYYY")
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Entity");
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenanceERON_SearchEntityFrame);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Entity_lastName, FetchEntityName, "ssn of entity Name")
        console.log("AssureClaims_Search Function is Called To Search EntityEron ");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenenceERON_LinkSelectFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_Generic.withText(data.EntityType), "EnityName link")
        console.log("Search is Completed");
        // ============================================= Entity search ends here =========================================================================================

        await t.switchToMainWindow();
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntityFrame)
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Tab_Addresses.withText('Addresses'), "Clicked on address accordian")
        await t.wait(5000)
        //=====================================Effective Date and Expiration Date set as Past date starts here=========================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Entity_Btn_Edit.nth(0), "Clicked on non primary address edit button")
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_EffectiveDate, d, "Set future Effective Date")
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_ExpirationDate, d, "Set future Expiration Date")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Button On Address PopUp");
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");

        //=====================================Effective Date and Expiration Date set as Future date ends here=========================================================

        //===============================================Logout from Application Starts here============================================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //===============================================Logout from Application ends here ====================================================================
    });
 // changing Secondary address Effective and Expiration date as Past Date ends here

 // Verification of secondary address not visible on address 1 Lookup on Transaction Screen Starts here
    test('VerificationOfSecondaryAddressEffectiveAndExpirationDate_Past_Test_05', async t => {
        // ============================================Logging into application starts here =========================================================
        await t.wait(5000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log("Login Into Application!!--> Claims".bgCyan)
        await t.wait(5000)
        //  ============================================ Logged into application ========================================================================================
        // ==================================================Search Tranaction Starts here==============================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Funds_Label_MenuOption, "Funds Menu");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_FundsIframe);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Funds_Txt_CheckControlnumber, StrControlNumber, "Typing Control Number")
        console.log("AssureClaims_Search Function is Called To search transaction ".yellow);
        await Function_Utility.AssureClaims_Search()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_Funds_PaymentIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_ClaimNumber.withText(StrControlNumber), "click link ControlNumber")
        console.log("Search is Completed");
        // ==================================================Search Tranaction ends here==============================================================================

        await t.switchToMainWindow();
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_TransactionSearchFrame)
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Transaction_Txt_Address1Lookup, "clicking on Address 1 Lookup")
        await t.wait(5000)
        //===================================== Verification of primary address as true in the grid starts here =========================================================

        await Verify_Utility.AssureClaims_ElementNotExist_Utility(MaintAddress_POM.AssureClaims_Claims_Row_CheckRowExist.withText(Address4), " Address Not Exist");
        console.log("Verification of Non Primary Address doesn't exist".green);
        //===================================== Verification of primary address as true in the grid ends here =========================================================
        //===============================================Logout from Application Starts here============================================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //===============================================Logout from Application ends here =================================================================================
    });
// Verification of secondary address not visible on address 1 Lookup on Transaction Screen ends here
     test('AssureClaims_DeleteEntityOnMaintenanceScreen_Test_06', async t => {
        console.log("Delete Entity On Maintenance Screen Started".rainbow);
        //======================================================Login Into Application Starts Here===========================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        console.log(`Login Into Application-> Maintenance`)
        //======================================================Login Into Application Ends Here===========================================================================
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('MaintenanceZone', 'Entity', EntityName, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureCliams_MaintenanceERON_EnityIframe);
        await t.wait(5000)
        //==========================================================Entity Delete Starts Here====================================================================================================================
        await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Entity Creation Screen", "", "");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Entity Creation Screen");
        //==========================================================Entity Delete Starts Here====================================================================================================================
    })

});
