package rmaseleniumPOM;

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
//Revision				: 0.0 - KumudNaithani-07-26-2016                                 
// ============================================================================================
public static WebElement RMAApp_EnhancedNotes_Btn_CreateNotes(WebDriver driver)
{
	Element = driver.findElement(By.id("btnCreateNote")); //Unique Id Create Notes Button On RMA Application Progress Notes Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EnhancedNotes_Txt_NotesType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Notes Type TextBox On RMA Application Progress Notes Creation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-26-2016                                 
//============================================================================================
public static WebElement RMAApp_EnhancedNotes_Txt_NotesType(WebDriver driver)
{
	Element = driver.findElement(By.id("noteslookup")); //Unique Id Of Notes Type TextBox On RMA Application Progress Notes Creation/Edit  Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EnhancedNotes_Btn_NotesLookUp
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which NotesLookUp Button On RMA Application Progress Notes Creation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-26-2016                                 
//============================================================================================
public static WebElement RMAApp_EnhancedNotes_Btn_NotesLookUp(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_noteslookup")); //Unique Id Of NotesLookUp Button On RMA Application Progress Notes Creation/Edit Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EnhancedNotes_Btn_Save
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Application Progress Notes Creation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-26-2016                                 
//============================================================================================
public static WebElement RMAApp_EnhancedNotes_Btn_Save(WebDriver driver)
{
	Element = driver.findElement(By.id("btnSave")); //Unique Id Of Save Button On RMA Application Progress Notes Creation/Edit Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EnhancedNotes_TxtArea_ProgressNotes
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Text Area On RMA Application Progress Notes Creation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-26-2016     
//Modify By			:0.1-RenuVerma-01-23-2017                            
//============================================================================================
public static WebElement RMAApp_EnhancedNotes_TxtArea_ProgressNotes(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='userForm']//*[@contenteditable='true']")); //Unique Id Of Text Area On RMA Application Progress Notes Creation/Edit Page Is Fetched
	return Element;
}


//============================================================================================
//FunctionName 			: RMAApp_EnhancedNotes_Btn_Save
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which BackToNotes Button On RMA Application Progress Notes Creation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-26-2016                                 
//============================================================================================
public static WebElement RMAApp_EnhancedNotes_Btn_BackToNotes(WebDriver driver)
{
	Element = driver.findElement(By.id("btnBackToNotes")); //Unique Id Of BackToNotes Button On RMA Application Progress Notes Creation/Edit Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EnhancedNotes_Btn_Save
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EditNote Button On RMA Application Progress Notes Creation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-26-2016                                 
//============================================================================================
public static WebElement RMAApp_EnhancedNotes_Btn_EditNote(WebDriver driver)
{
	Element = driver.findElement(By.id("btnEditNote")); //Unique Id Of EditNote Button On RMA Application Progress Notes Creation/Edit Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EnhancedNotes_Btn_Save
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DeleteNote Button On RMA Application Progress Notes Creation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-26-2016                                 
//============================================================================================
public static WebElement RMAApp_EnhancedNotes_Btn_DeleteNote(WebDriver driver)
{
	Element = driver.findElement(By.id("btnDeleteNotes")); //Unique Id Of Delete Note Button On RMA Application Progress Notes Creation/Edit Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Enhanced Notes_Msg_TextMessage
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Toast Message On RMA Application Progress Notes Creation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-27-2016                                
// ============================================================================================
public static WebElement RMAApp_EnhancedNotes_Msg_TextMessage(WebDriver driver)
{
	Element = driver.findElement(By.className("toast-message")); //Unique Id Of Toast Message On RMA Application Progress Notes Creation/Edit Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EnhancedNotes_UXGrid_FilterTextBox
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Enhanced Notes UX Grid Filter Text Box On RMA Application Progress Notes Creation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-27-2016                                
//============================================================================================
public static WebElement RMAApp_EnhancedNotes_UXGrid_FilterTextBox(WebDriver driver, int index)
{
	Element = driver.findElements(By.xpath(".//*[@class='ui-grid-filter-input ui-grid-filter-input-0']")).get(index-1); //Unique Id Of Enhanced Notes UX Grid Filter Text Box On RMA Application Progress Notes Creation/Edit Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EnhancedNotes_UXGrid_ArrowSelector
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Arrow Selector Enhanced Notes UX Grid On RMA Application Progress Notes Creation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-27-2016                                
//============================================================================================
public static WebElement RMAApp_EnhancedNotes_UXGrid_ArrowSelector(WebDriver driver, int index)
{
	Element = driver.findElements(By.xpath(".//*[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope']")).get(index-1); //Unique Id Of Arrow Selector Enhanced Notes UX Grid On RMA Application Progress Notes Creation/Edit Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EnhancedNotesAlert_Btn_Delete
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Delete Button On Alert Message On RMA Application Progress NotesCreation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-27-2016                                
//Modify By			:0.1 - RenuVerma-01-23-2017 
//============================================================================================
public static WebElement RMAApp_EnhancedNotesAlert_Button_Delete(WebDriver driver)
{
	Element = driver.findElement(By.id("btnDeletecc")); //Unique Id Of Delete Button On Alert Message On RMA Application Progress Notes Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EnhancedNotesAlert_Btn_Cancel
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Cancel Button On Alert Message On RMA Application Progress NotesCreation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-27-2016                                
//Modify By				:0.1 - RenuVerma-01-23-2017 
//============================================================================================
public static WebElement RMAApp_EnhancedNotesAlert_Button_Cancel(WebDriver driver)
{
	Element = driver.findElement(By.id("btnCancelsas")); //Unique Id Of Cancel Button On Alert Message On RMA Application Progress Notes Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EnhancedNotesAlert_Msg
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Alert Message On RMA Application Progress NotesCreation/Edit Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-27-2016                                
//Modify By				:0.1-RenuVerma-01-23-2017 
//============================================================================================
public static WebElement RMAApp_EnhancedNotesAlert_Msg(WebDriver driver)
{
	Element = driver.findElement(By.id("H1")); //Unique Id Of Alert Message On RMA Application Progress Notes Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			:RMAApp_EnhancedNotes_Txt_NoRecordsAvailable
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which No Records Available Text On Enhanced Notes Primary Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-27-2016                                
//============================================================================================
public static WebElement RMAApp_EnhancedNotes_Txt_NoRecordsAvailable(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='progressNotesGrid']/div[1]/p")); //Unique Id Of No Records Available Text On Enhanced Notes Primary Page Is Fetched
	return Element;
}
}
