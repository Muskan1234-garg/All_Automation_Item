package rmaseleniumutilties_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;

public class RMA_Input_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	static String StrValue;

	//========================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_SetTextValueandTabOut_Utility
	//Description  		: To set value in text box followed by Tab out
	//Input Parameter 	: Element Of Type WebElement: Element For Which The text value Is To Be set ,followed by tab out.
	//Revision			: 0.0 - ImteyazAhmad-12-03-2015       
	//Modified By		: 0.0 - RenuVerma-10-05-2016: Updated Method For When Input Code  Pattern Matched More Than One Value.
	//Modified By		: 0.1 - RenuVerma-04-14-2017: Updated As when window switching done just because of delay and while getting window title its return null value
	//Modified By		: 0.2 - RenuVerma-09-12-2018: Added Code To Avoid Stale Element issue
	//========================================================================================================================================================================================================================================================================
	public static void RMA_SetTextValueandTabOut_Utility (WebElement Element,String objDesc, String text, int logval) throws Exception, Error
	{
		try{			
			Actions ObjAction = new Actions(driver);
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			ObjAction.moveToElement(Element);
			ObjAction.click();
			ObjAction.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			ObjAction.sendKeys(text);
			ObjAction.build().perform();
			Thread.sleep(5000);
			ObjAction.sendKeys(Keys.TAB);	
			ObjAction.build().perform();
			Thread.sleep(5000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In  WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}

		} catch (Exception|Error e)
		{
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			else
			{
				logger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			throw(e);
		}		
		
	/*	try {
			try{
				if(!driver.findElement(By.xpath("//div[@ng-show='commonLoader']")).getAttribute("class").contains("ng-hide")){
					////System.out.println("Spinner");
					globalWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(Element)));}
			} catch (Exception e) {
				////System.out.println("No Spinner");
			}
			//Thread.sleep(2000);
			if (!Element.isEnabled())
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Text Box",1) +" " +color.RMA_ChangeColor_Utility(objDesc,4) +" " +color.RMA_ChangeColor_Utility("Is Disabled And Hence The Provided Text",1) +" " +color.RMA_ChangeColor_Utility(text,3) +" " +color.RMA_ChangeColor_Utility("CanNot Be Set And Method Name Is : RMA_SetTextValueandTabOut_Utility ",1));	
				}
				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Text Box",1) +" " +color.RMA_ChangeColor_Utility(objDesc,4) +" " +color.RMA_ChangeColor_Utility("Is Disabled And Hence The Provided Text",1) +" " +color.RMA_ChangeColor_Utility(text,3) +" " +color.RMA_ChangeColor_Utility("CanNot Be Set And Method Name Is : RMA_SetTextValueandTabOut_Utility ",1));
				}
				Assert.fail();
			}
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Element );
			Element.clear(); //To clear the text value if available already
			Element.sendKeys(text);
			Thread.sleep(2000);
			//globalWait.until(ExpectedConditions.textToBePresentInElementValue(Element, text));
			Element.sendKeys(Keys.TAB);
			Thread.sleep(1000);
			try{
				if(!driver.findElement(By.xpath("//div[@ng-show='commonLoader']")).getAttribute("class").contains("ng-hide")){
					//System.out.println("Spinner");
					globalWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(Element)));}
			} catch (Exception e) {
				//System.out.println("No Spinner");
			}
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc,4));	
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc,4));
			}
		} catch (Exception|Error e)
		{
			if (logval ==0){
				parentlogger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc,4) +" " +"And ErrorMessage Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc,4) +" " +"And ErrorMessage Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}*/
	}

	//==========================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_SetValue_Utility
	//Description  		: To set value in text box followed by Tab out
	//Input Parameter 	: Element Of Type WebElement: Element For Which The text value Is To Be set .
	//Revision			: 0.0 - ImteyazAhmad-12-17-2015                                 
	//===========================================================================================================================================================================================================================================================================================================
	public static void RMA_SetValue_Utility (WebElement Element,String objDesc, String text, int logval) throws Exception, Error
	{
		/*try{			
			Actions ObjAction = new Actions(driver);
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			ObjAction.moveToElement(Element);
			ObjAction.click();
			ObjAction.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			ObjAction.sendKeys(text);
			ObjAction.build().perform();
			Thread.sleep(5000);
			ObjAction.sendKeys(Keys.TAB);	
			ObjAction.build().perform();
			Thread.sleep(5000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In  WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}

		} catch (Exception|Error e)
		{
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			else
			{
				logger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			throw(e);
		}	*/	
		
		try {
			Thread.sleep(1000);
			if (!Element.isEnabled())
			{
				if (logval==0)
				{
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility(objDesc,4) +" " +color.RMA_ChangeColor_Utility("Is Disabled Hence The Provided Text :",1) +" " +color.RMA_ChangeColor_Utility(text,3) +" " +color.RMA_ChangeColor_Utility("Cannot Be Set",1));
				}
				else
				{
					logger.log(LogStatus.FAIL,color.RMA_ChangeColor_Utility(objDesc,4) +" " +color.RMA_ChangeColor_Utility("Is Disabled Hence The Provided Text :",1) +" " +color.RMA_ChangeColor_Utility(text,3) +" " +color.RMA_ChangeColor_Utility("Cannot Be Set",1));
				}
				Assert.fail();				
			}			
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));			
			Element.clear();// To clear text value if available already			
			Element.sendKeys(text);			
			Thread.sleep(1000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}

		} catch (Exception|Error e) 			
		{	
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			else
			{
				logger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}

	//==============================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ActionSetValue_Utility
	//Description  		: To Set Value In Text Box Using Actions Build Up
	//Input Parameter 	: Element Of Type WebElement: Element For Which The Text Value "text" Of Type String Is To Be Set, logval Value Of The Logger (Parent Or Child Logger), objDesc Description Of The Object
	//Revision			: 0.0 - KumudNaithani-07-28-2016                                
	//================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_ActionSetValue_Utility (String objDesc, String text, int logval) throws Exception, Error
	{
		try {
			Actions ObjAction = new Actions(driver);
			ObjAction.sendKeys(text).build().perform();
			Thread.sleep(1000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}

		} catch (Exception|Error e) 			
		{	
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			else
			{
				logger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}

	//===================================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_JavaScriptSetValue_Utility
	//Description  		: To Set Value In Text Box Using Java Script
	//Input Parameter 	: Element Of Type WebElement: Element For Which The Text Value "text" Of Type String Is To Be Set, logval Value Of The Logger (Parent Or Child Logger), objDesc Description Of The Object
	//Revision			: 0.0 - ImteyazAhmad-07-29-2016                                
	//===================================================================================================================================================================================================================================================================================================================================================================================================	
	public static void RMA_JavaScriptSetValue_Utility(WebElement Element,String objDesc, String text, int logval ) throws Exception, Error

	{
		try{
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			//Thread.sleep(3000);
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			executor.executeScript("arguments[0].setAttribute('value', '"+text+"')",Element);

			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}

		} catch (Exception|Error e) 	

		{	
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			else
			{
				logger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			throw (e);
		}
	}
	//==============================================================================================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ActionSendKeys_Utility
	//Description  		: To Send String On Already In-Focus WebElement
	//Input Parameter 	: Text Value "text" Of Type String To Be Set, Intlogval Value Of The Logger (Parent Or Child Logger), objDesc Description Of The Object, Element (WebElement) On Which The Value Is To Be Set
	//Revision			: 0.0 - ImteyazAhmad-08-01-2016 
	//Modified By		: 0.0 - KumudNaithani-05-22-2017
	//==============================================================================================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_ActionSendKeys_Utility ( WebElement Element,String objDesc, String text,int logval) throws Exception, Error
	{
		try{			
			Actions ObjAction = new Actions(driver);
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			ObjAction.moveToElement(Element);
			ObjAction.click();
			ObjAction.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			ObjAction.sendKeys(text);
			ObjAction.build().perform();
			Thread.sleep(5000);
			ObjAction.sendKeys(Keys.TAB);	
			ObjAction.build().perform();
			Thread.sleep(5000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In  WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}

		} catch (Exception|Error e)
		{
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			else
			{
				logger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			throw(e);
		}		
		/*try{			
			Actions ObjAction = new Actions(driver);
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			ObjAction.moveToElement(Element);
			ObjAction.click();
			ObjAction.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			ObjAction.sendKeys(text);
			ObjAction.build().perform();
			Thread.sleep(5000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In  WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}

		} catch (Exception|Error e)
		{
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			else
			{
				logger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			throw(e);
		}*/
	}

	//==============================================================================================================================================================================================================================================
	//FunctionName 		: RMA_SelectAllCheckBox
	//Description  		: Select All CheckBox From The Given List Of WebElement
	//Input Parameter 	: checkBoxList: CheckBox object as a list parameter,logval Value Of The Logger (Parent Or Child Logger), ObjDescPage: Description Of The Object
	//Note			    : Take The Example from the RMA_Functionality_Utility.RMA_PolicyDownload_Utility
	//Revision			: 0.0 - RenuVerma-08-23-2016                                
	//==============================================================================================================================================================================================================================================

	public static void RMA_SelectAllCheckBoxes( List<WebElement> checkBoxList,String ObjDescPage,int logval) throws Exception {
		try{   
			int i=1;
			for(WebElement checkBox:checkBoxList)
			{	
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(checkBox,"check", "Checkbox of row '"+i+"'", ObjDescPage,logval);// Click On Check Box To Select Item From The Opened Window
				i++;
			}
		}	
		catch(Exception e){
			//System.out.println("Error Occurred While Checking All CheckBoxes :"+" "+e.getMessage());
			throw (e);
		}
	}

	//====================================================================================================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ElementWebListPartiallySelect_Utility
	//Description  		: To Select The Element Displayed In The WebList As Per The User Given Partial Value Selection
	//Input Parameter 	: Element Of Type WebElement: Element For Which The Value Is To Be Selected and SelectionElement Of Type String : Partial Value To Be Selected
	//Revision			: 0.0 - RenuVerma-01-12-2017                                 
	//=======================================================================================================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_ElementWebListPartiallySelect_Utility(WebElement Element, String PartialValue, String ControlName, String PageName, int logval) throws Exception, Error
	{//In Case The User Wants To Select An IntegerValue Then The User Needs To Convert The Integer Value To String Using String.valueOf() Function And Then Pass As An Argument Into The Function
		try {
			boolean Flag=false;
			Select dropdown = new Select (Element);
			List<WebElement> options = dropdown.getOptions();
			for (WebElement option : options) {
				////System.out.println(option.getText()); //output "option1", "option2", "option3"
				if(option.getText().contains(PartialValue)){
					dropdown.selectByVisibleText(option.getText());
					if (logval==0)
					{
						parentlogger.log(LogStatus.INFO, "Partially Matched Value Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " "+ "Is" +"::" + " " +  color.RMA_ChangeColor_Utility(PartialValue, 3));	
					}
					else
					{
						logger.log(LogStatus.INFO, "Partially Matched Value Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " "+ "Is" +"::" + " " +  color.RMA_ChangeColor_Utility(PartialValue, 3));
					}
					Thread.sleep(3000);
					Flag=true;
					break;
				}

			}
			if(!Flag){
				if (logval==0)
				{
					parentlogger.log(LogStatus.INFO, "Partially Value: "+ color.RMA_ChangeColor_Utility(PartialValue, 3)+ " Is Not Available In " + color.RMA_ChangeColor_Utility(ControlName, 4) + " On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) );	
				}
				else
				{
					parentlogger.log(LogStatus.INFO, "Partially Value: "+ color.RMA_ChangeColor_Utility(PartialValue, 3)+ " Is Not Available In " + color.RMA_ChangeColor_Utility(ControlName, 4) + " On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) );
				}
				Assert.fail(color.RMA_ChangeColor_Utility(PartialValue, 1)+" Value Is Not Avaialable");
			}

		} catch (Exception|Error e) {
			if (logval==0)
			{
				parentlogger.log(LogStatus.FAIL, "Following Value" + " " + color.RMA_ChangeColor_Utility(PartialValue, 3) + " " + "Couldnot Be Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " " + "And The Error Occurred Is" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Following Value" + " " + color.RMA_ChangeColor_Utility(PartialValue, 3) + " " + "Couldnot Be Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " " + "And The Error Occurred Is" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1));
			}
			throw (e);
		}
	}

	//============================================================================================
	//FunctionName 		: RMA_ElementWebListSelect_Utility
	//Description  		: To Select The Element Displayed In The WebList As Per The User Given Selection Value
	//Input Parameter 	: Element Of Type WebElement: Element For Which The Value Is To Be Selected and SelectionElement Of Type String/Integer : Value/Index To Be Selected
	//Revision			: 0.0 - RenVerma-06-06-2017                                 
	//============================================================================================
	public static void RMA_ElementWebListSelect_Utility(WebElement Element, Object Value, String ControlName, String PageName, int logval) throws Exception, Error
	{//In Case The User Wants To Select An IntegerValue Then The User Needs To Convert The Integer Value To String Using String.valueOf() Function And Then Pass As An Argument Into The Function
		try {
			/*try{
				if(!driver.findElement(By.xpath("//div[@ng-show='commonLoader']")).getAttribute("class").contains("ng-hide")){
					////System.out.println("Spinner");
					globalWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(Element)));}
			} catch (Exception e) {
				////System.out.println("No Spinner");
			}*/
			Thread.sleep(1000);
			Select dropdown = new Select (Element);
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			if(Value.getClass().getSimpleName().equalsIgnoreCase("String")){// If List Selected Based On String Value

				dropdown.selectByVisibleText(Value.toString());
				Thread.sleep(2000);
				if (logval ==0)
				{
					parentlogger.log(LogStatus.INFO, "Value Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " "+ "Is" +"::" + " " +  color.RMA_ChangeColor_Utility(Value.toString(), 3));	
				}
				else
				{
					logger.log(LogStatus.INFO, "Value Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " "+ "Is" +"::" + " " +  color.RMA_ChangeColor_Utility(Value.toString(), 3));
				}
			}
			if(Value.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If List Selected Based On The Index Of The Value
				dropdown.selectByIndex((int)Value);
				Thread.sleep(3000);
				//globalWait.until(ExpectedConditions.elementToBeClickable(Element));
				if (logval ==0)
				{
					parentlogger.log(LogStatus.INFO, "Index Value Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " "+ "Is" +"::" + " " +  color.RMA_ChangeColor_Utility(Value.toString(), 3));	
				}
				else
				{
					logger.log(LogStatus.INFO, "Index Value Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " "+ "Is" +"::" + " " +  color.RMA_ChangeColor_Utility(Value.toString(), 3));
				}
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "WebList Selection", "Selection Of value From WebList Based On Index Is Successfull")));
				}
				else
				{	
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "WebList Selection", "Selection Of value From WebList Based On Index Is Successfull")));
				}
			}
		} catch (Exception|Error e) {
			if (logval==0)
			{
				parentlogger.log(LogStatus.FAIL, "Following Value" + " " + color.RMA_ChangeColor_Utility(Value.toString(), 3) + " " + "Couldnot Be Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " " + "And The Error Occurred Is" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Following Value" + " " + color.RMA_ChangeColor_Utility(Value.toString(), 3) + " " + "Couldnot Be Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " " + "And The Error Occurred Is" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1));
			}
			throw (e);
		}
	}

	//==============================================================================================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ActionSetValueAndTabOut_Utility
	//Description  		: To Send String On Already In-Focus WebElement
	//Input Parameter 	: Text Value "text" Of Type String To Be Set, Intlogval Value Of The Logger (Parent Or Child Logger), objDesc Description Of The Object, Element (WebElement) On Which The Value Is To Be Set
	//Revision			: 0.0 - DebasmitaPati-08-02-2019
	//==============================================================================================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_ActionSetValueAndTabOut_Utility ( WebElement Element,String objDesc, String text,int logval) throws Exception, Error
	{
		try{			
			Actions ObjAction = new Actions(driver);
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			ObjAction.moveToElement(Element);
			ObjAction.click();
			ObjAction.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			ObjAction.sendKeys(text);
			ObjAction.build().perform();
			Thread.sleep(5000);
			ObjAction.sendKeys(Keys.TAB);	
			ObjAction.build().perform();
			Thread.sleep(5000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In  WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}

		} catch (Exception|Error e)
		{
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			else
			{
				logger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			throw(e);
		}
	}
	//==============================================================================================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ActionSetValueNum_Utility
	//Description  		: To Send String On Already In-Focus WebElement
	//Input Parameter 	: Text Value "text" Of Type String To Be Set, Intlogval Value Of The Logger (Parent Or Child Logger), objDesc Description Of The Object, Element (WebElement) On Which The Value Is To Be Set
	//Revision			: 0.0 - ShrutiShruti-11-21-2019
	//==============================================================================================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_ActionSetValueNum_Utility ( WebElement Element,String objDesc, String text,int logval) throws Exception, Error
	{
		try{			
			Actions ObjAction = new Actions(driver);
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			ObjAction.moveToElement(Element);
			ObjAction.click();
			String[] Ch = text.split("");
			for(int i=0;i<Ch.length;i++)
			{
				String s = Ch[i];
				ObjAction.sendKeys(Keys.chord(s));
				ObjAction.build().perform();
				Thread.sleep(1000);
			}       
			ObjAction.build().perform();
			ObjAction.sendKeys(Keys.TAB);	
			ObjAction.build().perform();
			Thread.sleep(5000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In  WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Set Successfully In WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
		} catch (Exception|Error e)
		{
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text, 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw(e);
		}
	}

	//==============================================================================================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ActionMouseMove_Utility
	//Description  		: To Send String On Already In-Focus WebElement
	//Input Parameter 	: Text Value "text" Of Type String To Be Set, Intlogval Value Of The Logger (Parent Or Child Logger), objDesc Description Of The Object, Element (WebElement) On Which The Value Is To Be Set
	//Revision			: 0.0 - ShrutiShruti-11-21-2019
	//==============================================================================================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_ActionMouseMove_Utility ( WebElement Element,String objDesc,int logval) throws Exception, Error
	{
		try{	
			Actions ObjAction = new Actions(driver);
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			ObjAction.moveToElement(Element);
			//ObjAction.click();			
			ObjAction.clickAndHold(Element).moveByOffset(10, 50).moveByOffset(50,10).moveByOffset(-10,-50).moveByOffset(-50,-10).release().perform();
			Thread.sleep(5000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Mouse Movement Is Successfull:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Mouse Movement Is Successfull :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
		} catch (Exception|Error e)
		{
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Mouse Movement Is Not Successfull :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Mouse Movement Is Not Successfull :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw(e);
		}
	}

	//==============================================================================================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ElementWebListSelectOptions_Utility
	//Description  		: To Select The Element Displayed In The WebList As Per The User Given Options
	//Input Parameter 	: Input Parameters Are :Element, SelectCase, Options, ControlName, PageName, logval 
	//Revision			: 0.0 - DebasmitaPati-05-08-2020
	//==============================================================================================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_ElementWebListSelectOptions_Utility(WebElement Element,String[] SelectCase , String[] Options, String ControlName, String PageName, int logval) throws Exception, Error
	{
		try {
			Thread.sleep(1000);
			Element.click();
			for(int k=0;k<SelectCase.length;k++){	
				switch (SelectCase[k]){						
				case "SelectAll":	
					List<WebElement> selectalloptions = Element.findElements(By.tagName("a"));	
					selectalloptions.get(0).click();	
					Thread.sleep(2000);
					break;
				case "UnSelectAll":	
					List<WebElement> unselectalloptions = Element.findElements(By.tagName("a"));	
					unselectalloptions.get(1).click();	
					Thread.sleep(2000);
					break;				
				case "SelectOptions":					
					for(int i = 0; i< Options.length; i++){	
						List<WebElement> selectoptions = Element.findElements(By.tagName("a"));	
						innerloop:
							for(int j = 2; j< selectoptions.size(); j++){	
								if (selectoptions.get(j).getText().equals(Options[i])) {	
									selectoptions.get(j).click();
									break innerloop;
								}						
							}
					}	
					Thread.sleep(2000);	
					break;
				case "SearchOption":	
					RMA_SetValue_Utility(Element.findElement(By.xpath("//div[@class = 'dropdown-header']/input")), "Search Text Box", Options[0], logval);
					List<WebElement> searchoption = Element.findElements(By.tagName("a"));
					for(WebElement opt : searchoption){	
						if (opt.getText().equals(Options[0])) //select the searched option only
						{	
							opt.click();
							break;
						}						
					}	
					Thread.sleep(2000);
					break;	

				default:

				}
			}
			Element.click();
		} catch (Exception|Error e) {
			if (logval==0)
			{
				parentlogger.log(LogStatus.FAIL, "Following Value" + " " + color.RMA_ChangeColor_Utility(Options.toString(), 3) + " " + "Couldnot Be Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " " + "And The Error Occurred Is" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Following Value" + " " + color.RMA_ChangeColor_Utility(Options.toString(), 3) + " " + "Couldnot Be Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " " + "And The Error Occurred Is" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1));
			}
			throw (e);
		}
	}
	
}