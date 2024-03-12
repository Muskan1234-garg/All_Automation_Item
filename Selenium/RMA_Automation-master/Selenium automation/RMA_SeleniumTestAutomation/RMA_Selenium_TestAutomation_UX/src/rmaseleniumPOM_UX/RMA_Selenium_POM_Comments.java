package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Comments {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Comments_Txt_TextEditor
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TextEditor On RMA Comments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-08-2017                                
	//============================================================================================
	public static WebElement RMAApp_Comments_Txt_TextEditor(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@class='fr-element fr-view']/p")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Comments_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Comments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-08-2017          
	//============================================================================================
	public static WebElement RMAApp_Comments_Btn_Save(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btnSave")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Comments_Btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Button On RMA Comments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-08-2017                                   
	//============================================================================================
	public static WebElement RMAApp_Comments_Btn_Cancel(WebDriver driver)
	{  
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='btnclose']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Unique Id Of Close Button On Enhanced Notes Screen  Is Fetched
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_Comments_Btn_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On RMA Comments Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-08-2017                                    
	//============================================================================================
	public static WebElement RMAApp_Comments_Btn_Close(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='lg-modal-rm hidden-sm hidden-xs glyphicon glyphicon-remove modalcloseBtn']"));
			System.out.println("value"+Element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	} 


}