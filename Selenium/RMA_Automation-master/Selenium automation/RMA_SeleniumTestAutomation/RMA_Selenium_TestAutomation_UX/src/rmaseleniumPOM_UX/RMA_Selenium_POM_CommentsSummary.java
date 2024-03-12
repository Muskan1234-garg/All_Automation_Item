package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_CommentsSummary {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_CommentsSummary_Txt_CommentSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Comment Summary Table On RMA Claim Comments Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-13-2017                                
	//============================================================================================
	public static WebElement RMAApp_CommentsSummary_Txt_CommentSummary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-bind-html='vm.trustAsHtml(data.comment.text)']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CommentsSummary_Btn_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On RMA Claim Comments Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-13-2017       
	//============================================================================================
	public static WebElement RMAApp_CommentsSummary_Btn_Close(WebDriver driver)
	{
		Element = null;
	try {
		Element = driver.findElement(By.id("btnclose"));
	} catch (Exception e) {
		e.printStackTrace();
	} 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CommentsSummary_Btn_Print
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Button On RMA Claim Comments Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-13-2017                                
	//============================================================================================
	public static WebElement RMAApp_CommentsSummary_Btn_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnPrint']/i")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_CommentsSummary_Btn_HeaderClose
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On Right Side Header  Of RMA Claim Comments Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-13-2017                                
	//============================================================================================
	public static WebElement RMAApp_CommentsSummary_Btn_HeaderClose(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.name("btnCancelmemo")); 
		return Element;
	}

}