package rmaseleniumtestscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
//RMA Package Import Completed
//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_032
//Description    : Date/Time Validations For General Claims When Time Zone Is Enabled For Org Level: Client & Time Zone Is AL
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-10-10-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_QTPRegression_TC_032 extends RMA_TC_BaseTest {

	@Test
	public void RMA_QTPRegression_TC_032_Test() throws Exception,Error {


		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_032_Date Time Validations For General Claim Creation For Time Zone AL", "Date/Time Validations For General Claims When Time Zone Is Enabled For Org Level: Client & Time Zone Is AL");
			parentlogger.assignAuthor("Anubhuti Vyas");

			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_032";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			//Global Variable Initialization Completed

			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;	
			String MaintOrgHierarchy_Txt_TimeZone;
			String OrgLvl_Txt_TimeZoneValdation;
			String StrClaimNumber;
			String ExpectedErrorMessage_Claim;
			String ExpectedErrorMessage_Event;
			//Local Variable Declaration Is Completed Here

			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			ExpectedErrorMessage_Event = "Time of Event must be less than or equal to ";
			ExpectedErrorMessage_Claim = "Time of Claim must be less than or equal to";
			//Local Variable Initialization Is Completed Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite15_QTPRegression_06.xlsx"); //Excel WorkBook RMA_Suite15_QTPRegression_06.xlsx IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_032", 1, 0); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_032
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_032", 1,1 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_032
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_032", 1,2); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_032
			MaintOrgHierarchy_Txt_TimeZone = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_032", 1,3); //Time Zone Is Fetched From DataSheet RMA_QTPRegression_TC_032
			OrgLvl_Txt_TimeZoneValdation = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_032", 1,4); //Level For Time Zone Is Fetched From DataSheet RMA_QTPRegression_TC_032
			//Data Fetch From Excel WorkBook Is Completed Here
			
			//============================================================General System Parameter & Maintenance-->Org. Hierarchy Settings Is Started Here===========================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("UISettings","RMA_Suite15_Utility",0)+" To Do The General System Parameter And Maintanenance-Org. Hierarchy Settings For Suite15");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_Suite15_Utility(OrgLvl_Txt_TimeZoneValdation,MaintOrgHierarchy_Txt_TimeZone, logval1);//General System Parameter & Maintenance -OrgHierarchy Setting Is Done
			parentlogger.log(LogStatus.INFO, "General System Parameter & Maintenance -OrgHierarchy Settings Are Successfully Done");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//============================================================General System Parameter & Maintenance-->Org. Hierarchy Settings Is Completed Here===========================================================================================================================================================================================================================================================

			//============================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "General Claim Creation Is Started To Verify The Time Zone Validation");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-GeneralClaim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.GeneralClaimFrame); //A Switch To The Frame Containing General Claim Controls Is Done

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfEvent, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfClaim, logval);	
			// Date Of Claim And Date Of Event Text Boxes Are Provided Values

			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On General Claim Creation Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On General Claim Creation Page",GenClaimCreation_Txt_TimeOfEvent,logval);


			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver), "Time OfEvent TextBox On General Claim Creation Page", GenClaimCreation_Txt_TimeOfClaim,logval);	
			//Time Of Claim And Time Of Event Text Boxes Are Provided Values
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimStatus(driver), "Claim Status Look Up Image Button On General Claim Creation Page",logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(GenClaimCreation_Txt_ClaimStatus, "Claim Status LookUp Window On General Claim Creation Page", logval);
			//Value Is Entered In Claim Type and Claim Status Text Boxes

			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Claim Status Is Populated");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimType(driver), "Claim Type Look Up Image Button On General Claim Creation Page",logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(GenClaimCreation_Txt_ClaimType, "Claim Type LookUp Window On General Claim Creation Page", logval);;
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Claim Type Is Populated");

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimInfo_Dept(driver), "Department TextBox On General Claim Creation Page", GenClaimCreation_Txt_Department, logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Claim Department Is Populated");
			//-----------------------
			/*
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(driver.findElement(By.xpath(".//*[@id='ev_depteid']/p/span[1]/button")), "Department Lookup Button", logval);
            RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
            Thread.sleep(8000);
            driver.switchTo().frame(0);
           
            RMA_Navigation_Utility.RMA_ObjectClick(driver.findElement(By.xpath(".//*[@class='ng-binding ng-scope orghselectednode'][contains(text(),'ANO-Anodizing')]")), "Department name", logval);
   
            //RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimva");
            driver.switchTo().parentFrame();
            Thread.sleep(8000);*/
			//------------------------
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page",logval);

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver),"Save Image On General Claim Creation" , logval);
			
			RMA_Functionality_Utility.RMA_ErrorMessageOnSave(true,ExpectedErrorMessage_Event,logval);//Event Related Time Zone Validations Are Verified
			RMA_Functionality_Utility.RMA_ErrorMessageOnSave(true,ExpectedErrorMessage_Claim,logval);//Claim Related Time Zone Validations Are Verified
			
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UnSuccessful General Claim Creation", "New General Claim Is Not Created Successfully Due To Time Zone Validations")));
			
			List<WebElement> lis = driver.findElements(By.xpath(".//*[@class='toast-close-button ng-scope']"));
			for (WebElement li : lis) 
			{
				li.click();
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Close Button On Toast Error Message Is Clicked ");
			}
			parentlogger.log(LogStatus.INFO, "Close Button On All The Present Toast Error Messages Is Clicked");
			//Error Messages Are Closed
			
			//Valid Claim Date/Time Are Provided
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.GeneralClaimFrame); 
			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -2, 0, "MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = GenClaimCreation_Txt_DateOfEvent;
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfEvent, logval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfClaim, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On General Claim Creation Page To Set The Value Of Date Of Claim Field",logval);
			// Date Of Claim And Date Of Event Text Boxes Are Provided Values
			

			RMA_Functionality_Utility.RMA_GenericSave_Utility("claimgc", false, "NA", "General Claim Creation Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver)));
			StrClaimNumber = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrClaimNumber
			
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful General Claim Creation", "New General Claim Is Created Successfully")));
	
			//=============================================================Steps To Create General Claim Is Completed Here=======================================================================
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Suite15_Utility" + " " +  "And Hence The Test Case Is A Fail");
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

