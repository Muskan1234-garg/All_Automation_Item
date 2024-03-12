import { Selector, t } from "testcafe";
class POM_AttachCreateDiary {
  constructor() {
    this.AssureClaims_AttachCreate_Diary_Tab_Diary = Selector(
      '[name = "Diary"]'
    ).find("i");
    // POM for Tab Diary Icon Tab which present on Claims Screen

    // this.AssureClaims_AttachCreate_Diary_Btn_AssignedUserTo = Selector(
    //   '[name = "btn_assignedUser"]'
    // ).find(".glyphicon.glyphicon-option-horizontal");
    // POM for Diary Assigned Users to

    this.AssureClaims_AttachCreate_Diary_Txt_TaskName = Selector("#entryName");
    //POM for Diary Task Name

    this.AssureClaims_AttachCreate_Diary_Txt_DueDate = Selector(
      "#completeDate"
    );
    //POM for Diary Due Date

    this.AssureClaims_AttachCreate_DiaryCreation_Btn_Time = Selector(
      "#btn_completeDate"
    );
    //POM for Time

    this.AssureClaims_AttachCreate_DiaryCreation_Btn_WorkActivities = Selector(
      "#wrkAct"
    ).find("i");
    //POM for search button of WorkActivities

    this.AssureClaims_AttachCreate_Diary_Lst_Activity = Selector("#sel12");
    // POM for select LAst activity on diary

    this.AssureClaims_AttachCreate_Diary_Txt_WorkActivitiesNotes = Selector("#editor");
    //POM for TextEditor of WorkActivities

    this.AssureClaims_AttachCreate_Diary_Btn_WorkActivitiesOK = Selector(
      "#usericon"
    );
    //POM for ActivityDone

    this.AssureClaims_AttachCreate_Diary_Txt_EstimatedHours = Selector(
      "#estHrs"
    );
    //POM for estimatedTime

    this.AssureClaims_AttachCreate_Diary_Lst_Priority = Selector("#priority");
    //POM for priority list

    this.AssureClaims_AttachCreate_DiaryCreation_Txt_Notes = Selector(
      "#entryNotes"
    );
    //POM for Note text

    this.AssureClaims_AttachCreate_Diary_Chk_AutoNotificationCompleted = Selector(
      "#autoConfirmNotify"
    );
    //POM for Automatic Notification when Completed

    this.AssureClaims_AttachCreate_DiaryCreation_Chk_AutoNotificationLate = Selector(
      "#autoLateNotification"
    );
    //POM for AutoLateNotification

    this.AssureClaims_AttachCreate_DiaryCreation_Chk_NotifyByEmail = Selector(
      "#emailNotify"
    );
    //POM for NotifyByEmail

    // this.AssureClaims_AttachCreate_Diary_Tab_Supplementals = Selector(
    //   '[role = "tab"]'
    // ).find("span");
    // // POM for Tab Supplements

    this.AssureClaims_AttachCreate_DiaryCreation_Btn_Save = Selector("#Save")
      .find("i")
      .withText("save");
    //POM for saving the Diary Created

    this.AssureClaims_AttachCreate_DiaryCreation_Btn_Cancel = Selector(
      '[class="lg-modal-rm hidden-sm hidden-xs glyphicon glyphicon-remove modalcloseBtn"]'
    );
    //POM for cancel btn

    this.AssureClaims_AttachCreate_ViewDiary_Btn = Selector(
      '[name="View Record Diaries"]'
    ).find("i");
    //POM for view record dairy

    this.AssureClaims_AttachCreate_txt = Selector("#taskName");
    //POM for write taskname search

    this.AssureClaims_AttachCreate_Btn_TaskNameSearch = Selector(
      '[class="ui-grid-filter-container ng-scope"]'
    ).find('[class="glyphicon glyphicon-search searchFilterIcon "]');
    //POM for select Search Taskname

    this.AssureClaims_AttachCreate_Btn_SelectTaskName = Selector(
      '[class="ui-grid-cell-contents ui-grid-cell-focus"]'
    );
    //POM for select row of taskname

    this.AssureClaims_AttachCreate_Btn_EditDiary = Selector("#btnEdit").find(
      "i"
    );
    // POM for edit exsisting diary

    this.AssureClaims_AttachCreate_Btn_SelectGrid = Selector('[ng-click = "selectButtonClick(row, $event)"]'
    );
    //POM for select grid
    this.AssureClaims_AttachCreate_EditTaskName_Label = Selector('[role="link"]').find('b');

    this.AssureClaims_AttachCreate_Btn_Complete = Selector('[ng-click="completeDiaries($event)"]').find('i');
    //POM for complete dairy btn

    this.AssureClaims_AttachCreate_Btn_DairyDone = Selector('#btnDone').find('i')
    //POM for done dairy

    this.AssureClaims_AttachCreate_Txt_NoRecordAvailable=Selector('[ng-show="gridVM.noRecords"]').find('p')
    //POM for text No Record Available
  }
}
export default POM_AttachCreateDiary;
