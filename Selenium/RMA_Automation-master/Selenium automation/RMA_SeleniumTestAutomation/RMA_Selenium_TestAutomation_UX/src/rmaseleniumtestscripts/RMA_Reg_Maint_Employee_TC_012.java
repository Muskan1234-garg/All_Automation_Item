package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Packages Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SupplementalGrid;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
//RMA Packages Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_012
//Description    : Functionality Of Supplemental Grid On Employee Is Validated 
//Depends On TC  : None
//Revision       : 0.0 - ShrutiShruti-02-15-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Employee_TC_012 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Reg_Maint_Employee_TC_012_Test() throws Exception,Error{
	try{
		parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_012_Functionality Of Supplemental Grid On Employee Is Validated", "Functionality Of Supplemental Grid On Employee Is Validated");
		parentlogger.assignAuthor("Shruti Shruti");
		
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_011";
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variables Declaration Completed here
		
		String StrEmployeeNumber="145663232";
		String StrDepartment;
		String FrameID;
		//Local Variables Declaration Completed Here
		
		StrDepartment=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3,"Department_");
		//Local Variables Initialization Completed Here
		
		//===========================================Steps To Open Created Employee Screen Started Here===================================================================================================================================================================================
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Employee", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.EmployeeFrame);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Img_Lookup(driver), "Lookup Image Button On Employee Creation Page", logval);
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrEmployeeNumber, "Lookup Window On Employee Creation Page", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Employee.RMAApp_Employee_Chk_FreezePayment(driver)));				
		//Employee Screen Is Opened Here
		//===========================================Steps To Open Created Employee Screen Completed Here=====================================================================================================================================================================================
		
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Img_SupplementalGrid_DDMenu(driver), "Supplemental Grid Image Button On Employee Creation Page", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Img_GridDDMenu(driver, "Test Grid"),"Test Grid Menu On Supplemental Grid MenuOn Employee Creation Page", logval);
		//Supplemental Grid Screen Is Opened 
		
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalGrid.RMAApp_SupplementalGrid_Btn_AddRow(driver),"Add New Row Image Button On Supplemental Grid Creation Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SupplementalGrid.RMAApp_SupplementalGrid_Txt_Department(driver), "Department TextBox On Supplemental Grid Creation Page", StrDepartment, logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalGrid.RMAApp_SupplementalGrid_Btn_OK(driver), "OK Image Button On Supplemental Grid Creation Page", logval);
		//Values Are Given In Supplemental Grid Here
		
		FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Employee Page", logval);
		//Employee Is Saved With Data Entered in the Grid
		
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Img_SupplementalGrid_DDMenu(driver), "Supplemental Grid Image Button On Employee Creation Page", logval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Img_GridDDMenu(driver, "Test Grid"),"Test Grid Menu On Supplemental Grid MenuOn Employee Creation Page", logval);
		//Supplemental Grid Is Opened Here for Verification
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Supplemental Contains Value", "Successful Verification For Supplemental Values")));
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
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
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
