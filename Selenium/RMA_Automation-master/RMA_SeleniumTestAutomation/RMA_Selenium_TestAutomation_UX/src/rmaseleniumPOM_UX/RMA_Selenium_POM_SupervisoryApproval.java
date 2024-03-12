package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_SupervisoryApproval {

	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Tab_Reserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-17-2018                                
	// ============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Tab_Reserve(WebDriver driver)
	{
		Element= null;
		Element = driver.findElement(By.id("aReserveTab")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Tab_Payment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-17-2018                                
	// ============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Tab_Payment(WebDriver driver)
	{
		Element= null;
		Element = driver.findElement(By.id("aPaymentTab")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Tab_WorksheetApproval
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-18-2019                                
	// ============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Tab_WorksheetApproval(WebDriver driver)
	{
		Element= null;
		Element = driver.findElement(By.xpath(".//*[@id='aPaymentTab'][contains(text(),'Worksheet Approval')]")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Btn_Approve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Approve Button On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-17-2018                                
	// ============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Btn_Approve(WebDriver driver)
	{
		Element= null;
		try {
			Element = driver.findElement(By.xpath(".//*[(@id='resaApprove' and @aria-hidden='false') or (@id='payaApprove' and @aria-hidden='false') or (@id='reserveworksheetApprove' and @aria-hidden='false')]")); 
		} catch (Exception e){
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Btn_Reject
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reject Button On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-17-2018                                
	// ============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Btn_Reject(WebDriver driver)
	{
		Element= null;
		try {
			Element = driver.findElement(By.xpath(".//*[(@id='resaReject' and @aria-hidden='false') or (@id='payaReject' and @aria-hidden='false') or (@id='reserveworksheetReject' and @aria-hidden='false')]")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_NGGrid_FilterTextBox
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of NG Grid Table (Containing Search Text Boxes) On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - RenuVerma-07-17-2018                                
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_NGGrid_FilterTextBox(WebDriver driver, String FilterBoxName)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[text()='"+FilterBoxName+"']/following::input[@class='ui-grid-filter-input ui-grid-filter-input-0'][1]"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Column Names In Column Selection List of NG Grid Table (Containing Search Text Boxes) On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_NGGrid_FilterTextBoxClear
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of NG Grid Table (Containing Search Text Boxes) On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - ShrutiShruti-02-24-2019                             
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_NGGrid_FilterTextBoxClear(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[(contains(@class,'ui-grid-filter-input')) and (contains(@class,'ui-grid-filter-input-0')) and (contains(@class,'ng-dirty')) and (contains(@class,'ng-valid-parse')) and (contains(@class,'ng-touched')) and (contains(@class,'ng-not-empty'))]")); //Unique Id Of Column Names In Column Selection List of NG Grid Table (Containing Search Text Boxes) On RMA Application Supervisory Approval Page Is Fetched
		//		/ui-grid-filter-input ui-grid-filter-input-0 ng-dirty ng-valid-parse ng-touched ng-not-empty
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_NGGrid_FilterTextBoxCleared
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of NG Grid Table (Containing Search Text Boxes) On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - ShrutiShruti-02-24-2019                                
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_NGGrid_FilterTextBoxCleared(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[(contains(@class,'ui-grid-filter-input')) and (contains(@class,'ui-grid-filter-input-0')) and (contains(@class,'ng-dirty')) and (contains(@class,'ng-valid-parse')) and (contains(@class,'ng-touched')) and (contains(@class,'ng-empty'))]")); //Unique Id Of Column Names In Column Selection List of NG Grid Table (Containing Search Text Boxes) On RMA Application Supervisory Approval Page Is Fetched
		//ui-grid-filter-input ui-grid-filter-input-0 ng-dirty ng-valid-parse ng-touched ng-empty
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Chk_FirstRowSelection
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Row Selection CheckBox On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-17-2018                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Chk_FirstRowSelection(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@id,'-0-uiGrid-')]//*[contains(@class,'ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope')]"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id  Of Reserve First Row Selection CheckBox Button On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Lst_ResApproveReasonCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Approve Reason Code web list On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-17-2018                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Lst_ResApproveReasonCode(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("ddlReason")); //Unique Id  Of Approve Reason Code web list On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Lst_ResRejectReasonCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which reject Reason Code web list On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-17-2018                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Lst_ResRejectReasonCode(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("ddlRejCodeRes")); //Unique Id  Of Reject Reason Code web list On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Btn_ApproveSaveComment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Approve Save Comment Button On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-17-2018                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Btn_ApproveSaveComment(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btnSaveComment")); //Unique Id  Of Approve Save Comment Button  On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Btn_Refresh
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Refresh Button On Reserve Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-27-2018                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Btn_Refresh(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='resa1' or @id='paya1']")); //Unique Id  Of Refresh Button On Reserve/Payment Tab On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Txt_PaymentApproveReason
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Approve Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-01-2018                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Txt_PaymentApproveReason(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txtPaymentapprovalreason")); //Unique Id  Of Payment Approve Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Txt_PaymentRejectReason
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Reject Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-01-2018                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Txt_PaymentRejectReason(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txtPaymentTxt")); //Unique Id  Of Payment Reject Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Img_UserView
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which user View Image On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-17-2018                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Img_UserView(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("resusericon")); //Unique Id  Of user View Image On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Img_GroupView
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Group View Image On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-17-2018                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Img_GroupView(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("resgropuicon")); //Unique Id  Of Group View Image Button On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Chk_UnapprovedPayee
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment with Unapproved Payee Status CheckBox On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-11-29-2018                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Chk_UnapprovedPayee(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("chkPayeeUnapproved")); //Unique Id  Of Reserve Payment with Unapproved Payee Status CheckBox On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Txt_OverrideAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment with Override Authority TextBox On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-11-29-2018                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Txt_OverrideAmount(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txtOverrideAmount")); //Unique Id  Of Reserve Payment with Override Authority TextBox On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Txt_ResApproveReason
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Approve Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-03-2019                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Txt_ResApproveReason(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txtarReservesapprovalreason")); //Unique Id  Of Payment Approve Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Txt_ResRejReasonReason
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Approve Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-03-2019                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Txt_ResRejReasonReason(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txtarRejResReason")); //Unique Id  Of Payment Approve Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SprApproval_Chk_ApplyOffset
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Apply Offset CheckBox On RMA Application's SuperVisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-04-08-2019                                 
	//============================================================================================
	public static WebElement RMAApp_SprApproval_Chk_ApplyOffset(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("txtApplyOffset")); //Unique Id Of Apply Offset CheckBox On RMA Application's SuperVisory Approval Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SprApproval_Chk_ApplyOffsetNotExist
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Non Existence Of Apply Offset CheckBox On RMA Application's SuperVisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-04-22-2019                                 
	//============================================================================================
	public static WebElement RMAApp_SprApproval_Chk_ApplyOffsetNotExist(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='txtApplyOffset']/ancestor::div[1 and @aria-hidden = 'true']")); //Unique Id Of Non Existence Of Apply Offset CheckBox On RMA Application's SuperVisory Approval Page Is Fetched
		} catch (Exception|Error e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Txt_ResWorksheetReason
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Approve Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-18-2019                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Txt_ResWorksheetReason(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("lookup_holdreasonLookup")); //Unique Id  Of Payment Approve Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Txt_FilterBoxUsed
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Approve Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-08-2019                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Txt_FilterBoxUsed(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[(contains(@class,'ui-grid-filter-input')) and (contains(@class,'ui-grid-filter-input-0')) and (contains(@class,'ng-dirty')) and (contains(@class,'ng-touched')) and (contains(@class,'ng-empty'))]")); //Unique Id  Of Payment Approve Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupervisoryApproval_Chk_AllRowSelect
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Approve Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-13-2019                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Chk_AllRowSelect(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-header-cell-wrapper']//div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope']")); //Unique Id  Of Payment Approve Reason TextBox On Payment Tab On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName       : RMAApp_SupervisoryApproval_Chk_ReadyToPrint
	//Description        : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ready To Print Check Box On Payment Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter    : Driver Variable Of The Type WebDriver                
	//Revision           :0.0- VartikaSood-04-05-2021                                   
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_Chk_ReadyToPrint(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='txtreadytoprint']")); //Unique Id  Of Ready To Print Check Box On Payment Tab On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName        : RMAApp_SupervisoryApproval_Chk_ReadyToPrint
	//Description         : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Preview Button  On Payment Tab On RMA Application Supervisory Approval Page Can Be Identified
	//Input Parameter     : Driver Variable Of The Type WebDriver                
	//Revision            : 0.0- VartikaSood-04-05-2021                                      
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_PrintPriview_Button(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//i[contains(text(),'printpre')]")); //Unique Id  Of Print Preview Button On Payment Tab On RMA Application Supervisory Approval Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName         : RMAApp_SupervisoryApproval_PrintPriview
	//Description          : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Preview Button  On RMA Application On Print Preview  Page Can Be Identified
	//Input Parameter      : Driver Variable Of The Type WebDriver                
	//Revision             : 0.0- VartikaSood-04-05-2021                                
	//============================================================================================
	public static WebElement RMAApp_SupervisoryApproval_PrintPriview(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='printpriview']/i")); //Unique Id  Of Print Preview Button  On RMA Application On Print Preview  Page Is Fetched
		return Element;
	}

}

