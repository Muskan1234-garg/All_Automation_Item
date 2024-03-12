package rmaseleniumPOM_UX;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RMA_Selenium_POM_Attachment {

	public static WebElement Element ;

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_AddNewDocument
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Reload Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_AddNewDocument(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("addicon")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_Title
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Title TextBox On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                       
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_Title(WebDriver driver)
	{ Element = null;
	Element = driver.findElement(By.id("Title")); 
	return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_Subject
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Subject TextBox On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                    
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_Subject(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("Subject")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_Keyword
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Keyword TextBox On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                        
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_Keyword(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("Notes")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_Notes
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Notes TextBox On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                     
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_Notes(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("Keywords")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Btn_Upload
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Upload Button On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                         
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Btn_Upload(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("divupload")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                    
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_Save(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("Button1")); 
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_Reload
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Reload Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                      
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_Reload(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("reloadicon")); 
		return Element;
	}		
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_SubjectSearch
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Upload Button On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                       
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_SubjectSearch(WebDriver driver)
	{ Element = null;
	Element = driver.findElement(By.id("subjectsearch")); 
	return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Btn_SubjectSearchButton
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Upload Button On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                         
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Btn_SubjectSearchButton(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//input[@id='subjectsearch']/following::span[1]")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Lnk_DocumentName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Document Name Link On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                        
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Lnk_DocumentName(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='docrefresh']/*[2]")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentDocumentProperties_Img_Edit
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Edit Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                       
	// ============================================================================================
	public static WebElement RMAApp_AttachmentDocumentProperties_Img_Edit(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='editicon']/i")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentDocumentProperties_Txt_Title
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Title Text Box  On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                      
	// ============================================================================================
	public static WebElement RMAApp_AttachmentDocumentProperties_Txt_Title(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Text1")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentDocumentProperties_Img_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Cancel Image  On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                     
	// ============================================================================================
	public static WebElement RMAApp_AttachmentDocumentProperties_Img_Cancel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cancelicon")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentDocumentProperties_Img_Close
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Image  On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_AttachmentDocumentProperties_Img_Close(WebDriver driver)
	{ 
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@title='Close' and @class='cancel-modal-rm']")); 
		//Element = driver.findElement(By.xpath(".//*[@id='P1' and @role='button']")); 

		Element = driver.findElement(By.xpath(".//*[@class='glyphicon glyphicon-remove closeBtn']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_Delete
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Delete Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                   
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_Delete(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("deleteicon")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Cancel Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                    
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_Cancel(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("Button2")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_Type
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type TextBox On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_Type(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("doc_type")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentDocumentProperties_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Image  On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                     
	// ============================================================================================
	public static WebElement RMAApp_AttachmentDocumentProperties_Img_Save(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("saveicon")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_SelectRowMark
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SelectRowMark Image  On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                   
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_SelectRowMark(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.cssSelector("div[class^='ui-grid-selection-row-header-buttons'")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentAlert_Btn_Delete
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which   On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_AttachmentAlert_Btn_Delete(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("btnDelete")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentAlert_Msg
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Alert Message On RMA Application Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                     
	//============================================================================================
	public static WebElement RMAApp_AttachmentAlert_Msg(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("H1")); //Unique Id Of Alert Message On RMA Application Attachment Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_ProgressBar
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Progress Bar Image On RMA Application Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-15-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Attachment_Img_ProgressBar(WebDriver driver){
		Element=null;
		Element = driver.findElement(By.className("progress-bar")); //Unique Id Of Alert Message On RMA Application Attachment Page Is Fetched
		//	Element = driver.findElement(By.className("col-lg-5 fade loading")); //Unique Id Of Alert Message On RMA Application Attachment Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Header
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Header On RMA Application Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Jannath Hussain-03-09-2018                                     
	//============================================================================================

	public static WebElement RMAApp_Attachments_Header(WebDriver driver){
		Element = null;
		Element = driver.findElement(By.tagName("h1"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentEmail_Btn_Email
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Email Image Button On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_AttachmentEmail_Btn_Email(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("emailicon")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentEmail_Btn_EmailAddressesLookup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Email Addresses Lookup Image Button On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_AttachmentEmail_Btn_EmailAddressesLookup(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("btn_")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentEmail_Btn_UsersIcon
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Users Icon Image Button On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_AttachmentEmail_Btn_UsersIcon(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='usericon']/i")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentEmail_Txt_LoginNameLookup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Email Name TextArea On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_AttachmentEmail_Txt_LoginNameLookup(WebDriver driver,String text)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+text+"')]/ancestor::div[2]//*[@class='ui-grid-filter-container ng-scope']/input"));//to find lookup textbox
		//Element = driver.findElement(By.xpath(".//*[@class='ui-grid-filter-input ui-grid-filter-input-0']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentEmail_Img_RowSelectorAddress
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Row Selector Image Button On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_AttachmentEmail_Img_RowSelectorAddress(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope' and @ng-click='selectButtonClick(row, $event)']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentEmail_Img_OKButton
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which OK Image Button On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_AttachmentEmail_Img_OKButton(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='complete']/i")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentEmail_Img_Email
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Email Image Button On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_AttachmentEmail_Img_Email(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("btnEmail")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentEmail_Txt_Subject
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Subject TextBox On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_AttachmentEmail_Txt_Subject(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("EmailSubject")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Btn_Download
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Download Image Button On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Btn_Download(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("zipicon")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Btn_Expand
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Expand Image Button On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Btn_Expand(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("enlarge")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_ConfirmationPopup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Confirmation PopUp Text On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_ConfirmationPopup(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='modal-body modaldataHeight ng-scope']/p")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Btn_OkConfirmation
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Ok Button On Confirmation PopUp Text On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Btn_OkConfirmation(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("btnRoll")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_Print
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Image Button On Attachment Document Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-17-2019                                  
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_Print(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='printicon']/i")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotesAttach_Btn_NoteAttachment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Note Attachment Button On Enhanced Notes PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-18-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_EnhancedNotesAttach_Btn_NoteAttachment(WebDriver driver)
	{ 
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='btnNoteAttachment']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotesAttach_Img_Close
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Image  On Note Attachment On Enhanced Notes Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-19-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_EnhancedNotesAttach_Img_Close(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='glyphicon glyphicon-remove modalcloseBtn']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotesAttach_Icon_AttachmentEnhNotes
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Attachment Icon On Created Note On Enhanced Notes PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-18-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_EnhancedNotesAttach_Icon_AttachmentEnhNotes(WebDriver driver)
	{ 
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='material-icons material-icons-clr ']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotesAttach_Frame_NoteAttachment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Note Attachments Frame Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-18-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_EnhancedNotesAttach_Frame_NoteAttachment(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='panel-body panel-body-top modal-toolbar-panel']/iframe")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotesAttach_Lst_AttachmentLevel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Attachments Level Drop Down List Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-02-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_EnhancedNotesAttach_Lst_AttachmentLevel(WebDriver driver)
	{ 
		Element = null;
		try {
			Element = driver.findElement(By.id("selAttachmentsLevel"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaims_Lnk_AttachedRecordInRightHandSide
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Any Link On Right Hand Side Tree Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-19-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaims_Lnk_AttachedRecordInRightHandSide(WebDriver driver, String LinkName)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@role='link' and contains(text(),'"+LinkName+"')]")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotesAttach_Btn_NoteAttachmentCreateNoteScreen
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Note Attachment Button On Enhanced Notes PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-04-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_EnhancedNotesAttach_Btn_NoteAttachmentAddCreateNoteScreen(WebDriver driver)
	{ 
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='btnNoteAttachmentAdd']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotesAttach_Btn_NoteAttachmentEditCreateNoteScreen
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Note Attachment Button On Enhanced Notes PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-04-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_EnhancedNotesAttach_Btn_NoteAttachmentEditCreateNoteScreen(WebDriver driver)
	{ 
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='btnNoteAttachmentEdit']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EditAttachedRecord_Txt_FileName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which File Name Of Edit Attached Record On Edit Document Properties Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-08-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_EditAttachedRecord_Txt_FileName(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-model='document.fileName']")); 
		return Element;
	}
}