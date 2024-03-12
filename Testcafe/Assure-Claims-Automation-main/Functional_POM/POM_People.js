import {Selector} from 'testcafe';

class POM_People{
    constructor(){
        this.AssureClaims_People_Lst_TypeOfPerson = Selector('#entitytableid');
        //POM for Type Of Entity Dropdown On Maint=>Entity Screen

        this.AssureClaims_People_Txt_Name = Selector('#lastname');
        //POM for Last Name Textbox On Maint=>Entity Screen

        this.AssureClaims_People_Txt_FirstName = Selector('#firstname');
        //POM for first Name Textbox On Maint=>Entity Screen

        this.AssureClaims_People_Lst_IDType = Selector('#typeid');
        //POM for ID Type Dropdown On Maint=>Entity Screen

        this.AssureClaims_People_Txt_SSN = Selector('#taxid');
        //POM for SSN Textbox On Maint=>Entity Screen

        this.AssureClaims_People_Tab_Addresses = Selector('[role="button"]').find('span').withText('Addresses');
        //POM for Addresses tab

        
        this.AssureClaims_People_Btn_AddNewAddress = Selector('#cruduiGridAddBtn');
        //POM for Add New Address Button

        this.AssureClaims_People_Txt_AddrType = Selector('#lookup_addressType');
        //POM for Address Type Textbox 

        this.AssureClaims_People_Txt_Addr1 = Selector('#lookup_addr1');
        //POM for Address1 Textbox

        this.AssureClaims_People_Txt_Addr2 = Selector('#addr2');
        //POM for Address2 Textbox

        this.AssureClaims_People_Txt_Addr3 = Selector('#addr3');
        //POM For Address3 Textbox

        this.AssureClaims_People_Txt_Addr4 = Selector('#addr4');
        //POM for Address4 Textbox

        this.AssureClaims_People_Txt_City = Selector('#city');
        //POM for City Textbox

        this.AssureClaims_People_Txt_State = Selector('#lookup_state');
        //POM for State Lookup Textbox

        this.AssureClaims_MaintPeople_Btn_Country = Selector('#btn_country_openlookup');
        //POM for Maint=>Employee Country Lookup Button

      
        this.AssureClaims_MaintPeople_Btn_State = Selector('#btn_state_openlookup');
        //POM for State Lookup Button on Maint=>Employee

        this.AssureClaims_People_Btn_State = Selector('#btn_stateid_openlookup');
        //POM for State Button Lookup On PI Employee Page

        this.AssureClaims_MaintPeople_Txt_ZipCode = Selector('#zipCode');
        //POM for Zip Code Textbox on Maint=>Employee Page

        this.AssureClaims_People_Txt_ZipCode = Selector('#zipcode');
        //POM For Zip Code Textbox on PI Employee screen

        this.AssureClaims_People_Txt_Country = Selector('#lookup_country');
        //POM for Country Textbox On Employee Screen

        this.AssureClaims_People_Txt_County = Selector('#county');
        //POM for County Textbox

        this.AssureClaims_Entity_Txt_Abbreviation = Selector('#abbreviation');
        //POM for Abbreviation Textbox

        this.AssureClaims_People_Btn_EditAddress = Selector('#Edit');
        //POM for County Textbox
        this.AssureClaims_Entity_Tab_Entity = Selector('[role="button"]').find('span').withText('Entity').nth(0);
        //POM for Entity Tab On Maint=>Entity Screen

        this.AssureClaims_People_Btn_Close = (Selector('#Close').find('i'))

        this.AssureClaims_People_Tab_Entity = Selector('[role="button"]').find('span').withText('People').nth(0);
        //POM for Entity Tab On Maint=>Entity Screen


    }
};export default POM_People;
