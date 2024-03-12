package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Funds_ApproveTransactions {
	public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Chk_ShowMyPendingTransact
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Show My Pending Transactions On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-12-24-2015                                 
// ============================================================================================
public static WebElement RMAApp_ApproveTrans_Chk_ShowMyPendingTransact(WebDriver driver)
{
	Element = driver.findElement(By.id("chkTrans")); //Unique Id  Of Show My Pending Transactions On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Tbl_PendingTransactions
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-12-24-2015                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Tbl_PendingTransactionsNG(WebDriver driver,int col, String tagname)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridDenialPayment']/div/div[2]/div/div/div["+col+"]/div[2]/div/"+tagname)); //Unique Id  Of Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Frm_ApproveTransact
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Approve Transactions Frame On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-12-24-2015                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Frm_ApproveTransact(WebDriver driver)
{
	Element = driver.findElement(By.id("FundszApproveTransApproveTransApprove TransactionsUI/SupervisoryApproval/Approve TransactionsFalse")); //Unique Id  Of Approve Transactions Frame On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}


//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Chk_ShowMyPendingTransact
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-12-28-2015                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Tbl_PendingTransactions(WebDriver driver,int col, String tagname)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridDenialPayment']/div/div[1]/div[2]/div/div[1]/div["+col+"]/"+tagname)); //Unique Id  Of Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	                                       
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Tbl_PaymentApprovalNG
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Approval NG Grid On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-12-31-2015                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Tbl_PaymentApprovalNG(WebDriver driver, int col, String tagname)
{
	WebElement ErrElement = null;
	try {
		ErrElement = driver.findElement(By.xpath(".//*[@id='gridPaymentApproval']/div/div[2]/div/div[1]/div["+col+"]/div[2]/div/"+tagname)); //Unique Id  Of Payment Approval NG Grid On RMA Application Funds-->Approve Transactions Page Is Fetched
	} catch (Exception|Error e) {		
	}
	return ErrElement;	
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Tbl_PaymentApprovalNG
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Approval Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-12-31-2015                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Tbl_PaymentApproval(WebDriver driver, int col, String tagname)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridPaymentApproval']/div/div[1]/div[2]/div/div["+col+"]/div[2]/"+tagname)); //Unique Id  Of Payment Approval Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Lst_PendingTransactCol
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-01-04-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Lst_PendingTransactCol(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridDenialPayment']/div/div[1]/div[3]/div[1]")); //Unique Id  Of Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Chk_TransactDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Trans Date CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-01-04-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Chk_TransactDate(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridDenialPayment']/div/div[1]/div[3]/div[2]/div[2]/div[2]/ul/li[5]/div[1]/label/input")); //Unique Id Of Trans Date CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Chk_PrimClaimant
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Primary Claimant CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-01-04-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Chk_PrimClaimant(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridDenialPayment']/div/div[1]/div[3]/div[2]/div[2]/div[2]/ul/li[8]/div[1]/label/input")); //Unique Id Of Primary Claimant CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Chk_Amount
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-01-04-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Chk_Amt(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridDenialPayment']/div/div[1]/div[3]/div[2]/div[2]/div[2]/ul/li[11]/div[1]/label/input")); //Unique Id Of Amount CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Chk_Payee
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-01-04-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Chk_Payee(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridDenialPayment']/div/div[1]/div[3]/div[2]/div[2]/div[2]/ul/li[7]/div[1]/label/input")); //Unique Id Of Amount CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Btn_Approve
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Approve Button On SuperVisor Approval Of Funds Transaction Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-01-04-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Btn_Approve(WebDriver driver)
{
	WebElement ErrElement1 = null;
	try {
		ErrElement1 = driver.findElement(By.id ("btnApprove")); //Unique Id Of Approve Button On SuperVisor Approval Of Funds Transaction Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement1;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Err_SprApprovalHoldText
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Hold Requiring SuperVisory Approval Error Message On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-01-04-2016                                
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Err_SprApprovalHoldText(WebDriver driver)
{
	WebElement ErrElement8 = null;
	try {
		ErrElement8 = driver.findElement(By.xpath(".//*[@id='ErrorControl1_lblError']/table/tbody/tr/td[2]/ul/li")); //Unique Id Of  Hold Requiring SuperVisory Approval Error Message On RMA Application Funds-->Approve Transactions Page Is Fetched
		
	} catch (Exception|Error e) {
	}
	return ErrElement8;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Chk_Comments
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Comments CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-01-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Chk_Comments(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridDenialPayment']/div/div[1]/div[3]/div[2]/div[2]/div[2]/ul/li[25]/div[1]/label/input")); //Unique Id Of Comments CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Chk_FromToDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which From/ToDate CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-01-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Chk_FromToDate(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridDenialPayment']/div/div[1]/div[3]/div[2]/div[2]/div[2]/ul/li[21]/div[1]/label/input")); //Unique Id Of FromToDate CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Chk_ShowAllTransWinthinMyAuthority
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Show All Transaction Within My Authority CheckBox On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-02-08-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Chk_ShowAllTransWinthinMyAuthority(WebDriver driver)
{
	Element = driver.findElement(By.id("chkShowAllItem")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Btn_Void
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void Button On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-23-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Btn_Void(WebDriver driver)
{
	WebElement ErrElement2 = null;
	try {
		ErrElement2 = driver.findElement(By.id("btnVoid")); //Unique Id Of Void Button On RMA Application Funds-->Approve Transactions Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement2;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Btn_Deny
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Deny Button On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-29-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Btn_Deny(WebDriver driver)
{
	WebElement ErrElement3 = null;
	try {
		ErrElement3 = driver.findElement(By.id("btnDeny")); //Unique Id Of Deny Button On RMA Application Funds-->Approve Transactions Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement3;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Txt_OverrideAmt
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Override Amount TextBox On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-29-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Txt_OverrideAmt(WebDriver driver)
{	WebElement ErrElement4 = null;
	try {
		ErrElement4 = driver.findElement(By.id("tboverrideamount")); //Unique Id Of Override Amount TextBox  On RMA Application Funds-->Approve Transactions Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement4;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Chk_AppOverrideAmt
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Apply Override Amount Check Box On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-29-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Chk_AppOverrideAmt(WebDriver driver)
{
	WebElement ErrElement5 = null;
	try {
		ErrElement5 = driver.findElement(By.id("applyoverride")); //Unique Id Of Apply Override Amount Check Box On RMA Application Funds-->Approve Transactions Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement5;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Chk_ApplyOffset
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Apply Offset CheckBox On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-29-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Chk_ApplyOffset(WebDriver driver)
{
	WebElement ErrElement6 = null;
	try {
		ErrElement6 = driver.findElement(By.id("applyoffset")); //Unique Id Of Apply Offset CheckBox On RMA Application Funds-->Approve Transactions Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement6;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Txt_Reason
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reason TextBox On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-29-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Txt_Reason(WebDriver driver)
{
	WebElement ErrElement7 = null;
	try {
		ErrElement7 = driver.findElement(By.id("reason")); //Unique Id Of Reason Text Box On RMA Application Funds-->Approve Transactions Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement7;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Btn_PrintReport
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Report Button On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-29-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Btn_PrintReport(WebDriver driver)
{
	Element = driver.findElement(By.id("btnPrint")); //Unique Id Of Print Report Button On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Chk_Payee
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AnyCheckBox In Columns List Of My Grid Payment Approval Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-01-04-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Chk_ColumnSelection(WebDriver driver, int ColumnPosition)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridPaymentApproval']/div/div[1]/div[3]/div[2]/div[2]/div[2]/ul/li["+ColumnPosition+"]/div[1]/label/input")); //Unique Id Of Amount CheckBox In Columns List Of My Pending Transactions Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ApproveTrans_Lst_GridPaymentApprovalCol
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Columns List Of Grid Approval Transactions Table On RMA Application Funds-->Approve Transactions Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-01-04-2016                                 
//============================================================================================
public static WebElement RMAApp_ApproveTrans_Lst_GridPaymentApprovalCol(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridPaymentApproval']/div/div[1]/div[3]/div[1]")); //Unique Id  Of Columns List Of My Grid Approval Transactions Table On RMA Application Funds-->Approve Transactions Page Is Fetched
	return Element;
}

}
