import { Selector } from 'testcafe';

class POM_Home {
    async AssureClaims_Generic_CustomTagSelector(tagName){
        return Selector(tagName)
    }
    constructor() {

        this.AssureClaims_VerifyUXSpinnerDisappered = Selector('#btnRoll').find('i');
        //POM for OK Button

        this.AssureClaims_DefaultView_Img_Reload = Selector('#dvbreadcrumbscroll').find('i').withText('replay');
        //POM For Reload Button On Top Of The Application Screen

        this.AssureClaims_DefaultView_Img_Close = Selector('#dvbreadcrumbscroll').find('i').withText('clear');
        //POM for Close Button On Top Of the Application Screen

        this.AssureClaims_DefaultView_Lbl_BreadcrumbName = Selector('#dvbreadcrumb');
        //POM for BreadCrumb Name in RMA Application

        this.AssureClaims_Generic_Img_Save = Selector('#Save');
        //POM for Save Button On Every Pages ThroughOut Application

        this.AssureClaims_Generic_DescriptionTextboxOnLookup = Selector('#priority').nth(1);
        //POM for Description Search Textbox On all Lookups Windows

        this.AssureClaims_Generic_DescriptionSearchIconOnLookup = Selector('[class="glyphicon glyphicon-search searchFilterIcon "]').nth(1);
        //POM for Description Search Button On all Lookup Windows

        this.AssureClaims_Generic_Img_DeleteRecord = Selector('[id="Delete Record"]').find('i');
        //POM for Generic Delete Button On Every Page Throughout Application

        this.AssureClaims_Generic_Img_DeleteOK = Selector('#btnRoll').find('i');
        //POM for OK Button On Delete PopUp

        this.AssureClaims_Generic_Img_DeleteCancel = Selector('#btnCancel').find('i');
        //POM for Cancel Button On Delete PopUp

        this.AssureClaims_Generic_Msg_ToastMessage = Selector('[class="toast-message"]');
        //POM for Toast Message Bar On Application Pages

        this.AssureClaims_GenericBtn_ErrorToastMsgClose = Selector('[class="toast-close-button ng-scope"]');
        //POM for Toast Message Close Button On application Pages

        this.AssureClaims_GenericBtn_Back = Selector('[uib-tooltip="Back"]').withText('reply');
        //POM for Back Button On Top  Of the Page

        this.AssureClaims_Generic_Img_Save_Config = Selector('#SAVE');
        //POM for Save Button On Every Pages ThroughOut Application

        this.AssureClaims_Generic_Msg_ToastMessage_Config = Selector('#toast-container > div > div');
        //POM for Toast Message Bar On Application Pages

        this.AssureClaims_GenericBtn_ErrorToastMsgClose1 = Selector('#toast-container > div > div');
        //POM for Toast Message Close Button On application Pages

        this.AssureClaims_Generic_ErrorMesg_ToastMessage = Selector('[class="toast toast-error"]');
        //POM Error mesg

        this.AssureClaims_Btn_HomeOfUtilities = Selector('[id="homebtn"]');
        //POM for Home Button On Utilities application Page

        //WorkFlow Code
        this.AssureClaims_Generic_Msg_ToastMessage27 = Selector('#toast-container > div > div');

        // Muskan's Code : RMA-95414	
        this.AssureClaims_Generic_Row_SelectAndCheckRowExist = Selector('[ng-click="selectButtonClick(row, $event)"]')
        //POM for any row

        //Muskan's Code : RMA-94583
        this.AssureClaims_Generic_Btn_LookupBtnOnGeneralClaimPage = (Selector('[class="dropdown"]'))
        //POM for clicking comment option from the tool bar

        //Muskan's Code : RMA-94580 
        this.AssureClaims_Generic_Btn_SelectAllGrid = Selector('[ng-click="headerButtonClick($event)"]')
        //POM for select complete grid

         //Sai's Code : RMA-96706
        this.AssureClaims_Generic_Btn_CloseFromLeft = Selector('[uib-tooltip="Close"]')
        //POM for select Close
        
        
        //================================Muskan's Code : RMA-99702 started here================================================================
      
        this.AssureClaims_Generic_Txt_VerifyNoRecordsAvalText=Selector('[ng-show="gridVM.noRecords"]').find('p')
        //POM for text No records available
      
        //================================Muskan's Code : RMA-99702 ended here================================================================
        
        //================================Muskan's Code : RMA-97293 started here================================================================

        this.AssureClaims_GerericTabs_Tab_Accordians = Selector('[role="button"]').find('span')
        //POM for all accordians over the application

        this.AssureClaims_GenericLnk_Lnk_LnkforSelectValueFromLookUp = (Selector('[class="ui-grid-cell-contents ng-scope"]').find('span'));
        //POM for generic link to select from lookup 

        this.AssureClaims_GenericTxt_Txt_DescriptionTextboxOnLookup = Selector('#priority');
        //POM for Description Search Textbox On all Lookups Windows

        this.AssureClaims_GenericBtn_Btn_DescriptionSearchIconOnLookup = Selector('[class="glyphicon glyphicon-search searchFilterIcon "]');
        //POM for Description Search Button On all Lookup Window

        this.AssureClaims_GenericBtn_Btn_AddPersonInvolved = Selector('[aria-label="Add Persons Inv."]')
        //POM for person involved link 

        //================================Muskan's Code : RMA-97293 ended here================================================================
        //==========================================RMA-99791 Mellisa Address Auto Complete and Address Verification Code Starts=========================================================================================
        this.AssureClaims_Melissa_Btn_VerficationOK = (Selector('[ng-click="vm.save()"]'));
        //POM For click Ok Botton on Melissa Address Verification

        this.AssureClaims_Melissa_Btn_SuggestedAddress = Selector('#suggAdd');
        //POM For click Suggested Address on Melissa Address Verification PopUp
        //==========================================RMA-99791 Mellisa Address Auto Complete and Address Verification Code Ends=========================================================================================    
        
        // Tushar's Code : RMA-107091
        this.AssureClaims_Row_NoRowsDisplayed = Selector('[ng-if="grid.renderContainers.body.visibleRowCache.length !== grid.rows.length"]')
        // POM for "Show Items = val" in Select Check to Print page

        this.AssureClaims_Generic_Error_ToastMessage = Selector('#toast-container').find('div').find('[role="alert"]');
        //POM Error mesg

    }
}; export default POM_Home;
