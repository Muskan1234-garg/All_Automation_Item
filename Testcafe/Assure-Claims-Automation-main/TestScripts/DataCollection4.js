import { Selector,Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import { ClientFunction } from 'testcafe';
import Colors from 'colors'
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_DataCollection from '../Functional_POM/POM_DataCollection';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';
import POM_AdminTracking from '../Functional_POM/POM_AdminTracking';
import POM_Vehicle from '../Functional_POM/POM_Vehicle';

const DataIUT = require('../DataFiles/DataAutoRegDSN_1.json');
const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const Function_Utility = new Functionality_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const DataCollectionConfig_POM = new POM_DataCollection();
const Home_POM = new POM_Home();
const Generic_Claims = new POM_Generic_Claims();
const AdminTrack_POM = new POM_AdminTracking();
const Vehicle_POM = new POM_Vehicle();

const getLocation = ClientFunction(() => window.location.href);
var faker = require('faker');
var AudienceName;
var ConfigurationName;
var GETReporterURL;
var GETApproverURL;
var ReferenceNumber1;
var ReferenceNumber2;
var ReferenceNumber3;
var IncidentNumber1;
var IncidentNumber2;
var IncidentNumber3;
var DataCollectionFormType1 = "General Claim";
var DataCollectionFormType2 = "Certificate Tracking";
var DataCollectionFormType3 = "Vehicle";


// *******************************************************************************************************************************
//JIRA ID OF STORY : Done by Other Team
//Description      : -
//AUTHOR           : Debasmita
//DEPENDANCY       : None
/* PRE-REQUISITES   : 1. Utilities -> General System Parameters -> Set 'Use Data Collection' : Liscensed [Key generation is required for this step] & Enable Checkbox 'Use Data Collection Template'
2. Utilities -> PowerView Editor-> Create Powerview for Reporter and approver and check 'Data Collection View', after that click on reporter view and approver view individually and check al the forms in them.
3. Utilities -> Token -> Add a new Token with lifetime validity.
*/
//Preferred Server : 194Automation, DSN1 : RM202REG_Test1
// *******************************************************************************************************************************

DataIUT.forEach(data => {
const LoggedInUser = Role(data.URL , async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Utilities')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
},{ preserveUrl: true }
);

fixture `DataCollection4`.beforeEach(async t => {});
  
test('TC_001', async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser)
    //================================Audience Creation Started Here====================================================================
    console.log("AssureClaims_Audience_Utility Function is Called To Create Audience".yellow)
    AudienceName = "Audience"+faker.random.alpha({ count: 4, upcase: true })   
    await Function_Utility.AssureClaims_Audience_Utility("Create",AudienceName,data.Origin,"Yes","Yes","","","","NA" )
    console.log("New Audience is Created with Audience Name: ".green+AudienceName)
    //Audience Creation    
   //================================Audience Creation Completed Here====================================================================
   
   //================================Data Collection Configuration Creation Started Here====================================================================
    console.log("Data Collection Configuration Creation Is Started Here".green)     
    ConfigurationName = "Data Collection: GC"+faker.random.alpha({ count: 4, upcase: true })
    await t.switchToMainWindow()
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Btn_HomeOfUtilities,"Click on Home Button On Utilities Screen")
    await t.wait(20000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UtilitiesIframe)      
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_Utility_Lnk_DataCollectionConfiguration,"Click on Data Collection Configuration Link")
    await t.switchToMainWindow()
    await t.wait(2000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_DataCollectionConfigIframe)
    await t.wait(2000)
    console.log(await getLocation())
    console.log("Data Collection Configuration Screen Is Opened Up".green)
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Btn_AddNew,"Click on Add New Button On Data Collection Configuration")
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lnk_CreateANewOne,"Click on Create A New One Link")
    //Step1: Data Collection Info
    await In_Utility.AssureClaims_SetValue_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_Name,ConfigurationName,"Name On Data Collection Configuration Screen")
    await In_Utility.AssureClaims_SetValue_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_Description,ConfigurationName,"Description On Data Collection Configuration Screen")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_Active,"Check","Active Checkbox On Data Collection Configuration Screen")                   
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_SaveAsDraft,"Check","Save As Draft Checkbox On Data Collection Configuration Screen")                   
    
    //Step2: View Configuration
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Tab_ViewConfiguration,"View Configurstion Tab On Data Collection Configuration Screen")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_ReporterView,data.ReporterView,"Reporter View On Data Collection Configuration Screen")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_ApproverView,data.ApproverView,"Approver View On Data Collection Configuration Screen")
    //Configuration for General Claim
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_Type,DataCollectionFormType1,"Type "+DataCollectionFormType1+" On Data Collection Configuration Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Btn_Add,"Add Button On Data Collection Configuration Screen")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_Attachment,"Check","Attachment Checkbox On Data Collection Configuration Screen")                    
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_Claimant,"Check","Claimant Checkbox On Data Collection Configuration Screen")                     
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_Notes,"Check","Notes Checkbox On Data Collection Configuration Screen")                     
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_PersonInvolved,"Check","PersonInvolved Checkbox On Data Collection Configuration Screen")                    
    //Configuration for Admin Tracking
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_Type,DataCollectionFormType2,"Type "+DataCollectionFormType2+" On Data Collection Configuration Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Btn_Add,"Add Button On Data Collection Configuration Screen")
    //Configuration for Vehicle Maintenance
    await In_Utility.AssureClaims_ElementWebListSelectInteger_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_Type,8,"Type "+DataCollectionFormType3+" On Data Collection Configuration Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Btn_Add,"Add Button On Data Collection Configuration Screen")
     
    //Step3: Login Configuration
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Tab_LoginConfiguration,"Click on Login Configurstion Tab On Data Collection Configuration")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_LoginType,"User Name","Login Type On Data Collection Configuration Screen")
    await In_Utility.AssureClaims_SetValue_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_UserName,"EMP NUM","User Name On Data Collection Configuration Screen")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_UserNameTable,"EMPLOYEE","User Name Table On Data Collection Configuration Screen")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_UserNameField,"Employee Number","User Name Field On Data Collection Configuration Screen")
    
    //Step4: Access Configuration
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Tab_AccessConfiguration,"Click on Access Configurstion Tab On Data Collection Configuration")
    await In_Utility.AssureClaims_SetValueAndTabOut_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_LoginUserName,data.Username,"Login User Name On Data Collection Configuration Screen")
    await t.wait(1000)
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_LinkExpirationTime,AudienceName,"Link Expiration Time On Data Collection Configuration Screen")
    await In_Utility.AssureClaims_SetValueAndTabOut_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_Reporter,data.ReporterEmailID,"Reporter Mail Users On Data Collection Configuration Screen")
    await t.wait(1000)
    await In_Utility.AssureClaims_SetValueAndTabOut_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_Approver,data.ApproverEmailID,"Approvers On Data Collection Configuration Screen")
    await t.wait(1000)
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_AssignDiary,"Check","Assign Diary Checkbox On Data Collection Configuration Screen")                    
    await In_Utility.AssureClaims_SetValueAndTabOut_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_AssignDiaryToUser,data.Username,"Assign Diary To User/Group On Data Collection Configuration Screen")
    
    //Step5: Page Configuration
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Tab_PageConfiguration,"Click on Page Configurstion Tab On Data Collection Configuration")
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_Theme,"Theme On Data Collection Configuration")
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_SelectedTheme,"Selected Theme On Data Collection Configuration")        
    
    //Step6: Mail Configuration
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Tab_MailConfiguration,"Click on Mail Configurstion Tab On Data Collection Configuration")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_NotifyApprover,"Check","Notify Approver Checkbox On Data Collection Configuration Screen")                    
    
    //Save Data Collection Configuration
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Btn_Save,"Click on Save Button On Data Collection Configuration")
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Data Collection Configuration Screen")
    console.log("New Data Collection Configuration is Created with Name: ".green+ConfigurationName)
    console.log("Data Collection Configuration Creation Is Completed Here".green)
    //========================Data Collection Configuration Creation Completed Here========================================================================================================================================================================
    //=============Get Reporter and Approver Link From Data Collection Configuration Screen Started Here==================================================================================================
    GETReporterURL = await DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_RepoterDXCAssureClaimURL.textContent
    console.log("Reporter link is:"+GETReporterURL)
    GETApproverURL = await DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_ApproverURL.textContent
    console.log("Approver link is:"+GETApproverURL)
    await t.wait(5000)
    //=============Get Reporter and Approver Link From Data Collection Configuration Screen Completed Here==================================================================================================
    });
    
  test('TC_002', async t => {
    var date = new Date();
    var GenClaimCreation_Txt_DateOfEvent = (date.getMonth()+1)+'/'+(date.getDate()-1)+'/'+date.getFullYear();  
    var GenClaimCreation_Txt_DateOfClaim = GenClaimCreation_Txt_DateOfEvent;
    //=============Navigate To Reporter Link And Enter Login Details To Open the Incident Forms Started Here==================================================================================================
    console.log("Navigate To Reporter Link And Enter Login Details To Open the Incident Forms Started Here");
    await t.navigateTo(GETReporterURL)
    await t.wait(30000)
    await In_Utility.AssureClaims_SetValueAndTabOut_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Txt_UserName,data.DCEmployeeNum,"Login User Name On Data Collection Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Btn_SignIn,"Click on Sign in Button On Data Collection Screen")
    //=============Navigate To Reporter Link And Enter Login Details To Open the Incident Forms Completed Here==================================================================================================
    //======================General Claim Incident Form Submission Started Here==================================================================================================
    console.log("General Claim Incident Form Submission Started Here")
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Lnk_FormName.withText(DataCollectionFormType1),"Click on "+DataCollectionFormType1+" Form Link On Data Collection Screen")
    await t.wait(10000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    await t.wait(5000)
    
    await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent,GenClaimCreation_Txt_DateOfEvent,"Date Of Event")
    await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfClaim,GenClaimCreation_Txt_DateOfClaim,"Date Of Claim")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfEvent,"Time Of Event")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfClaim,"Time Of Claim")
    await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept,data.Department,"Department")
    await t.pressKey('tab')

    await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimStatus,"Claim Status Lookup")
    const ele1 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
    await t.expect(ele1.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(ele1,"Claim Status Option")

    await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimType,"Claim Type Lookup")
    const ele2 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withText(data.GCClaimType).with({ visibilityCheck: true })
    await t.expect(ele2.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(ele2,"Claim Type Option")

    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On General Claim creation Screen")
    await t.switchToMainWindow()
    await t.wait(2000)
    IncidentNumber1 = await DataCollectionConfig_POM.AssureClaims_DataCollection_Txt_IncidentNo.textContent
    await t.wait(2000)
    console.log("General Claim Incident Form is Submitted with Incident Number:"+IncidentNumber1)
    //======================General Claim Incident Form Submission Completed Here==================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Btn_Back,"Back Button On Incident Submission Screen")
    await t.wait(5000)
    //======================Admin Tracking (Certificate Tracking) Incident Form Submission Started Here==================================================================================================
    console.log("Certificate Tracking Incident Form Submission Started Here")
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Lnk_FormName.withText(DataCollectionFormType2),"Click on "+DataCollectionFormType2+" Form Link On Data Collection Screen")
    await t.wait(15000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AdminTrackingFrame)
    await t.wait(5000)
    var JobNum = "JobNum_"+faker.random.number({min:1000,max:9999})  
    await In_Utility.AssureClaims_SetValue_Utility(AdminTrack_POM.AssureClaims_CertTracking_Txt_JobNumber,JobNum,"Job Number")
    var AgencyName = "AgencyName_"+faker.random.alpha({ count: 4, upcase: true })   
    await In_Utility.AssureClaims_SetValue_Utility(AdminTrack_POM.AssureClaims_CertTracking_Txt_AgencyName,AgencyName,"Agency Name")
    
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On "+DataCollectionFormType2+" creation Screen")
    await t.switchToMainWindow()
    await t.wait(2000)
    IncidentNumber2 = await DataCollectionConfig_POM.AssureClaims_DataCollection_Txt_IncidentNo.textContent
    await t.wait(2000)
    console.log("Certificate Tracking Incident Form is Submitted with Incident Number:"+IncidentNumber2)
    //======================Admin Tracking (Certificate Tracking) Incident Form Submission Completed Here==================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Btn_Back,"Back Button On Incident Submission Screen")
    await t.wait(5000)
    //======================Vehicle Incident Form Submission Started Here==================================================================================================
    console.log("Vehicle Incident Form Submission Started Here")
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Lnk_FormName.withText(DataCollectionFormType3),"Click on "+DataCollectionFormType3+" Form Link On Data Collection Screen")
    await t.wait(15000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_VehicleFrame)
    await t.wait(5000);
    var LicenseNumber = faker.random.number({min:10000,max:99999})
    await In_Utility.AssureClaims_SetValue_Utility(Vehicle_POM.AssureClaims_Vehicle_Txt_License_Number,LicenseNumber.toString(),"License Number Textbox On Vehicle Incident Form")
    var VehicleID = "VehID_"+faker.random.number({min:1000,max:9999}) 
    await In_Utility.AssureClaims_SetValue_Utility(Vehicle_POM.AssureClaims_Vehicle_Txt_Vehicle_ID,VehicleID,"Vehicle ID")
    var VehicleMake = "VehMake_"+faker.random.alpha({ count: 4, upcase: true })   
    await In_Utility.AssureClaims_SetValue_Utility(Vehicle_POM.AssureClaims_Vehicle_Txt_Vehicle_Make,VehicleMake,"Vehicle Make")
    var VehicleModel = "VehModl_"+faker.random.alpha({ count: 4, upcase: true })   
    await In_Utility.AssureClaims_SetValue_Utility(Vehicle_POM.AssureClaims_Vehicle_Txt_Vehicle_Model,VehicleModel,"Vehicle Model")

    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On "+DataCollectionFormType3+" creation Screen")
    await t.switchToMainWindow()
    await t.wait(2000)
    IncidentNumber3 = await DataCollectionConfig_POM.AssureClaims_DataCollection_Txt_IncidentNo.textContent
    await t.wait(2000)
    console.log("Vehicle Incident Form is Submitted with Incident Number:"+IncidentNumber3);
    //======================Vehicle Incident Form Submission Completed Here==================================================================================================
});
test('TC_003', async t => {
   //=============Navigate To Approver Link and Approve the General Claim Incident Form is Started Here==================================================================================================
   console.log("General Claim Incident Form Approval Is Started Here")
   //var GETApproverURL='https://dev-assure-claims.dxc-rmcl.com/riskmasterux/claims/#/incident/draft?sysic=f3f111923acbe21486c5b6b75dcd4005a4758527d5d47ab67235e870740fdf9bc467710fb5bc57d74d7c5bad82acabcff1b316ecfaa7fc76e8b25541bc79d03af3d0bb53ad126a1f587dee09c52bccbcf9c23274ca203801584aba78a6d482a0fa177a8e25fc1137&clientId=3f28130450c00018&email=248aba4f78d0d392a114af570c2495f96afdb5e19b5a0506&userid=120caf79bf97dd2c'
   await t.navigateTo(GETApproverURL) 
    await t.wait(10000)
    await t.switchToMainWindow()
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Lnk_ReferenceNo.withText(IncidentNumber1),"Click on Incident "+IncidentNumber1+" Link On Data Collection Draft Screen")
    var newURL = await ClientFunction(() => window.location.href)()
    await t.switchToMainWindow()
    await t.closeWindow()
    await t
        .setNativeDialogHandler(() => true)
        .navigateTo(newURL);
    await t.eval(() => location.reload(true))
    await t.wait(5000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Btn_Approve,"Approve Button On General Claim Incident Form")
    await t.switchToMainWindow()
    ReferenceNumber1 = await DataCollectionConfig_POM.AssureClaims_DataCollection_Txt_IncidentNo.textContent
    await t.wait(10000)
    console.log("Incident Form is Approved and General Claim Is Created with Reference Number:"+ReferenceNumber1);
    //=============Navigate To Approver Link and Approve the General Claim Incident Form is Completed Here==================================================================================================

    //=============Navigate To Approver Link and Approve the Certificate Tracking Incident Form is Started Here==================================================================================================
    console.log("Certificate Tracking Incident Form Approval Is Started Here")
    await t.navigateTo(GETApproverURL)
    await t.wait(10000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Lnk_ReferenceNo.withText(IncidentNumber2),"Click on Incident "+IncidentNumber2+" Link On Data Collection Draft Screen")
    var newURL1 = await ClientFunction(() => window.location.href)()
    await t.switchToMainWindow()
    await t.closeWindow()
    await t
        .setNativeDialogHandler(() => true)
        .navigateTo(newURL1)
        await t.wait(10000)
    await t.eval(() => location.reload(true))
    await t.wait(5000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AdminTrackingFrame)
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Btn_Approve,"Approve Button On Certificate Tracking Incident Form")
    await t.switchToMainWindow()
    ReferenceNumber2 = await DataCollectionConfig_POM.AssureClaims_DataCollection_Txt_IncidentNo.textContent
    await t.wait(10000)
    console.log("Incident Form is Approved and Certificate Tracking Is Created with Reference Number:"+ReferenceNumber2);
     //=============Navigate To Approver Link and Approve the Certificate Tracking Incident Form is Completed Here==================================================================================================      

    //=============Navigate To Approver Link and Approve the Vehicle Incident Form is Started Here==================================================================================================
    console.log("Vehicle Incident Form Approval Is Started Here")
    await t.navigateTo(GETApproverURL)
    await t.wait(10000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Lnk_ReferenceNo.withText(IncidentNumber3),"Click on Incident "+IncidentNumber3+" Link On Data Collection Draft Screen")
    var newURL2 = await ClientFunction(() => window.location.href)()
    await t.switchToMainWindow()
    await t.closeWindow()
    await t
        .setNativeDialogHandler(() => true)
        .navigateTo(newURL2);
    await t.eval(() => location.reload(true))
    await t.wait(10000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_VehicleFrame)
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollection_Btn_Approve,"Approve Button On Vehicle Incident Form")
    await t.switchToMainWindow()
    ReferenceNumber3 = await DataCollectionConfig_POM.AssureClaims_DataCollection_Txt_IncidentNo.textContent
    await t.wait(10000)
    console.log("Incident Form is Approved and Vehicle Maintenance Is Created with Reference Number:"+ReferenceNumber3)
    //=============Navigate To Approver Link and Approve the Vehicle Incident Form is Completed Here==================================================================================================      
});

