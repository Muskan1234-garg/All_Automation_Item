package rmaseleniumPOM_UX;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Utilities_AutoDiarySetup {
	public static WebElement Element = null;
	public static List<WebElement> Element_1 = null ;

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Image Button On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_AddNew(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("New_WPAAutoDiaryList")); //Unique Id  Of  Add New Image Button On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_Next
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Image Button On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_Next(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("CtrlBestPracticeDiaryWizard_StartNavigationTemplateContainerID_StepNextButton")); //Unique Id Of  Add New Image Button On RMA Application Auto Diary Setup Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Auto Diary Wizard Radio Button On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Rdb_AutoDiaryWizard(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("CtrlBestPracticeDiaryWizard_rdoAutoDiaryWizard")); //Unique Id  Of  Auto Diary Wizard Radio Button On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_CreationProcess_Next
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Image Button On Create Process Screen On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_CreateProcess_Next(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("CtrlBestPracticeDiaryWizard_StepNavigationTemplateContainerID_StepNextButton")); //Unique Id Of  Add New Image Button On Create Process Screen On RMA Application Auto Diary Setup Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_BestPracticeScenerio_Next
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Image Button On Best Practice Scenario Screen On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_BestPracticeScenerio_Next(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("CtrlAutoDiaryWizard_StartNavigationTemplateContainerID_StepNextButton")); //Unique Id Of  On Best Practice Scenario Screen On RMA Application Auto Diary Setup Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Lst_Template
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Template List On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Lst_Template(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("CtrlAutoDiaryWizard_cboTemplate")); //Unique Id  Of Template List On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Txt_AutoDiaryDefinition
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Auto Diary Definition On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Txt_AutoDiaryDefinition(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("CtrlAutoDiaryWizard_txtDiaryName")); //Unique Id Of Which  Auto Diary Definition On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Txt_DiaryDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary Date On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Txt_DiaryDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("CtrlAutoDiaryWizard_txtDiaryDate")); //Unique Id  Of Diary Date On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Lst_Priority
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Priority List On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Lst_Priority(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("CtrlAutoDiaryWizard_cboPriority")); //Unique Id  Of Priority List On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Txt_DaysNoAfterDueDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Days Number After Due Date Text Box On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Txt_DaysNoAfterDueDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("CtrlAutoDiaryWizard_txtDaysNoAfterDueDate")); //Unique Id  Of Days Number After Due Date Text Box On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Lst_AvailableFilters
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Available Filters List On Business Rule Definition Screen On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Lst_AvailableFilters(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("CtrlAutoDiaryWizard_AvailableFilters")); //Unique Id  Of Available Filters List Business Rule Definition Screen On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Lst_AvailableSubFilters
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Available Sub Filters List On Available Filter On Business Rule Definition Screen On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Lst_AvailableSubFilters(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Available")); //Unique Id  Of Available Sub Filters List On Available Filter  Business Rule Definition Screen On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_AddAvailableFilters
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add Available Filters Button On Business Rule Definition Screen On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_AddAvailableFilters(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='CtrlAutoDiaryWizard_btnAddAvlFilter']/i")); //Unique Id  Of Add Available Filters Button Business Rule Definition Screen On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Txt_XDaysFrom
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis X Days From Available Filters Text Field On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Txt_XDaysFrom(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtData")); //Unique Id  Of X Days From Available Filters Text Field On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Txt_ReserveChangeAmt
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis ReserveChangeAmt From Available Filters Text Field On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Txt_ReserveChangeAmt(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtData")); //Unique Id  Of ReserveChangeAmt From Available Filters Text Field On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Txt_XOrLessSchedulePaymentsLeft
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis XOrLessSchedulePaymentsLeft From Available Filters Text Field On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Txt_XOrLessSchedulePaymentsLeft(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtData")); //Unique Id  Of XOrLessSchedulePaymentsLeft From Available Filters Text Field On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ok Button RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_Ok(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnOk']/i")); //Unique Id  Of  Ok Button On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Button RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_Cancel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnCancel value=")); //Unique Id  Of  Cancel Button On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_BusinessRuleDefinition_Next
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Image Button On Business Rule Definition Screen On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_BusinessRuleDefinition_Next(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("CtrlAutoDiaryWizard_StepNavigationTemplateContainerID_StepNextButton")); //Unique Id Of  On Best Practice Scenario Screen On RMA Application Auto Diary Setup Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which WorkFlow Notification CheckBox On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static List<WebElement> RMAApp_AutoDiarySetup_Chk_WorkflowNotification(WebDriver driver)
	{
		Element_1= null;
		Element_1 = driver.findElements(By.xpath(".//*[@id='CtrlAutoDiaryWizard']/tbody/tr[1]/td/table/tbody/tr[4]/td/table/tbody/tr/td[2]/input")); //Unique Id  Of  WorkFlow Notification CheckBox On On RMA Application Auto Diary Setup Page Is Fetched
		return Element_1;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_ListSendUsers
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Button For Send User On WorkFlow Notification On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_ListSendUsers(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lstSendUsersbtn']/i")); //Unique Id  Of Search Button For Send User On WorkFlow Notification On On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Txt_SendUser_FirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FirstName TextBox For Send User On WorkFlow Notification On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Txt_SendUser_FirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("firstname")); //Unique Id  Of FirstName TextBox For Send User On WorkFlow Notification On On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Chk_SendUser_User
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which User CheckBox For Send User On WorkFlow Notification On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Chk_SendUser_User(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='gvUserList$ctl02$cbUserCustomizedList']")); //Unique Id  Of User CheckBox TextBox For Send User On WorkFlow Notification On On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_SendUser_SelectUser
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which User Select Button For Send User On WorkFlow Notification On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_SendUser_SelectUser(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Ok']/i")); //Unique Id  Of User CheckBox TextBox For User Select Button On WorkFlow Notification On On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_Finish
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Finish Image Button On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_Finish(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("CtrlAutoDiaryWizard_FinishNavigationTemplateContainerID_StepFinishButton")); //Unique Id Of Finish Image Button On RMA Application Auto Diary Setup Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_AddFilter
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Available Sub Filters Button On Business Rule Definition Screen On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_AddFilter(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnAdd']/i")); //Unique Id  Of Add Available Sub Filters Button On Business Rule Definition Screen On RMA Application Auto Diary Setup Page Is Fetched
		return Element; 
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_SearchWorkActivity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Work Activities Button On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_SearchWorkActivity(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lstWorkActivitybtn']/i")); //Unique Id  Of Search Work Activities Button On Auto Diary Setup Page Is Fetched
		return Element; 
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Lst_AvailableWorkActivities
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Available Activities List On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Lst_AvailableWorkActivities(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("AvailableActivities")); //Unique Id  Of Available Activities List On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_AddWorkActivities
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Work Activities Button On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_AddWorkActivities(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnAddWorkActivity']/i")); //Unique Id  Of Add Work Activities Button On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Lst_WPAAutoDiaries
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Current Auto Diary Definition List On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Lst_WPAAutoDiaries(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("WPAAutoDiaryList")); //Unique Id  Of Current Auto Diary Definition List  On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AutoDiarySetup_Btn_DeleteWPAAutoDiaries
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete WPA Auto Diary Setup Button On RMA Application Auto Diary Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-17-2019                                
	// ============================================================================================
	public static WebElement RMAApp_AutoDiarySetup_Btn_DeleteWPAAutoDiaries(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Delete_WPAAutoDiaryList']/i")); //Unique Id  Of Delete WPA Auto Diary Setup Button On RMA Application Auto Diary Setup Page Is Fetched
		return Element;
	}




}
