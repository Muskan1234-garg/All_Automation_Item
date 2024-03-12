package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Funds_SprApproval {
	public static WebElement Element = null;


//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_PymntApprove
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Approve Image On RMA Application's SuperVisory Approval Payment Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_PymntApprove(WebDriver driver)
{
	WebElement ErrElement1 = null;
	try {
		ErrElement1 = driver.findElement(By.id ("payaApprove")); //Unique Id Of Approve Image On RMA Application's SuperVisory Approval Payment Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement1;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_ResApprove
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Approve Image On RMA Application's SuperVisory Approval Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_ResApprove(WebDriver driver)
{
	WebElement ErrElement12 = null;
	try {
		ErrElement12 = driver.findElement(By.id ("resaApprove")); //Unique Id Of Approve Image On RMA Application's SuperVisory Approval Reserve Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement12;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_ResReject
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reject Image On RMA Application's SuperVisory Approval Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_ResReject(WebDriver driver)
{
	WebElement ErrElement13 = null;
	try {
		ErrElement13 = driver.findElement(By.id ("resaReject")); //Unique Id Of Reject Image On RMA Application's SuperVisory Approval Reserve Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement13;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Tab_Reserve
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Tab On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Tab_Reserve(WebDriver driver)
{
	
	Element = driver.findElement(By.id ("aReserveTab")); //Unique Id Of Reserve Tab On RMA Application's SuperVisory Approval Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Tab_Payment
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Tab On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Tab_Payment(WebDriver driver)
{
	
	Element = driver.findElement(By.id ("aPaymentTab")); //Unique Id Of Payment Tab On RMA Application's SuperVisory Approval Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_SelectedView2
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected View Image On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_aSelectedView2(WebDriver driver)
{
	
	Element = driver.findElement(By.id ("aSelectedView2")); //Unique Id Of Selected View Image On RMA Application's SuperVisory Approval Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_PymntUser
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which User View Image On RMA Application's SuperVisory Approval Payment Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_PymntUser(WebDriver driver)
{
	
	Element = driver.findElement(By.id ("payusericon")); //Unique Id Of User View Image On RMA Application's SuperVisory Approval Payment Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_ResUser
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which User View Image On RMA Application's SuperVisory Approval Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_ResUser(WebDriver driver)
{
	
	Element = driver.findElement(By.id ("resusericon")); //Unique Id Of User View Image On RMA Application's SuperVisory Approval Reserve Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_PymntPending
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pending View Image On RMA Application's SuperVisory Approval Payment Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_PymntPending(WebDriver driver)
{
	
	Element = driver.findElement(By.id ("paypendingicon")); //Unique Id Of Pending View Image On RMA Application's SuperVisory Approval Payment Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_PymntPending
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pending View Image On RMA Application's SuperVisory Approval Payment Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_ResPending(WebDriver driver)
{
	
	Element = driver.findElement(By.id ("respendingicon")); //Unique Id Of Pending View Image On RMA Application's SuperVisory Approval Payment Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_Reject
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reject Image On RMA Application's SuperVisory Approval Payment Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_PymntReject(WebDriver driver)
{
	WebElement ErrElement3 = null;
	try {
		ErrElement3 = driver.findElement(By.id("payaReject")); //Unique Id Of Reject Image On RMA Application's SuperVisory Approval Page Payment Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement3;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_ResRefresh
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Refresh Image On RMA Application's SuperVisory Approval Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_ResRefresh(WebDriver driver)
{
	WebElement ErrElement13 = null;
	try {
		ErrElement13 = driver.findElement(By.id("resa1")); //Unique Id Of Refresh Image On RMA Application's SuperVisory Approval Reserve Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement13;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_PymntRefresh
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Refresh Image On RMA Application's SuperVisory Approval Payment Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_PymntRefresh(WebDriver driver)
{
	WebElement ErrElement2 = null;
	try {
		ErrElement2 = driver.findElement(By.id("paya1")); //Unique Id Of Refresh Image On RMA Application's SuperVisory Approval Payment Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement2;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Txt_OverrideAmt
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Override Amount TextBox On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Txt_OverrideAmt(WebDriver driver)
{	WebElement ErrElement4 = null;
	try {
		ErrElement4 = driver.findElement(By.id("txtOverrideAmount")); //Unique Id Of Override Amount TextBox On RMA Application's SuperVisory Approval Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement4;
}


//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Chk_ApplyOffset
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Apply Offset CheckBox On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Chk_ApplyOffset(WebDriver driver)
{
	WebElement ErrElement5 = null;
	try {
		ErrElement5 = driver.findElement(By.id("txtApplyOffset")); //Unique Id Of Apply Offset CheckBox On RMA Application's SuperVisory Approval Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement5;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Txt_PaymentApproveReason
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Approval Reason TextBox On Payment Approval Window On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Txt_PaymentApproveReason(WebDriver driver)
{
	WebElement ErrElement6 = null;
	try {
		ErrElement6 = driver.findElement(By.id("txtarRejResReason")); //Unique Id Of Payment Approval Reason TextBox On Payment Approval Window On RMA Application's SuperVisory Approval Page Is Fetched
	} catch (Exception|Error e) {
	}
	return ErrElement6;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Lst_PaymntRejectReason
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Void Reason Combo Box On Payment Reject Window On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_Lst_PaymntVoidReason(WebDriver driver)
{
	WebElement ErrElement7 = null;
	try {
		ErrElement7 = driver.findElement(By.id("ddlReasonDesc")); //Unique Id Of Payment Void Reason Combo Box On Payment Reject Window On RMA Application's SuperVisory Approval Page Is Fetched										
	} catch (Exception|Error e) {
	}
	return ErrElement7;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Txt_PaymntVoidReason
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Void Reason Text Box On Payment Reject Window On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_Txt_PaymntVoidReason(WebDriver driver)
{
	WebElement ErrElement8 = null;
	try {
		ErrElement8 = driver.findElement(By.id("txtPaymentTxt")); //Unique Id Of Payment Void Reason Text Box On Payment Reject Window On RMA Application's SuperVisory Approval Page Is Fetched										
	} catch (Exception|Error e) {
	}
	return ErrElement8;
}


//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_GenericcSave
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image On Payment/Reserve Approval And Payment/Reserve Reject Window  On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_GenericcSave(WebDriver driver)
{
	

	Element = driver.findElement(By.id("btnSaveComment")); //Unique Id Of Save Image On Payment/Reserve Approval And Payment/Reserve Reject Window  On RMA Application's SuperVisory Approval Page Is Fetched
	return Element;
	
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_GenericBack
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back Image On Payment/Reserve Approval And Payment/Reserve Reject Window  On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_GenericBack(WebDriver driver)
{
	

	Element = driver.findElement(By.id("btnCancelComment")); //Unique Id Of Back Image On Payment/Reserve Approval And Payment/Reserve Reject Window  On RMA Application's SuperVisory Approval Page Is Fetched
	return Element;
	
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Lst_RsvRejectReason
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Reject Reason Combo Box On Reserve Reject Window On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_Lst_RsvRejectReason(WebDriver driver)
{
	WebElement ErrElement9 = null;
	try {
		ErrElement9 = driver.findElement(By.id("ddlRejCodeRes")); //Unique Id Of Reserve Reject Reason Combo Box On Reserve Reject Window On RMA Application's SuperVisory Approval Page Is Fetched										
	} catch (Exception|Error e) {
	}
	return ErrElement9;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Txt_RsvRejectReason
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Reject Reason Text Box On Reserve Reject Window On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_Txt_RsvRejectReason(WebDriver driver)
{
	WebElement ErrElement10 = null;
	try {
		ErrElement10 = driver.findElement(By.id("txtarRejResReason")); //Unique Id Of Reserve Reject Reason Text Box On Reserve Reject Window On RMA Application's SuperVisory Approval Page Is Fetched										
	} catch (Exception|Error e) {
	}
	return ErrElement10;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Row Filter Text Boxes On RMA Application's SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(WebDriver driver, int col)
{
	WebElement ErrElement11 = null;
	try{
		ErrElement11 = driver.findElement(By.xpath("(.//*[contains(@class, 'ui-grid-filter-input ui-grid-filter-input-0')])["+col+"]")); //Unique Id Of Row Filter Text Boxes On SuperVisory Approval Page Is Fetched
	}catch (Exception|Error e)
	{}
	return ErrElement11;

}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_UXRsvPymntGridFilterRowSelectorMark
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Row Selection TickMarks On SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_UXRsvPymntGridFilterRowSelectorMark(WebDriver driver)
{
	
	Element = driver.findElement(By.xpath(".//*[@class='res-tab-grid']/rmauigrid/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")); //Unique Id Of Row Selection TickMarks On SuperVisory Approval Page Is Fetched
	return Element;

}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_ColSelector
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterTextBox Of SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_ColSelector(WebDriver driver)
{
	
	Element = driver.findElement(By.xpath(".//*[@class='res-tab-grid']/rmauigrid/div[2]/div[1]/div[1]/div[1]/i")); //Unique Id Of FilterTextBox On SuperVisory Approval Page Is Fetched
	return Element;

}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Btn_ColToDisplay
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Column To Be Displayed Are Selected On SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_Btn_ColToDisplay(WebDriver driver, int col, String ColText)
{
	
	Element = driver.findElement(By.xpath("(.//*[contains(@class, 'ui-grid-menu-item ng-binding') and normalize-space(text()) = '"+ColText+"'])["+col+"]")); //Unique Id Of Column To Be Displayed Are Selected On SuperVisory Approval Page Is Fetched
	return Element;

}
//============================================================================================
//FunctionName 			: RMAApp_SprApproval_UXGrd_RowElement
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which UX Grid Row Element On SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-08-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_UXGrd_RowElement(WebDriver driver)
{
	WebElement ErrElement11 = null;
	try {
		ErrElement11 = driver.findElement(By.xpath(".//*[@class='ui-grid-row ng-scope']")); //Unique Id Of UX Grid Row Element On SuperVisory Approval Page Is Fetched									
	} catch (Exception|Error e) {
	}
	 
	return  ErrElement11;

}
//============================================================================================
//FunctionName 			: RMAApp_SprApproval_ReserveNoRecordsAvailable
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which UX Reserve No Records Available On SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-08-23-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_ReserveNoRecordsAvailable(WebDriver driver)
{
	
		Element = driver.findElement(By.xpath(".//*[@id='uiGrid']/div[1]/p")); 									
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_PaymntNoRecordsAvailable
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which UX Payment No Records Available On SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-25-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_PaymntNoRecordsAvailable(WebDriver driver)
{
	
	Element = driver.findElement(By.xpath(".//*[@id='uiGrid']/div[1]/p")); 									
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Row Filter Text Boxes On RMA Application's Payment SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-25-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(WebDriver driver, int col, String colname, int col1)
{
	Element = driver.findElement(By.xpath("(.//*[text()='"+colname+"']/parent::div/following-sibling::div)["+col+"]/descendant::div["+col1+"]/input ")); //Unique Id Of Row Filter Text Boxes On Payment SuperVisory Approval Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_UXRsvPymntGridFilterRowSelectorMark
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Row Selection TickMarks On SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(WebDriver driver)
{
	
	Element = driver.findElement(By.xpath(".//*[@class='pay-tab-grid']/rmauigrid/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")); //Unique Id Of Row Selection TickMarks On SuperVisory Approval Page Is Fetched
	return Element;

}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_UXPaymentColumnSelector
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Column Selector For Payment Tab On SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-08-29-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_UXPaymentColumnSelector(WebDriver driver)
{
	
	Element = driver.findElement(By.xpath(".//*[@class='pay-tab-grid']/rmauigrid/div[2]/div[1]/div[1]/div[1]/i")); 
	return Element;

}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_ResGroup
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Group View Image On RMA Application's SuperVisory Approval Reserve Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-24-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_ResGroup(WebDriver driver)
{
	
	Element = driver.findElement(By.id ("resgropuicon")); //Unique Id Of Group View Image On RMA Application's SuperVisory Approval Reserve Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Img_PymntGroup
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Group View Image On RMA Application's SuperVisory Approval Payment Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-24-2016                                 
//============================================================================================
public static WebElement RMAApp_SprApproval_Img_PymntGroup(WebDriver driver)
{
	
	Element = driver.findElement(By.id ("paygropuicon")); //Unique Id Of Group View Image On RMA Application's SuperVisory Approval Payment Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SprApproval_Btn_Type
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Column To Be Displayed Are Selected On SuperVisory Approval Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-04-2016                                
//============================================================================================
public static WebElement RMAApp_SprApproval_Btn_Type(WebDriver driver, int col)
{
	WebElement ErrElement14 = null;
	try{
	ErrElement14= driver.findElement(By.xpath("(.//*[contains(@class, 'ui-grid-menu-item ng-binding') and normalize-space(text()) = 'Type'])["+col+"]")); //Unique Id Of Column To Be Displayed Are Selected On SuperVisory Approval Page Is Fetched
	}catch (Exception|Error e) {
	}
	return ErrElement14;

}
}