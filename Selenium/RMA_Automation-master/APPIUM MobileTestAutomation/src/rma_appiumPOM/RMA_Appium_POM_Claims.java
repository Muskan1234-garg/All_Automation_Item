package rma_appiumPOM;

import org.openqa.selenium.WebElement;

public class RMA_Appium_POM_Claims extends rma_appiumtestcases.BaseTest {
public static WebElement Element = null;

//============================================================================================
//FunctionName 		: RMAApp_Claims_TextBox_ClaimSearch
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Search TextBox On RMA Mobile Application Claims Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-13-2017                                
// ============================================================================================
public static WebElement RMAApp_Claims_TextBox_ClaimSearch() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@placeholder='Claim Search']"); //Unique Id Of Claim Search TextBox On RMA Mobile Application Claims Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Claims_Btn_Notes
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Notes Button On RMA Mobile Application Claims Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-13-2017                                
//============================================================================================
public static WebElement RMAApp_Claims_Btn_Notes() throws Exception,Error
	{
	try{
		Element =  driver.findElementByXPath(".//*[@ng-click='showMyNote()']"); //Unique Id Of Notes Button On RMA Mobile Application Claims Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}


//============================================================================================
//FunctionName 		: RMAApp_Claims_Btn_Camera
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Camera Button On RMA Mobile Application Claims Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-16-2017                                
//============================================================================================
public static WebElement RMAApp_Claims_Btn_Camera() throws Exception,Error
	{
	try{
		Element = driver.findElementByXPath(".//*[@class='panel-body']/a[1]/i"); //Unique Id Of Camera Button On RMA Mobile Application Claims Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Claims_Btn_CameraDone
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Done Button On Camera Page Of RMA Mobile Application Claims Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-16-2017                                
//============================================================================================
public static WebElement RMAApp_Claims_Btn_CameraDone() throws Exception,Error
	{
	try{
		Element = driver.findElementByAndroidUIAutomator("new UiSelector().packageName(\"com.android.camera\").text(\"DONE\")"); //Unique Id Of Done Button On Camera Page Of RMA Mobile Application Claims Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Claims_Btn_CameraCancel
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Button On Camera Page Of RMA Mobile Application Claims Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-17-2017                                
//============================================================================================
public static WebElement RMAApp_Claims_Btn_CameraCancel() throws Exception,Error
	{
	try{
		Element = driver.findElementByAndroidUIAutomator("new UiSelector().packageName(\"com.android.camera\").text(\"CANCEL\")"); //Unique Id Of Cancel Button On Camera Page Of RMA Mobile Application Claims Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Claims_Msg_ToastMessage
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ToastMessages On RMA Mobile Application Claims Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-17-2017                                
//============================================================================================
public static WebElement RMAApp_Claims_Msg_ToastMessage(int x) throws Exception,Error
	{
	try{
		Element = driver.findElementByXPath(".//*[@class='site-wrap']/div[4]/div["+x+"]"); //Unique Id Of ToastMessages On RMA Mobile Application Claims Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}
}