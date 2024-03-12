package rmaseleniumPOM_UX;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RMA_Selenium_POM_Annotate {

	public static WebElement Element ;
	public static List<WebElement> ElementList = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Btn_Annotate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Annotate Image Button On Claim/Event Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                              
	//============================================================================================
	public static WebElement RMAApp_Generic_Btn_Annotate(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='Annotate']/i")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Btn_OnAttachment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Annotate Image Button On Attachment Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Annotate_Btn_OnAttachment(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Annotate' and  @class='txt-none']/i")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Btn_OnEditAttachment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Annotate Image Button On Edit Document Properties Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                
	//============================================================================================
	public static WebElement RMAApp_Annotate_Btn_OnEditAttachment(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Annotate' and  @class='txt-none pull-left']/i")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Img_Canvas
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Canvas Image On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Annotate_Img_Canvas(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='myCanvas']")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Img_SelectCanvas
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Canvas Image On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Annotate_Img_SelectCanvas(WebDriver driver)
	{
		Element = null;
		try {
			ElementList = driver.findElements(By.xpath(".//*[@class = 'img-rounded img-thumbnail anotateImageSize']")); 
			Element = ElementList.get(0);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Txt_SelectedCanvasName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Canvas Image On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Annotate_Txt_SelectedCanvasName(WebDriver driver)
	{
		Element = null;
		Element = RMAApp_Annotate_Img_SelectCanvas(driver).findElement(By.xpath("//preceding-sibling::div/label"));		
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Img_SelectCanvasByName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Canvas Image On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Annotate_Img_SelectCanvasByName(WebDriver driver, String ImageName)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class = 'control-label txt-transform-capital wordBreak annotateFileName ng-binding' and contains(text(),'"+ImageName+"')]//ancestor::div[2]//img")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Annotate_Btn_Save(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Save Image']/i")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Btn_Pencil
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pencil Button On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Annotate_Btn_Pencil(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Pencil']/i")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Btn_Eraser
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Eraser Button On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Annotate_Btn_Eraser(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Eraser']/i")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Btn_SelectColor
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SelectColor Button On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Annotate_Btn_SelectColor(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='myColor']")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Btn_Undo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Undo Button On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Annotate_Btn_Undo(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Undo']")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Btn_UploadNewImage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Upload New Image Button On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Annotate_Btn_UploadNewImage(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Upload New Image']")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Btn_CancelDraw
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Draw Button On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Annotate_Btn_CancelDraw(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Cancel Draw']")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Btn_AddText
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Text Button On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Annotate_Btn_AddText(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip ='Add Text']")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Txt_AddText
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enter Text Text Box On Add Text Pop Up On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Annotate_Txt_AddText(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_canvastext")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Lst_AddTextFontFamily
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Font Family List On Add Text Pop Up On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Annotate_Lst_AddTextFontFamily(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.name("fontfamily")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Lst_AddTextFontSize
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Font Size List On Add Text Pop Up On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Annotate_Lst_AddTextFontSize(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.name("fontsize")); 
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_Attachment_Img_AddTextSave
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Image On Add Text Pop Up On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                        
	// ============================================================================================
	public static WebElement RMAApp_Attachment_Img_AddTextSave(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.id("Button1")); 
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Txt_DocumentType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Document Type Text Box On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Annotate_Txt_DocumentType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("lookup_doc_type1")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Annotate_Btn_DocumentType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Document Type Lookup Button On Annotate Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Annotate_Btn_DocumentType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btn_doc_type1_openlookup")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Btn_DocumentType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Canvas Document Type Lookup Button On General System Parameter Setup Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Canvas_Btn_DocumentType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("DocTypebtn")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Txt_DocumentType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Canvas Document Type Text Box On General System Parameter Setup Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Canvas_Txt_DocumentType(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("CanvasDocumentType")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Btn_UploadImage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Upload Image On Upload Annotate Images Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Canvas_Btn_UploadImage(WebDriver driver)
	{
		Element=null;
		try {
		Element = driver.findElement(By.xpath(".//*[@id='addFilesBtn' and @title = 'Upload Image']")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Btn_ChooseLOB
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Choose LOB Button On Upload Annotate Images Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Canvas_Btn_ChooseLOB(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='LOBSelect']")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Img_SelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select All Image On Upload Annotate Images Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Canvas_Img_SelectAll(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='glyphicon glyphicon-ok']")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Img_UnSelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UnSelect All Image On Upload Annotate Images Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Canvas_Img_UnSelectAll(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='glyphicon glyphicon-remove']")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Txt_SearchList
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Text Box Under Choose LOB On Upload Annotate Images Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Canvas_Txt_SearchList(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='dropdown-header']/input")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Lst_SelectLOB
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LOBName Is Selected From Choose LOB List On Upload Annotate Images Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Canvas_Lst_SelectLOB(WebDriver driver, String LOBName)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='item-unselected ng-binding' and contains(text(),'"+LOBName+"')]")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Lst_UnSelectLOB
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LOBName Is DeSelected From Choose LOB List On Upload Annotate Images Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Canvas_Lst_UnSelectLOB(WebDriver driver, String LOBName)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='item-selected ng-binding' and contains(text(),'"+LOBName+"')]")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Txt_UploadImageTitle
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Title Text Box On Upload Annotate Images Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Canvas_Txt_UploadImageTitle(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_filname")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Txt_SearchImage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Text Text Box For Please select an Image to Update or Delete On Upload Annotate Images Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Canvas_Txt_SearchImage(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("search-box-input")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Txt_SelectImageTitle
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Image Title Text On Upload Annotate Images Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Canvas_Txt_SelectImageTitle(WebDriver driver, String ImageName)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+ImageName+"')]")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Img_EditImage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Image On Upload Annotate Images Page On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Canvas_Img_EditImage(WebDriver driver, String ImageName)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+ImageName+"')]/preceding-sibling::div//a")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On Canvas Images Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Canvas_Btn_Save(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("btnCreate")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Btn_Delete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Button On Canvas Images Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Canvas_Btn_Delete(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("btnDelete")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CanvasModalPopup_Btn_Delete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Button On Canvas Modal Pop Up On Canvas Images Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_CanvasModalPopup_Btn_Delete(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Delete']")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}
	
	//============================================================================================
		//FunctionName 			: RMAApp_CanvasModalPopup_Btn_Cancel
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Button On Canvas Modal Pop Up On Canvas Images Screen On RMA Application Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
		//============================================================================================
		public static WebElement RMAApp_CanvasModalPopup_Btn_Cancel(WebDriver driver)
		{
			Element = null;
			try {
				Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Cancel']")); 
			} catch (Exception e) {
				e.printStackTrace();
			}
			return Element;
		}
		
	//============================================================================================
	//FunctionName 			: RMAApp_Canvas_Btn_Clear
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Clear Button On Canvas Images Screen On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-02-2020                             
	//============================================================================================
	public static WebElement RMAApp_Canvas_Btn_Clear(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("clearicon")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

}