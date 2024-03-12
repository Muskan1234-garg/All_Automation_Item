package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Document_Event {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_EventType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Type Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_EventType(WebDriver driver)
{
	Element = driver.findElement(By.id("eventtypecode_codelookup")); //Unique Id  Of Event Type Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_DateOfEvent
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DateOfEvent Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_DateOfEvent(WebDriver driver)
{
	Element = driver.findElement(By.id("dateofevent")); //Unique Id  Of DateOfEvent Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_TimeOfEvent
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TimeOfEvent Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_TimeOfEvent(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='timeofevent']")); //Unique Id  Of TimeOfEvent Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_EventStatus
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EventStatus Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_EventStatus(WebDriver driver)
{
	Element = driver.findElement(By.id("eventstatuscode_codelookup")); //Unique Id  Of EventStatus Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_DateReported
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DateReported Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_DateReported(WebDriver driver)
{
	Element = driver.findElement(By.id("datereported")); //Unique Id  Of DateReported Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_TimeReported
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TimeReported Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_TimeReported(WebDriver driver)
{
	Element = driver.findElement(By.id("timereported")); //Unique Id  Of TimeReported Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_DepteId
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DepteId Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_DepteId(WebDriver driver)
{
	Element = driver.findElement(By.id("depteid")); //Unique Id  Of DepteId Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Btn_Save
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DepteId Save Button On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
// ============================================================================================
public static WebElement RMAApp_EventCreation_Btn_Save(WebDriver driver)
{
	Element = driver.findElement(By.id("save")); //Unique Id  Of Save Button On RMA Application Event Creation Page Is Fetched
	return Element;
	
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_EvntNumber
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Number Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-23-2015                                 
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_EvntNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("eventnumber")); //Unique Id  Of Event Number Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_DatedText_Btn_DatedTextMemo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dated text memo button On RMA Application Event/adjuster dated text Creation  Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahenderaPSingh-02-07-2017                                 
//============================================================================================
public static WebElement RMAApp_DatedText_Btn_DatedTextMemo(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@name='datedtextbtnMemo']")); //Unique Id  Of Dated text memo button On RMA Application Event/adjuster dated text Creation Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_DatedText_Txt_DatedTextArea
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dated text, text area on RMA Application Event/adjuster dated text screen Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahenderaPSingh-02-013-2017                                 
//============================================================================================
public static WebElement RMAApp_DatedText_Txt_DatedTextArea(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@name='datedtext']")); //Unique Id  Of Dated text, text area on RMA Application Event/adjuster dated text Page Is Fetched
	return Element;
}

}
