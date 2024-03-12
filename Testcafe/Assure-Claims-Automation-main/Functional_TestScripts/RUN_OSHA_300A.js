import { Selector,Role } from 'testcafe';
import Colors from 'colors';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_OSHA from '../Functional_POM/POM_OSHA';
import Claims_OSHA_Utility from '../Functional_Utilities/Claims_OSHA_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';

const DataIUT = require('../DataFiles/DataIUT.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Inpt_Utility = new Input_Utility();
const POM_OSHAcsv = new POM_OSHA();
const Claims_Osha = new Claims_OSHA_Utility();
const Generic_Utility = new GenericUsages_Utility();

//var faker = require('faker');

DataIUT.forEach(data => {
    fixture`POST_OSHA_300A`.beforeEach(async t => {  
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
});

var Dt; 
var Tm; 
var LatestJob = data.OSHA_300A_ReportName+'-'+data.Username+'-';

test('Filtered_with_ByOrgHierarchy_UseYear_Test_01', async t => {
//Below script will select option By Org-Hierarchy in OSHA Information [By Organizational Hierarchy] and Use Year in OSHA Reporting Date Information [Explicit] Tabs

    //======================================Login Into Application with User started==================================================================
    await t.setPageLoadTimeout(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(10000)
    console.log(`Login Into Application with ${data.Username}`)
    
    //======================================To Run POST OSHA 300A Job==========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Reports.withText("Reports"), "Reports Tab")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportDetails_Lst_DropDownSelection.withText("Osha Reports Queue"), "Osha Reports Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_OshaReportsQueue.withText("Available Reports"), "Available Reports")
    await Claims_Osha.AssureClaims_FrameSwitch_OSHAQueue("smreportsel")
    await Nav_Utility.AssureClaims_VerifyAndClick_Utility(data.Report_Description,POM_OSHAcsv.AssureClaimsApp_OSHA_AvailableReports_Lst.withText(data.OSHA_300A_ReportName), "OSHA 300A Report(where Job needs to Run)")//change report name & report description as per requirement
    await t.wait(2000)
    
    //=========================================Entering Data in Report Info Tab===============================================================
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_ReportTitle, data.Report_Title, "Report Title")//Change Report Title in DataFiles as per requirement
    //===============================================================Added Script: RMA 109394===========================================================================
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_ReportSubtitle, data.Report_Subtitle, "Report SubTitle")//Change Report SubTitle in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_Optional_OutputName, data.Optional_Output_Name, "Optional Output Name")//Change Optional Output Name in DataFiles as per requirement
    //====================================================================End========================================================================================
    await Claims_Osha.AssureClaims_OSHA_OutputType_Utility(data.Output_Type)//Change Output Type in DataFiles as per requirement
    //===============================================================Added Script: RMA 109394===========================================================================
    await Claims_Osha.AssureClaims_OSHA_RunReport_Utility(data.Run_Report)//Change Run Report in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_NotifyType_Utility(data.Notification_Type)//Change Notification Type in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_EmailTo, data.Email_To, "Email/Emails")//Change Email To in DataFiles as per requirement and incase of multiple emails, sepatate them with semicolon ';'
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_Optional_EmailMsg, data.Optional_Email_Message, "Optional Email Message")//Change Optional email message in DataFiles as per requirement
    //======================================================================End=====================================================================================================================

    //=========================================Entering Data in Establishment Information [For Csv report]=============================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("Establishment Information [For Csv report]"), "Est Info Tab")
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_EstablishmentInfo_CompanyName, data.Company_Name, "Company Name")//Change Company Name in DataFiles as per requirement
    //===============================================================Added Script: RMA 109394===========================================================================
    await Claims_Osha.AssureClaims_OSHA_Size_Utility(data.Comapny_Size)//Change Company Size in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_EstablishmentType_Utility(data.Establishment_Type)//Change Establishment Type in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_InjuryIllness_Utility(data.Injuries_Illnesses)//Change Injuries_Illness in DataFiles as per requirement
    //======================================================================End=====================================================================================================================

    //=========================================Entering Data in Drive Report By=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("Drive Report By"), "Drive Report By")
    //===============================================================Added Script: RMA 109394===========================================================================
    //Note - In below two lines, Comment any one line as per requirement{nth(0) - By Event Department[not advised] & nth(1) - By Assigned Department[advised]}
    //await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_DriveReportBy_Option_RadioBtn('[value=true]').nth(0), "By Event Department[not advised]")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_DriveReportBy_Option_RadioBtn('[value=false]').nth(1), "By Assigned Department[advised]")
    //==========================================================================End===========================================================================

    //=========================================Entering Data in Preparer Information=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("Preparer Information"), "Preparer Information")

    //=========================================Entering Data in OSHA Information [By OSHA Establishment]=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Information [By OSHA Establishment]"), "OSHA Information [By OSHA Establishment]")

    //=========================================Entering Data in OSHA Information [By Organizational Hierarchy]=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Information [By Organizational Hierarchy]"),"OSHA Information [By Organizational Hierarchy]")
    //===============================================================Added Script: RMA 109394===========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Information_Radio_Btn('[value=false]').nth(1),"Option-By Org-Hierarchy")
    //=====================================================================End===========================================================================
    await Claims_Osha.AssureClaims_OSHA_UseReportsatLevel_Utility(data.Use_Reports_at_Level)//Change Level Type in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_ReportLevel_Utility(data.Report_At_Level)//Change Level Type in DataFiles as per requirement

    //=========================================Entering Data in OSHA Reporting Date Information [Explicit]=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Reporting Date Information [Explicit]"), "OSHA Reporting Date Information [Explicit]")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportingDateInfo_Option_RadioBtn('[value=useyear]').nth(0), "Use Year")
    await Claims_Osha.AssureClaims_OSHA_YearofReport_Utility(data.Year)//Change Year in DataFiles as per requirement

    //=========================================Entering Data in OSHA Reporting Data Options=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Reporting Data Options"), "OSHA Reporting Data Options")

    //=========================================To Run OSHA Job =========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_RUNandSAVE_Btn.withText("send"), "Run button")
    await t.wait(5000)

    //========================================= To Download Latest Job =========================================================================
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Reports.withText("Reports"), "Reports Tab")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportDetails_Lst_DropDownSelection.withText("Osha Reports Queue"), "Osha Reports Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_OshaReportsQueue.withText("Job Queue"), "Job Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Refresh_Btn.withText("replay"), "Refresh button")
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Refresh_Btn.withText("replay"), "Refresh button")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching("smrepqueue")
    Dt = await Generic_Utility.AssureClaims_CurrentDateInfo_UTC_Utility("YYYYMMDD")
    Tm = await Generic_Utility.AssureClaims_CurrentTimeInfo_UTC_Utility("HH") //If required, Add/Remove MM (Minutes) next to HH (Hours)
    //==================================================Added script : RMA-109394=======================================================================
    var JobName=LatestJob+Dt+Tm
    await Claims_Osha.AssureClaims_OSHA_DownloadJobFile_Utility(JobName, data.Status1, data.Status2)
    //=============================================================End==========================================================================================
    await t.wait(5000)

});
   test('Filtered_with_ByOrgHierarchy_UseDateRange_Test_02', async t => {
//Below script will select option By Org-Hierarchy in OSHA Information [By Organizational Hierarchy] and Use Date Range in OSHA Reporting Date Information [Explicit] Tabs

    //======================================Login Into Application with User started==================================================================
    await t.setPageLoadTimeout(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(10000)
    console.log(`Login Into Application with ${data.Username}`)
    
    //======================================To Run POST OSHA 300A Job==========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Reports.withText("Reports"), "Reports Tab")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportDetails_Lst_DropDownSelection.withText("Osha Reports Queue"), "Osha Reports Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_OshaReportsQueue.withText("Available Reports"), "Available Reports")
    await Claims_Osha.AssureClaims_FrameSwitch_OSHAQueue("smreportsel")
    await Nav_Utility.AssureClaims_VerifyAndClick_Utility(data.Report_Description,POM_OSHAcsv.AssureClaimsApp_OSHA_AvailableReports_Lst.withText(data.OSHA_300A_ReportName), "OSHA 300A Report(Job will Run under this Report)")//change report name & report description as per requirement
    await t.wait(2000)
    
    //=========================================Entering Data in Report Info Tab===============================================================
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_ReportTitle, data.Report_Title, "Report Title")//Change Report Title in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_ReportSubtitle, data.Report_Subtitle, "Report SubTitle")//Change Report SubTitle in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_Optional_OutputName, data.Optional_Output_Name, "Optional Output Name")//Change Optional Output Name in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_OutputType_Utility(data.Output_Type)//Change Output Type in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_RunReport_Utility(data.Run_Report)//Change Run Report in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_NotifyType_Utility(data.Notification_Type)//Change Notification Type in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_EmailTo, data.Email_To, "Email/Emails")//Change Email To in DataFiles as per requirement and incase of multiple emails, sepatate them with semicolon ';'
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_Optional_EmailMsg, data.Optional_Email_Message, "Optional Email Message")//Change Optional email message in DataFiles as per requirement

    //=========================================Entering Data in Establishment Information [For Csv report]=============================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("Establishment Information [For Csv report]"), "Est Info Tab")
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_EstablishmentInfo_CompanyName, data.Company_Name, "Company Name")//Change Company Name in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_Size_Utility(data.Comapny_Size)//Change Company Size in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_EstablishmentType_Utility(data.Establishment_Type)//Change Establishment Type in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_InjuryIllness_Utility(data.Injuries_Illnesses)//Change Injuries_Illness in DataFiles as per requirement

    //=========================================Entering Data in Drive Report By=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("Drive Report By"), "Drive Report By")
    //Note - In below two lines, Comment any one line as per requirement{nth(0) - By Event Department[not advised] & nth(1) - By Assigned Department[advised]}
    //await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_DriveReportBy_Option_RadioBtn('[value=true]').nth(0), "By Event Department[not advised]")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_DriveReportBy_Option_RadioBtn('[value=false]').nth(1), "By Assigned Department[advised]")

    //=========================================Entering Data in Preparer Information=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("Preparer Information"), "Preparer Information")

    //=========================================Entering Data in OSHA Information [By OSHA Establishment]=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Information [By OSHA Establishment]"), "OSHA Information [By OSHA Establishment]")

    //=========================================Entering Data in OSHA Information [By Organizational Hierarchy]=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Information [By Organizational Hierarchy]"),"OSHA Information [By Organizational Hierarchy]")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Information_Radio_Btn('[value=false]').nth(1),"Option-By Org-Hierarchy")
    await Claims_Osha.AssureClaims_OSHA_UseReportsatLevel_Utility(data.Use_Reports_at_Level)//Change Level Type in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_ReportLevel_Utility(data.Report_At_Level)//Change Level Type in DataFiles as per requirement

    //=========================================Entering Data in OSHA Reporting Date Information [Explicit]=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Reporting Date Information [Explicit]"), "OSHA Reporting Date Information [Explicit]")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportingDateInfo_Option_RadioBtn('[value=userange]').nth(1), "Use Date Range")
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportingDateInfo_DateRange_StartDate, data.Start_Date, "Start Date")//Change Start Date in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportingDateInfo_DateRange_EndDate, data.End_Date, "End Date")//Change End Date in DataFiles as per requirement

    //=========================================Entering Data in OSHA Reporting Data Options=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Reporting Data Options"), "OSHA Reporting Data Options")

    //=========================================To Run OSHA Job =========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_RUNandSAVE_Btn.withText("send"), "Run button")
    await t.wait(5000)

    //========================================= To Download Latest Job =========================================================================
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Reports.withText("Reports"), "Reports Tab")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportDetails_Lst_DropDownSelection.withText("Osha Reports Queue"), "Osha Reports Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_OshaReportsQueue.withText("Job Queue"), "Job Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Refresh_Btn.withText("replay"), "Refresh button")
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Refresh_Btn.withText("replay"), "Refresh button")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching("smrepqueue")
    Dt = await Generic_Utility.AssureClaims_CurrentDateInfo_UTC_Utility("YYYYMMDD")
    Tm = await Generic_Utility.AssureClaims_CurrentTimeInfo_UTC_Utility("HH") //If required, Add/Remove MM (Minutes) next to HH (Hours)
    var JobName=LatestJob+Dt+Tm
    await Claims_Osha.AssureClaims_OSHA_DownloadJobFile_Utility(JobName, data.Status1, data.Status2)   
    await t.wait(5000)

});

