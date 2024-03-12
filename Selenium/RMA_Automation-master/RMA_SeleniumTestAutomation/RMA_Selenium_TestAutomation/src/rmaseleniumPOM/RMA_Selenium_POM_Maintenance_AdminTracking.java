package rmaseleniumPOM;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RMA_Selenium_POM_Maintenance_AdminTracking {


	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
//============================================================================================
//FunctionName 			: RMAApp_MaintAdminTracking_Lnk_LinkName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Admin tracking type Link On RMA Application Maintenance-->Admin Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahendraPSingh-02-28-2017                                 
// ============================================================================================
public static WebElement RMAApp_MaintAdminTracking_Lnk_LinkName(WebDriver driver, String TrackingType)
{
	Element = driver.findElement(By.xpath(".//*[contains(text(),'"+TrackingType+"')]")); //Unique Id Of Claim Type TextBox On RMA Application Maintenance-->Employee Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintAdminTracking_Txt_BondAbstract_BondNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Bond Number Text box On RMA Application Maintenance-->Admin Tracking-> Bond Abstract Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahendraPSingh-02-28-2017                                 
//============================================================================================
public static WebElement RMAApp_MaintAdminTracking_Txt_BondAbstract_BondNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("bond_num_text")); //Unique Id Of Bond Number TextBox On RMA Application Maintenance-->Admin Tracking-> Bond Abstract Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintAdminTracking_Txt_CertificateTracking_JobNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Bond Number Text box On RMA Application Maintenance-->Admin Tracking-> Certificate Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahendraPSingh-02-28-2017                                 
//============================================================================================
public static WebElement RMAApp_MaintAdminTracking_Txt_CertificateTracking_JobNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("job_no_text")); //Unique Id Of Job Number TextBox On RMA Application Maintenance-->Admin Tracking-> CertificateTracking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintAdminTracking_Txt_ComplaintManagement_ComplaintNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Job Number Text box On RMA Application Maintenance-->Admin Tracking-> Complaint Management Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahendraPSingh-02-28-2017                                 
//============================================================================================
public static WebElement RMAApp_MaintAdminTracking_Txt_ComplaintManagement_ComplaintNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("comp_no_text")); //Unique Id Of Complaint Number TextBox On RMA Application RMA Application Maintenance-->Admin Tracking-> Complaint Management Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintAdminTracking_Txt_ContractManagement_ContractType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Job Number Text box On RMA Application Maintenance-->Admin Tracking-> Contract Management Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahendraPSingh-02-28-2017                                 
//============================================================================================
public static WebElement RMAApp_MaintAdminTracking_Txt_ContractManagement_ContractType(WebDriver driver)
{
	Element = driver.findElement(By.id("cont_type_code_codelookup")); //Unique Id Of Contract Type TextBox On RMA Application RMA Application Maintenance-->Admin Tracking-> Contract Management Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintAdminTracking_Txt_Directory_LastName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Job Number Text box On RMA Application Maintenance-->Admin Tracking-> Directory Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahendraPSingh-02-28-2017                                 
//============================================================================================
public static WebElement RMAApp_MaintAdminTracking_Txt_Directory_LastName(WebDriver driver)
{
	Element = driver.findElement(By.id("last_name_text")); //Unique Id Of Last Name TextBox On RMA Application RMA Application Maintenance-->Admin Tracking-> Directory Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintAdminTracking_Txt_HazardousMaterials_ProductName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Job Number Text box On RMA Application Maintenance-->Admin Tracking-> Hazardous Materials Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahendraPSingh-02-28-2017                                 
//============================================================================================
public static WebElement RMAApp_MaintAdminTracking_Txt_HazardousMaterials_ProductName(WebDriver driver)
{
	Element = driver.findElement(By.id("prod_name_text")); //Unique Id Of Product Name TextBox On RMA Application RMA Application Maintenance-->Admin Tracking-> Hazardous Materials Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintAdminTracking_Txt_ProjectTracking_ActivityType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Job Number Text box On RMA Application Maintenance-->Admin Tracking-> Project Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahendraPSingh-02-28-2017                                 
//============================================================================================
public static WebElement RMAApp_MaintAdminTracking_Txt_ProjectTracking_ActivityType(WebDriver driver)
{
	Element = driver.findElement(By.id("act_type_code_codelookup")); //Unique Id Of Activity Type TextBox On RMA Application RMA Application Maintenance-->Admin Tracking-> Project Tracking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintAdminTracking_Txt_PropertyManagement_PropertyId
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Job Number Text box On RMA Application Maintenance-->Admin Tracking-> Property Management Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - MahendraPSingh-02-28-2017                                 
//============================================================================================
public static WebElement RMAApp_MaintAdminTracking_Txt_PropertyManagement_PropertyId(WebDriver driver)
{
	Element = driver.findElement(By.id("prop_id_text")); //Unique Id Of Property ID TextBox On RMA Application RMA Application Maintenance-->Admin Tracking-> Property Management Page Is Fetched
	return Element;
}


}