test('TC_004', async t => {
    //========================Data Collection Configuration Deletion Is Started Here====================================================================
    //Delete the above created Data Collection Configuration
    console.log("Data Collection Configuration: ".green+ConfigurationName+" Deletion is Started Here")
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    await t.switchToMainWindow()
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Btn_HomeOfUtilities,"Click on Home Button On Utilities Screen")
    await t.wait(20000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UtilitiesIframe)      
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_Utility_Lnk_DataCollectionConfiguration,"Click on Data Collection Configuration Link")
    await t.switchToMainWindow()
    await t.wait(2000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_DataCollectionConfigIframe)
    await t.wait(2000)
    console.log(await getLocation())
    console.log("Data Collection Configuration Screen Is Opened Up".green)
    await t.wait(5000);
    await In_Utility.AssureClaims_SetValueAndTabOut_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_ConfigNameFilterOnGrid,ConfigurationName,"Configuration Name On Data Collection Configuration List Screen")
    const eleNameOnGrid = DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_ConfigNameOnGrid.withText(ConfigurationName)
        
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Select_ConfigRowOnGrid,"Select Created Data Collection Configuration Row")
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Btn_Delete,"Click on Delete Button On Data Collection Configuration")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteOK,"Ok Button On Confirm Delete PopUp On Data Collection Configuration")
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_DeleteMessage, false, "Data Collection Configuration Screen")
    console.log("Data Collection Configuration is Deleted with Name: ".green+ConfigurationName)
    //========================Data Collection Configuration Deletion Is Completed Here====================================================================
       
    //=====================================================Audience Deletion Started Here====================================================================
    console.log("Audience Deletion: ".green+AudienceName+" is Started Here")
    await t.switchToMainWindow()
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Btn_HomeOfUtilities,"Click on Home Button On Utilities Screen")
    console.log("AssureClaims_Audience_Utility Function is Called To Delete Audience".yellow) 
    await Function_Utility.AssureClaims_Audience_Utility("Delete",AudienceName,"NA","NA","NA","NA","NA","NA","NA" )
    console.log("Audience is Deleted with Audience Name: ".green+AudienceName)
    //Audience Deletion
    //=====================================================Audience Deletion Completed Here====================================================================    

    console.log("AssureClaims_LogoutFromApplication_Utility Function Is Called To LogOut From Application!!".yellow);
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();        
});
});
