package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Utilities_Customization {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_CustPortalSetting_Btn_ViewUpdatePortal
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which View/Update Portal Logo Button On RMA Application Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
// ============================================================================================
public static WebElement RMAApp_CustPortalSetting_Btn_ViewUpdatePortal(WebDriver driver)
{
	Element = driver.findElement(By.id("btnLogo")); //Unique Id  Of View/Update Portal Logo Button On RMA Application Customization --> Portal Setting Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RRMAApp_CustPortalSetting_Txt_BgcolorHexFormat
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which background color in Hex Format TextBox On Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
// ============================================================================================
public static WebElement RMAApp_CustPortalSetting_Txt_BgcolorHexFormat(WebDriver driver)
{
	Element = driver.findElement(By.id("txtbkcolor")); //Unique Id  Of  background color in Hex Format TextBox On Customization --> Portal Setting Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_CustPortalSetting_Txt_LoginvalueHexFormat
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of font color for login value in Hex Format TextBox On Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
// ============================================================================================
public static WebElement RMAApp_CustPortalSetting_Txt_LoginvalueHexFormat(WebDriver driver)
{
	Element = driver.findElement(By.id("txtLoginValueFontColor")); //Unique Id  Of  font color for login value in Hex Format TextBox On Customization --> Portal Setting Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_CustPortalSetting_Txt_LoginLabelHexFormat
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which login label in Hex Format TextBox On Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
// ============================================================================================
public static WebElement RMAApp_CustPortalSetting_Txt_LoginLabelHexFormat(WebDriver driver)
{
	Element = driver.findElement(By.id("txtLoginLabelFontColor")); //Unique Id  Of  login label in Hex Format TextBox On Customization --> Portal Setting Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_CustPortalSetting_Txt_LogoutLabelHexFormat
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  forgot password link value in Hex Format TextBox On Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustPortalSetting_Txt_ForgotPassHexFormat(WebDriver driver)
{
	Element = driver.findElement(By.id("txtForgotPasswordColor")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_CustPortalSetting_Txt_LogoutValueHexFormat
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which logout value in Hex Format TextBox On Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustPortalSetting_Txt_LogoutValueHexFormat(WebDriver driver)
{
	Element = driver.findElement(By.id("txtLogoutFontColor")); 
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_CustPortalSetting_Img_New
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which New Image On Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustPortalSetting_Img_New(WebDriver driver)
{
	Element = driver.findElement(By.id("CommonPortletsGrid_New")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_CustPortalSetting_Txt_NameofPortlet
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Name of Portlet TextBox On Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustPortalSetting_Txt_NameofPortlet(WebDriver driver)
{
	Element = driver.findElement(By.id("Name")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_CustPortalSetting_Txt_URLofPortlet
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which URL Of Portlet TextBox On Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustPortalSetting_Txt_URLofPortlet(WebDriver driver)
{
	Element = driver.findElement(By.id("urlPortlet")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Customization_Chk_AllowCheckForDuplicateClaims
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Check For Possible Duplicate Claims CheckBox On Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustPortalSetting_Btn_Ok(WebDriver driver)
{
	Element = driver.findElement(By.id("btnOk")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Customization_Chk_UseEnhancedNotes
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Image On Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustPortalSetting_Img_Edit(WebDriver driver)
{
	Element = driver.findElement(By.id("CommonPortletsGrid_Edit")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Customization_Chk_UseClaimComments
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Image On Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustPortalSetting_Img_Delete(WebDriver driver)
{
	Element = driver.findElement(By.id("CommonPortletsGrid_Delete")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_CustPortalSetting_Grid
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Common Portlets Customization Grid  On Customization --> Portal Setting Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustPortalSetting_Grid(WebDriver driver)
{
	Element = driver.findElement(By.id("CommonPortletsGrid_gvData_ctl00")); 
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_CustWebLink_Img_New
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which New Image On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustWebLink_Img_New(WebDriver driver)
{
	Element = driver.findElement(By.id("btnNew")); //Unique id Of New Image On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_UIWebLink_Txt_ShortName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which URL Short Name TextBox On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustWebLink_Txt_ShortName(WebDriver driver)
{
	Element = driver.findElement(By.id("tbURLShortName")); //Unique id Of URL Short Name TextBox On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			:  RMAApp_CustWebLink_Txt_URLString
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which URL String TextBox On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustWebLink_Txt_URLString(WebDriver driver)
{
	Element = driver.findElement(By.id("tbURLString")); //Unique id Of URL String TextBox On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_CustWebLink_Btn_User
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which User Button On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustWebLink_Btn_User(WebDriver driver)
{
	Element = driver.findElement(By.id("cmdAddCustomizedListUser")); //Unique id Of User Button On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_CustWebLink_Lst_SelectedURL
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected URL List On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustWebLink_Lst_SelectedURL(WebDriver driver)
{
	Element = driver.findElement(By.id("lstSelectedURL")); //Unique id Of Selected URL List On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			:  RMAApp_CustWebLink_Rdb_URLShortName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected URL List On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustWebLink_Rdb_URLShortName(WebDriver driver, String RadioOption)
{
	Element = driver.findElement(By.xpath(".//*[@id='rdURLType']//*[text()='"+RadioOption+"']")); //Unique xpath Of Radio Option(Public/Private) On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			:  RMAApp_CustWebLink_Img_Delete
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Image On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-15-2016                                 
//============================================================================================
public static WebElement RMAApp_CustWebLink_Img_Delete(WebDriver driver)
{
	Element = driver.findElement(By.id("btnDelete")); //Unique id Of Delete Image On RMA Application Utilities -->UI Admins -->Customization--> Web Links Setup Page Is Fetched
	return Element;
}
}