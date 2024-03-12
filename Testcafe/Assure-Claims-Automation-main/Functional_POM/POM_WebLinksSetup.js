import {Selector,t} from 'testcafe';
const DataIUT = require('../DataFiles/DataIUT.json');

class POM_WebLinksSetup {
    constructor(){

        this.AssureClaims_WebLinksSetup_Lnk_Screen = Selector('[aria-label="Web Links Setup"]')
        //POM for Lnk Screen on WebLinksSetup
      
        this.AssureClaims_SuplementalField_Lnk_Screen = Selector('#SupplementalData_screenid')
        //POM for SuplementalField Lnk on Supplemental Field Data
  
       this.AssureClaims_WebLinksSetup_Lst_add = Selector('#gridid_toolbar_add_button');
         //POM for WebLinksSetup Lst add on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_URL_ShortName = Selector('[aria-labelledby="cl_urlShortName"]');
        //POM for WebLinksSetup Lst URL ShortName on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_URL_Type = Selector('#ctrl_urlType');
        //POM for WebLinksSetup Lst URL Type on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_URL_Type_Verify = Selector('#ctrl_urlType').find('div').find('div').find('span');
        //POM for WebLinksSetup Lst URL Type Verify on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_Select_Parameter_Verify = Selector('#ctrl_selectParameter').find('div').find('div').find('span');
       //POM for WebLinksSetup Select Parameter Verify on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_Select_Function_Verify = Selector('#ctrl_selectFunction').find('div').find('div').find('span');
       //POM for WebLinksSetup Lst_Select Function Verify on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_Favorite = Selector('[class="material-icons"]').withExactText("star_border");
       //POM for WebLinksSetup Lst Favorite on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_Favorite_Remove = Selector('[class="material-icons"]').withExactText("star");
       //POM for WebLinksSetup Lst Favorite Remove on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_Favorite_Done = Selector('[role="img"]').withExactText("done");  
       //POM for WebLinksSetup Lst Favorite Done on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_Favorite_Cancel = Selector('[aria-label="Close"]').find('svg');    
       //POM for WebLinksSetup Lst Favorite Cancel on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_UsersMultiCheck = Selector('#multichips').find('mat-chip-listbox').find('div').find('mat-chip-option').nextSibling();
       //POM for WebLinksSetup Lst UsersMultiCheck on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_URLTYPE = Selector('[role="option"]').find('span');    
       //POM for WebLinksSetup Lst_URLTYPE on WebLinksSetup
      
       this.AssureClaims_WebLinksSetup_Lst_User_List = Selector('[name="ctrl_userList"]');
        //POM for WebLinksSetup Lst User List on WebLinksSetup
      
       this.AssureClaims_WebLinksSetup_Lst_UserList_Lookup = Selector('claims-baselookup').find('div').find('div').withAttribute('role', 'button');
      //POM for WebLinksSetup Lst UserList Lookup on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_UserList_Lookup_Tab_selection = Selector('[role="tab"]').find('span').find('span').find('span').withExactText("User's");
      //POM for WebLinksSetup Lst UserList Lookup Tab selection on WebLinksSetup
  
       this.AssureClaims_WebLinksSetup_Lst_UserList_Lookup_MyUsersTab_selection = Selector('[role="tab"]').find('span').find('span').find('span').withExactText("My User's");
       //POM for WebLinksSetup Lst UserList Lookup MyUsersTab selection on WebLinksSetup
 
      this.AssureClaims_WebLinksSetup_Lst_User_List_Edit = Selector('#mat-mdc-chip-0 > span.mdc-evolution-chip__cell.mdc-evolution-chip__cell--primary > button > span.mdc-evolution-chip__text-label.mat-mdc-chip-action-label > span.text-ellipsis');
      //POM for edit in user list of web links setup

      this.AssureClaims_WebLinksSetup_Lst_Supplemental_Link = Selector('#ctrl_useAsSupplementalLink-input');
      //POM for Supplemental link in web links setup screen
      
      this.AssureClaims_WebLinksSetup_Lst_URL_String = Selector('#ctrl_urlString');
      //POM for URL string in web Links Setup
      
      this.AssureClaims_WebLinksSetup_Lst_URL_String_Edit = Selector('#ctrl_urlString').find('mat-form-field').find('div').find('div').find('div').find('textarea');
      //POM for edit button in URL string of web links setup 
      this.AssureClaims_WebLinksSetup_Lst_Select_Parameter= Selector('#ctrl_selectParameter');
      //POM for select parrameter in web links setup
      
      this.AssureClaims_WebLinksSetup_Lst_Select_Function = Selector('#ctrl_selectFunction');
      //POM for select function in web links setup

      this.AssureClaims_WebLinksSetup_Add_Save = Selector('[aria-label="Save"]'); 
      //POM for add button in web links setup screen 
      
      this.AssureClaims_WebLinksSetup_Dlgbox_Cancel = Selector('#toolbar_cancel_button');
      //POM for cancel button in WebLinksSetup
      
      this.AssureClaims_WebLinksSetup_Grid_View =Selector('#myGrid');     
      //POM for grid view in Web links setup screen
     
      DataIUT.forEach(data => {
      this.AssureClaims_WebLinksSetup_Lst_URL_ShortName_Grid = Selector('[class="ag-wrapper ag-input-wrapper ag-checkbox-input-wrapper"]');
      //POM for grid in the list of URL short name of WebLinksSetup
      this.AssureClaims_WebLinksSetup_Multi_Select_UserList = Selector('.ag-header-cell-text').withText('Action')
    .parent('.ag-header-cell-label')
    .parent('.ag-cell-label-container')
    .parent('.ag-header-cell-comp-wrapper')
    .sibling('.ag-labeled')
    .find('input[ref="eInput"]');
     //POM for user list in WebLinksSetup
      
      this.AssureClaims_WebLinksSetup_Lst_URL_ShortName_Grid_Refresh = Selector('#displayOptions > div.float-md-end > span > a:nth-child(2) > mat-icon')
      
      this.AssureClaims_WebLinksSetup_Lst_URL_ShortName_Grid_Delete = Selector('[col-id="urlShortName"]').find('[class="ag-cell-wrapper"]').find('[class="ag-cell-value"]');
      
      this.AssureClaims_WebLinksSetup_Lst_URL_Type_Checking_ForEdit = Selector('#ctrl_urlType').find('div').find('div').find('span').find('span');
       //POM for refreshing filter, delete filter, edit filter in grid WebLinksSetup
      }),        
      
      this.AssureClaims_WebLinksSetup_Lst_Filter_Refresh = Selector('[aria-label="Refresh"]');                                            
      //POM for refreshing filter in list in WebLinksSetup
      
      this.AssureClaims_WebLinksSetup_Lst_gridid_edit_button= Selector('#gridid_toolbar_edit_button');
      //POM for list in grid for edit button in WebLinksSetup
      
      this.AssureClaims_WebLinksSetup_Lst_gridid_delete_button= Selector('#gridid_toolbar_delete_button');
      //POM for list in grid for delete button in WebLinksSetup
      
      this.AssureClaims_WebLinksSetup_Lst_gridid_delete_Confirm_button= Selector('#confirm-dialog-confirmbtn');
      //POM for confirm button in delete action in WebLinksSetup
      
      this.AssureClaims_WebLinksSetup_Close= Selector('[aria-label="Close"]').find('[class="mat-icon notranslate material-icons mat-icon-no-color mat-ligature-font"]').withText('close');
      //POM for close button on WebLinksSetup
      
      this.AssureClaims_Suplemental_Grid= Selector('[col-id="userTableName"]').find('[class="ag-cell-wrapper"]').find('[class="ag-cell-value"]').find('div').find('span').find('b').find('a').withAttribute('class', 'btn-simple');
       //POM for Grid in supplemental field screen
      
       this.AssureClaims_suplementalField_Add = Selector('#crudGrid_toolbar_add_button');
       //POM for Add button in supplemental field screen
      
       this.AssureClaims_Suplemental_Field_Type = Selector('#ctrl_selectedfieldType').find('[role="trigger"]').child('div');
      //POM for supplemental field type 
      
       this.AssureClaims_Suplemental_Hyper_Link= Selector('#ctrl_codeFileId');
       //POM for Hyper link for supplemental screen
      
       this.AssureClaims_Suplemental_Hyper_Link_Close= Selector('[aria-label="Close"]');
       //POM for close button in Hyper link for supplemental screen
      
       this.AssureClaims_Weblink_Filter_Selection= Selector('[name="gridid_inputsearch"]');
      //POM for Filter selection on WebLinksSetup 
      
      this.AssureClaims_WebLinksSetup_Lst_URL_ShortName_Grid_Delete = Selector('[col-id="urlShortName"]').find('[class="ag-cell-wrapper"]').find('[class="ag-cell-value"]');
      //POM for Grid Delete for URL shortname on WebLinksSetup
      
      this.AssureClaims_WebLinksSetup_Lst_grid_check_Url_ShortName = Selector('[col-id="urlShortName"]').find('[class="ag-cell-wrapper"]').find('[class="ag-cell-value"]').withText("WL_PB03");
       //POM for checkbox for URL shortname on WebLinksSetup
      
       this.AssureClaims_WebLinksSetup_Screen_Click=Selector('[class="ag-center-cols-clipper"]');
      //POM for clciking on screen for web links setup

      this.AssureClaims_WebLinksSetup_Add_Cancel = Selector('[aria-label="Cancel"]');
      //POM for cancel button in of confirmation popup for web links setup

      this.AssureClaims_WebLinksSetup_Lst_URL_String_Verify = Selector('#ctrl_urlType').find('div').find('div').find('span');
      //POM for checking the URL string is empty or not
    }
}
export default POM_WebLinksSetup;