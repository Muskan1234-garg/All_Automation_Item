package rma_appiumPOM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import io.appium.java_client.MobileElement;	

public class RMA_Appium_POM_NewTask extends rma_appiumtestcases.BaseTest {
public static WebElement Element = null;

//============================================================================================
//FunctionName 		: RMAApp_Tasks_Btn_New
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which New Button On RMA Mobile Application Tasks Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-10-2017                                
// ============================================================================================
public static WebElement RMAApp_Tasks_Btn_New() throws Exception,Error
	{
	try{
	Element = driver.findElementByAndroidUIAutomator(("new UiSelector().description(\" New\")")); //Unique Id Of New Button On RMA Mobile Application Tasks Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_AttachTask_Txt_Name
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Name Edit Box On RMA Mobile Application Attach Tasks Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-10-2017                                
//============================================================================================
public static WebElement RMAApp_AttachTask_Txt_Name() throws Exception,Error
	{
	try{
	Element =  driver.findElementByXPath(".//*[@name='name']"); //Unique Id Of Name Edit Box On RMA Mobile Application Attach Tasks Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 			: RMAApp_AttachTask_Txt_Description
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Description Edit Box On RMA Mobile Application New Task Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type MobileDriver	 
//Revision				: 0.0 - KumudNaithani-01-10-2017                                 
// ============================================================================================
public static WebElement RMAApp_AttachTask_Txt_Description()
{ 
	Element =  driver.findElementByXPath(".//*[@placeholder='description']");//Unique Id Of Description Edit Box On RMA Mobile Application New Task Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_AttachTask_Lst_TaskType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Task Type List On RMA Mobile Application New Task Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type MobileDriver	 
//Revision				: 0.0 - KumudNaithani-01-11-2017                                
//============================================================================================
public static WebElement RMAApp_AttachTask_Lst_TaskType()
{ 
	Element =  driver.findElementByXPath(".//*[@ng-model='taskEntered']");//Unique Id Of Select Task Type List On RMA Mobile Application New Task Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_AttachTask_Txt_DueDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Due Date TextBox On RMA Mobile Application New Task Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type MobileDriver	 
//Revision				: 0.0 - KumudNaithani-01-12-2017                                
//============================================================================================
public static WebElement RMAApp_AttachTask_Txt_DueDate()
{ 
	Element =  driver.findElementByXPath(".//*[@placeholder='Due Date']");//Unique Id Of Due Date TextBox On RMA Mobile Application New Task Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_AttachTask_Txt_TimeDue
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Time Due Text Box On RMA Mobile Application New Task Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type MobileDriver	 
//Revision				: 0.0 - KumudNaithani-01-12-2017                                
//============================================================================================
public static WebElement RMAApp_AttachTask_Txt_TimeDue()
{ 
	Element =  driver.findElementByXPath(".//*[@placeholder='Time Due']");//Unique Id Of Time Due Text Box On RMA Mobile Application New Task Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_AttachTask_Btn_Submit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Submit Button On RMA Mobile Application New Task Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type MobileDriver	 
//Revision				: 0.0 - KumudNaithani-01-12-2017                                
//============================================================================================
public static WebElement RMAApp_AttachTask_Btn_Submit()
{ 
	Element =  driver.findElementByXPath(".//*[@type='submit']");//Unique Id Of Submit Button On RMA Mobile Application New Task Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_AttachTask_Btn_Set
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Set Button Due Date Selector Of RMA Mobile Application Attach Tasks Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-10-2017                                
//============================================================================================
public static WebElement RMAApp_AttachTask_Btn_DateTimeSet() throws Exception,Error
	{
	try{
	Element =  driver.findElementById("android:id/button1"); //Unique Id Of Set Button On Due Date Selector Of RMA Mobile Application Attach Tasks Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Tasks_Txt_SearchTasks
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Tasks Text Box On RMA Mobile Application Tasks Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-10-2017                                
//============================================================================================
public static WebElement RMAApp_Tasks_Txt_SearchTasks() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@placeholder='Search Tasks']"); //Unique Id Of Search Tasks Text Box On RMA Mobile Application Tasks Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Tasks_Lbl_SearchedTaskSubject
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Subject Header On RMA Mobile Application Tasks Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-10-2017                                
//============================================================================================
public static WebElement RMAApp_Tasks_Lbl_SearchedTaskSubject() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@class='row ng-scope']/div[6]/div/div[1]"); //Unique Id Of Subject Header On RMA Mobile Application Tasks Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Tasks_Lbl_SearchedTaskDescription
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Task Description Of The Searched Tasks On RMA Mobile Application Tasks Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-16-2017                                
//============================================================================================
public static WebElement RMAApp_Tasks_Lbl_SearchedTaskDescription() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@class='row ng-scope']/div[6]/div/div[2]/span[1]");; //Unique Id Of Task Description Of The Searched Tasks On RMA Mobile Application Tasks Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Tasks_Lbl_SearchedTaskActivity
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Task Activity Of The Searched Tasks On RMA Mobile Application Tasks Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-16-2017                                
//============================================================================================
public static WebElement RMAApp_Tasks_Lbl_SearchedTaskActivity() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@class='row ng-scope']/div[6]/div/div[2]/span[3]"); //Unique Id Of Task Activity Of The Searched Tasks On RMA Mobile Application Tasks Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Tasks_Lbl_DueOn
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Due On Header On RMA Mobile Application Tasks Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-02-22-2017                                
//============================================================================================
public static WebElement RMAApp_Tasks_Lbl_SearchedDueOn() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@class='row ng-scope']/div[6]/div/div[2]/span[2]"); //Unique Id Of Due On Header On RMA Mobile Application Tasks Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}
}