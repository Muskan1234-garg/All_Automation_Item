import { Selector } from 'testcafe';

class POM_VerificationMessage {

      //Generic Messages/Frame ThroughOut Web Links Setup Started Here//
      AssureClaims_WebLinksSetupIframe = "weblinkssetup";
      AssureClaims_SuplementalField_Lnk_Iframe = "supplementaldata";
      AssureClaims_UniqueShortName_ErrorMessage = "Please select a unique Short name for the URL.";
      AssureClaims_Delete_ConfirmMessage = "Deleted Successfully";
      AssureClaims_URLString_ErrorMessage = "The URL must start with http:// or https://";
      //Generic Messages/Frame ThroughOut Web Links Setup Completed Here//
  
    //Generic Messages/Frame ThroughOut application Started Here//
    AssureClaims_Generic_SaveMessage = "Saved Successfully";
    AssureClaims_Generic_RecordDeleteMessage = "Record has been successfully deleted";
    AssureClaims_Generic_NoRecordAvailable = "No Records Available.";
    ExceedReserveLimitsOnHold = "This reserve has been sent for the Supervisor approval and is in the Hold status as Exceeded Reserve Limit";
    ExceedPaymentLimitsOnHold = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval.";
    DuplicateWorklossMsg = "A Work Loss record already exists with in this time frame.";
    DuplicateRestrictionMsg = "You have entered overlapping Restricted dates, a Restricted days record will not be created/updated for the transaction ";
    //Generic Messages/Frame ThroughOut application Completed Here//
    AssureClaims_LifeClaim_ClaimLCIframe = "claimlc_";
    //Maintenance Messages/Frame On Aplication Started Here//
    AssureClaims_Generic_PolicyTrackingIFrame = "policy_";
    AssureClaims_Search_PolicyIframe = "spolicy";
    AssureClaims_Search_PolicyLnkIframe = "policy";
    AssureClaims_Generic_PolicyTrackingSearchIFrame = "blank";
    //-------------------policy system download--------------------------------------------
    AssureClaims_Generic_policysysdownload = "policysysdownload";
    //---------------------------end here-----------------------------
    AssureClaims_GenericClaim_ClaimGCIframe = "claimgc";
    AssureClaims_PropertyClaim_ClaimPCIframe = "claimpc";
    AssureClaims_VehicleAccident_ClaimVCIframe = "claimva";
    AssureClaims_TransactionHistory_ClaimGCIframe = "externalapp";
    AssureClaims_Funds_Transaction_ClaimGCIframe = "transaction";
    AssureClaims_ClearChecks_FundsIframe = "clearchecks"
    AssureClaims_ResetPrintedCheck_FundsIframe = "resetchecks"
    AssureClaims_UnClearChecks_FundsIframe = "unclearchecks"
    AssureClaims_Search_ClaimIframe = "sclaim";
    AssureClaims_Search_ClaimIframe1 = "sclaim_";
    AssureClaims_VoidCheck_FundsIframe = "voidchecks"
    AssureClaims_GenericClaim_ClaimGCIframe0 = "claimgc_";
    AssureClaims_WorkerCompensation_ClaimWCIFrame = "claimwc";
    AssureClaims_Search_FundsIframe = "sfunds";
    AssureClaims_Search_Funds_PaymentIframe = "payment";
    AssureClaims_CombinedPayments_FundsIframe = "combinedpayment_"
    AssureClaims_PropertyClaim_PrportyIdSearchFrame = "blank";
    Assureclaims_Generic_CommentFrame = "externalapp";
    AssureClaims_GenericClaim_EventFrame = "event";
    Assureclaims_Generic_CommentSummaryFrame = "externalapp";
    AssureClaims_Generic_EmployeeFrame = "employees";
    AssureClaims_Generic_MedStaffFrame = "staffs";
    AssureClaims_Generic_PatientFrame = "patients";
    AssureClaims_Generic_DriverFrame = "driver";
    AssureClaims_Generic_EntityFrame = "entities";
    Assureclaims_Generic_DiaryFrame = "diarylist";
    AssureClaims_DairyIframe = "externalapp";
    AssureClaims_Generic_DiaryUtilitiesFrame = "WPAUtil";
    AssureClaims_SupervisoryApprovalIframe = "trans";
    AssureClaims_PendingTransIframe = "mypendingtransaction";
    // Sai's code: RMA-97883 Starts Here
    AssureClaims_Generic_VehicleFrameAfterLinkClicked = "vehicles";
    // Sai's code: RMA-97883 Ends Here
    AssureClaims_Generic_VehicleSearchFrame = "svehicle";
    AssureClaims_Generic_VehicleSearchLinkFrame = "vehicle";
    AssureClaims_VehicleAccidentClaimIframe = "blank";
    AssureClaims_DisabilityPlanManagementIframe = "plan_";
    AssureClaims_NonOcc_ClaimNonOccIFrame = "claimdi_";
    AssureClaims_Externalapp_frame = "externalapp";
    AssureClaims_NonOcc_CalPayFrame = "externalapp";

