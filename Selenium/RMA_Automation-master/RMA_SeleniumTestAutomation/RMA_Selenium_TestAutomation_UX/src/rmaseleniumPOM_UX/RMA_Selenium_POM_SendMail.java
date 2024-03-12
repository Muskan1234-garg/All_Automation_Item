package rmaseleniumPOM_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_SendMail {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
	
//============================================================================================
//FunctionName 			: RMAApp_SendMail_Txt_To
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Text Box On RMA Application Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                 
// ============================================================================================
public static WebElement RMAApp_SendMail_Txt_To(WebDriver driver)
{
	Element =null;
	Element = driver.findElement(By.xpath(".//*[@id='lstToEmail']/p/div/ul/li/input")); //Unique Id Of To Text Box On RMA Application Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Txt_CC
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CC Text Box On RMA Application Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Txt_CC(WebDriver driver)
{
	Element =null;
	Element = driver.findElement(By.xpath(".//*[@id='lstCC']/p/div/ul/li/input")); //Unique Id Of CC Text Box On RMA Application Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Txt_Body
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Body Text Box On RMA Application Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Txt_Body(WebDriver driver)
{
	Element =null;
	Element = driver.findElement(By.xpath(".//*[@class='fr-element fr-view']")); //Unique Id Of Body Text Box On RMA Application Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Btn_Send
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Send Button On RMA Application Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Btn_Send(WebDriver driver)
{
	Element =null;
	Element = driver.findElement(By.xpath(".//*[@name='sendicon']/i")); //Unique Id Of Send Button On RMA Application Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Lst_SelectType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Type List On RMA Application Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Lst_SelectType(WebDriver driver)
{
	Element =null;
	Element = driver.findElement(By.id("ddlselectType")); //Unique Id Of Select Type List On RMA Application Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Chk_ExecuiveSummary
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Executive Summary CheckBox On RMA Application Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Chk_ExecuiveSummary(WebDriver driver)
{
	Element =null;
	Element = driver.findElement(By.id("chksummary")); //Unique Id Of Executive Summary CheckBox On RMA Application Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Chk_AttachToDocument
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Attach To Documents CheckBox On RMA Application Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Chk_AttachToDocument(WebDriver driver)
{
	Element =null;
	Element = driver.findElement(By.id("chkDocument")); //Unique Id Of Attach To Documents CheckBox On RMA Application Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Txt_Regarding
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Regarding TextBox On RMA Application Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Txt_Regarding(WebDriver driver)
{
	Element =null;
	Element = driver.findElement(By.id("txtregarding")); //Unique Id Of Regarding TextBox On RMA Application Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Txt_Subject
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Subject TextBox On RMA Application Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Txt_Subject(WebDriver driver)
{
	Element =null;
	Element = driver.findElement(By.id("txtsubject")); //Unique Id Of Subject TextBox  On RMA Application Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Header
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Header On RMA Application Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Header(WebDriver driver)
{
	Element =null;
	Element = driver.findElement(By.xpath(".//*[@class='header ng-binding']")); //Unique Id Of Header On RMA Application Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Btn_HeaderClose
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Image Button On RMA Application Send Mail Page's Header Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Btn_HeaderClose(WebDriver driver)
{
	Element =null;
		Element = driver.findElement(By.name("btnCancelmemo")); //Unique Id Of Close Image Button On RMA Application Send Mail Page's Header Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Btn_Cancel
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Image Button On RMA Application Send Mail Page's Header Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Btn_Cancel(WebDriver driver)
{
	Element =null;
	try {
		Element = driver.findElement(By.name("closeicon")); //Unique Id Of Cancel Image Button On RMA Application Send Mail Page's Header Is Fetched
	} catch (Exception|Error e) {
		System.out.println("RMAApp_SendMail_Btn_Cancel Element Was Not Found On Screen Hence Entered Catch Block");
	}
	return Element;
}
}