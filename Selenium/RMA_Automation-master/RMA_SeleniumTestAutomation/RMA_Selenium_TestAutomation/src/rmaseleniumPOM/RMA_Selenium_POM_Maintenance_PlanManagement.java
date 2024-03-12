package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Maintenance_PlanManagement {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_MaintPlanManagement_Txt_PlanNumber
//Description  			: To Fetch Unique PlanManagement (Such As Id, Xpath, Name ) On The Basis Of Which Plan Number/Code Text Box On RMA Application's Maintenance-->PlanManagement Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                 
//============================================================================================
public static WebElement RMAApp_MaintPlanManagement_Txt_PlanNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("plannumber")); //Unique Id  Of Plan Number/Code Text Box On RMA Application's Maintenance-->PlanManagement Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPlanManagement_Txt_Planname
//Description  			: To Fetch Unique PlanManagement (Such As Id, Xpath, Name ) On The Basis Of Which Plan Name ID Text Box On RMA Application's Maintenance-->PlanManagement Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPlanManagement_Txt_Planname(WebDriver driver)
{
	Element = driver.findElement(By.id("planname")); //Unique Id  Of Plan Name ID Text Box On RMA Application's Maintenance-->PlanManagement Page Is Fetched
	return Element;
}


//============================================================================================
//FunctionName 			: RMAApp_MaintPlanManagement_Txt_PlanStatus
//Description  			: To Fetch Unique PlanManagement (Such As Id, Xpath, Name ) On The Basis Of Which Plan StatusText Box On RMA Application's Maintenance-->PlanManagement Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                  
//============================================================================================
public static WebElement RMAApp_MaintPlanManagement_Txt_PlanStatus(WebDriver driver)
{
	Element = driver.findElement(By.id("planstatuscode_codelookup")); //Unique Id  Of Plan Status Text Box On RMA Application's Maintenance-->PlanManagement Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPlanManagement_Txt_EffectiveDate
//Description  			: To Fetch Unique PlanManagement (Such As Id, Xpath, Name ) On The Basis Of Which Effective Date Text Box On RMA Application's Maintenance-->PlanManagement Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                  
//============================================================================================
public static WebElement RMAApp_MaintPlanManagement_Txt_EffectiveDate(WebDriver driver)
{
	Element = driver.findElement(By.id("effectivedate")); //Unique Id Of Effective Date Text Box On RMA Application's Maintenance-->PlanManagement Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPlanManagement_Txt_ExpirationDate
//Description  			: To Fetch Unique PlanManagement (Such As Id, Xpath, Name ) On The Basis Of Which Expiration Date Text Box On RMA Application's Maintenance-->PlanManagement Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                  
//============================================================================================
public static WebElement RMAApp_MaintPlanManagement_Txt_ExpirationDate(WebDriver driver)
{
	Element = driver.findElement(By.id("expirationdate")); //Unique Id Of Expiration Date Text Box On RMA Application's Maintenance-->PlanManagement Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPlanManagement_Btn_Insured
//Description  			: To Fetch Unique PlanManagement (Such As Id, Xpath, Name ) On The Basis Of Which Insured(s)/Account(s) Button Box On RMA Application's Maintenance-->PlanManagement Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016          
//Revision				: 0.1 - MahendraPSingh-02-24-2017- Updated Maintenance -> Leave Plan Management objects                           
//============================================================================================
public static WebElement RMAApp_MaintPlanManagement_Btn_Insured(WebDriver driver)
{
	Element = driver.findElement(By.id("insuredlistbtn")); //Unique Id Of Insured(s)/Account(s) Button Box On RMA Application's Maintenance-->PlanManagement Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintLeavePlanManagement_Txt_PlanCode
//Description  			: To Fetch Unique LeavePlanManagement (Such As Id, Xpath, Name ) On The Basis Of Which Plan Name ID Text Box On RMA Application's Maintenance-->LeavePlanManagement Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahendraPSingh-02-25-2017                                
//============================================================================================
public static WebElement RMAApp_MaintLeavePlanManagement_Txt_PlanCode(WebDriver driver)
{
	Element = driver.findElement(By.id("plancode")); //Unique Id  Of Plan Name ID Text Box On RMA Application's Maintenance-->LeavePlanManagement Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintLeavePlanManagement_Txt_DefaultHoursPerweek
//Description  			: To Fetch Unique LeavePlanManagement (Such As Id, Xpath, Name ) On The Basis Of Which Plan Name ID Text Box On RMA Application's Maintenance-->LeavePlanManagement Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahendraPSingh-02-25-2017                                
//============================================================================================
public static WebElement RMAApp_MaintLeavePlanManagement_Txt_DefaultHoursPerweek(WebDriver driver)
{
	Element = driver.findElement(By.id("defaulthours")); //Unique Id  Of Plan Name ID Text Box On RMA Application's Maintenance-->LeavePlanManagement Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintLeavePlanManagement_Txt_PlanStatus
//Description  			: To Fetch Unique LeavePlanManagement (Such As Id, Xpath, Name ) On The Basis Of Which Plan Status Text Box On RMA Application's Maintenance-->LeavePlanManagement Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahendraPSingh-02-25-2017                                
//============================================================================================
public static WebElement RMAApp_MaintLeavePlanManagement_Txt_PlanStatus(WebDriver driver)
{
	Element = driver.findElement(By.id("planstatus_codelookup")); //Unique Id  Of Plan Name ID Text Box On RMA Application's Maintenance-->LeavePlanManagement Page Is Fetched
	return Element;
}


}
