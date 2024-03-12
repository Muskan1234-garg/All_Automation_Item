package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_058
//Description    : Successful Carrier General Claim Creation Is Validated 
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-10-31-2017
//===================================================================================================================================================================================================================================================================================================================================


public class RMA_Smoke_TC_058 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_058_Test() throws Exception,Error {

		StrScreenShotTCName = "CarrierGCClaim";
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

			parentlogger = reports.startTest("RMA_Smoke_TC_058_Carrier GC Claim Creation" ,"Successful Carrier General Claim Creation Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");


			String CarrierGenClaimCreation_Txt_DateOfEvent;
			String CarrierGenClaimCreation_Txt_TimeOfEvent;
			String CarrierGenClaimCreation_Txt_TimeOfClaim;
			String CarrierGenClaimCreation_Txt_DateOfClaim;
			String CarrierGenClaimCreation_Txt_ClaimStatus;
			String CarrierGenClaimCreation_Txt_Department;
			String CarrierGenClaimCreation_Txt_ClaimType;	
			String CarrierClaimNumber;
			String CarrierGenClaimCreation_Lst_PolicySystem;
			String CarrierGenClaimCreation_Txt_PolicyLOB;
			String CarrierGenClaimCreation_Lnk_PolicyLOB;
			int CarrierGenClaimCreation_Txt_PolicyNumber;
			//Local Variable Declaration Completed Here

			CarrierGenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			CarrierGenClaimCreation_Txt_DateOfClaim = 	CarrierGenClaimCreation_Txt_DateOfEvent;
			CarrierGenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			CarrierGenClaimCreation_Txt_TimeOfEvent =  CarrierGenClaimCreation_Txt_TimeOfClaim;
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite23_SmokeSuite03.xlsx"); //Excel WorkBook RMA_Suite23_SmokeSuite03 IS Fetched To Retrieve Data 
			CarrierGenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_058", 1, 0); //Claim Type Is Fetched From DataSheet RMA_Smoke_TC_058
			CarrierGenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_058", 1,1 ); //Claim Status Is Fetched From DataSheet RMA_Smoke_TC_058
			CarrierGenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_058", 1,2 ); //Department Is Fetched From DataSheet RMA_Smoke_TC_058
			CarrierGenClaimCreation_Txt_PolicyLOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_058", 1,3 ); //Policy LOB Is Fetched From DataSheet RMA_Smoke_TC_058
			CarrierGenClaimCreation_Lst_PolicySystem =ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_058", 1,4 ); //Policy System Is Fetched From DataSheet RMA_Smoke_TC_058
			CarrierGenClaimCreation_Txt_PolicyNumber =ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_058", 1,5 ); //Policy Number Is Fetched From DataSheet RMA_Smoke_TC_058
			CarrierGenClaimCreation_Lnk_PolicyLOB =ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_058", 1,6 ); //Policy LOB Link Is Fetched From DataSheet RMA_Smoke_TC_058
			//General Claim Data Fetch From Excel WorkBook Is Completed Here


			//============================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CarrierGC","RMA_CarrierGCClaimCreation",0)+" To Successfully Create A Carrier General Claim");
			testcall1 = true;
			CarrierClaimNumber = RMA_Functionality_Utility.RMA_CarrierGCClaimCreation(CarrierGenClaimCreation_Txt_DateOfEvent, CarrierGenClaimCreation_Txt_DateOfClaim, CarrierGenClaimCreation_Txt_TimeOfClaim, CarrierGenClaimCreation_Txt_TimeOfEvent, CarrierGenClaimCreation_Txt_ClaimType, CarrierGenClaimCreation_Txt_ClaimStatus, CarrierGenClaimCreation_Txt_Department, CarrierGenClaimCreation_Txt_PolicyLOB,CarrierGenClaimCreation_Lst_PolicySystem, CarrierGenClaimCreation_Lnk_PolicyLOB, "0" + CarrierGenClaimCreation_Txt_PolicyNumber,logval1);
			parentlogger.log(LogStatus.INFO, "Carrier GC Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(CarrierClaimNumber, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
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
			if (testcall1== true && loggerval1.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_CarrierGCClaimCreation" + " " +  "To Create Successful New Carrier General Claim And Hence The Test Case Is A Fail");
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
				//Since Here The Code Starts And Ends At Claim Frame Itself Hence No Need To Switch Parent Frame
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

