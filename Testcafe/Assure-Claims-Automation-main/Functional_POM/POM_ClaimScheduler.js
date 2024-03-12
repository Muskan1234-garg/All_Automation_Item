import { Selector, t } from 'testcafe';
class POM_ClaimScheduler {
	constructor() {

	
		//==============================RMA-109672 : Vini's Code starts here=======================================================================

		this.AssureClaimsApp_ClaimScheduler_SchedulerIframe = ('taskmanager')
        //POM for I frame of Scheduler tab

        this.AssureClaimsApp_ClaimScheduler_Scheduler_Tab = Selector('#scheduler_tab')
        //POM for selecting scheduler tab

		this.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_TaskTypeList = Selector('#mat-select-value-21')
		//POM for clicking on Task type list on job details page

		this.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_DropDownSelection = Selector('[class="mat-option-text"]').find('span')
        //POM for selecting Task type from list on job details page

		this.AssureClaimsApp_ClaimScheduler_JobDetails_Txt_TaskName = Selector('#mat-input-2')
		//POM for changing TaskName 

		this.AssureClaimsApp_ClaimScheduler_JobDetails_Lst_SubTaskNameList = Selector('#mat-select-value-23')
		//POM for selecting Sub task name list on job details page
  
		this.AssureClaimsApp_Claimscheduler_JobDetails_Chk_Select_Runimmediately = Selector('#id_isrunimmidiatly-input')
        //POM for Selecting run Immediately checkbox on Job Details Page
 
        this.AssureClaimsApp_ClaimScheduler_JobDetails_Btn_Select_Next = Selector('#scheduler_next_button')
        //POM for Selecting Next Button on Job details page 

		this.AssureClaimsApp_ClaimScheduler_Tasks_Txt_OptionsetName = Selector ('[class="mat-mdc-form-field-infix ng-tns-c15-68"]')
		//POM for Claim scheduler task optionset name

		this.AssureClaimsApp_ClaimScheduler_GenericUsage_Lst_Selection = Selector ('[class="mat-select-arrow mat-select-padding"]')
        //POM for clicking on lookup available in Extract/Import tool

		this.AssureClaimsApp_ClaimScheduler_TabSelectionUnderTask_Tab_ImportExtract = Selector('#mat-tab-label-2-1')
			//POM for selecting different tabs under Import/Extract tool task

		this.AssureClaimsApp_ClaimScheduler_GenericUsage_Btn_SelectValue = Selector('[class="btn-simple"]')
        //POM for selecting lookup value in Extract/Import tool

	 //==============================RMA-109671 : Chhavi's Code starts here=======================================================================
 
 
	 this.AssureclaimsApp_ClaimScheduler_ImportTool_Chk_ReadFileFromConfiguredPath = Selector ('#ctrl_readFileFromConfiguredPath-input')
	 //POM for Selecting Read file from configured path checkbox for import tool task

	 this.AssureClaimsAPP_ClaimScheduler_ImportTool_Txt_FileName = Selector('#ctrl_fileName')
	 //POM for clicking on File name field on import tool task

	 this.AssureClaimsApp_ClaimScheduler_Btn_RoleImage = Selector('[role="img"]')
	 //POM for generic button such as save , refresh

	 this.AssureClaimsAPP_ClaimScheduler_Lnk_TotalJobExecuted = Selector ('#archivejobs')
	 //POM for navigating to total jobs executed on claim scheduler

	 this.AssureClaimsApp_ClaimScheduler_ImportTool_Lst_MBRFileFormat = Selector('[Class="mat-select-value ng-tns-c57-74"]')
	 //POM for selecting file format for MBR Import tool task

	 this.AssureClaimsApp_ClaimScheduler_Importtool_Tab_MBREntityMatch = Selector('[Class="mdc-tab__content"]')
	 //POM for navigating to Entity Match tab for MBR Import tool task
	 
	 //==============================RMA-109825 : Chhavi's Code starts here=======================================================================

	 this.AssureClaimsApp_ClaimScheduler_TotalJobs_Txt_JobStatus = Selector('[class="grid-status-msg"]')
	 //POM for checking the status of the tasks on total job executed page

	 this.AssureClaimsApp_ClaimScheduler_TotalJobs_Btn_JobFile = Selector('[class="mdi mdi-folder-zip grid-jobfiles-icon"]')
	 //POM for clicking on Job File icon on total job executed page

	this.AssureClaimsApp_ClaimScheduler_TotalJobs_Txt_JobName= Selector('[class="ag-cell-value"]')
	//POM for checking the job name from grid on total job executed page
		
       //==============================RMA-109375 : Venkat's Code starts here=======================================================================
		
        this.AssureClaimsApp_ClaimScheduler_Importtool_Tab_HRInterfaceMatchCriteria = Selector('[class="mdc-tab__content"]')
        //POM for navigating to Match Criteria tab for HRInterface Import tool task
	 
	this.AssureClaimsApp_ClaimScheduler_Importtool_Tab_HRInterfaceLimitActions = Selector('[class="mdc-tab__content"]')
	//POM for navigating to Limit Actions tab for HRInterface Import tool task

	this.AssureClaimsApp_ClaimScheduler_Importtool_Tab_HRInterfaceImportFileLength = Selector('[class="mdc-tab__content"]')
	//POM for navigating to Import File Length tab for HRInterface Import tool task
	
		//==============================RMA-109660 : Garima's Code starts here=======================================================================

		this.AssureClaimsApp_ClaimScheduler_ExtractTool_Lst_HRInterfaceExportType = Selector('[Class="mat-select-value ng-tns-c57-70"]')
		//POM for selecting Export Type for HR Interface Export task
		
		//==============================RMA-109643=======================================================================
		
		this.AssureClaimsApp_Claimscheduler_ExtractTool_HRInterface_Chk_Select_TestExport = Selector('#ctrl_testExport-input')
        //POM for Selecting Test Export checkbox on HR Interface Export task
		
		this.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SupplementalTab = Selector('[class="ng-star-inserted"]')
		//POM for selecting Supplemental Field Mapping Tab for HR Interface Payment Export task
		
		this.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SupplementalMapping = Selector('#suppType')
		//POM for selecting Supplemental Mapping dropdown for HR Interface Payment Export task

		this.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_Mapping_RUPaymentField = Selector('#ctrl_paymentExtractDynamicSupplementals_1-input')
	    //POM for mapping RU# Payment Supplementals field 

		this.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_Mapping_AccountPaymentField = Selector('#ctrl_paymentExtractDynamicSupplementals_4-input')
	    //POM for mapping Account# Payment Supplementals field

		this.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_Mapping_SuppField = Selector('#ctrl_paymentExtractDynamicSupplementals_0-input')
	    //POM for mapping Employee, Physician, and Entity Supplementals field

		this.AssureClaimsApp_ClaimScheduler_ExtractTool_HRInterface_SuppField = Selector('div[class*="mat-select-arrow"]')
		//POM for selecting Supplemental Field value on HR Interface Payment Export task 

	}
};
export default POM_ClaimScheduler;