    //POM for Iframe Pending transaction
    //POM for Iframe Pending transaction
    //POM for diary Utility screen
    //Maintenance Messages/Frame On Aplication Completed Here//

    AssureClaims_ClaimSearchIframe = "sclaim";
    //POM for ClaimSearch Iframe

    AssureClaims_EntitySearchIframe = "sentity";
    //POM for EntitySearch Iframe

    AssureClaims_EntityIframe = "people_";
    //POM for EntityIframe

    AssureClaims_SubPolicyDownloadIframe = "externalapp";
    //POM for PolicyDownloadIframe

    AssureClaims_BankAccountIframe = "bankaccount_";
    //POM for BankAccount Iframe

    AssureClaims_SubBankAccountIframe = "blank";
    //POM for SubBankAccount Ifame

    AssureClaims_SMSIframe = "securitymgtsystem";
    //POM for Security Management System Iframe

    AssureClaims_UtilitiesIframe = "utilities";
    //POM for Utilities Iframe

    AssureClaims_GeneralSystemParameterSetupIframe = "GeneralSystemParameterSetup";
    //POM for Iframe of General System Parameter Setup

    AssureClaims_GSPConfigManagerIFrame = "systemparameter";

    Assureclaims_Generic_Config_Manager_General_ClaimFrame = "gc";

    AssureClaims_PaymentParameterSetupIframe = "PaymentParameterSetup";
    //POM for Iframe of Payment Parameter Setup

    AssureClaims_EnhanceNotesIframe = "externalapp";
    //POM for EnhanceNotesSS Iframe

    AssureClaims_UserPrivilegesIframe = "userprivileges";
    //POM for UserPrivileges

    AssureClaims_FundsTransactionIframe = "transaction";
    //POM for Funds Transaction Iframe

    AssureClaims_TransactionLifeClaim_ValidationMessage = "Transactions are not allowed on Life claim. Please select any other Claim.";
    //Validation Message in Funds - Transaction Screen when Life Claim is entered//

    AssureClaims_QuickSummaryIframe = "quickSummary";
    //POM for quickSummary Iframe


    AssureClaims_Generic_ClientProgram_Frame = "clientprog";
    //POM for ClientProgram Iframe

    //ANURAG'S CODE :RMA-85449
    AssureClaims_EventFrame = "events";
    //POM for Event Screen

    //ANURAG'S CODE :RMA-82420

    AssureClaims_ClaimScanIframe = "externalapp";
    //POM for claimscan Iframe

    //END

    //Sai's Code:RMA-87954
    AssureClaims_Search_BankAccountIframe = "sbankaccount";
    AssureClaims_Search_BankAccountIframe1 = "bankaccount_";
    AssureClaims_BankAccountIframe1 = "bankaccount_4"
    AssureClaims_Generic_OrangeToasterOFDeposit = "Sub Bank Account(s) need to be created before doing Deposit(s).";

    //Nikhil's Code : RMA-87939
    AssureClaims_PIEventFrame = "event";
    //POM for Event Screen

    AssureClaims_FinancialReserveGridFrame = "claimwc_289";
    AssureClaims_ClaimWCIframe = "claimwc_"


    AssureClaims_FinancialReserveGridFrame = "claimwc_"
    //POM for Claim WC screen

    AssureClaims_EventIFrame = "events_";
    //POM for Event Screen

    //Diksha's 88774 POM
    AssureCliams_MaintenanceERON_EnityIframe = "entities_";

    AssureClaims_MaintenanceERON_SearchEntityFrame = "sentities-";

    AssureClaims_MaintenenceERON_LinkSelectFrame = "entitymaint_";

    //RMA-89772
    AssureClaims_TokensIframe = "userdata";
    AssureClaims_DataCollectionConfigIframe = "incidentconfig";

