package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_POM_ClaimCommentsSummary {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Comments_Tbl_CommentSummaryTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Comment Summary Table On RMA Claim Comments Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-08-01-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Comments_Tbl_CommentSummaryTable(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='GrdViewComment']/tbody")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Comments_Btn_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On RMA Claim Comments Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-08-01-2016        
	// Modify By 			:0.1 - RenuVerma-02-02-2017  Comment summary page is changed as UX screen
	//============================================================================================
	public static WebElement RMAApp_Comments_Btn_Close(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnclose")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Comments_Btn_Print
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Button On RMA Claim Comments Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-08-01-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Comments_Btn_Print(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnprintit")); 
		return Element;
	}

}