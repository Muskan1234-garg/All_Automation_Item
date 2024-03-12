package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Maintenance_TableMaintenance {
	public static WebElement Element = null;


	//============================================================================================
	//FunctionName 			: RMAApp_MaintTableMaintenance_Img_AlphaIconTag
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Alphabet Icon Image On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver,	ButtonName: Add code/Edite Code/Print... etc	 
	//Revision				: 0.0 - RenuVerma-01-18-2019                                    
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Lnk_AlphaIconTag(WebDriver driver,char AlphaIcon)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@data-ng-bind='alpha'][text()='"+AlphaIcon+"']")); //Unique xpath of Alphabet Icon Image On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_MaintTableMaintenance_Lnk_LftUserTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Alphabet Icon Image On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver,	ButtonName: Add code/Edite Code/Print... etc	 
	//Revision				: 0.0 - RenuVerma-01-18-2019                                    
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Lnk_LftUserTable(WebDriver driver,String TableNameLink)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@data-ng-bind='Glossary.userTableName'][contains(text(),'"+TableNameLink+"')]")); //Unique xpath of Alphabet Icon Image On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_MaintTableMaintenance_Btn_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add New Button On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver,	ButtonName: Add code/Edite Code/Print... etc	 
	//Revision				: 0.0 - RenuVerma-01-18-2019                                    
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Btn_AddNew(WebDriver driver)
	{
		Element = driver.findElement(By.id("I1")); //Unique xpath of Add New Button On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_MaintTableMaintenance_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add New Button On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver,	ButtonName: Add code/Edite Code/Print... etc	 
	//Revision				: 0.0 - RenuVerma-01-18-2019                                    
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Btn_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_del")); //Unique xpath of Add New Button On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			:RMAApp_MaintTableMaintenance_Txt_Code
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Code TextBox On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-18-2019                                    
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Txt_Code(WebDriver driver)
	{
		Element = driver.findElement(By.id("txt_Code")); //Unique Id Of Code TextBox On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			:RMAApp_MaintTableMaintenance_Txt_EffectiveStartDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Effective Start Date TextBox On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-18-2019                                    
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Txt_EffectiveStartDate(WebDriver driver)
	{
		Element = driver.findElement(By.id("txt_effDateStart")); //Unique Id Of Effective Start Date TextBox On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			:RMAApp_MaintTableMaintenance_Txt_EffectiveEndDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Effective End Date TextBox On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-18-2019                                    
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Txt_EffectiveEndDate(WebDriver driver)
	{
		Element = driver.findElement(By.id("txt_effDateEnd")); //Unique Id Of Effective End Date TextBox On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			:RMAApp_MaintTableMaintenance_Txt_LineOfBusiness
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Line Of Business TextBox On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-18-2019                                    
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Txt_LineOfBusiness(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_txt_lob")); //Unique Id Of Line Of Business TextBox On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			:RMAApp_MaintTableMaintenance_Txt_Description
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Description TextBox On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-18-2019                                    
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Txt_Description(WebDriver driver)
	{
		Element = driver.findElement(By.id("txt_Description")); //Unique Id Of Description TextBox On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			:RMAApp_MaintTableMaintenance_Tbl_CodeMaint
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Code Maintenance Table On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-18-2019                                    
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
	//Revision				: 0.0 - RenuVerma-01-18-2019                                    
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Txt_ParentCode(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_txt_parentCode")); //Unique Id Of Parent Code textBox On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MaintTableMaintenance_Btn_ParentCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Parent Code Lookup Button On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-14-2019                                  
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Btn_ParentCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='btn_txt_parentCode']")); //Unique Id  Of Parent Code Lookup Button On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MaintTableMaintenance_Btn_LOB
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LOB Lookup Button On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-14-2019                                  
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Btn_LOB(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='btn_txt_lob']")); //Unique Id  Of LOB Lookup Button On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MaintTableMaintenance_LookUp_FilterTextBox
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of NG Grid Table (Containing Search Text Boxes) On LookUp NG Grid On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-26-2019                                  
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_LookUp_FilterTextBox(WebDriver driver, String FilterBoxName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[text()='"+FilterBoxName+"']/following::input[@class='ui-grid-filter-input ui-grid-filter-input-0 ng-empty'][1]")); //Unique Id  Of FilterBox Names In Column Selection List of NG Grid Table (Containing Search Text Boxes) On LookUp NG Grid On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MaintTableMaintenance_LookUp_SelectTopmostCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Description Of Topmost Code In Column Selection List of NG Grid Table On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-04-26-2019                                  
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_LookUp_SelectTopmostCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[text()='Description']//following::div[@class='ui-grid-cell-contents ng-scope'][1]/*")); //Unique Id Of Description Of Topmost Code In Column Selection List of NG Grid Table On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_MaintTableMaintenance_Txt_CodeSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Code Textbox In Column Selection List of NG Grid Table On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2020                                  
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Txt_CodeSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[text()='Code']//ancestor::div[@role='columnheader']//input")); //Unique Id Of Code Textbox In Column Selection List of NG Grid Table On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_MaintTableMaintenance_Txt_BaseLanDescriptionSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Base Language Description Textbox In Column Selection List of NG Grid Table On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2020                                  
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Txt_BaseLanDescriptionSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[text()='Base Language Description']//ancestor::div[@role='columnheader']//input")); //Unique Id Of Base Language Description Textbox In Column Selection List of NG Grid Table On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_MaintTableMaintenance_Txt_ParentSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Parent Textbox In Column Selection List of NG Grid Table On RMA Application Maintenance--> Table Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2020                                  
	//============================================================================================
	public static WebElement RMAApp_MaintTableMaintenance_Txt_ParentSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[text()='Parent']//ancestor::div[@role='columnheader']//input")); //Unique Id Of Parent Textbox In Column Selection List of NG Grid Table On RMA Application Maintenance--> Table Maintenance Page Is Fetched
		return Element;
	}
}
