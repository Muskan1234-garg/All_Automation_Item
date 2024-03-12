package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_InjuryIllness {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_InjuryIllness_btn_PreExistingCondition
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PreExistingCondition LookUp On RMA Application Injury/Illness Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-22-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_InjuryIllness_btn_PreExistingCondition(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_preexistingcondition']")); //Unique Id  Of  PreExistingCondition LookUp On RMA Application Injury/Illness Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InjuryIllness_Txt_PreExistingCondition
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PreExistingCondition TextBox On RMA Application Injury/Illness Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-22-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_InjuryIllness_Txt_PreExistingCondition(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_preexistingcondition']")); //Unique Id  Of  PreExistingCondition TextBox On RMA Application Injury/Illness Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InjuryIllness_btn_DisabilityType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DisabilityType LookUp On RMA Application Injury/Illness Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-22-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_InjuryIllness_btn_DisabilityType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_disabilitycode']")); //Unique Id  Of  DisabilityType LookUp On RMA Application Injury/Illness Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InjuryIllness_Txt_DisabilityType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DisabilityType TextBox On RMA Application Injury/Illness Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-22-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_InjuryIllness_Txt_DisabilityType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_disabilitycode']")); //Unique Id  Of  DisabilityType TextBox On RMA Application Injury/Illness Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InjuryIllness_Txt_DateOfFileClosing
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FileClosingDate TextBox On RMA Application Injury/Illness Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-22-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_InjuryIllness_Txt_DateOfFileClosing(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='fileclosingdate' and @type='text']")); //Unique Id  Of  FileClosingDate TextBox On RMA Application Injury/Illness Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InjuryIllness_Txt_DisabilityFromDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DisabilityFromDate TextBox On RMA Application Injury/Illness Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-22-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_InjuryIllness_Txt_DisabilityFromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='disabilfromdate' and @type='text']")); //Unique Id  Of  DisabilityFromDate TextBox On RMA Application Injury/Illness Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InjuryIllness_btn_IllnessType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Illness Type Look Up On RMA Application Injury/Illness Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-22-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_InjuryIllness_btn_IllnessType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_illnesscode2']")); //Unique Id  Of  Illness Type LookUp On RMA Application Injury/Illness Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InjuryIllness_Txt_IllnessType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Illness Type TextBox On RMA Application Injury/Illness Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-22-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_InjuryIllness_Txt_IllnessType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_illnesscode2']")); //Unique Id  Of  Illness Type TextBox On RMA Application Injury/Illness Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InjuryIllness_btn_Injuries
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Injuries Look Up On RMA Application Injury/Illness Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-22-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_InjuryIllness_btn_Injuries(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_injurieslist2']")); //Unique Id  Of  Injuries LookUp On RMA Application Injury/Illness Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InjuryIllness_Txt_Injuries
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Injuries TextBox On RMA Application Injury/Illness Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-22-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_InjuryIllness_Txt_Injuries(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_injurieslist2']/ul/li/input")); //Unique Id  Of  Injuries TextBox On RMA Application Injury/Illness Creation Page Is Fetched
		return Element;
	}
}
