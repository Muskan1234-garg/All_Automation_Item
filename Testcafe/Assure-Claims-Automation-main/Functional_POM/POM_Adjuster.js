import {Selector,t} from 'testcafe';
class POM_Adjuster {
    constructor(){
 
    this.AssureClaims_AdjusterIframe = Selector('[id^="claimgc"]');
    //POM for Adjuster Iframe

    this.AssureClaims_AddAdjuster = Selector('#associated-adjuster i').withText('add');
    //POM for Add Adjuster Button on Claim Page

    this.AssureClaims_Adjuster_Txt_LastName = Selector('#lookup_adjlastname');
    //POM for Last Name on Adjuster Page

    this.AssureClaims_Adjuster_Txt_FirstName = Selector('#adjfirstname');
     //POM for First Name on Adjuster Page

    this.AssureClaims_Adjuster_Txt_MiddleName = Selector('#adjmiddlename');
     //POM for Middle Name on Adjuster Page

    this.AssureClaims_Adjuster_Txt_Addr1 = Selector('#adjaddr1');
     //POM for Address1 on Adjuster Page

    this.AssureClaims_Adjuster_Txt_Addr2 = Selector('#adjaddr2');
    //POM for Address2 on Adjuster Page

    this.AssureClaims_Adjuster_Txt_Addr3 = Selector('#adjaddr3');
    //POM for Address3 on Adjuster Page

    this.AssureClaims_Adjuster_Txt_Addr4 = Selector('#adjaddr4');
    //POM for Address4 on Adjuster Page

    this.AssureClaims_Adjuster_Txt_City = Selector('#adjcity');
    //POM for City on Adjuster Page

    this.AssureClaims_Adjuster_Btn_Country = Selector('#btn_adjcountrycode_openlookup').find('.glyphicon.glyphicon-option-horizontal');
    //POM for Country Lookup on Adjuster Page

    this.AssureClaims_Adjuster_Lnk_SelectCountry = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM for Country Value on Adjuster Page

    //this.AssureClaims_Adjuster_Btn_State = Selector('#btn_adjstateid_openlookup').find('.glyphicon glyphicon-option-horizontal')
     this.AssureClaims_Adjuster_Btn_State = Selector('#btn_adjstateid_openlookup');
    //POM for State Lookup on Adjuster Page

    this.AssureClaims_Adjuster_Lnk_SelectState = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM for State Value on Adjuster Page

    this.AssureClaims_Adjuster_Tab_ClaimAdjusterInfo=(Selector('[role="button"]').find('span').withText('Claim Adjuster Information'))
    //POM for Selecting Claim Adjuster Information Accordian On Adjuster Screen

    this.AssureClaims_Adjuster_Tab_Supplementals=(Selector('[role="button"]').find('span').withText('Supplementals'))
    //POM for Selecting Supplementals Accordian On Adjuster Screen
        //===============================================Sai's Code : RMA-96129 Start's Here==============================================================================
      this.AssureClaims_Adjuster_Btn_RiskmasterLogin = (Selector('#btn_rmUserId').find('.glyphicon.glyphicon-option-horizontal'));
    //POM of RiskMaster Login Button On Adjuster Screen
    this.AssureClaims_Adjuster_Btn_Ok = Selector('#complete').find('i').withText('done');
    //POM For click Ok Botton on Payment 

    this.AssureClaimsApp_Adjuster_Txt_LoginName= Selector('[class="ui-grid-header-cell-label ng-binding"]').withText('Login Name').parent('[role="columnheader"]').find('input')
    //POM For Type Text On LoginName Text Box  On Adjuster Screen 
  
    this.AssureClaims_Adjuster_Btn_Users = Selector('#usericon');
    // POM For Select User Button On Adjuster Page
    this.AssureClaims_Generic_DescriptionSearchIconOnLookup = Selector('[class="glyphicon glyphicon-search searchFilterIcon "]');
        //POM for Description Search Button On all Lookup Windows
         //===============================================Sai's Code : RMA-96129 End's Here==============================================================================
        
        
  //Muskan's Code : RMA-107063
  this.AssureClaimsApp_Adjuster_Btn_RiskmasterLoginLookupBtn=Selector("#btn_rmUserId")
  //POM for riskmaster login lookup button

  this.AssureClaimsApp_Adjuster_Btn_AddNewAdjusterButton=Selector('[uib-tooltip="Add New"]')
  //POM for add button over adjuster text box
}
};
export default  POM_Adjuster;
