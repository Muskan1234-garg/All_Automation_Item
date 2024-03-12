package rmaseleniumPOM_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Home {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Img_Reload
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reload Image On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                 
	//============================================================================================
	public static WebElement RMAApp_DefaultView_Img_Reload(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click='main.reLoadScreen($root.selectedId)']"));//Unique Id  Of Reload Image On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Img_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reload Image On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                 
	//============================================================================================
	public static WebElement RMAApp_DefaultView_Img_Close(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click='main.closeScreen($root.selectedId)']"));//Unique Id  Of Reload Image On RMA Application Default View Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Maint_Generic_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Image On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017  
	//ModifiedBy			: 0.1 - RenuVerma-05-22-2017 Save ID for Utility Pages

	//============================================================================================
	public static WebElement RMAApp_Generic_Img_Save(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(@id,'save') or contains(@id,'Save')]")); //Unique Id Of Save Image On RMA Application Page Is Fetched
		}catch (Exception|Error e){	 
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_ModalDialog
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Generic Modal Dialog On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017     
	//ModifyBy				: 0.0 - RenuVerma-09-13-2017 : added @class='modal-content']  in xpath as few of the model popup is not having class property as @class='modal-dialog'                        
	//============================================================================================
	public static WebElement RMAApp_Generic_ModalDialog(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='modal-dialog' or @class='modal-content']")); //Unique Id Of Generic Modal Dialog On RMA Application Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_GenericBtn_ModalDialogOK
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which OK Button On Generic Modal Dialog On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                
	//============================================================================================
	public static WebElement RMAApp_GenericBtn_ModalDialogOK(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnRoll']")); //Unique Id Of OK Button On Generic Modal Dialog On RMA Application Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericBtn_ModalDialogCancel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Cancel Button On Generic Modal Dialog On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017    
	//ModifyBy				: 0.0 - RenuVerma-09-13-2017 : added id=btn_cancel  in xpath as few of the model popup is not having class property as id=btnCancel                          
	//============================================================================================
	public static WebElement RMAApp_GenericBtn_ModalDialogCancel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCancel' or @id='btn_cancel']")); //Unique Id Of Cancel Button On Generic Modal Dialog On RMA Application Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericToast_ErrorMsg
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Error Toast Message On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                
	//============================================================================================
	public static WebElement RMAApp_GenericToast_ErrorMsg(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@class='toast toast-error']")); //Unique Id Of Error Toast Message On RMA Application Page Is Fetched
		}catch (Exception|Error e){	 
		}
		return Element;

	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericBtn_ErrorToastMsgClose
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Button On Error Toast Message On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                
	//============================================================================================
	public static WebElement RMAApp_GenericBtn_ErrorToastMsgClose(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@class='toast-close-button ng-scope']")); //Unique Id Of Close Button On Error Toast Message On RMA Application Page Is Fetched
		}catch (Exception|Error e){	 
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericBtn_SubEntityAdd
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Add Button To Add Sub Entities Like Person Involved (Which Display Option To Add New Or Add Existing) On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-08-06-2017                                
	//============================================================================================
	public static WebElement RMAApp_GenericBtn_SubEntityAdd(WebDriver driver,String Entity)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Entity+"')]/ancestor::div[3]//following-sibling::div//*[@uib-tooltip='Add New']/i")); // Unique Id Of Add Button To Add Sub Entities Like Person Involved (Which Display Option To Add New Or Add Existing) On RMA Application Claim Page Is Fetched
		}catch (Exception|Error e){	 
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericBtn_SubEntitySearch
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Search Button To Add Sub Entities Like Person Involved (Which Display Option To Add New Or Add Existing) On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-08-09-2017                                
	//============================================================================================
	public static WebElement RMAApp_GenericBtn_SubEntitySearch(WebDriver driver,String Entity)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Entity+"')]/ancestor::div[3]//following-sibling::div//*[@uib-tooltip='Search']/i")); // Unique Id Of Search Button To Add Sub Entities Like Person Involved (Which Display Option To Add New Or Add Existing) On RMA Application Claim Page Is Fetched
		}catch (Exception|Error e){	 
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_LinkExistance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Link Existence/Not Existence On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-31-2017 
	//ModifiedBy			: 0.0 - RenuVerma-08-07-2017
	//============================================================================================
	public static WebElement RMAApp_Generic_RMAAppLink(WebDriver driver, String LinkText)
	{
		Element = null;
		try{
			Element = driver.findElement(By.linkText(LinkText));
		} catch (Exception|Error e) {			
		}
		return Element;
	}	
	

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_RMAAppPartialLink
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Partial LinkExistence/Not Existence On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-31-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Generic_RMAAppPartialLink(WebDriver driver, String LinkText)
	{
		Element = null;
		try{
			Element = driver.findElement(By.partialLinkText(LinkText));
		} catch (Exception|Error e) {
			
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_RMAAppText
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Link Not Exist On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-05-31-2017                                                                   
	//============================================================================================
	public static WebElement RMAApp_Generic_RMAAppText(WebDriver driver, String Text)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Text+"')]"));
		} catch (Exception|Error e) {			
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_RMAObjectTagFrame
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Frame Of Object Tag On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-06-02-2017                                                                   
	//============================================================================================
	public static WebElement RMAApp_Generic_RMAObjectTagFrame(WebDriver driver)
	{
		Element = null;
		try{
			Element= driver.findElement(By.xpath(".//*[@id='MemoDiv']/div/object"));
		} catch (Exception|Error e) {	
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_CancelCloseButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel/Close Image Button On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-06-02-2017                                                                   
	//============================================================================================
	public static WebElement RMAApp_Generic_CancelCloseButton(WebDriver driver)
	{Element = null;

	//Element= driver.findElement(By.name("btnCancelmemo"));
	Element = driver.findElement(By.xpath(".//*[@class='lg-modal-rm hidden-sm hidden-xs glyphicon glyphicon-remove modalcloseBtn']"));
	return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Maint_Generic_DeleteRecord
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Delete Record Image Button On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		  
	//Revision				: 0.0 - KumudNaithani-06-02-2017 
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_DeleteRecord(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='Delete Record']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Delete Record Image Button On RMA Application Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericBtn_EnityAdd
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Add Button To Add Entities Like Person Involved, Arbitration On Created, Events, Claims Etc On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	, Entity Corresponding 	To Which The Add Button Needs To Be Clicked
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                
	//============================================================================================
	//public static WebElement RMAApp_GenericBtn_EnityAdd(WebDriver driver, String Entity)
	//{
	//Element = null;
	//try{
	//Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Entity+"')]/ancestor::div[1]/span[1]/i")); //Unique Id Of dd Button To Add Entities Like Person Involved, Arbitration On Created, Events, Claims Etc On RMA Application Page Is Fetched
	//}catch (Exception|Error e){	 
	//}
	//return Element;
	//}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericBtn_EnityAdd
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Add Button To Add Entities Like Person Involved, Arbitration On Created, Events, Claims Etc On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	, Entity Corresponding 	To Which The Add Button Needs To Be Clicked
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                
	//ModifyBy				: 0.0 - RenuVerma-09-01-2017  : To make More Unique added tooltip value in addnew object xpath
	//============================================================================================
	public static WebElement RMAApp_GenericBtn_EnityAdd(WebDriver driver, String Entity)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Entity+"')]/ancestor::div[1]//span/*[@uib-tooltip='Add']")); //Unique Id Of dd Button To Add Entities Like Person Involved, Arbitration On Created, Events, Claims Etc On RMA Application Page Is Fetched
		}catch (Exception|Error e){	 
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Img_Back
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back Image On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-02-2017                                 
	//============================================================================================
	public static WebElement RMAApp_DefaultView_Img_Back(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click='main.previousScreen($root.selectedId)']"));//Unique X-Path Of Back Image On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Lbl_BreadcrumbName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which breadcrumbName On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver,String breadcrumbName		 
	//Revision				: 0.0 - RenuVerma-06-07-2017                                 
	//============================================================================================ 
	public static WebElement RMAApp_DefaultView_Lbl_BreadcrumbName(WebDriver driver,String breadcrumbName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='dvbreadcrumb']//*[contains(text(),'"+breadcrumbName+"')]"));//Unique X-Path Of breadcrumbName On RMA Application Default View Page Is Fetched
		return Element;
	} 
	//============================================================================================
	//FunctionName 			: RMAApp_NGGrid_ReserveNGGridCheckUnCheckClmNames
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Column Names In Column Selection List of  NG Grid Table (Containing Search Text Boxes) On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, ColName Of The Type String Signifying The Column Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - RenuVerma-06-06-2017                                      
	//============================================================================================
	public static WebElement RMAApp_NGGrid_ReserveNGGridCheckUnCheckClmNames(WebDriver driver, String colName)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@id,'menuitem')]//i[@class='ui-grid-icon-cancel']/parent::*[contains(text(),'"+colName+"')]")); //Unique Id Of Column Names In Column Selection List of NG Grid Table (Containing Search Text Boxes) On RMA Application Page Is Fetched
		}catch (Exception e) {
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_NGGrid_Btn_NGGridColumnSort
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Column Header of NG Grid Table (Containing Search Text Boxes) On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, Col Of The Type Integer Signifying The Column Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - RenuVerma-06-06-2017                                  
	//============================================================================================
	public static WebElement RMAApp_NGGrid_Btn_NGGridColumnSort(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'-grid-menu')]/i")); //Unique Id Of Column Header of NG Grid Table  On RMA Application Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_Attach
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Attach Image On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                             
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_Attach(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("Attach Documents")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Msg_ToastMessage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SelectRowMark Image  On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                        
	// ============================================================================================
	public static WebElement RMAApp_Generic_Msg_ToastMessage(WebDriver driver,String Message)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@class='toast-message'][contains(text(),'"+Message+"')]")); //Unique className Of Toast Message On RMA Application UX Page Is Fetched; 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_ModelPopup_Img_Close
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Button On Model Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                    
	// ============================================================================================
	public static WebElement RMAApp_Generic_ModelPopup_Img_Close(WebDriver driver)
	{ 
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='lg-modal-rm hidden-sm hidden-xs glyphicon glyphicon-remove modalcloseBtn']"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Generic_ModelUXDialog_Img_Close
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Button On Model UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-01-02-2018                                    
	// ============================================================================================
	public static WebElement RMAApp_Generic_ModelUXDialog_Img_Close(WebDriver driver)
	{ 
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='glyphicon glyphicon-remove closeBtn']"));

		} catch (Exception e) {
			e.printStackTrace();
		} 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_SendMail
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Attach Image On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-23-2017                             
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_SendMail(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("Send Mail")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GeneralClaim_Img_ExecSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Executive Summary Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-23-2017                            
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_ExecSummary(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("Executive Summary")); //Unique Id Of Executive Summary Image On RMA Application  Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Pdf_ExecSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Executive Summary Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-23-2017                            
	//============================================================================================
	public static WebElement RMAApp_Generic_Pdf_ExecSummary(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[text()='Executive Summary']")); //Unique Id Of Executive Summary Image On RMA Application  Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_CommentSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Comment Summary Image  Button On RMA Claims Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-02-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_CommentSummary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Claim Comment Summary")); //Unique Id Of CommentsSummary Image Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_EnhancedNotes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enhanced Notes Image Button On RMA Claims Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-14-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_EnhancedNotes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'Enhanced Notes') or contains(@id,'EnhancedNotes')]/i")); //Unique Id Of Enhanced Notes Image Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_Diary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary Image Button On RMA Claims Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-14-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_Diary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Diary']/i")); //Unique Id Of Diary Image Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_Comments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Comments Image  Button On RMA Claims Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-02-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_Comments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Comments")); //Unique Id Of Comments TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Btn_ClaimantHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant History Button On RMA Application Claimant Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-03-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Generic_Btn_ClaimantHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Claim History")); //Unique Id Of Claimant History Button On RMA Application Claimant Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Tbl_ClaimantHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant History Table On RMA Application Claimant History Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-03-2017                                               
	//============================================================================================
	public static WebElement RMAApp_Generic_Tbl_ClaimantHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("html/body/div[2]/table")); //Unique Id Of Claimant History Table On RMA Application Claimant History Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_ViewRecordDiaries
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant History Table On RMA Application Claimant History Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-03-2017                                               
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_ViewRecordDiaries(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("View Record Diaries")); //Unique Id Of Claimant History Table On RMA Application Claimant History Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QuickLookup_Generic_Btn_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Add New Button On Quick Lookup Result Page On RMA Application Is Fetched 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-10-17-2016                                
	//============================================================================================
	public static WebElement RMAApp_QuickLookup_Generic_Btn_AddNew(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@value='Add New']")); 
		}catch (Exception|Error e) {	
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericUXWindow_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Application UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-17-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericUXWindow_Btn_Save(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@ng-click='ConfirmationSave()']")); //Unique Id Of Save Button On RMA Application UX Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericUXWindow_Btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Application UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-17-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericUXWindow_Btn_Cancel(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@ng-click=' ConfirmationCancel()']")); //Unique Id Of Save Button On RMA Application UX Window Is Fetched
		return Element;
	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GenericUIWindow_Img_Home
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Home Image On RMA Application UI Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-19-2017                                 
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_DefaultUIWindow_Img_Home(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='cphMainBody_backToDashboard']/img")); //Unique Id Of Home Image On RMA Application UI Window Is Fetched
		return Element;
	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GenericUXWindow_Tbl
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table On RMA Application UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-19-2017                                 
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_GenericUXWindow_Tbl(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd ng-scope']")); //Unique Id Of Table On RMA Application UX Window Is Fetched
		return Element;
	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GenericUXWindowDupClaim_Tbl
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table On RMA Application Duplicate Claim UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-07-27-2017                                 
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_GenericUXWindowDupClaim_Tbl(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']")); //Unique Id Of Table On RMA Application Duplicate Claim UX Window Is Fetched
		return Element;
	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GenericUXWindowDupClaim_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Application Duplicate Claim UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-07-27-2017                                 
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_GenericUXWindowDupClaim_Btn_Save(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@ng-click='save()']")); //Unique Id Of Save Button On RMA Application Duplicate Claim UX Window Is Fetched
		return Element;
	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GenericUXWindowDupClaim_Btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Application Duplicate Claim UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-07-27-2017                                 
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_GenericUXWindowDupClaim_Btn_Cancel(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@ng-click='cancel()']")); //Unique Id Of Save Button On RMA Application Duplicate Claim UX Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PersonInvolvedWindow_Btn_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Image Button On Person Involved Window Displayed On Clicking Add New Button For Person Involved On RMA Application Claim/Event/Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-09-14-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_PersonInvolvedWindow_Btn_Close(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@value='Add New']")); //Unique X-Path Of Close Image Button On Person Involved Window Displayed On Clicking Add Button For Person Involved On RMA Application Claim/Event/Litigation Page
		}catch (Exception|Error e) {	
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericBtn_EnityViewAll
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which View All Button To Add Entities Like Person Involved, Arbitration On Created, Events, Claims Etc On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	, Entity Corresponding 	To Which The View All Button Needs To Be Clicked
	//Revision				: 0.0 - RenuVerma-08-03-2017                                
	//============================================================================================
	public static WebElement RMAApp_GenericBtn_EnityViewAll(WebDriver driver, String Entity)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Entity+"')]/ancestor::div[1]//span/*[@uib-tooltip='View All']")); //Unique Id Of View All Button To Add Entities Like Person Involved, Arbitration On Created, Events, Claims Etc On RMA Application Page Is Fetched
		}catch (Exception|Error e){	 
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericBtn_ViewAllPopup_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which View Add New On View All Screen Of Entities Like Person Involved, Arbitration On Created, Events, Claims Etc On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	, Entity Corresponding 	To Which The Add New On View All Screen Of Entities Needs To Be Clicked
	//Revision				: 0.0 - RenuVerma-08-03-2017                                
	//============================================================================================
	public static WebElement RMAApp_GenericBtn_ViewAllPopup_AddNew(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@id='addicon']/i")); //Unique Id Of Add New On View All Screen Of Entities Like Person Involved, Arbitration On Created, Events, Claims Etc On RMA Application Page Is Fetched
		}catch (Exception|Error e){	 
		}
		return Element;
	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GenericUXWindowReserve_Tbl
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table On RMA Application Reserve UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-05-2017                                 
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_GenericUXWindowReserve_Tbl(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover']")); //Unique Id Of Table On RMA Application Duplicate Claim UX Window Is Fetched
		return Element;
	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ClaimReserveSummary_Btn_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table On RMA Application Reserve UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-05-2017                                 
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_ClaimReserveSummary_Btn_Close(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='lg-modal-rm hidden-sm hidden-xs glyphicon glyphicon-remove modalcloseBtn']")); //Unique Id Of Table On RMA Application Duplicate Claim UX Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Tbl_QuickSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Quick Summary Table On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-31-2017                                               
	//============================================================================================
	public static WebElement RMAApp_Generic_Tbl_QuickSummary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd ng-scope']")); //Unique Id Of Claimant History Table On RMA Application Claimant History Page Is Fetched
		return Element;
	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_List_OrgLevel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table On RMA Application Reserve UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-11-2017                                 
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_OrgHierarchy_List_OrgLevel(WebDriver driver)
	{
		Element = driver.findElement(By.xpath("html/body/div[2]/form/uib-accordion/div/div/div[2]/div/div[2]/div[3]/div[1]/select")); //Unique Id Of Table On RMA Application Duplicate Claim UX Window Is Fetched
		return Element;
	}	

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Lnk_LastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table On RMA Application Reserve UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-10-2017                                 
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_OrgHierarchy_Lnk_LastName(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='orgpanel']/div/div[2]/ul/li/treeitem/ul/li[1]/div/span")); //Unique Id Of Table On RMA Application Duplicate Claim UX Window Is Fetched
		return Element;
	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GenericUXTable_Btn_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table On RMA Application Reserve UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-10-2017                                 
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_GenericUXTable_Btn_Close(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='glyphicon glyphicon-remove closeBtn']")); //Unique Id Of Table On RMA Application Duplicate Claim UX Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Err_StaticErrorText
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generic Static Error Message On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-16-2015         
	//Note						:0.1- RenuVerma-02-20-2017 Another POM RMAApp_ErrorMessage_Heading Can Used as This is General For All Screen Error Message
	//============================================================================================
	public static WebElement RMAApp_DefaultView_Err_StaticErrorText(WebDriver driver)
	{
		WebElement ErrElement = null;
		try {
			ErrElement = driver.findElement(By.xpath(".//*[@id='lblError']/font")); //Unique Id Of Generic Static Error Message On RMA Application Is Fetched	
		} catch (Exception|Error e) {	
		}
		return ErrElement;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_InjuryIllness
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enhanced Notes Image Button On RMA Claims Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-12-22-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_InjuryIllness(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Injury/Illness']/i")); //Unique Id Of Injury/Illness Image Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Img_Salvage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Salvage Image Button On RMA Application Unit Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-01-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Img_Salvage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Salvage']/i")); //Unique Id  Of Salvage Image Button On RMA Application Unit Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Img_CaseManagement
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Case Management/RTW Image Button On RMA Application Injury Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-01-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Img_CaseManagement(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Case Mgt/RTW']/i")); //Unique Id  Of Case Management/RTW Image Button On RMA Application Injury Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Img_VocationalRehab
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vocational Rehabilitation Image Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-01-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Img_VocationalRehab(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Vocational Rehabilitation']/i")); //Unique Id  Of Vocational Rehabilitation Image Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Img_WithHolding
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Withholding Image Button On RMA Application Employee Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Employee_Img_WithHolding(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Withholding']/i")); //Unique Id  Of Withholding Image Button On RMA Application Employee Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_RecordSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Record Summary Image Button On RMA Application Generic Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_RecordSummary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Record Summary']/i")); //Unique Id  Of Record Summary Image Button On RMA Application Generic Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_MailMerge
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Mail Merge Image Button On RMA Application Generic Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_MailMerge(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Mail Merge']/i")); //Unique Id  Of Mail Merge Image Button On RMA Application Generic Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_RecordSummary_Btn_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Image Button On RMA Application Record Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-09-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_RecordSummary_Btn_Close(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnclose']/i")); //Unique Id  Of Close Image Button On RMA Application Record Summary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_RecordSummary_Txt_Data
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Data Of Record Summary On RMA Application Employee Page Can Be Identified
	//Input Parameter                 : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - ShrutiShruti-02-14-2018                            
	//============================================================================================
	public static WebElement RMAApp_RecordSummary_Txt_Data(WebDriver driver,String StrMsg)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+StrMsg+"')]")); //Unique Id Data Of Record Summary On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericToast_ErrorMessage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generic Static Error Message On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-26-2018                                 
	//============================================================================================ 
	public static WebElement RMAApp_GenericToast_ErrorMessage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ng-binding toast-message']"));//Unique X-Path Of Of Generic Static Error Message On RMA Application Is Fetched	
		return Element;
	} 
}


