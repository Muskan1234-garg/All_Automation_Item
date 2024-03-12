package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Login_DSNSelect_Frames {
public static WebElement Element = null;

//============================================================================================
//FunctionName 		: RMAApp_Login_Txt_UserName
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UserName TextBox On RMA Application Login Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-10-12-2015                                 
// ============================================================================================
public static WebElement RMAApp_Login_Txt_UserName(WebDriver driver)
{
	Element = driver.findElement(By.id("cphMainBody_Login1_UserName")); //Unique Id  Of UserName Textbox on Login Page Of RMA Application Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_Login_Txt_PassWord
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PassWord TextBox On RMA Application Login Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-10-12-2015                                 
// ============================================================================================
public static WebElement RMAApp_Login_Txt_PassWord(WebDriver driver)
{
	Element = driver.findElement(By.id("cphMainBody_Login1_Password")); //Unique Id  Of PassWord Textbox On Login Page Of RMA Application Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Login_Btn_Login
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Login Button On RMA Application Login Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-12-2015                                 
// ============================================================================================
public static WebElement RMAApp_Login_Btn_Login(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='cphMainBody_Login1_Button1']")); //Unique Id  Of Login Button On Login Page Of RMA Application Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_DSNSelect_Lst_DataSourceName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DataSourceName ListBox On RMA Application DSN Selection Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-16-2015                                 
// ============================================================================================
public static WebElement RMAApp_DSNSelect_Lst_DataSourceName(WebDriver driver)
{
	Element = driver.findElement(By.id("cphMainBody_ddlDataSources")); //Unique Id  Of DataSourceName ListBox On RMA Application DSN Selection Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_DSNSelect_Btn_Continue
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Continue Button On RMA Application DSN Selection Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-16-2015                                 
// ============================================================================================
public static WebElement RMAApp_DSNSelect_Btn_Continue(WebDriver driver)
{
	Element = driver.findElement(By.id("cphMainBody_btnLogin")); //Unique Id  Of Continue Button On RMA Application DSN Selection Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_DefaultView_Lbl_DataSource
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DataSource Label On RMA Application Default View Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-16-2015                                 
// ============================================================================================
public static WebElement RMAApp_DefaultView_Lbl_DataSource(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='cphMainBody_lblDSN']")); //Unique Id  Of DataSource Label On RMA Application Default View Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_DefaultView_Lbl_LoginInfo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Banner loginInfoInner On RMA Application Default View Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-16-2015                                 
//============================================================================================
public static WebElement RMAApp_DefaultView_Lbl_LoginInfo(WebDriver driver)
{
	Element = driver.findElement(By.id("cphMainBody_loginInfoInner")); //Unique Id  Of Banner loginInfoInner On RMA Application Default View Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_Login_Lbl_FailureText
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FailureText Label On RMA Application Login Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-16-2017                               
//============================================================================================
public static WebElement RMAApp_Login_Lbl_FailureText(WebDriver driver)
{
	Element = driver.findElement(By.className("FailureText")); //Unique classname Of FailureText Label On RMA Application Login Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_DSNSelection_Lbl_ErrorText
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ErrorText Label On RMA Application DSN Selection Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-17-2017                               
//============================================================================================
public static WebElement RMAApp_DSNSelection_Lbl_ErrorText(WebDriver driver)
{
	Element = driver.findElement(By.id("cphMainBody_ErrorControl1_lblError")); //Unique Id Of Error Of Label On RMA Application DSN Selection Page Is Fetched
	return Element;
}
}

