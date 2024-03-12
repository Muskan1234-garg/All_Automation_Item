
import { Selector } from 'testcafe';

class POM_WorkLossRestriction {
  constructor() {
    this.AssureClaims_FromToDate_Btn_done = Selector('#btnRoll').find('i');
    //FromToDate confirm btn

    this.AssureClaims_FromToDate_Btn_cancel = Selector('#btnCancel').find('i');
    //FromToDate confirm btn

    this.AssureClaims_FromToDate_Btn_FromDate = Selector('#fromDate');
    //From Date input box

    this.AssureClaims_FromToDate_Btn_ToDate = Selector('#toDate');
    //From To input box

    this.AssureClaims_FromToDate_Toast_verify = Selector('#toast-container');
    //Toast msg for From To Date

    this.AssureClaims_FromToDate_Btn_Close = Selector('[ng-click="close(true, $event)"]');
    //Toast msg close 

    this.AssureClaims_MedicalInfo_Tab = Selector('#medicalinfo_tab').find('span').withText("Medical Info")
    //Medical info Tab

    this.AssureClaims_FromToDate_Btn_WorkLoss = Selector('[aria-label="Work Loss"]');
    // btn for work loss

    this.AssureClaims_FromToDate_Btn_Restrictions = Selector('[aria-label="Restrictions"]');
    //btn for "Restrictions"

    this.AssureClaims_FromToDate_Lnk_PI = Selector("#associated-pi").find("span");
    // lnk for person involve

    this.AssureClaims_FromToDate_Btn_PiWorkLoss = Selector("#WorkLoss").find("i");
    //Btn for work loss in person involved screen 

    this.AssureClaims_FromToDate_Btn_PiRestricted = Selector("#Restriction").find("i");
    //Btn for restriction in person involved screen

    this.AssureClaims_FromToDate_Lnk_Claim = Selector("#associated-claim").find("span");
    // lnk for associated claim

    this.AssureClaims_FromToDate_Icon_Split = Selector("#Delete");
    //delete the transaction split

    this.AssureClaims_FromToDate_Icon_3dots = Selector('[aria-label="View All Persons Inv."]');
    //icon for child node open

    this.AssureClaims_FromToDate_Icon_3dots_Claim = Selector('[aria-label="View All Claims"]');
    //icon for child node open

    this.AssureClaims_FromToDate_Lnk_PIClaim = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //lnk for click pi 

    this.AssureClaims_FromToDate_Btn_DeleteIcon = Selector("#deleteIcon").find("i");
    //Btn for delete 

    this.AssureClaims_FromToDate_Btn_VoidFlag = Selector("#voidflag");
    //checkbox of void flag

    this.AssureClaims_FromToDate_Lnk_Transaction = Selector('[class="ui-grid-cell ng-scope ui-grid-coluiGrid-000D"]').find('span')
    //lnk for transaction


    this.AssureClaims_FromToDate_ControlNumber = Selector('#ctlnumber');
    //generated control number

    this.AssureClaims_FromToDate_Txt_ControlNumer = Selector('#controlNumber');
    //Contol number txtbox.

    this.AssureClaims_FromToDate_Btn_Search = Selector('[class="glyphicon glyphicon-search searchFilterIcon "]');
    //search btn

    //Start POM for Case Management

    this.AssureClaims_CaseMgmt_Tab_CaseMgtRtW = (Selector('[role="button"]').find('span').withText('Case Mgt/RTW'))
    //POM for To Select Case Mgt/RTW  Accordion on Case Management Screen

    this.AssureClaims_CaseMgmt_Btn_Workloss = Selector('[class="material-icons mdi mdi-trending-down"]')
    //POM for Click on Workloss button on Case Management Screen

    this.AssureClaims_CaseMgmt_Btn_Restriction = Selector('[class="material-icons mdi mdi-alert"]')
    //POM for Click on Restriction button on Case Management Screen

    this.AssureClaims_CaseMgmt_Txt_LastWorkDay = Selector('[role="button"]').withText('Last Work Day').find('input')
    //Button for Last Work day TextBox

    this.AssureClaims_CaseMgmt_Txt_ReturnToWork = Selector('[role="button"]').withText('Return To Work').find('input')
    //Button for Return To Work TextBox

    this.AssureClaims_CaseMgmt_VerifyText = Selector('[class="ui-grid-footer-info ui-grid-grid-footer ng-scope"]').find('span')
    //POM for Verify Text

    this.AssureClaims_CaseMgmt_Btn_Close = Selector('[class="panel-primary"]').find('span').withAttribute('aria-label', 'Close')
    //POM for Close Button

    this.AssureClaims_OpenAddedPersonInvolved = Selector('#associated-pi').find('span')
    //POM for Click on Added PI

    this.AssureClaims_EventScreen_Btn_Workloss = Selector('[class="material-icons mdi mdi-trending-down"]')
    //POM for Workloss button on Event Screen

    this.AssureClaims_EventScreen_Btn_Restriction = Selector('[class="material-icons mdi mdi-alert"]')
    //POM for Restriction button on Event Screen

    this.AssureClaims_FromToDate_Btn_AddPIWorkloss = Selector("#addicon");
    //add btn

    this.AssureClaims_FromToDate_Btn_Calculate_Duration = Selector('[aria-label="Calculate Durations"]');
    // calculate duration btn

    this.AssureClaims_FromToDate_Txt_datelastworked = Selector("#datelastworked");
    //Textbox for datelastworked

    this.AssureClaims_FromToDate_Txt_datereturned = Selector("#datereturned");
    //Textbox for datereturned

    this.AssureClaims_FromToDate_Txt_datefirstrestrct = Selector("#datefirstrestrct");
    //Textbox for datelastworked

    this.AssureClaims_FromToDate_Txt_datelastrestrct = Selector("#datelastrestrct");
    //Textbox for datereturned

    this.AssureClaims_FromToDate_Txt_duration = Selector("#duration");
    //Textbox for duration

    this.AssureClaims_FromToDate_Txt_stat_dur = Selector("#stat_dur");
    // txt on workloass popup stat_dur

    this.AssureClaims_FromToDate_Txt_stat_dur1 = Selector("#stat_dur1");
    //txt value for workloss stat_dur1

    this.AssureClaims_FromToDate_tot_dur = Selector("#tot_dur");
    //txt header for workloss tot_dur

    this.AssureClaims_FromToDate_txt_tot_dur = Selector("#tot_dur1");
    //txt value for workloss tot_dur1

    this.AssureClaims_FromToDate_Restot_dur = Selector("#tot_res");
    //txt header for workloss restot_dur

    this.AssureClaims_FromToDate_Restot_dur1 = Selector("#tot_res1");
    //txt header for workloss restot_dur

    this.AssureClaims_FromToDate_Txt_FilterLastWorkDay = Selector('[class="ui-grid-filter-container ng-scope"]').find('input');
    //filter for last work day

    //EDIT RMA-87941

    this.AssureClaims_Workloss_Txt_LastWorkDay = (Selector('[class="ng-scope sortable"]').withText('Last Work Day').find('input'));
    //POM for Last Work Day on WorkLoss List

    this.AssureClaims_Workloss_Txt_FirstDayRestrict = (Selector('[class="ng-scope sortable"]').withText('First Day Restricted').find('input'));
    //POM for First Day Restricted on Restriction List


    this.AssureClaims_Utility_Lnk_WorkLossRestrictionsMapping = (Selector('[title="Work Loss/Restrictions Mapping"]').find('span').withText('Work Loss/Restrictions Mapping'))
    //POM for Link DiaryUtilities

    this.AssureClaims_Utility_Chk_LOBWC = Selector('#LOBId_0')
    //POM for select LOB

    this.AssureClaims_Utility_Chk_RecordTypeWorkLoss = Selector('#RecordType_0')
    //POM for select Record Type

    this.AssureClaims_Utility_Txt_TransTypeLookup = Selector('#TransTypeCode_codelookup')
    //POM for Transaction Type Text Box

    this.AssureClaims_Utility_Btn_AddRecord = Selector('#Add_Record')
    //POM for Add Record Button

    this.AssureClaims_Utility_Chk_RecordTypeRestriction = Selector('#RecordType_1')
    //POM for select Record Type

    this.AssureClaims_Utility_Btn_DeleteRecord = Selector('#Remove_Record')
    //POM for Delete Record Button

    this.AssureClaims_Utility_Btn_SelectRecord = Selector('#WorkLossRestrictionsGrid_gvData_ctl00_1').find('input')
    //POM for select Created record

    this.AssureClaims_Utility_Btn_TransTypeLookup = Selector('#TransTypeCode_codelookupbtn')
    //POM for Transaction Type Button

    this.AssureClaims_Utility_VerifyTxt_RecordExist = Selector('#ErrorControl1_lblError').find('li')
    //POM for Verify Text Record Already Exist

    //Muskan's Code : RMA-95938
    this.AssureClaims_Utility_Lnk_SelectTransactionType = Selector('[class="Bold2"]').find('a')
    // POM for Select Juridiction

    this.AssureClaims_Utility_Btn_SelectRecord_Workloss = Selector('td').withExactText('IV Investigation Expense').parent().find('td').find('input')
    //POM for select the record which has IV Investigation Expense as transaction type

    this.AssureClaims_Utility_Btn_SelectRecord_Restriction = Selector('td').withExactText('EXF Expert Witness Fees').parent().find('td').find('input')
    //POM for select the record which has EXF Expert Witness Fees as transaction type

    //Muskan's Code : RMA-RMA-96007
    this.AssureClaims_WC_Lnk_OpenAddedPersonInvolved = Selector('[ng-click="listVM.select(list, listVM.view.child)"]')
    //POM for Click on Added PI Link

    this.AssureClaims_PersonInv_Lnk_PersonInvolved=Selector('[ng-enter="grid.appScope.columnClick(row.entity)"]')
    //POM for Person Involved link over Person Inv. page
    
    //Muskan's Code : RMA-101853
    this.AssureClaims_WLR_Btn_Add=Selector('#crudGrid_toolbar_add_button')
    //POM for Work Loss/Restrictions Mapping Add button

    this.AssureClaims_WLR_Btn_LOB=Selector('#ctrl_lineofBusinessId')
    //POM for Line of Business drop down over Work Loss/Restrictions Mapping

    this.AssureClaims_WLR_Btn_RecordType=Selector('#ctrl_recordType')
    //POM for Record Type drop down over Work Loss/Restrictions Mapping

    this.AssureClaims_WLR_Btn_TransactionType=Selector('[class="mat-select-arrow mat-select-padding"]')
    //POM for Transaction Type drop down over Work Loss/Restrictions Mapping

    this.AssureClaims_WLR_Btn_SelectTransactionType=Selector('a')
    //POM for select Transacrion type over Work Loss/Restrictions Mapping

    this.AssureClaims_WLR_Btn_SaveBtn=Selector('#toolbar_save_button')
    //POM for Transaction Type drop down over Work Loss/Restrictions Mapping
    
    this.AssureClaims_WLR_Chk_SelectRecord =Selector('#crudCellGrid')
    //POM for check box to select created record 

    this.AssureClaims_WLR_Btn_DeleteRecord =Selector('#crudGrid_toolbar_delete_button')
    //POM for check box to select created record 

    this.AssureClaims_WLR_Lst_SelectValue=Selector('[role="option"]')
    //POM for select record from drop down

    this.AssureClaims_WLR_Btn_RefreshRecord=Selector('[aria-label="Refresh"]')
    //POM for refresh button 



  }
}; export default POM_WorkLossRestriction;
