package rmaseleniumutilties;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.StandardDecryptionMaterial;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.pdfbox.cos.COSDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Adjuster;
import rmaseleniumPOM.RMA_POM_Attachment;
import rmaseleniumPOM.RMA_POM_BankAccount;
import rmaseleniumPOM.RMA_POM_Comments;
import rmaseleniumPOM.RMA_POM_NonOccupational;
import rmaseleniumPOM.RMA_POM_PropertyClaim;
import rmaseleniumPOM.RMA_POM_ScheduleCheck;
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Arbitration;
import rmaseleniumPOM.RMA_Selenium_POM_AttachCreateDiary;
import rmaseleniumPOM.RMA_Selenium_POM_Claimant;
import rmaseleniumPOM.RMA_Selenium_POM_Defendant;
import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM.RMA_Selenium_POM_Document_Event;
import rmaseleniumPOM.RMA_Selenium_POM_Document_GeneralClaims;
import rmaseleniumPOM.RMA_Selenium_POM_EnhancedNotes;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Litigation;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance_AdminTracking;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance_PlanManagement;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance_Property;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance_TableMaintenance;
import rmaseleniumPOM.RMA_Selenium_POM_OrgHierarchy;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM.RMA_Selenium_POM_PersonInvolved;
import rmaseleniumPOM.RMA_Selenium_POM_PolicyDownload;
import rmaseleniumPOM.RMA_Selenium_POM_PolicyTracking;
import rmaseleniumPOM.RMA_Selenium_POM_PrintCheck;
import rmaseleniumPOM.RMA_Selenium_POM_SMS;
import rmaseleniumPOM.RMA_Selenium_POM_SendMail;
import rmaseleniumPOM.RMA_Selenium_POM_Sikuli_Images;
import rmaseleniumPOM.RMA_Selenium_POM_Subrogation;
import rmaseleniumPOM.RMA_Selenium_POM_Utilities_Managers;
import rmaseleniumPOM.RMA_Selenium_POM_VehicleAccident;
import rmaseleniumPOM.RMA_Selenium_POM_WorkersComp;
//RMA Package Import Completed

public class RMA_Functionality_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	public static String ReturnValue;
	public static String EntName;

//====================================================================================================
//FunctionName 		: RMA_PaymentAddition_Utility
//Description  		: Enables The User To Add Payment 
//Input Parameter 	: Driver Of The Type Driver, BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer	 
//Revision			: 0.0 - KumudNaithani-01-19-2016     
//Modified By		: 0.0-RenuVerma-01-02-2016 : Changed static wait into dynamic wait
// ====================================================================================================
public static String RMA_PaymentAddition_Utility(String BankAccnt,String PayeeType, String TransType, int Amount, String LastName, String DisType, int logval) throws Exception, Error
{
	try {
	logger = reports.startTest("<span id='PaymentAddition'>TC_Payment Addition</span>", "User Makes A New  Payment");
	String StrPrimaryWindowHandle;
	//String StrSecPrimaryWindowHandle;
	//Local Variable Declaration

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payment Addition Page Is Loaded");
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_BankAccount(driver), BankAccnt, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",logval);
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_PayeeType(driver), PayeeType, "Payee Type Drop Down List", "Payment Creation Page",logval);
	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Btn_DistributionTypeCodeLookUp(driver), "Distribution Type Code Look Up Button On RMA Application Payments Page",1);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Distribution Type Link Is Done
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, "Distribution Type Link On Distribution Selection Window", logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");

	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_LastName(driver), "Last Name Text Box On Payment Creation Page", LastName,logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Tab_TransactionDetail(driver), "Transaction Details Tab On On Payment Creation Page",logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Transaction Tab Is Clicked");
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Btn_AddNewPayment(driver), "Add Payment Button On Reserve Creation Page",logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Add New Payment Button Is Clicked");
	//Add New Button Is Clicked And Funds Split Details View Is Opened

	StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Fund Splits Details Is Done
	Thread.sleep(3000);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown On Funds Details Window On Payment Creation Page", TransType,logval);	
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Payment Creation Page", String.valueOf(Amount),logval);	
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Btn_OK(driver), "OK Button On Funds Details Window On Payment Creation Page",logval);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
	// Payment Is Added And Funds Split Details View Is Closed

	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Btn_Save(driver), "Save Button On Payment Creation Page",logval);// Save Button Is Clicked On Payment Creation Page
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Payment Transaction Is Getting Saved");
	//Save Button Is Clicked To Save The Transaction

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",logval);// Transaction Tab On Payment Creation Page Is Clicked
	ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
	String StrlogControlNumber_RMA_TC_006 = color.RMA_ChangeColor_Utility(ReturnValue, 2);
	logger.log(LogStatus.PASS, "Payment Is Suceessfully Done And The Generated Control Number Is" + " " + "_"+ " " + StrlogControlNumber_RMA_TC_006);
	RMA_ExcelDataRetrieval_Utility.WriteDataToExcel(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx","RMA_TC_006", 10, 0, ReturnValue);  //Control Number Is Written In RMA_TC_006 Excel Sheet
	logger.log(LogStatus.INFO, "Generated ControlNumber:" + " " + StrlogControlNumber_RMA_TC_006 + " " + "Is Also Written In The Corresponding Excel Data Sheet RMA_TC_006");
	return ReturnValue;

	} catch (Exception|Error e) {
		throw (e);
	}
}

//=============================================================================================================================================================================================================
//FunctionName 		: RMA_ReserveAddition_Utility
//Description  		: Enables The User To Add Reserve 
//Input Parameter 	: Driver Of The Type Driver; Status,ReserveType,StrExpReserveStatus,StrErrMsg,PopUpVerifyMessage,CompFlg,StrHold Of The Type String; logval,ReserveAmount Of The Type Integer	 
//Revision			: 0.0 - KumudNaithani-01-19-2016  
//					: 0.1 - KumudNaithani-06-10-2016 : Modified After Variable Financial Key Changes
//Modified By		: 0.0 - RenuVerma-01-24-2017 : Modified As Verification Step Based On Column Name Instead of Column Index
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
//==================================================================================================================================================================================================================
public static void RMA_ReserveAddition_Utility( int ReserveAmount, String Status, int logval, String ReserveType, String StrHold, String StrErrMsg, String StrExpReserveStatus, String CompFlg, String PopUpVerifyMessage) throws Exception, Error
{
	try {
	logger = reports.startTest("<span id='ReserveAddition'>Reserve Creation</span>", "A New Reserve Is Created");
	int iterator;
	String StrExpected_ReserveTable_ReserveAmount;
	WebElement ActualResStatus;
	//Local Variable Declaration

	StrExpected_ReserveTable_ReserveAmount = "$"+ReserveAmount+ ".00";

	iterator =  RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");
	driver.switchTo().frame(iterator); //A Switch To The Frame Containing Financial/Reserves Control Is Done
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Reserves/Financials Frame Is Done");
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Img_AddNewRsv(driver), "Add New Reserve Image On Financial Reserves Page",logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Add New Reserve Image On Financial Reserves Page Is Clicked");
	driver.switchTo().frame(0); //A switch To The Frame Containing Add New Reserve Window Controls Is Done

	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_ReserveType(driver), ReserveType, "Reserve Type List Box", "Add New Reserve Window On Financial Reserves Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver), "Reserve Amount Field On Add New Reserve Window On Financial Reserves Page", String.valueOf(ReserveAmount),logval);	
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_Status(driver), Status,"Status List Box","Add New Reserve Window On Financial Reserves Page",logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Is Clicked On Add New Reserve Window On Financial Reserves Page",logval);	
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Save Button Is Clicked On Reserve Creation Page Is Clicked");
	//Reserve Creation Is Completed Here

	driver.switchTo().parentFrame();
	if (RMAApp_BrowserName.equalsIgnoreCase("IE"))
	{
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
		iterator =  RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");
		driver.switchTo().frame(iterator); //A Switch To The Frame Containing Financial/Reserves Control Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As A Switch To Reserves/Financials Frame Is Done");	
	}

	if (RMAApp_BrowserName.equalsIgnoreCase("Chrome"))
	{
		driver.switchTo().parentFrame();
		iterator =  RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");
		driver.switchTo().frame(iterator); //A Switch To The Frame Containing Financial/Reserves Control Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As A Switch To Reserves/Financials Frame Is Done");

	}

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Reserve Sub Type")), "uncheck", "Reserve Sub Type Column In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Benefit Review Date")), "uncheck", "Benefit Review Date Column In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
	WebElement filtertext = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridHeader(driver, 3);
	RMA_Input_Utility.RMA_SetValue_Utility(filtertext, "Reserve Type Filter Text Box On Reserve Table", ReserveType,logval);
	//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid

	WebElement ActualResType = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Reserve Type");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ReserveType, "Reserve Type On Reserves NG Grid On Financial Reserves Page", ActualResType, logval);
	//Verification Of Correct Reserve Type Being Displayed On Reserves NG Grid Is Done

	WebElement ActualResAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Balance");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpected_ReserveTable_ReserveAmount, "Reserve Balance Amount On Reserves NG Grid On Financial Reserves Page", ActualResAmt, logval);
	//Verification Of Correct Reserve Balance Amount Being Displayed On Reserves NG Grid Is Done


	if (StrHold == "Yes")
	{
		ActualResStatus = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Status");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpReserveStatus, "Reserve Status On Reserves NG Grid On Financial Reserves Page", ActualResStatus, logval);
		//Verification Of Correct Reserve Status -Hold  Being Displayed On Reserves NG Grid Is Done
	}
	else
		ActualResStatus = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Status");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpReserveStatus, "Reserve Status On Reserves NG Grid On Financial Reserves Page", ActualResStatus, logval);
	//Verification Of Correct Reserve Status -Hold  Being Displayed On Reserves NG Grid Is Done
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
//					: 0.1 - RenuVerma-03-07-2017- Changed function Name RMA_EntityAddition_Utility to RMA_MaintEntityAddition_Utility
//==================================================================================================================================================================================================================================================================
public static String RMA_MaintEntityAddition_Utility(String Entity, int logval) throws Exception, Error
{
	try {
	logger = reports.startTest("<span id='EntityAdd'>Addition Of "+ Entity +" Entity</span>", "A New Entity Of Type:" + " "+ Entity+" "+ "Is Added From Maintenance Screen To RMA Application");
	String EntityName; // Last Name Of The Entity Is Fetched In This Variable
	int EntityNumber; // Numeric Part Of The Entity Is Fetched In This Variable
	String EntityNum; //Employee Number Of the Entity Is Fetched In This Variable
	int SecurityNum; //Social Security Number Of The Entity Is Fetched In This Variable
	String StrCurrentDate;

	switch (Entity){
	case "Employee":
		RMA_MenuOptionClick_Utility("Maintenance-Employee", logval);
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
		RMA_MenuOptionClick_Utility("Maintenance-MedicalStaff", logval);
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
		RMA_MenuOptionClick_Utility("Maintenance-PatientTracking", logval);
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
		RMA_MenuOptionClick_Utility("Maintenance-Physician", logval);
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
		RMA_MenuOptionClick_Utility("Maintenance-Driver", logval);
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
		RMA_MenuOptionClick_Utility("Maintenance-People", logval);
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
		RMA_MenuOptionClick_Utility("Maintenance-People", logval);
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
		RMA_MenuOptionClick_Utility("Maintenance-LeavePlanManagement", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Leave Plan Management"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance--> Leave Plan Management Frame Is Done");

		EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100, 999);		
		EntityNum = "Plan_" + EntityNumber;
		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PlanCode_");	

		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintLeavePlanManagement_Txt_PlanCode(driver), "Plan Code TextBox On Maintenance--> Leave Plan Management Page", EntityNum, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_Planname(driver), "Plan Name TextBox On Maintenance--> Leave Plan Management Page", EntityName, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintLeavePlanManagement_Txt_DefaultHoursPerweek(driver), "Default Hours Per Week TextBox On Maintenance--> Leave Plan Management Page", "40", logval);
		StrCurrentDate = RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_EffectiveDate(driver), "Effective Date TextBox On Maintenance--> Leave Plan Management Page", StrCurrentDate, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_ExpirationDate(driver), "Expiration Date TextBox On Maintenance--> Leave Plan Management Page", StrCurrentDate, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintLeavePlanManagement_Txt_PlanStatus(driver), "Plan Status TextBox On Maintenance--> Leave Plan Management Page",logval);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintLeavePlanManagement_Txt_PlanStatus(driver), "Plan Status TextBox On Maintenance--> Leave Plan Management Page", "I", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Plan Status Is Selected ");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Leave Plan Management", false, "NA", "Maintenance-->Leave Plan Management Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintLeavePlanManagement_Txt_PlanCode(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Entity Last Name Value", logval);
		driver.switchTo().parentFrame();
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

//====================================================================================================
//FunctionName 		: RMA_GenericDelete_Utility
//Description  		: Enables The User To Delete Any Added Value Like Claim, Entities Such As Employee And So On  
//Input Parameter 	: ObjPageDesc Stores Control And Page Description, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger" 
//Revision			: 0.0 - KumudNaithani-05-02-2016                               
//====================================================================================================
public static void RMA_GenericDelete_Utility(String ObjPageDesc, int logval) throws Exception, Error
{
	try {
	logger = reports.startTest("<span id='DeleteLink'>Record Deletion</span>", "Enables The User To Delete Records On " + ObjPageDesc);
	String Expmsg;
	Expmsg = "Are you sure you want to delete?";
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility(ObjPageDesc, 4)+ "", logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility(ObjPageDesc, 4)+ " " + "Is Clicked");
	RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility(ObjPageDesc, 4), logval);
	Expmsg = "The record has been successfully deleted!";
	RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility(ObjPageDesc, 4), logval);
	} catch (Exception|Error e) {
		throw (e);
	}
}

//====================================================================================================
//FunctionName 		: RMA_WorkersCompClaimCreation
//Description  		: Enables Users To Create Worker's Comp Claim
//Input Parameter 	: Input Parameters Are :ClaimType, EmployeeNumber, Department, Dateofevent, TimeofEvent, Dateofclaim, Timeofclaim, Jurisdiction, logval
//Revision			: 0.0 - ImteyazAhmad-05-02-2016  
//Modified By		: 0.0 - RenuVerma-07-26-2016 : Modified As Dynamic Wait Required                             
//====================================================================================================

public static String RMA_WorkersCompClaimCreation(String ClaimType, int EmployeeNumber, String Department, int Dateofevent, int TimeofEvent, int Dateofclaim, int Timeofclaim, String Jurisdiction, int logval) throws Exception,Error
{
	String StrWorkersCompClaimNumber = null;
	String StrPrimaryWindowHandle;
	try
	{
	logger = reports.startTest("<span id='WCACOFF'>Worker's Comp Claim Creation</span>", "Worker's Comp Claim Is Created");
	RMA_MenuOptionClick_Utility("Document-Workers’Comp.", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Workers");	
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_DateOfEvent(driver), "Date Of Event TextBox On Workers Comp Page", String.format("%08d",Dateofevent), logval);
	Thread.sleep(2000);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_EmployeeNumber(driver), "Employee No TextBox On Workers Comp Page", String.valueOf(EmployeeNumber), logval);
	Thread.sleep(7000);		
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Workers Comp Page", String.valueOf(TimeofEvent), logval);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_ClaimType(driver), "Claim Type TextBox On Workers Comp Page", ClaimType, logval);
	Thread.sleep(4000);		
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Workers Comp Page", String.format("%08d", Dateofclaim), logval);
	Thread.sleep(2000);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_DepartmentID(driver), "Department TextBox On Workers Comp Page", Department, logval);
	Thread.sleep(4000);			
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Workers Comp Page",String.valueOf(Timeofclaim), logval);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_Jurisdiction(driver), "Jurisdiction TextBox On Workers Comp Page", Jurisdiction, logval);
	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Btn_ClaimStatus(driver), "ClaimStatus Button On Workers Comp Page", logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Open Link On Code Selection Window",logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Workers");
	RMA_GenericSave_Utility("Workers", false, "NA", "Workers Comp Page", logval);
	StrWorkersCompClaimNumber = RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrWorkersCompClaimNumber
	logger.log(LogStatus.INFO, "Workers Comp Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrWorkersCompClaimNumber, 2));
	logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Workers Comp Saved Successfully", "Workers Comp Claim Creation")));
	driver.switchTo().parentFrame();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Workers"), "Expand Image Corresponding To Workers Comp Link On Left Navigation Tree", logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Expand Image Corresponding To Workers Comp Link On Left Navigation Tree Is Clicked ");

}catch(Exception|Error e)
	{
		throw (e);
	}		
return StrWorkersCompClaimNumber;		
}	

//====================================================================================================
//FunctionName 		: RMA_VehicleAccClaimCreation
//Description  		: Enables Users To Create A Vehicle Accident Claim 
//Input Parameter 	: Input Parameters Are : ClaimType, Department Of Type String Provides Information of The Type Of The Claim and Department Of The Claim Respectively
//					: DateOfEvent,TimeOfEvent,DateOfClaim,TimeOfClaim Of Type int Provides Information About DateOfEvent,TimeOfEvent,DateOfClaim,TimeOfClaim Of The Newly Created Vehicle Accident Claim
//Revision			: 0.0 - KumudNaithani-05-12-2016  
//Modified By 		: 0.0 - RenuVerma-07-26-2016 : Modified As Dynamic Wait Required              
//====================================================================================================

public static String RMA_VehicleAccClaimCreation(String ClaimType, String Department, int DateOfEvent, int TimeOfEvent, int DateOfClaim, int TimeOfClaim, int logval) throws Exception,Error
{
	String StrVehicleAccClaimNum;
	String StrPrimaryWindowHandle;
	try{
	logger = reports.startTest("<span id='VCClaimACOFF'>Vehicle Accident Claim Creation</span>", "New Vehicle Accident Claim Is Created");
	RMA_MenuOptionClick_Utility("Document-VehicleAccident", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle Accident");
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_ClaimType(driver), "Claim Type TextBox On Vehicle Accident Page", ClaimType, logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Claim Type Value Is Set In Claim Type TextBox On Vehicle Accident Page");
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_Dept_Id(driver), "Department TextBox On Vehicle Accident Page", Department, logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Claim Type Value Is Set In Department ID TextBox On Vehicle Accident Page");
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_DateOfEvent(driver), "Date Of Event TextBox On Vehicle Accident Page", String.format("%08d",DateOfEvent), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Vehicle Accident Page", String.valueOf(TimeOfEvent), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Vehicle Accident Page", String.format("%08d",DateOfClaim), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Vehicle Accident Page", String.valueOf(TimeOfClaim), logval);
	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Btn_ClaimStatusSrchBtn(driver), "ClaimStatus Button On Vehicle Accident Page", logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Links Is Done
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Open Link On Code Selection Window",logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle Accident");
	RMA_GenericSave_Utility("Vehicle Accident", false, "NA", "Vehicle Accident Page", logval);
	StrVehicleAccClaimNum = RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_ClaimNum(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrVehicleAccClaimNum
	logger.log(LogStatus.INFO, "Vehicle Accident Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrVehicleAccClaimNum, 2));
	driver.switchTo().parentFrame();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Vehicle"), "Expand Image Corresponding To Vehicle Accident Claim On Left Hand Navigation Tree", logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Expand Image Corresponding To Vehicle Accident Claim Link On Left Hand Navigation Tree Is Clicked ");

	}catch(Exception|Error e)
	{
		throw (e);
	}		
	return StrVehicleAccClaimNum;		
}		

//====================================================================================================
//FunctionName 		: RMA_NonOccupationalClaimCreation
//Description  		: Enables Users To Create NonOccupational Claim
//Input Parameter 	: Input Parameters Are :ClaimType, EmployeeNumber, Department, Dateofevent, TimeofEvent, Dateofclaim, Timeofclaim, Jurisdiction, logval
//Revision			: 0.0 - ImteyazAhmad-05-12-2016         
//Modified By   	: 0.0 - RenuVerma-07-26-2016 : Modified As Dynamic Wait Required        
//====================================================================================================

public static String RMA_NonOccupationalClaimCreation(String ClaimType, int EmployeeNumber, String Department, int Dateofevent, int TimeofEvent, int Dateofclaim, int Timeofclaim, String Jurisdiction,String PlanName, int DisabilitySrtDate, int logval) throws Exception,Error
{
	String StrNonOccupationalClaimNumber = null;
	String StrPrimaryWindowHandle;
	try{
	logger = reports.startTest("<span id='NonOccClaimACOFF'>NonOcupational Claim Creation</span>", "NonOccupational Claim Is Created");
	RMA_MenuOptionClick_Utility("Document-Non-occupational", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Non-occupational");
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_ClaimType(driver), "Claim Type TextBox On NonOccupational Claim Page", ClaimType, logval);
	Thread.sleep(6000);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_EmployeeNumber(driver), "Employee No TextBox On NonOccupational Claim Page", String.valueOf(EmployeeNumber), logval);
	Thread.sleep(6000);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_Jurisdiction(driver), "Jurisdiction TextBox On NonOccupational Claim Page", Jurisdiction, logval);
	Thread.sleep(4000);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_DepartmentID(driver), "Department TextBox On NonOccupational Claim Page", Department, logval);
	Thread.sleep(7000);

	RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_DateOfEvent(driver), "Date Of Event TextBox On NonOccupational Claim Page", String.format("%08d",Dateofevent), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_TimeOfEvent(driver), "Time Of Event TextBox On NonOccupational Claim Page", String.valueOf(TimeofEvent), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_DateOfClaim(driver), "Date Of Claim TextBox On NonOccupational Claim Page", String.format("%08d", Dateofclaim), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On NonOccupational Claim Page", String.valueOf(Timeofclaim), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_DisabilityStartDate(driver), "Disability Start Date TextBox On NonOccupational Claim Page", String.valueOf(DisabilitySrtDate), logval);

	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_NonOccupational.RMAApp_NonOccupational_Btn_ClaimStatus(driver), "ClaimStatus Button On NonOccupational Claim Page", logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Open Link On Code Selection Window",logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Non-occupational");

	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_NonOccupational.RMAApp_NonOccupational_Btn_PlanName(driver), "PlanName Button On NonOccupational Claim Page", logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect(PlanName, "Plan Lookup Window", logval);				
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Non-occupational");

	RMA_GenericSave_Utility("Non-occupational", false, "NA", "NonOccupational Claim Page", logval);
	StrNonOccupationalClaimNumber = RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrWorkersCompClaimNumber
	logger.log(LogStatus.INFO, "NonOccupational Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrNonOccupationalClaimNumber, 2));
	logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "NonOccupational Claim Saved Successfully", "NonOccupational Claim Creation")));
	driver.switchTo().parentFrame();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "occupational"), "Expand Image Corresponding To NonOccupational Claim Link On Left Navigation Tree", logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Expand Image Corresponding To NonOccupational Claim Link On Left Navigation Tree Is Clicked ");

}catch(Exception|Error e)
{
		throw (e);
}		
	return StrNonOccupationalClaimNumber;		
}	

//===================================================================================================================================================================================================================
//FunctionName 		: RMA_ReserveAdditionModified_Utility
//Description  		: Enables The User To Add Reserve 
//Input Parameter 	: Driver Of The Type Driver; Status,ReserveType,StrExpReserveStatus,StrHold Of The Type String; ReserveAmount,logval,ExpBalAmt,ExpIncAmt,ExpPaidAmt,ExpCollecAmt Of The Type Integer	 
//Revision			: 0.0 - KumudNaithani-01-19-2016  
//Modified By		: 0.0 - RenuVerma-01-24-2017 : Modified As Verification Step Based On Column Name Instead of Column Index
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
//======================================================================================================================================================================================================================
public static void RMA_ReserveAdditionModified_Utility(int ReserveAmount, String Status,String ReserveType, String StrHold, String StrExpReserveStatus, int ExpBalAmt, int ExpIncAmt, int ExpPaidAmt, int ExpCollecAmt, String ClaimNumber, int logval ) throws Exception, Error
{
	try {
	logger = reports.startTest("<span id='ReserveAdditionModified'>Reserve Creation</span>", "A New Reserve Is Created");
	int iterator;
	String StrExpected_ReserveTable_BalanceAmount;
	String StrExpected_ReserveTable_PaidAmount;
	String StrExpected_ReserveTable_CollectionAmount;
	String StrExpected_ReserveTable_IncurredAmount;
	WebElement ActualResStatus;
	//Local Variable Declaration

	StrExpected_ReserveTable_BalanceAmount = "$"+ExpBalAmt+ ".00";
	StrExpected_ReserveTable_CollectionAmount = "$"+ExpCollecAmt+ ".00";
	StrExpected_ReserveTable_PaidAmount = "$"+ExpPaidAmt+ ".00";
	StrExpected_ReserveTable_IncurredAmount = "$"+ExpIncAmt+ ".00";

	iterator =  RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");
	driver.switchTo().frame(iterator); //A Switch To The Frame Containing Financial/Reserves Control Is Done
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Reserves/Financials Frame Is Done");
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Img_AddNewRsv(driver), "Add New Reserve Image On Financial Reserves Page",logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Add New Reserve Image On Financial Reserves Page Is Clicked");
	driver.switchTo().frame(0); //A switch To The Frame Containing Add New Reserve Window Controls Is Done

	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_ReserveType(driver), ReserveType, "Reserve Type List Box", "Add New Reserve Window On Financial Reserves Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver), "Reserve Amount Field On Add New Reserve Window On Financial Reserves Page", String.valueOf(ReserveAmount),logval);	
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_Status(driver), Status,"Status List Box","Add New Reserve Window On Financial Reserves Page",logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Is Clicked On Add New Reserve Window On Financial Reserves Page",logval);	
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Save Button Is Clicked On Reserve Creation Page Is Clicked");
	//Reserve Creation Is Completed Here

	driver.switchTo().parentFrame();
	if (RMAApp_BrowserName.equalsIgnoreCase("IE"))
	{
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
		iterator =  RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");
		driver.switchTo().frame(iterator); //A Switch To The Frame Containing Financial/Reserves Control Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As A Switch To Reserves/Financials Frame Is Done");	
	}

	if (RMAApp_BrowserName.equalsIgnoreCase("Chrome"))
	{
		driver.switchTo().parentFrame();
		iterator =  RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");
		driver.switchTo().frame(iterator); //A Switch To The Frame Containing Financial/Reserves Control Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As A Switch To Reserves/Financials Frame Is Done");

	}

	if (ClaimNumber.contains("WC") ||ClaimNumber.contains("DI"))
	{
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Reserve Sub Type")), "uncheck", "Reserve Sub Type Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Claimant")), "uncheck", "Claimant Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Benefit Review Date")), "uncheck", "Benefit Review Date Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Benefit Cease Date")), "uncheck", "Benefit Cease Date Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
	}
	else
	{
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Reserve Sub Type")), "uncheck", "Reserve Sub Type Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Benefit Review Date")), "uncheck", "Benefit Review Date Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Benefit Cease Date")), "uncheck", "Benefit Cease Date Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);

	}

	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Reserve Table", ReserveType,logval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
	//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid

	WebElement ActualResType = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Reserve Type");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ReserveType, "Reserve Type On Reserves NG Grid On Financial Reserves Page", ActualResType, logval);
	//Verification Of Correct Reserve Type Being Displayed On Reserves NG Grid Is Done

	WebElement ActualBalAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Balance");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpected_ReserveTable_BalanceAmount, "Reserve Balance Amount On Reserves NG Grid On Financial Reserves Page", ActualBalAmt, logval);
	//Verification Of Correct Reserve Balance Amount Being Displayed On Reserves NG Grid Is Done

	WebElement ActualPaidAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Paid");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpected_ReserveTable_PaidAmount, "Reserve Paid Amount On Reserves NG Grid On Financial Reserves Page", ActualPaidAmt, logval);
	//Verification Of Correct Reserve Paid Amount Being Displayed On Reserves NG Grid Is Done

	WebElement ActualCollecAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Collection");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpected_ReserveTable_CollectionAmount, "Reserve Collection Amount On Reserves NG Grid On Financial Reserves Page", ActualCollecAmt, logval);
	//Verification Of Correct Reserve Collection Amount Being Displayed On Reserves NG Grid Is Done

	WebElement ActualIncAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Incurred");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpected_ReserveTable_IncurredAmount, "Reserve Incurred Amount On Reserves NG Grid On Financial Reserves Page", ActualIncAmt, logval);
	//Verification Of Correct Reserve Incurred Amount Being Displayed On Reserves NG Grid Is Done

	ActualResStatus = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Status");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpReserveStatus, "Reserve Status On Reserves NG Grid On Financial Reserves Page", ActualResStatus, logval);
	//Verification Of Correct Reserve Status -Hold  Being Displayed On Reserves NG Grid Is Done

	} catch (Exception|Error e) {
		throw (e);
	}
}

//================================================================================================================================
//FunctionName 		: RMA_PropertyClaimCreation
//Description  		: Enables Users To Create Property Claim
//Input Parameter 	: Input Parameters Are :ClaimType,  Department, Dateofevent, TimeofEvent, Dateofclaim, Timeofclaim, logval
//Revision			: 0.0 - ImteyazAhmad-06-20-2016    
//Modified By	    : 0.0 - RenuVerma-07-26-2016 : Modified As Dynamic Wait Required               
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
//===================================================================================================================================

