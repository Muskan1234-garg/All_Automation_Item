package rma_appiumutilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

public class RMA_Navigation_Utility extends rma_appiumtestcases.BaseTest {
public static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	
//============================================================================================
//FunctionName 		: RMA_ObjectClick
//Description  		: To Click On The Web Element And Provide Suitable Reporting Statement
//Input Parameter 	: Element Of Type WebElement: Element To Be Clicked ,ControlDesc: Control Name To Be Clicked
//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
//============================================================================================
	public static void RMA_ObjectClick(WebElement Element, String ControlDesc, int logval) throws Exception, Error
	{ 
		try {
			
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			Element.click();
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  color.RMA_ChangeColor_Utility(ControlDesc, 4) + " "  +"Is Successfully Clicked");
			}
			else{
				logger.log(LogStatus.INFO,  color.RMA_ChangeColor_Utility(ControlDesc, 4) + " "  +"Is Successfully Clicked");
			}
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  color.RMA_ChangeColor_Utility(ControlDesc, 4) + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Clicked And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.INFO,  color.RMA_ChangeColor_Utility(ControlDesc, 4) + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Clicked And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}
		
//============================================================================================
//FunctionName 		: RMA_WebPartialLinkSelect
//Description  		: To Click On The Link Element Based On The Partial Link Text Provided
//Input Parameter 	: PartialLinkText And ControlDesc Of The Type String, logval Of Type Integer
//Revision			: 0.0 - KumudNaithani-13-01-2017                                 
//============================================================================================
public static void RMA_WebPartialLinkSelect(String PartialLinkText, String ControlDesc, int logval) throws Exception, Error
{
	try {
		//driver.findElement(By.partialLinkText(PartialLinkText)).click();
		driver.findElementByPartialLinkText(PartialLinkText).click();
		Thread.sleep(5000);
		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO,  "Following Link:" + " " + color.RMA_ChangeColor_Utility(PartialLinkText, 4) + " " +  "On" + " "+ color.RMA_ChangeColor_Utility(ControlDesc, 4) + " " + "Is Successfully Clicked");
		}
		else
		{		
			logger.log(LogStatus.INFO,  "Following Link:" + " " + color.RMA_ChangeColor_Utility(PartialLinkText, 4) + " " +  "On" + " "+ color.RMA_ChangeColor_Utility(ControlDesc, 4) + " " + "Is Successfully Clicked");
		}
	} catch (Exception|Error e) {
		if (logval == 0)
		{
			parentlogger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(PartialLinkText, 4) + " " + "Is Not Clicked And Hence The Step Is A Fail" + " " + "Due To Reason" + color.RMA_ChangeColor_Utility(e.getMessage(),1) );	
		}
		else
		{
			logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(PartialLinkText, 4) + " " + "Is Not Clicked And Hence The Step Is A Fail" + " " + "Due To Reason" + color.RMA_ChangeColor_Utility(e.getMessage(),1) );	
		}
				throw (e);
			}
		}
}

	

