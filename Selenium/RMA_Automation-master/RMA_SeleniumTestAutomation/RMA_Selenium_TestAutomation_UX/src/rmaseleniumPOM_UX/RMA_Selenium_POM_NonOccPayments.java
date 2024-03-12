package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_NonOccPayments {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_DisabilityStartDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Disability Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_DisabilityStartDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("disfromdate")); //Unique Id Of Type Of Disability Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_BenefitsStartDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_BenefitsStartDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("benstartdatereadonly")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_MyPlan
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Plan Name TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_MyPlan(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("planname")); //Unique Id Of Type Of Plan Name TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_CalculatedMethods
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Calculated Methods TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_CalculatedMethods(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("calcmethod")); //Unique Id Of Type Of Calculated Methods TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_WeeklyWage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Weekly Wage TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_WeeklyWage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='wage' and @type='text']")); //Unique Id Of Type Of Weekly Wage TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_WeeklyBenefits
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Weekly Benefits TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_WeeklyBenefits(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='weeklybenefit' and @type='text']")); //Unique Id Of Type Of Weekly Benefits TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_WeeklySupplements
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Weekly Supplements TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_WeeklySupplements(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='supplement' and @type='text']")); //Unique Id Of Type Of Weekly Supplements TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Tab_ClaimInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Info Tab On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Tab_ClaimInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Claim Info')]")); //Unique Id Of Type Of Claim Info Tab On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Tab_BenefitsPeriod
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Period Tab On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Tab_BenefitsPeriod(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Benefit Period')]")); //Unique Id Of Type Of Benefits Period Tab On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Tab_PaymentCalculator
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Payments Calculator Tab On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Tab_PaymentCalculator(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Payments Calculator')]")); //Unique Id Of Type Of Payments Calculator Tab On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_BenefitsStart
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Starts TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_BenefitsStart(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='benstartdate' and @type='text']")); //Unique Id Of Type Of Benefits Starts TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_BenefitsThrough
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Through TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_BenefitsThrough(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='benthroughdate' and @type='text']")); //Unique Id Of Type Of Benefits Through TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_PaymentBeginnings
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Payment Beginnings TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_PaymentBeginnings(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='paymentsstartdate' and @type='text']")); //Unique Id Of Type Of Payment Beginnings TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_PaymentThrough
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Payment Through TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_PaymentThrough(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='paymentsthroughdate' and @type='text']")); //Unique Id Of Type Of Payment Through TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_LstP_Policy
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Policy List On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Lst_Policy(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cmbPolicy")); //Unique Id Of Type Of Policy List On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Lst_Unit
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Unit List On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Lst_Unit(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cmbUnit")); //Unique Id Of Type Of Unit List On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Lst_CoverageType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Coverage Type List On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Lst_CoverageType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cmbCoverageType")); //Unique Id Of Type Of Coverage Type List On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Lst_DisabilityCategory
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Disability Category Type List On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Lst_DisabilityCategory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cmbdisablitycat")); //Unique Id Of Type Of Disability Category Type List On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Lst_DisabilityLossType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Disability Loss Type Type List On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Lst_DisabilityLossType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("disabilitytype")); //Unique Id Of Type Of Disability Loss Type Type List On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Lst_ReserveType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Reserve Type List On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Lst_ReserveType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cmbReserveTypeFt")); //Unique Id Of Type Of Reserve Type List On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Lst_TransactionType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Transaction Type List On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Lst_TransactionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cmbTransactionType")); //Unique Id Of Type Of Transaction Type List On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Bank Account Type List On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Lst_BankAccount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("bankaccount")); //Unique Id Of Type Of Bank Account Type List On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Distribution Type TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_DistributionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_distributiontype")); //Unique Id Of Type Of Distribution Type TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Btn_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Distribution Type Button On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Btn_DistributionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_distributiontype")); //Unique Id Of Type Of Distribution Type Button On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Chk_DeductFederalTax
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Deduct Federal Tax CheckBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Chk_DeductFederalTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkfederaltax")); //Unique Id Of Type Of Deduct Federal Tax CheckBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Chk_DeductSocSecTax
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Deduct SocSec Tax CheckBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Chk_DeductSocSecTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chksstax")); //Unique Id Of Type Of Deduct SocSec Tax CheckBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Chk_DeductMedicareTax
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Deduct Medicare Tax CheckBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Chk_DeductMedicareTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkmedtax")); //Unique Id Of Type Of Deduct Medicare Tax CheckBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Chk_DeductStateTax
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Deduct State Tax CheckBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Chk_DeductStateTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkstatetax")); //Unique Id Of Type Of Deduct State Tax CheckBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_DeductFederalTax
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Deduct Federal Tax TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_DeductFederalTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='federalTax' and @type='text']")); //Unique Id Of Type Of Deduct Federal Tax TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_DeductSocSecTax
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Deduct SocSec Tax TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_DeductSocSecTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='socialSecurityAmount' and @type='text']")); //Unique Id Of Type Of Deduct SocSec Tax TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_DeductMedicareTax
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Deduct Medicare Tax TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_DeductMedicareTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='medicareAmount' and @type='text']")); //Unique Id Of Type Of Deduct Medicare Tax TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_DeductStateTax
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Deduct State Tax TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_DeductStateTax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='stateAmount' and @type='text']")); //Unique Id Of Type Of Deduct State Tax TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_PensionOffset
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Pension Offset TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_PensionOffset(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='pensionoffset' and @type='text']")); //Unique Id Of Type Of Pension Offset TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_SocialSecOffset
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Social Security Offset TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_SocialSecOffset(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='socialsecurityoffset' and @type='text']")); //Unique Id Of Type Of Social Security Offset TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_OtherIncomeOffset
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Other Income Offset TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_OtherIncomeOffset(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='otherincomeoffset' and @type='text']")); //Unique Id Of Type Of Other Income Offset TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_GrossCalculationPayment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Gross Calculation Payments TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_GrossCalculationPayment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='grosscalculatedpayment' and @type='text']")); //Unique Id Of Type Of Gross Calculation Payments TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_GrossCalculationSupplement
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Gross Calculation Supplement TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_GrossCalculationSupplement(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='grosscalculatedsupplement' and @type='text']")); //Unique Id Of Type Of Gross Calculation Supplement TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_OtherOffset1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Other Offset 1 TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_OtherOffset1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='otherOffset1' and @type='text']")); //Unique Id Of Type Of Other Offset 1 TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_OtherOffset2
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Other Offset 2 TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_OtherOffset2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='otherOffset2' and @type='text']")); //Unique Id Of Type Of Other Offset 2 TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_GrossTotalNetOffset
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Gross Total Net Offset TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_GrossTotalNetOffset(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='grosstotalnetoffsets' and @type='text']")); //Unique Id Of Type Of Gross Total Net Offset TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_OtherOffset3
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Other Offset 3 TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_OtherOffset3(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='otherOffset3' and @type='text']")); //Unique Id Of Type Of Other Offset 3 TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_NetPayments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Net Payments TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_NetPayments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='netpayment' and @type='text']")); //Unique Id Of Type Of Net Payments TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_PastTaxDeduction1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Past Tax Deductions 1 TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_PastTaxDeduction1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='postTaxDed1' and @type='text']")); //Unique Id Of Type Of Past Tax Deductions 1 TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_PastTaxDeduction2
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Past Tax Deductions2 TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_PastTaxDeduction2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='postTaxDed2' and @type='text']")); //Unique Id Of Type Of Past Tax Deductions 2 TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Chk_AdjustPrintDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Adjust Print Date Using Schedule Dates TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Chk_AdjustPrintDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("adjustprintdatesflag")); //Unique Id Of Type Of Adjust Print Date Using Schedule Dates TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Img_Collections
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Collections Image Button On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Img_Collections(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Collection")); //Unique Id Of Type Of Collections Image Button On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Img_PrintedTransactions
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Printed Payments Image Button On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Img_PrintedTransactions(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Printed Transactions")); //Unique Id Of Type Of Printed Payments Image Button On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Img_FuturePayments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Future Payments Image Button On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Img_FuturePayments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Future Payments")); //Unique Id Of Type Of Future Payments Image Button On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Img_CalculatePayments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Calculate Payments Image Button On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Img_CalculatePayments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Calculate Payments")); //Unique Id Of Type Of Calculate Payments Image Button On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_NumberOfPayments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_NumberOfPayments(WebDriver driver, String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[1]")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_FromDate(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[2]")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_ToDate(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[3]")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_DaysPaid
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_DaysPaid(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[8]")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_PrintDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_PrintDate(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[4]")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_NetPayment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_NetPayment(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[7]")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Btn_Save(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Button1']/i")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_GrossPayments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_GrossPayments(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[5]")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsFuturePayment_Img_ProcessManualPayment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-19-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsFuturePayment_Img_ProcessManualPayment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Process Manual Payment']")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsManualProcess_Img_Process
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-19-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsManualProcess_Img_Process(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Process']")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsManualProcess_Txt_CheckNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-19-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsManualProcess_Txt_CheckNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtCheckNumber")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_PlanName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Plan Name TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_PlanName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("planname")); //Unique Id Of Type Of Plan Name TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_PastTaxDeduction1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Past Tax Deductions 1 TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_PostTaxDeduction1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='postTaxDed1' and @type='text']")); //Unique Id Of Type Of Past Tax Deductions 1 TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_PastTaxDeduction2
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Past Tax Deductions2 TextBox On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_PostTaxDeduction2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='postTaxDed2' and @type='text']")); //Unique Id Of Type Of Past Tax Deductions 2 TextBox On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPayments_Txt_ClassesReferredInPayments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Benefits Start Date On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPayments_Txt_ClassesReferredInPayments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='input-xlarge ng-pristine ng-untouched ng-valid ng-empty ng-valid-required']/div/button")); //Unique Id Of Type Of Benefits Start Date On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_GrossSupPayment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Gross Supp Payment Column Value Corresponding To A Given RowNumber On Calculated Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-25-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_GrossSupPayment(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[6]")); //Unique Id Of Type Of Gross Supp Payment Column Value Corresponding To A Given RowNumber On Calculated Payment Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_FederalTax
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Federal Tax Column Value Corresponding To A Given RowNumber On Calculated Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-27-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_FederalTax(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[9]")); //Unique Id Of Type Of Federal Tax Column Value Corresponding To A Given RowNumber On Calculated Payment Page Is Fetched
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_SocSecTax
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Social Security Tax Column Value Corresponding To A Given RowNumber On Calculated Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-27-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_SocSecTax(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[10]")); //Unique Id Of Type Of Social Security Tax Column Value Corresponding To A Given RowNumber On Calculated Payment Page Is Fetched
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_MedicareTax
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Medicare Tax Column Value Corresponding To A Given RowNumber On Calculated Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-27-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_MedicareTax(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[11]")); //Unique Id Of Type Of Medicare Tax Column Value Corresponding To A Given RowNumber On Calculated Payment Page Is Fetched
		return Element;
	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentFuturePayment_Tbl
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table On RMA Application Non Occ Future Payment UX Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-01-2018                                 
	// ================================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentFuturePayment_Tbl(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover nonOCCclass']")); //Unique Id Of Table On RMA Application Non Occ Future Payment UX Window Is Fetched
		return Element;
	}
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsFuturePayment_Img_EditPayment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Edit Payment Button Image On NonOcc Future Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-25-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsFuturePayment_Img_EditPayment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Edit Payment']")); //Unique Id Of Edit Payment Button Image On NonOcc Future Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsEditFuturePayment_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Button Image On Non Occ Edit Future Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-26-2018                                  
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsEditFuturePayment_Img_Save(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Button1' and @uib-tooltip='Save']")); //Unique Id Of Save Button Image On Non Occ Edit Future Payment Page Is Fetched
		return Element;
	}


	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsEditFuturePayment_Img_Recalculate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Recalculate Button Image On Non Occ Edit Future Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-26-2018                                  
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsEditFuturePayment_Img_Recalculate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='A1' and @uib-tooltip='Recalculate']")); //Unique Id Of Recalculate Button Image On Non Occ Edit Future Payment Page Is Fetched
		return Element;
	}


	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsEditFuturePayment_Img_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Cancel Button Image On Non Occ Edit Future Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-26-2018                                  
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsEditFuturePayment_Img_Cancel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Button2' and @uib-tooltip='Cancel']")); //Unique Id Of Cancel Button Image On Non Occ Edit Future Payment Page Is Fetched
		return Element;
	}


	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsEditFuturePayment_Txt_Beginning
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Beginning Date On Non Occ Edit Future Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-26-2018                                  
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsEditFuturePayment_Txt_Beginning(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Text3' and @type='text']")); //Unique Id Of Beginning Date On Non Occ Edit Future Payment Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsEditFuturePayment_Txt_Through
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Through Date On Non Occ Edit Future Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-26-2018                                  
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsEditFuturePayment_Txt_Through(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Text4' and @type='text']")); //Unique Id Of Through Date On Non Occ Edit Future Payment Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsEditFuturePayment_Txt_GrossPayment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Gross Calculated Payment On Non Occ Edit Future Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-26-2018                                  
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsEditFuturePayment_Txt_GrossPayment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Text2' and @type='text']")); //Unique Id Of Gross Calculated Payment On Non Occ Edit Future Payment Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsEditFuturePayment_Txt_PrintDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Date On Non Occ Edit Future Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-26-2018                                  
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsEditFuturePayment_Txt_PrintDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Text1' and @type='text']")); //Unique Id Of Print Date On Non Occ Edit Future Payment Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_PAYGWithhold
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which PAYG Withhold On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-09-01-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_PAYGWithhold(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[9]")); //Unique Id Of Type Of PAYG Withhold On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_SFSSWithhold
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SFSS Withhold On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-09-01-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_SFSSWithhold(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[10]")); //Unique Id Of Type Of SFSS Withhold On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_TSLWithhold
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which TSL Withhold On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-09-01-2019                                
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_TSLWithhold(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[11]")); //Unique Id Of Type Of TSL Withhold On NonOcc Payments Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_NonOccPaymentsCalPayment_Txt_Superannuation
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which TSL Withhold On NonOcc Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-09-01-2019                                
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_NonOccPaymentsCalPayment_Txt_Superannuation(WebDriver driver,String RowNumber)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='table table-hover filterPadd']/tbody/tr["+RowNumber+"]/td[12]")); //Unique Id Of Type Of TSL Withhold On NonOcc Payments Page Is Fetched
		return Element;
	}
}
