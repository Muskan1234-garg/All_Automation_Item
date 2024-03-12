package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance;
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
//TestCaseID     : RMA_TC_154
//Description    : TC_154_Verify Adding,Editing And Deleting Of New Other Person As Person Involved In Litigation For Vehicle Accident Claim
//Depends On TC  : RMA_TC_150
//Revision       : 0.0 - KumudNaithani-07-05-2016 
//=================================================================================================

public class RMA_TC_154 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	

	@Test
	public void RMA_TC_154_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_154_Adding, Editing And Deleting Of New Other Person", "Verify Adding,Editing And Deleting Of New Other Person As Person Involved In Litigation For Vehicle Accident Claim");
			parentlogger.assignAuthor("Kumud Naithani");

			String StrOtherPersonLastName_154;
			String StrOtherPersonLastNameActual_154;
			String StrOtherPersonLastNameChanged;

			StrScreenShotTCName = "TC_154";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			//====================================================Search Of Claim Created In TC_150 Is Started===============================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Search => Claim Page ", "Claim Number TextBox", RMA_TC_150.StrClaimNumber_RMA_TC_150, RMA_TC_150.StrClaimNumber_RMA_TC_150, "Vehicle Accident", "int", 2, logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Vehicle"), "Expand Image Corresponding To Vehicle Accident Claim Link On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Expand Image Corresponding To Vehicle Accident Claim Link On Left Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (1)"), "Litigation (1) In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Litigation's Lookup Results Page Is Loaded ");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("litigation");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_150.StrLitigation_RMA_TC_150, "Litigation's Lookup Results Page" , logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+RMA_TC_150.StrLitigation_RMA_TC_150+")"), "Expand Image For The Created Litigation On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Expand Image Corresponding To Litigation "+" "+RMA_TC_150.StrLitigation_RMA_TC_150 + " " + "Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+RMA_TC_150.StrLitigation_RMA_TC_150+")"), "Persons Involded Link Present Under Litigation Tree", logval);
			//========================================================= Search Of Claim Created In TC_150 Is Completed========================================================================================================================================================================================
			
			//===============================================Steps To Create A New Other Person Started=============================================================================================================================================================================================================
			
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_PIAddNewEntity_Utility Is Called To Create A Other Person ");
			testcall1 = true;
			StrOtherPersonLastName_154 = RMA_Functionality_Utility.RMA_PIAddNewEntity_Utility("Other Person", logval1);
			parentlogger.log(LogStatus.INFO, "New Other Person Is Created Successfully With Other Person Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrOtherPersonLastName_154, 2));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Creation Of New Other Person Is Successful", StrScreenShotTCName)));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//===============================================Steps To Create A New Other Person Completed=============================================================================================================================================================================================================
			
			/*===============================================Editing Of New Other Person Is Started Here=======================================================================*/
			StrOtherPersonLastNameChanged = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Other Person_TC_154_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "LastName TextBox On PI Other Person Page ", StrOtherPersonLastNameChanged, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On PI Other Person Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PI Other Person Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("PI Other Person Page" , logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("piother");
			StrOtherPersonLastNameActual_154 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPeople_Txt_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrOtherPersonLastNameChanged, StrOtherPersonLastNameActual_154 , "Other Person Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Edit Of Other Person Last Name Is Successfull", StrScreenShotTCName)));

			/*=================================================Editing Of New Other Person Is Completed Here==================================================================================================================================================================================================================*/

			/*===========================================================Deletion Of New Other Person Is Started Here===========================================================================================================================================================================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete A Other Person : " +" "+ color.RMA_ChangeColor_Utility(StrOtherPersonLastNameChanged, 2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Other Person Page", logval1);
			driver.switchTo().parentFrame();
			parentlogger.log(LogStatus.INFO, "Other Person Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(StrOtherPersonLastNameChanged, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of New Other Person Is Completed Here==================================================================================================================================================================================================================*/


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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_PIAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
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

