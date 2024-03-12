package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Utilities_ToolsAndDesigners {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_CustPortalSetting_Btn_ViewUpdatePortal
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Script Editor Link On RMA Application Utilities -->Tools and Designers -->Script Editor Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
// ============================================================================================
public static WebElement RMAApp_TDScriptEditor_Tree_ScriptEditor(WebDriver driver)
{
	Element = driver.findElement(By.id("TreeScriptt0")); //Unique Id Of Script Editor Link On RMA Application Utilities -->Tools and Designers -->Script Editor Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_TDWPA_Img_New
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which New Image On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Img_New(WebDriver driver)
{
	Element = driver.findElement(By.id("New_WPAAutoDiaryList")); //Unique Id Of New Image On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Generic_Btn
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Button Name On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_ToolAndDesigner_Generic_Btn(WebDriver driver, String ButtonName)
{
	Element = driver.findElement(By.xpath(".//*[@value='"+ButtonName+"']")); //Unique xpath Of  Button Name On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
	
}

//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Radio_AutoDiaryWizard
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Radio_AutoDiaryWizard(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlBestPracticeDiaryWizard_rdoAutoDiaryWizard")); //Unique Id Of AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Lst_Template
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Lst_Template(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_cboTemplate")); //Unique Id Of AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Txt_AutoDiaryDiaryName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Txt_AutoDiaryDiaryName(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_txtDiaryName")); //Unique Id Of AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Txt_DiaryDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Txt_DiaryDate(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_txtDiaryDate")); //Unique Id Of AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Lst_Priority
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Lst_Priority(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_cboPriority")); //Unique Id Of AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Txt_DueDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Txt_DueDate(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_txtDaysNoAfterDueDate")); //Unique Id Of AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			:RMAApp_TDAutoDiarySet_Lst_AvailableFilters
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Lst_AvailableFilters(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_AvailableFilters")); //Unique Id Of AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Lst_SelectedFilters
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Lst_SelectedFilters(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_SelectedFilters")); //Unique Id Of AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Txt_Xdays
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Txt_Xdays(WebDriver driver)
{
	Element = driver.findElement(By.id("txtData")); //Unique Id Of AutoDiaryWizard Radio Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Chk_UserModified
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to user that last modified record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Chk_UserModified(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_chkUserModified")); //Unique Id Of 'Send diary to user that last modified record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Chk_UserCreated
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to user that created record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Chk_UserCreated(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_chkUserCreated")); //Unique Id Of 'Send diary to user that created record' CheckBox Option On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Chk_AdjAssign
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Chk_AdjAssign(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_chkAdjAssign")); //Unique Id Of 'Send diary to adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Chk_AdjAssigSupervisor
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Chk_AdjAssigSupervisor(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_chkAdjAssigSupervisor")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Btn_UsersGroupbtn
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Btn_UsersGroupbtn(WebDriver driver)
{
	Element = driver.findElement(By.id("lstSendUsersbtn")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Lbl_StepsHeading
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Lbl_StepsHeading(WebDriver driver)
{
	Element = driver.findElement(By.id("lblMessgeTitle")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_TDAutoDiarySet_Lbl_NotificationDays
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-17-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Txt_NotificationDays(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_NotificationDays")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_TDAutoDiarySet_Txt_ReRoutedDays
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-13-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Txt_ReRoutedDays(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_ReRoutedDays")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_TDAutoDiarySet_Btn_UsersRoutedbtn
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-13-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Btn_UsersRoutedbtn(WebDriver driver)
{
	Element = driver.findElement(By.id("lstUsersRoutedbtn")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			:  RMAApp_TDAutoDiarySet_Txt_EstTime
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-13-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Txt_EstTime(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_EstTime")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_TDAutoDiarySet_Txt_Instruction
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-13-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Txt_Instruction(WebDriver driver)
{
	Element = driver.findElement(By.id("CtrlAutoDiaryWizard_Instruction")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			:  RMAApp_TDAutoDiarySet_Btn_WorkActivity
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-13-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Btn_WorkActivity(WebDriver driver)
{
	Element = driver.findElement(By.id("lstWorkActivitybtn")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_TDAutoDiarySet_Lst_AvailableActivities
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-13-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Lst_AvailableActivities(WebDriver driver)
{
	Element = driver.findElement(By.id("AvailableActivities")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			:  RMAApp_TDAutoDiarySet_Lst_CurrentAutoDiaryDef
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-13-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Lst_CurrentAutoDiaryDef(WebDriver driver)
{
	Element = driver.findElement(By.id("WPAAutoDiaryList")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			:  RMAApp_TDAutoDiarySet_Img_Edit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-13-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Img_Edit(WebDriver driver)
{
	Element = driver.findElement(By.id("Edit_WPAAutoDiaryList")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_TDAutoDiarySet_Img_Delete
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-13-2016                                 
//============================================================================================
public static WebElement RMAApp_TDAutoDiarySet_Img_Delete(WebDriver driver)
{
	Element = driver.findElement(By.id("Delete_WPAAutoDiaryList")); //Unique Id Of 'Send diary to the Supervisor of adjuster assigned to record' CheckBox On RMA Application Utilities -->Tools and Designers -->Auto Diary Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			:  RMAApp_TDQueryDes_Lbl_StepHeading
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Step Heading Label On RMA Application Utilities -->Tools and Designers -->Query Designer Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-22-2016                                 
//============================================================================================
public static WebElement RMAApp_TDQueryDes_Lbl_StepHeading(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[contains(@id,'Wizardlist_lblStep') or @id='Wizardlist_lblSearchWizStep1' ] ")); //Uniquexpath Of Step Heading Label On RMA Application Utilities -->Tools and Designers -->Query Designer Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_TDQueryDes_Lbl_SearchName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'What do you want to call your search?' TextBox On RMA Application Utilities -->Tools and Designers -->Query Designer Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-22-2016                                 
//============================================================================================
public static WebElement RMAApp_TDQueryDes_Txt_SearchName(WebDriver driver)
{
	Element = driver.findElement(By.id("Wizardlist_searchname")); //Unique Id Of 'What do you want to call your search?' TextBox On RMA Application Utilities -->Tools and Designers -->Query Designer Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_TDQueryDes_Txt_SearchDesc
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'What is the description of your search? (Optional)' TextBox On RMA Application Utilities -->Tools and Designers -->Query Designer Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-22-2016                                 
//============================================================================================
public static WebElement RMAApp_TDQueryDes_Txt_SearchDesc(WebDriver driver)
{
	Element = driver.findElement(By.id("Wizardlist_searchdesc")); //Unique Id Of 'What is the description of your search? (Optional)' TextBox On RMA Application Utilities -->Tools and Designers -->Query Designer Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			:  RMAApp_TDQueryDes_Lst_SearchType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'What type of search do you want to create?' WebList On RMA Application Utilities -->Tools and Designers -->Query Designer Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-22-2016                                 
//============================================================================================
public static WebElement RMAApp_TDQueryDes_Lst_SearchType(WebDriver driver)
{
	Element = driver.findElement(By.id("Wizardlist_searchtype")); //Unique Id Of 'What type of search do you want to create?' WebList On RMA Application Utilities -->Tools and Designers -->Query Designer Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			:  RMAApp_TDQueryDes_Lst_SearchCats
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Select A Category' WebList On RMA Application Utilities -->Tools and Designers -->Query Designer Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-22-2016                                 
//============================================================================================
public static WebElement RMAApp_TDQueryDes_Lst_SearchCats(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[contains(@id,'Wizardlist_searchcats')]")); //Unique Xpath Of 'Select A Category' WebList On RMA Application Utilities -->Tools and Designers -->Query Designer Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_TDQueryDes_Lst_FieldsAvailable
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Fields Available' WebList On RMA Application Utilities -->Tools and Designers -->Query Designer Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-22-2016                                 
//============================================================================================
public static WebElement RMAApp_TDQueryDes_Lst_FieldsAvailable(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[contains(@id,'Wizardlist_fields')]")); //Unique xpath Of 'Fields Available' WebList On RMA Application Utilities -->Tools and Designers -->Query Designer Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_TDQueryDes_Lst_FieldsInSearch
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Fields in Search' WebList On RMA Application Utilities -->Tools and Designers -->Query Designer Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-22-2016                                 
//============================================================================================
public static WebElement RMAApp_TDQueryDes_Lst_FieldsInSearch(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[contains(@id,'Wizardlist_selectedfields')]")); //Unique xpath Of 'Fields in Search' WebList On RMA Application Utilities -->Tools and Designers -->Query Designer Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			:  RMAApp_TDQueryDes_Lst_FieldsInSearch
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which 'Fields in Search' WebList On RMA Application Utilities -->Tools and Designers -->Query Designer Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver, QuerySearchName: Query link name corresponding to checkbox	 
//Revision				: 0.0 - RenuVerma-12-22-2016                                 
//============================================================================================
public static WebElement RMAApp_TDQueryDes_Chk_QueryDesignerSearch(WebDriver driver,String QuerySearchName)
{
	String idno=driver.findElement(By.xpath(".//*[text()='"+QuerySearchName+"']")).getAttribute("id"); //Unique xpath Of 'Fields in Search' WebList On RMA Application Utilities -->Tools and Designers -->Query Designer Page Is Fetched
	Element=driver.findElement(By.xpath(".//*[@value='"+idno+"']"));
	return Element;
}
}
