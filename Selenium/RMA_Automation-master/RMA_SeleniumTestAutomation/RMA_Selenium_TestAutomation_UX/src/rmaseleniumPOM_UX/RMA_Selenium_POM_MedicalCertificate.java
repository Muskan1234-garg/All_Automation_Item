package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_MedicalCertificate {
	public static WebElement Element = null;

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
	//FunctionName 			: RMAApp_MedicalCertificate_txt_MedicalCertificateNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medical Certificate Number text-field On RMA Application Case Management-MedicalCertificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_txt_MedicalCertificateNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='medcertnumber']")); //Unique Id  Of Add New Medical Certificate Number text-field On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_txt_MedicalCertificateDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medical Certificate Date text-field On RMA Application Case Management-MedicalCertificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_txt_MedicalCertificateDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='medcertdate' and @type='text']")); //Unique Id  Of Add New Medical Certificate Date text field On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_txt_ProviderNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Provider Number text-field On RMA Application Case Management-MedicalCertificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_txt_ProviderNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='providernumber']")); //Unique Id  Of Provider Number Button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_txt_WorkCapacity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Work Capacity text field On RMA Application Case Management-MedicalCertificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_txt_WorkCapacity(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_workcapacity']")); //Unique Id  Of New Work Capacity text field On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_btn_WorkCapacity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Work Capacity lookup button field On RMA Application Case Management-MedicalCertificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_btn_WorkCapacity(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_workcapacity_openlookup']")); //Unique Id  Of Work Capacity lookup button On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_txt_AfflictionCodeandBodilyLocation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Affliction Code and Bodily Location text field On RMA Application Case Management-MedicalCertificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_txt_AfflictionCodeandBodilyLocation(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='affcodebodyloc']")); //Unique Id  Of Affliction Code and Bodily Location text field On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_txt_DateExamined
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Examined text field On RMA Application Case Management-MedicalCertificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_txt_DateExamined(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='medcertdate' and @type='text']")); //Unique Id  Of Date Examined text field On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_txt_UnfitToWorkFrom
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unfit To Work From On RMA Application Case Management-MedicalCertificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_txt_UnfitToWorkFrom(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='unfitfrom' and @type='text']")); //Unique Id  Of Unfit To Work From text field On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_txt_UnfitToWorkTo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unfit To Work To On RMA Application Case Management-MedicalCertificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_txt_UnfitToWorkTo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='unfitto' and @type='text']")); //Unique Id  Of Unfit To Work to text field On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_txt_FitForModifiedDutiesFrom
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Fit For Modified Duties From On RMA Application Case Management-MedicalCertificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_txt_FitForModifiedDutiesFrom(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='fitfrom' and @type='text']")); //Unique Id  Of Fit For Modified Duties From text field On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_txt_FitForModifiedDutiesTo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Fit For Modified Duties To On RMA Application Case Management-MedicalCertificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_txt_FitForModifiedDutiesTo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='fitto' and @type='text']")); //Unique Id  Of Fit For Modified Duties To text field On RMA Application Case Management Creation Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_Btn_PhysicianLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Physician lookup On RMA Application Medical Certificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-05-06-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_Btn_PhysicianLookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_casemanagerlist']")); //Unique Id  Of Physician lookup On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_Txt_LookupLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Physician's Last Name on RMA Application Medical Certificate Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-05-06-2020                                
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_Txt_LookupLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='FLD20000']")); //Unique Id  Of Physician's Last Name on RMA Application Medical Certificate Creation Page
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalCertificate_Btn_SubmitQuery
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Primary Case Manager CheckBox On RMA Application Case Manager Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - MishalKantawala-05-06-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_MedicalCertificate_Btn_SubmitQuery(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='submitquery']/i")); //Unique Id  Of Primary Case Manager CheckBox On RMA Application Case Manager Creation Page Is Fetched
		return Element;
	}	

}


