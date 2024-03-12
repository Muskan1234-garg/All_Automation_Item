package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_POM_Comments {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Comments_Txt_TextEditor
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TextEditor On RMA Comments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-08-01-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Comments_Txt_TextEditor(WebDriver driver)
	{
		Element = driver.findElement(By.xpath("//html/body")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Comments_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Comments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-08-01-2016        
	//Modify By 			: 0.1- RenuVerma-02-02-2017 As comment screen changed as per UX screen and button name also changed
	//============================================================================================
	public static WebElement RMAApp_Comments_Btn_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnSave")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Comments_Btn_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On RMA Comments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-02-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Comments_Btn_Close(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnclose")); 
		return Element;
	}
		
    //============================================================================================
    //FunctionName 			: RMAApp_Comments_Btn_SaveAndClose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SaveAndClose Button On RMA Comments Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MahendraSingh-02-07-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Comments_Btn_SaveAndClose(WebDriver driver)
	{
	    Element = driver.findElement(By.id("btnSaveClose")); 
		return Element;
	}
}