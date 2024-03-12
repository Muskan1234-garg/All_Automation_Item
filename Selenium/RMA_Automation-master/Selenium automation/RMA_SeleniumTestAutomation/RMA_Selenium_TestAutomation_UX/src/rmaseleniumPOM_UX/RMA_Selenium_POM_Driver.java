package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Driver {
public static WebElement Element = null;

//=================================================================================================================================================================================================
//FunctionName 			: RMAApp_Driver_Lst_TypeOfDriver
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Driver ListBox On Driver Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
// ================================================================================================================================================================================================
public static WebElement RMAApp_Driver_Lst_TypeOfDriver(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("drivertyped")); //Unique Id Of Type Of Driver List Box On Driver Page Is Fetched
	return Element;
}

//=================================================================================================================================================================================================
//FunctionName 			: RMAApp_MaintDriver_Lst_TypeOfDriver
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Driver ListBox On Maintenance -->Driver Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
//================================================================================================================================================================================================
public static WebElement RMAApp_MaintDriver_Lst_TypeOfDriver(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("entitytableid")); //Unique Id Of Type Of Driver List Box On Maintenance -->Driver Page Is Fetched
	return Element;
}

//=================================================================================================================================================================================================
//FunctionName 			: RMAApp_Driver_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Driver Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
//================================================================================================================================================================================================
public static WebElement RMAApp_Driver_Txt_LastName(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("lastname")); //Unique Id Of Last Name TextBox On Driver Page Is Fetched
	return Element;
}

//=================================================================================================================================================================================================
//FunctionName 			: RMAApp_Driver_Txt_Address1
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address1 TextBox On Driver Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
//================================================================================================================================================================================================
public static WebElement RMAApp_Driver_Txt_Address1(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("addr1")); //Unique Id Of Address1 TextBox On Driver Page Is Fetched
	return Element;
}

//=================================================================================================================================================================================================
//FunctionName 			: RMAApp_Driver_Tab_Supplementals
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supplementals Tab On Driver Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
//================================================================================================================================================================================================
public static WebElement RMAApp_Driver_Tab_Supplementals(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath("//*[contains(text(),'Supplementals')]//i")); //Unique Id Of Supplementals Tab On Driver Page Is Fetched
	return Element;
}

//=================================================================================================================================================================================================
//FunctionName 			: RMAApp_Driver_Tab_Driver
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Driver Tab On Driver Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
//================================================================================================================================================================================================
public static WebElement RMAApp_Driver_Tab_Driver(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath("//*[contains(text(),'Driver')]//i")); //Unique Id Of Driver Tab On Driver Page Is Fetched
	return Element;
}
}

