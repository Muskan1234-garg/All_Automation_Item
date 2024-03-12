package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Physician {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Txt_PhysicianNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Physician Number Text Box On Physician Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Txt_PhysicianNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("physiciannumber")); //Unique Id Of Type Of Physician Number Text Box On Physician Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Physician Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lastname")); //Unique Id Of Last Name TextBox On Physician Page Is Fetched
		return Element;
	}
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Txt_MiddleName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Middle name TextBox On Physician Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Txt_MiddleName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("middlename")); //Unique Id Of Middle Name TextBox On Physician Page Is Fetched
		return Element;
	}
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Txt_FirstName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which First name TextBox On Physician Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Txt_FirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("firstname")); //Unique Id Of First Name TextBox On Physician Page Is Fetched
		return Element;
	}
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Txt_County
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which County TextBox On Physician Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Txt_County(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("county")); //Unique Id Of County TextBox On Physician Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Txt_MedStaffNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which MedStaffNumber TextBox On Physician Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Txt_MedStaffNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("medstaffnumber")); //Unique Id Of MedStaffNumber TextBox On Physician Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Txt_AlsoKnownAs
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which AlsoKnownAs TextBox On Physician Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-03-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Txt_AlsoKnownAs(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("alsoknownas")); //Unique Id Of AlsoKnownAs TextBox On Physician Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Txt_LicenceNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LicenceNumber TextBox On Physician Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-03-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Txt_LicenceNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("licencenumber")); //Unique Id Of LicenceNumber TextBox On Physician Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Txt_TeachingExp
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which TeachingExp TextBox On Physician Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-03-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Txt_TeachingExp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("teachingexp")); //Unique Id Of TeachingExp TextBox On Physician Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Tab_StaffInfo 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Staff Info  Tab On Entity Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - KumudNaithani-02-11-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Tab_StaffInfo (WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath("//*[contains(text(),'Staff Info')]//i")); //Unique Id Of Staff Info  Tab On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Tab_PhysicianInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which PhysicianInfo Tab On Entity Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - KumudNaithani-02-11-2017                               
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Tab_PhysicianInfo(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath("//*[contains(text(),'Physician Info')]//i")); //Unique Id Of PhysicianInfo Tab On Entity Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Physician_Tab_Addresses
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Addresses Tab On RMA Application Physician Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Physician_Tab_Addresses(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Addresses')]/i")); //Unique x-path  Of Addresses Tab On RMA Application Physician Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Physician_Tab_EntityIDType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EntityIDType Tab On RMA Application Physician Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Physician_Tab_EntityIDType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Entity ID Type')]/i")); //Unique x-path  Of EntityIDType Tab On RMA Application Physician Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supplementals Tab On Physician Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - KumudNaithani-02-11-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Tab_Supplementals(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath("//*[contains(text(),'Supplementals')]//i")); //Unique Id Of Supplementals Tab On Physician Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Tab_Physician
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Physician Tab On RMA Application Physician Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, String TabState :: TabState Would Be Up If The Contents Of The Tab Are Currently Being Displayed And Down Would Be Up If The Contents Of The Tab Are Currently Not Being Displayed	 
	//Revision				: 0.0 - KumudNaithani-11-02-2017                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Tab_Physician(WebDriver driver, String Tabstate)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[contains(text(),'Physician')]//*[@class='pull-right glyphicon glyphicon-chevron-"+Tabstate+"']")); //Unique x-path Of Physician Tab On RMA Application Physician Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Tab_Education 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Education Tab On Physician Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - KumudNaithani-02-11-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Tab_Education (WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath("//*[contains(text(),'Education')]//i")); //Unique Id Of Education Tab On Physician Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Privileges_Txt_Category 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Category Textbox On Privileges Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Privileges_Txt_Category (WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("lookup_categorycode")); //Unique Id Of Category Textbox On Privileges Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Privileges_Txt_Type 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Textbox On Privileges Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Privileges_Txt_Type(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("lookup_typecode")); //Unique Id Of Type Textbox On Privileges Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Privileges_Txt_Status 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Status Textbox On Privileges Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Privileges_Txt_Status(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("lookup_statuscode")); //Unique Id Of Status Textbox On Privileges Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Privileges_Txt_StartDate 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Start date Textbox On Privileges Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Privileges_Txt_StartDate(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath(".//*[@id='intdate']/div/div/div/input")); //Unique Id Of Start date Textbox On Privileges Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Privileges_Txt_EndDate 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which End Date Textbox On Privileges Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Privileges_Txt_EndDate(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath(".//*[@id='enddate']/div/div/div/input")); //Unique Id Of Status End Date Textbox On Privileges Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Privileges_Img_Lookup 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Lookup Image On Privileges Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-11-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Privileges_Img_Lookup(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath(".//*[@uib-tooltip='Lookup']/i")); //Unique Id Of Lookup Image  On Privileges Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Certifications_Txt_Name 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Name Textbox On Certifications Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-12-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Certifications_Txt_Name(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("lookup_namecode")); //Unique Id Of Name Textbox  On Certifications Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Certifications_Txt_Board 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Board Textbox On Certifications Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-12-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Certifications_Txt_Board(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("lookup_boardcode")); //Unique Id Of Board Textbox  On Certifications Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Education_Txt_Type 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Textbox On Education Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-15-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Education_Txt_Type(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("lookup_eductypecode")); //Unique Id Of  Type Textbox On Education Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Education_Txt_DegreeType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Degree Type Textbox On Education Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-15-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Education_Txt_DegreeType(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("lookup_degreetype")); //Unique Id Of Degree Type Textbox On Education Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Education_Txt_DegreeDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Degree Date Textbox On Education Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-15-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Education_Txt_DegreeDate(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath(".//*[@id='degreedate']/div/div/div/input")); //Unique Id Of Degree Date Textbox On Education Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_PrevHospital_Txt_Privilege
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Privilege Textbox On Previous Hospital Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-15-01-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_PrevHospital_Txt_Privilege(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("lookup_privcode")); //Unique Id Of Privilege Textbox On Previous Hospital Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Contracts_Txt_StartDate 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Start date Textbox On Contracts Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-17-01-2018                             
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Contracts_Txt_StartDate(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath(".//*[@id='startdate']/div/div/div/input")); //Unique Id Of Start date Textbox On Contracts Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Contracts_Txt_Amount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Amount Textbox On Contracts Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-17-01-2018                             
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Contracts_Txt_Amount(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath(".//*[@id='amount' and @type ='text']")); //Unique Id Of Amount Textbox On Contracts Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Contracts_Txt_Comments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Comments Textbox On Contracts Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-17-01-2018                             
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Contracts_Txt_Comments(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("comments")); //Unique Id Of Comments Textbox On Contracts Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Physician_Contracts_Tab_PerDiemRate 
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per Diem Rate Tab On RMA Application Contracts Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-17-01-2018                                   
	//============================================================================================
	public static WebElement RMAApp_Physician_Contracts_Tab_PerDiemRate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Per Diem Rate ')]/i")); //Unique x-path  Of Per Diem Rate Tab On RMA Application Contracts Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Contracts_Txt_FirstRate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which First Rate Textbox On Contracts Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-17-01-2018                             
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Contracts_Txt_FirstRate(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath(".//*[@id='firstrate' and @type ='text']")); //Unique Id Of First Rate Textbox On Contracts Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Physician_Contracts_Tab_StateWCFeeScheduleDiscount 
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State/WC Fee Schedule/Discount Tab On RMA Application Contracts Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-17-01-2018                                   
	//============================================================================================
	public static WebElement RMAApp_Physician_Contracts_Tab_StateWCFeeScheduleDiscount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'State/WC Fee Schedule/Discount ')]/i")); //Unique x-path  Of State/WC Fee Schedule/Discount  Tab On RMA Application Contracts Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Physician_Contracts_Lst_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State List On Contracts Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - NidhiJha-17-01-2018                             
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Physician_Contracts_Lst_State(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("statefee")); //Unique Id Of State List On Contracts Page Is Fetched
		return Element;
	}
}



