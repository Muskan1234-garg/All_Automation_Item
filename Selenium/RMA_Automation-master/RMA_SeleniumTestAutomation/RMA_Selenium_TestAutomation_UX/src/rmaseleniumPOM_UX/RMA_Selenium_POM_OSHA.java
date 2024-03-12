package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_OSHA {
	public static WebElement Element;

	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Chk_EventOSHARecordable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Event OSHA Recordable Check Box On RMA Application OSHA  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-12-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_OSHA_Chk_EventOSHARecordable(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("recordableflag")); //Unique Id Of Event OSHA Recordable Check Box On RMA Application OSHA  Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Chk_PrivacyCase
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Privacy Case Check Box On RMA Application OSHA  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-12-2017                                 
	//============================================================================================
	public static WebElement RMAApp_OSHA_Chk_PrivacyCase(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("privacycaseflag")); //Unique Id Of Privacy Case Check Box On RMA Application OSHA  Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Txt_SafeguardsProvided
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Safeguards Provided TextBox On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-12-2017                                   
	//============================================================================================
	public static WebElement RMAApp_OSHA_Txt_SafeguardsProvided(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("lookup_safeguardflag")); //Unique Id Of Safeguards Provided TextBox On RMA Application OSHA Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Txt_FailureToUseSafeguards
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Failure To Use Safeguards TextBox On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-12-2017                                   
	//============================================================================================
	public static WebElement RMAApp_OSHA_Txt_FailureToUseSafeguards(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("lookup_safegnotusedflag")); //Unique Id Of Failure To Use Safeguards TextBox On RMA Application OSHA Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Txt_FailureToFollowRules
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Failure to Follow Rules TextBox On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-12-2017                                   
	//============================================================================================
	public static WebElement RMAApp_OSHA_Txt_FailureToFollowRules(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("lookup_norulesflag")); //Unique Id Of Failure to Follow Rules TextBox On RMA Application OSHA Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Txt_OshaEstablishment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Osha Establishment TextBox On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-13-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_Txt_OshaEstablishment(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("lookup_oshaestablishment")); //Unique Id Of Osha Establishment TextBox On RMA Application OSHA Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Txt_PostOsha300
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Post Osha 300 On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-14-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_Txt_PostOsha300(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='menu_OshaReports']/li[1]/a")); //Unique Id Of Osha Establishment TextBox On RMA Application OSHA Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Txt_ReportName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Report Name TextBox On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-13-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_Txt_ReportName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='txt_RportName']")); //Unique Id Of Report Name TextBox On RMA Application OSHA Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Txt_ReportDescription
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReportDescription TextBox On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-13-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_Txt_ReportDescription(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_Description")); //Unique Id Of Report Name TextBox On RMA Application OSHA Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Txt_Search
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Report Name TextBox On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-13-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_Txt_UserSearch(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='userslect']/div/button")); //Unique Id Of Report Name TextBox On RMA Application OSHA Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Txt_UserSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Report Name TextBox On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-13-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_Txt_Search(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='userslect']/div/ul/li[8]/a")); //Unique Id Of Report Name TextBox On RMA Application OSHA Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On Record Summary On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================

	public static WebElement RMAApp_Close(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='btnclose']/i")); //Unique Id Of Close Button On RMA Application Record Summary OSHA Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Txt_AvailableReport
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Available Report Name On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_Txt_AvailableReport(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='menu_OshaReportsQueue']/li[1]/a")); //Unique Id Of Available Reports On RMA Application Record Summary OSHA Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_ReportName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Available Report Name On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_ReportName(WebDriver driver , String text)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@class='txt-dec cursor ng-binding' and contains(text(),'ReportName')]")); //Unique Id Of Available Reports On RMA Application Record Summary OSHA Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_ReportTitle
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Report Title On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_ReportTitle(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("reporttitle")); //Unique Id Of Report Title On RMA Application  OSHA Page Is Fetched
		return Element;
	}

	public static WebElement RMAApp_Osha_Users_SelectAll(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click='selectAll()']/span")); //Unique Id Of Select All Link Under User Select Dropdown On Advanced Search Window Is Fetched
		return Element;
	}

	public static WebElement RMAApp_PostOsha_Save(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='I1']")); 
		return Element;
	}



	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_ReportSubtitle
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Report Sub Title On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_ReportSubTitle(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("reportsubtitle")); //Unique Id Of Report Sub Title On RMA Application OSHA Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Info_OshaEstablishment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accordion of  Osha Information For Osha Establishment On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_Info_OshaEstablishment(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'OSHA Information [By OSHA Establishment]')]/i")); //Unique Id Of  Which Accordion of  Osha Information For Osha Establishment Is Fetched
		return Element;
	}
	//============================================================================================
		//FunctionName 			: RMAApp_OSHA_Info_OshaOrganisation
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accordion of  Osha Information For Osha Establishment On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-19-10-2020                                  
		//============================================================================================
		public static WebElement RMAApp_OSHA_Info_OshaOrganisation(WebDriver driver)
		{
			Element=null;
			Element = driver.findElement(By.xpath(".//*[contains(text(),'OSHA Information [By Organizational Hierarchy]')]/i")); //Unique Id Of  Which Accordion of  Osha Information For Osha Establishment Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_OSHA_Info_DriveReportBy
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accordion of  Osha Information For Osha Establishment On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-19-10-2020                                  
		//============================================================================================
		public static WebElement RMAApp_OSHA_Info_DriveReportBy(WebDriver driver)
		{
			Element=null;
			Element = driver.findElement(By.xpath(".//*[contains(text(),'Drive Report By')]/i")); //Unique Id Of  Which Accordion of  Osha Information For Osha Establishment Is Fetched
			return Element;
		}		
		//============================================================================================
		//FunctionName 			: RMAApp_OSHA_Info_UseReportLevel
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accordion of  Osha Information For Osha Establishment On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-19-10-2020                                  
		//============================================================================================
		public static WebElement RMAApp_OSHA_Info_UseReportLevel(WebDriver driver)
		{
				Element=null;
				Element = driver.findElement(By.xpath(".//*[@id='usereportlevel']")); //Unique Id Of  Which Accordion of  Osha Information For Osha Establishment Is Fetched
				return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_OSHA_Info_ReportAtLevel
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accordion of  Osha Information For Osha Establishment On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-19-10-2020                                  
		//============================================================================================
		public static WebElement RMAApp_OSHA_Info_ReportAtLevel(WebDriver driver)
		{
				Element=null;
				Element = driver.findElement(By.xpath(".//*[@id='reportlevel']")); //Unique Id Of  Which Accordion of  Osha Information For Osha Establishment Is Fetched
				return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_OSHA_Info_PrefixName
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accordion of  Osha Information For Osha Establishment On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-19-10-2020                                  
		//============================================================================================
		public static WebElement RMAApp_OSHA_Info_PrefixName(WebDriver driver)
		{
				Element=null;
				Element = driver.findElement(By.xpath(".//*[@id='establishmentnameprefix']")); //Unique Id Of  Which Accordion of  Osha Information For Osha Establishment Is Fetched
				return Element;
		}				
	
	//============================================================================================
		//FunctionName 			: RMAApp_OSHA_EmployeeDetail
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accordion of  Osha Information For Osha Establishment On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-19-10-2020                                  
		//============================================================================================
		public static WebElement RMAApp_OSHA_EmployeeDetail(WebDriver driver)
		{
			Element=null;
			Element = driver.findElement(By.xpath(".//*[contains(text(),'Employee Detail 1')]/i")); //Unique Id Of  Which Accordion of  Osha Information For Osha Establishment Is Fetched
			return Element;
		}
	//============================================================================================
	//FunctionName 			: RMAApp_Est_LengthOfDisability
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_Est_LengthOfDisability(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("estlendisability")); 
		return Element;
	}	
	//============================================================================================
		//FunctionName 			: RMAApp_DisabilityCode
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) 
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-19-10-2020                                  
		//============================================================================================
		public static WebElement RMAApp_DisabilityCode(WebDriver driver)
		{
			Element=null;
			Element = driver.findElement(By.id("btn_empdisabilitycode1_openlookup")); 
			return Element;
		}	
	
	
	
	
	
	//============================================================================================
	//FunctionName 			: RMAApp_OSHA_Info_OshaEstablishmentFlag
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Osha Establishment Radio Button On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_Info_OshaEstablishmentFlag(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("byoshaestablishmentflag")); //Unique Id Of  Which Osha Establishment Radio Button Is Fetched
		return Element;
	}
	//============================================================================================
		//FunctionName 			: RMAApp_OSHA_Info_OshaOrganisationFlag
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Osha Establishment Radio Button On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-19-10-2020                                  
		//============================================================================================
		public static WebElement RMAApp_OSHA_Info_OshaOrganisationFlag(WebDriver driver)
		{
			Element=null;
			Element = driver.findElement(By.id("byoshaestablishmentflag")); //Unique Id Of  Which Osha Establishment Radio Button Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_OSHA_Info_AssignedDepartmentFlag
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Osha Establishment Radio Button On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-19-10-2020                                  
		//============================================================================================
		public static WebElement RMAApp_OSHA_Info_AssignedDepartmentFlag(WebDriver driver)
		{
			Element=null;
			Element = driver.findElement(By.id("drivebyevent")); //Unique Id Of  Which Osha Establishment Radio Button Is Fetched
			return Element;
		}
	//============================================================================================
	//FunctionName 			: RRMAApp_OSHA_ReportingData
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Osha Reporting Data Options Accordion On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RMAApp_OSHA_ReportingData(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'OSHA Reporting Data Options')]/i")); //Unique Id Of  WhichOsha Reporting Data Options Accordion  Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RRMAApp_OSHA_180DayRule
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Osha 180 day Rule Checkbox On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RRMAApp_OSHA_180DayRule(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("enforce180dayrule")); //Unique Id Of  Which Osha 180 day Rule Checkbox Is Fetched
		return Element;
	}
	//============================================================================================
		//FunctionName 			: RRMAApp_OSHA_Recordable
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OSHA Recordable Checkbox On RMA Application OSHA Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - VartikaSood-19-10-2020                                  
		//============================================================================================
		public static WebElement RRMAApp_OSHA_Recordable(WebDriver driver)
		{
			Element=null;
			Element = driver.findElement(By.id("osharecflag")); //Unique Id Of OSHARecordable Checkbox Is Fetched
			return Element;
		}
	//============================================================================================
	//FunctionName 			: RRMAApp_OSHA_PrintProblemLog
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Osha Reporting Data Options Accordion On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RRMAApp_OSHA_PrintProblemLog(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("printsofterrlog")); //Unique Id Of  WhichOsha Reporting Data Options Accordion  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RRMAApp_OSHA_EventBasedReport
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Based Report CheckBoX On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RRMAApp_OSHA_EventBasedReport(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("eventbasedflag")); //Unique Id Of  Event Based Report CheckBoX Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RRMAApp_OSHADescription
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Osha Description CheckBoX On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RRMAApp_OSHADescription(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("printoshadescflag")); //Unique Id Of  Osha Description CheckBoX Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RRMAApp_OSHA_PrimaryLocation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Primary Location CheckBoX On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RRMAApp_OSHA_PrimaryLocation(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("primarylocationflag")); //Unique Id Of Primary Location CheckBoX Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RRMAApp_OSHA_SelectedEntity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Entities Radio Button On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RRMAApp_OSHA_SelectedEntity(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='allentitiesflag'] [@value='true']")); //Unique Id Of Selected Entities Radio Button Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RRMAApp_OSHA_SelectedEntityLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Entity is Selected On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RRMAApp_OSHA_SelectedEntityLookup(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_entity_selectedentities']/i")); //Unique Id Of Selected Entities Radio Button Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RRMAApp_OSHA_SelectedEntityName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Entity is Selected On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RRMAApp_OSHA_SelectedEntityName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id(".//*[@id='FLD20000']")); //Unique Id Of Selected Entities Radio Button Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RRMAApp_OSHA_RunReport
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Entity is Selected On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RRMAApp_OSHA_RunReport(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_del']")); //Unique Id Of Selected Entities Radio Button Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RRMAApp_OSHA_Refresh
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Entity is Selected On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RRMAApp_OSHA_Refresh(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btn_Refresh")); //Unique Id Of Selected Entities Radio Button Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RRMAApp_OSHA_Report
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Entity is Selected On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RRMAApp_OSHA_Report(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@role='gridcell']/div")); //Unique Id Of Selected Entities Radio Button Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RRMAApp_OSHA_SearchGrid
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected Entity is Selected On RMA Application OSHA Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-19-10-2020                                  
	//============================================================================================
	public static WebElement RRMAApp_OSHA_JobNameSearchGrid(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[text()='Job Name']/following::input[@class='ui-grid-filter-input ui-grid-filter-input-0 ng-empty'][1]")); //Unique Id Of Selected Entities Radio Button Is Fetched
		return Element;
	}
	public static WebElement RRMAApp_OSHA_DisabilityType(WebDriver driver)
	{

		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='1609685756670-0-uiGrid-005L-cell']/div/span")); //Unique Id Of Selected Entities Radio Button Is Fetched
		return Element;
	}
	public static WebElement RRMAApp_OSHA_IllnessType(WebDriver driver)
	{

		Element=null;
		Element = driver.findElement(By.id("btn_illnesscode1_openlookup")); //Unique Id Of Selected Entities Radio Button Is Fetched
		return Element;
	}
	public static WebElement RRMAApp_OSHA_IllnessCode(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='1609729549848-0-uiGrid-0019-cell']/div/span")); //Unique Id Of Selected Entities Radio Button Is Fetched
		
		return Element;
	}
	
	
	
	
}