package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_AttachCreateDiary {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Btn_WorkActivities
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which WorkActivities Lookup Button On RMA Diary Attach Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-25-2016                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Btn_WorkActivitiesLookup(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='AddActivity']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Btn_WorkActivities
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Activity List On RMA Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-25-2016                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Lst_Activity(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lstActivity']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Txt_Activity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Activity TextBox On RMA Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-25-2016                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Txt_Activity(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='txtActivity']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ok Button On RMA Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-25-2016                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Btn_Ok(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btnOk']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Txt_TaskName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TaskName TextBox On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-25-2016                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Txt_TaskName(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='EntryName']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Chk_AutoNotificationCompleted
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Automatic Notification When Completed TextBox On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-21-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Chk_AutoNotificationCompleted(WebDriver driver)
	{
		Element = driver.findElement(By.id("AutoConfirmNotify")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Chk_AutoNotificationLate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Automatic Notification When Late TextBox On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-21-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Chk_AutoNotificationLate(WebDriver driver)
	{
		Element = driver.findElement(By.id("AutoLateNotification")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Txt_DueDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Due Date/Time TextBox On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-21-2017                                
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Txt_DueDate(WebDriver driver)
	{
		Element = driver.findElement(By.id("CompleteDate_date")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Txt_Notes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Notes TextBox On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-03-01-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Txt_Notes(WebDriver driver)
	{
		Element = driver.findElement(By.id("EntryNotes")); 
		return Element;
	}
		
	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Btn_AssignedUserTo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Assign Diary To Button On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-03-03-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Btn_AssignedUserTo(WebDriver driver)
	{
		Element = driver.findElement(By.id("AssignedUser_cmdAddCustomizedListUser")); 
		return Element;
	}
}