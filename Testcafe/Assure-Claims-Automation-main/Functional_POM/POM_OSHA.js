import { Selector, t } from 'testcafe';
class POM_OSHA {
	constructor() {

        this.AssureClaimsApp_OSHA_Reports = Selector('#menuBar a')
        //POM for selecting Reports on Menu Bar

        this.AssureClaimsApp_OSHA_ReportDetails_Lst_DropDownSelection = Selector('#menu_ReportsRoot a')
        //POM for selecting Report type from dropdown list 

        this.AssureClaimsApp_OSHA_OshaReports = Selector('[class="dropdownsubmenu"]')
        //POM for selecting type of Post Osha while creating Report

        this.AssureClaimsApp_Post_OSHA_ReportName = Selector('#txt_RportName')
        //POM to enter Report Name in Text field

        this.AssureClaimsApp_Post_OSHA_ReportDescription = Selector('#txt_Description')
        //POM to enter Report Description in Text field

        this.AssureClaimsApp_Users_Lst_DropdownSelecction = Selector('[class="btn-group"]')
        //POM for selecting Users from Dropdown

        this.AssureClaimsApp_Save_Btn = Selector("#I1")
        //POM for clicking Save Button

        this.AssureClaimsApp_OSHA_OshaReportsQueue = Selector('#menu_OshaReportsQueue a')
        //POM for selecting type of Reports/Queue in Osha Reports Queue
        
        this.AssureClaimsApp_OSHA_AvailableReports_Iframe = ('smreportsel')
        //POM for I frame of Available reports

        this.AssureClaimsApp_OSHA_AvailableReports_Lst = Selector('[class="txt-dec cursor ng-binding"]')
        //POM for selecting OSHA Report to Run Job

        this.AssureClaimsApp_OSHA_Report_Tab_Lst = Selector('[class="panel-info ng-scope ng-isolate-scope panel"]')
        //POM for selecting Tabs to enter required data while Running Job

        this.AssureClaimsApp_OSHA_ReportInfo_ReportTitle = Selector('#reporttitle')
        //POM to enter Report title in Report Info Tab

        this.AssureClaimsApp_OSHA_ReportInfo_OutputType_DropdownSelection = Selector('#outtype')
        //POM for selecting Output Type in Report Info Tab

        this.AssureClaimsApp_OSHA_ReportInfo_OutputType_DropdownSelection_Lst = Selector('#outtype option')
        //POM for selecting type of Output Type in Report Info Tab

        this.AssureClaimsApp_OSHA_EstablishmentInfo_CompanyName = Selector('#lblcompanyname')
        //POM to enter Company Name in Establishment Information [For Csv report] Tab

        this.AssureClaimsApp_OSHA_OrgHierarchy_UseReports = Selector('#usereportlevel')
        //POM for selecting Use Reports at Level in Org Hierarchy Tab

        this.AssureClaimsApp_OSHA_OrgHierarchy_UseReports_DropdownSelection_Lst = Selector('#usereportlevel option')
        //POM for selecting type of Level in Dropdown List

        this.AssureClaimsApp_OSHA_OrgHierarchy_ReportLevel = Selector('#reportlevel')
        //POM for selecting Report At Level in Org Hierarchy Tab

        this.AssureClaimsApp_OSHA_OrgHierarchy_ReportLevel_DropdownSelection_Lst = Selector('#reportlevel option')
        //POM for selecting type of Level in Dropdown List

        this.AssureClaimsApp_OSHA_ReportingDateInfo_Option_RadioBtn = Selector('#datemethod')
        //POM for selecting Radio Button [Use by Year/Date Range]

        this.AssureClaimsApp_OSHA_ReportingDateInfo_YearofReport_DropdownSelection = Selector('#yearofreport')
        //POM for Selecting Year of Report in OSHA Reporting Date Information [Explicit]
        
        this.AssureClaimsApp_OSHA_ReportingDateInfo_YearofReport_DropdownSelection_Lst = Selector('#yearofreport option')
        //POM for Selection Year in Dropdown list

        this.AssureClaimsApp_OSHA_ReportingDataOptions = Selector('[type="checkbox"]')
        //POM for selecting different types of Options/Radio buttons in Reporting Data Options

        this.AssureClaimsApp_OSHA_RUNandSAVE_Btn = Selector('[class="icon-div"]')
        //POM for selection Run/Save Buttons

        this.AssureClaimsApp_OSHA_JobQueue_Iframe = ('smrepqueue')
        //POM for I frame of Job Queue

        this.AssureClaimsApp_OSHA_Refresh_Btn = Selector('#dvbreadcrumbscroll i')
        //POM for Selecting Refresh Button
        
        this.AssureClaimsApp_OSHA_DownloadLatestJob = Selector('[class="ui-grid-cell-contents ng-binding ng-scope"]')
        //POM for downloading the Latest Job 
        
        this.AssureClaimsApp_OSHA_SearchLatestJob = Selector('[aria-label="Filter for column"]')
        //POM to Search Job by JobName
		
	//====================================== Added Script : RMA 109394 =====================================================
        this.AssureClaimsApp_OSHA_ReportInfo_ReportSubtitle = Selector('#reportsubtitle')
        //POM to enter data in Report Subtitle in Report Info Tab

        this.AssureClaimsApp_OSHA_ReportInfo_Optional_OutputName = Selector('#outputfilename')
        //POM to enter data in Optional Output Name in Report Info Tab
	
	this.AssureClaimsApp_OSHA_ReportInfo_RunReport_DropdownSelection = Selector('#execreport')
        //POM for selecting RunReport in Report Info Tab

        this.AssureClaimsApp_OSHA_ReportInfo_RunReport_DropdownSelection_Lst = Selector('#execreport option')
        //POM for selecting type of RunReport in Report Info Tab

        this.AssureClaimsApp_OSHA_ReportInfo_NotificationType_DropdownSelection = Selector('#notifytype')
        //POM for selecting NotificationType in Report Info Tab

        this.AssureClaimsApp_OSHA_ReportInfo_NotificationType_DropdownSelection_Lst = Selector('#notifytype option')
        //POM for selecting type of NotificationType in Report Info Tab

        this.AssureClaimsApp_OSHA_ReportInfo_EmailTo = Selector('#notifyemail')
        //POM foe selecting EmailTo to enter required data

        this.AssureClaimsApp_OSHA_ReportInfo_Optional_EmailMsg = Selector('#notifymsg')
        //POM foe selecting Optional Email message to enter required data
		
	this.AssureClaimsApp_OSHA_EstablishmentInfo_CompanySize_DropdownSelection = Selector('#lblsize')
        //POM for selecting CompanySize in Establishment Information [For Csv report] Tab

        this.AssureClaimsApp_OSHA_EstablishmentInfo_CompanySize_DropdownSelection_Lst = Selector('#lblsize option')
        //POM for selecting type of CompanySize in Establishment Information [For Csv report] Tab

        this.AssureClaimsApp_OSHA_EstablishmentInfo_EstablishmentType_DropdownSelection = Selector('#lblestablishmenttype')
        //POM for selecting Establishment Type in Establishment Information [For Csv report] Tab

        this.AssureClaimsApp_OSHA_EstablishmentInfo_EstablishmentType_DropdownSelection_Lst = Selector('#lblestablishmenttype option')
        //POM for selecting type of Establishment Type in Establishment Information [For Csv report] Tab

        this.AssureClaimsApp_OSHA_EstablishmentInfo_InjuriesIllnesses_DropdownSelection = Selector('#lblinjuriesillnesses')
        //POM for selecting Injuries Illnesses in Establishment Information [For Csv report] Tab

        this.AssureClaimsApp_OSHA_EstablishmentInfo_InjuriesIllnesses_DropdownSelection_Lst = Selector('#lblinjuriesillnesses option')
        //POM for selecting type of Injuries Illnesses in Establishment Information [For Csv report] Tab

        this.AssureClaimsApp_OSHA_DriveReportBy_Option_RadioBtn = Selector('#drivebyevent')
        //POM for selecting Radio Button [By Event Department[not advised]/By Assigned Department[advised]] in Drive Report By Tab

        this.AssureClaimsApp_OSHA_Information_Radio_Btn = Selector('#byoshaestablishmentflag')
        //POM for selecting Radio button in OSHA Info[by OSHA Est/by Org Hierarchy]
		
	this.AssureClaimsApp_OSHA_ReportingDateInfo_DateRange_StartDate = Selector('#begindate')
        //POM to enter start date while using Date Range in OSHA Reporting Date Information [Explicit] Tab

        this.AssureClaimsApp_OSHA_ReportingDateInfo_DateRange_EndDate = Selector('#enddate')
        //POM to enter end date while using Date Range in OSHA Reporting Date Information [Explicit] Tab
        //==================================================== End ========================================================
	}
};
export default POM_OSHA;
