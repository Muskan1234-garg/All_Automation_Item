package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_PaymentsCollections {
	public static WebElement Element;
	public static boolean found;

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Tab_TransactionDetail
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Detail Tab On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                     
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Tab_TransactionDetail(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Transaction Detail')]/i")); //Unique Id  Of Transaction Detail Tab On RMA Application Payments Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Tab_Transaction
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Tab On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                           
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Tab_Transaction(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Transaction')]/i")); //Unique Id  Of Transaction Tab On RMA Application Payments Page Is Fetched
		return Element;

	}
	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Chk_SupplPayFlag
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Payment CheckBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-13-2018                                
	//============================================================================================
	public static WebElement RMAApp_Payment_Chk_SupplPayFlag(WebDriver driver)
	{
		Element = driver.findElement(By.id("isSupplementalPay")); 
		return Element;		
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_VoidLookup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Auto Checks Button On Transaction History Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-04-20-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_VoidLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Void Check Reason')]//ancestor::div[1]/rma-memo/div/span/button")); //Unique Id Of Auto Checks Button On Transaction History Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_VoidLookup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Auto Checks Button On Transaction History Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-04-20-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_VoidLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='fr-element fr-view']")); //Unique Id Of Auto Checks Button On Transaction History Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_VoidLookupOK
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Auto Checks Button On Transaction History Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-04-20-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_VoidLookupOK(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='usericon']/i")); //Unique Id Of Auto Checks Button On Transaction History Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Txt_LookupCntlNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip TextBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-11-2018                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Txt_LookupCntlNumber(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-filter-input ui-grid-filter-input-0']")); //Unique Id Of Zip TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Chk_FinalPayment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Payment Checkbox On Transaction History Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-22-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Chk_Payment(WebDriver driver)
	{
		Element = driver.findElement(By.id("paymentflag")); //Unique Id Of Transaction History Image On Transaction History Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Lst_TransactionTypeTrans
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Transaction Type ListBox On Funds--> Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-08-2018                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Lst_TransactionTypeTrans(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cmbTransactionType")); //Unique Id Of Transaction Type ListBox On Funds--> Transaction Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Void_Reason_Transaction
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void Reason DropDown On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannathhussain-12-06-2018                           
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Void_Reason_Transaction(WebDriver driver)
	{
		Element=null;
		try{
			Element = driver.findElement(By.xpath(".//*[@id='voidcodereason']")); //Unique Id  Of Void Reason DropDown On RMA Application Payments Page Is Fetched
		}catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_TransactionHistory_Btn_AutoChecks
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Auto Checks Button On Transaction History Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-04-20-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_TransactionHistory_Btn_AutoChecks(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnAutoChecks")); //Unique Id Of Auto Checks Button On Transaction History Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_AddNewFunds
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Payment Button On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                 
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_AddNewFunds(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.id("cruduiGridAddBtn"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id  Of Add New Button On RMA Application Payments Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account Drop Down  On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Lst_BankAccount(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("bankaccount")); //Unique Id  Of Bank Account Drop Down On RMA Application Payments Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Lst_PayeePayorType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payee Type Drop Down  On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                  
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Lst_PayeePayorType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cbopayeetype")); //Unique Id  Of Payee Type Drop Down  On RMA Application Payments Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Distribution Type Text Box  On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                 
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_DistributionType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("lookup_distributiontype")); //Unique Id  Of Distribution Text Box  On RMA Application Payments Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Text Box On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                    
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_LastName(WebDriver driver)
	{
		Element=null;
		found=false;
		try {		
			Element = driver.findElement(By.xpath(".//*[text()='Last Name']//following::input[1]")); //Unique Id  Of Last Name Combo Box  On RMA Application Payments Page Is Fetched
			System.out.println("Last Name Found");
			found=true;
		} catch (Exception e) {
			System.out.println("Last Name Not Found");
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_LastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Text Box On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                    
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_LastName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='rmalookupfinanciallastname1_lastName']/p/span/button")); //Unique Id  Of Last Name Combo Box  On RMA Application Payments Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Distribution Type Code Look Up Button  On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                      
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_DistributionType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.name("btn_distributiontype")); //Unique Id Of Distribution Type Code Look Up Button On RMA Application Payments Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Lst_TransactionDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Date Drop Down On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                          
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Lst_TransactionDate(WebDriver driver)
	{
		Element = driver.findElement(By.id("transdate")); //Unique Id  Of Transaction Date Drop Down  On RMA Application Payments Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetail_Txt_InvoiceBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Invoice Number On Funds Split Detail Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                   
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetail_Txt_InvoiceBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("invoiceNumber")); //Unique Id Of Invoice Number On Funds Split Detail Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_CheckStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Status TextBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                    
	//============================================================================================
	public static WebElement RMAApp_Payment_Txt_CheckStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_checkstatuscode")); //Unique Id Of Check Status TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_CheckStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Status Lookup On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-09-25-2019                    
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_CheckStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_checkstatuscode_openlookup")); //Unique Id Of Check Status Lookup On RMA Application Payments Page Is Fetched
		return Element;		
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Lbl_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Lable Bank Account On Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                          
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Lbl_BankAccount(WebDriver driver)
	{
		Element = driver.findElement(By.id("lbltext_bankaccount")); //Unique Id Of Lable Bank Account On Transaction Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Lst_DDMenu
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Drop Down Menu Image Button  On RMA Claims Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                      
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Lst_DDMenu(WebDriver driver,String DDMenuName)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='dropdown-menu']//*[contains(text(),'"+DDMenuName+"')]"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Drop Down Menu Image Button On RMA Application Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Img_DDMenu
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Drop Down Menu Image Button  On RMA Claims Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                      
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Img_DDMenu(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[text()='list']")); //Unique Id Of Drop Down Menu Image Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Img_TransactionHistory
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Transaction History Image On Transaction History Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-06-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Img_TransactionHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("PaymentHistory")); //Unique Id Of Transaction History Image On Transaction History Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetail_Txt_InvoiceNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Invoice Number On Funds Split Detail Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                   
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetail_Txt_InvoiceNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("invoiceNumber")); //Unique Id Of Invoice Number On Funds Split Detail Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetail_Txt_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of From Date On Funds Split Detail Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-26-2017                                   
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetail_Txt_FromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='fromDate' and @placeholder='MM/dd/yyyy']"));//Unique Id Of From Date On Funds Split Detail Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetail_Txt_ToDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of To Date On Funds Split Detail Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-26-2017                                   
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetail_Txt_ToDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='toDate' and @placeholder='MM/dd/yyyy']")); //Unique Id Of To Date On Funds Split Detail Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_TransactionDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Date Text Box RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                          
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_TransactionDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='transdate' and @placeholder='MM/dd/yyyy']")); //Unique Id  Of Transaction Date Text Box  On RMA Application Payments Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Chk_CombinedPayFlag
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Combined Pay CheckBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-16-2017                                
	//============================================================================================
	public static WebElement RMAApp_Payment_Chk_CombinedPayFlag(WebDriver driver)
	{
		Element = driver.findElement(By.id("combinedpayflag")); 
		return Element;		
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_DeletePayee
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Delete Button Of Payee List On Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-09-15-2017                                 
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_DeletePayee(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='entitylist']/li[2]/span[1]")); //Unique Id Of Delete Button Of Payee List On Payment Page
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Img_PrintCheck
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Check Image On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-07-2017                                    
	//============================================================================================
	public static WebElement RMAApp_Payment_Img_PrintCheck(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='Print Check']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Print Check Image On RMA Application Payments Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_PrintCheck
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Check Button On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-07-2017                                    
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_PrintCheck(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='apscprint']/i")); //Unique Id Of Print Check Button On RMA Application Payments Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintSingleCheck_Txt_ChecksAndEOBReportsMsg
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Checks And EOB Reports Message On Payment Page On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-07-2017                                    
	//============================================================================================
	public static WebElement RMAApp_PrintSingleCheck_Txt_ChecksAndEOBReportsMsg(WebDriver driver)
	{
		Element = driver.findElement(By.id("hBatchMsgInfo")); //Unique Id Of Message Of Checks And EOB Reports On Payment Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentChecksAndEOBReports_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ok Image On Checks And EOB Reports Popup On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-07-2017                                    
	//============================================================================================
	public static WebElement RMAApp_PaymentChecksAndEOBReports_Btn_Ok(WebDriver driver)
	{
		Element = driver.findElement(By.id("chcekBatchMsgInfoSaveIcon")); //Unique Id Of Ok Image On Checks And EOB Reports Popup On RMA Application Payments Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintSingleCheck_Txt_CheckPrintedVerificationMsg
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Printed Message On Payment Page On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-07-2017                                    
	//============================================================================================
	public static WebElement RMAApp_PrintSingleCheck_Txt_CheckPrintedVerificationMsg(WebDriver driver)
	{
		Element = driver.findElement(By.id("hCheckInfo")); //Unique Id Of Message Of Checks And EOB Reports On Payment Page Is Fetched
		return Element;	
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_PrintSingleCheckMsgOk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Single Check Message Ok Image On Payment Page On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-07-2017                                    
	//============================================================================================
	public static WebElement RMAApp_Payment_Txt_PrintSingleCheckMsgOk(WebDriver driver)
	{
		Element = driver.findElement(By.id("I1")); //Unique Id Of Ok Image Of Print Single Check Message On Payment Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_Address1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address1 TextBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-10-03-2017                    
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_Address1(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_pye_addr1")); //Unique Id Of Address1 TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_Address2
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address2 TextBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-10-03-2017                    
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_Address2(WebDriver driver)
	{
		Element = driver.findElement(By.id("pye_addr2")); //Unique Id Of Address2 TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_Address3
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address3 TextBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-10-03-2017                    
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_Address3(WebDriver driver)
	{
		Element = driver.findElement(By.id("pye_addr3")); //Unique Id Of Address3 TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_PrintPreviewCancel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Preview Image On Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-10-25-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_PrintPreviewCancel(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='apsccancel']/i")); //Unique Id Of Close Image On Print Preview Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_Address4
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address4 TextBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-10-03-2017                    
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_Address4(WebDriver driver)
	{
		Element = driver.findElement(By.id("pye_addr4")); //Unique Id Of Address4 TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Img_PrintPreview
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Preview Image On Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-10-25-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Img_PrintPreview(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='Print Preview']/i")); //Unique Id Of Print Preview Image On Transaction Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Btn_PrintPreview
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Preview Button On Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-10-25-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Btn_PrintPreview(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='printpriview']/i")); //Unique Id Of Print Preview Image On Transaction Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Lst_Unit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit List Box On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-10-31-2017                              
	//============================================================================================
	public static WebElement RMAApp_Payment_Lst_Unit(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cmbUnit")); //Unique Id Of Unit List Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}



	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Lst_CoverageType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Coverage List Box On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-10-31-2017                              
	//============================================================================================
	public static WebElement RMAApp_Payment_Lst_CoverageType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cmbCoverageType")); //Unique Id Of Unit List Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Lst_LossType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Loss Type List Box On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-10-31-2017                              
	//============================================================================================
	public static WebElement RMAApp_Payment_Lst_LossType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cmbCoverageLossType")); //Unique Id Of Loss Type List Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Lst_Policy
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Policy List On Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-01-11-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Lst_Policy(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cmbPolicy")); //Unique Id Of Print Summary Link Inside DropdDown On Transaction Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Lst_DetailedTrackingClaimant
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Detailed Tracking Claimant On Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-01-11-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Lst_DetailedTrackingClaimant(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cboclaimant")); //Unique Id Of Detailed Tracking Claimant On Transaction Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PrintSingleCheck_Img_Print
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Image On RMA Application Payments->Print Single Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-22-2017                                  -
	//============================================================================================
	public static WebElement RMAApp_PrintSingleCheck_Img_Print(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='apscprint']/i")); //Unique Xpath Of Print Image On RMA Application Payments->Print Single Check Page Is Fetched
		return Element;	
	}	
	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Chk_FinalPayment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Final Payment Checkbox On Transaction History Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-22-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Chk_FinalPayment(WebDriver driver)
	{
		Element = driver.findElement(By.id("finalpaymentflag")); //Unique Id Of Transaction History Image On Transaction History Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Chk_Cleared
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cleared Checkbox On Payment Page On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-07-2017                                    
	//============================================================================================
	public static WebElement RMAApp_Payment_Chk_Cleared(WebDriver driver)
	{
		Element = driver.findElement(By.id("clearedflag")); //Unique Id Of Ok Image On Payments Page On RMA Application Payments Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ChecksAndEOB_Btn_checkBatchSaveIcon
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Icon On RMA Application Payments->Print Single Check->CheckAndEOB Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-23-2017                                  -
	//============================================================================================
	public static WebElement RMAApp_ChecksAndEOB_Btn_checkBatchSaveIcon(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='chcekBatchMsgInfoSaveIcon']")); //Unique Xpath Of OK Icon On RMA Application Payments->Print Single Check->CheckAndEOB Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ChecksAndEOB_Btn_SavePrintedChecksIcon
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Icon On RMA Application Payments->Print Single Check->CheckAndEOB->Save Printed Checks Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-23-2017                                  -
	//============================================================================================
	public static WebElement RMAApp_ChecksAndEOB_Btn_SavePrintedChecksIcon(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='I1']")); //Unique Xpath Of OK Icon On RMA Application Payments->Print Single Check->CheckAndEOB->Save Printed Checks Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Chk_Cleared
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cleared Check Box On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-24-2017                                  -
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Chk_Cleared(WebDriver driver)
	{
		Element = driver.findElement(By.id("clearedflag")); //Unique Id Of Cleared Check Box On RMA Application Payments Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Chk_CollectionFlag
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Collection CheckBox On RMA Application Collection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-25-2017                                
	//============================================================================================
	public static WebElement RMAApp_Payment_Chk_CollectionFlag(WebDriver driver)
	{
		Element = driver.findElement(By.id("collectionflag")); 
		return Element;		
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_Deposit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Deposit Text Box On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-25-2017                                    
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_Deposit(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("checknumber")); //Unique Id  Of Deposit Text Box  On RMA Application Payments Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Chk_Void
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void CheckBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-04-12-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Payment_Chk_Void(WebDriver driver)
	{
		Element = driver.findElement(By.id("voidflag")); 
		return Element;		
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which City TextBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-22-2018                  
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_City(WebDriver driver)
	{
		Element = driver.findElement(By.id("pye_city")); //Unique Id Of City	 TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_County
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which County TextBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-22-2018                  
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_County(WebDriver driver)
	{
		Element = driver.findElement(By.id("county")); //Unique Id Of County TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Btn On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-22-2018                  
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_State(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_pye_stateid_openlookup")); //Unique Id Of State TextBox On RMA Application Payments Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_Zip
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip TextBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-22-2018                  
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_Zip(WebDriver driver)
	{
		Element = driver.findElement(By.id("pye_zipcode")); //Unique Id Of Zip TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country Button On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-22-2018                  
	//==================================================================	==========================
	public static WebElement RMAApp_PaymentCollection_Btn_Country(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_pye_countrycode_openlookup")); //Unique Id Of Country TextBox On RMA Application Payments Page Is Fetched
		return Element;			
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InsufficientReserver_Btn_Saveclose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country Button On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-21-2018                  
	//==================================================================	==========================
	public static WebElement RMAApp_InsufficientReserver_Btn_Saveclose(WebDriver driver)
	{
		Element = driver.findElement(By.id("cancel")); //Unique Id Of Country TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Img_GoToTransactionHistory
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Transaction History Image Button On Transaction Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-31-2018                                   
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Img_GoToTransactionHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Go To Transaction History")); //Unique Id Of Transaction History Image Button On Transaction Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Img_CloseTransactionHistory
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Transaction History Close Image Button On Transaction Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-31-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Img_CloseTransactionHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='modal-content']/div/button")); //Unique Id Of Transaction History Close Image Button On Transaction Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_PV_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Text Box On PV On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                    
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_PV_Txt_LastName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_rmalookupfinanciallastname2_lastName']")); //Unique Id  Of Last Name Combo Box On PV On RMA Application Payments Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_EditFunds
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Payment Button On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-06-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_EditFunds(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("Edit")); //Unique Id  Of Edit Button On RMA Application Payments Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_CheckNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CheckNumber Text Box On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-27-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_CheckNumber(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("checknumber")); //Unique Id  Of CheckNumber Text Box  On RMA Application Payments Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_ClearWithholdingConfirmationSave
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Clear Withholding Confirmation Save Image On Linked Withholding Transactions Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-14-2018                                   
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_ClearWithholdingConfirmationSave(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click='ClearWithholdingConfirmationSave()']")); //Unique Id Of Clear Withholding Confirmation Save Image On Linked Withholding Transactions Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_VoidWithholdingConfirmationSave
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Void Withholding Confirmation Save Image On Linked Withholding Transactions Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-14-2018                                   
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_VoidWithholdingConfirmationSave(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click='VoidWithholdingConfirmationSave()']")); //Unique Id Of Void Withholding Confirmation Save Image On Linked Withholding Transactions Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_CheckNumberTransHistory
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Disability Category List On Transactions Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-23-2018                                   
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_CheckNumberTransHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-canvas']/div[@ng-style='Viewport.rowStyle(rowRenderIndex)']/div/div[3]/div/span")); //Unique Id Of Void Withholding Confirmation Save Image On Linked Withholding Transactions Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_List_DisabilityCategory
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Disability Category List On Transactions Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-11-2018                                   
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_List_DisabilityCategory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cmbdisablitycat")); //Unique Id Of Disability Loss Type List On Transactions Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_List_DisabilityLossType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Disability Loss Type List On Transactions Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-11-2018                                   
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_List_DisabilityLossType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("disabilitytype")); //Unique Id Of Void Withholding Confirmation Save Image On Linked Withholding Transactions Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_ClaimNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Number Text box On Transactions Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-11-2018                                   
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_ClaimNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_claimnumber")); //Unique Id Of Claim Number Text box On Transactions Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Reserve_Txt_Claimant
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant TextBox On RMA Application Reserve Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-27-2019                  
	//============================================================================================
	public static WebElement RMAApp_Reserve_Txt_Claimant(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_clm_lastname")); //Unique Id Of Zip TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Reserve_Txt_Claimant
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant Button On RMA Application Reserve Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-27-2019                  
	//============================================================================================
	public static WebElement RMAApp_Reserve_Btn_Claimant(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_clm_lastname")); //Unique Id Of Zip TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Btn_StopPayStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Stop Pay Status Lookup Button On Application Payment Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-11-2019                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Btn_StopPayStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_stoppaystatuscode_openlookup")); //Unique Id Of Stop Pay Status Lookup Button On Application Payment Creation Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Txt_StopPayStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Stop Pay Status Textbox On Application Payment Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-11-2019                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Txt_StopPayStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_stoppaystatuscode")); //Unique Id Of Stop Pay Status Textbox On Application Payment Creation Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Txt_StopPayReason
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Stop Pay Reason Textbox On Application Payment Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-11-2019                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Txt_StopPayReason(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_stoppaycodereason")); //Unique Id Of Stop Pay Reason Textbox On Application Payment Creation Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Btn_StopPayReason
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Stop Pay Reason Lookup Button On Application Payment Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-11-2019                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Btn_StopPayReason(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_stoppaycodereason_openlookup")); //Unique Id Of Stop Pay Reason Lookup Button On Application Payment Creation Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Lnk_FirstPartialLinkCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Partial Link Description From Any Lookup Window On Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-11-2019                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Lnk_FirstPartialLinkCode(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-cell-contents ng-scope']/span")); //Unique Id Of First Partial Link Description From Any Lookup Window On Application Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Chk_StopPay
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Stop Pay Checkbox On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-11-2019                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Chk_StopPay(WebDriver driver)
	{
		Element = driver.findElement(By.id("stoppayflag")); //Unique Id Of Stop Pay Checkbox On Payment Screen Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_ConrolNumberTransHistory
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Disability Category List On Transactions Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-23-2018                                   
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_ControlNumberTransHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='a_bold ng-binding' and @role='button']")); //Unique Id Of Void Withholding Confirmation Save Image On Linked Withholding Transactions Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Chk_ReadyToPrint
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ready To Print Checkbox On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-02-2019                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Chk_ReadyToPrint(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("readytoprint"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Stop Pay Checkbox On Payment Screen Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Btn_ReadyToPrintOK
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ready To Print OK Button On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-02-2019                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Btn_ReadyToPrintOK(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@ng-click='ReadyToPrintSave()']/i")); //Unique Id Of Stop Pay Checkbox On Payment Screen Is Fetched
		return Element;		
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_TransSplit_Btn_SplitDelete
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Delete Split On Transaction Split Tab On Payment Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-02-2019                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_TransSplit_Btn_SplitDelete(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("Delete"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Delete Split On Transaction Split Tab On Payment Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Transaction_Img_ClonePrintedCheck
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Clone Of Printed Check Image On Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-03-2020                                
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Transaction_Img_ClonePrintedCheck(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("Clone Image of Printed Check"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Img_PrintSummary
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Summary Image On Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-04-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Transaction_Img_PrintSummary(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("Print Summary")); //Unique Id Of Print Summary Image On Transaction Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Img_PayeeExperience
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Payee Experience Image On Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-04-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Transaction_Img_PayeeExperience(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("Payee Experience")); //Unique Id Of Payee Experience Image On Transaction Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return Element;
	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PayeeExperience_Tbl
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payee Experience Table On RMA Application UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                                
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_PayeeExperience_Tbl(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd ng-scope']//tbody")); //Unique Id Of Payee Experience Table On RMA Application UX Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PayeeExperience_Btn_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Image Button On Payee Experience Window On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_PayeeExperience_Btn_Close(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@value=' Close ' and @type = 'button']")); 
		}catch (Exception|Error e) {	
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Txt_PayToTheOrderOf
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pay To The Order Of TextBox On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Txt_PayToTheOrderOf(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='paytotheorder']//*[contains(@role,'textbox')]")); //Unique Id Of Pay To The Order Of TextBox On Payment Screen Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Btn_PayToTheOrderOf
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pay To The Order Of Button On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Btn_PayToTheOrderOf(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='paytotheorder']//*[contains(@index,'1')]")); //Unique Id Of Pay To The Order Of Button On Payment Screen Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PayToTheOrderOf_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Button On Pay To The Order Of Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                  
	//============================================================================================
	public static WebElement RMAApp_PayToTheOrderOf_Btn_Ok(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click = 'save()']"));
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PayToTheOrderOf_Btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Button On Pay To The Order Of Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                  
	//============================================================================================
	public static WebElement RMAApp_PayToTheOrderOf_Btn_Cancel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click = 'cancel()' and  @class = 'anchorLookupIcon']"));
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PayToTheOrderOf_Btn_Print
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Button On Pay To The Order Of Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                  
	//============================================================================================
	public static WebElement RMAApp_PayToTheOrderOf_Btn_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click = 'print()' or @ng-click = 'Print()']"));
		return Element;		
	}


	//============================================================================================
	//FunctionName 			: RMAApp_PayToTheOrderOf_Btn_Preview
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Preview Button On Pay To The Order Of Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                  
	//============================================================================================
	public static WebElement RMAApp_PayToTheOrderOf_Btn_Preview(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click = 'preview()']"));
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PayToTheOrderOf_Txt_Preview
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Preview Text On Pay To The Order Of Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                  
	//============================================================================================
	public static WebElement RMAApp_PayToTheOrderOf_Txt_Preview(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id = 'divNotesText']"));
		return Element;		
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Btn_GeneratePaytotheOrderOf
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generate Pay to the Order Of Button On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                 
	//============================================================================================
	public static WebElement RMAApp_Transaction_Btn_GeneratePaytotheOrderOf(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Generate Pay to the Order Of']")); //Unique Id Of Generate Pay to the Order Of Button On Payment Screen Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GeneratePaytotheOrderOf_Txt_Payee
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generate Pay to the Order Of Button On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                  
	//============================================================================================
	public static WebElement RMAApp_GeneratePaytotheOrderOf_Txt_Payee(WebDriver driver,String RowNumber )
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class = 'table table-hover filterPadd']//tbody/tr["+RowNumber+"]/td[1]")); //Unique Id Of Generate Pay to the Order Of Button On Payment Screen Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GeneratePaytotheOrderOf_Lst_PayeePhrLoc
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generate Pay to the Order Of Button On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                  
	//============================================================================================
	public static WebElement RMAApp_GeneratePaytotheOrderOf_Lst_PayeePhrLoc(WebDriver driver,String RowNumber )
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id = 'payeeLocation+"+RowNumber+"']")); //Unique Id Of Generate Pay to the Order Of Button On Payment Screen Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GeneratePaytotheOrderOf_Lst_PayeePhrase
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generate Pay to the Order Of Button On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                
	//============================================================================================
	public static WebElement RMAApp_GeneratePaytotheOrderOf_Lst_PayeePhrase(WebDriver driver,String RowNumber )
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id = 'payeePhrase+"+RowNumber+"']")); //Unique Id Of Generate Pay to the Order Of Button On Payment Screen Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GeneratePaytotheOrderOf_Txt_Preview
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generate Pay to the Order Of Button On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                
	//============================================================================================
	public static WebElement RMAApp_GeneratePaytotheOrderOf_Txt_Preview(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-bind='vm.previewText']")); //Unique Id Of Generate Pay to the Order Of Button On Payment Screen Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GeneratePaytotheOrderOf_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generate Pay to the Order Of Button On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020               
	//============================================================================================
	public static WebElement RMAApp_GeneratePaytotheOrderOf_Btn_Save(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click = 'vm.save();']")); //Unique Id Of Generate Pay to the Order Of Button On Payment Screen Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GeneratePaytotheOrderOf_Btn_Preview
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generate Pay to the Order Of Button On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                  
	//============================================================================================
	public static WebElement RMAApp_GeneratePaytotheOrderOf_Btn_Preview(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click = 'vm.preview();']")); //Unique Id Of Generate Pay to the Order Of Button On Payment Screen Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GeneratePaytotheOrderOf_Btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generate Pay to the Order Of Button On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2020                  
	//============================================================================================
	public static WebElement RMAApp_GeneratePaytotheOrderOf_Btn_Cancel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click = 'vm.close();']")); //Unique Id Of Generate Pay to the Order Of Button On Payment Screen Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_MailToState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Btn On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-10-2020
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_MailToState(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_mailto_stateid_openlookup")); //Unique Id Of State TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_MailToCountry
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Btn On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-10-2020
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_MailToCountry(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_mailto_countrycode_openlookup")); //Unique Id Of State TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Btn On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-10-2020
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_State(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_pye_stateid")); //Unique Id Of State TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_MailToState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Btn On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-10-2020
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_MailToState(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_mailto_stateid")); //Unique Id Of State TextBox On RMA Application Payments Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Chk_AutoCheckFlag
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Auto Check CheckBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-20-2020
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Chk_AutoCheckFlag(WebDriver driver)
	{
		Element = driver.findElement(By.id("autocheckflag")); //Unique Id Of Auto Check CheckBox On RMA Application Payments Page Is Fetched
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_LastName_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Text Box On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-20-2020                                    
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_LastName_AddNew(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Add New']")); //Unique Id  Of Last Name Combo Box  On RMA Application Payments Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_LastName_AddNew_Entity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Text Box On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-20-2020                                    
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_LastName_AddNew_Entity(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@aria-label='entity']")); //Unique Id  Of Last Name Combo Box  On RMA Application Payments Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Txt_TaxID
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tax ID Text Box On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-20-2020
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Txt_TaxID(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='pye_taxid']"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return Element;		
	}


	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_TaxIDLoadEntity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Load Entity Button Adjacent To Tax ID On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-20-2020
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_TaxIDLoadEntity(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='btnEntity_pye_taxid']"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_TaxIDEditTaxID
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Tax ID Button Adjacent To Tax ID On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-20-2020
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_TaxIDEditTaxID(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='btnEdit_pye_taxid']"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return Element;		
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Btn_ReadyToPrintCancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ready To Print Cancel Button On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-13-2020                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Btn_ReadyToPrintCancel(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@ng-click='ReadyToPrintCancel()']/i")); //Unique Id Of Ready To Print Cancel Butto On Payment Screen Is Fetched
		return Element;		
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_Transaction_Btn_ReadyToPrintPreview
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ready To Print Preview Button On Payment Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-13-2020                  
	//============================================================================================
	public static WebElement RMAApp_Transaction_Btn_ReadyToPrintPreview(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@ng-click='ReadyToPrintPreview()']/i")); //Unique Id Of Ready To Print Preview Butto On Payment Screen Is Fetched
		return Element;		
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_PaymentCollection_Btn_VoidReissueReasonButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void Reissue Reason Lookup Button On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-20-2020                           
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_VoidReissueReasonButton(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btn_lookup_ReissueReason_openlookup")); //Unique Id  Of Void Reissue Reason Lookup Button On RMA Application Payments Page Is Fetched
		return Element;

	}
	/*//============================================================================================
//FunctionName 			: RMAApp_LastName_Lst_LastNameSelection
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LastName Selector On LastName Window On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-26-2015                                 
//============================================================================================
public static WebElement RMAApp_LastName_Lst_LastNameSelection(WebDriver driver)
{
	Element = driver.findElement(By.id("optResults")); //Unique Id  Of LastName Selector On LastName Window On RMA Application Payments Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LastName_Btn_ChooseHighLighted
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Choose HighLighted Button On LastName Window On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-26-2015                                 
//============================================================================================
public static WebElement RMAApp_LastName_Btn_ChooseHighLighted(WebDriver driver)
{
	Element = driver.findElement(By.id("cmdSubmit1")); //Unique Id  Of Choose HighLighted Button On LastName Window On RMA Application Payments Page Is Fetched
	return Element;
}


//============================================================================================
//FunctionName 			: RMAApp_Payment_Err_SprApprovalHoldText
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Hold Requiring SuperVisory Approval Error Message On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-12-22-2015                                 
//============================================================================================
public static WebElement RMAApp_Payment_Err_SprApprovalHoldText(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='lblError']/table/tbody/tr/td[2]/ul/li")); //Unique Id Of Hold Requiring SuperVisory Approval Error Message On RMA Application Payments Page Is Fetched
	return Element;		
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Btn_CheckStatusLookUp
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Status LookUp Button On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-01-28-2016                                 
//============================================================================================
public static WebElement RMAApp_Payment_Btn_CheckStatusLookUp(WebDriver driver)
{
	Element = driver.findElement(By.id("checkstatuscode_codelookupbtn")); //Unique Id Of Check Status Lookup Button On RMA Application Payments Page Is Fetched
	return Element;		
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Btn_CheckStatusLookUp
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back To Financial Button On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-01-28-2016                                 
//============================================================================================
public static WebElement RMAApp_Payment_Img_BackToFinancials(WebDriver driver)
{
	Element = driver.findElement(By.id("backtofinancials")); //Unique Id Of Back To Financial Button On RMA Application Payments Page Is Fetched
	return Element;		
}
//============================================================================================
//FunctionName 			: RMAApp_Payment_Err_SprApprovalHoldTextCollection
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Hold Message On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-03-02-2016                                 
//============================================================================================
public static WebElement RMAApp_Payment_Err_SprApprovalHoldTextCollection(WebDriver driver, int TextPosition)
{
	Element = driver.findElement(By.xpath(".//*[@id='lblError']/table/tbody/tr/td[2]/ul/li["+TextPosition+"]")); 
	return Element;		
}
//============================================================================================
//FunctionName 			: RMAApp_Payment_Chk_Void
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void CheckBox On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-04-12-2016                                 
//============================================================================================
public static WebElement RMAApp_Payment_Chk_Void(WebDriver driver)
{
	Element = driver.findElement(By.id("voidflag")); 
	return Element;		
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Chk_MailToSameAsPayee
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which MailToSameAsPayee CheckBox On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-06-2016                                 
//============================================================================================
public static WebElement RMAApp_Payment_Chk_MailToSameAsPayee(WebDriver driver)
{
	Element = driver.findElement(By.id("mailtopye")); //Unique Id Of MailToSameAsPayee CheckBox On RMA Application Payments Page Is Fetched
	return Element;		
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Img_PrintCheck
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Check Image On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-06-2016                                    
//============================================================================================
public static WebElement RMAApp_Payment_Img_PrintCheck(WebDriver driver)
{
	Element = driver.findElement(By.id("printcheck")); //Unique Id Of Print Check Image On RMA Application Payments Page Is Fetched
	return Element;	
}


//============================================================================================
//FunctionName 			: RMAApp_Payment_Img_TransactionHistory
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Transaction History Image On Transaction History Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-15-2016                                 
//============================================================================================
public static WebElement RMAApp_Payment_Img_TransactionHistory(WebDriver driver)
{
	Element = driver.findElement(By.id("PaymentHistory")); //Unique Id Of Transaction History Image On Transaction History Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Chk_FinalPayment
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Final Payment Checkbox On Transaction History Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-22-2016                                 
//============================================================================================
public static WebElement RMAApp_Payment_Chk_FinalPayment(WebDriver driver)
{
	Element = driver.findElement(By.id("finalpaymentflag")); //Unique Id Of Transaction History Image On Transaction History Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Img_CopyTransaction
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Copy Transaction Image On Transaction Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-09-2017                                 
//============================================================================================
public static WebElement RMAApp_Payment_Img_CopyTransaction(WebDriver driver)
{
	Element = driver.findElement(By.id("Clone")); //Unique Id Of Copy Transaction Image On Transaction Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Img_PrintPreview
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Preview Image On Transaction Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-19-2017                                 
//============================================================================================
public static WebElement RMAApp_Payment_Img_PrintPreview(WebDriver driver)
{
	Element = driver.findElement(By.id("printpre")); //Unique Id Of Print Preview Image On Transaction Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Img_PrintSummary
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Summary Image On Transaction Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-24-2017                                 
//============================================================================================
public static WebElement RMAApp_Payment_Img_PrintSummary(WebDriver driver)
{
	Element = driver.findElement(By.id("printsummary")); //Unique Id Of Print Summary Image On Transaction Page Is Fetched
	return Element;
}
	 */}


