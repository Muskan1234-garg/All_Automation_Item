package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Packages Import Completed

public class RMA_Selenium_POM_Violations {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Violations_Txt_ViolationDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Violation Date TextBox On RMA Application Violation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Violations_Txt_ViolationDate(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='violationdate' and @type='text']")); //Unique Id Of Violation Date TextBox On RMA Application Violation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Violations_Txt_Violation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Violation TextBox On RMA Application Violation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Violations_Txt_Violation(WebDriver driver)
	{
		Element =null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='lookup_violationcode']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Violation TextBox On RMA Application Violation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Violations_Btn_Violation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Violation Button On RMA Application Violation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Violations_Btn_Violation(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_violationcode']")); //Unique Id Of Violation Button On RMA Application Violation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Violations_Img_Lookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Lookup Image Button On RMA Application Violations Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Violations_Img_Lookup(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Lookup']")); //Unique Id Of Lookup Image Button On RMA Application Violations Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Violations_Link_LookupInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Link On Lookup Table On RMA Application Violations Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Violations_Link_LookupInfo(WebDriver driver,String Entity)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),"+Entity+")]")); //Unique Id Of Link On Lookup Table On RMA Application Violations Page Is Fetched
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
	//FunctionName 			: RMAApp_Violations_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Image Button On RMA Application Employee Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-14-2018                            
	//============================================================================================
	public static WebElement RMAApp_Violations_Btn_Save(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='Save']")); //Unique Id Save Image Button On RMA Application Employee Page Is Fetched
		return Element;
	}
}
