package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_AttachCreateDiary {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Btn_WorkActivities
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Work Activities Lookup Button On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-19-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Btn_WorkActivitiesLookup(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='wrkAct']/following-sibling::div/span/button/i")); //Unique X-Path Of Work Activities Lookup Button On RMA Attach/Create Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Btn_AssignedUserTo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Assign Diary To Button On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-05-2017                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Btn_AssignedUserTo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_assignedUser")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Lst_Activity
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Activities List On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-19-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Lst_Activity(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='sel12']")); //Unique X-Path Of Activities List On RMA Attach/Create Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Txt_Comments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Comments TextBox On RMA Attach/Create Diary Page's Work Activities Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-19-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Txt_Comments(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='editor']")); //Unique X-Path Of Comments TextBox RMA Attach/Create Diary Page's Work Activities Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Btn_WorkActivitiesOK
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which OK Button On RMA Attach/Create Diary Page's Work Activities Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-19-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Btn_WorkActivitiesOK(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='usericon']/i")); //Unique X-Path Of OK Button On RMA Attach/Create Diary Page's Work Activities Window Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Txt_TaskName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TaskName TextBox On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-19-2017                                  
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Txt_TaskName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='entryName']")); //Unique X-Path Of TaskName TextBox On RMA Attach/Create Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Txt_Notes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Notes TextBox On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-19-2017                                  
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Txt_Notes(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='entryNotes']")); //Unique X-Path Of Notes TextBox On RMA Attach/Create Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Txt_EstimatedHours
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EStimated Hours TextBox On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-19-2017                                  
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Txt_EstimatedHours(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='estHrs']")); //Unique X-Path Of Estimated Hours TextBox On RMA Attach/Create Diary Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Lst_Priority
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Priority List On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-19-2017                                  
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Lst_Priority(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='priority']")); //Unique X-Path Of Priority List Box On RMA Attach/Create Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Image Button On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-19-2017                                  
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Btn_Cancel(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='Cancel']/i")); //Unique X-Path Of Cancel Image Button On RMA Attach/Create Diary Page Is Fetched
		} catch (Exception|Error e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Tab On RMA Attach/Create Diary Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-19-2017                                   
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Tab_Supplementals(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i")); //Unique X-path Of Supplemental Tab On RMA Attach/Create Diary Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Tab_Diary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary Tab On RMA Attach/Create Diary Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-19-2017                                   
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Tab_Diary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Diary')]/i")); //Unique X-path Of Diary Tab On RMA Attach/Create Diary Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Btn_HeaderClose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On RMA Attach/Create Diary Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-19-2017                                   
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Btn_HeaderClose(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("btnCancelmemo")); //Unique Name Of Close Button On RMA Attach/Create Diary Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Chk_AutoNotificationCompleted
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Automatic Notification When Completed TextBox On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-31-2017                 
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Chk_AutoNotificationCompleted(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("autoConfirmNotify")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Chk_AutoNotificationLate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Automatic Notification When Late TextBox On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-31-2017         
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Chk_AutoNotificationLate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("autoLateNotification")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachCreate_Diary_Txt_DueDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Due Date/Time TextBox On RMA Attach/Create Diary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-31-2017                                
	//============================================================================================
	public static WebElement RMAApp_AttachCreate_Diary_Txt_DueDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='completeDate' and contains(@class,'ng-valid-date')]")); 
		return Element;
	}
}
