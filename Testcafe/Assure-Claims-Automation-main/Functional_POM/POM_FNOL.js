import {Selector} from 'testcafe';

class POM_FNOL{
    constructor(){
        
        this.AssureClaims_FNOL_Txt_AddFNOLReserve = Selector('[aria-label="Add FNOL Reserve"]');
        // POM for Add FNOL Reserve option in Dropdown

        this.AssureClaims_FNOL_Btn_AddNew = Selector('#btnCreate');
        // POM for Add new FNOL Reserve button

        this.AssureClaims_FNOL_Lst_Claimant = Selector('#claimant');
        // POM for Claimant Dropdown

        this.AssureClaims_FNOL_Lst_Policy = Selector('#policy');
        // POM for Policy Dropdown

        this.AssureClaims_FNOL_Lst_Unit = Selector('#unit');
        // POM for Unit Dropdown

        this.AssureClaims_FNOL_Lst_Coverage = Selector('#coverage');
        // POM for Coverage Dropdown

        this.AssureClaims_FNOL_Btn_AddMore = Selector('#btn_saveAndAddMore');
        // POM for Add More 

        this.AssureClaims_FNOL_Btn_Save = Selector('#btn_Save');
        // POM for Save 

        this.AssureClaims_FNOL_Btn_SaveFNOL = Selector('#saveFnol');
        // POM for Save FNOL

        this.AssureClaims_ClaimFNOLReserveSetUp_Data_getText=Selector('[class="ui-grid-viewport ng-isolate-scope"]').find('div').withAttribute('class','ui-grid-cell ng-scope ui-grid-coluiGrid-000D').find('div')
        //POM for gettting text from a row

        this.AssureClaims_ClaimFNOLReserveSetUp_Btn_CloseButton=Selector('#P1')
        //POM for close button on FNOL Reserve Setup screen
        
        // Tushar's Code : RMA-103318
        this.AssureClaims_FNOL_Lst_PolicySystem = Selector('#policySystem');
        // POM for Policy System Dropdown

        this.AssureClaims_FNOL_Lst_CodeType = Selector('#codeType')
        // POM for Code Type Dropdown
        
        this.AssureClaims_FNOL_Btn_PolicyCodeMapping = Selector('#policycodemappingclaimtypegridstate_toolbar_add')
        // POM for Policy Code Mapping Button
        
        this.AssureClaims_FNOL_Lst_CtrlPolicySystem = Selector("#ctrl_policySystem")
        // POM for Policy System Dropdown
        
        this.AssureClaims_FNOL_Lst_CtrlCodeType = Selector("#ctrl_codeType")
        // POM for Code Type Dropdown

        this.AssureClaims_FNOL_Lst_CtrlClaimcodes = Selector("#ctrl_assureClaimsCodes")
        // POM for Claim Codes Dropdown

        this.AssureClaims_FNOL_Lst_CtrlPolicySystemInterfacecodes = Selector("#ctrl_policySystemInterfaceCodes")
        // POM for Policy System Interface codes Dropdown

        this.AssureClaims_FNOL_Btn_ToolbarSave = Selector('#toolbar_save_button')
        // POM for Save Button

        this.AssureClaims_FNOL_Btn_Cancel = Selector('button').withExactText("Cancel")
        // POM for Cancel Button

        this.AssureClaims_FNOL_Lst_PolicyClaimLob = Selector('#policyClaimLob')
        // POM for Policy Claim Lob Dropdown

        this.AssureClaims_FNOL_Lst_CoverageType = Selector('#coverageType')
        // POM for Coverage Type Dropdown

        this.AssureClaims_FNOL_Lst_PolicySystemLossCode = Selector('#polSysLossCode')
        // POM for Policy System Loss Code Dropdown

        this.AssureClaims_FNOL_Lst_LossCodeMapping = Selector('#lossCodeMappingGrid_toolbar_add')
        // POM for Loss Code Mapping Add Button

        this.AssureClaims_FNOL_Lst_CtrlPolicyClaimLob = Selector("#ctrl_policyClaimLob")
        // POM for Policy Claim Lob Dropdown

        this.AssureClaims_FNOL_Lst_CtrlCoverageType = Selector("#ctrl_coverageType")
        // POM for Coverage Type Dropdown

        this.AssureClaims_FNOL_Lst_CtrlPolicySystemLoss = Selector("#ctrl_polSysLossCode")
        // POM for Policy System Loss Code Dropdown

        this.AssureClaims_FNOL_Lst_CtrlClaimLossCode = Selector("#ctrl_claimLossCode")
        // POM for Claim Loss Code Dropdown

        this.AssureClaims_FNOL_Btn_LossCodeMappingAddReserve = Selector('#lossCodeMappingGrid_toolbar_addreserve_button')
        // POM for Loss Code Mapping Add Reserve Button

        this.AssureClaims_FNOL_Btn_LossCodeReservesAdd = Selector('#lossCodeReserves_toolbar_add_button')
        // POM for Loss Code Reserves Add Button

        this.AssureClaims_FNOL_Lst_ReserveType = Selector('#ctrl_reserveType')
        // POM for Reserve Type Dropdown

        this.AssureClaims_FNOL_Lst_ReserveAmount = Selector('#reserveAmount').find('input')
        // POM for Policy System Dropdown

        this.AssureClaims_FNOL_Lst_TypeOfLoss = Selector('#lossType')
        // POM for Type of Loss Dropdown

    }
};export default POM_FNOL;
