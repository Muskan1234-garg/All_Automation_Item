import {Selector,t} from 'testcafe';
class POM_PolySearchConfig{
constructor(){
    // RMA-96172 ||SR_TM All
     this.AssureClaims_PolicyInterfaceSetting_Lnk_screen = (Selector('#all-services-itemec2 > a').find('span'))
    //POM for click on Policy Interface Settingr screen.

     this.AssureClaims_PolicySearchConfig_Lnk_screen = (Selector('#downloadsearchconfig')) 
    //POM for click on Policy Interface Settingr Search Configuration screen.

     this.AssureClaims_PolicySearchConfig_Btn_UnselectAll = (Selector('[title="Unselect All"]'))
    // POM for click on unselectAll chekbox button.

     this.AssureClaims_PolicySearchConfig_Txt_PolyNum = (Selector('[id="policynumbertext"]')) 
    //POM for giving the input to the textfields in system name.
    
     this.AssureClaims_PolicySearchConfig_Btn_SelectAll  =  (Selector('[title="Select All"]'))
    // //POM for click on select all checkbox in Search Configuration screen.
   
     this.AssureClaims_PolicySearchConfig_btn_Save = Selector('[role="img"]')
    //POM for click save button on Search Configuration screen.

     this.AssureClaims_PolicySearchConfig_Txt_Screen = Selector('#frmData').find('div').find('div').nth(0).find('p')
    //POM for Txt label on the screen.

     this.AssureClaims_PolicySearchConfig_Chk_PolicyNum = (Selector('#policynumber-input')) 
    //POM for Search Configuration policy number checkbox.
 
    this.AssureClaims_PolicySearchConfig_lbl_PolicyNum_ConfigMgr = (Selector('#cl_lbl_policynumber'))
    //POM for Policy number label control in claim zone..

     this.AssureClaims_PolicySearchConfig_lbl_PolicyNum_Claimzone = (Selector('[name="StagingSearchCriteria"]').find('div').nth(2).find('div').nth(1).find('label'))
     //POM for Policy number label control in claim zone.

     this.AssureClaims_PolicySearchConfig_Btn_PolicyNumDefault = Selector('[class="mat-tooltip-trigger row-icons back-screen css-ihme5j"]')
    //POM for Search Configuration policy number claim zone.

     this.AssureClaims_PolicySearchConfig_Btn_Search = Selector('[role="img"]')
     //POM for Search Configuration Search btn. 

     this.AssureClaims_PolicySearchConfig_Box_SearchInput = (Selector('[class= "search-input-box"]'))
     //POM for Search Configuration Search input box.

     this.AssureClaims_PolySearchConfig_lbl_policynum =  (Selector('#cl_lbl_policynumber'))
     //POM for policy number label.
  }
};
export default POM_PolySearchConfig;