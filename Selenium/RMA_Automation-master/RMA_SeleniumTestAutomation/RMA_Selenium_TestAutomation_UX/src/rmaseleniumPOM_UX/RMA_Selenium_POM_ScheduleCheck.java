package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_ScheduleCheck {

	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_PayInterval
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pay Interval TextBox On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_PayInterval(WebDriver driver)
	{
		Element= null;
		Element = driver.findElement(By.id("lookup_payment_interval")); 
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_NumberOfPayments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which NumberOfPayments TextBox On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_NumberOfPayments(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lbl_totalpayments']/following-sibling::input")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_FirstPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Payment TextBox On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_FirstPayment(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='startDate' and @placeholder = 'MM/dd/yyyy']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_FinalPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Final Payment TextBox On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_FinalPayment(WebDriver driver)
	{
		Element = driver.findElement(By.id("finalPaymentDate"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account Drop down On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Lst_BankAccount(WebDriver driver)
	{
		Element = driver.findElement(By.id("bankaccount"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Lst_PayeeType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of PayeeType Drop down On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Lst_PayeeType(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='cbopayeetype']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of DistributionType Text Box On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_DistributionType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_distributiontype"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of LastName Text Box On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_LastName(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_rmalookupfinanciallastname2_lastName"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Btn_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add New Button On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Btn_AddNew(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmdKeep3"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PeopleMaintenance_Lst_TypeOfPerson
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of TypeOfPerson Drop Down On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_PeopleMaintenance_Lst_TypeOfPerson(WebDriver driver)
	{
		Element = driver.findElement(By.id("entitytableid"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Tab_DetailedInformation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Detailed Iformation tab  On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Tab_DetailedInformation(WebDriver driver)
	{

		Element = driver.findElement(By.xpath(".//*[contains(text(),'Detailed Information')]"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Img_PaymentGridNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of PaymentGrid New Image  On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Img_PaymentGridNew(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lblcrudgrid_futurePayments']/ancestor::div[1]/crud-grid/div[1]/span[2]/button"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Tab_ScheduleCheck
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of ScheduleCheck Tab  On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Tab_ScheduleCheck(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Scheduled Checks')]"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Tab_ScheduleCheck
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of ScheduleCheck Tab  On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_ControlNumber(WebDriver driver)
	{
		Element = driver.findElement(By.id("ctlnumber"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinancialReserve_Img_ScheduleCheck
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of ScheduleCheck Image  On RMA Application Financial Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FinancialReserve_Img_ScheduleCheck(WebDriver driver)
	{
		Element = driver.findElement(By.id("ScheduleCheck"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Tbl_PaymentInformationGrid
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PaymentInformation Table On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Tbl_PaymentInformationGrid(WebDriver driver)
	{
		Element = driver.findElement(By.id("PaymentInformationGrid_gvData_ctl00"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Img_BackToFinancials
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back To Financials On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Img_BackToFinancials(WebDriver driver)
	{
		Element = driver.findElement(By.id("backtofinancials"));
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Btn_PayIntervalLookUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of PayInterval LookUp Button On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-05-28-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Btn_PayIntervalLookUp(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_payment_interval_openlookup"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Btn_ChooseHighlighted
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Choose Highlighted Button On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-21-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Btn_ChooseHighlighted(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.id("cmdSubmit1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_FirstRowSelectionInLookupPageOfLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of First Row Selection In Lookup Page Of LastName On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-21-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_FirstRowSelectionInLookupPageOfLastName(WebDriver driver)
	{

		Element=null;
		Element = driver.findElement(By.id("optResults"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Tbl_TransDetailForFuturePayments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Details Table On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-20-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Tbl_TransDetailForFuturePayments(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='FuturePaymentsGrid_gvData_ctl00' and @class = 'singleborder']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Img_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Close Button Image On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-04-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Img_Close(WebDriver driver)
	{
		Element = driver.findElement(By.id("P1"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Lst_TransType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of TransType Drop down On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016         
	//Revision				: 1.0 - MishalKantawala-08-03-2023         
	
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Lst_TransType(WebDriver driver)
	{
		Element=null;
//		Element = driver.findElement(By.id("lookup_transTypeCode")); //Unique Id  Of TransactionType DropDown On RMA Application FundsSplitDetails Page Is Fetched
		Element = driver.findElement(By.id("transTypeCode")); //Unique Id  Of TransactionType DropDown On RMA Application FundsSplitDetails Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymnetDetailEntry_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Save Button On Payment Details Entry Page On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-21-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymnetDetailEntry_Img_Save(WebDriver driver)
	{

		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='gridPanel']//*[@id='Save']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheckCreation_Lst_ReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Type List Box On RMA Application schedule Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-06-07-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheckCreation_Lst_ReserveType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_reserveTypeCodeFt")); //Unique Id Of Reserve Type List Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Btn_TransType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of TransType Button On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016 
	//Revision				: 1.0 - MishalKantawala-07-20-2023 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Btn_TransType(WebDriver driver)
	{
		Element=null;
//		Element = driver.findElement(By.id("btn_transTypeCode_openlookup")); //Unique Id  Of  TransType Button On RMA Application Schedule Check Page Is Fetched
		Element = driver.findElement(By.id("transTypeCode")); //Unique Id  Of  TransType Button On RMA Application Schedule Check Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheckCreation_Txt_Amount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount Text Box On RMA Application schedule Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-06-07-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheckCreation_Txt_Amount(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='amount' and @type ='text']")); //Unique Id Of Amount Text Box On RMA Application schedule Checks Page Is Fetched
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Tab_ThirdPartyPayees
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Third Party Payees Tab  On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-08-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Tab_ThirdPartyPayees(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Third Party Payees')]"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Img_ThirdPartyAddNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Third Party Payee Add New Image  On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-08-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Img_ThirdPartyAddNew(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lblcrudgrid_thirdPartyPayments']/ancestor::div[1]/crud-grid/div[1]/span[2]/button"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_AmountThirdParty
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Third Party Payee Amount TextBox On RMA Application FundsSplitDetails Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2017                           
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_AmountThirdParty(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='amountthirdparty' and @type='text']")); //Unique xpath  Of Amount TextBox On RMA Application FundsSplitDetails Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Btn_ThirdPartyTransaction
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Third Party Payees Transaction Tab  On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-08-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Tab_ThirdPartyTransaction(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Transaction')]/i"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Img_EditThirdPartyPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Edit Third Party Payment Button On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-08-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Img_EditThirdPartyPayment(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lblcrudgrid_thirdPartyPayments']//following::span[contains(@id, 'Edit')]"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Img_EditFuturePayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Edit Future Payment Button On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-08-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Img_EditFuturePayment(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lblcrudgrid_futurePayments']//following::span[contains(@id, 'Edit')]"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Chk_DeductAgainstPayee
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Deduct Against Payee CheckBox On RMA Application FundsSplitDetails Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-02-12-2019                                
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Chk_DeductAgainstPayee(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='deductAgainstPayeeFlag']")); //Unique xpath  Of Deduct Against Payee CheckBox On RMA Application FundsSplitDetails Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Chk_freezebatch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Freeze Payment Batch CheckBox On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-02-12-2019                                
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Chk_freezebatch(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='freezebatchflag']")); //Unique xpath  Of Freeze Payment Batch CheckBox On RMA Application Schedule Check Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Btn_ThirdPartyLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Button On RMA Application Third Party Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-11-2020                                          
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Btn_ThirdPartyLastName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_lastName']")); //Unique Id  Of Last Name Button  On RMA Application Third Party Payment Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Toggle_ThirdPartyPercent
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Percent Toggle Switch On RMA Application Third Party Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-11-2020                                  
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Toggle_ThirdPartyPercent(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@class = 'knob ng-binding']")); //Unique Id  Of Percent Toggle Switch On RMA Application Third Party Payment Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_ThirdPartyPercent
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Third Party Percent Text Box On RMA Application Auto Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-11-2020                                     
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_ThirdPartyPercent(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='percentNumber']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_GrossAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Gross Amount Text Box On RMA Application Auto Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-11-2020                                     
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_GrossAmount(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='grossamount']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_NetAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Net Amount Text Box On RMA Application Auto Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-11-2020                                     
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_NetAmount(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='netamount']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_PayGrandTotal
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Grand Total Text Box On RMA Application Auto Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-11-2020                                     
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_PayGrandTotal(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='pytgrandtotal']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_ThirdPartyTotal
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Third Party Total Text Box On RMA Application Auto Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-11-2020                                     
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_ThirdPartyTotal(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='thirdpartytotal']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_PrintedAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Printed Amount Text Box On RMA Application Auto Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-11-2020                                     
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_PrintedAmount(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='grosstodate']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_NumCheckPrinted
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which # Of Checks Printed Text Box On RMA Application Auto Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-11-2020                                     
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_NumCheckPrinted(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='paymentstodate']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_TotalChecks
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Total # Of Checks Text Box On RMA Application Auto Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-11-2020                                     
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_TotalChecks(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='totnoofchecks']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_NoThirdParty
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which # Of Third Parties Text Box On RMA Application Auto Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-11-2020                                     
	//============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_NoThirdParty(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='noofthirdparties']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Img_DeleteThirdPartyPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Delete Third Party Payment Button On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-11-2020                                
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Img_DeleteThirdPartyPayment(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lblcrudgrid_thirdPartyPayments']//following::span[contains(@id, 'Delete')]"));
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_LookUpBtn_TransType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of TransType Button On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016 
	//Revision				: 1.0 - MishalKantawala-07-20-2023 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_LookUpBtn_TransType(WebDriver driver)
	{
		Element=null;
//		Element = driver.findElement(By.id("btn_transTypeCode_openlookup")); //Unique Id  Of  TransType Button On RMA Application Schedule Check Page Is Fetched
//		Element = driver.findElement(By.id("transTypeCode")); //Unique Id  Of  TransType Button On RMA Application Schedule Check Page Is Fetched
		System.out.println("From RMA_Selenium_POM_ScheduleCheck - Before Calling POM");
		Element = driver.findElement(By.xpath(".//*[@id='btn_transTypeCode_openlookup' and @type='button']"));
		System.out.println("From RMA_Selenium_POM_ScheduleCheck - After Calling POM");
		return Element;
	}


}

