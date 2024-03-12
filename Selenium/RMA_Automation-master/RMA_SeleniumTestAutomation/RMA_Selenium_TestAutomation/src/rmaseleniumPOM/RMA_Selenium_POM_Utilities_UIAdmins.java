package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Utilities_UIAdmins {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_UIPowerView_Tbl_PowerViewsSetup
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Power View Table On RMA Application Utilities -->UI Admins -->Powerview Editor Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-14-2016                                 
// ============================================================================================
public static WebElement RMAApp_UIPowerView_Tbl_PowerViewsSetup(WebDriver driver)
{
	Element = driver.findElement(By.id("grdPowerViewList")); //Unique Id Of Power View Table On RMA Application Utilities -->UI Admins -->Powerview Editor Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_UIPowerView_Generic_Btn
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Button Name On RMA Application Utilities -->UI Admins -->Powerview Editor Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-14-2016                                 
//============================================================================================
public static WebElement RMAApp_UIPowerView_Generic_Btn(WebDriver driver, String ButtonName)
{
	Element = driver.findElement(By.xpath(".//*[@value='"+ButtonName+"']")); //Unique xpath Of  Button Name On RMA Application Utilities -->UI Admins -->Powerview Editor Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_UIPowerView_Txt_ViewName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which View Name On RMA Application Utilities -->UI Admins -->Powerview Editor Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-14-2016                                 
//============================================================================================
public static WebElement RMAApp_UIPowerView_Txt_ViewName(WebDriver driver)
{
	Element = driver.findElement(By.id("txtViewName")); //Unique id Of  View Name On RMA Application Utilities -->UI Admins -->Powerview Editor Page Is Fetched
	return Element;
	
}
//============================================================================================
//FunctionName 			: RMAApp_UIPowerView_Lst_HomePage
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Home Page List On RMA Application Utilities -->UI Admins -->Powerview Editor Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-14-2016                                 
//============================================================================================
public static WebElement RMAApp_UIPowerView_Lst_HomePage(WebDriver driver)
{
	Element = driver.findElement(By.id("cboHomePage")); //Unique id Of  Home Page List On RMA Application Utilities -->UI Admins -->Powerview Editor Page Is Fetched
	return Element;
	
}
//============================================================================================
//FunctionName 			: RMAApp_UIPowerView_Chk_Clone
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Clone Base View Checkbox On RMA Application Utilities -->UI Admins -->Powerview Editor Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-14-2016                                 
//============================================================================================
public static WebElement RMAApp_UIPowerView_Chk_Clone(WebDriver driver)
{
	Element = driver.findElement(By.id("chkClone")); //Unique id Of Clone Base View Checkbox On RMA Application Utilities -->UI Admins -->Powerview Editor Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_UIPowerView_Lst_AvailableUser
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Available User List On RMA Application Utilities -->UI Admins -->Powerview Editor Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-14-2016                                 
//============================================================================================
public static WebElement RMAApp_UIPowerView_Lst_AvailableUser(WebDriver driver)
{
	Element = driver.findElement(By.id("cboAvialUser")); //Unique id Of Clone Available User List On RMA Application Utilities -->UI Admins -->Powerview Editor Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_UIPowerView_Lnk_PowerViewTable
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Link Of The Power View Table On RMA Application Utilities -->UI Admins -->Powerview Editor Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-14-2016                                 
//============================================================================================
public static WebElement RMAApp_UIPowerView_Lnk_PowerViewTable(WebDriver driver, String ViewName, String LinkName)
{
	Element = driver.findElement(By.xpath(".//*[@pvname='"+ViewName+"' and @title='"+LinkName+"']")); //Unique xpath Of Link Of The Power View Table On RMA Application Utilities -->UI Admins -->Powerview Editor Page Is Fetched
	return Element;
}


}
