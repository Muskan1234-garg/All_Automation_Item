package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Employee {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_EmployeeNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Number TextBox On Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_EmployeeNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("employeenumber")); //Unique Id Of Employee Number TextBox On Employee Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lastname")); //Unique Id Of Last Name TextBox On Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MaintEmployee_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country LookUp Button On RMA Application Maintenance-->Employee Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-10-2017                                 
	//============================================================================================
	public static WebElement RMAApp_MaintEmployee_Btn_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_country")); //Unique Id  Of Country LookUp Button On RMA Application Maintenance-->Employee Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country LookUp Button On RMA Application Employee Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-10-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Employee_Btn_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_countrycode")); //Unique Id Of Country LookUp Button On RMA Application Employee Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_Department
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Department TextBox On Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_Department(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_deptassignedeid")); //Unique Id Of Department TextBox On Employee Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_SocialSecurityNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SocialSecurityNumber TextBox On Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_SocialSecurityNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("taxid")); //Unique Id Of SocialSecurityNumber TextBox On Employee Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Employee_Tab_EmploymentInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employment Info Tab On Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Tab_EmploymentInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Employment Info')]/i")); //Unique X-path Of Employment Info Tab On Employee Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Employee_Tab_Employee
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Tab On Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Tab_Employee(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Employee')]/i")); //Unique X-path Of Employee Tab On Employee Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_FirstName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which FirstName TextBox On Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-30-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_FirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("firstname")); //Unique Id Of First Name TextBox On Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Tab_EmployeeInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Employee Info Tab On RMA Application Employee Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Employee_Tab_EmployeeInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Employee Info')]/i")); //Unique x-path  Of Employee Info Tab On RMA Application Employee Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Tab_Addresses
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Addresses Tab On RMA Application Employee Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Employee_Tab_Addresses(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'Addresses')]/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique x-path  Of Addresses Tab On RMA Application Employee Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Tab_EntityIDType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EntityIDType Tab On RMA Application Employee Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Employee_Tab_EntityIDType(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'Entity ID Type')]/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique x-path  Of EntityIDType Tab On RMA Application Employee Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplementals Tab On RMA Application Employee Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Employee_Tab_Supplementals(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique x-path  Of Supplementals Tab On RMA Application Employee Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_NumberOfViolations
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which NumberOfViolations TextBox On Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_NumberOfViolations(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("numofviolations")); //Unique Id Of NumberOfViolations TextBox On Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Btn_AddNewAddress
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Address Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017
	//============================================================================================
	public static WebElement RMAApp_Employee_Btn_AddNewAddress(WebDriver driver)
	{
		Element = driver.findElement(By.id("cruduiGridAddBtn"));//Unique x-path Of Add New Address Button On RMA Application Employee Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_AddrType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address Type Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_AddrType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_addressType")); //Unique Id Of Address Type TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_Addr1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 1 Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_Addr1(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.id("addr1"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Address 1 TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_Addr2
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 2 Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_Addr2(WebDriver driver)
	{
		Element = driver.findElement(By.id("addr2")); //Unique Id Of Address 2 TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_Addr3
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 3 Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_Addr3(WebDriver driver)
	{
		Element = driver.findElement(By.id("addr3")); //Unique Id Of Address 3 TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_Addr4
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 4 Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_Addr4(WebDriver driver)
	{
		Element = driver.findElement(By.id("addr4")); //Unique Id Of Address 4 TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which City Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_City(WebDriver driver)
	{
		Element = driver.findElement(By.id("city")); //Unique Id Of City TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_State(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_state")); //Unique Id Of State TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_MaintEmployee_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Button On RMA Application Maintenance-->Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_MaintEmployee_Btn_State(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_state")); //Unique Id Of State Button On RMA Application Maintenance-->Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Btn_State(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_stateid")); //Unique Id Of State Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	/*============================================================================================
	//FunctionName 			: RMAApp_MaintEmployee_Txt_ZipCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Maintenance-->ZipCode TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                               
	//============================================================================================ */
	public static WebElement RMAApp_MaintEmployee_Txt_ZipCode(WebDriver driver)
	{
		Element = driver.findElement(By.id("zipCode")); //Unique Id  Of Maintenance--> Zip Code TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	/*============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_ZipCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ZipCode TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                               
	//============================================================================================ */
	public static WebElement RMAApp_Employee_Txt_ZipCode(WebDriver driver)
	{
		Element = driver.findElement(By.id("zipcode")); //Unique Id Of Zip Code TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Country Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_Country(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_country")); //Unique Id Of Country TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_County
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which County Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_County(WebDriver driver)
	{
		Element = driver.findElement(By.id("county")); //Unique Id Of County TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_HiredDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Hired Date Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_HiredDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='datehired' and @type='text']")); //Unique Id Of Hired Date TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_TerminationDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Termination Date Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_TerminationDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='termdate' and @type='text']")); //Unique Id Of Termination Date TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_ExpirationDateOnEmployeeInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Expiration Date Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_ExpirationDateOnEmployeeInfo(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='datedriverslicexp' and @type='text']")); //Unique Id Of Expiration Date TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_DateOfDeath
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Date Of Death Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_DateOfDeath(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='dateofdeath' and @type='text']")); //Unique Id Of Date Of Death TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_EffectiveDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Effective Date Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_EffectiveDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='effectivedate' and @type='text']")); //Unique Id Of Effective Date TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_BirthDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Birth Date Text Box On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_BirthDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='birthdate' and @type='text']")); //Unique Id Of Birth Date TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_ExpirationDateOnEmployee
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Expiration Date Text Box On Employee Tab On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_ExpirationDateOnEmployee(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='expirationdate' and @type='text']")); //Unique Id Of Birth Date TextBox On Employee Tab On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_DateLastVerified
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Date Last Verified TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_DateLastVerified(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lastverifieddate' and @type='text']")); //Unique Id Of Date Last Verified TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_WorkPermitDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Work Permit Date TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_WorkPermitDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='workpermitdate' and @type='text']")); //Unique Id Of Work Permit Date TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_LastCoPhysExam
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Co. Phys. Exam TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_LastCoPhysExam(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='supp_cophysexam_date' and @type='text']")); //Unique Id Of Last Co. Phys. Exam TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityIdType_Txt_EntityIdType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Id Type TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EntityIdType_Txt_EntityIdType(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_idType']")); //Unique Id Of Entity Id Type TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityIdType_Btn_EntityIdType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Id Type Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EntityIdType_Btn_EntityIdType(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_idType']")); //Unique Id Of Entity Id Type Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityIdType_Txt_EntityIDNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Id Number TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EntityIdType_Txt_EntityIDNumber(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='idNum']")); //Unique Id Of Entity Id Number TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityIdType_Txt_EffectiveDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Effective Date TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EntityIdType_Txt_EffectiveDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='effStartDate' and @type='text']")); //Unique Id Of Effective Date TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityIdType_Txt_ExpirationDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Expiration Date TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EntityIdType_Txt_ExpirationDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='effEndDate' and @type='text']")); //Unique Id Of Expiration Date TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Address_Img_AddressLookup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address Lookup Image Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_Address_Img_AddressLookup(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='Address Lookup']/i")); //Unique Id Of Address Lookup Image Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Txt_LicenseNo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which License Number TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Txt_LicenseNo(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='driverslicno']")); //Unique Id Of License Number TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Txt_LicenseType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which License Type TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Txt_LicenseType(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_driverslictypecode']")); //Unique Id Of License Type TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Btn_LicenseType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which License Type Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Btn_LicenseType(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_driverslictypecode']")); //Unique Id Of License Type Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Btn_LicenseJurisdiction
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which License Jurisdiction Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Btn_LicenseJurisdiction(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_drivlicstate']")); //Unique Id Of License Jurisdiction Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Txt_LicenseJurisdiction
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which License Jurisdiction TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Txt_LicenseJurisdiction(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_drivlicstate']")); //Unique Id Of License Jurisdiction TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Txt_Restrictions
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Restrictions TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Txt_Restrictions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_drivlicrstrctcode']")); //Unique Id Of Restrictions TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Btn_Restrictions
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Restrictions Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Btn_Restrictions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_drivlicrstrctcode']")); //Unique Id Of Restrictions Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Btn_NCCIClass
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which NCCI Class Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Btn_NCCIClass(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_ncciclasscode']")); //Unique Id Of NCCI Class Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Txt_NCCIClass
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which NCCI Class TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Txt_NCCIClass(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_ncciclasscode']")); //Unique Id Of NCCI Class TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Flag_Insurable
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Insurable CheckBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Flag_Insurable(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='insurableflag']")); //Unique Id Of Insurable CheckBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Txt_EmailType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Email Type TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Txt_EmailType(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_emailtypecode']")); //Unique Id Of Email Type TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Btn_EmailType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Email Type Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Btn_EmailType(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_emailtypecode']")); //Unique Id Of Email Type Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Txt_EmailAddress
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Email Address TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Txt_EmailAddress(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='emailaddress']")); //Unique Id Of Email Address TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Txt_CostCenter
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Cost Center TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Txt_CostCenter(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_costcentercode']")); //Unique Id Of Cost Center TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Btn_CostCenter
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Cost Center Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Btn_CostCenter(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_costcentercode']")); //Unique Id Of Cost Center Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Txt_WorkPermitNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Work Permit No. TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Txt_WorkPermitNumber(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='workpermitnumber']")); //Unique Id Of Work Permit No. TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeInfo_Txt_NumberOfViolations
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Number Of Violations TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeInfo_Txt_NumberOfViolations(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='numofviolations']")); //Unique Id Of Number Of Violations TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_PositionCode
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Position Code TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_PositionCode(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_positioncode']")); //Unique Id Of Position Code TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Btn_PositionCode
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Position Code Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Btn_PositionCode(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_positioncode']")); //Unique Id Of Position Code Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_Supervisor
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supervisor TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_Supervisor(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_supervisoreid']")); //Unique Id Of Supervisor TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Btn_Supervisor
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supervisor Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Btn_Supervisor(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_supervisoreid']")); //Unique Id Of Supervisor Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Btn_PayType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Pay Type Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Btn_PayType(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_paytypecode']")); //Unique Id Of Pay Type Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_PayType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Pay Type TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_PayType(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_paytypecode']")); //Unique Id Of Pay Type TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_PayAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Pay Amount TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_PayAmount(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='payamount' and @type='text']")); //Unique Id Of Pay Amount TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_HourlyRate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Hourly Rate TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_HourlyRate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='hourlyrate' and @type='text']")); //Unique Id Of Hourly Rate TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_MonthlyRate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Monthly Rate TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_MonthlyRate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='monthlyrate' and @type='text']")); //Unique Id Of Monthly Rate TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_DailyCompensationRate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Daily Compensation Rate TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_DailyCompensationRate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='dailycomprate' and @type='text']")); //Unique Id Of Daily Compensation Rate TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Flag_DisabilityBenefits
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Disability Benefits CheckBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Flag_DisabilityBenefits(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='noteligdisbene']")); //Unique Id Of Disability Benefits CheckBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Flag_Active
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Active CheckBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Flag_Active(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='activeflag']")); //Unique Id Of Active CheckBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Flag_FullTimeEmployee
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Full Time Employee CheckBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Flag_FullTimeEmployee(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='fulltimeflag']")); //Unique Id Of Full Time Employee CheckBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Flag_Exempt
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Exempt CheckBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Flag_Exempt(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='exemptstatusflag']")); //Unique Id Of Exempt CheckBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_NoOfExemptions
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Number Of Exemptions TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_NoOfExemptions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='noofexemptions']")); //Unique Id Of Number Of Exemptions TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_HoursPerWeek
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Hours Per Week TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_HoursPerWeek(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='weeklyhours']")); //Unique Id Of Hours Per Week TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_WeeklyRate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Weekly Rate TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_WeeklyRate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='weeklyrate' and @type='text']")); //Unique Id Of Weekly Rate TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_JobClass
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Job Class TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_JobClass(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_jobclassification']")); //Unique Id Job Class TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Btn_JobClass
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Job Class Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Btn_JobClass(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_jobclassification']")); //Unique Id Job Class Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Btn_DisabilityOption
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Disability Option Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Btn_DisabilityOption(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_empdisabilityoption']")); //Unique Id Disability Option Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_DisabilityOption
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Disability Option TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_DisabilityOption(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_empdisabilityoption']")); //Unique Id Disability Option TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmploymentInfo_Txt_PostInjuryWeeklyWage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Post Injury Weekly Wage TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmploymentInfo_Txt_PostInjuryWeeklyWage(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='postweeklywage' and @type='text']")); //Unique Id Post Injury Weekly Wage TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Chk_FreezePayment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Freeze Payments CheckBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Chk_FreezePayment(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.id("freezepayments"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Freeze Payments CheckBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_MiddleName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Middle Name TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_MiddleName(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='middlename']")); //Unique Id Middle Name TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_EntityPaymentApprovalStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Payment Approval Status TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_EntityPaymentApprovalStatus(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_entityapprovalstatuscode']")); //Unique Id Entity Payment Approval Status TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Btn_EntityPaymentApprovalStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Payment Approval Status Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Btn_EntityPaymentApprovalStatus(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btn_entityapprovalstatuscode']")); //Unique Id Entity Payment Approval Status Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_FFINNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which FFIN Number TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_FFINNumber(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='feinnumber']")); //Unique Id FFIN Number TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Img_Lookup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Lookup Image Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Img_Lookup(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Lookup']")); //Unique Id Lookup Image Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Img_SupplementalGrid_DDMenu
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supplemental Grid Image Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Img_SupplementalGrid_DDMenu(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='frmData']/div[1]/div[2]/rma-supplemental-grid")); //Unique Id Supplemental Grid Image Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Img_GridDDMenu
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Name Of Grid On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Img_GridDDMenu(WebDriver driver,String DDMenuName)
	{
		Element = driver.findElement(By.xpath(".//*[@class='dropdown-menu ng-scope']/li/a[contains(text(),'"+DDMenuName+"')]")); //Unique Id Name Of Grid On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeSearch_Txt_EmployeeNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Number TextBox On RMA Application Employee Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeSearch_Txt_EmployeeNumber(WebDriver driver)
	{
		Element = driver.findElement(By.name("Employee Number")); //Unique Id  Employee Number TextBox On RMA Application Employee Search Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeSearch_Btn_SubmitQuery
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Submit Query Button On RMA Application Employee Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeSearch_Btn_SubmitQuery(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='submitquery']/i")); //Unique Id Submit Query Button On RMA Application Employee Search Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_RecordSummary_Txt_Data
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Data Of Record Summary On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-14-2018                            
	//============================================================================================
	public static WebElement RMAApp_RecordSummary_Txt_Data(WebDriver driver,String StrMsg)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+StrMsg+"')]")); //Unique Id Data Of Record Summary On RMA Application Employee Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Image Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-14-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Img_Save(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='material-icons material-icons-clr' and contains(text(),'save')]//ancestor::a[1]")); //Unique Id Save Image Button On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeSupplemental_Txt_UpdatedDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Updated Date TextBox On Supplemental Tab On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-14-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeSupplemental_Txt_UpdatedDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='supp_updated_dat_date' and @type='text']")); //Unique Id Updated Date TextBox On Supplemental Tab On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeSupplemental_Txt_SysUpdatedDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which System Updated Date TextBox On Supplemental Tab On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-14-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeSupplemental_Txt_SysUpdatedDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='supp_system_upda_date' and @type='text']")); //Unique Id System Updated Date TextBox On Supplemental Tab On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EmployeeSupplemental_ToastMessage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Toast Message On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-14-2018                            
	//============================================================================================
	public static WebElement RMAApp_EmployeeSupplemental_ToastMessage(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='toast-container']/div")); //Unique Id Toast Message On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_Initials
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Initial TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-14-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_Initials(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='abbreviation']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Initial TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Txt_AlsoKnownAs
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Also known As TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-14-2018                            
	//============================================================================================
	public static WebElement RMAApp_Employee_Txt_AlsoKnownAs(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='alsoknownas']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Also Known As TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName                    : RMAApp_Employee_Txt_Title
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Title TextBox On Employee Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 -SheikhFaiza-03-14-2018                                
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_Title(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("title")); //Unique Id Of Title TextBox On Employee Page Is Fetched
		return Element;
	}


	//=================================================================================================================================================================================================
	//FunctionName                    : RMAApp_Employee_Txt_Sex
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Sex TextBox On Employee Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 -SheikhFaiza-03-14-2018                                
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_Sex(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_sexcode")); //Unique Id Of Sex TextBox On Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_MaintEmployee_Btn_Sex
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Sex Button On RMA Application Maintenance-->Employee Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - SheikhFaiza-03-14-2018                        
	//============================================================================================
	public static WebElement RMAApp_MaintEmployee_Btn_Sex(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_sexcode")); //Unique Id Of Sex Button On RMA Application Maintenance-->Employee Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName                    : RMAApp_Employee_Txt_MaritalStatus
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which MaritalStatus TextBox On Employee Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 -SheikhFaiza-03-14-2018                                
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_MaritalStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_maritalstatcode")); //Unique Id Of Marital Status TextBox On Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_MaintEmployee_Btn_MaritalStatus
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which MaritalStatus Button On RMA Application Maintenance-->Employee Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - SheikhFaiza-03-14-2018                        
	//============================================================================================
	public static WebElement RMAApp_MaintEmployee_Btn_MaritalStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_maritalstatcode")); //Unique Id Of Marital Status Button On RMA Application Maintenance-->Employee Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName                    : RMAApp_Employee_Txt_ExpirationDate
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ExpirationDate TextBox On Employee Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 -SheikhFaiza-03-14-2018                                
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_ExpirationDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='expirationdate' and@ type='text']")); //Unique Id Of Expiration Date TextBox On Employee Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName                    : RMAApp_Employee_Txt_Dob
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Date Of Birth TextBox On Employee Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 -SheikhFaiza-03-14-2018                                
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_Dob(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='birthdate' and@ type='text']")); //Unique Id Of Date Of Birth TextBox On Employee Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName                    : RMAApp_Employee_Txt_PayType
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Pay Type TextBox On Employee Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 -SheikhFaiza-03-14-2018                                
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_PayType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_paytypecode")); //Unique Id Of Pay Type TextBox On Employee Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_MaintEmployee_Btn_PayType
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Pay Type Button On RMA Application Maintenance-->Employee Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - SheikhFaiza-03-14-2018                        
	//============================================================================================
	public static WebElement RMAApp_MaintEmployee_Btn_PayType(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_paytypecode")); //Unique Id Of Pay Type Button On RMA Application Maintenance-->Employee Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName                    : RMAApp_Employee_Txt_HoursPerWeek
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Hours Per Week TextBox On Employee Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 -SheikhFaiza-03-14-2018                                
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_HoursPerWeek(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("weeklyhours")); //Unique Id Of Hours Per Week TextBox On Employee Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName                    : RMAApp_Employee_Txt_LicenseNumber
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which License TextBox On Employee Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 -SheikhFaiza-03-14-2018                                
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Employee_Txt_LicenseNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("driverslicno")); //Unique Id Of License TextBox On Employee Page Is Fetched
		return Element;
	}

}

