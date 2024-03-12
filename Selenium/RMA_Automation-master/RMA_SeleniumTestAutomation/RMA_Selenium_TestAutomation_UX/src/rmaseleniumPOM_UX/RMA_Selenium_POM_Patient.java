package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Patient {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Txt_FirstName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which FirstName Text Box On Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Txt_FirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("firstname")); //Unique Id Of Type Of FirstName Text Box On Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_FirstName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which FirstName TextBox On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-30-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_FirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("patfirstname")); //Unique Id Of First Name TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_DisabilityType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which DisabilityType TextBox On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_DisabilityType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_patdisabilitycode")); //Unique Id Of DisabilityType TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}


	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_MiddleName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which MiddleName TextBox On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-30-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_MiddleName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("patmiddlename")); //Unique Id Of Middle Name TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintenancePatient_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lastname")); //Unique Id Of Last Name TextBox On Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PIPatient_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_lastname")); //Unique Id Of Last Name TextBox On Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-30-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_patlastname")); //Unique Id Of Last Name TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Txt_MiddleName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Middle Name TextBox On Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Txt_MiddleName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("middlename")); //Unique Id Of Middle Name TextBox On Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_MedicalRecordNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Medical Record Number TextBox On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_MedicalRecordNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("patmedicalrcdno")); //Unique Id Of Medical Record Number TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_PatientWeight
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which PatientWeightTextBox On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_PatientWeight(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("patweight")); //Unique Id Of PatientWeight TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_IllnessType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which IllnessType TextBox On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_IllnessType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_patillnesscode")); //Unique Id Of IllnessType TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_NoOfLiveBirths
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which NoOfLiveBirths TextBox On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_NoOfLiveBirths(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("patnbmlivebirths")); //Unique Id Of NoOfLiveBirths TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Patient_Tab_NewbornInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which NewbornInfo Tab On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Patient_Tab_NewbornInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Newborn Info')]/i")); //Unique x-path  Of NewbornInfo Tab On RMA Application Patient Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Patient_Tab_Addresses
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Addresses Tab On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Patient_Tab_Addresses(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'Addresses')]/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique x-path  Of Addresses Tab On RMA Application Patient Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Patient_Tab_EntityIDType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EntityIDType Tab On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Patient_Tab_EntityIDType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Entity ID Type')]/i")); //Unique x-path  Of EntityIDType Tab On RMA Application Patient Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Patient_Tab_PhysicianDiagnosisInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Physician/Diagnosis Info Tab On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Patient_Tab_PhysicianDiagnosisInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Physician/Diagnosis Info')]/i")); //Unique x-path  Of Physician/Diagnosis Info Tab On RMA Application Patient Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Patient_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplementals Tab On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Patient_Tab_Supplementals(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i")); //Unique x-path  Of Supplementals Tab On RMA Application Patient Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Patient_Tab_PatientFacilityInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Patient/Facility Info Tab On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Patient_Tab_PatientFacilityInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Patient/Facility Info')]/i")); //Unique x-path Of Patient/Facility Info Tab On RMA Application Patient Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Patient_Tab_Admission Info
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Admission Info Tab On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Patient_Tab_AdmissionInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Admission Info')]/i")); //Unique x-path Of Admission Info Tab On RMA Application Patient Creation Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Tab_Patient
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Patient Tab On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, String TabState :: TabState Would Be Up If The Contents Of The Tab Are Currently Being Displayed And Down Would Be Up If The Contents Of The Tab Are Currently Not Being Displayed	 
	//Revision				: 0.0 - KumudNaithani-11-02-2017                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Tab_Patient(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@class,'ng-scope panel-heading tabFocusWd ng-binding') and text()='Patient ']")); //Unique x-path Of Patient Tab On RMA Application Patient Creation Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Txt_DateOfProcedure
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Of Procedure Text Box On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - NidhiJha-11-02-2017                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Txt_DateOfProcedure(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='dateofprocedure']/div/div/div/input")); //Unique Id Of Date Of Procedure Text Box On Contracts Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Btn_PhoneSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Phone search Image Button On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-09-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Btn_PhoneSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='glyphicon glyphicon-search']//ancestor::button[@uib-tooltip='Add/Edit']")); //Unique Id Of Phone search Image Button On Patient Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Lst_PhoneType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Phone Type List On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-09-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Lst_PhoneType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Select2']")); //Unique Id Of Phone Type List On Patient Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Txt_PhoneNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Phone Number TextBox On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-09-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Txt_PhoneNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='newfoldername']")); //Unique Id Of Phone Number TextBox On Patient Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Img_SavePhone
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Phone Number Image Button On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-09-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Img_SavePhone(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='A1']/i")); //Unique Id Of Save Phone Number Image Button On Patient Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Btn_PhoneTypeClose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Phone Type PopUp Close Button On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-09-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Btn_PhoneTypeClose(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='cancel-modal-rm']/span")); //Unique Id Of Phone Type PopUp Close Button On Patient Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Txt_Procedure
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Procedure Text Box On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Txt_Procedure(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_procedurecode']")); //Unique Id Of Procedure Text Box On Contracts Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Btn_Procedure
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Procedure Lookup Button On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Btn_Procedure(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_procedurecode_openlookup']")); //Unique Id Of Procedure Button On Procedures Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Btn_ProcedureType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Procedure Type Lookup Button On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Btn_ProcedureType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_proctypecode']")); //Unique Id Of Procedure Type Button On Procedures Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Txt_ProcedureType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Procedure Type TextBox On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Txt_ProcedureType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_proctypecode']")); //Unique Id Of Procedure Type TextBox On Procedures Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Txt_ComplicationDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Complication Date TextBox On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Txt_ComplicationDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='complicationdate' and @type='text']")); //Unique Id Of Complication Date TextBox On Procedures Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Btn_Complication
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Complication Add Button On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Btn_Complication(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='complications']/div/span/button")); //Unique Id Of Complication Add Button On Procedures Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Txt_ComplicationTextArea
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Complication TextArea ON Complication PopUp On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Txt_ComplicationTextArea(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='newTextComments']")); //Unique Id Of Complication TextArea ON Complication PopUp On Procedures Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Btn_ComplicationOK
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Button On Complication PopUp On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Btn_ComplicationOK(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='usericon']/i")); //Unique Id Of OK Button On Complication PopUp On Procedures Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Chk_ComplicationPriorAnes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Complication Prior To Anesthesia CheckBox On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Chk_ComplicationPriorAnes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='priortoanesflag']")); //Unique Id Of Complication Prior To Anesthesia CheckBox On Procedures Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Txt_ICCLevel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ICC Level TextBox On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Txt_ICCLevel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_icclevelcode']")); //Unique Id Of ICC Level TextBox On Procedures Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Patient_Procedure_Btn_ICCLevel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ICC Level Button On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Patient_Procedure_Btn_ICCLevel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_icclevelcode']")); //Unique Id Of ICC Level Button On Procedures Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_Address1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 1 TextBox On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_Address1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("pataddr1")); //Unique Id Of Address 1 TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_Address2
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 2 TextBox On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_Address2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("pataddr2")); //Unique Id Of Address 2 TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_Address3
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 3 TextBox On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_Address3(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("pataddr3")); //Unique Id Of Address 3 TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which City TextBox On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_City(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("patcity")); //Unique Id Of City TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Btn_AddressEdit
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Edit Address On Addresses Tab On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Btn_AddressEdit(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Edit")); //Unique Id Of Edit Address On Addresses Tab On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Tab_PatientNew
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Patient Tab On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Tab_PatientNew(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[(contains(@class,'panel-heading')) and (contains(text(),'Patient'))]")); //Unique Id Of Patient Tab On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Chk_PrimaryAddress
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Primary Address CheckBox On Addresses Tab On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Chk_PrimaryAddress(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='primaryAddress']")); //Unique Id Of Primary Address CheckBox On Addresses Tab On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Btn_AddressDelete
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Delete Address On Addresses Tab On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Btn_AddressDelete(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Delete")); //Unique Id Of Delete Address On Addresses Tab On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Btn_AddressDeleteNonPrimary
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Delete Address On Addresses Tab On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Btn_AddressDeleteNonPrimary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Delete']//ancestor::div[3]/div[14]/div[contains(text(),'false')]//ancestor::div[3]/div[1]/div/span[@id='Delete']")); //Unique Id Of Delete Address On Addresses Tab On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_LookupLastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Lookup On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_LookupLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-filter-container ng-scope']/div[@class='ng-scope']/input ")); //Unique Id Of LastName TextBox On Lookup Window TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Btn_LookupLastPage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Page Button On Lookup Page On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Btn_LookupLastPage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-pager-last']")); //Unique Id Of Last Page Button On Lookup Page On Maintenance -->Patient Page Is Fetched
		return Element;
	}
}

