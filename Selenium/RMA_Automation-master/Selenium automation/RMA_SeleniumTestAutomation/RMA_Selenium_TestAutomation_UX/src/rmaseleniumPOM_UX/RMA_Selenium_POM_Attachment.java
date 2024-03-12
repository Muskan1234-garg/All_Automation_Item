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
		Element = driver.findElement(By.xpath(".//*[@id='docrefresh']/a[2]/img")); 
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
		Element = driver.findElement(By.xpath(".//*[@title='Close' and @class='cancel-modal-rm']")); 
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
}