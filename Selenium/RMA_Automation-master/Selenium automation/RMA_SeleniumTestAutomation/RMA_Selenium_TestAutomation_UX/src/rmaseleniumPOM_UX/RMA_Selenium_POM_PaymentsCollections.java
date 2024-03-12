package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_PaymentsCollections {
	public static WebElement Element;

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
	//FunctionName 			: RMAApp_PaymentCollection_Btn_AddNewFunds
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Payment Button On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                 
	//============================================================================================
	public static WebElement RMAApp_PaymentCollection_Btn_AddNewFunds(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cruduiGridAddBtn")); //Unique Id  Of Add New Button On RMA Application Payments Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[text()='Last Name']//following::input[1]")); //Unique Id  Of Last Name Combo Box  On RMA Application Payments Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[@class='dropdown-menu']//*[contains(text(),'"+DDMenuName+"')]")); //Unique Id Of Drop Down Menu Image Button On RMA Application Claim Page Is Fetched
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
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='Print Preview']/i")); //Unique Id Of Print Preview Image On Transaction Page Is Fetched
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
		Element = driver.findElement(By.id("btn_pye_stateid")); //Unique Id Of State TextBox On RMA Application Payments Page Is Fetched
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
		Element = driver.findElement(By.id("btn_pye_countrycode")); //Unique Id Of Country TextBox On RMA Application Payments Page Is Fetched
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


