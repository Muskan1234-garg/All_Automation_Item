package rmaseleniumPOM_UX;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_EnhancedNotes {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_CreateNotes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Create Notes Button On RMA Application Progress Notes Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016                                   
	// ============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_CreateNotes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCreateNote']/i")); //Unique Id Create Notes Button On RMA Application Progress Notes Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_NotesLookUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which NotesLookUp Button On RMA Application Progress Notes Creation/Edit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016                                 
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_NotesLookUp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("btn_noteslookup")); //Unique Id Of NotesLookUp Button On RMA Application Progress Notes Creation/Edit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_TxtArea_ProgressNotes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Text Area On RMA Application Progress Notes Creation/Edit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016                                  
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_TxtArea_ProgressNotes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='fr-element fr-view']"));//Unique Id Of Text Area On RMA Application Progress Notes Creation/Edit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_BackToNotes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which BackToNotes Button On RMA Application Progress Notes Creation/Edit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016                                     
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_BackToNotes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//span[@id='btnBackToNotes']/i")); //Unique Id Of BackToNotes Button On RMA Application Progress Notes Creation/Edit Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			:RMAApp_EnhancedNotes_Btn_EditNote
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EditNote Button On RMA Application Progress Notes Creation/Edit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016                                    
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_EditNote(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='btnEditNote']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of EditNote Button On RMA Application Progress Notes Creation/Edit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_DeleteNote
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DeleteNote Button On RMA Application Progress Notes Creation/Edit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016                                   
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_DeleteNote(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='btnDeleteNotes']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Delete Note Button On RMA Application Progress Notes Creation/Edit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_UXGrid_FilterTextBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Enhanced Notes UX Grid Filter Text Box On RMA Application Progress Notes Creation/Edit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016                                       
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_UXGrid_FilterTextBox(WebDriver driver, String text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+text+"')]/ancestor::div[2]//*[@class='ui-grid-filter-input ui-grid-filter-input-0']")); //Unique Id Of Arrow Selector Enhanced Notes UX Grid On RMA Application Progress Notes Creation/Edit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_UXGrid_FilterTextBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Enhanced Notes UX Grid Filter Text Box On RMA Application Progress Notes Creation/Edit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016                                       
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_UXGrid_FilterTextBox_1(WebDriver driver, String text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+text+"')]/ancestor::div[2]//*[@class='ui-grid-filter-container ng-scope']/input")); //Unique Id Of Arrow Selector Enhanced Notes UX Grid On RMA Application Progress Notes Creation/Edit Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_UXGrid_ArrowSelector
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Arrow Selector Enhanced Notes UX Grid On RMA Application Progress Notes Creation/Edit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016                                   
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_UXGrid_ArrowSelector(WebDriver driver)
	{
		Element = null;
		Element = driver.findElements(By.xpath(".//*[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope']")).get(1);//Unique Id Of Arrow Selector Enhanced Notes UX Grid On RMA Application Progress Notes Creation/Edit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotesAlert_Msg
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Alert Message On RMA Application Progress NotesCreation/Edit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016       
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotesAlert_Msg(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='modal-body modaldataHeight ng-scope']/p")); //Unique Id Of Alert Message On RMA Application Progress Notes Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			:RMAApp_EnhancedNotes_Txt_NoRecordsAvailable
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which No Records Available Text On Enhanced Notes Primary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016                                   
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Txt_NoRecordsAvailable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='progressNotesGrid']/div[1]/p")); //Unique Id Of No Records Available Text On Enhanced Notes Primary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Header
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Enhanced Notes Screen Header Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Header(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DivHeader")); //Unique Id Of Enhanced Notes Screen Header Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Close
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Button On Enhanced Notes Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-16-2016                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_Close(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='lg-modal-rm hidden-sm hidden-xs glyphicon glyphicon-remove modalcloseBtn']"));
			//Element = driver.findElement(By.xpath(".//*[@class='lg-modal-rm hidden-sm hidden-xs glyphicon glyphicon-remove modalcloseBtn paddingHeaderAppPopup']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Unique Id Of Close Button On Enhanced Notes Screen  Is Fetched
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_AdvancedSearch
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Advanced Search on Enhanced Notes Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-18-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_AdvancedSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnAdvSearch']/i")); //Unique Id Of Advanced Search On Enhanced Notes Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Btn_Search
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Search Button On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-18-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Btn_Search(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnSave']/i")); //Unique Id Of Search Button On Advanced Search Window Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Cancel Button On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-18-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Btn_Cancel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCancelNotes']/i")); //Unique Id Of Cancel Button On Advanced Search Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Btn_SelectClaim
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Dropdown On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-18-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Btn_SelectClaim(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lstClaims']//*[@class='dropdown-toggle ng-binding btn btn-default']")); //Unique Id Of Claim Dropdown On Advanced Search Window Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Btn_NotesLookup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Notes Type Lookup Button On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-18-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Btn_NotesLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_notesLookUp']/i")); //Unique Id Of Notes Type Lookup Button On Advanced Search Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Lnk_ClaimMenu
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Dropdown On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-18-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Lnk_ClaimMenu(WebDriver driver,String text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@role='menuitem']//span[contains(text(),'"+text+"')]")); //Unique Id Of Claim Dropdown On Advanced Search Window Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Lnk_CheckAll
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Check All Link Under Claim Select Dropdown On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-18-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Lnk_CheckAll(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Check All')]")); //Unique Id Of Check All Link Under Claim Select Dropdown On Advanced Search Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Lnk_UnCheckAll
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Uncheck All Link Under Claim Select Dropdown On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-18-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Lnk_UnCheckAll(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Uncheck All')]")); //Unique Id Of Uncheck All Link Under Claim Select Dropdown On Advanced Search Window Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Btn_BackToAdvancedSearch
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Back To Advanced Search Button Under Claim Select Dropdown On Enhanced Notes Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-20-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Btn_BackToAdvancedSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnBack']/i")); //Unique Id Of Back To Advanced Search Button On Enhanced Notes Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Btn_BackToAllNotes
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Back To All Notes Button On Enhanced Notes On Enhanced Notes Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-20-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Btn_BackToAllNotes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnBack']/i")); //Unique Id Of Back To All Notes Button On Enhanced Notes Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Btn_ViewAllNotes
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which View All Notes Button On Enhanced Notes Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-23-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_ViewAllNotes(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='btnViewNotes']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Back To View All Notes Button On Enhanced Notes Window Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Lst_Templates
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Template(s) Dropdown On Create Note Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-25-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Lst_Templates(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("TemplateName")); //Unique Id Of Template(s) Dropdown On Create Note Window Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_Templates
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Templates Button On Enhanced Notes Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-25-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_Templates(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnTemplates']/i")); //Unique Id Of Templates Button On Enhanced Notes Window Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Templates_CreateTemplate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Create Template Button On View All Templates Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-25-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Templates_CreateTemplate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCreateTemplate']/i")); //Unique Id Of Create Template Button On View All Templates Window Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Templates_Btn_BackToNotes
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Back To Notes Button On View All Templates Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-25-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Templates_Btn_BackToNotes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCancel']/i")); //Unique Id Of Back To Notes Button On View All Templates Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Templates_Txt_TemplateName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Template Name Textbox On Create Template Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-25-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Templates_Txt_TemplateName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("TemplateName")); //Unique Id Of Template Name Textbox On Create Template Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Templates_Btn_SaveTemplate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Template Button On Create Template Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-25-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Templates_Btn_SaveTemplate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnSaveTemplate']/i")); //Unique Id Of Save Template Button On Create Template Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Templates_Btn_BackToTemplates
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Back To Templates Button On Create Template Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-25-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Templates_Btn_BackToTemplates(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCancelNotes']/i")); //Unique Id Of Back To Templates Button On Create Template Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Lst_TemplateName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Created Template Name On Create Note Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-25-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Lst_TemplateName(WebDriver driver, String Text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Text+"')]")); //Unique Id Of Created Template Name On Create Note Window Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Templates_Txt_NotesLevel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Notes Level Textbox On Enhanced Notes Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-08-21-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Templates_Txt_NotesLevel(WebDriver driver, String Text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='selNotesLevel']//*[contains(text(),'"+Text+"')]")); //Unique Id Of Notes Level Textbox On Enhanced Notes Window Is Fetched
		return Element;	  
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Lst_SortBy
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Sort By Dropdown On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-25-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Lst_SortBy(WebDriver driver,String Text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='selSortBy1']//*[contains(text(),'"+Text+"')]")); //Unique Id Of Sort By Dropdown On Advanced Search Window Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Lst_DescAsc
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Sort By Dropdown On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-08-27-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Lst_DescAsc(WebDriver driver,String Text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='.//*[@id='selOrderBy1']']//*[contains(text(),'"+Text+"')]")); //Unique Id Of Sort By Dropdown On Advanced Search Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			:RMAApp_EnhancedNotes_Txt_ActivityDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Activity Date Textbox On Create Note Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-08-27-2018                                   
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Txt_ActivityDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='activitydate']//*[@class='form-control ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-date ng-valid-maxlength']")); //Unique Id Of Activity Date Textbox On Create Note Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Event_Close
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Button On Enhanced Notes Screen Of Event Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-10-1-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Event_Close(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='P1' and @role='button']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Unique Id Of Close Button On Enhanced Notes Screen  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_EnhancedNotes_Print
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print DropDown On Enhanced Notes Screen Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver      
	//Revision                        : 0.0 - NikitaThani-10-1-2018                               
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Print']/i"));
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_EnhancedNotes_PrintSelectedNotes
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Selected Notes On Print DropDown On Enhanced Notes Screen Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver      
	//Revision                        : 0.0 - NikitaThani-10-1-2018                               
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_PrintSelectedNotes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='hlnkPrintSelectedNote']"));
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_EnhancedNotes_PrintPDF
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Selected Notes PDF On Print DropDown On Enhanced Notes Screen Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver      
	//Revision                        : 0.0 - NikitaThani-10-1-2018                               
	//============================================================================================

	public static WebElement RMAApp_EnhancedNotes_PrintPDF(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lnkPrintNotesForSelectedRow']"));
		return Element;
	}

	//============================================================================================

	//FunctionName                    : RMAApp_EnhancedNotes_Btn_Expand

	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Expand Image Button On Enhanced Document Properties Page Can Be Identified

	//Input Parameter          : Driver Variable Of The Type WebDriver      

	//Revision                        : 0.0 - NikitaThani-23-09-2018                                 

	// ============================================================================================

	public static WebElement RMAApp_EnhancedNotes_Btn_Expand(WebDriver driver)

	{

		Element = null;

		Element = driver.findElement(By.id("enlarge"));

		return Element;

	}



	//============================================================================================

	//FunctionName                    : RMAApp_EnhancedNotes_Txt_ConfirmationPopup

	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Confirmation PopUp Text On Attachment Document Properties Page Can Be Identified

	//Input Parameter          : Driver Variable Of The Type WebDriver      

	//Revision                        : 0.0 - NikitaThani-23-09-2018                                

	// ============================================================================================

	public static WebElement RMAApp_EnhancedNotes_Txt_ConfirmationPopup(WebDriver driver)

	{

		Element = null;

		Element = driver.findElement(By.xpath(".//*[@class='modal-body modaldataHeight ng-scope']/p"));

		return Element;

	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_RemoveFilter
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Remove Filter Button for Note Text On Enhanced Notes Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-10-1-2018                                
	//============================================================================================ 
	public static WebElement RMAApp_EnhancedNotes_RemoveFilter(WebDriver driver)

	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-filter-button ng-scope']/i"));
		return Element;
	}  
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Lst_SortByBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Sort By Dropdown On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-07-25-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Lst_SortByBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='selSortBy1']")); //Unique Id Of Sort By Dropdown On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Lst_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Sort By Dropdown On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-08-27-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Lst_DescAscBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='selOrderBy1']")); //Unique Id Of Sort By Dropdown On Advanced Search Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_TextArea_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which NoteText TextArea On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_TextArea_DescAscBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='txtnotestextcontains']")); //Unique Id Of TextArea On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Subject_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Subject On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Subject_DescAscBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='subjectlist']")); //Unique Id Of Subject On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_ActivityFromDate_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ActivityFromDate On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================

	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_ActivityFromDate_DescAscBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='activityfromdate' and @type='text']")); //Unique Id Of ActivityFromDate On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_ActivityToDate_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ActivityToDate On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_ActivityToDate_DescAscBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='activitytodate' and @type='text']"));//Unique Id Of ActivityToDate On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_UserGroup_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which UserGroup On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_UserGroup_DescAscBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_lstUserTypes']")); //Unique Id Of UserGroup On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_UserGroup_right_button_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which UserGroup Right Button On UserGroup Lookup Window OnAdvanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_UserGroup_right_button_DescAscBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='material-icons icon-colr']")); //Unique Id Of UserGroup Right Button On UserGroup Lookup Window On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Important_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Important Dropdown On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Important_Dropdown_DescAscBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='ImpFlagSelect']")); //Unique Id Of Important Dropdown On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_EnteredBy_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which EnteredBy On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_EnteredBy_DescAscBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_lstEnteredBy']")); //Unique Id Of EnteredBy On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_EnteredBy_UserGroup_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which EnteredBy UserGroup On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_EnteredBy_UserGroup_DescAscBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("usericon")); //Unique Id Of EnteredBy UserGroup On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_EnteredBy_Right_Button_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which EnteredBy Right Button On EnteredBy Lookup Window On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_EnteredBy_Right_Button_DescAscBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='complete']//*[@class='material-icons icon-colr']")); //Unique Id Of EnteredBy Right Button On EnteredBy Lookup Window On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_EnteredBy_Input_Textbox_DescAscBox1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which EnteredBy Input Textbox On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_EnteredBy_Input_Textbox_DescAscBox1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='lstEnteredBy']")); //Unique Id Of EnteredBy Input Textbox On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_UserGroup_Input_Textbox_DescAscBox1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which UserGroup On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_UserGroup_Input_Textbox_DescAscBox1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='lstUserTypes']"));//Unique Id Of UserGroup Input Textbox On Advanced Search Window Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_AdvancedSearch_Notetype_Input_Textbox_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which UserGroup On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-06-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_AdvancedSearch_Notetype_Input_Textbox_DescAscBox1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@name='notesLookUp']"));//Unique Id Of AdvancedSearch Notetype Input Textbox On Advanced Search Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_CreateNotes_Subject_DescAscBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Subject On Advanced Search Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-04-26-2018                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_CreateNotes_Subject_DescAscBox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='Subject']")); //Unique Id Of Subject On Advanced Search Window Is Fetched
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_UXGrid_Noteview
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Arrow Selector Enhanced Notes UX Grid On RMA Application Progress Notes Creation/Edit Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma -05-07-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_UXGrid_Noteview(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-cell-contents']//child::span[@title='Notes detailed View']"));//Unique Id Of Arrow Selector Enhanced Notes UX Grid On RMA Application Progress Notes Creation/Edit Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Templates_Select_NotesLevel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Note level On Enhanced Notes Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma -05-07-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Templates_Select_NotesLevel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='col-sm-4 column']//child::select[@id='selNotesLevel']"));//Unique Id Of  Note level On Enhanced Notes Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_NotesLookup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Notes Type Lookup Button On Enhanced Notes Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-15-2019                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_NotesLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_NoteType_openlookup")); //Unique Id Of Notes Type Lookup Button On Enhanced Notes Window Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_NumberOfrecords
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Number Of Records On Right Navigation Of Claim Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-20-2019                                      
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_NumberOfrecords(WebDriver driver,String text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='RightRecentlyViewed ng-binding' and contains(text(),'"+text+"')]//ancestor::a[1]/sup/span"));//Unique Id Of Number Of Records On Right Navigation Of Claim Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Allow_Notes_At_The_Claimant_level_Checkbox:
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Notes at the Claimant level Check box Of Diaries / Text Fields Settings Tab On General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParuLSharma-05-22-2019                                      
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Allow_Notes_At_The_Claimant_level_Checkbox(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='AllowNotesAtClaimant']"));//Unique Id Of Allow Notes at the Claimant level Check box Of Diaries / Text Fields Settings Tab On General System Parameter Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Claimant_Level_Text:
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Text Written On Claimant Enhanced Notes Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParuLSharma-05-22-2019                                      
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Claimant_Level_Text(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='progressNotesGrid']/child::div[@ng-show='gridVM.noRecords']/p/b"));//Unique Id Of Text Written On Claimant Enhanced Notes Screen Can Be Identified Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_ViewNoteClose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Text Written On Claimant Enhanced Notes Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParuLSharma-05-22-2019                                      
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_ViewNoteClose(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCancelmemo']/span"));//Unique Id Of Text Written On Claimant Enhanced Notes Screen Can Be Identified Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_Draft
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Draft Button On Enhanced Notes Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParuLSharma-04-29-2020                                      
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_Draft(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//button[text()='Drafts ']"));//Unique Id Of Draft Button On Enhanced Notes Screen Can Be Identified Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_Notes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Notes Button On Enhanced Notes Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParuLSharma-04-29-2020                                      
	//============================================================================================

	public static WebElement RMAApp_EnhancedNotes_Btn_Notes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//button[text()='Notes']")); //Unique Id Of Draft Button On Enhanced Notes Screen Can Be Identified Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_SaveAsdraft
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save As Draft Button On Enhanced Notes Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParuLSharma-04-29-2020                                      
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_SaveAsdraft(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id='A1']/i")); //Unique Id Of SaveAsDraft Button On Create/Edit Window On Enhanced Notes Screen Can Be Identified Is Fetched
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_SaveAsdraft_RedLine
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Red Line On Create/Edit Window On Enhanced Notes Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParuLSharma-04-29-2020                                      
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_SaveAsdraft_RedLine(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@style,'solid red')]"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Red Line On Create/Edit Window On Enhanced Notes Screen Can Be Identified Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotesAttach_Btn_CreateAnotherNote
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Create Another Note Button On Enhanced Notes PopUp Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-05-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_EnhancedNotesAttach_Btn_CreateAnotherNote(WebDriver driver)
	{ 
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCreateAnotherNote']/i")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Header
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Enhanced Notes Create Screen Header Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Shruti-05-05-2020                                
	//============================================================================================
	public static WebElement RMAApp_EnhancedNotes_CreateNoteHeader(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DivHeaderCreate")); //Unique Id Of Enhanced Notes Create Screen Header Is Fetched
		return Element;
	}

	//====================================================================================================================================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_OpenAsMainNoteButton
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Enhanced Notes OpenAsMainNoteButton Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-19-2020                                
	//====================================================================================================================================================================================================

	public static WebElement RMAApp_EnhancedNotes_OpenAsMainNoteButton(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='mainnote']")); //Unique Id Of On The Basis Of Which Enhanced Notes OpenAsMainNoteButton Can Be Identified
		return Element;
	}


	//====================================================================================================================================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_OpenAsDraftNoteButton
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Enhanced Notes OpenAsDraftNoteButton Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-19-2020                                
	//====================================================================================================================================================================================================

	public static WebElement RMAApp_EnhancedNotes_OpenAsDraftNoteButton(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='draftnote']")); //Unique Id Of On The Basis Of Which Enhanced Notes OpenAsDraftNoteButton Can Be Identified
		return Element;
	}




	//====================================================================================================================================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Drafticon
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Enhanced Notes Drafticon Can Be Identified On Notes Tab
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-19-2020                                
	//====================================================================================================================================================================================================


	public static WebElement RMAApp_EnhancedNotes_Drafticon(WebDriver driver , String text)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@title='"+text+"']//descendant::div[@title='Edit Draft']"));//Unique Id Of On The Basis Of Which Enhanced Notes Drafticon Can Be Identified
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Arrow Selector Enhanced Notes UX Grid On RMA Application Progress Notes Creation/Edit Page Is Fetched
		return Element;
	}

	//====================================================================================================================================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Notes_Attachment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Enhanced Notes Notes Attachment Button Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-19-2020                                
	//====================================================================================================================================================================================================
	public static WebElement RMAApp_EnhancedNotes_Notes_Attachment(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@name='NoteAttachment']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Attachment Button On Enhanced Notes Can Be Identified
		return Element;
	}

	//====================================================================================================================================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_All_colors_Div
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Enhanced Notes All Color Button Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-19-2020                                
	//====================================================================================================================================================================================================
	public static WebElement RMAApp_EnhancedNotes_All_colors_Div(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='divOpen']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of All Color Button On Enhanced Notes Can Be Identified
		return Element;
	}

	//====================================================================================================================================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Temp
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Enhanced Notes Temp Button Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-19-2020                                
	//====================================================================================================================================================================================================
	public static WebElement RMAApp_EnhancedNotes_Temp(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='btnTemplates']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Temp Button On Enhanced Notes Can Be Identified
		return Element;
	}

	//====================================================================================================================================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_UXGrid_FilterTextBoxtest1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Field Is Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-19-2020                                
	//====================================================================================================================================================================================================
	public static WebElement RMAApp_EnhancedNotes_UXGrid_FilterTextBoxtest1(WebDriver driver, String text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+text+"')]/ancestor::div[2]//*[@placeholder='']")); //Unique Id Of Test Field After Removing Filter Is Identified
		return Element;
	}

	//====================================================================================================================================================================================================
	//FunctionName 			: RMAApp_EnhancedNotes_Btn_SaveAsdraft_RdLine
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Field Is Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-05-19-2020                                
	//====================================================================================================================================================================================================
	public static WebElement RMAApp_EnhancedNotes_Btn_SaveAsdraft_RdLine(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath("//*[@style='border-bottom: 3px solid red']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Red Line On Create/Edit Window On Enhanced Notes Screen Can Be Identified Is Fetched

		return Element;
	}
}
