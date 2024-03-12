package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_PolicyTracking {
public static WebElement Element = null;
	
	
//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Txt_PolicyTrackingName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PolicyName On RMA Application Policy Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Txt_PolicyName(WebDriver driver)
{
	Element = driver.findElement(By.id("policyname")); //Unique Id Of Policy Name On RMA Application Policy Tracking Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Txt_PolicyTrackingStatus
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Status Text Box On RMA Application Policy Tracking Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Txt_PolicyStatus(WebDriver driver)
{
	Element = driver.findElement(By.id("policystatuscode_codelookup")); //Unique Id Of Policy Status Code On RMA Application Policy Tracking Page Is Fetched
	return Element;	
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Btn_PolicyTrackingStatus
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Status Button On RMA Application Policy Tracking Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Btn_PolicyStatus(WebDriver driver)
{
	Element = driver.findElement(By.id("policystatuscode_codelookupbtn")); //Unique Id Of Policy Status Code On RMA Application Policy Tracking Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			: RMAApp_Policy_Txt_Effectivedate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Effectivedate On RMA Application Policy Tracking Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_Policy_Txt_Effectivedate(WebDriver driver)
{
	Element = driver.findElement(By.id("effectivedate")); //Unique Id Of Effective Date On RMA Application Policy Tracking Page Is Fetched
	return Element;	
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Txt_Expirationdate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Expirationdate On RMA Application Policy Tracking Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Txt_Expirationdate(WebDriver driver)
{
	Element = driver.findElement(By.id("expirationdate")); //Unique Id Of Expirationdate On RMA Application Policy Tracking Page Is Fetched
	return Element;	
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Txt_Effectivedate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Effective date On RMA Application Policy Tracking Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Txt_Effectivedate(WebDriver driver)
{
	Element = driver.findElement(By.id("effectivedate")); //Unique Id Of Effective date On RMA Application Policy Tracking Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Txt_PolicyNumber
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PolicyNumber On RMA Application Policy Tracking Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Txt_PolicyNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("policynumber")); //Unique Id Of PolicyNumber On RMA Application Policy Tracking Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Chk_PrimaryPolicy
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Primary Policy On RMA Application Policy Tracking Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Chk_PrimaryPolicy(WebDriver driver)
{
	Element = driver.findElement(By.id("primarypolicyflg")); //Unique Id Of Primary Policy On RMA Application Policy Tracking Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Chk_ClaimsMadeCoverage
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claims-Made Coverage On RMA Application Policy Tracking Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Chk_ClaimsMadeCoverage(WebDriver driver)
{
	Element = driver.findElement(By.id("triggerclaimflag")); //Unique Id Of Claims-Made Coverage On RMA Application Policy Tracking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Btn_Insurer
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Insurer On RMA Application Policy Tracking Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Btn_Insurer(WebDriver driver)
{
	Element = driver.findElement(By.id("inslastnamebtn"));//Unique Id Of Insurer On RMA Application Policy Tracking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Btn_Insured
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Insured On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Btn_Insured(WebDriver driver)
{
	Element = driver.findElement(By.id("insuredlistbtn"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Img_PolicyCoverage
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Coverage Image On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Img_PolicyCoverage(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='btnCov' or @id='btnUnitCov']"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTrakCov_Btn_CovType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Coverage Type Lookup Button On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTrakCov_Btn_CovType(WebDriver driver)
{
	Element = driver.findElement(By.id("coveragetypecode_codelookupbtn"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTrakCov_Txt_CovType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Coverage Type Lookup TextBox On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTrakCov_Txt_CovType(WebDriver driver)
{
	Element = driver.findElement(By.id("coveragetypecode_codelookup"));
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyTrakCov_Btn_PolicyLimit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Limit TextBox On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTrakCov_Txt_PolicyLimit(WebDriver driver)
{
	Element = driver.findElement(By.id("policylimit"));
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyTrakCov_Image_New
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of New Image On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement  RMAApp_PolicyTrakCov_Img_New(WebDriver driver)
{
	Element = driver.findElement(By.id("new"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Img_PolicyMCO
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy MCO Image On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Img_PolicyMCO(WebDriver driver)
{
	Element = driver.findElement(By.id("btnMCO"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracMCO_Txt_PolicyMCO
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy MCO TextBox On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracMCO_Txt_PolicyMCO(WebDriver driver)
{
	Element = driver.findElement(By.id("mcoeid"));
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyTracMCO_Txt_BeginDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Begin Date TextBox On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracMCO_Txt_BeginDate(WebDriver driver)
{
	Element = driver.findElement(By.id("mcobegindate"));
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyTracMCO_Txt_EndDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which End Date TextBox On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracMCO_Txt_EndDate(WebDriver driver)
{
	Element = driver.findElement(By.id("mcoenddate"));
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Img_PolicyClone
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Clone Image On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-04-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Img_PolicyClone(WebDriver driver)
{
	Element = driver.findElement(By.id("btnClonePolicy"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Txt_PolicyPremium
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Premium TextBox On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-07-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Txt_PolicyPremium(WebDriver driver)
{
	Element = driver.findElement(By.id("premium"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Lst_UnitType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit Type List On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-05-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Lst_UnitType(WebDriver driver)
{
	Element = driver.findElement(By.id("unittype"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Btn_UnitName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit Name Button On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				:0.0 - RenuVerma-01-05-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Btn_UnitName(WebDriver driver)
{
	Element = driver.findElement(By.id("multiunitidbtn"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Lst_UnitName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit Name List On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				:0.0 - RenuVerma-01-05-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Lst_UnitName(WebDriver driver)
{
	Element = driver.findElement(By.id("multiunitid"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Txt_PolicyLOB
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy LOB TextBox On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				:0.0 - RenuVerma-01-05-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Txt_PolicyLOB(WebDriver driver)
{
	Element = driver.findElement(By.id("policytype_codelookup"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PolicyTracking_Txt_CurrencyType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Currency Type TextBox On RMA Application Policy Tracking Item Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				:0.0 - RenuVerma-01-05-2016                                    
//============================================================================================
public static WebElement RMAApp_PolicyTracking_Txt_CurrencyType(WebDriver driver)
{
	Element = driver.findElement(By.id("CurrencyCode_codelookup"));
	return Element;
}

}
