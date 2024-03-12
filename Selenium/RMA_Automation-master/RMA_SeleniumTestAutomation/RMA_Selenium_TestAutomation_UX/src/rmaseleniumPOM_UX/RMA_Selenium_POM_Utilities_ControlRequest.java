package rmaseleniumPOM_UX;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Utilities_ControlRequest {
	public static WebElement Element = null;
	public static List<WebElement> Element_1 = null ;

	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Btn_Search
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Control Number Button On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Btn_Search(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='searchlookupbtn']/i")); //Unique Id Of Search Control Number Button On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Txt_ControlNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Control Number Textbox On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Txt_ControlNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("pay_ctlnumber")); //Unique Id Of Control Number Textbox On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Txt_CheckNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Number Textbox On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Txt_CheckNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("pay_checknumber")); //Unique Id Of Check Number Textbox On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Txt_PayeeFirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payee First Name Textbox On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Txt_PayeeFirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("pay_firstname")); //Unique Id Of Payee First Name Number Textbox On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Txt_PayeeLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payee Last Name Textbox On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Txt_PayeeLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("pay_lastname")); //Unique Id Of Payee Last Name Number Textbox On Control Request Page Is Fetched
		return Element;
	}
	
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Btn_DestinationTransType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Destination Transaction Type Lookup Button On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Btn_DestinationTransType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("TransTypeCodeFt$codelookupbtn")); //Unique Id Of Destination Transaction Type Lookup Button On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Txt_DestinationTransType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Destination Transaction Type Textbox On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Txt_DestinationTransType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("TransTypeCodeFt$codelookup")); //Unique Id Of Destination Transaction Type Textbox On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Btn_ReasonForChange
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reason For Change Lookup Button On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Btn_ReasonForChange(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("ChangeTypeCode$codelookupbtn")); //Unique Id Of Reason For Change Lookup Button On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Txt_ReasonForChange
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reason For Change Textbox On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Txt_ReasonForChange(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("ChangeTypeCode$codelookup")); //Unique Id Of Reason For Change Textbox On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Txt_SearchControlNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Control Number Textbox On Search Page On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Txt_SearchControlNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("FLD35000")); //Unique Id Of Control Number Textbox On Search Page On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Bnt_SearchSubmitButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Button On Search Page On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Bnt_SearchSubmitButton(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.name("btnSubmit1")); //Unique Id Of Search Button On Search Page On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Rdo_SourceFinancialKey
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Source Financial Key Radio Button On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Rdo_SourceFinancialKey(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='MyRadioButton' and @name='TransSplitGrid']")); //Unique Id Of Source Financial Key Radio Button On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Rdo_DestinationFinancialKey
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Destination Financial Key Radio Button On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Rdo_DestinationFinancialKey(WebDriver driver, String ReserveType)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='DestFinKeysGrid_gvData']//*[contains(text(),'"+ReserveType+"')]//ancestor::tr[1]//input")); //Unique Id Of Destination Financial Key Radio Button On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image Button On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Btn_Save(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnControlRequest")); //Unique Id Of Save Image Button On Control Request Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ControlReq_Lnk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Link On Code Windows On Control Request Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-19-2019                                
	// ============================================================================================
	public static WebElement RMAApp_ControlReq_Lnk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='HeaderNavy']")); //Unique Id Of First Link On Code Windows On Control Request Page Is Fetched
		return Element;
	}
}
