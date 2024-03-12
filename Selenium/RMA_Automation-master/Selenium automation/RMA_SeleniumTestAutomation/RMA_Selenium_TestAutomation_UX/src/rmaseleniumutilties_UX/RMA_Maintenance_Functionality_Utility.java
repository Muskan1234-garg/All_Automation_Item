package rmaseleniumutilties_UX;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Maintenance;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance_PlanManagement;
import rmaseleniumPOM_UX.RMA_Selenium_POM_AdminTracking;
import rmaseleniumPOM_UX.RMA_Selenium_POM_BankingInformation;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Dependents;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Driver;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Entity;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Search;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Vehicle;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_LeavePlanManagement;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_MedicalStaff;
import rmaseleniumPOM_UX.RMA_Selenium_POM_OrgHierarchy;
import rmaseleniumPOM_UX.RMA_Selenium_POM_OtherPerson;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Patient;
import rmaseleniumPOM_UX.RMA_Selenium_POM_People;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Physician;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Policy;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Property;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Violations;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Withholding;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Witness;
//RMA Package Import Completed

public class RMA_Maintenance_Functionality_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	public static String ReturnValue;
	public static String EntName;
	public static String EnhancedNotesText;
	public static String ErrorTxtMessage;
	public static String OrgHierarchyName;


	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_PersonInvolvedAddNewEntity_Utility
	//Description  		: Enables The User To Add Entities Such As Employee, Patient As Person Involved To Created Records Such As Events, Claims  
	//Input Parameter 	: Entity: Case Variable Determining Which Entity Is To Be Created, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - KumudNaithani-08-06-2017
	//==========================================================================================================================================================================================================================================
	public static String RMA_PersonInvolvedAddNewEntity_Utility(String Entity, String RecordNumber, int logval) throws Exception, Error
	{
		try {
			logger = reports.startTest("<span id='PIAddNewEntity'>Person Involved Entity Addition</span>", "A New Entity Of Type" + " "+ Entity+" "+ "Is Added As Person Involved To Record" + " "+color.RMA_ChangeColor_Utility(RecordNumber, 2));
			String EntityVal; // Last Name Of The Entity Is Fetched In This Variable
			int EntityNumber; // Numeric Part Of The Entity Is Fetched In This Variable If Required
			String FrameID;

			switch (Entity){
			case "Employee":
				EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000000, 9999999);
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EmpLastName_");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntityAdd(driver, "Employee"), "Add New Employee As Person Involved Link For Record"+ " "+RecordNumber, logval);
				//Employee Creation Page Is Opened

				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_EmployeeNumber(driver), "Employee Number TextBox On Person Involved-->Employee Page", String.valueOf(EntityNumber), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "Employee Last Name TextBox On Person Involved-->Employee Page", EntityVal, logval);
				//RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_SocialSecurityNumber(driver), "Social Security Number TextBox On Person Involved-->Employee Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999)), logval);
				//RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_SocialSecurityNumber(driver), "Social Security Number on Claimant page", "(" +String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111, 999))+")"+String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111, 999))+"-"+String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999)), logval);
				//Employee Number, Last Name, Social Security Number Values Are Provided For Employee To Be Created

				//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Person Involved-->Employee Page", logval);


				//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Addresses(driver), "Addresses Tab On Employee Creation Page",logval);
				//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Btn_AddNewAddress(driver), "New Address Image Button On Employee Creation Page",logval);
				//RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Addresses Screen Is Loaded After Clicking Add New Address Buttton On Employee Page");
				//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_AddrType(driver), "Address Type TextBox On Addresses Tab On Employee Creation Page", "HADDR", logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr1(driver), "Address1 TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address1_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr2(driver), "Address2 TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address2_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr3(driver), "Address3 TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address3_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr4(driver), "Address4 TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address4_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_City(driver), "City TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "City_"), logval);
				// Data Is Entered In Address1,Address2,Address3,Address4,City Fields On Address Tab

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Btn_State(driver), "State Code Look Up Button On Addresses Tab On Employee Creation Page",logval);
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Alberta", "State Link On State Selection Window", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As State Is Selected On Addresses Tab On Employee Creation Page");
				// Data Is Entered In State Field Of Address Tab

				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_County(driver), "County TextBox On Addresses Tab On Employee Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "County_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_ZipCode(driver), "Zip/Postal Code TextBox On Addresses Tab On Employee Creation Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(10000,99999)), logval);
				// Data Is Entered In County & ZipCode Field Of Address Tab

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Btn_Country(driver), "Country Code Look Up Button On Addresses Tab On Employee Creation Page",logval);
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Great Britain", "Country Link On Country Selection Window", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Country Is Selected On Addresses Tab On Employee Creation Page");
				// Data Is Entered In Country Field Of Address Tab


				//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Addresses Tab On Employee Creation Page", logval);// Save Button Is Clicked
				//Newly Created Address Is Saved

				//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Maintenance-->Employee Page", logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_SocialSecurityNumber(driver), "Social Security Number TextBox On Maintenance-->Employee Page",String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11, 99))+"-"+String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111111, 9999999)), logval);
				//Social Security Number Is Provided On Employee Creation Page

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_EmploymentInfo(driver), "Employment Info Tab On Person Involved-->Employee Page", logval);
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Department(driver), "Employee Department TextBox On Person Involved-->Employee Page", "ST", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Value Is Provided To Department TextBox On Person Involved-->Employee Page");
				//Department Value Is Provided And Employee Is Saved

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_EmployeeNumber(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(String.valueOf(EntityNumber), EntName, "Employee LastName Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Employee Saved Successfully", "Successful Employee Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Employee Saved Successfully", "Successful Employee Creation With Last Name"+ " "+ EntName)));
				}
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Person Involved-->Employee Page", logval);
				break;

			case "MedicalStaff":
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntityAdd(driver, "Medical Staff"), "Add New Medical Staff As Person Involved Link For Record"+ " "+RecordNumber, logval);
				//Medical Staff Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "MedLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_LastName(driver), "Last Name TextBox On Person Involved-->Medical Staff Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_FirstName(driver), "First Name TextBox On Person Involved-->Medical Staff Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "MedFirstName_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_StaffNumber(driver), "Staff Number TextBox On Person Involved-->Medical Staff Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999)), logval);	
				//Last Name, Staff Number Values Are Provided For Medical Staff To Be Created
				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Medical Staff Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Medical Staff Saved Successfully", "Successful Medical Staff Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Medical Staff Saved Successfully", "Successful Medical Staff Creation With Last Name"+ " "+ EntName)));
				}
				break;

			case "Patient":
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntityAdd(driver, "Patient"), "Add New Patient As Person Involved Link For Record"+ " "+RecordNumber, logval);
				//Patient Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PatLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Patient.RMAApp_Patient_Txt_LastName(driver), "Last Name TextBox On Person Involved-->Patient Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Patient.RMAApp_Patient_Txt_FirstName(driver), "First Name TextBox On Person Involved-->Patient Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PatFirstName_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Patient.RMAApp_Patient_Txt_MiddleName(driver), "Middle Name TextBox On Person Involved-->Patient Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PatMidName_"), logval);
				//Last Name, First Name, Middle Name Values Are Provided For Patient To Be Edited

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Patient.RMAApp_Patient_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Patient Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Patient Saved Successfully", "Successful Patient Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Patient Saved Successfully", "Successful Patient Creation With Last Name"+ " "+ EntName)));
				}
				break;

			case "Physician":		
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntityAdd(driver, "Physician"), "Add New Physician As Person Involved Link For Record"+ " "+RecordNumber, logval);
				//Physician Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PhysLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_LastName(driver), "Last Name TextBox On Person Involved-->Physician Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_PhysicianNumber(driver), "Physician Number TextBox On Person Involved-->Physician Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100, 999)), logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_County(driver), "County TextBox On Person Involved-->Physician Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PhysCounty_"), logval);	
				//Last Name, Physician Number And County Values Are Provided For Physician To Be Created

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Physician Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Physician Saved Successfully", "Successful Physician Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Physician Saved Successfully", "Successful Physician Creation With Last Name"+ " "+ EntName)));
				}
				break;

			case "Driver":
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntityAdd(driver, "Driver"), "Add New Driver As Person Involved Link For Record"+ " "+RecordNumber, logval);
				//Driver Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(2, "Dv_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "Last Name TextBox On Person Involved-->Driver Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_Address1(driver), "Address_1 TextBox On Person Involved-->Driver Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "DriverAddr1_"), logval);	
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Lst_TypeOfDriver(driver), "Commercial", "DriverType List Box", "Person Involved-->Driver Page", logval);
				//Last Name, Address And DriverType Values Are Provided For Driver To Be Created
				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Driver Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Driver Saved Successfully", "Successful Driver Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Driver Saved Successfully", "Successful Driver Creation With Last Name"+ " "+ EntName)));
				}
				break;

			case "Witness":
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntityAdd(driver, "Witness"), "Add New Witness As Person Involved Link For Record"+ " "+RecordNumber, logval);
				//Witness Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "WitnessLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Witness.RMAApp_Witness_Txt_LastName(driver), "Last Name TextBox On Person Involved-->Witness Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Witness.RMAApp_Witness_Txt_FirstName(driver), "First Name TextBox On Person Involved-->Witness Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "WitnessFirstName_"), logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Witness.RMAApp_Witness_Txt_Initials(driver), "Initials TextBox On Person Involved-->Witness Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(1, "W"), logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Witness.RMAApp_Witness_Txt_SocialSecurityNumber(driver), "Social Security Number TextBox On Person Involved-->Employee Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999)), logval);
				//Last Name, FirstName And Initials Values Are Provided For Witness To Be Created

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Witness Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Witness Saved Successfully", "Successful Witness Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Witness Saved Successfully", "Successful Witness Creation With Last Name"+ " "+ EntName)));
				}
				break;

			case "OtherPerson":
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntityAdd(driver, "Other Person"), "Add New Other Person As Person Involved Link For Record"+ " "+RecordNumber, logval);
				//Other People Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "OthPeopleLastName_");
				//RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OtherPerson.RMAApp_OtherPerson_Txt_SocialSecurityNumber(driver), "Social Security Number TextBox On Person Involved-->OtherPerson Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999)), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OtherPerson.RMAApp_OtherPerson_Txt_LastName(driver), "Last Name TextBox On Person Involved-->People Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OtherPerson.RMAApp_OtherPerson_Txt_City(driver), "City TextBox On Person Involved-->People Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "OthPeopleCity_"), logval);	
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_OtherPerson.RMAApp_OtherPerson_Lst_Type(driver),"Adjusters", "Type Of People List Box", "Person Involved-->People Page", logval);

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Other Person Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Other Person Saved Successfully", "Successful Other Person Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Other Person Saved Successfully", "Successful Other Person Creation With Last Name"+ " "+ EntName)));
				}
				break;
			default:

				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Entity+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Entity+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}
			return EntName;

		} catch (Exception|Error e) {
			throw (e);
		}
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_PersonInvolvedExistingEntityAdd_Utility
	//Description  		: Enables The User To Add Already Existing Entities Such As Employee, Patient As Person Involved To Created Records Such As Events, Claims  
	//Input Parameter 	: Entity: Case Variable Determining Which Entity Is To Be Created, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - KumudNaithani-08-09-2017
	//==========================================================================================================================================================================================================================================
	public static String RMA_PersonInvolvedExistingEntityAdd_Utility(String Entity, String RecordNumber, String EntityValue, String EntityPartialLinkSelect, int logval) throws Exception, Error
	{
		try {
			logger = reports.startTest("<span id='PIExistingEntityAdd'>Person Involved Existing Entity Addition</span>", "Already Existing Entity Of Type" + " "+ Entity+" "+ "Is Added As Person Involved To Record" + " "+color.RMA_ChangeColor_Utility(RecordNumber, 2));
			CurrentFrameID = null;
			switch (Entity){
			case "Employee":
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntitySearch(driver, "Employee"), "Search Existing Employee As Person Involved Link For Record"+ " "+RecordNumber, logval);
				CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				//Employee Search Page Is Opened

				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PersonInvolvedSearchFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Search.RMAApp_SearchEmployee_Txt_EmployeeNumber(driver), "Employee Last Name"+  " "+ "On" + "Search-->Employee Screen", EntityValue, logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", "Search-->Employee Screen", logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On"+ " " + "Search-->Employee Screen", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Searched Entity Screen Is Loaded");
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect(EntityValue, "Search-->Employee Screen" ,logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				driver.switchTo().parentFrame();
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
				
				//Already Created Entity Of Employee Type Is Searched

				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Add Existing --> Person Involved Screen Is Getting Loaded");
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_EmployeeNumber(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityValue, EntName, "Employee Name Value", logval);
				//Searched Employee Is Saved 
				break;

			case "MedicalStaff":
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntitySearch(driver, "Medical"), "Search Existing Medical Staff As Person Involved Link For Record"+ " "+RecordNumber, logval);
				CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				//Medical Staff Search Page Is Opened

				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PersonInvolvedSearchFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Search.RMAApp_Search_Txt_MedicalStaffLastName(driver), "Medical Staff Last Name"+  " "+ "On" + "Search-->Medical Staff Screen", EntityValue, logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", "Search-->Medical Staff Screen", logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On"+ " " + "Search-->Medical Staff Screen", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Searched Entity Screen Is Loaded");
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect(EntityValue, "Search-->Medical Staff Screen" ,logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				driver.switchTo().parentFrame();
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
				//Already Created Entity Of Medical Staff Type Is Searched

				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Add Existing --> Person Involved Screen Is Getting Loaded");
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityValue, EntName, "Medical Staff Name Value", logval);
				//Searched Medical Staff Is Saved
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Searched Medical Staff Saved Successfully", "Successful Medical Staff Addition With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Searched Medical Staff Saved Successfully", "Successful Medical Staff Addition With Last Name"+ " "+ EntName)));
				}
				break;

			case "Patient":
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntitySearch(driver, "Patient"), "Search Existing Patient As Person Involved Link For Record"+ " "+RecordNumber, logval);
				CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				//Patient Search Page Is Opened

				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PersonInvolvedSearchFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Search.RMAApp_SearchPatient_Txt_PatientLastName(driver), "Patient Last Name"+  " "+ "On" + "Search-->Patient Screen", EntityValue, logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", "Search-->Patient Screen", logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On"+ " " + "Search-->Patient Screen", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Searched Entity Screen Is Loaded");
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect(EntityValue, "Search-->Patient Screen" ,logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				driver.switchTo().parentFrame();
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
				//Already Created Entity Of Patient Type Is Searched

				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Add Existing --> Person Involved Screen Is Getting Loaded");
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Patient.RMAApp_Patient_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityValue, EntName, "Patient Last Name Value", logval);
				//Searched Patient Is Saved 

				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Searched Patient Saved Successfully", "Successful Patient Addition With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Searched Patient Saved Successfully", "Successful Patient Addition With Last Name"+ " "+ EntName)));
				}
				break;

			case "Physician":		
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntitySearch(driver, "Physician"), "Search Existing Physician As Person Involved Link For Record"+ " "+RecordNumber, logval);
				CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				//Physician Search Page Is Opened

				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PersonInvolvedSearchFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Search.RMAApp_SearchPhysician_Txt_LastName(driver), "Physician Last Name"+  " "+ "On" + "Search-->Physician Screen", EntityValue, logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", "Search-->Physician Screen", logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On"+ " " + "Search-->Physician Screen", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Searched Entity Screen Is Loaded");
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect(EntityValue, "Search-->Physician Screen" ,logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				driver.switchTo().parentFrame();
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
				//Already Created Entity Of Physician Type Is Searched

				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Add Existing --> Person Involved Screen Is Getting Loaded");
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityValue, EntName, "Physician Last Name Value", logval);
				//Searched Physician Is Saved 

				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Searched Physician Saved Successfully", "Successful Physician Addition With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Searched Physician Saved Successfully", "Successful Physician Addition With Last Name"+ " "+ EntName)));
				}

				break;	

			case "Driver":
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntitySearch(driver, "Driver"), "Search Existing Driver As Person Involved Link For Record"+ " "+RecordNumber, logval);
				CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				//Driver Search Page Is Opened

				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PersonInvolvedSearchFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6,logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Search.RMAApp_SearchDriver_Txt_DriverLastName(driver), "Driver Last Name"+  " "+ "On" + "Search-->Driver Screen", EntityValue, logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", "Search-->Driver Screen", logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On"+ " " + "Search-->Driver Screen", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Searched Entity Screen Is Loaded");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppPartialLink(driver, EntityValue), "Driver Link On Driver Search Screen", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				driver.switchTo().parentFrame();
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
				//Already Created Entity Of Driver Type Is Searched

				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Add Existing --> Person Involved Screen Is Getting Loaded");
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityValue, EntName, "Driver Last Name Value", logval);
				//Searched Driver Is Saved 

				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Searched Driver Saved Successfully", "Successful Driver Addition With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Searched Driver Saved Successfully", "Successful Driver Addition With Last Name"+ " "+ EntName)));
				}
				break;

			case "Witness":
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntitySearch(driver, "Witness"), "Search Existing Witness As Person Involved Link For Record"+ " "+RecordNumber, logval);
				CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				//Witness Search Page Is Opened

				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PersonInvolvedSearchFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Search.RMAApp_SearchEntity_Txt_LastName(driver), "Witness Last Name"+  " "+ "On" + "Search-->Witness Screen", EntityValue, logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", "Search-->Witness Screen", logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On"+ " " + "Search-->Witness Screen", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Searched Entity Screen Is Loaded");
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect(EntityPartialLinkSelect, "Search-->Witness Screen" ,logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				driver.switchTo().parentFrame();
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
				//Already Created Entity Of Witness Type Is Searched

				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Add Existing --> Person Involved Screen Is Getting Loaded");
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Witness.RMAApp_Witness_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityValue, EntName, "Witness Last Name Value", logval);
				//Searched Witness Is Saved

				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Searched Witness Saved Successfully", "Successful Witness Addition With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Searched Witness Saved Successfully", "Successful Witness Addition With Last Name"+ " "+ EntName)));
				}

				break;

			case "OtherPerson":
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Persons Involved"), " Add New Person Involved Link For Record"+ " "+RecordNumber, logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_SubEntitySearch(driver, "Other"), "Search Existing OtherPerson As Person Involved Link For Record"+ " "+RecordNumber, logval);
				CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				//OtherPerson Search Page Is Opened

				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PersonInvolvedSearchFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Search.RMAApp_SearchEntity_Txt_LastName(driver), "OtherPerson Last Name"+  " "+ "On" + "Search-->OtherPerson Screen", EntityValue, logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", "Search-->OtherPerson Screen", logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On"+ " " + "Search-->OtherPerson Screen", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Searched Entity Screen Is Loaded");
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect(EntityPartialLinkSelect, "Search-->OtherPerson Screen" ,logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				driver.switchTo().parentFrame();
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
				//Already Created Entity Of OtherPerson Type Is Searched

				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Add Existing --> Person Involved Screen Is Getting Loaded");
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OtherPerson.RMAApp_OtherPerson_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityValue, EntName, "OtherPerson Name Value", logval);
				//Searched OtherPerson Is Saved
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Searched OtherPerson Saved Successfully", "Successful OtherPerson Addition With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Searched OtherPerson Saved Successfully", "Successful WOtherPerson Addition With Last Name"+ " "+ EntName)));
				}
				break;

			default:

				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Entity+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Entity+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}
			return EntName;
		}catch (Exception|Error e) {
			throw (e);
		}
	}
	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_PersonInvolvedEditEntity_Utility
	//Description  		: Enables The User To Edit Entities Such As Employee, Patient As Person Involved To Created Records Such As Events, Claims  
	//Input Parameter 	: Entity: Case Variable Determining Which Entity Is To Be Created, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - KumudNaithani-08-09-2017
	//==========================================================================================================================================================================================================================================
	public static String RMA_PersonInvolvedEditEntity_Utility(String Entity, String RecordNumber, String FrameID, int logval) throws Exception, Error
	{
		try {
			logger = reports.startTest("<span id='PIEditEntity'>Person Involved Entity Edit</span>", "Already Created Entity Of Type" + " "+ Entity+" "+ "Is Edited For Record" + " "+color.RMA_ChangeColor_Utility(RecordNumber, 2));
			String EntityVal; // Last Name Of The Entity Is Fetched In This Variable
			switch (Entity){
			case "Employee":
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedEmpLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "Employee Last Name TextBox On Person Involved-->Employee Page", EntityVal, logval);
				//Last Name Value Is Provided For The Employee To Be Edited

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Employee LastName Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Employee Edited Successfully", "Successful Employee Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Employee Edited Successfully", "Successful Employee Edit With Last Name"+ " "+ EntName)));
				}
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Person Involved-->Employee Page", logval);
				break;

			case "MedicalStaff":
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedMedLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_LastName(driver), "Last Name TextBox On Person Involved-->Medical Staff Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_FirstName(driver), "First Name TextBox On Person Involved-->Medical Staff Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedMedFirstName_"), logval);
				//Last Name, Staff Number Values Are Provided For Medical Staff To Be Edited

				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Medical Staff Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Medical Staff Edited Successfully", "Successful Medical Staff Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Medical Staff Edited Successfully", "Successful Medical Staff Edit With Last Name"+ " "+ EntName)));
				}
				break;

			case "Patient":
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedPatientLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Patient.RMAApp_Patient_Txt_LastName(driver), "Last Name TextBox On Person Involved-->Patient Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Patient.RMAApp_Patient_Txt_FirstName(driver), "First Name TextBox On Person Involved-->Patient Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedPatientFirstName_"), logval);
				//Last Name, First Name Values Are Provided For Patient To Be Edited

				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Patient.RMAApp_Patient_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Patient Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Patient Edited Successfully", "Successful Patient Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Patient Edited Successfully", "Successful Patient Edit With Last Name"+ " "+ EntName)));
				}
				break;

			case "Physician":		
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedPhysLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_LastName(driver), "Last Name TextBox On Person Involved-->Physician Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_PhysicianNumber(driver), "Physician Number TextBox On Person Involved-->Physician Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100, 999)), logval);		
				//Last Name, Physician Number Values Are Provided For Physician To Be Edited

				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Physician Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Physician Edited Successfully", "Successful Physician Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Physician Edited Successfully", "Successful Physician Edit With Last Name"+ " "+ EntName)));
				}
				break;

			case "Driver":
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedDriverLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "Last Name TextBox On Person Involved-->Driver Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_Address1(driver), "Address_1 TextBox On Person Involved-->Driver Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedDriverAddr1_"), logval);	
				//Last Name, Address Values Are Provided For Driver To Be Edited

				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Driver Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Driver Edited Successfully", "Successful Driver Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Driver Edited Successfully", "Successful Driver Edit With Last Name"+ " "+ EntName)));
				}
				break;

			case "Witness":
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedWitnessLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Witness.RMAApp_Witness_Txt_LastName(driver), "Last Name TextBox On Person Involved-->Witness Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Witness.RMAApp_Witness_Txt_FirstName(driver), "First Name TextBox On Person Involved-->Witness Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedWitnessFirstName_"), logval);
				//Last Name, FirstName Values Are Provided For Witness To Be Edited

				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Witness Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Witness Edited Successfully", "Successful Witness Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Witness Edited Successfully", "Successful Witness Edit With Last Name"+ " "+ EntName)));
				}
				break;

			case "OtherPerson":
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedOthPeoLastName_");	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OtherPerson.RMAApp_OtherPerson_Txt_LastName(driver), "Last Name TextBox On Person Involved-->People Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OtherPerson.RMAApp_OtherPerson_Txt_City(driver), "City TextBox On Person Involved-->People Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedOthPeopleCity_"), logval);	

				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Other Person Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Other Person Edited Successfully", "Successful Other Person Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Other Person Edited Successfully", "Successful Other Person Edit With Last Name"+ " "+ EntName)));
				}
				break;

			default:
				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Entity+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Entity+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}
			return EntName;

		} catch (Exception|Error e) {
			throw (e);
		}
	}

	//=================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_MaintEntityAddition_Utility
	//Description  		: Enables The User To Add Entity Like Employee, Medical From The Maintenance Screen To The RMA Application   
	//Input Parameter 	: Entity: Case Variable Determining Which Entity Is To Be Created, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - KumudNaithani-05-02-2016 
	//Modified By		: 0.0 - MahendraPsingh-02-24-2017- Updated For Switch case Maintenance-> Leave Plan Entity addition	
	//							: 0.1 - RenuVerma-03-07-2017- Changed function Name RMA_EntityAddition_Utility to RMA_MaintEntityAddition_Utility
	//==================================================================================================================================================================================================================================================================
	public static String RMA_MaintEntityAddition_Utility(String Entity, int logval) throws Exception, Error
	{
		try {
			logger = reports.startTest("<span id='EntityAdd'>Addition Of "+ Entity +" Entity</span>", "A New Entity Of Type:" + " "+ Entity+" "+ "Is Added From Maintenance Screen To RMA Application");
			String EntityName; // Last Name Of The Entity Is Fetched In This Variable
			//int EntityNumber; // Numeric Part Of The Entity Is Fetched In This Variable
			//String EntityNum; //Employee Number Of the Entity Is Fetched In This Variable
			//int SecurityNum; //Social Security Number Of The Entity Is Fetched In This Variable
			//String StrCurrentDate;

			switch (Entity){
			case "Agents":
				rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Maintenance-People", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.MaintenancePeopleFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Agents_");	
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Lst_PeopleType(driver),"Agents", "Type Of People List Box", "Maintenance-->People Page", logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "Last Name TextBox On Maintenance-->People Page", EntityName, logval);
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_EntityPaymentApprovalStatus(driver), "Entity Payment Approval Status TextBox On Maintenance-->People Page", "P", logval);	
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Value Is Entered In Entity Payment Approval Status TextBox On Maintenance-->People Page");
				RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.MaintenancePeopleFrame, false, "NA", "Maintenance-->People Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName,"Agent Last Name Value", logval);
				driver.switchTo().parentFrame();
				break;

				/*case "Employee":
					RMA_MDIMenuClick_Utility("Maintenance-Employee", logval);
					driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Employee"));
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance--> Employee Frame Is Done");
					EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100, 999);
					EntityNum = "Employee_" + EntityNumber;
					RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_EmployeeNumber(driver), "Employee Number TextBox On Maintenance-->Employee Page", EntityNum, logval);
					RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Employee Number Is Added To The Employee Under Creation");
					EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EmpName_");
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_LastName(driver), "Employee Last Name TextBox On Maintenance-->Employee Page", EntityName, logval);
					SecurityNum = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_SocSecNum(driver), "Social Security Number TextBox On Maintenance-->Employee Page", String.valueOf(SecurityNum), logval);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Tab_EmploymentInfo(driver), "Employment Info Tab On Maintenance-->Employee Page", logval);
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Employment Info Tab On Maintenance-->Employee Page Is Opened ");
					RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_Department(driver), "Employee Department TextBox On Maintenance-->Employee Page", "ST", logval);
					RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Depatment ID Value Is Provided To The Employee Being Created");
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Tab_Employee(driver), "Employee Tab On Maintenance-->Employee Page", logval);
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Employee Tab On Maintenance-->Employee Page Is Opened ");
					RMA_Functionality_Utility.RMA_GenericSave_Utility("Employee", false, "NA", "Maintenance-->Employee Page", logval);
					EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_EmployeeNumber(driver), "value");
					RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Employee Number Value", logval);
					driver.switchTo().parentFrame();
					break;

				case "MedicalStaff":
					RMA_MDIMenuClick_Utility("Maintenance-MedicalStaff", logval);
					driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Medical Staff"));
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance-->Medical Staff Frame Is Done");
					EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "MedStaff_");
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintMedStaff_Txt_LstName(driver), "Last Name TextBox On Maintenance-->Medical Staff Page", EntityName, logval);
					EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100, 999);
					EntityNum = "MedStaff_" + EntityNumber;
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintMedStaff_Txt_StaffNumber(driver), "Staff Number TextBox On Maintenance-->Medical Staff Page", EntityNum, logval);	
					RMA_Functionality_Utility.RMA_GenericSave_Utility("Medical Staff", false, "NA", "Maintenance-->Medical Staff  Page", logval);
					EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintMedStaff_Txt_LstName(driver), "value");
					RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName, "Medical Staff Name Value", logval);
					driver.switchTo().parentFrame();
					break;

				case "PatientTracking":
					String StrPrimaryWindowHandle;
					RMA_MDIMenuClick_Utility("Maintenance-PatientTracking", logval);
					driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Patient"));
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance-->Patient Tracking Frame Is Done");
					EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Patient_");
					RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Patient Tracking Page", EntityName, logval);
					StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
					RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Last Name Is Done
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Btn_AddNew(driver), "Add New Button On The Last Name Window On RMA Application Maintenance-->Patient Tracking Page",logval);
					driver.switchTo().window(StrPrimaryWindowHandle); //A Switch To The Parent Window Is Done
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(("Patient"));
					RMA_Functionality_Utility.RMA_GenericSave_Utility("Patient", false, "NA", "Maintenance-->Patient  Page", logval);
					EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_LastName(driver), "value");
					RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName, "Patient Last Name Value", logval);
					driver.switchTo().parentFrame();
					break;

				case "Physician":
					RMA_MDIMenuClick_Utility("Maintenance-Physician", logval);
					driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Physician"));
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance-->Physician Frame Is Done");
					EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Physician_");
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Physician Page", EntityName, logval);
					EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100, 999);
					EntityNum = "Physician_" + EntityNumber;
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PhysicianNum(driver), "Physician Number TextBox On Maintenance-->Physician Page", EntityNum, logval);	
					RMA_Functionality_Utility.RMA_GenericSave_Utility("Physician", false, "NA", "Maintenance-->Physician  Page", logval);
					EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_LastName(driver), "value");
					RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName, "Physician Last Name Value", logval);
					driver.switchTo().parentFrame();
					break;

				case "Driver":
					RMA_MDIMenuClick_Utility("Maintenance-Driver", logval);
					driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Driver"));
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance-->Driver Frame Is Done");
					EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Driver_");
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintDriver_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Driver Page", EntityName, logval);	
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintDiver_Lst_DriverType(driver), 1, "DriverType List Box", "Maintenance-->Driver Page", logval);
					RMA_Functionality_Utility.RMA_GenericSave_Utility("Driver", false, "NA", "Maintenance-->Driver  Page", logval);
					EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintDriver_Txt_LastName(driver), "value");
					RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName,"Driver Last Name Value", logval);
					driver.switchTo().parentFrame();
					break;

				case "Witness":
					RMA_MDIMenuClick_Utility("Maintenance-People", logval);
					driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("People"));
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance-->People Frame Is Done");
					EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Witness_");
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Lst_PeopleType(driver),"Expert Witness", "Type Of People List Box", "Maintenance-->People Page", logval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "Last Name TextBox On Maintenance-->People Page", EntityName, logval);	
					RMA_Functionality_Utility.RMA_GenericSave_Utility("People", false, "NA", "Maintenance-->People Page", logval);
					EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "value");
					RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName,"Witness Last Name Value", logval);
					driver.switchTo().parentFrame();
					break;

				case "OtherPeople":
					RMA_MDIMenuClick_Utility("Maintenance-People", logval);
					driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("People"));
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance-->People Frame Is Done");
					EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "OthPeople_");	
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Lst_PeopleType(driver),"Other People", "Type Of People List Box", "Maintenance-->People Page", logval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "Last Name TextBox On Maintenance-->People Page", EntityName, logval);	
					RMA_Functionality_Utility.RMA_GenericSave_Utility("People", false, "NA", "Maintenance-->People Page", logval);
					EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "value");
					RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName,"Other People Last Name Value", logval);
					driver.switchTo().parentFrame();
					break;

				case "LeavePlanManagement":
					RMA_MDIMenuClick_Utility("Maintenance-LeavePlanManagement", logval);
					driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Leave Plan Management"));
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance--> Leave Plan Management Frame Is Done");

					EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100, 999);		
					EntityNum = "Plan_" + EntityNumber;
					EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PlanCode_");	

					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintLeavePlanManagement_Txt_PlanCode(driver), "Plan Code TextBox On Maintenance--> Leave Plan Management Page", EntityNum, logval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_Planname(driver), "Plan Name TextBox On Maintenance--> Leave Plan Management Page", EntityName, logval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintLeavePlanManagement_Txt_DefaultHoursPerweek(driver), "Default Hours Per Week TextBox On Maintenance--> Leave Plan Management Page", "40", logval);
					StrCurrentDate = RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy");
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_EffectiveDate(driver), "Effective Date TextBox On Maintenance--> Leave Plan Management Page", StrCurrentDate, logval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_ExpirationDate(driver), "Expiration Date TextBox On Maintenance--> Leave Plan Management Page", StrCurrentDate, logval);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintLeavePlanManagement_Txt_PlanStatus(driver), "Plan Status TextBox On Maintenance--> Leave Plan Management Page",logval);
					RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintLeavePlanManagement_Txt_PlanStatus(driver), "Plan Status TextBox On Maintenance--> Leave Plan Management Page", "I", logval);
					RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Plan Status Is Selected ");
					RMA_Functionality_Utility.RMA_GenericSave_Utility("Leave Plan Management", false, "NA", "Maintenance-->Leave Plan Management Page", logval);
					EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintLeavePlanManagement_Txt_PlanCode(driver), "value");
					RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Entity Last Name Value", logval);
					driver.switchTo().parentFrame();
					break;*/

			default:

				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Entity+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Entity+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}
			return EntName;

		} catch (Exception|Error e) {
			throw (e);
		}
	}

	//====================================================================================================
	//FunctionName 		: RMA_EntityAddition_Utility
	//Description  		: Enables The User To Add An Entity With Address Through Maintenance Screen
	//Input Parameter 	: Driver Of The Type Driver, BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer	 
	//Revision			: 0.0-AnubhutiVyas-10-05-2017
	// ====================================================================================================
	public static String RMA_EntityAddition_Utility(String MaintEnt_Lst_EntityType,String EntityAddress_Txt_AddType,String EntityAddress_Txt_Addr1,String EntityAddress_Txt_Addr2,String EntityAddress_Txt_Addr3,String EntityAddress_Txt_Addr4,String EntityAddress_Txt_City,String EntityAddress_Txt_State,String EntityAddress_Txt_Country,int EntityAddress_Txt_ZipCode,int Intlogval) throws Exception, Error
	{
		String Entity_Txt_City;
		String Entity_Txt_Addr1;
		String Entity_Txt_Addr2;
		String Entity_Txt_Addr3;
		String Entity_Txt_Addr4;
		String EntityName;
		String StrPrimaryWindowHandle;
		//Local Variable Declaration Is Completed Here

		try {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Creates A New Entity With Address From the Maintenance Screen");
			}else{	
				logger = reports.startTest("<span id='EntityAddition'>Entity Addition</span>", "User Creates A New Entity With Address From the Maintenance Screen");
			}
			//========================================Maintenance-->Entity Set Up Is Started Here=================================================================================================================================================================================================================================================
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Maintenance-Entity", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.MaintenanceEntityFrame);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
			EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Entity_");	 //Entity Name is Generated
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEnt_Lst_EntityType(driver),MaintEnt_Lst_EntityType, "Type Of Entity List Box", "Maintenance-Entity Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntity_Txt_LastName(driver), "Last Name TextBox On Maintenance-Entity Page", EntityName, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Entity Last Name Is Entered On Maintenance-Entity Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Addresses"), "Addresses Tab On Maintenance-Entity Page",logval);// Addresses Tab On Maintenance-Entity Page Is Clicked
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntityAddr_Btn_AddNewAddresses(driver), "Add New Address Button On RMA Application Maintenance--> Entity Page",logval);
			//==============================================================Steps To Navigate To Addresses Screen Is Started Here=================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, StrPrimaryWindowHandle, "NA", "NA", "Navigation TO Addresses Screen", logval);
			logger.log(LogStatus.INFO, "Addresses Page Of RMA Application Maintenance--> Entity Page Is Opened");
			driver.manage().window().maximize();
			//==============================================================Steps To Navigate To Addresses Screen Is Completed Here=================================================================================================================================================================================================================================================
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntityAddr_Txt_EntityAddressType(driver), "Entity Address TextBox On Maintenance-Entity Page", EntityAddress_Txt_AddType, logval);		
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Entity Address Type Text Box On Maintenance-Entity Page Is Clicked");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntityAddr_Txt_Addr1(driver), "Entity Address 1 TextBox On Maintenance-Entity Page", EntityAddress_Txt_Addr1, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntityAddr_Txt_Addr2(driver), "Entity Address 2 TextBox On Maintenance-Entity Page", EntityAddress_Txt_Addr2, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntityAddr_Txt_Addr3(driver), "Entity Address 3 TextBox On Maintenance-Entity Page", EntityAddress_Txt_Addr3, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntityAddr_Txt_Addr4(driver), "Entity Address 4 TextBox On Maintenance-Entity Page", EntityAddress_Txt_Addr4, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntityAddr_Txt_City(driver), "Entity City TextBox On Maintenance-Entity Page", EntityAddress_Txt_City, logval);		
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntityAddr_Txt_State(driver), "Entity State TextBox On Maintenance-Entity Page", EntityAddress_Txt_State, logval);		
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As State Text Box On Maintenance-Entity Page Is Clicked");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntityAddr_Txt_Country(driver), "Entity Country TextBox On Maintenance-Entity Page", EntityAddress_Txt_Country, logval);		
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Country Text Box On Maintenance-Entity Page Is Clicked");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntityAddr_Txt_ZipCode(driver), "Entity Zip Code TextBox On Maintenance-Entity Page", String.valueOf(EntityAddress_Txt_ZipCode), logval);		

			//Values Entered In The Entity Address Fields

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntityAddr_Btn_Ok(driver), "OK Button On RMA Application Maintenance--> Entity Address Page",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.MaintenanceEntityFrame);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.MaintenanceEntityFrame, false, "NA", "Maintenance-->Entity Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Entity"), "Entity Tab On Maintenance-Entity Page",logval);// Entity Tab On Maintenance-Entity Page Is Clicked

			Entity_Txt_Addr1 =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntity_Txt_Addr1(driver), "value");
			Entity_Txt_Addr2 =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntity_Txt_Addr2(driver), "value");
			Entity_Txt_Addr3 =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntity_Txt_Addr3(driver), "value");
			Entity_Txt_Addr4 =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntity_Txt_Addr4(driver), "value");
			Entity_Txt_City =   RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEntity_Txt_City(driver), "value");

			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr1, Entity_Txt_Addr1,"Entity Address1 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr2, Entity_Txt_Addr2,"Entity Address2 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr3, Entity_Txt_Addr3,"Entity Address3 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr4, Entity_Txt_Addr4,"Entity Address4 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_City, Entity_Txt_City,"Entity City Value", logval);
			driver.switchTo().parentFrame();
			//=========================================Maintenance-->Entity Set Up Is Completed Here=================================================================================================================================================================================================================================================

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Entity Creation", "New Entity Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Entity Creation", "New Entity Is Created Successfully")));
			}


		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Entity Addition Fail", "Entity Is Not Added")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Entity Addition Fail", "Entity Is Not Added")));
			}
			driver.switchTo().parentFrame();
			throw (e);
		}
		return EntityName;
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_MaintenanceAddNewEntity_Utility
	//Description  		: Enables The User To Add Entities Such As Employee, Patient From Maintenance Screen 
	//Input Parameter 	: Entity: Case Variable Determining Which Entity Is To Be Created, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - KumudNaithani-10-30-2017
	//==========================================================================================================================================================================================================================================
	public static String RMA_MaintenanceAddNewEntity_Utility(String Entity, String ReqParam, String ReqParam1,int logval) throws Exception, Error
	{
		try {
			logger = reports.startTest("<span id='MaintAddNewEntity'>Maintenance Entity Addition</span>", "A New Entity Of Type" + " "+ Entity+" "+ "Is Added From Maintenance Screen");
			String EntityVal; // Last Name Of The Entity Is Fetched In This Variable
			int EntityNumber; // Numeric Part Of The Entity Is Fetched In This Variable If Required
			String FrameID;

			switch (Entity){
			case "Employee":
				EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000000, 9999999);
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EmpLastName_");
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Employee", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.EmployeeFrame);
				//Employee Creation Page Is Opened

				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_EmployeeNumber(driver), "Employee Number TextBox On Maintenance-->Employee Page", String.valueOf(EntityNumber), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "Employee Last Name TextBox On Maintenance-->Employee Page", EntityVal, logval);
				//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Btn_Country(driver), "Country LookUp Button On Employee Creation Page",logval);
				//RMA_Navigation_Utility.RMA_WebPartialLinkSelect(ReqParam, "Country Type LookUp Window On Employee Creation Page", logval);
				//RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Country Value Is Populated IN Country TextBox Of Employee Creation Page");

				//Employee Number, Last Name Values Are Provided For Employee To Be Created

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Maintenance-->Employee Page", logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_EmploymentInfo(driver), "Employment Info Tab On Maintenance-->Employee Page", logval);

				//CODE FIX FOR DEPT. ISSUE. REMOVE LATER..
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Department(driver), "Employee Department TextBox On Maintenance-->Employee Page", "ST", logval);
					RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Value Is Provided To Department TextBox On Maintenance-->Employee Page Page");
				//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(driver.findElement(By.xpath(".//*[@id='deptassignedeid']/p/span/button")), "Department Lookup Button", logval);
				//RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				//Thread.sleep(8000);
				//driver.switchTo().frame(0);

				//RMA_Navigation_Utility.RMA_ObjectClick(driver.findElement(By.xpath(".//*[@class='ng-binding ng-scope orghselectednode'][contains(text(),'ANO-Anodizing')]")), "Department name", logval);

				//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimva"); 
				//driver.switchTo().parentFrame();
				//Thread.sleep(8000);
				//Department Value Is Provided And Employee Is Saved

				//CODE FIX FOR DEPT. ISSUE. ENDED

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Addresses(driver), "Addresses Tab On Employee Creation Page",logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Btn_AddNewAddress(driver), "New Address Image Button On Employee Creation Page",logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Addresses Screen Is Loaded After Clicking Add New Address Buttton On Employee Page");
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_AddrType(driver), "Address Type TextBox On Addresses Tab On Employee Creation Page", "HADDR", logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr1(driver), "Address1 TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address1_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr2(driver), "Address2 TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address2_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr3(driver), "Address3 TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address3_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr4(driver), "Address4 TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address4_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_City(driver), "City TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "City_"), logval);
				// Data Is Entered In Address1,Address2,Address3,Address4,City Fields On Address Tab

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_MaintEmployee_Btn_State(driver), "State Code Look Up Button On Addresses Tab On Employee Creation Page",logval);
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect(ReqParam1, "State Link On State Selection Window", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As State Is Selected On Addresses Tab On Employee Creation Page");
				// Data Is Entered In State Field Of Address Tab

				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_County(driver), "County TextBox On Addresses Tab On Employee Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "County_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_MaintEmployee_Txt_ZipCode(driver), "Zip/Postal Code TextBox On Addresses Tab On Employee Creation Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(10000,99999)), logval);
				// Data Is Entered In County & ZipCode Field Of Address Tab

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_MaintEmployee_Btn_Country(driver), "Country Code Look Up Button On Addresses Tab On Employee Creation Page",logval);
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect(ReqParam, "Country Link On Country Selection Window", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Country Is Selected On Addresses Tab On Employee Creation Page");
				// Data Is Entered In Country Field Of Address Tab


				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Addresses Tab On Employee Creation Page", logval);// Save Button Is Clicked
				//Newly Created Address Is Saved

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Maintenance-->Employee Page", logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_SocialSecurityNumber(driver), "Social Security Number TextBox On Maintenance-->Employee Page",String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11, 99))+"-"+String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111111, 9999999)), logval);
				//Social Security Number Is Provided On Employee Creation Page

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Employee Page", logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Maintenance-->Employee Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_EmployeeNumber(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(String.valueOf(EntityNumber), EntName, "Employee LastName Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Employee Saved Successfully", "Successful Employee Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Employee Saved Successfully", "Successful Employee Creation With Last Name"+ " "+ EntName)));
				}
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Maintenance-->Employee Page", logval);
				break;

			case "MedicalStaff":
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Medical Staff", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.MedicalStaffFrame );
				//Employee Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "MedLastName_");
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Medical Staff Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_FirstName(driver), "First Name TextBox On Maintenance-->Medical Staff Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "MedFirstName_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_StaffNumber(driver), "Staff Number TextBox On Maintenance-->Medical Staff Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999)), logval);	
				//Last Name, Staff Number Values Are Provided For Medical Staff To Be Created

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Medical Staff Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Medical Staff Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Medical Staff Saved Successfully", "Successful Medical Staff Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Medical Staff Saved Successfully", "Successful Medical Staff Creation With Last Name"+ " "+ EntName)));
				}
				break;

			case "Vehicle":
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Vehicle", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.VehicleFrame );
				//Vehicle Creation Page Is Opened
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
				EntityVal = String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999));
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_VehicleMake(driver), "Vehicle Make TextBox On Maintenance-->Vehicle Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "VehicleMake_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_VehicleModel(driver), "Vehicle Model TextBox On Maintenance-->Vehicle  Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "VehModel_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_VehicleID(driver), "Vehicle ID TextBox On Maintenance-->Vehicle  Page", EntityVal, logval);	
				//Vehicle ID,Vehicle Make and Vehicle Model Values Are Provided For Vehicle To Be Created

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Vehicle Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_VehicleID(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Vehicle ID  Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Vehicle Saved Successfully", "Successful Vehicle Creation With Vehicle ID"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Vehicle Saved Successfully", "Successful Vehicle Creation With Vehicle ID"+ " "+ EntName)));
				}
				break;


			case "Patient":
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Patient Tracking", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PatientFrame);
				//Patient Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PatLastName_");
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Patient.RMAApp_MaintPatient_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Patient Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Patient.RMAApp_MaintPatient_Txt_FirstName(driver), "First Name TextBox On Maintenance-->Patient Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PatFirstName_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Patient.RMAApp_MaintPatient_Txt_MiddleName(driver), "Middle Name TextBox On Maintenance-->Patient Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PatMidName_"), logval);
				//Last Name, First Name, Middle Name Values Are Provided For Patient To Be Edited

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Patient Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Patient.RMAApp_MaintPatient_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Patient Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Patient Saved Successfully", "Successful Patient Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Patient Saved Successfully", "Successful Patient Creation With Last Name"+ " "+ EntName)));
				}
				break;

			case "Physician":		
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Physician", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PhysicianFrame);
				//Physician Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PhysLastName_");
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Physician Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_PhysicianNumber(driver), "Physician Number TextBox On Maintenance-->Physician Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100, 999)), logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician. RMAApp_Physician_Txt_MedStaffNumber(driver), "MedStaffNumber TextBox On Maintenance-->Physician Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999)), logval);	
				//Last Name, Physician Number And MedStaffNumber Values Are Provided For Physician To Be Created

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Physician Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Physician Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Physician Saved Successfully", "Successful Physician Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Physician Saved Successfully", "Successful Physician Creation With Last Name"+ " "+ EntName)));
				}
				break;

			case "Driver":
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Driver", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DriverFrame);
				//Driver Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(2, "Dv_");
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Driver Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_Address1(driver), "Address_1 TextBox On Maintenance-->Driver Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "DriverAddr1_"), logval);	
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Driver.RMAApp_MaintDriver_Lst_TypeOfDriver(driver), ReqParam, "DriverType List Box", "Maintenance-->Driver Page", logval);
				//Last Name, Address And DriverType Values Are Provided For Driver To Be Created

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Driver Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Driver Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Driver Saved Successfully", "Successful Driver Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Driver Saved Successfully", "Successful Driver Creation With Last Name"+ " "+ EntName)));
				}
				break;

			case "Entity":
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Entity", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.EntityFrame);
				//Entity Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EntName_");
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Lst_TypeOfEntity(driver), ReqParam, "EntityType List Box", "Maintenance-->Entity Page", logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Txt_Name(driver), "Last Name TextBox On Maintenance-->Entity Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Txt_NatureOfBusiness(driver), "NatureOfBusiness TextBox On Maintenance-->Entity Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Business_"), logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Txt_Tittle(driver), "Title TextBox On Maintenance-->Entity Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(1, "Title"), logval);	
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Lst_IDType(driver), ReqParam1, "IDType List Box", "Maintenance-->Entity Page", logval);
				//Name, Entity Type, Title, Nature Of Business, And ID Type Values Are Provided For Entity To Be Created

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Entity Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Txt_Name(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Entity Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Entity Saved Successfully", "Successful Entity Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Entity Saved Successfully", "Successful Entity Creation With Last Name"+ " "+ EntName)));
				}
				break;

			case "People":
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-People", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PeopleFrame);
				//People Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PeopleName_");
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_People.RMAApp_People_Lst_TypeOPerson(driver), ReqParam, "PeopleType List Box", "Maintenance-->People Page", logval);
				
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_People.RMAApp_People_Txt_Name(driver), "Last Name TextBox On Maintenance-->People Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_People.RMAApp_People_Txt_ReferenceNumber(driver), "ReferenceNumber TextBox On Maintenance-->Entity Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999)), logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_People.RMAApp_People_Txt_Tittle(driver), "Title TextBox On Maintenance-->People Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(1, "Title"), logval);	
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_People.RMAApp_People_Lst_IDType(driver), ReqParam1, "IDType List Box", "Maintenance-->People Page", logval);
				//Name, People Type, Title, Reference Number, And ID Type Values Are Provided For Entity To Be Created

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->People Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_People.RMAApp_People_Txt_Name(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "People Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "People Saved Successfully", "Successful People Creation With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "People Saved Successfully", "Successful People Creation With Last Name"+ " "+ EntName)));
				}
				break;

			case "PolicyTracking":                    
				String Effective_Date;
				String Expiration_Date;
				String strPolicyNumber;

				Effective_Date = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,-1,"MM/dd/yyyy");                
				Expiration_Date = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");     

				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Policy Tracking ", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PolicyFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				//Policy Creation Page Is Opened

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PolicyName_");    
				strPolicyNumber = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PolicyName_"); 
				Thread.sleep(8000);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyName(driver), "Policy Name TextBox On Maintenance-->Policy Page", EntityVal, logval); 
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyNumber(driver), "Policy Number TextBox On Maintenance-->Policy Page", strPolicyNumber, logval);
				//CODE FIX FOR POLICY STATUS STARTS...TO BE REMOVED LATER

				/*RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_policyStatus(driver), "Policy Status TextBox On Maintenance-->Policy Page", ReqParam, logval);
				 */
				RMA_Navigation_Utility.RMA_ObjectClick(driver.findElement(By.id("btn_policystatuscode")), "Policy status button", logval);
				RMA_Navigation_Utility.RMA_WebLinkSelect("In Effect", "Claim Status LookUp Window On General Claim Creation Page", logval);
				Thread.sleep(5000);

				//CODE FIX FOR POLICY STATUS ENDED

				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_chk_PrimaryPolicy(driver), "check", "Primary Policy Check Box", "Policy Page", logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_chk_ClaimsMadeCoverage(driver), "check", "Claims Made Coverage Check Box", "Policy Page", logval);

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_Premium(driver), "Premium TextBox On Policy Page" ,logval);							
				RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_Premium(driver), "Premium TextBox On Policy Page", ReqParam1, logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_EffectiveDate(driver), "Premium TextBox On Policy Page" ,logval);							

				//	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_Premium(driver), "Premium TextBox On Maintenance-->Policy Page", ReqParam1, logval);                       
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_EffectiveDate(driver), "Effective Date TextBox On Maintenance-->Policy Page", Effective_Date, logval);
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_ExpirationDate(driver), "Expiration Date TextBox On Maintenance-->Policy Page", Expiration_Date, logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Tab_InsurerInfo(driver), "Insurer Info Tab On Maintenance-->Policy Page", logval);

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_Insurer(driver), "Insurer Look Up Button On Policy Page",logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Search Window To Be Open");
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PolicySearchFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_SubmitQuery(driver), "Distribution Type Code Look Up Button On RMA Application Payments Creation Page",logval);
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Insurers", "Insurer Link On Entity Search Window", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Insurer Is Selected In policy Page");
				driver.switchTo().parentFrame(); // Navigate To Parent Frame                    
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_Insured(driver), "Insured Look Up Button On Policy Page",logval);                        
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);      
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Org Hierarchy Last Name Window");
				driver.switchTo().frame(0);
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Home.RMAApp_OrgHierarchy_List_OrgLevel(driver), "Department", "Org Hierarchy Level DropDown List on Org Hierarchy Window Popup" , "Insured Model Popup On Policy Page",logval);                     
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_OrgHierarchy_Lnk_LastName(driver),"Insured LookUp Window On Policy Page",logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Insured Is Selected In policy Page");
				driver.switchTo().parentFrame(); // Navigate To Parent Frame  
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Tab_PolicyInfo(driver), "Policy Info Tab On Maintenance-->Policy Page", logval);                
				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Policy Tracking", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Policy Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Policy Saved Successfully", "Successful Policy Creation With Policy Name"+ " "+ EntName)));
				}else{      
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Policy Saved Successfully", "Successful Policy Creation With Policy Name"+ " "+ EntName)));
				}
				break;
				
			case "PropertyUnit":
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Property", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PropertyFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				//Property Creation Page Is Opened

				int PropertyID;
				String Address1;
				String City;
				int Zip;

				PropertyID=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111, 999999);
				Address1=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Address1_");
				City=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "City_");
				Zip=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11111, 99999);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Property.RMAApp_Property_Txt_PropertyID(driver), "PropertyID TextBOx On Maintenance-->Property Creation Page",String.valueOf(PropertyID), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Property.RMAApp_Property_Txt_Address1(driver), "Address1 TextBox On Maintenance-->Property Creation Page", Address1, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Property.RMAApp_Property_Txt_City(driver), "City TexyBox On Maintenance-->Property Creation Page", City, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Property.RMAApp_Property_Txt_ZipPostalCode(driver), "Zip/Postal Code TextBox On Maintenance-->Property Creation Page", String.valueOf(Zip), logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Property.RMAApp_Property_Btn_State(driver), "State Lookup Image Button On Maintenance-->Property Creation Page", logval);
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect(ReqParam, "State Lookup Window On Maintenance-->Property Creation Page", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Value Is Provided In State TextBox On Maintenance-->Property Creation Page");

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Property Page", logval);
				EntName=RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Property.RMAApp_Property_Txt_PropertyID(driver), "value");
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Property Saved Successfully", "Successful Property Creation With PropertyID"+ " "+ EntName)));
				}else{      
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Property Saved Successfully", "Successful Property Creation With PropertyID"+ " "+ EntName)));
				}
				break;

			case "AdminTrackingList":
				int BondNumber;
				BondNumber=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111, 999999);

				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Admin Tracking List", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.AdminTrackingFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				//Admin Tracking Creation Page Is Opened

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_AdminTracking.RMAApp_AdminTracking_Lst_Table(driver), "List Element On Maintenance-->Admin Tracking Creation Page", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Bond Abstract Page Is Loaded");

				//globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_AdminTracking.RMAApp_AdminTracking_Txt_BondNumber(driver)));
				DefaultFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AdminTracking.RMAApp_AdminTracking_Txt_BondNumber(driver), "Bond Number TextBox On Maintenance-->Admin Tracking creation Page",String.valueOf(BondNumber), logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_AdminTracking.RMAApp_AdminTracking_Btn_BondType(driver),"Bond Type Image Lookup Button On Maintenance-->Admin Tracking Creation Page", logval);
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect(ReqParam,"Bond Type Lookup Window On Maintenance-->Admin Tracking Creation Page", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Value Is Set In Bond Type TextBox On Maintenance-->Admin Tracking Creation Page");
				FrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA","Maintenance-->Admin Tracking", logval);
				EntName=RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_AdminTracking.RMAApp_AdminTracking_Txt_BondType(driver), "value");
				// Bond Type Value Is fetched in variable
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Admin Tracking Saved Successfully", "Successful Admin Tracking Creation With Type"+ " "+ EntName)));
				}else{      
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Admin Tracking Saved Successfully", "Successful Admin Tracking Creation With Type"+ " "+ EntName)));
				}
				break;

			case "LeavePlanManagement":
				String PlanCode;
				String PlanName;
				String EffectiveDate;
				String ExpirationDate;
				String StrPrimaryWindowHandle;
				PlanCode=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PlanCode_");
				PlanName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4,"PlanName_");
				EffectiveDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
				ExpirationDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");

				rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Maintenance-LeavePlanManagement", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.LeaveManagementFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				//Leave Plan Management Creation Page Is Opened

				globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_LeavePlanManagement.RMAApp_LeavePlanManagement_Txt_PlanCode(driver)));
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_LeavePlanManagement.RMAApp_LeavePlanManagement_Txt_PlanCode(driver), "Plan Code TextBox On Maintenance-->Leave Plan Management Creation Page", PlanCode, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_LeavePlanManagement.RMAApp_LeavePlanManagement_Txt_PlanName(driver), "Plan Name TextBox On Maintenance-->Leave Plan Management Creation Page", PlanName, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_LeavePlanManagement.RMAApp_LeavePlanManagement_Txt_EffectiveDate(driver), "Effective Date TextBox On Maintenance-->Leave Plan Management Creation Page", EffectiveDate, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_LeavePlanManagement.RMAApp_LeavePlanManagement_Txt_ExpirationDate(driver), "Expiration Date TextBox On Maintenance-->Leave Plan Management Creation Page", ExpirationDate, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_LeavePlanManagement.RMAApp_LeavePlanManagement_Txt_DefaultHours(driver), "Default Hours Per Weeks TextBox On Maintenance-->Leave Plan Management Creation Page", String.valueOf(20), logval);

				StrPrimaryWindowHandle = driver.getWindowHandle();
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_LeavePlanManagement.RMAApp_LeavePlanManagement_Btn_PlanStatus(driver), "Plan Status Image Lookup Button On Maintenance-->Leave Plan Management Creation Page", logval);
				RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, "NA", "NA", "NA", "NA", "NA", "Lookup Window on Maintenance-->Leave Plan Management", logval);
				RMA_Navigation_Utility.RMA_WebLinkSelect(ReqParam,"Plan Status Lookup Window On Maintennace-->Leave Plan Management Creation Page", logval);
				driver.switchTo().window(StrPrimaryWindowHandle);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.LeaveManagementFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				FrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();

				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Leave Plan Management Page", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				//RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID,false , "Na", "Maintenance-->Leave Plan Management", logval);
				EntName=RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_LeavePlanManagement.RMAApp_LeavePlanManagement_Txt_PlanName(driver),"value");
				//Plan Name is fetched in variable

				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Leave Plan Management Saved Successfully", "Successful Leave Plan Management Creation With Plan Name"+ " "+ EntName)));
				}else{      
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Leave Plan Management Saved Successfully", "Successful Leave Plan Management Creation With Plan Name"+ " "+ EntName)));
				}
				break;				

			case "PlanManagement":
				String StrPlanname;
				int StrPlannumber;
				String StrPlanEffectiveDate;
				String StrPlanExpirationDate;
				StrPlanEffectiveDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
				StrPlanExpirationDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");

				rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Maintenance-PlanManagement", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Plan Management");
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				StrPlanname=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Plan_");
				StrPlannumber=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_Planname(driver)));
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_PlanNumber(driver), "Plan Number Text Box on Maintenance -> Plan Management Page", String.valueOf(StrPlannumber), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_EffectiveDate(driver), "Effective Date Text Box on Maintenance -> Plan Management Page", StrPlanEffectiveDate, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_ExpirationDate(driver), "Expiration Date Text Box on Maintenance -> Plan Management Page", StrPlanExpirationDate, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Value Is Given In Fields On Plan Management Page");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_Planname(driver), "Plan Name Text Box on Maintenance -> Plan Management Page", StrPlanname, logval);
				StrPrimaryWindowHandle=driver.getWindowHandle();
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Btn_PlanStatus(driver), "Plan Status Lookup Button Button On Maintenance -> Plan Management Page", logval);
				RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, "NA", "NA", "NA", "NA", "NA", "Lookup Window on Maintenance-->Plan Management", logval);
				RMA_Navigation_Utility.RMA_WebLinkSelect(ReqParam, " Maintenance--> Plan Management", logval);
				driver.switchTo().window(StrPrimaryWindowHandle);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Plan Management");
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Plan Management Page", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				EntName=RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_Planname(driver).getAttribute("value");
				RMA_Verification_Utility.RMA_TextCompare(StrPlanname, EntName, "Plan Name", logval);
				if(logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Created Plan Name Successfully With Plan Name:" + " " + color.RMA_ChangeColor_Utility(EntName,3));
				}
				else
				{
					logger.log(LogStatus.PASS, "Created Plan Name Successfully With Plan Name:" + " " + color.RMA_ChangeColor_Utility(EntName,3));
				}
				break;

			default:

				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Entity+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Entity+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}
			return EntName;

		} catch (Exception|Error e) {
			throw (e);
		}
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_MainenanceEditEntity_Utility
	//Description  		: Enables The User To Edit Entities Such As Employee, Patient From Maintenance Screen
	//Input Parameter 	: Entity: Case Variable Determining Which Entity Is To Be Created, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - KumudNaithani-10-30-2017
	//==========================================================================================================================================================================================================================================
	public static String RMA_MainenanceEditEntity_Utility(String Entity, String ReqParam, String FrameID, int logval) throws Exception, Error
	{
		try {
			logger = reports.startTest("<span id='MaintEditEntity'>Maintenance Entity Edit</span>", "Already Created Entity Of Type" + " "+ Entity+" "+ "Is Edited From Maintenance Screen");
			String EntityVal; // Last Name Of The Entity Is Fetched In This Variable
			switch (Entity){
			case "Employee":
				RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(FrameID);
				// Switch To Frame That Contains Controls Of The Employee To Be Edited Is Done

				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedEmpLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "Employee Last Name TextBox On Maintenance-->Employee Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_FirstName(driver), "Employee First Name TextBox On Maintenance-->Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EmpFirstName_"), logval);
				//Last Name Value Is Provided For The Employee To Be Edited

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Employee Page", logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Maintenance-->Employee Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Employee LastName Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Employee Edited Successfully", "Successful Employee Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Employee Edited Successfully", "Successful Employee Edit With Last Name"+ " "+ EntName)));
				}
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Person Involved-->Employee Page", logval);
				break;

			case "MedicalStaff":
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedMedLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_LastName(driver), "Last Name TextBox On MedicalStaff-->Maintenance Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_FirstName(driver), "First Name TextBox On MedicalStaff-->Maintenance Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedMedFirstName_"), logval);
				//Last Name, First Name Values Are Provided For Medical Staff To Be Edited

				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "MedicalStaff-->Maintenance Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Medical Staff LastName Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Medical Staff Edited Successfully", "Successful Medical Staff Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Medical Staff Edited Successfully", "Successful Medical Staff Edit With Last Name"+ " "+ EntName)));
				}
				break;

			case "Vehicle":
				EntityVal = String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999));
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_VehicleModel(driver), "Vehicle Model TextBox On Maintenance-->Vehicle Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditVehModel_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_VehicleID(driver), "Vehicle ID TextBox On Maintenance-->Vehicle  Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_LicenseNumber(driver), "License Number TextBox On Maintenance-->Vehicle  Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999)), logval);	
				//Vehicle ID and Vehicle Model Values Are Provided For Vehicle To Be Created

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Vehicle Page", logval);	
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_VehicleID(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Vehicle ID  Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Vehicle Edited Successfully", "Successful Vehicle Edit With Vehicle ID"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Vehicle Edited Successfully", "Successful Vehicle Edit With Vehicle ID"+ " "+ EntName)));
				}
				break;

			case "Patient":
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedPatientLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Patient.RMAApp_MaintPatient_Txt_LastName(driver), "Last Name TextBox On MedicalStaff-->Maintenance Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Patient.RMAApp_MaintPatient_Txt_FirstName(driver), "First Name TextBox On MedicalStaff-->Maintenance Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedPatientFirstName_"), logval);
				//Last Name, First Name Values Are Provided For Patient To Be Edited

				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "MedicalStaff-->Maintenance Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Patient.RMAApp_MaintPatient_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Patient Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Patient Edited Successfully", "Successful Patient Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Patient Edited Successfully", "Successful Patient Edit With Last Name"+ " "+ EntName)));
				}
				break;

			case "Physician":
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedPhytLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Physician Page", EntityVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician. RMAApp_Physician_Txt_MedStaffNumber(driver), "MedStaffNumber TextBox On Maintenance-->Physician Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999)), logval);	
				//Last Name And MedStaffNumber Values Are Provided For Physician To Be Created

				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Physician Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Physician Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Physician Edited Successfully", "Successful Physician Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Physician Edited Successfully", "Successful Physician Edit With Last Name"+ " "+ EntName)));
				}
				break;

			case "Driver":
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedDriverLastName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Driver Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_Address1(driver), "Address_1 TextBox On Maintenance-->Driver Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedDriverAddr1_"), logval);	
				//Last Name, Address Values Are Provided For Driver To Be Edited

				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Driver Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Driver.RMAApp_Driver_Txt_LastName(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Driver Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Driver Edited Successfully", "Successful Driver Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Driver Edited Successfully", "Successful Driver Edit With Last Name"+ " "+ EntName)));
				}
				break;

			case "Entity":
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedEntName_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Txt_Name(driver), "Last Name TextBox On Maintenance-->Entity Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Txt_NatureOfBusiness(driver), "NatureOfBusiness TextBox On Maintenance-->Entity Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditBusin_"), logval);	
				//Name, Nature Of Business Are Provided For Entity To Be Created

				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Entity Page", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Txt_Name(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "Entity Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Entity Edited Successfully", "Successful Entity Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Entity Edited Successfully", "Successful Entity Edit With Last Name"+ " "+ EntName)));
				}
				break;

			case "People":
				EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedPeoLastName_");	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_People.RMAApp_People_Txt_Name(driver), "Last Name TextBox On Maintenance-->People Page", EntityVal, logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_People.RMAApp_People_Txt_ReferenceNumber(driver), "ReferenceNumber TextBox On Maintenance-->Entity Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999)), logval);	
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_People.RMAApp_People_Txt_Tittle(driver), "Title TextBox On Maintenance-->People Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(1, "EdtTitle"), logval);	
				//Name, People Type, Title,  Values Are Provided For People To Be Created

				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_People.RMAApp_People_Txt_Name(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntName, "People Last Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Other Person Edited Successfully", "Successful Other Person Edit With Last Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Other Person Edited Successfully", "Successful Other Person Edit With Last Name"+ " "+ EntName)));
				}
				break;

			case "PolicyTracking":					
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_Premium(driver), "Premium TextBox On Policy Page" ,logval);							
				RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_Premium(driver).clear();
				RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_Premium(driver), "Premium TextBox On Policy Page", ReqParam, logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_EffectiveDate(driver), "Premium TextBox On Policy Page" ,logval);							

				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Lst_BankAccount(driver), "Claim Payment", "Bank Account List", "Policy Page", logval);		
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Policy Tracking", logval);
				EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_Premium(driver), "value");				
				RMA_Verification_Utility.RMA_TextCompare("$" + ReqParam + ".00", EntName, "Policy Premium Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Policy Edited Successfully", "Successful Policy With Name "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Policy Edited Successfully", "Successful Policy With Name "+ EntName)));
				}
				break;

			default:
				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Entity+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Entity+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}
			return EntName;

		} catch (Exception|Error e) {
			throw (e);
		}
	}


	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_PolicyEntityAddition_Utility
	//Description  		: Enables The User To Add Entities Such As Policy Coverage From Policy Screen 
	//Input Parameter 	: Entity: Case Variable Determining Which Entity Is To Be Created, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - AbhishekRai-11-07-2017
	//==========================================================================================================================================================================================================================================
	public static String RMA_PolicyEntityAddition_Utility(String Entity, String ReqParam, String ReqParam1,String PolicyName ,int logval) throws Exception, Error
	{		
		try {
			logger = reports.startTest("<span id='PolicyEntityAddition'>Policy Entity Addition</span>", "A New Entity Of Type" + " "+ Entity+" "+ "Is Added For Following Policy:: " + PolicyName + " From Policy Screen");			
			String FrameID;
			switch (Entity){				
			case "PolicyCoverage":	
				String StrCoverageType;
				globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Policy Coverage ")));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Policy Coverage "), "Add Image Button For Policy Coverage For The Following Policy:: " + PolicyName + " On Policy Tracking Page",logval);					
				RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Added As Policy Coverage Screen Is Being Loaded");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_CoverageType(driver), "Coverage Type LookUp Button On Policy Coverage Page For The Following Policy:: " + PolicyName + " On Policy Tracking Page",logval);							
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect(ReqParam, "Coverage Type Lookup Window", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Coverage Type Is Selected On Policy Coverage Page");					

				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyLimit(driver), "Policy Limit TextBox On Policy Coverage Page For The Following Policy:: " + PolicyName ,logval);							
				RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyLimit(driver), "Policy Limit TextBox On Maintenance-->Policy Coverage Page", ReqParam1, logval);
				//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyLimit(driver), "Policy Limit TextBox On Policy Coverage Page For The Following Policy:: " + PolicyName ,logval);							
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Policy.RMAApp_PolicyCoverage_Txt_BrokerLastName(driver), "Coverage Type TextBox On Policy Coverage Page For The Following Policy:: " + PolicyName ,logval);							

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();					
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Policy Tracking-->Policy Coverage Page", logval);
				ReturnValue =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyLimit(driver), "value");
				StrCoverageType =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_CoverageType(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare("$" +  ReqParam1 + ".00", ReturnValue, "Policy Limit Value", logval);
				//RMA_Verification_Utility.RMA_TextCompare(ReqParam, StrCoverageType, "Policy Coverage Type Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Policy Coverage Saved Successfully", "Successful Policy Coverage Creation With Policy Coverage Type " + StrCoverageType )));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Policy Coverage Saved Successfully", "Successful Policy Coverage Creation With Policy Coverage Type " + StrCoverageType )));
				}
				break;	
			case "PolicyMCO":				
				globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Policy MCO ")));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Policy MCO "), "Add Image Button For Policy MCO On Policy Tracking Page",logval);				
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Policy MCO Screen Loaded");

				//CODE FIX FOR POLICY MCO STARTS... TO BE REMOVED LATER

				//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyMCO(driver), "Policy MCO TextBox On Maintenance-->Policy MCO Page", ReqParam, logval);
				RMA_Navigation_Utility.RMA_ObjectClick(driver.findElement(By.id("btn_mcoeid")), "Policy MCo Lookup", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				driver.switchTo().frame(0);
				RMA_Input_Utility.RMA_SetValue_Utility(driver.findElement(By.name("Last Name")), "Entity id", ReqParam, logval);
				RMA_Navigation_Utility.RMA_ObjectClick(driver.findElement(By.id("submitquery")), "Submit Query", logval);
				RMA_Navigation_Utility.RMA_WebLinkSelect("Managed Care Organizations", "Searched text", logval);
				driver.switchTo().parentFrame();

				//CODE FIX FOR POLICY MCO ENDS

				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();		
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Save Button Clickable");
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Policy Tracking-->Policy MCO", logval);			
				ReturnValue =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyMCO(driver), "value").trim();
				//RMA_Verification_Utility.RMA_TextCompare(ReqParam, ReturnValue, "Policy MCO Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Policy MCO Saved Successfully", "Successful Policy MCO With Policy Name"+ " "+ EntName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Policy MCO Saved Successfully", "Successful Policy MCO With Policy Name"+ " "+ EntName)));
				}
				break;
			default:

				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Entity+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Entity+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}
			return ReturnValue;

		} catch (Exception|Error e) {
			throw (e);
		}
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_MaintenanceCreateEditNewOrgHierarchy_Utility
	//Description  		: Enables The User To Create/Edit New Org Hierarchy From Maintenance Screen 
	//Input Parameter 	: Case Variable To Indicate User Action (Create, Edit For Org. hierarchy), ,logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - AnubhutiVyas-11-07-2017
	//==========================================================================================================================================================================================================================================
	public static String RMA_MaintenanceCreateEditNewOrgHierarchy_Utility(String Case,int logval) throws Exception, Error
	{
		String OrgHierarchyNameVal; // Last Name Of The Org.Hierarchy Is Fetched In This Variable
		String OrgHierarchyAbbreviationVal; //Abbreviation Of The Org.Hierarchy Is Fetched In This Variable
		String FrameID;
		String NatureOfBuss;
		//Local Variable Declaration Is Completed Here

		OrgHierarchyNameVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "OrgHierName_");
		OrgHierarchyAbbreviationVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(2, "A_");
		NatureOfBuss = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Health_");
		//Local Variable Initialization Is Completed Here

		try {
			OrgHierarchyName = null;
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Verify User Can"+ " "+ Case + " " +"New Org. Hierarchy Successfully");	
			}
			else
			{
				logger = reports.startTest("<span id='MaintenanceCreateEditNewOrgHierarchy'>Maintenance Org. Hierarchy " + " " + Case+"</span>", "Verify User Can"+ " "+ Case +"  " +"New Org. Hierarchy Successfully");
			}

			switch(Case)
			{
			case "Create":			
				rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Org. Hierarchy", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.OrgHierarchyFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Img_New(driver), "New Image On Maintenance-->Org. Hierarchy Page", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Organization Hierarchy Screen Is Loaded After Clicking New Buttton On Maintenance-Org Hierarchy Page");
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.OrgHierarchyNewRecordFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Txt_Name(driver), "Name TextBox On Maintenance-Org Hierarchy Page", OrgHierarchyNameVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Txt_Abbreviation(driver), "Abbreviation TextBox On Maintenance-Org Hierarchy Page", OrgHierarchyAbbreviationVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Txt_NatureOfBusiness(driver), "Nature Of Business TextBox On Maintenance-Org Hierarchy Page", NatureOfBuss, logval);
				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Org. Hierarchy Page", logval);	
				OrgHierarchyName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Txt_Name(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(OrgHierarchyNameVal, OrgHierarchyName, "Org. Hierarchy Name Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Org. Hierarchy Saved Successfully", "Successful Org. Hierarchy Creation With Name"+ " "+ OrgHierarchyName)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Org. Hierarchy Saved Successfully", "Successful Org. Hierarchy Creation With Name"+ " "+ OrgHierarchyName)));
				}
				break;
			case "Edit":
				OrgHierarchyNameVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedOrgHierName_");
				NatureOfBuss = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedHealth_");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Txt_Name(driver), "Name TextBox On Maintenance-Org Hierarchy Page", OrgHierarchyNameVal, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Txt_NatureOfBusiness(driver), "Nature Of Business TextBox On Maintenance-Org Hierarchy Page", NatureOfBuss, logval);
				FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Org. Hierarchy Page", logval);
				OrgHierarchyName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Txt_Name(driver), "value");
				RMA_Verification_Utility.RMA_TextCompare(OrgHierarchyNameVal, OrgHierarchyName, "Org. Hierarchy Name Value", logval);
				RMA_Verification_Utility.RMA_TextCompare(NatureOfBuss, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Txt_NatureOfBusiness(driver), "value"), "Org. Hierarchy Nature Of Business Value", logval);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Org. Hierarchy Edited Successfully", "Successful Org. Hierarchy Edit With Name"+ " "+ OrgHierarchyNameVal)));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Org. Hierarchy Edited Successfully", "Successful Org. Hierarchy Edit With Name"+ " "+ OrgHierarchyNameVal)));
				}
				break;
			default:
				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}

			}

		} catch (Exception|Error e) 
		{
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver,Case +" Enhanced Notes Fail", Case +" Enhanced Notes Is Not Done")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, Case +" Enhanced Notes Fail",Case +" Enhanced Notes Is Not Done")));
			}
			if (!(RMA_Selenium_POM_Home.RMAApp_GenericToast_ErrorMsg(driver)== null))
			{
				ErrorTxtMessage = RMA_Selenium_POM_Home.RMAApp_GenericToast_ErrorMsg(driver).getText();
				if (logval ==0)

				{
					parentlogger.log(LogStatus.FAIL, "UnExpected Error Toast Message With Following Text Is Displayed" + " "+ color.RMA_ChangeColor_Utility(ErrorTxtMessage,1));
				}
				else
				{
					logger.log(LogStatus.FAIL, "UnExpected Error Toast Message With Following Text Is Displayed" + " " +color.RMA_ChangeColor_Utility(ErrorTxtMessage,1));
				}
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ErrorToastMsgClose(driver), "Close Button On Error Toast Message", logval);
			}
			driver.switchTo().parentFrame();
			throw (e);
		}
		return OrgHierarchyName;
	}

	//====================================================================================================
	//FunctionName 		: RMA_EntityAddition_Utility
	//Description  		: Enables The User To Add An Entity With Address Through Maintenance Screen
	//Input Parameter 	: Entity Type, Address Type, Address1, Address2, Address3, Address4, City, State,County, Country Of The Type String, ZipCode Of The Type Integer	 
	//Revision			: 0.0-AnubhutiVyas-10-05-2017
	// ====================================================================================================
	public static String RMA_EntityAddition_Utility(String MaintEnt_Lst_EntityType,String EntityAddress_Txt_AddType,String EntityAddress_Txt_Addr1,String EntityAddress_Txt_Addr2,String EntityAddress_Txt_Addr3,String EntityAddress_Txt_Addr4,String EntityAddress_Txt_City,String EntityAddress_Txt_State,String EntityAddress_Txt_County,String EntityAddress_Txt_Country,int EntityAddress_Txt_ZipCode,int Intlogval) throws Exception, Error
	{
		String EntityName;
		String EntityVal; // Last Name Of The Entity Is Fetched In This Variable
		String FrameID;
		//Local Variable Declaration Is Completed Here

		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Creates A New Entity With Address From the Maintenance Screen");
			}
			else
			{	
				logger = reports.startTest("<span id='EntityAddition'>Entity Addition</span>", "User Creates A New Entity With Address From the Maintenance Screen");
			}

			//==============================================================Maintenance-->Org. Hierarchy Set Up Is Started Here=================================================================================================================================================================================================================================================
			
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Maintenance-Org Hierarchy Page Is Loaded");
			if (RMA_Selenium_POM_VerificationMessage.NumberOfPrimaryWindows==2)
			{

			}
			else if (RMA_Selenium_POM_VerificationMessage.NumberOfPrimaryWindows==3)
			{
				RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrRMAUXWindowHandle, "NA", "NA", "NA", "Navigation To RMA Maintenance Screen", Intlogval);
			}
			//==============================================================Maintenance-->Org. Hierarchy Set Up Is Completed Here=================================================================================================================================================================================================================================================

			//===========================================================New Entity Creation Is Started Here================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Entity", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.EntityFrame);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
			//Entity Creation Page Is Opened

			EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EntName_");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Lst_TypeOfEntity(driver), MaintEnt_Lst_EntityType, "EntityType List Box", "Maintenance-->Entity Page", Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Txt_Name(driver), "Last Name TextBox On Maintenance-->Entity Page", EntityVal, Intlogval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Txt_NatureOfBusiness(driver), "NatureOfBusiness TextBox On Maintenance-->Entity Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Business_"), Intlogval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Txt_Tittle(driver), "Title TextBox On Maintenance-->Entity Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(1, "Title"), Intlogval);	
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Lst_IDType(driver), "SSN", "IDType List Box", "Maintenance-->Entity Page", Intlogval);
			//Name, Entity Type, Title, Nature Of Business, And ID Type Values Are Provided For Entity To Be Created

			FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Entity Page", Intlogval);
			// New Entity From Maintenance Screen Is Successfully Created
			EntityName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_Txt_Name(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntityName, "Entity Last Name Value", Intlogval);
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Entity Saved Successfully", "Successful Entity Creation With Last Name"+ " "+ EntityName)));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Entity Saved Successfully", "Successful Entity Creation With Last Name"+ " "+ EntityName)));
			}
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Addresses(driver), "Addresses Tab On Entity Creation Page",Intlogval);
			//============================================================New Entity Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Btn_AddNewAddress(driver), "Add New Address On Addresses Tab On Maintenance--> Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Addresses Screen Is Loaded After Clicking Add New Address Buttton On Maintenance--> Page");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_AddrType(driver), "Address Type TextBox On Addresses Tab On Maintenance--> Page", EntityAddress_Txt_AddType, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_Addr1(driver), "Address1 TextBox On Addresses Tab On Maintenance--> Page", EntityAddress_Txt_Addr1, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_Addr2(driver), "Address2 TextBox On Addresses Tab On Maintenance--> Page", EntityAddress_Txt_Addr2, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_Addr3(driver), "Address3 TextBox On Addresses Tab On Maintenance--> Page", EntityAddress_Txt_Addr3, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_Addr4(driver), "Address4 TextBox On Addresses Tab On Maintenance--> Page", EntityAddress_Txt_Addr4, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_City(driver), "City TextBox On Addresses Tab On Maintenance--> Page", EntityAddress_Txt_City, Intlogval);
			// Data Is Entered In Address1,Address2,Address3,Address4,City Fields On Address Tab

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Btn_State(driver), "State Code Look Up Button On Addresses Tab On Maintenance--> Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Alabama", "State Link On State Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As State Is Selected On Addresses Tab On Maintenance--> Page");
			// Data Is Entered In State Field Of Address Tab

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Btn_Country(driver), "Country Code Look Up Button On Addresses Tab On Maintenance--> Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Austria", "Country Link On Country Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Country Is Selected On Addresses Tab On Maintenance--> Page");
			// Data Is Entered In Country Field Of Address Tab

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_County(driver), "County TextBox On Addresses Tab On Maintenance--> Page", EntityAddress_Txt_County, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_ZipCode(driver), "Zip/Postal Code TextBox On Addresses Tab On Maintenance--> Page", String.valueOf(EntityAddress_Txt_ZipCode), Intlogval);
			// Data Is Entered In County & ZipCode Field Of Address Tab

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Addresses Tab On Maintenance--> Page", Intlogval);// Save Button Is Clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Save Is Clicked On Addresses Tab On Maintenance--> Page");
			RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance--> Page", Intlogval);
			// Address Information Is Saved

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Address Creation", "New Address Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Address Creation", "New Address Is Created Successfully")));
			}
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification Of Address Field Values On Org. Hierarchy Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",Intlogval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr1, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr1(driver), "value"), "Addrress1 Value", Intlogval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr2, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr2(driver), "value"), "Addrress2 Value", Intlogval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr3, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr3(driver), "value"), "Addrress3 Value", Intlogval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr4, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr4(driver), "value"), "Addrress4 Value", Intlogval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_City, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_City(driver), "value"), "City Value", Intlogval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_County, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_County(driver), "value"), "County Value", Intlogval);
			RMA_Verification_Utility.RMA_PartialTextVerification(EntityAddress_Txt_State, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyClient_Txt_State(driver), "value"), "State Value", Intlogval);
			RMA_Verification_Utility.RMA_PartialTextVerification(EntityAddress_Txt_Country, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyClient_Txt_Country(driver), "value"), "Country Value", Intlogval);
			//RMA_Verification_Utility.RMA_TextCompare(String.valueOf(IntZipCode), RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyClient_Txt_ZipCode(driver), "value"), "Zip Code Value", Intlogval);
			//Address Verification Is Performed
			//===========================================================Verification Of Address Field Values On Org. Hierarchy Screen Completed Here=======================================================================================================================================================================================================================================================

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Address Verification", "New Address Is Verified Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Address Verification", "New Address Is Verified Successfully")));
			}

		} catch (Exception|Error e) {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Entity Addition Fail", "Entity Is Not Added")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Entity Addition Fail", "Entity Is Not Added")));
			}
			driver.switchTo().parentFrame();
			throw (e);
		}
		return EntityName;
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_Entity_AddressAddition_Utility
	//Description  		: Enables The User To Create Address For Entity
	//Input Parameter 	: logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - AnubhutiVyas-11-10-2017
	//==========================================================================================================================================================================================================================================
	public static String RMA_Entity_AddressAddition_Utility(String FrameID,String Entity,String StrAddressType,String StrAddress1,String StrAddress2,String StrAddress3,String StrAddress4,String StrCity,String StrCounty,String StrState, int IntZipCode,String StrCountry, int Intlogval) throws Exception, Error
	{

		try {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Creates Address Of A Newly Created" + " " + Entity); 
			}else{	
				logger = reports.startTest("<span id='EntityAddressAddition'>Address Addition</span>", "User Creates Address Of A Newly Created" + " "+ Entity);
			}

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Btn_AddNewAddress(driver), "Add New Address On Addresses Tab On Maintenance--> "+Entity+ " Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Addresses Screen Is Loaded After Clicking Add New Address Buttton On Maintenance--> "+Entity+ " Page");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_AddrType(driver), "Address Type TextBox On Addresses Tab On Maintenance--> "+Entity+ " Page", StrAddressType, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_Addr1(driver), "Address1 TextBox On Addresses Tab On Maintenance--> "+Entity+ " Page", StrAddress1, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_Addr2(driver), "Address2 TextBox On Addresses Tab On Maintenance--> "+Entity+ " Page", StrAddress2, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_Addr3(driver), "Address3 TextBox On Addresses Tab On Maintenance--> "+Entity+ " Page", StrAddress3, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_Addr4(driver), "Address4 TextBox On Addresses Tab On Maintenance--> "+Entity+ " Page", StrAddress4, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_City(driver), "City TextBox On Addresses Tab On Maintenance--> "+Entity+ " Page", StrCity, Intlogval);
			// Data Is Entered In Address1,Address2,Address3,Address4,City Fields On Address Tab

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Btn_State(driver), "State Code Look Up Button On Addresses Tab On Maintenance--> "+Entity+ " Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrState, "State Link On State Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As State Is Selected On Addresses Tab On Maintenance--> "+Entity+ " Page");
			// Data Is Entered In State Field Of Address Tab

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Btn_Country(driver), "Country Code Look Up Button On Addresses Tab On Maintenance--> "+Entity+ " Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrCountry, "Country Link On Country Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Country Is Selected On Addresses Tab On Maintenance--> "+Entity+ " Page");
			// Data Is Entered In Country Field Of Address Tab

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_County(driver), "County TextBox On Addresses Tab On Maintenance--> "+Entity+ " Page", StrCounty, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_EntityAddresses_Txt_ZipCode(driver), "Zip/Postal Code TextBox On Addresses Tab On Maintenance--> "+Entity+ " Page", String.valueOf(IntZipCode), Intlogval);
			// Data Is Entered In County & ZipCode Field Of Address Tab

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Addresses Tab On Maintenance--> "+Entity+ " Page", Intlogval);// Save Button Is Clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Save Is Clicked On Addresses Tab On Maintenance--> "+Entity+ " Page");

			RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance--> " +Entity+" Page", Intlogval);


			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful " + Entity + " Address Creation", "New Address Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful " + Entity + " Address Creation", "New Address Is Created Successfully")));
			}


		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, Entity+ " Address Creation Fail", "Address Is Not Added")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, Entity+ " Address Creation Fail", "Address Is Not Added")));
			}
			driver.switchTo().parentFrame();
			throw (e);
		}
		return StrAddressType;
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_Entity_AddressVerification_Utility
	//Description  		: Enables The User To Verify Address For Entity
	//Input Parameter 	: logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - AnubhutiVyas-11-10-2017
	//==========================================================================================================================================================================================================================================
	public static String RMA_Entity_AddressVerification_Utility(String Entity,String StrAddressType,String StrAddress1,String StrAddress2,String StrAddress3,String StrAddress4,String StrCity,String StrCounty,String StrState, int IntZipCode,String StrCountry, int logval) throws Exception, Error
	{

		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Verifies Address Of A Newly Created " +Entity);
			}else{	
				logger = reports.startTest("<span id='EntityAddressVerification'>Address Verification</span>", "User Verifies Address Of A Newly Created " +Entity);
			}

			//===========================================================Verification Of Address Field Values On Org. Hierarchy Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Verification_Utility.RMA_TextCompare(StrAddress1, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr1(driver), "value"), "Addrress1 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(StrAddress2, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr2(driver), "value"), "Addrress2 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(StrAddress3, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr3(driver), "value"), "Addrress3 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(StrAddress4, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr4(driver), "value"), "Addrress4 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(StrCity, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_City(driver), "value"), "City Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(StrCounty, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_County(driver), "value"), "County Value", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(StrState, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyClient_Txt_State(driver), "value"), "State Value", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(StrCountry, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyClient_Txt_Country(driver), "value"), "Country Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(String.valueOf(IntZipCode), RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyClient_Txt_ZipCode(driver), "value"), "Zip Code Value", logval);
			//Address Verification Is Performed
			//===========================================================Verification Of Address Field Values On Org. Hierarchy Screen Completed Here=======================================================================================================================================================================================================================================================

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful " +Entity + " Address Verification", "New Address Is Verified Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful " + Entity +" Address Verification", "New Address Is Verified Successfully")));
			}


		} catch (Exception|Error e) {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, Entity + " Address Verification Fail", "Address Is Not Verified")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, Entity + " Address Verification Fail", "Address Is Not Verified")));
			}
			driver.switchTo().parentFrame();
			throw (e);
		}
		return StrAddressType;
	}
	
	//======================================================================================================================================================================================================================================================
		//FunctionName 		: RMA_AutoNumber_VehicleID_Utility
		//Description  		: Enables The User To Do General System Parameter Settings For AutoNumber Vehicle ID 
		//Input Parameter 	: None
		//Revision			: 0.0 - NikitaThani -02-21-2018   
		// ==========================================================================================================================================================================================================================================================
		public static void RMA_Suite1_Maint_AutoNumber_VehicleID_Utility(String Case , int Intlogval) throws Exception, Error
		{
		
			try {
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, "Enables The User To Do Parameter Settings For AutoNumber Successfully");
				}else{	
					logger = reports.startTest("<span id='AutoNumberVID'>Parameter Settings For AutoNumber Vehicle ID </span>","Enables The User To Do Parameter Settings For AutoNumber Vehicle ID  Successfully");
				}

				switch(Case)
				{		
				case "check" :

					//==============================================================Steps To Navigate To General System Parameter Setup Screen Is Started Here=================================================================================================================================================================================================================================================
					rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", Intlogval);
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.GenSysParaSetupFrame);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
					//==============================================================Steps To Navigate To General System Parameter Setup Screen Is Completed Here=================================================================================================================================================================================================================================================

					//==============================================================General System Parameter Setup Started Here=================================================================================================================================================================================================================================================
					RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AutonumberVehicleID(driver), "check", "Autonumber Vehicle ID(VIN) Check Box", "General System Parameter Setup Page", Intlogval);
					RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.GenSysParaSetupFrame, false, "NA", "General System Parameter Setup Page", Intlogval);
					//==============================================================General System Parameter Setup Completed Here=================================================================================================================================================================================================================================================
					break;

				case "uncheck" :

					//==============================================================Steps To Navigate To General System Parameter Setup Screen Is Started Here=================================================================================================================================================================================================================================================
					rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", Intlogval);
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.GenSysParaSetupFrame);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
					//==============================================================Steps To Navigate To General System Parameter Setup Screen Is Completed Here=================================================================================================================================================================================================================================================

					//==============================================================General System Parameter Setup Started Here=================================================================================================================================================================================================================================================
					RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AutonumberVehicleID(driver), "uncheck", "Autonumber Vehicle ID(VIN) Check Box", "General System Parameter Setup Page", Intlogval);
					RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.GenSysParaSetupFrame, false, "NA", "General System Parameter Setup Page", Intlogval);
					//==============================================================General System Parameter Setup Completed Here=================================================================================================================================================================================================================================================
					break;
				}
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Parameter Setting For AutoNumber Vehicle ID", "Parameter Setting Of For AutoNumber Vehicle ID Done Successfully")));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Parameter Setting For AutoNumber Vehicle ID", "Parameter Setting For AutoNumber Vehicle ID Done Successfully")));
				}
			}
			catch (Exception | Error e){
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "AutoNumber Vehicle ID Parameter Setting Fail", "Parameter Setting is Not Selected")));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "AutoNumber Vehicle ID Parameter Setting Fail", "Parameter Setting is Not Selected")));
				}
				throw (e);

			}
		}
		
		//===================================================================================================================================================================================================================
		//FunctionName 		: RMA_Maintenance_Vehicle_AddVehicle
		//Description  		: Enables The User To Add A Vehicle Whose Vehicle ID is Auto Generated
		//Input Parameter 	: Driver Of The Type Driver; logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
		//Revision			: 0.0 - NikitaThani-02-21-2018  
		//======================================================================================================================================================================================================================
		public static String RMA_Maintenance_Vehicle_AddVehicle(int Intlogval) throws Exception
		{
			String StrVehicleId;
			try 
			{
				logger = reports.startTest("<span id='MaintAddNewVehicle'>Maintenance Vehicle Addition</span>", "A New Entity Of Type Vehicle Is Added From Maintenance Screen");
				
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Vehicle", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.VehicleFrame );
				RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
				//==============================================================Vehicle Creation Started Here=================================================================================================================================================================================================================================================
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_VehicleMake(driver), "Vehicle Make TextBox On Maintenance-->Vehicle Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "VehicleMake_"), logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_VehicleModel(driver), "Vehicle Model TextBox On Maintenance-->Vehicle  Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "VehModel_"), logval);
				RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.VehicleFrame, false, "NA",  "Maintenance-->Vehicle Page", logval);	
				StrVehicleId = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_VehicleID(driver), "value");
				//==============================================================Vehicle Creation Completed Here=================================================================================================================================================================================================================================================
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Creation of Vehicle On Vehicle Page", "Vehicle Is Created Successfully")));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Creation of Vehicle On Vehicle Page", "Vehicle Is Created Successfully")));
				}
			}catch (Exception e) {
				throw (e);
			}
			return StrVehicleId;
		}
		//========================================================================================================================================================================================================================================
		//FunctionName 		: RMA_EmployeeBankingInformationAddEditDeleteEntity_Utility
		//Description  		: Enables The User To Add Banking Information To The Employee 
		//Input Parameter 	: BankingInfo_Creation_Txt_BankName,BankingInfo_Creation_Txt_AccountNo,BankingInfo_Creation_Txt_Status,BankingInfo_Creation_Txt_RoutingNo, BankingInfo_Creation_Txt_AccountType,BankingInfo_Creation_Txt_StartDate,BankingInfo_Creation_Txt_EndDate, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
		//Revision			: 0.0 - ShrutiShruti-02-07-2018
		//==========================================================================================================================================================================================================================================
		public static String RMA_EmployeeBankingInformationAddEditDeleteEntity_Utility(String Entity,String BankingInfo_Creation_Txt_BankName, int BankingInfo_Creation_Txt_AccountNo, String BankingInfo_Creation_Txt_Status,String BankingInfo_Creation_Txt_RoutingNo,String BankingInfo_Creation_Txt_AccountType,String BankingInfo_Creation_Txt_StartDate,String BankingInfo_Creation_Txt_EndDate,int Intlogval) throws Exception, Error
		{
			try {
				String StrMsg;
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, "User Creates A New Banking Information From the Employee Screen");
				}else{	
					logger = reports.startTest("<span id='EmployeeBankingInformationAdd'>Banking Information Addition</span>", "User Creates A New Banking Information On The Created Employee");
				}
				switch(Entity){

				case "Create":
				{
					RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankingInformation.RMAApp_BankingInformation_Txt_BankName(driver), "Bank Name TextBox On Banking Information Creation Page", BankingInfo_Creation_Txt_BankName, Intlogval);
					RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankingInformation.RMAApp_BankingInformation_Txt_AccountNumber(driver), "Account Number TextBox On Banking Information Creation Page", String.valueOf(BankingInfo_Creation_Txt_AccountNo), Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_BankingInformation.RMAApp_BankingInformation_Btn_BankingStatus(driver), "Banking Status Lookup Image Button On Baking Information Creation Page", Intlogval);
					RMA_Navigation_Utility.RMA_WebPartialLinkSelect(BankingInfo_Creation_Txt_Status, "Banking Status Lookup Window On Banking Information Creation Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_BankingInformation.RMAApp_BankingInformation_Btn_AccountType(driver), "Account Type Lookup Image Button On Banking Information Creation Page", Intlogval);
					RMA_Navigation_Utility.RMA_WebPartialLinkSelect(BankingInfo_Creation_Txt_AccountType, "Account Type Lookup Window On Banking Information Creation Page", Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankingInformation.RMAApp_BankingInformation_Txt_EffectiveStartDate(driver), "Effective Start Dat eTextBox On Banking Information Crweation Page", BankingInfo_Creation_Txt_StartDate, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankingInformation.RMAApp_BankingInformation_Txt_EffectiveEndDate(driver),"Efective End Date TextBox On Banking Information Creation Page", BankingInfo_Creation_Txt_EndDate, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankingInformation.RMAApp_BankingInformation_Txt_RoutingNumber(driver), "Routing Number TextBox On Banking Information Creation Page", BankingInfo_Creation_Txt_RoutingNo, Intlogval);
					Thread.sleep(3000);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image on Banking Information Page", logval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval); // Wait For UX Page Load Bar To Disappear
					RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_BankingInformation.RMAApp_BankingInformation_Txt_BankName(driver),"value");
					StrMsg=RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave;
					RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave), "Banking Information Save Toast Message", Intlogval);
					globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+StrMsg+"')]")));
					Entity=RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_BankingInformation.RMAApp_BankingInformation_Txt_BankName(driver), "value");
					break;
				}

				case "Delete":

				{
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_DeleteRecord(driver), "Delete Record Icon On Employee Banking Information Page ", logval);
					RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("Yes", "Partial",RMA_Selenium_POM_VerificationMessage.BankingInformationDeleteConfirmation, "Delete Message On Deleting a Banking Information", logval);
					RMA_Verification_Utility.RMA_VerifyUXMessage("Record has been successfully deleted", false, "Record Deleted toast message after deleting the record.", logval);
					Entity=null;
					break;
				}
				}


				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Banking Information Creation", "New Banking Information Is Created Successfully")));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Banking Information Creation", "New Banking Information Is Created Successfully")));
				}


			} catch (Exception|Error e) {
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Banking Information Addition Fail", "Banking Information Is Not Added")));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Banking Information Addition Fail", "Banking Information Is Not Added")));
				}
				driver.switchTo().parentFrame();
				throw (e);
			}
			return Entity;

		}

		//========================================================================================================================================================================================================================================
		//FunctionName 		: RMA_EmployeeViolationsAddEditDeleteEntity_Utility
		//Description  		: Enables The User To Add Violations To The Employee 
		//Input Parameter 	: Violation_Creation_Txt_Date,Violation_Creation_Txt_Violation, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
		//Revision			: 0.0 - ShrutiShruti-02-07-2018
		//==========================================================================================================================================================================================================================================
		public static String RMA_EmployeeViolationsAddEditDeleteEntity_Utility(String Entity,String Violation_Creation_Txt_Date,String Violation_Creation_Txt_Violation,int Intlogval) throws Exception, Error
		{
			try {
				String StrMsg;
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, "User Creates A New Violation From the Employee Screen");
				}else{	
					logger = reports.startTest("<span id='EmployeeViolationAdd'>Violation Addition</span>", "User Creates A New Violation On The Created Employee");
				}

				switch(Entity){

				case "Create":
				{
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Violations.RMAApp_Violations_Txt_ViolationDate(driver), "Violation Date TextBox On Violation Creation Page",Violation_Creation_Txt_Date, Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Violations.RMAApp_Violations_Btn_Violation(driver), "Violation Lookup Image Button On Violation Creation Page", Intlogval);
					RMA_Navigation_Utility.RMA_WebPartialLinkSelect(Violation_Creation_Txt_Violation, "Violation Lookup Window On Violation Creation Page", Intlogval);
					Thread.sleep(3000);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image on Violation Page", logval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval); // Wait For UX Page Load Bar To Disappear
					StrMsg=RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave;
					RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave), "Violations Save Toast Message", Intlogval);
					globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+StrMsg+"')]")));
					Entity=RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Violations.RMAApp_Violations_Txt_ViolationDate(driver), "value");
					break;
				}

				case "Delete":

				{
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_DeleteRecord(driver), "Delete Record Icon On Employee Violation Page ", logval);
					RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("Yes", "Partial",RMA_Selenium_POM_VerificationMessage.BankingInformationDeleteConfirmation, "Delete Message On Deleting a Violation", logval);
					RMA_Verification_Utility.RMA_VerifyUXMessage("Record has been successfully deleted", false, "Record Deleted toast message after deleting the record.", logval);
					break;
				}
				}

				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Violation Creation", "New Violation Is Created Successfully")));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Violation Creation", "New Violation Is Created Successfully")));
				}


			} catch (Exception|Error e) {
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Violation Addition Fail", "Violation Is Not Added")));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Violation Addition Fail", "Violation Is Not Added")));
				}
				driver.switchTo().parentFrame();
				throw (e);
			}
			return Entity;
		}


		//========================================================================================================================================================================================================================================
		//FunctionName 		: RMA_EmployeeDependentsAddEditDeleteEntity_Utility
		//Description  		: Enables The User To Add Dependents To The Employee 
		//Input Parameter 	: Dependent_Creation_Txt_FirstName,Dependent_Creation_Txt_City,Dependent_Creation_Txt_State,Dependent_Creation_Txt_Country,Dependent_Creation_Txt_SSN, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
		//Revision			: 0.0 - ShrutiShruti-02-07-2018
		//==========================================================================================================================================================================================================================================
		public static String RMA_EmployeeDependentsAddEditDeleteEntity_Utility(String Entity,String Dependent_Creation_Txt_FirstName,String Dependent_Creation_Txt_City,String Dependent_Creation_Txt_State,String Dependent_Creation_Txt_Country,long Dependent_Creation_Txt_SSN,int Intlogval) throws Exception, Error
		{
			try {
				String StrMsg;
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, "User Creates A New Dependent From the Employee Screen");
				}else{	
					logger = reports.startTest("<span id='EmployeeDependentsAdd'>Dependent Addition</span>", "User Creates A New Dependent On The Created Employee");
				}

				switch(Entity){

				case "Create":
				{
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Dependents.RMAApp_Dependents_Txt_FirstName(driver), "First Name TextBox On Dependents Creation Page", Dependent_Creation_Txt_FirstName, Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Dependents.RMAApp_Dependents_Btn_Country(driver), "Country Lookup Image Button On Dependents Creation Page", Intlogval);
					RMA_Navigation_Utility.RMA_WebPartialLinkSelect(Dependent_Creation_Txt_Country, "Country Lookup Window On Dependents Creation Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Dependents.RMAApp_Dependents_Btn_State(driver), "State Lookup Image Button On Dependents Creation Page", Intlogval);
					RMA_Navigation_Utility.RMA_WebPartialLinkSelect(Dependent_Creation_Txt_State, "State Lookup Window On Dependents Creation Page", Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Dependents.RMAApp_Dependents_Txt_SocialSecurityNumber(driver), "Social Security Number TextBox On Dependents Creation Page",String.valueOf(Dependent_Creation_Txt_SSN) , Intlogval);
					Thread.sleep(3000);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image on Dependents Page", logval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval); // Wait For UX Page Load Bar To Disappear
					StrMsg=RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave;
					RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave), "Dependents Save Toast Message", Intlogval);
					globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+StrMsg+"')]")));
					Entity=RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Dependents.RMAApp_Dependents_Txt_LastName(driver),"value");
					break;
				}

				case "Delete":

				{
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_DeleteRecord(driver), "Delete Record Icon On Employee Dependents Page ", logval);
					RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("Yes", "Partial",RMA_Selenium_POM_VerificationMessage.BankingInformationDeleteConfirmation, "Delete Message On Deleting a Dependents", logval);
					RMA_Verification_Utility.RMA_VerifyUXMessage("Record has been successfully deleted", false, "Record Deleted toast message after deleting the record.", logval);
					break;				
				}
				}

				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Dependents Creation", "New Dependents Is Created Successfully")));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Dependents Creation", "New Dependents Is Created Successfully")));
				}


			} catch (Exception|Error e) {
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Dependents Addition Fail", "Dependents Is Not Added")));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Dependents Addition Fail", "Dependents Is Not Added")));
				}
				driver.switchTo().parentFrame();
				throw (e);
			}
			return Entity;
		}

		//========================================================================================================================================================================================================================================
		//FunctionName 		: RMA_WithholdingAddEntity_Utility
		//Description  		: Enables The User To Add Withholding To The Entity 
		//Input Parameter 	: Withholding_Creation_Txt_Percentage,Withholding_Creation_Txt_Recipient, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
		//Revision			: 0.0 - ShrutiShruti-02-07-2018
		//==========================================================================================================================================================================================================================================
		public static String RMA_WithholdingAddEntity_Utility(String Withholding_Creation_Txt_Percentage, int Intlogval) throws Exception, Error
		{
			try {
				String StrMsg;
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, "User Creates A New WithHolding From the Entity Screen");
				}else{	
					logger = reports.startTest("<span id='WithHoldingAdd'>Withholding Addition</span>", "User Creates A New WithHolding On The Created Entity");
				}
				DefaultFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Employee_Img_WithHolding(driver), "Withholding Image Button On Employee Creation Page", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.WithholdingFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Withholding.RMAApp_Withholding_Txt_Percentage(driver),"Percentage TextBox On WithHolding Creation Page", Withholding_Creation_Txt_Percentage, Intlogval);
				//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Withholding.RMAApp_Withholding_Txt_Recipient(driver), "Recipient TextBox On WithHolding Creation Page", Withholding_Creation_Txt_Recipient, Intlogval);
				//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Withholding.RMAApp_Withholding_CheckBox_EnableWithholding(driver), "Enable Backup Withholding Chechbox On Withholding Creation Page", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Withholding.RMAApp_Withholding_CheckBox_VoucherPayment(driver), "Voucher Payment Checkbox On Withholding Creation Page", Intlogval);
				Thread.sleep(3000);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image on Withholding Page", logval);

				StrMsg=RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave;
				RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave), "Withholding Save Toast Message", Intlogval);
				globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+StrMsg+"')]")));
				Withholding_Creation_Txt_Percentage=RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Withholding.RMAApp_Withholding_Txt_Percentage(driver), "value");
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Withholding Creation", "New Withholding Is Created Successfully")));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Withholding Creation", "New Withholding Is Created Successfully")));
				}


			} catch (Exception|Error e) {
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Withholding Addition Fail", "Withholding Is Not Added")));
				}else{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Withholding Addition Fail", "Withholding Is Not Added")));
				}
				driver.switchTo().parentFrame();
				throw (e);
			}
			return Withholding_Creation_Txt_Percentage;
		}
}
