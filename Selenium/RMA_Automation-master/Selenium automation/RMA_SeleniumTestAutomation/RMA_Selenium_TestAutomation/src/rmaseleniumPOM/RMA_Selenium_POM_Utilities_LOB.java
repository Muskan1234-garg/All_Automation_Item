package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Utilities_LOB {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_LOB_Tab_ClaimOptions
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Options Tab On RMA Application Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
// ============================================================================================
public static WebElement RMAApp_LOB_Tab_ClaimOptions(WebDriver driver)
{
	Element = driver.findElement(By.linkText("Claim Options")); //Unique Id  Of Claim Options Tab On RMA Application Line Of Business Parameter Set Up Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LOB_Lst_LineOfBusiness
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LineOfBusiness Dropdown On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
// ============================================================================================
public static WebElement RMAApp_LOB_Lst_LineOfBusiness(WebDriver driver)
{
	Element = driver.findElement(By.id("lstLOB")); //Unique Id  Of  LineOfBusiness Dropdown On Line Of Business Parameter Set Up Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LOB_Chk_ClaimType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimType Check Box On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
// ============================================================================================
public static WebElement RMAApp_LOB_Chk_ClaimType(WebDriver driver)
{
	Element = driver.findElement(By.id("chkCType")); //Unique Id  Of  ClaimType Check Box On Line Of Business Parameter Set Up Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LOB_Btn_Save
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
// ============================================================================================
public static WebElement RMAApp_LOB_Btn_Save(WebDriver driver)
{
	Element = driver.findElement(By.id("Save")); //Unique Id  Of  Save Button On Line Of Business Parameter Set Up Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_LOB_Btn_ReserveTypeLookup
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType  Button On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
//============================================================================================
public static WebElement RMAApp_LOB_Btn_ReserveTypeLookup(WebDriver driver)
{
	Element = driver.findElement(By.id("lstReserveTypes_multicodebtn")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LOB_Chk_CheckForInsufficientReserveFnd
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check for Insufficient Reserve Funds CheckBox On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
//============================================================================================
public static WebElement RMAApp_LOB_Chk_CheckForInsufficientReserveFnd(WebDriver driver)
{
	Element = driver.findElement(By.id("chkInsuff")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LOB_Chk_UseReserveWorsheet
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Reserve WorkSheet CheckBox On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
//============================================================================================
public static WebElement RMAApp_LOB_Chk_UseReserveWorsheet(WebDriver driver)
{
	Element = driver.findElement(By.id("ChkUseRSW")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LOB_Chk_Year
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Year CheckBox On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
//============================================================================================
public static WebElement RMAApp_LOB_Chk_Year(WebDriver driver)
{
	Element = driver.findElement(By.id("chkYear")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LOB_Chk_LOBIndicator
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LOB Indicator CheckBox On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
//============================================================================================
public static WebElement RMAApp_LOB_Chk_LOBIndicator(WebDriver driver)
{
	Element = driver.findElement(By.id("chkLOB")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LOB_Chk_AllowCheckForDuplicateClaims
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Check For Possible Duplicate Claims CheckBox On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
//============================================================================================
public static WebElement RMAApp_LOB_Chk_AllowCheckForDuplicateClaims(WebDriver driver)
{
	Element = driver.findElement(By.id("chkDuplicate")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LOB_Chk_UseEnhancedNotes
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Enhanced Notes CheckBox On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
//============================================================================================
public static WebElement RMAApp_LOB_Chk_UseEnhancedNotes(WebDriver driver)
{
	Element = driver.findElement(By.id("chkEnhNotes")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LOB_Chk_UseClaimComments
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Claim Comments CheckBox On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
//============================================================================================
public static WebElement RMAApp_LOB_Chk_UseClaimComments(WebDriver driver)
{
	Element = driver.findElement(By.id("chkClmComments")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LOB_Chk_UseISOClaimSubmission
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use ISo Claim Submission CheckBox On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
//============================================================================================
public static WebElement RMAApp_LOB_Chk_UseISOClaimSubmission(WebDriver driver)
{
	Element = driver.findElement(By.id("chkISOClmSubmission")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_LOB_Rdb_ClaimYear
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Year Radio Button On Line Of Business Parameter Set Up Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
//============================================================================================
public static WebElement RMAApp_LOB_Rdb_ClaimYear(WebDriver driver)
{
	Element = driver.findElement(By.id("rdClmYear")); 
	return Element;
}
}
