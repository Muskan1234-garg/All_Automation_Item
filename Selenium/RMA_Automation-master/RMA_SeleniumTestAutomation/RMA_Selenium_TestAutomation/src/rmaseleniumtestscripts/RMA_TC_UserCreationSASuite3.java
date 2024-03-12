/*package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_UserCreationSASuite3
//Description    : TC_UserCreationSASuite3_ModuleGroup and User Creation
//Depends On TC  : None
//Revision       : 0.0 - ImteyazAhmad-02-24-2016 
//=================================================================================================

public class RMA_TC_UserCreationSASuite3 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	public static String StrModuleGroupa2_TC_UserCreationSASuite3;
	public static String StrModuleGroupa1_TC_UserCreationSASuite3;
	public static String StrModuleGroupcsc_TC_UserCreationSASuite3;
	public static String StrModuleGroupb2_TC_UserCreationSASuite3;
	public static String StrModuleGroupb1_TC_UserCreationSASuite3;
	public static String StrUsera2_TC_UserCreationSASuite3;
	public static String StrUsera1_TC_UserCreationSASuite3;
	public static String StrUsercsc_TC_UserCreationSASuite3;
	public static String StrUserq1_TC_UserCreationSASuite3;
	public static String StrUserq2_TC_UserCreationSASuite3;
	public static String StrUserb2_TC_UserCreationSASuite3;
	public static String StrUserb1_TC_UserCreationSASuite3;
	public void RMA_TC_UserCreationSASuite3_Test () throws Exception, Error

	{
		try {
			parentlogger = reports.startTest("TC_UserCreationSASuite3_ Module Group And Users Are Created", "Module Group Is Created and User Is Added Into Respective Group");
			parentlogger.assignAuthor("Imteyaz Ahmad");
			String RMAApp_DSNSelect_Lst_DataSourceName;
			String StrMsg;
			String StrManager1;
			String StrManager2;
			//Local Variable Declaration Completed
			
			StrScreenShotTCName = "TC_UserCreationSASuite3";
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			loggerval3 = "NotInitialized";
			loggerval4 = "NotInitialized";
			loggerval5 = "NotInitialized";
			loggerval6 = "NotInitialized";
			loggerval7 = "NotInitialized";
			loggerval8 = "NotInitialized";
			loggerval9 = "NotInitialized";
			loggerval10 = "NotInitialized";
			loggerval11 = "NotInitialized";
			loggerval12 = "NotInitialized";
			testcall1 = false; 
			testcall2 = false; 
			testcall3 = false;
			testcall4 = false; 
			testcall5 = false; 
			testcall6 = false;
			testcall7 = false;
			testcall8 = false;
			testcall9 = false;
			testcall10 = false;
			testcall11 = false;
			testcall12 = false;
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMA_Suite_03_SprVsrApprovalTestData Is Fetched To Retrieve Data
			RMAApp_DSNSelect_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_002", 1, 0); //DSN Name  Is Fetched From DataSheet RMA_TC_002
		
			//ModuleGroups- ModuleGroupa2_, ModuleGroupa1_,ModuleGroupcsc_, ModuleGroupb2_, ModuleGroupb1_  - Are Created
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ModuleGroupAddition To Add A ModuleGroup");
			testcall1 = true;
			StrModuleGroupa2_TC_UserCreationSASuite3 = RMA_Functionality_Utility.RMA_ModuleGroupAddition("ModuleGroupa2_", RMAApp_DSNSelect_Lst_DataSourceName, 1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			StrMsg = "A Module Group With Name : " +" " +StrModuleGroupa2_TC_UserCreationSASuite3 +" " + "Is Added Successfully";
			parentlogger.log(LogStatus.INFO, StrMsg);
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ModuleGroupAddition To Add A ModuleGroup");
			testcall2 = true;			
			StrModuleGroupa1_TC_UserCreationSASuite3 = RMA_Functionality_Utility.RMA_ModuleGroupAddition("ModuleGroupa1_", RMAApp_DSNSelect_Lst_DataSourceName, 1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			StrMsg = "A Module Group With Name : " +" " +StrModuleGroupa1_TC_UserCreationSASuite3 +" " + "Is Added Successfully";
			parentlogger.log(LogStatus.INFO, StrMsg);
					
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ModuleGroupAddition To Add A ModuleGroup");
			testcall3 = true;			
			StrModuleGroupcsc_TC_UserCreationSASuite3 = RMA_Functionality_Utility.RMA_ModuleGroupAddition("ModuleGroupcsc_", RMAApp_DSNSelect_Lst_DataSourceName, 1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			StrMsg = "A Module Group With Name : " +" " +StrModuleGroupcsc_TC_UserCreationSASuite3 +" " + "Is Added Successfully";
			parentlogger.log(LogStatus.INFO, StrMsg);
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ModuleGroupAddition To Add A ModuleGroup");
			testcall9 = true;			
			StrModuleGroupb2_TC_UserCreationSASuite3 = RMA_Functionality_Utility.RMA_ModuleGroupAddition("ModuleGroupb2_", RMAApp_DSNSelect_Lst_DataSourceName, 1);
			loggerval9 = logger.toString();
			parentlogger.appendChild(logger);
			StrMsg = "A Module Group With Name : " +" " +StrModuleGroupb2_TC_UserCreationSASuite3 +" " + "Is Added Successfully";
			parentlogger.log(LogStatus.INFO, StrMsg);
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ModuleGroupAddition To Add A ModuleGroup");
			testcall10 = true;			
			StrModuleGroupb1_TC_UserCreationSASuite3 = RMA_Functionality_Utility.RMA_ModuleGroupAddition("ModuleGroupb1_", RMAApp_DSNSelect_Lst_DataSourceName, 1);
			loggerval10 = logger.toString();
			parentlogger.appendChild(logger);
			StrMsg = "A Module Group With Name : " +" " +StrModuleGroupb1_TC_UserCreationSASuite3 +" " + "Is Added Successfully";
			parentlogger.log(LogStatus.INFO, StrMsg);
								
			//Users - Usera2_ , Usera1_ , Usercsc_, Userq2, Userq1, Userb2, Userb1- Are Created And Added To Above Respective Module Group
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserAdditionUtility To Add A User");
			testcall4 = true;			
			StrUsera2_TC_UserCreationSASuite3 = RMA_Functionality_Utility.RMA_UserAdditionUtility("Usera2_", "abk@csc.com", "", RMAApp_DSNSelect_Lst_DataSourceName, StrModuleGroupa2_TC_UserCreationSASuite3, 1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			StrMsg = "A User With Name : " +" " +StrUsera2_TC_UserCreationSASuite3 +" " + "Is Added Successfully To Module Group : " +" " +StrModuleGroupa2_TC_UserCreationSASuite3 ;
			parentlogger.log(LogStatus.INFO, StrMsg);
			
			StrManager2 = StrUsera2_TC_UserCreationSASuite3+" "+StrUsera2_TC_UserCreationSASuite3;
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserAdditionUtility To Add A User");
			testcall5 = true;			
			StrUsera1_TC_UserCreationSASuite3 = RMA_Functionality_Utility.RMA_UserAdditionUtility("Usera1_", "abk@csc.com", StrManager2, RMAApp_DSNSelect_Lst_DataSourceName, StrModuleGroupa1_TC_UserCreationSASuite3, 1);
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			StrMsg = "A User With Name : " +" " +StrUsera1_TC_UserCreationSASuite3 +" " + "Is Added Successfully To Module Group : " +" " +StrModuleGroupa1_TC_UserCreationSASuite3 ;
			parentlogger.log(LogStatus.INFO, StrMsg);
			
			StrManager1 = StrUsera1_TC_UserCreationSASuite3+" "+StrUsera1_TC_UserCreationSASuite3;
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserAdditionUtility To Add A User");
			testcall6 = true;			
			StrUsercsc_TC_UserCreationSASuite3 = RMA_Functionality_Utility.RMA_UserAdditionUtility("Usercsc_", "abk@csc.com", StrManager1, RMAApp_DSNSelect_Lst_DataSourceName, StrModuleGroupcsc_TC_UserCreationSASuite3, 1);
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			StrMsg = "A User With Name : " +" " +StrUsercsc_TC_UserCreationSASuite3 +" " + "Is Added Successfully To Module Group : " +" " +StrModuleGroupcsc_TC_UserCreationSASuite3 ;
			parentlogger.log(LogStatus.INFO, StrMsg);
			
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserAdditionUtility To Add A User");
			testcall7 = true;			
			StrUserq2_TC_UserCreationSASuite3 = RMA_Functionality_Utility.RMA_UserAdditionUtility("Userq2_", "abk@csc.com", "", RMAApp_DSNSelect_Lst_DataSourceName, StrModuleGroupa1_TC_UserCreationSASuite3, 1);
			loggerval7 = logger.toString();
			parentlogger.appendChild(logger);
			StrMsg = "A User With Name : " +" " +StrUserq2_TC_UserCreationSASuite3 +" " + "Is Added Successfully To Module Group : " +" " +StrModuleGroupa1_TC_UserCreationSASuite3 ;
			parentlogger.log(LogStatus.INFO, StrMsg);
			//Userq2 is created and It Has No Manager
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserAdditionUtility To Add A User");
			testcall8 = true;			
			StrUserq1_TC_UserCreationSASuite3 = RMA_Functionality_Utility.RMA_UserAdditionUtility("Userq1_", "abk@csc.com", StrUserq2_TC_UserCreationSASuite3+" "+StrUserq2_TC_UserCreationSASuite3,RMAApp_DSNSelect_Lst_DataSourceName , StrModuleGroupcsc_TC_UserCreationSASuite3, 1);
			loggerval8 = logger.toString();
			parentlogger.appendChild(logger);
			StrMsg = "A User With Name : " +" " +StrUserq1_TC_UserCreationSASuite3 +" " + "Is Added Successfully To Module Group : " +" " +StrModuleGroupcsc_TC_UserCreationSASuite3 ;
			parentlogger.log(LogStatus.INFO, StrMsg);
			//Userq1 is created and Its Manager Is Userq2
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserAdditionUtility To Add A User");
			testcall10 = true;			
			StrUserb2_TC_UserCreationSASuite3 = RMA_Functionality_Utility.RMA_UserAdditionUtility("Userb2_", "abk@csc.com", "", RMAApp_DSNSelect_Lst_DataSourceName, StrModuleGroupb2_TC_UserCreationSASuite3, 1);
			loggerval10 = logger.toString();
			parentlogger.appendChild(logger);
			StrMsg = "A User With Name : " +" " +StrUserb2_TC_UserCreationSASuite3 +" " + "Is Added Successfully To Module Group : " +" " +StrModuleGroupb2_TC_UserCreationSASuite3 ;
			parentlogger.log(LogStatus.INFO, StrMsg);
			//Userb2 is created and It Has No Manager
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserAdditionUtility To Add A User");
			testcall11 = true;			
			StrUserb1_TC_UserCreationSASuite3 = RMA_Functionality_Utility.RMA_UserAdditionUtility("Userb1_", "abk@csc.com", StrUserb2_TC_UserCreationSASuite3+" "+StrUserb2_TC_UserCreationSASuite3,RMAApp_DSNSelect_Lst_DataSourceName , StrModuleGroupb1_TC_UserCreationSASuite3, 1);
			loggerval11 = logger.toString();
			parentlogger.appendChild(logger);
			StrMsg = "A User With Name : " +" " +StrUserb1_TC_UserCreationSASuite3 +" " + "Is Added Successfully To Module Group : " +" " +StrModuleGroupb1_TC_UserCreationSASuite3 ;
			parentlogger.log(LogStatus.INFO, StrMsg);
			//Userb1 is created and Its Manager Is Userb2
			
			
			
			
		} catch (Exception|Error e) {

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_ModuleGroupAddition");
				parentlogger.appendChild(logger);
			}
			else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_ModuleGroupAddition");
				parentlogger.appendChild(logger);
			}
			else if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_ModuleGroupAddition");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserAdditionUtility");
				parentlogger.appendChild(logger);
			}
			else if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserAdditionUtility");
				parentlogger.appendChild(logger);
			}
			else if (testcall6 == true && loggerval6.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserAdditionUtility");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall7 == true && loggerval7.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserAdditionUtility");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall8 == true && loggerval8.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserAdditionUtility");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall9 == true && loggerval9.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_ModuleGroupAddition");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall10 == true && loggerval10.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_ModuleGroupAddition");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall11 == true && loggerval11.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserAdditionUtility");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall12 == true && loggerval12.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserAdditionUtility");
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
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);
			}
			reports.endTest(parentlogger);
		} catch (Exception |Error e) {
			
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
	}
}

*/