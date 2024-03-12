import {Selector,t} from 'testcafe';

class POM_Life_Claims{
    constructor(){
        
        this.AssureClaims_LifeClaim_Txt_DateOfEvent = (Selector('#ev_dateofevent').nth(1));
       //POM of Date of Event On General Claim Screen

        this.AssureClaims_LifeClaim_Txt_DateOfClaim = (Selector('#dateofclaim').nth(1));
         //POM of Date of Claim On Life Claim Screen

        this.AssureClaims_LifeClaim_Txt_TimeOfEvent = (Selector('#btn_ev_timeofevent').find('.glyphicon.glyphicon-time'));
         //POM of Time of Event On Life Claim Screen

        this.AssureClaims_LifeClaim_Txt_TimeOfClaim = (Selector('#btn_timeofclaim').find('.glyphicon.glyphicon-time'));
         //POM of Time of Claim On Life Claim Screen

        this.AssureClaims_LifeClaim_Btn_ClaimStatus = (Selector('#btn_claimstatuscode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
         //POM of Claim Status Button On Life Claim Screen

        this.AssureClaims_LifeClaim_Lnk_SelectClaimStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
         //POM of Claim Status Value On Life Claim Screen

        this.AssureClaims_LifeClaim_Btn_ClaimType = (Selector('#btn_claimtypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Claim Type Button On Life Claim Screen

        this.AssureClaims_LifeClaim_Lnk_SelectClaimType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Claim Type Value On Life Claim Screen

        this.AssureClaims_LifeClaim_Btn_PolicyLOBLookup = (Selector('#btn_policyLOBCode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Policy LOB  Button On Life Claim Screen

        this.AssureClaims_LifeClaim_Lnk_SelectPolicyLOB = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Policy LOB  Value On Life Claim Screen

        this.AssureClaims_LifeClaim_Txt_ClaimInfo_Client = (Selector('#lookup_ev_depteid'));
        //POM of Department On Life Claim Screen
        
        this.AssureClaims_LifeClaim_Btn_MannerOfDeathLookup=(Selector('#btn_mannerofdeath_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Manner Of Death Button On Life Claim Screen

        this.AssureClaims_LifeClaim_Lnk_SelectMannerOfDeath= Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Manner Of Death value on Life Claim Screen

        this.AssureClaims_LifeClaim_Btn_CauseOfDeath=(Selector('#btn_causeofdeath_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Cause Of Death Button On Life Claim Screen 

        this.AssureClaims_LifeClaim_Lnk_CauseOfDeath= Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM Of Cause Of Death Value On Life Claim Screen

        this.AssureClaims_LifeClaim_Btn_EstateProbated=(Selector('#btn_estateProbatedcode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Estate Probated Button On Life Claim Screen 

        this.AssureClaims_LifeClaim_Lnk_EstateProbated= Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM Of Estate Probated Value On Life Claim Screen

        this.AssureClaims_LifeClaim_Btn_DeceasedMaritalStatus=(Selector('#btn_deceasedMaritalStatusMethodcode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Deceased Marital Status Button On Life Claim Screen 

        this.AssureClaims_LifeClaim_Lnk_DeceasedMaritalStatus= Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM Of Deceased Marital Value On Life Claim Screen

        this.AssureClaims_LifeClaim_Btn_SpouseLiving=(Selector('#btn_spouseLivingcode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Spouse Living Button On Life Claim Screen 

        this.AssureClaims_LifeClaim_Lnk_SpouseLiving= Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM Of Spouse Living Value On Life Claim Screen

        this.AssureClaims_LifeClaim_Txt_ClaimNumber = Selector('#claimnumber')
        //POM Of Claim Number Field on Life Claim Screen

        this.AssureClaims_LifeClaim_Txt_FileNumber=(Selector('#filenumber'));
        //POM Of File Number Field on LifeClaim Screen

        this.AssureClaims_LifeClaim_Tab_ClaimInfo=(Selector('[role="button"]').find('span').withText('Claim Info'))
        //POM for Selecting Claim Info Accordian On Life Claim Screen

        this.AssureClaims_LifeClaim_Tab_AdditionalClaimInfo=(Selector('[role="button"]').find('span').withText('Additional Claim Information'))
        //POM for Selecting Additional Claim Info On Life Claim Screen

        this.AssureClaims_LifeClaim_Tab_EventDetail=(Selector('[role="button"]').find('span').withText('Event Detail')) 
        //POM for Selecting Event Detail Accordian On Life Claim Screen

        this.AssureClaims_LifeClaim_Tab_ReportedInfo=(Selector('[role="button"]').find('span').withText('Reported Info'))
        //POM for Selecting Reported Info Accordion On Life Claim Screen

        this.AssureClaims_LifeClaim_Tab_LossInformation=(Selector('[role="button"]').find('span').withText('Loss Information'))
        //POM for Selecting Loss Information Accordian On General Claim Screen

        this.AssureClaims_LifeClaim_Tab_Supplementals=(Selector('[role="button"]').find('span').withText('Supplementals'))
        //POM for Selecting Supplementals Accordian On General Claim Screen

        this.AssureClaims_LifeClaim_Btn_PolicyNameLookup=(Selector('[name="multipolicyidPSDownloadbtn"]').find('.glyphicon.glyphicon-search'))
        //POM for lookup button for PolicyName

        this.AssureClaims_LifeClaim_Btn_PolicyOpenButton=(Selector('[ng-click="polLookupVM.openPolicyDetail(event, "lg")"]').find('glyphicon.glyphicon-new-window'))
        //POM for Open button for PolicyName

        this.AssureClaims_LifeClaim_Btn_InternalPolicyLookup=Selector('#sel12\\ ')
        //POM for Search button for PolicyNameOpen        

        this.AssureClaims_LifeClaim_Btn_InternalPolicyName=(Selector('#sel12').find('option'))
        //POM for Select PolicyName

        this.AssureClaims_LifeClaim_Btn_SubmitQuery=Selector('#submitquery')
        //POM for SubmitQuery button On Life Claim Screen

        this.AssureClaims_LifeClaim_Lnk_PolicySearch=Selector('[ng-model="colFilter.term"]')
        //POM for Searching Policy

        this.AssureClaims_LifeClaim_Lnk_InternalPolicyName=(Selector('#docrefresh').find('a'))
        //POM for selecting policy name from submitquery

        this.AssureClaims_LifeClaim_Btn_PolicyPreview=Selector('#Button1')
        //POM for Policy Preview

        this.AssureClaims_LifeClaim_Btn_List=(Selector('#exTab1').find('a'))
        //POM for Interest List

        this.AssureClaims_LifeClaim_Chk_InterestListClaimant=(Selector('#tab_default_2').find('.ng-pristine.ng-untouched.ng-valid.ng-empty').nth(1))
        //POM for CheckBox Claimant
       
        this.AssureClaims_LifeClaim_Chk_UnitList=(Selector('#tab_default_3').find('div').nth(2).find('div').find('table').find('tbody').find('tr').find('td').find('input'))
        //POM for Unit List CheckBox
    
        this.AssureClaims_LifeClaim_Chk_PolicyProperty=(Selector('#tab_default_1').nth(1).find('div').nth(2).find('div').find('table').find('tbody').nth(2).find('tr').find('td').find('input'))
        //POM for Property CheckBox 

        this.AssureClaims_LifeClaim_Btn_InternalPolicySave=(Selector('#btnselect').find('i'))
        //POM for Internal Policy Save

        this.AssureClaims_LifeClaim_Btn_PolicyDownload=(Selector('#A1').find('i'))
        //POM for Policy Download

        this.AssureClaims_LifeClaim_Txt_ClaimType = Selector('#lookup_claimtypecode')
        //POM for Cliamtype

        this.AssureClaims_LifeClaim_Btn_RecordSummary = Selector('[class="commonIcomoon icon-brankic icon-profile"]');
        //pom for record summary btn

        this.AssureClaims_LifeClaim_Btn_Cross = Selector('[ng-click="cancel()"]').find('i');
        //POM for Cross btn

        this.AssureClaims_LifeClaim_Btn_ExecutiveSummary = Selector('[class="commonIcomoon icon-brankic icon-coins"]');
        //POM for ExecutiveSummary

        this.AssureClaims_Payee_Btn_AddPayee = Selector('[aria-label="Add Payee"]');
        //POM For Claimant Add Button On Claimant Creation Page
        
        this.AssureClaims_Payee_Txt_LastName = Selector('#lookup_clmntlastname');
        //POM For Claimant LastName On Claimant Creation Page
        
        this.AssureClaims_Payee_Txt_FirstName = Selector('#clmntfirstname');
        //POM For Claimant FirstName On Claimant Creation Page
        
        this.AssureClaims_Claimant_Txt_MiddleName = Selector('#clmntmiddlename');
        //POM For Claimant MiddleName On Claimant Creation Page
        
        this.AssureClaims_Claimant_Txt_Address1 = Selector('#lookup_clmntaddr1');
        //POM For Claimant Address1 On Claimant Creation Page
        
        this.AssureClaims_Claimant_Txt_Address2 = Selector('#clmntaddr2');
        //POM For Claimant Address2 On Claimant Creation Page
        
        this.AssureClaims_Claimant_Txt_Address3 = Selector('#clmntaddr3');
        //POM For Claimant Address3 On Claimant Creation Page
        
        this.AssureClaims_Claimant_Txt_SocSecNo = Selector('#clmnttaxid');
        //POM For Claimant SSNNumber On Claimant Creation Page
        
        this.AssureClaims_Claimant_Btn_Country = Selector('#btn_clmntcountrycode_openlookup').find('.glyphicon.glyphicon-option-horizontal');
        //POM For Claimant Country OpenLookup Button On Claimant Creation Page
        
        this.AssureClaims_Claimant_Lnk_SelectCountry = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM For Claimant Country Select On Claimant Creation Page
        
        this.AssureClaims_Claimant_Btn_State = Selector('#btn_clmntstateid_openlookup').find('.glyphicon.glyphicon-option-horizontal')
        //POM For Claimant State OpenLookup Button On Claimant Creation Page
        
        this.AssureClaims_Claimant_Lnk_SelectState = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM For Claimant State Select On Claimant Creation Page
        
        this.AssureClaims_Claimant_Txt_City = Selector('#clmntcity');
        //POM For Claimant City On Claimant Creation Page
        
        this.AssureClaims_Claimant_Btn_Save = (Selector('#Save').find('i').withText('save'));
        //POM For Claimant Save Button On Claimant Creation Page
    
        this.AssureClaims_Claimant_Tab_ClaimantInfo=(Selector('[role="button"]').find('span').withText('Claimant Info'))
        //POM for Selecting Claimant Info Accordian On Claimant Screen
    
        this.AssureClaims_Claimant_Tab_ClaimantAttorney=(Selector('[role="button"]').find('span').withText('Claimant Attorney'))
        //POM for Selecting Claimant Attorney Accordian On Claimant Screen
    
        this.AssureClaims_Claimant_Tab_Supplementals=(Selector('[role="button"]').find('span').withText('Supplementals'))
        //POM for Selecting Supplementals Accordian On Claimant Screen
       
        this.AssureClaims_AddPersonInvolved = Selector('#associated-pi i').withText('add');
        //POM for Add Person Involved Button on Claim Page

        this.AssureClaims_AddParty = Selector('[aria-label="Add New Party"]').find('i').withText('add');
        //POM for Add Party Button on Claim Page

        this.AssureClaims_PIParty_Txt_LastName = Selector('#lookup_lastname');
        //POM for PIParty Last Name Textbox On PI=>Party Screen

        this.AssureClaims_PIParty_Txt_FirstName = Selector('#firstname');
        //POM For PIParty First Name Textbox

        this.AssureClaims_PIParty=(Selector('#entitytableid'))

        this.AssureClaims_PIParty_Type=(Selector('#entitytableid').find('option').withText('Beneficiary'))
        //POM For Select PartyType

        this.AssureClaims_Policy_Btn_CoveragesDetails=(Selector('[class="material-icons mdi mdi-security-network"]'))
        //POM For Coverages Details Button

        this.AssureClaims_Policy_CoverageDetails_Chk_Coverage=(Selector('[ng-model="row.entity.includeCoverage"]'))
        //POM For Including Respective Coverage By Clicking On Coverage Checkbox

        this.AssureClaim_Btn_PolicyOpen=(Selector('#multipolicyid').find('.btn.btn-primary').nth(1))

        this.AssureClaims_Policy_CoverageDetails_Confirmpopup_Btn_Ok=(Selector('#btnOK'))
        //POM For OK Button Of Confirmation Popup On Policy Coverage Details Screen

        this.AssureClaims_Btn_Designations=(Selector('[class="material-icons mdi mdi-account-card-details"]'))
        //POM For Designations Button On Claim Screen

        this.AssureClaims_Designation_Btn_AddDesignee=(Selector('[class="material-icons material-icons-clr cursor"]').withText("add"))
        //POM For AddDesignee Button On Designation Screen 

        this.AssureClaims_Designation_Btn_DeleteDesignee=(Selector('[class="material-icons material-icons-clr cursor"]').withText("delete"))
        //POM For DeleteDesignee Button On Designation Screen 

        this.AssureClaims_Btn_AdjudicationList=(Selector('class="material-icons mdi mdi-scale-balance"'))

        this.AssureClaims_Lst_PartiesInvolved=(Selector('#ddlPI'))

        this.AssureClaims_Lst_Policy=(Selector('#ddlPolicy'))

        this.AssureClaims_Lst_Coverage=(Selector('#ddlCoverage'))

        this.AssureClaims_Policy_Txt_PolicyOpen = (Selector('[title="Open"]').find('.glyphicon glyphicon-new-window'))
        
        this.AssureClaims_Policy_Btn_ProductType = (Selector('#btn_productType_openlookup'))
        //Pom For Product Type Lookup Button

        this.AssureClaims_Policy_Txt_ProductType=(Selector('[name="productType"]'))
        //Pom For Product Type Textbox

        this.AssureClaims_Policy_Product_Type_lookup = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span')
        //Pom For Product Type Lookup Option
        
        this.AssureClaims_Policy_Coverage_Details = Selector('[id="Coverages Details"]').find('i');
        //Pom For Coverage Details Button

        this.AssureClaims_Policy_Coverage_Column = (Selector('[class="ui-grid-header-cell ui-grid-clearfix ng-scope ng-isolate-scope ui-grid-coluiGrid-000J"]'))
        //Pom For Edit Button On Include Coverage Screen
        
        this.AssureClaims_Policy_Coverage_Edit_Button=(Selector('#Edit_0'))
        //Pom For Edit Button On Include Coverage Screen

        this.AssureClaims_Policy_Coverage_AnnuityAsOfDate=(Selector('#annuityAsOfDate'))
        //Pom For AnnuityAsOfDate TextBox Incase Of Annuity

        this.AssureClaims_Policy_Coverage_AnnuityDateOfDeath=(Selector('#annuityDateOfDeath'))
        //Pom For AnnuityDateOfDeath TextBox Incase Of Annuity

        this.AssureClaims_Policy_Coverage_DODValue=(Selector('#dodValueWithCode'))
        //Pom For DODValue TextBox Incase Of Annuity

        this.AssureClaims_Policy_Coverage_AsOfValue=(Selector('#asOfValueWithCode'))
        //Pom For AsOfValue TextBox Incase Of Annuity

        this.AssureClaims_Policy_Coverage_PrincipalValue=(Selector('#principalWithCode'))
        //Pom For PrincipalValue TextBox Incase Of Annuity

        this.AssureClaims_Policy_Coverage_Cancel = (Selector('[aria-label="Cancel"]'))
        //Pom For Cancel Button 

        this.AssureClaims_Policy_Coverage_AnnuityQuote_Save_Button=(Selector('#btn_Save'))
        //Pom For Save Button Incase Of NonAnnuity

        this.AssureClaims_Policy_Coverage_FaceAmountWithCode=(Selector('#faceAmountWithCode'))
        //Pom For FaceAmountWithCode TextBox Incase Of NonAnnuity

        this.AssureClaims_Policy_Coverage_DividendsWithCode=(Selector('#dividendsWithCode'))
        //Pom For DividendsWithCode TextBox Incase Of NonAnnuity

        this.AssureClaims_Policy_Coverage_PaidUpAddsWithCode=(Selector('#paidUpAddsWithCode'))
        //Pom For PaidUpAddsWithCode TextBox Incase Of NonAnnuity

        this.AssureClaims_Policy_Coverage_AccidentDeathBenefitWithCode=(Selector('#accidentDeathBenefitWithCode'))
        //Pom For AccidentDeathBenefitWithCode TextBox Incase Of NonAnnuity
        
        this.AssureClaims_Designation_Btnn_AddChildDesignee=(Selector('#Add_1 > i'))
        //Pom For Add Child Designee Button On Designee        
        
        this.AssureClaims_Designation_Txt_Designee_AmountPercent = Selector('[role="gridcell"]').find('div').nth(3)
        //Pom For Amount Percent Textbox On Designee Screen

        this.AssureClaims_Designation_Btn_Designee_RowSave=(Selector('#RowSave_4'))
        //Pom For Save Button On Designee

        //Pom For Filter On Designee Screen
        this.AssureClaims_Designee_Name_Filter = Selector('[role="columnheader"]').find('div').find('span').withText("Designee").parent().nextSibling(1)

        //================================Kiran's Code : RMA-109551 started here================================================================
     
        this.AssureClaims_Lst_Beneficiary=(Selector('#ddlBeneficiary'))
        // pom for clicking on the List for selecting Beneficiary

        this.AssureClaims_Lst_ProductType=(Selector('#ddlProductType'))
        // pom for clicking on the List for selecting ProductType

        this.AssureClaims_CalcPMI = (Selector('#CalcPMI'))
        // pom for clicking on the Calculate PMI Button

        this.AssureClaims_LifeClaim_Txt_ProofOfLossDate = (Selector('#txtproofoflossdate'))
        // pom for Entering Loss Date

        this.AssureClaims_LifeClaim_Txt_ProofOfDeathDate = (Selector('#txtproofofdeathdate'))
        // pom for Entering DeathDate
        
        //================================Kiran's Code : RMA-109551 ended here================================================================

        //================================Shubhams's Code : RMA-109549 started here================================================================

        this.AssureClaims_AdjudicationDetails_Btn_UpdateAdjudication = Selector('#UpdateAdjudication')
        // Pom for clicking on the update Adjudication
        
        this.AssureClaim_UpdateAdjudication_Btn_Save  = Selector('#divSave')
        // pom for clicking on the Update Adjudication save button

        this.AssureClaims_Btn_Adjudicate = Selector('#Adjudicate')
        //Pom for Clicking on the ajudicate button
        
        this.AssureClaim_Adjucationlist_Btn_GoToFinancicals = Selector('#div_GoToReserveListing')
        // pom for clicking on the GoToFinancicals button
    
        this.AssureClaims_AdjudicationList_lnk_PolicyName = Selector('[ng-click="grid.appScope.columnClick(row.entity, this.col.name)"]')
        // pom for clicking on the Popup selecting PolicyName
 
        this.AssureClaim_UpdateAdjudication_Ok_ConfirmBtn = Selector('[role="dialog"]').find('div').nth(1).find('div').nth(1).find('#pnlDefault').find('span')
        // pom for clicking on the ok button of confirm pop up box.....

        this.AssureClaims_Lkp_AdjudicationDecision = Selector('#btn_adjudicationdecision_openlookup')
        // pom for clicking on the AdjudicationDecision button
        
        this.AssureClaim_Lnk_AdjudicationDecision = Selector('[aria-label="Approved"]')
        // pom for clicking on the pop up box Adjudication Decision data
        
      //================================Shubhams's Code : RMA-109549 started here================================================================
      
    }};
    export default POM_Life_Claims;