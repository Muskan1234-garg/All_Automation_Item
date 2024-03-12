package rmaseleniumPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Note: Properties Of The Standard Search Page Objects Such as Submit Query Button, Last Name Of Medical staff Are Same As Of Search Screen That Is Opened When Add Existing Link For Persons Involved Is Clicked, Hence The Same Set Of Objects Can Be Utilized For Both
public class RMA_POM_Search {

	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_SearchFunds_Txt_ControlNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Funds Control Number Text Box on Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-01-11-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_SearchFunds_Txt_ControlNumber(WebDriver driver)
	{
		Element = driver.findElement(By.id("FLD35000")); //Unique Id  Of  Funds Control Number on Search Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Search_Chk_Soundex
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Soundex CheckBox on Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-01-11-2015
	//ModifiedBy			: 0.1- RenuVerma-09-06-2016 For UX Screen Enhancement
	// ============================================================================================
	public static WebElement RMAApp_Search_Chk_Soundex(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Sound')]/input[@type='checkbox'] |.//*[@id='soundex']")); //Unique Id Of Soundex CheckBox on Search Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Search_Btn_Submit
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Submit Button on Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-01-11-2015  
	//ModifiedBy			: 0.1- RenuVerma-09-06-2016 For UX Screen Enhancement
	// ============================================================================================
	public static WebElement RMAApp_Search_Btn_Submit(WebDriver driver)
	{
		Element = null;
		if(driver.getWindowHandles().size()==1) // For UX Screen
		{ 
			Element = driver.findElement(By.xpath(".//*[contains(text(),'search')]")); //Unique Id  Of  Submit Button on Search Page Is Fetched
		}
		else // For Normal Screen
		{
			Element = driver.findElement(By.id("btnSubmit1"));
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SearchClaim_Txt_ControlNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Number Text Box on Search-->Claim Criteria Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-03-2016                                
	// ============================================================================================
	public static WebElement RMAApp_SearchClaims_Txt_ClaimNumber(WebDriver driver)
	{
		Element = driver.findElement(By.id("FLD100")); //Unique Id Of Claim Number Text Box on Search-->Claim Criteria Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Search_Txt_MedicalStaffLastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Medical Staff LastName Text Box on Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-05-03-2016                                
	// ============================================================================================
	public static WebElement RMAApp_Search_Txt_MedicalStaffLastName(WebDriver driver)
	{
		Element = driver.findElement(By.id("FLD53000")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SearchEmployee_Txt_EmployeeNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Number Text Box on Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-05-04-2016                                
	// ============================================================================================
	public static WebElement RMAApp_SearchEmployee_Txt_EmployeeNumber(WebDriver driver)
	{
		Element = driver.findElement(By.id("FLD15530")); //Unique Id Of Employee Number Text Box on Search-->Employee Criteria Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SearchDriver_Txt_DriverLastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Driver LastName Text Box on Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-05-05-2016                                
	// ============================================================================================
	public static WebElement RMAApp_SearchDriver_Txt_DriverLastName(WebDriver driver)
	{
		Element = driver.findElement(By.id("FLD70000")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SearchPatient_Txt_PatientLastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Patient LastName Text Box on Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-05-06-2016                                
	// ============================================================================================
	public static WebElement RMAApp_SearchPatient_Txt_PatientLastName(WebDriver driver)
	{
		Element = driver.findElement(By.id("FLD50150")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SearchEntity_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity LastName Text Box on Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-05-09-2016                                
	// ============================================================================================
	public static WebElement RMAApp_SearchEntity_Txt_LastName(WebDriver driver)
	{
		Element = driver.findElement(By.id("FLD20000")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SearchPhysician_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Physician LastName Text Box on Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-05-09-2016                                
	// ============================================================================================
	public static WebElement RMAApp_SearchPhysician_Txt_LastName(WebDriver driver)
	{
		Element = driver.findElement(By.id("FLD52000")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SearchPropertyId_Txt_PropertyID
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which PropertyID Text Box on Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                
	// ============================================================================================
	public static WebElement RMAApp_SearchPropertyId_Txt_PropertyID(WebDriver driver)
	{
		Element = driver.findElement(By.id("FLD60719")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_RMAApp_SearchEvent_Txt_EventNumber
	//Description  			: To Fetch Unique Event (Such As Id, X-path, Name ) On The Basis Of Which EventNo Text Box on Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-29-2016                                
	// ============================================================================================
	public static WebElement RMAApp_SearchEvent_Txt_EventNumber(WebDriver driver)
	{
		Element = driver.findElement(By.id("FLD10000")); 
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Search_Lst_SearchQueryViewList
	//Description  			: To Fetch Unique Event (Such As Id, X-path, Name ) On The Basis Of Which Search Query View WebList on Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-12-22-2016                                
	// ============================================================================================
	public static WebElement RMAApp_Search_Lst_SearchQueryViewList(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(@class,'searchBox')]/select")); 
		return Element;
	}
	
	//============================================================================================
		//FunctionName 			: RMAApp_SearchVehicle_Txt_VehicleID
		//Description  			: To Fetch Unique Event (Such As Id, X-path, Name ) On The Basis Of Which Vehicle ID Text Box on Search Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - RenuVerma-01-05-2017                                
		// ============================================================================================
		public static WebElement RMAApp_SearchVehicle_Txt_VehicleID(WebDriver driver)
		{
			Element = driver.findElement(By.id("FLD25000")); 
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_SearchPolicy_Txt_PolicyName
		//Description  			: To Fetch Unique Event (Such As Id, X-path, Name ) On The Basis Of Which Policy Name Text Box on Search Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - RenuVerma-01-05-2017                                
		// ============================================================================================
		public static WebElement RMAApp_SearchPolicy_Txt_PolicyName(WebDriver driver)
		{
			Element = driver.findElement(By.id("FLD30001")); 
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_GenericSearch_Lbl_LabelsOnSearchScreen
		//Description  			: To Fetch Unique Event (Such As Id, X-path, Name ) On The Basis Of Which Search Label on Search Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - RenuVerma-01-05-2017                                
		// ============================================================================================
		public static WebElement RMAApp_GenericSearch_Lbl_LabelsOnSearchScreen(WebDriver driver,String labelName)
		{
			Element = driver.findElement(By.xpath(".//*[@id='searchAPP']//label[contains(text(),'"+labelName+"')]")); 
			return Element;
		}

}
