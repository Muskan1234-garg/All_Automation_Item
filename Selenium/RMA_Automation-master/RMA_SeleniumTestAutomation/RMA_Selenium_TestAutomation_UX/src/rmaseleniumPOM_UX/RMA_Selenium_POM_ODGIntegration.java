package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_ODGIntegration {
	public static WebElement Element;

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSet_Chk_UseCaseMngnt
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Case Management Checkbox On RMA Application General System Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSet_Chk_UseCaseMngnt(WebDriver driver)
	{		
		Element = null;
		Element = driver.findElement(By.id("UseCaseMgmt")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSet_Chk_EnableODGRTWInterface
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Case Management Checkbox On RMA Application General System Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSet_Chk_EnableODGRTWInterface(WebDriver driver)
	{	
		Element = null;
		Element = driver.findElement(By.id("chkRTWEnabled")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_EnableODGRTW_Txt_ActivationCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Activation Code TextBox On General System Parameters Setup Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                      
	// ============================================================================================
	public static WebElement RMAApp_EnableODGRTW_Txt_ActivationCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("password")); //Unique Id Of Activation Code TextBox On General System Parameters Setup Screen Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EnableODGRTW_Btn_ActivationCodeOK
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Activation Code OK Button On General System Parameters Setup Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                      
	// ============================================================================================
	public static WebElement RMAApp_EnableODGRTW_Btn_ActivationCodeOK(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Ok")); //Unique Id Of Activation Code OK Button On General System Parameters Setup Screen Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSet_Txt_ODGRTW_API_URL
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ODG Return To Work API URL Textbox On RMA Application General System Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSet_Txt_ODGRTW_API_URL(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("TxtODGRTWUrl")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSet_Txt_ODGRTWToken
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ODG Return To Work Token Textbox On RMA Application General System Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSet_Txt_ODGRTWToken(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("TxtODGRTWToken")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSet_Chk_EnableReserveAnalytics
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Reserves Analytics Checkbox On RMA Application General System Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSet_Chk_EnableReserveAnalytics(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkRCEnabled")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSet_Txt_ReserveAnalytics_API_URL
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Analytics API URL Textbox On RMA Application General System Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSet_Txt_ReserveAnalytics_API_URL(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("TxtODGRCUrl")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSet_Txt_ReserveAnalyticsToken
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Analytics Textbox On RMA Application General System Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSet_Txt_ReserveAnalyticsToken(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("TxtODGRCToken")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSet_Chk_EnableODG_MTGuidelines
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable ODG MT Guidelines Checkbox On RMA Application General System Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSet_Chk_EnableODG_MTGuidelines(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkODGMTEnable")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSet_Txt_ODGMT_API_URL
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ODG MT API URL Textbox On RMA Application General System Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSet_Txt_ODGMT_API_URL(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("TxtODGMTUrl")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSet_Txt_ODGMT_UserName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ODG MT User Name Textbox On RMA Application General System Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSet_Txt_ODGMT_UserName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("TxtODGuname")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSet_Txt_ODGMT_Password
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ODG MT Password Textbox On RMA Application General System Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSet_Txt_ODGMT_Password(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("TxtODGMTpwd")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_JobClassification
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Job Classifictaion Textbox On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_JobClassification(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_jobclassification")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_JobClassification
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Job Classifictaion Button On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_JobClassification(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_jobclassification_openlookup")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_CaseManagement
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Case Management Button On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_CaseManagement(WebDriver driver)
	{	
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='Case Management']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_PrimaryDiagnosisICD10
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Primary Diagnosis ICD10 Search Button On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_PrimaryDiagnosisICD10(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='icd10primarydiagnosis']//button")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_PrimaryDiagnosisICD10
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Primary Diagnosis ICD10 Textbox On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_PrimaryDiagnosisICD10(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='icd10primarydiagnosis']//input")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_PrimaryDiagnosisICD09
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Primary Diagnosis ICD09 Search Button On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_PrimaryDiagnosisICD09(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='icd9primarydiagnosis']//button")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_PrimaryDiagnosisICD09
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Primary Diagnosis ICD09 Textbox On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_PrimaryDiagnosisICD09(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='icd9primarydiagnosis']//input")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_MDATopic
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which MDA Topic Search Button On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_MDATopic(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='mdatopic']//button")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_MDATopic
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which MDA Topic Textbox On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_MDATopic(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='mdatopic']//input")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_DisGuidelines
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Guidelines Toolbar Button On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_DisGuidelines(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='disguidelines1']/i")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_DiagnosisCodeLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diagnosis Code Lookup Button On Primary Diagnosis History PopUp On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_DiagnosisCodeLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_DIAGNOSIS_CODE_codelookup_openlookup")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_SaveDiagnosisCodeLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On Primary Diagnosis History PopUp On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_SaveDiagnosisCodeLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnRoute']/i")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_ReasonPrimaryDiagnosis
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reason Button On Primary Diagnosis History PopUp On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_ReasonPrimaryDiagnosis(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@ng-click, 'textmlVM.openLookUp')]/i[@class='glyphicon glyphicon-edit']")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Txt_ReasonPrimaryDiagnosis
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reason Comment Textarea On Primary Diagnosis History PopUp On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Txt_ReasonPrimaryDiagnosis(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("newTextComments")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_ReasonOKPrimaryDiagnosis
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reason Comment OK Button On Primary Diagnosis History PopUp On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_ReasonOKPrimaryDiagnosis(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='usericon']/i")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Tbl_ICDCodesHistoryTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ICD Codes History Table On Primary Diagnosis History PopUp On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Tbl_ICDCodesHistoryTable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_PrimaryDiagnosisHistoryPopUpClose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On Primary Diagnosis History PopUp On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_PrimaryDiagnosisHistoryPopUpClose(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='glyphicon glyphicon-remove closeBtn']")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Icon_RiskScoreCalculation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Risk Score Calculation Icon On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Icon_RiskScoreCalculation(WebDriver driver)
	{	
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@ng-if,'main.riskResult.toString()')]/div[@class='risk-bg meterCautionary']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Icon_RiskScoreCalculation_Moderate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Risk Score Calculation Icon On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood -01-06-2021                              
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Icon_RiskScoreCalculation_Moderate(WebDriver driver)
	{	
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@ng-if,'main.riskResult.toString()')]/div[@class='risk-bg meterModerate']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Icon_RiskScoreCalculation_High
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Risk Score Calculation Icon On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood -01-06-2021                              
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Icon_RiskScoreCalculation_High(WebDriver driver)
	{	
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@ng-if,'main.riskResult.toString()')]/div[@class='risk-bg meterHigh']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return Element;
	}
	
	
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Icon_RiskScoreCalculationValue
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Risk Score Calculation Icon Value On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Icon_RiskScoreCalculationValue(WebDriver driver)
	{	
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@ng-if,'main.riskResult.toString()')]//div//p"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Lbl_RiskScoreCalculationTooltip
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Risk Score Calculation Tooltip On RMA Application Claim Creation Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Lbl_RiskScoreCalculationTooltip(WebDriver driver)
	{	
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//div[contains(@ng-if,'main.riskResult.toString()')]//div[2]//div[2]"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSet_Chk_EnableODG_RiskScore
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable ODG Risk Score Checkbox On RMA Application General System Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-05-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSet_Chk_EnableODG_RiskScore(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkODGRiskScoreEnable")); 
		return Element;
	}
}
