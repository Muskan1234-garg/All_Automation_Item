package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_151
//Description    : TC_151_Verify Adding,Editing And Deleting Of New Employee As Person Involved In Litigation For Vehicle Accident Claim
//Depends On TC  : RMA_TC_150
//Revision       : 0.0 - KumudNaithani-07-04-2016 
//=================================================================================================

public class RMA_TC_151 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_151_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_151_Adding, Editing And Deleting Of New Employee", "Verify Adding,Editing And Deleting Of New Employee As Person Involved In Litigation For Vehicle Accident Claim");
			parentlogger.assignAuthor("Kumud Naithani");

			String StrEmployeeNumber_151;
			String StrEmployeeLastNameActual_151;
			String StrEmployeeNameChanged;

			StrScreenShotTCName = "TC_151";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			
			//====================================================Search Of Claim Created In TC_150 Is Started====================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page ", "Claim Number TextBox", RMA_TC_150.StrClaimNumber_RMA_TC_150, RMA_TC_150.StrClaimNumber_RMA_TC_150, "Vehicle Accident", "num", 2, 0);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Vehicle"), "Expand Image Corresponding To Vehicle Accident Claim Link On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Expand Image Corresponding To Vehicle Accident Claim Link On Left Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (1)"), "Litigation (1) In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Litigation's Lookup Results Page Is Loaded ");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("litigation");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_150.StrLitigation_RMA_TC_150, "Litigation's Lookup Results Page" , logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+RMA_TC_150.StrLitigation_RMA_TC_150+")"), "Expand Image For The Created Litigation On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Expand Image Corresponding To Litigation "+" "+RMA_TC_150.StrLitigation_RMA_TC_150 +"Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+RMA_TC_150.StrLitigation_RMA_TC_150+")"), "Persons Involded Link Present Under Litigation Tree", logval);
			//====================================================Search Of Claim Created In TC_150 Is Completed======================================================================================================================================================================================
			//===============================================Steps To Create A New Employee Started=====================================================================================================================================================================================================
			
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_PIAddNewEntity_Utility Is Called To Create An Employee ");
			testcall1 = true;
			StrEmployeeNumber_151 = RMA_Functionality_Utility.RMA_PIAddNewEntity_Utility("Employee", logval1);
			parentlogger.log(LogStatus.INFO, "New Employee Is Created Successfully With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber_151, 2));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Creation Of New Employee Is Successfull", StrScreenShotTCName)));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//===============================================Steps To Create A New Employee Completed=========================================================================================================================================================================================================
			
			/*===============================================Editing Of New Employee Is Started Here================================================================================================================================================================================================================*/
			StrEmployeeNameChanged = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EmpName_TC_151_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Employee Page ", StrEmployeeNameChanged, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On PI Employee Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PI Employee Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("PI Employee Page" , logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("piemployee");
			StrEmployeeLastNameActual_151 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEmployeeNameChanged, StrEmployeeLastNameActual_151 , "EmployeeLast Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Edit Of Employee Name Is Successfull", StrScreenShotTCName)));

			/*=================================================Editing Of New Employee Is Completed Here===============================================================================================================================================================================================================*/

			/*===========================================================Deletion Of New Employee Is Started Here=====================================================================================================================================================================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete An Employee : " +" "+ color.RMA_ChangeColor_Utility(StrEmployeeNameChanged, 2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Employee Page", logval1);
			driver.switchTo().parentFrame();
			parentlogger.log(LogStatus.INFO, "Employee Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNameChanged, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of New Employee Is Completed Here=========================================================================================================================================================================================================*/


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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_MaintEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			throw (e);
		}

	}		

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
			reports.endTest(parentlogger); 
		}
	}		
}

