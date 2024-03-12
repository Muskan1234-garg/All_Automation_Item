package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_292_PC	
//Description    : RMA_TC_292_PC_Verify Adding,Editing And Deleting Of Attachment on Property Claim Page 
//Depends On TC  : NA
//Revision       : 0.0 - MahendraPSingh-01-10-2017
//Revision       : 0.1 - MahendraPSingh-01-20-2017- Updated for attachment method call for Add_ edit & delete 
//=================================================================================================

public class RMA_TC_292_PC extends RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName ;
    
@Test
public void RMA_TC_292_PC_Test() throws Exception,Error 
{ 
  try {
		parentlogger = reports.startTest("RMA_TC_292_PC_Attachment Add, Edit & Delete On" + " " +color.RMA_ChangeColor_Utility("PC CLAIM", 3) +" " +"Screen", "Verifying Attachment Add, Edit & Delete On Property Claim Screen");
		parentlogger.assignAuthor("Mahendra Singh");

		String RMAApp_PropertyClaim_Txt_ClaimType;
		String RMAApp_PropertyClaim_Txt_Department;
		int RMAApp_PropertyClaim_Txt_DateOfEvent;
		int RMAApp_PropertyClaim_Txt_TimeOfEvent;
		int RMAApp_PropertyClaim_Txt_DateOfClaim;
		int RMAApp_PropertyClaim_Txt_TimeOfClaim;
		String RMAApp_PropertyClaim_Txt_PropertyID;
		//Local Variable Declaration Completed Here

		StrScreenShotTCName = "RMA_TC_357";
		testcall1 = false;			
		loggerval1 = "NotInitialized";
		testcall2 = false;			
		loggerval2 = "NotInitialized";
		testcall3 = false;			
		loggerval3 = "NotInitialized";
		String StrPrimaryWindowHandle;
	   
	    RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
	    RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait is added as Home page is refreshed");

		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_06_SmokeSuite_01 Is Fetched To Retrieve Data
		RMAApp_PropertyClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_Prop
		RMAApp_PropertyClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 1); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_Prop
		RMAApp_PropertyClaim_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 2);//DateOfEvent Is Fetched From DataSheet RMA_Smoke_TC_002_Prop
		RMAApp_PropertyClaim_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 3);//TimeOfEvent Is Fetched From DataSheet RMA_Smoke_TC_002_Prop
		RMAApp_PropertyClaim_Txt_DateOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 4);//DateOfClaim Is Fetched From DataSheet RMA_Smoke_TC_002_Prop
		RMAApp_PropertyClaim_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 5);//TimeOfClaim Is Fetched From DataSheet RMA_Smoke_TC_002_Prop
		RMAApp_PropertyClaim_Txt_PropertyID = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 6); // PropertyId Is Fetched From DataSheet RMA_Smoke_TC_002_Prop

		//===============================================Creation Of Property Claim Is Started=====================================================================================================	
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PropClaimACOFF", "RMA_PropertyClaimCreation",0)+" Is Called To Create A Property Claim");
		testcall1 = true;
		StrClaimNumber_292 = RMA_Functionality_Utility.RMA_PropertyClaimCreation(RMAApp_PropertyClaim_Txt_ClaimType, RMAApp_PropertyClaim_Txt_Department, RMAApp_PropertyClaim_Txt_DateOfEvent, RMAApp_PropertyClaim_Txt_TimeOfEvent, RMAApp_PropertyClaim_Txt_DateOfClaim, RMAApp_PropertyClaim_Txt_TimeOfClaim, RMAApp_PropertyClaim_Txt_PropertyID, logval1);
		parentlogger.log(LogStatus.INFO, "New Property Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		//===============================================Creation Of Property Claim Is Completed==========================================================================================================================================		
		
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimpc");
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait is added as frame is switched to Property Claim Frame");
		
       //++++++++++++++++++++++++++++++++++++++++Attachment Add,edit functionality on VA claim screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
        RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents image on Property Claim screen", logval);
        StrPrimaryWindowHandle = driver.getWindowHandle();
        RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
        parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To Verify Attachment Add & Edit On Property Claim screen");
        testcall2 = true;
        RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", PhysicalPath, FileSize, false, logval1);
        parentlogger.log(LogStatus.INFO, "Attachment Add & Edit Functionality is verified on Claim Screen for PC Claim Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
        loggerval2 = logger.toString();
        parentlogger.appendChild(logger);
 
      //++++++++++++++++++++++++++++++++++++++++Attachment Add,edit functionality on VA claim screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
    
      //++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on VA claim screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
        
        parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To Verify Attachment Delete On Event screen");
        testcall3 = true;
        RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", PhysicalPath, FileSize, false, logval1);
        parentlogger.log(LogStatus.INFO, "Attachment Delete Functionality is verified on Claim Screen for PC Claim Number::r:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
        loggerval3 = logger.toString();
        parentlogger.appendChild(logger);
       
        driver.close();
   	    driver.switchTo().window(StrPrimaryWindowHandle);	
   //++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on VA claim screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	  
      } catch (Exception| Error e) {
    	 
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
	    logger.log(LogStatus.FAIL, "Following Error Occurred::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_PropertyClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
	    parentlogger.appendChild(logger);
        }
        else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
        {
	    logger.log(LogStatus.FAIL, "Following Error Occurred::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
	    parentlogger.appendChild(logger);
        }
        else if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
        {
	    logger.log(LogStatus.FAIL, "Following Error Occurred::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
	    parentlogger.appendChild(logger);
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
public void RMA_FailureReport(ITestResult result) throws Exception  //All The Information Associated With The Test Case Is Stored In Result Variable
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
			driver.switchTo().parentFrame();		
			driver.switchTo().frame(ParentFrame);		
			reports.endTest(parentlogger);	
			reports.flush();		
		}
	  }		
}




