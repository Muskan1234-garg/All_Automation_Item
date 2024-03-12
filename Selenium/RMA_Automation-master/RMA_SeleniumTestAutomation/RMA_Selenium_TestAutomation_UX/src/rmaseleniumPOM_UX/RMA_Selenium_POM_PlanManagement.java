package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_PlanManagement {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanMngt_Txt_PlanNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Plan Number TextBox On Plan Management Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-17-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanMngt_Txt_PlanNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("plannumber")); //Unique Id Of Type Of Plan Number TextBox On Plan Management Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanMngt_Txt_PlanName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Plan Name TextBox On Plan Management Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-17-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanMngt_Txt_PlanName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("planname")); //Unique Id Of Type Of Plan Name TextBox On Plan Management Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanMngt_Txt_PlanDesc
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Plan Description TextBox On Plan Management Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-17-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanMngt_Txt_PlanDesc(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("plandesc")); //Unique Id Of Type Of Plan Description TextBox On Plan Management Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanMngt_Txt_InsuredAcc
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Insured Account TextBox On Plan Management Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-17-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanMngt_Txt_InsuredAcc(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_insuredlist")); //Unique Id Of Type Of Insured Account TextBox On Plan Management Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanMngt_Btn_InsuredAcc
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Insured Account Button On Plan Management Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-17-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanMngt_Btn_InsuredAcc(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_insuredlist")); //Unique Id Of Type Of Insured Account Button On Plan Management Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanMngt_Txt_PlanStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Plan Status TextBox On Plan Management Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-17-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanMngt_Txt_PlanStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_planstatuscode")); //Unique Id Of Type Of Plan Status TextBox On Plan Management Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanMngt_Btn_PlanStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Plan Status Button On Plan Management Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-17-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanMngt_Btn_PlanStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_planstatuscode")); //Unique Id Of Type Of Plan Status Button On Plan Management Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanMngt_Txt_Premium
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Premium TextBox On Plan Management Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-17-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanMngt_Txt_Premium(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("premium")); //Unique Id Of Type Of Premium TextBox On Plan Management Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanMngt_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Bank Account List On Plan Management Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-17-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanMngt_Lst_BankAccount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("bankaccount")); //Unique Id Of Type Of Bank Account List On Plan Management Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanMngt_Txt_EffectiveDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Effective Date TextBox On Plan Management Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-17-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanMngt_Txt_EffectiveDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='effectivedate' and @type='text']")); //Unique Id Of Type Of Effective Date TextBox On Plan Management Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanMngt_Txt_ExpirationDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Expiration Date TextBox On Plan Management Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-17-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanMngt_Txt_ExpirationDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='expirationdate' and @type='text']")); //Unique Id Of Type Of Expiration Date TextBox On Plan Management Page Is Fetched
		return Element;
	}
}
