package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_012
//Description    : Add And Delete Of Restriction Of WC Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_002_WC
//Revision       : 0.0 - AbhishekRai-10-27-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_012 extends RMA_TC_BaseTest {

@Test
public void RMA_Smoke_TC_012_Test() throws Exception,Error {
	
	try{
	parentlogger = reports.startTest("RMA_Smoke_TC_012_Add And Delete Of Restriction Of WC Claim", "Add And Delete Of Restriction Of WC Claim Is Validated");
	parentlogger.assignAuthor("Abhishek Rai");
	
	//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
	StrScreenShotTCName = "RMA_Smoke_TC_012";	
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	CurrentFrameID= null;
	//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================
	
	//Region =====================================================Local Variable Declaration Started Here=====================================================================================================
		String RestrictionDate;
	//EndRegion ==================================================Local Variable Declaration Completed Here=====================================================================================================
		
	//Region =================================================Local Variable Initialization Started Here=====================================================================================================
	RestrictionDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, -1,"MM/dd/yyyy");
	//EndRegion ==================================================Local Variable Initialization Completed Here=====================================================================================================
	
	//Region =================================================Add Restriction For WC Claim Is Started Here=====================================================================================================
	RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmploymentInfo(driver), "Employment Info Tab On Workers' Comp Claim Creation Page",logval);		
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Img_EmploymentInfoRestriction(driver), "Restriction Image Button On Workers' Comp Claim Creation Page",logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added To Get Employee Restrictions Window Loaded In Worker's Compensation Claim Creation Page");
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Btn_AddRestrictionWrokLoss(driver), "Add New Restriction Button On Restrictions Window On Workers' Comp Claim Creation Page",logval);	
	RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_DateOfFirstRestrictions(driver), "Date Of First Restrictions TextBox On Add New Restrictions Window On Workers' Comp Claim Creation Page",RestrictionDate, logval);	
	Thread.sleep(5000);
	RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_DateOfLastRestricted(driver), "Date Of Last Restrictions TextBox On Add New Restrictions Window On Workers' Comp Claim Creation Page", logval);	
	
	RMA_Functionality_Utility.RMA_GenericSave_Utility(DefaultFrameID, false, "NA", "Restrictions Page", logval);	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_Supplementals(driver), "Supplementals Tab On Add New Restrictions Window Page",logval);	
	//EndRegion ===============================================Add Restriction For WC Claim Is  Completed Here=====================================================================================================
	
	//Region =================================================Delete Restriction For WC Claim Is Started Here=====================================================================================================
	driver.switchTo().parentFrame();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver), "Back Image Button On Claim Page ", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID); 	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmploymentInfo(driver), "Employment Info Tab On Workers' Comp Claim Creation Page",logval);		
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Img_EmploymentInfoRestriction(driver), "Restriction Image Button On Workers' Comp Claim Creation Page",logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added To Get Employee Restrictions Window Loaded In Worker's Compensation Claim Creation Page");	
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_chk_SelectWorkList(driver), "Select All Restrictions check Box On Work Loss List Window On Workers' Comp Claim Creation Page",logval);
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Btn_DeleteRestrictionsWorkLossList(driver), "All Restrictions List Delete Button On Restriction Window On Workers' Comp Claim Creation Page",logval);
	RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("Yes", "Partial", "Are you sure you want to delete?", "Message To Verify Delete Record On Restrictions Page", logval);
	//RMA_Functionality_Utility.RMA_GenericDelete_Utility("Restriction Page", true, logval); 	
	//EndRegion =================================================Delete Restriction For WC Claim Is  Completed Here=====================================================================================================
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
		 driver.switchTo().parentFrame();			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Claim Page ", logval);
		 //driver.switchTo().parentFrame();
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericUXTable_Btn_Close(driver), "Close Image Button On Workers Compensation Restrictions Page ", logval);
		 } catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}

