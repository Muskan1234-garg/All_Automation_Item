package rma_appiumPOM;

import org.openqa.selenium.WebElement;

public class RMA_Appium_POM_AttachPicture extends rma_appiumtestcases.BaseTest {
public static WebElement Element = null;

//============================================================================================
//FunctionName 		: RMAApp_AttachPicture_TextBox_Title
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Title TextBox On Attach Picture Window Of RMA Mobile Application Claims Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-17-2017                                
// ============================================================================================
public static WebElement RMAApp_AttachPicture_TextBox_Title() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@name='title']"); //Unique Id Of Title TextBox On Attach Picture Window Of RMA Mobile Application Claims Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_AttachPicture_TextBox_Subject
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Subject TextBox On Attach Picture Window On RMA Mobile Application Claims Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-17-2017                                
//============================================================================================
public static WebElement RMAApp_AttachPicture_TextBox_Subject() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@placeholder='subject']"); //Unique Id Of Subject TextBox On Attach Picture Window On RMA Mobile Application Claims Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_AttachPicture_TextBox_Notes
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Notes TextBox On Attach Picture Window On RMA Mobile Application Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-17-2017                                
//============================================================================================
public static WebElement RMAApp_AttachPicture_TextBox_Notes() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@placeholder='notes']"); //Unique Id Of Notes TextBox On Attach Picture Window On RMA Mobile Application Claims Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_AttachPicture_Btn_Upload
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Upload Button On Attach Picture Window Of RMA Mobile Application Claims Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-17-2017                                
//============================================================================================
public static WebElement RMAApp_AttachPicture_Btn_Upload() throws Exception,Error
	{
	try{
		Element = driver.findElementByXPath(".//*[@id='myCamera']/div/div/div[2]/div/button[2]"); //Unique Id Of Upload Button On Attach Picture Window Of RMA Mobile Application Claims Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_AttachPicture_TstMsg_Uploaded Successfully
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Uploaded Successfully Toast Message On Attach Picture Window Of RMA Mobile Application Claims Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-17-2017                                
//============================================================================================
public static WebElement RMAApp_AttachPicture_TstMsg_UploadedSuccessfully() throws Exception,Error
	{
	try{
		Element = driver.findElementByXPath(".//*[@class='site-wrap']/div[4]/div[4]/div/div"); //Unique Id Of Uploaded Successfully Toast Message On Attach Picture Window Of RMA Mobile Application Claims Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_AttachPicture_Lbl_AttachPicture
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Attach Picture Label On Attach Picture Window Of RMA Mobile Application Claims Page Can Be Identified
//Input Parameter 	: None		 
//Revision			: 0.0 - KumudNaithani-01-17-2017                                
//============================================================================================
public static WebElement RMAApp_AttachPicture_Lbl_AttachPicture() throws Exception,Error
	{
	try{
	Element = driver.findElementByXPath(".//*[@name='title']"); //Unique Id Of Attach Picture Label On Attach Picture Window Of RMA Mobile Application Claims Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}
}