package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Utilities_TaskManager {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_TaskManager_ScheduleNewTask
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Schedule A New Task Button On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-06-07-2018                                
	// ============================================================================================
	public static WebElement RMAApp_TaskManager_ScheduleNewTask(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnAddSchedule")); //Unique Id Of  Schedule A New Task Button On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Txt_TaskType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Task Type Text Box On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Txt_TaskType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstTaskType")); //Unique Id Of Task Type Text Box On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Txt_SubTaskType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sub Task Type Text Box On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Txt_SubTaskType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstSubTaskName")); //Unique Id Of Sub Task Type Text Box On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Txt_TaskType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Schedule Type Text Box On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Txt_ScheduleType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstScheduleType")); //Unique Id Of  Schedule Type Text Box On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element; 
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Txt_Date
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Text Box On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Txt_Date(WebDriver driver)
	{
		Element = driver.findElement(By.id("txtDate")); //Unique Id Of Date Text Box On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Txt_Time
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Eastern Standard Time Text Box On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Txt_Time(WebDriver driver)
	{
		Element = driver.findElement(By.id("txtTime")); //Unique Id Of Eastern Standard Time Text Box On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Img_NewPrintCheck
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which New Image Button on Print Check Batch Parameters On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Img_NewPrintCheck(WebDriver driver)
	{
		Element = driver.findElement(By.id("New_SettingsGrid")); //Unique Id Of New Image Button on Print Check Batch Parameters On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Account Name List On Print Check Batch Parameters On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Lst_BankAccount(WebDriver driver)
	{
		Element = driver.findElement(By.id("ddlAcc")); //Unique Id Of Account Name List On Print Check Batch Parameters On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Chk_IncludeCombinedPaymeents
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Include Combined Payments CheckBox On Print Check Batch Parameters On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Chk_IncludeCombinedPayments(WebDriver driver)
	{
		Element = driver.findElement(By.id("includecombinedpayments")); //Unique Id Of Account Name List On Print Check Batch Parameters On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Chk_IncludeAutoPayments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Include Auto Payments CheckBox On Print Check Batch Parameters On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Chk_IncludeAutoPayments(WebDriver driver)
	{
		Element = driver.findElement(By.id("includeautopayments")); //Unique Id Of Include Auto Payments CheckBox On Print Check Batch Parameters On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image Button On Print Check Batch Parameters On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Img_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("Save")); //Unique Id Of Save Image Button On Print Check Batch Parameters On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Btn_ButtonSave
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image Button On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Btn_ButtonSave(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnSave")); //Unique Id Of Save Image Button On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Lst_IntervalType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Interval Type List On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Lst_IntervalType(WebDriver driver)
	{
		Element = driver.findElement(By.id("IntervalType")); //Unique Id Of Interval Type List On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Txt_Interval
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Interval Type List On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Txt_Interval(WebDriver driver)
	{
		Element = driver.findElement(By.id("Interval")); //Unique Id Of Interval Type List On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Chk_SelectDays
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Days Check Boxes On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver , Day Variable Of String Type 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Chk_SelectDays(WebDriver driver,String Day)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Day+"')]/ancestor::span/input")); //Unique Id Of  Days Check Boxes On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Lst_Month
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Month List On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Lst_Month(WebDriver driver)
	{
		Element = driver.findElement(By.id("Month")); //Unique Id Of Month List On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Txt_DayOfMonth
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Day Of Month Text Box On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Txt_DayOfMonth(WebDriver driver)
	{
		Element = driver.findElement(By.id("DayOfMonth")); //Unique Id Of Day Of Month Text Box On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Chk_SelectMonths
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Months Check Boxes On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver , Day Variable Of String Type 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Chk_SelectMonths(WebDriver driver,String Month)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Month+"')]/ancestor::span/input")); //Unique Id Of Months On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TMJobsView_Txt_StartDateTime
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Start Date/Time  Of Completed Task On TM Jobs View Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                
	// ============================================================================================
	public static WebElement RMAApp_TMJobsView_Txt_StartDateTime(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='TMJobListGrid_gvData_ctl00']/tbody/tr[2]/td[7]")); //Unique Id Of Start Date/Time  Of Completed Task On TM Jobs View Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->TM Jobs View Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TMJobsView_Txt_JobState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Start Date/Time  Of Completed Task On TM Jobs View Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nikitathani-06-07-2018                                
	// ============================================================================================
	public static WebElement RMAApp_TMJobsView_Txt_JobState(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='TMJobListGrid_gvData_ctl00']/tbody/tr[2]/td[5]/a[contains(text(),'Completed')]")); //Unique Id Of Start Date/Time  Of Completed Task On TM Jobs View Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->TM Job Views Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Lst_CheckStocks
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Stock Name List On Print Check Batch Parameters On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-28-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Lst_CheckStocks(WebDriver driver)
	{
		Element = driver.findElement(By.id("ddlcheckstock")); //Unique Id Of Check Stock Name List On Print Check Batch Parameters On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Lst_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Stock Name List On Print Check Batch Parameters On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-28-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Lst_DistributionType(WebDriver driver)
	{
		Element = driver.findElement(By.id("ddlDistributionType")); //Unique Id Of Check Stock Name List On Print Check Batch Parameters On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Txt_NumberOfOverdueDays
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Number Of Overdue Days Text Box On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-11-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Txt_NumberOfOverdueDays(WebDriver driver)
	{
		Element = driver.findElement(By.id("tbNoOfOverDueDays")); //Unique Id Of Number Of Overdue Days Text Box On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Chk_OverDueDiaryNotification_Both
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OverDue Diary Notification By Both CheckBox On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-11-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Chk_OverDueDiaryNotification_Both(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkBoth")); //Unique Id Of OverDue Diary Notification By Both CheckBox On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduledTask_Chk_OverDueDiaryNotification_SystemDiary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OverDue Diary Notification By Both CheckBox On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-11-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduledTask_Chk_OverDueDiaryNotification_SystemDiary(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkSysDiary")); //Unique Id Of OverDue Diary Notification By Both CheckBox On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoCheckBatch_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account List On Auto Check Batch On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-24-2020                              
	// ============================================================================================
	public static WebElement RMAApp_AutoCheckBatch_Lst_BankAccount(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstAccounts")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoCheckBatch_Btn_SelectBankAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Bank Account Button On Auto Check Batch On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-24-2020                              
	// ============================================================================================
	public static WebElement RMAApp_AutoCheckBatch_Btn_SelectBankAccount(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@onclick = 'javascript: return AddSelected();']")); 
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_AutoCheckBatch_Btn_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Distribution Type Look Up Button On Auto Check Batch On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-24-2020                              
	// ============================================================================================
	public static WebElement RMAApp_AutoCheckBatch_Btn_DistributionType(WebDriver driver)
	{
		Element = driver.findElement(By.id("IncludeDistributiontypes_multicodebtn")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoCheckBatch_Chk_IncludeCombinedPaymeents
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Include Combined Payments CheckBox On Auto Check Batch Parameters On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-24-2020                                        
	// ============================================================================================
	public static WebElement RMAApp_AutoCheckBatch_Chk_IncludeCombinedPaymeents(WebDriver driver)
	{
		Element = driver.findElement(By.id("chklblIncludeCombinedPyas")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoCheckBatch_Chk_UsekAdjusterLimit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check User Privileges Limits of Adjuster instead of Last Updated User CheckBox On Auto Check Batch Parameters On Scheduled Task Page On RMA Application Utilities -->Tools and Designers -->Task Manager -->View Scheduled Tasks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-24-2020                                        
	// ============================================================================================
	public static WebElement RMAApp_AutoCheckBatch_Chk_UsekAdjusterLimit(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkUseAdjusterLimit")); 
		return Element;
	}
}
