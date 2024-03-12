import {Selector,t} from 'testcafe';

class POM_UserPrivilegesSetUp{
    constructor(){

         this.AssureClaims_UserPrev_Lst_LOB=Selector('#ddllob')
        //POM for select LOB

        this.AssureClaims_UserPrev_Lst_LimitType=Selector('#ddllimits')
        //POM for select Limit Type

        this.AssureClaims_UserPrevLimit_Chk_EnbLmt=Selector('[ng-change="vm.EnableLimits()"]')
        //POM for check box Enable Reserve Limits

        this.AssureClaims_UserPrevLimit_Txt_User=Selector('#lookup_usergroups')
        //POM for User  TextBox

        this.AssureClaims_UserPrevLimit_Lst_ReserveType=Selector('#ddlreservetype')
        //POM for Reserve Type

        this.AssureClaims_UserPrevLimit_Txt_MaxAmount=Selector('#txtmaxamount')
        //POM for Max Amount

        this.AssureClaims_UserPrevLimit_Txt_ClaimType=Selector('#lookup_claimtypecode')
        //POM for claim Type Text Box

        this.AssureClaims_UserPrevLimit_Btn_Add=Selector('#Buttonadd')
        //POM for add button
        
        this.AssureClaims_UserPrevLimit_Chk_EnbPayLmt=Selector('[ng-change="vm.EnableLimits()"]')
        //POM for check box Enable Payment Limits
        
        this.AssureClaims_UserPrevLimit_Chk_PreventPaymentAboveLimit=Selector('[ng-change="vm.PrePayChanged()"]')
        //POM for check box Prevent Payment Above Limit
        
        //Muskan's Code : RMA-104784
        this.AssureClaims_UserPrevLimit_Btn_CancelLimit=Selector('[name="btn_cancel"]')
        //POM for cancel limit over User Privileges Setup
        
        //Muskan's Code: RMA-104786
        this.AssureClaims_UserPrevLimit_Btn_AdditionalSetting=Selector('#BtnadditionalSettings')
        //POM for additional setting over User Privileges Setup

        this.AssureClaims_LOBTopLevelApproval_Lst_SelectLOB=Selector('#ddlob')
        //POM for select LOB over Line of Business Top Level Approval

        this.AssureClaims_LOBTopLevelApproval_Btn_UsernameLookup=Selector('#btn_usergroups')
        //POM for user lookup button over Line of Business Top Level Approval

        this.AssureClaims_LOBTopLevelApproval_Btn_SystemUser=Selector('#usericon')
        //POM for user button over Line of Business Top Level Approval

        this.AssureClaims_LOBTopLevelApproval_Txt_FirstName=Selector('#priority')
        //POM for First name user text box over Line of Business Top Level Approval

        this.AssureClaims_LOBTopLevelApproval_Btn_SearchButton=Selector('[class="glyphicon glyphicon-search searchFilterIcon "]')
        //POM for search button over Line of Business Top Level Approval

        this.AssureClaims_LOBTopLevelApproval_Btn_SaveButton=Selector('#Buttonsave')
        //POM for save button over Line of Business Top Level Approval

        this.AssureClaims_LOBTopLevelApproval_Txt_PaymentMax=Selector('#txtpaymentmax1')
        //POM for payment max text box over Line of Business Top Level Approval

        this.AssureClaims_LOBTopLevelApproval_Btn_OkButton=Selector('#complete')
        //POM for ok button over Line of Business Top Level Approval User selection
        
        //Muskan's Code : RMA-104782
        this.AssureClaims_LOBTopLevelApproval_Txt_ReserveMax=Selector('#txtreservemax1')
        //POM for payment max text box over Line of Business Top Level Approval
          
        //Yashaswi's code :RMA-107064 
        this.AssureClaims_UserPrevLimit_Chk_AllowCreateUpdate=Selector('[ng-model="vm.allowCreate"]')
        //POM for check box Enable Allow Create/Update

        this.AssureClaims_UserPrevLimit_Chk_AllowAccess=Selector('[ng-model="vm.allowAccess"]')
        //POM for check box Enable Allow Access

}};
export default POM_UserPrivilegesSetUp;
