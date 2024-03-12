import { Selector,Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import { ClientFunction } from 'testcafe';
import { Colors}  from 'colors';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_DataCollection from '../Functional_POM/POM_DataCollection';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const DataIUT = require('../DataFiles/DataIUT.json');
const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const Function_Utility = new Functionality_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const DataCollectionConfig_POM = new POM_DataCollection();
const Home_POM = new POM_Home();
const Generic_Claims = new POM_Generic_Claims();
const Config_Manager_POM= new POM_Config_Manager();
const getLocation = ClientFunction(() => window.location.href);
var faker = require('faker');
var AudienceName;
var ConfigurationName;
var GETReporterURL;
var IncidentNumber1;
var DataCollectionFormType1 = "General Claim";


// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-109536
//Description      : Script to automate data collection form submission without approver. when Save As Draft is disabled.
//AUTHOR           : bsharma33
//DEPENDANCY       : None
/* PRE-REQUISITES   : 1. Utilities -> General System Parameters -> Set 'Use Data Collection' : Liscensed [Key generation is required for this step] & Enable Checkbox 'Use Data Collection Template'
2. Utilities -> PowerView Editor-> Create Powerview for Reporter and check 'Data Collection View', after that click on reporter view and check al the forms in them.
3. Utilities -> Token -> Add a new Token with lifetime validity.
*/
//Preferred Server : 194Automation, DSN1 : RM202REG_Test1
//Revision         : 2.0 Parul Sharma 03/11/2024
// *******************************************************************************************************************************

DataIUT.forEach(data => {
const LoggedInUser = Role(data.URL , async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Configuration Manager')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
},{ preserveUrl: true }
);

fixture `DataCollectionSaveAsDraftOff`.beforeEach(async t => {});
   /* Steps performed by DataCollectionSaveAsDraftOff_TC_001 :
        1. Login Into Application with User
        2. Go to config manager -> Token 
        3. Create New Audience
        4. Create new Data Collection Record / Link
		5. Open the Link and Enter Employee Number
        6. Create New General Claim
        7.Save It
        8. Verify that correct Record Number is visbile.
    */  
test('DataCollectionSaveAsDraftOff_TC_001', async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser)
    //================================Audience Creation Started Here====================================================================
    console.log("AssureClaims_Audience_Utility Function is Called To Create Audience".yellow)
    AudienceName = "AutoAudience"+faker.random.alpha({ count: 4, upcase: true })   
    await Function_Utility.AssureClaims_Audience_Utility("Create",AudienceName,data.Origin,"Yes","Yes","","","","NA" )
    console.log("New Audience is Created with Audience Name: ".green+AudienceName)
    //Audience Creation    
   //================================Audience Creation Completed Here====================================================================
   
   //================================Data Collection Configuration Creation Started Here====================================================================
   console.log("Data Collection Configuration Creation Is Started Here".green)     
   ConfigurationName = "Data Collection: GC"+faker.random.alpha({ count: 4, upcase: true })
   await t.switchToMainWindow()
   await t.wait(2000)
   await Nav_Utility.AssureClaims_ElementClick_Utility(Config_Manager_POM.AssureClaims_ConfigManager_Btn_MenuBtn,"View Configurstion Tab On Data Collection Configuration Screen")
   await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Data Collection Configuration");
   await t.wait(5000);
   await t.switchToIframe(Selector("#" + Verification_Msg.AssureClaims_DataCollectionConfigIframe + ""))
   await t.wait(2000);
   console.log(await getLocation());
   console.log("Data Collection Configuration Screen Is Opened Up".green)
   await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Btn_AddNew,"Click on Add New Button On Data Collection Configuration")
   await t.wait(2000)
   await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lnk_CreateANewOne,"Click on Create A New One Link")
   //Step1: Data Collection Info
   await In_Utility.AssureClaims_SetValue_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_Name,ConfigurationName,"Name On Data Collection Configuration Screen")
   await In_Utility.AssureClaims_SetValue_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_Description,ConfigurationName,"Description On Data Collection Configuration Screen")
   await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_Active,"Check","Active Checkbox On Data Collection Configuration Screen")                   
   await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_SaveAsDraft,"UnCheck","Save As Draft Checkbox On Data Collection Configuration Screen")                   
   
   //Step2: View Configuration
   await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Tab_ViewConfiguration,"View Configurstion Tab On Data Collection Configuration Screen")
   await In_Utility.AssureClaims_ElementWebListSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_ReporterView,data.ReporterView,"Reporter View On Data Collection Configuration Screen")
   //Configuration for General Claim
   await In_Utility.AssureClaims_ElementWebListSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_Type,DataCollectionFormType1,"Type "+DataCollectionFormType1+" On Data Collection Configuration Screen")
   await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Btn_Add,"Add Button On Data Collection Configuration Screen")
   await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_Attachment,"Check","Attachment Checkbox On Data Collection Configuration Screen")                    
   await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_Claimant,"Check","Claimant Checkbox On Data Collection Configuration Screen")                     
   await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_Notes,"Check","Notes Checkbox On Data Collection Configuration Screen")                     
   await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_PersonInvolved,"Check","PersonInvolved Checkbox On Data Collection Configuration Screen")                        
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
   await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_AutoAttachChk,"Check","Assign Email Incident Report Checkbox On Data Collection Configuration Screen")                    
   await In_Utility.AssureClaims_SetValueAndTabOut_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_AutoAttachUser,data.Username,"Select users On Data Collection Configuration Screen")
   await t.wait(1000)
   await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_AssignDiary,"Check","Assign Diary Checkbox On Data Collection Configuration Screen")                    
   await In_Utility.AssureClaims_SetValueAndTabOut_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_AssignDiaryToUser,data.Username,"Assign Diary To User/Group On Data Collection Configuration Screen")
   
   //Step5: Page Configuration
   await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Tab_PageConfiguration,"Click on Page Configurstion Tab On Data Collection Configuration")
   await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_Theme,"Theme On Data Collection Configuration")
   await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Lst_SelectedTheme,"Selected Theme On Data Collection Configuration")        
   
   //Step6: Mail Configuration
   await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Tab_MailConfiguration,"Click on Mail Configurstion Tab On Data Collection Configuration")
   await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Tab_NotifyReporter,"Click on Notify Reporter Tab On Data Collection Configuration")
   await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Chk_NotifyReporter,"Check","Notify Reporter Checkbox On Data Collection Configuration Screen")                    
   
   //Save Data Collection Configuration
   await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Btn_Save,"Click on Save Button On Data Collection Configuration")
   await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Data Collection Configuration Screen")
   console.log("New Data Collection Configuration is Created with Name: ".green+ConfigurationName)
   console.log("Data Collection Configuration Creation Is Completed Here".green)
    //========================Data Collection Configuration Creation Completed Here========================================================================================================================================================================
    //=============Get Reporter and Approver Link From Data Collection Configuration Screen Started Here==================================================================================================
    GETReporterURL = await DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_RepoterDXCAssureClaimURL.textContent
    console.log("Reporter link is:"+GETReporterURL)
    await t.wait(2000)
    //=============Get Reporter and Approver Link From Data Collection Configuration Screen Completed Here==================================================================================================
    });
    
      /* Steps performed by DataCollectionSaveAsDraftOff_TC_002 :
        1. Open the Link and Enter Employee Number
        2. Create New General Claim
        3.Save It
        4. Verify that correct Record Number is visbile.
    */  
  test('DataCollectionSaveAsDraftOff_TC_002', async t => {
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
    await t.wait(2000)
    const ele1 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
    await t.expect(ele1.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(ele1,"Claim Status Option")

    await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimType,"Claim Type Lookup")
    await t.wait(5000)
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

});
  /* Steps performed by DataCollectionSaveAsDraftOff_TC_003 :
        1. Login Into Application with User
        2. Go to config manager -> Data Collection Screen 
        3. Delete Data Collection Record / Link
		5. Go to config manager -> Token Screen
        6. Delete the Audience
    */  
