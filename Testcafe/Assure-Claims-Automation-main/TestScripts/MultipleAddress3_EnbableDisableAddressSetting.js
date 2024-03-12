import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Entity from '../Functional_POM/POM_Entity'
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_AddressMaintenance from '../Functional_POM/POM_AddressMaintenance';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import POM_Search from '../Functional_POM/POM_Search'
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const Maint_Utility = new Maintenance_Functionality_Utility();
const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();
const MaintAddress_POM = new POM_AddressMaintenance();
const GenSysPar_POM = new POM_GeneralSystemParameter();
const Entity_POM = new POM_Entity();
const Search_POM = new POM_Search();
const ConfigMgr_POM = new POM_Config_Manager();

var faker = require('faker');

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

// *******************************************************************************************************************************

//JIRA ID OF STORY : RMA-96163

//Description      : Functionality of Utilities setting "Enable Add/Modify Addresses"

//AUTHOR           : SaiKrishna

//DEPENDANCY       : None

//PRE-REQUISITES   : None

//Preferred Server : 194Automation, DSN2 

// *******************************************************************************************************************************

//==========================================================Global Variable Declaration================================================================================
var FetchStrAddress1;
var FetchStrAddress2;
var FetchStrAddress3;
var FetchStrCity;
var FetchStrZipCode;
var LastName;
//==========================================================Global Variable Declaration================================================================================