public static String RMA_PropertyClaimCreation(String ClaimType, String Department, int Dateofevent, int TimeofEvent, int Dateofclaim, int Timeofclaim, String PropertyID, int logval) throws Exception,Error
{
	String StrPropertyClaimNumber = null;
	String StrPrimaryWindowHandle;
	try
	{
	logger = reports.startTest("<span id= 'PropClaimACOFF'>Property Claim Creation</span>", "Property Claim Is Created");
	RMA_MenuOptionClick_Utility("Document-PropertyClaim", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimpc");
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_ClaimType(driver), "Claim Type TextBox On Property Claim Page", ClaimType, logval);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_Dept_Id(driver), "Department TextBox On Property Claim Page", Department, logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On Property Claim Page", String.format("%08d",Dateofevent), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Property Claim Page", String.valueOf(TimeofEvent), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Property Claim Page", String.format("%08d",Dateofclaim), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Property Claim Page", String.valueOf(Timeofclaim), logval);

	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Btn_ClaimStatusBtn(driver), "ClaimStatus Button On Property Claim Page", logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Open Link On Code Selection Window",logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimpc");

	RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Property Info", "Property Claim Page", logval);	
	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Btn_PropertyIDButton(driver), "PropertID LookUp Button On Property Claim Page", logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchPropertyId_Txt_PropertyID(driver), "Standard Property Search Page", "Property ID Text Box", PropertyID, PropertyID, "claimpc", StrPrimaryWindowHandle, logval);

	RMA_GenericSave_Utility("claimpc", false, "NA", "Property Claim Page", logval);
	StrPropertyClaimNumber = RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrPropertyClaimNumber
	logger.log(LogStatus.INFO, "Property Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrPropertyClaimNumber, 2));
	logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Property Claim Saved Successfully", "Property Claim Creation")));
	driver.switchTo().parentFrame();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Property Claim"), "Expand Image Corresponding To Property Claim Link On Left Navigation Tree", logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Expand Image Corresponding To Property Claim Link On Left Navigation Tree Is Clicked ");

}catch(Exception|Error e)
{
		throw (e);
}		
	return StrPropertyClaimNumber;		
}	

//=============================================================================================================================================================================================================================================================
//FunctionName 		: RMA_ClaimEntityAddition_Utility
//Description  		: Enables The User To Add Entity Like Adjustor, Defendant To A Claim In The RMA Application   
//Input Parameter 	: ClaimEntity: Case Variable Determining Which Entity Is To Be Created, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger", Claim Is The Claim Number To Which The Created Entity Is To Be Added
//Revision			: 0.0 - KumudNaithani-06-20-2016     
//Modified by       : 0.0 - MahendraPSingh- 02-08-2017 - Added entity addition for Litigation->Expert, Event-> Dated Text, Adjuster-> Dated Text
//      			: 0.1 - MahendraPSingh- 03-16-2017 - Event-> Dated Text Is Added On Event Therefore Changed Logger statement 
//==================================================================================================================================================================================================================================================================
public static String RMA_ClaimEntityAddition_Utility(String Entity, String ClaimEntity, String Claim, String AdjSystemLogin, String Type, String Status, String Date, String Time, String User, String FinType, int logval) throws Exception, Error
{
	//Note: It Is Assumed That The Left Hand Navigation Tree Is Expanded And Application Is In "cphMainBody_uwtPortal_frame0" As In All Claim Creation Function Except General Claim It Is Expanded
	//Also In ClaimEntity Variable User Needs To Pass Values Like  "Litigation (0)" Or "Adjustor (1)" That Is A Value Which Is Exactly Indicative Of the Left Hand Navigation Tree Value
	//Type Variable Is Used To Provide The Abbreviated Value Of Type Like "ME" For "Medical" For Both Subrogation and Arbitration And FinType Variable Is Used To Provide The Complete Type Value Like "ME Medical" For Both Subrogation and Arbitration 

	try {
	logger = reports.startTest("<span id='ClaimEntity'>Claim/Event Entity Addition</span>", "A New Entity Of Type" + " "+ ClaimEntity+" "+ "Is Added To The Created Claim/Event" + " " + Claim);
	String ClaimEntityName; // Last Name Of The Entity Is Fetched In This Variable
	String StrPrimaryWindowHandle;
	String StrDatedText;
	String StrVehicleMake;

	switch (Entity){
	case "Adjustor":

		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Adjustor Link On Left Hand Navigation Tree", logval);

		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Adjustor",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Page To Create New Adjustor Is Getting Loaded ");
		//Option To Add New Adjustor Is Selected From Left Hand Navigation Tree

		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("adjuster"));// A Switch To Adjuster Frame Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Adjustor Frame Is Done");

		ClaimEntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Adjustor_");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Txt_LastName(driver), "Adjuster LastName TextBox On Created Claim" + " " + Claim + " " + "Adjuster Page", ClaimEntityName,logval); 
		StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to Add New window

		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Btn_AddNew(driver), "Add New Button On Created Claim" + " " + Claim + " " + "Adjuster Page",logval);
		driver.switchTo().window(StrPrimaryWindowHandle); // A Switch Back To The Parent Window Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Main Adjustor Screen From Add New Adjustor Screen Is Done");
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("adjuster"));// A Switch To Adjuster Frame Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Adjustor Frame Is Done After Navigating Back From Add New Adjustor Screen");
		// Adjustor Last Name Is Set

		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Btn_RiskMasterLogin(driver), "RiskMaster Login Button On Created Claim" + " " + Claim + " " + "Adjuster Page",logval);
		StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to System User window

		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Txt_SysUsersFirstName(driver), "Adjuster First Name TextBox On System Users Window On Adjuster Creation Page", AdjSystemLogin,logval); 
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Value Is Entered In First Name TextBox On System Users Window On Adjuster Creation Page");
		RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Tbl_SystemUsers(driver), AdjSystemLogin, "WEBCHECKBOX",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Btn_SystemUsers_Ok(driver), "OK Button On System User Table On Adjuster Creation Page",logval);
		//RMA Login For The Created Adjustor Is Selected

		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added After Selecting The RMA Login For The Created Adjustor");
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Main Adjustor Screen After Selecting The RMA Login For The Created Adjustor Is Done");
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("adjuster"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Adjustor Frame Is Done");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Img_Save(driver), "Save Image On Created Claim" + " " + Claim + " " + "Adjuster Page",logval);//Save Image On Adjuster Creation Page Is Clicked
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Newly Created Adjustor Is Getting Saved");
		//Adjuster Addition Is Completed Here

		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Adjustor Creation Page", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("adjuster"));
		EntName = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(ClaimEntityName, EntName,"Adjustor Last Name Value", logval);

		break;

	case "Litigation":
		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Litigation Link On Left Hand Navigation Tree", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Litigation",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Add New Context Menu Option Is Clicked");
		// Add New Litigation Link Is Selected

		ClaimEntityName = String.valueOf("Lit_"+RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999));
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To The Litigation Frame Is Done");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "Docket Number Text Box On Litigation Addition Page" , ClaimEntityName, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Litigation Addition Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Created Litigation Is Saved ");

		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Litigation Creation Page", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation"));
		EntName = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(ClaimEntityName, EntName , "Litigation Docket Number Value",logval);
		break;

	case "Claimant":

		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Claimant Link On Left Hand Navigation Tree", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Claimant",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Add New Context Menu Option Is Clicked");
		// Add New Claimant Link Is Selected

		ClaimEntityName = String.valueOf("Claimant_"+RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999));
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Claimant"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To The Claimant Frame Is Done");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Txt_LastName(driver), "Last Name Text Box On Claimant Addition Page" , ClaimEntityName, logval);

		StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to Add New window

		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Btn_AddNew(driver), "Add New Button On Created Claim" + " " + Claim + " " + "Claimant Page",logval);
		driver.switchTo().window(StrPrimaryWindowHandle); // A Switch Back To The Parent Window Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Main Claimant Screen From Add New Claimant Screen Is Done");
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Claimant"));// A Switch To Claimant Frame Is Done
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Claimant Addition Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Created Claimant Is Saved ");

		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Claimant Creation Page", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Claimant"));
		EntName = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(ClaimEntityName, EntName , "Claimant Last Name Value",logval);
		break;

	case "Defendant":

		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Defendant", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Defendant",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Add New Context Menu Option Is Clicked");
		// Add New Defendant Link Is Selected

		ClaimEntityName = String.valueOf("Defendant_"+RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999));
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Defendant"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To The Defendant Frame Is Done");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Txt_LastName(driver), "Last Name Text Box On Defendant Addition Page" , ClaimEntityName, logval);

		StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to Add New window

		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Btn_AddNew(driver), "Add New Button On Created Claim" + " " + Claim + " " + "Defendant Page",logval);
		driver.switchTo().window(StrPrimaryWindowHandle); // A Switch Back To The Parent Window Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Main Defendant Screen From Add New Defendant Screen Is Done");
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Defendant"));// A Switch To Defendant Frame Is Done

		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Defendant Addition Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Created Defendant Is Saved ");

		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Defendant Creation Page", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Defendant"));
		EntName = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(ClaimEntityName, EntName , "Defendant Last Name Value",logval);
		break;

	case "Subrogation":
		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Subrogation", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Subrogation",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Add New Context Menu Option Is Clicked");
		// Add New Subrogation Link Is Selected

		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Subrogation"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To The Subrogation Frame Is Done");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Subrogation.RMAApp_Subrogation_Txt_Type(driver), "Type Text Box On Subrogation Addition Page" , Type, logval);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Subrogation.RMAApp_Subrogation_Txt_Date(driver), "Date Text Box On Subrogation Addition Page" , Date, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Subrogation.RMAApp_Subrogation_Txt_Status(driver), "Status Text Box On Subrogation Addition Page",logval);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Subrogation.RMAApp_Subrogation_Txt_Status(driver), "Status Text Box On Subrogation Addition Page" , Status, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Subrogation Addition Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Created Subrogation Is Saved ");

		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Subrogation Creation Page", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Subrogation"));
		EntName= RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Subrogation.RMAApp_Subrogation_Txt_Type(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(FinType, EntName , "Subrogation Type Value",logval);
		break;

	case "Arbitration":
		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Arbitration", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Arbitration",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Add New Context Menu Option Is Clicked");
		// Add New Arbitration Link Is Selected

		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Arbitration"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To The Arbitration Frame Is Done");
		//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Arbitration.RMAApp_Arbitration_Txt_Status(driver), "Status Text Box On RMA Application Adjuster Creation Page",1);
		//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Arbitration.RMAApp_Arbitration_Txt_Status(driver), "Status Text Box On Arbitration Creation Page" , "AH", logval);
		//RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes");
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Arbitration.RMAApp_Arbitration_Btn_TypeSearch(driver), "Type Search Button On RMA Application Adjuster Creation Page",1);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); 
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Auto Mobile", "Adjuster Type Selection Page", logval);

		Thread.sleep(7000);
		driver.switchTo().window(StrPrimaryWindowHandle);
		driver.switchTo().frame(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Arbitration"));
		Thread.sleep(2000); 
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Arbitration", false, "NA",  "Arbitration--> " + Entity+ " Page", logval);
		
		/*RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Arbitration Addition Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Created Arbitration Is Saved ");
*/
		/*RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Arbitration Creation Page", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Arbitration"));
	*/	EntName= RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Arbitration.RMAApp_Arbitration_Txt_Type(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(FinType, EntName , "Arbitration Type Value",logval);
		break;


	case "Expert": // This is under Litigation
		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Expert Link On Litigation (1) Navigation Tree", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For LITIGATION -> EXPERT",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is added as Expert Witness screen is loaded");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Expert");
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait is added as farme is switched to Expert Witness frame");

		Entity = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Expert_");	
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_ExpertLastName(driver), "Last Name TextBox On Litigation->Expert Page", Entity, logval);

		StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to Add New window
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Btn_AddNew(driver), "Add New Button On Expert Last Name text box",logval);
		driver.switchTo().window(StrPrimaryWindowHandle); // A Switch Back To The Parent Window Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As A Switch To Main Expert Screen From Add New Expert Screen Is Done");

		driver.switchTo().frame(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Expert");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Expert", false, "NA",  "litigation--> " + Entity+ " Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_ExpertLastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(Entity, EntName,"Expert Last Name Value", logval);
		break;

	case "Dated Text - Event": // Dated Text node under Event 				 
		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Dated Text (0)"), "Dated Text Link of EVENT on Left Hand Navigation Tree", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Dated Text at EVENT level",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Event Dated Text screen Is Getting Loaded ");

		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("eventdatedtext");
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait is added as Frame is switched to Event Dated Text frame");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Document_Event.RMAApp_DatedText_Btn_DatedTextMemo(driver), "Dated Text memo button on Event dated text screen",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Dated Text comment screen Is Getting Loaded ");
		StrDatedText = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EventDatedText_");
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		//driver.manage().window().maximize();
		RMA_Input_Utility.RMA_ActionSendKeys_Utility(StrDatedText, "TextEditor On Event Dated Text Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Comments.RMAApp_Comments_Btn_SaveAndClose(driver), "SaveClose button on event dated text comment window",logval);
		globalWait.until(ExpectedConditions.numberOfWindowsToBe(1));
		driver.switchTo().window(StrRMAWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("eventdatedtext");	

		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save on Event Dated Text Screen",logval);	
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is added as Event Dated text is saved");
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_Event.RMAApp_DatedText_Txt_DatedTextArea(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrDatedText, EntName,"Event Dated Text Value", logval);
		break;

	case "Dated Text - Adjuster": // Dated Text node under Adjuster		 
		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Dated Text (0)"), "Dated Text Link of Adjuster on Left Hand Navigation Tree", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Dated Text at Adjuster",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Event Dated Text screen Is Getting Loaded ");

		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("adjusterdatedtext");
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait is added as Frame is switched to Adjuster Dated Text frame");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Document_Event.RMAApp_DatedText_Btn_DatedTextMemo(driver), "Dated Text memo button on Event dated text screen",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Dated Text comment screen Is Getting Loaded ");
		StrDatedText = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "AdjusterDatedText_");
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		driver.manage().window().maximize();
		RMA_Input_Utility.RMA_ActionSendKeys_Utility(StrDatedText, "TextEditor On Adjuster Dated Text Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Comments.RMAApp_Comments_Btn_SaveAndClose(driver), "SaveClose button on Adjuster dated text comment window",logval);
		globalWait.until(ExpectedConditions.numberOfWindowsToBe(1));
		driver.switchTo().window(StrRMAWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("adjusterdatedtext");	

		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save on Adjuster Dated Text Screen",logval);	
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is added as Adjuster Dated text is saved");
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_Event.RMAApp_DatedText_Txt_DatedTextArea(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrDatedText, EntName,"Adjuster Dated Text Value", logval);
		break;
		
	case "Demand Offer": // Demand Offer Entity Is Present For Claimant/Subrogation/Litigation/Vehicle-Unit/Injury (POM Created For Litigation Demand Offer Is Valid For Other Pages Too)
		//Note: Here Type Variable Is Used To Store The Value In Demand Offer Activity Text Box And Subsequently Fin Type Stores The Value Of Activity After Save 
		
		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Demand Offer Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2)+ " " +"On Left Hand Navigation Tree", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Option For Demand Offer Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2),logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Page To Add New Demand Offer To A Claim" + " "+ color.RMA_ChangeColor_Utility(Claim, 2)+ " "+ "Is Loaded");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Demand");	
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Litigation.RMAApp_LitDemandOffer_Txt_Activity(driver), "Activity TextBox On Demand Offer Page For Created Claim"+ " "+ color.RMA_ChangeColor_Utility(Claim, 2), Type, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Litigation.RMAApp_LitDemandOffer_Txt_Date(driver), "Date TextBox On Demand Offer Page For Claim "+ " "+ color.RMA_ChangeColor_Utility(Claim, 2),Date,logval); 
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Litigation.RMAApp_LitDemandOffer_Txt_Activity(driver), "Activity TextBox On Demand Offer Page For Claim"+ " "+ color.RMA_ChangeColor_Utility(Claim, 2),logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On New Demand Offer Creation Page", logval);// Click On Save Image Button
		driver.switchTo().parentFrame();
		globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='pleaseWaitFrame']/img")));// Wait For Load Indicative Progress Bar To Get Disappeared
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Demand");
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Litigation.RMAApp_LitDemandOffer_Txt_Activity(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(FinType,EntName, "DemandOfferTypeValue", logval);
		break;
		
	case "Unit":
		//Note: Here ClaimEntityName Variable Is Used To Store The Value Of Vehicle Model, Since It Was An Already Defined Variable Used The Same Instead Of Creating A New Variable 
		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Unit Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2)+ " " +"On Left Hand Navigation Tree", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Option For Unit Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2),logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Page To Add New Unit To Claim"+ " "+ color.RMA_ChangeColor_Utility(Claim, 2)+" "+ "Is Loaded");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Unit");

		StrVehicleMake = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "VehMake_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehAccUnit_Txt_VehicleMake(driver), "Vehicle Make Text Box On Unit Page Of Created Claim" + " " + color.RMA_ChangeColor_Utility(Claim, 2), StrVehicleMake,logval); 
		ClaimEntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "VehModel_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehAccUnit_Txt_VehicleModel(driver), "Vehicle Model Text Box On Unit Page Of Created Claim" + " " + color.RMA_ChangeColor_Utility(Claim, 2), ClaimEntityName,logval); 
			
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Unit", false, "NA", "Unit Page For Created Claim"+ " " + color.RMA_ChangeColor_Utility(Claim, 2), logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehAccUnit_Txt_VehicleMake(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrVehicleMake,EntName, "Vehicle Make Value", logval);
		break;
		
	case "Salvage":
		//Note: Here ClaimEntityName Variable Is Used To Store The Value Of SalvageControlNumber, Since It Was An Already Defined Variable Used The Same Instead Of Creating A New Variable 
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Salvage Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2)+ " " +"On Left Hand Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Page To Add New Salvage To Claim"+ " "+ color.RMA_ChangeColor_Utility(Claim, 2)+ " "+ "Is Loaded");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Salvage");

		ClaimEntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "SalControl_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehAccSalvage_Txt_ControlNumber(driver), "Control Number Text Box On Unit-Salvage Page Of Created Claim" + " " + Claim, ClaimEntityName,logval); 
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehAccSalvage_Txt_SalvageStatus(driver), "Salvage Status Text Box On Unit-Salvage Page Of Created Claim" + " " + Claim, Status,logval); 
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On New Salvage Creation Page", logval);// Click On Save Image Button
		driver.switchTo().parentFrame();
		globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='pleaseWaitFrame']/img")));// Wait For Load Indicative Progress Bar To Get Disappeared
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Salvage");
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehAccSalvage_Txt_ControlNumber(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(ClaimEntityName,EntName, "Salvage Control Number Value", logval);
		break;
		
	case "Injury":
		//Note: Here Type Variable Is Used To Store The Value Of Pre-Existing Condition TextBox, Status Variable Stores The value Of Cause Of Injury TextBox And Subsequently Fin Type Variable Stores The Value Of Cause Of injury TextBox After Save 
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Injury/Illness Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2)+ " " +"On Left Hand Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Page To Add New Injury/Illness To Claim"+ " "+ color.RMA_ChangeColor_Utility(Claim, 2)+" "+ "Is Loaded");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Injury/Illness");
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericInjury_Btn_CauseOfInjury(driver), "Cause Of Injury Search Button On Injury/Illness Page Of Created Claim" + " " + color.RMA_ChangeColor_Utility(Claim, 2),logval); 
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Cause Of Injury/Illness Link Is Done
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,Status)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,Status), Status+ " " +"Link On Cause Of Injury/Illness Selection Page",logval);
		globalWait.until(ExpectedConditions.numberOfWindowsToBe(1));
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Injury/Illness");
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericInjury_Btn_PreExistCond(driver), "Pre-Existing Condition Search Button On Injury/Illness Page Of Created Claim" + " " + color.RMA_ChangeColor_Utility(Claim, 2),logval); 
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Pre-Existing Condition Link Is Done
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,Type)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,Type), Type+ " " +"Link On Pre-Existing Condition Selection Page",logval);
		globalWait.until(ExpectedConditions.numberOfWindowsToBe(1));
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Injury/Illness");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Injury/Illness", false, "NA", "Injury/Illness Page For Created Claim"+ " " + color.RMA_ChangeColor_Utility(Claim, 2), logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_GenericInjury_Txt_CauseOfInjury(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(FinType,EntName, "Cause Of Injury/Illness", logval);
		break;
			
   case "Case Management System":
		//Note: Here Type Variable Is Used To Store The Value Of Disability Type TextBox, Status Variable Stores The value Of Cause Of Illness Type TextBox And Subsequently Fin Type Variable Stores The Value Of Illness Type TextBox After Save 
		
		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Case Management List Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2)+ " " +"On Left Hand Navigation Tree", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Option For Case Management List Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2),logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Page To Add New Case Management To Claim"+ " "+ color.RMA_ChangeColor_Utility(Claim, 2)+" "+ "Is Loaded");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("casemanagementlist");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Home.RMAApp_GenericCaseManagement_Txt_DisabilityType(driver), "Disability Type Text Box On Case Management System Page Of Created Claim" + " " + color.RMA_ChangeColor_Utility(Claim, 2), Type,logval); 
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Home.RMAApp_GenericCaseManagement_Txt_IllnessType(driver), "Illness Type Text Box On Case Management System Page Of Created Claim" + " " + color.RMA_ChangeColor_Utility(Claim, 2), Status,logval); 
			
		RMA_Functionality_Utility.RMA_GenericSave_Utility("casemanagementlist", false, "NA", "Case Management System Page For Created Claim"+ " " + color.RMA_ChangeColor_Utility(Claim, 2), logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_GenericCaseManagement_Txt_IllnessType(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(FinType,EntName,  "Case Management System Illness Type Value", logval);
		break;
		
	case "Accommodation":
		//Note: Here Type Variable Is Used To Store The Value Of Accommodation Scope TextBox,And Subsequently Fin Type Variable Stores The Value Of Accommodation Scope TextBox After Save 
		
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Accommodation Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2)+ " " +"On Left Hand Navigation Tree", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Option For Accommodation Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2),logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Page To Add New Accommodation To Claim"+ " "+ color.RMA_ChangeColor_Utility(Claim, 2)+" "+ "Is Loaded");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Accommodation");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Home.RMAApp_GenericAccomadation_Txt_AccomScope(driver), "Scope Text Box On Accommodation Page Of Created Claim" + " " + color.RMA_ChangeColor_Utility(Claim, 2), Type,logval); 
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericAccomadation_Btn_AccomStatus(driver), "Accomadation Status Search Button Accommodation Page Of Created Claim" + " " + color.RMA_ChangeColor_Utility(Claim, 2),logval); 
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Accomadation Status Link Is Done
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,Status)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,Status), Status+ " "+ "Link On Accomadation Status Selection Page",logval);
		globalWait.until(ExpectedConditions.numberOfWindowsToBe(1));
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Accommodation");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("zcmxaccommodation", false, "NA", "Accommodation Page For Created Claim"+ " " + color.RMA_ChangeColor_Utility(Claim, 2), logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_GenericAccomadation_Txt_AccomScope(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(FinType,EntName, "Accomadtion Scope Value", logval);
		break;
		
	case "VocationalRehab":
		//Note: Here Type Variable Is Used To Store The Value Of Vocational Rehab Type TextBox, And Subsequently Fin Type Variable Stores The Value Of Vocational Rehab Type TextBox After Save 
		
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "VocationalRehab Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2)+ " " +"On Left Hand Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Page To Add New VocationalRehab To Claim"+ " "+ color.RMA_ChangeColor_Utility(Claim, 2)+" "+ "Is Loaded");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vocational");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericVocRehab_Btn_RehabType(driver), "Rehab Type Search Button On Vocational Rehab Page Of Created Claim" + " " + color.RMA_ChangeColor_Utility(Claim, 2),logval); 
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Vocational Rehab Type Link Is Done
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,Type)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,Type), Type+ " "+ "Link On Vocational Rehab Type Selection Page",logval);
		globalWait.until(ExpectedConditions.numberOfWindowsToBe(1));
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vocational");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericVocRehab_Txt_RehabStatus(driver), "Rehab Status Text Box On Vocational Rehab Page Of Created Claim" + " " + color.RMA_ChangeColor_Utility(Claim, 2),logval); 	
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Home.RMAApp_GenericVocRehab_Txt_RehabStatus(driver), "Rehab Status Text Box On Rehab Type Page Of Created Claim" + " " + color.RMA_ChangeColor_Utility(Claim, 2), Status,logval); 	
		RMA_Functionality_Utility.RMA_GenericSave_Utility("cmxvocrehab", false, "NA", "VocationalRehab Page For Created Claim"+ " " + color.RMA_ChangeColor_Utility(Claim, 2), logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_GenericVocRehab_Txt_RehabType(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(FinType,EntName, "Vocational Rehab Type Value", logval);
		break;
		
	case "CaseManagers":
		//Note: Here Type Variable Is Used To Store The Value Of Case Manager TextBox, And Subsequently Fin Type Variable Stores The Value Of Case Manager TextBox After Save 
		
		RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, ClaimEntity), "Case Managers Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2)+ " " +"On Left Hand Navigation Tree", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Option For Case Managers Link For Claim" +" "+ color.RMA_ChangeColor_Utility(Claim, 2),logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Page To Add New Case Manager To Claim"+ " "+ color.RMA_ChangeColor_Utility(Claim, 2)+" "+ "Is Loaded");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Case Managers");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Home.RMAApp_GenericCaseManager_Txt_CaseManager(driver), "Case Manager Text Box On Case Managers Page Of Created Claim" + " " + color.RMA_ChangeColor_Utility(Claim, 2), Type,logval); 	
		RMA_Functionality_Utility.RMA_GenericSave_Utility(Type, false, "NA", "Case Managers Page For Created Claim"+ " " + color.RMA_ChangeColor_Utility(Claim, 2), logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_GenericCaseManager_Txt_CaseManager(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(FinType,EntName, "Case Manager Name Value", logval);
		break;

	default:

		if (logval == 0)
		{
			parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+ClaimEntity+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
		else
		{
			logger.log(LogStatus.ERROR, "Case Variable" + " "+ ClaimEntity+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
			}
		}
		return EntName;

	} catch (Exception|Error e) {
		throw (e);
	}
}

//====================================================================================================
//FunctionName 		: RMA_MenuOptionClick_Utility
//Description  		: Enables The User To Click On Any Of The Menu Or Sub Menu Options On RMA Application Based On The Case Selected By The User  
//Input Parameter 	: MenuOption: Case Variable Determining Which Menu Item Is to Be Clicked, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger", Claim Is The Claim Number To Which The Created Entity Is To Be Added
//Revision			: 0.0 - KumudNaithani-06-20-2016      
//Modified By		: 0.0 - MahendraPSingh-02-25-2017- Added Navigation For Maintenance-> Leave Plan Management
//====================================================================================================
public static void RMA_MenuOptionClick_Utility(String MenuOption, int logval) throws Exception, Error
{
	try {

	switch (MenuOption){
		case "Document-Event":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Document;Event", logval);
		break;

		case "Document-GeneralClaim":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Document;General Claim", logval);
		break;

		case "Document-Non-occupational":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Document;Non-occupational", logval);
		break;

		case "Document-PropertyClaim":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Document;Property Claim", logval);
		break;

		case "Document-VehicleAccident":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Document;Vehicle Accident", logval);
		break;

		case "Document-Workers’Comp.":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Document;Workers’ Comp.", logval);
		break;

		case "Diaries-DiaryList":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Diaries;Diary List", logval);
		break;

		case "Diaries-DiaryCalendar":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Diaries;Diary Calendar", logval);
		break;

		case "Funds-ApplyPaymentstoCoverages":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Funds;Apply Payments to Coverages", logval);
		break;

		case "Funds-SupervisoryApproval":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Funds;Supervisory Approval", logval);
		break;

		case "Funds-BankAccount":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Funds;Bank Account", logval);
		break;

		case "Funds-BulkCheckRelease":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Funds;Bulk Check Release", logval);
		break;

		case "Funds-CombinedPayment":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Funds;Combined Payment", logval);
		break;

		case "Funds-CustomPaymentNotification":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Funds;Custom Payment Notification", logval);
		break;

		case "Funds-Deposit":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Funds;Deposit", logval);
		break;		

		case "Help-About":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Help;About", logval);
		break;

		case "Maintenance-AdminTracking":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Admin Tracking", logval);
		break;

		case "Maintenance-Catastrophe":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Catastrophe", logval);
		break;

		case "Maintenance-Driver":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Driver", logval);
		break;

		case "Maintenance-Employee":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Employee", logval);
		break;

		case "Maintenance-Entity":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Entity", logval);
		break;		

		case "Maintenance-MedicalStaff":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Medical Staff", logval);
		break;		

		case "Maintenance-PatientTracking":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Patient Tracking", logval);
		break;

		case "Maintenance-People":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;People", logval);
		break;	

		case "Maintenance-Physician":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Physician", logval);
		break;

		case "Maintenance-PlanManagement":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Plan Management", logval);
		break;

		case "Maintenance-LeavePlanManagement":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Leave Plan Management", logval);
		break;

		case "Maintenance-PolicyTracking":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Policy Tracking", logval);
		break;

		case "Maintenance-Property":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Property", logval);
		break;

		case "Maintenance-Vehicle":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Vehicle", logval);
		break;

		case "Maintenance-TableMaintenance":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Maintenance;Table Maintenance", logval);
		break;

		case "MyWork-WebLinks":
		RMA_Navigation_Utility.RMA_MDIMenuClick("My Work;Web Links", logval);
		break;

		case "Reports-BI":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Reports;BI", logval);
		break;

		case "Search-Claim":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Search;Claim", logval);
		break;

		case "Search-Event":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Search;Event", logval);
		break;

		case "Search-Funds":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Search;Funds", logval);
		break;

		case "Security-UserPrivilegesSetup":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Security;User Privileges Setup", logval);
		break;

		case "Security-SecurityManagementSystem":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Security;Security Management System", logval);
		break;

		case "UserDocuments-DocumentList":
		RMA_Navigation_Utility.RMA_MDIMenuClick("User Documents;Document List", logval);
		break;

		case "Utilities-Managers-FinancialkeySetup":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;Managers;Financial key Setup", logval);
		break;

		case "Utilities-Managers-CodeRelationships":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;Managers;Code Relationships", logval);
		break;

		case "Utilities-Managers-LossCodeMapping":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;Managers;Loss Code Mapping", logval);
		break;

		case "Utilities-SystemParameters-GeneralSystemParameterSetup":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;System Parameters;General System Parameter Setup", logval);
		break;

		case "Utilities-SystemParameters-LineOfBusinessParameterSetup":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;System Parameters;Line Of Business Parameter Setup", logval);
		break;

		case "Utilities-SystemParameters-PaymentParameterSetup":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;System Parameters;Payment Parameter Setup", logval);
		break;

		case "Utilities-ToolsandDesigners":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;Tools and Designers", logval);
		break;

		case "Utilities-Technicians-XML Import-XMLImportTemplateGeneration":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;Technicians;XML Import;XML Import Template Generation", logval);
		break;

		case "Utilities-ToolsandDesigners-AutoDiarySetup":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;Tools and Designers;Auto Diary Setup", logval);
		break;

		case "Utilities-ToolsandDesigners-ScriptEditor":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;Tools and Designers;Script Editor", logval);
		break;

		case "Utilities-ToolsandDesigners-QueryDesigner":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;Tools and Designers;Query Designer", logval);
		break;

		case "Utilities-UIAdmins-Customization-PortalSettings":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;UI Admins;Customization;Portal Settings", logval);
		break;

		case "Utilities-UIAdmins-PowerviewEditor":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;UI Admins;Powerview Editor", logval);
		break;

		case "Utilities-UIAdmins-Customization-WebLinksSetup":
		RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;UI Admins;Customization;Web Links Setup", logval);
		break;

	default:

		if (logval == 0)
		{
			parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+MenuOption+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
		else
		{
			logger.log(LogStatus.ERROR, "Case Variable" + " "+ MenuOption+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
			}
		}
	} catch (Exception|Error e) {
		throw (e);
	}
}

//====================================================================================================
//FunctionName 		: RMA_Attachment_Add_Edit_Delete
//Description  		: Enables The User To Add ,Edit And Delete Document To Attachment Window   
//Input Parameter 	: PhysicalPath: Path Of Document To Be Added, FileSize:FileSize To Be Verified, Logval
//                  : Boolean  AdditionalParameter- If Passed Yes, ADD case will be executed only. if False, Add_Edit block will be executed in entirety 
//Revision			: 0.0 - ImteyazAhmad-06-27-2016
//Modified By       : 0.0 - MahendraPSingh-01-31-2017 updated as delete pop up alert text was changed.
//                  : 0.1 - MahendraPSingh-02-21-2017 Added Switch cases to individually Add , edit or Delete the attachment. 
//====================================================================================================

public static void RMA_Attachment_Add_Edit_Delete(String Case, String PhysicalPath, String FileSize, boolean AdditionalParameter, int logval) throws Exception,Error
{
	String StrSubject;
	String StrTitle;
	String StrConcatinatedText;
	String StrMsg;
	try{
		if (logval == 0)
		{
			parentlogger = reports.startTest("<span id='RMA_Attachment_Add_Edit_Delete'>" +"Attachment" +" "+Case +" "+"Utility </span>","A File" +" "+Case +" " +"On Attachment Window");
		}
		else
		{	
			logger = reports.startTest("<span id='RMA_Attachment_Add_Edit_Delete'>" +"Attachment"+" "+Case +" "+"Utility </span>","A File" +" "+Case +" " +"On Attachment Window");
		}

	StrSubject = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Subject_");
	StrTitle = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Title_");

	switch (Case){
	case "Add_Edit":
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Upload Of Document Is Started +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		
		driver.manage().window().maximize();
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Attachment Window Is Maximized");
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Img_AddNewDocument(driver), "AddeNewDocument Image On Attachment Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As AddNewDocument Image Is Clicked");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Attachment.RMAApp_Attachment_Txt_Title(driver), "Title TextBox On Attachment Page", StrTitle, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Attachment.RMAApp_Attachment_Txt_Subject(driver), "Subject TextBox On Attachment Page", StrSubject, logval);
		//RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Txt_Type(driver), "Type TextBox On Attachment Page", logval);
		//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_Attachment.RMAApp_Attachment_Txt_Type(driver), "Type TextBox On Attachment Page", "B", logval);
		//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_Attachment.RMAApp_Attachment_Txt_Class(driver), "Class TextBox On Attachment Page", "AL", logval);
		//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_Attachment.RMAApp_Attachment_Txt_Category(driver), "Category TextBox On Attachment Page", "MD", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Attachment.RMAApp_Attachment_Txt_Keyword(driver), "Keyword TextBox On Attachment Page", "KeyWord", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Attachment.RMAApp_Attachment_Txt_Notes(driver), "Notes TextBox On Attachment Page", "NotesText", logval);
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Btn_Upload(driver), "Upload Button On Attachment Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(12, logval, "Wait Is Added As File Upload Window Is Loaded");
		RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath);
		RMA_GenericUsages_Utility.RMA_DynamicPollingWait("ID", "Button1");
		Thread.sleep(5000);
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Img_Save(driver), "Save Image On Attachment Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(1, logval, "Wait Is Added As File Is Saved");
		//WebDriverWait wait = new WebDriverWait(driver, 10);		
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Msg_ToastMessage(driver,"Uploaded Successfully."), "Uploaded Successful Message On Attachment Page", logval);
		globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'Uploaded Successfully.')]")));
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
	
		//globalWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(By.className("toast-message")));
		//StrMsg = RMA_POM_Attachment.RMAApp_Attachment_Msg_TextMessage(driver).getText();
		//RMA_Verification_Utility.RMA_TextCompare("Uploaded Successfully.", StrMsg, "Uploaded Successfully Message On Attachment Page", logval);
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Img_Reload(driver), "Reload Image On Attachment Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Attachment Page Is Reloaded");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Attachment.RMAApp_Attachment_Txt_SubjectSearch(driver), "Subject Search TextBox On Attachment Page", StrSubject, logval);
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Btn_SubjectSearchButton(driver), "Subject Search Button On Attachment Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Attached File Is Filtered");
		String [] Array = PhysicalPath.split("\\\\");
		int index = Array.length;
		String [] Array2 = Array[index-1].split("\\.");
		StrConcatinatedText = StrTitle+"("+Array2[0];			
		RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(StrSubject, "AttachmentUXGrid", StrConcatinatedText, 1, FileSize, 7, logval);

		if (AdditionalParameter == true)
		{
			break;
		}
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Upload Of Document Is Completed ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Edit Of Uploaded Document Is Started+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		else 
		{
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Lnk_DocumentName(driver), "Attached Document Title :"+StrConcatinatedText+"On Attachment Page", logval);
			//RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrConcatinatedText, "Attached Document Title ", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Document Properties Page Is Opened");
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_AttachmentDocumentProperties_Img_Edit(driver), "Edit Image On Attachment Document Properties Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Edit Image On Attachement Document Properties Page Is Clicked");
			StrTitle = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "TitleChanged_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Attachment.RMAApp_AttachmentDocumentProperties_Txt_Title(driver), "Tilte TextBox On Attachement Document Properties Page", StrTitle, logval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_AttachmentDocumentProperties_Img_Cancel(driver),"Cancel Image On Attachement Document Properties Page" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Cancel Image On Attachement Document Properties Page Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_AttachmentDocumentProperties_Img_Close(driver),"Close Image On Attachement Document Properties Page" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Close Image On Attachement Document Properties Page Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Img_Reload(driver), "Reload Image On Attachment Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Attachment Page Is Reloaded");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Attachment.RMAApp_Attachment_Txt_SubjectSearch(driver), "Subject Search TextBox On Attachment Page", StrSubject, logval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Btn_SubjectSearchButton(driver), "Subject Search Button On Attachment Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Attached File Is Filtered");
			RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(StrSubject, "AttachmentUXGrid", StrConcatinatedText, 1, FileSize, 7, logval);

			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Lnk_DocumentName(driver), "Attached Document Title :"+StrConcatinatedText+"On Attachment Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Document Properties Page Is Opened");
			driver.manage().window().maximize();
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_AttachmentDocumentProperties_Img_Edit(driver), "Edit Image On Attachment Document Properties Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Edit Image On Attachement Document Properties Page Is Clicked");
			StrTitle = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "TitleChanged2_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Attachment.RMAApp_AttachmentDocumentProperties_Txt_Title(driver), "Tilte TextBox On Attachement Document Properties Page", StrTitle, logval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_AttachmentDocumentProperties_Img_Save(driver),"Save Image On Attachement Document Properties Page" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Edit Is Saved");
			//RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Save Image On Attachement Document Properties Page Is Clicked");
			//globalWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(By.className("toast-message")));
			//globalWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='toast-container']/div/div/div)")));
			//StrMsg = RMA_POM_Attachment.RMAApp_Attachment_Msg_TextMessage(driver).getText();
			//RMA_Verification_Utility.RMA_TextCompare("Updated Successfully.", StrMsg, "Updated Successfull Message On Attachment Page", logval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_AttachmentDocumentProperties_Img_Close(driver),"Close Image On Attachement Document Properties Page" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Close Image On Attachement Document Properties Page Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Img_Reload(driver), "Reload Image On Attachment Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Attachment Page Is Reloaded");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Attachment.RMAApp_Attachment_Txt_SubjectSearch(driver), "Subject Search TextBox On Attachment Page", StrSubject, logval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Btn_SubjectSearchButton(driver), "Subject Search Button On Attachment Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Attached File Is Filtered");
			StrConcatinatedText = StrTitle+"("+Array2[0];			
			RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(StrSubject, "AttachmentUXGrid", StrConcatinatedText, 1, FileSize, 7, logval);
			break;
		}
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Edit Of Uploaded Document Is Completed+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	case "Delete":
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Delete Of Uploaded Document Is Started+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Img_SelectRowMark(driver), "Select Row Mark On Attachment Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Row In Attachment UXGrid Is Selcted");
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Img_Delete(driver), "Delete Image On Attachement Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Delete Image On Attachment Page Is Clicked");
		String AlertText = RMA_POM_Attachment.RMAApp_AttachmentAlert_Txt_DeleteText(driver).getText().trim(); 
		AlertText= AlertText.replaceAll("\\r|\\n|\\r|\\n", " ");   
		RMA_Verification_Utility.RMA_TextCompare("Are you sure you want to delete?", AlertText, "Text Message On Attachment Alert Pop Up", logval);
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_AttachmentAlert_Btn_Delete(driver), "Delete Button On Attachment Alert Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Delete Image On Attachment Alert Pop Up Is Clicked");
		//globalWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(By.className("toast-message")));
		//StrMsg = RMA_POM_Attachment.RMAApp_Attachment_Msg_TextMessage(driver).getText();
		//RMA_Verification_Utility.RMA_TextCompare("1: File(s) successfully deleted.", StrMsg, " Successfull Deletion Message On Attachment Page", logval);
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_POM_Attachment.RMAApp_Attachment_Img_Reload(driver), "Reload Image On Attachment Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Attachment Page Is Reloaded");
		String StrNoRecordText = RMA_POM_Attachment.RMAApp_Attachment_Grd_AttachmentGrid(driver).getText();
		RMA_Verification_Utility.RMA_TextCompare("No Records available.", StrNoRecordText, "No Record On Attachment Page", logval);		
		break;
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Delete Of Uploaded Document Is Completed+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		}
	}catch(Exception|Error e)

	{
		throw(e);
	}

}

