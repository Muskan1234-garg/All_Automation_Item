package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Witness {
public static WebElement Element = null;

//=================================================================================================================================================================================================
//FunctionName 			: RMAApp_Witness_Txt_FirstName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which First Name Text Box On Witness Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
// ================================================================================================================================================================================================
public static WebElement RMAApp_Witness_Txt_FirstName(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("firstname")); //Unique Id Of Type Of First Name Text Box On Witness Page Is Fetched
	return Element;
}

//=================================================================================================================================================================================================
//FunctionName 			: RMAApp_Witness_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Witness Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
//================================================================================================================================================================================================
public static WebElement RMAApp_Witness_Txt_LastName(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("lastname")); //Unique Id Of Last Name TextBox On Witness Page Is Fetched
	return Element;
}

//=================================================================================================================================================================================================
//FunctionName 			: RMAApp_Witness_Txt_Initials
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Initials TextBox On Witness Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
//================================================================================================================================================================================================
public static WebElement RMAApp_Witness_Txt_Initials(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("abbreviation")); //Unique Id Of Initials TextBox On Witness Page Is Fetched
	return Element;
}

//=================================================================================================================================================================================================
//FunctionName 			: RMAApp_Witness_Txt_SocialSecurityNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SocialSecurityNumber Text Box On Witness Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
//================================================================================================================================================================================================
public static WebElement RMAApp_Witness_Txt_SocialSecurityNumber(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("taxid")); //Unique Id Of Type Of SocialSecurityNumber Text Box On Witness Page Is Fetched
	return Element;
}

}

