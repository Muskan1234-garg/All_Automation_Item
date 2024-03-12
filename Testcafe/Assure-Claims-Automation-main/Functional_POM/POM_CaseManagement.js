import {Selector,t} from 'testcafe';

class POM_CaseManagement{
    constructor(){

    this.AssureClaims_CaseManagement_Btn_AddCaseManagement = (Selector('#Case\\ Management').find('.material-icons.mdi.mdi-briefcase'));
    //Add CaseManagement Button
   
    this.AssureClaims_CaseManagement_Btn_DisabilityType = (Selector('#btn_empdisabilitycode2_openlookup'));
    //Unique Id  Of  Disability Type Lookup Button On RMA Application Case Management Creation Page

    this.AssureClaims_CaseManagement_Lnk_SelectDisabilityType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');

    this.AssureClaims_CaseManagement_Lnk_SelectSubDisabilityType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');

    this.AssureClaims_CaseManagement_Txt_DisabilityType = (Selector('#lookup_empdisabilitycode2'));
    //Unique Id  Of  Disability Type Textbox On RMA Application Case Management Creation Page 

    this.AssureClaims_CaseManagement_Btn_IllnessType = (Selector('#btn_illnesscode2_openlookup'));
   //Unique Id  Of  Illness Type Lookup Button On RMA Application Case Management Creation Page
   
    this.AssureClaims_CaseManagement_Txt_IllnessType = (Selector('#lookup_illnesscode2'));
    //Unique Id  Of  Illness Type Textbox On RMA Application Case Management Creation Page 

    this.AssureClaims_CaseManagement_Txt_HospitalFromDate = (Selector('#hospitaldatefrom'));
    //From date On RMA Application Case Management Creation Page 

    this.AssureClaims_CaseManagement_Txt_HospitalToDate = (Selector('#hospitaldateto'));
    //To date On RMA Application Case Management Creation Page 

    this.AssureClaims_CaseManagement_Btn_InjuriesType = (Selector('#btn_injurieslist2'));
    //Unique Id  Of  Injurry Type Lookup Button On RMA Application Case Management Creation Page

    this.AssureClaims_CaseManagement_Txt_InjuriesType = (Selector('#btn_injurieslist2'));
    //Unique Id  Of  Injury Type Textbox On RMA Application Case Management Creation Page 

    }};
    export default POM_CaseManagement;