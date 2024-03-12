package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Search;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_109
//Description    : Verify Payment History Display All The Transaction Is Validated
//Depends On TC  : RMA_QTPRegression_TC_105, RMA_QTPRegression_TC_106
//Revision       : 0.0 - AbhishekRai-10-17-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_109 extends RMA_TC_BaseTest {	
	@Test
	public void RMA_QTPRegression_TC_109_Test() throws Exception,Error {
		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_109_Verify Payment History Display All The Transaction", "Verify Payment History Display All The Transaction Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");		
			
			//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_109";		
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;		
			CurrentFrameID=null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================
					
			//Region =====================================================Steps To Search Claim Is Started Here ===============================================================================================================================================================			
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Parent Frame Needs To Be Activated");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page", "Claim Number TextBox", StrClaimNumber, StrClaimNumber,DefaultFrameID,logval);			
			//EndRegion ==================================================Steps To Search Claim Is Completed Here ===============================================================================================================================================================
							
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "General Claim"),"General Claim Breadcrumb From Financial Reserves Page",logval);
					
			//Region =====================================================Steps Navigate Transaction History Screen Is Started Here===================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Img_TransactionHistory(driver), "Transaction History Image On Payments Page", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ClaimInvolvement);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_QTPRegression_TC_108.StrControlNumber_QTPRegression_TC_106, "Control Number on Transaction History Window On Financial Reserve Page", logval);
			//EndRegion ==================================================Steps Navigate Transaction History Screen Is Completed Here===================================================================================================================================================================================================================================
				
		} 
		catch (Exception|Error e) {

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

		} catch (Exception |Error e) {
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