//=============================================================================================================================================================================================
//FunctionName 		: RMA_PIAddNewEntity_Utility
//Description  		: Enables The User To Add Entity Like Employee, Medical From The Person Involved Screen To The RMA Application   
//Input Parameter 	: Entity: Case Variable Determining Which Entity Is To Be Created, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
//Revision			: 0.0 - RenuVerma-06-24-2016
//Modified By		: 0.0 - MahendraPSingh-02-24-2017- EntityNumber generation range for Employee case is updated as random no becoming duplicate                             	
//=============================================================================================================================================================================================
public static String RMA_PIAddNewEntity_Utility(String Entity, int logval) throws Exception, Error
{
	try {
	logger = reports.startTest("<span id='PIAddNewEntity'>Entity Addition</span>", "A New Entity Of Type" + " "+ Entity+" "+ "From Person Involved Screen To RMA Application");
	String EntityName; // Last Name Of The Entity Is Fetched In This Variable
	int EntityNumber; // Numeric Part Of The Entity Is Fetched In This Variable
	String EntityNum; //Employee Number Of the Entity Is Fetched In This Variable
	int SecurityNum; //Social Security Number Of The Entity Is Fetched In This Variable

	switch (Entity){
	case "Employee":
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_NewEntName(driver, Entity), "Employee Under Add New Menu On Persons Involved Submenu", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("PI Employee (New)")));
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("piemployee");

		EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000000, 9999999);
		EntityNum = "E" + EntityNumber;
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_EmployeeNumber(driver), "Employee Number TextBox On Maintenance-->Employee Page", EntityNum, logval);
		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EmpName_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_LastName(driver), "Employee Last Name TextBox On Person Involved-->Employee Page", EntityName, logval);

		SecurityNum = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_SocSecNum(driver), "Social Security Number TextBox On Person Involved-->Employee Page", String.valueOf(SecurityNum), logval);

		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Tab_EmploymentInfo(driver), "Employment Info Tab On Person Involved-->Employee Page", logval);
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_Department(driver)));

		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_Department(driver), "Employee Department TextBox On Person Involved-->Employee Page", "ST", logval);
		Thread.sleep(5000); // Extra Delay Is Added 
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Employee", "Employee Tab On Person Involved-->Employee Page", logval);
		//globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_LastName(driver))); -- This Is Causing Issue So It Is Commented, Imteyaz

		RMA_Functionality_Utility.RMA_GenericSave_Utility("piemployee", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_EmployeeNumber(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Employee Number Value", logval);
		break;

	case "Medical Staff":
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_NewEntName(driver, Entity), "Medical Staff Under Add New Menu On Persons Involved Submenu", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("PI Medstaff (New)")));
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("pimedstaff");

		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "MedStaff_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintMedStaff_Txt_LstName(driver), "Last Name TextBox On Person Involved-->Medical Staff Page", EntityName, logval);

		EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100, 999);
		EntityNum = "MedStaff_" + EntityNumber;
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintMedStaff_Txt_StaffNumber(driver), "Staff Number TextBox On Person Involved-->Medical Staff Page", EntityNum, logval);	

		RMA_Functionality_Utility.RMA_GenericSave_Utility("pimedstaff", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);	
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintMedStaff_Txt_LstName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName, "Medical Staff Name Value", logval);
		break;

	case "Patient":

		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_NewEntName(driver, Entity), "Patient Under Add New Menu On Persons Involved Submenu", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("PI Patient (New)")));
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("pipatient");

		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Patient_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "Last Name TextBox On Person Involved-->Patient Tracking Page", EntityName, logval);

		RMA_Functionality_Utility.RMA_GenericSave_Utility("pipatient", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName, "Patient Last Name Value", logval);
		break;

	case "Physician":		

		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_NewEntName(driver, Entity), "Physician Under Add New On Menu Persons Involved Submenu", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("PI Physician (New)")));
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("piphysician");

		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Physician_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_LastName(driver), "Last Name TextBox On Person Involved-->Physician Page", EntityName, logval);

		EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100, 999);
		EntityNum = "Physician_" + EntityNumber;
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PhysicianNum(driver), "Physician Number TextBox On Person Involved-->Physician Page", EntityNum, logval);	

		RMA_Functionality_Utility.RMA_GenericSave_Utility("piphysician", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName, "Physician Last Name Value", logval);
		break;

	case "Driver":
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_NewEntName(driver, Entity), "Driver Under Add New Menu On Persons Involved Submenu", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("PI Driver (New)")));
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("pidriver");

		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Driver_");

		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintDriver_Txt_LastName(driver), "Last Name TextBox On Person Involved-->Driver Page", EntityName, logval);	
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PersonInvolved.RMAApp_PIDiver_Lst_DriverType(driver), 1, "DriverType List Box", "Person Involved-->Driver Page", logval);

		RMA_Functionality_Utility.RMA_GenericSave_Utility("pidriver", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);	
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintDriver_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName,"Driver Last Name Value", logval);
		break;

	case "Witness":
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_NewEntName(driver, Entity), "Witness Under Add New Menu On Persons Involved Submenu", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("PI Witness (New)")));
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("piwitness");

		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Witness_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "Last Name TextBox On Person Involved-->People Page", EntityName, logval);	

		RMA_Functionality_Utility.RMA_GenericSave_Utility("piwitness", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName,"Witness Last Name Value", logval);
		break;

	case "Other Person":
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_NewEntName(driver, Entity), "Other People Under Add New Menu On Persons Involved Submenu", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("PI Other (New)")));
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("piother");

		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "OthPeople_");	
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Lst_PeopleType(driver),"Other People", "Type Of People List Box", "Person Involved-->People Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "Last Name TextBox On Person Involved-->People Page", EntityName, logval);	

		RMA_Functionality_Utility.RMA_GenericSave_Utility("piother", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName,"Other People Last Name Value", logval);
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

//================================================================================================================================================================================================================================================================================================================================================================================================
//FunctionName 		: RMA_StandardSearch_Screen
//Description  		: Enables Users To Search Any Type Of Entity On The Opened Search Screen
//Input Parameter 	: WebElement Element : Element In Which The Searched Text (String Type Parameter Is Passed), ControlDesc, ScreenDesc : Respectively Provide Description About The Search Screen (Like Claim Search) And The control Name In Which The Searched Text Is Entered, Link Text Of The Link To Be Clicked, FrameText: Text With Which the Frame Is To Be Identified
//					: logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
//Revision			: 0.0 - KumudNaithani-06-28-2016                               
//========================================================================================================================================================================================================================================================================================================================================================================================================

public static void RMA_StandardSearch_Screen(WebElement Element, String ScreenDesc, String ControlDesc, String SearchedText, String LinkText, String FrameText, String FrameType, int frame, int logval) throws Exception,Error
{
//Note: Following Function Requires That The Application Should Be Already Inside Search Frame
String framename;
try{

	RMA_Input_Utility.RMA_SetValue_Utility(Element, ControlDesc+  " "+ "On" + ScreenDesc, SearchedText, logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", ScreenDesc, logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On"+ " " + ScreenDesc, logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Specified Criteria Search Page is Loaded");

	driver.switchTo().parentFrame();
	if (FrameType == "String"){
		framename = String.valueOf(frame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(framename);
	}
	else
	driver.switchTo().frame(frame);
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As A Switch To Specified Criteria Search Frame Is Done");
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect(LinkText, "Specified Criteria Search Page" , logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Specific Criteria Search Page Based Upon The Link Clicked Is Loaded");

		driver.switchTo().parentFrame();
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(FrameText);

	}catch(Exception|Error e)
	{
		throw (e);
	}		

}	

//====================================================================================================
//FunctionName 		: RMA_StandardSearch_Window
//Description  		: Enables Users To Search Any Type Of Entity On The Opened Search Window  
//Input Parameter 	: Element On Which The Value To Be Searched Is Set, ScreenDesc: Like The Type Of Search Window (Claim Search Or Funds Search), ControlDesc: Control Name On Which The Value To Be Searched Is Set, Text To Be Searched, LinkText : To Be Clicked, FrameText : Frame To Be Switched,
//					: StrPrimaryWindowHandle Window Handle To Be Switched, logval value of the logger (parent logger or simply logger)
//Revision			: 0.0 - KumudNaithani-06-28-2016                               
//====================================================================================================

public static void RMA_StandardSearch_Window(WebElement Element, String ScreenDesc, String ControlDesc, String SearchedText, String LinkText, String FrameText, String StrPrimaryWindowHandle,int logval) throws Exception,Error
{

	try{
		RMA_Input_Utility.RMA_SetValue_Utility(Element, ControlDesc+  " "+ "On" + ScreenDesc, SearchedText, logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", ScreenDesc, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On"+ " " + ScreenDesc, logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Specified Criteria Search Page is Loaded");
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(LinkText, "Specified Criteria Search Page" , logval);
		driver.switchTo().window(StrPrimaryWindowHandle); // A Switch Back To The Parent Window Is Done
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("cphMainBody_uwtPortal_frame0");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(FrameText);

	}catch(Exception|Error e)
	{
		throw (e);
	}					
}		

//===========================================================================================================================================================================================================================================
//FunctionName 		: RMA_ScheduleCheckCreation
//Description  		: Enables Users To Create Schedule Check
//Input Parameter 	: Input Parameters Are :PayInterval,  NumberOfPayment, BankAccount, PayeeType, DistributionType, TransactionType, Amount, logval,  AdditionalParameter: Few Parameter which May Compulsory In Future
//Revision			: 0.0 - ImteyazAhmad-07-06-2016   
//ModifiedBy		: 0.0 - RenuVerma-09-27-2016 Added AdditionParameter Variable And Claimant Selection
//					: 0.1 - RenuVerma-01-24-2017 Added Add New People Case 
//					: 0.2 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
//======================================================================================================================================================================================================================================================

public static String RMA_ScheduleCheckCreation( String PayInterval, int NumberOfPayment, String BankAccount, String PayeeType, String DistributionType, String TransactionType, int Amount,String LastName, boolean AdditionParameter,int logval) throws Exception,Error
{		
	//String LastName;
String StrPrimaryWindowHandle;
ReturnValue=null;
try
{
	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO,"Schedule Check Is Created");
	}
	else
	{	
		logger = reports.startTest("<span id='ScheduleCheck'>ScheduleCheck Creation</span>","Schedule Check Is Created");
	}
	//LastName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "LastName_");
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financials/Reserves");
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_ScheduleCheck.RMAApp_FinancialReserve_Img_ScheduleCheck(driver), "ScheduleCheck Image On Financial Reserve Page", logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is As ScheduleCheck Page Is Loaded");
	RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Btn_PayIntervalLookUp(driver), "PayInterval LookUp Button On ScheduleCheck Page", logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect(PayInterval, "Code Selection Window", logval);
	driver.switchTo().window(StrRMAWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financials/Reserves");
	RMA_Input_Utility.RMA_JavaScriptSetValue_Utility(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_NumberOfPayments(driver), "# Of Payments Text Box On ScheduleCheck Page", String.valueOf(NumberOfPayment), logval);
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Lst_BankAccount(driver), BankAccount, "BankAccount", "ScheduleCheck Page", logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Btn_DistributionTypeCodeLookUp(driver), "Distribution Type Code Look Up Button On ScheduleCheck Page",logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); 
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DistributionType, "Distribution Type Link On Distribution Selection Window", logval);
	driver.switchTo().window(StrRMAWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financials/Reserves");	

	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Lst_PayeeType(driver), PayeeType, "PayeeType", "ScheduleCheck Page", logval);

	int WindowCount = driver.getWindowHandles().size();	
	if(!"C-Claimant".equalsIgnoreCase(PayeeType.trim())){// if claimant in not selected in the payee list
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_LastName(driver), "LastName TextBox On ScheduleCheck Page", LastName, logval);
		if(driver.getWindowHandles().size()>WindowCount){// If user want to add new Payee
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to Add New window
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Btn_AddNew(driver), "Add New Button On Quick Lookup Result Page",logval);
			RMA_GenericUsages_Utility.RMA_WaitForDriverToClose(driver);
			driver.switchTo().window(StrRMAWindowHandle); // A Switch Back To The Parent Window Is Done
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Lst_PeopleType(driver),"Other People", "Type Of People List Box", "Maintenance-->People Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "Last Name TextBox On Maintenance-->People Page", LastName, logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On People Maintenance Page", logval);
			RMA_GenericUsages_Utility.RMA_WaitForDriverToClose(driver);
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financials/Reserves");
		}
	}

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Tab_DetailedInformation(driver), "Detailed Information Tab On ScheduleCheck Page", logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Detailed Information Tab Is Clicked");
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Img_PaymentGridNew(driver), "New Image For Transaction On ScheculeCheck Pag", logval);
	//RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is As Payment Detail Entry Window Is Loaded");
	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type TextBox On Payment Detail Window", TransactionType,logval);	
	RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Transaction Type Is Set");
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On  Payment Detail Window", String.valueOf(Amount),logval);	

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Btn_OK(driver), "OK Button On Payment Detail Window",logval);// OK Button Is Clicked  On Payment Detail Window
	RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As OK Button On Payment Detail Window Is Clicked");
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("cphMainBody_uwtPortal_frame0");
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financials/Reserves");
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On ScheduleCheck Page", logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As ScheduleCheck Page IS Saved");
	RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
	RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Tbl_PaymentInformationGrid(driver), 0, NumberOfPayment+2, true, false, "PaymentInformation Table On ScheduleCheck Page" , logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Tab_ScheduleCheck(driver), "ScheduleCheck Tab On ScheduleCheck Page", logval);
	ReturnValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_ControlNumber(driver), "value");

	if(logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "ScheduleCheck Is Created Successfully With Auto Control Number:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,2));
	}
	else
	{
		logger.log(LogStatus.PASS, "ScheduleCheck Is Created Successfully With Auto Control Number:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,2));
	}

	}catch (Exception|Error e)
	{
		throw (e);

	}
	return ReturnValue;
}

//====================================================================================================================================================================================
//FunctionName 		: RMA_GenericSave_Utility
//Description  		: Enables The User To Save Any Added Value Like Claim, Entities Such As Employee And So On  
//Input Parameter 	: VerifyErrorMessage: Pass true(When Want To Match Error Message While Saving) or false(When Not Want to Match Error Message While Saving),
//					:ExpectedErrorMessage: Pass The Error Message Separated by '~' When More Than One
//					:CurrentFrame: is the frame where currently working,ObjPageDesc Stores Control And Page Description, 
//					: logval: Is The Integer Value Of The Logger Statement Variable
//Revision			: 0.0 - RenuVerma-07-08-2016                               
//========================================================================================================================================================================================
public static void RMA_GenericSave_Utility(String currentFrame, boolean VerifyErrorMessage ,String ExpectedErrorMessage, String ObjPageDesc, int logval) throws Exception, Error
{
	try {		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On "+ ObjPageDesc, logval);// Click On Save Button
	driver.switchTo().parentFrame();
	//Assert.assertTrue(RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Partial", "Not all required fields contain the value", "Not all required fields contain the value. Please enter the data into all underlined fields." + " "+ ObjPageDesc, logval));
	globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='pleaseWaitFrame']/img")));// Wait For Load Image To Be Disappear
	System.out.println("kumud");
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(currentFrame);
	RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(VerifyErrorMessage, ExpectedErrorMessage, logval);
	if(VerifyErrorMessage==false){
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility(ObjPageDesc , logval);// Verify Reload Image Click Not Shown Any Alert Pop-up For UnSaved Data
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(currentFrame);
		}
	} 
	catch (Exception|Error e) {
		throw (e);
	}		

}

//==========================================================================================================================================================================
//FunctionName 		: RMA_AddNewCollection_Utility
//Description  		: Enables The User To Add Collection 
//Input Parameter 	: Driver Of The Type Driver, BnkAccnt, PayorType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer	 
//Revision			: 0.0 - ImteyazAhmad-07-15-2016       
//Modified By		: 0.0 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info     
// ============================================================================================================================================================================
public static String RMA_AddNewCollection_Utility(String BankAccnt,String PayorType, String TransType, int Amount, String LastName, String DisType, int logval) throws Exception, Error
{
	try {

		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO, "User Makes A New Collection");	
		}
		else
		{
			logger = reports.startTest("<span id='AddCollection'>Add New Collection</span> ", "User Makes A New Collection");
		}
	String StrPrimaryWindowHandle;
	//String StrSecPrimaryWindowHandle;
	//Local Variable Declaration			

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Img_AddCollection(driver), "Add Collection Image On Financial Reserve Page",logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Transaction Page Is Loaded");
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_BankAccount(driver), BankAccnt, "Bank Account Drop Down List", "Transaction Page",logval);
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_PayeeType(driver), PayorType, "Payee Type Drop Down List", "Transaction Page",logval);

	int WindowCount = driver.getWindowHandles().size();	
	if(!"C-Claimant".equals(PayorType.trim())){
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_LastName(driver), "Last Name Text Box On Transaction Page", LastName,logval);
		if(driver.getWindowHandles().size()>WindowCount){// If user want to add new Payee
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to Add New window
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Btn_AddNew(driver), "Add New Button On Quick Lookup Result Page",logval);
			RMA_GenericUsages_Utility.RMA_WaitForDriverToClose(driver);
			driver.switchTo().window(StrRMAWindowHandle); // A Switch Back To The Parent Window Is Done
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Lst_PeopleType(driver),"Other People", "Type Of People List Box", "Maintenance-->People Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "Last Name TextBox On Maintenance-->People Page", LastName, logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On People Maintenance Page", logval);
			RMA_GenericUsages_Utility.RMA_WaitForDriverToClose(driver);
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financials/Reserves");
		}
	}
	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Btn_DistributionTypeCodeLookUp(driver), "Distribution Type Code Look Up Button On Transaction Page",logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Distribution Type Link Is Done
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, "Distribution Type Link On Distribution Selection Window", logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("cphMainBody_uwtPortal_frame0"); //A Switch To The Frame Containing RMA Application Menu Option Is Done
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Tab_TransactionDetail(driver), "Transaction Details Tab On On Transaction Page",logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Btn_AddNewPayment(driver)));
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Btn_AddNewPayment(driver), "Add Payment Button On Transaction Page",logval);
	//Add New Button Is Clicked And Funds Split Details View Is Opened

	StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Fund Splits Details Is Done
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver)));
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "TransactionType Text Box On Funds Details Window On Transaction Page", TransType,logval);	
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver)));
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Transaction Page", String.valueOf(Amount),logval);	
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Btn_OK(driver), "OK Button On Funds Details Window On Transaction Page",logval);// OK Button Is Clicked  On Funds Details Window On Transaction Page
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As A Switch To The Window Containing Transaction Page Is Done");
	// Payment Is Added And Funds Split Details View Is Closed
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Btn_Save(driver), "Save Image On Transaction Page",logval);// Save Button Is Clicked On Transaction Page
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Transaction Page Is Saved");
	//Save Image Is Clicked To Save The Transaction

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Tab_Transaction(driver), "Transaction Tab On Transaction Page",logval);// Transaction Tab On Transaction Page Is Clicked
	ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
	String StrlogControlNumber = color.RMA_ChangeColor_Utility(ReturnValue, 2);
	if (logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "Collection Is Done Succesfully And The Generated Control Number Is" + " " + ":"+ " " + StrlogControlNumber);
	}
	else
	{
		logger.log(LogStatus.PASS, "Collection Is Done Succesfully And The Generated Control Number Is" + " " + ":"+ " " + StrlogControlNumber);
	}
	return ReturnValue;

	} catch (Exception|Error e) {
		throw (e);
	}
}

