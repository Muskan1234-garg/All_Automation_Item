package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_OtherPerson {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_OtherPerson_Lst_Type
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type List Box On Other Person Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_OtherPerson_Lst_Type(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("entitytableid")); //Unique Id Of Type Of Type List Box On Other Person Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_OtherPerson_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Other Person Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintenanceOtherPerson_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lastname")); //Unique Id Of Last Name TextBox On Other Person Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_OtherPerson_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Other Person Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PIOtherPerson_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_lastname")); //Unique Id Of Last Name TextBox On Other Person Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_OtherPerson_Txt_SocialSecurityNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SocialSecurityNumber Text Box On OtherPerson Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_OtherPerson_Txt_SocialSecurityNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("taxid")); //Unique Id Of Type Of SocialSecurityNumber Text Box On OtherPerson Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_OtherPerson_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which City TextBox On Other Person Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_OtherPerson_Txt_City(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("city")); //Unique Id Of City TextBox On Other Person Is Fetched
		return Element;
	}
}

