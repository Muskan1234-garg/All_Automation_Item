package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_MedicalStaff {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Txt_StaffNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Staff Number Text Box On Medical Staff Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_MedicalStaff_Txt_StaffNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("medstaffnumber")); //Unique Id Of Type Of Staff Number Text Box On Medical Staff Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Medical Staff Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PIMedicalStaff_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_lastname")); //Unique Id Of Last Name TextBox On Medical Staff Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Medical Staff Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintenanceMedicalStaff_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lastname")); //Unique Id Of Last Name TextBox On Medical Staff Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Txt_FirstName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which FirstName TextBox On Medical Staff Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-08-07-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MedicalStaff_Txt_FirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("firstname")); //Unique Id Of First Name TextBox On Medical Staff Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Tab_Staff
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Staff Tab On Medical Staff Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MedicalStaff_Tab_Staff(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Staff')]/i")); //Unique Id Of Staff Tab On Medical Staff Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Tab_StaffInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which StaffInfo Tab On Medical Staff Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MedicalStaff_Tab_StaffInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Staff Info')]/i")); //Unique Id Of StaffInfo Tab On Medical Staff Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Tab_FacilityInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Facility Info Tab On Medical Staff Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MedicalStaff_Tab_FacilityInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Facility Info')]/i")); //Unique Id Of Facility Info Tab On Medical Staff Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Tab_Addresses
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Addresses Tab On Medical Staff Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MedicalStaff_Tab_Addresses(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Addresses')]/i")); //Unique Id Of Addresses Tab On Medical Staff Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Tab_EntityIDType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which EntityIDType Tab On Medical Staff Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MedicalStaff_Tab_EntityIDType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Entity ID Type')]/i")); //Unique Id Of EntityIDType Tab On Medical Staff Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Txt_AlsoKnownAs
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which AlsoKnownAs TextBox On Medical Staff Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MedicalStaff_Txt_AlsoKnownAs(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("alsoknownas")); //Unique Id Of AlsoKnownAs TextBox On Medical Staff Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Txt_StaffStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which StaffStatus TextBox On Medical Staff Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                               
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MedicalStaff_Txt_StaffStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_staffstatuscode")); //Unique Id Of StaffStatus TextBox On Medical Staff Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplementals Tab On RMA Application MedicalStaff Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_MedicalStaff_Tab_Supplementals(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i")); //Unique x-path  Of Supplementals Tab On RMA Application MedicalStaff Creation Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName                    : RMAApp_MedicalStaff_Img_Lookup
	//Description                     : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Lookup Image Button On RMA Application Staff Maintenance Page Can Be Identified
	//Input Parameter                 : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - FaizaSheikh-05-02-2018                                 
	//============================================================================================
	public static WebElement RMAApp_MedicalStaff_Img_Lookup(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Lookup']")); //Unique Id Of Lookup Image Button On RMA Application Staff Maintenance Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MedicalStaff_Txt_LookupLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Code Last Name Text Box On Lookup Window On RMA Application Event Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-04-24-2018                                   
	//============================================================================================
	public static WebElement RMAApp_MedicalStaff_Txt_LookupLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-filter-input ui-grid-filter-input-0']")); //Unique Id Of Code Last Name Text Box On Lookup Window On RMA Application Event Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_MedicalStaff_Btn_AddNewAddress
	//Description                     : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Address Button On RMA Application Staff Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver      
	//Revision                        : 0.0 - FaizaSheikh- 05-25-2018
	//============================================================================================
	public static WebElement RMAApp_MedicalStaff_Btn_AddNewAddress(WebDriver driver)
	{
		Element = driver.findElement(By.id("cruduiGridAddBtn"));//Unique x-path Of Add New Address Button On RMA Application Staff Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_MedicalStaff_Txt_AddrType
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address Type Text Box On RMA Application Staff Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver      
	//Revision                        : 0.0 - FaizaSheikh- 05-25-2018                          
	//============================================================================================
	public static WebElement RMAApp_MedicalStaff_Txt_AddrType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_addressType")); //Unique Id Of Address Type TextBox On RMA Application Staff Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName                    : RMAApp_MedicalStaff_Txt_Addr1
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 1 Text Box On RMA Application Staff Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver      
	//Revision                        : 0.0 - FaizaSheikh- 05-25-2018                         
	//============================================================================================
	public static WebElement RMAApp_MedicalStaff_Txt_Addr1(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.id("lookup_addr1"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Address 1 TextBox On RMA Application Staff Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_MedicalStaffSearch_Txt_LastName
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Number TextBox On RMA Application Employee Search Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver      
	//Revision                        : 0.0 - ShrutiShruti-02-08-2018                           
	//============================================================================================
	public static WebElement RMAApp_MedicalStaffSearch_Txt_LastName(WebDriver driver)
	{
		Element = driver.findElement(By.name("Med. Staff Last Name")); //Unique Id  Employee Number TextBox On RMA Application Employee Search Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                        : RMAApp_GenericUXTable_Btn_Close
	//Description                         : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Code Last Name Text Box On Lookup Window On RMA Application Event Creation Page Can Be Identified
	//Input Parameter             : Driver Variable Of The Type WebDriver              
	//Revision                            : 0.0 - ShrutiShruti-12-13-2018                                   
	//============================================================================================
	public static WebElement RMAApp_GenericUXTable_Btn_Close(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='lg-modal-rm glyphicon glyphicon-remove modalcloseBtn']")); //Unique Id Of Code Last Name Text Box On Lookup Window On RMA Application Event Creation Page Is Fetched
		return Element;
	}
}