//===============================================================================================================================================================================================================================
//FunctionName 		: RMA_AttachCreateEdit_Diary
//Description  		: Enables The User To Attach, Create And Edit The Diary
//Input Parameter 	: 	Case: Create/Attach/Edit The Diary, Activity: Activity list information ,AutoNotCompStatus: check/uncheck, AutoNotLateStatus: check/uncheck, DueDate: Due date of diary, logval 
//Revision			: 0.0 - ImteyazAhmad-07-26-2016    
//Modified By		: 0.1 - RenuVerma-02-21-2017 Modified as Diary Creation from Diary list Screen and Diary Attachment on Claim/Payment/Collection Done based on Users' Choices
//					: 0.2 - RenuVerma-02-23-2017 Modified as Edit Of Diary Cases is included	
// =================================================================================================================================================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If No Valid Value Is Present


public static String RMA_AttachCreateEdit_Diary(String Case, String DiaryNote,String Activity, String AutoNotCompStatus,String AutoNotLateStatus, String DueDate, int logval) throws Exception,Error
{
	try
	{
		EntName=null;
		String TaskName;
		String StrPrimaryWindowHandle;
		String StrSecondryWindowHandle;
		String CurrentFrameId;
		switch (Case){
		case "Attach":		// Attach the Diary on Claim/Payment/Collection Screen
		DueDate=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
		StrPrimaryWindowHandle = driver.getWindowHandle();
		CurrentFrameId=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		//driver.manage().window().maximize();
		StrSecondryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Btn_WorkActivitiesLookup(driver), "WorkActivities Lookup Button On Attach Diary Page", logval);
		driver.switchTo().window(StrPrimaryWindowHandle);
		Thread.sleep(10000);
		RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrPrimaryWindowHandle, StrSecondryWindowHandle, "No Required", "No Required", "No Required", "Create Diary Window", logval);
		//driver.manage().window().maximize();
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Lst_Activity(driver),Activity, "Activity Drop Down ", "Create Diary Page",logval);
		//RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_Activity(driver), "Activity Text Box On Create Diary Page", Activity, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Btn_Ok(driver), "Ok Button On Create Diary Page", logval);
		globalWait.until(ExpectedConditions.numberOfWindowsToBe(2));
		driver.switchTo().window(StrSecondryWindowHandle);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_DueDate(driver), "Due Date TextBox On Create Diary Page", DueDate, logval);
		EntName = RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_TaskName(driver).getAttribute("value");
		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Task Name On AttachDiary Page", "AttachDiary")));
		}
		else
		{
			logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Task Name On AttachDiary Page", "AttachDiary")));	
		}
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Attach Diary Page", logval);
		globalWait.until(ExpectedConditions.numberOfWindowsToBe(1));
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameId);
		break;

	case "Create": // Create the Diary From Diary List Page				
		TaskName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Diary");
		CurrentFrameId=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_TaskName(driver), "Task Name TextBox On Create Diary Page", TaskName, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_Notes(driver), "Diary Note Text Box On Create Diary Page", DiaryNote, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Btn_WorkActivitiesLookup(driver), "WorkActivities Lookup Button On Create Diary Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Lst_Activity(driver), Activity, "Activity Drop Down ", "Create Diary Page",logval);
		//	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_Activity(driver), "Activity Text Box On Create Diary Page", Activity, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Btn_Ok(driver), "Ok Button On Create Diary Page", logval);
		driver.switchTo().window(StrRMAWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameId);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Chk_AutoNotificationCompleted(driver), AutoNotCompStatus, "Automatic Notification When Completed CheckBox", "Create Diary Page", logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Chk_AutoNotificationLate(driver), AutoNotLateStatus, "Automatic Notification When Late CheckBox", "Create Diary Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_DueDate(driver), "Due Date TextBox On Create Diary Page", DueDate, logval);
		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Test Data On Create Diary Page", "CreateDiary")));
		}
		else
		{
			logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Test Data On Create Diary Page", "CreateDiary")));	
		}
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Create Diary Page", logval);
		RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_ErrorMessage_Heading(driver), "Error Message On Create Diary Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Create(driver)));
		EntName=TaskName;
		break;

	case "Edit": // Edit the Diary From Diary List Page
		TaskName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "EditDiary");
		CurrentFrameId=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_TaskName(driver), "Task Name TextBox On Edit Diary Page", TaskName, logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Chk_AutoNotificationCompleted(driver), AutoNotCompStatus, "Automatic Notification When Completed", "Edit Diary Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_DueDate(driver), "Due Date TextBox On Edit Diary Page", DueDate, logval);
		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Test Data On Edit Diary Page", "EditDiary")));
		}
		else
		{
			logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Test Data On Edit Diary Page", "EditDiary")));	
		}
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Edit Diary Page", logval);
		RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_ErrorMessage_Heading(driver), "Error Message On Edit Diary Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Edit(driver)));
		EntName=TaskName;
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
	}catch (Exception|Error e)
	{
		throw(e);
	}
	return EntName;
}

//=========================================================================================================================================================================================================================================================================================================================================================================================================================
//FunctionName 		: RMA_EnhancedNotesCreate,Edit,Delete_Utility
//Description  		: Enables The User To Create,Edit And Delete Enhanced Notes
//Input Parameter 	: Case Variable To Indicate User Action (Create, Edit, Delete For Enhanced Notes), logval: To Indicate The Value Of The Logger To Be Used (Parent Or Child Logger), Edit Of Type Boolean To Indicate Whether Created Notes Need To Be Edited Or Not
//					: Note Type: Type Of The Note, ExpNoteType: Full Note Type That Appears In The Claim Grid, SearchedNoteText: Text That Is Validated In The UX Grid, ClaimNumber: Claim With Which The Enhanced Notes Is Associated
//Revision			: 0.0-KumudNaithani-07-28-2016 
//Modified By       : 0.0-KumudNaithani-03-07-2017 Replaced Edit Case With If Else Logic For The Same As Enhanced Notes Edit Will Always Be Preceded By Its Creation, Table Verification Added In Case Of Delete
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ======================================================================================================================================================================================================================================================================================================================================================================================================================================
public static String RMA_EnhancedNotesCreateEditDelete_Utility(String Case, String NoteType, String ExpNoteType, String ClaimNumber, String SearchedNoteText, boolean Edit,int logval) throws Exception, Error
{
	String StrMsg;
	String Strlogstatement;
	try{

		ReturnValue = null ;

		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO, "Verify User Can"+ " "+ Case + " " +"Enhanced Notes Successfully");	
		}
		else
		{
			logger = reports.startTest("<span id='EnhancedNotesCreateEditDelete'>Enhanced Notes" + " " + Case+"</span>", "Verify User Can"+ " "+ Case +"  " +"Enhanced Notes Successfully");	
		}

	switch (Case){
	case "Create/Edit":
		ReturnValue = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Note_");
		driver.manage().window().maximize();
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_CreateNotes(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_CreateNotes(driver), "Create Note Button On Progress Notes Page", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_NotesLookUp(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_NotesLookUp(driver), "Notes Type Look Up Button On Progress Notes Creation/Edit Page", logval); // Id Is Same For All LOB
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Notes Type Selection Window Is Opened");
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(NoteType, "Notes Type LookUp Window", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Notes Type Value Is Selected From Notes Type Selection Window");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_TxtArea_ProgressNotes(driver), "Progress Notes Text Area On Progress Notes Creation/Edit Page", logval);

		RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_TxtArea_ProgressNotes(driver), "Progress Notes Text Area On Progress Notes Creation/Edit Page", ReturnValue, logval);

		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Save(driver), "Save Notes Button On Progress Notes Creation/Edit Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added After Enhanced Notes Are Saved");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_BackToNotes(driver), "Back To Notes Button On Progress Notes Creation/Edit Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Back To Notes Button On Progress Notes Creation/Edit Page");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_UXGrid_FilterTextBox(driver, 5), "Note Text Filter Text Box On Progress Notes UX Grid", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_UXGrid_FilterTextBox(driver, 5), "Note Text Filter Text Box On Progress Notes UX Grid", ReturnValue, logval);

		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Search Text Is Entered In Note Text Filter Text Box In UX Grid");
		RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(ExpNoteType, "EnhancedNotesUXGrid", ReturnValue, 5, ClaimNumber, 8, logval);

		if (Edit==true)
		{
			//driver.manage().window().maximize();
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_EditNote(driver)));
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_UXGrid_FilterTextBox(driver, 4), "Note Text Filter Text Box On Progress Notes UX Grid", logval);
			//RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_UXGrid_FilterTextBox(driver, 5), "Note Text Filter Text Box On Progress Notes UX Grid", SearchedNoteText, logval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Search Text Is Entered In Note Text Filter Text Box In UX Grid");
			ReturnValue = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Note_");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_UXGrid_ArrowSelector(driver, 2), "Tick Mark Row Selector Image On Progress Notes Page", logval);


			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_EditNote(driver), "Edit Note Button On Progress Notes Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_NotesLookUp(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_NotesLookUp(driver), "Notes Type Look Up Button On Progress Notes Creation/Edit Page", logval); // Id Is Same For All LOB
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Notes Type Selection Window Is Opened");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(NoteType, "Notes Type LookUp Window", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Notes Type Value Is Selected From Notes Type Selection Window");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_TxtArea_ProgressNotes(driver), "Progress Notes Text Area On Progress Notes Creation/Edit Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_TxtArea_ProgressNotes(driver), "Progress Notes Text Area On Progress Notes Creation/Edit Page", ReturnValue, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Save(driver), "Save Notes Button On Progress Notes Creation/Edit Page", logval);

			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added After Enahnced Notes Are Saved");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_BackToNotes(driver), "Back To Notes Button On Progress Notes Creation/Edit Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Back To Notes Button On Progress Notes Creation/Edit Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_UXGrid_FilterTextBox(driver, 5), "Note Text Filter Text Box On Progress Notes UX Grid", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_UXGrid_FilterTextBox(driver, 5), "Note Text Filter Text Box On Progress Notes UX Grid", ReturnValue, logval);

			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Search Text Is Entered In Note Text Filter Text Box In UX Grid");
			RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(ExpNoteType, "EnhancedNotesUXGrid", ReturnValue, 5, ClaimNumber, 8, logval);
		}
		break;

	case "Delete":
		//driver.manage().window().maximize();
		//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_DeleteNote(driver)));
		//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_UXGrid_FilterTextBox(driver, 5), "Note Text Filter Text Box On Progress Notes UX Grid", logval);
		//RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_UXGrid_FilterTextBox(driver, 5), "Note Text Filter Text Box On Progress Notes UX Grid", SearchedNoteText, logval);
		//RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Search Text Is Entered In Note Text Filter Text Box In UX Grid");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_UXGrid_ArrowSelector(driver, 2), "Tick Mark Row Selector Image On Progress Notes Page", logval);


		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_DeleteNote(driver), "Delete Note Button On Progress Notes Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Delete Note On Progress Notes Page Is Clicked");
		StrMsg = RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotesAlert_Msg(driver).getText();
		RMA_Verification_Utility.RMA_TextCompare("Are you sure you want to delete?", StrMsg, "Alert Message On Progress Notes Delete Confirmation Alert Window", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotesAlert_Button_Cancel(driver), "Cancel Button On Progress Notes Delete Confirmation Alert Window ", logval); // Id Is Same For All LOB


		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_DeleteNote(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_DeleteNote(driver), "Delete Note Button On Progress Notes Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotesAlert_Button_Delete(driver), "Delete Button On Progress Notes Delete Confirmation Message ", logval); // Id Is Same For All LOB
		//StrMsg = RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Msg_TextMessage(driver).getText();
		//RMA_Verification_Utility.RMA_TextCompare("Note deleted Successfully.", StrMsg, "Successful Progress Notes Deletion Message On Progress Notes Page", logval);

		if (RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Txt_NoRecordsAvailable(driver).isDisplayed() )
		{
			Strlogstatement  = "Enhanced Notes With Text" + " " + color.RMA_ChangeColor_Utility(SearchedNoteText, 2) + " " + "Does Not Exist In Enhanced Notes UXGrid On Enhanced Notes Primary Page";
			if (logval == 0)
			{
				parentlogger.log(LogStatus.PASS, Strlogstatement);
			}
			else
				logger.log(LogStatus.PASS, Strlogstatement);	
		}
		else{
			RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(SearchedNoteText, "Enhanced Notes UXGrid On Enhanced Notes Primary Page", logval);
		}

		String StrScreenShotTCName = "Progress Notes Delete Function";
		ReturnValue = SearchedNoteText;
		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Delete Of Created Progress Notes", StrScreenShotTCName)));
		}

		else
		{
			logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Delete Of Created Progress Notes", StrScreenShotTCName)));
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

	return ReturnValue;
	}catch (Exception|Error e) {
		throw (e);
	}
}

//===========================================================================================================================================================================================
//FunctionName 		: RMA_Comments_Utility
//Description  		: Enables The User To Create A Comments Note
//Input Parameter 	: PageFrame: Frame Text Of Current Page From Which Comments Window Is Launched,logval: To Indicate The Value Of The Logger To Be Used (Parent Or Child Logger), 
//Revision			: 0.0 - ImteyazAhmad-08-01-2016     
//Modified By		: 0.1 - RenuVerma-02-02-2017 Modified as Comment screen is changed into the UX screen
// ==============================================================================================================================================================================================
public static String RMA_Comments_Utility(String PageFrame, int logval) throws Exception, Error
{
	String StrCommentsText;
	try
	{
	StrCommentsText = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Comments Text_");
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	driver.manage().window().maximize();
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_POM_Comments.RMAApp_Comments_Btn_Close(driver)));
	Thread.sleep(4000);
	RMA_Input_Utility.RMA_ActionSendKeys_Utility(StrCommentsText, "TextEditor On Comments Page", logval);
	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "TextEditor On Comments Page", "Comments")));
	}
	else
	{
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "TextEditor On Comments Page", "Comments")));	
	}
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Comments.RMAApp_Comments_Btn_Save(driver), "Save Button On Comments Page", logval);
	//RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Comment Is Getting Saved");
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Comments.RMAApp_Comments_Btn_Close(driver), "Close Button On Comments Page", logval);
		globalWait.until(ExpectedConditions.numberOfWindowsToBe(1));
		driver.switchTo().window(StrRMAWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(PageFrame);		

	}catch (Exception|Error e)
	{
		throw(e);
	}
	return StrCommentsText;
}

//======================================================================================================================================================================================================================================================
//FunctionName 		: RMA_SendMail_Utility()
//Description  		: Enables The User To Send Mail 
//Input Parameter 	: logval: To Indicate The Value Of The Logger To Be Used (Parent Or Child Logger), ToEmailID - Recipient Email ID, CCEmailID - Copy To Email ID, MailBody, Description Of The Page Where Send Mail Functionality Is To Be Tested
//Revision			: 0.0 - KumudNaithani-08-02-2016   
//Modified By		: 0.0 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ==========================================================================================================================================================================================================================================================
public static void RMA_SendMail_Utility(String ToEmailID, String CCEmailID, String MailBody, String ObjDesc, int logval) throws Exception, Error
{
String StrAccept;
//Local Variable Declaration

try{

	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO,"Verify That Mail Is Sent Successfully From " + " "+ ObjDesc);	
	}
	else
	{
		logger = reports.startTest("<span id='SendMail'>Send Mail Functionality</span>", "Verify That Mail Is Sent Successfully From " + " "+ ObjDesc);
	}


	StrAccept = "Yes";
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SendMail.RMAApp_SendMail_Txt_To(driver), "To TextBox On Send Mail Page",ToEmailID,logval);	
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SendMail.RMAApp_SendMail_Txt_CC(driver), "CC TextBox On Send Mail Page",CCEmailID,logval);	
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SendMail.RMAApp_SendMail_Txt_Body(driver), "Body TextBox On Send Mail Page",MailBody,logval);	
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SendMail.RMAApp_SendMail_Btn_Send(driver), "Send Button On Send Mail Page",logval);
	RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility(StrAccept, "Complete", "Email Sent Successfully", "Successful Email Send Verification", logval);
	}catch (Exception|Error e) {
		throw (e);
	}
}

//====================================================================================================
//FunctionName 		: RMA_DiaryRecordsCheck_Utility
//Description  		: Correct Diary Records Are Displayed Is Validated
//Input Parameter 	: logval: To Indicate The Value Of The Logger To Be Used (Parent Or Child Logger)
//Revision			: 0.0 - KumudNaithani-08-08-2016                               
// ====================================================================================================
public static void RMA_DiaryRecordsCheck_Utility(String SearchedText,int Col1,int Col2, int Col3, String ExpectedVal1,String ExpectedVal2,String ExpectedVal3,String ExpectedVal4, String ExpectedVal5,boolean ThirdVerify, int logval) throws Exception, Error
{
	try{
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("DiarieszDiaryListDiaryListDiary ListUI/Diaries/Diary ListFalse"); 

	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_GridColumnSelector(driver)));
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_GridColumnSelector(driver), "Column Selector For Diary List UX Grid On Diary List Page", logval);

	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Priority")));
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Priority"), "Priority Column Selector Button For Diary List UX Grid On Diary List Page", logval);

	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Due")));
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Due"), "Due Column Selector Button For Diary List UX Grid On Diary List Page", logval);

	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Work Activity")));
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Work Activity"), "Work Activity Column Selector Button For Diary List UX Grid On Diary List Page", logval);

	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Rollable")));
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Rollable"), "Rollable Column Selector Button For Diary List UX Grid On Diary List Page", logval);

	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Routable")));
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Routable"), "Routable Column Selector Button For Diary List UX Grid On Diary List Page", logval);

	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Assigned User")));
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Assigned User"), "Assigned User Column Selector Button For Diary List UX Grid On Diary List Page", logval);

	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Assigning User")));
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Assigning User"), "Assigning User Column Selector Button For Diary List UX Grid On Diary List Page", logval);

	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Claimant")));
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_ColToDisplay(driver,"Claimant"), "Claimant Column Selector Button For Diary List UX Grid On Diary List Page", logval);

	RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(SearchedText, "Diary UX Grid", ExpectedVal1, Col1, ExpectedVal2, Col1, logval);
	RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(SearchedText, "Diary UX Grid", ExpectedVal3, Col2, logval);

	if (ThirdVerify == true)
	{
		RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(SearchedText, "Diary UX Grid", ExpectedVal4, Col3, ExpectedVal5, Col3, logval);
		}

	}catch (Exception|Error e) {
		throw (e);
	}
}

//===================================================================================================================================================================================================================================================================================================================================
//FunctionName 		: RMA_GridRecordsFilter_Utility
//Description  		: UX Grid Records Are Filtered On Provided Criteria Basis 
//Input Parameter 	: Element, Element1: Web Element On Which Text Is To Be Entered, Web Element To Be Clicked For Search To Take Place, SearchedText: Text To Be Searched, ObjDesc,ObjDessc2: Description For WebElement1 and WebElemnet, logval: To Indicate The Value Of The Logger To Be Used (Parent Or Child Logger)
//Revision			: 0.0 - KumudNaithani-08-08-2016 
//Revision			: 0.1 - KumudNaithani-18-10-2016 , Modified As Earlier This Function Was For NG Grid Now For UX Screens
//					
// ================================================================================================================================================================================================================================================================================================================================
public static void RMA_GridRecordsFilter_Utility(WebElement Element, String ObjDesc, String SearchedText, String ObjDessc2, WebElement Element1, int logval) throws Exception, Error
{
	try{
		RMA_Input_Utility.RMA_SetValue_Utility(Element, ObjDesc, SearchedText, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(Element1, ObjDessc2, logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As" + " "+ ObjDessc2+ " "+ "Is Clicked");
	}

	catch (Exception|Error e) {
		throw (e);
	}
}
//====================================================================================================================================================================================================================================================================================
//FunctionName 		: RMA_WorkersCompClaimCreation_ACON
//Description  		: Enables Users To Create Workers Comp Claim For Carrier Claim
//Input Parameter 	: Input Parameters Are :ClaimType, EmployeeNumber, Department, Dateofevent, TimeofEvent, Dateofclaim, Timeofclaim, Jurisdiction, LOB,logval
// 					  YesNoChoiceSaveInMethod: It ensured that either want to save claim in the method or not.
//Revision			: 0.0- RenuVerma-08-12-2016  
//========================================================================================================================================================================================================================================================================================

public static String RMA_WorkersCompClaimCreation_ACON(String ClaimType, int EmployeeNumber, String Department, Date Dateofevent, int TimeofEvent, Date Dateofclaim, int Timeofclaim, String Jurisdiction, String LOB,boolean Parameter,int logval) throws Exception,Error
{
	String StrWorkersCompClaimNumber;
	String StrPrimaryWindowHandle;
	try{
	logger = reports.startTest("<span id='WorkerCompACON'> It Creates A Carrirer Workers Comp Claim</span>", "User Is Able To Create Worker's Comp Claim For Carrier Client");
	RMA_MenuOptionClick_Utility("Document-Workers’Comp.", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Workers");	
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_ClaimType(driver), "Claim Type TextBox On Workers Comp Page", ClaimType, logval);
	Thread.sleep(5000);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_DateOfEvent(driver), "Date Of Event TextBox On Workers Comp Page", new SimpleDateFormat("MM-dd-yyyy").format(Dateofevent), logval);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_EmployeeNumber(driver), "Employee No TextBox On Workers Comp Page", String.valueOf(EmployeeNumber), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Workers Comp Page", String.valueOf(TimeofEvent), logval);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_codelookup_policyLOBCode(driver), "LOB TextBox On Workers Comp Page", LOB, logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Workers Comp Page", new SimpleDateFormat("MM-dd-yyyy").format(Dateofevent), logval);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_DepartmentID(driver), "Department TextBox On Workers Comp Page", Department, logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Workers Comp Page", String.valueOf(Timeofclaim), logval);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_Jurisdiction(driver), "Jurisdiction TextBox On Workers Comp Page", Jurisdiction, logval);
	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Btn_ClaimStatus(driver), "ClaimStatus Button On Workers Comp Page", logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Code Selection Window",logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Workers");
	RMA_GenericSave_Utility("Workers", false, "NA", "Workers Comp Page", logval);
	StrWorkersCompClaimNumber = RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrWorkersCompClaimNumber
	logger.log(LogStatus.INFO, "Workers Comp Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrWorkersCompClaimNumber, 2));
	logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Workers Comp Saved Successfully", "Workers Comp Claim Creation")));
	driver.switchTo().parentFrame();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Workers"), "Expand Image Corresponding To Workers Comp Link On Left Navigation Tree", logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Expand Image Corresponding To Workers Comp Link On Left Navigation Tree Is Clicked ");

}catch(Exception|Error e)
{
	//System.out.println("Error Message Is :" +" " +e.getMessage());
		throw (e);
	}		
	return StrWorkersCompClaimNumber;		
}	

// ==============================================================================================================================================================================================================================================
// FunctionName : RMA_GeneralClaimCreation_ACON
// Description 	: Enables Users To Create GeneralClaim For Carrier Client.
// Input Parameter : Input Parameters Are :ClaimType, EmployeeNumber, Department, Dateofevent, TimeofEvent, Dateofclaim, Timeofclaim, Jurisdiction, LOB, logval
// 					 AdditionalParameter: Few Parameter which May Compulsory In Future
// Revision 		: 0.0- RenuVerma-08-12-2016
// ======================================================================================================================================================================================================================================
public static String RMA_GeneralClaimCreation_ACON(String ClaimType, String Department,	Date Dateofevent, int TimeofEvent,Date Dateofclaim, int Timeofclaim, String LOB, boolean AdditionalParameter,int logval) throws Exception, Error {
	String StrGeneralClaimNumber;
	String StrPrimaryWindowHandle;
	try
	{
	logger = reports.startTest("<span id='GCClaimACON'>General Claim Creation For Carrier Client</span>", "User Is Able To Create General Claim For Carrier Client");

	RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-GeneralClaim", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimgc");
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimType(driver), "Claim Type TextBox On General Claim Creation Page", ClaimType,logval);
	Thread.sleep(5000);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_TimeOfEvent(driver), "TimeOfEvent TextBox On General Claim Creation Page", String.valueOf(TimeofEvent),logval);		
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_DateOfClaim(driver), "DateOfClaim TextBox On GeneralClaim Creation Page",  new SimpleDateFormat("MM-dd-yyyy").format(Dateofclaim),logval);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_codelookup_policyLOBCode(driver), "LOB TextBox On General Claim Creation Page", LOB, logval);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_Dept_Id(driver), "DeptId TextBox On General Claim Creation Page", Department,logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_TimeOfClaim(driver), "TimeOfClaim TextBox On GeneralClaim Creation Page", String.valueOf(Timeofclaim),logval);	
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_DateOfEvent(driver), "DateOfEvent TextBox On General Claim Creation Page",  new SimpleDateFormat("MM-dd-yyyy").format(Dateofevent),logval);	

	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Img_ClaimStatusSrchBtn(driver), "Claim Status Search Button On RMA Application General Claim Creation Page",logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Code Selection Window",logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimgc");
	RMA_Functionality_Utility.RMA_GenericSave_Utility("claimgc", false, "NA", "General Claim Creation Page", logval);
	StrGeneralClaimNumber = RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrClaimNumber
	logger.log(LogStatus.INFO, "General Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrGeneralClaimNumber, 2));
	logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "General Claim Saved Successfully", "General Claim Creation")));
	driver.switchTo().parentFrame(); //A Switch To The Parent Frame That Contains Menu Options And Left Hand Navigation Tree Is Done
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrGeneralClaimNumber), "Expand Image Corresponding To General Claim Link On Left Navigation Tree", logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Expand Image Corresponding To General Claim Link On Left Navigation Tree Is Clicked ");
} catch (Exception | Error e) {
	// System.out.println("Error Message Is :" +" " +e.getMessage());
		throw (e);
	}
	return StrGeneralClaimNumber;
}		

