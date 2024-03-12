package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_SMS {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
	
//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_AddNewDS
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Data Source Button On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
// ============================================================================================
public static WebElement RMAApp_SMS_Btn_AddNewDS(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_addnewds")); //Unique Id Of Add New Data Source Button On RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSAddNewDS_Rdb_DBDriver
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DBDriver RadioButton option On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSAddNewDS_Rdb_DBDriver(WebDriver driver,String DriverName)
{
	Element = driver.findElement(By.xpath(".//*[@id='dropzone']//*[text()='"+DriverName+"']/input")); //Unique xpath Of DBDriver RadioButton option On Add New DS Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSAddNewDS_Btn_Next
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Button On Add New DS Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSAddNewDS_Btn_Next(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_next")); //Unique Id Of Next Button On Add New DS Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSAddNewDS_Txt_ServerName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Server Name textBox On Add New DS Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSAddNewDS_Txt_ServerName(WebDriver driver)
{
	Element = driver.findElement(By.id("txt_srevername")); //Unique Id Of Server Name textBox On Add New DS Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSAddNewDS_Txt_DatabaseName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Database Name TextBox On Add New DS Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSAddNewDS_Txt_DatabaseName(WebDriver driver)
{
	Element = driver.findElement(By.id("txt_dbname")); //Unique Id Of Database Name TextBox On Add New DS Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSAddNewDS_Txt_LoginUserName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Login User Name TextBox On Add New DS Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSAddNewDS_Txt_LoginUserName(WebDriver driver)
{
	Element = driver.findElement(By.id("txt_login_name")); //Unique Id Of Login User Name TextBox On Add New DS Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSAddNewDS_Txt_LoginPassword
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Login Password TextBox TextBox On Add New DS Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSAddNewDS_Txt_LoginPassword(WebDriver driver)
{
	Element = driver.findElement(By.id("txt_pwd")); //Unique Id Of Login Password TextBox On Add New DS Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSAddNewDS_Txt_UniqueDBConnName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which unique name for this database connection TextBox On Add New DS Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSAddNewDS_Txt_UniqueDBConnName(WebDriver driver)
{
	Element = driver.findElement(By.id("txt_uniquename")); //Unique Id Of unique name for this database connection TextBox On Add New DS Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSAddNewDS_Txt_ActivationCode
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which code provided by the product support to activate licenses TextBox On Add New DS Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSAddNewDS_Txt_ActivationCode(WebDriver driver)
{
	Element = driver.findElement(By.id("txt_code")); //Unique Id Of code provided by the product support to activate licenses TextBox On RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMS_Lnk_LeftMenuLinkName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Left Menu Link Name On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMS_Lnk_LeftMenuLinkName(WebDriver driver,String LinkName)
{
	WebElement Element = null;
	try {
		Element = driver.findElement(By.xpath(".//*[@id='"+LinkName+"']")); //Unique xpath Of Left Menu Link Name On RMA Application Security Management System Page Is Fetched
	} catch (Exception|Error e) {	
	}
	return Element;	
}
//============================================================================================
//FunctionName 			: RMAApp_SMS_Img_ExpandCollapseLeftMenuLink
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Left Menu Link Nam On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(WebDriver driver,String LinkName)
{
	WebElement Element = null;
	try {
		Element = driver.findElement(By.xpath(".//*[@id='"+LinkName+"']/preceding::i[2]")); //Unique xpath Of Left Menu Link Name On RMA Application Security Management System Page Is Fetched
	} catch (Exception|Error e) {	
	}
	return Element;	
}
//============================================================================================
//FunctionName 			: RMAApp_SMSAddNewDS_Lbl_Step4Message
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Label Of Step 3 Heading On Add New DS Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSAddNewDS_Lbl_Step4Message(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='dropzone']//*[@class='success']")); //Unique xpath Of Label Of Step 4 Heading On Add New DS Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSAddNewDS_Lbl_Step3Message
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Label Of Step 3 Heading On Add New DS Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSAddNewDS_Lbl_Step3Message(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='dropzone']//*[text()='Database Connection Wizard will now try to connect and validate the database you have selected Please click Next to start the connection and validation process.']")); //Unique xpath Of Label Of Step 3 Heading On Add New DS Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_Delete
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Delete Button On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_Delete(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_delete")); //Unique id Of Delete Button On RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSDelete_Btn_Delete
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Delete Button On  Delete PopUp Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSDelete_Btn_Delete(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_del")); //Unique id Of Delete Button On  Delete PopUp Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSModelPopup_Btn_Cancel
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Cancel Button On Model PopUp Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSModelPopup_Btn_Cancel(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_cancel")); //Unique id Of Cancel Button On Model PopUp Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_AddNewUser
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add New User Button On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_AddNewUser(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_addUser")); //Unique id Of Add New User Button On RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Last Name TextBox On User Settings Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Txt_LastName(WebDriver driver)
{
	Element = driver.findElement(By.id("txt_lm")); //Unique id Of Last Name TextBox On User Settings Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Txt_FirstName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of First Name TextBox On User Settings Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Txt_FirstName(WebDriver driver)
{
	Element = driver.findElement(By.id("txt_fm")); //Unique id Of First Name TextBox On User Settings Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Lst_Manager
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Manager ListBox On User Settings Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Lst_Manager(WebDriver driver)
{
	Element = driver.findElement(By.id("manager")); //Unique id Of Manager ListBox On User Settings Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Txt_Email
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Email TextBox On User Settings Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Txt_Email(WebDriver driver)
{
	Element = driver.findElement(By.id("txtemail")); //Unique id Of Email TextBox On User Settings Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Chk_AccessSMS
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Permit to access Security Management System CheckBox On User Settings Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Chk_AccessSMS(WebDriver driver)
{
	Element = driver.findElement(By.id("chk_AccessSms")); //Unique id Of Permit to access Security Management System CheckBox On User Settings Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Chk_AccessUSP
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Permit to access User Privileges Setup CheckBox On User Settings Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Chk_AccessUSP(WebDriver driver)
{
	Element = driver.findElement(By.id("chk_PrivSetup")); //Unique id Of Permit to access User Privileges Setup CheckBox On User Settings Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Rdo_DSNSelection
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Allowed/Assigned Data-Sources to Login Radio Option On User Settings Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Rdo_DSNSelection(WebDriver driver, String DSNName)
{
	Element = driver.findElement(By.xpath(".//*[text()='"+DSNName+"']/input")); //Unique xpath Of Allowed/Assigned Data-Sources to Login Radio Option On User Settings Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUserAccessPer_Lst_AgsndUserToModuleGroup
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Assign User To Module Group List On User Access Permissions Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUserAccessPer_Lst_AgsndUserToModuleGroup(WebDriver driver)
{
	Element = driver.findElement(By.id("Select1")); //Unique ID Of Assign User To Module Group List On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUserAccessPer_Txt_LoginName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Login Name TextBox On User Access Permissions Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-03-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUserAccessPer_Txt_LoginName(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Login Name')]/following:: input[1]")); //Unique ID Of Login Name TextBox On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSUserAccessPer_Txt_Password
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Password TextBox On User Access Permissions Of  RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-03-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUserAccessPer_Txt_Password(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@type='password']")); //Unique ID Of Password TextBox On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_Ok
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Ok Button On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-03-2017                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_Ok(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_ok")); //Unique ID Of Ok Button On RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Btn_EditUser
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Edit User Button On User Setting Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-03-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Btn_EditUser(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_edit_user")); //Unique ID Of Edit User Button On User Setting Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Btn_EditUserPerm
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Edit User Permission Button On User Access Permissions Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-03-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Btn_EditUserPerm(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_edit_userPer")); //Unique ID Of Edit User Permission Button On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSModule_Btn_AddModule
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add Module Button On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-15-2017                               
//============================================================================================
public static WebElement RMAApp_SMSModule_Btn_AddModule(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_newgrp")); //Unique ID Of Add Module Button On RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSModule_Txt_GroupName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Please type name for new group TextBox On Module PopUp Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-15-2017                               
//============================================================================================
public static WebElement RMAApp_SMSModule_Txt_GroupName(WebDriver driver)
{
	Element = driver.findElement(By.id("txt_grpname")); //Unique ID Of Please type name for new group TextBox On Module PopUp Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSModule_Btn_ModueGroupOK
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Module Group OK Button On Module PopUp Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-15-2017                               
//============================================================================================
public static WebElement RMAApp_SMSModule_Btn_ModueGroupOK(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_addnewmoduegroupok")); //Unique ID Of Module Group OK Button On Module PopUp Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-15-2017                               
//============================================================================================
public static WebElement RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(WebDriver driver, String OptionName)
{
	Element = driver.findElement(By.xpath(".//*[contains(text(),'"+OptionName+"')]/preceding::input[@type='checkbox'][1]")); //Unique xpath Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSModuleAccPerm_Btn_Grant
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Grant Button On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-15-2017                               
//============================================================================================
public static WebElement RMAApp_SMSModuleAccPerm_Btn_Grant(WebDriver driver)
{
	 WebElement Element = null;
	 try{
		 Element = driver.findElement(By.id("btn_grant")); //Unique id Of Grant Button On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
	 } catch (Exception|Error e) {	
	 }
	 return Element;
}
	 
//============================================================================================
//FunctionName 			: RMAApp_SMSModuleAccPerm_Btn_Revoke
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Revoke Button On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-15-2017                               
//============================================================================================
public static WebElement RMAApp_SMSModuleAccPerm_Btn_Revoke(WebDriver driver)
{
	 WebElement Element = null;
	 try{
		 Element = driver.findElement(By.id("btn_revoke")); //Unique id Of Revoke Button On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
	 } catch (Exception|Error e) {	
	 }
	 return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSModule_Btn_Rename
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Module Rename Button On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-15-2017                               
//============================================================================================
public static WebElement RMAApp_SMSModule_Btn_Rename(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_rename")); //Unique id Of Module Rename Button On RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSModuleRename_Txt_GroupName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Group Name TextBox On Module Rename PopUp Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-15-2017                               
//============================================================================================
public static WebElement RMAApp_SMSModuleRename_Txt_GroupName(WebDriver driver)
{
	Element = driver.findElement(By.id("txt_smtp_server")); //Unique id Of Group Name TextBox On Module Rename PopUp Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSModuleRename_Btn_Ok
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Module Rename Button On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-15-2017                               
//============================================================================================
public static WebElement RMAApp_SMSModuleRename_Btn_Ok(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_emailok")); //Unique id Of Module Rename Button On RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_Refresh
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Refresh Button On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-16-2017                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_Refresh(WebDriver driver)
{
	 WebElement Element = null;
	 try{
		 Element = driver.findElement(By.id("btn_refresh")); //Unique id Of Refresh Button On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
	 } catch (Exception|Error e) {	
	 }
	 return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Chk_Monday
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Monday CheckBox On User Access Permissions Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Chk_Monday(WebDriver driver)
{
	Element = driver.findElement(By.id("ChkMon")); //Unique id Of Monday CheckBox On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Chk_Tuesday
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Tuesday CheckBox On User Access Permissions Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Chk_Tuesday(WebDriver driver)
{
	Element = driver.findElement(By.id("ChkTuses")); //Unique id Of Tuesday CheckBox On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Chk_ Wednesday
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of  Wednesday CheckBox On User Access Permissions Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Chk_Wednesday(WebDriver driver)
{
	Element = driver.findElement(By.id("ChkWed")); //Unique id Of  Wednesday CheckBox On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Chk_Thursday
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Thursday CheckBox On User Access Permissions Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Chk_Thursday(WebDriver driver)
{
	Element = driver.findElement(By.id("ChkThus")); //Unique id Of Thursday CheckBox On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Chk_Friday
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Friday CheckBox On User Access Permissions Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Chk_Friday(WebDriver driver)
{
	Element = driver.findElement(By.id("chkFri")); //Unique id Of Friday CheckBox On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Chk_Saturday
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Saturday Checkbox On User Access Permissions Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Chk_Saturday(WebDriver driver)
{
	Element = driver.findElement(By.id("chkSatu")); //Unique id Of Saturday CheckBox On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Chk_Sunday
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Sunday CheckBox On User Access Permissions Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Chk_Sunday(WebDriver driver)
{
	Element = driver.findElement(By.id("chkSun")); //Unique id Of Sunday Checkbox On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Chk_PermissionExpires
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Permission Expires CheckBox On User Access Permissions Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-28-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Chk_PermissionExpires(WebDriver driver)
{
	Element = driver.findElement(By.id("chkPermiBox")); //Unique id Of Permission Expires CheckBox On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Txt_ExpirationDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Expiration Date TextBox On User Access Permissions Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-28-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Txt_ExpirationDate(WebDriver driver)
{
	Element = driver.findElement(By.id("expirationDate")); //Unique id Of Expiration Date TextBox On User Access Permissions Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSModuleAccPermWorkersComp_Img_ExpandCollapse
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Expand-Collapse Image For Workers Compensation SMS Module Access Permission On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-11-15-2017                              
//============================================================================================
public static WebElement RMAApp_SMSModuleAccPermWorkersComp_Img_ExpandCollapse(WebDriver driver,String LinkName)
{
	WebElement Element = null;
	try {
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+LinkName+"')]/preceding::i[2]")); //Unique xpath Of Expand-Collapse Image For Workers Compensation SMS Module Access Permission On RMA Application Security Management System Page Is Fetched
		 //Element = driver.findElement(By.xpath(".//*[text()='"+LinkName+"')]/preceding::i[2]"));
	} catch (Exception|Error e) {	
	}
	return Element;	
}

//============================================================================================
//FunctionName             : RMAApp_SMSModuleAccPerm_Img_ExpandCollapse
//Description              : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Expand-Collapse Image SMS Module Access Permission On RMA Application Security Management System Page Can Be Identified
//Input Parameter          : Driver Variable Of The Type WebDriver         
//Revision                 : 0.0 - RenuVerma-12-26-2016                               
//============================================================================================
public static WebElement RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(WebDriver driver,String LinkName)
{
     WebElement Element = null;
     try {
            Element = driver.findElement(By.xpath(".//*[text()='"+LinkName+"']/preceding::i[2]")); //Unique xpath Of Expand-Collapse Image SMS Module Access Permission On RMA Application Security Management System Page Is Fetched
     } catch (Exception|Error e) {     
     }
     return Element;      
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Txt_Country
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Country TextBox On User Settings Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-04-18-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Txt_Country(WebDriver driver)
{
	Element = driver.findElement(By.id("txt_country")); //Unique id Of Country TextBox On User Settings Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSUser_Txt_Company
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Company TextBox On User Settings Of RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-04-18-2017                               
//============================================================================================
public static WebElement RMAApp_SMSUser_Txt_Company(WebDriver driver)
{
	Element = driver.findElement(By.id("txtcompany")); //Unique id Of Company TextBox On User Settings Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_RefreshCancelPositionVerify
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of RefreshAndCancel Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_RefreshCancelPositionVerify(WebDriver driver)
{
	 WebElement Element = null;
	 try{
		 Element = driver.findElement(By.xpath(".//*[@class='dropdown navPd'][1]/a")); //Unique id Of RefreshAndCancel Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Is Fetched
	 } catch (Exception|Error e) {	
	 }
	 return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_AddNewUserPositionVerify
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of AddNewUser Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_AddNewUserPositionVerify(WebDriver driver)
{
	 WebElement Element = null;
	 try{
		 Element = driver.findElement(By.xpath(".//*[@class='dropdown navPd'][2]/a")); //Unique id Of AddNewUser Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Is Fetched
	 } catch (Exception|Error e) {	
	 }
	 return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_DeleteSelectedItemPositionVerify
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of DeleteSelectedItem Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_DeleteSelectedItemPositionVerify(WebDriver driver)
{
	 WebElement Element = null;
	 try{
		 Element = driver.findElement(By.xpath(".//*[@class='dropdown navPd'][3]/a")); //Unique id Of DeleteSelectedItem Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Is Fetched
	 } catch (Exception|Error e) {	
	 }
	 return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_AddNewDataSourcePositionVerify
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of AddNewDataSource Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_AddNewDataSourcePositionVerify(WebDriver driver)
{
	 WebElement Element = null;
	 try{
		 Element = driver.findElement(By.xpath(".//*[@class='dropdown navPd'][4]/a")); //Unique id Of AddNewDataSource Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Is Fetched
	 } catch (Exception|Error e) {	
	 }
	 return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_SetEmailOptionsPositionVerify
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of SetEmailOptions Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_SetEmailOptionsPositionVerify(WebDriver driver)
{
	 WebElement Element = null;
	 try{
		 Element = driver.findElement(By.xpath(".//*[@class='dropdown navPd'][5]/a")); //Unique id Of SetEmailOptions Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Is Fetched
	 } catch (Exception|Error e) {	
	 }
	 return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_AddNewModuleGroupPositionVerify
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of AddNewModuleGroup Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_AddNewModuleGroupPositionVerify(WebDriver driver)
{
	 WebElement Element = null;
	 try{
		 Element = driver.findElement(By.xpath(".//*[@class='dropdown navPd'][6]/a")); //Unique id Of AddNewModuleGroup Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Is Fetched
	 } catch (Exception|Error e) {	
	 }
	 return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_RenameModuleGroupPositionVerify
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of RenameModuleGroup Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_RenameModuleGroupPositionVerify(WebDriver driver)
{
	 WebElement Element = null;
	 try{
		 Element = driver.findElement(By.xpath(".//*[@class='dropdown navPd'][7]/a")); //Unique id Of RenameModuleGroup Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Is Fetched
	 } catch (Exception|Error e) {	
	 }
	 return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_AuthenticationProviderSettingsPositionVerify
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of RenameModuleGroup Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_AuthenticationProviderSettingsPositionVerify(WebDriver driver)
{
	 WebElement Element = null;
	 try{
		 Element = driver.findElement(By.xpath(".//*[@class='dropdown navPd'][8]/a")); //Unique id Of AuthenticationProviderSettings Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Is Fetched
	 } catch (Exception|Error e) {	
	 }
	 return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMS_Btn_MultiLangDateFormatPositionVerify
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of MultiLangDateFormat Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-17-2017                               
//============================================================================================
public static WebElement RMAApp_SMS_Btn_MultiLangDateFormatPositionVerify(WebDriver driver)
{
	 WebElement Element = null;
	 try{
		 Element = driver.findElement(By.xpath(".//*[@class='dropdown navPd'][9]/a")); //Unique id Of MultiLangDateFormat Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Is Fetched
	 } catch (Exception|Error e) {	
	 }
	 return Element;
}
}