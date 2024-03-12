import { Selector } from 'testcafe';

class POM_PolicyTracking {
    constructor() {
        this.AssureClaims_Policy_Txt_PolicyName = Selector('#policyname');
        //POM for Text PolicyName On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Txt_PolicyStatus = (Selector('#btn_policystatuscode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Claim Status Button On Policy Tracking Screen
        this.AssureClaims_Policy_Lnk_SelectPolicyStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Claim Status Value On Policy Tracking Screen
        this.AssureClaims_Policy_Txt_PolicyLOB = (Selector('#btn_policytype_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Claim Status Button On Policy Tracking Screen
        this.AssureClaims_Policy_Lnk_SelectPolicyLOB = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Claim Status Value On Policy Tracking Screen
        this.AssureClaims_Policy_Txt_Premium = Selector('#premium');
        //POM for Text Premium On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Txt_EffectiveDate = Selector('#effectivedate');
        //POM for Text EffectiveDate On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Txt_ExpirationDate = Selector('#expirationdate');
        //POM for Text EffectiveDate On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Txt_PolicyNumber = Selector('#policynumber');
        //POM for Text PolicyNumber On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_chk_PrimaryPolicy = Selector('#primarypolicyflg');
        //POM for Check Box PrimaryPolicy On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_chk_ClaimsMadeCoverage = Selector('#triggerclaimflag');
        //POM for Check Box ClaimsMadeCoverage On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Tab_PolicyInfo = (Selector('[role="button"]').find('span').withText('Policy Information'))
        //POM for Tab PolicyInfo On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Tab_InsurerInfo = (Selector('[role="button"]').find('span').withText('Insurer Information'))
        //POM for Tab InsurerInfo On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Tab_BrokerInfo = (Selector('[role="button"]').find('span').withText('Broker Information'))
        //POM for Tab BrokerInfo On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Tab_Supplementals = (Selector('[role="button"]').find('span').withText('Supplementals'))
        //POM for Tab Supplementals On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Btn_SubmitQuery = Selector('#submitquery').find('i');
        //POM for Button SubmitQuery On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Link_Insurer = Selector('[class="ui-grid-cell-contents ng-scope"]').find('Span');
        //POM for Link Insurer On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Link_PolicyMco = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM for Link PolicyMco On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Btn_Insured = Selector('[aria-label="Select box"]')
        //POM for Button Insured On Maint=>Policy Tracking Screen
        this.AssureClaims_Policy_Btn_Insured1 = Selector('[id="btnPI_inslastname"]')
        //POM for Button Insured1 On Maint=>Policy Tracking Screen


        this.AssureClaims_Policy_Lnk_PolicyCoverage = Selector('[id="associated-policycoverage"]').find('span')
        //POM for Link PolicyCoverage On Maint=>Policy Tracking Screen

        this.AssureClaims_Policy_Btn_CoverageType = Selector('#lookup_coveragetypecode');
        //POM for Button CoverageType On Maint=>Policy Tracking Screen
	    
        this.AssureClaims_Policy_Txt_PolicyLimit = Selector('#policylimit');
        //POM for Text PolicyLimit On Maint=>Policy Tracking Screen
	    
        this.AssureClaims_Policy_AddBtn_PolicyCoverge = Selector('[aria-label="Add Policy Coverage"]');
        //POM for ButtonS PolicyMCO On Maint=>Policy Tracking Screen
	    
        this.AssureClaims_Policy_AddBtn_PolicyMCO = Selector('[aria-label="Add Policy MCO"]');
        //POM for ButtonS PolicyMCO On Maint=>Policy Tracking Screen
	    
        this.AssureClaims_Policy_Btn_CoverageType = (Selector('#btn_coveragetypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Claim Status Button On Policy Tracking Screen
	    
        this.AssureClaims_Policy_Lnk_SelectCoverageType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Link SelectCoverage Type on PolicyTracking Screen
	    
        this.AssureClaims_Policy_Btn_PolicyMCO = Selector('#btn_mcoeid').find('i');
        //POM for Button PolicyMCO On Maint=>Policy Tracking Screen
	    
        this.AssureClaims_Policy_Btn_Insurer = Selector('#btn_inslastname').find('i');
        //POM for Button Insured On Maint=>Policy Tracking Screen
	    
        this.dvbreadcrumbscroll = Selector('#dvbreadcrumbscroll').find('i').withText('reply')
        //POM for BreadCrumb 
	    
        this.AssureClaims_GenericClaim_Btn_PolicyNameLookup = (Selector('[name="multipolicyidPSDownloadbtn"]').find('.glyphicon.glyphicon-search'))
        //POM for PolicyNameLookup button for PolicyName
	    
        this.AssureClaims_GenericClaim_Lnk_PolicyName = Selector('[class="ui-grid-cell-contents ng-scope"]').find('a');
        //POM for Link for PolicyName
        this.AssureClaims_SystemUsers_Txt_Filter = Selector('[class="ui-grid-filter-input ui-grid-filter-input-0 ng-touched"]')
        //POM for Filter TextBox
        this.AssureClaims_Policy_Txt_PolicyMCO = Selector('#lookup_mcoeid');
        //POM for Text PolicyMCO On Maint=>Policy Tracking Screen


        //NITIKA'S CODE
        this.AssureClaims_Policy_Btn_ClientProgram = (Selector('#btn_clientprogramid').find('.glyphicon.glyphicon-search'));
        //POM for Clientprogram

        this.AssureClaims_Policy_Btn_ClientProgram_SubmitQuery = Selector('#submitquery');
        //POM for Submit Query button for Clientprogram Search

        this.AssureClaims_Policy_Link_Clientprogram = Selector('[class="ui-grid-cell-contents ng-scope"]').find('Span');
        //POM for Selected Client program on Search

        this.AssureClaims_Policy_Btn_Insurer_LookUp = Selector('#btnPI_inslastname').find('i');
        //POM for Insurer Button

        this.AssureClaims_Policy_Btn_Insurer_LookUp_Link = Selector('#btnPI_inslastname').find('.glyphicon.glyphicon-option-horizontal');
        //POM for Insurer Selection Link 

        this.AssureClaims_Policy_Link_Clientprogram_Insurer = Selector('[class="ui-grid-cell-contents ng-scope"]').find('Span');
        //POM for Selected Insurer on Search

        this.AssureClaims_Policy_Btn_UMR_Number_LookUp = Selector('#btn_umrlookupid').find('.glyphicon.glyphicon-th-list');
        //POM for UMR Button

        this.AssureClaims_Policy_Link_Clientprogram_Insurer_UMR_Number = Selector('[class="ui-grid-cell-contents ng-scope"]').find('Span');
        //POM for Selected UMR on Search

        // Tushar's code : RMA- 94582

        this.AssureClaims_Utilities_TableVal_PolicyLOBRMCode = Selector('#gvPolicyCodeMappingGrid').find('tbody').find('tr').nth(1).find('td').nth(1)
        // POM of Table Generated when Code Type is selected

        this.AssureClaims_Utilities_Lst_PolicyInterfaceMapping_SelectPolicySystem = Selector('#lstPolicySystem')
        // POM for selecting Policy System

        this.AssureClaims_Utilities_Lst_PolicyInterfaceMapping_SelectCodeType = Selector('#lstCodeType')
        // Loss Code Mapping

        this.AssureClaims_Utilities_Lst_LossCodeMapping_PolicySystemNames = Selector('#listPolicySystem')
        //POM for Selecting Policy System Names Dropdown

        this.AssureClaims_Utilities_Lst_LossCodeMapping_SelectPolicyLOB = Selector('#lstPolicyClaimLOB')
        //POM for Selecting Policy LOB Dropdown

        this.AssureClaims_Utilities_Lst_LossCodeMapping_SelectCoverageType = Selector('#lstCoverageType')
        //POM for Selecting Coverage Type Dropdown

        this.AssureClaims_Utilities_Btn_LossCodeMapping_GridSelect = Selector('#GridPolicyCodemapping_ctl00_ctl02_ctl01_columnSelectCheckBox');
        //POM for grid button

        this.AssureClaims_Utilities_LossCodeMapping_Lnk_AddReserve = Selector('[id="GridPolicyCodemapping_ctl00__0"]').find('u').withText('Add Reserve')
        // POM for Add Reserve button

        this.AssureClaims_Utility_Select_ReserveType = Selector('#lstReserveType')
        //POM for select Reserve Type

        this.AssureClaimsApp_Utility_Txt_Amount = Selector('#txtReserveAmnt')
        // POM for Reserve Amount textbox

        this.AssureClaimsApp_Utility_Btn_Ok = Selector('#btnOK')
        // POM for ok button

        //Sai's Code : RMA-94594
        this.AssureClaims_PolicyTracking_Btn_Policy_MCO_Search = Selector('#btn_mcoeid').find('i');
        //POM of Policy MCO Search Button on PolicyTracking Screen

        this.AssureClaims_PolicyTracking_Txt_SearchPolicyMCO_LastName = Selector('[name="Last Name"]');
        //POM of Search Policy MCO LastName Text Box On PolicyTracking Screen

        this.AssureClaims_PolicyTracking_Txt_PropertyId = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM OF Policy MCO LastName Link On PolicyTracking Policy MCO Selection Window

        this.AssureClaims_PolicyTracking_Txt_PolicyName = Selector('[class="ui-grid-header-cell-label ng-binding"]').withText('Policy Name').parent('[role="columnheader"]').find('input')
        //POM For Policyname TextBOX On Policy LookUp in General claim  Screen
	    
	    this.AssureClaims_Policy_Txt_PolicyNameSearch = Selector("#FLD71911")
        //POM for Policy Name Search text name 	    
	    
	    this.AssureClaims_Policy_Txt_coverageDiscriptionSearch = Selector("#priority").nth(1)
        // POM for coverage search text box
	    
        this.AssureClaims_Payment_Btn_FilterSerach = Selector('[class="glyphicon glyphicon-search searchFilterIcon "]');
        //search btn

        //============================Ruchi's Code : RMA-109556 For Policy Coverage======================================================
        this.AssureClaims_ViewAll_PolicyUnits = Selector('[aria-label="View All Policy Units"]');
        //POM for View All Policy Units 
           
        this.AssureClaims_UnitDesc_Link = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM for Unit Description Link
   
        this.AssureClaims_ViewAll_Coverages = Selector('[aria-label="View All Coverage"]');
        //POM for View All Coverages
   
        this.AssureClaims_CovType_Link = Selector("#lastelemchild");
        //POM for Coverage Type Link
       //============================Ruchi's Code : RMA-109556 For Policy Coverage======================================================

    }
}; export default POM_PolicyTracking;
