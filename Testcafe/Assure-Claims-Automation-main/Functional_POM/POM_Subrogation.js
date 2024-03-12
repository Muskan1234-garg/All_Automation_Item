import { Selector, t} from 'testcafe';
class POM_Subrogation {
constructor(){
    this.AssureClaims_Subrogation_Btn_AddSubrogation = Selector('[aria-label="Add Subrogation"]');
    //POM For Subrogation Add Button On Subrogation Creation Page
    this.AssureClaims_Subrogation_Btn_SubrogationType = (Selector('#btn_subtypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
    //POM For Subrogation_Type Lookup Button On Subrogation Creation Page
    this.AssureClaims_Subrogation_Lnk_SelectSubrogationType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM For Subrogation_Type Select Link On Subrogation Creation Page
    this.AssureClaims_Subrogation_Btn_SubrogationStatus = (Selector('#btn_substatuscode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
    //POM For Subrogation_Status Lookup Button On Subrogation Creation Page
    this.AssureClaims_Subrogation_Lnk_SelectSubrogationStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM For Subrogation_Status Select Link On Subrogation Creation Page
    this.AssureClaims_Subrogation_Txt_StatusDate = (Selector('#statusdate').nth(1));
    //POM For Subrogation StatusDate On Subrogation Creation Page
    this.AssureClaims_Subrogation_Btn_SubrogationStatusDescription = (Selector('#btn_substatusdesccode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
    //POM For Subrogation_StatusDescription Lookup Button On Subrogation Creation Page
    this.AssureClaims_Subrogation_Lnk_SelectSubrogationStatusDescription = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM For Subrogation_StatusDescription Select Link Button On Subrogation Creation Page
    this.AssureClaims_Subrogation_Btn_Save = (Selector('#Save').find('i').withText('save'));
    //POM For Subrogation Save Button On Subrogation Creation Page

    this.AssureClaims_Subrogation_Tab_SubrogationInfo=(Selector('[role="button"]').find('span').withText('Subrogation Info'))
    //POM for Selecting Claim Subrogation Information Accordian On Subrogation Screen

    this.AssureClaims_Subrogation_Tab_SubrogationFinancial=(Selector('[role="button"]').find('span').withText('Subrogation Financial'))
    //POM for Selecting Subrogation Financial Accordian On Subrogation Screen

    this.AssureClaims_Subrogation_Tab_Supplementals=(Selector('[role="button"]').find('span').withText('Supplementals'))
    //POM for Selecting Supplementals Accordian On Subrogation Screen
    
    this.AssureClaims_Subrogation_Txt_NumberOfYears = Selector('#nbofyears');
    //POM For Number Of Years Text Box On Subrogation Creation Page
    this.AssureClaims_Subrogation_Txt_ClaimNumber = Selector('#subadverseclaimnum');
    //pom for claim number textbox
}};
export default POM_Subrogation;