import {Selector,t} from 'testcafe';
class POM_ResetPrintedCheck {
    constructor(){
       
        this.AssureClaims_Funds_Txt_Check_From_Date = (Selector('#txtcheckdatefrom').nth(1));
        //POM For Check From Date on ClearCheck Screen Funds Page

        this.AssureClaims_Funds_Lst_Check_Filter_By_Bank_Account = Selector('#ddlBankAcc')
        //POM For Check Filter By Bank Account On Funds Reset Printed Check Page

        this.AssureClaims_Funds_Btn_Mark_As_Released = Selector('#MarkRelease') 
        //POM For Mark As Released On Funds Reset Printed Check Page

        this.AssureClaims_Funds_Btn_Refresh = Selector('#RefreshGrid')
        //POM For Check From Date Calender On Funds Reset Printed Check Page

        this.AssureClaims_Funds_gridwindows = (Selector('[class="ui-grid-cell-contents"]').nth(0).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))
        //POM For Check From Date Calender On Funds Reset Printed Check Page

      
}
};
export default POM_ResetPrintedCheck;