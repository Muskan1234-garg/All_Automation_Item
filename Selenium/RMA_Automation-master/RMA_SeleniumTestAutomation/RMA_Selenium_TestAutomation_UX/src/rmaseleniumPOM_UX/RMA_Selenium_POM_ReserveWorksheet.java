package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_ReserveWorksheet {
	public static WebElement Element;

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheet
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Button On RMA Application Financials/Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheet(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Reserve Worksheet']/i")); //Unique Id Of Reserve WorkSheet Button On RMA Application Financials/Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet History Button On RMA Application Financials/Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Reserve Worksheet History']/i")); //Unique Id Of Reserve WorkSheet History Button On RMA Application Financials/Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_SaveReserveWorkSheet
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_SaveReserveWorkSheet(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCarrierSave' or @id='btnSave' or @id='Button1']")); //Unique Id Of Save Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_SubmitReserveWorkSheet
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Submit Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_SubmitReserveWorkSheet(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnSubmit")); //Unique Id Of Submit Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_ApproveReserveWorkSheet
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Approve Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_ApproveReserveWorkSheet(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnApprove")); //Unique Id Of Approve Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_RejectReserveWorkSheet
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reject Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_RejectReserveWorkSheet(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnReject")); //Unique Id Of Reject Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_ClearReserveWorkSheet
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Clear Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_ClearReserveWorkSheet(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnClear")); //Unique Id Of Clear Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_PrintReserveWorkSheet
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_PrintReserveWorkSheet(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnPrint")); //Unique Id Of Print Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_ConfigureReserveWorkSheet
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Configure Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_ConfigureReserveWorkSheet(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='A1']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Configure Reserve WorkSheet Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Tab_ReserveWorkSheetTab
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Current Reserve Balance TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, ReserveType Variable Of Type String	 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Tab_ReserveWorkSheetTab(WebDriver driver,String ReserveType)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+ReserveType+"')]")); //Unique Id Of Current Reserve Balance TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Txt_CurrentPaidToDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Current Paid To Date TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Txt_CurrentPaidToDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Current Paid to Date')]/ancestor::div[5]/div[2]/div/ng-switch/div/div/rmacurrencycontrol/div/input")); //Unique Id Of Current Paid To Date TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Txt_CurrentReserveBalance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Current Reserve Balance TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Txt_CurrentReserveBalance(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Current Reserve Balance')]/ancestor::div[5]/div[2]/div/ng-switch/div/div/rmacurrencycontrol/div/input")); //Unique Id Of Current Reserve Balance TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Txt_CurrentTotalReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Current Total Reserve TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Txt_CurrentTotalReserve(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Current Total Reserve')]/ancestor::div[5]/div[2]/div/ng-switch/div/div/rmacurrencycontrol/div/input")); //Unique Id Of Current Current Total Reserve TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Txt_TransactionPaidToDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type Paid To Date TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	, TransType Variable Of Type String
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Txt_TransactionPaidToDate(WebDriver driver ,String TransType)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+TransType+"')]/ancestor::div[5]/div[2]/div/ng-switch/div/div/rmacurrencycontrol/div/input")); //Unique Id Of Transaction Type Paid To Date TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Txt_TransactionNewReserveBalance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type Paid To Date TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	, TransType Variable Of Type String
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Txt_TransactionNewReserveBalance(WebDriver driver ,String TransType)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+TransType+"')]/ancestor::div[5]/div[3]/div/ng-switch/div/div/rmacurrencycontrol/div/input")); //Unique Id Of Transaction Type Paid To Date TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Txt_TransactionNewTotalReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which New Total Reserve TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	, TransType Variable Of Type String
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Txt_TransactionNewTotalReserve(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'New Total Reserve')]/ancestor::div[5]/div[3]/div/ng-switch/div/div/rmacurrencycontrol/div/input")); //Unique Id Of New Total Reserve TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Txt_TransactionNewReserveBalance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which New Reserve Balance TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	, TransType Variable Of Type String
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Txt_TransactionNewReserveBalance(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'New Reserve Balance')]/ancestor::div[5]/div[3]/div/ng-switch/div/div/rmacurrencycontrol/div/input")); //Unique Id Of New Reserve Balance TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Txt_TransactionNewReserveAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type New Reserve Amount TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	, TransType Variable Of Type String
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Txt_TransactionNewReserveAmount(WebDriver driver ,String TransType)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+TransType+"')]/ancestor::div[5]/div[5]/div/ng-switch/div/div/rmacurrencycontrol/div/input")); //Unique Id Of Transaction Type New Reserve Amount TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Txt_ReserveWorkSheetReason
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Reason TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Txt_ReserveWorkSheetReason(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'_ReserveWorksheetReason')]/p/span/input")); //Unique Id Of Reserve WorkSheet Reason  TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetReasonLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Reason Lookup Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetReasonLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'_ReserveWorksheetReason')]/p/span")); //Unique Id Of Reserve WorkSheet Reason Lookup Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Txt_ReserveWorkSheetAssignedAdjuster
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Assigned Adjuster TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Txt_ReserveWorkSheetAssignedAdjuster(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'_ReserveWorksheetAdjuster')]/div/p/input")); //Unique Id Of Reserve WorkSheet Assigned Adjuster  TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetAssignedAdjusterLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Assigned Adjuster Lookup Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetAssignedAdjusterLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'_ReserveWorksheetAdjuster')]/div/p/span")); //Unique Id Of Reserve WorkSheet Assigned Adjuster Lookup Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Txt_ReserveWorkSheetComments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Comments TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Txt_ReserveWorkSheetComments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'_Comments')]/div/textarea")); //Unique Id Of Reserve WorkSheet Comments TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetCommentsButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Comments Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetCommentsButton(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'_Comments')]/div/span/button")); //Unique Id Of Reserve WorkSheet Comments Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetCommentsOk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Comments Ok Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - NikitaThani-04-04-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetCommentsOk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='usericon']/i")); //Unique Id Of Reserve WorkSheet Comments Ok Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Lst_LOB
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Line Of Business List On RMA Application Line Of Business Parameter Setup Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision			: 0.0 - NikitaThani-04-04-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Lst_LOB(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstLOB")); //Unique Id  Of Line Of Business List On RMA Application Line Of Business Parameter Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Chk_UseReserveWorkSheet
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Reserve WorkSheet CheckBox On RMA Application Line Of Business Parameter Setup Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision			: 0.0 - NikitaThani-04-04-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Chk_UseReserveWorkSheet(WebDriver driver)
	{
		Element = driver.findElement(By.id("ChkUseRSW")); //Unique Id  Of Use Reserve WorkSheet CheckBox On RMA Application Line Of Business Parameter Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Chk_AttchPDF
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Attach PDF CheckBox On RMA Application Line Of Business Parameter Setup Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision			: 0.0 - NikitaThani-04-04-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Chk_AttchPDF(WebDriver driver)
	{
		Element = driver.findElement(By.id("ChkAttRSW")); //Unique Id  Of Use Reserve WorkSheet Attach PDF CheckBox On RMA Application Line Of Business Parameter Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Ddl_ReserveType
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Reserve Type DropDown List On RMA Application Reserve WorkSheet Configuration Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision			: 0.0 - NikitaThani-04-04-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Ddl_ReserveType(WebDriver driver)
	{
		Element = driver.findElement(By.id("ddlReserveType")); //Unique Id  Of Reserve WorkSheet Reserve Type DropDown List On RMA Application Reserve WorkSheet Configuration Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Btn_AddReserveType
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Add Reserve Type Button On RMA Application Reserve WorkSheet Configuration Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision			: 0.0 - NikitaThani-04-04-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_AddReserveType(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnAdd")); //Unique Id  Of Use Reserve WorkSheet Add Reserve Type Button On RMA Application Reserve WorkSheet Configuration Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Lst_ReserveType
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Reserve Type List On RMA Application Reserve WorkSheet Configuration Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision			: 0.0 - NikitaThani-04-04-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Lst_ReserveType(WebDriver driver)
	{
		Element = driver.findElement(By.id("LstReservetype")); //Unique Id  Of Reserve WorkSheet Reserve Type List On RMA Application Reserve WorkSheet Configuration Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Lst_TransactionType
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Transaction Type List On RMA Application Reserve WorkSheet Configuration Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision			: 0.0 - NikitaThani-04-04-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Lst_TransactionType(WebDriver driver)
	{
		Element = driver.findElement(By.id("LstTransType")); //Unique Id  Of Reserve WorkSheet Transaction Type List On RMA Application Reserve WorkSheet Configuration Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Btn_Submit
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Transaction Type Submit Button On RMA Application Reserve WorkSheet Configuration Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision			: 0.0 - NikitaThani-04-04-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_Submit(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnSNext")); //Unique Id  Of Reserve WorkSheet Transaction Type Submit Button On RMA Application Reserve WorkSheet Configuration Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Chk_UseCustomizationSetting
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Customization Settings CheckBox On RMA Application Reserve WorkSheet Configuration Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision			: 0.0 - NikitaThani-04-04-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Chk_UseCustomizationSetting(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='chkSettings' or @id='checkboxSetting']")); //Unique Id  Of Use Customization Settings CheckBox On RMA Application Reserve WorkSheet Configuration Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Btn_DeleteReserveType
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Reserve Type Button On RMA Application Reserve WorkSheet Configuration Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision			: 0.0 - NikitaThani-04-04-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_DeleteReserveType(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("btnDelete"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id  Of Delete Reserve Type Button On RMA Application Reserve WorkSheet Configuration Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetTabOpen
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Comments Ok Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - ShrutiShruti-04-08-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetTabOpen(WebDriver driver, String TabName)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+TabName+"')]/i[@class='pull-right glyphicon glyphicon-chevron-down']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Reserve WorkSheet Comments Ok Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetTabClose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Comments Ok Button On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - ShrutiShruti-04-08-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetTabClose(WebDriver driver, String TabName)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+TabName+"')]/i[@class='pull-right glyphicon glyphicon-chevron-up']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Reserve WorkSheet Comments Ok Button On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Txt_ReserveWorkSheetCommentsTextbox
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Comments TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - ShrutiShruti-04-08-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Txt_ReserveWorkSheetCommentsTextbox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("newTextComments")); //Unique Id Of Reserve WorkSheet Comments TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Lbl_NumberOfPendingRWS
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Comments TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - ShrutiShruti-04-09-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Lbl_NumberOfPendingRWS(WebDriver driver,String TabName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+TabName+"')]//ancestor::div[2]/rmauigrid//*[@class = 'ui-grid-footer-info ui-grid-grid-footer ng-scope']/span")); //Unique Id Of Reserve WorkSheet Comments TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_CloseRWSHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Comments TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - ShrutiShruti-04-09-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_CloseRWSHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class= 'glyphicon glyphicon-remove closeBtn']")); //Unique Id Of Reserve WorkSheet Comments TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Btn_AddNewOnRSWHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Comments TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - ShrutiShruti-04-09-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_AddNewOnRSWHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='addicon']/i")); //Unique Id Of Reserve WorkSheet Comments TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Table_RserveSummaryTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve WorkSheet Comments TextBox On RMA Application Reserves WorkSheet Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	
	//Revision				: 0.0 - ShrutiShruti-04-10-2019                                      
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Table_RserveSummaryTable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover ng-scope']/tbody")); //Unique Id Of Reserve WorkSheet Comments TextBox On RMA Application Reserves WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_CustomizeReserveWorkSheet_Ddl_ReserveType
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Customize Reserve WorkSheet Reserve Type DropDown List On RMA Application Reserve WorkSheet Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision			: 0.0 - NikitaThani-10-04-2019                                     
	//============================================================================================
	public static WebElement RMAApp_CustomizeReserveWorkSheet_Ddl_ReserveType(WebDriver driver)
	{
		Element = driver.findElement(By.id("ddlReserType ")); //Unique Id  Of Customize Reserve WorkSheet Reserve Type DropDown List On RMA Application Reserve WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_CustomizeReserveWorkSheet_Chk_TransactionType
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type CheckBox On RMA Application Customize Reserve WorkSheet Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver, TransType Variable Of Type String	 
	//Revision			: 0.0 - NikitaThani-10-04-2019                                     
	//============================================================================================
	public static WebElement RMAApp_CustomizeReserveWorkSheet_Chk_TransactionType(WebDriver driver, String TransType)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+TransType+"')]/ancestor::li/input")); //Unique Id  Of Transaction Type CheckBox On RMA Application Customize Reserve WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_CustomizeReserveWorkSheet_Chk_TransactionType
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type CheckBox On RMA Application Customize Reserve WorkSheet Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver, TransType Variable Of Type String	 
	//Revision			: 0.0 - NikitaThani-04-10-2019                                     
	//============================================================================================
	public static WebElement RMAApp_CustomizeReserveWorkSheet_Btn_Print(WebDriver driver, String TransType)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btnPrint']/i")); //Unique Id  Of Transaction Type CheckBox On RMA Application Customize Reserve WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Tab_WorkSheetApproval_1
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which WorkSheet Approval Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver, TransType Variable Of Type String	 
	//Revision			: 0.0 - NikitaThani-04-10-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Tab_WorkSheetApproval_1(WebDriver driver)
	{
		try {
			Element = driver.findElement(By.xpath(".//*[@class='nav nav-pills']/li[3]")); //Unique Id  Of WorkSheet Approval Tab On RMA Application Supervisory Approval Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Tab_WorkSheetApproval_2
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Hidden WorkSheet Approval Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver, TransType Variable Of Type String	 
	//Revision			: 0.0 - NikitaThani-04-10-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Tab_WorkSheetApproval_2(WebDriver driver)
	{
		try {
			Element = driver.findElement(By.xpath(".//*[@class='nav nav-pills']/*[@class='ng-hide']")); //Unique Id  Of Hidden WorkSheet Approval Tab On RMA Application Supervisory Approval Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Btn_CreateReserveWorkSheet
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Create Reserve WorkSheet Button On RMA Application Carrier Reserve WorkSheet Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver	 
	//Revision			: 0.0 - NikitaThani-04-23-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_CreateReserveWorkSheet(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btnCreate']/i")); //Unique Id  Of Create Reserve WorkSheet Button On RMA Application Carrier Reserve WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_ReserveWorkSheet_Btn_SaveReserve
	//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Reserve Button On RMA Application Carrier Reserve WorkSheet Page Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver	 
	//Revision			: 0.0 - NikitaThani-04-23-2019                                     
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Btn_SaveReserve(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='Button1']/i")); //Unique Id  Of Save Reserve Button On RMA Application Carrier Reserve WorkSheet Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Lst_ReserveSetUpPolicy
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Policy List On Reserve Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-23-2019                                
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Lst_ReserveSetUpPolicy(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.id("cmbpolicy")); //Unique Id Of Policy List On Reserve Set Up Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Lst_ReserveSetUpUnit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit List On Reserve Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-23-2019                               
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Lst_ReserveSetUpUnit(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.id("cmbunit")); //Unique Id Of Unit List On Reserve Set Up Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Lst_ReserveSetUpCoverageType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Coverage Type List On Reserve Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-23-2019                               
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Lst_ReserveSetUpCoverageType(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.id("cmb.coveragetype")); //Unique Id Of Coverage Type List On Reserve Set Up Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Lst_ReserveSetUpDisabilityCategory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Category List On Reserve Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-23-2019                               
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Lst_ReserveSetUpDisabilityCategory(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='cmblosstype' and @ng-model='modalvm.cmbdisablitycatList']")); //Unique Id Of Disability Category List On Reserve Set Up Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Lst_ReserveSetUpDisabilityLossType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Loss Type List On Reserve Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-23-2019                               
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Lst_ReserveSetUpDisabilityLossType(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='cmblosstype' and @ng-model='modalvm.cmbdisabilityLossList1']")); //Unique Id Of Disability Loss Type List On Reserve Set Up Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Lst_ReserveSetUpReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Type List On Reserve Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-23-2019                               
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Lst_ReserveSetUpReserveType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='cmblosstype' and @ng-model='modalvm.cmbReserveTypeList']")); //Unique Id Of Reserve Type List On Reserve Set Up Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Lst_ReserveSetUpLossType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Loss Type List On Reserve Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-06-2019                               
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Lst_ReserveSetUpLossType(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='cmblosstype' and @ng-model='modalvm.cmbCoverageLossTypeList']")); //Unique Id Of  Loss Type List On Reserve Set Up Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveWorkSheet_Lst_ReserveSetUpReserveSubType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Type List On Reserve Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-23-2019                               
	//============================================================================================
	public static WebElement RMAApp_ReserveWorkSheet_Lst_ReserveSetUpReserveSubType(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='cmblosstype' and @ng-model='modalvm.cmbReserveSubTypeList']")); //Unique Id Of Reserve Type List On Reserve Set Up Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}



}
