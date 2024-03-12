package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Utilities_Customization;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_065
//Description    : Successful Setup Of WebLinks Is Validated 
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha 07-11-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_065  extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_065_Test() throws Exception,Error {

		StrScreenShotTCName = "RMA_Smoke_TC_065";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		StrScreenShotTCName = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		//Global Variable Initialization Completed 

		try{

			parentlogger = reports.startTest("RMA_Smoke_TC_065_Web_Links_Setup" ,"Successful Setup Of WebLinks Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

			String URLShortName;
			String URLString;
			String URLShortNameEdit;
			//Local Variable Declaration Completed Here


			//RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite23_SmokeSuite03.xlsx"); //Excel WorkBook RMA_Suite23_SmokeSuite03 IS Fetched To Retrieve Data 
			URLShortName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "RMA_WEBLINK_");
			URLString = "https://www.google.com";
			URLShortNameEdit = URLShortName + "_EDIT";
			//Local Variable Initialization Completed 


			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();

			//=============================================================Steps To Add Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("WebLinkIsSetup","RMA_WebLinksSetup",0)+" To Setup WebLink");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_WebLinksSetup(URLShortName, URLString,logval1);
			parentlogger.log(LogStatus.INFO, "Web Link Setup Is Done");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//=============================================================Steps To Add Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================

			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-UIAdmins-Customization-WebLinksSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.WebLinksSetup);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Lst_SelectedURL(driver), URLShortName, "URL Short Name List Box", "Web Links Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Txt_ShortName(driver), "URL Short Name TextBox On Web Links Setup Page", URLShortNameEdit,logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Txt_URLString(driver), "URL String TextBox On Web Links Setup Page", URLString,logval);
			RMA_Navigation_Utility.RMA_RadioButtonSelect_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_RdBtn_Public(driver), "Public Radio Button On Web Links Page", logval);
			//Editing Of URL Short Name Is Done

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Btn_Save(driver), "Save Image On Web Links Page", logval);
			//Edited URL Short Name Is Saved

			//Steps To Navigate To UX Screen Is Started Here
			//RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			//RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			driver.switchTo().window(StrRMAUXWindowHandle);
			//Steps To Navigate To UX Screen Is Ended Here

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Web Links Needs To Get Loaded");

			//Verification For Existence Of The Edited  URL Short Name In Web Links Is Started Here
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("MyWork", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Web Links"), "Web Links Link", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Edited Web Link Needs To Get Loaded");
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(rmaseleniumPOM_UX.RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, URLShortNameEdit), "displayed", "Web Link" + URLShortNameEdit, logval);
			//Verification For Existence Of The Edited  URL Short Name In Web Links Is Ended Here

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(rmaseleniumPOM_UX.RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, URLShortNameEdit), "URL Short Name Edit Link On Web Links On Web Links Page", logval);
			//Navigation To Created URL Done

			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Web Page Needs To Get Loaded");
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Google");
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();
			//Switched Back To UI Screen	

			//Deletion Of Created Web Link Is Started Here
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-UIAdmins-Customization-WebLinksSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.WebLinksSetup);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Lst_SelectedURL(driver), URLShortNameEdit, "URL Short Name List Box", "Web Links Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Img_Delete(driver), "Delete Image On Web Links Page", logval);
			//Deletion Of Created Web Link Is Ended Here

			//Steps To Navigate To UX Screen Is Started Here
			//RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			//RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//Steps To Navigate To UX Screen Is Ended Here
			
			driver.switchTo().window(StrRMAUXWindowHandle);

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Web Links Needs To Get Loaded");


			//Negetive Verification For The Edited URL Name Started Here
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("MyWork", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Web Links"), "Web Links Link", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(rmaseleniumPOM_UX.RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, URLShortNameEdit), "URLShortName Link In My Work-->WebLinks Link", logval);
			//Negetive Verification For The Edited URL Name Ended Here


		}
		catch(Exception|Error e)
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
			if (testcall1== true && loggerval1.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_WebLinksSetup" + " " +  "To Setup A Web Link Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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
			throw (e);
		}}		

	@AfterMethod
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

