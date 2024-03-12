package rmaseleniumPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RMA_POM_Attachment {

	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_AddNewDocument
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Reload Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_AddNewDocument(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='header-nav-right']/div[1]/a/i")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_Delete
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Delete Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_Delete(WebDriver driver)
	{
		Element = driver.findElement(By.id("deleteicon")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_Email
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Email Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_Email(WebDriver driver)
	{
		Element = driver.findElement(By.id("emailicon")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_Reload
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Reload Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_Reload(WebDriver driver)
	{
		Element = driver.findElement(By.id("reloadicon")); 
		return Element;
	}		

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("Button1")); 
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Cancel Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_Cancel(WebDriver driver)
	{
		Element = driver.findElement(By.id("Button2")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_Title
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Title TextBox On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_Title(WebDriver driver)
	{
		Element = driver.findElement(By.id("Title")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_Subject
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Subject TextBox On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_Subject(WebDriver driver)
	{
		Element = driver.findElement(By.id("Subject")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_Type
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type TextBox On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_Type(WebDriver driver)
	{
		Element = driver.findElement(By.id("doc_type")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_Class
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Class TextBox On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_Class(WebDriver driver)
	{
		Element = driver.findElement(By.id("doc_class")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_Category
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Category TextBox On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_Category(WebDriver driver)
	{
		Element = driver.findElement(By.id("doc_category")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_Keyword
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Keyword TextBox On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_Keyword(WebDriver driver)
	{
		Element = driver.findElement(By.id("Keywords")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_Notes
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Notes TextBox On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_Notes(WebDriver driver)
	{
		Element = driver.findElement(By.id("Notes")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Btn_Upload
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Upload Button On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Btn_Upload(WebDriver driver)
	{
		Element = driver.findElement(By.id("divupload")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_SubjectSearch
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Upload Button On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Txt_SubjectSearch(WebDriver driver)
	{
		Element = driver.findElement(By.id("subjectsearch")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Txt_SubjectSearch
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Upload Button On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Btn_SubjectSearchButton(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//input[@id='subjectsearch']/following::span[1]")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Lnk_DocumentName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Document Name Link On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Lnk_DocumentName(WebDriver driver)
	{
		Element = driver.findElement(By.id("docrefresh")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentDocumentProperties_Img_Edit
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Edit Image On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_AttachmentDocumentProperties_Img_Edit(WebDriver driver)
	{
		Element = driver.findElement(By.id("editicon")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentDocumentProperties_Txt_Title
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Title Text Box  On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_AttachmentDocumentProperties_Txt_Title(WebDriver driver)
	{
		Element = driver.findElement(By.id("Text1")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentDocumentProperties_Img_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Cancel Image  On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_AttachmentDocumentProperties_Img_Cancel(WebDriver driver)
	{
		Element = driver.findElement(By.id("cancelicon")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentDocumentProperties_Img_Close
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Image  On Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_AttachmentDocumentProperties_Img_Close(WebDriver driver)
	{
		Element = driver.findElement(By.className("cancel-modal-rm")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentDocumentProperties_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Image  On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_AttachmentDocumentProperties_Img_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("saveicon")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_SelectRowMark
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SelectRowMark Image  On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_SelectRowMark(WebDriver driver)
	{
		Element = driver.findElement(By.cssSelector("div[class^='ui-grid-selection-row-header-buttons'")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_SelectRowMark
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SelectRowMark Image  On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Grd_AttachmentGrid(WebDriver driver)
	{
		Element = driver.findElement(By.id("attachmentGrid")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Msg_TextMessage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SelectRowMark Image  On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Msg_TextMessage(WebDriver driver)
	{
		Element = driver.findElement(By.className("toast-message")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentAlert_Txt_DeleteText
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which   On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016    
    //Modified by           : 0.1 - MahendraSingh-01-31-2017 Delete Pop up Alert text changed.Object Property was changed.          	
	// ============================================================================================
	public static WebElement RMAApp_AttachmentAlert_Txt_DeleteText(WebDriver driver)
	{
		//Element = driver.findElement(By.id("lblFolderName")); 
          Element = driver.findElement(By.xpath(".//*[@id='lblDeleteSelection1Resrc']/div[2]/div/div")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_AttachmentAlert_Btn_Delete
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which   On Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_AttachmentAlert_Btn_Delete(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnDelete")); 
		return Element;
	}

}