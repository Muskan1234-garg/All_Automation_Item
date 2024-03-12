 import {Selector,t} from 'testcafe';

class POM_unit{
    constructor(){
    
 
 this.AssureClaims_Unit_Btn_AddUnit = Selector('[aria-label="Add Unit"]');
    //POM For Unit Add Button On Unit Creation Page
	
	this.AssureClaims_Unit_Btn_UnitID_Lookup = Selector('#btn_vehvin').find('i');
	//POM For Unit Lookup Button On Unit Creation Page
	
	this.AssureClaims_Unit_Txt_UnitID = Selector('[name="Vehicle ID"]');
	//POM For Unit Type Text On Unit Creation Page
	
	this.AssureClaims_Unit_Btn_SubmitQuery = Selector('#submitquery').find('i');
	//POM For Unit SubmitQuery On Unit Creation Page
	
	this.AssureClaims_Unit_Lnk_UnitID = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
	//POM For Unit Type Text On Unit Creation Page
	
	this.AssureClaims_Filter_List = Selector('#helpbtn').find('i').withText('filter_list');
	//POM For Filter_List On Unit Creation Page
	
	this.AssureClaims_Select_Maintenance = Selector('[aria-label="Maintenance"]').find('a').withText('build');
	//POM For Select Maintenance On Unit Creation Page
	
	this.AssureClaims_Select_Search_Maintenance = (Selector('#menuBar').find('a').withText('Search').nth(0))
	//POM For Select Search Maintenance On Unit Creation Page
	
	this.AssureClaims_Search_Vehicle_Label_MenuOption = (Selector('[id="menu_SearchRoot"]').find('a').withText('Vehicle'))
	//POM For Select Vehicle Search Maintenance On Unit Creation Page
	
	this.AssureClaims_Search_Txt_VehicleID = Selector('[name="Vehicle ID"]');
	 
	 
    this.AssureClaims_Search_Btn_SubmitQuery = Selector('#submitquery').find('i');
		
    this.AssureClaims_Search_Lnk_VehicleID = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
		
	this.AssureClaims_Search_Child_On_Vehicle = Selector('[class="list-group"]').find('span');

	this.AssureClaims_Lnk_Child_UnIt = Selector('[class="list-group"]').find('span');

	this.AssureClaims_Vehicle_Txt_Vehicle_Id_Verification = Selector('#lookup_vehvin');
        }};
export default POM_unit;