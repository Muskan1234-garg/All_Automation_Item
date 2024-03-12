import {Selector,t} from 'testcafe';

class POM_QueryDesigner{
    constructor(){


        this.AssureClaims_QD_Btn_AddBtn = Selector('#querydesigner_add_button');
        //POM of Add button On query designer page

        this.AssureClaims_QDBasicInfo_Txt_SearchName = Selector('#searchName');
        //POM of "What do you want to call your search?" text box On query designer Basic Information page

        this.AssureClaims_QDBasicInfo_Txt_SearchDescription = Selector('#searchDescription');
        //POM of "What is the description of your search? (Optional)" text box On query designer Basic Information page

        this.AssureClaims_QDBasicInfo_Lst_TypeOfSearch = Selector('#searchType');
        //POM of "What type of search do you want to create?" dropdown On query designer Basic Information page

        this.AssureClaims_QDBasicInfo_Btn_NextBtn = Selector('#querydesignerwizard_btnNext_button');
        //POM of Next button On query designer Basic Information page

        this.AssureClaims_QDFieldSelection_Lst_FieldsAvailableForSearch= Selector('#availableSearchId');
        //POM of "Fields Available for Search" dropdown  On  query designer Field Selection page

        this.AssureClaims_QD_Lst_SelectValuesFromSearch = Selector('#bootstrap-duallistbox-nonselected-list_1');
        //POM of select values from search On Property query designer page

        this.AssureClaims_QDFieldSelection_Btn_NextBtn = Selector('#querydesignerwizard_btnNext2_button');
        //POM of Next button On query designer Field Selection page

        this.AssureClaims_QDFieldSelection_Btn_UpBtn = Selector('#querydesignerwizardarrow_upward_button');
        //POM of Up button On query designer Field Selection page

        this.AssureClaims_QDFieldSelection_Btn_DownBtn = Selector('#querydesignerwizardarrow_downward_button');
        //POM of Down button On query designer Field Selection page

        this.AssureClaims_QDFieldSelection_Btn_StarBtn = Selector('#querydesignerwizard_star_button');
        //POM of Star button On query designer Field Selection page

        this.AssureClaims_QDDisplayField_Lst_FieldsAvailableForDisplaySearch= Selector('#displaySearchId');
        //POM of "Fields Available for display Search" dropdown  On  query designer display Field page

        this.AssureClaims_QDDisplayField_Btn_NextBtn= Selector('#querydesignerwizard_nextbtn_button');
        //POM of next button On query designer display Field page

        this.AssureClaims_QDPermissions_Lst_SelectUsers = Selector('#userGroup');
        //POM of "Select Users and/or Groups" dropdown On  query designer permissions page

        this.AssureClaims_QDPermissionsSelectedUsersAndGroups_Btn_UsersTab = Selector('[class="mat-ripple mat-mdc-tab-ripple"]');
        //POM of Users tab On query designer permissions Selected Users and Groups page

        this.AssureClaims_QDPermissionSelectedUsersAndGroupss_Btn_DoneBtn = Selector('#rowdone_button');
        //POM of done button On query designer permissions Selected Users and Groups page

        this.AssureClaims_QDPermissionSelectedUsersAndGroupss_Chk_SelectUser = Selector('[ref="eCheckbox"]');
        //POM of select user check box On query designer permissions Selected Users and Groups page

        this.AssureClaims_QDPermissions_Btn_FinishButton= Selector('#querydesignerwizard_btnfinish_button');
        //POM of finish button On query designer permissions page

        this.AssureClaims_QD_Chk_QDRecord=Selector('[class="ag-selection-checkbox"]')
        //POM of check box  On query designer page

        this.AssureClaims_QD_Btn_CloneQD=Selector('#querydesignerlistviewgrid_toolbar_Clone_button')
        //POM of clone button On query designer page

        this.AssureClaims_QD_Txt_CloneSearchName=Selector('#cloneSearchName')
        //POM of "What do you want to call your search?" text box On query designer page

        this.AssureClaims_QDCloneSearch_Btn_SaveButton=Selector('#querydesigner_save_button')
        //POM of save button On query designer Clone Search page

        this.AssureClaims_QD_Btn_DeleteQD=Selector('#querydesignerlistviewgrid_toolbar_Delete_button')
        //POM of delete button On query designer page

        this.AssureClaims_QDAdministrativeTrackingTableSelection_Lst_AdministrativeTrackingTableQD=Selector('#adminTableType')
        //POM of Administrative Tracking Table Selection dropdown On query designer Administrative Tracking Table Selection page

        this.AssureClaims_QDAdministrativeTrackingTableSelection_Btn_NextBtn=Selector('#querydesignerwizard_btnNext1_button')
        //POM of next btn On query designer Administrative Tracking Table Selection page

        this.AssureClaims_QD_Btn_ListView=Selector('#supplemental_gridon_button')
        //POM for list view button on query designer page
      

    }};
    export default POM_QueryDesigner;