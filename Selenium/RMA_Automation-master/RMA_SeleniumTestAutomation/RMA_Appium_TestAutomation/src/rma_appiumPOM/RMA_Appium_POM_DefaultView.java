package rma_appiumPOM;

import org.openqa.selenium.WebElement;

public class RMA_Appium_POM_DefaultView extends rma_appiumtestcases.BaseTest {
public static WebElement Element = null;

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Bar_Tasks
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tasks Button On RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
// ============================================================================================
public static WebElement RMAApp_DefaultView_Btn_Tasks() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@href='#/tasks']"); //Unique Id Of Tasks Button on RMA Mobile Application Default View Is Fetched			
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Btn_Events
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Events Button On RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Btn_Events() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@href='#/events']"); //Unique Id Of Events Button on RMA Mobile Application Default View Is Fetched	
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Btn_Claims
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claims Button On RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Btn_Claims() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@href='#/claims']"); //Unique Id Of Claims Button on RMA Mobile Application Default View Is Fetched	
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Btn_PinnedItems
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pinned Items Button On RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Btn_PinnedItems() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@class='row ng-scope']/div[3]/ul/li[4]/h4/button/span"); //Unique Id Of Pinned Items Button on RMA Mobile Application Default View Is Fetched
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Txt_PinnedItemsHere
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Your Pinned Items Will Show Here Text On RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Txt_PinnedItemsHere() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@class='row ng-scope']/div[3]/ul/li[4]/div/div[1]/div/div/p"); //Unique Id Of Your Pinned Items Will Show Here Text on RMA Mobile Application Default View Is Fetched
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Btn_LeftNavTree
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Left Hand Navigation Tree Button On RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Btn_LeftNavTree() throws Exception,Error
	{
	try {
		Element = driver.findElementById("jadu"); //Unique Id Of Left Hand Navigation Tree Button On RMA Mobile Application Default View Is Fetched	
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Btn_Reload
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reload Button On Left Hand Navigation Tree Of RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Btn_ReloadApp() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@ng-controller='SideMenuCtrl']/nav/ul/li[4]/a"); //Unique Id Of Reload Button On Left Hand Navigation Tree Of RMA Mobile Application Default View Is Fetched	
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Img_CSC
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CSC Image Header On Left Hand Navigation Tree Of RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-14-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Img_CSC() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@ng-controller='SideMenuCtrl']/nav/ul/li[1]/div/img"); //Unique Id Of CSC Image Header On Left Hand Navigation Tree Of RMA Mobile Application Default View Is Fetched
		
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Img_RiskMaster
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which RiskMaster Label Header On Left Hand Navigation Tree Of RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-14-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Img_RiskMaster() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@ng-controller='SideMenuCtrl']/nav/ul/li[1]/div/img"); //Unique Id Of RiskMaster Label Header On Left Hand Navigation Tree Of RMA Mobile Application Default View Is Fetched
		
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Lbl_UserName
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Hello<UserName> Label On Left Hand Navigation Tree Of RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-14-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Lbl_UserName() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@ng-controller='SideMenuCtrl']/nav/ul/li[2]/span"); //Unique Id Of Hello<UserName> Label On Left Hand Navigation Tree Of RMA Mobile Application Default View Is Fetched	
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Btn_Feedback
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Feedback Button On Left Hand Navigation Tree Of RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-14-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Btn_Feedback() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@href='#/settings']"); //Unique Id Of Feedback Button On Left Hand Navigation Tree Of RMA Mobile Application Default View Is Fetched	
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Btn_About
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which About Button On Left Hand Navigation Tree Of RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-14-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Btn_About() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@href='#/about']"); //Unique Id Of About Button On Left Hand Navigation Tree Of RMA Mobile Application Default View Is Fetched	
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Btn_LogOut
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LogOut Button On Left Hand Navigation Tree Of RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-14-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Btn_LogOut() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@href='#/']"); //Unique Id Of LogOut Button On Left Hand Navigation Tree Of RMA Mobile Application Default View Is Fetched	
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Btn_Security
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Security Button On Left Hand Navigation Tree Of RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-14-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Btn_Security() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@href='#/settings']"); //Unique Id Of Security Button On Left Hand Navigation Tree Of RMA Mobile Application Default View Is Fetched	
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DefaultView_Btn_SyncApp
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sync App Button On Left Hand Navigation Tree Of RMA Mobile Application Default View Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-14-2017                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Btn_SyncApp() throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@ng-controller='SideMenuCtrl']/nav/ul/li[3]/a"); //Unique Id Of Sync App Button On Left Hand Navigation Tree Of RMA Mobile Application Default View Is Fetched	
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}
}