package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Config_Manager_GSP {
	public static WebElement Element = null;
	public static WebElement Element2 = null;

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GSP_Chk_Auto_Populate_Claim_Date_Reported
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Auto Populate Claim Date Reported Checkbox Will Be Identified On GSP System Setting Tab Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-11-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Config_GSP_Chk_Auto_Populate_Claim_Date_Reported(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='mat-form-field-infix']//descendant::mat-select[@aria-labelledby='lbl_rbAutoAssignClaimReported']")); //Unique Id Of Auto Populate Claim Date Reported Checkbox Will Be Identified On GSP System Setting Tab Screen Page Can Be Fetched		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GSP_Chk_Auto_Populate_Claim_Date_Reported
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Auto Populate Claim Date Reported Checkbox Will Be Identified On GSP System Setting Tab Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-11-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Config_GSP_Chk_Auto_Populate_Claim_Date_Reported_Text(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='mat-form-field-infix']//descendant::mat-select[@aria-labelledby='lbl_rbAutoAssignClaimReported']")); //Unique Id Of Auto Populate Claim Date Reported Checkbox Will Be Identified On GSP System Setting Tab Screen Page Can Be Fetched			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GSP_Quality_Management_For_Events
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Quality_Management Checkbox Will Be Identified On GSP Event Setting Tab Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-11-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_GSP_Quality_Management_For_Events(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='useQualityMgt-input']")); //Unique Id Of Quality_Management Checkbox Will Be Identified On GSP Event Setting Tab Screen Page Can Be Identified
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GSP_CodeList_Number
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which CodeList Textbox Will Be Identified On GSP's Page Limit Section Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-11-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_GSP_CodeList_Number(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.name("cl_codeList")); //CodeList Textbox Will Be Identified On GSP's Page Limit Section Can Be Identified
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Claim_Page_Size
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which No Of Records On Claim Screen Lookup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-11-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Claim_Page_Size(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='ui-grid-pager-container']//following::span[@class='ui-grid-pager-row-count-label ng-binding ng-scope']")); //Unique Id Of No Of Records On Claim Screen Lookup Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Claim_Total_Item
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Total No Of Records On Claim Screen Lookup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-11-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Claim_Total_Item(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='ui-grid-pager-count']//abbr")); //Unique Id Of Total No Of Records On Claim Screen Lookup Can Be Identified
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Claim_Total_Count
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Total Count On Claim Screen Lookup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-11-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Claim_Total_Count(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='ui-grid-contents-wrapper']//div[@class='ui-grid-viewport ng-isolate-scope']//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-000A']")); //Unique Id Of Total Count On Claim Screen Lookup Can Be Identified
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GSP_SystemSettings_PageLimit_SubSection
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Page Limit Section Of System Settings Tab Of General System Parameter Page Will Be Identified On GSP System Setting Tab Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-11-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_GSP_SystemSettings_PageLimit_SubSection(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("pagelimit")); //Unique Id Of Page Limit Section Of System Settings Tab Of General System Parameter Page Will Be Identified On GSP System Setting Tab Screen Page Can Be Identified
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GSP_SystemSettings_Event_SubSection
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Event Section Of System Settings Tab Of General System Parameter Page Will Be Identified On GSP System Setting Tab Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-11-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_GSP_SystemSettings_Event_SubSection(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("eventsetting")); //Unique Id Of Event Section Of System Settings Tab Of General System Parameter Page Will Be Identified On GSP System Setting Tab Screen Page Can Be Identified					
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GSP_SearchList_Number
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Number Of Records Present In Search List Will Be Identified On Search Result Screen
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-18-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_GSP_SearchList_Number(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.name("cl_resultLkpUp")); //Unique Id Of Number Of Records Present In Search List Will Be Identified On Search Result Screen
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName           : RMAApp_Config_GSP_Chk_count1
	//Description            : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Actual Number Of Records Present On Lookup Window Is Identified
	//Input Parameter        : Driver Variable Of The Type WebDriver                
	//Revision               : 0.0 - ParulSharma-08-18-2020                                            
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Config_GSP_Chk_count1(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='ui-grid-pager-count']")); //Unique Id Of Actual Number Of Records Present On Lookup Window Is Identified
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName           : RMAApp_Config_Manager_GSP_Dropdown_Window
	//Description            : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dropdown Of Select Field Can Be Identified On Configuration Manager
	//Input Parameter        : Driver Variable Of The Type WebDriver                
	//Revision               : 0.0 - ParulSharma-08-18-2020                                            
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Config_Manager_GSP_Dropdown_Window(WebDriver driver, String text)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='cdk-overlay-pane']//*[contains(text(),'"+text+"')]")); //Unique Id Of Drop Down Window On GSP System Setting Tab Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName           : RMAApp_Config_Manager_GSP_Dropdown_Window_Selected_Record
	//Description            : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Value Of Dropdown Of Select Field Can Be Identified On Configuration Manager
	//Input Parameter        : Driver Variable Of The Type WebDriver                
	//Revision               : 0.0 - ParulSharma-08-18-2020                                            
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Config_Manager_GSP_Dropdown_Window_Selected_Record(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='cdk-overlay-pane']//descendant::mat-option[@aria-selected='true']")); //Unique Id Of Drop Down Window On GSP System Setting Tab Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AutonumberVehicleID
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Autonumber Vehicle ID CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2018 
	//Modified				: 0.0 -ParulSharma-08-18-2020      
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AutonumberVehicleID(WebDriver driver)
	{
		Element = driver.findElement( By.xpath(".//*[@id='autoNumberVeh-input']"));//Unique Id Of Autonumber Vehicle ID CheckBox On GSP System Setting Tab Page Is Fetched
		return Element;
	}

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GSP_Radio_Populate_Claim_Date_Reported_with_Date_of_Claim
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Auto Populate Claim Date Reported Checkbox Will Be Identified On GSP System Setting Tab Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-11-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Claim_Claim_Date_Rptd(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='lbl_dateRptdToRm']/following-sibling::zc-field-date-picker//input"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

}
