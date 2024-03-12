package rma_appiumPOM;

import org.openqa.selenium.WebElement;

public class RMA_Appium_POM_NewNotes extends rma_appiumtestcases.BaseTest {
public static WebElement Element = null;

//============================================================================================
//FunctionName 		: RMAApp_Notes_Lst_NoteType
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Note Type List On RMA Mobile Application Note Creation (Attached To A Claim) Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-13-2017                                
//============================================================================================
public static WebElement RMAApp_Notes_Lst_NoteType() throws Exception,Error
	{
	try{
		Element =  driver.findElementByXPath(".//*[@name='noteType']"); //Unique Id Of Note Type List On RMA Mobile Application Note Creation (Attached To A Claim) Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Notes_Txt_Description
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Description TextBox On RMA Mobile Application Note Creation (Attached To A Claim) Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-13-2017                                
//============================================================================================
public static WebElement RMAApp_Notes_Txt_Description() throws Exception,Error
	{
	try{
		Element =  driver.findElementByXPath(".//*[@name='noteContent']"); //Unique Id Of Description Text Box On RMA Mobile Application Note Creation (Attached To A Claim) Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Notes_Txt_Date
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date TextBox On RMA Mobile Application Note Creation (Attached To A Claim) Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-13-2017                                
//============================================================================================
public static WebElement RMAApp_Notes_Txt_Date() throws Exception,Error
	{
	try{
		Element =  driver.findElementByXPath(".//*[@name='activityDate']");; //Unique Id Of Date Text Box On RMA Mobile Application Note Creation (Attached To A Claim) Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Notes_Btn_Submit
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Submit Button On RMA Mobile Application Note Creation (Attached To A Claim) Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-13-2017                                
//============================================================================================
public static WebElement RMAApp_Notes_Btn_Submit() throws Exception,Error
	{
	try{
		Element =  driver.findElementByXPath(".//*[@type='submit']"); //Unique Id Of Submit Button On RMA Mobile Application Note Creation (Attached To A Claim) Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

//============================================================================================
//FunctionName 		: RMAApp_Notes_Btn_Set
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Set Button Due Date Selector Of RMA Mobile Application Note Creation (Attached To A Claim) Page Can Be Identified
//Input Parameter 	: None	 
//Revision			: 0.0 - KumudNaithani-01-10-2017                                
//============================================================================================
public static WebElement RMAApp_Notes_Btn_Set() throws Exception,Error
	{
	try{
	Element =  driver.findElementById("android:id/button1"); //Unique Id Of Set Button On Due Date Selector Of RMA Mobile Application Note Creation (Attached To A Claim) Page Is Fetched
	}catch(Exception|Error e){
		throw (e);
	}
	return Element;
	}

}