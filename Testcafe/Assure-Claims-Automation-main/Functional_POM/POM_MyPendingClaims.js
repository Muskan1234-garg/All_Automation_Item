import {Selector,t} from 'testcafe';
class POM_MyPendingClaims {
    constructor(){
 
        this.AssureClaimsApp_MyPendingClaims_Txt_ClaimNumber= Selector('[class="ui-grid-header-cell-label ng-binding"]').withText('Claim Number').parent('[role="columnheader"]').find('input');
        this.AssureClaimsApp_MyPendingClaims_Lnk_ClaimNumber= Selector('[ng-click="grid.appScope.columnClick(row.entity)"]');

        this.AssureClaims_MyPendingClaims_Chk_ShowAllClaims = Selector('#chkshowAllClaim');

    }
};
export default  POM_MyPendingClaims;