    AssureClaims_Generic_OrangeToasterOFClearingMultipleDeposit = "No deposit selected";
    //Sai's Code:RMA-90827
    //21.4 sprint
    AssureClaims_Generic_PeopleFrame = "people";
    //Sai's Code : RMA-96163 started here
    AssureClaims_Generic_EntityFROMPaymentFrame = "entities_";
    AssureClaims_Generic_EntitySearchFrame = "sentities";
    AssureClaims_Generic_EntitySearchLinkFrame = "entitymaint_";
    //Sai's Code : RMA-96163 ended here
    AssureClaims_Generic_PeopleAfterSearchFrame = "people_";

    //Muskan's Code: RMA-91093 and 91094

    AssureClaims_LOBParameterSetupIframe = "LOBParameters"
    //POM for LOB screen


    //Avinash's Code : RMA-91245
    AssureClaims_RFEScreenIframe = "externalapp";
    //POM for Request for Evidence Iframe

    //Debasmita code POM for Maintenance screen
    AssureClaims_Generic_VehicleFrame = "vehicle";
    AssureClaims_Generic_AdminTrackingFrame = "admintracking";
    AssureClaims_Generic_DeleteMessage = "Deleted Successfully";
    AssureClaims_Generic_RecDeleteMessage = "Record Deleted Successfully";

    // Tushar's POM for Stop Pay Check Screen-->RMA-92829
    AssureClaims_Generic_StopPayChecks = "stoppaychecks";

    // Tushar's POM for Backup Withholding Screen-->RMA-92830
    AssureClaims_Generic_Withholding = "externalapp";

    //yashaswi's code for funds dormancy ---->RMA-94578
    AssureClaims_FundsDormancySetUpFrames = "FundsDormancyGrid";

    // Tushar's code : RMA- 94582
    AssureClaims_Utilities_LossCodeMappingIFrame = "LossCodeMapping";
    AssureClaims_Utilities_PolicyCodeMappingIFrame = "PolicyCodeMapping";
    //Sai's Code : RMA-94594
    AssureClaims_Generic_PolicyTrackingMCOIFrame = "policy_1";
    //Sai's Code :RMA-93952
    AssureClaims_AutoAssignAdjusterframe = "AdjusterScreens.aspx";
    //POM for Iframe of Auto Assign Adjuster

    //Muskan's Code : RMA-94580
    AssureClaims_printCheckIframe = "printchecks"

    //Sai's Code : RMA-96163
    AssureClaims_Generic_AddressFrame = "address_";
    AssureClaims_Generic_AddressSearchFrame = "msaddress";
    // Tushar's Code : RMA - 96126
    AssureClaims_Utilities_ControlRequestFrame = "ControlRequest"

    // yashaswi's code : RMA-96162
    AssureClaims_Generic_PaymentSearchFrame = "payment_"
    AssureClaims_Generic_TransactionSearchFrame = "transaction_"

    //=======================================RMA-97663 : Muskan's Code started here======================================================================
    AssureClaims_Search_DiaryIframe = "sdiary";
    //POM for Diary Search Iframe

    AssureClaims_SearchResult_DiaryIframe = "diary_"
    //Pom for Diary Search Results Iframe

    AssureClaims_Search_EntityIframe = "sentity";
    //POM for Entity Search Iframe

    AssureClaims_SearchResult_EntityIframe = "entitymaint_"
    //Pom for Entity Search Results Iframe

    AssureClaims_Search_EventIframe = "sevent";
    //POM for Event Search Iframe

    AssureClaims_SearchResult_EventIframe = "sevent_"
    //Pom for Event Search Results Iframe

    AssureClaims_SearchResult_FundsIframe = "payment_"
    //Pom for Funds Search Results Iframe

    AssureClaims_Search_OrgHierarchyIframe = "sorghierarchyentity";
    //POM for OrgHierarchy Search Iframe

    AssureClaims_SearchResult_OrgHierarchyIframe = "orghierarchy_"
    //Pom for OrgHierarchy Search Results Iframe

    AssureClaims_SearchResult_PolicyIframe = "policy_"
    //Pom for Policy Search Results Iframe

    AssureClaims_Search_PropertyIframe = "sproperty"
    //Pom for Property Search Iframe

    AssureClaims_SearchResult_PropertyIframe = "propertyunit_"
    //Pom for Property Search Results Iframe

    AssureClaims_Search_VehicleIframe = "svehicle"
    //Pom for Vehicle Search Iframe

    AssureClaims_SearchResult_VehicleIframe = "vehicle_"
    //Pom for Vehicle Search Results Iframe

    AssuereClaim_DiaryDetailsIframe = "diarydetail_"
    //POM for Diary Detail Iframe

    AssuereClaim_OrganizationHierarchyIframe = "orghierarchyentities_"
    //POM for Organization Hierarchy Iframe

