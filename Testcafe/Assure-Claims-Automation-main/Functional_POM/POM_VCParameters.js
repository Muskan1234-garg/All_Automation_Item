import { Selector, t } from 'testcafe';
class POM_VCParameter {
    constructor() {



        this.AssureClaims_VAClaimsParamerter_Btn_CalculateCollectioninReservBalance = Selector('#calculateCollectionInResBal-input');
        // POM For Calculate Collections in Reserve Balance checkbox

        this.AssureClaims_VAClaimsParamerter_Btn_CalculateCollectioninIncurredBalance = Selector('#calculateCollectionInIncurredBal-input');
        // POM For Calculate Collections in Incurred Balance checkbox

        this.AssureClaims_VAClaimsParamerter_Btn_CalculatCollectionsinReserveBalancePerReserve = Selector('#calculateCollectionReserveBalancePerRes-input');
        // POM for Calculate Collections in Reserve Balance Per Reserve Checkbox

        this.AssureClaims_VAClaimsParamerter_Btn_CalculatCollectionsinIncurredBalancePerReserve = Selector('#calculateCollectionIncurredBalancePerRes-input');
        // POM for Calculate Collections in Incurred Balance Per Reserve Checkbox

        this.AssureClaims_VAClaimsParamerter_Btn_AddRecoveryReservetoTotalBalanceAmount = Selector('#addRecoveryReservetoTotalBalanceAmount-input');
        // POM for Calculate Recovery Reserve To Total Claim Reserve Balance Checkbox
        
        this.AssureClaims_VAClaimsParamerter_Btn_AddRecoveryReservetoTotalIncurredAmount = Selector('#addRecoveryReservetoTotalIncurredAmount-input');
        // POM for Calculate Recovery Reserve To Total Claim Incurred Balance checkbox

    }
};
export default POM_VCParameter;