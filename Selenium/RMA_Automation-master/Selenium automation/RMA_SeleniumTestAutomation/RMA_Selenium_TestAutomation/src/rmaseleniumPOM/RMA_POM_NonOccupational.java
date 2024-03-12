package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_POM_NonOccupational {
	
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Txt_ClaimType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Type TextBox On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-12-2016                                 
// ============================================================================================
public static WebElement RMAApp_NonOccupational_Txt_ClaimType(WebDriver driver)
{
	Element = driver.findElement(By.id("claimtypecode_codelookup")); //Unique Id Of Claim Type TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Txt_DepartmentID
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Department ID TextBox On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-12-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Txt_DepartmentID(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_depteid")); //Unique Id Of Department ID TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Txt_EmployeeNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Number TextBox On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-12-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Txt_EmployeeNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("empemployeenumber")); //Unique Id Of Employee Number TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Txt_EventNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Event Number TextBox On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-12-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Txt_EventNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_eventnumber")); //Unique Id Of Event Number TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Txt_ClaimNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Number TextBox On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-12-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Txt_ClaimNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("claimnumber")); //Unique Id Of Claim Number TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Txt_DateOfEvent
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which DateOfEvent TextBox On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-12-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Txt_DateOfEvent(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_dateofevent")); //Unique Id Of DateOfEvent TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Txt_TimeOfEvent
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which TimeOfEvent TextBox On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-12-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Txt_TimeOfEvent(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_timeofevent")); //Unique Id Of TimeOfEvent TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Txt_TimeOfClaim
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which TimeOfClaim TextBox On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-12-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Txt_TimeOfClaim(WebDriver driver)
{
	Element = driver.findElement(By.id("timeofclaim")); //Unique Id Of TimeOfClaim TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Txt_DateOfClaim
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which DateOfClaim TextBox On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-12-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Txt_DateOfClaim(WebDriver driver)
{
	Element = driver.findElement(By.id("dateofclaim")); //Unique Id Of DateOfClaim TextBox On RMA Application Worker's Compensation Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Txt_Jurisdiction
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Jurisdiction TextBox On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-02-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Txt_Jurisdiction(WebDriver driver)
{
	Element = driver.findElement(By.id("jurisdiction_codelookup")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Frm_NonOccupationalensationFrame
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Worker's Compensation Frame On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-02-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Frm_NonOccupationalensationFrame(WebDriver driver)
{
	Element = driver.findElement(By.id("Document-4-3claimdiNon-occupationalNon-occupational (New)FalseFalse")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Btn_ClaimStatus
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ClaimStatus Button On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-02-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Btn_ClaimStatus(WebDriver driver)
{
	Element = driver.findElement(By.id("claimstatuscode_codelookupbtn")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Txt_DisabilityStartDate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Disability Start Date TextBox On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-02-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Txt_DisabilityStartDate(WebDriver driver)
{
	Element = driver.findElement(By.id("disfromdate")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_NonOccupational_Btn_PlanName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which PlanName Button On RMA Application NonOccupational Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-05-02-2016                                 
//============================================================================================
public static WebElement RMAApp_NonOccupational_Btn_PlanName(WebDriver driver)
{
	Element = driver.findElement(By.id("plannamebtn")); 
	return Element;
}

}




