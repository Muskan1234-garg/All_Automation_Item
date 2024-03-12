import {Selector,t} from 'testcafe';
class POM_DataCollection {
constructor(){

this.AssureClaims_Utility_Lnk_DataCollectionConfiguration = (Selector('[title="Data Collection Configuration"]').find('span').withText('Data Collection Configuration'))
//POM for Link Data Collection Configuration On Utilities

this.AssureClaims_DataCollectionConfig_Btn_AddNew = Selector('[id="divAddNew"]') 
//POM for Add New Button On Data Collection Configuration List

this.AssureClaims_DataCollectionConfig_Btn_Template = Selector('[id="divtempla"]') 
//POM for Template Button On Data Collection Configuration List

this.AssureClaims_DataCollectionConfig_Btn_Delete = Selector('[id="BtnDelete"]')
//POM for Delete Button On Data Collection Configuration List

this.AssureClaims_DataCollectionConfig_Btn_ManageReviewer = Selector('[id="globallink"]')
//POM for Manage Reviewer Button On Data Collection Configuration List

this.AssureClaims_DataCollectionConfig_Lnk_CreateANewOne = Selector('[class="ng-binding"]').withText('Create a new one')
//POM for Create A New One Link On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Tab_DataCollectionInfo=(Selector('[role="button"]').find('span').withText('Data Collection Info'))
//POM for Data Collection Info Tab On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Txt_Name = Selector('#name') 
//POM for Name Text Box On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Txt_Description = Selector('#description') 
//POM for Description Text Box On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Chk_Active = Selector('#activecheckbox')
//POM for Active CheckBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Chk_SaveAsDraft = Selector('#savedraftcheckbox')
//POM for Save As Draft CheckBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Tab_ViewConfiguration=(Selector('[role="button"]').find('span').withText('View Configuration').find('i'))
//POM for View Configuration Tab On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Lst_ReporterView = Selector('[ng-model="addvm.incidentConfig.powerViewId"]')
//POM for Reporter View ListBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Lst_ApproverView = Selector('[ng-model="addvm.incidentConfig.approverPowerViewId"]')
//POM for Approver View ListBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Lst_Type = Selector('[id="incidenttype"]')
//POM for Type ListBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Btn_Add = Selector('[id="BtnAdd"]')
//POM for Add Button On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Chk_Attachment = Selector('[id="att__0"]')
//POM for Attachment CheckBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Chk_Claimant = Selector('[ng-model="choice.isClaimant"]')
//POM for Claimant CheckBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Chk_Notes = Selector('[ng-model="choice.isNote"]')
//POM for Notes CheckBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Chk_NotifyByEmail = Selector('[id="notifyemail_0"]')
//POM for Notify By Email CheckBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Chk_PersonInvolved = Selector('[id="pi_0"]')
//POM for Person Involved CheckBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Tab_LoginConfiguration=(Selector('[role="button"]').find('span').withText('Login Configuration').find('i'))
//POM for Login Configuration Tab On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Lst_LoginType = Selector('[id="logintype"]')
//POM for Login Type ListBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Txt_UserName = Selector('[id="usertitle"]')
//POM for User Name TextBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Lst_UserNameTable = Selector('[ng-model="loginCredential.tableName"]')
//POM for User Name Table ListBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Lst_UserNameField = Selector('[ng-model="loginCredential.columnName"]')
//POM for User Name Field ListBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Tab_AccessConfiguration=(Selector('[role="button"]').find('span').withText('Access Configuration').find('i'))
//POM for Access Configuration Tab On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Txt_LoginUserName = Selector('[id="lookup_signinuser"]')
//POM for Login User Name TextBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Lst_LinkExpirationTime = Selector('[id="audience"]')
//POM for Link Expiration Time ListBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Txt_Reporter = Selector('[id="lookup_requestorsUsers"]')
//POM for Reporter Mail Users TextBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Txt_Approver = Selector('[id="lookup_approver"]')
//POM for Approvers TextBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Chk_AssignDiary = Selector('[id="diarycheckbox"]')
//POM for Assign Diary CheckBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Txt_AssignDiaryToUser = Selector('[id="lookup_diaryuser"]')
//POM for Assign Diary To User TextBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Tab_PageConfiguration=(Selector('[role="button"]').find('span').withText('Page Configuration').find('i'))
//POM for Page Configuration Tab On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Txt_HeaderTitle = Selector('[id="headertitle"]')
//POM for Header Title TextBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Txt_Disclaimer = Selector('[id="disclaimername"]')
//POM for Disclaimer TextBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Lst_Theme = (Selector('[id="ddtheme"]').find('span'))
//POM for Theme ListBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Lst_SelectedTheme =  (Selector('#ddtheme > div.list > ul > li:nth-child(2) > span'))
//POM for Selected Theme On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Txt_LandingText = Selector('[class="fr-element fr-view"]').nth(0).find ('span')
//POM for Landing Text TextBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Tab_MailConfiguration=(Selector('[role="button"]').find('span').withText('Mail/ Notification Configuration').find('i'))
//POM for Mail Configuration Tab On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Chk_NotifyApprover = Selector('[ng-model="mailVM.mailNotificationSetting.notifyApprover"]')
//POM for Notify Approver CheckBox On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Btn_Save = Selector('[id="BtnSave"]')
//POM for Save Button On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Btn_Back = Selector('[id="BtnBack"]')
//POM for Back Button On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Txt_ConfigNameFilterOnGrid = (Selector('[class="ui-grid-filter-container ng-scope"]').nth(0))
//POM for Name Filter On Grid On Data Collection Configuration List Screen

this.AssureClaims_DataCollectionConfig_Txt_ConfigNameOnGrid = Selector('[class="ui-grid-cell-contents ng-scope"]')
//POM for Configuration Name Text On Grid On Data Collection Configuration List Screen

this.AssureClaims_DataCollectionConfig_Select_ConfigRowOnGrid = Selector('[ng-click^="selectButtonClick"]')
//POM for Configuration Name Text On Grid On Data Collection Configuration List Screen

this.AssureClaims_DataCollectionConfig_Txt_RepoterDXCAssureClaimURL = Selector('td').withText('DXC Assure Claim').nextSibling(0)
//POM for DXC Assure Claim Reporter URL On Data Collection Configuration Screen

this.AssureClaims_DataCollectionConfig_Txt_ApproverURL = Selector('[class="tableStyle ng-binding"]').nth(0)
//POM for Approver URL On Data Collection Configuration Screen

this.AssureClaims_DataCollection_Txt_UserName = Selector('[id="username"]')
//POM for User Name TextBox On Data Collection Screen

this.AssureClaims_DataCollection_Btn_SignIn = Selector('[aria-label="Sign in"]')
//POM for Sign In Button On Data Collection Screen

this.AssureClaims_DataCollection_Lnk_FormName = Selector('[class="card-text ng-binding"]')
//POM for Form Name Link On Data Collection Screen

this.AssureClaims_DataCollection_Txt_IncidentNo = Selector('[class="incidentConcludeNumberText ng-binding"]')
//POM for Incident Number Text On Data Collection Screen

this.AssureClaims_DataCollection_Btn_Back = Selector('[class="btn btn-primary ng-scope"]').withText('Back')
//POM for Back Button On Data Collection Screen

this.AssureClaims_DataCollection_Lnk_ReferenceNo = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span')
//POM for Reference Number On Data Collection Drafts Screen

this.AssureClaims_DataCollection_Btn_Approve = Selector('[id="Approve"]')
//POM for Approve Button On Data Collection Screen

this.AssureClaims_DataCollection_Btn_Reject = Selector('[id="Reject"]')
//POM for Reject Button On Data Collection Screen
  
  
//Parul's Code : RMA-RMA-100012
this.AssureClaims_DataCollection_Enable_Dropdown = (Selector('#mat-select-value-5 > span > span'))
//POM for Data Collection Dropdown On General System Parameter Screen

this.AssureClaims_DataCollection_Enable_Dropdown_Option = (Selector('#mat-option-8 > span'))
//POM for Data Collection Dropdown Option On General System Parameter Screen

this.AssureClaims_DataCollection_Activation_Code = Selector(('#activationCodeVal'))
//POM for Activation Code Popup On General System Parameter Setup Screen

this.AssureClaims_DataCollection_Activation_Code_Button = Selector('[class="content"]').find('div').find('mat-icon').withText('check_circle_outline')
 //POM for Activation Code Popup Button On General System Parameter Setup Screen

this.AssureClaims_DataCollection_Template_Checkbox = Selector('#useDataCollectionTemplates > label > div')
//POM for Data Collection Template Checkbox On General System Parameter Setup Screen
}
}
export default POM_DataCollection;
