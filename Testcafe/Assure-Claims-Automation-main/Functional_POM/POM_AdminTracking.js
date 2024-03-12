import {Selector,t} from 'testcafe';
class POM_AdminTracking {
    // Tushar's Code : RMA-102144
    async AssureClaims_AdminTracking_Lnk_TableName(sTableName) {
        return Selector(`#id_${sTableName}`);
    }
    
    constructor(){
 
    this.AssureClaims_CertTracking_Txt_JobNumber = Selector('#job_no_text');
    //POM for Job Number on Certificate Tracking Page

    this.AssureClaims_CertTracking_Txt_AgencyName = Selector('#agency_name_text');
    //POM for Agency Name on Certificate Tracking Page   
        
     //Muskan's Code : RMA-104755 starts here

    this.AssureClaims_AdminTracking_Btn_Add=Selector('#crudGrid_toolbar_add_button')
    //POM for add button over administrative tracking page

    this.AssureClaims_AdminTracking_Btn_FieldType=Selector('#ctrl_selectedfieldType')
    //POM for field type over administrative tracking page

    this.AssureClaims_AdminTracking_Txt_UserPrompt=Selector('#ctrl_userPrompt')
    //POM for User Prompt Textbox over administrative tracking page

    this.AssureClaims_AdminTracking_Txt_SystemFieldName=Selector('#ctrl_sysFieldName')
    //POM for System Field Name over administrative tracking page

    this.AssureClaims_AdminTracking_Chk_Required=Selector('#ctrl_required-input')
    //POM for Required check box over administrative tracking page

    this.AssureClaims_AdminTracking_Chk_LookupField=Selector('#ctrl_lookupFlag-input')
    //POM for Lookup Field check box over administrative tracking page

    this.AssureClaims_AdminTracking_Chk_IsSearchable=Selector('#ctrl_chkBoxSearchable-input')
    //POM for Is Searchable check box over administrative tracking page

    this.AssureClaims_AdminTracking_Lst_AdminTrackingTable=Selector('#ctrl_adminTrackTableName')
    //POM for Admin Tracking Table over administrative tracking page

    this.AssureClaims_AdminTracking_Lst_CodeFile=Selector('#ctrl_codeFileId')
    //POM for code file list over administrative tracking page

    this.AssureClaims_AdminTracking_Txt_GridTextBox=Selector('[name="ctrl_gridLookupField1"]')
    //POM for Grid Fields text box over administrative tracking page

    this.AssureClaims_AdminTracking_Btn_ArrowButtnoOverSupplementalHistoryGrid=Selector('[class="mat-select-arrow mat-select-padding"]')
    //POM for Supplemental History Grid arrow button over administrative tracking page

    this.AssureClaims_AdminTracking_Chk_FieldNameOverSupplementalHistoryGrid=Selector('[ref="eInput"]')
    //POM for Supplemental History Grid field name check box over administrative tracking page

    this.AssureClaims_AdminTracking_Btn_OkButtonOverSupplementalHistoryGrid =Selector('#rowdone_button')
    //POM for Supplemental History Grid ok button over administrative tracking page

    this.AssureClaims_AdminTracking_Chk_ConfigureHTMLText =Selector('#ctrl_chkhtmltextconfig')
    //POM for Configure HTML Text check box over administrative tracking page

    this.AssureClaims_AdminTracking_Lst_InputFormat =Selector('#ctrl_ddInputformat')
    //POM for Input Format list over administrative tracking page

    this.AssureClaims_AdminTracking_Txt_Size=Selector('#ctrl_size')
    //POM for size text box over administrative tracking page

    this.AssureClaims_AdminTracking_Chk_MultiSelect =Selector('#ctrl_multiSelect-input')
    //POM for Multi Select check box over administrative tracking page

    this.AssureClaims_AdminTracking_Lst_UsersOrGroups=Selector('#ctrl_ddUsersGroups')
    //POM for Users/Groups over administrative tracking page

    this.AssureClaims_AdminTracking_Btn_SaveBtn=Selector('#toolbar_save_button')
    //POM for save button over administrative tracking page

    this.AssureClaims_AdminTracking_Chk_CheckBox=Selector('#crudCellGrid')
    //POM for checkbox over Administrative Tracking Page
    
    this.AssureClaims_AdminTracking_Btn_EditButton=Selector('#crudGrid_toolbar_edit_button')
    //POM for edit button over Administrative Tracking Page
      
    // Tushar's Code : RMA-102144     
    
    this.AssureClaims_AdminTracking_Btn_AddTable = Selector('#supplementalfield_add_button')
    //POM for Adding Table on Admin Tracking Page   

    this.AssureClaims_AdminTracking_Txt_UserTableName = Selector('#userTableName')
    //POM for User Table Name input field on Admin Tracking Page   

    this.AssureClaims_AdminTracking_Txt_SystemTableName = Selector('#sysTableName')
    //POM for Syetem Table Name input field on Admin Tracking Page   

    this.AssureClaims_AdminTracking_Chk_AllowSoftDelete = Selector('#allowSoftDelete-input')
    //POM for Checkbox for Allow Soft Delete on Admin Tracking Page  
   
    this.AssureClaims_AdminTracking_Txt_ListSearch = Selector('#listSearch')
    //POM for List Search input field on Admin Tracking Page

    this.AssureClaims_AdminTracking_Txt_ListViewSearch = Selector('#listviewsearch')
    //POM for List View Search input field on Maintenance Admin Tracking Page

     this.AssureClaims_AdminTracking_Btn_Save=Selector('#admintables_save_button')
    //POM for save button for Table Creation in Admin Tracking page
        
    // Tushar's Code : RMA-102154
        
     this.AssureClaims_AdminTracking_Btn_Reload=Selector('#crudGrid_toolbar_reload_button')
    //POM for Reload button for Table Fields in Admin Tracking page

     this.AssureClaims_AdminTracking_Btn_UpdateViews=Selector('#crudGrid_toolbar_refresh_button')
    //POM for Update Views button for Table Fields in Admin Tracking page

     this.AssureClaims_AdminTracking_Btn_AddFields=Selector('#fields')
    //POM for Add Fields button for Table Admin Tracking page
        
    // Tushar's Code : RMA-102177
        
     this.AssureClaims_AdminTracking_Chk_UsrCheckbox = Selector('#syscheckbox_flag')
    //POM for Checkbox in Admin Tracking Record Creation

    this.AssureClaims_AdminTracking_Btn_SaveRecord = Selector('#Save')
    //POM for Save Record in Admin Tracking Record Creation

    this.AssureClaims_AdminTracking_Chk_UsrCurrency = Selector('#syscurrency_amt')
    //POM for Checkbox in Admin Tracking Record Creation

    this.AssureClaims_AdminTracking_Txt_UsrDate = Selector('#sysdate_date')
    //POM for Date in Admin Tracking Record Creation

    this.AssureClaims_AdminTracking_Btn_UsrcodeLookup = Selector('#btn_syscode_code_openlookup')
    //POM for Code Lookup in Admin Tracking Record Creation

    this.AssureClaims_AdminTracking_Txt_UsrEmail = Selector('#sysemail_email')
    //POM for Email in Admin Tracking Record Creation

    this.AssureClaims_AdminTracking_Btn_UsrClaimNumberSearch = Selector('#btn_sysclaimnum_text')
    //POM for Claim Number Search in Admin Tracking Record Creation

    this.AssureClaims_AdminTracking_Btn_ToolBarButtonDiary = Selector('#Diary')
    //POM for Diary Button in Admin Tracking Record Page

    this.AssureClaims_AdminTracking_Chk_ToolBarButtonViewRecordDiaries = Selector('[id="View Record Diaries"]')
    //POM for View Record Diaries Button in Admin Tracking Record Page

    this.AssureClaims_AdminTracking_Lnk_SearchedDiaryName = Selector('[class="ngCellText ui-grid-cell-contents ui-grid-cell-contents-wrap ng-scope"]').find('span').find('span').find('b')
    //POM for Searched Diary Name Link in Admin Tracking Record Page

    this.AssureClaims_AdminTracking_Btn_CloseViewRecordDiary = Selector('#P1').nth(1)
    //POM for Close View Record Diary Button in Admin Tracking Record Page
    
    this.AssureClaims_AdminTracking_Btn_ToolBarButtonRecordSummary = Selector('[id="Record Summary"]')
    //POM Record Summary Button in Admin Tracking Record Page
    
    this.AssureClaims_AdminTracking_Val_TableNameHeading = Selector("#printarea").find('span')
    //POM for Table Name Heading in Record Summary in Admin Tracking Record Creation
    
    this.AssureClaims_AdminTracking_Btn_CancelViewRecordSummary = Selector('[aria-label="Cancel"]')
    //POM for Cancel View Record Summary Button in Admin Tracking Record Page
    
    this.AssureClaims_AdminTracking_Chk_ToolBarButtonSupplementalGrid = Selector('[aria-label="Supplemental Grid"]').find("i")
    //POM Supplemental Grid Button in Admin Tracking Record Page
    
    this.AssureClaims_AdminTracking_Btn_ToolBarButtonLookup = Selector('[aria-label="Lookup"]').nth(0)
    //POM Supplemental Grid Button in Admin Tracking Record Page
    
    this.AssureClaims_AdminTracking_Btn_SupplementalGridDone = Selector('#btnRouteCancel').find('i')
    //POM for Supplemental Grid Done Button in Admin Tracking Record Page

    this.AssureClaims_AdminTracking_Txt_LookupSearchClaimNumber = Selector('[class="ui-grid-filter-container ng-scope"]').find('input')
    //POM for Search Claim Number in Lookup in Admin Tracking Record Page

    this.AssureClaims_AdminTracking_Lnk_SearchedClaimNumber = Selector('[class="ui-grid-cell-contents ng-scope"]').find('a')
    //POM for Searchd Claim Number Link in Lookup in Admin Tracking Record Page

    this.AssureClaims_AdminTracking_Txt_GoToRecord = Selector("#recordid")
    //POM for Go To Record in Admin Tracking Record Page
    
    //Tushar's Code : RMA-102178
          
    this.AssureClaims_AdminTracking_Btn_SourceField = Selector("#ctrl_sourceField")
    //POM for Source Field in Admin Tracking Field Creation Page

    this.AssureClaims_AdminTracking_Txt_CodeOrEntities = Selector('[name="ctrl_codeLookupField1"]')
    //POM for Code/Entities in Admin Tracking Field Creation Page
        
    this.AssureClaims_AdminTracking_Chk_GroupAssociatedCheckBox = Selector('[aria-label="GroupAssociatedCheckbox"]')
    //POM for Code/Entities in Admin Tracking Field Creation Page

    this.AssureClaims_AdminTracking_Btn_DeleteTableOKButton=Selector('[id="confirm-dialog-confirmbtn"]')
    //POM for Add Fields button for Table Admin Tracking page

    this.AssureClaims_AdminTracking_Lnk_GroupAssociationOption=Selector('[class="btn-simple"]')
    //POM for Selection of Link in Group Association Lookup Field
    
    this.AssureClaims_AdminTracking_Btn_DeleteTable=Selector('#admintable')
    //POM for Add Fields button for Table Admin Tracking page
        
    // Tushar's Code : RMA-107094
    this.AssureClaims_AdminTracking_Btn_CardView=Selector('#supplementallistviewgrid_toolbar_ChangeView_button')
    //POM for Card View Button in Admin Tracking page
        
}
};
export default  POM_AdminTracking;
