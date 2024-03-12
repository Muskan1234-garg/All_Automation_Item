import { database } from 'faker';
import { Selector, t } from 'testcafe';


class POM_LobParameters {
    constructor() {

        this.AssureClaimsApp_Lnk_LOBParameter = Selector('[class="rma-service-list"]').find('span');
        //POM for click on General System Parameter Setup

        // this.AssureClaims_GeneralSystemParameterSetupIframe=Selector('#GeneralSystemParameterSetup.aspx')
        // //POM for Iframe of General System Parameter Setup

        this.AssureClaimsApp_LOBParameterReserveRecovery_Btn_Diaries = Selector('#LINKTABSReserveIncurredBalanceOptions');
        //POM for click on Diaries/Text Fields

        this.AssureclaimsApp_Lobwcclaim_drpdpwn = Selector('#lstLOB');
        //POM for selecting WC claims

        this.AssureClaims_CalculateCollectioninReservBalance = Selector('#chkCollResBal');

        this.AssureClaims_CalculateCollectioninIncurredBalance = Selector('#chkCollIncBal');
        this.AssureClaims_chkAddRecoveryReservetoTotalBalanceAmount_Gc = Selector('#chkAddRecoveryReservetoTotalBalanceAmount');
        this.AssureClaims_chkAddRecoveryReservetoTotalIncurredAmount_Gc = Selector('#chkAddRecoveryReservetoTotalIncurredAmount');

        this.AssureClaims_chkAddRecoveryReservetoTotalBalanceAmount_Vc = Selector('#chkAddRecoveryReservetoTotalBalanceAmount');
        this.AssureClaims_chkAddRecoveryReservetoTotalIncurredAmount_Vc = Selector('#chkAddRecoveryReservetoTotalIncurredAmount');
        
          this.AssureClaims_CalculatCollectionsinReserveBalancePerReserve = Selector('#chkCollResBalPerRsv');
        this.AssureClaims_CalculatCollectionsinIncurredBalancePerReserve = Selector('#chkCollIncBalPerRsv');

        this.AssureClaims_chkAddRecoveryReservetoTotalBalanceAmount = Selector('#chkAddRecoveryReservetoTotalBalanceAmount');
        this.AssureClaims_chkAddRecoveryReservetoTotalIncurredAmount = Selector('#chkAddRecoveryReservetoTotalIncurredAmount');
        
         //Muskan's Code : RMA-91093 and RMA-91094
        this.AssureClaimsApp_LOBParameter_Lst_SelectClaim=Selector('#lstLOB')
        //POM for select claim from LOB List 
        
        //Sai's Code: RMA-94593
         this.AssureClaimsApp_LOBParameter_Tab_PolicyOptions = Selector('#LINKTABSPolicyOptions');
        //POM for Policy Options tab in LOBParameter

        this.AssureClaimsApp_LOBParameter_Chk_UsePolicyManagementSystem = Selector('#useEnhPol-input');
        //POM for UsePolicyManagementSystem CheckBox

        //Sai's code : RMA-95941
        
        this.AssureClaimsApp_LOBParameter_Btn_ReserveTypesForReserveBalanceCalculationsLookUp=Selector('#lstPerRsvTypeRecovery_multicodebtn')
        //POM for Clicking ReserveTypes For Reserve Balance Calculations LookUp  from LOB List 

        this.AssureClaimsApp_LOBParameter_Btn_ReserveTypesForIncurredBalance_CalculationsLookUp=Selector('#lstPerRsvTypeIncurred_multicodebtn')
        //POM for Clicking IncurredBalance For Reserve Balance Calculations LookUp  from LOB List 
        
        this.AssureClaimsApp_LOBParameter_Lnk_ReserveTypesForIncurredBalance_ReserveBalanceCalculations=Selector('[class="Bold2"]').find('a');
        //POM for Clicking ReserveTypes For Reserve Balance Calculations Link  from LOB List 



    }
};
export default POM_LobParameters;
