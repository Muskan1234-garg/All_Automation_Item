package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_PolicyDownload {
public static WebElement Element = null;
	
	
//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_Txt_LOB
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy LOB On RMA Application Policy System Download Search Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Txt_LOB(WebDriver driver)
{
	Element = driver.findElement(By.id("txtPolicyLOB")); //Unique Id Of Policy LOB On RMA Application Policy System Download Search Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_Txt_LossDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Loss Date On RMA Application Policy System Download Search Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Txt_LossDate(WebDriver driver)
{
	Element = driver.findElement(By.id("txtLossDate")); //Unique Id Of Policy Loss Of Date On RMA Application Policy System Download Search Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_Txt_PolicyNumber
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Number On RMA Application Policy System Download Search Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Txt_PolicyNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("txtPolicyNumber")); //Unique Id Of Policy Number On RMA Application Policy System Download Search Page Is Fetched
	return Element;	
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_List_SystemName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which System Name On RMA Application Policy System Download Search Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_List_SystemName(WebDriver driver)
{
	Element = driver.findElement(By.id("dlSystemName")); //Unique Id Of System Name On RMA Application Policy System Download Search Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_FilterTextBox
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Filter Text Box Of Entity On RMA Application Search Result Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_FilterTextBox(WebDriver driver, String Entity)
{
	Element = driver.findElement(By.id("gvPolicyList_ctl00_ctl02_ctl02_FilterTextBox_"+Entity)); //Unique Id Of Filter Text Box Of Entity On RMA Application Search Result Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_Btn_Filter
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Filter Button On RMA Application Search Result Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Btn_Filter(WebDriver driver, String Entity)
{
	Element = driver.findElement(By.id("gvPolicyList_ctl00_ctl02_ctl02_Filter_"+Entity)); //Unique Id Of Filter Button Of Entity On RMA Application Search Result Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_Lnk_EqualTo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EqualTo Link On Policy Status Table On RMA Application Search Result Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Lnk_EqualTo(WebDriver driver)
{
	Element = driver.findElement(By.partialLinkText("EqualTo"));
	return Element;
}

//============================================================================================
//FunctionName 			:RMAApp_PolicyDownload_CheckBox_SelectPolicy
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check-box For Select Policy On RMA Application Search Result Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_CheckBox_SelectPolicy(WebDriver driver)
{
	Element = driver.findElement(By.id("gvPolicyList_ctl00_ctl04_GridClientSelectCheckboxSelectCheckBox"));
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_PolicyDownload_Img_Save
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image On RMA Application Policy Download Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Img_Save(WebDriver driver)
{
	Element = driver.findElement(By.id("imgSave"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_First_CheckBox_Download_Ent_Driver_Unit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CheckBoxe On RMA Application Policy Download Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_First_CheckBox_Download_Ent_Driver_Unit(WebDriver driver,String WindowFormTitle)
{
	if(WindowFormTitle.contains("Download Entities")||WindowFormTitle.contains("Download Drivers"))
	Element = driver.findElement(By.id("gvDownloadItems_cbDownloadItemsGrid_0"));
	else if(WindowFormTitle.contains("Download Units"))
	Element = driver.findElement(By.id("gvDownloadItems_ctl00_ctl04_chkBox"));
	else if(WindowFormTitle.contains("Download Coverages"))
	Element = driver.findElement(By.id("dlTest_cbSelect_0"));	
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_CheckBox_Download_Items
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CheckBox Lists On RMA Application Policy Download Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-23-2016                                    
//============================================================================================
public static List <WebElement> RMAApp_PolicyDownload_CheckBox_Download_Items(WebDriver driver)
{
	List <WebElement> element;
	element = driver.findElements(By.xpath(".//*[@id='DataGrid']//input[@type='checkbox']"));	
	return element;
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_Btn_Save_Download_Ent_Driver_Unit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image On RMA Application Policy Download Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Btn_Save_Download_Ent_Driver_Unit(WebDriver driver, String WindowFormTitle)
{
	if(WindowFormTitle.contains("Download Entities")||WindowFormTitle.contains("Download Drivers")||WindowFormTitle.contains("Download Coverages"))
		Element = driver.findElement(By.id("btnSave"));
	else if(WindowFormTitle.contains("Download Units"))
		Element = driver.findElement(By.id("btnNext"));
	
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_Window_Title
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which form title On RMA Application Policy Window Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Window_Title(WebDriver driver)
{
	Element = driver.findElement(By.id("formtitle"));
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_Btn_multipolicyDownload
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Download button On RMA Application Claim Window Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Btn_multipolicyDownload(WebDriver driver)
{
	Element = driver.findElement(By.id("multipolicyidPSDownloadbtn"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_Btn_Submit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Submit button On RMA Application Policy System Download Search Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Btn_Submit(WebDriver driver)
{
	Element = driver.findElement(By.id("bSubmit"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_List_multipolicyid
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Download button On RMA Application Claim Window Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_List_multipolicyid(WebDriver driver)
{
	Element = driver.findElement(By.id("multipolicyid"));
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_Btn_PrimaryPolicy
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Primary Policy  button On RMA Application Claim Window Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-04-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Btn_PrimaryPolicy(WebDriver driver)
{
	Element = driver.findElement(By.id("primarypolicyidbtn"));
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_Txt_PrimaryPolicy
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Primary Policy  button On RMA Application Claim Window Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-04-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Txt_PrimaryPolicy(WebDriver driver)
{
	Element = driver.findElement(By.id("primarypolicyid"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyDownload_Btn_rmAPolicySearch
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of rmA Policy Search button On RMA Application Claim Window Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-05-2017                                    
//============================================================================================
public static WebElement RMAApp_PolicyDownload_Btn_rmAPolicySearch(WebDriver driver)
{
	Element = driver.findElement(By.id("multipolicyidbtn"));
	return Element;
}

}
