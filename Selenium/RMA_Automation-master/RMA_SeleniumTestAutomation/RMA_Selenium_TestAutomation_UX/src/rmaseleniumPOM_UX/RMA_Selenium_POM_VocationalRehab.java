package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_VocationalRehab {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_VocationalRehab_Btn_RehabilitationType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Rehabilitation Type Lookup button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_RehabilitationType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_rehabtype_openlookup']")); //Unique Id  Of  Rehabilitation Type Lookup Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_RehabilitationType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Rehabilitation Type TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_RehabilitationType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_rehabtype']")); //Unique Id  Of  Rehabilitation Type TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_RehabilitationStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Rehabilitation Status Lookup Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_RehabilitationStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_rehabstatus_openlookup']")); //Unique Id  Of  Rehabilitation Status Lookup Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_RehabilitationStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Rehabilitation Status TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_RehabilitationStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_rehabstatus']")); //Unique Id  Of  Rehabilitation Status TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_OccupationProposed
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Occupation Proposed TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_OccupationProposed(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='occproposed']")); //Unique Id  Of Occupation Proposed TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_Outcomes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Outcomes Lookup Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_Outcomes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_outcomes_openlookup']")); //Unique Id  Of Outcomes Lookup Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_Outcomes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Outcomes TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_Outcomes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_outcomes']")); //Unique Id  Of Outcomes TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_StartDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which StartDate TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_StartDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='startdate' and @type='text']")); //Unique Id  Of StartDate TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_EndDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EndDate TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_EndDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='enddate' and @type='text']")); //Unique Id  Of EndDate TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_EstimatedCost
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Estimated Cost TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_EstimatedCost(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='estcostofplan']")); //Unique Id  Of Estimated Cost TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_ActualCost
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Actual Cost TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_ActualCost(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='actcostofplan']")); //Unique Id  Of Actual Cost TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}
}
