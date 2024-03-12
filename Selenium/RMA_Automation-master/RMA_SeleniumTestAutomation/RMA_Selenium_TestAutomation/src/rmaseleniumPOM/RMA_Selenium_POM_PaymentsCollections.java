package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_PaymentsCollections {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_Payment_Tab_TransactionDetail
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Detail Tab On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
//============================================================================================
public static WebElement RMAApp_Payment_Tab_TransactionDetail(WebDriver driver)
{
	Element = driver.findElement(By.id("TABStransactiondetail")); //Unique Id  Of Transaction Detail Tab On RMA Application Payments Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Lst_BankAccount
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account Drop Down  On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
//============================================================================================
public static WebElement RMAApp_Payment_Lst_BankAccount(WebDriver driver)
{
	Element = driver.findElement(By.id("bankaccount")); //Unique Id  Of Bank Account Drop Down On RMA Application Payments Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Lst_PayeeType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payee Type Drop Down  On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
//============================================================================================
public static WebElement RMAApp_Payment_Lst_PayeeType(WebDriver driver)
{
	Element = driver.findElement(By.id("cbopayeetype")); //Unique Id  Of Payee Type Drop Down  On RMA Application Payments Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Lst_TransactionDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Date Drop Down On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
//============================================================================================
public static WebElement RMAApp_Payment_Lst_TransactionDate(WebDriver driver)
{
	Element = driver.findElement(By.id("transdate")); //Unique Id  Of Transaction Date Drop Down  On RMA Application Payments Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Txt_DistributionType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Distribution Type Text Box  On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
//============================================================================================
public static WebElement RMAApp_Payment_Txt_DistributionType(WebDriver driver)
{
	Element = driver.findElement(By.id("distributiontype_codelookup")); //Unique Id  Of Distribution Text Box  On RMA Application Payments Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Text Box On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
//============================================================================================
public static WebElement RMAApp_Payment_Txt_LastName(WebDriver driver)
{
	Element = driver.findElement(By.id("pye_lastname")); //Unique Id  Of Last Name Combo Box  On RMA Application Payments Page Is Fetched
	return Element;
}

//============================================================================================
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
//FunctionName 			: RMAApp_Payment_Btn_AddNewPayment
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Payment Button On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
//============================================================================================
public static WebElement RMAApp_Payment_Btn_AddNewPayment(WebDriver driver)
{
	Element = driver.findElement(By.id("FundsSplitsGrid_New")); //Unique Id  Of Add New Button On RMA Application Payments Page Is Fetched
	return Element;
	
}

//============================================================================================
//FunctionName 			: RMAApp_Payment_Tab_Transaction
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Tab On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
//============================================================================================
public static WebElement RMAApp_Payment_Tab_Transaction(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABStransaction")); //Unique Id  Of Transaction Tab On RMA Application Payments Page Is Fetched
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
//FunctionName 			: RMAApp_Payment_Txt_CheckStatus
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Status TextBox On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-01-08-2016                                
//============================================================================================
public static WebElement RMAApp_Payment_Txt_CheckStatus(WebDriver driver)
{
	Element = driver.findElement(By.id("checkstatuscode_codelookup")); //Unique Id Of Check Status TextBox On RMA Application Payments Page Is Fetched
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
//FunctionName 			: RMAApp_Payment_Btn_DistributionTypeCodeLookUp
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Distribution Type Code Look Up Button  On RMA Application Payments Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-11-2016                                 
//============================================================================================
public static WebElement RMAApp_Payment_Btn_DistributionTypeCodeLookUp(WebDriver driver)
{
	Element = driver.findElement(By.id("distributiontype_codelookupbtn")); //Unique Id Of Distribution Type Code Look Up Button On RMA Application Payments Page Is Fetched
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
//FunctionName 			: RMAApp_Payment_Lbl_BankAccount
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Lable Bank Account On Transaction Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-22-2016                                 
//============================================================================================
public static WebElement RMAApp_Payment_Lbl_BankAccount(WebDriver driver)
{
	Element = driver.findElement(By.id("lbl_bankaccount")); //Unique Id Of Lable Bank Account On Transaction Page Is Fetched
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
}


