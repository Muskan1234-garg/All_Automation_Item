import { Selector, t } from 'testcafe';
class POM_PCParameter {
    constructor() {

  // Yashaswi's Code :RMA-106957
        this.AssureClaims_PCClaimsParamerter_Btn_CalculateCollectioninReserveBalance = Selector('#calculateCollectionInResBal-input');
        // POM For Calculate Collections in Reserve Balance checkbox

        this.AssureClaims_PCClaimsParamerter_Btn_CalculateCollectioninIncurredBalance = Selector('#calculateCollectionInIncurredBal-input');
        // POM For Calculate Collections in Incurred Balance checkbox

        this.AssureClaims_PCClaimsParamerter_Btn_CalculatCollectionsinReserveBalancePerReserve = Selector('#calculateCollectionReserveBalancePerRes-input');
        // POM for Calculate Collections in Reserve Balance Per Reserve Checkbox

        this.AssureClaims_PCClaimsParamerter_Btn_CalculatCollectionsinIncurredBalancePerReserve = Selector('#calculateCollectionIncurredBalancePerRes-input');
        // POM for Calculate Collections in Incurred Balance Per Reserve Checkbox

        this.AssureClaims_PCClaimsParamerter_Btn_AddRecoveryReservetoTotalBalanceAmount = Selector('#addRecoveryReservetoTotalBalanceAmount-input');
        // POM for Calculate Recovery Reserve To Total Claim Reserve Balance Checkbox
        
        this.AssureClaims_PCClaimsParamerter_Btn_AddRecoveryReservetoTotalIncurredAmount = Selector('#addRecoveryReservetoTotalIncurredAmount-input');
        // POM for Calculate Recovery Reserve To Total Claim Incurred Balance checkbox

    }
};
export default POM_PCParameter;