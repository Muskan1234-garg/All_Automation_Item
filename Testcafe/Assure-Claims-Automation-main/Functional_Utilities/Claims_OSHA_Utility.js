import { Selector, t } from 'testcafe';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import POM_OSHA from '../Functional_POM/POM_OSHA';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
 
const Nav_Utility = new Navigation_Utility();
const POM_OSHAcsv = new POM_OSHA();
const Inpt_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();

class OSHA_Utility {
    constructor() { }

async AssureClaims_FrameSwitch_OSHAQueue(StrFrameName) {  
    
    await t.switchToIframe(Selector("#" + StrFrameName + ""));
    await t.wait(2000);
    console.log("Switched to "+ StrFrameName.green +" Frame ")
} 

async AssureClaims_User_Search(StrUser) {

    await Nav_Utility.AssureClaims_UserSearch_Utility(StrUser);
    await t.wait(2000);
    console.log(StrUser +" User Selected")
}
// async AssureClaims_MultipleUserSearch_Utility(User1, User2){
//     await Nav_Utility.AssureClaims_UserSearch_Utility(User1);
//     await t.wait(1000);
//     await Nav_Utility.AssureClaims_UserSearch_Utility(User2);
//     console.log(User1 +" as 1st User Selected")
//     console.log(User2 +" as 2nd User Selected")
    
// }

async AssureClaims_OSHA_OutputType_Utility(StrOutputType) {
 
    await t.click (POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_OutputType_DropdownSelection)
    console.log("Output type is clicked")
    await t.click(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_OutputType_DropdownSelection_Lst.withText(StrOutputType));
    console.log(StrOutputType + " is selected")
    } 
async AssureClaims_OSHA_UseReportsatLevel_Utility(StrUseReports) {
 
    await t.click (POM_OSHAcsv.AssureClaimsApp_OSHA_OrgHierarchy_UseReports)
    console.log("Use Reports at Level is clicked")
    await t.click(POM_OSHAcsv.AssureClaimsApp_OSHA_OrgHierarchy_UseReports_DropdownSelection_Lst.withText(StrUseReports));
    console.log(StrUseReports + " is selected")
    } 
async AssureClaims_OSHA_ReportLevel_Utility(StrReportLvl) {
 
    await t.click (POM_OSHAcsv.AssureClaimsApp_OSHA_OrgHierarchy_ReportLevel)
    console.log("Reports At Level is clicked")
    await t.click(POM_OSHAcsv.AssureClaimsApp_OSHA_OrgHierarchy_ReportLevel_DropdownSelection_Lst.withText(StrReportLvl));
    console.log(StrReportLvl + " is selected")
    } 
async AssureClaims_OSHA_YearofReport_Utility(StrYear) {
 
    await t.click (POM_OSHAcsv.AssureClaimsApp_OSHA_ReportingDateInfo_YearofReport_DropdownSelection)
    console.log("Year of Report is clicked")
    await t.click(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportingDateInfo_YearofReport_DropdownSelection_Lst.withText(StrYear));
    console.log(StrYear + " is selected")
    } 
 //==================================================Added script : RMA-109394=======================================================================

    async AssureClaims_OSHA_RunReport_Utility(StrRunReport) {
 
        await t.click (POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_RunReport_DropdownSelection)
        console.log("Run Report is clicked")
        await t.click(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_RunReport_DropdownSelection_Lst.withText(StrRunReport));
        console.log(StrRunReport.green + " is selected")
        } 
    async AssureClaims_OSHA_NotifyType_Utility(StrNotifyType) {
 
        await t.click (POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_NotificationType_DropdownSelection)
        console.log("Notification Type is clicked")
        await t.click(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportInfo_NotificationType_DropdownSelection_Lst.withText(StrNotifyType));
        console.log(StrNotifyType.green + " is selected")
        }
    async AssureClaims_OSHA_Size_Utility(StrCompSize) {
 
        await t.click (POM_OSHAcsv.AssureClaimsApp_OSHA_EstablishmentInfo_CompanySize_DropdownSelection)
        console.log("Size is clicked")
        await t.click(POM_OSHAcsv.AssureClaimsApp_OSHA_EstablishmentInfo_CompanySize_DropdownSelection_Lst.withText(StrCompSize));
        console.log(StrCompSize.green + " is selected")
        }
    async AssureClaims_OSHA_EstablishmentType_Utility(StrEstType) {
 
        await t.click (POM_OSHAcsv.AssureClaimsApp_OSHA_EstablishmentInfo_EstablishmentType_DropdownSelection)
        console.log("Establishment Type is clicked")
        await t.click(POM_OSHAcsv.AssureClaimsApp_OSHA_EstablishmentInfo_EstablishmentType_DropdownSelection_Lst.withText(StrEstType));
        console.log(StrEstType.green + " is selected")
        }
    async AssureClaims_OSHA_InjuryIllness_Utility(StrInjuryIllness) {
 
        await t.click (POM_OSHAcsv.AssureClaimsApp_OSHA_EstablishmentInfo_InjuriesIllnesses_DropdownSelection)
        console.log("Injuries Illnesses is clicked")
        await t.click(POM_OSHAcsv.AssureClaimsApp_OSHA_EstablishmentInfo_InjuriesIllnesses_DropdownSelection_Lst.withText(StrInjuryIllness));
        console.log(StrInjuryIllness.green + " is selected")
        }
    async AssureClaims_OSHA_DownloadJobFile_Utility(JobName, Status1, Status2) {
    let JobSuccess
      try {        
        await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_SearchLatestJob.nth(0),JobName, "Search by JobName")
        await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_SearchLatestJob.nth(2),Status1, "Search by Job Status")
          
        const element = await POM_OSHAcsv.AssureClaimsApp_OSHA_DownloadLatestJob.nth(2).textContent;     
        JobSuccess = (element).includes(Status1);

        if (JobSuccess) {
            await t.click(POM_OSHAcsv.AssureClaimsApp_OSHA_DownloadLatestJob.nth(0))
            console.log("Job Status:", Status1.green);
            console.log(`Lastest Job was clicked and CSV file downloaded sucessfully.`.green)
        }
      } 
      catch (error) {
        console.error('Job Failed, Unable to download CSV file');
      }
    
    if (!JobSuccess) {
        await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_SearchLatestJob.nth(2),Status2, "Search by Job Status")
        var Dt = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("YYYY-MM-DD");
        var Tm = await Generic_Utility.AssureClaims_CurrentTimeInfo_Utility("HH-MM-SS");
        var CurrentDTandTM = Dt +'_'+ Tm;
        await t.takeScreenshot({path:'Error-' + CurrentDTandTM + '.png'});
        console.log("Screenshot has been taken and saved in local".green)
        console.log("Job Status:",Status2.green);
        await t.expect('').ok();
    }
  }
 //======================================================End===========================================================================
} export default OSHA_Utility;
