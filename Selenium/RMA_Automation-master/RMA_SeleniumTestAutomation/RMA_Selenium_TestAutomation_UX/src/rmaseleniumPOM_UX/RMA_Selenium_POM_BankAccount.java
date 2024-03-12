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
	//FunctionName 			: RMAApp_BankAccount_Alignment_Options
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Alignment Option On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannathhussain-28-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ChkStock_Alignment(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Alignment Options')]")); //Unique Id  Of  Alignment Option On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	/*============================================================================================
			FunctionName 			: RMAApp_BankAccount_Check_Number_Chk
			Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Number Check Box On RMA Application Bank Account Page Can Be Identified
			Input Parameter 		: Driver Variable Of The Type WebDriver		 
			Revision				: 0.0 - JannathHussain-06-28-2018                                
			 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_CheckNumber_chk(WebDriver driver)
	{
		Element = driver.findElement(By.xpath("//input[@id='Checkbox14']")); //Unique Id  Of  Check Number Check Box On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	/*============================================================================================
			FunctionName 			: RMAApp_BankAccount_Print_Button
			Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print_Button On RMA Application Bank Account Page Can Be Identified
			Input Parameter 		: Driver Variable Of The Type WebDriver		 
			Revision				: 0.0 - JannathHussain-06-28-2018                                
			 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Print_Button(WebDriver driver)
	{
		Element = driver.findElement(By.xpath("//i[@id='btn_print']")); //Unique Id  Of  Print_Button On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_BankAccount_Restore_Default
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which RestoreDefault Option On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannathhussain-28-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ChkStock_Restore(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_RestoreDefault")); //Unique Id  Of  RestoreDefault Option On RMA Application Bank Account Page Is Fetched
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
	//============================================================================================
	//FunctionName 			: RMAApp_BankAccount_Advanced_Options
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Advanced_Options On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannathhussain-28-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ChkStock_Advanced_Options(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Advanced Options')]")); //Unique Id  Of  Advanced_Options On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_BankAccount_Okbtn
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which RestoreDefault Option On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannathhussain-28-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ChkStock_OKbtn(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btnRoll' and @uib-tooltip='Ok']/i")); //Unique Id  Of  Ok Button From Popup On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Department
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Department On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - Jannathhussain-05-03-2018                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Department(WebDriver driver,String Department)
	{
		Element = driver.findElement(By.partialLinkText(Department)); //Unique Id  Of Department On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_NumberLink
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Bank Account Number Link On RMA Application Sub Bank Account Screen Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - Jannathhussain-06-27-2018                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_NumberLink(WebDriver driver,String Accountnumber)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Accountnumber+"')]")); //Unique Id  Of  Bank Account Number Link On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_OKBtn
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Bank Account OK Button On RMA Application Sub Bank Account Screen Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - Jannathhussain-06-27-2018                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_OKBtn(WebDriver driver)
	{
		Element = driver.findElement(By.xpath("//i[contains(text(),'done')]")); //Unique Id  Of  OK Button On RMA Application Bank Account Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Sub Accounts')]/ancestor::div[1]/*[@uib-tooltip='Add']")); //Unique Id  Of Sub Accounts Image On RMA Application Bank Account Page Is Fetched
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

	/*============================================================================================
	FunctionName 			: RMAApp_Deposit_Lst_SubBankAccount
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sub Bank Account List On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-15-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_Deposit_Lst_SubBankAccount(WebDriver driver)
	{
		Element = driver.findElement(By.id("subbankaccount")); //Unique iID Of Sub Bank Account List On RMA Application Bank Account-->Deposit Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_Deposit_Txt_TransactionDate
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Date TextBox On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-15-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_Deposit_Txt_TransactionDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='transdate' and @type='text']")); //Unique iID Of Transaction Date TextBox On RMA Application Bank Account-->Deposit Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_Deposit_Txt_Amount
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount TextBox On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-15-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_Deposit_Txt_Amount(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='amount' and @type='text']")); //Unique iID Of Amount TextBox On RMA Application Bank Account-->Deposit Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_Deposit_Txt_LookupAccNumber
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Account Number on Lookup TextBox On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-15-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_Deposit_Txt_LookupAccNumber(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-filter-input ui-grid-filter-input-0']")); //Unique iID Of Account Number on Lookup TextBox On RMA Application Bank Account-->Deposit Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_Deposit_Btn_Description
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Description Button On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-15-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_Deposit_Btn_Description(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='description']/div/span/button")); //Unique iID Of Description Button On RMA Application Bank Account-->Deposit Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_Deposit_Txt_DescriptionText
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Description TextArea On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-15-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_Deposit_Txt_DescriptionText(WebDriver driver)
	{
		Element = driver.findElement(By.id("newTextComments")); //Unique iID Of Description TextArea On RMA Application Bank Account-->Deposit Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_Deposit_Btn_DescriptionOK
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Description OK Button On RMA Application Bank Account-->Deposit Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-15-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_Deposit_Btn_DescriptionOK(WebDriver driver)
	{
		Element = driver.findElement(By.id("usericon")); //Unique iID Of Description OK Button On RMA Application Bank Account-->Deposit Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Btn_Balance
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ShrutiShruti-05-18-2018                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Btn_Balance (WebDriver driver)
	{
		Element = driver.findElement(By.id("Balance")); //Unique Id  Of  Balance Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_Balance_Txt_StatementBeginDate
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Statement Begin Date TextBox On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-18-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_Balance_Txt_StatementBeginDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='start_txtDate' and @type='text']")); //Unique iID Of Statement Begin Date TextBox On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_Balance_Txt_StatementEndDate
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Statement End Date TextBox On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-18-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_Balance_Txt_StatementEndDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='end_txtDate' and @type='text']")); //Unique iID Of Statement End Date TextBox On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_AccountBalance_Txt_Balance
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance TextBox On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-18-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_AccountBalance_Txt_Balance(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='Rmacurrencycontrol1' and @type='text']")); //Unique iID Of Balance TextBox On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Btn_SaveClose
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ShrutiShruti-05-18-2018                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Btn_SaveClose(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='A2']/i")); //Unique Id  Of  Balance Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Btn_Cancel
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ShrutiShruti-05-18-2018                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Btn_Cancel(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='A4']/i")); //Unique Id  Of  Balance Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Btn_AccBalance
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ShrutiShruti-05-18-2018                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Btn_AccBalance(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='Account Balance']/i")); //Unique Id  Of  Balance Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccountBalance_Btn_Search
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ShrutiShruti-05-18-2018                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccountBalance_Btn_Search(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='A1']/i")); //Unique Id  Of  Balance Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccountBalance_Lnk_BeginDate
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance Image On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ShrutiShruti-05-18-2018                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccountBalance_Lnk_BeginDate(WebDriver driver, String Date)
	{
		Element = driver.findElement(By.xpath(".//*[@style='text-decoration: underline;cursor:pointer' and contains(text(),'"+Date+"')]")); //Unique Id  Of  Balance Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_Balance_Txt_Balance
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance TextBox On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-18-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_Balance_Txt_Balance(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='Rmacurrencycontrol1' and @type='text']")); //Unique iID Of Balance TextBox On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Lst_MasterBankAcc
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Master Bank Account List On RMA Application Bank Account  Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - Jannathhussain-05-15-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Lst_MasterBankAcc1(WebDriver driver)
	{

		Element = driver.findElement(By.id("masterbankacc")); //Unique Id Of Error Toast Message On RMA Application Page Is Fetched

		return Element;

	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Btn_CheckStocksCloneCreate
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Create Button  On RMA Application Bank Account-->Check Stocks Page--> Check Stocks Clone Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - Jannathhussain-05-02-2018                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Btn_CheckStocksCloneCreateUX(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='A2']/i"));
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Btn_CheckStocksClone
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Clone Button  On RMA Application Bank Account-->Check Stocks Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - Jannathhussain-05-02-2018                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Btn_CheckStocksCloneUX(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_clone"));
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_Txt_Adderss2
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address2 TextBox On RMA Application Bank Account Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - Jannathhussain-05-03-2018                                
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_Adderss2(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='bankaddr2' and@ type='text']")); //Unique Id  Of Address1 TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_BankAccount_Txt_BankAccountNumber_FilterTextBox
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of Bank Account NG Grid Table (Containing Search Text Boxes) On RMA Application Bank Account Window Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - Jannathhussain-04-24-2018                                
	//============================================================================================
	public static WebElement RMAApp_BankAccount_Txt_BankAccountNumber_FilterTextBox(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath("//input[@class='ui-grid-filter-input ui-grid-filter-input-0']")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_BankAccount_CheckStock_Dropdown
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CheckStock Drop Down On RMA Application Sub Bank Account Screen Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - Jannathhussain-05-08-2018                                 
	 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_CheckStock(WebDriver driver)
	{
		Element = driver.findElement(By.id("checkstock")); //Unique Id  Of  CheckStock Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankAccount_Link_BankAccountNumber_FromLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AccountNumber Link From Lookup On RMA Application Bank Account Window Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - Jannathhussain-04-26-2018                                
	//============================================================================================
	public static WebElement RMAApp_BankAccount_Link_BankAccountNumber_FromLookup(WebDriver driver,String BankNumber)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+BankNumber+"')]")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	/*============================================================================================
		FunctionName 			: RMAApp_BankAccount_Txt_Owner
		Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Owner TextBox On RMA Application Bank Account Page Can Be Identified
		Input Parameter 		: Driver Variable Of The Type WebDriver		 
		Revision				: 0.0 - JannathHussain-05-16-2018                                
		 ============================================================================================ */
	public static WebElement RMAApp_BankAccount_Txt_Owner1(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_ownereid")); //Unique Id  Of  Owner TextBox On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Add_New_Bank
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Button From Lookup On RMA Application Bank Account Window Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - Jannathhussain-04-27-2018                                
	//============================================================================================
	public static WebElement RMAApp_Add_New_Bank_FromLookup(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='addicon']/i")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankAccount_Deposit_VoidOrClearDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Deposit Void OR Clear Date Field On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannathhussain-05-16-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankAccount_Deposit_VoidOrClearDate(WebDriver driver)
	{
		Element = driver.findElement(By.id("voidcleardate")); //Unique Id  Of  Save Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankAccount_Lst_EffectiveDateTriggerUX
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Deposit Void OR Clear Date Field On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannathhussain-05-16-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankAccount_Lst_EffectiveDateTriggerUX(WebDriver driver)
	{
		Element = driver.findElement(By.id("triggerdate")); //Unique Id  Of  Save Image On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_AccountBalance_Txt_DepositBalance
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance TextBox On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-18-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_AccountBalance_Txt_DepositBalance(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='Rmacurrencycontrol2' and @type='text']")); //Unique iID Of Balance TextBox On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_AccountBalance_Txt_SubTotal
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance TextBox On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-18-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_AccountBalance_Txt_SubTotal(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='Rmacurrencycontrol4' and @type='text']")); //Unique iID Of Balance TextBox On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_AccountBalance_Txt_OutOfBalance
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance TextBox On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-05-18-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_AccountBalance_Txt_OutOfBalance(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='Rmacurrencycontrol8' and @type='text']")); //Unique iID Of Balance TextBox On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_Balance_Btn_Upload
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance TextBox On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-08-22-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_Balance_Btn_Upload(WebDriver driver)
	{
		Element = driver.findElement(By.id("uploadFile")); //Unique iID Of Balance TextBox On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_Balance_Btn_ProcessFile
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Balance TextBox On RMA Application Bank Account-->Balance Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				:  0.0 - ShrutiShruti-08-22-2018                               
	 ============================================================================================ */
	public static WebElement RMAApp_Balance_Btn_ProcessFile(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Process File']/i")); //Unique iID Of Balance TextBox On RMA Application Bank Account-->Balance Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_BankAccount_Tab_DisbursementAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disbursement Account Tab On RMA Application Bank Account Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-23-2018                                  
	//============================================================================================
	public static WebElement RMAApp_BankAccount_Tab_DisbursementAccount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Disbursement Account')]/i")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SubBankAccount_Lst_CheckStock
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Stock Drop Down On RMA Application  Sub Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-07-27-2018                        
	//============================================================================================
	public static WebElement RMAApp_SubBankAccount_Lst_CheckStock(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("checkstock")); //Unique Id  Of Check Stock Drop Down On RMA Application Sub Bank Account Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_CheckStock_Btn_LookUp
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Look Up Button On MA Application Bank Account-->Check Stock Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-11-04-2016                                
	 ============================================================================================ */
	public static WebElement RMAApp_CheckStock_Btn_LookUp(WebDriver driver)
	{
		Element = driver.findElement(By.xpath("//i[@id='I1']")); //Unique xpath  Look Up Button On RMA Application Bank Account-->Check Stock Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAAp_SubBankAccount_Lst_CheckStock
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Check Stock List On RMA Application Bank Account-->SubAccount Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - RenuVerma-11-04-2016                                
	 ============================================================================================ */
	public static WebElement RMAAp_SubBankAccount_Lst_CheckStock(WebDriver driver)
	{
		Element = driver.findElement(By.id("checkstock")); //Unique xpath  Check Stock List On RMA Application Bank Account-->SubAccount Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAAp_BankAccount_Btn_State
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  State lookup On RMA Application Bank Account Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - MishalKantawala-06-10-2020                                
	 ============================================================================================ */
	public static WebElement RMAAp_BankAccount_Btn_State(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_bankstateid_openlookup")); //Unique xpath  Check Stock List On RMA Application Bank Account-->SubAccount Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAAp_BankAccount_Btn_Country
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  State lookup On RMA Application Bank Account Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - MishalKantawala-06-10-2020                                
	 ============================================================================================ */
	public static WebElement RMAAp_BankAccount_Btn_Country(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_bankcountry_openlookup")); //Unique xpath  Check Stock List On RMA Application Bank Account-->SubAccount Page Is Fetched
		return Element;
	}	

	/*============================================================================================
	FunctionName 			: RMAApp_CheckStock_Chk_PrintClaimNoOnCheck
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Claim No On Check Check Box On MA Application Bank Account-->Check Stock Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - DebasmitaPati-07-29-2020                              
	 ============================================================================================ */
	public static WebElement RMAApp_CheckStock_Chk_PrintClaimNoOnCheck(WebDriver driver)
	{
		Element = driver.findElement(By.name("prntClmNumCheck")); //Unique xpathPrint Claim No On Check Check Box On RMA Application Bank Account-->Check Stock Page Is Fetched
		return Element;
	}

	/*============================================================================================
	FunctionName 			: RMAApp_CheckStock_Chk_PrintControlNoOnCheckStub
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Print Control # on Check Stub Check Box On RMA Application Bank Account-->Check Stock Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - DebasmitaPati-07-29-2020                              
	 ============================================================================================ */
	public static WebElement RMAApp_CheckStock_Chk_PrintControlNoOnCheckStub(WebDriver driver)
	{
		Element = driver.findElement(By.name("prntCtlOnStub")); //Unique xpath  Print Control # on Check Stub Check Box On RMA Application Bank Account-->Check Stock Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAAp_BankAccount_Lnk_FirstLinkOnBankAccLookup
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Link On Bank Account Lookup On RMA Application Bank Account Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - ShrutiShruti-07-31-2020                                
	 ============================================================================================ */
	public static WebElement RMAAp_BankAccount_Lnk_FirstLinkOnBankAccLookup(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='ngCellText ui-grid-cell-contents ng-scope']/*")); //Unique xpath First Link On Bank Account Lookup On RMA Application Bank Account-->SubAccount Page Is Fetched
		return Element;
	}
}
