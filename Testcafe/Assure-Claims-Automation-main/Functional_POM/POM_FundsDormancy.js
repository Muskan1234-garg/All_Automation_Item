import { database } from 'faker';
import { Selector, t } from 'testcafe';

class POM_FundsDormancy {
  constructor() {

    // yashaswi's code
    this.AssureClaims_Utilities_Lnk_FundsDormancySetup = (Selector('[title="Funds Dormancy Setup"]').find('span').withText('Funds Dormancy Setup'))
    //POM for funds dormancy setup link from utilities
    
    this.AssureClaims_FundsDormancyUtilities_Btn_AddNew = Selector('#crudGrid_toolbar_add_button')
    //   POM for Add new button

    this.AssureClaims_FundsDormancyUtilities_Btn_Jurisdiction = Selector('[class="mat-select-arrow mat-select-padding"]')
    //   POM for jurisdiction

    this.AssureClaims_FundsDormancyUtilities_Lnk_SelectJurisdiction = Selector('[class="my-css-class"]').find('a')
    // POM for Select Juridiction

    this.AssureClaims_FundsDormancyUtilities_Txt_UnclaimedDays = Selector('#unclaimedDays')
    // POM for Unclaimed days

    this.AssureClaims_FundsDormancyUtilities_Txt_EsCheatsDays = Selector('#escheatDays')
    //  POM for Eschet days

    this.AssureClaims_FundsDormancyUtilities_Btn_Save = Selector("#toolbar_save_button")
    //  POM for save button

    this.AssureClaims_PrintCheck_Txt_checkDate =Selector('#txtpsccheckdate')
    // POM for Check Date on Print Check from transaction Screen
  }
};
export default POM_FundsDormancy;