    AssuereClaim_PropertyIframe = 'propertyunits_'
    //POM for Property page iframe

    AssuereClaim_VehicleIframe = 'vehicles_'
    //POM for Vehicle page iframe

    //=======================================RMA-97663 : Muskan's Code ended here======================================================================

    //Sai's code :RMA-97799 Starts Here
    AssureClaims_Generic_OrgHierarchyMainPageFrame = "orghierarchyentity"
    AssureClaims_Generic_OrgHierarchyAfterMainPageFrame = "orghierarchyentities_-"
    //Sai's code :RMA-97799 Ends Here 


    //Parul's Code : RMA-RMA-100012
    AssureClaims_PowerviewIframe = "powerview";
    AssureClaims_Generic_Power_View_Add_Message = "Record Saved Successfully.";
    AssureClaims_Generic_Power_View_Edit_View_Save_Message = "Powerview Definition Saved Successfully.";

    //shubham's code : RMA-97924
    AssureClaims_Search_Configuration = "policyinterface";
    //===============================================Sai's Code : RMA-96129 Start's Here==============================================================================
    AssuereClaim_MyPendingClaimsIframe = "pendingclaims"
    //POM for MyPendingClaims  Iframe
    //===============================================Sai's Code : RMA-96129 End's Here==============================================================================

    //================================Muskan's Code : RMA-99702 started here================================================================

    AssuereClaim_Search_MedicalStaffIframe = "sstaffs"
    //POM for medical staff iframe

    AssuereClaim_SearchResult_MedicalStaffIframe = "staff_"
    //POM for medstaff iframe over medstaff search result page

    //================================Muskan's Code : RMA-99702 ended here================================================================

    //================================Muskan's Code : RMA-97293 started here================================================================
    AssuereClaim_Search_EntityIframe = "blank"
    //POM for search employee iframe

    AssuereClaim_Search_DriverIframe = "sdrivers"
    //POM for driver  iframe

    AssuereClaim_SearchResult_DriverIframe = "driver_"
    //POM for driver iframe over driver search result page

    AssuereClaim_Search_EmployessIframe = "semployees"
    //POM for employee iframe

    AssuereClaim_SearchResult_EmployeeIframe = "employee_"
    //POM for employee iframe over driver search result page

    AssuereClaim_Search_PatientIframe = "spatients"
    //POM for patient iframe

    AssuereClaim_SearchResult_PatientIframe = "patient"
    //POM for patient iframe over driver search result page

    AssuereClaim_Search_PhysicianIframe = "sphysicians"
    //POM for physician iframe

    AssuereClaim_SearchResult_PhysicianIframe = "physician_"
    //POM for physician iframe over driver search result page

    //================================Muskan's Code : RMA-97293 ended here================================================================
    //=================================RMA-99791 Melissa Address Auto Complete and Address Verification Code Starts=============================================
    Assureclaims_Address_VerificationFrame = "externalapp";
    //POM for Melissa Address Verification iframe
    //=================================RMA-99791 Melissa Address Auto Complete and Address Verification Code Ends=============================================
    Assureclaims_Generic_DiaryUtilitieFrame = "diaryutilities"
    // POM for Diary Utilities IFrame

    //Muskan's Code : RMA-101853
    AssureClaims_WorkLossRestrictionsMappingIframe = "worklossrestrictions";
    //POM for Iframe of Work Loss/Restrictions Mapping

    // Tushar's Code : RMA-102144
    AssureClaims_AdminTrackingIframe = "admintables";
    //POM for Iframe of Admin Tracking 

    AssureClaims_AdminTrackingListIframe = "admintrackinglist";
    //POM for Iframe of Admin Tracking List

    //Muskan's Code : RMA-106953
    AssureClaims_AutoAssignAdjusterIframe = "autoassignadjuster"
    //POM for Iframe of Auto assign adjuster

    //Muskan's Code : RMA-109178
    AssuereClaims_QueryDesignerIframe = "querydesigner"
    //POM for query designer iframe
    

            //Muskan's Code : RMA-109178
        AssuereClaims_QueryDesignerIframe="querydesigner"
        //POM for query designer iframe

    //Vikrant's Code : RMA-109526
    AssureClaims_Analytics_DashBoardIFrame ="configsettings"
    //POM for analytics Dashboard Iframe
    

    AssuereClaims_SearchResult_EmployeeIframe = "employees_"
    // POM for employee search IFrame

    AssuereClaims_Analytics_Dashboard_Iframe ="iframedashboard"
    // POM for Okta Iframe in Analytics Dashboard On Claim Screen
    
  }; export default POM_VerificationMessage;
