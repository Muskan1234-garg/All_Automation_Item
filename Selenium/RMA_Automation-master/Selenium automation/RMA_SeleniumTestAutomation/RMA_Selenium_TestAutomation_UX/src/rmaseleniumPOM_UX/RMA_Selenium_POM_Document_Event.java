package rmaseleniumPOM_UX;

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
//Revision				: 0.0 - KumudNaithani-05-23-2017                                
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_EventType(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("lookup_eventtypecode")); //Unique Id  Of Event Type Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_DateOfEvent
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DateOfEvent Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_DateOfEvent(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='dateofevent' and@ type='text']")); //Unique Id  Of DateOfEvent Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_TimeOfEvent
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TimeOfEvent Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_TimeOfEvent(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='timeofevent' and@ type='text']")); //Unique Id  Of TimeOfEvent Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_EventStatus
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EventStatus Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_EventStatus(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("lookup_eventstatuscode")); //Unique Id  Of EventStatus Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_DateReported
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DateReported Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_DateReported(WebDriver driver)
{   Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='datereported' and@ type='text']")); //Unique Id  Of DateReported Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_TimeReported
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TimeReported Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                 
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_TimeReported(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='timereported' and@ type='text']")); //Unique Id  Of TimeReported Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_DepteId
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DepteId Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                               
// ============================================================================================
public static WebElement RMAApp_EventCreation_Txt_DepteId(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("lookup_depteid")); //Unique Id  Of DepteId Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_DatedText_Btn_DatedTextMemo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dated text memo button On RMA Application Event/Adjuster Dated Text Creation  Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-11-2017                                   
//============================================================================================
public static WebElement RMAApp_DatedText_Btn_DatedTextMemo(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='memo_datedtext']/following-sibling::span//i")); //Unique Id  Of Dated text memo button On RMA Application Event/Adjuster Dated Text Creation Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_DatedText_Txt_DatedTextArea
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dated text, text area on RMA Application Event/Adjuster Dated Text screen Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-11-2017                                 
//============================================================================================
public static WebElement RMAApp_DatedText_Txt_DatedTextArea(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("memo_datedtext")); //Unique Id  Of Dated text, text area on RMA Application Event/adjuster dated text Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_DatedText_Btn_OkComments
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dated text memo button On RMA Application Event/Adjuster Dated Text Creation  Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-11-2017                                   
//============================================================================================
public static WebElement RMAApp_DatedText_Btn_OkComments(WebDriver driver)
{
	Element = driver.findElement(By.id("usericon")); //Unique Id  Of Dated text memo button On RMA Application Event/Adjuster Dated Text Creation Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_DatedText_Txt_Comments
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dated text memo button On RMA Application Event/Adjuster Dated Text Creation  Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-11-2017                                   
//============================================================================================
public static WebElement RMAApp_DatedText_Txt_Comments(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@contenteditable='true']")); //Unique Id  Of Dated text memo button On RMA Application Event/Adjuster Dated Text Creation Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_EventNumber
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EventNumber Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                
//============================================================================================
public static WebElement RMAApp_EventCreation_Txt_EventNumber(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("eventnumber")); //Unique Id  Of EventNumberText Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Btn_EventStatusLookUp
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Status LookUp Button On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Btn_EventStatusLookUp(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.name("btn_eventstatuscode")); //Unique Id  Of Event Status Look Up Button On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Btn_EventTypeLookUp
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Type Look Up Button On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Btn_EventTypeLookUp(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.name("btn_eventtypecode")); //Unique Id  Of Event Type Look Up Button On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Tab_EventDetail
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EventDetail Tab On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Tab_EventDetail(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Event Detail')]/descendant::i[1]")); //Unique Id  Of EventDetail Tab On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Tab_ReportedInfo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reported Info Tab On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Tab_ReportedInfo(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Reported Info')]/descendant::i[1]")); //Unique Id  Of Reported Info Tab On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Tab_FollowUp
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FollowUp Tab On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Tab_FollowUp(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Follow Up')]/descendant::i[1]")); //Unique Id Of FollowUp Tab On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Tab_Quality Management
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Quality Management Tab On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Tab_QualityManagement(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Quality Management')]/descendant::i[1]"));//Unique Id Of Quality Management Tab On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Tab_Supplementals
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplementals Tab On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Tab_Supplementals(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i"));//Unique Id Of Supplementals Tab On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Tab_EventInfo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Info Tab On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Tab_EventInfo(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Event Info')]/i"));//Unique Id Of Event Info Tab On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_LocationAddress_1
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Location Address Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Txt_LocationAddress_1(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("addr1")); //Unique Id Of Location Address Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_ReporterLastName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reporter Last Name Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Txt_ReporterLastName(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("lookup_replastname")); //Unique Id Of Reporter Last Name Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_FollowUpDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FollowUpDate Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Txt_FollowUpDate(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("datetofollowup")); //Unique Id Of FollowUpDate Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_CaseNumber
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Case Number Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Txt_CaseNumber(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("medcasenumber")); //Unique Id Of Case Number Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Btn_DepartmentLookUp
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Department Image Look Up Button On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-31-2017                                
//============================================================================================
public static WebElement RMAApp_EventCreation_Btn_DepartmentLookUp(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='depteid']/p/span/button/i")); //Unique Id Of Department Image Look Up Button On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_Department
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Department Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-31-2017                                
//============================================================================================
public static WebElement RMAApp_EventCreation_Txt_Department(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='lookup_depteid']")); //Unique Id Of Department Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_CountyOfInjury
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which County Of Injury Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Txt_CountyOfInjury(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("countyofinjury")); //Unique Id Of County Of Injury Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_EventCreation_Txt_Outcome
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Outcome Text Box On RMA Application Event Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-21-2017                                  
//============================================================================================
public static WebElement RMAApp_EventCreation_Txt_Outcome(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='lookup_outcomelist']/ul/li/input")); //Unique Id Of Outcome Text Box On RMA Application Event Creation Page Is Fetched
	return Element;
}
}
