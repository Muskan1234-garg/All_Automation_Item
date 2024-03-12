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
	//Revision				: 0.0 - VSood-7-2021                                
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

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event State LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-04-04-2018                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_stateid_openlookup")); //Unique Id Of Event State Look Up Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_StateCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Code Text Box On State Window On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-04-24-2018                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_StateCode(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@class='ui-grid-filter-input ui-grid-filter-input-0']")); //Unique Id Of Code Text Box On State Window On RMA Application Event Creation Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='priority']")); //Unique Id Of Code Text Box On State Window On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_EventIndicator
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Indicator LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_EventIndicator(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_eventindcode_openlookup")); //Unique Id Of Event Indicator Look Up Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_EventIndicator
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Indicator TextBox On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_EventIndicator(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_eventindcode")); //Unique Id Of Event Indicator TextBox On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_EventIndicatorLookupSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Indicator Lookup Search TextBox On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_EventIndicatorLookupSearch(WebDriver driver, String FilterName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[text()='"+FilterName+"']//ancestor::div[@role='columnheader']//input")); //Unique Id Of Event Indicator Lookup Search TextBox On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_EventIndicatorLookupSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Indicator Lookup Search Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_EventIndicatorLookupSearch(WebDriver driver, String FilterName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[text()='"+FilterName+"']//ancestor::div[@role='columnheader']//span[@role='button']")); //Unique Id Of Event Indicator Lookup Search Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventFallInfo_Txt_CondPrior
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Condition Prior TextBox On RMA Application Event Fall Info Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventFallInfo_Txt_CondPrior(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_condpriorcode")); //Unique Id Of Condition Prior TextBox On RMA Application Event Fall Info Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventFallInfo_Btn_CondPrior
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Condition Prior Lookup Button On RMA Application Event Fall Info Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventFallInfo_Btn_CondPrior(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_condpriorcode_openlookup")); //Unique Id Of Condition Prior Lookup Button On RMA Application Event Fall Info Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventFallInfo_Txt_SideRailPos
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Side Rail Position TextBox On RMA Application Event Fall Info Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventFallInfo_Txt_SideRailPos(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_railpositioncode")); //Unique Id Of Side Rail Position TextBox On RMA Application Event Fall Info Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventFallInfo_Btn_SideRailPos
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Side Rail Position Lookup Button On RMA Application Event Fall Info Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventFallInfo_Btn_SideRailPos(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_railpositioncode_openlookup")); //Unique Id Of Side Rail Position Lookup Button On RMA Application Event Fall Info Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventFallInfo_Txt_Restraints
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Restraints TextBox On RMA Application Event Fall Info Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventFallInfo_Txt_Restraints(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_restraintcode")); //Unique Id Of Restraints TextBox On RMA Application Event Fall Info Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventFallInfo_Btn_Restraints
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Restraints Lookup Button On RMA Application Event Fall Info Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventFallInfo_Btn_Restraints(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_restraintcode_openlookup")); //Unique Id Of Restraints Lookup Button On RMA Application Event Fall Info Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventFallInfo_Txt_BedPosition
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bed Position TextBox On RMA Application Event Fall Info Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventFallInfo_Txt_BedPosition(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_bedpositioncode")); //Unique Id Of Bed Position TextBox On RMA Application Event Fall Info Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventFallInfo_Btn_Restraints
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bed Position Lookup Button On RMA Application Event Fall Info Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventFallInfo_Btn_BedPosition(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_bedpositioncode_openlookup")); //Unique Id Of Bed Position Lookup Button On RMA Application Event Fall Info Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventFallInfo_Txt_CallLightWithinRange
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Call Light Within Range TextBox On RMA Application Event Fall Info Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventFallInfo_Txt_CallLightWithinRange(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_calllightcode")); //Unique Id Of Call Light Within Range TextBox On RMA Application Event Fall Info Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventFallInfo_Btn_CallLightWithinRange
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Call Light Within Range Lookup Button On RMA Application Event Fall Info Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventFallInfo_Btn_CallLightWithinRange(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_calllightcode_openlookup")); //Unique Id Of Call Light Within Rangen Lookup Button On RMA Application Event Fall Info Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatch_Txt_ReportersLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reporter's Last Name TextBox On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatch_Txt_ReportersLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_replastname")); //Unique Id Of Reporter's Last Name TextBox On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatch_Btn_ReportersLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reporter's Last Name Search Button On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatch_Btn_ReportersLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_replastname' and @ng-disabled]")); //Unique Id Of Reporter's Last Name Search Button On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatch_Txt_FirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Name TextBox On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatch_Txt_FirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repfirstname")); //Unique Id Of First Name TextBox On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatch_Txt_Address1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address1 TextBox On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatch_Txt_Address1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repaddr1")); //Unique Id Of Address1 TextBox On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatch_Txt_Address2
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address2 TextBox On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatch_Txt_Address2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repaddr2")); //Unique Id Of Address2 TextBox On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatch_Txt_Address3
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address3 TextBox On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatch_Txt_Address3(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repaddr3")); //Unique Id Of Address3 TextBox On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatch_Txt_Address4
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address4 TextBox On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatch_Txt_Address4(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repaddr4")); //Unique Id Of Address4 TextBox On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatch_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which City TextBox On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatch_Txt_City(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repcity")); //Unique Id Of City TextBox On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatch_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State TextBox On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatch_Txt_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_repstateid")); //Unique Id Of State TextBox On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatch_Btn_ReportersLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Lookup Button On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatch_Btn_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_repstateid")); //Unique Id Of State Lookup Button On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatch_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country TextBox On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatch_Txt_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_repcountrycode")); //Unique Id Of Country TextBox On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatch_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country Lookup Button On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatch_Btn_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_repcountrycode")); //Unique Id Of Country Lookup Button On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatchTest_Txt_TestDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Test Date TextBox On Med Watch Test Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-24-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatchTest_Txt_TestDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='testdate' and @type='text']")); //Unique Id Of Test Date TextBox On Med Watch Test Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatchTest_Btn_LabTestComment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Lab Test Comment Button On Med Watch Test Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-24-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatchTest_Btn_LabTestComment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='labTest']//button")); //Unique Id Of Lab Test Comment Button On Med Watch Test Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventMedWatchTest_Btn_LabTest
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Result Comment Button On Med Watch Test Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-24-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventMedWatchTest_Btn_ResultComment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='result']//button")); //Unique Id Of Result Comment Button On Med Watch Test Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventConco_Txt_ProductNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Concomitant Product Number TextBox On Concomitant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-24-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventConco_Txt_ProductNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("concomproductid")); //Unique Id Of Concomitant Product Number TextBox On Concomitant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventConco_Txt_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which From Date TextBox On Concomitant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-24-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventConco_Txt_FromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='fromdate' and @type='text']")); //Unique Id Of From Date TextBox On Concomitant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventConco_Txt_ToDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Date TextBox On Concomitant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-24-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventConco_Txt_ToDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='todate' and @type='text']")); //Unique Id Of To Date TextBox On Concomitant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventConco_Btn_ConcoProdDescComment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Concomitant Product Description Comment Button On Concomitant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-24-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventConco_Btn_ConcoProdDescComment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='concomproduct']//button")); //Unique Id Of Concomitant Product Description Comment Button On Concomitant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_CauseCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cause Code Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-14-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_CauseCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_causecode']")); //Unique Id Of Cause Code Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_Outcome
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Outcome Lookup Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-14-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_Outcome(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_outcomelist']")); //Unique Id Of Outcome Lookup Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_LocationType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Location Type Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-14-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_LocationType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_locationtypecode']")); //Unique Id Of Location Type Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_PrimaryLocation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Primary Location Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-14-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_PrimaryLocation(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_primaryloccode']")); //Unique Id Of Primary Location Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event State LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.1 - MishalKantawala-06-09-2020 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_countrycode_openlookup")); //Unique Id Of Event State Look Up Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event State LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-04-04-2018
	//Revision				: 0.1 - MishalKantawala-06-09-2020 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_stateid")); //Unique Id Of Event State Look Up Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_LocationDescription
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Location Description LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_LocationDescription(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='locationareadesc']//*[contains(@type,'button')]")); //Unique Id Of Location Description Look Up Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_EventDescription
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Description LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_EventDescription(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='eventdescription']//*[contains(@type,'button')]")); //Unique Id Of Event Description Look Up Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_Editor
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event State LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_Editor(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='fr-element fr-view']")); //Unique Id Of Editor type popup On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_CloseEditor
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event's text Editor get closed
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_CloseEditor(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='fr-element fr-view']")); //Unique Id Of Editor's closed button
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_EditorOk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event's text Editor get closed
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_EditorOk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='usericon']/i")); //Unique Id Of Editor's closed button
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_LocationAddress_2
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Location Address Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_LocationAddress_2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("addr2")); //Unique Id Of Location Address Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_LocationAddress_3
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Location Address Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_LocationAddress_3(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("addr3")); //Unique Id Of Location Address Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_LocationAddress_4
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Location Address Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_LocationAddress_4(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("addr4")); //Unique Id Of Location Address Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country TextBox On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_repcountrycode")); //Unique Id Of Country TextBox On Med Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which City TextBox On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_City(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("city")); //Unique Id Of City Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_Zip
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip TextBox On Med Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_Zip(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("zipcode")); //Unique Id Of Zipcode Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_PrimaryLocation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which lookup button of Primary Location on Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_PrimaryLocation(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_primaryloccode_openlookup")); //Unique Id Of Primary Location on Event Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_CauseCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which lookup button of Cause Code on Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_CauseCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_causecode_openlookup")); //Unique Id Of CauseCode on Event Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_LocationType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which lookup button of Location Type on Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_LocationType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_locationtypecode_openlookup")); //Unique Id Of Location Type Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_NumberOfInjuries
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which textbox of Number Of Injuries on Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_NumberOfInjuries(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("noofinjuries")); //Unique Id Of Number Of Injuries on Event page Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_NumberOfFatalities
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which textbox of Number Of Fatalities on Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_NumberOfFatalities(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("nooffatalities")); //Unique Id Of Number Of Fatalities on Event page Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ReporterFirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which textbox of Reporter Info's First Name on Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ReporterFirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repfirstname")); //Unique Id Of Reporter Info's First Name  on Event page Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ReporterAddress_1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reporter Address Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ReporterAddress_1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repaddr1")); //Unique Id Of Reporter Address Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ReporterAddress_2
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reporter Address Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ReporterAddress_2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repaddr2")); //Unique Id Of Reporter Address Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ReporterAddress_3
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reporter Address Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ReporterAddress_3(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repaddr3")); //Unique Id Of Reporter Address Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ReporterAddress_4
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reporter Address Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ReporterAddress_4(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repaddr4")); //Unique Id Of Reporter Address Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ReporterCity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which City TextBox On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ReporterCity(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repcity")); //Unique Id Of City Reporter Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_Zip
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip TextBox On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ReporterZip(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repzipcode")); //Unique Id Of Zip Reporter Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_ReporterState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Reporter State LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-04-04-2018                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_ReporterState(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_repstateid_openlookup")); //Unique Id Of Event's Reporter State Look Up Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_ReporterCountry
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Reporter Country LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-23-2019                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_ReporterCountry(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_repcountrycode_openlookup")); //Unique Id Of Event's Reporter Coountry Look Up Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ReporterSocSecnum
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Social Security Number TextBox On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ReporterSocSecnum(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("reptaxid")); //Unique Id Of Social Security Number Reporter Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ReporterOfficePhone
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Office Phone TextBox On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ReporterOfficePhone(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repphone1")); //Unique Id Of Office Phone Reporter Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ReporterHomePhone
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Home Phone TextBox On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ReporterHomePhone(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repphone2")); //Unique Id Of Home Phone Reporter Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ReporterFax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Fax TextBox On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ReporterFax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repfaxnumber")); //Unique Id Of Fax Reporter Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ReporterEmail
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Email TextBox On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ReporterEmail(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("repemailaddress")); //Unique Id Of Email Reporter Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_InterventionRequestedRequired
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Intervention Requested/Required check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_InterventionRequestedRequired(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("requireIntervention")); //Unique Id Of Intervention Requested/Required Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_TreatmentGiven
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Treatment Given check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_TreatmentGiven(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("treatmentgiven")); //Unique Id Of Treatment Given Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_ReleaseSigned
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Release Signed check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_ReleaseSigned(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("relsigned")); //Unique Id Of Release Signed Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_DepartmentHeadAdvised
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Department Head Advised check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_DepartmentHeadAdvised(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("deptheadadvised")); //Unique Id Of Department Head Advised Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_DatePhysicianAdvised
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Physician Advised textbox On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_DatePhysicianAdvised(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='datephysadvised' and @type='text']")); //Unique Id Of Date Physician Advised Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_TimePhysicianAdvised
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Time Physician Advised textbox On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_TimePhysicianAdvised(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='timephysadvised' and @type='text']")); //Unique Id Of Time Physician Advised Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_CarrierNotifiedDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Carrier Notified Date textbox On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_CarrierNotifiedDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='datecarriernotif' and @type='text']")); //Unique Id Of Carrier Notified Date Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_PhysicianNotes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Physician Notes LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_PhysicianNotes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='physnotes']//*[contains(@role, 'button')]")); //Unique Id Of Physician Notes Look Up Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_PhysicianNotesEditor
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Physician Notes Editor On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_NotesEditor(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("newTextComments")); //Unique Id Of Physician Notes Editor On RMA Application Event Creation Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_Actions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Actions Lookup Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_Actions(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_actionslist")); //Unique Id Of Actions Lookup Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_Occupation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Reporter Occupation LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_Occupation(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_rptdbyposcode_openlookup")); //Unique Id Of Event's Reporter Occupation Look Up Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_HealthProfessional
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Health Professional check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_HealthProfessional(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("rptdbyproflag")); //Unique Id Of Health Professional Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_RelevantHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PRelevant History LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_RelevantHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='relevanthistory']//*[contains(@role, 'button')]")); //Unique Id Of Relevant History Look Up Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_DateReportedToManufacturer
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Reported To Manufacturer Text Box On RMA Application Event's MED Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:0.0 - MishalKantawala-06-09-2020                                
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_DateReportedToManufacturer(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='daterptdtomfg' and @type='text']")); //Unique Id Of Date Reported To Manufacturer Text Box On RMA Application Event's MED Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_DateReportedToFDA
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Reported To FDA Text Box On RMA Application Event's MED Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:0.0 - MishalKantawala-06-09-2020                                
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_DateReportedToFDA(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='daterptdtofda' and @type='text']")); //Unique Id Of Date Reported To FDA Text Box On RMA Application Event's MED Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_LastReportedDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Reported Date Text Box On RMA Application Event's MED Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:0.0 - MishalKantawala-06-09-2020                                
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_LastReportedDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lastreportdate' and @type='text']")); //Unique Id Of Last Reported Date To FDA Text Box On RMA Application Event's MED Watch Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_FollowUpCount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Follow Up Count Text Box On RMA Application Event's MED Watch Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:0.0 - MishalKantawala-06-09-2020                                
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_FollowUpCount(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@id='followupcount' and @style='']")); //Unique Id Of Follow Up Count To FDA Text Box On RMA Application Event's MED Watch Creation Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='followupcount']")); //Unique Id Of Follow Up Count To FDA Text Box On RMA Application Event's MED Watch Creation Page Is Fetched
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_ProductProblem
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Product Problem check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_ProductProblem(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='productprobflag']")); //Unique Id Of Product Problem Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_Hospitalized
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Hospitalized check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_Hospitalized(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='hospitalizflag']")); //Unique Id Of Hospitalized Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_RequiredIntervention
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Required Intervention check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_RequiredIntervention(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='reqintervflag']")); //Unique Id Of Required Intervention Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_MandatoryReport
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Mandatory Report check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_MandatoryReport(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='rptmandatory']")); //Unique Id Of Mandatory Report Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_AdverseEvent
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Adverse Event check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_AdverseEvent(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='adverseeventflag']")); //Unique Id Of Adverse Event Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_LifeThreatening
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Life Threatening check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_LifeThreatening(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lifethreatflag']")); //Unique Id Of Life Threatening Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_Congenital
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Congenital check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_Congenital(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='congenitalflag']")); //Unique Id Of Congenital Info Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_Disability
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability check box On Reporter Info accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_Disability(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='disabilityflag']")); //Unique Id Of Disability Info Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Tab_EquipmentIndicator
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EventDetail Tab On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                  
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Tab_EquipmentIndicator(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Equipment Indicator')]/descendant::i[1]")); //Unique Id  Of EventDetail Tab On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ManufacturerName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Manufacturer Name Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-23-2017                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ManufacturerName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_manulastname")); //Unique Id  Of Manufacturer Name Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ManufacturerAddress1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Manufacturer Address1 Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-23-2017                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ManufacturerAddress1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("manuaddr1")); //Unique Id  Of Manufacturer Address1 Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ManufacturerAddress2
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Manufacturer Address2 Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-23-2017                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ManufacturerAddress2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("manuaddr2")); //Unique Id  Of Manufacturer Address2 Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ManufacturerAddress3
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Manufacturer Address3 Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-23-2017                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ManufacturerAddress3(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("manuaddr3")); //Unique Id  Of Manufacturer Address3 Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ManufacturerAddress4
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Manufacturer Address1 Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-23-2017                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ManufacturerAddress4(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("manuaddr4")); //Unique Id  Of Manufacturer Address4 Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_ManufacturerCity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Manufacturer City Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-23-2017                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ManufacturerCity(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("manucity")); //Unique Id  Of Manufacturer City Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_ManufacturerState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Manufacturer State Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-23-2017                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_ManufacturerState(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_manustateid_openlookup")); //Unique Id  Of Manufacturer State Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Tab_MedicationIndicator
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medication Indicator Tab On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                  
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Tab_MedicationIndicator(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Medication Indicator')]/descendant::i[1]")); //Unique Id  Of Medication Indicator Tab On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_MedicationType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Medication Type LookUp Button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                   
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_MedicationType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_medtype_openlookup")); //Unique Id Of Event's Medication Type Look Up Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_MedicationName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medication Name Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_MedicationName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("medname")); //Unique Id  Of Medication Name Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_Dose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dose Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_Dose(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("dose")); //Unique Id  Of Dose Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_Frequency
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Frequency Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_Frequency(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("frequency")); //Unique Id  Of Frequency Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_Route
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Route Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_Route(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("route")); //Unique Id  Of Route Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_SummaryOfIncident
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Route Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_SummaryOfIncident(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id='sent_event_desc']//*[contains(@type,'button')]")); //Unique Id  Of Summary Of Incident button  On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_ConsequenceOfEvent
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ConsequenceOfEvent button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_ConsequenceOfEvent(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id='damage_cons']//*[contains(@type, 'button')]")); //Unique Id  Of ConsequenceOfEvent Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_ChangedDuringEvent
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CChanged At The Time Of Event button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_ChangedDuringEvent(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id='diff_changed']//*[contains(@type, 'button')]")); //Unique Id  Of Changed At The Time Of Event Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_PreventedTheIncident
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Prevented The Incident button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_PreventedTheIncident(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id='prevent']//*[contains(@type, 'button')]")); //Unique Id  Of Prevented The Incident Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_ChangesMadeToReduceRisk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Changes Made To Reduce Risk Again button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_ChangesMadeToReduceRisk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id='previous_fix']//*[contains(@type, 'button')]")); //Unique Id  Of Changes Made To Reduce Risk Againt Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_UnusualReport
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CUnusual Report button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_UnusualReport(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id='unusual_report']//*[contains(@type, 'button')]")); //Unique Id  Of CUnusual Report Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_Comments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CUnusual Report button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_Comments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id='comments']//*[contains(@type, 'button')]")); //Unique Id  Of CUnusual Report Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_ProceduresFollowed
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Procedures  Followed button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_ProceduresFollowed(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("proc_followed1")); //Unique Id  Of Procedures Followed Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_AvoidWorse
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Avoid Worse button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_AvoidWorse(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("avoid_worse1")); //Unique Id  Of Avoid Worse Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_StaffKnowHandle
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Staff Know Handle button On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-06-09-2020                                
	// ============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_StaffKnowHandle(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("staff_know_handle1")); //Unique Id  Of Staff KnowHandle Button On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Btn_EventOnPresmise
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event On Presmise check box On Event Detail accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Btn_EventOnPresmise(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("onpremiseflag")); //Unique Id Of Event On Presmise check box On Event Detail accordion Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_ModalDialogOK
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which OK Button On Generic Modal Dialog On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                
	//============================================================================================
	public static WebElement RMAApp_GenericBtn_ModalDialogOK(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnRoll")); //Unique Id Of OK Button On Generic Modal Dialog On RMA Application Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_LocationState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Location State Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_LocationState(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_stateid")); //Unique Id Of Location State Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Txt_LocationCountry
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Location Country Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Txt_LocationCountry(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_countrycode")); //Unique Id Of Location Country Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EventCreation_Button_Intervention
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Location Country Text Box On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-05-02-2021                                 
	//============================================================================================
	public static WebElement RMAApp_EventCreation_Button_Intervention(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Intervention']")); //Unique Id Of Location Country Text Box On RMA Application Event Creation Page Is Fetched
		return Element;
	}
	//============================================================================================
		//FunctionName 			: RMAApp_EventCreation_Button_AddIntervention
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Location Country Text Box On RMA Application Event Creation Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-05-02-2021                                 
		//============================================================================================
		public static WebElement RMAApp_EventCreation_Button_AddIntervention(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Add New']")); //Unique Id Of Location Country Text Box On RMA Application Event Creation Page Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_EventCreation_Button_AddIntervention
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Location Country Text Box On RMA Application Event Creation Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-05-02-2021                                 
		//============================================================================================
		public static WebElement RMAApp_EventCreation_Button_Intervention_Name(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[@id='lookup_lastfirstname']")); //Unique Id Of Location Country Text Box On RMA Application Event Creation Page Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_Intervention_Tab_Evaluation Management
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Quality Management Tab On RMA Application Event Creation Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
		//============================================================================================
		public static WebElement RMAApp_Intervention_Tab_Evaluation(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[contains(text(),'Evaluation/Intervention')]/descendant::i[1]"));//Unique Id Of Quality Management Tab On RMA Application Event Creation Page Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_EventCreation_Txt_Intervention_Department
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Department Text Box On RMA Application Event Creation Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-05-31-2017                                
		//============================================================================================
		public static WebElement RMAApp_EventCreation_Txt_Intervention_Department(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[@id='lookup_deptassignedeid']")); //Unique Id Of Department Text Box On RMA Application Event Creation Page Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_EventCreation_Txt_Intervention_AnticipatedCost
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Department Text Box On RMA Application Event Creation Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-05-31-2017                                
		//============================================================================================
		public static WebElement RMAApp_EventCreation_Txt_Intervention_AnticipatedCost(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[@id='antcost']")); //Unique Id Of Department Text Box On RMA Application Event Creation Page Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_EventCreation_Txt_Intervention_Status
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Department Text Box On RMA Application Event Creation Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-05-31-2017                                
		//============================================================================================
		public static WebElement RMAApp_EventCreation_Txt_Intervention_Status(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[@id='lookup_status']")); //Unique Id Of Department Text Box On RMA Application Event Creation Page Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_EventCreation_Txt_Intervention_NCReason
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Department Text Box On RMA Application Event Creation Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-05-31-2017                                
		//============================================================================================
		public static WebElement RMAApp_EventCreation_Txt_Intervention_NCReason(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[@id='lookup_noncmpres']")); //Unique Id Of Department Text Box On RMA Application Event Creation Page Is Fetched
			return Element;
		}	
		//============================================================================================
		//FunctionName 			: RRMAApp_Intervention_SearchGrid
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Entity is Selected On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-09-02-2021                                  
		//============================================================================================
		public static WebElement RRMAApp_Intervention_SearchGrid(WebDriver driver)
		{
			Element=null;
			Element = driver.findElement(By.xpath(".//*[text()='Employee']/following::input[@class='ui-grid-filter-input ui-grid-filter-input-0 ng-empty'][1]")); //Unique Id Of Selected Entities Radio Button Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RRMAApp_Event_QualityManagement_Checkbox
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Entity is Selected On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-09-02-2021                                  
		//============================================================================================
		public static WebElement RRMAApp_Event_QualityManagement_Checkbox(WebDriver driver)
		{
			Element=null;
			Element = driver.findElement(By.id("UseQualityMgt")); //Unique Id Of Selected Checkbox Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RRMAApp_Event_QualityManagement_CaseNumber
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Entity is Selected On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-09-02-2021                                  
		//============================================================================================
		public static WebElement RRMAApp_Event_QualityManagement_CaseNumber(WebDriver driver)
		{
			Element=null;
			Element = driver.findElement(By.xpath(".//*[@id='medcasenumber']")); //Unique Id Of Selected TextBox Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RRMAApp_Event_QualityManagement_MedicalIndicator
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Entity is Selected On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-09-02-2021                                  
		//============================================================================================
		public static WebElement RRMAApp_Event_QualityManagement_MedicalIndicator(WebDriver driver)
		{
			Element=null;
			Element = driver.findElement(By.xpath(".//*[@id='lookup_medindcode']")); //Unique Id Of Selected TextBox Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RRMAApp_Event_QualityManagement_MedCategory
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Entity is Selected On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-09-02-2021                                  
		//============================================================================================
		public static WebElement RRMAApp_Event_QualityManagement_MedCategory(WebDriver driver)
		{
			Element=null;
			Element = driver.findElement(By.xpath(".//*[@id='lookup_medfilecode']")); //Unique Id Of Selected TextBox Is Fetched
			return Element;
		}
		
		
}
