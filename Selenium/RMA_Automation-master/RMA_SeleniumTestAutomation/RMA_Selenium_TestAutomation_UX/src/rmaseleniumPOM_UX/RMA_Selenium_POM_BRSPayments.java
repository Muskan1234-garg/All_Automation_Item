package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Packages Import Completedt

public class RMA_Selenium_POM_BRSPayments {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_Zip
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip Textbox On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_Zip(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='pye_zipcode']")); //Unique Id Of Zip Textbox On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Tab_BRSTransactionDetails
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which BRS Transactions Details Tab On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Tab_BRSTransactionDetails(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'BRS Transaction Detail')]")); //Unique Id Of BRS Transactions Details Tab On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_AddBRSSplit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add BRS Split Button On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_AddBRSSplit(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("cruduiGridAddBtn")); //Unique Id Of Add BRS Split Button On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which From Date Textbox On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_FromDate(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='fromdate' and @type='text']")); //Unique Id Of From Date Textbox On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_ToDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Date Textbox On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_ToDate(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='todate' and @type='text']")); //Unique Id Of To Date Textbox On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Lst_Table
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Fee Schedule Table DropDown On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Lst_Table(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("feesched")); //Unique Id Of Fee Schedule Table DropDown On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Tab_DatesZipFeeTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dates, Zip Fee Table Tab On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Tab_DatesZipFeeTable(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Dates, Zip and Fee Table')]")); //Unique Id Of Dates, Zip Fee Table Tab On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Tab_BillItemDetails
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bill Item Detail Tab On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Tab_BillItemDetails(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Bill Item Detail')]")); //Unique Id Of Bill Item Detail Tab On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Tab_Calculate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Calculate Tab On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Tab_Calculate(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Calculate')]")); //Unique Id Of Calculate Tab On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_ZipCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_ZipCode(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("zipcode")); //Unique Id Of Zip Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_BillType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bill Type Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_BillType(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("lookup_billtypecode")); //Unique Id Of Bill Type Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_BillType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bill Type Lookup Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_BillType(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("btn_billtypecode_openlookup")); //Unique Id Of Bill Type Lookup Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_PlaceOfService
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Place Of Service Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_PlaceOfService(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("lookup_placeofsercode")); //Unique Id Of Place Of Service Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_PlaceOfService
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Place Of Service Lookup Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_PlaceOfService(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("btn_placeofsercode_openlookup")); //Unique Id Of Place Of Service Lookup Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_TypeOfService
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Type Of Service Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_TypeOfService(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("lookup_typeofsercode")); //Unique Id Of Type Of Service Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_TypeOfService
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Type Of Service Lookup Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_TypeOfService(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("btn_typeofsercode_openlookup")); //Unique Id Of Type Of Service Lookup Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_PhysicianLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Physician Lookup Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_PhysicianLookup(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("lookup_rmaphysicianlookup_physicianLookUp")); //Unique Id Of Physician Lookup Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_PhysicianLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Physician Lookup Lookup Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_PhysicianLookup(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("btn_rmaphysicianlookup_physicianLookUp")); //Unique Id Of Physician Lookup Lookup Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Lst_TransactionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type Dropdown On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Lst_TransactionType(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("transtypecode")); //Unique Id Of Transaction Type Dropdown On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_ICD9DiagnosisCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ICD9 Diagnosis Code(s) Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_ICD9DiagnosisCode(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_diagnosislist']")); //Unique Id Of ICD9 Diagnosis Code(s) Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_ICD10DiagnosisCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ICD10 Diagnosis Code(s) Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_ICD10DiagnosisCode(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("btn_diagnosislisticd10")); //Unique Id Of ICD10 Diagnosis Code(s) Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_ModifierList
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Modifier List Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_ModifierList(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("btn_modifierlist")); //Unique Id Of Modifier List Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_RefNoDiagnosisPointer
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ref Number/Diagnosis Pointer Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_RefNoDiagnosisPointer(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("diagrefno")); //Unique Id Of Ref Number/Diagnosis Pointer Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Lst_GLAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which GL Account Dropdown On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Lst_GLAccount(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("glaccountcode")); //Unique Id Of GL Account Dropdown On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_CPT
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CPT Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_CPT(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("billingcodecid")); //Unique Id Of CPT Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_BillingCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Billing Code Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_BillingCode(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("lookup_rmabillingcodelookup_billingCode")); //Unique Id Of Billing Code Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_BillingCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Billing Code Lookup Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_BillingCode(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("btn_rmabillingcodelookup_billingCode")); //Unique Id Of Billing Code Lookup Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_NDCNumberPrimary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which NDC Number Primary Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_NDCNumberPrimary(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("phypharmndc")); //Unique Id Of NDC Number Primary Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_NDCNumberPrimaryDesc
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which NDC Number Primary Description Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_NDCNumberPrimaryDesc(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("phypharmndcdes")); //Unique Id Of NDC Number Primary Description Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_NDCNumberSecondary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which NDC Number Secondary Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_NDCNumberSecondary(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("phypharmndcsec")); //Unique Id Of NDC Number Secondary Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_NDCNumberSecondaryDesc
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which NDC Number Secondary Description Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_NDCNumberSecondaryDesc(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("phypharmndcsecdes")); //Unique Id Of NDC Number Secondary Description Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_UnitsBilled
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Units Billed Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_UnitsBilled(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("unitsbillednum")); //Unique Id Of Units Billed Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_InvoicedBy
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoiced By Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_InvoicedBy(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("invoicedby")); //Unique Id Of Invoiced By Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_InvoicedNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoiced Number Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_InvoicedNumber(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("invoicenumber")); //Unique Id Of Invoiced Number Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_InvoiceDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoice Date Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_InvoiceDate(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='invoicedate' and @type='text']")); //Unique Id Of Invoice Date Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Lst_BilledUnits
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Billed Units List On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Lst_BilledUnits(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("unitsbilledtype")); //Unique Id Of Billed Units List On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_AmountBilled
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount Billed Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_AmountBilled(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='amountbilled' and @type='text']")); //Unique Id Of Amount Billed Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_CalculateAmountAllowed
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Calculate Amount Allowed Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_CalculateAmountAllowed(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("btnAmountBilled")); //Unique Id Of Calculate Amount Allowed Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_AmountAllowed
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount Allowed Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_AmountAllowed(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='amountallowed' and @type='text']")); //Unique Id Of Amount Allowed Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_AmountSaved
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount Saved Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_AmountSaved(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='amountsaved' and @type='text']")); //Unique Id Of Amount Saved Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_ReduceAmountByFixAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reduce Amount To Pay Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_ReduceAmountByFixAmount(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='amountreduced' and @type='text']")); //Unique Id Of Reduce Amount To Pay Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_ReduceAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reduce Amount Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_ReduceAmount(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("btnAmountReduced")); //Unique Id Of Reduce Amount Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_ReduceAmountByFixPercent
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reduce Amount To Pay By Fixed Percent Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_ReduceAmountByFixPercent(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("amountreducedpercent")); //Unique Id Of Reduce Amount To Pay Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_ReduceAmountByPercent
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reduce Amount Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_ReduceAmountByPercent(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("btn_amountreducedpercent")); //Unique Id Of Reduce Amount Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Txt_AmountToPay
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount To Pay Textox On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Txt_AmountToPay(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='amounttopay' and @type='text']")); //Unique Id Of Amount To Pay Textox On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_ExplanationsOfBenefits
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Explanation Of Benefits Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_ExplanationsOfBenefits(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("btn_eoblist")); //Unique Id Of Explanation Of Benefits Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_CloseBRSPopUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close BRS popUp Button On BRS Split On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_CloseBRSPopUp(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='Close']/i")); //Unique Id Of Close BRS PopUp Button On BRS Split On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Btn_CloseEOBReportsPopUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On EOB Reports PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-17-07-2019                                      
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Btn_CloseEOBReportsPopUp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='btnCancelmemo']")); //Unique Id Of Close Button On EOB Reports PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TransSplit_Btn_SplitCopyTransaction
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Copy Transaction Image On Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-11-30-2020                                 
	//============================================================================================
	public static WebElement RMAApp_TransSplit_Btn_SplitCopyBRSTransaction(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@aria-label='Copy Transaction']")); //Unique Id Of Clone Transaction's Split Image On Transaction Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Img_CloneTransactionSplit
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Clone Transaction's Split Image On Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-11-30-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Img_CloneBRSTransactionSplit(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='Clone']")); //Unique Id Of Copy Transaction Image On Transaction Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_OvrdContinue
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Ok Button over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_OvrdContinue(WebDriver driver)
	{
		Element = driver.findElement(By.id("Continue")); //Unique Id Ok Button over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_OvrdClose
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Button over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_OvrdClose(WebDriver driver)
	{
		Element = driver.findElement(By.id("Close")); //Unique Id Close Button over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_OvrdBilledAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Billed Amount Radio Button over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_OvrdBilledAmount(WebDriver driver)
	{
		Element = driver.findElement(By.id("override1ba")); //Unique Id Billed Amount Radio Button over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_OvrdBilledAmountWithDiscount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Billed Amount With DiscountRadio Button over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_OvrdBilledAmountWithDiscount(WebDriver driver)
	{
		Element = driver.findElement(By.id("override1bad")); //Unique Id Billed Amount With Discount Radio Button over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_OvrdContractAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Billed Contract Radio Button over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_OvrdContractAmount(WebDriver driver)
	{
		Element = driver.findElement(By.id("override1ca")); //Unique Id Billed Contract Radio Button over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_OvrdContractAmountWithDiscount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Contract Amount With DiscountRadio Button over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_OvrdContractAmountWithDiscount(WebDriver driver)
	{
		Element = driver.findElement(By.id("override1cad")); //Unique Id Contract Amount With Discount Radio Button over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_OvrdFeeSchedule
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Fee Schedule Radio Button over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_OvrdFeeSchedule(WebDriver driver)
	{
		Element = driver.findElement(By.id("override1fs")); //Unique Id Fee Schedule Radio Button over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_OvrdFeeScheduleWithDiscount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Fee Schedule With Discount Radio Button over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_OvrdFeeScheduleWithDiscount(WebDriver driver)
	{
		Element = driver.findElement(By.id("override1fsd")); //Unique Id Fee Schedule With Discount Radio Button over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_OvrdApplyPerDiem
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Apply Per Diem Radio Button over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_OvrdApplyPerDiem(WebDriver driver)
	{
		Element = driver.findElement(By.id("override1apd")); //Unique Id Fee Apply Per Diem Button over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_OvrdApplyPerDiemWithStopLoss
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which With Stop Loss Radio Button over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_OvrdApplyPerDiemWithStopLoss(WebDriver driver)
	{
		Element = driver.findElement(By.id("override1apdsl")); //Unique Id Fee Apply Per Diem With Stop Loss Button over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Tab_OvrdOverrideOptions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which BRS Transactions Details Tab On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Tab_OvrdOverrideOptions(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Override Options')]")); //Unique Id Of BRS Transactions Details Tab On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollections_Tab_ContractInformation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which BRS Transactions Details Tab On RMA Application Payment/Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentCollections_Tab_ContractInformation(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Contract Information')]")); //Unique Id Of BRS Transactions Details Tab On RMA Application Payment/Collection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_OvrdFeeSchedule
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which With Fee Schedule Textbox over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Txt_OvrdFeeSchedule(WebDriver driver)
	{
		Element = driver.findElement(By.id("ovrschedamount")); //Unique Id Fee Schedule Textbox over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_OvrdFeeScheduleWithDiscount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which With Fee Schedule With Discount Textbox over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Txt_OvrdFeeScheduleWithDiscount(WebDriver driver)
	{
		Element = driver.findElement(By.id("ovrdiscschedamount")); //Unique Id Fee Schedule With Discount Textbox over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_OvrdApplyPerDiemWithStopLoss
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Apply Per Diem With Stop Loss Textbox over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Txt_OvrdApplyPerDiemWithStopLoss(WebDriver driver)
	{
		Element = driver.findElement(By.id("ovrperdiemstoplossamount")); //Unique Id Fee Apply Per Diem With Stop Loss Textbox over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_OvrdBilledAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Billed Amount Textbox over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-01-19-2021                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Txt_OvrdBilledAmount(WebDriver driver)
	{
		Element = driver.findElement(By.id("ovrbilledamount")); //Unique Id Billed Amount Textbox over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_OvrdBilledAmountWithDiscount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Billed Amount With DiscountRadio Button over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-01-19-2021                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Txt_OvrdBilledAmountWithDiscount(WebDriver driver)
	{
		Element = driver.findElement(By.id("ovrdiscbilledamount")); //Unique Id Billed Amount With Discount Radio Button over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_OvrdContractAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Billed Contract Textbox over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-01-19-2021                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Txt_OvrdContractAmount(WebDriver driver)
	{
		Element = driver.findElement(By.id("ovrcontractamount")); //Unique Id Billed Contract Textbox over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_OvrdContractAmountWithDiscount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Contract Amount With Discount Textbox over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-01-19-2021                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Txt_OvrdContractAmountWithDiscount(WebDriver driver)
	{
		Element = driver.findElement(By.id("ovrdisccontractamount")); //Unique Id Contract Amount With Discount Textbox over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_OvrdApplyPerDiem
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Apply Per Diem Textbox over the Override BRS Transaction Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-01-19-2021                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Txt_OvrdApplyPerDiem(WebDriver driver)
	{
		Element = driver.findElement(By.id("ovrperdiemamount")); //Unique Id Fee Apply Per Diem Textbox over the Override BRS Transaction Popup Can Be Fetched
		return Element;
	}
}