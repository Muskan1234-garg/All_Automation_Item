package rma_appiumPOM;

import org.openqa.selenium.WebElement;

public class RMA_Appium_POM_Security extends rma_appiumtestcases.BaseTest {
public static WebElement Element = null;

//============================================================================================
//FunctionName 		: RMAApp_Security_Btn_ChangeDSN
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ChangeDSN Button On Security Screen Of RMA Mobile Application Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-15-2017                                
// ============================================================================================
public static WebElement RMAApp_Security_Btn_ChangeDSN() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@ng-click='changeDSN()']"); //Unique Id Of ChangeDSN Button On Security Screen Of RMA Mobile Application Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Security_Btn_ChangePassword
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Change Password Button On Security Screen Of RMA Mobile Application Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-15-2017                                
//============================================================================================
public static WebElement RMAApp_Security_Btn_ChangePassword() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@ng-click='passwordDiv=!passwordDiv']"); //Unique Id Of Change Password Button On Security Screen Of RMA Mobile Application Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Security_Txt_CurrentPassword
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Current Password Text Box On Change Password View Of Security Screen Of RMA Mobile Application Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-16-2017                                
//============================================================================================
public static WebElement RMAApp_Security_Txt_CurrentPassword() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@placeholder='current password']"); //Unique Id Of Which Current Password Text Box On Change Password View Of Security Screen Of RMA Mobile Application Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Security_Txt_NewPassword
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which New Password Text Box On Change Password View Of Security Screen Of RMA Mobile Application Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-16-2017                                
//============================================================================================
public static WebElement RMAApp_Security_Txt_NewPassword() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@placeholder='new password']"); //Unique Id Of Which New Password Text Box On Change Password View Of Security Screen Of RMA Mobile Application Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Security_Txt_ConfirmPassword
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Confirm Password Text Box On Change Password View Of Security Screen Of RMA Mobile Application Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-16-2017                                
//============================================================================================
public static WebElement RMAApp_Security_Txt_ConfirmPassword() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@placeholder='confirm password']"); //Unique Id Of Which Confirm Password Text Box On Change Password View Of Security Screen Of RMA Mobile Application Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Security_Btn_ChangePassword_1
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Change Password Text Box On Change Password View Of Security Screen Of RMA Mobile Application Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-02-16-2017                                
//============================================================================================
public static WebElement RMAApp_Security_Btn_ChangePassword_1() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath("/html/body/div/div[3]/div/div/div/div/div/div/div[2]/div[2]/span/form/button"); //Unique Id Of Which Change Password Text Box On Change Password View Of Security Screen Of RMA Mobile Application Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}
}