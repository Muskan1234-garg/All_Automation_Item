package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_POM_ScheduleCheck {

	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_PayInterval
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pay Interval TextBox On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_PayInterval(WebDriver driver)
	{
		Element = driver.findElement(By.id("payment_interval_codelookup")); 
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_NumberOfPayments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which NumberOfPayments TextBox On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_NumberOfPayments(WebDriver driver)
	{
		Element = driver.findElement(By.id("totalpayments")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_FirstPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Payment TextBox On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_FirstPayment(WebDriver driver)
	{
		Element = driver.findElement(By.id("startdate"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_FinalPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Final Payment TextBox On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_FinalPayment(WebDriver driver)
	{
		Element = driver.findElement(By.id("enddate"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account Drop down On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
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
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Lst_PayeeType(WebDriver driver)
	{
		Element = driver.findElement(By.id("cbopayeetype"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of DistributionType Text Box On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_DistributionType(WebDriver driver)
	{
		Element = driver.findElement(By.id("distributiontype_codelookup"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of LastName Text Box On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Txt_LastName(WebDriver driver)
	{
		Element = driver.findElement(By.id("pye_lastname"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Btn_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add New Button On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
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
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
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
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Tab_DetailedInformation(WebDriver driver)
	{
		Element = driver.findElement(By.id("LINKTABSdetailinfo"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Img_PaymentGridNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of PaymentGrid New Image  On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Img_PaymentGridNew(WebDriver driver)
	{
		Element = driver.findElement(By.id("FuturePaymentsGrid_New"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Tab_ScheduleCheck
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of ScheduleCheck Tab  On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Tab_ScheduleCheck(WebDriver driver)
	{
		Element = driver.findElement(By.id("LINKTABSscheduledchecks"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ScheduleCheck_Tab_ScheduleCheck
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of ScheduleCheck Tab  On RMA Application Schedule Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
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
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
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
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
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
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
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
	//Revision				: 0.0 - ImteyazAhmad-07-05-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_ScheduleCheck_Btn_PayIntervalLookUp(WebDriver driver)
	{
		Element = driver.findElement(By.id("payment_interval_codelookupbtn"));
		return Element;
	}
}