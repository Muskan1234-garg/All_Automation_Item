package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_FinancialReserves {
	public static WebElement Element;

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Txt_ReserveAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Amount TextBox On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ReserveCreation_Txt_ReserveAmount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='txtAmount' and @ type='text']")); //Unique Id  Of Reserve Amount TextBox On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Txt_ReserveBalance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Amount TextBox On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-05-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ReserveCreation_Txt_ReserveBalance(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='txtReserveBalance' and @ type='text']")); //Unique Id  Of Reserve Amount TextBox On RMA Application Financial Reserves Page Is Fetched
		return Element;

	}
	//============================================================================================
	//FunctionName 			: RMAApp_IsFirstFinalTxt_TransactionHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which IsFirstFinal Text On Transaction History Image On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannathhussain-03-06-2018                              
	//============================================================================================
	public static WebElement RMAApp_IsFirstFinalTxt_TransactionHistory(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='isFirstFinal']")); //Unique Id Of IsFirstFinal Text On Transaction History Image On RMA Application Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FinalPayment_Flag
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Number Text Box On RMA Application Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannathhussain-22-05-2018                                
	// ============================================================================================
	public static WebElement RMAApp_CheckNumber_Text(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("checknumber")); //Unique Id  Of Check Number Text Box On RMA Application Transaction Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_IsFirstFinalLbl_TransactionHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which IsFirstFinal Column On Transaction History Image On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannathhussain-03-06-2018                              
	//============================================================================================
	public static WebElement RMAApp_IsFirstFinalLbl_TransactionHistory(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath("//*[contains(text(),'IsFirstFinal')]")); //Unique Id Of IsFirstFinal Column On Transaction History Image On RMA Application Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_FinalPayment_Flag
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Final Payment Check Box On RMA Application Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannathhussain-22-05-2018                                
	// ============================================================================================
	public static WebElement RMAApp_ManualPrint_Okbutton(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnRoll")); //Unique Id  Of Final Payment Check Box On RMA Application Transaction Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Btn_AddReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Reserve Button On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                
	// ============================================================================================
	public static WebElement RMAApp_ReserveCreation_Btn_AddReserve(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("AddReserve")); //Unique Id  Of Add Reserve Button On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FinalPayment_Flag
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Final Payment Check Box On RMA Application Transaction Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannathhussain-22-05-2018                                
	// ============================================================================================
	public static WebElement RMAApp_FinalPayment_Flag(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("finalpaymentflag")); //Unique Id  Of Final Payment Check Box On RMA Application Transaction Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Lst_ReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Type List Box On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                              
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Lst_ReserveType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cmbReserveType")); //Unique Id Of Reserve Type List Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Lst_Status
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveStatus DropDown On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ReserveCreation_Lst_Status (WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cmbStatusAdd")); //Unique Id  Of Reserve Status DropDown On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Txt_DateEntered
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Entered Text Box On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Txt_DateEntered (WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("dateentered")); //Unique Id  Of Date Entered Text Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Btn_Code
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Code Button On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-06-2017                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Btn_Code(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btn_supp_code_code")); //Unique Id  Of Code Button On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Btn_AddReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Reserve Button On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannatghhussain-06-25-2018                                
	// ============================================================================================
	public static WebElement RMAApp_ControlNumber_Link_On_TransactionHist(WebDriver driver,String StrControlNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[contains(text(),'"+StrControlNumber+"')]")); //Unique Id  Of Add Reserve Button On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - RenuVerma-06-06-2017                                
	//============================================================================================
	public static WebElement RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(WebDriver driver, String FilterBoxName)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[text()='"+FilterBoxName+"']/following::input[@class='ui-grid-filter-input ui-grid-filter-input-0'][1]")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGrid
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Header of Reserves NG Grid Table First Row Value of The Table On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, colHeadingName Of The Type String Signifying The ColumnHeading and ColVal Of The Type String Signifying The Column Value Of NG Grid To Which The WebElement Refers To		 
	//Revision				:0.0 - RenuVerma-06-06-2017                                  
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGrid(WebDriver driver, String colHeadingName)
	{
		Element=null;
		String ClassOfColNos=driver.findElement(By.xpath(".//*[@class='ui-grid-cell-contents ui-grid-header-cell-primary-focus']/*[contains(text(),'"+colHeadingName+"')]")).getAttribute("id"); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		// [@id='1496736590510-uiGrid-000K-header-text'] of header and first row of cell id [@id='1496736590510-0-uiGrid-000K-cell'] 
		String ColNos[]=ClassOfColNos.split("-");
		String GridNo=ColNos[0];	//Getting value 1496736590510
		String ColNo=ColNos[2]; // Getting value 000K
		Element = driver.findElement(By.xpath(".//*[@id='"+GridNo+"-0-uiGrid-"+ColNo+"-cell']//span")); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreationTbl_Btn_RestoreState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Restore State Button On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-06-2017                                   
	//============================================================================================
	public static WebElement RMAApp_ReserveCreationTbl_Btn_RestoreState(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.className("grid-restore-state")); //Unique Id  Of Restore State Button On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Chk_ReserveFirstRowSelection
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve First Row Selection CheckBox On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                  
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Chk_ReserveFirstRowSelection(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@id,'-0-uiGrid-')]//*[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id  Of Reserve First Row Selection CheckBox Button On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Btn_AddPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Payment Button On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_FinReserves_Btn_AddPayment(WebDriver driver)
	{
		Element = driver.findElement(By.id("MakePayment")); //Unique Id  Of Add Payment Button On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Lst_TransactionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TransactionType DropDown On RMA Application FundsSplitDetails Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                 
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Lst_TransactionType (WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cmbTransactionType")); //Unique Id  Of TransactionType DropDown On RMA Application FundsSplitDetails Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Txt_Amount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount TextBox On RMA Application FundsSplitDetails Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                           
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Txt_Amount(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='amount' and @type='text']")); //Unique xpath  Of Amount TextBox On RMA Application FundsSplitDetails Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_List_ReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType From List On RMA Application Financial Reserves Add FundsSplitDetails Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                 
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_List_ReserveType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cmbReserveTypeFt")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_ControlNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Control Number TextBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Payment_Txt_ControlNumber(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='ctlnumber' and@ type='text']")); //Unique Id  Of Control Number TextBox  On RMA Application Payments Page Is Fetched
		return Element;

	}
	//============================================================================================
	//FunctionName 			:RMAApp_Payment_FundsSplitDetails_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Application Fund Split Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                                
	//============================================================================================
	public static WebElement RMAApp_Payment_FundsSplitDetails_Save(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@class='modal-content']//*[@id='Save']")); //Unique Id  Of Save Button On RMA Application Fund Split Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Btn_AddPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Collection Image On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-14-2017                                
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Img_AddCollection(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("AddCollection")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Img_EditReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Reserve Image On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-04-2017                                  
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Img_EditReserve(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("EditReserve")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Lst_ReserveSubType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Type List Box On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                              
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Lst_ReserveSubType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cmbsubreservetype")); //Unique Id Of Reserve Type List Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Btn_ClaimReserveSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Reserve Summary On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-05-2017                              
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Btn_ClaimReserveSummary(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("ClaimSummary")); //Unique Id Of Reserve Type List Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}



	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Lst_CoverageType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Coverage List Box On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-10-31-2017                              
	//============================================================================================
	public static WebElement RMAApp_CarrierReserveCreation_Lst_CoverageType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cmbCoverageType")); //Unique Id Of Unit List Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Lst_LossType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Loss Type List Box On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-10-31-2017                              
	//============================================================================================
	public static WebElement RMAApp_CarrierReserveCreation_Lst_LossType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("cmbCoverageLossType")); //Unique Id Of Loss Type List Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Img_TransactionHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction History Image On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-04-2017                              
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Img_TransactionHistory(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='PaymentHistory']/i")); //Unique Id Of Transaction History Image On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Img_AutoChecks
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Auto Checks Image On RMA Application Financial Reserves--->Transaction History Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-04-2017                              
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Img_AutoChecks(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='btnAutoChecks']/i")); //Unique Id Of Transaction History Image On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			:RMAApp_FundsSplitDetails_Btn_OK
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Button On RMA Application FundsSplitDetails Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-26-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Btn_OK(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnOk")); //Unique Id  Of OK Button On RMA Application FundsSplitDetails Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_List_DisabilityCategory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Category of Reserves (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	 
	//Revision				: 0.0 - AnubhutiVyas-09-28-2017                                
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_List_DisabilityCategory(WebDriver driver)
	{
		Element=driver.findElement(By.id("cmbdisablitycat"));

		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_List_DisabilityType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Type of Reserves (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	 
	//Revision				: 0.0 - AnubhutiVyas-09-28-2017                                
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_List_DisabilityType(WebDriver driver)
	{
		Element=driver.findElement(By.id("disabilitytype"));

		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Lst_Value_CoverageType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Value From Coverage List Box On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-24-2018                            
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Lst_Value_CoverageType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='cmbCoverageType']/option[2]")); //Unique Id Of Value In Coverage List Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Lst_Value_LossType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Value From Loss Type List Box On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-24-2018                             
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Lst_Value_LossType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='cmbCoverageLossType']/option[2]")); //Unique Id Of Value In Loss Type List Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Lst_Value_Unit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Value From Unit From List On RMA Application Financial Reserves Add Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-24-2018                                    
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Lst_Value_Unit(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='cmbUnit']/option[2]")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Txt_DisTypeTransHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Distribution Type Filter TextBox On RMA Application Financial Reserves Add Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-22-2018                                    
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Txt_DisTypeTransHistory(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='distributionType']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Btn_DisTypeTransHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Distribution Type Filter Search Button On RMA Application Financial Reserves Add Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-22-2018                                    
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Btn_DisTypeTransHistory(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='distributionType']//ancestor::div[1]/span")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Transcation_Img_PaymentHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction History Image On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-04-2018                              
	//============================================================================================
	public static WebElement RMAApp_Transcation_Img_PaymentHistory(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='Go To Transaction History']/i")); //Unique Id Of Transaction History Image On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_NGGrid_Lnk_ColumnName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Column Header of NG Grid Table (Containing Search Text Boxes) On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, Col Of The Type Integer Signifying The Column Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - ShrutiShruti-11-27-2018                                  
	//============================================================================================
	public static WebElement RMAApp_NGGrid_Lnk_ColumnName(WebDriver driver, String ColumnName)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+ColumnName+"')]//ancestor::button[@class='ui-grid-menu-item ng-binding']")); //Unique Id Of Column Header of NG Grid Table  On RMA Application Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Txt_PaidAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount TextBox On RMA Application FundsSplitDetails Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2019                           
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Txt_PaidAmount(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("paidtotal")); //Unique Id  Of Paid Amount TextBox On RMA Application FundsSplitDetails Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Txt_ReserveBalance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Balance TextBox On RMA Application FundsSplitDetails Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2019                           
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Txt_ReserveBalance(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("reservebalance")); //Unique Id  Of Reserve Balance TextBox On RMA Application FundsSplitDetails Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Txt_InvoiceAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoice Amount TextBox On RMA Application FundsSplitDetails Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2019                           
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Txt_InvoiceAmount(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='invoiceAmount' and @type='text']")); //Unique Id  Of Invoice Amount TextBox On RMA Application FundsSplitDetails Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Txt_InvoiceDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Invoice Date TextBox On RMA Application FundsSplitDetails Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2019                           
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Txt_InvoiceDate(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='invoiceDate' and @type='text']")); //Unique Id  Of Invoice Date TextBox On RMA Application FundsSplitDetails Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserve_Btn_UnitCoverageFinancialSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy/Unit/Coverage Financial Summary Button On Financial/Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-04-2019                           
	//============================================================================================
	public static WebElement RMAApp_FinancialReserve_Btn_UnitCoverageFinancialSummary(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='UnitCoveragefinancialSummary']/i")); //Unique Id Of Policy/Unit/Coverage Financial Summary Button On Financial/Reserves Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserve_Lst_UnitCoverageFinancialSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy/Unit/Coverage Financial Summary List On Policy/Unit/Coverage Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-04-2019                           
	//============================================================================================
	public static WebElement RMAApp_FinancialReserve_Lst_UnitCoverageFinancialSummary(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@name='pucSummaryLevel']")); //Unique Id Of Policy/Unit/Coverage Financial Summary List On Policy/Unit/Coverage Summary Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserve_Btn_TransactionOfSelectedReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transactions Of Selected Reserve Button On Financials/Reserves Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-22-2019                           
	//============================================================================================
	public static WebElement RMAApp_FinancialReserve_Btn_TransactionOfSelectedReserveType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='ReserveTransactionDetail']/i")); //Unique Id Of Transactions Of Selected Reserve Button On Financials/Reserves Screen Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserve_Tbl_TransactionOfSelectedReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transactions Of Selected Reserve Table On Financials/Reserves Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-22-2019                           
	//============================================================================================
	public static WebElement RMAApp_FinancialReserve_Tbl_TransactionOfSelectedReserveType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Transactions Of The Selected Reserve Row')]//ancestor::div[1]//tbody")); //Unique Id Of Transactions Of Selected Reserve Table On Financials/Reserves Screen Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserve_Btn_TransactionOfSelectedReserveTypeClose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transactions Of Selected Reserve Table On Financials/Reserves Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-22-2019                           
	//============================================================================================
	public static WebElement RMAApp_FinancialReserve_Btn_TransactionOfSelectedReserveTypeClose(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@name='btnCancelmemo' and @id='P1']")); //Unique Id Of Transactions Of Selected Reserve Table On Financials/Reserves Screen Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserve_Lst_FDH
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Drop Down List On FDH screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-22-2019                           
	//============================================================================================
	public static WebElement RMAApp_FinancialReserve_Lst_FDH(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.name("fdhLevelList")); //Unique Id Of Drop Down List On FDH screen Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserve_Btn_EditSplitOnAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Buuton On Split Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-22-2019                           
	//============================================================================================
	public static WebElement RMAApp_FinancialReserve_Btn_EditSplitOnAmount(WebDriver driver, String Amount)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Amount+"')]//ancestor::div[2]//span")); //Unique Id Of Drop Down List On FDH screen Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Btn_ClaimReserveSummary_Claimant_Name
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On RMA Application Financial Detail History , Claim Reserve Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-11-02-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Btn_ClaimReserveSummary_Claimant_Name(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Expand']//ancestor::td[1]"));//Unique Id  Of Close Button On RMA Application Financial Detail History , Claim Reserve Summary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Btn_ClaimReserveSummary_Claimant_TablePath
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On RMA Application Financial Detail History , Claim Reserve Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-11-02-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Btn_ClaimReserveSummary_Claimant_TablePath(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Expand']//ancestor::table"));//Unique Id  Of Close Button On RMA Application Financial Detail History , Claim Reserve Summary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Btn_ClaimReserveSummary_ClaimantButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On RMA Application Financial Detail History , Claim Reserve Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-11-02-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Btn_ClaimReserveSummary_ClaimantButton(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id='Expand']"));//Unique Id  Of Close Button On RMA Application Financial Detail History , Claim Reserve Summary Page Is Fetched
		return Element;
	}
	/*

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_Lnk_M_Medical
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medical Link On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-25-2015                                 
// ============================================================================================
public static WebElement RMAApp_FinReserves_Lnk_M_Medical(WebDriver driver)
{
	Element = driver.findElement(By.linkText("M Medical")); //Unique Id  Of Medical Link On RMA Application Financial Reserves Page
	return Element;
}

//============================================================================================
//FunctionName 			:RMAApp_FundsSplitDetails_Btn_OK
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Button On RMA Application FundsSplitDetails Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-26-2015                                 
// ============================================================================================
public static WebElement RMAApp_FundsSplitDetails_Btn_OK(WebDriver driver)
{
	Element = driver.findElement(By.id("btnOk")); //Unique Id  Of OK Button On RMA Application FundsSplitDetails Page Is Fetched
	return Element;	
}


//============================================================================================
//FunctionName 			: RMAApp_ReserveCreation_Tbl_Reserve
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Table On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-11-03-2015                                 
//============================================================================================
public static WebElement RMAApp_ReserveCreation_Tbl_Reserve(WebDriver driver)
{
	Element = driver.findElement(By.id("grdReserve")); //Unique Id  Of Reserve Table On RMA Application Financial Reserves Page Is Fetched
	return Element;
}


//============================================================================================
//FunctionName 			: RMAApp_FinReserves_Lnk_L_Litigation
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Link On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-25-2015                                 
//============================================================================================
public static WebElement RMAApp_FinReserves_Lnk_L_Litigation(WebDriver driver)
{
	Element = driver.findElement(By.linkText("L Litigation")); //Unique Id  Of Litigation Link On RMA Application Financial Reserves Page
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_Lnk_I_Indemnity
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Indemnity Link On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-25-2015                                 
//============================================================================================
public static WebElement RMAApp_FinReserves_Lnk_I_Indemnity(WebDriver driver)
{
	Element = driver.findElement(By.linkText("I Indemnity")); //Unique Id  Of Indemnity Link On RMA Application Financial Reserves Page
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_Lnk_E_Expense
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Expense Link On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-25-2015                                 
//============================================================================================
public static WebElement RMAApp_FinReserves_Lnk_E_Expense(WebDriver driver)
{
	Element = driver.findElement(By.linkText("E Expense")); //Unique Id  Of Expense Link On RMA Application Financial Reserves Page
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_Lnk_RC_REC_Recovery
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Recovery Link On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-25-2015                                 
//============================================================================================
public static WebElement RMAApp_FinReserves_Lnk_RC_REC_Recovery(WebDriver driver)
{
	Element = driver.findElement(By.linkText("RC REC Recovery")); //Unique Id Of Recovery Link On RMA Application Financial Reserves Page
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_Lnk_BI_Bodily_Injury
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Recovery Link On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-25-2015                                 
//============================================================================================
public static WebElement RMAApp_FinReserves_Lnk_BI_Bodily_Injury(WebDriver driver)
{
	Element = driver.findElement(By.linkText("BI Bodily Injury")); //Unique Id Of Recovery Link On RMA Application Financial Reserves Page
	return Element;
}

//===========================================================================================
//FunctionName 			: RMAApp_ReserveCreation_Img_AddNewRsv
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Reserve Image On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-07-2016                                 
//============================================================================================
public static WebElement RMAApp_ReserveCreation_Img_AddNewRsv(WebDriver driver)
{
	Element = driver.findElement(By.id("AddReserve")); //Unique Id Of Add New Reserve Image On RMA Application Financial Reserves Page Is Fetched
	return Element;
}



//============================================================================================
//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGrid
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserves NG Grid Table On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver, Col Of The Type Integer Signifying The Column Of NG Grid To Which The WebElement Refers To, Tag-Name Of The Type String Referring To The Tag Name Of The Web Element	 
//Revision				: 0.0 - KumudNaithani-06-10-2016                                 
//============================================================================================
public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGrid(WebDriver driver, int col, String tagname)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridReserveListing']/div/div[2]/div/div[1]/div["+col+"]/div[2]/div/"+tagname)); //Unique Id Of Reserves NG Grid Table On RMA Application Financial Reserves Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_Img_EditReserve
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Reserve Image On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-09-14-2016                                 
//============================================================================================
public static WebElement RMAApp_FinReserves_Img_EditReserve(WebDriver driver)
{
	Element = driver.findElement(By.id("EditReserve")); 
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_FinReserves__Txt_Claimant
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant TextBox On RMA Application Financial Reserves Add Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-16-2016                                 
//============================================================================================
public static WebElement RMAApp_FinReserves__Txt_Claimant(WebDriver driver)
{
	Element = driver.findElement(By.id("clm_lastname")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_Btn_Claimant
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant Button On RMA Application Financial Reserves Add Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-16-2016                                   
//============================================================================================
public static WebElement RMAApp_FinReserves_Btn_Claimant(WebDriver driver)
{
	Element = driver.findElement(By.id("clm_lastnamebtn")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_List_PolicyName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Name From List On RMA Application Financial Reserves Add Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-16-2016                                 
//============================================================================================
public static WebElement RMAApp_FinReserves_List_PolicyName(WebDriver driver)
{
	Element = driver.findElement(By.id("cmbPolicy")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_List_Unit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit From List On RMA Application Financial Reserves Add Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-16-2016                                    
//============================================================================================
public static WebElement RMAApp_FinReserves_List_Unit(WebDriver driver)
{
	Element = driver.findElement(By.id("cmbUnit")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_List_CoverageType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CoverageType From List On RMA Application Financial Reserves Add Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-16-2016                                   
//============================================================================================
public static WebElement RMAApp_FinReserves_List_CoverageType(WebDriver driver)
{
	Element = driver.findElement(By.id("cmbCoverageType")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_List_LossType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Loss Type From List On RMA Application Financial Reserves Add Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-16-2016                                   
//============================================================================================
public static WebElement RMAApp_FinReserves_List_LossType(WebDriver driver)
{
	Element = driver.findElement(By.id("cmbCoverageLossType")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_List_ReserveType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType From List On RMA Application Financial Reserves Add Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-16-2016                                   
//============================================================================================
public static WebElement RMAApp_FinReserves_List_ReserveType(WebDriver driver)
{
	Element = driver.findElement(By.id("cmbReserveType")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FinReserves_Text_DateEntered
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DateEntered Text On RMA Application Financial Reserves Add Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-16-2016                                   
//============================================================================================
public static WebElement RMAApp_FinReserves_Text_DateEntered(WebDriver driver)
{
	Element = driver.findElement(By.id("dateentered")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver, ColName Of The Type String Signifying The Column Of NG Grid To Which The WebElement Refers To		 
//Revision				: 0.0 - RenuVerma-09-20-2016                                 
//============================================================================================
public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(WebDriver driver, String colName)
{
	Element = driver.findElement(By.xpath(".//*[(text()='"+colName+"')]/input[@type='checkbox']")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGrid_FilterTextBox
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
//Revision				: 0.0 - RenuVerma-09-20-2016                                 
//============================================================================================
public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGrid_FilterTextBox(WebDriver driver, String FilterBoxName)
{
	Element = driver.findElement(By.xpath(".//*[text()='"+FilterBoxName+"']/following::*[@placeholder='Filter...'][1]")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGrid
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Header of Reserves NG Grid Table First Row Value of The Table On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver, colHeadingName Of The Type String Signifying The ColumnHeading and ColVal Of The Type String Signifying The Column Value Of NG Grid To Which The WebElement Refers To		 
//Revision				: 0.0 - RenuVerma-09-20-2016                                 
//============================================================================================
public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGrid(WebDriver driver, String colHeadingName)
{
	String ClassOfColNos=driver.findElement(By.xpath(".//*[@id='gridReserveListing']//div[2]/div[1]/*[text()='"+colHeadingName+"']")).getAttribute("class"); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
	String ColNos[]=ClassOfColNos.split("colt");
	String ColNo=ColNos[1];	
	Element = driver.findElement(By.xpath(".//*[@id='gridReserveListing']//div[1]/div[1]//*[@class='ngCellText ng-scope col"+ColNo+" colt"+ColNo+"']")); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FundsSplitDetails_Lst_PolicyName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Name On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-09-20-2016                                 
//============================================================================================
public static WebElement RMAApp_FundsSplitDetails_Lst_PolicyName(WebDriver driver)
{
	Element = driver.findElement(By.id("Policy")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FundsSplitDetails_Lst_Unit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-09-20-2016                                 
//============================================================================================
public static WebElement RMAApp_FundsSplitDetails_Lst_Unit(WebDriver driver)
{
	Element = driver.findElement(By.id("Unit")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FundsSplitDetails_Txt_Coverage
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Coverage Type On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-09-20-2016                                 
//============================================================================================
public static WebElement RMAApp_FundsSplitDetails_Txt_Coverage(WebDriver driver)
{
	Element = driver.findElement(By.id("Coverage_codelookup")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FundsSplitDetails_Txt_LossType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Loss Type On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-09-20-2016                                 
//============================================================================================
public static WebElement RMAApp_FundsSplitDetails_Txt_LossType(WebDriver driver)
{
	Element = driver.findElement(By.id("LossType_codelookup")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FundsSplitDetails_Txt_ReserveType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Type On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-09-20-2016                                 
//============================================================================================
public static WebElement RMAApp_FundsSplitDetails_Txt_ReserveType(WebDriver driver)
{
	Element = driver.findElement(By.id("ReserveTypeCode_codelookup")); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGridClmValue
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver, colHeadingName Of The Type String Signifying The ColumnHeading Of NG Grid To Which The WebElement Refers To		 
//Revision				: 0.0 - RenuVerma-09-20-2016                                 
//============================================================================================
public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGridClmValue(WebDriver driver, String colHeadingName)
{
	String ClassOfColNos=driver.findElement(By.xpath(".//*[@id='gridReserveListing']//div[2]/div[1]/*[text()='"+colHeadingName+"']")).getAttribute("class"); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
	String ColNos[]=ClassOfColNos.split("colt");
	String ColNo=ColNos[1];	
	Element = driver.findElement(By.xpath(".//*[@id='gridReserveListing']//div[2]/*[@class='ngCellText ng-scope col"+ColNo+" colt"+ColNo+"']")); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_ReserveCreation_Lbl_HeaderCaption
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Label Header of Reserves (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver	 
//Revision				: 0.0 - RenuVerma-09-28-2016                                 
//============================================================================================
public static WebElement RMAApp_ReserveCreation_Lbl_HeaderCaption(WebDriver driver)
{
	Element=driver.findElement(By.id("lblcaption"));

	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_ReserveCreation_List_DisabilityCategory
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Category of Reserves (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver	 
//Revision				: 0.0 - RenuVerma-09-28-2016                                 
//============================================================================================
public static WebElement RMAApp_ReserveCreation_List_DisabilityCategory(WebDriver driver)
{
	Element=driver.findElement(By.id("cmbdisablitycat"));

	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_ReserveCreation_Txt_DisabilityLossType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Loss Type (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver	 
//Revision				: 0.0 - RenuVerma-09-28-2016                                 
//============================================================================================
public static WebElement RMAApp_ReserveCreation_Txt_DisabilityLossType(WebDriver driver)
{
	Element=driver.findElement(By.id("disabilitytype_codelookup"));

	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FundsSplitDetails_Txt_DisabilityLossType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Loss Type On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-09-28-2016                                 
//============================================================================================
public static WebElement RMAApp_FundsSplitDetails_Txt_DisabilityLossType(WebDriver driver)
{
	Element = driver.findElement(By.id("DisabilityLossType_codelookup")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_FundsSplitDetails_Txt_DisabilityCategory
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Category On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver
//Revision				: 0.0 - RenuVerma-09-28-2016                                 
//============================================================================================
public static WebElement RMAApp_FundsSplitDetails_Txt_DisabilityCategory(WebDriver driver)
{
	Element = driver.findElement(By.id("DisabilityCat_codelookup")); 
	return Element;
}
	 */
	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Btn_FinancialDetailHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Financial Detail Historyt Button On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-09-2017                                 
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Btn_FinancialDetailHistory(WebDriver driver)
	{
		Element = driver.findElement(By.id("FinancialDetailHistory")); //Unique Id  Of Financial Detail History Button On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - RenuVerma-08-07-2018                                
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Grid_FinancialDetailHistory_FilterTextBox(WebDriver driver, String FilterBoxName)
	{
		try {
			Element=null;
			Element = driver.findElement(By.xpath(".//*[text()='"+FilterBoxName+"']/following::input[@class='ui-grid-filter-input ui-grid-filter-input-0'][1]")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Financial_Img_NonOccPayments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Amount TextBox On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-30-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Financial_Img_NonOccPayments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Non occ Payments']/i")); //Unique Id  Of Reserve Amount TextBox On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RRMAApp_FundsSplitDetails_Img_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Amount TextBox On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-07-2018                                 
	// ============================================================================================
	public static WebElement RRMAApp_FundsSplitDetails_Img_Close(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Close")); //Unique Id  Of Reserve Amount TextBox On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RRMAApp_FinancialReserve_Btn_ReserveHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Amount TextBox On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-12-2019                                 
	// ============================================================================================
	public static WebElement RRMAApp_FinancialReserve_Btn_ReserveHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='ReserveHistory']/i")); //Unique Id  Of Reserve Amount TextBox On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RRMAApp_FinancialReserve_Lnk_AutoCheckDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Auto Check Date Link On Transaction History On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-27-2019                                 
	// ============================================================================================
	public static WebElement RRMAApp_FinancialReserve_Lnk_AutoCheckDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@title='Click to open']/a")); //Unique Id Of Auto Check Date Link On Transaction History On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialDetailHistory_Dropdown
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Financial Detail History Dropdown On RMA Application Financial Detail History Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-31-2019                                 
	//============================================================================================
	public static WebElement RMAApp_FinancialDetailHistory_Dropdown(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("fdhLevelList")); //Unique Id  Of On The Basis Of Which Financial Detail History Dropdown On RMA Application Financial Detail History Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialDetailHistory_CloseButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On RMA Application Financial Detail History , Claim Reserve Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-11-02-2019                                 
	//============================================================================================
	public static WebElement RMAApp_FinancialDetailHistory_CloseButton(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//p[@id='P1']"));//Unique Id  Of Close Button On RMA Application Financial Detail History , Claim Reserve Summary Page Is Fetched
		return Element;
	}
}

