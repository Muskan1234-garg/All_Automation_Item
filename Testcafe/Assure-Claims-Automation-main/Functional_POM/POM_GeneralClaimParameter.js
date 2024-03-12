import { Selector, t } from 'testcafe';

class POM_GeneralClaimParameter {
    constructor() {


        this.AssureClaims_GeneralClaimParameter_Chk_InsuffiecientReserve = Selector('#checkInsufficientReserve-input')
        //POM for Check for Insufficient Reserve Funds checkbox over General Claim Parameters


        this.AssureClaims_GeneralClaimParameter_Chk_DoNotAllowNegativeReserve = Selector('#noNegativeReserve-input')
        //POM for Do Not Allow Negative Reserve Adjustments checkbox over General Claim Parameters
        
        this.AssureClaims_GeneralClaimParameter_Chk_UsePolicyManagementSystem = Selector('#useEnhPol-input')
        //POM for Use Policy Management System checkbox over General Claim Parameters
        
        this.AssureClaims_GeneralClaimParameter_Btn_SavePassword = Selector('#button_button')
        //POM for save password button for Use Policy Management System feild over General Claim Parameters

        this.AssureClaims_GeneralClaimParameter_Btn_Save = Selector("#lobparameterssetup_SAVE_button")
        //POM for save button for General Claim Parameters

        this.AssureClaims_GeneralClaimParameter_Lst_Exists = Selector('[aria-label="Reserve Type - E Expense"]')
        //POM for Verification of grid for deductible mapping over General Claim Parameters

        // Yashaswi's Code :RMA-106957
        this.AssureClaims_GeneralClaimParameter_Btn_CalculateCollectioninReservBalance = Selector('#calculateCollectionInResBal-input');
        // POM For Calculate Collections in Reserve Balance checkbox

        this.AssureClaims_GeneralClaimParameter_Btn_CalculateCollectioninIncurredBalance = Selector('#calculateCollectionInIncurredBal-input');
        // POM For Calculate Collections in Incurred Balance checkbox

        this.AssureClaims_GeneralClaimParameter_Btn_CalculatCollectionsinReserveBalancePerReserve = Selector('#calculateCollectionReserveBalancePerRes-input');
        // POM for Calculate Collections in Reserve Balance Per Reserve Checkbox

        this.AssureClaims_GeneralClaimParameter_Btn_CalculatCollectionsinIncurredBalancePerReserve = Selector('#calculateCollectionIncurredBalancePerRes-input');
        // POM for Calculate Collections in Incurred Balance Per Reserve Checkbox

        this.AssureClaims_GeneralClaimParameter_Btn_AddRecoveryReservetoTotalBalanceAmount = Selector('#addRecoveryReservetoTotalBalanceAmount-input');
        // POM for Calculate Recovery Reserve To Total Claim Reserve Balance Checkbox

        this.AssureClaims_GeneralClaimParameter_Btn_AddRecoveryReservetoTotalIncurredAmount = Selector('#addRecoveryReservetoTotalIncurredAmount-input');
        // POM for Calculate Recovery Reserve To Total Claim Incurred Balance checkbox

        this.AssureClaimsApp_GeneralClaimParameter_Btn_ReserveTypesForReserveBalanceCalculationsLookUp = Selector('[class="mat-select-arrow mat-select-padding"]')
        //POM for Clicking ReserveTypes For Reserve Balance Calculations LookUp  from LOB List 

        this.AssureClaimsApp_GeneralClaimParameter_Btn_ReserveTypesForIncurredBalance_CalculationsLookUp = Selector('#lstPerRsvTypeIncurred_multicodebtn')
        //POM for Clicking IncurredBalance For Reserve Balance Calculations LookUp  from LOB List 

        this.AssureClaimsApp_GeneralClaimParameter_Txt_SelectSearchedFeild = Selector('[class="btn-simple"]');
        // POM for selecting searched value in CM 
    }
};
export default POM_GeneralClaimParameter;
