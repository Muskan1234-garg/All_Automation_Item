package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_OtherPerson;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Witness;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//============================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_034_PI_DataCreation
//Description    : New Person Involved For Created Claim/Event/Litigation Is Added To Be Used As Add Existing Person Involved Data For Other Entity Level Such As (For Instance: Employee Created As Person Involved For Event Will Be Used As Data For Add Existing Person Involved For General Claim)
//Depends On TC  : RMA_SeleniumRegression_TC_021/RMA_SeleniumRegression_TC_022/RMA_SeleniumRegression_TC_023/RMA_SeleniumRegression_TC_024/RMA_SeleniumRegression_TC_025/RMA_SeleniumRegression_TC_026
//Revision       : 0.0 - KumudNaithani-08-09-2017 
//===========================================================================================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_034_PI_DataCreation extends RMA_TC_BaseTest {
    public static String StrMedicalStaffLastName;
    public static String StrEmployeeLastName;
    public static String StrEmployeeNumber;
    public static String StrPatientLastName;
    public static String StrPhysicianLastName;
    public static String StrDriverLastName;
    public static String StrWitnessLastName;
    public static String StrOtherPersonLastName;
    public static String StrWitnessSSN;
    public static String StrOtherPersonSSN;
    
	@Test
	public void RMA_SeleniumRegression_TC_034_PI_DataCreation_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_034_PI_DataCreation", "New Person Involved For Created Claim/Event/Litigation Is Added To Be Used As Add Existing Person Involved Data For Other Entity Level Such As (Employee Created As Person Involved For Event Will Be Used As Data For Add Existing Person Involved For General Claim)");
			parentlogger.assignAuthor("Kumud Naithani");
			
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
			testcall5 = false;	
			loggerval5 = "NotInitialized";
			testcall6 = false;	
			loggerval6 = "NotInitialized";
			testcall7 = false;	
			loggerval7 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_034_PI_DataCreation";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			//===========================================================New MedicalStaff Creation As Person Involved Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIAddNewEntity", "RMA_PersonInvolvedAddNewEntity_Utility",0)+" To Create New MedicalStaff As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall1 = true;
			StrMedicalStaffLastName=RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedAddNewEntity_Utility("MedicalStaff", StrClaimNumber, logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New MedicalStaff Is Created With MedicalStaff Last Name"+ " "+color.RMA_ChangeColor_Utility(StrMedicalStaffLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New MedicalStaff As Person Involved Is Successfully Created
			//============================================================New MedicalStaff Creation As Person Involved Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================Navigation Back To The Claim Screen Is Started Here============================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On MedicalStaff Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			//===========================================================Navigation Back To The Claim Screen Is Completed Here=======================================================================================================================================================================================================================================================================*/	
		
			//===========================================================New Patient Creation As Person Involved Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIAddNewEntity", "RMA_PersonInvolvedAddNewEntity_Utility",0)+" To Create New Patient As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall2 = true;
			StrPatientLastName=RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedAddNewEntity_Utility("Patient", StrClaimNumber, logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Patient Is Created With Patient Last Name"+ " "+color.RMA_ChangeColor_Utility(StrPatientLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Patient As Person Involved Is Successfully Created
			//============================================================New Patient Creation As Person Involved Is Completed Here================================================================================================================================================================================================================================================================
			
			//==========================================================Navigation Back To The Claim Screen Is Started Here============================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On Patient Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			//===========================================================Navigation Back To The Claim Screen Is Completed Here=======================================================================================================================================================================================================================================================================
			
			//===========================================================New Physician Creation As Person Involved Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIAddNewEntity", "RMA_PersonInvolvedAddNewEntity_Utility",0)+" To Create New Physician As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall3 = true;
			StrPhysicianLastName=RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedAddNewEntity_Utility("Physician", StrClaimNumber, logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Physician Is Created With Physician Last Name"+ " "+color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Physician As Person Involved Is Successfully Created
			//============================================================New Physician Creation As Person Involved Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================Navigation Back To The Claim Screen Is Started Here==================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On Physician Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			//===========================================================Navigation Back To The Claim Screen Is Completed Here======================================================================================================================================================================
			
			//===========================================================New Driver Creation As Person Involved Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIAddNewEntity", "RMA_PersonInvolvedAddNewEntity_Utility",0)+" To Create New Driver As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall4 = true;
			StrDriverLastName=RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedAddNewEntity_Utility("Driver", StrClaimNumber, logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Driver Is Created With Driver Last Name"+ " "+color.RMA_ChangeColor_Utility(StrDriverLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Driver As Person Involved Is Successfully Created
			//============================================================New Driver Creation As Person Involved Is Completed Here================================================================================================================================================================================================================================================================
			
			//==========================================================Navigation Back To The Claim Screen Is Started Here==================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On Driver Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			//===========================================================Navigation Back To The Claim Screen Is Completed Here=====================================================================================================================================================================
			
			//===========================================================New Witness Creation As Person Involved Is Started Here================================================================================================================================================================================================================================================================*/
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIAddNewEntity", "RMA_PersonInvolvedAddNewEntity_Utility",0)+" To Create New Witness As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall5 = true;
			StrWitnessLastName=RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedAddNewEntity_Utility("Witness", StrClaimNumber, logval1);
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			StrWitnessSSN =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Witness.RMAApp_Witness_Txt_SocialSecurityNumber(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Witness Is Created With Witness Last Name"+ " "+color.RMA_ChangeColor_Utility(StrWitnessLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Witness As Person Involved Is Successfully Created
			//============================================================New Witness Creation As Person Involved Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================Navigation Back To The Claim Screen Is Started Here=========================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On Witness Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			//===========================================================Navigation Back To The Claim Screen Is Completed Here=======================================================================================================================================================================================================================================================================*/
			
			//===========================================================New OtherPerson Creation As Person Involved Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIAddNewEntity", "RMA_PersonInvolvedAddNewEntity_Utility",0)+" To Create New OtherPerson As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall6 = true;
			StrOtherPersonLastName=RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedAddNewEntity_Utility("OtherPerson", StrClaimNumber, logval1);
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New OtherPerson Is Created With OtherPerson Last Name"+ " "+color.RMA_ChangeColor_Utility(StrOtherPersonLastName, 2));
			StrOtherPersonSSN =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_OtherPerson.RMAApp_OtherPerson_Txt_SocialSecurityNumber(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Witness Is Created With Witness Last Name"+ " "+color.RMA_ChangeColor_Utility(StrWitnessLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New OtherPerson As Person Involved Is Successfully Created
			//============================================================New OtherPerson Creation As Person Involved Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================Navigation Back To The Claim Screen Is Started Here========================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On OtherPerson Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			//===========================================================Navigation Back To The Claim Screen Is Completed Here======================================================================================================================================================================================================================================================================*/
			
			//===========================================================New Employee Creation As Person Involved Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIAddNewEntity", "RMA_PersonInvolvedAddNewEntity_Utility",0)+" To Create New Employee As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall7 = true;
			StrEmployeeNumber=RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedAddNewEntity_Utility("Employee", StrClaimNumber, logval1);
			loggerval7 = logger.toString();
			parentlogger.appendChild(logger);
			StrEmployeeLastName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Employee Is Created With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2)+ " "+ "And Employee Last Name"+ " "+color.RMA_ChangeColor_Utility(StrEmployeeLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Employee As Person Involved Is Successfully Created
			//============================================================New Employee Creation As Person Involved Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================Navigation Back To The Claim Screen Is Started Here=======================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On Employee Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			//===========================================================Navigation Back To The Claim Screen Is Completed Here========================================================================================================================================================================================================================================================================*/
		
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PersonInvolvedAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PersonInvolvedAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PersonInvolvedAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PersonInvolvedAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall5 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PersonInvolvedAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall6 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PersonInvolvedAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall7 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PersonInvolvedAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
				//driver.switchTo().parentFrame();
				//RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As User Migrates To The Default Frame To Click On Close Button");
			   // RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Image Button On RMA Application Default View Page", logval);
			   // RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
		 
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

