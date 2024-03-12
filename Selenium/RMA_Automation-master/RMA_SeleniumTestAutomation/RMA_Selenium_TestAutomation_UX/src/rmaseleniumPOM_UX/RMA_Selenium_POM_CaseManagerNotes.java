package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_CaseManagerNotes {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagerNotes_Txt_NoteType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dated Note Type TextBox On RMA Application Case Manager Notes Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-10-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagerNotes_Txt_NoteType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_notestypecode']")); //Unique Id  Of Dated Notes Type TextBox On RMA Application Case Manager Notes Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagerNotes_Btn_NoteType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dated Note Type Lookup Button On RMA Application Case Manager Notes Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-10-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagerNotes_Btn_NoteType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_notestypecode_openlookup']")); //Unique Id  Of Dated Notes Type Lookup Button On RMA Application Case Manager Notes Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagerNotes_Txt_EnteredByUser
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Entered By User TextBox On RMA Application Case Manager Notes Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-10-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagerNotes_Txt_EnteredByUser(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='enteredbyuser']")); //Unique Id  Of Entered By User TextBox On RMA Application Case Manager Notes Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManager_Txt_DateEntered
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Primary Date Entered textbox On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-04-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManager_Txt_DateEntered(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='dateentered")); //Unique Id  Of Date Entered textbox On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}
}