//============================================================================================================================
//FunctionName 		: RMA_PolicyDownload_Utility
//Description  		: Policy Download Function For Claim And Maintenance Screen Both
//Input Parameter 	: SystemName, DOL, LOB, PolicyNo, FilterBox_Text: Separated By ':' , FrameText, ObjDesc, logval 
//					  Str_Claimant: Do you want to add policy insured as claimant( Yes/No/NA )
//Revision			: 0.0 - RenuVerma-08-11-2016    
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ==============================================================================================================================
public static String RMA_PolicyDownload_Utility(String SystemName,Date DOL, String LOB,String PolicyNo, String FilterBox_Text,String FrameText,String Str_Claimant,String ObjDesc,int logval) throws Exception, Error
{
	String PolicyName_AfterSave;
	String[] typeOfFilterBox_Text=FilterBox_Text.split(":"); // Split The The Filter Box and Filter Text As Per the Given Input Parameter
	String FilterBox=typeOfFilterBox_Text[0];// Filter Box Value
	String FilterText=typeOfFilterBox_Text[1];// Filter Text Value
	String StrPrimaryWindowHandle;
	String windowFormTitle;
	String PolicyName;
	boolean flagOnMaintence=false;

try{
	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, "User Is Able To Download A Policy");
	}
	else
	{	
		logger = reports.startTest("<span id='PolicyDown'>Download policy</span>", "A Policy Is Downloaded");
	}	
	StrPrimaryWindowHandle = driver.getWindowHandle();
	// Find Policy Download Is Either From Maintenance screen or From Claim Screen
	if(driver.getWindowHandles().size()==1){ //When Policy Download Is From Maintenance screen
		flagOnMaintence=true;
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_List_SystemName(driver), SystemName, "System Name Drop Down List", "Policy System Download Search Page", logval);// Select the Policy System Name
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Txt_LOB(driver), "Policy LOB TextBox On Policy System Download Search Page", LOB, logval);// Select Policy LOB
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Txt_LossDate(driver), "Date Of Loss TextBox On Policy System Download Search Page", new SimpleDateFormat("MM-dd-yyyy").format(DOL), logval);// Select DOL
	}
	else{ //When Policy Download Is From Claim screen
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();// Switch To Policy Screen From the Claim Screen
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_List_SystemName(driver), SystemName, "System Name Drop Down List", "Policy System Download Search Page", logval);// Select the Policy System Name
	}					
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Txt_PolicyNumber(driver), "Policy Number Text Box On Policy System Download Search Page", PolicyNo, logval);// Enter The Policy No
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Btn_Submit(driver), "Submit Policy Details On Policy System Download Search Page", logval);// CLick on Submit
	RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);// Check No Error Appearing On Screen
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_FilterTextBox(driver,FilterBox)));// Wait For The Filter Box As Per the Given Input Parameter
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_FilterTextBox(driver,FilterBox),  FilterBox+ " Text On Search Result Page", FilterText, logval);// Select The Filter Box And Given Filter Text As Per the Given Input Parameter
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Btn_Filter(driver, FilterBox), FilterBox + " Filter Button Is Clicked  On Search Result Page", logval);// Click The Filter Button As Per the Given Input Parameter
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Lnk_EqualTo(driver)));// Wait Till Equal To Link Is Not Click-able
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Lnk_EqualTo(driver), "Equal To Link Is Clicked  On Search Result Page", logval);// Click On Equal To Link
	Thread.sleep(4000);// Wait 
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_CheckBox_SelectPolicy(driver),"check", "Policy Number Checkbox", "Download Policy Table",logval);// Select CheckBox On Filtered Policy
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Img_Save(driver), "Save Policy Image On Policy System Download Search Page", logval);// Click On Save Button 
	RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);// Check No Error Appearing On Screen
	if(!flagOnMaintence){
		RMA_GenericUsages_Utility.RMA_WaitForDriverToClose(driver);// Wait Till Current Window "Policy System Download Search Page" Is Closed
		driver.switchTo().window(StrPrimaryWindowHandle);// Move to Primary Window
	}
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();// Switch To New Opened Window
	windowFormTitle=RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Window_Title(driver).getText();// Get Window Title Name
	while(windowFormTitle.contains("Download Entities")||windowFormTitle.contains("Download Drivers")||windowFormTitle.contains("Download Units")||windowFormTitle.contains("Download Coverages"))// Execute Till Title Is One Of Them
	{
		boolean flag=false;
		RMA_Input_Utility.RMA_SelectAllCheckBoxes(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_CheckBox_Download_Items(driver), windowFormTitle+" Table", logval);
		//RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_CheckBox_Download_Items(driver),"check", "All Policy Items Checkboxes",  windowFormTitle+" Table",logval);// Click On Check Box To Select Policy Item From The Opened Policy Item Window
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Btn_Save_Download_Ent_Driver_Unit(driver, windowFormTitle), "Save Policy Image On "+ windowFormTitle +" Page", logval);// Click On Save To Download Policy Item From The Opened Policy Item Window
		RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);// Check No Error Appearing On Screen
		RMA_GenericUsages_Utility.RMA_WaitForDriverToClose(driver);// Wait Till Current Window "Policy Item Window" Is Closed
		if(driver.getWindowHandles().size()>1){// When More Than One Window Is Appearing On The Screen
			driver.switchTo().window(StrPrimaryWindowHandle);// Switch To Primary Window
			flag=RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Partial", "Policy Data successfully downloaded", "Message To Confirm Policy Download On" + " "+ color.RMA_ChangeColor_Utility(ObjDesc, 4), logval);// Check Pop-up Is Appearing
			if(flag){	// If PopUp Alert Not Present	
				RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();// Switch To New Opened Window
				windowFormTitle=RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Window_Title(driver).getText();// Fetch The Value Of windowFormTitle For Loop Continuation
				continue;	// Continue Loop						
			}
			else{// If PopUp Alert Present	(e.g. In Case Of General Claim)
				RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility(Str_Claimant, "Partial", "Do you want to add policy insured as claimant", "Message To Confirm Add Policy Insured As Claimant On" + " "+ color.RMA_ChangeColor_Utility(ObjDesc, 4), logval);// Confirm Yes For Addition Of Claimant
				break;// Out From The Loop
			}
		}
		else// When One Window Is Appearing On The Screen (e.g. In Case Of Workers Comp)
			driver.switchTo().window(StrPrimaryWindowHandle);// Move to Primary Window 
		break;	// Out From The Loop		
	}
	//driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(FrameText);
	PolicyName=RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_List_multipolicyid(driver).getText();
	RMA_Verification_Utility.RMA_PartialTextVerification(PolicyNo, PolicyName, "Policy Name", logval);
	if(!flagOnMaintence){
		RMA_GenericSave_Utility(FrameText, false, "NA", "Claim With Policy Details", logval);
		PolicyName_AfterSave=RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_List_multipolicyid(driver).getText();
		RMA_Verification_Utility.RMA_PartialTextVerification(PolicyNo, PolicyName_AfterSave, "Policy Name", logval);
	}
	if(logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "Policy Is Downloaded Successfuly With policy No.:" + " " + color.RMA_ChangeColor_Utility(PolicyName,2));
	}
	else
	{
		logger.log(LogStatus.PASS, "Policy Is Downloaded Successfuly With policy No.:" + " " + color.RMA_ChangeColor_Utility(PolicyName,2));
		}
	}
	catch (Exception|Error e) {
		throw (e);
	}

	return PolicyName;
}


//===============================================================================================================================================================
//FunctionName 		: RMA_ReserveAddOnInternalPol_Utility_ACON
//Description  		: Enables Users To Create Reserve For Carrier Claim With Attached Internal Policy.
//Input Parameter 	: PolicyName, Unit, Coverage, LossType 
// 					  ReserveType, ReserveAmount, Status, DateEntered, StrExpReserveStatus, ExpBalAmt,  ExpIncAmt,  ExpPaidAmt,  ExpCollecAmt, 
//					  AdditionalParameter: Few Parameter which May Compulsory In Future,  logval 	 
//Revision			: 0.0 - RenuVerma-09-19-2016  
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
//=====================================================================================================================================================================
public static void RMA_ReserveAddOnInternalPol_Utility_ACON(String PolicyName, String Unit, String Coverage, String DistributionCategory, String LossType,String ReserveType, int ReserveAmount, String Status,String DateEntered, String StrExpReserveStatus, String ExpBalAmt, String ExpIncAmt, String ExpPaidAmt, String ExpCollecAmt,boolean AdditionParameter, int logval ) throws Exception, Error
{
	try 
	{
		String ClaimType;
		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO, "A New Reserve Is Created On Carrier Claim With Attached Internal Policy");
	}
	else
	{	
		logger = reports.startTest("<span id='ReserveAddOnInternalPol'>Reserve Creation On Carrier Claim With Attached Internal Policy: "+PolicyName+"</span>", "A New Reserve Is Created On Carrier Claim With Attached Internal Policy");
	}

	ClaimType= RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lbl_HeaderCaption(driver).getText();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Img_AddNewRsv(driver), "Add New Reserve Image On Financial Reserves Page",logval);
	driver.switchTo().frame(0); //A switch To The Frame Containing Add New Reserve Window Controls Is Done
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_ReserveType(driver)));
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_PolicyName(driver),PolicyName, "Policy Name List", "Add New Reserve Page", logval);// Select Policy
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_Unit(driver),Unit, "Unit List", "Add New Reserve Page",logval);
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_CoverageType(driver),Coverage, "Coverage List", "Add New Reserve Page",logval);
	String Loss[]=LossType.split(" ");
	if(ClaimType.contains("General Claim")){	// If Claim Type is General Claim	
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_LossType(driver),Loss[0], "Loss Type List", "Add New Reserve Page",logval);
	}
	else if(ClaimType.contains("Worker")){ // If Claim Type is Workers' Compensation	
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_List_DisabilityCategory(driver),DistributionCategory, "Disability Category", "Add New Reserve Page",logval);// Select Coverage Value One by One
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_DisabilityLossType(driver), "Disability Loss Type On Add New Reserve Page",Loss[0],logval);// Select MYCODE In Loss Type
	}

	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_ReserveType(driver),ReserveType, "Reserve Type List", "Add New Reserve Page", logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver), "Reserve Amount Field On Add New Reserve Page", String.valueOf(ReserveAmount),logval);	
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_Status(driver), Status,"Status List Box","Add New Reserve Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Text_DateEntered(driver), "Date Entered On Add New Reserve Page", DateEntered, logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Is Clicked On Add New Reserve Window On Financial Reserves Page",logval);	
	//RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);// This is not used because Reserve frame is not having any ids
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Save Button Is Clicked On Reserve Creation Page Is Clicked");
	RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
	//Reserve Creation Is Completed Here
	driver.switchTo().parentFrame();
	if (RMAApp_BrowserName.equalsIgnoreCase("IE"))
	{
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
	}

	if (RMAApp_BrowserName.equalsIgnoreCase("Chrome"))
	{
		driver.switchTo().parentFrame();
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
	}
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
	//  Un-check Not Required Field From The Reserve Table
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Claimant")), "uncheck", "Claimant Column In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Reserve Sub Type")), "uncheck", "Reserve Sub Type Column In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Policy Name")), "uncheck", "Policy Name In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Unit")), "uncheck", "Unit In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Coverage Type")), "uncheck", "Coverage Type In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Loss Type")), "uncheck", "Loss Type In Column Selection List", "Reserves NG Grid Table",logval);

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);

	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Reserve Table", ReserveType,logval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid

	WebElement ActualResType = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Reserve Type");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ReserveType, "Reserve Type On Reserves NG Grid On Financial Reserves Page", ActualResType, logval);
	//Verification Of Correct Reserve Type Being Displayed On Reserves NG Grid Is Done

	WebElement ActualBalAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Balance");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpBalAmt, "Reserve Balance Amount On Reserves NG Grid On Financial Reserves Page", ActualBalAmt, logval);
	//Verification Of Correct Reserve Balance Amount Being Displayed On Reserves NG Grid Is Done

	WebElement ActualPaidAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Paid");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpPaidAmt, "Reserve Paid Amount On Reserves NG Grid On Financial Reserves Page", ActualPaidAmt, logval);
	//Verification Of Correct Reserve Paid Amount Being Displayed On Reserves NG Grid Is Done

	WebElement ActualCollecAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Collection");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpCollecAmt, "Reserve Collection Amount On Reserves NG Grid On Financial Reserves Page", ActualCollecAmt, logval);
	//Verification Of Correct Reserve Collection Amount Being Displayed On Reserves NG Grid Is Done

	WebElement ActualIncAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Incurred");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpIncAmt, "Reserve Incurred Amount On Reserves NG Grid On Financial Reserves Page", ActualIncAmt, logval);
	//Verification Of Correct Reserve Incurred Amount Being Displayed On Reserves NG Grid Is Done

	// Focus was getting lost on checking check-boxes which are not directly with in view and needs to be scrolled. Hence taken alternative logic to verify the reserve status.
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
	//  Un-check Not Required Field From The Reserve Table
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Balance")), "uncheck", "Balance Column In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Paid")), "uncheck", "Paid Column In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Collection")), "uncheck", "Collection In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Incurred")), "uncheck", "Incurred In Column Selection List", "Reserves NG Grid Table",logval);

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);

	WebElement ActualResStatus = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Status");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpReserveStatus, "Reserve Status On Reserves NG Grid On Financial Reserves Page", ActualResStatus, logval);
	//Verification Of Correct Status Being Displayed On Reserves NG Grid Is Done

	if(logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "Reserve Is Created On Carrier Claim With Attached Internal Policy Successfully With Reserve Balance Amount:" + " " + color.RMA_ChangeColor_Utility(ExpBalAmt,3));
	}
	else
	{
		logger.log(LogStatus.PASS, "Reserve Is Created On Carrier Claim With Attached Internal Policy Successfully With Reserve Balance Amount:" + " " + color.RMA_ChangeColor_Utility(ExpBalAmt,3));
	}

	}
	catch (Exception|Error e) 
	{
		throw (e);
	}

}

//==========================================================================================================================================================================================================================
//FunctionName 		: RMA_PaymentAddition_Utility_ACON
//Description  		: Enables Users To Create Payment For Carrier Client
//Input Parameter 	:  FirstAndFinalPayment, BankAccnt, PayeeType, TransType,  Amount,  LastName, DisType, PolicyName, Unit, Coverage LossType,ExpBalAmt,ExpIncAmt, String ExpPaidAmt, ExpCollecAmt, logval
//		  			   AdditionalParameter: Few Parameter which May Compulsory In Future
//Revision			: 0.0 - RenuVerma-09-22-2016      
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ============================================================================================================================================================================================================================
//Note : 
public static String RMA_PaymentAddition_Utility_ACON(String FirstAndFinalPayment,String BankAccnt,String PayeeType, String TransType, int Amount, String LastName, String DisType,String PolicyName, String Unit, String Coverage, String DistributionCategory,String LossType,String ExpBalAmt, String ExpIncAmt, String ExpPaidAmt, String ExpCollecAmt, Boolean AdditionalParameter,int logval) throws Exception, Error
{
	String StrPrimaryWindowHandle;
	ReturnValue=null;
	//Local Variable Declaration
	
try {
	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, "User Makes A New Payment On Carrier Claim");
	}
	else
	{	
		logger = reports.startTest("<span id='PaymentACON'>Payment Addition </span>", "User Makes A New Payment On Carrier Claim");
	}
	String ClaimType= RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lbl_HeaderCaption(driver).getText();			
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Financial Creation Page",logval);
	if (FirstAndFinalPayment.equalsIgnoreCase("Yes"))
	{
		RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility(FirstAndFinalPayment, "Partial", "You are about to make a First & Final Transaction", "Message To Confirm First & Final Transaction For Payment", logval);// Confirm Yes For Addition Of Claimant
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver)));
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Chk_FinalPayment(driver),"check","Final Payment","Payment Creation Page", logval);
	}
	else{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver)));
	}

	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_BankAccount(driver), BankAccnt, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",logval);
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_PayeeType(driver), PayeeType, "Payee Type Drop Down List", "Payment Creation Page",logval);
	int WindowCount = driver.getWindowHandles().size();	
	if(!"C-Claimant".equalsIgnoreCase(PayeeType.trim())){
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_LastName(driver), "Last Name Text Box On Payment Creation Page", LastName,logval);
		if(driver.getWindowHandles().size()>WindowCount){// If user want to add new Payee
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to Add New window
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Btn_AddNew(driver), "Add New Button On Quick Lookup Result Page",logval);
			driver.switchTo().window(StrRMAWindowHandle); // A Switch Back To The Parent Window Is Done
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financials/Reserves");
		}
	}

	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Btn_DistributionTypeCodeLookUp(driver), "Distribution Type Code Look Up Button On Payment Creation Page",1);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Distribution Type Link Is Done
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, " Distribution Selection Window", logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("cphMainBody_uwtPortal_frame0"); //A Switch To The Frame Containing RMA Application Menu Option Is Done
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Tab_TransactionDetail(driver), "Transaction Details Tab On On Payment Creation Page",logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Transaction Tab Is Clicked");
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Btn_AddNewPayment(driver), "Add New Payment Button On Payment Creation Page",logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Add New Payment Button Is Clicked");
	//Add New Button Is Clicked And Funds Split Details View Is Opened

	StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Fund Splits Details Is Done
	if(FirstAndFinalPayment.equalsIgnoreCase("Yes")){
		if(ClaimType.contains("General Claim")){
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_PolicyName(driver),  PolicyName,"Policy Name DropDown", "Funds Split Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_Unit(driver), Unit,"Unit DropDown",  "Funds Split Page", logval);
			String Cov[]=Coverage.split(" ");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Coverage(driver),"Coverage Type On Funds Split Page",Cov[0], logval);	
			String Loss[]=LossType.split(" ");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_LossType(driver), "Loss Type On Funds Split Page", Loss[0],logval);	
		}
		else if(ClaimType.contains("Worker")){
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_PolicyName(driver),  PolicyName,"Policy Name DropDown", "Funds Split page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_Unit(driver), Unit,"Unit DropDown",  "Funds Split Page", logval);
			String Cov[]=Coverage.split(" ");// Description is "COVE Comprehensive Personal Liability 885120 Principal Op 35-44 Multi-Car, Std Perform" required only '0'th index value for Code
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Coverage(driver),"Coverage Type On Funds Split Page",Cov[0], logval);	
			String DisCat[]=DistributionCategory.split(" ");//// Description is "CODE Description" required only '0'th index value for Code
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_DisabilityCategory(driver), "Loss Type On Funds Split Page", DisCat[0],logval);	
			String Loss[]=LossType.split(" ");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_DisabilityLossType(driver), "Loss Type On Funds Split Page", Loss[0],logval);	

		}
	}

	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type On Funds Split Page", TransType,logval);	
	globalWait.until(ExpectedConditions.attributeToBeNotEmpty(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_ReserveType(driver),"value"));
	String ReserveType=RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_ReserveType(driver).getAttribute("value");
	// Payment Is Added And Funds Split Details View Is Closed
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Split Page", String.valueOf(Amount),logval);	
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Btn_OK(driver), "Ok Button Funds Split Page",logval);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As A Switch To The Window Containing Financial Reserves Screen Is Done");
	driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
	//driver.switchTo().frame(2); //A Switch To The Frame Containing Financial/Reserves Control Is Done
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Transaction", " Payment Addition Page ", logval);

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Btn_Save(driver), "Save Button On Payment Creation Page",logval);// Save Button Is Clicked On Payment Creation Page
	RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
	RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",logval);// Transaction Tab On Payment Creation Page Is Clicked
	ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
	logger.log(LogStatus.INFO, "Payment Saved With ControlNumber:" + " " + RMA_GenericUsages_Utility.color.RMA_ChangeColor_Utility(ReturnValue, 2) );
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_BackToFinancials(driver),"Back To Financial Image", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver)));
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);

	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Claimant")), "uncheck", "Claimant Column In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Reserve Sub Type")), "uncheck", "Reserve Sub Type Column In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Policy Name")), "uncheck", "Policy Name In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Unit")), "uncheck", "Unit In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Coverage Type")), "uncheck", "Coverage Type In Column Selection List", "Reserves NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Loss Type")), "uncheck", "Loss Type In Column Selection List", "Reserves NG Grid Table",logval);

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Reserve Table",ReserveType ,logval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid

	//Verification Of Correct Reserve Type Being Displayed On Reserves NG Grid Is Done
	WebElement ActualBalAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Balance" );
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpBalAmt, "Reserve Balance Amount On Reserves NG Grid On Financial Reserves Page", ActualBalAmt, logval);
	//Verification Of Correct Reserve Balance Amount Being Displayed On Reserves NG Grid Is Done

	WebElement ActualPaidAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Paid");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpPaidAmt, "Reserve Paid Amount On Reserves NG Grid On Financial Reserves Page", ActualPaidAmt, logval);
	//Verification Of Correct Reserve Paid Amount Being Displayed On Reserves NG Grid Is Done

	WebElement ActualCollecAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Collection");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpCollecAmt, "Reserve Collection Amount On Reserves NG Grid On Financial Reserves Page", ActualCollecAmt, logval);
	//Verification Of Correct Reserve Collection Amount Being Displayed On Reserves NG Grid Is Done

	WebElement ActualIncAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Incurred");
	RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpIncAmt, "Reserve Incurred Amount On Reserves NG Grid On Financial Reserves Page", ActualIncAmt, logval);
	//Verification Of Correct Reserve Incurred Amount Being Displayed On Reserves NG Grid Is Done
	if(logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "Payment Is Created Successfully With Reserve Paid Amount:" + " " + color.RMA_ChangeColor_Utility(ExpPaidAmt,3));
	}
	else
	{
		logger.log(LogStatus.PASS, "Payment Is Created Successfully With Reserve Paid Amount:" + " " + color.RMA_ChangeColor_Utility(ExpPaidAmt,3));
	}

	return ReturnValue;

	} catch (Exception|Error e) {
		throw (e);
	}
}

//====================================================================================================================================================================================================================================================================================================
//FunctionName 		: RMA_PolicyTracking_Utility
//Description  		: Enables The User To Add Payment 
//Input Parameter 	: PolicyStatus, effDate, expDate, PolicyTracking_PolicyPremium , PrimaryPolicyState, ClaimsMadeCoverageState, InsurerLName, Insured, logval
//		  			 AdditionalParameter: Few Parameter which May Compulsory In Future 	 
//					 For Carrier Claim Need To Enter Two More Information:UnitType And UnitName
//Revision			: 0.0 - RenuVerma-12-27-2016     
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// =================================================================================================================================================================================================================================================================================================
public static String RMA_PolicyTracking_Utility(String PolicyStatus, Date effDate,Date expDate,int PolicyTracking_PolicyPremium , String PrimaryPolicyState, String ClaimsMadeCoverageState, String InsurerLName, String Insured, String PolicyLOB,String UnitType,String UnitName,boolean AdditionalParameter,int logval) throws Exception, Error
{
	String StrPrimaryWindowHandle;
	String PolicyTracking_PolicyName;
	int PolicyTracking_PolicyNo;
	//Local Variable Declaration

ReturnValue=null;
try {

	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, "User Create Policy From Policy Tracking");
	}
	else
	{	
		logger = reports.startTest("<span id='PolTrack'>Policy Tracking </span>", "User Create Policy From Policy Tracking");
	}
	RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-PolicyTracking", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
	PolicyTracking_PolicyName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "InternalPolicy_");
	PolicyTracking_PolicyNo=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11111, 99999);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyName(driver), "Policy Name TextBox On Policy Tracking Page", PolicyTracking_PolicyName, logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyNumber(driver), "Policy No TextBox On Policy Tracking Page", String.valueOf(PolicyTracking_PolicyNo), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyPremium(driver), "Policy Premium TextBox On Policy Tracking Page", String.valueOf(PolicyTracking_PolicyPremium), logval);		
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Btn_PolicyStatus(driver), "Policy Status TextBox On Policy Tracking Page", logval);
	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	RMA_Navigation_Utility.RMA_WebLinkSelect(PolicyStatus, " Policy Status On Policy Tracking Page", logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Chk_PrimaryPolicy(driver), PrimaryPolicyState, "Primary Policy CheckBox", "Policy Tracking Page", logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Chk_ClaimsMadeCoverage(driver), ClaimsMadeCoverageState, "Claims-Made Coverage CheckBox", "Policy Tracking Page", logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_Effectivedate(driver), "Effective Date TextBox On Policy Tracking Page", new SimpleDateFormat("MM-dd-yyyy").format(effDate), logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_Expirationdate(driver), "Expiration Date TextBox On Policy Tracking Page", new SimpleDateFormat("MM-dd-yyyy").format(expDate), logval);
	if(AdditionalParameter){// For carrier claim it requires
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyLOB(driver), "Policy LOB TextBox On Policy Tracking Page", PolicyLOB, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Unit Information"), " Unit Information Link Tab On Policy Tracking Page", logval);
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Lst_UnitType(driver), UnitType, "Unit Type List", "Policy Tracking Page", logval);
		if (UnitType.equalsIgnoreCase("Vehicle")){// if vehicle select in Unit Name
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Btn_UnitName(driver), "Unit Name Lookup Button Under Insurer Information Tab On Policy Tracking Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchVehicle_Txt_VehicleID(driver), "Standard Vehicle Search page","Vehicle ID TextBox",UnitName,UnitName, "Policy Tracking",StrPrimaryWindowHandle, logval);
		}
		if (UnitType.equalsIgnoreCase("Property")){// if Property select in Unit Name
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Btn_UnitName(driver), "Unit Name Lookup Button Under Insurer Information Tab On Policy Tracking Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchPropertyId_Txt_PropertyID(driver), "Standard Property Unit Search page","Property ID TextBox",UnitName,UnitName, "Policy Tracking",StrPrimaryWindowHandle, logval);
		}
		if (UnitType.equalsIgnoreCase("Site")){// if Site select in Unit Name
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Btn_UnitName(driver), "Unit Name Lookup Button Under Insurer Information Tab On Policy Tracking Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebLinkSelect(UnitName, " Standard Lookup Data page", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		}
	}
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Insurer Information"), " Insurer Information Link Tab On Policy Tracking Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Btn_Insurer(driver)));
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Btn_Insurer(driver), "Insurer Lookup Button Under Insurer Information Tab On Policy Tracking Page", logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchEntity_Txt_LastName(driver), "Standard Entity Search page","Last Name TextBox",InsurerLName,"Insurers", "Policy Tracking",StrPrimaryWindowHandle, logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Btn_Insured(driver), "Insured Lookup Button Under Insurer Information Tab On Policy Tracking Page", logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Lst_DefaultExpLevel(driver), "Department", "Default Expansion Level for List", "Org Hierarchy Page", logval);
	RMA_Navigation_Utility.RMA_WebLinkSelect(Insured, " Policy Tracking ->Org Hierarchy Page", logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");

	RMA_Functionality_Utility.RMA_GenericSave_Utility("Policy Tracking", false, "NA", "Policy Tracking Page", logval);
	ReturnValue=RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyName(driver).getAttribute("value");
	RMA_Verification_Utility.RMA_TextCompare(PolicyTracking_PolicyName, ReturnValue,"Policy Name", logval);
	if(logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "Policy Is Created Successfully With Policy Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
	}
	else
	{
		logger.log(LogStatus.PASS, "Policy Is Created Successfully With Policy Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		return ReturnValue;

	} catch (Exception|Error e) {
		throw (e);
	}
}


//==================================================================================================================================================================================
//FunctionName 		: RMA_BankAccount_AddEdit_Utility
//Description  		: Enables The User To Add Bank Account
//Input Parameter 	:BankAddr1, BankCity, BankState, ZipCode, AccountName, AccountType, NextCheck, BankOwner,
//		  			 Case Variable To Indicate User Action (Create and Edit BankAccount), AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//Revision			: 0.0 - RenuVerma-10-17-2016          
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ====================================================================================================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If No Valid Value Is Present

public static String RMA_BankAccount_AddEdit_Utility(String Case, String BankAddr1,String BankCity,String BankState, int ZipCode, String AccountName, String AccountType, int NextCheck, String BankOwner, boolean AdditionalParameter,int logval) throws Exception, Error
{
	String StrPrimaryWindowHandle;
	String BankName;
	int BankAccountNo;
	String CurrentFrameID;
	ReturnValue=null;
	//Variable Declaration
try {

	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, "User can "+Case+" Bank Account");
	}
	else
	{	
		logger = reports.startTest("<span id='BankAccount'>Bank Account Addition </span>", "User can "+Case+" Bank Account");
	}
	switch (Case){
	case "Create":
	{
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-BankAccount", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Bank Account");
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver)));
		BankName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "RMABank_");
		BankAccountNo=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11111, 99999);
		StrPrimaryWindowHandle=driver.getWindowHandle();
		CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver), "Bank Name TextBox On Bank Account Page", BankName, logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_QuickLookup_Generic_Btn_AddNew(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_QuickLookup_Generic_Btn_AddNew(driver), " Add New Button On Bank Account Page.", logval);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Bank Account");
		globalWait.until(ExpectedConditions.attributeToBe(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver),"value",BankName));
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_Adderss1(driver), "Bank Address 1 TextBox On Bank Account Page", BankAddr1, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_BankCity(driver), "Bank City TextBox On Bank Account Page", BankCity, logval);		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_BankState(driver), "Bank State TextBox On Bank Account Page", BankState, logval);		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_BankZipCode(driver), "Bank Zip Code TextBox On Bank Account Page", String.valueOf(ZipCode), logval);		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_BankAccNo(driver), "Bank Account No TextBox On Bank Account Page", String.valueOf(BankAccountNo), logval);		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver), "Account Name TextBox On Bank Account Page", AccountName, logval);		
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_AccountType(driver), "Account Type TextBox On Bank Account Page", AccountType, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_NextCheckNumber(driver), "Next Check Number TextBox On Bank Account Page", String.valueOf(NextCheck), logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Account Owner"), "Account Owner Link Tab On Bank Account Page", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_Owner(driver)));
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_Owner(driver),"Bank Owner TextBox On Bank Account Page" , BankOwner, logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Bank Account", false, "NA", "Bank Account Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "General Information"), "General Information Link Tab On Bank Account Page", logval);
		RMA_Verification_Utility.RMA_TextCompare(AccountName, RMA_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver).getAttribute("value") , "Account Name", logval);
		ReturnValue=RMA_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver).getAttribute("value");
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "Created Bank Account Successfully With Bank Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		else
		{
			logger.log(LogStatus.PASS, "Created Bank Account Successfully With Bank Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		break;
	}
	case "Edit":
	{
		CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver), "Account Name TextBox On Bank Account Page ", AccountName, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_NextCheckNumber(driver), "Next Check Number TextBox On Bank Account Page ", String.valueOf(NextCheck), logval);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_AccountType(driver), "Account Type TextBox On Bank Account Page ",AccountType, logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA","Bank Account Page", logval);
		RMA_Verification_Utility.RMA_TextCompare(AccountName, RMA_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver).getAttribute("value") , "Account Name", logval);
		ReturnValue=RMA_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver).getAttribute("value");
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "Edited Bank Account Successfully With Bank Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		else
		{
			logger.log(LogStatus.PASS, "Edited Bank Account Successfully With Bank Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		break;
	}
	default:
	{
		if (logval == 0)
		{
			parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
		else
		{
			logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
			}
		}
		}
		return ReturnValue;

	} catch (Exception|Error e) {
		throw (e);
	}
}

