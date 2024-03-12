package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Generic_Claims {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_EventNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EventNumber TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_EventNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ev_eventnumber")); //Unique Id  Of  EventNumber TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_NonOcc_Btn_Jursdiction
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Jurisdiction Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-27-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_NonOcc_Btn_Jursdiction(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_jurisdiction_openlookup")); //Unique x-path Of Jurisdiction Button On RMA Application Claim Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: MAApp_GeneralClaim_Txt_ClaimNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimNumber TextBox On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_ClaimNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("claimnumber")); //Unique Id  Of  ClaimNumber TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_PlanNameSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Name Search Button  On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-04-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_PlanNameSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='planname']//following-sibling::div[1]//*[@class='input-group-btn'][1]//*[@class='btn btn-primary']//*[@class='glyphicon glyphicon-search']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_DisabilityStartDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Name Search Button  On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-04-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_DisabilityStartDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lbl_disabilFromDate']/following-sibling::zc-field-date-picker//input")); 
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_DateOfEvent
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Of Event TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_DateOfEvent(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lbldate_dateOfEvent']/following-sibling::zc-field-date-picker//input")); //Unique x-path Of  Date Of Event TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                  : RMAApp_WorkersComp_Btn_EmployeeClaimHistory
	//Description                   : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Claim History Button On RMA Application Claim Page Can Be Identified
	//Input Parameter               : Driver Variable Of The Type WebDriver          
	//Revision                      : 0.0 - AbhishekRai-10-25-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Btn_EmployeeClaimHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='material-icons mdi mdi-account-card-details']")); //Unique Id  Of PRE-EXISTING COND TextBox On RMA Application Worker Comp Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                  : RMAApp_WorkersComp_Btn_EmployeeClaimHistory
	//Description                   : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Claim History Button On RMA Application Claim Page Can Be Identified
	//Input Parameter               : Driver Variable Of The Type WebDriver          
	//Revision                              : 0.0 - AbhishekRai-10-25-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Btn_CloseEmployeeClaimHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='cancel-modal-rm']")); //Unique Id  Of PRE-EXISTING COND TextBox On RMA Application Worker Comp Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                  : RMAApp_WorkersComp_Btn_CloseClaimActivityLog
	//Description                   : To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Employee Number TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter               : Driver Variable Of The Type WebDriver          
	//Revision                              : 0.0 - AbhishekRai-10-26-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Btn_CloseClaimActivityLog(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("P1")); ///Unique xpath Of Employee Number TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}



	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_TimeOfEvent
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Time Of Event TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_TimeOfEvent(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='ev_timeofevent' and@ type='text']")); //Unique x-path  Of  Time Of Event TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_DateOfClaim
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Of Claim TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_DateOfClaim(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lbl_dateOfClaim']/following-sibling::zc-field-date-picker//input")); //Unique x-path  Of DateOfClaim TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_TimeOfClaim
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TimeeOfClaim TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_TimeOfClaim(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='timeofclaim' and@ type='text']")); //Unique x-path Of TimeOfClaim TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_ClaimType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Type Search Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_ClaimType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='btn_claimtypecode']")); //Unique Id  Of Claim Type Search Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_ClaimStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Status Search Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_ClaimStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='btn_claimstatuscode']")); //Unique Id  Of Claim Status Search Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_ClaimInfo_Dept
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DepartmentId Search Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_ClaimInfo_Dept(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='ev_depteid']//button")); //Unique x-path Of DepartmentId Search Button On RMA Application Claim Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_ClaimInfo_Dept
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DepartmentId Text Box On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_ClaimInfo_Dept(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_ev_depteid']")); //Unique x-path Of DepartmentId Text Box On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Btn_EmpolyeeNum
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Employee Number Search Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_WorkersComp_Btn_EmpolyeeNum(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_empemployeenumber']/following-sibling::span[1]/button/i")); ///Unique x-path Of Employee Number Search Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Txt_EmpolyeeNum
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Employee Number TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Txt_EmpolyeeNum(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_empemployeenumber")); ///Unique xpath Of Employee Number TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Btn_Jurisdiction
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Jurisdiction Search Button On RMA Application Worker Comp Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_WorkersComp_Btn_Jurisdiction(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_filingstateid_openlookup")); //Unique Id  Of Jurisdiction Search Button On RMA Application Worker Comp Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name TextBox On RMA Application Worker Comp Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_WorkersComp_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("emplastname")); //Unique Id  Of Last Name TextBox On RMA Application Worker Comp Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country TextBox On RMA Application Worker Comp Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-04-04-2018                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Txt_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_empcountrycode")); //Unique Id Of Soc Sec No TextBox On RMA Application Worker Comp Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkerComp_Txt_SocSecNo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Soc Sec No TextBox On RMA Application Worker Comp Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Txt_SocSecNo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("emptaxid")); //Unique Id Of Soc Sec No TextBox On RMA Application Worker Comp Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[(@id='lookup_ev_stateid_openlookup') or (@id='lookup_ev_stateid')]")); //Unique Id  Of State TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_WorkerComp_Txt_ReportNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Report Number TextBox On RMA Application Worker Comp Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Txt_ReportNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("reportnumber")); //Unique Id  Of Report Number TextBox On RMA Application Worker Comp Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_WorkerComp_Txt_PreExtCond
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PRE-EXISTING COND TextBox On RMA Application Worker Comp Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Txt_PreExtCond(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("supp_prexistcon_text")); //Unique Id  Of PRE-EXISTING COND TextBox On RMA Application Worker Comp Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkerComp_Btn_EmploymentInfo_Dept
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of WhichEmployment Info Search Button On RMA Application Worker Comp Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                 
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Btn_EmploymentInfo_Dept(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'empdeptassignedeid')]/p/span/button/i")); //Unique x-path Of Employment Info Search Button On RMA Application Worker Comp Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tab_ClaimInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Info Tab On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Tab_ClaimInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Claim Info')]/i")); //Unique x-path  Of Claim Info Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tab_Acord
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Acord Tab On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-23-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Tab_Acord(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'ACORD')]/i")); //Unique x-path Of Acord Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tab_EventDetail
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Detail Tab On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Tab_EventDetail(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Event Detail')]/i")); //Unique x-path  Of Event Detail Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which City TextBox On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-12-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_City(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ev_city")); //Unique ID  Of City TextBox On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_WorkersCompEstablishedLenghtOfDisability
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EstablishedLenghtOfDisability TextBox On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-12-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_WorkersCompEstablishedLenghtOfDisabilityy(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("empestlendisability")); //Unique ID  Of EstablishedLenghtOfDisability TextBox On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tab_EmployeeInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Employee Info Tab On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - RenuVerma-05-29-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Tab_EmployeeInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Employee Info')]/i")); //Unique x-path Of Employee Info Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tab_EmploymentInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Employment Info Tab On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Tab_EmploymentInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Employment Info')]/i"));//Unique x-path Of Employment Info Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tab_UnitStatDetail 
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit Stat Detail Tab On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Tab_UnitStatDetail(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Unit Stat Detail')]/i"));//Unique x-path Of Unit Stat Detail Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tab_LossInformation 
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Loss Information Tab On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - RenuVerma-05-29-2017                                            
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Tab_LossInformation(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Loss Information')]/i"));//Unique x-path Of Loss Information Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tab_EmployeeEventDetail 
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EmployeeEventDetail  Tab On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-12-2017                                            
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Tab_EmployeeEventDetail (WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Employee Event Detail')]/i"));//Unique x-path Of EmployeeEventDetail  Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Tab On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                         
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Tab_Supplementals(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i"));//Unique x-path Of Supplemental Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tab_VehicleAccident
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vehicle Accident  Tab On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-31-2017                                         
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Tab_VehicleAccident(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Vehicle Accident')]/i"));//Unique x-path Of Vehicle Accident  Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_VehicleClaim_Txt_TypeOfReport
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Type Of Report TextBox On RMA Application Vehicle Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-31-2017                                  
	//============================================================================================
	public static WebElement RMAApp_VehicleClaim_Txt_TypeOfReport(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_supp_typeofreport_code")); //Unique Id  Of Type Of Report TextBox On RMA Application Vehicle Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_VehicleClaim_Txt_AccidentType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accident Type TextBox On RMA Application Vehicle Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-31-2017                                  
	//============================================================================================
	public static WebElement RMAApp_VehicleClaim_Txt_AccidentType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_accidenttypecode")); //Unique Id  Of Accident Type TextBox On RMA Application Vehicle Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_LocationAddress_1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Location Address_1 Text Box On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-31-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_LocationAddress_1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ev_addr1"));//Unique x-path Of Location Address_1 Text Box On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_ZipCode
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ZipCode Text Box On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-12-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_ZipCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ev_zipcode"));//Unique ID Of ZipCode Text Box On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_DOTReport
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which DOTReport Text Box On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-12-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_DOTReport(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("stdotrptid"));//Unique ID Of DOTReport Text Box On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_SupplementalPermanentBodyPartLoss
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Permanent Body Part Loss Text Box On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-12-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_SupplementalPermanentBodyPartLoss(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("supp_perm_loss_text"));//Unique ID Of Permanent Body Part Loss Text Box On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_ReportNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Report Number Text Box On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-31-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_ReportNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("reportnumber"));//Unique ID Of Report Number Text Box On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_ClaimType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Type Text Box On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-29-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_ClaimType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_claimtypecode']")); //Unique ID Of Claim Type Text Box On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_FinancialReserves
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Financial Reserves Image Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_FinancialReserves(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Financials/Reserves']/i")); //Unique Id  Of FinancialReserves Image Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_CloseMethodLookUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Method Look Up Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_CloseMethodLookUp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_methodclosedcode_openlookup")); //Unique Id  Of Close Method Look Up Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_CloseMethod
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Method Text Box On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_CloseMethod(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_methodclosedcode")); //Unique Id  Of Close Method Text Box  On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_ClaimStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Status Text Box On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_ClaimStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_claimstatuscode']")); //Unique Id  Of Claim Status Text Box On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_AccordRemarks
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Remarks TextBox On Accord Tab On RMA Claims Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-02-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_AccordRemarks(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("remarks")); //Unique Id Of Remarks TextBox On Accord Tab On RMA Application Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_FinancialsReserves
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Financial/Reserves Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-13-2017                                    
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_FinancialsReserves(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Financials/Reserves")); //Unique ID Of Financial/Reserves Button On RMA Application Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Lst_RightClaimProgress
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ClaimProgress List Item On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, ClaimProgressListNo: defined as open:: 1, reserve::2, payment::3, closed::4 		 
	//Revision				: 0.0 - RenuVerma-06-13-2017                                     
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Lst_RightClaimProgress(WebDriver driver, int ClaimProgressListNo)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='myTab']/li["+ClaimProgressListNo+"]//span")); //Unique Xpath Of ClaimProgress List Item On RMA Application Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Lbl_RightClaimProgress
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ClaimProgress Label Item On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, ClaimProgressListNo: defined as open:: 1, reserve::2, payment::3, closed::4 		 
	//Revision				: 0.0 - RenuVerma-06-13-2017                                     
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Lbl_RightClaimProgress(WebDriver driver, int ClaimProgressListNo)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='myTab']/li["+ClaimProgressListNo+"]//span/i")); //Unique Xpath Of ClaimProgress Label Item On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Img_DDMenu
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Drop Down Menu Image Button  On RMA Claims Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-22-2017                                      
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Img_DDMenu(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='nav moreButton ng-scope']//*[@data-toggle='dropdown']")); //Unique Id Of Drop Down Menu Image Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Lst_DDMenu
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Drop Down Menu Image Button  On RMA Claims Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-22-2017                                      
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Lst_DDMenu(WebDriver driver,String DDMenuName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='dropdown-menu']//*[contains(text(),'"+DDMenuName+"')]")); //Unique Id Of Drop Down Menu Image Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Img_RecordSummary
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Record Summary Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-20-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Img_RecordSummary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Record Summary")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_EmploymentInfoDepartment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which EmployeeInfo TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-20-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_EmploymentInfoDepartment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'empdeptassignedeid') and @type='text']")); //Unique X-Path Of EmployeeInfo TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tbl_RecordSummaryTable
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Record Summary Table On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-20-2017                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Tbl_RecordSummaryTable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//form/table/tbody/tr[2]/td/table/tbody")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_EmployeeInfoDepartment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimNumber TextBox On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-05-29-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_EmployeeInfoDepartment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'lookup_empdeptassignedeid')]"));//Unique Id  Of  Employee Info Department TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_PolicyLOB
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy LOB Text Box On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-09-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_PolicyLOB(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_policyLOBCode']")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_PolicyLOBLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy LOB Lookup Button On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-04-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_PolicyLOBLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_policyLOBCode_openlookup']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_PolicyNameLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Name Lookup On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-04-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_PolicyNameLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='multipolicyidPSDownloadbtn' ]/i")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_ServiceCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Service Code Lookup On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-24-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_ServiceCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='btn_servicecode']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Img_EmploymentInfoRestriction
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Restrictions Image Button On Employment Info Tab  On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-27-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Img_EmploymentInfoRestriction(WebDriver driver)
	{
		Element = null;		
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Restrictions']")); ///Unique xpath Of Employee Number TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Btn_AddRestrictionWrokLoss
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Add New Restrictions/Work Loss Button On Restrictions Window On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-27-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Btn_AddRestrictionWrokLoss(WebDriver driver)
	{
		Element = null;		
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Add New']")); ///Unique xpath Of Employee Number TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Txt_DateOfFirstRestrictions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Date Of First Restrictions TextBox On Restrictions Window On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-27-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Txt_DateOfFirstRestrictions(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='datefirstrestrct' and@ type='text']")); ///Unique xpath Of Employee Number TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Txt_DateOfLastRestricted
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Date Of Last Restrictions TextBox On Restrictions Window On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-01-03-2018                                 
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Txt_DateOfLastRestricted(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='datelastrestrct' and@ type='text']")); ///Unique x-path Of Date Of Last Restrictions TextBox On Restrictions Window On RMA Application Claim Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Btn_DeleteRestrictionsWorkLossList
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Delete Restrictions/Work Loss List Button On Employee Involved Work Loss Window On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-30-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Btn_DeleteRestrictionsWorkLossList(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("deleteIcon")); ///Unique xpath Of Employee Number TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Img_EmploymentInfoWorkLoss
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Work Loss Image Button On Employment Info Tab  On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-30-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Img_EmploymentInfoWorkLoss(WebDriver driver)
	{
		Element = null;		
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Work Loss']")); ///Unique xpath Of Employee Number TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Txt_LastWorkDayWorkLoss
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Last Work Day TextBox On Employee Involved Work Loss Window On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-30-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Txt_LastWorkDayWorkLoss(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='datelastworked' and@ type='text']")); ///Unique xpath Of Employee Number TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Txt_Stateduration
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Last Work Day TextBox On Employee Involved Work Loss Window On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-30-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Txt_Stateduration(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='stateduration' and@ type='text']")); ///Unique xpath Of Last Work Day TextBox On Employee Involved Work Loss Window Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tab_LostDayInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Lost Day Info Tab On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-30-2017                                         
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Tab_LostDayInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Lost Days Info ')]/i"));//Unique x-path Of Supplemental Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Txt_DateReturnedWorkLoss
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Return To Work TextBox On Employee Involved Work Loss Window On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-30-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Txt_DateReturnedWorkLoss(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='datereturned' and@ type='text']")); ///Unique xpath Of Employee Number TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Img_CalculateDuration
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Calculate Durations Image Button On Restrictions Window On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-27-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Img_CalculateDuration(WebDriver driver)
	{
		Element = null;		
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Calculate Durations']")); ///Unique xpath Of Employee Number TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_chk_SelectWorkList
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Work Loss List check Box  On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-27-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_chk_SelectWorkList(WebDriver driver)
	{
		Element = null;		
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope' and@ ng-if='grid.options.enableSelectAll']")); ///Unique xpath Of Employee Number TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Btn_QuickSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Quick Summary Shutter Tab On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-30-2017   
	//Modified By			: 0.0 - DebasmitaPati-09-26-2018
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Btn_QuickSummary(WebDriver driver, String clickoption)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@id='quicksummaryshutter']/div/div[2]/div/span")); ///Unique xpath Of Quick Summary Shutter Tab On RMA Application Claim Page Is Fetched
		//Element = driver.findElement(By.xpath(".//*[@class='toggleBtnBox' and @ng-click='main.treeSlider($event)']")); ///Unique xpath Of Quick Summary Shutter Tab On RMA Application Claim Page Is Fetched
		if(clickoption.equalsIgnoreCase("Expand"))
			Element = driver.findElement(By.xpath(".//*[@class='toggleBtnBox' and @title='Expand']")); ///Unique xpath Of Quick Summary Shutter Tab On RMA Application Claim Page Is Fetched
		else
			Element = driver.findElement(By.xpath(".//*[@class='toggleBtnBox' and @title='Collapse']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Lst_SubmissionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Submission Type Needs To Selected On ISO Filing Window On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Lst_SubmissionType(WebDriver driver)
	{
		Element = null;		
		Element = driver.findElement(By.id("selSubmissionType")); ///Unique xpath Of Submission Type On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Chk_ISOSubmission
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which ISO Submission Check Box On ISO Filing Window On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Chk_ISOSubmission(WebDriver driver)
	{
		Element = null;		
		Element = driver.findElement(By.id("chksubmitTOiso")); ///Unique xpath Of ISO Submission Check Box On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Btn_ISOSubmissionSave
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which ISO Submission Save Button On ISO Filing Window On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Btn_ISOSubmissionSave(WebDriver driver)
	{
		Element = null;		
		Element = driver.findElement(By.xpath(".//*[@id='btnDone']/i")); ///Unique xpath Of ISO Submission Save Button On RMA Application Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Chk_PaymentFrozen
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Frozen Checkbox On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-28-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Chk_PaymentFrozen(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='paymntfrozenflag']")); 
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Tab_PropertyInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Property Info Tab On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-22-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PropertyClaim_Tab_PropertyInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Property Info ')]/i")); //Unique x-path  Of Property Info Tab On RMA Application Property Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Btn_PropertyId
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Property Id Look Up Button  On RMA Application Property Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-22-2018                      
	//============================================================================================
	public static WebElement RMAApp_PropertyClaim_Btn_PropertyId(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_pi_propertyid']")); //Unique Id Of Distribution Type Code Look Up Button On RMA Application Payments Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Tab_COPEDATA
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which COPEDATA Tab On RMA Application Property Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-22-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PropertyClaim_Tab_COPEDATA(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'COPE Data ')]/i")); //Unique x-path  Of COPEDATA Tab On RMA Application Property Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Tab_OptionalCOPEDATA
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Optional COPEDATA Tab On RMA Application Property Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-22-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PropertyClaim_Tab_OptionalCOPEDATA(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Optional COPE Data ')]/i")); //Unique x-path  Of Optional COPEDATA Tab On RMA Application Property Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Txt_PropertyInfoAdress_1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address 1 TextBox On RMA Application Property Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-22-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_PropertyClaim_Txt_PropertyInfoAdress_1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='pi_addr1']")); //Unique Id  Of  EventNumber TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Txt_PropertyInfoCity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which City TextBox On RMA Application Property Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-22-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_PropertyClaim_Txt_PropertyInfoCity(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='pi_city']")); //Unique Id  Of  EventNumber TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Btn_PropertyInfoState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State TextBox On RMA Application Property Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-22-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_PropertyClaim_Btn_PropertyInfoState(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_pi_stateid_openlookup']")); //Unique Id  Of  EventNumber TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Btn_PropertyInfoZipCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip Code TextBox On RMA Application Property Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-22-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_PropertyClaim_Btn_PropertyInfoZipCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='pi_zipcode']")); //Unique Id  Of  EventNumber TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Txt_PropertyInfoLandValue
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Land Value TextBox On RMA Application Property Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-22-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_PropertyClaim_Txt_PropertyInfoLandValue(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='pi_landvalue' and@ type='text']")); //Unique Id  Of  EventNumber TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Txt_COPEDATASquareFootage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Square Footage TextBox On RMA Application Property Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-22-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_PropertyClaim_Txt_COPEDATASquareFootage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='pi_squarefootage']")); //Unique Id  Of  EventNumber TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Txt_COPEDATANoOfStories
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which No Of Stories TextBox On RMA Application Property Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-22-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_PropertyClaim_Txt_COPEDATANoOfStories(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='pi_noofstories']")); //Unique Id  Of  EventNumber TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_WorkersComp_Txt_FirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which First Name On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-12-2017                                  
	//============================================================================================
	public static WebElement RMAApp_WorkersComp_Txt_FirstName(WebDriver driver)
	{
		Element = null;		
		Element = driver.findElement(By.id("empfirstname")); ///Unique xpath Of First Name On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Txt_SearchPropertyId
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Property ID Text Box On Property Id Look Up On RMA Application Property Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-20-2018       
	//Modified By       : 1.0 - DebasmitaPati-09-13-2018 (To Recognize Property ID With Name As On One Of The Environment It Is Seen That ID Is Different)
	//============================================================================================
	public static WebElement RMAApp_PropertyClaim_Txt_SearchPropertyId(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='FLD60719'or @name='Property ID']")); //Unique Id Of Property ID Text Box On Property Id Look Up On RMA Application Payments Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyClaim_Txt_PropertyId
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Property Id Look Up Button  On RMA Application Property Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-02-22-2018                      
	//============================================================================================
	public static WebElement RMAApp_PropertyClaim_Txt_PropertyId(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_pi_propertyid']")); //Unique Id Of Distribution Type Code Look Up Button On RMA Application Payments Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName                    : RMAApp_GenericClaim_Btn_State
	//Description                     : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Lookup Button On RMA Application Claim Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver      
	//Revision                        : 0.0 - FaizaSheikh-04-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_ev_stateid_openlookup")); //Unique Id  Of State Lookup Button On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_PolicyNameOpen
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Name Open Button On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-24-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_PolicyNameOpen(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='btn btn-primary' and @title='Open']")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Reserves_ChkBox_SelectReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Reserve On RMA Application Financials/Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-04-24-2018                  
	//==================================================================	==========================
	public static WebElement RMAApp_Reserves_ChkBox_SelectReserve(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-disable-selection ng-scope']/div")); //Unique Id Of  Reserve  On RMA Application  Financials/Reserves Page Is Fetched
		return Element;		
	}


	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Img_QuickSummary
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Quick Summary Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-02-2018                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Img_QuickSummary(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@class='toggleBtnBox']/img")); 
		}catch (Exception|Error e){	 
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_FileNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FileNumber Text Field On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-06-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_FileNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("filenumber")); //Unique x-path Of FileNumber Text Field On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Lst_ClassName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Class Name ListBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-16-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Lst_ClassName(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("classname"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique x-path Of Class Name ListBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName               : RMAApp_GenericClaim_Txt_DateHired
	//Description                    : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Hired Text Box On Employment Info Tab On RMA Application Non Occ And WC Claim Page Can Be Identified
	//Input Parameter         : Driver Variable Of The Type WebDriver           
	//Revision                       : 0.0 - DebasmitaPati-07-11-2018                      
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_DateHired(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='empdatehired' and  @role='textbox']")); //Unique Id Of Date Hired Text Box On Employment Info Tab On RMA Application Non Occ And WC Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                   : RMAApp_GenericClaim_MoreButtons
	//Description                    : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which More Buttons Image On RMA Application Claim Page Can Be Identified
	//Input Parameter         : Driver Variable Of The Type WebDriver           
	//Revision                       : 0.0 - DebasmitaPati-07-11-2018                      
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_MoreButtons(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='frmData']/div[1]/div[2]/ul/li")); //Unique Id Of More Buttons Image On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                   : RMAApp_GenericClaim_MoreButtonsMenu
	//Description                    : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Name Of Specific Button From More Buttons Menu On RMA Application Claim Page Can Be Identified
	//Input Parameter         : Driver Variable Of The Type WebDriver           
	//Revision                       : 0.0 - DebasmitaPati-07-11-2018                      
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_MoreButtonsMenu(WebDriver driver,String MenuName)
	{
		Element = driver.findElement(By.xpath(".//*[@class='dropdown-menu']/li/a[contains(text(),'"+MenuName+"')]")); //Unique Id Of Specific Button From More Buttons Menu On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_HourlyRate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Hourly Rate TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-18-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_HourlyRate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='emphourlyrate' and @type='text']")); //Unique Id  Of  Hourly Rate TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_MonthlyRate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Monthly Rate TextBox On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-18-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_MonthlyRate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='empmonthlyrate' and @type='text']")); //Unique Id  Of  Monthly Rate TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_EmployeeInfoDateOfBirth
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Employee Info Date Of Birth TextBox On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-23-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_EmployeeInfoDateOfBirth(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='empbirthdate' and @type = 'text']"));//Unique Id  Of  Employee Info Date Of Birth TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_EmployeeInfoAge
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Employee Info Age TextBox On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-23-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_EmployeeInfoAge(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='entityage' and @type = 'text']"));//Unique Id  Of  Employee Info Age TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_WeeklyRate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimNumber TextBox On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-17-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_WeeklyRate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='empweeklyrate' and @type='text']")); //Unique Id  Of  ClaimNumber TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName                    : RMAApp_GenericClaim_Txt_EventNumberOnEvent
	//Description                     : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EventNumber TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - FaizaSheikh -07-16-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_EventNumberOnEvent(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("eventnumber")); //Unique Id  Of  EventNumber TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_NonOccClaim_Txt_BenefitDisabilityType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which BenefitDisabilityType TextBox On RMA Application  Non Occ Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-16-2018                                  
	// ============================================================================================
	public static WebElement RMAApp_NonOccClaim_Txt_BenefitDisabilityType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_benefitdistypecode' and @type='text']")); //Unique Id  Of  BenefitDisabilityType TextBox On RMA Application  Non Occ Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claim_History_ModelPopup_Img_Close
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Button On Claim History Model Popup Can Be Identified On Claimant And Defendant Screen
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-04-24-2019                                    
	// ============================================================================================
	public static WebElement RMAApp_Claim_History_ModelPopup_Img_Close(WebDriver driver)
	{ 
		Element = null;
		try {				
			Element = driver.findElement(By.xpath(".//*[@class='lg-modal-rm glyphicon glyphicon-remove modalcloseBtn']"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_InternalPolicyLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Internal Policy Name Lookup On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-16-2019                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_InternalPolicyLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@title='rmA Policy Search']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_InternalPolicyName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Internal Policy Name TextBox On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-16-2019                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_InternalPolicyName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("FLD30001")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_SubmitQuery
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Submit Query On Internal Policy LookUp On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-16-2019                                  
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_SubmitQuery(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='submitquery']/i")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_EventLocCountryLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Location Country Lookup Button On Event Info Tab On RMA Application  Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-03-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_EventLocCountryLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_ev_countrycode_openlookup")); //Unique Id  Of  Event Location Country Lookup Button On Event Info Tab On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Title
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Title On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-14-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Title(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='frmData']/div[1]/div[1]/div/span/b")); //Unique Id Of Title On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_Jurisdiction
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Jurisdiction Search Button On RMA Application For Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-23-2019                                   
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_Jurisdiction(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_filingstateidtext_openlookup' or @id='btn_jurisdiction_openlookup' or @id='btn_filingstateid_openlookup']")); //Unique Id  Of Jurisdiction Search Button On RMA Application For Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_Jurisdiction
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Jurisdiction Text Box On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-23-2019                              
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_Jurisdiction(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_filingstateidtext' or @id='lookup_jurisdiction' or @id='lookup_filingstateid']")); //Unique Id  Of Jurisdiction Search Button On RMA Application For Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Img_MinimizeFinSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Minimize Financial Summary Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-23-2019                              
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Img_MinimizeFinSummary(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Minimize Financial Summary']")); //Unique Id  Of Minimize Financial Summary Image On RMA Application For Claim Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Img_MaximizeFinSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Maximize Financial Summary Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-23-2019                              
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Img_MaximizeFinSummary(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Maximize Financial Summary']")); //Unique Id  Of Minimize Financial Summary Image On RMA Application For Claim Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_LiabilityTypeLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Liability Type Lookup Button  On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-09-2020                          
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_LiabilityTypeLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_liabilitytype_openlookup']")); //Unique Id  Of Liability Type Lookup Button  On RMA Application For Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_LiabilityType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Liability Type Lookup TextBox  On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-09-2020                          
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_LiabilityType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_liabilitytype']")); //Unique Id  Of Liability Type Lookup TextBox  On RMA Application For Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_CatastropheType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CatastropheType Search Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-12-05-2020                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_CatastropheType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_catastrophe_openlookup']")); //Unique Id  Of Catastrophe Type Lookup Button  On RMA Application For Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_LocationAddress_2
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Location Address_2 Text Box On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-11-06-2020                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_LocationAddress_2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ev_addr2"));//Unique x-path Of Location Address_2 Text Box On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_LocationAddress_3
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Location Address_3 Text Box On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-11-06-2020                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_LocationAddress_3(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ev_addr3"));//Unique x-path Of Location Address_3 Text Box On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_LocationAddress_4
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Location Address_4 Text Box On RMA Application Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-11-06-2020                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_LocationAddress_4(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ev_addr4"));//Unique x-path Of Location Address_4 Text Box On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-11-06-2020
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_ev_countrycode")); //Unique Id  Of Country TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_EventOnPresmise
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event On Presmise check box On Claim Detail accordion Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-09-2020                                     
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_EventOnPresmise(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ev_onpremiseflag")); //Unique Id Of Event On Presmise check box On Claims Detail accordion Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Lbl_CountOfLeftHandSideTreeValues
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Label Showing Number Of Records For Each Navigation Tree Link On Right Hand Side Tree On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-04-2020                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Lbl_CountOfLeftHandSideTreeValues(WebDriver driver, String NavLinkName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+NavLinkName+"')]//span")); //Unique Id  Of Label Showing Number Of Records For Each Navigation Tree Link On Right Hand Side Tree On RMA Application For Claim Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_CloseLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Lookup Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-04-2020                                  
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_CloseLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@title='Close']")); //Unique Id Of Close Lookup Button On RMA Application For Claim Page Is Fetched
		return Element;
	}
}