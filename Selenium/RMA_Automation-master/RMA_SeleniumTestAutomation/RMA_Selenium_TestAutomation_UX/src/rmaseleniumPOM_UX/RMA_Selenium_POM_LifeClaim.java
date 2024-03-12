package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_LifeClaim {
	public static WebElement Element = null;

	
	//============================================================================================
	//FunctionName 			: RMAApp_LifeClaim_Txt_DateOfDeath
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Of Claim TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Aditya 09-11-2020                 
	// ============================================================================================
	public static WebElement RMAApp_LifeClaim_Txt_DateOfDeath(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id=\"deathDate\" and @type='text']")); //Unique x-path  Of DateOfdeath TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_LifeClaim_Txt_DateOflossproof
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Of Claim TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Aditya 09-11-2020                                
	// ============================================================================================
	public static WebElement RMAApp_LifeClaim_Txt_DateOflossproof(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id=\"dateoflossproof\" and @type='text']")); //Unique x-path  Of DateOflossproof TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}
	
		//============================================================================================
	//FunctionName 			: RMAApp_LifeClaim_Btn_mannerofdeath
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Status Search Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Aditya 09-11-2020                                  
	//============================================================================================
	public static WebElement RMAApp_LifeClaim_Btn_MannerofDeath(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id=\"btn_mannerofdeath_openlookup\"]"));
		return Element;
	}	
	
	//============================================================================================
	//FunctionName 			: RMAApp_LifeClaim_Btn_CauseOfDeath
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Status Search Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Aditya 09-11-2020                                  
	//============================================================================================
	public static WebElement RMAApp_LifeClaim_Btn_CauseofDeath(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id=\"btn_causeofdeath_openlookup\"]"));
		return Element;
	}	
	
	//============================================================================================
	//FunctionName 			: RMAApp_LifeClaim_Btn_AditionalClaimInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Status Search Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Aditya 09-11-2020                                  
	//============================================================================================
	public static WebElement RMAApp_LifeClaim_Btn_AditionalClaimInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Additional Claim Information')]"));
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_LifeClaim_Btn_ClaimInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Status Search Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Aditya 09-11-2020                                  
	//============================================================================================
	public static WebElement RMAApp_LifeClaim_Btn_ClaimInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Claim Info')]"));
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_LifeClaim_Btn_notificationMethodcode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Status Search Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Aditya 09-11-2020                                  
	//============================================================================================
	public static WebElement RMAApp_LifeClaim_Btn_notificationMethodcode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id=\"btn_notificationMethodcode_openlookup\"]"));
		return Element;
	}	
	
	//============================================================================================
	//FunctionName 			: RMAApp_LifeClaim_Btn_estateProbatedcode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Status Search Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Aditya 09-11-2020                                  
	//============================================================================================
	public static WebElement RMAApp_LifeClaim_Btn_estateProbatedcode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_estateProbatedcode_openlookup']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LifeClaim_Btn_deceasedMaritalStatusMethodcode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Status Search Button On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Aditya 09-11-2020                                  
	//============================================================================================
	public static WebElement RMAApp_LifeClaim_Btn_deceasedMaritalStatusMethodcode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@id=\"btn_deceasedMaritalStatusMethodcode_openlookup\"]"));
		return Element;
	}
}