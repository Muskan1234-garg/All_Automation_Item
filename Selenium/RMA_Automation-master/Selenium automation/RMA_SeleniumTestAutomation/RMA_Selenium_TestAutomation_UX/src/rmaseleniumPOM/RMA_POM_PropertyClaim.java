package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_POM_PropertyClaim {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Txt_EventNumber
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EventNumber TextBox On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_PropertyClaim_Txt_EventNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_eventnumber")); //Unique Id  Of  EventNumber TextBox On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: MAApp_PropertyClaim_Txt_ClaimNumber
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimNumber TextBox On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_PropertyClaim_Txt_ClaimNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("claimnumber")); //Unique Id  Of  ClaimNumber TextBox On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Txt_DateOfEvent
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DateOfEvent TextBox On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_PropertyClaim_Txt_DateOfEvent(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_dateofevent")); //Unique Id  Of  DateOfEvent TextBox On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Txt_TimeOfEvent
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TimeOfEvent TextBox On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_PropertyClaim_Txt_TimeOfEvent(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_timeofevent")); //Unique Id  Of  TimeOfEvent TextBox On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Txt_DateOfClaim
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DateOfClaim TextBox On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_PropertyClaim_Txt_DateOfClaim(WebDriver driver)
{
	Element = driver.findElement(By.id("dateofclaim")); //Unique Id  Of DateOfClaim TextBox On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Txt_TimeOfClaim
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TimeeOfClaim TextBox On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_PropertyClaim_Txt_TimeOfClaim(WebDriver driver)
{
	Element = driver.findElement(By.id("timeofclaim")); //Unique Id  Of TimeOfClaim TextBox On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Txt_ClaimType
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimType TextBox On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_PropertyClaim_Txt_ClaimType(WebDriver driver)
{
	Element = driver.findElement(By.id("claimtypecode_codelookup")); //Unique Id  Of ClaimType TextBox On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Txt_Dept_Id
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DepartmentId TextBox On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_PropertyClaim_Txt_Dept_Id(WebDriver driver)
{
	Element = driver.findElement(By.id("ev_depteid")); //Unique Id  Of DepartmentId TextBox On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_DefaultView_Frm_PropertyClaim
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which General Claim Frame On RMA Application Default View Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_DefaultView_Frm_PropertyClaim(WebDriver driver)
{
	Element = driver.findElement(By.id("Document-2-1claimpcProperty ClaimProperty Claim (New)False")); //Unique Id  Of General Claim Frame On RMA Application Default View Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Txt_ClaimStatus
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimType TextBox On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_PropertyClaim_Txt_ClaimStatus(WebDriver driver)
{
	Element = driver.findElement(By.id("claimstatuscode_codelookup")); //Unique Id  Of ClaimType TextBox On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Btn_Save
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimType TextBox On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_PropertyClaim_Btn_Save(WebDriver driver)
{
	Element = driver.findElement(By.id("save")); //Unique Id  Of ClaimType TextBox On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Txt_PolicyLOB
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PolicyCode TextBox On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
//============================================================================================
public static WebElement RMAApp_PropertyClaim_Txt_PolicyLOB(WebDriver driver)
{
	Element = driver.findElement(By.id("policyLOBCode_codelookup")); //Unique Id  Of PolicyCode TextBox On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Btn_ClaimStatusBtn
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Status Search Button On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
//============================================================================================
public static WebElement RMAApp_PropertyClaim_Btn_ClaimStatusBtn(WebDriver driver)
{
	Element = driver.findElement(By.id("claimstatuscode_codelookupbtn")); //Unique Id Of Claim Status Search Button On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Lnk_Open
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Open Claim Status Link On RMA Application General Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
//============================================================================================
public static WebElement RMAApp_PropertyClaim_Lnk_Open(WebDriver driver)
{
	Element = driver.findElement(By.linkText("Open")); //Unique Id Of Open Claim Status Link On RMA Application General Claim Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PropertyClaim_Btn_PropertyIDButton
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PropertyID Button On RMA Application Property Claim Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-06-20-2016                                 
//============================================================================================
public static WebElement RMAApp_PropertyClaim_Btn_PropertyIDButton(WebDriver driver)
{
	Element = driver.findElement(By.id("pi_propertyidbtn")); 
	return Element;
}

}
