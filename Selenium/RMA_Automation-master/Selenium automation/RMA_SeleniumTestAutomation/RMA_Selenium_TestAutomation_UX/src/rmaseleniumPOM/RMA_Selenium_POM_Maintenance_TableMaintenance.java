package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Maintenance_TableMaintenance {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_MaintTableMaintenance_Btn_Generic
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Button Name On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver,	ButtonName: Add code/Edite Code/Print... etc	 
//Revision				: 0.0 - RenuVerma-01-04-2017                                    
//============================================================================================
public static WebElement RMAApp_MaintTableMaintenance_Btn_Generic(WebDriver driver,String ButtonName)
{
	Element = driver.findElement(By.xpath(".//*[@value='"+ButtonName+"']")); //Unique xpath of Button Name On RMA Application Maintenance--> Table Maintenance Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			:RMAApp_MaintTableMaintenance_Txt_Code
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Code TextBox On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-01-04-2017                                    
//============================================================================================
public static WebElement RMAApp_MaintTableMaintenance_Txt_Code(WebDriver driver)
{
	Element = driver.findElement(By.id("Code")); //Unique Id Of Code TextBox On RMA Application Maintenance--> Table Maintenance Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			:RMAApp_MaintTableMaintenance_Txt_EffectiveStartDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Effective Start Date TextBox On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-01-04-2017                                    
//============================================================================================
public static WebElement RMAApp_MaintTableMaintenance_Txt_EffectiveStartDate(WebDriver driver)
{
	Element = driver.findElement(By.id("e_StartDate")); //Unique Id Of Effective Start Date TextBox On RMA Application Maintenance--> Table Maintenance Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			:RMAApp_MaintTableMaintenance_Txt_EffectiveEndDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Effective End Date TextBox On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-01-04-2017                                    
//============================================================================================
public static WebElement RMAApp_MaintTableMaintenance_Txt_EffectiveEndDate(WebDriver driver)
{
	Element = driver.findElement(By.id("e_EndDate")); //Unique Id Of Effective End Date TextBox On RMA Application Maintenance--> Table Maintenance Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			:RMAApp_MaintTableMaintenance_Txt_LineOfBusiness
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Line Of Business TextBox On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-01-04-2017                                    
//============================================================================================
public static WebElement RMAApp_MaintTableMaintenance_Txt_LineOfBusiness(WebDriver driver)
{
	Element = driver.findElement(By.id("Line_of_Bus")); //Unique Id Of Line Of Business TextBox On RMA Application Maintenance--> Table Maintenance Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			:RMAApp_MaintTableMaintenance_Txt_Description
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Description TextBox On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-01-04-2017                                    
//============================================================================================
public static WebElement RMAApp_MaintTableMaintenance_Txt_Description(WebDriver driver)
{
	Element = driver.findElement(By.id("Code_Desc")); //Unique Id Of Description TextBox On RMA Application Maintenance--> Table Maintenance Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			:RMAApp_MaintTableMaintenance_Tbl_CodeMaint
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Code Maintenance Table On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-01-04-2017                                    
//============================================================================================
public static WebElement RMAApp_MaintTableMaintenance_Tbl_CodeMaint(WebDriver driver)
{
	Element = driver.findElement(By.id("grdCodeMaint")); //Unique Id Of Code Maintenance Table On RMA Application Maintenance--> Table Maintenance Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			:RMAApp_MaintTableMaintenance_Txt_ParentCode
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Parent Code textBox On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-01-04-2017                                    
//============================================================================================
public static WebElement RMAApp_MaintTableMaintenance_Txt_ParentCode(WebDriver driver)
{
	Element = driver.findElement(By.id("pCode")); //Unique Id Of Parent Code textBox On RMA Application Maintenance--> Table Maintenance Page Is Fetched
	return Element;	
}
}
