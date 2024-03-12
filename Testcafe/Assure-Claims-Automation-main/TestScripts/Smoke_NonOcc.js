import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility'
import POM_Home from '../Functional_POM/POM_Home';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_DisabilityPlanManagement from '../Functional_POM/POM_DisabilityPlanManagement'

const DataSTG = require('../DataFiles/DataAutoRegDSN_1.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility()
const Maint_Utility = new Maintenance_Functionality_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Home_POM = new POM_Home();
const DisabilityPlan_Utility = new POM_DisabilityPlanManagement();

var faker = require('faker');

DataSTG.forEach(data => {
  const LoggedInUser = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );


  //******************************************************************************************************************************//
  //JIRA ID OF STORY : RMA-85404,RMA-85680,RMA-97100	
  //Description : 
  //AUTHOR : Diksha Sharma,Yashaswi Mendhekar
  //DEPENDANCY : No
  //PRE-REQUISITE : NONE
  //Preferred Server: 194 Automation DSN1 
  //******************************************************************************************************************************//

  // Global Variable
  var PlanName
  var StrNonOccClaimNumber;

  fixture`Smoke_NonOcc`.beforeEach(async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });

  // ===============================================Disability Plan creation starts here =============================================================================================================
  test('AssureClaims_DisabilityPlanManagement_Test_01', async t => {

    console.log("AssureClaims_Maintenance_DisabilityPlanCreation_Utility Function is Called To Create Disability Management Plan".yellow);
    PlanName = await Maint_Utility.AssureClaims_Maintenance_DisabilityPlanCreation_Utility(data.Insured, data.Country1, data.PlanStatus, data.Premium, data.BankAccount, data.PayPeriodStartDate, data.PreferredPaymentSchedule, data.MonthlyPaymentType, data.PreferredPrintDate, data.PreferredMonthlyDay, data.PreferredDayOfWeekforPayments);
    console.log("New Disability Plan is Created with PlanName: ".green + PlanName);
    await t.wait(4000)

    //=======================================PlanClass Creation Begins ============================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Btn_AddPlan, "Add Plan Class");
    await Nav_Utility.AssureClaims_ElementClick_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_HeaderPlanClass, "HeaderPlanClass")
    await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_ClassName, "Class_Test", "Class Name");
    await Nav_Utility.AssureClaims_ElementClick_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Tab_EligibilityWaiting, "Eligibility/Waiting");
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_EligibleForBenefitsPeriods, data.Period, "Bankaccount Text Box on Maintenance -> Disability Plan Management Page");
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_EligibleForBenefitsFromDateHired, data.FromDateHiredOn, "DateHiredFrom");
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_WaitingPeriodFromDisability, data.WaitingPeriodFromDisability, "Waiting Period From Disability");
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_WaitDurationType, data.WaitDurationType, "Duration type");
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_MaximumDurationOfDisabilityPeriod, data.MaximumDurationOfDisabilityPeriod, "MaximumDuration Of DisabilityPeriod");
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_MaximumDurationOfDisabilityFrom, data.MaximumDurationOfDisabilityPeriodFrom, "MaximumDuration Of DisabilityPeriod From");
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_DetermineWorkWeekDaysType, data.DaysType, "Days Type");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Plan Class Creation Screen");
    //====================================================PlanClass Creation ends ============================================================================================================================
  });

  // ========================================================================Disability Plan creation ends here ===================================================================================================================================


  // ============================================= Non occ claim creation starts here =========================================================================================================================================

  test('AssureClaims_NonOccClaim_Test_02', async t => {
    //================================================================Zone is Switched To Claim Zone=======================================================================================================================
    await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims")
    await t.setNativeDialogHandler(() => true);
    await t.eval(() => location.reload(true));
    await t.wait(10000);

    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    /*=========================================================== Non Occupational Claim Creation Started Here========================================================================================================================================================================================================================================================================================================*/
    console.log("AssureClaims_Non Occupational Claim Function is Called To Create Non Occupational Claim".yellow);
    await Function_Utility.AssureClaims_NonOccClaimCreation(d, d, data.NonOcc_ClaimStatus, data.NonOcc_ClaimType, data.NonOcc_Department, data.NonOcc_PolicyLOB, data.NonOcc_EmployeeNo, data.NonOcc_Jurisdiction, PlanName, data.ClassName, data.DateHired, data.MonthlyRate)
    console.log("New Non Occ Claim is Created with Claim Number: ".green + StrNonOccClaimNumber);

    /*===========================================================Non Occupational Claim Creation Completed Heree========================================================================================================================================================================================================================================================================================================*/
  });
  // ============================================= Non occ claim creation ends here =========================================================================================================================================

});
