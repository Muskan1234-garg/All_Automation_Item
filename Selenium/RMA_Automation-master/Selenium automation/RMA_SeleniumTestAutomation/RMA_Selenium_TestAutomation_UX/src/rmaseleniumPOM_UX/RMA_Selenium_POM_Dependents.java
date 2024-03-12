package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Packages Import Completed

public class RMA_Selenium_POM_Dependents {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name TextBox On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Txt_LastName(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_depnlastname']")); //Unique Id Of Last Name TextBox On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Txt_FirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Name TextBox On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Txt_FirstName(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='depnfirstname']")); //Unique Id Of First Name TextBox On RMA Application Dependents Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Txt_MiddleName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Middle Name TextBox On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Txt_MiddleName(WebDriver driver)
	{
		Element =null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='depnmiddlename']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Middle Name TextBox On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Txt_Address1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address1 TextBox On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Txt_Address1(WebDriver driver)
	{
		Element =null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='depnaddr1']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Address1 TextBox On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Txt_Address2
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address2 TextBox On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Txt_Address2(WebDriver driver)
	{
		Element =null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='depnaddr2']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Address2 TextBox On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which City TextBox On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Txt_City(WebDriver driver)
	{
		Element =null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='depncity']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of City TextBox On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State TextBox On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Txt_State(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_depnstateid']")); //Unique Id Of State TextBox On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Button On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Btn_State(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_depnstateid']")); //Unique Id Of State Button On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Txt_PostalCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip/Postal Code TextBox On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Txt_PostalCode(WebDriver driver)
	{
		Element =null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='depnzipcode']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Zip/Postal Code TextBox On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country TextBox On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Txt_Country(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_depncountrycode']")); //Unique Id Of Country TextBox On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country Button On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Btn_Country(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_depncountrycode']")); //Unique Id Of Country Button On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Txt_SocialSecurityNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Social Security Number TextBox On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Txt_SocialSecurityNumber(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='depntaxid']")); //Unique Id Of Social Security Number TextBox On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Txt_DateOfBirth
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Of Birth TextBox On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Txt_DateOfBirth(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='depnbirthdate' and @type='text']")); //Unique Id Of Date Of Birth TextBox On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Txt_Sex
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sex TextBox On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Txt_Sex(WebDriver driver)
	{
		Element =null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='lookup_depnsexcode']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Sex TextBox On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Btn_Sex
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sex Button On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Btn_Sex(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_depnsexcode']")); //Unique Id Of Sex Button On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplementals Tab On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Tab_Supplementals(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i")); //Unique Id Of Supplementals Tab On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Tab_DependentsInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dependents Info Tab On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Tab_DependentsInfo(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Dependent Info')]/i")); //Unique Id Of Dependents Info Tab On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Img_Lookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Lookup Image Button On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Img_Lookup(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Lookup']")); //Unique Id Of Lookup Image Button On RMA Application Dependents Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Dependents_Link_LookupInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Link On Lookup Table On RMA Application Dependents Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Dependents_Link_LookupInfo(WebDriver driver,String Entity)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),"+Entity+")]")); //Unique Id Of Link On Lookup Table On RMA Application Dependents Page Is Fetched
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
	//FunctionName 			: RMAApp_Dependents_Txt_RelationToEmployee
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Relation To Employee TextBox On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-14-2018                            
	//============================================================================================
	public static WebElement RMAApp_Dependents_Txt_RelationToEmployee(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_relationcode']")); //Unique Id Relation To Employee TextBox On RMA Application Employee Page Is Fetched
		return Element;
	}

}