test('Filtered_with_ByOSHAEstablishment_UseYear_Test_03', async t => {
//Below script will select option By OSHA Establishment in OSHA Information [By OSHA Establishment] and Use Year in OSHA Reporting Date Information [Explicit] Tabs
//======================================Login Into Application with User started==================================================================
    await t.setPageLoadTimeout(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(10000)
    console.log(`Login Into Application with ${data.Username}`)
    
    //======================================To Run POST OSHA 300A Job==========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Reports.withText("Reports"), "Reports Tab")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportDetails_Lst_DropDownSelection.withText("Osha Reports Queue"), "Osha Reports Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_OshaReportsQueue.withText("Available Reports"), "Available Reports")
    await Claims_Osha.AssureClaims_FrameSwitch_OSHAQueue("smreportsel")
    await Nav_Utility.AssureClaims_VerifyAndClick_Utility(data.Report_Description,POM_OSHAcsv.AssureClaimsApp_OSHA_AvailableReports_Lst.withText(data.OSHA_300A_ReportName), "OSHA 300A Report(Job will Run under this Report)")//change report name & report description as per requirement
    await t.wait(2000)
       
    //=========================================Entering Data in Report Info Tab===============================================================
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_ReportTitle, data.Report_Title, "Report Title")//Change Report Title in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_ReportSubtitle, data.Report_Subtitle, "Report SubTitle")//Change Report SubTitle in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_Optional_OutputName, data.Optional_Output_Name, "Optional Output Name")//Change Optional Output Name in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_OutputType_Utility(data.Output_Type)//Change Output Type in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_RunReport_Utility(data.Run_Report)//Change Run Report in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_NotifyType_Utility(data.Notification_Type)//Change Notification Type in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_EmailTo, data.Email_To, "Email/Emails")//Change Email To in DataFiles as per requirement and incase of multiple emails, sepatate them with semicolon ';'
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_Optional_EmailMsg, data.Optional_Email_Message, "Optional Email Message")//Change Optional email message in DataFiles as per requirement
 
    //=========================================Entering Data in Establishment Information [For Csv report]=============================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("Establishment Information [For Csv report]"), "Est Info Tab")
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_EstablishmentInfo_CompanyName, data.Company_Name, "Company Name")//Change Company Name in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_Size_Utility(data.Comapny_Size)//Change Company Size in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_EstablishmentType_Utility(data.Establishment_Type)//Change Establishment Type in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_InjuryIllness_Utility(data.Injuries_Illnesses)//Change Injuries_Illness in DataFiles as per requirement
   
    //=========================================Entering Data in Drive Report By=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("Drive Report By"), "Drive Report By")
    //Note - In below two lines, Comment any one line as per requirement{nth(0) - By Event Department[not advised] & nth(1) - By Assigned Department[advised]}
    //await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_DriveReportBy_Option_RadioBtn('[value=true]').nth(0), "By Event Department[not advised]")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_DriveReportBy_Option_RadioBtn('[value=false]').nth(1), "By Assigned Department[advised]")
  
    //=========================================Entering Data in Preparer Information=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("Preparer Information"), "Preparer Information")
    
    //=========================================Entering Data in OSHA Information [By OSHA Establishment]=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Information [By OSHA Establishment]"), "OSHA Information [By OSHA Establishment]")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Information_Radio_Btn('[value=true]').nth(0),"Option-By OSHA Establishment")
   
    //=========================================Entering Data in OSHA Information [By Organizational Hierarchy]=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Information [By Organizational Hierarchy]"),"OSHA Information [By Organizational Hierarchy]")
    
    //=========================================Entering Data in OSHA Reporting Date Information [Explicit]=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Reporting Date Information [Explicit]"), "OSHA Reporting Date Information [Explicit]")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportingDateInfo_Option_RadioBtn('[value=useyear]').nth(0), "Use Year")
    await Claims_Osha.AssureClaims_OSHA_YearofReport_Utility(data.Year)//Change Year in DataFiles as per requirement
    
    //=========================================Entering Data in OSHA Reporting Data Options=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Reporting Data Options"), "OSHA Reporting Data Options")
   
    //=========================================To Run OSHA Job =========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_RUNandSAVE_Btn.withText("send"), "Run button")
    await t.wait(5000)
    
    //========================================= To Download Latest Job =========================================================================
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Reports.withText("Reports"), "Reports Tab")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportDetails_Lst_DropDownSelection.withText("Osha Reports Queue"), "Osha Reports Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_OshaReportsQueue.withText("Job Queue"), "Job Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Refresh_Btn.withText("replay"), "Refresh button")
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Refresh_Btn.withText("replay"), "Refresh button")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching("smrepqueue")
    Dt = await Generic_Utility.AssureClaims_CurrentDateInfo_UTC_Utility("YYYYMMDD")
    Tm = await Generic_Utility.AssureClaims_CurrentTimeInfo_UTC_Utility("HH") //If required, Add/Remove MM (Minutes) next to HH (Hours)
    var JobName=LatestJob+Dt+Tm
    await Claims_Osha.AssureClaims_OSHA_DownloadJobFile_Utility(JobName, data.Status1, data.Status2) 
    await t.wait(5000)
});
    
