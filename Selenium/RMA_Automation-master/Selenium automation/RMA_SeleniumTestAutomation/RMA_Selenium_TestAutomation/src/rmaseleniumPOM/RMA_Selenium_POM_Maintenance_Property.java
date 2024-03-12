package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Maintenance_Property {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_MaintProperty_Txt_Address1
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address1 Text Box On RMA Application's Maintenance-->Property Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                 
//============================================================================================
public static WebElement RMAApp_MaintProperty_Txt_Address1(WebDriver driver)
{
	Element = driver.findElement(By.id("addr1")); //Unique Id  Of Address1 Text Box On RMA Application's Maintenance-->Property Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintProperty_Txt_PropertyID
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Property ID Text Box On RMA Application's Maintenance-->Property Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                 
//============================================================================================
public static WebElement RMAApp_MaintProperty_Txt_PropertyID(WebDriver driver)
{
	Element = driver.findElement(By.id("pin")); //Unique Id  Of Property ID Text Box On RMA Application's Maintenance-->Property Page Is Fetched
	return Element;
}


//============================================================================================
//FunctionName 			: RMAApp_MaintProperty_Txt_City
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which City Text Box On RMA Application's Maintenance-->Property Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                 
//============================================================================================
public static WebElement RMAApp_MaintProperty_Txt_City(WebDriver driver)
{
	Element = driver.findElement(By.id("city")); //Unique Id  Of City Text Box On RMA Application's Maintenance-->Property Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintProperty_Txt_State
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Text Box On RMA Application's Maintenance-->Property Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                 
//============================================================================================
public static WebElement RMAApp_MaintProperty_Txt_State(WebDriver driver)
{
	Element = driver.findElement(By.id("stateid_codelookup")); //Unique Id Of State Text Box On RMA Application's Maintenance-->Property Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintProperty_Txt_Country
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country Text Box On RMA Application's Maintenance-->Property Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                 
//============================================================================================
public static WebElement RMAApp_MaintProperty_Txt_Country(WebDriver driver)
{
	Element = driver.findElement(By.id("countrycode_codelookup")); //Unique Id Of Country Text Box On RMA Application's Maintenance-->Property Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintProperty_Txt_ZipPostalCode
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ZipPostalCode Text Box On RMA Application's Maintenance-->Property Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                 
//============================================================================================
public static WebElement RMAApp_MaintProperty_Txt_ZipPostalCode(WebDriver driver)
{
	Element = driver.findElement(By.id("zipcode")); //Unique Id Of ZipPostalCode Text Box On RMA Application's Maintenance-->Property Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintProperty_Txt_YearOfConstruction
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Year Of Construction TextBox On RMA Application's Maintenance-->Property Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                 
//============================================================================================
public static WebElement RMAApp_MaintProperty_Txt_YearOfConstruction(WebDriver driver)
{
	Element = driver.findElement(By.id("yearofconstruction")); //Unique Id Of Year Of Construction TextBox On RMA Application's Maintenance-->Property Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintProperty_Txt_SquareFootage
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SquareFootage TextBox On RMA Application's Maintenance-->Property-->PropertySearch Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-11-10-2016                                 
//============================================================================================
public static WebElement RMAApp_MaintProperty_Txt_SquareFootage(WebDriver driver)
{
	Element = driver.findElement(By.id("squarefootage")); //Unique Id Of SquareFootage TextBox On RMA Application's Maintenance-->Property Page Is Fetched
	return Element;
}
}
