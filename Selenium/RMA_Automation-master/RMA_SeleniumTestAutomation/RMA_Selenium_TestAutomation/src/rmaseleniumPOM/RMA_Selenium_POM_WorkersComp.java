package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_WorkersComp {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Txt_ClaimType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Type TextBox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-04-29-2015                                 
// ============================================================================================
public static WebElement RMAApp_WorkersComp_Txt_ClaimType(WebDriver driver)
{
	Element = driver.findElement(By.id("claimtypecode_codelookup")); //Unique Id Of Claim Type TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Txt_DepartmentID
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Department ID TextBox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-04-29-2015                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Txt_DepartmentID(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_depteid")); //Unique Id Of Department ID TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Txt_EmployeeNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Number TextBox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-04-29-2015                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Txt_EmployeeNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("empemployeenumber")); //Unique Id Of Employee Number TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Txt_EventNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Event Number TextBox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-04-29-2015                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Txt_EventNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_eventnumber")); //Unique Id Of Event Number TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Txt_ClaimNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Number TextBox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-04-29-2015                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Txt_ClaimNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("claimnumber")); //Unique Id Of Claim Number TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Txt_DateOfEvent
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which DateOfEvent TextBox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-04-29-2015                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Txt_DateOfEvent(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_dateofevent")); //Unique Id Of DateOfEvent TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Txt_TimeOfEvent
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which TimeOfEvent TextBox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-04-29-2015                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Txt_TimeOfEvent(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_timeofevent")); //Unique Id Of TimeOfEvent TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Txt_TimeOfClaim
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which TimeOfClaim TextBox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-04-29-2015                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Txt_TimeOfClaim(WebDriver driver)
{
	Element = driver.findElement(By.id("timeofclaim")); //Unique Id Of TimeOfClaim TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Txt_DateOfClaim
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which DateOfClaim TextBox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-04-29-2015                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Txt_DateOfClaim(WebDriver driver)
{
	Element = driver.findElement(By.id("dateofclaim")); //Unique Id Of DateOfClaim TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Txt_Jurisdiction
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Jurisdiction TextBox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-02-2016                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Txt_Jurisdiction(WebDriver driver)
{
	Element = driver.findElement(By.id("filingstateid_codelookup")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Frm_WorkersCompensationFrame
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Worker's Compensation Frame On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-02-2016                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Frm_WorkersCompensationFrame(WebDriver driver)
{
	Element = driver.findElement(By.id("Document-3-2claimwcWorkers’ Comp.Workers’ Comp. (New)FalseFalse")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Btn_ClaimStatus
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ClaimStatus Button On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-02-2016                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Btn_ClaimStatus(WebDriver driver)
{
	Element = driver.findElement(By.id("claimstatuscode_codelookupbtn")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Img_RecordSummary
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Record Summary Image On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-07-21-2016                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Img_RecordSummary(WebDriver driver)
{
	Element = driver.findElement(By.id("recordsummary")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Tbl_RecordSummaryTable
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Record Summary Table On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-07-21-2016                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Tbl_RecordSummaryTable(WebDriver driver)
{
	Element = driver.findElement(By.xpath("//form/table/tbody/tr[2]/td/table/tbody")); 
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Btn_ClaimStatus
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Policy LOB code Lookup On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-08-11-2016                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_codelookup_policyLOBCode(WebDriver driver)
{
	Element = driver.findElement(By.id("policyLOBCode_codelookup")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Img_EmployeeRestrictions
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Restrictions Image On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-26-2017                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Img_EmployeeRestrictions(WebDriver driver)
{
	Element = driver.findElement(By.id("employeerestrictions_1")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WCEmpRestriction_Img_EmpResDelete
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Restrictions Delete Image On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-27-2017                                 
//============================================================================================
public static WebElement RMAApp_WCEmp_Img_Delete(WebDriver driver)
{
	Element = driver.findElement(By.id("imgBtnDelete")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WCEmpRestriction_Txt_FirstDayRestricted
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which First Day Restricted Textbox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-26-2017                                 
//============================================================================================
public static WebElement RMAApp_WCEmpRestriction_Txt_FirstDayRestricted(WebDriver driver)
{
	Element = driver.findElement(By.id("datefirstrestrct")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WCEmpRestriction_Tbl_EmpRestricted
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Restricted Table On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-26-2017                                 
//============================================================================================
public static WebElement RMAApp_WC_Tbl_Restricted_LossWork(WebDriver driver)
{
	Element = driver.findElement(By.id("tbllist")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WCEmpRestriction_Img_EmpResAddNew
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Restricted Add New Image On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-26-2017                                 
//============================================================================================
public static WebElement RMAApp_WorkerComp_Img_AddNew(WebDriver driver)
{
	Element = driver.findElement(By.id("imgBtnAddNew")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Img_EmployeeClaimHistory
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Claimant History Image On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-26-2017                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Img_EmployeeClaimHistory(WebDriver driver)
{
	Element = driver.findElement(By.id("employeeclaimhistory")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Tbl_EmployeeClaimHistory
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Claimant History Table On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-27-2017                                 
//============================================================================================
public static WebElement RMAApp_WCEmpClaimHis_Tbl_EmployeeClaimHistory(WebDriver driver)
{
	Element = driver.findElement(By.xpath("//table")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WCEmpClaimHis_Btn_Print
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Claimant History Print Button On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-27-2017                                 
//============================================================================================
public static WebElement RMAApp_WCEmpClaimHis_Btn_Print(WebDriver driver)
{
	Element = driver.findElement(By.id("btnPrint")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WCEmpClaimHis_Btn_Cancel
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Claimant History Cancel Button On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-27-2017                                 
//============================================================================================
public static WebElement RMAApp_WCEmpClaimHis_Btn_Cancel(WebDriver driver)
{
	Element = driver.findElement(By.id("btnCancel")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WorkersComp_Img_WorkLoss
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Work Loss Image On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-30-2017                                 
//============================================================================================
public static WebElement RMAApp_WorkersComp_Img_WorkLoss(WebDriver driver)
{
	Element = driver.findElement(By.id("employeeworkloss_1")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WCWorkLoss_Txt_LastWorkDay
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Work Day Textbox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-30-2017                                 
//============================================================================================
public static WebElement RMAApp_WCWorkLoss_Txt_LastWorkDay(WebDriver driver)
{
	Element = driver.findElement(By.id("datelastworked")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WCWorkLoss_Txt_RetuenToWork
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Return To work Textbox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-30-2017                                 
//============================================================================================
public static WebElement RMAApp_WCWorkLoss_Txt_RetuenToWork(WebDriver driver)
{
	Element = driver.findElement(By.id("datereturned")); 
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_WCWorkLoss_Img_CalcDuration
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Calculate Duration Image On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-30-2017                                 
//============================================================================================
public static WebElement RMAApp_WCWorkLoss_Img_CalcDuration(WebDriver driver)
{
	Element = driver.findElement(By.id("calcdurations")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_WCWorkLoss_txt_Duration
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Duration Textbox On RMA Application Workers Compensation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-30-2017                                 
//============================================================================================
public static WebElement RMAApp_WCWorkLoss_Txt_Duration(WebDriver driver)
{
	Element = driver.findElement(By.id("duration")); 
	return Element;
}

}

