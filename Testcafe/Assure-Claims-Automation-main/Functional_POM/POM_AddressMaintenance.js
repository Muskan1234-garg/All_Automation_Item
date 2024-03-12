import { database } from 'faker';
import { Selector, t } from 'testcafe';


class POM_AddressMaintenance {
    constructor() {

        // Yashaswi's POM : RMA-96161
        this.AssureClaims_Address_Txt_Addr1 = Selector('#addr1');
        //POM for Address1 Textbox

        this.AssureClaims_Address_Txt_Addr2 = Selector('#addr2');
        //POM for Address2 Textbox

        this.AssureClaims_Address_Txt_Addr3 = Selector('#addr3');
        //POM For Address3 Textbox 

        this.AssureClaims_Address_Txt_Addr4 = Selector('#addr4');
        //POM for Address4 Textbox 

        this.AssureClaims_Address_Txt_City = Selector('#city');
        //POM for City Textbox on 

        this.AssureClaims_Address_Txt_ZipCode = Selector('#zipCode');
        //POM For Zip Code Textbox on PI Address screen

        this.AssureClaims_AddressMaintenance_Txt_Addr1 = Selector('#lookup_addr1');
        //POM for Address1 Textbox

        this.AssureClaims_MaintEntity_Btn_State = Selector('#btn_state_openlookup');
        //POM for State Lookup Button on Maint=>Entity

        this.AssureClaims_Entity_Tab_State = Selector('#lookup_state')
        // POM for State under address tab in entity screen
        
        this.AssureClaims_Address_Txt_Country = Selector('#lookup_countrycode');
        //POM for Country Textbox On Entity Screen

        this.AssureClaims_Entity_Address_Txt_State = Selector('#lookup_stateid');
        //POM for State Textbox On Driver Screen

        this.AssureClaims_Entity_Txt_ZipCode = Selector('#zipcode');
        //POM For Zip Code Textbox on Entity screen

        this.AssureClaims_Entity_Tab_Addresses = Selector('[role="button"]').find('span');
        //POM for Addresses tab

        this.AssureClaims_Entity_Btn_AddNewAddress = Selector('#cruduiGridAddBtn');
        //POM for Add New Address Button

        this.AssureClaims_Entity_Txt_AddrType = Selector('#lookup_addressType');
        //POM for Address Type Textbox 

        this.AssureClaims_Entity_Txt_County = Selector('#county');
        //POM for County Textbox

        this.AssureClaims_Entity_Tab_Country = Selector('#lookup_country');
        //POM for Country Textbox in address Tab on Entity screen 

        this.AssureClaims_Entity_Txt_CountryState= Selector('[role="button"]');
        // POM for State and country search box 

        this.AssureClaims_Entity_Btn_AddressType= Selector('#btn_addressType_openlookup');
        // POM for Address type button under Address tab on entity screen
	    
	this.AssureClaims_Entity_Btn_Country = Selector('#btn_countrycode_openlookup');
        //POM for Entity Country Lookup Button

        this.AssureClaims_EntityAddress_Btn_State = Selector('#btn_stateid_openlookup');
        //POM for State Button Lookup on entity Page

        //Sai's Code : RMA-96163
      this.AssureClaims_Maintenance_Lst_Menu = Selector('#menuBar').find('a');
      //POM for Menu Dropdown In Maintenance Screen

      this.AssureClaims_Maintenance_Lst_SelectAddressEntityOnMenu = Selector('#menu_MaintenanceRoot').find('a');
      //POM for Select Address Entity On Menu Dropdown In Maintenance Screen

      this.AssureClaims_Address_Btn_Country = Selector('#btn_country_openlookup').find('.glyphicon.glyphicon-option-horizontal');
      //POM For Country OpenLookup Button On Address Maintenance Creation Page
	
      this.AssureClaims_Address_Lnk_SelectCountry = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
      //POM For Country Select On Address Maintenance Creation Page
	
      this.AssureClaims_Address_Btn_State = Selector('#btn_state_openlookup').find('.glyphicon.glyphicon-option-horizontal')
      //POM For State OpenLookup Button On Address Maintenance Creation Page
	
      this.AssureClaims_Address_Lnk_SelectState = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
      //POM For State Select On Address Maintenanc Creation Page
        
     // yashaswi's code : RMA-96162

    this.AssureClaims_Funds_Transaction_Txt_LastName = Selector('#lookup_rmalookupfinanciallastname2_lastName')
    // POM for Lastname textbox on transaction screen

    this.AssureClaims_Funds_Transaction_Txt_Addr1 = Selector('#lookup_pye_addr1')
    // POM for Address 1 testbox on transaction Screen

    this.AssureClaims_Funds_Transaction_Txt_Addr2 = Selector('#pye_addr2')
    // POM for Address 2 testbox on transaction Screen

    this.AssureClaims_Funds_Transaction_Txt_Addr3 = Selector('#pye_addr3')
    // POM for Address 3 testbox on transaction Screen

    this.AssureClaims_Funds_Transaction_Txt_Addr4 = Selector('#pye_addr4')
    // POM for Address 4 testbox on transaction Screen

    this.AssureClaims_Funds_Transaction_Txt_City = Selector('#pye_city')
    // POM for city testbox on transaction Screen

    this.AssureClaims_Funds_Transaction_Txt_State = Selector('#lookup_pye_stateid')
    // POM for state testbox on transaction Screen

    this.AssureClaims_Funds_Transaction_Txt_Zipcode = Selector('#pye_zipcode')
    // POM for Zip testbox on transaction Screen

    this.AssureClaims_Funds_Transaction_Txt_county = Selector('#county')
    // POM for county testbox on transaction Screen

    this.AssureClaims_Funds_Transaction_Txt_countryCode = Selector('#lookup_pye_countrycode')
    // POM for country testbox on transaction Screen

    this.AssureClaims_Entity_Btn_Edit = Selector('#Edit');
    //POM for edit button on entity split

    this.AssureClaims_Address_Txt_EffectiveDate=Selector('#effectiveDate')
    // POM for Effective date textbox on entity screen

    this.AssureClaims_Address_Txt_ExpirationDate=Selector('#expirationDate')
    // POM for Expiration date textbox on entity screen

    this.AssureClaims_Transaction_Txt_Address1Lookup=Selector('#btn_pye_addr1')
    //  POM for address 1 lookup button on entity Screen

    this.AssureClaims_Claims_Row_CheckRowExist = Selector('[ng-click="grid.appScope.columnClick(row.entity)"]')
    // POM for verifying Secondary Address grid
	    
	    
    //Sai's code : RMA-96164
    this.AssureClaims_Address_Btn_AddressToolBarLookup = Selector('[aria-label="Lookup"]').find('i');
    //POM For LookUp Tool Bar in Address Screen
	    
    this.AssureClaimsApp_AddressMaster_Txt_Address1=Selector('[class="ui-grid-header-cell-label ng-binding"]').withText('Address1').parent('[role="columnheader"]').find('input')
    //POM For Address1 TextBOX On LookUp Tool Bar  in Address Screen

    this.AssureClaims_Maintenance_AddressMaster_Lnk_AddressMaintenanceFromLeftPanel = Selector('[aria-label="Address Maintainance"]'); 
    //POM for Address Maintenance Link From Left Panel In Maintenance Screen



    }
};
export default POM_AddressMaintenance;
