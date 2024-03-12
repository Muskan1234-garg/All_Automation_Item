package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_PersonInvolved {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
//============================================================================================
//FunctionName 			: RMAApp_PIEmp_Txt_EmpNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Number TextBox On RMA Application Persons Involved-->Add Existing Employee Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
// ============================================================================================
public static WebElement RMAApp_PIEmp_Txt_EmpNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("employeenumber")); //Unique Id Of Employee Number TextBox On RMA Application Persons Involved-->Add Existing Employee Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_PIDriver_Lst_DriverType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Driver Type List Box On RMA Application Maintenance-->Driver Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - Renu Verma-06-27-2016                                 
//============================================================================================
public static WebElement RMAApp_PIDiver_Lst_DriverType(WebDriver driver)
{
	Element = driver.findElement(By.id("Drivertyped")); //Unique Id Of Driver Type List Box On RMA Application Maintenance-->Medical Driver Page Is Fetched
	return Element;
}
}