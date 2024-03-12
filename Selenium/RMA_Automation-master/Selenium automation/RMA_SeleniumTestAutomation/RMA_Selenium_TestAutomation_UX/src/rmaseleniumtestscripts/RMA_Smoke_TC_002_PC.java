package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_002_PC
//Description    : Property Claim Getting Created By Entering All Mandatory Fields Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AbhishekRai-02-20-2018 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_002_PC  extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_002_PC_Test() throws Exception,Error {			
			
		try{
		parentlogger = reports.startTest("RMA_Smoke_TC_002_Property Claim Creation", "Property Claim Getting Created By Entering All Mandatory Fields Is Validated");
		parentlogger.assignAuthor("Abhishek Rai");
		
		//Region =====================================================Global Variable Initialization Is Started Here=========================================================================================
		StrScreenShotTCName = "Smoke_TC_002_PC";
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		StrScreenShotTCName = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		StrClaimNumber = null;
		//EndRegion ==================================================Global Variable Initialization Is Completed Here============================================================================== 
		
		//Region =====================================================Local Variable Declaration Started Here=====================================================================================================		
		String PropertyClaimCreation_Txt_DateOfEvent;
		String PropertyClaimCreation_Txt_TimeOfEvent;
		String PropertyClaimCreation_Txt_TimeOfClaim;
		String PropertyClaimCreation_Txt_DateOfClaim;
		String PropertyClaimCreation_Txt_ClaimStatus;
		String PropertyClaimCreation_Txt_Department;
		String PropertyClaimCreation_Txt_ClaimType;				
		String PropertyClaimCreation_Txt_PropertyId;
		String PropertyClaimCreation_Txt_Address1;
		String PropertyClaimCreation_Txt_Address1Edited;
		String PropertyClaimCreation_Txt_CityEdited;
		String PropertyClaimCreation_Txt_StateIdEdited;
		String PropertyClaimCreation_Txt_ZipCodeEdited;
		String PropertyClaimCreation_Txt_LandValueEdited;
		String PropertyClaimCreation_Txt_SquareFootageEdited;
		String PropertyClaimCreation_Txt_NoofstoriesEdited ;
		String StrClaimNumberEdited;
		//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================
		
		//Region =====================================================Local Variable Initialization Started Here=====================================================================================================
		PropertyClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
		PropertyClaimCreation_Txt_DateOfClaim = 	PropertyClaimCreation_Txt_DateOfEvent;
		PropertyClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
		PropertyClaimCreation_Txt_TimeOfEvent =  PropertyClaimCreation_Txt_TimeOfClaim;
		PropertyClaimCreation_Txt_Address1Edited = "1-2-212/1/a,st.11";
		PropertyClaimCreation_Txt_CityEdited = "Lansdowne";
		PropertyClaimCreation_Txt_StateIdEdited = "California";
		PropertyClaimCreation_Txt_ZipCodeEdited = "02176";
		PropertyClaimCreation_Txt_LandValueEdited = "10000";
		PropertyClaimCreation_Txt_SquareFootageEdited = "3000";
		PropertyClaimCreation_Txt_NoofstoriesEdited = "2";
		//PropertyClaimCreation_Txt_TimeOfEventEdited_Final = RMA_GenericUsages_Utility.RMA_TimeConversion_Utility(PropertyClaimCreation_Txt_TimeOfEventEdited, "hh:mm");	
		//EndRegion ==================================================Local Variable Initialization Completed Here==================================================================================================
		
		//Region =====================================================Fetch Of Data From Excel WorkBook Started Here=====================================================================================================
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite22_SmokeSuite_02.xlsx"); //Excel WorkBook RMA_Suite22_SmokeSuite_02 IS Fetched To Retrieve Data 
		PropertyClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_PC", 1, 0); //Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_PC		
		PropertyClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_PC", 1,1 ); //Claim Status Is Fetched From DataSheet RMA_Smoke_TC_002_PC
		PropertyClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_PC", 1,2 ); //Department Is Fetched From DataSheet RMA_Smoke_TC_002_PC
		PropertyClaimCreation_Txt_PropertyId = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_PC", 1,3 ); //Property Id Is Fetched From DataSheet RMA_Smoke_TC_002_PC
		//EndRegion ==================================================Fetch Of Data From Excel WorkBook Completed Here==================================================================================================
				
		driver.switchTo().window(StrRMAUXWindowHandle);
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
		//Region===========================================================Property Claim Creation Is Started Here=======================================================================================================================================================================================================================================================
		parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PropertyClaimCreation", "RMA_PropertyClaimCreation",0)+" To Create PropertyClaim");
		testcall1 = true;
		StrClaimNumber = RMA_Functionality_Utility.RMA_PropertyClaimCreation(PropertyClaimCreation_Txt_DateOfClaim, PropertyClaimCreation_Txt_TimeOfClaim,PropertyClaimCreation_Txt_TimeOfEvent, PropertyClaimCreation_Txt_DateOfEvent, PropertyClaimCreation_Txt_ClaimStatus, PropertyClaimCreation_Txt_ClaimType, PropertyClaimCreation_Txt_Department, PropertyClaimCreation_Txt_PropertyId,logval1);
		loggerval1 = logger.toString();
		parentlogger.log(LogStatus.INFO, "New Property Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
		parentlogger.appendChild(logger);
		DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		//EndRegion===========================================================Property Claim Creation Is Completed Here=====================================================================================================================================================================================================================================================
				
		//Region===========================================================Verification That All Tabs Are Present For Property Claim Screen Started Here==============================================================================================================================================================================================
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_ClaimInfo(driver), "Claim Info Tab On Property Claim Creation Page",logval);	
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EventDetail(driver), "Event Detail Tab On Property Claim Creation Page",logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Tab_PropertyInfo(driver), "Property Info Tab On Property Claim Creation Page",logval);		
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Tab_COPEDATA(driver), "COPEDATA Tab On Property Claim Creation Page",logval);		
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_Supplementals(driver), "Supplementals Tab On Property Claim Creation Page",logval);		
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Tab_OptionalCOPEDATA(driver), "Optional COPEDATA Tab On Property Claim Creation Page",logval);		
		//EndRegion===========================================================Verification That All Tabs Are Present For Property Claim Screen Completed Here==============================================================================================================================================================================================
		
		//==========================================================Edit Of Created Claim Is Started Here==============================================================================================================================================================================================
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Tab_PropertyInfo(driver), "Property Info Tab On Property Claim Creation Page",logval);
		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Txt_PropertyInfoAdress_1(driver), "Address 1 TextBox On Property Claim Creation Page", PropertyClaimCreation_Txt_Address1Edited, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Txt_PropertyInfoCity(driver), "City TextBox On Property Claim Creation Page", PropertyClaimCreation_Txt_CityEdited, logval);		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Btn_PropertyInfoState(driver), "State Look Up Image Button On Property Claim Creation Page",logval);
		RMA_Navigation_Utility.RMA_WebLinkSelect(PropertyClaimCreation_Txt_StateIdEdited, "State LookUp Window On Property Claim Creation Page", logval);			
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Btn_PropertyInfoZipCode(driver), "Zip Code TextBox On Property Claim Creation Page", PropertyClaimCreation_Txt_ZipCodeEdited, logval);		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Txt_PropertyInfoLandValue(driver), "Land Value TextBox On Property Claim Creation Page", PropertyClaimCreation_Txt_LandValueEdited, logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Tab_COPEDATA(driver), "COPEDATA Tab On Property Claim Creation Page",logval);		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Txt_COPEDATASquareFootage(driver), "COPEDATA > Square Footage TextBox On Property Claim Creation Page", PropertyClaimCreation_Txt_SquareFootageEdited, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Txt_COPEDATANoOfStories(driver), "COPEDATA > Nof Of Stories TextBox On Property Claim Creation Page", PropertyClaimCreation_Txt_NoofstoriesEdited, logval);
		
		RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.PropertyClaimFrame, false, "NA", "Property Claim Creation Page", logval);
		
		PropertyClaimCreation_Txt_Address1 = RMA_Selenium_POM_Generic_Claims.RMAApp_PropertyClaim_Txt_PropertyInfoAdress_1(driver).getAttribute("value");		
		RMA_Verification_Utility.RMA_PartialTextVerification(PropertyClaimCreation_Txt_Address1,PropertyClaimCreation_Txt_Address1Edited , "Address 1 After Edit",logval);
		
		StrClaimNumberEdited = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver).getAttribute("value");
		RMA_Verification_Utility.RMA_TextCompare(StrClaimNumberEdited, StrClaimNumber, "Claim Number After Edit",logval);
		parentlogger.log(LogStatus.PASS, "Claim Edit Is Successful And Claim Number Value Remains Same As Before Edit That Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrClaimNumberEdited, 2));
		//==========================================================Edit Of Created Claim Is Completed Here==============================================================================================================================================================================================*/

		
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PropertyClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
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
			// driver.switchTo().parentFrame();		 //In Claim Creation Test Cases In The Try Block Have Kept The Logic To Switch To Parent Frame As To Facilitate Code Stability
		 } catch (Exception|Error e) {
			System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
			parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
		}
		 reports.endTest(parentlogger);	
		 reports.flush();
		}
	}	

}
