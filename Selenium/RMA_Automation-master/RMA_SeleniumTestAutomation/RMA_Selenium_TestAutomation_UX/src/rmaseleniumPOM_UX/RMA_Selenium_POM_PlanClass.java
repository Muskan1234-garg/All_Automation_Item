package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_PlanClass {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Tab_ClassNameDescription
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Class Name/Description Tab On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Tab_ClassNameDescription(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Class Name/Description')]/i")); //Unique X-path Of Class Name/Description Tab On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_ClassName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Class Name Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_ClassName(WebDriver driver)
	{
		Element = driver.findElement(By.id("classname")); //Unique Id  Of Class Name Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_ClassDescription
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Class Description Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_ClassDescription(WebDriver driver)
	{
		Element = driver.findElement(By.id("classdesc")); //Unique Id  Of Class Description Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Tab_EligibilityWaitingPeriod
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Eligibility/Waiting Period Tab On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Tab_EligibilityWaitingPeriod(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Eligibility/Waiting Period')]/i")); //Unique X-path Of Eligibility/Waiting Period Tab On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Tab_BenefitsLimitOffsets
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Eligibility/Waiting Period Tab On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Tab_BenefitsLimitOffsets(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Benefit Limits/Check Options/Offsets')]")); //Unique X-path Of Eligibility/Waiting Period Tab On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Btn_AlternateWaitingPeriods
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Alternate Waiting Periods Button On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Btn_AlternateWaitingPeriods(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='altwaitperiod'and @uib-tooltip='Alternate Waiting Periods']")); //Unique Id  Of Alternate Waiting Periods Button On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_EligibleForBenefitsQuantity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Eligible For Benefits Quantity Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_EligibleForBenefitsQuantity(WebDriver driver)
	{
		Element = driver.findElement(By.id("eligben")); //Unique Id  Of EligibleForBenefitsQuantity Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Lst_EligibleForBenefitsPeriod
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EligibleForBenefitsPeriod List Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Lst_EligibleForBenefitsPeriod(WebDriver driver)
	{
		Element = driver.findElement(By.id("eligdurtype")); //Unique Id  Of EligibleForBenefitsPeriod List Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Lst_EligibleForBenefitsFromDateHiredOn
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EligibleForBenefitsFromDateHiredOn List Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Lst_EligibleForBenefitsFromDateHiredOn(WebDriver driver)
	{
		Element = driver.findElement(By.id("eligstart")); //Unique Id  Of EligibleForBenefitsFromDateHiredOn List Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}	
	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_WaitingPeriodFromDisabilityQuantity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which WaitingPeriodFromDisabilityQuantity Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_WaitingPeriodFromDisabilityQuantity(WebDriver driver)
	{
		Element = driver.findElement(By.id("waitperiod")); //Unique Id  Of WaitingPeriodFromDisabilityQuantity Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Lst_WaitingPeriodFromDisabilityPeriod
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which WaitingPeriodFromDisabilityPeriod List Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Lst_WaitingPeriodFromDisabilityPeriod(WebDriver driver)
	{
		Element = driver.findElement(By.id("waitcal")); //Unique Id  Of WaitingPeriodFromDisabilityPeriod List Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Lst_WaitingPeriodFromDisabilityWaitDurationType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which WaitingPeriodFromDisabilityWaitDurationType List Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Lst_WaitingPeriodFromDisabilityWaitDurationType(WebDriver driver)
	{
		Element = driver.findElement(By.id("waitdurtype")); //Unique Id  Of WaitingPeriodFromDisabilityWaitDurationType List Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}		

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_MaximumDurationOfDisabilityQuantity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which MaximumDurationOfDisabilityQuantity Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_MaximumDurationOfDisabilityQuantity(WebDriver driver)
	{
		Element = driver.findElement(By.id("maxdur")); //Unique Id  Of MaximumDurationOfDisabilityQuantity Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Lst_MaximumDurationOfDisabilityPeriod
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which MaximumDurationOfDisabilityPeriod List Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Lst_MaximumDurationOfDisabilityPeriod(WebDriver driver)
	{
		Element = driver.findElement(By.id("maxdurdurtype")); //Unique Id  Of MaximumDurationOfDisabilityPeriod List Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Lst_MaximumDurationOfDisabilityFrom
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which MaximumDurationOfDisabilityFrom List Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Lst_MaximumDurationOfDisabilityFrom(WebDriver driver)
	{
		Element = driver.findElement(By.id("maxdurstart")); //Unique Id  Of MaximumDurationOfDisabilityFrom List Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}		

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_AgeEligiblityThroughAge
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Age Eligiblity Through Age Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_AgeEligiblityThroughAge(WebDriver driver)
	{
		Element = driver.findElement(By.id("throughAge")); //Unique Id  Of Age Eligiblity Through Age Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_AgeEligiblityOverAge
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Age Eligiblity Over Age Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_AgeEligiblityOverAge(WebDriver driver)
	{
		Element = driver.findElement(By.id("overAge")); //Unique Id  Of Age Eligiblity Over Age Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Lst_DetermineWorkWeekDaysType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Determine Work Week Days Type List Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Lst_DetermineWorkWeekDaysType(WebDriver driver)
	{
		Element = driver.findElement(By.id("workweek")); //Unique Id  Of Determine Work Week Days Type List Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}			

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Tab_BenefitCalculation
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefit Calculation Tab On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-12-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Tab_BenefitCalculation(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Benefit Calculation')]/i")); //Unique X-path Of Benefit Calculation Tab On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Rdb_FlatAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Flat Amount Radio Button On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-13-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Rdb_FlatAmount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("weeklyben2")); //Unique X-path Of Flat Amount Radio Button On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_FlatAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Amount Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-13-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_FlatAmount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='flatamt' and @type='text']")); //Unique X-path Of Amount Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_SupplementFlatAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supplement Flat Amount Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-13-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_SupplementFlatAmount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='suppFlatAmt' and @type='text']")); //Unique X-path Of Supplement Flat Amount Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Rdb_TableDriven
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Table Driven Radio Button On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-13-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Rdb_TableDriven(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("weeklyben3")); //Unique X-path Of Table Driven Radio Button On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Lst_BasedOn
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Based On List Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-16-2018                                 
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Lst_BasedOn(WebDriver driver)
	{
		Element = driver.findElement(By.id("tabledriven")); //Unique Id  Of Based On List Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}		

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_TaxablePortion
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Taxable Portion Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-16-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_TaxablePortion(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("taxableportion")); //Unique X-path Of Taxable Portion Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_CheckBox_FederalIncomeTax
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Federal Income Tax CheckBox On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-16-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_CheckBox_FederalIncomeTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkfederaltax")); //Unique Id Of Federal Income Tax CheckBox On RMA Application Plan Class Creation Page Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_CheckBox_FICA
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which FICA CheckBox On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-16-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_CheckBox_FICA(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkfica")); //Unique Id Of FICA CheckBox On RMA Application Plan Class Creation Page Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_CheckBox_DeduceOffsetsForFullPaymentPeriods
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which FICA CheckBox On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-25-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_CheckBox_DeduceOffsetsForFullPaymentPeriods(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("fullpayOnlyFlag")); //Unique Id Of FICA CheckBox On RMA Application Plan Class Creation Page Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_CheckBox_ProRateAllOffsetDeductions
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which FICA CheckBox On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-25-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_CheckBox_ProRateAllOffsetDeductions(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("prorateOffFlag")); //Unique Id Of FICA CheckBox On RMA Application Plan Class Creation Page Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_CheckBox_Medicare
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Medicare CheckBox On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-16-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_CheckBox_Medicare(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkmedicare")); //Unique Id Of Medicare CheckBox On RMA Application Plan Class Creation Page Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_CheckBox_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State CheckBox On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-16-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_CheckBox_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkstate")); //Unique Id Of State CheckBox On RMA Application Plan Class Creation Page Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_Pension
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Taxable Portion Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-23-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_Pension(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='pensionAmt' and @type='text']")); //Unique X-path Of Taxable Portion Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_SocialSec
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Taxable Portion Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-23-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_SocialSec(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='ssAmt' and @type='text']")); //Unique X-path Of Taxable Portion Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_OtherIncome
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Taxable Portion Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-23-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_OtherIncome(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='otherAmt' and @type='text']")); //Unique X-path Of Taxable Portion Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_Offset1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Taxable Portion Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-23-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_Offset1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='otherOffset1' and @type='text']")); //Unique X-path Of Taxable Portion Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_Offset2
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Taxable Portion Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-23-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_Offset2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='otherOffset2' and @type='text']")); //Unique X-path Of Taxable Portion Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_Offset3
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Taxable Portion Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-23-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_Offset3(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='otherOffset3' and @type='text']")); //Unique X-path Of Taxable Portion Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_PostTaxDed1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Taxable Portion Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-23-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_PostTaxDed1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='postTaxDed1' and @type='text']")); //Unique X-path Of Taxable Portion Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_PostTaxDed1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Taxable Portion Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-23-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_PostTaxDed2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='postTaxDed2' and @type='text']")); //Unique X-path Of Taxable Portion Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_WeeklyBenefitCap
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Taxable Portion Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-23-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_WeeklyBenefitCap(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='bencap' and @type='text']")); //Unique X-path Of Taxable Portion Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_CheckBox_UseVouchers
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Use Vouchers Instead Of Checks CheckBox On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-16-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_CheckBox_UseVouchers(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkvoucher")); //Unique Id Of Use Vouchers Instead Of Checks CheckBox On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_CheckBox_DedOffsetFullPay
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Deduct Offsets Only For Full Payment Periods CheckBox On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-16-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_CheckBox_DedOffsetFullPay(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("fullpayOnlyFlag")); //Unique Id Of Deduct Offsets Only For Full Payment Periods CheckBox On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_CheckBox_ProRateOffset
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Pro-Rate All Offset Deductions CheckBox On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-16-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_CheckBox_ProRateOffset(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("prorateOffFlag")); //Unique Id Of Pro-Rate All Offset Deductions CheckBox On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Img_TableDrivenBenefits
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Table Driven Benefits Button On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-09-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Img_TableDrivenBenefits(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Table Driven Benefits']")); //Unique Id Of Table Driven Benefits Button On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Btn_AddNewCrudGrid
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Add New Button On Table Driven Benefits/Alternate Waiting Period Window On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-09-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Btn_AddNewCrudGrid(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnCreate")); //Unique Id Of Add New Button On Table Driven Benefits/Alternate Waiting Period Window On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_WagesFrom
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Wages From Text Box On Add Table Driven Benefits Window On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-09-2018                              
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_WagesFrom(WebDriver driver)
	{

		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wages From' and @type='text']")); //Unique X-path Of Wages From Text Box On Add Table Driven Benefits Window On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_WagesTo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Wages To Text Box On Add Table Driven Benefits Window On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-09-2018                              
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_WagesTo(WebDriver driver)
	{

		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wages To' and @type='text']")); //Unique X-path Of Wages To Text Box On Add Table Driven Benefits Window On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_Benefits
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Benefits Text Box On Add Table Driven Benefits Window On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-09-2018                              
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_Benefits(WebDriver driver)
	{

		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Weekly Benefit' and @type='text']")); //Unique X-path Of Benefits Text Box On Add Table Driven Benefits Window On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_Supplement
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Supplement Text Box On Add Table Driven Benefits Window On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-09-2018                              
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_Supplement(WebDriver driver)
	{

		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Supplement' and @type='text']")); //Unique X-path Of Supplement Text Box On Add Table Driven Benefits Window On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_Quantity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Quantity Text Box On Alternate Waiting Periods Window On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-13-2018                              
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_Quantity(WebDriver driver)
	{

		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='disWaitPrd' and @type='number']")); //Unique X-path Of Quantity Text Box On Alternate Waiting Periods Window On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_PeriodCalendarWork
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Period-Calendar/Work Text Box On Alternate Waiting Periods Window On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-13-2018                              
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_PeriodCalendarWork(WebDriver driver)
	{

		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_Period-Calendar/Work' and @type='text']")); //Unique X-path Of Period-Calendar/Work Text Box On Alternate Waiting Periods Window On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_PeriodDurationType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Period-Duration Type Text Box On Alternate Waiting Periods Window On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-13-2018                              
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_PeriodDurationType(WebDriver driver)
	{

		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_Period-Duration Type' and @type='text']")); //Unique X-path Of Period-Duration Type Text Box On Alternate Waiting Periods Window On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_DisablityType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Disability Type Text Box On Alternate Waiting Periods Window On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-13-2018                              
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_DisablityType(WebDriver driver)
	{

		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_DisablityType' and @type='text']")); //Unique X-path Of Disability Type Text Box On Alternate Waiting Periods Window On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_PerAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Per. Amount Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-16-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_PerAmount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("peramt")); //Unique X-path Of Per. Amount Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_CheckBox_SepPayForSupplementBenefit
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Separate Payment For Supplement Benefit CheckBox On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-25-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_CheckBox_SepPayForSupplementBenefit(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkSuppSepPay")); //Unique Id Of Separate Payment For Supplement Benefit CheckBox On RMA Application Plan Class Creation Page Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Lst_SupBankAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplement / Buy Up Option Bank Account ListBox On RMA Application Plan Class Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-25-2018          	                   
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Lst_SupBankAccount(WebDriver driver)
	{
		Element = driver.findElement(By.id("bankAccount")); //Unique Id Of Supplement / Buy Up Option Bank Account ListBox On RMA Application Plan Class	 Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Lst_SupTransactionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplement / Buy Up Option Transaction Type ListBox On RMA Application Plan Class Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-25-2018          	                   
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Lst_SupTransactionType(WebDriver driver)
	{
		Element = driver.findElement(By.id("transactionType")); //Unique Id Of Supplement / Buy Up Option Transaction Type ListBox On RMA Application Plan Class Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_SupplementPercent
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supplement Percent Text Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-16-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Txt_SupplementPercent(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("suppPercent")); //Unique X-path Of Supplement Percent Text Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Rdb_PercentageofMonthlyWage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Percentage of Monthly Wage Radio Button On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-13-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Rdb_PercentageofMonthlyWage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("weeklyben1")); //Unique X-path Of Percentage of Monthly Wage Radio Button On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_SupReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplement / Buy Up Option Reserve Type TextBox On RMA Application Plan Class Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-25-2018          	                   
	//============================================================================================
	public static WebElement RMAApp_PlanClass_Txt_SupReserveType(WebDriver driver)
	{
		Element = driver.findElement(By.id("reserveType")); //Unique Id Of Supplement / Buy Up Option Reserve Type TextBox On RMA Application Plan Class Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Txt_TaxablePortion
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which PAYG Withholding Check Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-08-02-2019                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Chk_PAYGWithholding(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkPaygWithholding")); //Unique X-path Of PAYG Withholding Check Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Chk_SFSSWithholding
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SFSS Withholding Check Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-08-02-2019                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Chk_SFSSWithholding(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkSFSSWithholding")); //Unique X-path Of SFSS Withholding Check Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Chk_HELP_SSL_TSLWithholding
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which HELP/SSL/TSL Withholding Check Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-08-02-2019                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Chk_HELP_SSL_TSLWithholding(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkTSLWithholding")); //Unique X-path Of HELP/SSL/TSL Withholding Check Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Chk_SuperFund
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SuperFund Check Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-08-02-2019                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Chk_SuperFund(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkSuperFund")); //Unique X-path Of SuperFund Check Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Chk_SuperannuationGuaranteeContribution
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SFSS Withholding Check Box On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-08-02-2019                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Chk_SuperannuationGuaranteeContribution(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkSuperFund")); //Unique X-path Of SFSS Withholding Check Box On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Bank Account ListBox On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-08-02-2019                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Lst_BankAccount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("superannuationbankaccount")); //Unique X-path Of Bank Account ListBox On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PlanClass_Lst_TransactionType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Transaction Type ListBox On RMA Application Plan Class Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-08-02-2019                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PlanClass_Lst_TransactionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("superannuationtrtypeCode")); //Unique X-path Of Transaction Type ListBox On RMA Application Plan Class Creation Page Is Fetched
		return Element;
	}

}
