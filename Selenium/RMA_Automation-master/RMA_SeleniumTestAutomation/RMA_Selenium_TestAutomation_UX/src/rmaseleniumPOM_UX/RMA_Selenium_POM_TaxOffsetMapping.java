package rmaseleniumPOM_UX;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_TaxOffsetMapping {
	public static WebElement Element;
	public static List<WebElement> ElementList = null;

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Lst_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country ListBox On RMA Application Tax and Offset Mapping Page Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Lst_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("country")); //Unique Id Of Country ListBox On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Txt_PayeeFederalTax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payee TextBox Of Federal Tax On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Txt_PayeeFederalTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtFederalTax")); //Unique Id Of Payee TextBox Of Federal Tax On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Txt_TransTypeFederalTax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type List Of Federal Tax On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Txt_TransTypeFederalTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstTransTypeFed")); //Unique Id Of Transaction Type List Of Federal Tax On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Txt_TaxPercFederalTax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tax Percentage TextBox Of Federal Tax On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Txt_TaxPercFederalTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtTaxPercentageFed")); //Unique Id Of Tax Percentage TextBox Of Federal Tax On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Txt_PayeeSocSecTax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payee TextBox Of Social Security Tax On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Txt_PayeeSocSecTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtSSNTax")); //Unique Id Of Payee TextBox Of Social Security Tax On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Txt_TransTypeSocSecTax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type List Of Social Security Tax On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Txt_TransTypeSocSecTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstTransTypeSSN")); //Unique Id Of Transaction Type List Of Social Security Tax On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Txt_TaxPercSocSecTax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tax Percentage TextBox Of Social Security Tax On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Txt_TaxPercSocSecTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtTaxPercentageSSN")); //Unique Id Of Tax Percentage TextBox Of Social Security Tax On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Txt_PayeeMedicareTax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payee TextBox Of MediCare Tax On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Txt_PayeeMedicareTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtMEDTax")); //Unique Id Of Payee TextBox Of MediCare Tax On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Txt_TransTypeMedicareTax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type List Of MediCare Tax On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Txt_TransTypeMedicareTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstTransTypeMED")); //Unique Id Of Transaction Type List Of MediCare Tax On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Txt_TaxPercMedicareTax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tax Percentage TextBox Of MediCare Tax On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Txt_TaxPercMedicareTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtTaxPercentageMED")); //Unique Id Of Tax Percentage TextBox Of MediCare Tax On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Link_TaxMapping
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tax Mapping Tab On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Link_TaxMapping(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("LINKTABSTaxMapping")); //Unique Id Of Tax Mapping Tab On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Link_Offsets
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Offsets Tab On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Link_Offsets(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("LINKTABSOffsets")); //Unique Id Of Offsets Tab On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Btn_SaveFederalTax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image Button On Federal Tax Tab On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Btn_SaveFederalTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='Save Federal Tax']/i")); //Unique Id Of Save Image Button On Federal Tax Tab On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Btn_SaveStateTax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image Button On State Tax Tab On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Btn_SaveStateTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='Add State Map']/i")); //Unique Id Of Save Image Button On State Tax Tab On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Btn_RemoveStateTax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Remove Image Button On State Tax Tab On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Btn_RemoveStateTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='Remove State Map']/i")); //Unique Id Of Remove Image Button On State Tax Tab On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Lst_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State ListBox On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Lst_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstStates")); //Unique Id Of State ListBox On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Txt_StateTaxEntityPayee
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tax/Entity Payee TextBox On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Txt_StateTaxEntityPayee(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtStateTax")); //Unique Id Of Tax/Entity Payee TextBox On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Lst_StateTransType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction Type List On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Lst_StateTransType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstTransTypeState")); //Unique Id Of Transaction Type List On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Txt_StateTaxPerc
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tax Percentage TextBox On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Txt_StateTaxPerc(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtTaxPercentageState")); //Unique Id Of Tax Percentage TextBox On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Table_StateMap
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Tax Mapping Table On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Table_StateMap(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("gvTaxMappingGrid")); //Unique Id Of State Tax Mapping Table On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Lst_Pension
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pension Transaction Type ListBox On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Lst_Pension(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstTransTypePension")); //Unique Id Of Pension Transaction Type ListBox On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Lst_SocSec
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Social Security Transaction Type ListBox On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Lst_SocSec(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstTransTypeSSN1")); //Unique Id Of Social Security On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Lst_OtherIncome
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Other Income Transaction Type ListBox On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Lst_OtherIncome(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstTransTypeOI")); //Unique Id Of Other Income On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Lst_Offset1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Offset #1 Transaction Type ListBox On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Lst_Offset1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstTransTypeOthOff1")); //Unique Id Of Offset #1 On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Lst_Offset2
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Offset #2 Transaction Type ListBox On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Lst_Offset2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstTransTypeOthOff2")); //Unique Id Of Offset #2 On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Lst_Offset3
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Offset #3 Transaction Type ListBox On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Lst_Offset3(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstTransTypeOthOff3")); //Unique Id Of Offset #3 On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Lst_PostTaxDed1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Post Tax Deduction #1 Transaction Type ListBox On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Lst_PostTaxDed1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstTransTypePostTax01")); //Unique Id Of Post Tax Deduction #1 On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Lst_PostTaxDed2
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Post Tax Deduction #2 Transaction Type ListBox On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Lst_PostTaxDed2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstTransTypePostTax02")); //Unique Id Of Post Tax Deduction #2 Transaction Type ListBox On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Btn_SaveOffsets
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image Button On Offset Tab On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Btn_SaveOffsets(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='Save Offsets']")); //Unique Id Of Save Image Button On Offsets Tab On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Chk_StateRow
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Row CheckBox On State Tax Table On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-11-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Chk_StateRow(WebDriver driver,String State)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+State+"')]//ancestor::tr[1]/td[1]/input"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id Of Row CheckBox On State Tax Table On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Btn_StateTaxEntityPayee
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tax/Entity Payee Lookup Button On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Btn_StateTaxEntityPayee(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtStateTaxbtn")); //Unique Id Of Tax/Entity Payee Lookup Button On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Btn_SearchTaxEntityPayee
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payee Search Button On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Btn_SearchTaxEntityPayee(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnSubmit1")); //Unique Id Of Payee Search Button On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Btn_FederalTaxEntityPayee
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tax/Entity Payee Lookup Button On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-11-26-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Btn_FederalTaxEntityPayee(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtFederalTaxbtn")); //Unique Id Of Tax/Entity Payee Lookup Button On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Btn_SocialSecurityTaxEntityPayee
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tax/Entity Payee Lookup Button On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-11-26-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Btn_SocialSecurityTaxEntityPayee(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtSSNTaxbtn")); //Unique Id Of Tax/Entity Payee Lookup Button On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TaxOffsetMapping_Btn_MedicareTaxEntityPayee
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tax/Entity Payee Lookup Button On RMA Application Tax and Offset Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-11-26-2018                                      
	// ============================================================================================
	public static WebElement RMAApp_TaxOffsetMapping_Btn_MedicareTaxEntityPayee(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Button1")); //Unique Id Of Tax/Entity Payee Lookup Button On RMA Application Tax and Offset Mapping Page Is Fetched
		return Element;
	}
}
