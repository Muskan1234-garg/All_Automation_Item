package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_BankAccount {


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
	Revision				: 0.1 - AbhishekRai-02-26-2018                                    
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Img_LookUp (WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Lookup']/i")); //Unique Id  Of  LookUp Image On RMA Application Bank Account Page Is Fetched
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
		Element = driver.findElement(By.id("Check Stocks")); //Unique Id  Of  CheckStock Image On RMA Application Bank Account Page Is Fetched
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
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_banklastname' and@ type='text']"));// //Unique Id  Of  Bank Name TextBox On RMA Application Bank Account Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[@id='accountnumber' and@ type='text']")); //Unique Id  Of  Account No TextBox On RMA Application Bank Account Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[@id='accountname' and@ type='text']")); //Unique Id  Of  Account Name TextBox On RMA Application Bank Account Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[@id='lookup_accttypecode' and@ type='text']")); //Unique Id  Of  Account Type TextBox On RMA Application Bank Account Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[@id='nextchecknumber' and@ type='text']")); //Unique Id  Of Next Check Number  TextBox On RMA Application Bank Account Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[@id='bankaddr1' and@ type='text']")); //Unique Id  Of Address1 TextBox On RMA Application Bank Account Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[@id='bankcity' and@ type='text']")); //Unique Id  Of Bank City TextBox On RMA Application Bank Account Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[@id='lookup_bankstateid' and@ type='text']")); //Unique Id  Of Bank State TextBox On RMA Application Bank Account Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[@id='bankzipcode' and@ type='text']")); //Unique Id  Of Bank Zip Code TextBox On RMA Application Bank Account Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Sub Accounts')]/ancestor::div[1]/span[1]/*[@uib-tooltip='Add']")); //Unique Id  Of Sub Accounts Image On RMA Application Bank Account Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[@id='subaccountname']")); //Unique Id  Of Sub Accounts Name TextBox On RMA Application Bank Account-->SubAccount Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[@id='subaccountnumber']")); //Unique Id  Of Sub Accounts Number TextBox On RMA Application Bank Account-->SubAccount Page Is Fetched
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

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Img_BackToBankAccount
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back To Bank Account Image  On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Img_BackToBankAccount(WebDriver driver)
	{
		Element = driver.findElement(By.id("BackToParent"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Lst_BankSubBankAcc
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank/SubBank Account List On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Lst_BankSubBankAcc(WebDriver driver)
	{
		Element = driver.findElement(By.id("subbankaccount"));
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_TransactionDate
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Date TextBox On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_TransactionDate(WebDriver driver)
	{
		Element = driver.findElement(By.id("transdate"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_TransactionAmount
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Amount TextBox On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_TransactionAmount(WebDriver driver)
	{
		Element = driver.findElement(By.id("amount"));
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_ControlNumber
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Control Number TextBox On RMA Application Bank Account-->Account owner-->ServideCodesLookup Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-28-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_ControlNumber(WebDriver driver)
	{
		Element = driver.findElement(By.id("ctlnumber"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_CheckStocksStockName
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Stock Name On RMA Application Bank Account-->Check Stocks Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_CheckStocksStockName(WebDriver driver)
	{
		Element = driver.findElement(By.id("txt_lm"));
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Lst_CheckStocksFontName
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Font Name List On RMA Application Bank Account-->Check Stocks Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Lst_CheckStocksFontName(WebDriver driver)
	{
		Element = driver.findElement(By.id("Select6"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Lst_CheckStocksFontSize
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Font Size List On RMA Application Bank Account-->Check Stocks Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Lst_CheckStocksFontSize(WebDriver driver)
	{
		//Element = driver.findElement(By.id("FontSize"));
		Element = driver.findElement(By.xpath(".//*[@id='lbl_fontsize']//following-sibling::div//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Btn_BackToBankAccount
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back To Bank Account Button On RMA Application Bank Account-->Check Stocks Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Btn_BackToBankAccount(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnBankAccounts"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Lst_CheckStocksCloneCSelectBankAccountFromList
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Bank Account From List List  On RMA Application Bank Account-->Check Stocks Page--> Check Stocks Clone Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Lst_CheckStocksCloneCSelectBankAccountFromList(WebDriver driver)
	{
		Element = driver.findElement(By.id("List"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Lst_CheckStock
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CheckStock List On RMA Application Sub Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - Nidhijha-10-06-2017                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Lst_CheckStock (WebDriver driver)
	{
		Element = driver.findElement(By.id("checkstock")); //Unique Id  Of  CheckStock Image On RMA Application Sub Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Lst_MasterBankAcc
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Master Bank Account List On RMA Application Bank Account  Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Lst_MasterBankAcc(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.id("masterbankacc")); //Unique Id Of Error Toast Message On RMA Application Page Is Fetched
		}catch (Exception|Error e){	 
		}
		System.out.println( "element"+ Element);
		return Element;

	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_BankAccountLookupdata_Tbl
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table On RMA Application Generic Lookup Data Table UI Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-03-10-2017                                 
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_BankAccountLookupdata_Tbl(WebDriver driver)
	{
		Element = driver.findElement(By.id("grdLookUp")); //Unique Id Of Table On RMA Application Duplicate Claim UX Window Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Btn_CheckStocksClone
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Clone Button  On RMA Application Bank Account-->Check Stocks Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Btn_CheckStocksClone(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnClone"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Btn_CheckStocksCloneCreate
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Create Button  On RMA Application Bank Account-->Check Stocks Page--> Check Stocks Clone Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Btn_CheckStocksCloneCreate(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnCreate"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_RdBtn_CheckStocksCloneCSelectBankAccountFromList
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Bank Account From List Radio Button  On RMA Application Bank Account-->Check Stocks Page--> Check Stocks Clone Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_RdBtn_CheckStocksCloneCSelectBankAccountFromList(WebDriver driver)
	{
		Element = driver.findElement(By.id("SelectBankAccountFromList"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Lst_DefaultExpansionLevelForList
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Default Expansion Level For List List On RMA Application Bank Account  Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Lst_DefaultExpansionLevelForList(WebDriver driver)
	{
		Element = driver.findElement(By.id("OT_cmb_dlevel"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_RdBtn_GeneralClaim
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which General Claim Radio Button On RMA Application Bank Account-->Account owner Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_RdBtn_GeneralClaim(WebDriver driver)
	{
		Element = driver.findElement(By.id("OWNER_LOB2"));
		return Element;
	}


	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_RdBtn_WCClaim
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Workers Compensation Claim Radio Button On RMA Application Bank Account-->Account owner Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_RdBtn_WCClaim(WebDriver driver)
	{
		Element = driver.findElement(By.id("OWNER_LOB4"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_RdBtn_VehicleAccidentClaim
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vehicle Claim Radio Button On RMA Application Bank Account-->Account owner Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_RdBtn_VehicleAccidentClaim(WebDriver driver)
	{
		Element = driver.findElement(By.id("OWNER_LOB3"));
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Btn_ServiceCodesLookup
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Service Codes Lookup Button On RMA Application Bank Account-->Account owner Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-24-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Btn_ServiceCodesLookup(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_servicecodelist']"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Chk_CodeSelInHouseMgmt
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which In House Managment CheckBox On RMA Application Bank Account-->Account owner-->ServideCodesLookup Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-24-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Chk_CodeSelInHouseMgmt(WebDriver driver)
	{
		Element = driver.findElement(By.id("dgCodes_chkId_0"));
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Btn_CodeSelInHouseMgmtOk
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ok Button  On RMA Application Bank Account-->Account owner-->ServideCodesLookup Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-24-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Btn_CodeSelInHouseMgmtOk(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnOk"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_RdBtn_All
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which All Radio Button On RMA Application Bank Account-->Account owner Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-25-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_RdBtn_All(WebDriver driver)
	{
		Element = driver.findElement(By.id("OWNER_LOB1"));
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Lst_EffectiveDateTrigger
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Effective Date Trigger List On RMA Application Bank Account-->Account owner-->ServideCodesLookup Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-28-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Lst_EffectiveDateTrigger(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@name='triggerdate']"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_EffectiveStartDate
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Effective Start Date TextBox On RMA Application Bank Account-->Account owner-->ServideCodesLookup Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-28-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_EffectiveStartDate(WebDriver driver)
	{
		Element = driver.findElement(By.id("startdate"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_EffectiveEndDate
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Effective End Date TextBox On RMA Application Bank Account-->Account owner-->ServideCodesLookup Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-28-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_EffectiveEndDate(WebDriver driver)
	{
		Element = driver.findElement(By.id("enddate"));
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Deposit_Chk_Cleared
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cleared Checkbox On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - AnubhutiVyas-12-07-2017                               
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Deposit_Chk_Cleared(WebDriver driver)
	{
		Element = driver.findElement(By.id("clearedflag")); //Unique iID Of Cleared Checkbox On RMA Application Bank Account-->Deposit Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Deposit_Btn_Description
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Description Memo Button On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - AnubhutiVyas-12-06-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Deposit_Btn_Description(WebDriver driver)
	{
		Element = driver.findElement(By.id("descriptionbtnMemo"));
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Deposit_Txt_Memo
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Memo Editor On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - AnubhutiVyas-12-06-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Deposit_Txt_Memo(WebDriver driver)
	{
		Element = driver.findElement(By.id("txtMemo"));
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Deposit_Description_Btn_Ok
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ok Button On Memo Editor On RMA Application Bank Account-->Deposit-->Description Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - AnubhutiVyas-12-06-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Deposit_Description_Btn_Ok(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnOK"));
		return Element;
	}	
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Deposit_Chk_Void
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void Checkbox On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - AnubhutiVyas-12-07-2017                               
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Deposit_Chk_Void(WebDriver driver)
	{
		Element = driver.findElement(By.id("voidflag")); //Unique iID Of Void Checkbox On RMA Application Bank Account-->Deposit Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_AccBalance_Btn_LoadPriorStatementDate
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Load Prior Statement Date Button On RMA Application Bank Account-->Account Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - AnubhutiVyas-12-19-2017                               
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_AccBalance_Btn_LoadPriorStatementDate(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnLoadPriorStatementDate"));
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_AccBalance_Txt_BalPerBankStatement
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance Per Bank Statement Textbox On RMA Application Bank Account-->Account Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - AnubhutiVyas-12-19-2017                               
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_AccBalance_Txt_BalPerBankStatement(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='frmData']/div[3]/table/tbody/tr[4]/td[2]/input")); //Unique iID Of Balance Per Bank Statement Textbox On RMA Application Bank Account-->Account Balance Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_AccBalance_Btn_Close
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On RMA Application Bank Account-->Account Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - AnubhutiVyas-12-20-2017                               
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_AccBalance_Btn_Close(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnClose"));
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Balance_Txt_StatementBeginDate
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Statement Begin Date Textbox On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - AnubhutiVyas-12-19-2017                               
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Balance_Txt_StatementBeginDate(WebDriver driver)
	{
		Element = driver.findElement(By.id("txtBeginDate")); //Unique iID Of Statement Begin Date Textbox On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Balance_Txt_StatementEndDate
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Statement End Date Textbox On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - AnubhutiVyas-12-19-2017                               
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Balance_Txt_StatementEndDate(WebDriver driver)
	{
		Element = driver.findElement(By.id("txtEndDate")); //Unique iID Of Statement End Date  Textbox On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Balance_Txt_StatementBalance
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Statement Balance Textbox On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - AnubhutiVyas-12-19-2017                               
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Balance_Txt_StatementBalance(WebDriver driver)
	{
		Element = driver.findElement(By.id("txtBalance")); //Unique iID Of Statement Balance Textbox On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Balance_Btn_SaveClose
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save & Close Button On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - AnubhutiVyas-12-19-2017                               
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Balance_Btn_SaveClose(WebDriver driver)
	{
		Element = driver.findElement(By.id("Submit2")); //Unique iID Of Save & Close Button On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_RdBtn_ShortTermDisability
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Short Term Disability Radio Button On RMA Application Bank Account-->Account owner Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - NidhiJha-08-16-2017                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_RdBtn_ShortTermDisability(WebDriver driver)
	{
		Element = driver.findElement(By.id("OWNER_LOB5"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tab_ClaimInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which General Info Tab On RMA Application Bank Account Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-23-2018                                  
	//============================================================================================
	public static WebElement RMAApp_BankAccount_Tab_GeneralInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'General Information ')]/i"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankAccount_Tab_AccountOwner
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Account Owner Tab On RMA Application Bank Account Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-23-2018                                  
	//============================================================================================
	public static WebElement RMAApp_BankAccount_Tab_AccountOwner(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Account Owner')]/i")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankAccount_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplementals Tab On RMA Application Bank Account Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-23-2018                                  
	//============================================================================================
	public static WebElement RMAApp_BankAccount_Tab_Supplementals(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i"));
		return Element;
	}		

	//============================================================================================
	//FunctionName 			: RMAApp_BankAccountTbl_Txt_BankAccountNGGrid_FilterTextBox
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of Bank Account NG Grid Table (Containing Search Text Boxes) On RMA Application Bank Account Window Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - AbhishekRai-02-26-2018                                
	//============================================================================================
	public static WebElement RMAApp_BankAccountTbl_Txt_BankAccountNGGrid_FilterTextBox(WebDriver driver, String FilterBoxName)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[text()='"+FilterBoxName+"']/following::input[@class='ui-grid-filter-input ui-grid-filter-input-0'][1]")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	
}
