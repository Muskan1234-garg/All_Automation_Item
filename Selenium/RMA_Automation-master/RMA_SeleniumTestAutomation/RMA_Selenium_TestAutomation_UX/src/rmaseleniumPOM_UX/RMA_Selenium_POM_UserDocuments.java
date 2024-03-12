package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_UserDocuments {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Txt_SibjectSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Subject Search Text Box On RMA Application User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Txt_SubjectSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("subjectsearch")); //Unique Id  Of Subject Search Text Box On RMA Application User Document Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Txt_SibjectSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Subject Search Button On RMA Application User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Btn_SubjectSearch(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@class='glyphicon glyphicon-search searchFilterText']")); //Unique Id  Of Subject Search Button On RMA Application User Document Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Subject')]//ancestor::div[2]/div[3]/div/span")); //Unique Id  Of Subject Search Button On RMA Application User Document Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Btn_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Button On RMA Application User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Btn_AddNew(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='addicon']/i")); //Unique Id  Of Add New Button On RMA Application User Document Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocument_Attachment_Btn_Upload
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Upload Button Button On RMA Application User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocument_Attachment_Btn_Upload(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("divupload")); //Unique Id  Of Upload Button On RMA Application User Document Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Attachment_Img_ProgressBar
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Progress Bar Image On RMA Application User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                       
	//============================================================================================
	public static WebElement RMAApp_UserDocuments_Attachment_Img_ProgressBar(WebDriver driver){
		Element=null;
		Element = driver.findElement(By.className("progress-bar")); //Unique Id Of Alert Message On RMA Application User Documents Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Attachment_Txt_Title
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Title TextBox User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                        
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Attachment_Txt_Title(WebDriver driver)
	{ Element = null;
	Element = driver.findElement(By.id("Title")); 
	return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_UserDocumets_Attachment_Txt_Subject
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Subject TextBox User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                     
	// ============================================================================================
	public static WebElement RMAApp_UserDocumets_Attachment_Txt_Subject(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("Subject")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocumets_Attachment_Txt_Keyword
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Keyword TextBox On  User Documents  Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                         
	// ============================================================================================
	public static WebElement RMAApp_UserDocumets_Attachment_Txt_Keyword(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("Notes")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocumets_Attachment_Txt_Notes
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Notes TextBox On User Documents Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_UserDocumets_Attachment_Txt_Notes(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("Keywords")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocumets_Attachment_Txt_Type
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type TextBox On User Documents Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                         
	// ============================================================================================
	public static WebElement RMAApp_UserDocumets_Attachment_Txt_Type(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("lookup_doc_type")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocumets_Attachment_Btn_TypeLookup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Lookup On User Documents Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                          
	// ============================================================================================
	public static WebElement RMAApp_UserDocumets_Attachment_Btn_TypeLookup(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("btn_doc_type_openlookup")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocumets_Attachment_Txt_Class
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Class TextBox On User Documents Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                          
	// ============================================================================================
	public static WebElement RMAApp_UserDocumets_Attachment_Txt_Class(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("lookup_doc_class")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocumets_Attachment_Btn_ClassLookup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Class Lookup On User Documents Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                          
	// ============================================================================================
	public static WebElement RMAApp_UserDocumets_Attachment_Btn_ClassLookup(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("btn_doc_class_openlookup")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocumets_Attachment_Txt_Category
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Category TextBox On User Documents Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                          
	// ============================================================================================
	public static WebElement RMAApp_UserDocumets_Attachment_Txt_Category(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("lookup_doc_category")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocumets_Attachment_Btn_CategoryLookup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Category Lookup On User Documents Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                         
	// ============================================================================================
	public static WebElement RMAApp_UserDocumets_Attachment_Btn_CategoryLookup(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("btn_doc_category_openlookup")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Attachment_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Image On User Documents Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Attachment_Img_Save(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("Button1")); 
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Attachment_RecycleBin
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Recycle Bin On User Documents Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Attachment_RecycleBin(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("docrefresh2")); 
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Attachment_Img_Preview
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Recycle Bin On User Documents Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Attachment_Img_Preview(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='docrefresh']/*[1]/img")); 
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Attachment_Btn_SelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select All Button On RMA Application  User Documents--->Document List Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Attachment_Btn_SelectAll(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-cell-contents']/div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Attachment_Btn_DeSelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DeSelect All Button On RMA Application User Documents--->Document List Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Attachment_Btn_DeSelectAll(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope ui-grid-all-selected']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_RecycleBin_Btn_Delete
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Delete Button Recycle Bin On User Documents Attachment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_RecycleBin_Btn_Delete(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("deleteicon")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Attachment_Btn_Download
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Download Image Button On User Documents Attachment Document Properties Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Attachment_Btn_Download(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("downloadicon")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Btn_Transfer
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transfer Button On RMA Application User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Btn_Transfer(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("transfericon")); //Unique Id  Of Transfer Button On RMA Application User Document Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Lnk_SelectUser
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transfer Button On RMA Application User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, UserName Variable Of Type String		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Lnk_SelectUser(WebDriver driver,String UserFirstName,String UserLastName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='myselection']/*[contains(text(),'"+UserFirstName+" "+UserLastName+" ("+UserFirstName+")')]")); //Unique Id  Of Transfer Button On RMA Application User Document Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TransferDocuments_Btn_Transfer
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transfer Button On RMA Application User Documents-->Transfer Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_TransferDocuments_Btn_Transfer(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnTransfer")); //Unique Id  Of Transfer Button On RMA Application User Document-->Transfer Documents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Btn_Copy
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Copy Button On RMA Application User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Btn_Copy(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("copyicon")); //Unique Id  Of Copy Button On RMA Application User Document Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CopyDocuments_Btn_Copy
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Copy Button On RMA Application User Documents-->Copy Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_CopyDocuments_Btn_Copy(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnCopy")); //Unique Id  Of Copy Button On RMA Application User Document-->Copy Documents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Btn_Move
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Move Button On RMA Application User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Btn_Move(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("moveicon")); //Unique Id  Of Move Button On RMA Application User Document Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MoveDocuments_Btn_Move
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Move Button On RMA Application User Documents-->Move Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_MoveDocuments_Btn_Move(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnMove")); //Unique Id  Of Move Button On RMA Application User Document-->Move Documents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Lnk_MyDoocuments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which My Documents Link On RMA Application User Documents-->Move Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Lnk_MyDocuments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='movetree']/ul/li//*[contains(text(),'My Documents')]")); //Unique Id  Of Move Button On RMA Application User Document-->Move Documents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Btn_Back
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back Button On RMA Application User Documents-->Recycle Bin Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Btn_Back(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("backicon")); //Unique Id  Of Back Button On RMA Application User Document-->Recycle Bin Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Lnk_RecycleBin_FirstDocument
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back Button On RMA Application User Documents-->Recycle Bin Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Lnk_RecycleBin_FirstDocument(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='docrefresh']/*[2]")); //Unique Id  Of Back Button On RMA Application User Document-->Recycle Bin Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Btn_CreateFolder
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Create Folder Button On RMA Application User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Btn_CreateFolder(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("foldericon")); //Unique Id  Of Create Folder Button On RMA Application User Document Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDoc_CreateFolder_Btn_CreateFolder
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Create Folder Button On RMA Application User Documents-->Create Folder Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDoc_CreateFolder_Btn_CreateFolder(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnDelete")); //Unique Id  Of Create Folder Button On RMA Application User Document Page-->Create Folder Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDoc_CreateFolder_Txt_FolderName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Folder Name TextBox On RMA Application User Documents-->Create Folder Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-18-2018                                
	// ============================================================================================
	public static WebElement RMAApp_UserDoc_CreateFolder_Txt_FolderName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("newfoldername")); //Unique Id  Of Folder Name TextBox On RMA Application User Document Page-->Create Folder Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Lnk_FolderName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which My Documents Link On RMA Application User Documents-->Move Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-29-2020                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Lnk_FolderName(WebDriver driver,String FolderName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='movetree']/ul/li//*[contains(text(),'"+FolderName+"')]")); //Unique Id  Of Move Button On RMA Application User Document-->Move Documents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Txt_FolderHidden
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Folder Hidden Link On RMA Application User Documents-->Move Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-29-2020                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Txt_FolderHidden(WebDriver driver,String FolderName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+FolderName+"')]/ancestor::div[@aria-hidden='true']")); //Unique Id  Of Folder Hidden Link On RMA Application User Document-->Move Documents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Txt_FolderVisible
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Folder Visible Link On RMA Application User Documents-->Move Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-29-2020                              
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Txt_FolderVisible(WebDriver driver,String FolderName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+FolderName+"')]/ancestor::div[@aria-hidden='false']")); //Unique Id  Of Folder Visible Link On RMA Application User Document-->Move Documents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Btn_MoveDocumentClose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of WhichMove Document Close Button On RMA Application User Documents-->Move Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-29-2020                               
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Btn_MoveDocumentClose(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//span[@title ='Close']")); //Unique Id  Of Move Document Close Button On RMA Application User Document-->Move Documents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Txt_NameSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Name Search Text Box On RMA Application User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-02-2020                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Txt_NameSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("namesearch")); //Unique Id  Of Name Search Text Box On RMA Application User Document Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_UserDocuments_Btn_NameSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Name Search Button On RMA Application User Documents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-02-2020                                
	// ============================================================================================
	public static WebElement RMAApp_UserDocuments_Btn_NameSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Name')]//ancestor::div[2]/div[3]/div/span")); //Unique Id  Of Name Search Button On RMA Application User Document Page Is Fetched
		return Element;
	}
}
