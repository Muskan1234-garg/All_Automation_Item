import {Selector,t} from 'testcafe';
class POM_ControlRequest {
    constructor(){
    // POM for Control Request link in Utilities
    this.AssureClaims_Utility_Lnk_ControlRequest = Selector('#all-services-itemec2').find('span').withText("Control Request")
    // POM for Control Number textbox in Utilities
    this.AssureClaims_Utility_Txt_ControlNumber = Selector('#pay_ctlnumber')
    // POM for Search ControlNumber button 
    this.AssureClaims_Utility_Btn_SearchControlNumber = Selector('#iconsearch')
    // POM for Check Control Number textbox 
    this.AssureClaims_Utility_Txt_CheckControlNumber = Selector('#FLD35000')
    // POM for Submit Query button 
    this.AssureClaims_Utility_Btn_SubmitQuery = Selector('#btnSubmit1')
    // POM for Control Number Link 
    this.AssureClaims_Utility_Lnk_ControlNumber = Selector('[class="ngCellText ng-scope col0 colt0"]').find('a')
    // POM for Source Financial Key Checkbox 
    this.AssureClaims_Utility_Chk_SourceFinancialKey = Selector('#TransSplitGrid_gvData').find('#MyRadioButton')
    // POM for Destination Financial Key Checkbox 
    this.AssureClaims_Utility_Chk_DestinationFinancialKey = Selector('#DestFinKeysGrid_gvData').find('td').withText('E Expense').sibling().find('#MyRadioButton')
    // POM for Destination Transaction Type Lookup Button
    this.AssureClaims_Utility_Btn_DestinationTransactionTypeLookup = Selector('#TransTypeCodeFt_codelookupbtn')
    // POM for Destination Transaction Type Options
    this.AssureClaims_Utility_Lnk_DestinationTransactionType = Selector('.Bold2').find('a')
    // POM for Save Control Request Button
    this.AssureClaims_Utility_Btn_SaveControlRequest = Selector('#btnControlRequest')
}
};
export default POM_ControlRequest;
