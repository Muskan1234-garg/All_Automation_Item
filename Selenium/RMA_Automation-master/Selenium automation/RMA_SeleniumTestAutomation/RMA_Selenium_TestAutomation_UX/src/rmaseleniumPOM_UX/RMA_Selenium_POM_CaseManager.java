package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_CaseManager {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Txt_CaseManager
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Case Manager TextBox On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Txt_CaseManager(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_casemanagerlist']")); //Unique Id  Of  Case Manager TextBox On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Btn_ReferralType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Referral Type Lookup Button On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Btn_Referraltype(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_reftype']")); //Unique Id  Of  Referral Type Lookup Button On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Txt_ReferralType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Referral Type TextBox On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Txt_ReferralType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_reftype']")); //Unique Id  Of  Referral Type TextBox On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Txt_ReferralDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Referral Date TextBox On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Txt_ReferralDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='referraldate' and @type='text']")); //Unique Id  Of  Referral Date TextBox On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Txt_ReferredTo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Referred To TextBox On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Txt_ReferredTo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_referredto']")); //Unique Id  Of  Referred To TextBox On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Btn_ReferralReason
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Referral Reason Lookup Button On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Btn_ReferralReason(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_refreasoncode']")); //Unique Id  Of  Referral Reason Lookup Button On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Txt_ReferralReason
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Referral Reason TextBox On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Txt_ReferralReason(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_refreasoncode']")); //Unique Id  Of  Referral Reason TextBox On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Btn_CaseStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Case Status Lookup button On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Btn_CaseStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_casestatustype']")); //Unique Id  Of  Case Status Lookup button On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Txt_CaseStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Case Status TextBox On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Txt_CaseStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_casestatustype']")); //Unique Id  Of  Case Status TextBox On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Txt_DateClosed
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Closed TextBox On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Txt_DateClosed(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='dateclosed' and @type='text']")); //Unique Id  Of Date Closed TextBox On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Txt_URDueDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UR Due Date TextBox On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Txt_URDueDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='duedate' and @type='text']")); //Unique Id  Of UR Due Date TextBox On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Btn_PrimaryCaseManager
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Primary Case Manager CheckBox On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Btn_PrimaryCaseManager(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='primarycmgrflag']")); //Unique Id  Of Primary Case Manager CheckBox On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}
}
