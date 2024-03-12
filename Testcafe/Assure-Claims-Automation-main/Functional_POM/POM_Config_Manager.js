import { Selector, t } from 'testcafe';
//const DataIUT1 = require('../DataFiles/DataIUT1.json');
class POM_Config_Manager {
	constructor() {

		// this.AssureClaims_TestCafe_POM_Config_Manager_Screen_Name=(Selector('#all-services-itemec2 > a').find('span').withText('General Claim Parameters'))
		this.AssureClaims_TestCafe_POM_Config_Manager_Screen_Name = (Selector('#all-services-itemec2 > a').find('span'))
		this.AssureClaims_TestCafe_POM_Config_Manager_Tab_Name = (Selector('#mat-tab-label-0-0').find('div'))
		this.AssureClaims_TestCafe_POM_Config_Manager_Tab_Name1 = (Selector('#mat-tab-label-0-1').find('div'))
		this.AssureClaims_POM_TabName = Selector('[class="mat-tab-label-content"]');
		//POM For Tab Name 

		this.AssureClaims_POM_SectionName = Selector('#noteSetting').find('a');
		//POM For Section Name On Utilities Page

		this.AssureClaims_POM_UseDraftInNotes = Selector('#useDraftNotes-input');
		//POM for Use Draft In Notes Setting

		this.AssureClaims_POM_Save = Selector('[role="img"]').withText("save");
		//POM For Save Button

		this.AssureClaims_TestCafe_POM_Config_Manager_Section_Name = (Selector('#mat-tab-content-0-0 > div > div > div.col-md-3.col-sm-12.col-xs-12.mb-4.card-body-left-content.sys-content-section > div > app-list > div').find('ul'))
		this.AssureClaims_TestCafe_POM_Config_Manager_Section_Name1 = (Selector('#mat-tab-content-0-1 > div > div > div.col-md-3.col-sm-12.col-xs-12.mb-4.card-body-left-content.sys-content-section > div > app-list > div').find('ul'))
		this.AssureClaims_TestCafe_POM_Config_Manager_Calculate_Collections_in_Reserve_Balance = (Selector('#calculateCollectionInResBal-input'))
		this.AssureClaims_TestCafe_POM_Config_Manager_Calculate_Collections_in_Incurred_Balance = (Selector('#calculateCollectionInIncurredBal-input'))
		this.AssureClaims_TestCafe_POM_Config_Manager_Logout = Selector('#logoutButton')
		this.AssureClaims_TestCafe_POM_Config_Manager_Logout_LogoutOkBtn = Selector('#confirm-dialog-confirmbtn');
		//Tushar's Code : RMA-102196
		this.AssureClaims_ConfigManager_Btn_Logout = (Selector('#logoutButton'))
		// POM for Logout Button in Configuration Manager


		this.AssureClaims_ConfigManager_Btn_LogoutConfirm = Selector('[class="mdc-dialog__container"]').find('button').withText("Confirm");
		// POM for Confirm Button after Logout in Configuration Manager
		this.AssureClaims_TestCafe_POM_Config_Manager_Claim_Type = (Selector('#includeClaimType-input'))
		// Tushar's Code : RMA-99680
		this.AssureClaims_ConfigManager_Chk_UseSupervisoryApproval = Selector('#supervisoryApproval-input')
		//POM For Use Supervisory Approval Checkbox
		this.AssureClaims_ConfigManager_Chk_PerClaimPayLimitsExceeded = Selector('#perClaimPayLimitsExceeded-input')
		//POM For Per Claim Pay Limits Exceeded Checkbox

		//Muskan's Code : RMA-98974==================================================================================================================================================================
		this.AssureClaims_ConfigManager_Btn_SaveBtn = Selector('[role="img"]').withText("save");
		//POM for save button over configuration manager screen

		this.AssureClaims_ConfigManager_Btn_CloseBtn = Selector('[aria-label="Close"]');
		//POM for close button over configuration manager screen

		this.AssureClaims_ConfigManager_Btn_MenuBtn = Selector('[aria-label="Menu"]')
		//POM for menu button over configuration manager screen

		// Tushar's Code : RMA-98986
		this.AssureClaims_ConfigManager_Txt_CaseManagementPassword = Selector('[aria-labelledby="lbl_activationCodeVal"]')
		//POM for menu button over configuration manager screen

		this.AssureClaims_ConfigManager_Btn_CaseManagementPasswordOk = Selector('[role="img"]').withText("check_circle_outline")
		//POM for menu button over configuration manager screen
		// Tushar's Code : RMA-102173
		this.AssureClaims_ConfigManager_Chk_PayDetailLimitsExceeded = Selector('#payDetailLimitExceed-input')
		//POM For Pay Detail Limits Exceeded Checkbox


		//Muskan's Code : RMA-101853
		this.AssureClaims_ConfigManager_Btn_Save = Selector('[role="img"]').withText("save");
		//POM For Save Button on configuration manager screen

		this.AssureClaims_ConfigManager_Msg_GenericToastMessage = Selector('#toast-container');
		//POM for close button of alert Toast Message on configuration manager screen

		this.AssureClaims_ConfigManager_Btn_ConfirmButtton = Selector('[class="btn btn-confirm"]')
		//POM for confirm button on configuration manager screen

		this.AssureClaims_ConfigManager_Btn_ReloadButtton = Selector('[aria-label="Reload"]')
		//POM for reload button on configuration manager screen
		
		this.AssureClaims_ConfigManager_Txt_ActivationCode = Selector('#activationCodeVal')
		//POM for Activation code textbox on configuration manager screen


		//Muskan's Code : RMA-106953
		this.AssureClaims_ConfigManager_Txt_SearchPage = Selector('#search-box-input')
		//POM for search box over configuration manager screen

		this.AssureClaimsApp_GenericBtn_Btn_ArrowBtn = Selector('[class="mat-select-arrow mat-select-padding"]')
		//POM for arrow button 

		this.AssureClaimsApp_GenericBtn_Btn_ConfirmDelete = Selector('#confirm-dialog-confirmbtn')
		//POM for confirm delete button

		this.AssureClaimsApp_GenericBtn_Btn_Save=Selector('#toolbar_SAVE_button')
		//POM for save button
		
		this.AssureClaimsApp_GenericBtn_Txt_SearchField=Selector('#filter_selection')
		//POM for search field over CM

		this.AssureClaimsApp_GenericBtn_Lst_SelectValue=Selector('[class="mdc-list-item__primary-text"]')
		//POM for select value from search field

		this.AssureClaimsApp_GenericBtn_Txt_ParentCodeText=Selector('[col-id="parent"]')
		//POM for parent code text 
		
		this.AssureClaimsApp_GenericBtn_Btn_MenuButton = Selector('#menuButton')
		// POM for Menu Button 
		
		this.AssureClaims_ConfigManager_Chk_SearchShortCodeAndCodeDescription = Selector('#searchCodeDescription-input')
		// POM for Search On Short Code And Description checkbox

		this.AssureClaims_TestCafe_POM_Config_Manager_Menu = Selector('#menuButton > mat-icon')
		// POM for Menu button
	}
};
export default POM_Config_Manager;
