package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_OrgHierarchy;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_060
//Description    : Create, Edit And Delete Of Org. Hierarchy From Maintenance Screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-11-07-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_060 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_060_Test() throws Exception,Error {

		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_Smoke_TC_060";
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_060_Create, Edit And Delete Of Org. Hierarchy From Maintenance Screen", " Create, Edit And Delete Of Org. Hierarchy From Maintenance Screen Is Validated");
			parentlogger.assignAuthor("Anubhuti Vyas");

			String StrOrgHierarchyName;
			String StrAddress1;
			String StrAddress2;
			String StrAddress3;
			String StrAddress4;
			int IntZipCode;
			String StrCounty;
			String StrCity;
			String AddressCreation_Txt_State;
			String AddressCreation_Txt_Country;
			//Local Variable Declaration Is Completed Here
			
			StrAddress1 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address1_");
			StrAddress2 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address2_");	
			StrAddress3 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address3_");	
			StrAddress4 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address4_");	
			StrCounty = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "County_");
			StrCity = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "City_");
			IntZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(10000,99999);
			//Local Variable Initialization Is Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite22_SmokeSuite_02.xlsx"); //Excel WorkBook RMA_Suite22_SmokeSuite_02.xlsx IS Fetched To Retrieve Data 
			AddressCreation_Txt_State =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_060", 1,0 ); //State Is Fetched From DataSheet RMA_Smoke_TC_060
			AddressCreation_Txt_Country = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_060", 1,1); //Country Is Fetched From DataSheet RMA_Smoke_TC_060
			//Data Fetch From Excel WorkBook Is Completed Here

			//===========================================================New Org. Hierarchy Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintenanceCreateEditNewOrgHierarchy", "RMA_MaintenanceCreateEditNewOrgHierarchy_Utility",0)+" To Create New Org. Hierarchy From Maintenance Screen");
			testcall1 = true;
			StrOrgHierarchyName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceCreateEditNewOrgHierarchy_Utility("Create",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Org. Hierarchy Is Created With Name::"+ " " + color.RMA_ChangeColor_Utility(StrOrgHierarchyName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Org. Hierarchy From Maintenance Screen Is Successfully Created
			//============================================================New Org. Hierarchy Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For Org. Hierarchy Screen Started Here=======================================================================================================================================================================================================================================================
	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Tab_ClientInfo(driver), "Client Info Tab On Org.Hierarchy Creation Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyClientInfo_Txt_WCFillingNo(driver), "WC Filling Number TextBox On Client Info Tab Of Maintenance-Org Hierarchy Page", "1234", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Tab_ClientLimits(driver), "Client Limits Tab On Org.Hierarchy Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Tab_OperatingAs(driver), "Operating Tab On Org.Hierarchy Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Tab_ContactInfo(driver), "Contact Info Tab On Org.Hierarchy Creation Page",logval);
			// Verification Of Client Info, Client Limits,Operating As, Contact Info Tab
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Tab_Addresses(driver), "Addresses Tab On Org.Hierarchy Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Tab_EntityIDType(driver), "Entity  Tab On Org.Hierarchy Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Tab_Supplementals(driver), "Supplementals Tab On Org.Hierarchy Creation Page",logval);
			// Verification Of Entity ID Type, Supplementals Tab
			//===========================================================Verification That All Tabs Are Present For Org. Hierarchy Screen Ended Here=======================================================================================================================================================================================================================================================
			
			//===========================================================Verification Of Successful Address Creation For Org. Hierarchy Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Tab_Addresses(driver), "Addresses Tab On Org.Hierarchy Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Btn_AddNewAddress(driver), "Add New Address On Addresses Tab On Org.Hierarchy Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Addresses Screen Is Loaded After Clicking Add New Address Buttton On Maintenance-Org Hierarchy Page");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_AddrType(driver), "Address Type TextBox On Addresses Tab On Org.Hierarchy Creation Page", "HADDR", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr1(driver), "Address1 TextBox On Addresses Tab On Maintenance-Org Hierarchy Page", StrAddress1, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr2(driver), "Address2 TextBox On Addresses Tab On Maintenance-Org Hierarchy Page", StrAddress2, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr3(driver), "Address3 TextBox On Addresses Tab On Maintenance-Org Hierarchy Page", StrAddress3, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr4(driver), "Address4 TextBox On Addresses Tab On Maintenance-Org Hierarchy Page", StrAddress4, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_City(driver), "City TextBox On Addresses Tab On Maintenance-Org Hierarchy Page", StrCity, logval);
            // Data Is Entered In Address1,Address2,Address3,Address4,City Fields On Address Tab
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Btn_State(driver), "State Code Look Up Button On Addresses Tab On Maintenance-Org Hierarchy Page",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(AddressCreation_Txt_State, "State Link On State Selection Window", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As State Is Selected On Addresses Tab On Maintenance-Org Hierarchy Page");
            // Data Is Entered In State Field Of Address Tab
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Btn_Country(driver), "Country Code Look Up Button On Addresses Tab On Maintenance-Org Hierarchy Page",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(AddressCreation_Txt_Country, "Country Link On Country Selection Window", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Country Is Selected On Addresses Tab On Maintenance-Org Hierarchy Page");
			// Data Is Entered In Country Field Of Address Tab
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_County(driver), "County TextBox On Addresses Tab On Maintenance-Org Hierarchy Page", StrCounty, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_ZipCode(driver), "Zip/Postal Code TextBox On Addresses Tab On Maintenance-Org Hierarchy Page", String.valueOf(IntZipCode), logval);
			// Data Is Entered In County & ZipCode Field Of Address Tab
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Addresses Tab On Maintenance-Org Hierarchy Page", logval);// Save Button Is Clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Save Is Clicked On Addresses Tab On Maintenance-Org Hierarchy Page");
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Maintenance-->Org. Hierarchy Page", logval);
			
			//===========================================================Verification Of Successful Address Creation For Org. Hierarchy Screen Completed Here=======================================================================================================================================================================================================================================================
			//===========================================================Verification Of Address Field Values On Org. Hierarchy Screen Started Here=======================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image On Maintenance-Org Hierarchy Page", logval);// Reload Image Is Clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As  Maintenance-Org Hierarchy Record Page Is Loaded");

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.OrgHierarchyNewRecordFrame);
			RMA_Verification_Utility.RMA_TextCompare(StrAddress1, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr1(driver), "value"), "Addrress1 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(StrAddress2, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr2(driver), "value"), "Addrress2 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(StrAddress3, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr3(driver), "value"), "Addrress3 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(StrAddress4, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_Addr4(driver), "value"), "Addrress4 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(StrCity, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_City(driver), "value"), "City Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(StrCounty, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyAddresses_Txt_County(driver), "value"), "County Value", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(AddressCreation_Txt_State, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyClient_Txt_State(driver), "value"), "State Value", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(AddressCreation_Txt_Country, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyClient_Txt_Country(driver), "value"), "Country Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(String.valueOf(IntZipCode), RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchyClient_Txt_ZipCode(driver), "value"), "Zip Code Value", logval);
			//Address Verification Is Performed
			//===========================================================Verification Of Address Field Values On Org. Hierarchy Screen Completed Here=======================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created Org. Hierarchy Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintenanceCreateEditNewOrgHierarchy", "RMA_MaintenanceCreateEditNewOrgHierarchy_Utility",0)+" To Edit New Org. Hierarchy From Maintenance Screen");
			testcall2 = true;
			StrOrgHierarchyName = RMA_Maintenance_Functionality_Utility.RMA_MaintenanceCreateEditNewOrgHierarchy_Utility("Edit",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Is Successful, Edited Org. Hierarchy Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrOrgHierarchyName, 2));
			// New Org. Hierarchy From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created Org. Hierarchy Is Completed Here==========================================================================================================================================================================================================================================================================================
			//==========================================================Delete Of Created Org. Hierarchy Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Org. Hierarchy Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Org. Hierarchy Creation Page", true, logval);
			//==========================================================Delete Of Created Org. Hierarchy Is Completed Here==========================================================================================================================================================================================================================================================================================

		}catch(Exception|Error e)
		{
			ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Not Handled Exception And Print Log Of It
			ErrorMessageType = e.toString();
			if (ExceptionRecorded.contains("Command"))
			{
				ErrorMessage = ExceptionRecorded.split("Command");
				FinalErrorMessage = ErrorMessage[0];
			}
			else
			{
				FinalErrorMessage = ExceptionRecorded;
			}
			StackTraceElement[] TraceElement = e.getStackTrace();
			for (StackTraceElement ObjectName : TraceElement)
			{
				if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
				{
					FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); 
					break;
				}
			}
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "MaintenanceCreateEditNewOrgHierarchy" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceEditOrgHierarchy_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			throw (e);
		}
	}

	@AfterMethod
	public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
	{
		try {
			String TestCaseName;
			if (ITestResult.FAILURE == result.getStatus())
			{
				TestCaseName = result.getName();
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval);
			}
		} catch (Exception|Error e) {	
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}	
		finally
		{
			try {
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				driver.switchTo().parentFrame();
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