// =============================================================================================================================================
// FunctionName : RMA_GeneralClaimCreation_ACOFF
// Description 	: Enables Users To Create GeneralClaim Co-operate client
// Input Parameter : ClaimType, Department, Dateofevent, TimeofEvent, Dateofclaim, Timeofclaim,  logval
// 					AdditionalParameter: Few Parameter which May Compulsory In Future
// Revision 		: 0.0- RenuVerma-11-18-2016
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ======================================================================================================================================
public static String RMA_GeneralClaimCreation_ACOFF(String ClaimType, String Department,	Date Dateofevent, int TimeofEvent,Date Dateofclaim, int Timeofclaim, boolean AdditionalParameter,int logval) throws Exception, Error {
	String StrGeneralClaimNumber;
	String StrPrimaryWindowHandle;
	try {
		logger = reports.startTest("<span id='GCClaimACOFF'>General Claim Creation</span>", "General Claim Is Created");

	RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-GeneralClaim", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimgc");
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimType(driver), "Claim Type TextBox On General Claim Creation Page", ClaimType,logval);
	Thread.sleep(5000);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_TimeOfEvent(driver), "TimeOfEvent TextBox On General Claim Creation Page", String.valueOf(TimeofEvent),logval);		
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_DateOfClaim(driver), "DateOfClaim TextBox On GeneralClaim Creation Page",  new SimpleDateFormat("MM-dd-yyyy").format(Dateofclaim),logval);
	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_Dept_Id(driver), "DeptId TextBox On General Claim Creation Page", Department,logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_TimeOfClaim(driver), "TimeOfClaim TextBox On GeneralClaim Creation Page", String.valueOf(Timeofclaim),logval);	
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_DateOfEvent(driver), "DateOfEvent TextBox On General Claim Creation Page",  new SimpleDateFormat("MM-dd-yyyy").format(Dateofevent),logval);	

	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Img_ClaimStatusSrchBtn(driver), "Claim Status Search Button On RMA Application General Claim Creation Page",logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
	RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Code Selection Window",logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimgc");
	RMA_Functionality_Utility.RMA_GenericSave_Utility("claimgc", false, "NA", "General Claim Creation Page", logval);
	StrGeneralClaimNumber = RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrClaimNumber
	logger.log(LogStatus.INFO, "General Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrGeneralClaimNumber, 2));
	logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "General Claim Saved Successfully", "General Claim Creation")));
	driver.switchTo().parentFrame(); //A Switch To The Parent Frame That Contains Menu Options And Left Hand Navigation Tree Is Done
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrGeneralClaimNumber), "Expand Image Corresponding To General Claim Link On Left Navigation Tree", logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Expand Image Corresponding To General Claim Link On Left Navigation Tree Is Clicked ");
} catch (Exception | Error e) {
	// System.out.println("Error Message Is :" +" " +e.getMessage());
		throw (e);
	}
	return StrGeneralClaimNumber;
}	
//=========================================================================================================================================================================================================
//FunctionName 		: RMA_MaintenanceEntityEdit_Utility
//Description  		: Enables The User To Edit Entity Like Employee, Medical From The Maintenance Screen To The RMA Application   
//Input Parameter 	: Entity: Case Variable Determining Which Entity Is To Be Edited, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
//Revision			: 0.0 - RenuVerma-12-28-2016      
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
//=============================================================================================================================================================================================================
public static String RMA_MaintenanceEntityEdit_Utility(String Entity, int logval) throws Exception, Error
{
	try {
		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO,"Created Entity Of Type: " + " "+ Entity+" "+ "Is Edited From Maintenance Screen To RMA Application");
	}
	else
	{	
		logger =  reports.startTest("<span id='EntityEdit'>Edit Of "+Entity+" Entity</span>", "Created Entity Of Type: " + " "+ Entity+" "+ "Is Edited From Maintenance Screen To RMA Application");
	}
	String EntityName; // Last Name Of The Entity Is Fetched In This Variable
	int EntityNumber; // Numeric Part Of The Entity Is Fetched In This Variable
	String EntityNum; //Employee Number Of the Entity Is Fetched In This Variable
	String StrPrimaryWindowHandle ;

	switch (Entity){
	case "Employee":
		EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100, 999);
		EntityNum = "EditedEmployee_" + EntityNumber;
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_EmployeeNumber(driver), "Employee Number TextBox On Maintenance-->Employee Page", EntityNum, logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Employee", false, "NA", "Maintenance-->Employee Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEmp_Txt_EmployeeNumber(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Employee Number Value", logval);
		break;

	case "MedicalStaff":
		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedMedStaff_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintMedStaff_Txt_LstName(driver), "Last Name TextBox On Maintenance-->Medical Staff Page", EntityName, logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Medical Staff", false, "NA", "Maintenance-->Medical Staff  Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintMedStaff_Txt_LstName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName, "Medical Staff Name Value", logval);
		break;

	case "PatientTracking":
		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedPatient_");
		StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Patient Tracking Page", EntityName, logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Last Name Is Done
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Btn_Edit(driver), "Edit Button On The Last Name Window On RMA Application Maintenance-->Patient Tracking Page",logval);
		driver.switchTo().window(StrPrimaryWindowHandle); //A Switch To The Parent Window Is Done
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(("Patient"));		
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Patient", false, "NA", "Maintenance-->Patient  Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName, "Patient Last Name Value", logval);
		break;

	case "Physician":
		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedPhysician_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Physician Page", EntityName, logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Physician", false, "NA", "Maintenance-->Physician  Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName, "Physician Last Name Value", logval);
		break;

	case "Driver":					
		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedDriver_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintDriver_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Driver Page", EntityName, logval);	
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Driver", false, "NA", "Maintenance-->Driver  Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintDriver_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName,"Driver Last Name Value", logval);
		break;

	case "Witness":
		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedWitness_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "Last Name TextBox On Maintenance-->People Page", EntityName, logval);	
		RMA_Functionality_Utility.RMA_GenericSave_Utility("People", false, "NA", "Maintenance-->People Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName,"Witness Last Name Value", logval);
		break;

	case "OtherPeople":
		EntityName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedOthPeople_");	
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "Last Name TextBox On Maintenance-->People Page", EntityName, logval);	
		RMA_Functionality_Utility.RMA_GenericSave_Utility("People", false, "NA", "Maintenance-->People Page", logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityName, EntName,"Other People Last Name Value", logval);
		break;

	default:
	{
		if (logval == 0)
		{
			parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Entity+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
		else
		{
			logger.log(LogStatus.ERROR, "Case Variable" + " "+ Entity+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
			}
		}
		}
		return EntName;

	} catch (Exception|Error e) {
		throw (e);
	}
}
//==================================================================================================================================================================================================================================================================
//FunctionName 		: RMA_SubBankAccount_AddEdit_Utility
//Description  		: Enables The User To Add Sub Bank Account
//Input Parameter 	: StrSubBankAccountMinBal, StrSubBankAccountTargetBal, StrSubBankAccountOwner, String StrSubBankAccountLOB,
//		  			  Case Variable To Indicate User Action (Create and Edit SubbankAccount), AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 						
//Revision			: 0.0 - RenuVerma-12-28-2016          
//Modified By		: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ================================================================================================================================================================================================================================================================
// Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present

public static String RMA_SubBankAccount_AddEdit_Utility(String Case, int StrSubBankAccountMinBal, int StrSubBankAccountTargetBal, String StrSubBankAccountOwner, String StrSubBankAccountLOB, boolean AdditionalParameter,int logval) throws Exception, Error
{
	String StrSubAccountName;
	int StrSubBankAccountNumber;
	String StrEditedSubAccountName;
	int StrEditedSubBankAccountNumber;
	ReturnValue=null;
	//Variable Declaration

try {

	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, "User can "+Case+" Sub Bank Account");
	}
	else
	{	
		logger = reports.startTest("<span id='SubBankAccount'>"+Case+" Sub Bank Account Utility </span>", "User can "+Case+" Sub Bank Account");
	}
	switch (Case){
	case "Create":
	{
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_BankAccount.RMAApp_BankAccount_Img_SubAccounts(driver), "Sub Bank Account Image on Maintenance-->Bank Account Page", logval);
		StrSubAccountName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "SubBank_");
		StrSubBankAccountNumber=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111111, 9999999);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountName(driver),"Sub Account Name TextBox On Sub Bank Account Page",StrSubAccountName , logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountNumber(driver),"Sub Account Number TextBox On Sub Bank Account Page",String.valueOf(StrSubBankAccountNumber) , logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountMinBalance(driver),"Sub Account Minimum Balance TextBox On Sub Bank Account Page",String.valueOf(StrSubBankAccountMinBal) , logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountTargetBal(driver),"Sub Account Target Balance TextBox On Sub Bank Account Page",String.valueOf(StrSubBankAccountTargetBal) , logval);
		RMA_Navigation_Utility.RMA_WebLinkSelect("Account Owner", "Maintenance-->Bank Account-->Sub Bank Account Page", logval);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_Owner(driver), "Owner Text Box On Maintenance--> Bank Account--> Sub Bank Account Page", StrSubBankAccountOwner, logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Chk_SubAccountLOB(driver,StrSubBankAccountLOB), "check", "Line Of Business CheckBox", "Maintenance--> Bank Account--> Sub Bank Account Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), " Maintenance-->Bank Account-->Sub Bank Account Page", logval);
		RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
		RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
		RMA_Verification_Utility.RMA_TextCompare(StrSubAccountName, RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountName(driver).getAttribute("value") , "Account Name", logval);
		ReturnValue=RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountName(driver).getAttribute("value");
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "Created Sub Bank Account Successfully With Sub Account Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		else
		{
			logger.log(LogStatus.PASS,  "Created Sub Bank Account Successfully With Sub Account Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		break;
	}
	case "Edit":
	{
		StrEditedSubAccountName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedSubBank_");
		StrEditedSubBankAccountNumber=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111111, 9999999);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountName(driver),"Sub Account Name TextBox On Sub Bank Account Page",StrEditedSubAccountName , logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountNumber(driver),"Sub Account Number TextBox On Sub Bank Account Page",String.valueOf(StrEditedSubBankAccountNumber) , logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), " Maintenance-->Bank Account-->Sub Bank Account Page", logval);
		RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
		RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
		RMA_Verification_Utility.RMA_TextCompare(StrEditedSubAccountName, RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountName(driver).getAttribute("value") , "Account Name", logval);
		ReturnValue=RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountName(driver).getAttribute("value");

		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "Edited Sub Bank Account Successfully With Sub Account Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		else
		{
			logger.log(LogStatus.PASS, "Edited Sub Bank Account Successfully With Sub Account Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}break;
	}
	default:
	{
		if (logval == 0)
		{
			parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
		else
		{
			logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
			}
		}
		}
		return ReturnValue;

	} catch (Exception|Error e) {
		throw (e);
	}
}
//===========================================================================================================================================================================================================================================================================================
//FunctionName 		: RMA_MaintenanceProperty_AddEdit_Utility
//Description  		: Enables The User To Add/Edit Property From Maintenance
//Input Parameter 	: RMA_PropertyAddr1, RMA_PropertyCity, RMA_PropertyZipCode, RMA_PropertyState, RMA_PropertyYearofConstruction,RMA_PropertySquareFootage
//		  			  Case Variable To Indicate User Action (Create, Edit, Delete For Property From Maintenance), AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//Revision			: 0.0 - RenuVerma-12-28-2016       
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// =========================================================================================================================================================================================================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present

public static String RMA_MaintenanceProperty_AddEdit_Utility(String Case, String  RMA_PropertyAddr1, String RMA_PropertyCity, int RMA_PropertyZipCode, String RMA_PropertyState, String RMA_PropertyYearofConstruction,int RMA_PropertySquareFootage,boolean AdditionalParameter,int logval) throws Exception, Error
{
	String RMA_PropertyID;
	String CurrentFrameID;
	String RMA_EditedPropertyID;
	ReturnValue=null;
	//Variable Declaration

try {

	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, "User can "+Case+" Property From Maintenance");
	}
	else
	{	
		logger = reports.startTest("<span id='MaintenanceProperty'>"+Case+" Property From Maintenance </span>", "User can "+Case+" Property From Maintenance");
	}
	switch (Case){
	case "Create":
	{
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Property", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Property");
		RMA_PropertyID   = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Property_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_Property.RMAApp_MaintProperty_Txt_PropertyID(driver), "Property ID TextBox On Maintenance-->Property Page",RMA_PropertyID, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_Property.RMAApp_MaintProperty_Txt_Address1(driver), "Address 1 TextBox On Maintenance-->Property Page",RMA_PropertyAddr1, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_Property.RMAApp_MaintProperty_Txt_City(driver), "City TextBox On Property Page.", RMA_PropertyCity, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_Property.RMAApp_MaintProperty_Txt_ZipPostalCode(driver), "Zip Code TextBox On Property Page.", String.valueOf(RMA_PropertyZipCode), logval);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_Property.RMAApp_MaintProperty_Txt_State(driver), "State TextBox On Property Page.", RMA_PropertyState, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "COPE Data"), "COPE Data Link Tab on Property Page",  logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_Property.RMAApp_MaintProperty_Txt_YearOfConstruction(driver), "Year of Construction TextBox On Property Page.", RMA_PropertyYearofConstruction, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_Property.RMAApp_MaintProperty_Txt_SquareFootage(driver), "Square Footage TextBox On Property Page.", String.valueOf(RMA_PropertySquareFootage), logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Optional COPE Data"), "Optional COPE Data Link Tab on Property Page",  logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supplementals"), "Supplementals Link Tab on Property Page",  logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Property Info"), "Property Info Link Tab on Property Page",  logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Property", false, "NA", "Phyician Page", logval);
		ReturnValue = RMA_Selenium_POM_Maintenance_Property.RMAApp_MaintProperty_Txt_PropertyID(driver).getAttribute("value");
		RMA_Verification_Utility.RMA_TextCompare(ReturnValue, RMA_PropertyID , "Property ID Value",logval);
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "Created Property From Maintenance Successfully With Property ID:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		else
		{
			logger.log(LogStatus.PASS, "Created Property From Maintenance Successfully With Property ID:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		break;
	}
	case "Edit":
	{
		CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		RMA_EditedPropertyID = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "EditedProp_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_Property.RMAApp_MaintProperty_Txt_PropertyID(driver), "Property ID TextBox On Maintenance-->Property Page",RMA_EditedPropertyID, logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID,false,"NA","Maintenance-->Property Page", logval);
		ReturnValue= RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_Property.RMAApp_MaintProperty_Txt_PropertyID(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(ReturnValue, RMA_EditedPropertyID , "Property Last Name Value",logval);			
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "Edited Property From Maintenance Successfully With Property ID:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		else
		{
			logger.log(LogStatus.PASS, "Edited Property From Maintenance Successfully With Property ID:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		break;
	}
	default:
	{
		if (logval == 0)
		{
			parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
		else
		{
			logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
			}
		}
		}
		return ReturnValue;

	} catch (Exception|Error e) {
		throw (e);
	}
}

//============================================================================================================================================================================
//FunctionName 		: RMA_MaintenancePlan_AddEdit_Utility
//Description  		: Enables The User To Add/Edit Plan Name From Maintenance
//Input Parameter 	: StrPlanStatus, StrPlanEffectiveDate, StrPlanExpirationDate, StrPlanInsured
//		  			  Case Variable To Indicate User Action (Create, Edit Plan), AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//Revision			: 0.0 - RenuVerma-12-28-2016       
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ===================================================================================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present

public static String RMA_MaintenancePlan_AddEdit_Utility(String Case, String StrPlanStatus, String  StrPlanEffectiveDate, String StrPlanExpirationDate,String StrPlanInsured, boolean AdditionalParameter,int logval) throws Exception, Error
{
	String StrPlanname;
	int StrPlannumber;
	String StrEditedPlanname;
	String StrPrimaryWindowHandle;
	ReturnValue=null;
	//Variable Declaration

try {

	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, "User can "+Case+" Plan Name From Maintenance");
	}
	else
	{	
		logger = reports.startTest("<span id='MaintenancePlan'>"+Case+" Plan Name From Maintenance </span>", "User can "+Case+" Plan Name From Maintenance");
	}
	switch (Case){
	case "Create":
	{
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-PlanManagement", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Plan Management");
		StrPlanname=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Plan_");
		StrPlannumber=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_Planname(driver)));
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_PlanNumber(driver), "Plan Number Text Box on Maintenance -> Plan Management Page", String.valueOf(StrPlannumber), logval);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_PlanStatus(driver), "Plan Status Text Box on Maintenance -> Plan Management Page", StrPlanStatus, logval);
		Thread.sleep(4000);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_EffectiveDate(driver), "Effective Date Text Box on Maintenance -> Plan Management Page", StrPlanEffectiveDate, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_ExpirationDate(driver), "Expiration Date Text Box on Maintenance -> Plan Management Page", StrPlanExpirationDate, logval);
		Thread.sleep(4000);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_Planname(driver), "Plan Name Text Box on Maintenance -> Plan Management Page", StrPlanname, logval);
		StrPrimaryWindowHandle=driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Btn_Insured(driver), "Insured Button On Maintenance -> Plan Management Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Lst_DefaultExpLevel(driver), "Department", "Default Expansion Level for List", "Org Hierarchy Page", logval);
		RMA_Navigation_Utility.RMA_WebLinkSelect(StrPlanInsured, " Maintenance -> Plan Management --> Org-hierarchy page", logval);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Plan Management");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Plan Management", false, "NA", "Maintenance -> Plan Management Page", logval);
		ReturnValue=RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_Planname(driver).getAttribute("value");
		RMA_Verification_Utility.RMA_TextCompare(StrPlanname, ReturnValue, "Plan Name", logval);
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "Created Plan Name Successfully With Plan Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		else
		{
			logger.log(LogStatus.PASS, "Created Plan Name Successfully With Plan Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		break;
	}
	case "Edit":{
		StrEditedPlanname=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Plan_");
		RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_Planname(driver), "Plan Name Text Box on Maintenance -> Plan Management Page", StrEditedPlanname, logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Plan Management", false, "NA", "Maintenance -> Plan Management Page", logval);
		ReturnValue=RMA_Selenium_POM_Maintenance_PlanManagement.RMAApp_MaintPlanManagement_Txt_Planname(driver).getAttribute("value");
		RMA_Verification_Utility.RMA_TextCompare(StrEditedPlanname, ReturnValue, "Plan Name", logval);
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "Edited Plan Name Successfully With Plan Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		else
		{
			logger.log(LogStatus.PASS, "Edited Plan Name Successfully With Plan Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		break;
	}
	default:
	{
		if (logval == 0)
		{
			parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
		else
		{
			logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
			}
		}
		}
		return ReturnValue;

	} catch (Exception|Error e) {
		throw (e);
	}
}
//=============================================================================================================================================================================================================================================
//FunctionName 		: RMA_MaintenanceVehicle_AddEdit_Utility
//Description  		: Enables The User To Add/Edit Vehicle From Maintenance
//Input Parameter 	: StrVehicleMake,  StrVehicleModel,  IntVehicleYear,  IntLeaseAmount,  StrLicenseNumber, IntLeaseNumber, IntLeaseTerm, StrLeaseExpiration, IntOriginalCost, StrUnitType, StrDisposalDate,  StrLastServiceDate
//		  			  Case Variable To Indicate User Action (Create, Edit Vehicle), AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//					  Pass "NA" or 00 for optional parameter	
//Revision			: 0.0 - RenuVerma-01-03-2017             
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ==================================================================================================================================================================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present

public static String RMA_MaintenanceVehicle_AddEdit_Utility(String Case, String  StrVehicleMake, String StrVehicleModel, int IntVehicleYear, int IntLeaseAmount, String StrLicenseNumber,int IntLeaseNumber,int IntLeaseTerm,String StrLeaseExpiration,int IntOriginalCost,String StrUnitType,String StrDisposalDate, String StrLastServiceDate,boolean AdditionalParameter,int logval) throws Exception, Error
{
	String StrVehicleID;
	String CurrentFrameID;
	String StrEditedVehicleID;
	ReturnValue=null;
	//Local Variable Declaration

try {

	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, "User can "+Case+" Vehicle From Maintenance");
	}
	else
	{	
		logger = reports.startTest("<span id='MaintenanceVehicle'>"+Case+" Vehicle From Maintenance </span>", "User can "+Case+" Vehicle From Maintenance");
	}
	switch (Case){
	case "Create":
	{
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Vehicle", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle");
		StrVehicleID = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Vehicle_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_VehicleID(driver), "Vehicle ID TextBox On Maintenance-->Vehicle Page",StrVehicleID, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_VehicleMake(driver), "Vehicle Make TextBox On Maintenance-->Vehicle Page",StrVehicleMake, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_VehicleModel(driver), "Vehicle Model TextBox On Maintenance-->Vehicle Page", StrVehicleModel, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_VehicleYear(driver), "Vehicle Year TextBox On Maintenance-->Vehicle Page",String.valueOf(IntVehicleYear), logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Chk_Lease(driver), "check", "Lease CheckBox", "Maintenance-->Vehicle Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_LeaseAmount(driver), "Lease Amount TextBox On Maintenance-->Vehicle Page", String.valueOf(IntLeaseAmount), logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_LicenseNumber(driver), "License Number TextBox On Maintenance-->Vehicle Page",StrLicenseNumber, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_LeaseNumber(driver), "Lease Number TextBox Maintenance-->Vehicle Page", String.valueOf(IntLeaseNumber), logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_LeaseTerm(driver), "Lease Term (Months) TextBox On Maintenance-->Vehicle Page",String.valueOf(IntLeaseTerm), logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_LeaseExpiration(driver), "Lease Expiration TextBox On Maintenance-->Vehicle Page", StrLeaseExpiration, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_OriginalCost(driver), "Original Cost TextBox On Maintenance-->Vehicle Page", String.valueOf(IntOriginalCost), logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Vehicle Detail"), "Vehicle Detail Link Tab on Maintenance--> Vehicle Page",  logval);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_UnitType(driver), "UnitType TextBox On Maintenance-->Vehicle Page",StrUnitType, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_DisposalDate(driver), "Disposal Date TextBox On Maintenance-->Vehicle Page", StrDisposalDate, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_LastServiceDate(driver), "Last Service Date TextBox On Maintenance-->Vehicle Page", StrLastServiceDate, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Vehicle Info"), "Vehicle Info Link Tab on Maintenance--> Vehicle Page",  logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Vehicle", false, "NA", "Maintenance--> Vehicle Page", logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supplementals"), "Supplementals Tab Link On Maintenance-->Vehicle Page", logval);
		ReturnValue= RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_VehicleID(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrVehicleID,ReturnValue, "Vehicle ID",logval);	
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "Created Vehicle From Maintenance Successfully With Vehicle ID:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		else
		{
			logger.log(LogStatus.PASS, "Created Vehicle From Maintenance Successfully With Vehicle ID:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		break;
	}
	case "Edit":
	{
		StrEditedVehicleID = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedVehicle_");
		CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_VehicleID(driver), "Vehicle ID TextBox On Maintenance-->Vehicle Page",StrEditedVehicleID, logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Maintenance--> Vehicle Page", logval);
		ReturnValue= RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_VehicleID(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrEditedVehicleID,ReturnValue, "Vehicle ID",logval);			
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "Edited Vehicle From Maintenance Successfully With Vehicle ID:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		else
		{
			logger.log(LogStatus.PASS, "Edited Vehicle From Maintenance Successfully With Vehicle ID:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}
		break;
	}
	default:
	{
		if (logval == 0)
		{
			parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
		else
		{
			logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
			}
		}
		}	
		return ReturnValue;

	} catch (Exception|Error e) {
		throw (e);
	}
}

//====================================================================================================
//FunctionName 		: RMA_PolicyCoverage_Utility
//Description  		: Enables The User To Add Policy Coverage On Policy Tracking
//Input Parameter 	: PolicyTracking_CoverageType, PolicyTracking_PolicyLimit
//		  			  AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//Revision			: 0.0 - RenuVerma-01-03-2017              
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ====================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present

public static String RMA_PolicyCoverage_Utility(String  PolicyTracking_CoverageType, int PolicyTracking_PolicyLimit, boolean AdditionalParameter,int logval) throws Exception, Error
{
	String StrPrimaryWindowHandle;
	String CurrentFrameID;
	ReturnValue=null;
	//Local Variable Declaration

try {

	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, "User can Add Policy Coverage On Policy Tracking ");
	}
	else
	{	
		logger = reports.startTest("<span id='PolicyCoverage'> Add "+PolicyTracking_CoverageType+" Policy Coverage On Policy Tracking  </span>", "User can Add Policy Coverage On Policy Tracking ");
	}
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Img_PolicyCoverage(driver), "Policy Coverage Image On Policy Tracking Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTrakCov_Img_New(driver)));
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTrakCov_Img_New(driver), "New Image on Policy Coverage Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTrakCov_Btn_CovType(driver)));
	CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTrakCov_Btn_CovType(driver), "Coverage Type Button On Policy Coverage Page", logval);
	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	RMA_Navigation_Utility.RMA_WebLinkSelect(PolicyTracking_CoverageType,  " Coverage Type On Policy Coverage Page", logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTrakCov_Txt_PolicyLimit(driver), "Policy Limit on Policy Coverage Page", String.valueOf(PolicyTracking_PolicyLimit), logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Policy Coverage Page", logval);
	RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
	RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false,"NA",logval);
	ReturnValue=RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTrakCov_Txt_CovType(driver).getAttribute("value");
	RMA_Verification_Utility.RMA_PartialTextVerification(PolicyTracking_CoverageType ,ReturnValue, "Coverage Type", logval);

	if(logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "Added "+PolicyTracking_CoverageType+" Policy Coverage On Policy Tracking  Successfully With Coverage Type:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
	}
	else
	{
		logger.log(LogStatus.PASS, "Added "+PolicyTracking_CoverageType+" Policy Coverage On Policy Tracking  Successfully With Coverage Type:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
		}

		return ReturnValue;

	} catch (Exception|Error e) {
		throw (e);
	}
}

//======================================================================================================================================================================================================================================================================================================================================================
//FunctionName 		: RMA_TableMaintenanceCodeAddition_Utility
//Description  		: Enables The User To Add Code Into Table Maintenance
//Input Parameter 	: Case: In Which Table You want to add Code; TableMaintLinkName: Link Name Of The table, CodeTableLinkName: Link Name Of the Code Table, Code, Description, ParentCode: Parent Code of the Code which you want to set, EffStartDate, EffEndDate,LOB, ColNoForVerification: Col No for Verification, SearchTextOnTable
//		  			  AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//Revision			: 0.0 - RenuVerma-01-13-2017                    
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ==================================================================================================================================================================================================================================================================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present

public static void RMA_TableMaintenanceCodeAddition_Utility(String Case ,String TableMaintLinkName, String CodeTableLinkName, String Code,String Description,String ParentCode, String EffStartDate,String EffEndDate,String LOB,int ColNoForVerification,String SearchTextOnTable,boolean AdditionalParameter,int logval) throws Exception, Error
{

	try {

		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO, "User can Add Code On Table Maintenance ");
	}
	else
	{	
		logger = reports.startTest("<span id='TableMaintenanceCode'> Code Addition On Table Maintenance </span>", "User can Add Code On Table Maintenance ");
	}
	switch (Case){
	case "Policy LOB":
	{			
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-TableMaintenance", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Table Maintenance");
		globalWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frm_Top_Menu"));// RMA_DynamicFrameSwitching method is not Used as id of the frame is not given and used Frame Name
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, TableMaintLinkName)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, TableMaintLinkName),TableMaintLinkName+" Link On Table Maintenance Page", logval);
		driver.switchTo().parentFrame();
		globalWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frm_Tables"));// RMA_DynamicFrameSwitching method is not Used as id of the frame is not given and used Frame Name
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, CodeTableLinkName)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, CodeTableLinkName),CodeTableLinkName+" Link Under 'Code Tables' Section On Table Maintenance Page", logval);
		driver.switchTo().parentFrame();
		globalWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frm_Code_Detail"));// RMA_DynamicFrameSwitching method is not Used as id of the frame is not given and used Frame Name
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_Managers_Btn_Generic(driver, "Add Code")));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Managers.RMAApp_Managers_Btn_Generic(driver, "Add Code"),"Add Code Button Under 'Code Texts' Section On Table Maintenance Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_TableMaintenance.RMAApp_MaintTableMaintenance_Txt_Code(driver), "Code TextBox Under 'Enter Code Detail Section' On Table Maintenance Page", Code, logval);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_TableMaintenance.RMAApp_MaintTableMaintenance_Txt_ParentCode(driver), "Parent Code TextBox Under 'Enter Code Detail Section' On Table Maintenance Page", ParentCode, logval);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_TableMaintenance.RMAApp_MaintTableMaintenance_Txt_LineOfBusiness(driver), "Line Of Business TextBox Under 'Enter Code Detail' Section On Table Maintenance Page",LOB , logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_TableMaintenance.RMAApp_MaintTableMaintenance_Txt_EffectiveStartDate(driver), "Effective Start Date TextBox  Under 'Enter Code Detail' Section On Table Maintenance Page", EffStartDate, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_TableMaintenance.RMAApp_MaintTableMaintenance_Txt_EffectiveEndDate(driver), "Effective End Date TextBox Under 'Enter Code Detail' Section On Table Maintenance Page", EffEndDate, logval);

		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance_TableMaintenance.RMAApp_MaintTableMaintenance_Txt_Description(driver), "Description TextBox Under 'Enter Code Detail' Section On Table Maintenance Page", Description, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance_TableMaintenance.RMAApp_MaintTableMaintenance_Btn_Generic(driver, "Save"),"Save Button Under 'Enter Code Detail' Section On Table Maintenance Page", logval);
		driver.switchTo().parentFrame();// Switch to TableMaintenance Frame
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_ErrorMessage_Heading(driver), "Error Message On Table Maintenece Page", logval);
		globalWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frm_Code_Detail"));// RMA_DynamicFrameSwitching method is not Used as id of the frame is not given and used Frame Name
		RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_Maintenance_TableMaintenance.RMAApp_MaintTableMaintenance_Tbl_CodeMaint(driver), Description, ColNoForVerification, SearchTextOnTable, "Code Maintenance Table Under 'Code Texts' Section On Table Maintenance Page", logval);
		driver.switchTo().parentFrame();// Switch to TableMaintenance Frame
		break;
	}
	default:
	{
		if (logval == 0)
		{
			parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
		else
		{
			logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
	}
	}	
	if(logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "Added "+Case+" Code On Table Maintenance Successfully With Code:" + " " + color.RMA_ChangeColor_Utility(Code,3));
	}
	else
	{
		logger.log(LogStatus.PASS, "Added "+Case+" Code On Table Maintenance Successfully With Code:" + " " + color.RMA_ChangeColor_Utility(Code,3));
		}

	} catch (Exception|Error e) {
		throw (e);
	}
}

