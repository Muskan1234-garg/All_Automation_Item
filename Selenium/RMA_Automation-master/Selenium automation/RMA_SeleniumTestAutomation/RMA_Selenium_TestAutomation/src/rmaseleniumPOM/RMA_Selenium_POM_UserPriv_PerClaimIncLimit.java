package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_UserPriv_PerClaimIncLimit {
public static WebElement Element = null;

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Txt_MaxAmount
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which MaxAmount TextBox On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Txt_MaxAmount(WebDriver driver)
{
	Element = driver.findElement(By.id("ClaimsTotalIncurredLimitsMaxAmount")); //Unique Id  Of MaxAmount TextBox On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Tab_PerClaimIncLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per Claim Incurred Limits Tab Control On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Tab_PerClaimIncLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSClaimsTotalIncurredLimits")); //Unique Id  Of Per Claim Incurred Limits Tab Control On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Btn_Add
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Button On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Btn_Add(WebDriver driver)
{
	Element = driver.findElement(By.id("Add_ClaimsTotalIncurredLimits")); //Unique Id  Of Add Button On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Btn_Remove
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Remove Button On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Btn_Remove(WebDriver driver)
{
	Element = driver.findElement(By.id("Add_ClaimsTotalIncurredLimits")); //Unique Id  Of Remove Button On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Chk_EnbPerClaimIncurredLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Per Claim Incurred Limits CheckBox On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Chk_EnbPerClaimIncurredLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("ClaimsTotalIncurredLimits_EnableLimits")); //Unique Id Of Enable Per Claim Incurred Limits CheckBox On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Chk_RestrictUnspecifiedUsers
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Per Claim Incurred Limits CheckBox On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Chk_RestrictUnspecifiedUsers(WebDriver driver)
{
	Element = driver.findElement(By.id("ClaimsTotalIncurredLimits_EnableLimits")); //Unique Id Of Restrict Unspecified Users CheckBox On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Lst_UsersGroups
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Users/Groups ListBox On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Lst_UsersGroups(WebDriver driver)
{
	Element = driver.findElement(By.id("lbUserList")); //Unique Id Of Users/Groups ListBox On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Tbl_UsersGroups
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Users/Groups Table On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Tbl_UsersGroups(WebDriver driver)
{
	Element = driver.findElement(By.id("ClaimsTotalIncurredLimitsGrid_gvData_ctl00")); //Unique Id Of Users/Groups Table On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Rdb_Users
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Users Radio Button On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Rdb_Users(WebDriver driver)
{
	Element = driver.findElement(By.id("rdUser")); //Unique Id Of Users Radio Button On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Rdb_Groups
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Groups Radio Button On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Rdb_Groups(WebDriver driver)
{
	Element = driver.findElement(By.id("rdGroup")); //Unique Id Of Groups Radio Button On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_Rdb_ReserveLimitsGrid
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Radio Button On PerClaimIncurredLimits Grid Table On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Rdb_ReserveLimitsGrid(WebDriver driver)
{
	Element = driver.findElement(By.id("MyRadioButton")); //Unique Id Of Radio Button OnPerClaimIncurredLimits Grid Table On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}
}
