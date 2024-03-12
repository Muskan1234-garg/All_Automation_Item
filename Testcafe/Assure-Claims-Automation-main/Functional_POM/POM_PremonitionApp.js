import {Selector,t} from 'testcafe';

class POM_PremonitionApp{
    constructor(){

		this.AssureClaims_PremonitionApp_SearchParameters_SearchBtn = (Selector('[class^="mat-icon material-icons notranslate mat-icon-no-co"]').withText('search'));
		//POM for Search Button
		this.AssureClaims_PremonitionApp_SearchParameters_ClearBtn = (Selector('[class^="mat-icon material-icons notranslate mat-icon-no-co"]').withText('clear'));
		//POM for Clear Button
		this.AssureClaims_PremonitionApp_SearchParameters_Accordian = (Selector('mat-expansion-panel-header').find('span').withText('Search Parameters'));
		//POM for Search Parameters Accordian
		this.AssureClaims_PremonitionApp_PreSuitHistory_Btn = (Selector('[class^="mat-icon material-icons notranslate mat-icon-no-co"]').withText('receipt_long'));
		//POM for Pre-Suit History Button
		this.AssureClaims_PremonitionApp_PreSuitHistory_RecordSelection = (Selector('[class="my-css-class"]').find('a'));
		//POM for clicking TransactionID hyperlink
		this.AssureClaims_PremonitionApp_PreSuitSearchResult_RefreshBtn = (Selector('[class^="mat-icon material-icons notranslate mat-icon-no-co"]').withText('refresh'));
		//POM for Clicking Refresh button from History Grid
		this.AssureClaims_PremonitionApp_PreSuitHistory_ExportOptionsBtn = (Selector('[class^="mat-icon material-icons notranslate mat-icon-no-co"]').withText('settings'));
		//POM for Export Options Button
		this.AssureClaims_PremonitionApp_PreSuitHistory_ExportPDFBtn = (Selector('[class^="mat-menu-item ng-star-inserted"]').withText('picture_as_pdf PDF'));
		//POM for Export as PDF button
		this.AssureClaims_PremonitionApp_PreSuitHistory_ExportExcelBtn = (Selector('[class^="mat-menu-item ng-star-inserted"]').withText('insert_drive_file'));
		//POM for Export as Excel button
		this.AssureClaims_PremonitionApp_PreSuitHisotry_Accordian = (Selector('mat-expansion-panel-header').find('span').withText('Pre-Suit Search History'));
		//POM for Pre-Suit History Search Hisotry Accordian
		this.AssureClaims_PremonitionApp_LitigationScanResult_Accordian = (Selector('mat-expansion-panel-header').find('span').withText('Pre-Suit LitigationScan™ Search Result'));
		//POM for Litigation Scan Result Accordian
		this.AssureClaims_PremonitionApp_PreSuitHistory_HomeBtn = (Selector('[class^="mat-icon material-icons notranslate mat-icon-no-co"]').withText('home'));
		//POM for Clicking Home Button
	    
	    	//ANURAG'S CODE :RMA-82420
		this.AssureClaims_PremonitionApp_CheckBocInSuit_StateCheck = Selector('mat-checkbox#undefined.mat-checkbox.mat-accent');
		//POM for Check Box In-Suit Checked
		this.AssureClaims_PremonitionApp_PreSuit_CaseTypeComboBoxSelect = Selector('mat-select#mat-select-0');
		//POM for Case Type ComboBox
		this.AssureClaims_PremonitionApp_PreSuit_CaseTypeSelection = Selector('[role="option"]').find('span');
		//POM for Case Type Selection
		this.AssureClaims_PremonitionApp_LitigationScanResultInSuit_Accordian = (Selector('mat-expansion-panel-header').find('span').withText('In-Suit LitigationScan Search Result'));
		//POM for In-Suit Litigation Scan Result Accordian
		this.AssureClaims_PremonitionApp_LitigationScanResultPreSuit_Accordian = (Selector('mat-expansion-panel-header').find('span').withText('Pre-Suit LitigationScan Search Result'));
		//POM for Pre-Suit Litigation Scan Result Accordian
		
		//END
		

    }
};
export default POM_PremonitionApp;


        
