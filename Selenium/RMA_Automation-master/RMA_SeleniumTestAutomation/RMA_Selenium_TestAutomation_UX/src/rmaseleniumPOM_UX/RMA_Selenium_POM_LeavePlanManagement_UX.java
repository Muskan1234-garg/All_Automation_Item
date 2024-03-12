package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_LeavePlanManagement_UX {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_PlanCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Code TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2018                               
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_PlanCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("plancode")); //Unique Id  Of  Plan Code TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_PlanName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Name TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_PlanName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("planname")); //Unique Id  Of  Plan Name TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_EffectiveDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Effective Date TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_EffectiveDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='effectivedate' and @type='text']")); //Unique Id  Of Effective Date TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_ExpirationDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Expiration Date TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_ExpirationDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='expirationdate' and @type='text']")); //Unique Id  Of Expiration Date TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_DefaultHours
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Default Hours Per Week TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_DefaultHours(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("defaulthours")); //Unique Id  Of Default Hours Per Week TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_PlanStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Status TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_PlanStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_planstatus")); //Unique Id  Of Plan Status TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Btn_PlanStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Status Image Lookup Button On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Btn_PlanStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_planstatus_openlookup")); //Unique Id  Of Plan Status Image Lookup Button On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_PlanDescription
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Description TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_PlanDescription(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("plandesc")); //Unique Id  Of Plan Description TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_PlanType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Type TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_PlanType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_plantypecode")); //Unique Id  Of Plan Type TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Btn_PlanType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Type Button On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Btn_PlanType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_plantypecode_openlookup")); //Unique Id  Of Plan Type Button On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Flg_DefaultPlan
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Default Plan CheckBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Flg_DefaultPlan(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("defaultplan")); //Unique Id  Of Default Plan CheckBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_LeaveAvailable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Leave Plan Available To TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_LeaveAvailable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_insuredlist")); //Unique Id  Of Leave Plan Available To TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Btn_LeaveAvailable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Leave Plan Available To Button On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Btn_LeaveAvailable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_insuredlist")); //Unique Id  Of Leave Plan Available To Button On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}
}
