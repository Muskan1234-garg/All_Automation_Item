package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_VehicleAccident {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_EvtNumber
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EventNumber TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
// ============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_EvtNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_eventnumber")); //Unique Id  Of  EventNumber TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_ClaimNum
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimNumber TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
// ============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_ClaimNum(WebDriver driver)
{
	Element = driver.findElement(By.id("claimnumber")); //Unique Id  Of  ClaimNumber TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_DateOfEvent
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DateOfEvent TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
// ============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_DateOfEvent(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_dateofevent")); //Unique Id Of DateOfEvent TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_TimeOfEvent
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TimeOfEvent TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
// ============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_TimeOfEvent(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_timeofevent")); //Unique Id  Of  TimeOfEvent TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_DateOfClaim
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DateOfClaim TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
// ============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_DateOfClaim(WebDriver driver)
{
	Element = driver.findElement(By.id("dateofclaim")); //Unique Id  Of DateOfClaim TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_TimeOfClaim
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TimeeOfClaim TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
// ============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_TimeOfClaim(WebDriver driver)
{
	Element = driver.findElement(By.id("timeofclaim")); //Unique Id  Of TimeOfClaim TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_ClaimType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimType TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
// ============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_ClaimType(WebDriver driver)
{
	Element = driver.findElement(By.id("claimtypecode_codelookup")); //Unique Id  Of ClaimType TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_Dept_Id
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DepartmentId TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
// ============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_Dept_Id(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_depteid")); //Unique Id  Of DepartmentId TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_DefaultView_Frm_VehicleAcc
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vehicle Accident Frame On RMA Application Default View Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
// ============================================================================================
public static WebElement RMAApp_DefaultView_Frm_VehicleAcc(WebDriver driver)
{
	Element = driver.findElement(By.id("Document-2-1claimvaVehicle AccidentVehicle Accident (New)FalseFalse")); //Unique Id Of Vehicle Accident Frame On RMA Application Default View Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_ClaimStatus
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimType TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
// ============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_ClaimStatus(WebDriver driver)
{
	Element = driver.findElement(By.id("claimstatuscode_codelookup")); //Unique Id  Of ClaimType TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}


//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Btn_ClaimStatusSrchBtn
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Status Search Button On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
//============================================================================================
public static WebElement RMAApp_VehicleAccident_Btn_ClaimStatusSrchBtn(WebDriver driver)
{
	Element = driver.findElement(By.id("claimstatuscode_codelookupbtn")); //Unique Id Of Claim Status Search Button On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Lnk_Open
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Open Claim Status Link On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
//============================================================================================
public static WebElement RMAApp_VehicleAccident_Lnk_Open(WebDriver driver)
{
	Element = driver.findElement(By.linkText("Open")); //Unique Id Of Open Claim Status Link On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_AccidentType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accident Type TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-13-2016                                 
//============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_AccidentType(WebDriver driver)
{
	Element = driver.findElement(By.id("accidenttypecode_codelookup")); //Unique Id Of  Accident Type TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_AccidentDesc
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accident Desc TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-13-2016                                 
//============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_AccidentDecs(WebDriver driver)
{
	Element = driver.findElement(By.id("accidentdesccode_codelookup")); //Unique Id Of Accident Desc TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_DateOfFederal
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date of Federal DOT Report TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-13-2016                                 
//============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_DateOfFederal(WebDriver driver)
{
	Element = driver.findElement(By.id("datefddotrpt")); //Unique Id Of Date of Federal DOT Report TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_DateOfState
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date of State Spill Report TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-13-2016                                 
//============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_DateOfState(WebDriver driver)
{
	Element = driver.findElement(By.id("datestdotrpt")); //Unique Id Of Date of State Spill Report TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_VehicleAccident_Txt_EventDateRptd
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Date Rptd TextBox On RMA Application Vehicle Accident Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-13-2016                                 
//============================================================================================
public static WebElement RMAApp_VehicleAccident_Txt_EventDateRptd(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_datereported")); //Unique Id Of Event Date Rptd TextBox On RMA Application Vehicle Accident Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehAccUnit_Txt_VehicleMake
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vehicle Make Text Box On Unit Page Of Created Vehicle Accident Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-03-13-2016                                 
//============================================================================================
public static WebElement RMAApp_VehAccUnit_Txt_VehicleMake(WebDriver driver)
{
	Element = driver.findElement(By.id("vehvehiclemake")); //Unique Id Of Vehicle Make Text Box On Unit Page Of Created Vehicle Accident Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehAccUnit_Txt_VehicleModel
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vehicle Model Text Box On Unit Page Of Created Vehicle Accident Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-03-13-2016                                 
//============================================================================================
public static WebElement RMAApp_VehAccUnit_Txt_VehicleModel(WebDriver driver)
{
	Element = driver.findElement(By.id("vehvehiclemodel")); //Unique Id Of Vehicle Model Text Box On Unit Page Of Created Vehicle Accident Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehAccSalvage_Txt_SalvageStatus
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Salvage Status Text Box On Unit-Salvage Page Of Created Vehicle Accident Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-03-13-2016                                 
//============================================================================================
public static WebElement RMAApp_VehAccSalvage_Txt_SalvageStatus(WebDriver driver)
{
	Element = driver.findElement(By.id("salvagestatus_codelookup")); //Unique Id Of Salvage Status Text Box On Unit-Salvage Page Of Created Vehicle Accident Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_VehAccSalvage_Txt_ControlNumber
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Control Number Text Box On Unit-Salvage Page Of Created Vehicle Accident Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-03-13-2016                                 
//============================================================================================
public static WebElement RMAApp_VehAccSalvage_Txt_ControlNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("controlnumber")); //Unique Id Of Control Number Text Box On Unit-Salvage Page Of Created Vehicle Accident Is Fetched
	return Element;
}
}