DataIUT.forEach(data => {
    const MaintenanceLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    const ConfigurationManagerZoneLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`MultipleAddress3_EnbableDisableAddressSetting`.beforeEach(async t => {
    });

    //=============================================================Utility General System Parameter Setting For Disabling Enable Add/Modify Addresses  Starts Here=======================================================================================================
    test('AssureClaims_Utilities_GeneralSystemParameters_Checking_Settings_For_Enable_Add/Modify_Addresses_For_Disable_Test_01', async t => {
        await t.setNativeDialogHandler(() => true).useRole(ConfigurationManagerZoneLogin);
        console.log("Login Into Application!!".green)
        await t.wait(2000);
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "System", "Maintenance")
        await t.wait(15000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities, 'UnCheck', "Uncheck Enable Multiple Addresses For Entities Check Box")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        const VerifyEnable_Add_Modify_Addresses = GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Chk_EnableAddModifyAddresses
        await t.expect(VerifyEnable_Add_Modify_Addresses.hasAttribute('disabled')).ok('', { timeout: 20000 })
        console.log("Verification Of Disable Mode of Enable Add/Modify Addresses Is Successful".green)
        await t.wait(10000);
    })
    //=============================================================Utility General System Parameter Setting For Disabling Enable Add/Modify Addresses Ends Here=======================================================================================================
    //=============================================================Verifying Address Is Available In Maintenance After Disabling Enable Add/Modify Addresses General System ParameterSetting From Utility Zone  Starts Here====================================================================================================================

    test('AssureClaims_Verify_Address_Not_Present_Under_Maintenance_Test_02', async t => {
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceLogin);

        await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Maintenance_Lst_Menu.withText('Maintenance').nth(0), " Menu DropDown Of Maintenance")
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(MaintAddress_POM.AssureClaims_Maintenance_Lst_SelectAddressEntityOnMenu.withText('Address'), "Address Entity Not Exist");
    })
    //==============================================================Verifying Address Is Available In Maintenance After Disabling Enable Add/Modify Addresses General System ParameterSetting From Utility Zone  Starts Here====================================================================================
    //=============================================================Utility General System Parameter Setting For Enable Add/Modify Addresses Starts Here=======================================================================================================
    test('AssureClaims_Utilities_GeneralSystemParameters_Checking_Settings_For_Enable_Add/Modify_Addresses_Test_03', async t => {
        await t.setNativeDialogHandler(() => true).useRole(ConfigurationManagerZoneLogin);
        console.log("Login Into Application!!".green)
        await t.wait(2000);
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "System", "Maintenance")
        await t.wait(15000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities, 'Check', "check Enable Multiple Addresses For Entities Check Box")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Chk_EnableAddModifyAddresses, 'Check', "check Enable Multiple Addresses For Entities Check Box")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await t.wait(10000);

    })
    //=============================================================Utility General System Parameter Setting For Enable Add/Modify Addresses Ends Here=======================================================================================================

    test('AssureClaims_Address_Maintenance_Test_04', async t => {
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceLogin);
        //========================================================Creating Address Maintenance Starts Here=========================================================================================================================
        console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Address".yellow);
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Address", data.Country, data.State, "NA");
        //========================================================Creating Address Maintenance Starts Here=========================================================================================================================
        //========================================================Fetaching Values From Address Fields Starts Here==  
        FetchStrAddress1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr1, "value");
        console.log(FetchStrAddress1.yellow);

        FetchStrAddress2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr2, "value");
        console.log(FetchStrAddress2.yellow);

        FetchStrAddress3 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr3, "value");
        console.log(FetchStrAddress3.yellow);

        FetchStrCity = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_City, "value");
        console.log(FetchStrCity.yellow);

        FetchStrZipCode = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_ZipCode, "value");
        console.log(FetchStrZipCode.yellow);
        //========================================================Fetaching Values From Address Fields Starts Here==  

    })
    
    test("AssureClaims_Entity_Test_05", async t => {
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceLogin);
        //================================================New Entity Creation Starts Here======================================================================================================================================
        console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Entity".yellow);
        LastName = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Entity", data.EntityType, "SSN", "");
        console.log("New Entity is Created with Last Name: ".green + LastName);
        //================================================New Entity Creation Ends Here======================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Entity_Tab_Addresses, "Addresses Tab On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Entity_Btn_AddNewAddress, "Add New Address Button On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr1, FetchStrAddress1, "Address 1 Textbox On Entity Creation Screen");
        await t.pressKey('tab');
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity creation Screen");
        //================================================Verification Of Modified Address Which Is Reflection Starts Here========================================================================================================
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr2, FetchStrAddress2, "Address2 TextBox Address Accordion Entity Screen");
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr3, FetchStrAddress3, "Address3 TextBox Address Accordion Entity Screen");
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_City, FetchStrCity, "City TextBox Address Accordion Entity Screen");
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_ZipCode, FetchStrZipCode, "ZipCode TextBox Address Accordion Entity Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Entity_Tab_Entity, "Entity Tab On Entity Creation Screen");
        //================================================Verification Of Modified Address Which Is Reflection Ends Here========================================================================================================
    })

    test('Verification_Of_Address_Address_Test_06', async t => {
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceLogin);
        //================================================Search For Address Maintenance Starts Here=====================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Address_MenuOption.withText('Address'), "Address Menu");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AddressSearchFrame);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_Address1, FetchStrAddress1, "Address TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AddressFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_Generic.withText(FetchStrAddress1), "Address Link Clicked")
        await t.wait(10000);
        await t.switchToMainWindow();
        await t.wait(10000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Maintenance_Search_Address_Btn_CancleFromLeftPanel, "Cancle Button Clicked")
        //================================================Search For Address Maintenance Ends Here======================================================================================================================
        //================================================Modifing Existing Address Starts Here========================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AddressFrame);
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr1, data.AddressMaintenance1, "Address 1 Textbox On Address Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr2, data.AddressMaintenance2, "Address 2 Textbox On Address Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr3, data.AddressMaintenance3, "Address 3 Textbox On Address Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_City, data.CityMaintenance, "City Textbox On Address Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Address Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Address Creation Screen");
        //================================================Modifing Existing Address Ends Here========================================================================================================

    })
    test('Verification_Of_Entity_Address_Test_07', async t => {
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceLogin);
        //================================================Search For Entity Maintenance Starts Here======================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Search_Entity_MenuOption.withText('Entity'), "Entity Menu");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntitySearchFrame);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Entity_lastName, LastName, "Entity TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntitySearchLinkFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_Generic.withText(data.EntityLastName), "Entiy Link Clicked")
        await t.wait(10000);
        await t.switchToMainWindow();
        await t.wait(10000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Maintenance_Search_Address_Btn_CancleFromLeftPanel, "click Cancle Button")
        //================================================Search For Entity Maintenance Starts Here======================================================================================================================
        //================================================Verification Of Modified Address Which Is Reflection Starts Here========================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntityFROMPaymentFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Entity_Tab_Addresses, "Addresses Tab On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Entity_Btn_AddNewAddress, "Add New Address Button On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr1, data.AddressMaintenance1, "Address 1 Textbox On Entity Creation Screen");
        await t.pressKey('tab');
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity creation Screen");

        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr2, data.AddressMaintenance2, "Address2 TextBox Address Accordion Entity Screen");
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr3, data.AddressMaintenance3, "Address3 TextBox Address Accordion Entity Screen");
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_City, data.CityMaintenance, "City TextBox Address Accordion Entity Screen");
        //================================================Verification Of Modified Address Which Is Reflection Ends Here========================================================================================================
    })
})
