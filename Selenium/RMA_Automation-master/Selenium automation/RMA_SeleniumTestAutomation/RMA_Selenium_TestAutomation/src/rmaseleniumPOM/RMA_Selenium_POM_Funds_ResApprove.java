package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Funds_ResApprove {
	public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_ResApprove_Frm_ResApproval
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Approval Frame On RMA Application Funds-->Reserve Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-22-2016                                
// ============================================================================================
public static WebElement RMAApp_ResApprove_Frm_ResApproval(WebDriver driver)
{
	Element = driver.findElement(By.id("FundszTransAsyncTransAsyncReserve ApprovalUI/ReserveApproval/?Title=ReservesReserve ApprovalFalse")); //Unique Id  Of Reserve Approval Frame On RMA Application Funds-->Reserve Approval Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ResApprove_Tbl_ResApproval
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Text Boxes On Reserve Approval NG Grid Table On RMA Application Funds-->Reserve Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-22-2016                                
//============================================================================================
public static WebElement RMAApp_ResApprove_Tbl_ResApproval(WebDriver driver, int x, String tagname)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridReserveApproval']/div/div[1]/div[2]/div/div["+x+"]/div[2]/"+tagname)); //Unique Id Of Text Boxes On Reserve Approval NG Grid Table On RMA Application Funds-->Reserve Approval Page Is Fetched																						
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ResApprove_Tbl_ResApprovalNG
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Approval NG Grid Table Elements On RMA Application Funds-->Reserve Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-22-2016                                
//============================================================================================
public static WebElement RMAApp_ResApprove_Tbl_ResApprovalNG(WebDriver driver, int x, String tagname)
{
	WebElement ErrElement = null;
	try {
		ErrElement = driver.findElement(By.xpath(".//*[@id='gridReserveApproval']/div/div[2]/div/div/div["+x+"]/div[2]/div/"+tagname)); //Unique Id Of Reserve Approval NG Grid Table Elements On RMA Application Funds-->Reserve Approval Page Is Fetched										
											
	} catch (Exception|Error e) {
	}
	return ErrElement;
}

//============================================================================================
//FunctionName 			: RMAApp_ResApprove_Btn_ApprSelected
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Approve Selected Button On RMA Application Funds-->Reserve Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-22-2016                                
//============================================================================================
public static WebElement RMAApp_ResApprove_Btn_ApprSelected(WebDriver driver)
{
	WebElement ErrElement1 = null;
	try {
		ErrElement1 = driver.findElement(By.id("btnApprove")); //Unique Id Of Approve Selected Button On RMA Application Funds-->Reserve Approval Page Is Fetched										
	} catch (Exception|Error e) {
	}
	return ErrElement1;
}

//============================================================================================
//FunctionName 			: RMAApp_ResApprove_Btn_RjctSelected
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reject Selected Button On RMA Application Funds-->Reserve Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-22-2016                                
//============================================================================================
public static WebElement RMAApp_ResApprove_Btn_RjctSelected(WebDriver driver)
{
	WebElement ErrElement2 = null;
	try {
		ErrElement2 = driver.findElement(By.id("btnReject")); //Unique Id Of Reject Selected Button On RMA Application Funds-->Reserve Approval Page Is Fetched										
	} catch (Exception|Error e) {
	}
	return ErrElement2;
}

//============================================================================================
//FunctionName 			: RMAApp_ResApprove_Lst_StatusReason
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which StatusReason List Box On RMA Application Funds-->Reserve Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-22-2016                                
//============================================================================================
public static WebElement RMAApp_ResApprove_Lst_StatusReason(WebDriver driver)
{
	WebElement ErrElement3 = null;
	try {
		ErrElement3 = driver.findElement(By.id("rejectreasoncode")); //Unique Id Of StatusReason List Box On RMA Application Funds-->Reserve Approval Page Is Fetched										
	} catch (Exception|Error e) {
	}
	return ErrElement3;
}

//============================================================================================
//FunctionName 			: RMAApp_ResApprove_Chk_PendingTransact
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Show My Pending Transactions CheckBox On RMA Application Funds-->Reserve Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-29-2016                                
//============================================================================================
public static WebElement RMAApp_ResApprove_Chk_PendingTransact(WebDriver driver)
{
	Element = driver.findElement(By.id("chkTrans")); //Unique Id Of Show My Pending Transactions CheckBox On RMA Application Funds-->Reserve Approval Page Is Fetched										
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ResApprove_Err_ResNotApprove
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Error Message Displayed When Reserve Is Not Approved By Manager On RMA Application Funds-->Reserve Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-29-2016                                
//============================================================================================
public static WebElement RMAApp_ResApprove_Err_ResNotApprove(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='ErrorControl1_lblError']/table/tbody/tr/td[2]/ul/li")); //Unique Id Of Error Message Displayed When Reserve Is Not Approved By Manager On RMA Application Funds-->Reserve Approval Page Is Fetched										
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ResApprove_Err_ResNotApprove
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generic Error Message Displayed When Reserve Is Not Approved By Manager On RMA Application Funds-->Reserve Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-02-29-2016                                
//============================================================================================
public static WebElement RMAApp_ResApprove_Err_ErrReported(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='ErrorControl1_lblError']/font")); //Unique Id Of Generic Error Message Displayed When Reserve Is Not Approved By Manager On RMA Application Funds-->Reserve Approval Page Is Fetched										
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_ReserveApproval_Lst_GridReserveApprovalCol
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which GridReserveApproval List On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-03-07-2016                                 
//============================================================================================
public static WebElement RMAApp_ReserveApproval_Lst_GridReserveApprovalCol(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridReserveApproval']/div/div[1]/div[3]/div[1]")); 
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_FinReserves_Chk_GridReserveApprovalColCheckBox
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which GridReserveApproval Checkboxes On RMA Application Financial Reserves Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-03-07-2016                                 
//============================================================================================
public static WebElement RMAApp_ReserveApproval_Chk_GridReserveApprovalColCheckBox(WebDriver driver, int ColumnPosition)
{
	Element = driver.findElement(By.xpath(".//*[@id='gridReserveApproval']/div/div[1]/div[3]/div[2]/div[2]/div[2]/ul/li["+ColumnPosition+"]/div[1]/label/input")); 
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_ResApprove_Chk_ShowAllTransactionWithinMyAuthority
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ShowAllTransactionWithinMyAuthority CheckBox On RMA Application Funds-->Reserve Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-03-14-2016                                
//============================================================================================
public static WebElement RMAApp_ResApprove_Chk_ShowAllTransactionWithinMyAuthority(WebDriver driver)
{
	Element = driver.findElement(By.id("chkShowAllItem")); 										
	return Element;
}

}