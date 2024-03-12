package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_LicenseSupportURL {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
	
//============================================================================================
//FunctionName 			: RMAApp_LicSupportURL_Txt_DSN
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Data Source Name TextBox On Lincese Support(http://rmintranet.fsg.amer.csc.com/rmsupport/default.aspx) Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-05-26-2017                              
// ============================================================================================
public static WebElement RMAApp_LicSupportURL_Txt_DSN(WebDriver driver)
{
	Element = driver.findElement(By.id("ctl00_m_g_0a2903a2_a55e_4a57_b4dd_3dc9c97239ed_ctl00_txtDSN")); //Unique Id Of Add New Data Source Button On RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LicSupportURL_Txt_NumOfWorkstation
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Number Of Workstation TextBox On Lincese Support(http://rmintranet.fsg.amer.csc.com/rmsupport/default.aspx) Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-05-26-2017                                     
//============================================================================================
public static WebElement RMAApp_LicSupportURL_Txt_NumOfWorkstation(WebDriver driver)
{
	Element = driver.findElement(By.id("ctl00_m_g_0a2903a2_a55e_4a57_b4dd_3dc9c97239ed_ctl00_txtWorkstations")); //Unique xpath Of DBDriver RadioButton option On Add New DS Of RMA Application Security Management System Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SMSAddNewDS_Btn_Next
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which License Code Label On Lincese Support(http://rmintranet.fsg.amer.csc.com/rmsupport/default.aspx) Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-05-26-2017                                  
//============================================================================================
public static WebElement RMAApp_LicSupportURL_Label_LicenseCode(WebDriver driver)
{
	Element = driver.findElement(By.id("ctl00_m_g_0a2903a2_a55e_4a57_b4dd_3dc9c97239ed_ctl00_lblLicenseCode")); //Unique Id Of Next Button On Add New DS Of RMA Application Security Management System Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_LicSupportURL_Btn_GenLicenseCode
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generate License Code Button On Lincese Support(http://rmintranet.fsg.amer.csc.com/rmsupport/default.aspx) Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-05-26-2017                                  
//============================================================================================
public static WebElement RMAApp_LicSupportURL_Btn_GenLicenseCode(WebDriver driver)
{
	Element = driver.findElement(By.id("ctl00_m_g_0a2903a2_a55e_4a57_b4dd_3dc9c97239ed_ctl00_cmdGenerate")); //Unique Id Of Generate License Code Button On Add New DS Of RMA Application Security Management System Page Is Fetched
	return Element;
}
}