test('DataCollectionSaveAsDraftOff_TC_003', async t => {
    //========================Data Collection Configuration Deletion Is Started Here====================================================================
    //Delete the above created Data Collection Configuration
    console.log("Data Collection Configuration: ".green+ConfigurationName+" Deletion is Started Here")
    await t.navigateTo(data.URL) 
    await t.wait(10000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Configuration Manager')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
    await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Data Collection Configuration");
    await t.wait(5000);
    await t.switchToIframe(Selector("#" + Verification_Msg.AssureClaims_DataCollectionConfigIframe + ""))
    await t.wait(2000);
    console.log(await getLocation());
    console.log("Data Collection Configuration Screen Is Opened Up".green)

    await t.wait(5000);
    await In_Utility.AssureClaims_SetValueAndTabOut_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_ConfigNameFilterOnGrid,ConfigurationName,"Configuration Name On Data Collection Configuration List Screen")
    const eleNameOnGrid = DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Txt_ConfigNameOnGrid.withText(ConfigurationName)
    await Verify_Utility.AssureClaims_ElementExist_Utility(eleNameOnGrid)
    console.log("Newly Created Data Collection Configuration with Name: ".green+ConfigurationName+" is displayed on Data Collection Configuration List Screen")

    //Delete the above created Data Collection Configuration
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Select_ConfigRowOnGrid,"Select Created Data Collection Configuration Row")
    await Nav_Utility.AssureClaims_ElementClick_Utility(DataCollectionConfig_POM.AssureClaims_DataCollectionConfig_Btn_Delete,"Click on Delete Button On Data Collection Configuration")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteOK,"Ok Button On Confirm Delete PopUp On Data Collection Configuration");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_DeleteMessage, false, "Data Collection Configuration Screen")
    console.log("Data Collection Configuration is Deleted with Name: ".green+ConfigurationName);
    await t.wait(2000)
    console.log("Data Collection Configuration is Deleted with Name: ".green+ConfigurationName)
    //========================Data Collection Configuration Deletion Is Completed Here====================================================================
       
    //=====================================================Audience Deletion Started Here====================================================================
    console.log("Audience Deletion: ".green+AudienceName+" is Started Here")
    await t.switchToMainWindow()
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Config_Manager_POM.AssureClaims_TestCafe_POM_Config_Manager_Menu,"Click on Home Button On Utilities Screen")
    console.log("AssureClaims_Audience_Utility Function is Called To Delete Audience".yellow) 
    await Function_Utility.AssureClaims_Audience_Utility("Delete",AudienceName,"NA","NA","NA","NA","NA","NA","NA" )
    console.log("Audience is Deleted with Audience Name: ".green+AudienceName)
    //Audience Deletion
    //=====================================================Audience Deletion Completed Here====================================================================    
 
});
});
