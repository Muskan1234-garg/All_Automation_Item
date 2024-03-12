import {Selector,t} from 'testcafe';

class POM_DiaryUtilities{
    constructor(){

       this.AssureClaims_DiaryUtilities_Lst_FromOwner= (Selector('#fromUser'))
        //POM for FromOwner

        this.AssureClaims_DiaryUtilities_Lst_FromOwnerDropdown = (Selector('#fromUser-panel'))
        //POM for FromOwner dropdown

         this.AssureClaims_DiaryUtilities_Lst_ToOwner = (Selector('#toUser'))
         //POM for ToOwner
        
         this.AssureClaims_DiaryUtilities_Lst_ToOwnerDropdown = (Selector('#toUser-panel'))
         //POM for ToOwner Dropdown

        this.AssureClaims_DiaryUtilities_Txt_From = (Selector('#from'))
        //POM for FromDate

        this.AssureClaims_DiaryUtilities_Txt_To = (Selector('#to'))
        //POM for ToDate

        this.AssureClaims_Utility_Btn_GoTransfer = (Selector('#btnGoTransfer'))
        //POM for TransferButton

        this.AssureClaims_TaskName_DiaryVerification = (Selector('#taskName'))
        //POM for  TaskName

        this.AssureClaims_SystemUsers_Btn_FilterSearchTaskName = Selector('[class="ui-grid-header-cell ui-grid-clearfix ng-scope ng-isolate-scope ui-grid-coluiGrid-000G"]').find('[ng-click="grid.appScope.toggleFiltering()"]')
        //POM for Search Button
           
        this.AssureClaims_DiaryUtilities_Tab_PurgeDiary= (Selector('#lbl_diaryOwner'))
        //POM for Purge Diary Tab
 
       this.AssureClaims_DiaryUtilities_Lst_PurgeDiaryOwner = Selector('#purgeDiary');
       //POM for Diary Owner

       this.AssureClaims_DiaryUtilities_Txt_PurgeFromDate = (Selector("#purgeFromDate"))
       //Pom for From Date

       this.AssureClaims_DiaryUtilities_Txt_PurgeToDate = (Selector('#purgeToDate'))
        //POM for To Date
        
       this.AssureClaims_DiaryUtilities_Btn_Purge = (Selector('#btnGoPurge'))
         //POM for Purge Button

       this.AssureClaimsApp_DiaryUtilities_Chk_PurgeOpenDiary=Selector('#purgeOpenDiary-input')
       //POM for Open Diary Check Box

       this.AssureClaimsApp_DiaryUtilities_Chk_PurgeCloseDiary=Selector('#purgeCloseDiary-input')
        //POM for Close Diary Check Box


}};
export default POM_DiaryUtilities;
