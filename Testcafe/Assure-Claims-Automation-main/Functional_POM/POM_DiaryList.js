import {Selector,t} from 'testcafe';

class POM_DiaryList{
    constructor(){

        this.AssureClaims_DiaryCreation_Btn_Create = (Selector('#btnCreate'))
        //POM for CreateButton

        this.AssureClaims_DiaryCreation_Txt_TaskName = (Selector('#entryName'))
        //POM for TaskName

        this.AssureClaims_DiaryCreation_Btn_Time = (Selector('#btn_completeDate'))
        //POM for Time

        this.AssureClaims_DiaryCreation_Btn_WorkActivities=Selector('#wrkAct').find('i')
         //POM for search button of WorkActivities
        
        this.AssureClaims_DiaryCreation_Txt_WorkActivities_Activity = (Selector('#editor'))
        //POM for TextEditor of WorkActivities

        this.AssureClaims_DiaryCreation_Btn_Activity_Done = (Selector('#usericon'))
        //POM for ActivityDone

        this.AssureClaims_DiaryCreation_Txt_EstimateTime = (Selector('#estHrs'))
        //POM for estimatedTime
        
        this.AssureClaims_DiaryCreation_Lst_Priority = (Selector('#priority'))
        //POM for priority list

        this.AssureClaims_DiaryCreation_Txt_Notes = (Selector('#entryNotes'))
        //POM for Note text

        this.AssureClaims_DiaryCreation_Chk_AutoNotificationCompleted=(Selector('#autoConfirmNotify'))
        //POM for AutoNotificationCompleted

        this.AssureClaims_DiaryCreation_Chk_AutoNotificationLate=(Selector('#autoLateNotification'))
        //POM for AutoLateNotification

        this.AssureClaims_DiaryCreation_Chk_NotifyByEmail = (Selector('#emailNotify'))
        //POM for NotifyByEmail

        this.AssureClaims_DiaryCreation_Btn_Save = (Selector('#Save').find('i').withText('save')); 
        //POM for saving the Diary Created

        this.AssureClaims_DiaryCreation_Btn_AssignedUser=Selector('#btn_assignedUser')
        //POM for Assigned User Button

        this.AssureClaims_DiaryCreation_Img_UserIcon=Selector('#usericon').find('i')
        //POM for User Icon

        this.AssureClaims_SystemUsers_Txt_Filter=Selector('[class="ui-grid-header-cell ui-grid-clearfix ng-scope ng-isolate-scope ui-grid-coluiGrid-000G"]').find('input')
        //POM for FirstName TextBox

        this.AssureClaims_SystemUsers_Btn_FilterSearch=Selector('[class="ui-grid-header-cell ui-grid-clearfix ng-scope ng-isolate-scope ui-grid-coluiGrid-000G"]').find('[ng-click="grid.appScope.toggleFiltering()"]')
        //POM for Search Button

        this.AssureClaimsApp_SystemUsers_Img_RowSelector=Selector('[ng-click="selectButtonClick(row, $event)"]')
        //POM for Select User

        this.AssureClaims_DiaryCreation_Img_Ok=Selector('#complete').find('i');
        //POM for Click on ok button for creating user

        this.AssureClaimsApp_DiariesPeek_Btn_Peek=Selector('#btnPeek1').find('i');
        //POM for Peek Button

        this.AssureClaims_DiaryCreation_Txt_AvailableUsers=Selector('#lookup_PeekDiary');
        //POM for Available Users

        this.AssureClaims_DiaryCreation_Btn_Peek=Selector('#btnShowDiaries').find('i')
        //POM for Peek Button

        this.AssureClaimsApp_Diaries_Img_DropDown=Selector('#single-button')
        //POM for Click on DropDown Button

        this.AssureClaimsApp_Diaries_Chk_ActiveDiaries=Selector('#chkActiveDiaries')
        //POM for Active Diaries Check Box

        this.AssureClaimsApp_Diaries_Chk_ShowNotes=Selector('#chkShowNotes')
        //POM for ShowNotes 

        this.AssureClaimsApp_Diaries_Txt_TaskName=Selector('#taskName')
        //POM for TaskName Textbox

        this.AssureClaims_SystemUsers_Btn_FilterSearchTaskName=Selector('[class="ui-grid-header-cell ui-grid-clearfix ng-scope ng-isolate-scope ui-grid-coluiGrid-000G"]').find('[ng-click="grid.appScope.toggleFiltering()"]')
        //POM for Search Button

        this.AssureClaimsApp_Diaries_Txt_TaskName=Selector('#taskName')
        //POM for TaskName Textbox
 
        this.AssureClaims_SystemUsers_Btn_FilterSearchTaskName=Selector('[class="ui-grid-header-cell ui-grid-clearfix ng-scope ng-isolate-scope ui-grid-coluiGrid-000G"]').find('[ng-click="grid.appScope.toggleFiltering()"]')
        //POM for Search Button
 
        this.AssureClaims_Diaries_Btn_History=Selector('#btnHistory')
        //POM for History Button
 
        this.AssureClaimsApp_Diaries_Img_RowSelector=Selector('[ng-click="selectButtonClick(row, $event)"]');
        //POM select a Diary row
 
        this.AssureClaims_Diaries_Btn_Complete=Selector('#btnComplete')
        //POM for complete button

        this.AssureClaims_Diaries_Txt_CompletionResponse = Selector('#txtCompleteRes')
        //POM for completionResponse

        this.AssureClaims_Diaries_btn_DiaryDone=Selector('#btnDone')
        //POM for ButtonDone

        this.AssureClaims_Diaries_Txt_Response=Selector('#txtCompleteRes')
        //POM for Completion response textbox
 
        this.AssureClaims_Diaries_Btn_Done=Selector('#btnDone')
        //POM for Done Button

        this.AssureClaims_Diary_History_Lbl_TaskName=Selector('[style="cursor:pointer"]').find('b')
        //POM Taskname lbl on diary history

        this.AssureClaims_DiaryHistory_SelectAllGrid=Selector('[class="ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope"]')
        //POM for selectall Grid

        this.AssureClaims_DiaryHistory_Btn_Cancel=Selector('#btnCancel')
        //POM for Cancle Button On History Grid

        this.AssureClaims_DiaryHistory_Btn_Delete=Selector('#btnDelete')
        //POM for Delete Button On History Grid

        this.AssureClaims_DiariesRoute_Btn_Route=Selector('#btnRoute')
        //POM for Route Button On DiarylistPage

        this.AssureClaims_DiariesRoute_Btn_RouteDiaryTo=Selector('[aria-label="Select box"]')
        //POM for Route DiaryTo 

        this.AssureClaims_GeneralUserIcon_Btn_User=Selector('#usericon')
        //POM for user icon

        this.AssureClaims_DiaryVoid_Btn_Void=Selector('#btnVoid')
        //POM for BtnVoid On Toolbar
        this.AssureClaims_DiaryVoid_Btn_VoidDiary=Selector('#btnVoid').find('block')

        this.AssureClaim_DiaryVoid_Chk_VoidSelectedDiary=Selector('#chkIsvoidByDate')
        //POM For VoidSelectedDiary

         this.AssureClaim_DiaryVoid_Txt_VoidFromDate=Selector('#txtVoidFromDate')
        //POM For VoidFromDtae

         this.AssureClaim_DiaryVoid_Txt_VoidToDate=Selector('#txtvoidToDate')
        //POM For VoidToDate

        this.AssureClaim_DiaryRoll_Btn_Roll=Selector('#btnRoll')
        //POM for DiaryRoll On DiaryList

        this.AssureClaims_DiaryRoll_Txt_RollDateTo=Selector('[style="display: table;"]').find('input')
        //POM for DiaryRollDate

        //this.AssureClaims_DiaryRoll_Txt_RollDiaryTo=Selector('[class="select2-input ui-select-search ng-valid ng-dirty ng-touched ng-empty"]').find('input')
        this.AssureClaimsApp_Diary_Lbl_ApprovalTaskname=Selector('[class="ng-cell-text "]').find('b')

        this.AssureClaimsApp_Diary_Lnk_AttachRecord=Selector('[style="cursor:pointer"]').find('span')

        this.AssureClaims_Diary_Txt_NoRecordAvailable=Selector('[ng-show="gridVM.noRecords"]').find('p')
        //POM for text No Record Available
        
        //Oshi's code :RMA-84961
		
        this.AssureClaims_SystemUsers_Btn_FilterSearchTaskName1=Selector('[class="ui-grid-filter-container ng-scope"]').nth(3).find('[class="glyphicon glyphicon-search searchFilterIcon "]');
        //POM for Search Button
		
	 this.AssureClaims_Diary_Btn_AssignToMeDiary = Selector("#btnAssignToMe").find("i");
         // POM for Assign to me diary
		 
         this.AssureClaims_Diary_Btn_Home = Selector("#btnHome").find("i");
         // Pom for Home button
		

}
}
export default POM_DiaryList;
