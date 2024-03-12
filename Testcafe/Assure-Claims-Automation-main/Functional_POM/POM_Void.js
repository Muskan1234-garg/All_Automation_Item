import {Selector,t} from 'testcafe';
class POM_Void {
    constructor(){
        this.AssureClaims_Funds_Txt_Check_From_Date = (Selector('#txtcheckdatefrom').nth(1));
        //POM For Check From Date on ClearCheck Screen Funds Page

        this.AssureClaims_Funds_Lst_Check_Filter_By_Bank_Account = Selector('#ddlBankAcc')

        this.AssureClaims_Funds_Chk_IncludeCollections = Selector('#chkusecollections')

        this.AssureClaims_Funds_Chk_Checks_Not_Attached_to_Claims = Selector('#chknotattached')

        this.AssureClaims_Funds_Btn_VoidCleared = Selector('#MarkVoid') 

        this.AssureClaims_Funds_Btn_Refresh = Selector('#RefreshGrid')

        this.AssureClaims_Funds_gridwindows = (Selector('[class="ui-grid-cell-contents"]').nth(0).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))

        
}
};
export default POM_Void;