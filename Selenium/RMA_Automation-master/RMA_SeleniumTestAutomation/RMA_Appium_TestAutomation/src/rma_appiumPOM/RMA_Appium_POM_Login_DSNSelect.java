package rma_appiumPOM;

import org.openqa.selenium.WebElement;
//import io.appium.java_client.MobileElement;	

public class RMA_Appium_POM_Login_DSNSelect extends rma_appiumtestcases.BaseTest {
public static WebElement Element = null;

//============================================================================================
//FunctionName 		: RMAApp_Login_Txt_UserName
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UserName TextBox On RMA Mobile Application Login Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-11-24-2016                                 
// ============================================================================================
public static WebElement RMAApp_Login_Txt_UserName() throws Exception,Error
	{
	try{
		Element = driver.findElementByXPath(".//*[@placeholder='username']"); //Unique Id  Of UserName Text Box on Login Page Of RMA Mobile Application Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}


//============================================================================================
//FunctionName 		: RMAApp_Login_Txt_ServerName
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Server TextBox On RMA Mobile Application Login Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-11-24-2016                                 
//============================================================================================
public static WebElement RMAApp_Login_Txt_ServerName()throws Exception,Error
	{
	try {
		Element = driver.findElementByXPath(".//*[@placeholder='server']"); //Unique Id Of Server Text Box on Login Page Of RMA Mobile Application Is Fetched
	} catch (Exception|Error e) {
		throw(e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Login_Txt_Password
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Password TextBox On RMA Mobile Application Login Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-11-24-2016                                 
//============================================================================================
public static WebElement RMAApp_Login_Txt_Password()
	{
	try{
	Element = driver.findElementByXPath(".//*[@placeholder='password']"); //Unique Id Of Password Textbox on Login Page Of RMA Mobile Application Is Fetched
	} catch (Exception|Error e) {
		throw(e);
	}return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Login_Btn_Submit
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Submit Button On RMA Mobile Application Login Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-11-24-2016                                 
//============================================================================================
public static WebElement RMAApp_Login_Btn_Submit()
	{
	try{
	Element = driver.findElementByXPath(".//*[@class='btn btn-primary btn-block']"); //Unique Id Of Submit Button on Login Page Of RMA Mobile Application Is Fetched
	} catch (Exception|Error e) {
		throw(e);
	}return Element;
	}


//============================================================================================
//FunctionName 		: RMAApp_DSNSelect_Btn_SelectDSN
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select DSN Button On RMA Mobile Application DSN Selection Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-04-2017                                 
//============================================================================================
public static WebElement RMAApp_DSNSelect_Btn_SelectDSN()
	{
	try{
	Element = driver.findElementByAndroidUIAutomator("new UiSelector().description(\"Select DSN \")"); //Unique Id Of Select DSN Button on DSN Selection Page Of RMA Mobile Application Is Fetched
	} catch (Exception|Error e) {
		throw(e);
	}return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DSNSelect_Lst_SelectDSN
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DSN Selection List Box (Name Of DataSources) On RMA Mobile Application DSN Selection Page Can Be Identified
//Input Parameter 	: DataSourceName Of Type String Provides Name Of The DataSource To Be Selected	 
//Revision			: 0.0 - KumudNaithani-01-04-2017                                 
//============================================================================================
public static WebElement RMAApp_DSNSelect_Lst_SelectDSN(String DataSourceName)
	{
	try{
	Element = driver.findElementByAndroidUIAutomator("new UiSelector().description("+"\""+DataSourceName +"\""+")"); //Unique Id Of DSN Selection List Box (Name Of DataSources) on DSN Selection Page Of RMA Mobile Application Is Fetched	
	} catch (Exception|Error e) {
		throw(e);
	}return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_DSNSelect_Img_Home
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Home Image On RMA Mobile Application DSN Selection Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-02-14-2017                                 
//============================================================================================
public static WebElement RMAApp_DSNSelect_Btn_Home()
	{
	try{
	Element = driver.findElementByXPath(".//*[@ng-click='goHome()']/i"); //Unique Id Of Home Image on DSN Selection Page Of RMA Mobile Application Is Fetched
	} catch (Exception|Error e) {
		throw(e);
	}return Element;
	}
}