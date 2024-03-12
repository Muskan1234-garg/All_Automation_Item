import { Selector, t } from 'testcafe';

class POM_WCClaimParameters {
    constructor() {
        this.AssureClaims_WCClaimParameters_Chk_CalculateCollectioninReserveBalance = Selector('#calculateCollectionInResBal-input');
        // Pom for Calculate Collections in Reserve Balance
        
        // Yashaswi's Code :RMA-106957
        this.AssureClaims_WCClaimParameters_Btn_CalculateCollectioninReserveBalance = Selector('#calculateCollectionInResBal-input');
        // POM For Calculate Collections in Reserve Balance checkbox

        this.AssureClaims_WCClaimParameters_Btn_CalculateCollectioninIncurredBalance = Selector('#calculateCollectionInIncurredBal-input');
        // POM For Calculate Collections in Incurred Balance checkbox

        this.AssureClaims_WCClaimParameters_Btn_CalculatCollectionsinReserveBalancePerReserve = Selector('#calculateCollectionReserveBalancePerRes-input');
        // POM for Calculate Collections in Reserve Balance Per Reserve Checkbox

        this.AssureClaims_WCClaimParameters_Btn_CalculatCollectionsinIncurredBalancePerReserve = Selector('#calculateCollectionIncurredBalancePerRes-input');
        // POM for Calculate Collections in Incurred Balance Per Reserve Checkbox

        this.AssureClaims_WCClaimParameters_Btn_AddRecoveryReservetoTotalBalanceAmount = Selector('#addRecoveryReservetoTotalBalanceAmount-input');
        // POM for Calculate Recovery Reserve To Total Claim Reserve Balance Checkbox

        this.AssureClaims_WCClaimParameters_Btn_AddRecoveryReservetoTotalIncurredAmount = Selector('#addRecoveryReservetoTotalIncurredAmount-input');
        // POM for Calculate Recovery Reserve To Total Claim Incurred Balance checkbox

        this.AssureClaimsApp_WCClaimParameters_Btn_ReserveTypesForReserveBalanceCalculationsLookUp = Selector('[class="mat-select-arrow mat-select-padding"]')
        //POM for Clicking ReserveTypes For Reserve Balance Calculations LookUp  from LOB List 

        this.AssureClaimsApp_WCClaimParameters_Btn_ReserveTypesForIncurredBalance_CalculationsLookUp = Selector('#lstPerRsvTypeIncurred_multicodebtn')
        //POM for Clicking IncurredBalance For Reserve Balance Calculations LookUp  from LOB List 

        this.AssureClaimsApp_WCClaimParameters_Txt_SelectSearchedFeild = Selector('[class="btn-simple"]');
        // POM for selecting searched value in CM
    }
};
export default POM_WCClaimParameters;
