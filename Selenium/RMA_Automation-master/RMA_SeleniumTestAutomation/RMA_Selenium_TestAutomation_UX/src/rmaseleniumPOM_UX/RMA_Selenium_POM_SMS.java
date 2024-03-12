package rmaseleniumPOM_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_SMS {
	public static WebElement Element;
	public static List<WebElement> ElementList = null;

	//============================================================================================
	//FunctionName 			: RMAApp_SMS_Btn_AddNewDS
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Data Source Button On RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	// ============================================================================================
	public static WebElement RMAApp_SMS_Btn_AddNewDS(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btn_addnewds")); //Unique Id Of Add New Data Source Button On RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSAddNewDS_Rdb_DBDriver
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DBDriver RadioButton option On RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSAddNewDS_Rdb_DBDriver(WebDriver driver,String DriverName)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='dropzone']//*[text()='"+DriverName+"']/input")); //Unique xpath Of DBDriver RadioButton option On Add New DS Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSAddNewDS_Btn_Next
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Button On Add New DS Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSAddNewDS_Btn_Next(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btn_next")); //Unique Id Of Next Button On Add New DS Of RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSAddNewDS_Btn_Back
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back Button On Add New DS Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSAddNewDS_Btn_Back(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btn_back")); //Unique Id Of Back Button On Add New DS Of RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSAddNewDS_Txt_ServerName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Server Name textBox On Add New DS Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSAddNewDS_Txt_ServerName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_srevername")); //Unique Id Of Server Name textBox On Add New DS Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSAddNewDS_Txt_DatabaseName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Database Name TextBox On Add New DS Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSAddNewDS_Txt_DatabaseName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_dbname")); //Unique Id Of Database Name TextBox On Add New DS Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSAddNewDS_Txt_LoginUserName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Login User Name TextBox On Add New DS Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSAddNewDS_Txt_LoginUserName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_login_name")); //Unique Id Of Login User Name TextBox On Add New DS Of RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSAddNewDS_Txt_LoginPassword
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Login Password TextBox TextBox On Add New DS Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSAddNewDS_Txt_LoginPassword(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_pwd")); //Unique Id Of Login Password TextBox On Add New DS Of RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSAddNewDS_Txt_UniqueDBConnName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which unique name for this database connection TextBox On Add New DS Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSAddNewDS_Txt_UniqueDBConnName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_uniquename")); //Unique Id Of unique name for this database connection TextBox On Add New DS Of RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSAddNewDS_Txt_ActivationCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which code provided by the product support to activate licenses TextBox On Add New DS Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSAddNewDS_Txt_ActivationCode(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_code")); //Unique Id Of code provided by the product support to activate licenses TextBox On RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMS_Lnk_LeftMenuLinkName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Left Menu Link Name On RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMS_Lnk_LeftMenuLinkName(WebDriver driver,String LinkName)
	{
		Element = null;
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
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(WebDriver driver,String LinkName)
	{
		Element = null;
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
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSAddNewDS_Lbl_Step4Message(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='dropzone']//*[@class='success']")); //Unique xpath Of Label Of Step 4 Heading On Add New DS Of RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSAddNewDS_Lbl_Step3Message
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Label Of Step 3 Heading On Add New DS Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSAddNewDS_Lbl_Step3Message(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='dropzone']//*[text()='Database Connection Wizard will now try to connect and validate the database you have selected Please click Next to start the connection and validation process.']")); //Unique xpath Of Label Of Step 3 Heading On Add New DS Of RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMS_Btn_Delete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Delete Button On RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMS_Btn_Delete(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btn_delete")); //Unique id Of Delete Button On RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSDelete_Btn_Delete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Delete Button On  Delete PopUp Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSDelete_Btn_Delete(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btn_del")); //Unique id Of Delete Button On  Delete PopUp Of RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSModelPopup_Btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Cancel Button On Model PopUp Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSModelPopup_Btn_Cancel(WebDriver driver)
	{
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
		Element = driver.findElement(By.xpath(".//*[text()=' "+DSNName+"']/input")); //Unique xpath Of Allowed/Assigned Data-Sources to Login Radio Option On User Settings Of RMA Application Security Management System Page Is Fetched
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
		Element = driver.findElement(By.id("txt_grpname")); //Unique ID Of Please type name for new group TextBox On Module PopUp Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSChangePassword_Txt_NewPassword
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of New Password TextBox On Change Password Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-02-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSChangePassword_Txt_NewPassword(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.id("txt_newpass")); //Unique ID Of New Password TextBox On Change Password Of RMA Application Security Management System Page Is Fetched
		} catch (Exception e) {
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSChangePassword_Txt_ConPassword
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Confirm Password TextBox On Change Password Of  RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-02-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSChangePassword_Txt_ConPassword(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_con")); //Unique ID Of confirm Password TextBox On Change Password Of RMA Application Security Management System Page Is Fetched
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
		Element=null;
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
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+OptionName+"')]/preceding::input[@type='checkbox'][1]")); //Unique xpath Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
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
		Element = null;
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
		Element = null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element = null;
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
		Element=null;
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
		Element=null;
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
	{Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
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
		Element=null;
		Element = null;
		try {Element=null;
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
	//Revision                 : 0.0 - RenuVerma-08-02-2017                             
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(WebDriver driver,String LinkName)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[text()="+"\""+LinkName+ "\"" + "]/preceding::i[2]")); //Unique xpath Of Expand-Collapse Image SMS Module Access Permission On RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;      
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSUser_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Country TextBox On User Settings Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                               
	//============================================================================================
	public static WebElement RMAApp_SMSUser_Txt_Country(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_country")); //Unique id Of Country TextBox On User Settings Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSUser_Txt_Company
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Company TextBox On User Settings Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                               
	//============================================================================================
	public static WebElement RMAApp_SMSUser_Txt_Company(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txtcompany")); //Unique id Of Company TextBox On User Settings Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMS_Btn_RefreshCancelPositionVerify
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of RefreshAndCancel Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMS_Btn_RefreshCancelPositionVerify(WebDriver driver)
	{
		Element = null;
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
	//Revision				: 0.0 - KumudNaithani-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMS_Btn_AddNewUserPositionVerify(WebDriver driver)
	{
		Element = null;
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
	//Revision				: 0.0 - KumudNaithani-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMS_Btn_DeleteSelectedItemPositionVerify(WebDriver driver)
	{
		Element = null;
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
	//Revision				: 0.0 - KumudNaithani-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMS_Btn_AddNewDataSourcePositionVerify(WebDriver driver)
	{
		Element = null;
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
	//Revision				: 0.0 - KumudNaithani-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMS_Btn_SetEmailOptionsPositionVerify(WebDriver driver)
	{
		Element = null;
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
	//Revision				: 0.0 - KumudNaithani-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMS_Btn_AddNewModuleGroupPositionVerify(WebDriver driver)
	{
		Element = null;
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
	//Revision				: 0.0 - KumudNaithani-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMS_Btn_RenameModuleGroupPositionVerify(WebDriver driver)
	{
		Element = null;
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
	//Revision				: 0.0 - KumudNaithani-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMS_Btn_AuthenticationProviderSettingsPositionVerify(WebDriver driver)
	{
		Element = null;
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
	//Revision				: 0.0 - KumudNaithani-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMS_Btn_MultiLangDateFormatPositionVerify(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@class='dropdown navPd'][9]/a")); //Unique id Of MultiLangDateFormat Image Button Position With Respect Other Image Buttons On RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSUser_Btn_Edit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Edit Button On Data Source Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMSDS_Btn_Edit(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.id("btn_edit_ds")); //Unique ID Of Edit Button On Data Source Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSUser_Btn_EditDataSource
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Edit Data Source Button On Data Source Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMSDS_Btn_EditDataSource(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.id("icon_editDs")); //Unique ID Of Edit Data Source Button On Data Source Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSDS_Txt_SystemLoginName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of System Login Name TestBox On Data Source Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMSDS_Txt_SystemLoginName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_sysLoginame")); //Unique ID Of System Login Name TextBox On Data Source Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSUser_Txt_SystemPassword
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of System Password TestBox On Data Source Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMSDS_Txt_SystemPassword(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_syspwd")); //Unique ID Of System Password TextBox On Data Source Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSDS_Txt_PathDataSource
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Path/Data Source TestBox On Data Source Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMSDS_Txt_PathDataSource(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("inp_docPath")); //Unique ID Of Path/Data Source TextBox On Data Source Of RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSDS_Chk_ModAcceSecEnabled
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Module Access Security Enabled Checkbox On Data Source Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMSDS_Chk_ModAcceSecEnabled(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("check_moduleSec")); //Unique ID Of Module Access Security Enabled Checkbox On Data Source Of RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMS_List_LinkBranchCount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Branch Count Of The Link From Left Navigation On Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, LinkName 
	//Revision				: 0.0 - RenuVerma-08-02-2017                              
	//============================================================================================
	public static List<WebElement> RMAApp_SMS_List_LinkBranchCount(WebDriver driver, String LinkName)
	{Element=null;
	ElementList = driver.findElements(By.xpath(".//*[@id='"+LinkName+"']/parent::span/parent::span/parent::span/parent::div/following::treeitem/ul/li")); //Unique xpath Of Module Access Security Enabled CheckBox On RMA Application Security Management System Page Is Fetched
	return ElementList;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSDS_Lbl_WorkstationsCount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Workstations Count On Data Source Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, LinkName 
	//Revision				: 0.0 - RenuVerma-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMSDS_Lbl_WorkstationsCount(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("lbl_workstation")); //Unique ID Of Workstations Count Label On Data Source Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSDS_Btn_UpdateLicense
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Update License Info Button On Data Source Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, LinkName 
	//Revision				: 0.0 - RenuVerma-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMSDS_Btn_UpdateLicense(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("icon_updateLic")); //Unique ID Of Update License Info Button On Data Source Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSUpdLic_Txt_LicenseCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The License Code TextBox On Data Source Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, LinkName 
	//Revision				: 0.0 - RenuVerma-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMSUpdLic_Txt_LicenseCode(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_lic_code")); //Unique ID Of Enter License Code TextBox On Data Source Of RMA Application Security Management System Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSUpdLic_Btn_UpdateCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The UpdateCode Button On Data Source Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, LinkName 
	//Revision				: 0.0 - RenuVerma-08-02-2017                              
	//============================================================================================
	public static WebElement RMAApp_SMSUpdLic_Btn_UpdateCode(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btn_update")); //Unique ID Of UpdateCode Button On Data Source Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMS_Img_ExpCllp_RISKMASTER
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The RISKMASTER Expand/Collapse Image Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, LinkName 
	//Revision				: 0.0 - ShrutiShruti-03-12-2018                              
	//============================================================================================
	public static WebElement RMAApp_SMS_Img_ExpCllp_RISKMASTER(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@class='ng-binding' and normalize-space(text())='RISKMASTER']//ancestor::li[1]/i[1]")); //Unique ID Of RISKMASTER Expand/Collapse Image Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermissionEmployee
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission For Employee Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-03-15-2017                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermissionEmployee(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Employee']/preceding::input[@type='checkbox'][1]")); //Unique xpath Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Save Button On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-12-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Btn_Save(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.id("btn_Save")); //Unique id Of Save Button On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_Delete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Delete CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-03-20-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_Delete(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Delete']//ancestor::div[1]/span[2]/input[2]")); //Unique xpath Of Delete CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_ViewPermission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-11-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_ViewPermission(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[normalize-space(text())='View']/preceding::input[@type='checkbox'][1]")); //Unique xpath Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_DeletePermission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-11-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_DeletePermission(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Delete']/preceding::input[@type='checkbox'][1]")); //Unique xpath Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_PI_Chk_ViewPermission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-11-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_PI_Chk_ViewPermission(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[normalize-space(text())='View']/preceding::input[@id='check_allow23' and @type='checkbox'][1]")); //Unique xpath Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Withholding_Lnk_CreatePermission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Create Link For Withholding On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-05-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Withholding_Lnk_CreatePermission(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@id='moduletree']/ul/li/treeitem/ul/li[1]/treeitem/ul/li[13]/treeitem/ul/li[15]/treeitem/ul/li/treeitem/ul/li[1]/div/span[3]/a")); //Unique xpath Of Create Link For Withholding On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Withholding_Lnk_UpdatePermission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Update Link For Withholding On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-05-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Withholding_Lnk_UpdatePermission(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@id='moduletree']/ul/li/treeitem/ul/li[1]/treeitem/ul/li[13]/treeitem/ul/li[15]/treeitem/ul/li/treeitem/ul/li[2]/div/span[3]/a")); //Unique xpath Of Update Link For Withholding On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Withholding_Lnk_ViewPermission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which View Link For Withholding On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-05-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Withholding_Lnk_ViewPermission(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@id='moduletree']/ul/li/treeitem/ul/li[1]/treeitem/ul/li[13]/treeitem/ul/li[15]/treeitem/ul/li/treeitem/ul/li[3]/div/span[3]/a")); //Unique xpath Of View Link For Withholding On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Lnk_LinkName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Link Name Of SMS Module Access Permission On RMA Application SMS Page Is Fetched
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-04-2018                               
	//============================================================================================

	public static WebElement RMAApp_SMSModuleAccPerm_Lnk_LinkName(WebDriver driver,String LinkName)
	{
		Element = null;
		try{
			Element = driver.findElement(By.linkText(LinkName)); //Unique Id Of Link Name Of SMS Module Access Permission On RMA Application SMS Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Lnk_WithholdingPermissions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Create, Update, View Link Name Under Withholding Node Of SMS Module Access Permission On RMA Application SMS Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-18-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Lnk_WithholdingPermissions(WebDriver driver,String GrandParentNodeName, String ParentNodeName, int ChildNodeindex)
	{
		Element = null;
		try{
			List<WebElement> lis1=driver.findElement(By.xpath(".//*[@id='moduletree']/ul/li/treeitem/ul/li[1]//treeitem/ul")).findElements(By.tagName("li"));//To Find The LI Index Of GrandParentNodeName Under RISKMASTER Node
			for(int i=0;i<lis1.size();i++)
			{
				WebElement parentlitext=driver.findElement(By.xpath(".//*[@id='moduletree']/ul/li/treeitem/ul/li[1]/treeitem/ul/li["+(i+1)+"]/div/span[3]/a"));
				if(parentlitext.getText().trim().equals(GrandParentNodeName))
				{		
					List<WebElement> lis2= driver.findElement(By.xpath(".//*[@id='moduletree']/ul/li/treeitem/ul/li[1]/treeitem/ul/li["+(i+1)+"]/treeitem/ul")).findElements(By.tagName("li"));//To Find The LI Index Of ParentNodeName Under GrandParentNodeName Under RISKMASTER Node
					for(int j=0;j<lis2.size();j++)
					{
						WebElement litext=driver.findElement(By.xpath(".//*[@id='moduletree']/ul/li/treeitem/ul/li[1]/treeitem/ul/li["+(i+1)+"]/treeitem/ul/li["+(j+1)+"]/div/span[3]/a"));
						if(litext.getText().trim().equals(ParentNodeName))
						{
							Element = driver.findElement(By.xpath(".//*[@id='moduletree']/ul/li/treeitem/ul/li[1]/treeitem/ul/li["+(i+1)+"]/treeitem/ul/li["+(j+1)+"]/treeitem/ul/li/treeitem/ul/li["+ChildNodeindex+"]/div/span[3]/a/preceding::input[@type='checkbox'][1]")); //Unique Id Of Link Name Create, Update, View Under Withholding Node Of SMS Module Access Permission On RMA Application SMS Page Is Fetched
							break;
						}
					}  	
					break;
				}		      
			}  		 
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_DeletePermission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-11-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_EnhancedNotesPermission(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Enhanced Notes']/preceding::input[@type='checkbox'][1]")); //Unique xpath Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_SMSModuleAccPerm_Chk_Event_EnhancedNotes
	//Description                     : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - FaizaSheikh - 08-10-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_Event_EnhancedNotes(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'Event/Occurrence')]/preceding::i[2]//ancestor::li[1]/treeitem/ul/li[11]/div/span[2]/input[2]")); //Unique xpath Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_PersonInvolvedDeletePermission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-10-2019                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_PersonInvolvedDeletePermission(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Persons Involved']//ancestor::li[1]//a[contains(text(),'Delete')]//ancestor::div[1]//input[@type='checkbox']")); //Unique xpath Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_PersonInvolvedViewPermission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-10-2019                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_PersonInvolvedViewPermission(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Persons Involved']//ancestor::li[1]//a[normalize-space(text())='View']//ancestor::div[1]//input[@type='checkbox']")); //Unique xpath Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_DiaryPermission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-11-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_DiaryPermission(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Diary']/preceding::input[@type='checkbox'][1]")); //Unique xpath Of  Which Diary CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_AllowActionsPermission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-11-2018                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_AllowActionsPermission(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Allow Actions on diaries assigned to other users']/preceding::input[@type='checkbox'][1]")); //Unique xpath Of  Which Diary CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_SubSettingPermission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unique Id Of Sub Setting Of Module On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-05-2020                               
	//==========================================================================================================================================================================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_SubSettingPermission(WebDriver driver,String text1,String text2)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[text()="+"\""+text1+ "\"" + "]/following::treeitem//descendant::a[contains(text(), "+"\""+text2+ "\"" + ")]/preceding::span[1]"));//Unique xpath Of Sub Setting Of Module On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermissionExactText
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-07-2020                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermissionExactText(WebDriver driver, String OptionName)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[normalize-space(text())='"+OptionName+"']/preceding::input[@type='checkbox'][1]")); //Unique xpath Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_ModuleExpandCollapseExactText
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-07-2020                               
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_ModuleExpandCollapseExactText(WebDriver driver, String OptionName)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[normalize-space(text())='"+OptionName+"']/preceding::i[2]")); //Unique xpath Of Option Name(RISKMASTER, SORTMASTER etc.) CheckBox On SMS Module Access Permission Of RMA Application Security Management System Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMS_Img_ExpCllp_Catastrophe
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The RISKMASTER Expand/Collapse Image Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, LinkName 
	//Revision				: 0.0 - ShrutiShruti-03-12-2018                              
	//============================================================================================
	public static WebElement RMAApp_SMS_Img_ExpCllp_Catastrophe(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='moduletree']/ul/li/treeitem/ul/li[1]/treeitem/ul/li[3]/i[1]")); //Unique ID Of Catastrophe Expand/Collapse Image Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMSModuleAccPerm_Chk_Allow_Delete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) Unique ID Of Delete Checkbox  Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, LinkName 
	//Revision				: 0.0 - VartikaSood-17-08-2020                             
	//============================================================================================


	public static WebElement RMAApp_SMSModuleAccPerm_Chk_Allow_Delete(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Automatic Checks')]//ancestor::li[1]/treeitem//*[contains(text(),'Delete')]//ancestor::div[1]//*[@type='checkbox']")); //Unique ID Of Delete Checkbox Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMS_Img_ExpCllp_Funds_Management
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The RISKMASTER Expand/Collapse Image Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, LinkName 
	//Revision				:  0.0 - VartikaSood-10-08-2020                              
	//============================================================================================
	public static WebElement RMAApp_SMS_Img_ExpCllp_Funds_Management(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='moduletree']/ul/li/treeitem/ul/li[1]/treeitem/ul/li[20]/i[1]")); //Unique ID Of Funds Management Expand/Collapse Image Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SMS_Img_ExpCllp_AutomaticChecks
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) Unique ID Of Automatic Checks Expand/Collapse Image Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, LinkName 
	//Revision				: 0.0 - VartikaSood-10-08-2020                             
	//============================================================================================
	public static WebElement RMAApp_SMS_Img_ExpCllp_AutomaticChecks(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='moduletree']/ul/li/treeitem/ul/li[1]/treeitem/ul/li[20]/treeitem/ul/li[8]/i[1]")); //Unique ID Of Automatic Checks Expand/Collapse Image Of RMA Application Security Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName            : RMAApp_SMSModuleAccPerm_Chk_EventComments
	//Description             : To Fetch Unique Property (Such As Id, Xpath, Name ) Unique ID Of Event Comments Expand/Collapse Image Of RMA Application Security Management System Page Can Be Identified
	//Input Parameter         : Driver Variable Of The Type WebDriver, LinkName 
	//Revision                : 0.0 - VartikaSood-10-08-2020                             
	//============================================================================================
	public static WebElement RMAApp_SMSModuleAccPerm_Chk_EventComments(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='check_allow0']")); //Unique ID Of Automatic Checks Expand/Collapse Image Of RMA Application Security Management System Page Is Fetched
		return Element;
	}
}