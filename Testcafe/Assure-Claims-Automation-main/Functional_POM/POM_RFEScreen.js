import { Selector, t } from 'testcafe';

class POM_RFEScreen {
    constructor() {



        this.AssureClaims_RFE_morebtn = (Selector('#frmData').find('i').withText('list'));
        //POM for clicking three dot button from the tool bar

        this.AssureClaims_ClaimScan_ClickRFEButton = (Selector('#frmData').find('a').withText('Request for Evidence'));
        //POM for clicking Request for Evidence option from the tool bar

        this.AssureClaims_RFE_ConfirmBtn = (Selector('#btnRoll').find('i').withText('done'));
        //POM for Confirm Button for not 360 Globalnet initiated Claim

        this.AssureClaims_RFE_BrandListLabel = Selector('#cl_lbl_brand').withText('Brand List');
        //POM for Brand List label

        this.AssureClaims_RFE_BrandListBtn = Selector('#mat-select-value-3');
        //POM for Brand List dropdown button

        this.AssureClaims_RFE_BrandList = Selector('[class="mat-option-text"]').find('span').withText('DXC');
        //POM for Brand List option

        this.AssureClaims_RFE_TemplateListBtn = Selector('#mat-select-value-1');
        //POM for Template list dropdown button

        this.AssureClaims_RFE_TemplateList = Selector('[class="mat-option-text"]').find('span').withText('DI_Motor_Invoice');
        //POM for Template list dropdown with template name DI_Motor_Invoice

        this.AssureClaims_RFE_RepairerName = Selector('[aria-labelledby="lbl_name"]');
        //POM for DI Repairer Name

        this.AssureClaims_RFE_RepairerEmail = Selector('[aria-labelledby="lbl_email"]');
         //POM for DI Repairer Email

        this.AssureClaims_RFE_SaveButton = Selector('[class="mat-icon notranslate material-icons mat-icon-no-color"]').withText('save');
         //POM for RFE Save Button
    }
};
export default POM_RFEScreen;



