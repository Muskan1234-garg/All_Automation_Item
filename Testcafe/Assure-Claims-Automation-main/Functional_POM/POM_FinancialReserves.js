import { Selector, t } from 'testcafe';
class POM_FinancialReserves {
    constructor() {
        this.AssureClaims_SelectFinancialReserve = Selector('#Financials\\/Reserves').find('.commonIcomoon.icomoon-safe.icon-safe')
        //POM for Financial Reserves Button on Claim Page

        this.AssureClaims_ReserveCreation_Btn_AddReserve = Selector('#AddReserve').find('i').withText('add')
        //POM for Add Reserve Button on Financial Reserve Page

        this.AssureClaims_ReserveCreation_Lst_ReserveType = Selector('#cmbReserveType')
        //POM for Reserve Type Dropdown On Reserve Page

        this.AssureClaims_ReserveCreation_Txt_ReserveAmount = (Selector('#txtAmount').nth(1))
        //POM for Reserve Amount On Reserve Page

        this.AssureClaims_ReserveCreation_Lst_Status = Selector('#cmbStatusAdd')
        //POM for Reserve Status Dropdown On Reserve Page

        this.AssureClaims_ReserveCreation_Lst_ReserveUnit = Selector('#cmbUnit')
        //POM for Reserve Unit Dropdown On Reserve Page

        this.AssureClaims_ReserveCreation_Lst_ReserveCoverageType = Selector('#cmbCoverageType')
        //POM for Reserve Coverage Type Dropdown On Reserve Page

        this.AssureClaims_ReserveCreation_Lst_ReserveLossType = Selector('#cmbCoverageLossType')
        //POM for Reserve Loss Type Dropdown On Reserve Page

        this.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph = Selector('[class="col-md-2"]').find('span')
        //POM for Minimize financial graph

        this.AssureClaims_ReserveCreation_Txt_SearchReserve = Selector('[class="ng-scope sortable"]').withText('Reserve Type').find('input')
        //POM for Reserve search Text Box

        this.AssureClaims_ReserveCreation_Txt_SearchCntrlNo = Selector('[class="ng-scope sortable"]').withText('Control Number').find('input')
        //POM for Reserve search Text Box

        //Diksha's Code :RMA-87950
        this.AssureClaims_SaveandExit_Button = Selector('[uib-tooltip="Save and Exit"]');
        //POM for Financial Reserves Button on Claim Page

        //Muskan's code : RMA-91093 and RMA-91094

        this.AssureClaims_InsufficientReserve_Btn_ReserveHistory = Selector('#ReserveHistory')
        //POM for Reserve History Button

        this.AssureClaims_InsufficientReserve_VerifyMsg = Selector('[class="container-fluid"]').child('h5')
        //POM for Verify Insufficient Reserve Msg

        this.AssureClaims_InsufficientReserve_Btn_SetReserve = Selector('#setreservebtn')
        //POM for set reserve button

        this.AssureClaims_InsufficientReserve_Btn_AddReserve = Selector('#addreservebtn')
        //POM for add reserve Button

        this.AssureClaims_InsufficientReserve_Txt_ReserveAmount = Selector('#txtsetreserve')
        //POM for reserve amount textbox

        this.AssureClaims_InsufficientReserve_Txt_PaymentAmount = Selector('#txtaddreserve')
        //POM for payment amount textbox

        this.AssureClaims_InsufficientReserve_Btn_Continue = Selector('#continue')
        //POM for continue button

        this.AssureClaims_InsufficientReserveOn_ReserHistory_Txt_ReserveAmount = Selector('[class="ng-scope sortable"]').withText('Reserve Amount').find('input')
        //POM for Reserve Amount Text Box

        this.AssureClaims_ReserveCreation_Btn_Cancel = Selector('#cancel')
        //POM for cancel button

        //Muskan's code-->RMA-92767
        this.AssureClaims_ReserveCreation_Txt_SearchBalance = Selector('[class="ng-scope sortable"]').withText('Balance').find('input')
        //POM for balance search Text Box

        this.AssureClaims_Payment_Txt_CntrlNumber = Selector('#controlNumber');
        //Contol number txtbox.

        this.AssureClaims_Payment_Btn_FilterSerach = Selector('[class="glyphicon glyphicon-search searchFilterIcon "]');
        //search btn

        this.AssureClaims_Payment_Lnk_Transaction = Selector('[class="ui-grid-cell ng-scope ui-grid-coluiGrid-000D"]').find('span')
        //lnk for transaction

        //Muskan's Code : RMA-94580
        this.AssureClaims_TransactionHistory_Lnk_ControlNumber = Selector('[class="a_bold ng-binding"]')
        //POM for control number link

        //Tushar's Code : RMA-103318
        this.AssureClaims_ReserveCreation_Txt_SearchClaimant = Selector('[class="ng-scope sortable"]').withText('Claimant').find('input')
        //POM for Reserve search Text Box

        //  Yashaswi's Code : RMA-104781
        this.AssureClaims_ReserveCreation_Txt_SearchClaimNumber = Selector('[class="ng-scope sortable"]').withText('Claim Number').find('input')
        // POM for claim Number search box

        //Muskan's Code : RMA-104784
        this.AssureClaims_ReserveHistroy_Txt_SearchControlNumber=Selector('[class="ng-scope sortable"]').withText('Control #').find('input')
        //POM for control number search Text Box

       //================================Kiran's Code : RMA-109551 started here================================================================
        this.AssureClaims_FinanceReserve_Btn_PMI = Selector('#PmiDetails')
        //POM for Click Financial reserve button for PMP
        //================================Kiran's Code : RMA-109551 ended here================================================================

    }
};
export default POM_FinancialReserves;
