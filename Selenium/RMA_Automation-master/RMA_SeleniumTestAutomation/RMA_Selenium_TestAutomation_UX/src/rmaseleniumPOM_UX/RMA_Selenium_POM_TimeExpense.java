package rmaseleniumPOM_UX;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_TimeExpense {
	public static WebElement Element;
	public static List<WebElement> ElementList = null;

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpense_Chk_UseTimeExpense
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Time And Expense CheckBox On General System Parameters Setup Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpense_Chk_UseTimeExpense(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("UseTnE")); //Unique Id Of Use Time And Expense CheckBox On General System Parameters Setup Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpense_Txt_ActivationCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Activation Code TextBox On General System Parameters Setup Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpense_Txt_ActivationCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Password")); //Unique Id Of Activation Code TextBox On General System Parameters Setup Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpense_Btn_ActivationCodeOK
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Activation Code OK Button On General System Parameters Setup Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpense_Btn_ActivationCodeOK(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Ok")); //Unique Id Of Activation Code OK Button On General System Parameters Setup Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpense_Txt_RateOrgLevel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Rate Org. Hierarchy Level Drop-Down On General System Parameters Setup Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpense_Txt_RateOrgLevel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("RateOrgLvl")); //Unique Id Of Rate Org. Hierarchy Level Drop-Down On General System Parameters Setup Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpense_Txt_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account Drop-Down On General System Parameters Setup Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpense_Txt_BankAccount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("BankAccount")); //Unique Id Of Rate Bank Account Drop-Down On General System Parameters Setup Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpense_Chk_ShowAllTxnInInvoice
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Show All Transaction Types For Invoice Details CheckBox On General System Parameters Setup Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpense_Chk_ShowAllTxnInInvoice(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("UseAllTransTypes")); //Unique Id Of Rate Show All Transaction Types For Invoice Details CheckBox On General System Parameters Setup Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseRT_Btn_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Button On Time And Expense Rate Tables Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseRT_Btn_AddNew(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnAdd']/i")); //Unique Id Of Rate Add New Button On Time And Expense Rate Tables Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseRT_Txt_RateTableName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Rate Table Name TextBox On Time And Expense Rate Tables Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseRT_Txt_RateTableName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("RateTableName")); //Unique Id Of Rate Table Name TextBox On Time And Expense Rate Tables Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseRT_Txt_Customer
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Customer TextBox On Time And Expense Rate Tables Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseRT_Txt_Customer(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("customer")); //Unique Id Of Customer TextBox On Time And Expense Rate Tables Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseRT_Txt_EffectiveDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Effective Date TextBox On Time And Expense Rate Tables Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseRT_Txt_EffectiveDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("EffectiveDate")); //Unique Id Of Effective Date TextBox On Time And Expense Rate Tables Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseRT_Txt_ExpirationDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Expiration Date TextBox On Time And Expense Rate Tables Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseRT_Txt_ExpirationDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ExpirationDate")); //Unique Id Of Expiration Date TextBox On Time And Expense Rate Tables Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseRT_Btn_SaveRateTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On Time And Expense Rate Tables Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseRT_Btn_SaveRateTable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnSave")); //Unique Id Of Save Button On Time And Expense Rate Tables Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseRT_Btn_Back
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back Button On Time And Expense Rate Tables Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseRT_Btn_Back(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnBack")); //Unique Id Of Back Button On Time And Expense Rate Tables Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseRT_Btn_AddDetail
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Detail Button On Time And Expense Rate Tables Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseRT_Btn_AddDetail(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnAdd")); //Unique Id Of Add Detail Button On Time And Expense Rate Tables Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseDetailItem_Txt_TransType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type TextBox On Detail Items PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseDetailItem_Txt_TransType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("transactiontypecode_codelookup")); //Unique Id Of Transaction Type TextBox On Detail Items PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseDetailItem_Btn_TransType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type Button On Detail Items PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseDetailItem_Btn_TransType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("transactiontypecode_codelookupbtn")); //Unique Id Of Transaction Type Button On Detail Items PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseDetailItem_Txt_TransType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit TextBox On Detail Items PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseDetailItem_Txt_Unit(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("unit_codelookup")); //Unique Id Of Unit TextBox On Detail Items PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseDetailItem_Btn_TransType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit Button On Detail Items PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseDetailItem_Btn_Unit(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("unit_codelookupbtn")); //Unique Id Of Unit Button On Detail Items PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseDetailItem_Txt_Rate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Rate TextBox On Detail Items PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseDetailItem_Txt_Rate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("rate")); //Unique Id Of Rate TextBox On Detail Items PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseDetailItem_Btn_SaveClose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save And Close Button On Detail Items PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseDetailItem_Btn_SaveClose(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnOk']/i")); //Unique Id Of Save And Close Button On Detail Items PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseDetailItem_Btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Button On Detail Items PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseDetailItem_Btn_Cancel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCancel']/i")); //Unique Id Of Cancel Button On Detail Items PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpenseDetailItem_Btn_DeleteRateTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Rate Table Button On Rate Table Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpenseDetailItem_Btn_DeleteRateTable(WebDriver driver, String TableName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+TableName+"')]//ancestor::tr[1]/td/input")); //Unique Id Of Delete Rate Table Button On Rate Table Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_TimeExpense
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Time And Expense Button On Financial/Reserves Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-15-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_TimeExpense(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnTE")); //Unique Id Of Time And Expense Button On Financial/Reserves Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_AddNewTE
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-15-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_AddNewTE(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Add New']/i")); //Unique Id Of Add New Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_BilledExpense
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Build Expense Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-15-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_BilledExpense(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Billed Expense']/i")); //Unique Id Of Build Expense Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_BillIt
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bill It Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-15-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_BillIt(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Bill It']/i")); //Unique Id Of Bill It Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_VoidIt
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void It Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-15-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_VoidIt(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Void It']/i")); //Unique Id Of Void It Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_GoToFunds
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Go To Funds Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-15-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_GoToFunds(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Go To Funds']/i")); //Unique Id Of Go To Funds Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_ClaimRateTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Rate Table Lookup Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-15-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_ClaimRateTable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_ratetableid")); //Unique Id Of Claim Rate Table Lookup Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Txt_ClaimRateTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Rate Table Lookup TextBox On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-15-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Txt_ClaimRateTable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_ratetableid")); //Unique Id Of Claim Rate Table Lookup TextBox On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Chk_AutomaticTEReport
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Automatic T&E Report On Bill It CheckBox On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-15-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Chk_AutomaticTEReport(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Automatic T&E Report on Bill It')]//ancestor::div[1]/input")); //Unique Id Of Automatic T&E Report On Bill It CheckBox On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Txt_ClaimNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Number TextBox On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Txt_ClaimNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("claimnumber")); //Unique Id Of Claim Number TextBox On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Chk_Allocated
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allocated Check Box On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Chk_Allocated(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("allocatedflag")); //Unique Id Of Allocated Check Box On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Txt_WorkDoneBy
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Work Done By TextBox On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Txt_WorkDoneBy(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_workdoneby")); //Unique Id Of Work Done By TextBox On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_WorkDoneBy
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Work Done By Lookup Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_WorkDoneBy(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_workdoneby' and @class='btn btn-primary']")); //Unique Id Of Work Done By Lookup Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Txt_Vendor
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vendor TextBox On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Txt_Vendor(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("lookup_vendor"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Vendor TextBox On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_Vendor
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vendor Lookup Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_Vendor(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_vendor")); //Unique Id Of Vendor Lookup Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Txt_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Distribution Type TextBox On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Txt_DistributionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_distributiontype")); //Unique Id Of Distribution Type TextBox On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Distribution Type Lookup Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_DistributionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_distributiontype_openlookup")); //Unique Id Of Distribution Type Lookup Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Txt_InvoiceNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoice Number TextBox On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Txt_InvoiceNumber(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("invnumber"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Invoice Number TextBox On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Txt_InvoiceAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoice Amount TextBox On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Txt_InvoiceAmount(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='invoiceamount' and @type='text']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Invoice Amount TextBox On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Txt_CurrencyType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Currency Type TextBox On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Txt_CurrencyType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_currencytypetext")); //Unique Id Of Currency Type TextBox On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_CurrencyType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Currency Type Lookup Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_CurrencyType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_currencytypetext_openlookup")); //Unique Id Of Currency Type Lookup Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Txt_InvoiceDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoice Date TextBox On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Txt_InvoiceDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='invoicedate' and @type='text']")); //Unique Id Of Invoice Date TextBox On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Txt_Available
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Available Amount TextBox On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Txt_Available(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='available' and @type='text']")); //Unique Id Of Available Amount TextBox On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_AddNewInvoiceDetail
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Button For Invoice Details On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_AddNewInvoiceDetail(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cruduiGridAddBtn")); //Unique Id Of Add New Button For Invoice Details On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_SaveTETransaction
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Transaction Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_SaveTETransaction(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Save']/i")); //Unique Id Of Save Transaction Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_CancelTETransaction
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Transaction Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_CancelTETransaction(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Cancel']/i")); //Unique Id Of Cancel Transaction Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_TransactionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_TransactionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_transTypeCode")); //Unique Id Of Transaction Type TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Btn_TransactionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type Lookup Button On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Btn_TransactionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_transTypeCode")); //Unique Id Of Transaction Type Lookup Button On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_ReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Type TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_ReserveType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_reservetype")); //Unique Id Of Reserve Type TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Btn_ReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Type Lookup Button On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Btn_ReserveType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_reservetype")); //Unique Id Of Reserve Type Lookup Button On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_InvoiceNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoice Number TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_InvoiceNumber(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("invoicenumber"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Invoice Number TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which From Date TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_FromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='fromDate' and @type='text']")); //Unique Id Of From Date TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_ToDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Date TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_ToDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='toDate' and @type='text']")); //Unique Id Of To Date TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_InvoiceTotal
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoice Total TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_InvoiceTotal(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='invoicetotal' and @type='text']")); //Unique Id Of Invoice Total TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_ItemAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Item Amount TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_ItemAmount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='itemamount' and @type='text']")); //Unique Id Of Item Amount TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_InvoiceCurrency
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoice Currency TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_InvoiceCurrency(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_currencytypetext")); //Unique Id Of Invoice Currency TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Rdo_Billable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Billable Radio Button On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Rdo_Billable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Billable']//ancestor::label[1]/input")); //Unique Id Of Billable Radio Button On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Rdo_NonBillable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Non-Billable Radio Button On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Rdo_NonBillable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Non Billable']//ancestor::label[1]/input")); //Unique Id Of Non-Billable Radio Button On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Rdo_Postable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Postable Radio Button On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Rdo_Postable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Postable']//ancestor::label[1]/input")); //Unique Id Of Postable Radio Button On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Rdo_NonPostable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which NonPostable Radio Button On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Rdo_NonPostable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Non Postable']//ancestor::label[1]/input")); //Unique Id Of NonPostable Radio Button On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_NonBillReason
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Non Bill Reason TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_NonBillReason(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_nonbillreason")); //Unique Id Of Non Bill Reason TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Btn_NonBillReason
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Non Bill Reason Lookup Button On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Btn_NonBillReason(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_nonbillreason_openlookup")); //Unique Id Of Non Bill Reason Lookup Button On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_ReasonDesc
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reason/Desc TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_ReasonDesc(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("reasondesc")); //Unique Id Of Reason/Desc TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Chk_Override
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Override CheckBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Chk_Override(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("override")); //Unique Id Of Override CheckBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_Quantity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Quantity TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_Quantity(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("quantity")); //Unique Id Of Quantity TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_Unit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_Unit(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("unit")); //Unique Id Of Unit TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_Rate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Rate TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_Rate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='rate' and @type='text']")); //Unique Id Of Rate TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_Total
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Total TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_Total(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='total' and @type='text']")); //Unique Id Of Total TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Btn_Comments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Comments Button On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Btn_Comments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='memo_comments']//ancestor::div[1]/span/button")); //Unique Id Of Comments Button On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_CommentsCreation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TextArea For Comments On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_CommentsCreation(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='fr-element fr-view']")); //Unique Id Of TextArea For Comments On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Btn_CommentsOK
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Button On Comments PopUp On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Btn_CommentsOK(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='usericon']/i")); //Unique Id Of OK Button On Comments PopUp On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Btn_PreviousComments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Previous Comments Button On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Btn_PreviousComments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='memo_previouscomments']//ancestor::div[1]/span/button")); //Unique Id Of Previous Comments Button On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_PreviousComments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TextArea For Comments On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_PreviousComments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("memo_previouscomments")); //Unique Id Of TextArea For Previous Comments On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceDetail_Txt_NotAppliedInvoiceTotalAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount For Invoice Total Not Applied TextBox On Invoice Detail Window On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceDetail_Txt_NotAppliedInvoiceTotalAmount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='amtnotapplied' and @type='text']")); //Unique Id Of Amount For Invoice Total Not Applied TextBox On Invoice Detail Window On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_BackToTE
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back To Time And Expense Button On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_BackToTE(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Back To Time and Expense']/i")); //Unique Id Of Back To Time And Expense Button On Transaction Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_CloseTEPopUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On Time And Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_CloseTEPopUp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='btnCancelmemo' and @ng-hide='isClose']")); //Unique Id Of Close Button On Time And Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TimeExpense_Lnk_FirstLinkOnLookUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Link On Any LookUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TimeExpense_Lnk_FirstLinkOnLookUp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-cell-contents ng-scope']/*")); //Unique Id Of First Link On Any LookUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TransSplitDetail_Txt_InvoiceNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoice Number Textbox On Transaction Split Details Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-25-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_TransSplitDetail_Txt_InvoiceNumber(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("invoiceNumber"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Invoice Number Textbox On Transaction Split Details Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BilledExpense_Btn_TnEReport
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TnE Report Button On Billed Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-25-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_BilledExpense_Btn_TnEReport(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='T & E Report']/i")); //Unique Id Of TnE Report Button On Billed Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BilledExpense_Btn_AvailableForBilling
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Available For Billing Button On Billed Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-25-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_BilledExpense_Btn_AvailableForBilling(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Available for Billing']/i")); //Unique Id Of Available For Billing Report Button On Billed Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BilledExpense_Btn_PrintHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print History Button On Billed Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-25-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_BilledExpense_Btn_PrintHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Print History']/i")); //Unique Id Of Print History Report Button On Billed Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BilledExpense_Tbl_PrintHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print History Table On Billed Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-25-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_BilledExpense_Tbl_PrintHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover tePadd teView']/tbody")); //Unique Id Of Print History Table Button On Billed Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BilledExpense_Btn_PrintHistoryClose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print History Close Button On Billed Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-30-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_BilledExpense_Btn_PrintHistoryClose(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='glyphicon glyphicon-remove closeBtn']")); //Unique Id Of Print History Close Button Button On Billed Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BilledExpense_Tbl_TnEReport
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TnE Report Table On Billed Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-25-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_BilledExpense_Tbl_TnEReport(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='recentClaimBg']//ancestor::table[1]/tbody")); //Unique Id Of Print History Table Button On Billed Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BilledExpense_Btn_InvoiceReceipt
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoice Receipt Image Button On Billed Expense PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-30-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_BilledExpense_Btn_InvoiceReceipt(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@title='Click to open']//i")); //Unique Id Of Invoice Receipt Image Button Button On Billed Expense PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceReceipt_Chk_Billable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Billable CheckBox On Invoice Receipt Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-14-08-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceReceipt_Chk_Billable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-model='x.billable']")); //Unique Id Of Billable CheckBox On Invoice Receipt Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceReceipt_Chk_Postable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Postable CheckBox On Invoice Receipt Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-14-08-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceReceipt_Chk_Postable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-model='x.postable']")); //Unique Id Of Postable CheckBox On Invoice Receipt Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InvoiceReceipt_Chk_Override
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Override CheckBox On Invoice Receipt Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-14-08-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_InvoiceReceipt_Chk_Override(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-model='x.override']")); //Unique Id Of Override CheckBox On Invoice Receipt Screen Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserves_Btn_TimeExpenseNonExist
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Non-Existent Time And Expense Button On Financial/Reserves Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-15-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserves_Btn_TimeExpenseNonExist(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='div_btnTE' and @style='display: none;']")); //Unique Id Of Non-Existent Time And Expense Button On Financial/Reserves Screen Is Fetched
		return Element;
	}
}
