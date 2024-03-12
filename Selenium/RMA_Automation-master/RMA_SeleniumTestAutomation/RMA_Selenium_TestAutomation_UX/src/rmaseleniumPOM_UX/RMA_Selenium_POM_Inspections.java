package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Inspections {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Inspection_Txt_InspectionDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Inspection Date TextBox On Unit Inspection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-06-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Inspection_Txt_InspectionDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("inspectiondate")); //Unique Id Of Inspection Date TextBox On Inspection Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Inspection_Txt_InspectionResult
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which InspectionResult TextBox On Unit Inspection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-06-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Inspection_Txt_InspectionResult(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("inspectiondate")); //Unique Id Of Inspection Result TextBox On Inspection Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Inspection_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Image On Unit Inspection Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-06-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Inspection_Img_Save(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@class='material-icons material-icons-clr' and contains(text(),'save')]//ancestor::span[1]")); //Unique Id Of Save Image On Inspection Page Is Fetched
		return Element;
	}
}
