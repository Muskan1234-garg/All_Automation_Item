import { database } from 'faker';
import {Selector,t} from 'testcafe';


class POM_SMS{

    async AssureClaims_SMS_GenericExpandIcon(Id) {
        return Selector('[ng-click="vm.getNode(node, true);"]').withExactText(Id).parent('li').find('[class^="tree-branch-head"]');
    }
    // Tushar's Code : RMA-102144
    async AssureClaims_SMS_Chk_CustomModuleCheckbox(Id) {
        return Selector('[ng-click="vm.getNode(node, true);"]').withExactText(Id).parent('div').find('[type="checkbox"]');
    }

constructor(){
 
    this.AssureClaims_SMS_Btn_AddNewUser = Selector('#btn_addUser');
    //POM for Add New User on Security Management System Screen

    this.AssureClaims_SMSUser_Txt_LastName=Selector('#txt_lm')
    //POM for LastName on Security Management System Screen

    this.AssureClaims_SMSUser_Txt_FirstName=Selector('#txt_fm')
    //POM for FirstName on Security Management System Screen

   this.AssureClaims_SMSUser_Chk_AccessSMS=Selector('#chk_AccessSms')
   //POM for Check BOX access Security Management System

   this.AssureClaims_SMSUser_Chk_AccessUSP=Selector('#chk_PrivSetup')
   //POM for Check Box access User Privileges Setup

   this.AssureClaims_Generic_AssureClaimsText=(Selector('#exTab3').find('a'))
   //POM for Allowed/Assigned Data-Sources to Login Button

   this.AssureClaims_SMSUser_Rdo_DSNSelection=(Selector('#tab_default_2').find('td'))
   //POM for Radio Button DSN Selection

   this.AssureClaims_SMSChangePassword_Txt_NewPassword=Selector('#txt_newpass')
   //POM for New Password

   this.AssureClaims_SMSChangePassword_Txt_ConPassword=Selector('#txt_con')
   //POM for Conirm Password

   this.AssureClaims_SMSUserAccessPer_Lst_AgsndUserToModuleGroup=Selector('#Select1')
   //POM for Select Assign User To Module Group

   this.AssureClaims_SMSDelete_Btn_Delete=Selector('#btn_del')
   //POM for Select Ok on Assign User To Module Group

   this.AssureClaims_SMSUser_Btn_EditUserPerm=Selector('#btn_edit_userPer')
   //POM for Edit Button on Security Management System Screen

   this.AssureClaims_SMSDS_Txt_SystemLoginName=Selector('#permissionLoginName')
   //POM for System Login Name

   this.AssureClaims_SMSUser_Btn_ExpandUsers=(Selector('[class="tree-branch-head c-iCollapsed"]').nth(0))
   //POM for Users Plus Button

   this.AssureClaims_SMSUser_Btn_Save=Selector('#btn_save')
   //POM for Save Button on User Setting Screen


   this.AssureClaims_SMSUser_Btn_Refresh=Selector('#btnIconRefresh')
   //POM for Refresh Button on Security Management System Screen

   this.AssureClaims_SMSUser_Txt_Address1=Selector('#txtAddress')
   //POM for Address1 on Security Management System Screen

   this.AssureClaims_SMSUser_Txt_Address2=Selector('#inp_address2')
   //POM for Address2 on Security Management System Screen

   this.AssureClaims_SMSUser_Btn_EditUser=Selector('#btn_edit_user');
   //POM for Edit User Setting

   this.AssureClaims_SMSUser_Btn_DeleteUser=Selector('#btnIconDelete')
   //POM for Delete User

   this.AssureClaims_SMSUser_Btn_DeleteConfirmation=Selector('#btn_del')
   //POM for Delete Confirmation

   this.AssureClaims_Generic_Msg_Verify=Selector('[class="errBox layout-margin layout-padding ng-binding layout-align-center-center layout-column"]').withText('*Incorrect Username and Password.')
   //POM for verify msg on login screen

   this.AssureClaims_SMSUser_Btn_UserManager=Selector('#manager')
   //POM for manager drop down

    this.AssureClaims_SMS_Expand_DataSources = Selector('[class="tree-branch-head c-iCollapsed"]').nth(1);
    //POM For Expand button For Datasources branch on SMS Screen

    this.AssureClaims_SMS_Expand_ModuleSecGroups = Selector('[id="Module Security Groups"]').parent('li').find('[class="tree-branch-head c-iCollapsed"]');
    //POM For Expand Button For Module Security Groups Branch On SMS Screen
    this.AssureClaims_SMS_Label_Options = Selector('[ng-click="GoToUserView(node)"]');
    //POM For Generic Label On SMS Screen
    
    this.AssureClaims_SMS_Chk_EnhnDelete = Selector('[ng-click="vm.getNode(node, true);"]').withExactText('Delete').nth(1).parent('div').find('[type="checkbox"]');
    //POM For Delete Checkbox Under Enhanced Notes Node On SMS Screen
    
    this.AssureClaims_SMS_Chk_EnhnEdit = Selector('[ng-click="vm.getNode(node, true);"]').withExactText('Edit').parent('div').find('[type="checkbox"]');
    //POM for Edit Checkbox Under Enhanced Notes Node On SMS Screen
    
    this.AssureClaims_SMS_Btn_SaveSettings = Selector('#btn_Save');
    //POM for Save Button On SMS Screen
    
    //Sai's Code :RMA-90827
    this.AssureClaims_SMS_Expand_RiskMaster = Selector('[class="tree-branch-head"]').nth(1);
    //POM For Expand button For RiskMaster branch on Module Access Permissions  on SMS Screen
    
    this.AssureClaims_SMS_Expand_DSN_RMATest_2 = Selector('[class="tree-branch-head c-iCollapsed"]').nth(3);
    //POM For Expand button For Datasources on DSN(RMATest_2) branch on SMS Screen
    
    //Sai's Updated code : RMA-91580
    this.AssureClaims_SMS_Expand_RiskMaster_FundsManagement = Selector('#moduletree').find('ul').find('li').find('treeitem').find('ul').find('li').nth(0).find('treeitem').find('ul').find('li').nth(23).find('i')
    //POM For Expand button For FundsManagement RiskMaster branch on Module Access Permissions  on SMS Screen
    
    this.AssureClaims_SMS_Expand_RiskMaster_FundsManagement_Transaction = Selector('#moduletree').find('ul').find('li').find('treeitem').find('ul').find('li').nth(0).find('treeitem').find('ul').find('li').nth(23).find('treeitem').find('ul').find('li').nth(18).find('i');
    //POM For Expand button For FundsManagement Transaction RiskMaster branch on Module Access Permissions  on SMS Screen
    
    this.AssureClaims_SMS_Btn_Save = Selector('#btn_Save')
    //Sai's Updated code : RMA-91580
    
    //Sai's Code :RMA-97097 Starts Here(22.4)
    this.AssureClaims_SMS_Chk_AllowEditofEntityTaxID = Selector('[ng-click="vm.getNode(node, true);"]').withExactText('Allow Edit of Entity Tax ID').parent('div').find('[type="checkbox"]');
    //POM for Allow Edit of Entity Tax ID Checkbox Under FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen
    
    this.AssureClaims_SMS_Chk_AllowEditofMailToAddress = Selector('[ng-click="vm.getNode(node, true);"]').withExactText('Allow Edit of Mail To Address').parent('div').find('[type="checkbox"]');
    //POM for Allow Edit of Mail To Address Checkbox Under FundsManagement RiskMaster branch on Module Access Permissions  On SMS Screen
    
    this.AssureClaims_SMS_Chk_AllowEditOfPayToTheOrderOf = Selector('[ng-click="vm.getNode(node, true);"]').withExactText('Allow Edit Of Pay To The Order Of').parent('div').find('[type="checkbox"]');
    //POM for Allow Edit Of Pay To The Order Of Checkbox Under FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen
    
    this.AssureClaims_SMS_Chk_AllowEditOfGeneratePayToTheOrderOf = Selector('[ng-click="vm.getNode(node, true);"]').withExactText('Allow Edit Of Generate Pay To The Order Of').parent('div').find('[type="checkbox"]');
    //POM for Allow Edit Of Generate Pay To The Order Of Checkbox Under FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen
    //Sai's Code :RMA-97097 Ends Here(22.4)
    
    this.AssureClaims_SMS_Chk_Copy_Transaction = Selector('[name="check_allow20"]').nth(1)
    
    // Tushar's Code : RMA-99680
    this.AssureClaims_SMS_Btn_Ok = Selector('#btn_ok')
    //POM For Ok Button for Change of Module Group
    // Tushar's Code : RMA-102144
    this.AssureClaims_SMS_Btn_GrantPermission = Selector('#btn_grant')
    //POM For Ok Button for Change of Module Group
    // Tushar's Code : RMA-109411
    this.AssureClaims_SMS_Btn_Setting = Selector('#btnIconSetting')
        //POM For Ok Button for Setting
    this.AssureClaims_SMS_Chk_EnableSSO = Selector('#Checkbox_EnableSSO')
        //POM For Enable SSO Checkbox
        this.AssureClaims_SMS_Chk_EnableInternalAuth = Selector('#Checkbox_EnableInternalAuth')
        //POM For Enable Internal Authentication checkbox
        this.AssureClaims_SMS_Expand_PermissionToLogin = Selector('[id="Permission To Login"]').parent('li').find('[class="tree-branch-head c-iCollapsed"]');
        //POM For Expand Button For Permission To Login Branch On SMS Screen
        this.AssureClaims_SMS_Lnk_SingleSignOnProviders = Selector('a').withText("Single Sign On Providers");
        //POM For Single Sign On providers Tab
        this.AssureClaims_SMS_Txt_IDPDisplayName = Selector('[class="ng-scope sortable"]').withText("IDP Display Name").find("input");
        //POM For IDP Display Name input in Authentication Provider setting Grid
        // Tushar's Code : RMA-110277
        this.AssureClaims_SMS_Txt_LoginName = Selector('[aria-label="Login Name"]');
        //POM For IDP Display Name input in Authentication Provider setting Grid
    }
};



export default POM_SMS;
