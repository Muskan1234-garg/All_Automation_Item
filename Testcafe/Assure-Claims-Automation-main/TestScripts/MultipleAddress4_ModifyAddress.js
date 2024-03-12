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

const Maint_Utility = new Maintenance_Functionality_Utility();
const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();
const MaintAddress_POM=new POM_AddressMaintenance();
const Entity_POM = new POM_Entity();


const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');
var faker = require('faker');
//const DataIUT = require('../DataFiles/DataSTG.json');


// *******************************************************************************************************************************

//JIRA ID OF STORY : RMA-96164

//Description      : Modifying address from Entity Level

//AUTHOR           : SaiKrishna

//DEPENDANCY       : None

//PRE-REQUISITES   : Run this suit After executing EnableDisableAddressSetting_AddEditAddress.js

//Preferred Server : 194Automation, DSN2 

// *******************************************************************************************************************************

//==========================================================Global Variable Declaration================================================================================
var FetchStrAddress1;
var FetchStrAddress2;
var FetchStrCity;
var FetchStrAddress3;
var FetchStrZipCode;
var LastName;
var FetchStrModifiedAddress1;
var FetchStrModifiedAddress2;
var FetchStrModifiedAddress3;
var FetchStrModifiedCity;

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

   
    fixture`MultipleAddress4_ModifyAddress`.beforeEach(async t => {
        
    });

//Go to address maintenance, add new address record
//Create new Entity record and attach address by address master (created in step 4) and save it
//Then, Edit the address attached in entity and modify it
//Verify in address maintenance that new record is created in system whereas actual record is still there

test('AssureClaims_Address_Maintenance_Test_01', async t => {
    await t.setNativeDialogHandler(() => true).useRole(MaintenanceLogin);
     //========================================================Creating Address Maintenance Starts Here=========================================================================================================================
        console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Address".yellow);
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Address",data.Country,data.State,"NA");
      //========================================================Creating Address Maintenance Starts Here=========================================================================================================================
      //========================================================Fetaching Values From Address Fields Starts Here==  
        FetchStrAddress1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr1,"value");
        console.log(FetchStrAddress1.yellow);

        FetchStrAddress2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr2,"value");
        console.log(FetchStrAddress2.yellow);
     
        FetchStrAddress3 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr3,"value");
        console.log(FetchStrAddress3.yellow);

        FetchStrCity = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_City,"value");
        console.log(FetchStrCity.yellow);

        FetchStrZipCode = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_Address_Txt_ZipCode,"value");
        console.log(FetchStrZipCode.yellow);
        await t.switchToMainWindow();
       //========================================================Fetaching Values From Address Fields Starts Here==  
      
       var Address1 = faker.address.streetName();
    var Address2 = faker.address.streetAddress();
    var Address3 = faker.address.cityPrefix();
    var City = faker.address.city();
    //================================================New Entity Creation Starts Here======================================================================================================================================
    console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Entity For Modifting address ".yellow);
    LastName = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Entity", data.EntityType, "SSN","");
    console.log("New Entity is Created with Last Name: ".green+LastName);
    //================================================New Entity Creation Ends Here======================================================================================================================================
   //===============================================Adding Address Of Above Created Entity Starts Here==================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Entity_Tab_Addresses,"Addresses Tab On Entity Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Entity_Btn_AddNewAddress,"Add New Address Button On Entity Creation Screen");
    await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr1,FetchStrAddress1,"Address 1 Textbox On Entity Creation Screen");
    await t.pressKey('tab');
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Entity creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On General Claim creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
   //===============================================Adding Address Of Above Created Entity Ends Here==================================================================================================================================
    //====================================================Modifying Entity Address Stars Here===========================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Entity_Btn_EditAddress,"Add New Address Button On Entity Creation Screen");
    await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr1,Address1,"Address 1 Textbox On Entity Creation Screen");
    await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr2,Address2, "Address2 TextBox Address Accordion Entity Screen");
    await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr3,Address3, "Address3 TextBox Address Accordion Entity Screen");
    await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_City,City, "City TextBox Address Accordion Entity Screen");
   //====================================================Modifying Entity Address Stars Here==================================================================
   //====================================================Fetching Modified Entity Address Fields Starts Here====================================================================
   FetchStrModifiedAddress1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(MaintAddress_POM.AssureClaims_AddressMaintenance_Txt_Addr1,"value");
    console.log(FetchStrModifiedAddress1+ +"Is Feteched From Address1 From Address In Address LookUP Screen");
    
    FetchStrModifiedAddress2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr2,"value");
    console.log(FetchStrModifiedAddress2+ +"Is Feteched From Address2 From Address In Address LookUP Screen");

    FetchStrModifiedAddress3 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_Addr3,"value");
    console.log(FetchStrModifiedAddress3+ +"Is Feteched From Address3 From Address In Address LookUP Screen");

    FetchStrModifiedCity = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Entity_POM.AssureClaims_EntityAddresses_Txt_City,"value");
    console.log(FetchStrModifiedCity+ +"Is Feteched From City From Address In Address LookUP Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Entity creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On General Claim creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
    //====================================================Fetching Modified Entity Address Fields Ends Here====================================================================
    await t.wait(8000);
    await t.switchToMainWindow();
    await t.wait(5000);
    //====================================================Clicking on Address Maintenance Link IN Left Panel Starts Here==========================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Maintenance_AddressMaster_Lnk_AddressMaintenanceFromLeftPanel,"Address Maintenance Link Clicked")
   //====================================================Clicking on Address Maintenance Link IN Left Panel Ends Here==========================================================
    //====================================================Switching TO IFrame Starts Here==========================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AddressFrame);
    await t.wait(6000); 
    //====================================================Switching TO IFrame Ends Here==========================================================
   //====================================================Clicking on Address LookUp Button Starts Here==========================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Address_Btn_AddressToolBarLookup,"Address LookUP From Tool Bar Clicked")
     //====================================================Clicking on Address LookUp Button Ends Here=========================================================
    await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaimsApp_AddressMaster_Txt_Address1,FetchStrAddress1,"Address1 TextBox")
    //=====================================================Verification Over Master Address Look up Screen Starts Here==========================================================================
    const headerAddress1 = ["Address1","Address2","Address3","City"]
    const valAddress1 = [FetchStrAddress1,FetchStrAddress2,FetchStrAddress3,FetchStrCity]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(FetchStrAddress1,'LookUP Address grid view',headerAddress1,valAddress1);
   
    await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaimsApp_AddressMaster_Txt_Address1,FetchStrModifiedAddress1,"Address1 TextBox")

    const headerAddress2 = ["Address1","Address2","Address3","City"]
    const valAddress2 = [FetchStrModifiedAddress1,FetchStrModifiedAddress2,FetchStrModifiedAddress3,FetchStrModifiedCity]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(FetchStrModifiedAddress1,'LookUP Address grid view',headerAddress2,valAddress2);
    //=====================================================Verification Over Master Address Look up Screen Ends Here==========================================================================
})
})


