package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Deposit {
	public static WebElement Element;

	//============================================================================================
	//FunctionName 			: RMAApp_Deposit_Txt_DateON
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date On Field On RMA Application Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-30-2018                                      
	//============================================================================================
	public static WebElement RMAApp_Deposit_Txt_DateON(WebDriver driver)
	{
		Element = null;
	//	Element = driver.findElement(By.xpath(".//*[@id='voidcleardate' and @type='text']")); 
		Element = driver.findElement(By.id("voidcleardate")); 
		//Unique Id Of Date On Field On RMA Application Deposit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Deposit_Btn_MultipleClearButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Multiple Clear Button On RMA Application Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-30-2018                                      
	//============================================================================================
	public static WebElement RMAApp_Deposit_Btn_MultipleClearButton(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnClearMultDeposits']/i")); //Unique Id Of Multiple Clear Button On RMA Application Deposit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Deposit_Txt_ControlNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Control Number TextBox On RMA Application Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-30-2018                                      
	//============================================================================================
	public static WebElement RMAApp_Deposit_Txt_ControlNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ctlnumber")); //Unique Id Of Control Number TextBox On RMA Application Deposit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Deposit_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account List On RMA Application Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-30-2018                                      
	//============================================================================================
	public static WebElement RMAApp_Deposit_Lst_BankAccount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("subbankaccount")); //Unique Id Of BankAccount List On RMA Application Deposit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Deposit_Txt_TransactionDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Date TextBox On RMA Application Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-30-2018                                      
	//============================================================================================
	public static WebElement RMAApp_Deposit_Txt_TransactionDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='transdate' and @type='text']")); //Unique Id Of Transaction Date TextBox On RMA Application Deposit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Deposit_Txt_Amount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount TextBox On RMA Application Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-30-2018                                      
	//============================================================================================
	public static WebElement RMAApp_Deposit_Txt_Amount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='amount' and @type='text']")); //Unique Id Of Amount TextBox On RMA Application Deposit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Deposit_Chk_Cleared
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cleared Checkbox On RMA Application Bank Account-->Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - ShrutiShruti-05-30-2018                               
	//============================================================================================
	public static WebElement RMAApp_Deposit_Chk_Cleared(WebDriver driver)
	{
		Element = driver.findElement(By.id("clearedflag")); //Unique iID Of Cleared Checkbox On RMA Application Bank Account-->Deposit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Deposit_Chk_Void
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void Checkbox On RMA Application Bank Account-->Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - ShrutiShruti-05-30-2018                               
	//============================================================================================
	public static WebElement RMAApp_Deposit_Chk_Void(WebDriver driver)
	{
		Element = driver.findElement(By.id("voidflag")); //Unique iID Of Void Checkbox On RMA Application Bank Account-->Deposit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Deposit_Btn_Description
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Description Button On RMA Application Bank Account-->Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - ShrutiShruti-05-30-2018                               
	//============================================================================================
	public static WebElement RMAApp_Deposit_Btn_Description(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='description']/div/span/button")); //Unique iID Of Description Button On RMA Application Bank Account-->Deposit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Deposit_Txt_DescriptionText
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Description TextBox On PopUp On RMA Application Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-30-2018                                      
	//============================================================================================
	public static WebElement RMAApp_Deposit_Txt_DescriptionText(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("newTextComments")); //Unique Id Of Description TextBox On PopUp On RMA Application Deposit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Deposit_Btn_DescOK
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Description OK Button On PopUp On RMA Application Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-30-2018                                      
	//============================================================================================
	public static WebElement RMAApp_Deposit_Btn_DescOK(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='usericon']/i")); //Unique Id Of Description OK Button On PopUp On RMA Application Deposit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Deposit_Txt_NumberOfDeposits
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Number Of Deposits On Bank Account Page On RMA Application Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-30-2018                                      
	//============================================================================================
	public static WebElement RMAApp_Deposit_Txt_NumberOfDeposits(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='rightPanelFormat ng-binding' and contains(text(),'Deposit')]//ancestor::a[1]/sup/span")); //Unique Id Of Deposits On Bank Account Page On RMA Application Deposit Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_DepositCleared_Btn_CheckAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check All Button On Multiple Cleared Screen On RMA Application Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-30-2018                                      
	//============================================================================================
	public static WebElement RMAApp_DepositCleared_Btn_CheckAll(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkAll")); //Unique Id Of Check All Button On Multiple Cleared Screen On RMA Application Deposit Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_DepositCleared_Btn_Clear	
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Clear Button On Multiple Cleared Screen On RMA Application Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-30-2018                                      
	//============================================================================================
	public static WebElement RMAApp_DepositCleared_Btn_Clear(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Button2']/i")); //Unique Id Of Clear Button On Multiple Cleared Screen On RMA Application Deposit Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_DepositCleared_Btn_Close	
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On Multiple Cleared Screen On RMA Application Deposit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-30-2018                                      
	//============================================================================================
	public static WebElement RMAApp_DepositCleared_Btn_Close(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='A4']/i")); //Unique Id Of Close Button On Multiple Cleared Screen On RMA Application Deposit Page Is Fetched
		return Element;
	}
}