//=================================================================================================================================
//FunctionName 		: RMA_CodeRelationshipAddition_Utility
//Description  		: Enables The User To Do Code Relationship
//Input Parameter 	: LstRelationshipType, LstRelationshipSubType, ClaimType,LstAvailable
//		  			 AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//					 Pass "NA" or 00 for optional parameter	
//Revision			: 0.0 - RenuVerma-01-13-2017     
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ==================================================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present

public static void RMA_CodeRelationshipAddition_Utility(String LstRelationshipType, String LstRelationshipSubType, String ClaimType,String LstAvailable,boolean AdditionalParameter,int logval) throws Exception, Error
{

	try {

		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO, "User can do code Relationship ");
	}
	else
	{	
		logger = reports.startTest("<span id='CodeRelationship'> Code Relationship  </span>", "User can do code Relationship ");
	}
	RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-Managers-CodeRelationships", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("CodeRelationships");
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_RelationshipType(driver), LstRelationshipType, "Relationship Type List", "Code Relationships Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_RelationshipSubType(driver)));
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_RelationshipSubType(driver),LstRelationshipSubType, "Relationship SubType List", "Code Relationships Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_ClaimType(driver)));
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_ClaimType(driver), ClaimType, "Claim Type List", "Code Relationships Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_Available(driver)));
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_Available(driver), LstAvailable, "Available List", "Code Relationships Page", logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Managers.RMAApp_Managers_Btn_Generic(driver, ">"), "'>' Button On Code Relationships Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_Related(driver)));
	RMA_Verification_Utility.RMA_VerifySingle_MultipleWebListData(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_Related(driver), LstAvailable, "Related List", logval);
	RMA_Functionality_Utility.RMA_GenericSave_Utility("CodeRelationships", false, "NA", "Code Relationships Page", logval);

	if(logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "Code Relationship Done Successfully");
	}
	else
	{
		logger.log(LogStatus.PASS, "Code Relationship Done Successfully");
		}


	} catch (Exception|Error e) {
		throw (e);
	}
}

//====================================================================================================
//FunctionName 		: RMA_LossCodeMapping_Utility
//Description  		: Enables The User Do Loss Code Mapping For given Coverage And LOB
//Input Parameter 	: LstPolicySystemNames, PolicyLOB, Coverage, LossCode
//		  			 AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//Revision			: 0.0 - RenuVerma-01-13-2017                    
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ====================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present

public static void RMA_LossCodeMapping_Utility(String LstPolicySystemNames, String PolicyLOB, String Coverage,String LossCode,boolean AdditionalParameter,int logval) throws Exception, Error
{

	try {

		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO,"User can do Loss Code Mapping ");
	}
	else
	{	
		logger = reports.startTest("<span id='LossCodeMapping'> Loss Code Mapping </span>", "User can do Loss Code Mapping ");
	}
	RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-Managers-LossCodeMapping", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("LossCodeMapping");
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_PolicySystemNames(driver), LstPolicySystemNames, "Policy System Name List", "Loss Code Mapping Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_PolicyLOB(driver)));
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_PolicyLOB(driver),PolicyLOB, "Policy LOB List", "Loss Code Mapping Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_CoverageType(driver)));
	RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_CoverageType(driver), Coverage, "Coverage Type List", "Loss Code Mapping Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_RMALossCode(driver)));
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_RMALossCode(driver), LossCode, "RMA Loss Of Code List", "Loss Code Mapping Page", logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Managers.RMAApp_Managers_Btn_Generic(driver, "Add Mapping"), "'Add Mapping' Button On Loss Code Mapping Page", logval);
	RMA_Verification_Utility.RMA_VerifyRowDataForTwoColTablePartially(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Tbl_LossCode(driver),LstPolicySystemNames,  PolicyLOB, Coverage, 4, "Loss Code Mapping Table", logval);

	if(logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "Done Loss Code Mapping Successfully With Loss Code:" + " " + color.RMA_ChangeColor_Utility(LossCode,3));
	}
	else
	{
		logger.log(LogStatus.PASS, "Done Loss Code Mapping Successfully With Loss Code:" + " " + color.RMA_ChangeColor_Utility(LossCode,3));
		}


	} catch (Exception|Error e) {
		throw (e);
	}
}

//=============================================================================================================================================================================================
//FunctionName 		:RMA_FinancialKeySetup_Utility
//Description  		: Enables the User To Establish New Financial Key Set Up
//Input Parameter 	: SelectLOB: List Value of Select Line Of Business, SelectPolicyLOB: List Value of Select Policy LOB, PolicyDetailOnTable: Policy Detail On Table, PolicyLOB
//		  			 AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//Revision			: 0.0 - RenuVerma-01-13-2017    
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ==================================================================================================================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present

public static void RMA_FinancialKeySetup_Utility(String SelectLOB, String SelectPolicyLOB, String PolicyDetailOnTable,String PolicyLOB,boolean AdditionalParameter,int logval) throws Exception, Error
{
	String PrimaryWindowHandle;

	try {

		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO, "Enables the User To Establish New Financial Key Set Up ");
	}
	else
	{	
		logger = reports.startTest("<span id='FinancialKey'>Financial Key Setup</span>", "Enables the User To Establish New Financial Key Set Up");
	}
	RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-Managers-FinancialkeySetup", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financial key Setup");
	RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Rdb_FilterFinancial(driver, "Policy LOB"), "checked", "Policy LOB RadioButton On Financial Key Setup Page", logval);
	//RMA_Verification_Utility.RMA_TextCompare("1",RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Rdb_FilterFinancial(driver, "Policy LOB").getAttribute("value"), "Policy LOB RadioButton Value", logval);
	PrimaryWindowHandle=driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Img_New(driver),"New Image on Financial Key Setup Page", logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();

	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Lst_SelLOB(driver), SelectLOB, "Select Line of Business List ", "Financial Key Setup Page", logval);
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Lst_SelPolicyLOB(driver), SelectPolicyLOB, "Select Policy LOB List ", "Financial Key Setup Page", logval);
	RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_ReserveType(driver), "checked", "Reserve Type Checkbox On Financial Key Setup Page", logval);
	if( SelectLOB.contains("GC")){				
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_Claimant(driver), "check", "Claimant Checkbox", "Financial Key Setup Page", logval);
	}
	if( SelectLOB.contains("WC")){			
		RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_Claimant(driver), "checked", "Claimant Checkbox On Financial Key Setup Page", logval);
	}
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_ResSubType(driver), "uncheck", "Reserve-Sub Type Checkbox", "Financial Key Setup Page", logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_PolicyUnitCoverage(driver), "check", "Policy/Unit/Coverage Checkbox", "Financial Key Setup Page", logval);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_LossDisablityType(driver), "check", "Loss/Disablity Type Checkbox", "Financial Key Setup Page", logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Financial Key Setup Page", logval);
	driver.switchTo().window(PrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financial key Setup");

	RMA_Verification_Utility.RMA_VerifyRowDataForTwoColTablePartially(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Tbl_FinancialKeyGrid(driver), PolicyDetailOnTable,"False", PolicyLOB,2,"Financial Key Setup Table", logval);// Verify Policy LOB is available on  Financial Key Setup Table
	if(logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "Done Financial Key Setup Successfully");
	}
	else
	{
		logger.log(LogStatus.PASS, "Done Financial Key Setup Successfully");
		}


	} catch (Exception|Error e) {
		throw (e);
	}
}
//============================================================================================================================
//FunctionName 		: RMA_PrintPreview_Utility
//Description  		: Enables The User To Do Print Preview
//Input Parameter 	: PDFPassword,VerificationText: User Can Pass Multiple Verification Text Separated By ";"
//		  			 AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//Revision			: 0.0 - RenuVerma-01-23-2017         
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ============================================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present
public static void RMA_PrintPreview_Utility( String PDFPassword, String PdfSaveOpenOption, String VerificationText, boolean AdditionalParameter,int logval) throws Exception, Error
{
	String SecWindowHandle;
	String[] TextToBeVerified;
	Screen screen=new Screen();// Declare a Sikuli Screen 
	String FileName;
	FileName="TestFile"+RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility()+RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility();// Create Unique File Name
	PDFTextStripper pdfStripper = null;   
	PDDocument pdDoc = null;
	COSDocument cosDoc = null;
	String parsedText = null;
	Robot robot=new Robot();
	String PhysicalPath=System.getProperty("user.dir")+"\\RMATestInputFile\\DownloadTestFile\\"+FileName;// File Location to Store the File
	System.out.println("PhysicalPath"+PhysicalPath);
	TextToBeVerified=VerificationText.split(";");// Value should be separated by ';'
try {

	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, "User can do Print Preview For A Transaction ");
	}
	else
	{	
		logger = reports.startTest("<span id='PrintPreview'>Print Preview Of A Trasaction</span>", "User can do Print Preview For A Transaction");
	}
	String CurrentFrameId= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_PrintPreview(driver), "Print Preview Image On Transation Page", logval);// Click on Print Preview image
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PrintCheck.RMAApp_Print_Btn_Cancel(driver), "Cancel Button On Print Check Page", logval);// To Check the Cancel Button Functionality
	driver.switchTo().window(StrRMAWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameId);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_PrintPreview(driver), "Print Preview Image On Transation Page", logval);//again Click on Print Preview image
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	driver.manage().window().maximize(); //Maximizing The RMA Application Login Page
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PrintCheck.RMAApp_Print_Btn_PrintPreview(driver)));// Wait for Print Preview button on Print Check 1st browser
	SecWindowHandle=driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PrintCheck.RMAApp_Print_Btn_PrintPreview(driver), "Print Preview Button On Print Check Page", logval);// Click Preview button on Print Check 1st browser
	RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, SecWindowHandle, "NA", "NA", "NA", "Print Check Top Window", logval);// Switch to  Print Check 2nd browser
	driver.manage().window().maximize(); //Maximizing The RMA Application Login Page
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PrintCheck.RMAApp_Print_Lnk_Check(driver)));// Wait for Check Link on Print Check 2nd browser
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PrintCheck.RMAApp_Print_Lnk_Check(driver), "Check Link On Print Check Page", logval);// Click Check Link on Print Check 2nd browser
/*
	if(RMAApp_BrowserName.equalsIgnoreCase("IE"))// when IE browser driver is Used
	{
		// View Downloads Window Popup is appearing 
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added for View Downloads Window Popup");
		RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_Downloads_Btn_ClearList(), "Clear List Button on  Downloads Window Popup", logval);//Clear The List so that not more than one SaveAs arrow appear on  Download Screen
		if(PdfSaveOpenOption.equalsIgnoreCase("Save")){
			RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_Downloads_Btn_SaveOptionArrow(), "Save Arrow Button on View Downloads Window Popup", logval);// Click On Save Arrow
			RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_Downloads_Btn_SaveAs(), "Save As Button on View Downloads Window Popup", logval);	// Click On Save As Button
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Save As Window Popup Appeared");
			RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath);			
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As File Is Getting Saved");
		}
		RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_Download_Btn_Open(), "Open Button on View Downloads Window Popup", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As File Is Getting Downloaded");
	}
	if(RMAApp_BrowserName.equalsIgnoreCase("Chrome"))//  when Chrome driver is Used
	{
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As File Is Getting Downloaded");
		RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_PdfIcon(), "Downloaded PDF File Icon on Chrome Browser", logval);
	}
	*/
	
		//Save Automatically PDF File after clicking link the On IE Browser  
		if(RMAApp_BrowserName.equalsIgnoreCase("IE")&&  (screen.exists(RMA_Selenium_POM_Sikuli_Images.RMAApp_Download_Btn_Open())!=null))// when IE browser driver is Used
		{
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Open Button Is appeared On IE Notification Popup");
			RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_Download_Btn_Open(), "Open Button On IE Notification Popup", logval);// On the nOtification bar click Open Image 
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As PDF Is Getting Opened");
			if(!PDFPassword.equalsIgnoreCase("NA")){// If Pdf Is Password Protected
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PDF Authentication Popup Is Getting Opened");
				
				RMA_Input_Utility.RMA_ActionSendKeys_Utility(PDFPassword, "Password TextBox on PDF Authentication Popup", logval);
				//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_PDF_Txt_Password(), "Password TextBox on PDF Authentication Popup", logval);
				screen.type(PDFPassword);	// Enter The password
				if(logval == 0)
				{
					parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
				}
				else
				{
					logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
				}
				RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Typed Password On TextBox Successfully");
				//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_SaveAsPopUp_Btn_OK(), "Ok Button on PDF Authentication Popup", logval);	// Ok Is Clicked
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
			//Save Through Robot class
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath);// Give the File Location on Save As Popop
			if(logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Provided File Is Save Successfully On Path :" +" " + color.RMA_ChangeColor_Utility(PhysicalPath , 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided File Is Save Successfully On Path :" +" " + color.RMA_ChangeColor_Utility(PhysicalPath , 4));
			}
			Thread.sleep(5000);
			// Closs PDF after Save 
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_F4);
			robot.keyRelease(KeyEvent.VK_F4);
			robot.keyPress(KeyEvent.VK_Q);
			robot.keyRelease(KeyEvent.VK_Q);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		//Save Automatically PDF File after clicking link the On Chrome Browser  
		else if(RMAApp_BrowserName.equalsIgnoreCase("Chrome") && (screen.exists(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_PdfIcon())!=null))//  when Chrome driver is Used
		{
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As File Is Getting Downloaded");
			RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_PdfIcon(), "Downloaded PDF File Icon on Chrome Browser", logval);// Click Pdf Image below of the browser
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As PDF Is Getting Opened");
			if(!PDFPassword.equalsIgnoreCase("NA")){// If Pdf Is Password Protected
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PDF Authentication Popup Is Getting Opened");
				
				RMA_Input_Utility.RMA_ActionSendKeys_Utility(PDFPassword, "Password TextBox on PDF Authentication Popup", logval);
				//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_PDF_Txt_Password(), "Password TextBox on PDF Authentication Popup", logval);
				screen.type(PDFPassword);	// Enter The password
				if(logval == 0)
				{
					parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
				}
				else
				{
					logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
				}
				RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Typed Password On TextBox Successfully");
				//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_SaveAsPopUp_Btn_OK(), "Ok Button on PDF Authentication Popup", logval);	// Ok Is Clicked
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
			//Save Through Robot class
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath);// Give the File Location on Save As Popop
			if(logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Provided File Is Save Successfully On Path :" +" " + color.RMA_ChangeColor_Utility(PhysicalPath , 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided File Is Save Successfully On Path :" +" " + color.RMA_ChangeColor_Utility(PhysicalPath , 4));
			}
			Thread.sleep(5000);
			// Closs PDF after Save 
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_F4);
			robot.keyRelease(KeyEvent.VK_F4);
			robot.keyPress(KeyEvent.VK_Q);
			robot.keyRelease(KeyEvent.VK_Q);
			robot.keyRelease(KeyEvent.VK_CONTROL);					
		}


		//Save PDF File From Browser If PDF Opens on Browser Started Here
		else if(screen.exists(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_MoveToVisibleDownloadButton())!=null)//  when Chrome driver is Used
		{
			if(!PDFPassword.equalsIgnoreCase("NA")){// If Pdf Is Password Protected
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PDF Authentication Popup Is Getting Opened");
				RMA_Input_Utility.RMA_ActionSendKeys_Utility(PDFPassword, "Password TextBox on PDF Authentication Popup", logval);
				//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_PDF_Txt_Password(), "Password TextBox on PDF Authentication Popup", logval);
				screen.type(PDFPassword);	// Enter The password
				if(logval == 0)
				{
					parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
				}
				else
				{
					logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
				}
				RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Typed Password On TextBox Successfully");
				//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_SaveAsPopUp_Btn_OK(), "Ok Button on PDF Authentication Popup", logval);	// Ok Is Clicked
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As File Is Getting Downloaded");
			if(!PDFPassword.equalsIgnoreCase("NA")){// If Pdf Is Password Protected
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PDF Authentication Popup Is Getting Opened");
				RMA_Input_Utility.RMA_ActionSendKeys_Utility(PDFPassword, "Password TextBox on PDF Authentication Popup", logval);
				//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_PDF_Txt_Password(), "Password TextBox on PDF Authentication Popup", logval);
				screen.type(PDFPassword);	// Enter The password
				if(logval == 0)
				{
					parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
				}
				else
				{
					logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
				}
				RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Typed Password On TextBox Successfully");
				//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_SaveAsPopUp_Btn_OK(), "Ok Button on PDF Authentication Popup", logval);	// Ok Is Clicked
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
			RMA_Navigation_Utility.RMA_SikuliObjectMouseMove(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_MoveToVisibleDownloadButton(), "Move to View Download Icon On Chrome Browser", logval);// To Mouse Move On Top Of The PDF Browser to See the DownLoad Button
			RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_DownloadIcon(), "Download PDF File Icon on PDF Browser", logval);// Click On Download Button
			Thread.sleep(3000);
			RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath); // Give the File Location on Save As Popop
			Thread.sleep(5000);
			// Closs PDF after Save 
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_F4);
			robot.keyRelease(KeyEvent.VK_F4);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		// If Save As pop-up appears after link click
		else {
			Thread.sleep(3000);
			RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath);// Give the File Location on Save As Popop
			if(logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Provided File Is Save Successfully On Path :" +" " + color.RMA_ChangeColor_Utility(PhysicalPath , 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided File Is Save Successfully On Path :" +" " + color.RMA_ChangeColor_Utility(PhysicalPath , 4));
			}
			Thread.sleep(5000);
		}
		//Save PDF File From Browser Ended Here

		//PDF Reader Through PDFBox Started Here
		File file = new File(PhysicalPath+".pdf");
		PDFParser parser = new PDFParser(new FileInputStream(file));// Parser to Parse Input File
		parser.parse(); //Parse Input File
		cosDoc = parser.getDocument();
		
		pdfStripper = new PDFTextStripper(); // PDFTextStripper to text extraction
		pdfStripper.setStartPage(1);
		pdfStripper.setEndPage(1);
		pdDoc = new PDDocument(cosDoc);
		boolean isOriginalDocEncrypted = pdDoc.isEncrypted();
        if (isOriginalDocEncrypted) {
        	pdDoc.openProtection(new StandardDecryptionMaterial(PDFPassword));
        }
		parsedText = pdfStripper.getText(pdDoc);
		//PDF Reader Through PDFBox Ended Here

	

	for(String Text: TextToBeVerified)// Check Every Value
	{
		RMA_Verification_Utility.RMA_PartialTextVerification(String.valueOf(Text),parsedText, Text+" Value Verification On PDF", logval);// Verification done for String and int Both values
	}

	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PrintCheck.RMAApp_Print_Btn_OK(driver), "Ok Button On Print Check Page", logval);	     // Click Ok On 2nd Browser On Print Check
	driver.switchTo().window(StrRMAWindowHandle);
	driver.switchTo().window(SecWindowHandle);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PrintCheck.RMAApp_Print_Btn_Cancel(driver), "Cancel Button On Print Check Page", logval); // Click Cancel On 1st Browser On Print Check
	driver.switchTo().window(StrRMAWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameId);
	if(logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "Done Print Preview Fuctionality Successfully");
	}
	else
	{
		logger.log(LogStatus.PASS, "Done Print Preview Fuctionality Successfully");
	}


	} 
catch (IOException e) {
	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver,"PDF Content Verification Fail", "User Is Not Able To Verify PDF Content")));
	}else{	
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "PDF Content Verification Fail","User Is Not Able To Verify PDF Content")));
	}
	System.err.println("Unable to open PDF Parser. " + e.getMessage());
	try {
		if (cosDoc != null)
			cosDoc.close();
		if (pdDoc != null)
			pdDoc.close();
	} catch (Exception|Error e1) {
		if (logval == 0){
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver,"PDF Content Verification Fail", "User Is Not Able To Verify PDF Content")));
		}else{	
			logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "PDF Content Verification Fail","User Is Not Able To Verify PDF Content")));
		}
		throw (e1);
	}
	throw (e);
}

}
	


	

//===============================================================================================================
//FunctionName 		: RMA_PrintSummary_Utility
//Description  		: Enables The User To Verify Print Summary
//Input Parameter 	: VerificationText: User Can Pass Multiple Verification Text Separated By ";"
//		  			 AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//Revision			: 0.0 - RenuVerma-01-23-2017      
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
// ====================================================================================================
public static void RMA_PrintSummary_Utility( String VerificationText, boolean AdditionalParameter,int logval) throws Exception, Error
{
	String[] TextToBeVerified;
	Screen screen=new Screen();// Declare a Sikuli Screen 
	String FileName=null;
	FileName="TestFile"+RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "_PDF_")+RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility()+RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility();// Create Unique File Name
	PDFTextStripper pdfStripper = null;   
	PDDocument pdDoc = null;
	COSDocument cosDoc = null;
	String parsedText = null;
	Robot robot=new Robot();
	String PhysicalPath=System.getProperty("user.dir")+"\\RMATestInputFile\\DownloadTestFile\\"+FileName;// File Location to Store the File

	TextToBeVerified=VerificationText.split(";");// Value should be separated by ';'
try {

	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, "User Can Verify Print Summary For A Transaction ");
	}
	else
	{	
		logger = reports.startTest("<span id='PrintSummary'>Print Summary Of A Trasaction</span>", "User Can Verify Print Summary For A Transaction");
	}
	String PrimaryWindowHandle=driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_PrintSummary(driver), "Print Summary Image On Transation Page", logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	driver.manage().window().maximize(); //Maximizing The RMA Application Login Page
	//Save Automatically PDF File after clicking link the On IE Browser  
	if(RMAApp_BrowserName.equalsIgnoreCase("IE")&&  (screen.exists(RMA_Selenium_POM_Sikuli_Images.RMAApp_Download_Btn_Open())!=null))// when IE browser driver is Used
	{
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Open Button Is appeared On IE Notification Popup");
		RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_Download_Btn_Open(), "Open Button On IE Notification Popup", logval);// On the nOtification bar click Open Image 
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As PDF Is Getting Opened");
		//Save Through Robot class
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath);// Give the File Location on Save As Popop
		Thread.sleep(5000);
		// Closs PDF after Save 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyPress(KeyEvent.VK_Q);
		robot.keyRelease(KeyEvent.VK_Q);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	//Save Automatically PDF File after clicking link the On Chrome Browser  
	else if(RMAApp_BrowserName.equalsIgnoreCase("Chrome") && (screen.exists(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_PdfIcon())!=null))//  when Chrome driver is Used
	{
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As File Is Getting Downloaded");
		RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_PdfIcon(), "Downloaded PDF File Icon on Chrome Browser", logval);// Click Pdf Image below of the browser
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As PDF Is Getting Opened");
		//Save Through Robot class
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath);// Give the File Location on Save As Popop
		Thread.sleep(5000);
		// Closs PDF after Save 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyPress(KeyEvent.VK_Q);
		robot.keyRelease(KeyEvent.VK_Q);
		robot.keyRelease(KeyEvent.VK_CONTROL);					
	}
	//Save PDF File From Browser If PDF Opens on Browser Started Here
	else if(screen.exists(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_MoveToVisibleDownloadButton())!=null)//  when Chrome driver is Used
	{
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As File Is Getting Downloaded");
		RMA_Navigation_Utility.RMA_SikuliObjectMouseMove(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_MoveToVisibleDownloadButton(), "Move to View Download Icon On Chrome Browser", logval);// To Mouse Move On Top Of The PDF Browser to See the DownLoad Button
		RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_DownloadIcon(), "Download PDF File Icon on PDF Browser", logval);// Click On Download Button
		Thread.sleep(3000);
		RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath); // Give the File Location on Save As Popop
		Thread.sleep(5000);
		// Closs PDF after Save 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	// If Save As pop-up appears after link click
	else {
		Thread.sleep(3000);
		RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath);// Give the File Location on Save As Popop
		Thread.sleep(5000);
	}
	//Save PDF File From Browser Ended Here

	//PDF Reader Through PDFBox Started Here
	File file = new File(PhysicalPath+".pdf");
	PDFParser parser = new PDFParser(new FileInputStream(file));// Parser to Parse Input File
	parser.parse(); //Parse Input File
	cosDoc = parser.getDocument();
	pdfStripper = new PDFTextStripper(); // PDFTextStripper to text extraction
	pdfStripper.setStartPage(1);
	pdfStripper.setEndPage(1);
	pdDoc = new PDDocument(cosDoc);
	parsedText = pdfStripper.getText(pdDoc);
	//PDF Reader Through PDFBox Ended Here

	for(String Text: TextToBeVerified)// Check Every Value
	{
		RMA_Verification_Utility.RMA_PartialTextVerification(String.valueOf(Text),parsedText, Text+" Value Verification On PDF", logval);// Verification done for String and int Both values
	}
	driver.switchTo().window(PrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	if(logval == 0)
	{
		parentlogger.log(LogStatus.PASS, "Done Verification Of Print Summary Successfully");
	}
	else
	{
		logger.log(LogStatus.PASS, "Done Verification Of Print Summary Successfully");
		}


	} 
catch (Exception|Error e) {
		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver,"PDF Content Verification Fail", "User Is Not Able To Verify PDF Content")));
		}else{	
			logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "PDF Content Verification Fail","User Is Not Able To Verify PDF Content")));
		}
		System.err.println("Unable to open PDF Parser. " + e.getMessage());
		try {
			if (cosDoc != null)
				cosDoc.close();
			if (pdDoc != null)
				pdDoc.close();
		} catch (Exception|Error e1) {
			throw (e);
		}
		throw (e);
	}

}


