package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_POM_BankAccount {


	public static WebElement Element = null;


	//============================================================================================
	//FunctionName 			: RMAApp_BankAccount_Frm_SwitchFrame
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account Frame On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-12-03-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_BankAccount_Frm_SwitchFrame(WebDriver driver)
	{
		Element = driver.findElement(By.id("Funds-1bankaccountBank AccountUI/FDM/?recordID=(NODERECORDID)Bank AccountFalseFalse")); //Unique Id  Of  Bank Account Frame On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankAccount_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-12-03-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_BankAccount_Img_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("save")); //Unique Id  Of  Save Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}


	/*============================================================================================
		FunctionName 			: RMAApp_BankAccount_Img_Delete
		Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Image On RMA Application Bank Account Page Can Be Identified
		Input Parameter 		: Driver Variable Of The Type WebDriver		 
		Revision				: 0.0 - ImteyazAhmad-12-03-2015                                 
		 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Img_Delete (WebDriver driver)
	{
		Element = driver.findElement(By.id("delete")); //Unique Id  Of  Delete Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}



	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Img_LookUp
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LookUp Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ImteyazAhmad-12-03-2015                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Img_LookUp (WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup")); //Unique Id  Of  LookUp Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Img_RecordSummary
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which RecordSummary Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ImteyazAhmad-12-03-2015                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Img_RecordSummary (WebDriver driver)
	{
		Element = driver.findElement(By.id("recordsummary")); //Unique Id  Of  RecordSummary Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Img_CheckStock
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CheckStock Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ImteyazAhmad-12-03-2015                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Img_CheckStock (WebDriver driver)
	{
		Element = driver.findElement(By.id("btnCheckStocks")); //Unique Id  Of  CheckStock Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Img_Balance
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ImteyazAhmad-12-03-2015                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Img_Balance (WebDriver driver)
	{
		Element = driver.findElement(By.id("btnBalance")); //Unique Id  Of  Balance Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Img_AccountBalance
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AccountBalance Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ImteyazAhmad-12-03-2015                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Img_AccountBalance (WebDriver driver)
	{
		Element = driver.findElement(By.id("btnAccountBalance")); //Unique Id  Of  AccountBalance Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Img_Deposit
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Deposit Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ImteyazAhmad-12-03-2015                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Img_Deposit (WebDriver driver)
	{
		Element = driver.findElement(By.id("btnDeposit")); //Unique Id  Of  Deposit Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_Owner
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Owner TextBox On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-10-10-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_Owner (WebDriver driver)
	{
		Element = driver.findElement(By.id("ownereid")); //Unique Id  Of  Owner TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Btn_Owner
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Owner Button On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-10-10-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Btn_Owner (WebDriver driver)
	{
		Element = driver.findElement(By.id("ownereidbtn")); //Unique Id  Of  Owner TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_BankName
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Name TextBox On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-10-17-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_BankName(WebDriver driver)
	{
		Element = driver.findElement(By.id("banklastname")); //Unique Id  Of  Bank Name TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_BankAccNo
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Account No TextBox On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-10-17-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_BankAccNo(WebDriver driver)
	{
		Element = driver.findElement(By.id("accountnumber")); //Unique Id  Of  Account No TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_AccountName
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Account Name TextBox On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-10-17-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_AccountName(WebDriver driver)
	{
		Element = driver.findElement(By.id("accountname")); //Unique Id  Of  Account Name TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_AccountType
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Account Type TextBox On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-10-17-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_AccountType(WebDriver driver)
	{
		Element = driver.findElement(By.id("accttypecode_codelookup")); //Unique Id  Of  Account Type TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_NextCheckNumber
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Check Number TextBox On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-10-17-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_NextCheckNumber(WebDriver driver)
	{
		Element = driver.findElement(By.id("nextchecknumber")); //Unique Id  Of Next Check Number  TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_Adderss1
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address1 TextBox On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-10-17-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_Adderss1(WebDriver driver)
	{
		Element = driver.findElement(By.id("bankaddr1")); //Unique Id  Of Address1 TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_BankCity
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank City TextBox On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-10-17-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_BankCity(WebDriver driver)
	{
		Element = driver.findElement(By.id("bankcity")); //Unique Id  Of Bank City TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_BankState
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank State TextBox On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-10-17-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_BankState(WebDriver driver)
	{
		Element = driver.findElement(By.id("bankstateid_codelookup")); //Unique Id  Of Bank State TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_BankState
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Zip Code TextBox On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-10-17-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_BankZipCode(WebDriver driver)
	{
		Element = driver.findElement(By.id("bankzipcode")); //Unique Id  Of Bank Zip Code TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Img_SubAccounts
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sub Accounts Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-11-04-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Img_SubAccounts(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnSubAccounts")); //Unique Id  Of Sub Accounts Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_SubAccountName
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Sub Accounts Name TextBox On RMA Application Bank Account-->SubAccount Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-11-04-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_SubAccountName(WebDriver driver)
	{
		Element = driver.findElement(By.id("subaccountname")); //Unique Id  Of Sub Accounts Name TextBox On RMA Application Bank Account-->SubAccount Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_SubAccountNumber
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Sub Accounts Number TextBox On RMA Application Bank Account-->SubAccount Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-11-04-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_SubAccountNumber(WebDriver driver)
	{
		Element = driver.findElement(By.id("subaccountnumber")); //Unique Id  Of Sub Accounts Number TextBox On RMA Application Bank Account-->SubAccount Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_SubAccountMinBalance
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Minimum Balance TextBox On RMA Application Bank Account-->SubAccount Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-11-04-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_SubAccountMinBalance(WebDriver driver)
	{
		Element = driver.findElement(By.id("minbalance")); //Unique Id  Of Minimum Balance TextBox On RMA Application Bank Account-->SubAccount Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_SubAccountTargetBal
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Target Balance TextBox On RMA Application Bank Account-->SubAccount Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-11-04-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_SubAccountTargetBal(WebDriver driver)
	{
		Element = driver.findElement(By.id("targetbalance")); //Unique Id  Of Target Balance TextBox On RMA Application Bank Account-->SubAccount Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Chk_SubAccountLOB
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LOB Checkbox On RMA Application Bank Account-->SubAccount Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-11-04-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Chk_SubAccountLOB(WebDriver driver, String LOBType)
	{
		Element = driver.findElement(By.xpath(".//*[contains(@id,'OWNER_LOB')]/following::*[text()='"+LOBType+"']")); //Unique xpath  LOB Checkbox On RMA Application Bank Account-->SubAccount Page Is Fetched
		return Element;
	}
	
}
