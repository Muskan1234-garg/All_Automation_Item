package rmaseleniumPOM_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_CaseManagement {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_DisabilityType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Type Textbox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_DisabilityType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_empdisabilitycode2']")); //Unique Id  Of  Disability Type Textbox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_DisabilityType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Type Lookup Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_DisabilityType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_empdisabilitycode2_openlookup']")); //Unique Id  Of  Disability Type Lookup Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_IllnessType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Illness Type Textbox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_IllnessType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_illnesscode2']")); //Unique Id  Of  Illness Type Textbox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_IllnessType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Illness Type Lookup Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_IllnessType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_illnesscode2_openlookup']")); //Unique Id  Of  Illness Type Lookup Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_InjuriesType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Injuries Type Lookup Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_InjuriesType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_injurieslist2']/ul")); //Unique Id  Of  Injuries Type Lookup Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_InjuriesType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Injuries Type TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_InjuriesType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_injurieslist2']")); //Unique Id  Of Injuries Type TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_HospitalFromDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Hospital Date From TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_HospitalFromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='hospitaldatefrom' and @type='text']")); //Unique Id  Of Hospital Date From TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_HospitalToDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Hospital To Date Lookup Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_HospitalToDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='hospitaldateto' and @type='text']")); //Unique Id  Of Hospital To Date Lookup Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_TreatmentPlan
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Treatment Plan Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_TreatmentPlan(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='material-icons mdi mdi-medical-bag']")); //Unique Id  Of Treatment Plan Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_AddNewTreatmentPlan
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Treatment Plan Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_AddNewTreatmentPlan(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='addicon']/i")); //Unique Id  Of Add New Treatment Plan Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_TreatmentPlanStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Treatment Plan Status TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_TreatmentPlanStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_planstatuscode")); //Unique Id  Of Treatment Plan Status TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_TreatmentPlanStatusLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Treatment Plan Status TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_TreatmentPlanStatusLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_planstatuscode_openlookup")); //Unique Id  Of Treatment Plan Status TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_TreatmentPlanRequestType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Treatment Plan Request Type TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_TreatmentPlanRequestType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_requesttypecode")); //Unique Id  Of Treatment Plan Request Type TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_TreatmentPlanRequestTypelookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Treatment Plan Request Type Lookup Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_TreatmentPlanRequestTypelookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_requesttypecode_openlookup")); //Unique Id  Of Treatment Plan Request Type Lookup Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_TreatmentPlanTreatmentType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Treatment Plan Treatment Type TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_TreatmentPlanTreatmentType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_treatmenttypecode")); //Unique Id  Of Treatment Plan Treatment Type TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_TreatmentPlanTreatmentTypelookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Treatment Plan Treatment Type LookUp Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_TreatmentPlanTreatmentTypelookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_treatmenttypecode_openlookup")); //Unique Id  Of Treatment Plan Treatment Type LookUp Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_MedManagementSavings
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medical Management Savings Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_MedManagementSavings(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='material-icons mdi mdi-hospital']")); //Unique Id  Of Medical Management Savings Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_AddNewMedManagementSavings
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Treatment Plan Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_AddNewMedManagementSavings(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='addicon']/i")); //Unique Id  Of Add New Treatment Plan Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_MedMgmtSavingsProviderGroup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Provider Group TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_MedMgmtSavingsProviderGroup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_providergrouplist")); //Unique Id  Of Provider Group TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_MedMgmtSavingsProviderGrouplookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Provider Group TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_MedMgmtSavingsProviderGroupLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_providergrouplist")); //Unique Id  Of Provider Group TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_MedMgmtSavingsTransactionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_MedMgmtSavingsTransactionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_transactiontype")); //Unique Id  Of Transaction Type TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_MedMgmtSavingsTransactionTypeLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type Lookup Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_MedMgmtSavingsTransactionTypeLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_transactiontype_openlookup")); //Unique Id  Of Transaction Type Lookup Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_MedMgmtSavingsTreatmentProvider
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Treatment Provider TextBox On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_MedMgmtSavingsTreatmentProvider(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("treatmentprovider")); //Unique Id  Of Treatment Provider TextBox On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Tab_MedicalInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medical Info Tab On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Tab_MedicalInfo(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@class='panel-heading ng-binding ng-scope active']")); //Unique Id  Of Medical Info Tab On RMA Application Case Management Creation Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Medical Info ')]")); //Unique Id  Of Medical Info Tab On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Tab_CaseMgtRTW
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medical Info Tab On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Tab_CaseMgtRTW(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.id("1_anh")); //Unique Id  Of Medical Info Tab On RMA Application Case Management Creation Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Case Mgt/RTW ')]")); //Unique Id  Of Medical Info Tab On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_WorkLoss
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medical Info Tab On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_WorkLoss(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='material-icons mdi mdi-trending-down']")); //Unique Id  Of Medical Info Tab On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_AddNewWorkLoss
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New WorkLoss Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_AddNewWorkLoss(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='addicon']/i")); //Unique Id  Of Add New WorkLoss Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_WorkLoss_LastWorkDay
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Work Day TextBox On RMA Application WorkLoss Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_WorkLoss_LastWorkDay(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='datelastworked' and @type='text']")); //Unique Id  Of Last Work Day TextBox On RMA Application WorkLoss Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_WorkLoss_DateOfDisability
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Of Disability TextBox On RMA Application WorkLoss Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_WorkLoss_DateOfDisability(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='dateofdisability' and @type='text']")); //Unique Id  Of Date Of Disability TextBox On RMA Application WorkLoss Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_WorkLoss_Duration
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Duration TextBox On RMA Application WorkLoss Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_WorkLoss_Duration(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("duration")); //Unique Id  Of Duration TextBox On RMA Application WorkLoss Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_Restrictions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Restriction Image Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_Restrictions(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='material-icons mdi mdi-alert']")); //Unique Id  Of Restriction Image Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_AddNewRestrictions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Restriction Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_AddNewRestrictions(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='addicon']/i")); //Unique Id  Of Add New Restriction Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_Restrictions_FirstDayRestricted
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Day Restricted TextBox On RMA Application WorkLoss Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-29-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_Restrictions_FirstDayRestricted(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='datefirstrestrct' and @type='text']")); //Unique Id  Of First Day Restricted TextBox On RMA Application WorkLoss Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_Restrictions_Position
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Day Restricted TextBox On RMA Application WorkLoss Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_Restrictions_Position(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_positioncode_openlookup")); //Unique Id  Of First Day Restricted TextBox On RMA Application WorkLoss Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_Restrictions_Duration
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Duration TextBox On RMA Application Restrictions Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_Restrictions_Duration(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("duration")); //Unique Id  Of Duration TextBox On RMA Application Restrictions Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_MedicalCertificate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medical Certificate Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_MedicalCertificate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='material-icons mdi mdi-book-plus']")); //Unique Id  Of Medical Certificate  Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_AddNewMedicalCertificate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Medical Certificate  Button On RMA Application Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_AddNewMedicalCertificate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='addicon']/i")); //Unique Id  Of Add New Medical Certificate  Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_MedMngmntSavngs_FilterTextBox
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - MishalKantawala-05-18-2020                              
	//============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_MedMngmntSavngs_FilterTextBox(WebDriver driver, String FilterBoxName)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[text()='"+FilterBoxName+"']/following::input[@class='ui-grid-filter-input ui-grid-filter-input-0'][1]")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_CaseMngmntRecrdDelete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - MishalKantawala-05-26-2020                              
	//============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_CaseMngmntRecrdDelete(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("deleteIcon")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Btn_CaseMngmntRecrdClose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - MishalKantawala-05-26-2020                              
	//============================================================================================
	public static WebElement RMAApp_CaseManagement_Btn_CaseMngmntRecrdClose(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@class='lg-modal-rm glyphicon glyphicon-remove modalcloseBtn']")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Chk_CaseMngmntRecrdFirstRowSelection
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Case Management record's Selection CheckBox On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-27-2020                                  
	//============================================================================================
	public static WebElement RMAApp_CaseManagement_Chk_CaseMngmntRecrdFirstRowSelection(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@id,'-0-uiGrid-')]//*[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id  Of Record's First Row Selection CheckBox Button On RMA Application Case Management Page Is Fetched
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_WorkLoss_ReturnToWork
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Return to Work TextBox On RMA Application WorkLoss Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-19-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_WorkLoss_ReturnToWork(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='datereturned' and @type='text']")); //Unique Id  Of Date Of Disability TextBox On RMA Application WorkLoss Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Generic_Breadcrumb
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) Generic breadcrumb of current page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Generic_Breadcrumb(WebDriver driver)
	{
		ElementList = null;
		Element = null;
		ElementList = driver.findElements(By.xpath(".//*[@class='breadcrumb']/li")); //Unique Id  Of  Generic breadcrumb of current page
		Element = ElementList.get(ElementList.size()-1);  //
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_Restrictions_LastDayRestricted
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Day Restricted TextBox On RMA Application WorkLoss Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-03-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_Restrictions_LastDayRestricted(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='datelastrestrct' and @type='text']")); //Unique Id  Of Last Day Restricted TextBox On RMA Application WorkLoss Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_Restrictions_PercentDisabled
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Day Restricted TextBox On RMA Application WorkLoss Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-03-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_Restrictions_PercentDisabled(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("percentdisabled")); //Unique Id  Of Last Day Restricted TextBox On RMA Application WorkLoss Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Txt_Restrictions_Position
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Position's textbox On RMA Application WorkLoss Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-06-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Txt_Restrictions_Position(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_positioncode")); //Unique Id  Of Position's textbox On RMA Application WorkLoss Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CaseManagement_Lbl_OSHAValueRestrictionPopUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OSHA Label's Duration Value On Restrictions PopUp On RMA Application WorkLoss Case Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_CaseManagement_Lbl_OSHAValueRestrictionPopUp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'osha_3001')]")); //Unique Id  Of OSHA Label's Duration Value On Restrictions PopUp On RMA Application WorkLoss Case Management Creation Page Is Fetched
		return Element;
	}
}

