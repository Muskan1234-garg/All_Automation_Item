package rma_appiumutilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

public class RMA_Input_Utility extends rma_appiumtestcases.BaseTest {
public static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();

//============================================================================================
//FunctionName 		: RMA_SetValue_Utility
//Description  		: To Input Value In Text Box 
//Input Parameter 	: Element Of Type WebElement: Element In Which Text Value Is To Be Entered .
//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
//============================================================================================*/
	public static void RMA_SetValue_Utility (WebElement Element,String objDesc, String text, int logval) throws Exception, Error
	{
	try {	
		if (!Element.isEnabled())
		{
			if (logval==0)
			{
				parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility(objDesc,4) +" " +color.RMA_ChangeColor_Utility("Is Disabled Hence The Provided Text :",1) +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(),3) +" " +color.RMA_ChangeColor_Utility("Cannot Be Set",1));
			}
			else
			{
				logger.log(LogStatus.FAIL,color.RMA_ChangeColor_Utility(objDesc,4) +" " +color.RMA_ChangeColor_Utility("Is Disabled Hence The Provided Text :",1) +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(),3) +" " +color.RMA_ChangeColor_Utility("Cannot Be Set",1));
			}
			
		Assert.fail();
		}
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			Element.clear();// To Clear Text Value If Already Present		
			Element.sendKeys(text);			
			Thread.sleep(1000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Set Successfully In WebElement :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
			    logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Set Successfully In WebElement :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
		
			
			 }catch (Exception|Error e) 			
		{	
			 if (logval ==0)
				{
					parentlogger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
				}
				
				else
				{
				   logger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
				}
			throw (e);
		}
	}
	
//============================================================================================
//FunctionName 		: RMA_ElementWebListSelect_Utility
//Description  		: To Select The Element Displayed In The WebList As Per The User Given Selection Value
//Input Parameter 	: Element Of Type WebElement: Element For Which The Value Is To Be Selected and SelectionElement Of Type String : Value To Be Selected
//Revision			: 0.0 - KumudNaithani-01-12-2017                                 
//============================================================================================
public static void RMA_ElementWebListSelect_Utility(WebElement Element, String Value, String ControlName, String PageName, int logval) throws Exception, Error
{//In Case The User Wants To Select An IntegerValue Then The User Needs To Convert The Integer Value To String Using String.valueOf() Function And Then Pass As An Argument Into The Function
	try {
		Select dropdown = new Select (Element);
		dropdown.selectByVisibleText(Value);
		if (logval==0)
		{
		parentlogger.log(LogStatus.INFO, "Value Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " "+ "Is" +"::" + " " +  color.RMA_ChangeColor_Utility(Value, 3));	
		}
		else
		{
		logger.log(LogStatus.INFO, "Value Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " "+ "Is" +"::" + " " +  color.RMA_ChangeColor_Utility(Value, 3));
		}
		Thread.sleep(2000);
	} catch (Exception|Error e) {
		if (logval==0)
		{
		parentlogger.log(LogStatus.FAIL, "Following Value" + " " + color.RMA_ChangeColor_Utility(Value, 3) + " " + "Couldnot Be Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " " + "And The Error Occurred Is" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1));
		}
		else
		{
		logger.log(LogStatus.FAIL, "Following Value" + " " + color.RMA_ChangeColor_Utility(Value, 3) + " " + "Couldnot Be Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " " + "And The Error Occurred Is" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1));
		}
		throw (e);
	}
}

}
