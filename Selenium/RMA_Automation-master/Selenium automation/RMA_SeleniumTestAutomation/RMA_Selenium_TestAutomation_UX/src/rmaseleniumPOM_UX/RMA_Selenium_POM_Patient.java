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
	public static WebElement RMAApp_Patient_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lastname")); //Unique Id Of Last Name TextBox On Patient Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Addresses')]/i")); //Unique x-path  Of Addresses Tab On RMA Application Patient Creation Page Is Fetched
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
	public static WebElement RMAApp_Patient_Tab_Patient(WebDriver driver, String Tabstate)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[contains(text(),'Patient')]//*[@class='pull-right glyphicon glyphicon-chevron-"+Tabstate+"']")); //Unique x-path Of Patient Tab On RMA Application Patient Creation Page Is Fetched
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
}

