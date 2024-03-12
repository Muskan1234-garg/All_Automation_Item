import {Selector,t} from 'testcafe';
class POM_UnClearCheck {
    constructor(){
        
        this.AssureClaims_Funds_Txt_Check_From_Date = (Selector('#txtcheckdatefrom').nth(1));
        //POM For Check From Date on ClearCheck Screen Funds Page
                
        this.AssureClaims_Funds_Lst_Check_Filter_By_Bank_Account = Selector('#ddlBankAcc')
        //POM For Check Filter By Bank Account on UnClearCheck Screen Funds Page

        this.AssureClaims_Funds_Chk_IncludeCollections = Selector('#chkusecollections')
        //POM For IncludeCollections CheckBox on UnClearCheck Screen Funds Page

        this.AssureClaims_Funds_Chk_Checks_Not_Attached_to_Claims = Selector('#chknotattached')
        //POM For Checks Not Attached to Claims CheckBox on UnClearCheck Screen Funds Page

        this.AssureClaims_Funds_Btn_MarkUnClear = Selector('#MarkUnClear') 
        //POM For MarkUnClear Button on UnClearCheck Screen Funds Page


        this.AssureClaims_Funds_Btn_Refresh = Selector('#RefreshGrid')
        //POM For Refresh Button on unClearCheck Screen Funds Page

        this.AssureClaims_Funds_gridwindows = (Selector('[class="ui-grid-cell-contents"]').nth(0).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))
        //POM For gridwindows on UnClearCheck Screen Funds Page

        }
        };
    export default POM_UnClearCheck;