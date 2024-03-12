import {Selector} from 'testcafe';

class POM_OrgHierarchy{
    constructor(){
        this.AssureClaims_MaintOrgHierarchy_Btn_New = Selector('#idnodeadd').find('i').withText('note_add');
        //POM for New Button On Maint=>OrgHierarchy Screen
      
        this.AssureClaims_MaintOrgHierarchy_Txt_LastName = Selector('#lastname');
        //POM for Last Name Textbox On Maint=>OrgHierarchy Screen

        this.AssureClaims_MaintOrgHierarchy_Txt_Abbreviation = Selector('#deptabbreviation');
        //POM for Abbreviation Textbox On Maint=>OrgHierarchy Screen

        this.AssureClaims_MaintOrgHierarchy_Btn_AddBankAccount = Selector('[class="row main_menu right-panel-bg-hover"]').find('i').withText('add');
        //POM for Add BankAccount On Maint=>OrgHierarchy Screen

        this.AssureClaims_MaintOrgHierarchy_Txt_BankName = Selector('#bankname');
        //POM for Last Name Textbox On Maint=>OrgHierarchy Screen        

        this.AssureClaims_MaintOrgHierarchy_Txt_AccountNumber = Selector('#accountnumber');
        //POM for Account Number Textbox On Maint=>OrgHierarchy Screen       

        this.AssureClaims_MaintOrgHierarchy_Btn_AccountType = (Selector('#btn_accttypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Banking Status Button On General Claim Screen

        this.AssureClaims_MaintOrgHierarchy_Lnk_SelectAccountType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Banking Status Value On General Claim Screen

        this.AssureClaims_MaintOrgHierarchy_Btn_BankingStatus = (Selector('#btn_bankingstatus_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Banking Status Button On General Claim Screen

        this.AssureClaims_MaintOrgHierarchy_Lnk_SelectBankingStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Banking Status Value On General Claim Screen

        this.AssureClaims_MaintOrgHierarchy_Txt_TransitRoutingNumber = Selector('#transit');
        //POM for Last Name Textbox On Maint=>OrgHierarchy Screen
    }
};export default POM_OrgHierarchy;
