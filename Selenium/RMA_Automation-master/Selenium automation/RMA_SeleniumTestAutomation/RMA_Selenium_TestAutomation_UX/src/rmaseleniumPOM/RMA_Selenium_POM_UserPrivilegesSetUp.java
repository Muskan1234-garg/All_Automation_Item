package rmaseleniumPOM;

//Note: Following objects are same across all tabs and have identification function already added: 1. LOB List Box - RMAApp_UserPrev_Lst_LOB(WebDriver driver) 2. User/Groups Name List - RMAApp_UserPrev_Lst_UserGroup(WebDriver driver)
//3. Users Radio Button - RMAApp_UserPrev_Rdb_Users 4. Groups Radio Button - RMAApp_UserPrev_Rdb_Groups 5. Radio Button That Appears In Front Of The Added User Or Group  - RMAApp_UserPrev_Rdb_ReserveLimitsGrid


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_UserPrivilegesSetUp {
public static WebElement Element = null;
//============================================================================================
//FunctionName 		: RMAApp_UserPrevReserve_Txt_MaxAmount
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which MaxAmount TextBox On RMA Application User Privileges SetUp Page's Reserve Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevReserve_Txt_MaxAmount(WebDriver driver)
{
	Element = driver.findElement(By.id("ReserveMax")); //Unique Id  Of MaxAmount TextBox On RMA Application User Privileges SetUp Page's Reserve Limits Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevReserve_Lst_ReserveType
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Type List On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevReserve_Lst_ReserveType(WebDriver driver)
{
	Element = driver.findElement(By.id("ReserveLimits_ReserveType")); //Unique Id  Of Reserve Type List On RMA Application User Privileges SetUp Page's Reserve Limits Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevReserve_Chk_EnableReserveLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable ReserveLimits CheckBox On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevReserve_Chk_EnableReserveLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("ReserveLimits_EnableLimits")); //Unique Id  Of Enable ReserveLimits CheckBox On RMA Application User Privileges SetUp Page's Reserve Limits Is Fetched
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
//FunctionName 		: WebElement RMAApp_UserPrev_Lst_Group
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Group List On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-17-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrev_Lst_Group(WebDriver driver)
{
	Element = driver.findElement(By.id("lbGroupList")); //Unique Id  Of Group List On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevReserve_Btn_Add
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Button On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevReserve_Btn_Add(WebDriver driver)
{
	Element = driver.findElement(By.id("Add_ReserveLimits")); //Unique Id  Of Add Button On RMA Application User Privileges SetUp Page's Reserve Limits Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevReserve_Btn_Remove
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Remove Button On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevReserve_Btn_Remove(WebDriver driver)
{
	Element = driver.findElement(By.id("Remove_ReserveLimits")); //Unique Id  Of Remove Button On RMA Application User Privileges SetUp Page's Reserve Limits Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Limits Grid On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-01-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(WebDriver driver)
{
	Element = driver.findElement(By.id("ReserveLimitsGrid_gvData_ctl00")); //Unique Id  Of Reserve Limits Grid On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClmIncLmts_Txt_MaxAmount
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which MaxAmount TextBox On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClmIncLmts_Txt_MaxAmount(WebDriver driver)
{
	Element = driver.findElement(By.id("ClaimsTotalIncurredLimitsMaxAmount")); //Unique Id  Of MaxAmount TextBox On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClmIncLmts_Tab_PerClaimIncLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per Claim Incurred Limits Tab Control On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClmIncLmts_Tab_PerClaimIncLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSClaimsTotalIncurredLimits")); //Unique Id  Of Per Claim Incurred Limits Tab Control On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClmIncLmts_Btn_Add
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Button On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClmIncLmts_Btn_Add(WebDriver driver)
{
	Element = driver.findElement(By.id("Add_ClaimsTotalIncurredLimits")); //Unique Id  Of Add Button On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClmIncLmts_Btn_Remove
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Remove Button On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClmIncLmts_Btn_Remove(WebDriver driver)
{
	Element = driver.findElement(By.id("Remove_ClaimsTotalIncurredLimits")); //Unique Id  Of Remove Button On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClaimIncurredLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Per Claim Incurred Limits CheckBox On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(WebDriver driver)
{
	Element = driver.findElement(By.id("ClaimsTotalIncurredLimits_EnableLimits")); //Unique Id Of Enable Per Claim Incurred Limits CheckBox On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClmIncLmts_Chk_RestrictUnspecifiedUsers
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Per Claim Incurred Limits CheckBox On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClmIncLmts_Chk_RestrictUnspecifiedUsers(WebDriver driver)
{
	Element = driver.findElement(By.id("ClaimsTotalIncurredLimitsUsers_EnableLimits")); //Unique Id Of Restrict Unspecified Users CheckBox On RMA Application User Privilege SetUpPage's Per Claim Incurred Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClmIncLmts_Tbl_UsersGroups
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Users/Groups Table On RMA Application User Privileges SetUp Page's Per Claim Incurred Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClmIncLmts_Tbl_UsersGroups(WebDriver driver)
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

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPymntLimit_Tab_PymntLimit
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Limits Tab Control On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-16-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPymntLimit_Tab_PymntLimit(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSPaymentLimits")); //Unique Id  Of Payment Limits Tab On RMA Application User Privilege SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Payment Limits CheckBox On RMA Application User Privileges SetUp Page's Payment Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-16-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(WebDriver driver)
{
	Element = driver.findElement(By.id("PaymentLimits_EnableLimits")); //Unique Id  Of Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which restrict Unspecified Users CheckBox On RMA Application User Privileges SetUp Page's Payment Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-16-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPymntLimit_Chk_RstUnspecifiedUsr(WebDriver driver)
{
	Element = driver.findElement(By.id("PaymentLimitsUsers_EnableLimits")); //Unique Id  Of Restrict Unspecified Users CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPymntLimit_Txt_MaxAmt
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Max Amount TextBox On RMA Application User Privileges SetUp Page's Payment Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-17-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPymntLimit_Txt_MaxAmt(WebDriver driver)
{
	Element = driver.findElement(By.id("PaymentMax")); //Unique Id  Of Max Amount TextBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPymntLimit_Btn_Add
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Button On RMA Application User Privileges SetUp Page's Payment Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-17-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPymntLimit_Btn_Add(WebDriver driver)
{
	Element = driver.findElement(By.id("Add_PaymentLimits")); //Unique Id  Of Add Button On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPymntLimit_Btn_Remove
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Remove Button On RMA Application User Privileges SetUp Page's Payment Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-17-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPymntLimit_Btn_Remove(WebDriver driver)
{
	Element = driver.findElement(By.id("Remove_PaymentLimits")); //Unique Id  Of Remove Button On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PaymentLimitsGrid Table On RMA Application User Privileges SetUp Page's Payment Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-12-18-2015                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(WebDriver driver)
{
	Element = driver.findElement(By.id("PaymentLimitsGrid_gvData_ctl00")); //Unique Id  Of PaymentLimitsGrid Table On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PaymentLimitsGrid Radio Button  On RMA Application User Privileges SetUp Page's Payment Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-01-11-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(WebDriver driver)
{
	Element = driver.findElement(By.cssSelector("#PaymentLimitsGrid_gvData_ctl00_0 > #MyRadioButton")); //Unique Id  Of PaymentLimitsGrid RadioButton  On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrivilegesSetup_Btn_AdditionalSettings
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Additional Button On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-2-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrivilegesSetup_Btn_AdditionalSettings(WebDriver driver)
{
	Element = driver.findElement(By.id("btnAdditional")); //Unique Id  Of Additional Button On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrLobTopLevelApprGCTab_Btn_UserNameButton
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UserName Button On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-2-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrLobTopLevelApprGCTab_Btn_UserNameButton(WebDriver driver)
{
	Element = driver.findElement(By.id("GCUserNamebtn")); //Unique Id  Of UserName Button On GC Tab On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrLobTopLevelApprGCTab_Txt_UserName
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UserName TextBox On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-2-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrLobTopLevelApprGCTab_Txt_UserName(WebDriver driver)
{
	Element = driver.findElement(By.id("GCUserName")); //Unique Id  Of UserName TextBox On GC Tab On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrLobTopLevelApprGCTab_Txt_PaymentMax
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PaymentMax TextBox On GC Tab On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-2-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrLobTopLevelApprGCTab_Txt_PaymentMax(WebDriver driver)
{
	Element = driver.findElement(By.id("GCPaymentMax")); //Unique Id  Of PaymentMax TextBox On GC Tab  On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrLobTopLevelApprTLTab_Btn_UserNameButton
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UserName Button On Top Level Tab On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-2-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrLobTopLevelApprTLTab_Btn_UserNameButton(WebDriver driver)
{
	Element = driver.findElement(By.id("TLUserNamebtn")); //Unique Id  Of UserName Button On Top Level Tab  On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrLobTopLevelApprTLTab_Btn_UserNameButton
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UserName TextBox On Top Level Tab On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-2-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrLobTopLevelApprTLTab_Txt_UserName(WebDriver driver)
{
	Element = driver.findElement(By.id("TLUserName")); //Unique Id  Of UserName TextBox On Top Level Tab  On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrLobTopLevelApprTLTab_Btn_UserNameButton
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image On LOB Top Level Approval On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-2-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrLobTopLevelAppr_Img_Save(WebDriver driver)
{
	Element = driver.findElement(By.id("Save")); //Unique Id  Of Save Image On LOB Top Level Approval On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevReserve_Chk_RestUnspcfdUsers
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Restrict Unspecified Users CheckBox On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-02-22-2016                                
//============================================================================================
public static WebElement RMAApp_UserPrevReserve_Chk_RestUnspcfdUsers(WebDriver driver)
{
	Element = driver.findElement(By.id("ReserveLimitsUsers_EnableLimits")); //Unique Id  Of Restrict Unspecified Users CheckBox On RMA Application User Privileges SetUp Page's Reserve Limits Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPayDetailLimit_Lnk_PayDetailLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  PayDetailLimits Link On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-24-2016                                
//============================================================================================
public static WebElement RMAApp_UserPrevPayDetailLimit_Lnk_PayDetailLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSPayDetailLimits"));

	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPayDetailLimit_Lst_ReserveType
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  ReserveType DropDown PaydetailLimit Tab On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-24-2016                                
//============================================================================================
public static WebElement RMAApp_UserPrevPayDetailLimit_Lst_ReserveType(WebDriver driver)
{
	Element = driver.findElement(By.id("PayDetailLimits_ReserveType"));
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPayDetailLimit_Txt_MaxAmount
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  MaxAmount TextBox On PaydetailLimit Tab On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-24-2016                                
//============================================================================================
public static WebElement RMAApp_UserPrevPayDetailLimit_Txt_MaxAmount(WebDriver driver)
{
	Element = driver.findElement(By.id("PayDetailMax"));
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPayDetailLimit_Btn_Add
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Add Button On PaydetailLimit Tab On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-24-2016                                
//============================================================================================
public static WebElement RMAApp_UserPrevPayDetailLimit_Btn_Add(WebDriver driver)
{
	Element = driver.findElement(By.id("Add_PayDetailLimits"));
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPayDetailLimit_Btn_Remove
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Remove Button On PaydetailLimit Tab On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-24-2016                                
//============================================================================================
public static WebElement RMAApp_UserPrevPayDetailLimit_Btn_Remove(WebDriver driver)
{
	Element = driver.findElement(By.id("Remove_PayDetailLimits"));
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PayDetail Limit Table On PaydetailLimit Tab On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-24-2016                                
//============================================================================================
public static WebElement RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(WebDriver driver)
{
	Element = driver.findElement(By.id("PayDetailLimitsGrid_gvData_ctl00"));
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EnablePaymentDetailLimit Checkbox On PaydetailLimit Tab On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-24-2016                                
//============================================================================================
public static WebElement RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("PayDetailLimits_EnableLimits"));
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPayDetailLimit_chk_RestrictUnspecifiedUsers
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which RestrictUnspecifiedUsers Checkbox On PaydetailLimit Tab On RMA Application User Privileges SetUp Page's Reserve Limits Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-02-24-2016                                
//============================================================================================
public static WebElement RMAApp_UserPrevPayDetailLimit_chk_RestrictUnspecifiedUsers(WebDriver driver)
{
	Element = driver.findElement(By.id("PayDetailLimitsUsers_EnableLimits"));
	return Element;
}


//============================================================================================
//FunctionName 		: RMAApp_UserPrevResLimit_Rdb_ReserveLimitsGridRadioButton
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveLimitsGrid Radio Button  On RMA Application User Privileges SetUp Page's Reserve Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-01-11-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevResLimit_Rdb_ReserveLimitsGridRadioButton(WebDriver driver)
{
	Element = driver.findElement(By.id("MyRadioButton")); //Unique Id  Of ReserveLimitsGrid RadioButton  On RMA Application User Privilege SetUp Page's Reserve Limits Tab Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPymntLimit_Rdb_PayDetailLimitsGridRadioButton
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PayDetailLimitsGrid Radio Button  On RMA Application User Privileges SetUp Page's Payment Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-03-03-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPayDetail_Rdb_PayDetailLimitsGridRadioButton(WebDriver driver)
{
	Element = driver.findElement(By.cssSelector("#PayDetailLimitsGrid_gvData_ctl00_0 > #MyRadioButton")); //Unique Id  Of PayDetailLimitsGrid RadioButton  On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPymntLimit_Rdb_PayDetailLimitsGridRadioButton
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PayDetailLimitsGrid Radio Button  On RMA Application User Privileges SetUp Page's Payment Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-03-03-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClmIncLmts_Rdb_PerClaimIncurredLimitsGridRadioButton(WebDriver driver)
{
	Element = driver.findElement(By.cssSelector("#ClaimsTotalIncurredLimitsGrid_gvData_ctl00_0 > #MyRadioButton")); //Unique Id  Of PayDetailLimitsGrid RadioButton  On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClaimPayLimit_Tab_PerClaimPayLimit
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PerClaimPayLimit Tab On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-05-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClaimPayLimit_Tab_PerClaimPayLimit(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSPerClaimPayLimits")); 
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClaimPayLimit_Lst_ReserveType
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType List On RMA Application User Privileges SetUp Page's PerClaimPayLimit Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-05-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClaimPayLimit_Lst_ReserveType(WebDriver driver)
{
	Element = driver.findElement(By.id("PerClaimPayLimits_ReserveType")); 
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClaimPayLimit_Txt_MaxAmount
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Max Amount TextBox On RMA Application User Privileges SetUp Page's PerClaimPayLimit Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-05-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClaimPayLimit_Txt_MaxAmount(WebDriver driver)
{
	Element = driver.findElement(By.id("PerClaimPayLimitsMaxAmount")); 
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClaimPayLimit_Txt_ClaimType
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimType TextBox On RMA Application User Privileges SetUp Page's PerClaimPayLimit Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-05-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClaimPayLimit_Txt_ClaimType(WebDriver driver)
{
	Element = driver.findElement(By.id("PerClaimPayLimits_ClaimType")); 
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClaimPayLimit_Btn_ClaimType
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimType TextBox On RMA Application User Privileges SetUp Page's PerClaimPayLimit Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-05-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClaimPayLimit_Btn_ClaimType(WebDriver driver)
{
	Element = driver.findElement(By.id("PerClaimPayLimits_ClaimTypebtn")); 
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClaimPayLimit_Btn_ClaimType
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EnablePerClaimPayLimits Check box On RMA Application User Privileges SetUp Page's PerClaimPayLimit Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-05-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClaimPayLimit_Chk_EnablePerClaimPayLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("PerClaimPayLimits_EnableLimits")); 
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClaimPayLimit_Chk_RestrictUnspecifiedUsers
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Restrict Unspecified Users Check box On RMA Application User Privileges SetUp Page's PerClaimPayLimit Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-05-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClaimPayLimit_Chk_RestrictUnspecifiedUsers(WebDriver driver)
{
	Element = driver.findElement(By.id("PerClaimPayLimitsUsers_EnableLimits")); 
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClaimPayLimit_Btn_Add
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Button On RMA Application User Privileges SetUp Page's PerClaimPayLimit Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-05-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClaimPayLimit_Btn_Add(WebDriver driver)
{
	Element = driver.findElement(By.id("Add_PerClaimPayLimits")); 
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClaimPayLimit_Btn_Remove
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Button On RMA Application User Privileges SetUp Page's PerClaimPayLimit Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-05-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClaimPayLimit_Btn_Remove(WebDriver driver)
{
	Element = driver.findElement(By.id("Remove_PerClaimPayLimits")); 
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClaimPayLimit_Tbl_PerClaimPayLimitGrid
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Button On RMA Application User Privileges SetUp Page's PerClaimPayLimit Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-05-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClaimPayLimit_Tbl_PerClaimPayLimitGrid(WebDriver driver)
{
	Element = driver.findElement(By.id("PerClaimPayLimitsGrid_gvData_ctl00")); 
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPerClaimPayLimit_Chk_PerClaimPayLimitGridCheckbox
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Grid Checkbox On RMA Application User Privileges SetUp Page's PerClaimPayLimit Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-05-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPerClaimPayLimit_Chk_PerClaimPayLimitGridCheckbox(WebDriver driver)
{
	Element = driver.findElement(By.cssSelector("#PerClaimPayLimitsGrid_gvData_ctl00_0 > #MyRadioButton")); 
	return Element;
}
//============================================================================================
//FunctionName 		: RMAApp_UserPrevPrintCheckLimits_Chk_EnablePrintCheckLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Print Check Limits CheckBox On RMA Application User Privileges SetUp Page's Print Check Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-18-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPrintCheckLimits_Chk_EnablePrintCheckLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("PrintCheckLimits_EnableLimits")); 
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPrintCheckLimits_Chk_RestrictUnspecifiedUsers
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Restrict Unspecified Users CheckBox On RMA Application User Privileges SetUp Page's Print Check Limits Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-04-18-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPrintCheckLimits_Chk_RestrictUnspecifiedUsers(WebDriver driver)
{
	Element = driver.findElement(By.id("PrintCheckLimitsUsers_EnableLimits")); 
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPer_Tab_ClaimLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Limits Tab Control On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-04-20-2016                               
//============================================================================================
public static WebElement RMAApp_UserPrevPer_Tab_ClaimLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSClaimLimits")); //Unique Id Of Claim Limits Tab Control On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevPer_Tab_EventTypeLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event TypeLimits Tab Control On RMA Application User Privileges SetUp Page Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - KumudNaithani-20-04-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevPer_Tab_EventTypeLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSEventTypeLimits")); //Unique Id Of Event Type Limits Tab Control On RMA Application User Privileges SetUp Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EnableEventTypeLimits Check box On RMA Application User Privileges SetUp Page's EventTypeLimit Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-20-04-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("EventTypeLimits_EnableLimits")); //Unique Id Of EnableEventTypeLimits Check box On RMA Application User Privileges SetUp Page's EventTypeLimit Tab Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 		: RMAApp_UserPrevEventTypeLimit_Chk_EnbClaimLimits
//Description  		: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EnableClaimLimits Check box On RMA Application User Privileges SetUp Page's EventTypeLimit Tab Can Be Identified
//Input Parameter 	: Driver Variable Of The Type WebDriver		 
//Revision			: 0.0 - ImteyazAhmad-20-04-2016                                 
//============================================================================================
public static WebElement RMAApp_UserPrevEventTypeLimit_Chk_EnbClaimLimits(WebDriver driver)
{
	Element = driver.findElement(By.id("ClaimLimits_EnableLimits")); //Unique Id Of EnableClaimLimits Check box On RMA Application User Privileges SetUp Page's EventTypeLimit Tab Is Fetched
	return Element;
}
}

