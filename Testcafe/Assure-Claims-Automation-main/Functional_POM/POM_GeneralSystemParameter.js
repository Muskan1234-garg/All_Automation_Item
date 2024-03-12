import { database } from 'faker';
import {Selector,t} from 'testcafe';


class POM_GeneralSystemParameter{
constructor(){
 
    this.AssureClaimsApp_Lnk_GenSysParaSetup=Selector('[class="rma-service-list"]').find('span');
    //POM for click on General System Parameter Setup

    // this.AssureClaims_GeneralSystemParameterSetupIframe=Selector('#GeneralSystemParameterSetup.aspx')
    // //POM for Iframe of General System Parameter Setup

    this.AssureClaimsApp_GenSysParaSetup_Btn_Diaries=Selector('#LINKTABSDiaries');
    //POM for click on Diaries/Text Fields

    this.AssureClaimsApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser=Selector('#defAssignedTo-input');
    //POM for check box of Default Assigned to Diary Current User

    this.AssureClaims_GenSysParaSetup_Chk_AllowDiaryPeek=Selector('#allowDiaryPeek-input')
    //POM for Check Box of Allow Diary Peek

    this.AssureClaimsApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities = Selector('#useMultipleAddresses-input')
    //POM for click on Check Box OF Enable Multiple Addresses for Entities

    this.AssureClaimsApp_GenSysParaSetup_Chk_EnableAddModifyAddresses = Selector('#addModifyAddress-input')
    //Check Box for Enable_Add_Modify_Addresses

    this.AssureClaimsApp_GenSysParaSetup_Tab_FundsSettings = Selector('#LINKTABSFundSettings')
    //POM for click on Funds Settings Button

    this.AssureClaimsApp_GenSysParaSetup_Chk_UseSubBankAccounts = Selector('#SubBankAcc')

    this.AssureClaimsApp_GenSysParaSetup_Chk_ActivityLog=Selector('#EnableClaimActivityLog')
    //Check Box for Activity Log
    
    //RMA-87919

    this.AssureClaimsApp_GenSysParaSetup_Btn_Funds=Selector('#LINKTABSFundSettings');
    //POM for click on Funds Setting
    
    this.AssureClaimsApp_GenSysParaSetup_Chk_WorklossRestrictionFromDateToDate=Selector('#AutoCrtWrkLossRest');
    //POM for check box of Create Work Loss and Restriction Records From Funds From/To Dates

    this.AssureClaimsApp_GenSysParaSetup_Btn_BackToUtility=Selector('#dvbreadcrumbtext').find('a').withText('Utilities')
    //POM for Back to Utility Page
     
 //Sai's Code : RMA-87954
 this.AssureClaimsApp_GenSysParaSetup_Chk_AssignCheckStockToSubAccounts = Selector('#AssignSubAcc')
 
     this.AssureClaimsApp_GenSysParaSetup_Tab_FundsSettings = Selector('#LINKTABSFundSettings')
    //POM for click on Funds Settings Button
 
     //Muskan's Code: RMA-90825

    this.AssureClaimsApp_GenSysParaSetup_Chk_UseEntityPaymentApproval=Selector('#UseEntityApproval')
    //Pom for checkbox Use Entity Payemnt Approval
 
    //Sai's Code: RMA-91982
    this.AssureClaimsApp_GenSysParaSetup_Chk_UseEntityPaymentApproval=Selector('#UseEntityApproval')
    //Pom for checkbox Use Entity Payemnt Approval
 
  
   this.AssureClaimsApp_GenSysParaSetup_Clk_Utilities = Selector('#dvbreadcrumbtext').find('ol').find('li').find('a')
 
     //Avinash's Code : RMA-91245
    this.AssureClaimsApp_GenSysParaSetup_Tab_SystemSettings=Selector('#LINKTABSSystemSettings');
    //POM for click on System Settings Button

    this.AssureClaims_GenSysParaSetup_Chk_Use360Globalnet=Selector('#UseDigital360')
    //POM for Check Box of 360 Globalnet

    this.AssureClaims_GenSysParaSetup_Lnk_360GlobalnetUrl=Selector('#Digital360Url')
    //POM for 360 Globalnet URL

    this.AssureClaims_GenSysParaSetup_Lnk_360GlobalnetToken=Selector('#Digital360Token')
    //POM for 360 Globalnet Token
 
    //Sai's Code : RMA-90835
    this.AssureClaimsApp_GenSysParaSetup_Chk_PrioritizeAdjustersHandlingExistingClaims  =Selector('#PrioritizeAdjusters')
    //Check Box for Activity Log
 
    this.AssureClaimsApp_GenSysParaSetup_Chk_AutoAssignAdjuster =Selector('#AutoAssignAdj')
    //Check Box for Activity Log
 
    //Tushar's Code : RMA-94582
    this.AssureClaimsApp_GenSysParaSetup_Chk_UseFNOLReserve = Selector('#FNOLReserve')
    //Check Box for Use FNOL Reserve

    //Sai's Code : RMA-96163
    //this.AssureClaimsApp_GenSysParaSetup_Chk_Enable_Add_Modify_Addresses =Selector('#AddModifyAddress')
    //Check Box for Enable_Add_Modify_Addresses

    //this.AssureClaimsApp_GenSysParaSetup_Chk_Enable_Multiple_Addresses_For_Entities =Selector('#MulAddresses')
    //Check Box for Enable_Add_Modify_Addresses
 
    this.AssureClaimsApp_GenSysParaSetup_Chk_EnableCaseManagment =Selector('#UseCaseMgmt')
    // POM to click on Use Case Managment Button

    this.AssureClaimsApp_GenSysParaSetup_Txt_CaseManagmentPasswod =Selector('#password')
    // POM for use case managment Password Textbox

    this.AssureClaimsApp_GenSysParaSetup_Btn_CaseManagmentOK =Selector('#Ok')
    // POM for OK button
    this.AssureClaims_ConfigManager_Chk_UseSubBankAccounts =Selector('#subBankAcc-input')
   // POM for Use Sub Bank Accounts checkbox

   this.AssureClaims_ConfigManager_Chk_AssignCheckStocksToSubAccounts =Selector('#assignSubAcc-input')
   // POM for Assign Check Stocks To Sub Accounts checkbox

   this.AssureClaims_ConfigManager_Chk_UseMasterBankAccount =Selector('#useMasterBankAcc-input')
   // POM for Use Master Bank Account checkbox
 
    this.AssureClaims_ConfigManager_Chk_UseCaseManagement =Selector('#useCaseMgmt-input')
   // POM for Use Case Management checkbox

   this.AssureClaims_ConfigManager_Chk_EnableClaimActivityLog =Selector('#enableClaimActivityLog-input')
   // POM for Enable Claim Activity Log checkbox
   
   // Tushar's Code : RMA-103620

   this.AssureClaims_GenSysParaSetup_Lst_AutoAssignAdjuster = Selector('#rbAutoAssignAdj')
   // POM for Auto Assign Adjuster Dropdown
   
   this.AssureClaims_GenSysParaSetup_Lst_AutoAssignAdjusterOption = Selector('#rbAutoAssignAdj-panel').find('dxc-select-option').find('span')
   // POM for Auto Assign Adjuster Dropdown Options
   
   this.AssureClaims_GenSysParaSetup_Chk_PrioritizeAdjustersHandlingExistingClaims = Selector('#prioritizeAdj-input')
   //POM for Check Box : Prioritize Adjusters Handling Existing Claims on Configuration Manager
 
   this.AssureClaims_GenSysParaSetup_Chk_UseDraftInNotes = Selector('#useDraftNotes-input')
   //POM for Check Box : Prioritize Adjusters Handling Existing Claims on Configuration Manager
 
}};
export default POM_GeneralSystemParameter;
