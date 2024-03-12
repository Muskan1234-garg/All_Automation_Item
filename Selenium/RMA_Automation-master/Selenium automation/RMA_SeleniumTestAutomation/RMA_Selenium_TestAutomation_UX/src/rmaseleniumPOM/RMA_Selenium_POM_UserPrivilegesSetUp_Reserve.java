package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_UserPrivilegesSetUp_Reserve {
public static WebElement Element = null;

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Txt_MaxAmount
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which MaxAmount TextBox On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Txt_MaxAmount(WebDriver driver)
{
	Element = driver.findElement(By.id("ReserveMax")); //Unique Id  Of MaxAmount TextBox On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Lst_ReserveType
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Type List On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Lst_ReserveType(WebDriver driver)
{
	Element = driver.findElement(By.id("ReserveLimits_ReserveType")); //Unique Id  Of Reserve Type List On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Chk_EnableReserveLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable ReserveLimits CheckBox On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Chk_EnableReserveLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("ReserveLimits_EnableLimits")); //Unique Id  Of Enable ReserveLimits CheckBox On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Lst_LOB
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Line Of Business List On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Lst_LOB(WebDriver driver)
{
	Element = driver.findElement(By.id("lstLOB")); //Unique Id  Of Line Of Business List On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Lst_UserGroup
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UserGroup List On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Lst_UserGroup(WebDriver driver)
{
	Element = driver.findElement(By.id("lbUserList")); //Unique Id  Of UserGroup List On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Lst_UserGroup
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Button On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Btn_Add(WebDriver driver)
{
	Element = driver.findElement(By.id("Add_ReserveLimits")); //Unique Id  Of Add Button On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrev_Lst_UserGroup
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Remove Button On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Btn_Remove(WebDriver driver)
{
	Element = driver.findElement(By.id("Remove_ReserveLimits")); //Unique Id  Of Remove Button On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_Tbl_ReserveLimitsGrid
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Limits Grid On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_Tbl_ReserveLimitsGrid(WebDriver driver)
{
	Element = driver.findElement(By.id("ReserveLimitsGrid_gvData_ctl00")); //Unique Id  Of Reserve Limits Grid On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_Rdb_ReserveLimitsGrid
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Radio Button On Reserve Limits Grid Table On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_Rdb_ReserveLimitsGrid(WebDriver driver)
{
	Element = driver.findElement(By.id("MyRadioButton")); //Unique Id  Of Radio Button On Reserve Limits Grid Table On  RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

}