test('Filtered_with_ByOSHAEstablishment_UseDateRange_Test_04', async t => {
    //Below script will select option By OSHA Establishment in OSHA Information [By OSHA Establishment] and Use Date Range in OSHA Reporting Date Information [Explicit] Tabs
    
    //======================================Login Into Application with User started==================================================================
    await t.setPageLoadTimeout(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(10000)
    console.log(`Login Into Application with ${data.Username}`)
        
    //======================================To Run POST OSHA 300A Job==========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Reports.withText("Reports"), "Reports Tab")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportDetails_Lst_DropDownSelection.withText("Osha Reports Queue"), "Osha Reports Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_OshaReportsQueue.withText("Available Reports"), "Available Reports")
    await Claims_Osha.AssureClaims_FrameSwitch_OSHAQueue("smreportsel")
    await Nav_Utility.AssureClaims_VerifyAndClick_Utility(data.Report_Description,POM_OSHAcsv.AssureClaimsApp_OSHA_AvailableReports_Lst.withText(data.OSHA_300A_ReportName), "OSHA 300A Report(Job will Run under this Report)")//change report name & report description as per requirement
    await t.wait(2000)
        
    //=========================================Entering Data in Report Info Tab===============================================================
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_ReportTitle, data.Report_Title, "Report Title")//Change Report Title in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_ReportSubtitle, data.Report_Subtitle, "Report SubTitle")//Change Report SubTitle in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_Optional_OutputName, data.Optional_Output_Name, "Optional Output Name")//Change Optional Output Name in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_OutputType_Utility(data.Output_Type)//Change Output Type in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_RunReport_Utility(data.Run_Report)//Change Run Report in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_NotifyType_Utility(data.Notification_Type)//Change Notification Type in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_EmailTo, data.Email_To, "Email/Emails")//Change Email To in DataFiles as per requirement and incase of multiple emails, sepatate them with semicolon ';'
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_Optional_EmailMsg, data.Optional_Email_Message, "Optional Email Message")//Change Optional email message in DataFiles as per requirement
    
    //=========================================Entering Data in Establishment Information [For Csv report]=============================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("Establishment Information [For Csv report]"), "Est Info Tab")
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_EstablishmentInfo_CompanyName, data.Company_Name, "Company Name")//Change Company Name in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_Size_Utility(data.Comapny_Size)//Change Company Size in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_EstablishmentType_Utility(data.Establishment_Type)//Change Establishment Type in DataFiles as per requirement
    await Claims_Osha.AssureClaims_OSHA_InjuryIllness_Utility(data.Injuries_Illnesses)//Change Injuries_Illness in DataFiles as per requirement
    
    //=========================================Entering Data in Drive Report By=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("Drive Report By"), "Drive Report By")
    //Note - In below two lines, Comment any one line as per requirement{nth(0) - By Event Department[not advised] & nth(1) - By Assigned Department[advised]}
    //await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_DriveReportBy_Option_RadioBtn('[value=true]').nth(0), "By Event Department[not advised]")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_DriveReportBy_Option_RadioBtn('[value=false]').nth(1), "By Assigned Department[advised]")
    
    //=========================================Entering Data in Preparer Information=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("Preparer Information"), "Preparer Information")
  
    //=========================================Entering Data in OSHA Information [By OSHA Establishment]=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Information [By OSHA Establishment]"), "OSHA Information [By OSHA Establishment]")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Information_Radio_Btn('[value=true]').nth(0),"Option-By OSHA Establishment")
   
    //=========================================Entering Data in OSHA Information [By Organizational Hierarchy]=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Information [By Organizational Hierarchy]"),"OSHA Information [By Organizational Hierarchy]")

    //=========================================Entering Data in OSHA Reporting Date Information [Explicit]=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Reporting Date Information [Explicit]"), "OSHA Reporting Date Information [Explicit]")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportingDateInfo_Option_RadioBtn('[value=userange]').nth(1), "Use Date Range")
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportingDateInfo_DateRange_StartDate, data.Start_Date, "Start Date")//Change Start Date in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportingDateInfo_DateRange_EndDate, data.End_Date, "End Date")//Change End Date in DataFiles as per requirement
    
    //=========================================Entering Data in OSHA Reporting Data Options=========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Report_Tab_Lst.withText("OSHA Reporting Data Options"), "OSHA Reporting Data Options")
    
    //=========================================To Run OSHA Job =========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_RUNandSAVE_Btn.withText("send"), "Run button")
    await t.wait(5000)
    
    //========================================= To Download Latest Job =========================================================================
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Reports.withText("Reports"), "Reports Tab")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportDetails_Lst_DropDownSelection.withText("Osha Reports Queue"), "Osha Reports Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_OshaReportsQueue.withText("Job Queue"), "Job Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Refresh_Btn.withText("replay"), "Refresh button")
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Refresh_Btn.withText("replay"), "Refresh button")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching("smrepqueue")
    Dt = await Generic_Utility.AssureClaims_CurrentDateInfo_UTC_Utility("YYYYMMDD")
    Tm = await Generic_Utility.AssureClaims_CurrentTimeInfo_UTC_Utility("HH") //If required, Add/Remove MM (Minutes) next to HH (Hours)
    var JobName=LatestJob+Dt+Tm
    await Claims_Osha.AssureClaims_OSHA_DownloadJobFile_Utility(JobName, data.Status1, data.Status2) 
    await t.wait(5000)
})
})
