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
	Element = driver.findElement(By.xpath(".//*[@id='btnBackToNotes']/i")); //Unique Id Of BackToNotes Button On RMA Application Progress Notes Creation/Edit Page Is Fetched
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
	Element = driver.findElement(By.xpath(".//*[@id='btnEditNote']/i")); //Unique Id Of EditNote Button On RMA Application Progress Notes Creation/Edit Page Is Fetched
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
	Element = driver.findElement(By.xpath(".//*[@id='btnDeleteNotes']/i")); //Unique Id Of Delete Note Button On RMA Application Progress Notes Creation/Edit Page Is Fetched
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Unique Id Of Close Button On Enhanced Notes Screen  Is Fetched
		return Element;
	} 
}
 