//===============================================================================================================================================================================
//FunctionName 		: RMA_ReserveAddOnExternalPol_Utility_ACON
//Description  		:  Enables Users To Create Reserve On External Policy Attached Carrier Claim
//Input Parameter 	: PolicyName, LossType ,ReserveType, ReserveAmount, Status, DateEntered, StrExpReserveStatus, ExpBalAmt,  ExpIncAmt,  ExpPaidAmt,  ExpCollecAmt, 
//					  AdditionalParameter: Few Parameter which May Compulsory In Future,  logval 	 
//Revision			: 0.0 - RenuVerma-01-25-2017 
//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
//=================================================================================================================================================================================
public static void RMA_ReserveAddOnExternalPol_Utility_ACON(String PolicyName, String DistributionCategory,String LossType, String ReserveType, int ReserveAmount, String Status,String DateEntered, String StrExpReserveStatus, String ExpBalAmt, String ExpIncAmt, String ExpPaidAmt, String ExpCollecAmt,boolean AdditionParameter, int logval ) throws Exception, Error
{
	try 
	{
		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO,"A New Reserve Is Created On Carrier Claim With Attached External Policy");
	}
	else
	{	
		logger = reports.startTest("<span id='ReserveAddOnExternalPol'>Reserve Creation On Carrier Claim With Attached External Policy: "+PolicyName+"</span>", "A New Reserve Is Created On Carrier Claim With Attached External Policy");
	}

	String ClaimType= RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lbl_HeaderCaption(driver).getText();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Img_AddNewRsv(driver), "Add New Reserve Image On Financial Reserves Page",logval);
	driver.switchTo().frame(0); //A switch To The Frame Containing Add New Reserve Window Controls Is Done
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_ReserveType(driver)));
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_PolicyName(driver),PolicyName, "Policy Name List", "Add New Reserve Page", logval);// Select Policy
	//User Passed Nothing in Unit, Coverage and Loss Type in Case of External Policy Carrier Claim, It Select Value Automatically 
	// Loop To Select Unit Value From Which Corresponding Coverage Value Can Be Selected
	outerloop1:
		for(int i=1; ;i++)
		{
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_Unit(driver),i, "Unit List", "Add New Reserve Page",logval);// Select Unit Value One by One
			for(;;)
			{							
				Select Cov = new Select (RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_CoverageType(driver));// Check Coverage Field has Value Or Not.
				//Cov.selectByIndex(j);
				System.out.println(Cov.getOptions().size());
				if(Cov.getOptions().size()==1)// If Coverage Field does Not Have Any Value
					break;// Break From Inner loop And Select Another Unit Value.
				else if(Cov.getOptions().size()!=1)// If Coverage Field Have Any Value
					break outerloop1;// Break From Outer Loop Too 
			}
		}
	// Loop To Select Coverage Value From Which Corresponding LossType Value Can Be Selected
	outerloop2:	
		for(int j=1; ;j++)
		{
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_CoverageType(driver),j, "Coverage List", "Add New Reserve Page",logval);// Select Coverage Value One by One
			for(;;)
			{	
				if(ClaimType.contains("General Claim")){ // If Claim Type is General Claim			
					Select Loss = new Select (RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_LossType(driver));
					if(Loss.getOptions().size()==1)// If Loss Type Field does Not Have Any Value
						break; //Break From Inner loop And Select Another Coverage Value.
					else if(Loss.getOptions().size()!=1){// If Loss Type Field Have Any Value
						RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_LossType(driver),LossType, "Loss Type List", "Add New Reserve Page",logval);// Select MYCODE In Loss Type
						break outerloop2; // Break From Outer Loop Too 
					}
				}
				else if(ClaimType.contains("Worker")){	// If Claim Type is Workers' Comp Claim			
					Select DisabilityCat = new Select (RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_List_DisabilityCategory(driver));
					if(DisabilityCat.getOptions().size()==1)// If Loss Type Field does Not Have Any Value
						break; //Break From Inner loop And Select Another Coverage Value.
					else if(DisabilityCat.getOptions().size()!=1){// If Claim Type is General Claim	
						RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_List_DisabilityCategory(driver),DistributionCategory, "Disability Category", "Add New Reserve Page",logval);// Select Coverage Value One by One
						RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_DisabilityLossType(driver), "Disability Loss Type On Add New Reserve Page",LossType,logval);// Select MYCODE In Loss Type
						break outerloop2; // Break From Outer Loop Too 
					}
				}
			}
		}
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_List_ReserveType(driver),ReserveType, "Reserve Type List", "Add New Reserve Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver), "Reserve Amount Field On Add New Reserve Page", String.valueOf(ReserveAmount),logval);	
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_Status(driver), Status,"Status List Box","Add New Reserve Page",logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Text_DateEntered(driver), "Date Entered On Add New Reserve Page", DateEntered, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Is Clicked On Add New Reserve Window On Financial Reserves Page",logval);	
		//RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);// This is not used because Reserve frame is not having any ids
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Save Button Is Clicked On Reserve Creation Page Is Clicked");
		RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
		//Reserve Creation Is Completed Here

		driver.switchTo().parentFrame();
		if (RMAApp_BrowserName.equalsIgnoreCase("IE"))
		{
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
		}

		if (RMAApp_BrowserName.equalsIgnoreCase("Chrome"))
		{
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
		}
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
		//  Un-check Not Required Field From The Reserve Table
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Claimant")), "uncheck", "Claimant Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Reserve Sub Type")), "uncheck", "Reserve Sub Type Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Policy Name")), "uncheck", "Policy Name In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Unit")), "uncheck", "Unit In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Coverage Type")), "uncheck", "Coverage Type In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Loss Type")), "uncheck", "Loss Type In Column Selection List", "Reserves NG Grid Table",logval);

		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Reserve Table", ReserveType,logval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid

		WebElement ActualResType = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Reserve Type");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ReserveType, "Reserve Type On Reserves NG Grid On Financial Reserves Page", ActualResType, logval);
		//Verification Of Correct Reserve Type Being Displayed On Reserves NG Grid Is Done

		WebElement ActualBalAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Balance");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpBalAmt, "Reserve Balance Amount On Reserves NG Grid On Financial Reserves Page", ActualBalAmt, logval);
		//Verification Of Correct Reserve Balance Amount Being Displayed On Reserves NG Grid Is Done

		WebElement ActualPaidAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Paid");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpPaidAmt, "Reserve Paid Amount On Reserves NG Grid On Financial Reserves Page", ActualPaidAmt, logval);
		//Verification Of Correct Reserve Paid Amount Being Displayed On Reserves NG Grid Is Done

		WebElement ActualCollecAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Collection");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpCollecAmt, "Reserve Collection Amount On Reserves NG Grid On Financial Reserves Page", ActualCollecAmt, logval);
		//Verification Of Correct Reserve Collection Amount Being Displayed On Reserves NG Grid Is Done

		WebElement ActualIncAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Incurred");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpIncAmt, "Reserve Incurred Amount On Reserves NG Grid On Financial Reserves Page", ActualIncAmt, logval);
		//Verification Of Correct Reserve Incurred Amount Being Displayed On Reserves NG Grid Is Done

		// Focus was getting lost on checking check-boxes which are not directly with in view and needs to be scrolled. Hence taken alternative logic to verify the reserve status.
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
		//  Un-check Not Required Field From The Reserve Table
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Balance")), "uncheck", "Balance Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Paid")), "uncheck", "Paid Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Collection")), "uncheck", "Collection In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Incurred")), "uncheck", "Incurred In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);

		WebElement ActualResStatus = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Status");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpReserveStatus, "Reserve Status On Reserves NG Grid On Financial Reserves Page", ActualResStatus, logval);
		//Verification Of Correct Status Being Displayed On Reserves NG Grid Is Done

		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "A New Reserve Is Created On Carrier Claim With Attached External Policy Successfully With Reserve Balance Amount:" + " " + color.RMA_ChangeColor_Utility(ExpBalAmt,3));
		}
		else
		{
			logger.log(LogStatus.PASS, "A New Reserve Is Created On Carrier Claim With Attached External Policy Successfully With Reserve Balance Amount:" + " " + color.RMA_ChangeColor_Utility(ExpBalAmt,3));
			}

	}
	catch (Exception|Error e) 
	{
		throw (e);
	}

}
//==================================================================================================================================================================================================
//FunctionName 		: RMA_PIAddExistingEntity_Utility
//Description  		: Enables The User To Add Existing Entity Like Employee, Medical From The Person Involved Screen To The RMA Application   
//Input Parameter 	: Entity: Case Variable Determining Which Existing Entity Is To Be Created, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
//Revision			: 0.0  MahendraPSingh-01-31-2017      
//Modified By		: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
//===================================================================================================================================================================================================
public static void RMA_PIAddExistingEntity_Utility(String Entity, String EntityLastName, String EntityNumber, int logval) throws Exception, Error
{
	String StrPrimaryWindowHandle;
	String EntityNumber_Actual;
	String EntityLastName_Actual;
	try 
	{
		logger = reports.startTest("<span id='PIAddExistingEntity'>Existing PI Entity Addition</span>", "An Existing Entity Of Type" + " "+ Entity+" "+ "From Person Involved Screen To RMA Application");

	switch (Entity){
	case "Employee":
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Employee"), "Employee Under Add Existing menu On Person Involved SubMenu", logval);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchEmployee_Txt_EmployeeNumber(driver), "Claim-->PI-->Search-->Existing Employee Criteria Page","Employee Number Text Box", EntityNumber, EntityNumber, "piemployee", StrPrimaryWindowHandle, logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Searched Employee record to be load on Employee Involved screen");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("piemployee",false,"NA", "Persons Involved-->Employee Page", logval);
		EntityNumber_Actual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PersonInvolved.RMAApp_PIEmp_Txt_EmpNumber(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNumber, EntityNumber_Actual, "EmployeeNumber", logval);
		break;

	case "Driver":
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, Entity), "Driver Under Add Existing Menu On Persons Involved Submenu", logval);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchDriver_Txt_DriverLastName(driver), "Claim-->PI-->Search-->Existing Driver Criteria Page","Driver Last Name Text Box", EntityNumber, EntityNumber, "pidriver", StrPrimaryWindowHandle, logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Searched Driver record to be load on Driver Involved screen");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("pidriver", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);				
		EntityLastName_Actual =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintDriver_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityLastName, EntityLastName_Actual,"Driver Last Name Value", logval);
		break;

	case "Patient":
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, Entity), "Patient Under Add Existing Menu On Persons Involved Submenu", logval);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchPatient_Txt_PatientLastName(driver), "Claim-->PI-->Search-->Existing Patient Criteria Page","Patient Last Name Text Box", EntityLastName, EntityLastName, "pipatient", StrPrimaryWindowHandle, logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Searched Patient record to be load on Patient Involved screen");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("pipatient", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);	
		EntityLastName_Actual =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityLastName, EntityLastName_Actual, "Patient Last Name Value", logval);
		break;

	case "Physician":		
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, Entity), "Physician Under Add Existing Menu On Persons Involved Submenu", logval);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchPhysician_Txt_LastName(driver), "Claim-->PI-->Search-->Existing Physician Criteria Page","Physician Last Name Text Box", EntityNumber, EntityNumber, "piphysician", StrPrimaryWindowHandle, logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Searched Physician record to be load on Physician Involved screen");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("piphysician", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);					
		EntityNumber_Actual =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNumber, EntityNumber_Actual, "Physician Last Name Value", logval);
		break;

	case "Witness":
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, Entity), "Witness Under Add Existing Menu On Persons Involved Submenu", logval);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchEntity_Txt_LastName(driver), "Claim-->PI-->Search-->Existing Witness Criteria Page","Witness Last Name Text Box", EntityNumber, "Witness", "piwitness", StrPrimaryWindowHandle, logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added for searched Witness record to be load on Witness Involved screen");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("piwitness", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
		EntityLastName_Actual =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityLastName, EntityLastName_Actual,"Witness Last Name Value", logval);
		break;

	case "Medical Staff":
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, Entity), "Medical Staff Under Add Existing Menu On Persons Involved Submenu", logval);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_Search_Txt_MedicalStaffLastName(driver), "Claim-->PI-->Search-->Existing Med Staff Criteria Page","Med. Staff Last Name Text Box", EntityLastName, EntityLastName, "pimedstaff", StrPrimaryWindowHandle, logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Searched Medical Staff record to be load on Medical Staff Involved screen");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("pimedstaff", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);						
		EntityLastName_Actual =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintMedStaff_Txt_LstName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityLastName, EntityLastName_Actual , "Medical Staff Name Value", logval);
		break;

	case "Other Person":
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, Entity), "Other Person Under Add New Menu On Persons Involved Submenu", logval);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchEntity_Txt_LastName(driver), "Claim-->PI-->Search-->Existing Other Person Criteria Page","Other Person Last Name Text Box", EntityNumber, EntityNumber, "piother", StrPrimaryWindowHandle, logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added for searched Other Person record to be load on Other Person Involved screen");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("piother", false, "NA",  "Person Involved --> " + Entity+ " Page", logval);
		EntityLastName_Actual =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityLastName, EntityLastName_Actual,"Other People Last Name Value", logval);
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

	} catch (Exception|Error e) 
	{
		throw (e);
	}
}

//====================================================================================================
//FunctionName 		:RMA_SMSUserAddEditDelete_Utility
//Description  		: Enables the User To Add/Edit/Delete A User From SMS
//Input Parameter 	: UserFirstName,  UserLastName,  LinkName: Which link needs to click, UserManager: Passed Manager Name Value Either by Index Or By String value,UserEmail, AccessSMSStatus: check/uncheck, AccessUSPStatus:check/uncheck, DSNName,
//		  			 	 		 AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//								Pass "NA" or 00 for optional parameter	
//Revision			: 0.0 - RenuVerma-03-01-2017                       
//Modified By			: 0.0 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info   
//====================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present
public static void RMA_SMSUserAddEditDelete_Utility(String Case,String UserFirstName, String UserLastName,String LinkName, Object UserManager,String UserEmail, String UserCountry,String AccessSMSStatus,String AccessUSPStatus,String DSNName,String ModuleName, String ChangeModGroupAsso, boolean AdditionalParameter,int logval) throws Exception, Error
{
	try {

		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO,"Enables the User To "+Case+" User On SMS Page ");
	}
	else
	{	
		logger = reports.startTest("<span id='SMSUserAddEditDelete'>"+Case+" User On SMS</span>", "Enables the User To "+Case+" User On SMS Page ");
	}
	
	switch (Case){
	case "Add":				
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_AddNewUser(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_AddNewUser(driver), "Add New User Button On Security Management System Page", logval);
			
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_FirstName(driver), "First Name TextBox On  Security Management System Page ", UserFirstName, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_LastName(driver), "Last Name TextBox On  Security Management System Page ", UserLastName, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_Email(driver), "Email TextBox On  Security Management System Page ", UserEmail, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_Country(driver), "Country TextBox On  Security Management System Page ", UserCountry, logval);
		if(UserManager.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Lst_Manager(driver), (int)UserManager, "Manager List", "Security Management System Page", logval);
		}
		if(UserManager.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Lst_Manager(driver), UserManager.toString(), "Manager List", "Security Management System Page", logval);
		}
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_AccessSMS(driver), AccessSMSStatus, "Permit to access Security Management System CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_AccessUSP(driver), AccessUSPStatus, "Permit to access User Privileges Setup CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Allowed/Assigned Data-Sources to Login"), "Allowed/Assigned Data-Sources to Login Tab On Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_RadioButtonSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Rdo_DSNSelection(driver, DSNName), DSNName+" Radio Option Under Allowed/Assigned Data-Sources to Login Tab On Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Lst_AgsndUserToModuleGroup(driver)));
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Txt_LoginName(driver), "Login Name TextBox On  Security Management System Page ", UserFirstName, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Txt_Password(driver), "Password TextBox On  Security Management System Page ", UserFirstName, logval);
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Lst_AgsndUserToModuleGroup(driver), ModuleName, "Assign User To Module Group WebList", "Security Management System Page", logval);
		if(ChangeModGroupAsso.equalsIgnoreCase("Yes")){
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Ok(driver), "Ok Image Of The Warning Popup On Security Management System Page", logval);
		}
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName), LinkName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "A New User Is Added Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFirstName,3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Added User On SMS Page", "AddUser")));
		}
		else
		{
			logger.log(LogStatus.PASS, "A New User Is Added Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFirstName,3));
			logger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Added User On SMS Page", "AddUser")));
		}
		break;

	case "Edit":
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//Security Management System Page Is Refreshed To Restore The Default State
		
		//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users")));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"),"Expand Image Of Users Link From Left Navigation Menu Bar On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName),LinkName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUser(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUser(driver),"Edit User Image From User Setting On Security Management System Page",logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_FirstName(driver), "First Name TextBox On  Security Management System Page ", UserFirstName, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_LastName(driver), "Last Name TextBox On  Security Management System Page ", UserLastName, logval);
		if(UserManager.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Lst_Manager(driver), (int)UserManager, "Manager List", "Security Management System Page", logval);
		}
		if(UserManager.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Lst_Manager(driver), UserManager.toString(), "Manager List", "Security Management System Page", logval);
		}
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_AccessSMS(driver), AccessSMSStatus, "Permit to access Security Management System CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_AccessUSP(driver), AccessUSPStatus, "Permit to access User Privileges Setup CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		
		//Updated on 05042017 after build deployment Started
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"),"Collapsed Image Of Users Link From Left Navigation Menu Bar On Security Management System Page",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName),"Expand Image Of "+DSNName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName),UserFirstName+" "+UserLastName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit Image From User Access Permissions On Security Management System Page",logval);
		//Updated on 05042017 after build deployment Ended
		
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Lst_AgsndUserToModuleGroup(driver)));
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Txt_LoginName(driver), "Login Name TextBox On  Security Management System Page ", UserLastName, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Txt_Password(driver), "Password TextBox On  Security Management System Page ", UserLastName, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
	
		//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName), UserFirstName+" "+UserLastName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		if(logval == 0)	
		{
			parentlogger.log(LogStatus.PASS, "A User Is  Edited Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFirstName,3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Edited User On SMS Page", "EditUser")));
		}
		else
		{
			logger.log(LogStatus.PASS, "A User Is Edited Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFirstName,3));
			logger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Edited User On SMS Page", "EditUser")));
		}
		break;

	case "Delete":
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//Security Management System Page Is Refreshed To Restore The Default State
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"),"Expand Image Of Users Link From Left Navigation Menu Bar On Security Management System Page",logval);
		// Users Link Is Expanded
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName),LinkName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		//String ToolTipMessageOnEdit=RMA_GenericUsages_Utility.RMA_GetToolTip_Info(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver), logval);
		//RMA_Verification_Utility.RMA_TextCompare("Delete Selected Item", ToolTipMessageOnEdit, "Tool Tip Message On Delete Button ", logval);
		RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver), "Delete Selected Item", "Tool Tip Message On Delete Button", logval);
	
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver),"Delete Selected Item Image On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver)));
		RMA_Verification_Utility.RMA_ElementExist_Utility( RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Are you sure you want to delete the selected item ?"), "Delete Message On Delete Model Popup", logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver) , "Delete Button On Delete Model Popup", logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility( RMA_Selenium_POM_SMS.RMAApp_SMSModelPopup_Btn_Cancel(driver), "Cancel Button On Delete Model Popup", logval);
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver), "Delete Button On Delete Popup Of The Security Management System Page", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//RMA_Verification_Utility.RMA_VerifyUXErrorMessage("Selected item deleted successfully.", false, "Security Management System Page", logval);
		//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users")));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"), "Users Expand Image From Left Navigation Menu Of Security Management System Page", logval);
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver,  LinkName),  LinkName + " Link From Left Menu Of Security Management System Page", logval);

		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "A User Is Deleted Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFirstName,3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Deleted User On SMS Page", "DeleteUser")));
		}
		else
		{
			logger.log(LogStatus.PASS, "A User Is Deleted Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFirstName,3));
			logger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Deleted User On SMS Page", "DeleteUser")));
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
	} catch (Exception|Error e) {
		throw (e);
	}
}	

//=======================================================================================================================================================================================================
//FunctionName 		: RMA_MaintAdminTrackingAddition_Utility
//Description  		: Enables The User To Add Admin Tracking Type Like Bond Abstarct, Directory etc. From The Maintenance -> Admin tracking Screen To The RMA Application   
//Input Parameter 	: Entity: Case Variable Determining Which Admin Tracking Is To Be Created, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
//Revision			: 0.0 - MahendraPSingh -03-01-2016         
//===================================================================================================================================================================================================

public static String RMA_MaintAdminTrackingAddition_Utility(String TrackingType, int logval) throws Exception, Error
{
	try {
		
	logger = reports.startTest("<span id='Admin Tracking Add'>Addition Of "+ TrackingType +" Admin Tracking Type</span>", "A New Admin Tracking Of Type:" + " "+ TrackingType+" "+ "Is Added From Maintenance> Admin Tracking Screen To RMA Application");
	int EntityNumber; // Numeric Part Of The Entity Is Fetched In This Variable
	String EntityNum; //Tracking Type Name Is Fetched In This Variable

	switch (TrackingType){
	case "BondAbstract":
		RMA_MenuOptionClick_Utility("Maintenance-AdminTracking", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("admintrackinglist"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance--> Admin Tracking Frame Is Done");
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Lnk_LinkName(driver, "Bond Abstract"), "Bond Abstract Link Under Maintenance-->Admin Tracking Page Menu", logval);
		EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999);
		EntityNum = "Bond_" + EntityNumber;
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_BondAbstract_BondNumber(driver), "Bond Number TextBox On Maintenance--> Admin Tracking-> Bond Abstract Page", EntityNum, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button Is Clicked On Admin Tracking-> Bond Abstract Page",logval);				
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Admin Tracking-->  Bond Abstarct Is Saved");
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",logval);
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_BondAbstract_BondNumber(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Bond Number Value", logval);
		driver.switchTo().parentFrame();
		break;

	case "CertificateTracking":
		RMA_MenuOptionClick_Utility("Maintenance-AdminTracking", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("admintrackinglist"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance--> Admin Tracking Frame Is Done");
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Lnk_LinkName(driver, "Certificate Tracking"), "Certificate Tracking Link Under Maintenance-->Admin Tracking Page Menu", logval);
		EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999);
		EntityNum = "Job_" + EntityNumber;
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_CertificateTracking_JobNumber(driver), "Job Number TextBox On Maintenance--> Admin Tracking-> Certificate Tracking Page", EntityNum, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button Is Clicked On Admin Tracking-> Certificate Tracking Page",logval);				
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Admin Tracking-->  Certificate Tracking Is Saved");
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",logval);	
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_CertificateTracking_JobNumber(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Job Number Value", logval);
		driver.switchTo().parentFrame();
		break;

	case "ComplaintManagement":
		RMA_MenuOptionClick_Utility("Maintenance-AdminTracking", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("admintrackinglist"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance--> Admin Tracking Frame Is Done");
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Lnk_LinkName(driver, "Complaint Management"), "Complaint Management Link Under Maintenance-->Admin Tracking Page Menu", logval);
		EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999);
		EntityNum = "Complaint_" + EntityNumber;
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_ComplaintManagement_ComplaintNumber(driver), "Complaint Number TextBox On Maintenance--> Admin Tracking-> Complaint Management Page", EntityNum, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button Is Clicked On Admin Tracking-> Complaint Management Page",logval);				
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Admin Tracking-->  Complaint Management Is Saved");
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",logval);	
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_ComplaintManagement_ComplaintNumber(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Complaint Number Value", logval);
		driver.switchTo().parentFrame();
		break;

	case "ContractManagement":
		RMA_MenuOptionClick_Utility("Maintenance-AdminTracking", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("admintrackinglist"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance--> Admin Tracking Frame Is Done");
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Lnk_LinkName(driver, "Contract Management"), "Contract Management Link Under Maintenance-->Admin Tracking Page Menu", logval);
		EntityNum = "FM";
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_ContractManagement_ContractType(driver), "Contract Type TextBox On Maintenance--> Admin Tracking-> Contract Management Page", EntityNum, logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Contract Type Is Selected");
		EntityNum =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_ContractManagement_ContractType(driver), "value");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button Is Clicked On Admin Tracking-> Contract Management Page",logval);				
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Admin Tracking-->  Contract Management Is Saved");
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",logval);	
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_ContractManagement_ContractType(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Contract Type Value", logval);
		driver.switchTo().parentFrame();
		break;

	case "Directory":
		RMA_MenuOptionClick_Utility("Maintenance-AdminTracking", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("admintrackinglist"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance--> Admin Tracking Frame Is Done");
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Lnk_LinkName(driver, "Directory"), "Directory Link Under Maintenance-->Admin Tracking Page Menu", logval);
		EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999);
		EntityNum = "LastName_" + EntityNumber;
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_Directory_LastName(driver), "Last Name TextBox On Maintenance--> Admin Tracking-> Directory Page", EntityNum, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button Is Clicked On Admin Tracking-> Directory Page",logval);				
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Admin Tracking-->  Directory Is Saved");
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",logval);					
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_Directory_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Last Name Value", logval);
		driver.switchTo().parentFrame();
		break;

	case "HazardousMaterials":
		RMA_MenuOptionClick_Utility("Maintenance-AdminTracking", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("admintrackinglist"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance--> Admin Tracking Frame Is Done");
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Lnk_LinkName(driver, "Hazardous Materials"), "Hazardous Materials Link Under Maintenance-->Admin Tracking Page Menu", logval);
		EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999);
		EntityNum = "Product_" + EntityNumber;
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_HazardousMaterials_ProductName(driver), "Product Name TextBox On Maintenance--> Admin Tracking-> Hazardous Materials Page", EntityNum, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button Is Clicked On Admin Tracking-> Hazardous Materials Page",logval);				
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Admin Tracking-->  Hazardous Materials Is Saved");
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",logval);					
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_HazardousMaterials_ProductName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Product Name Value", logval);
		driver.switchTo().parentFrame();
		break;

	case "ProjectTracking":
		RMA_MenuOptionClick_Utility("Maintenance-AdminTracking", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("admintrackinglist"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance--> Admin Tracking Frame Is Done");
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Lnk_LinkName(driver, "Project Tracking"), "Project Tracking Link Under Maintenance-->Admin Tracking Page Menu", logval);
		EntityNum = "ADM";
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_ProjectTracking_ActivityType(driver), "Activity Type TextBox On Maintenance--> Admin Tracking-> Hazardous Materials Page", EntityNum, logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Activity Type Is Selected");
		EntityNum =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_ProjectTracking_ActivityType(driver), "value");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button Is Clicked On Admin Tracking-> Project Tracking Page",logval);				
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Admin Tracking-->  Project Tracking Is Saved");
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",logval);					
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_ProjectTracking_ActivityType(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Activity Type Value", logval);
		driver.switchTo().parentFrame();
		break;

	case "PropertyManagement":
		RMA_MenuOptionClick_Utility("Maintenance-AdminTracking", logval);
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("admintrackinglist"));
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Maintenance--> Admin Tracking Frame Is Done");
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Lnk_LinkName(driver, "Property Management"), "Property Management Link Under Maintenance-->Admin Tracking Page Menu", logval);
		EntityNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999);
		EntityNum = "Property_" + EntityNumber;
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_PropertyManagement_PropertyId(driver), "Property Id TextBox On Maintenance--> Admin Tracking-> Hazardous Materials Page", EntityNum, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button Is Clicked On Admin Tracking-> Property Management Page",logval);				
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Admin Tracking-->  Property Management Is Saved");
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",logval);					
		EntName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance_AdminTracking.RMAApp_MaintAdminTracking_Txt_PropertyManagement_PropertyId(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(EntityNum, EntName, "Property ID Value", logval);
		driver.switchTo().parentFrame();
		break;

	default:

		if (logval == 0)
		{
			parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+TrackingType+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
		else
		{
			logger.log(LogStatus.ERROR, "Case Variable" + " "+ TrackingType+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
			}
		}
		return EntName;

	} catch (Exception|Error e) {
		throw (e);
	}
}

//====================================================================================================
//FunctionName 		:RMA_SMSModuleAddRenameDelete_Utility
//Description  		: Enables the User To Add/Rename/Delete A Module From SMS
//Input Parameter 	: ModuleName,  RiskMasterStatus: check/uncheck, SortMasterStatus: check/uncheck, UtilitiesStatus: check/uncheck, StandardReportStatus: check/uncheck, ExecutiveSummaryStatus: check/uncheck,  DSNName,
//		  			 	 		 AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
//								Pass "NA" or 00 for optional parameter	
//Revision			: 0.0 - RenuVerma-03-016-2017   
//====================================================================================================
//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present
public static void RMA_SMSModuleAddRenameDelete_Utility(String Case,String ModuleName, String LinkName, String RiskMasterStatus,String SortMasterStatus,String UtilitiesStatus,String StandardReportStatus,String ExecutiveSummaryStatus,String DSNName, boolean AdditionalParameter,int logval) throws Exception, Error
{
	try {

	if (logval == 0)
	{
			parentlogger.log(LogStatus.INFO,"Enables the User To "+Case+" Module On SMS Page ");
	}
	else
	{	
		logger = reports.startTest("<span id='SMSModuleAdd'>"+Case+" Module On SMS</span>", "Enables the User To "+Case+" Module On SMS Page ");
	}
	
	switch (Case){
	case "Add":		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName),"Expand Image Of "+DSNName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, "Module Security Groups"),"Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_AddModule(driver)));			
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_AddModule(driver), "Add New Module Button On Security Management System Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Txt_GroupName(driver), "Please type name for new group TextBox under 'Enter New Group Name' Popup On Security Management System Page ", ModuleName, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_ModueGroupOK(driver), "Ok Button under 'Enter New Group Name' Popup On Security Management System Page ", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, ModuleName), ModuleName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "RISKMASTER"), RiskMasterStatus, "RISKMASTER CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "SORTMASTER"), SortMasterStatus, "SORTMASTER CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Utilities"), UtilitiesStatus, "Utilities CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Standard Reports"), StandardReportStatus, "Standard Reports CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Executive Summary"), ExecutiveSummaryStatus, "Executive Summary CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Grant(driver),"Grant Button On Security Management System CheckBox", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "RISKMASTER"), RiskMasterStatus+"ed", "RISKMASTER CheckBox On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "SORTMASTER"), SortMasterStatus+"ed", "SORTMASTER CheckBox On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Utilities"), UtilitiesStatus+"ed", "Utilities CheckBox On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Standard Reports"), StandardReportStatus+"ed", "Standard Reports CheckBox On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Executive Summary"), ExecutiveSummaryStatus+"ed", "Executive Summary CheckBox On Security Management System Page", logval);
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "A New Module Is Added Successfully Having Module Name:" + " " + color.RMA_ChangeColor_Utility(ModuleName,3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Added Module On SMS Page", "AddModule")));
		}
		else
		{
			logger.log(LogStatus.PASS, "A New Module Is Added Successfully Having Module Name:" + " " + color.RMA_ChangeColor_Utility(ModuleName,3));
			logger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Added Module On SMS Page", "AddModule")));
		}
		break;

	case "Rename":
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",logval);
		//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName),"Expand Image Of "+DSNName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName),LinkName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_Rename(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_Rename(driver),"Rename Module Group Image On Security Management System Page",logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleRename_Txt_GroupName(driver), "Enter new group name TextBox under 'Rename Module Group' Popup On  Security Management System Page ", ModuleName, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleRename_Btn_Ok(driver), "Ok Button under 'Rename Module Group' Popup On  Security Management System Page ", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, ModuleName), ModuleName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "RISKMASTER"), RiskMasterStatus, "RISKMASTER CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "SORTMASTER"), SortMasterStatus, "SORTMASTER CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Utilities"), UtilitiesStatus, "Utilities CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Standard Reports"), StandardReportStatus, "Standard Reports CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Executive Summary"), ExecutiveSummaryStatus, "Executive Summary CheckBox", "Security Management System Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Grant(driver),"Grant Button On Security Management System CheckBox", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//	RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "RISKMASTER"), RiskMasterStatus+"ed", "RISKMASTER CheckBox On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "SORTMASTER"), SortMasterStatus+"ed", "SORTMASTER CheckBox On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Utilities"), UtilitiesStatus+"ed", "Utilities CheckBox On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Standard Reports"), StandardReportStatus+"ed", "Standard Reports CheckBox On Security Management System Page", logval);
		RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Executive Summary"), ExecutiveSummaryStatus+"ed", "Executive Summary CheckBox On Security Management System Page", logval);
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "A Module Is  Renamed Successfully With Module Name:" + " " + color.RMA_ChangeColor_Utility(ModuleName,3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Rename Module On SMS Page", "RenameModule")));
		}
		else
		{
			logger.log(LogStatus.PASS, "A Module Is Renamed Successfully With Module Name:" + " " + color.RMA_ChangeColor_Utility(ModuleName,3));
			logger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Rename Module On SMS Page", "RenameModule")));
		}
		break;

	case "Delete":
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
		//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName),"Expand Image Of "+DSNName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName),LinkName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver),"Delete Selected Item Image On Security Management System Page",logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver), "Delete Button On Delete Popup Of The Security Management System Page", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups")));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"), "Module Security Groups Expand Image From Left Navigation Menu Of Security Management System Page", logval);
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver,  ModuleName),  ModuleName + " Link From Left Menu Of Security Management System Page", logval);
		if(logval == 0)
		{
			parentlogger.log(LogStatus.PASS, "A Module Is Deleted Successfully Having Module Name:" + " " + color.RMA_ChangeColor_Utility(ModuleName,3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Deleted Module On SMS Page", "DeleteModule")));
		}
		else
		{
			logger.log(LogStatus.PASS, "A Module Is Deleted Successfully Having Module Name:" + " " + color.RMA_ChangeColor_Utility(ModuleName,3));
			logger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Deleted Module On SMS Page", "DeleteModule")));
		}
		break;
	default:
		if (logval == 0)
		{
			parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By Module Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
		else
		{
			logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By Module Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
		}
	}
			} catch (Exception|Error e) {
			throw (e);
		}
	}	
}





