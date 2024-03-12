package rmaseleniumutilties;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_CodeSelection;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
//RMA Package Import Completed

public class RMA_Input_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	static String StrValue;

	//============================================================================================
	//FunctionName 		: RMA_ElementWebListSelect_Utility
	//Description  		: To Select The Element Displayed In The WebList As Per The User Given Selection Value
	//Input Parameter 	: Element Of Type WebElement: Element For Which The Value Is To Be Selected and SelectionElement Of Type String : Value To Be Selected
	//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
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
			Thread.sleep(3000);
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

	//============================================================================================
	//FunctionName 		: RMA_ElementWebListSelect_Utility
	//Description  		: To Select The Element Displayed In The WebList As Per The User Given Selection Value
	//Input Parameter 	: Element Of Type WebElement: Element For Which The Value Is To Be Selected and SelectionElement Of Type Integer: Index Of The Value To Be Selected
	//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
	//============================================================================================
	public static void RMA_ElementWebListSelect_Utility(WebElement Element, int Value, String ControlName, String PageName, int logval) throws Exception, Error
	{
		try {
			Select dropdown = new Select (Element);
			dropdown.selectByIndex(Value);
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO, "Value Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " "+ "Is" +"::" + " " +  color.RMA_ChangeColor_Utility(String.valueOf(Value), 3));	
			}
			else
			{
				logger.log(LogStatus.INFO, "Value Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " "+ "Is" +"::" + " " +  color.RMA_ChangeColor_Utility(String.valueOf(Value), 3));
			}
			Thread.sleep(2000);
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Following Value" + " " +  color.RMA_ChangeColor_Utility(String.valueOf(Value), 3)+ " " + "Couldnot Be Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " " + "Due To The Following Reason" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1));	
			}
			else
			{
				logger.log(LogStatus.FAIL, "Following Value" + " " +  color.RMA_ChangeColor_Utility(String.valueOf(Value), 3)+ " " + "Couldnot Be Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " " + "Due To The Following Reason" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1));
			}
			throw (e);
		}
	}
	//============================================================================================
	//FunctionName 		: RMA_SetTextValueandTabOut_Utility
	//Description  		: To set value in text box followed by Tab out
	//Input Parameter 	: Element Of Type WebElement: Element For Which The text value Is To Be set ,followed by tab out.
	//Revision			: 0.0 - ImteyazAhmad-12-03-2015       
	//Modified By		: 0.0 - RenuVerma-10-05-2016: Updated Method For When Input Code  Pattern Matched More Than One Value.
	//Modified By		: 0.1 - RenuVerma-04-14-2017: Updated As when window switching done just because of delay and while getting window title its return null value
	//============================================================================================
	public static void RMA_SetTextValueandTabOut_Utility (WebElement Element,String objDesc, String text, int logval) throws Exception, Error
	{
		String StrPrimaryWindowHandle;
		String CurrentFrameID;
		int WindowSize;
		String BrowserTitle=null;
		WindowSize=driver.getWindowHandles().size();
		try {	
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			StrPrimaryWindowHandle = driver.getWindowHandle();
			if (!Element.isEnabled())
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Text Box",1) +" " +color.RMA_ChangeColor_Utility(objDesc,4) +" " +color.RMA_ChangeColor_Utility("Is Disabled And Hence The Provided Text",1) +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(),3) +" " +color.RMA_ChangeColor_Utility("CanNot Be Set And Method Name Is : RMA_SetTextValueandTabOut_Utility ",1));	
				}
				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Text Box",1) +" " +color.RMA_ChangeColor_Utility(objDesc,4) +" " +color.RMA_ChangeColor_Utility("Is Disabled And Hence The Provided Text",1) +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(),3) +" " +color.RMA_ChangeColor_Utility("CanNot Be Set And Method Name Is : RMA_SetTextValueandTabOut_Utility ",1));
				}
				Assert.fail();
			}
			Element.click();
			Element.clear(); //To clear the text value if available already
			Element.sendKeys(text);
			Thread.sleep(1000);
			Element.sendKeys(Keys.TAB);
			Thread.sleep(7000);
			//If Input Code  Pattern Matched More Than One Value.
			
			QuickLookupblock: {
				if(driver.getWindowHandles().size()>WindowSize){
					RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
					try{
						BrowserTitle= driver.getTitle();// get opened window title
					} 
					catch (Exception|Error e) {	// If window title is null then moved to primary window
							driver.switchTo().window(StrPrimaryWindowHandle);
							if(!CurrentFrameID.equals("TopWebFrame")){// if window have frame then switch to previous current frame
								RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
								RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);	
							}			
						break QuickLookupblock;// out from the code block 
					}				 				
					if(BrowserTitle.equalsIgnoreCase("Quick Lookup Results")){// if browser title is Quick Lookup Results
						if(RMA_Selenium_POM_CodeSelection.RMAApp_CodeSelection_Btn_ChooseHighlighted(driver)==null){// check ChooseHighlighted button not existed
							System.out.println("Choose Highlighted Not Available");
						}
						else if(RMA_Selenium_POM_CodeSelection.RMAApp_CodeSelection_Btn_ChooseHighlighted(driver)!=null){// check ChooseHighlighted button  existence
							//System.out.println(" Records Available");
							RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_CodeSelection.RMAApp_CodeSelection_Lst_FirstOption(driver), objDesc, logval);// Select first option
							RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_CodeSelection.RMAApp_CodeSelection_Btn_ChooseHighlighted(driver), "First Option From The Open Code Selection Window", logval);// click ChooseHighlighted button
							if (logval ==0)
							{
								parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Selected Successfully From Code Selection Window In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc,4));	
							}
							else
							{
								logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Set Successfully From Code Selection Window In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc,4));
							}
						}
						else if(RMA_Selenium_POM_CodeSelection.RMAApp_CodeSelection_Label_ZeroRecords(driver)==null){// if Zero Records Not Available is also not present
							System.out.println("Zero Records Not Available");
							Assert.assertTrue(RMA_Selenium_POM_CodeSelection.RMAApp_CodeSelection_Label_ZeroRecords(driver)!=null);
						}
						else if (RMA_Selenium_POM_CodeSelection.RMAApp_CodeSelection_Label_ZeroRecords(driver)!=null && RMA_Selenium_POM_CodeSelection.RMAApp_CodeSelection_Btn_AddNew(driver)==null){// if Zero Records Available is present and AddNew is not available
							if (logval ==0)
							{
								parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Not Avaliable On Code Selection Window In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc,4));	
							}
							else
							{
								logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Not Avaliable On Code Selection Code Selection Window In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc,4));
							}
							Assert.assertTrue(RMA_Selenium_POM_CodeSelection.RMAApp_CodeSelection_Label_ZeroRecords(driver)==null);
						}
					}
					driver.switchTo().window(StrPrimaryWindowHandle);// Switch to primary window
					if(!CurrentFrameID.equals("TopWebFrame")){// if window have frame then switch to previous current frame
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);	
					}			
				}
			}
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc,4));	
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc,4));
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
		}
	}

	/*============================================================================================
	FunctionName 		: RMA_SetValue_Utility
	Description  		: To set value in text box followed by Tab out
	Input Parameter 	: Element Of Type WebElement: Element For Which The text value Is To Be set .
	Revision			: 0.0 - ImteyazAhmad-12-17-2015                                 
	============================================================================================*/
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
			Element.clear();// To clear text value if available already			
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

		} catch (Exception|Error e) 			
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
	//FunctionName 		: RMA_ActionSetValue_Utility
	//Description  		: To Set Value In Text Box Using Actions Build Up
	//Input Parameter 	: Element Of Type WebElement: Element For Which The Text Value "text" Of Type String Is To Be Set, logval Value Of The Logger (Parent Or Child Logger), objDesc Description Of The Object
	//Revision			: 0.0 - KumudNaithani-07-28-2016                                
	//============================================================================================
	public static void RMA_ActionSetValue_Utility (WebElement Element,String objDesc, String text, int logval) throws Exception, Error
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
			Element.clear();// To Clear Text Value If Available Already			
			Actions action = new Actions(driver);
			action.sendKeys(Element, text).perform();		
			Thread.sleep(1000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Set Successfully In WebElement :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Set Successfully In WebElement :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}

		} catch (Exception|Error e) 			
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
	//FunctionName 		: RMA_JavaScriptSetValue_Utility
	//Description  		: To Set Value In Text Box Using Java Script
	//Input Parameter 	: Element Of Type WebElement: Element For Which The Text Value "text" Of Type String Is To Be Set, logval Value Of The Logger (Parent Or Child Logger), objDesc Description Of The Object
	//Revision			: 0.0 - ImteyazAhmad-07-29-2016                                
	//============================================================================================	
	public static void RMA_JavaScriptSetValue_Utility(WebElement Element,String objDesc, String text, int logval ) throws Exception, Error

	{
		try{
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].setAttribute('value', '"+text+"')",Element);
			Thread.sleep(1000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Set Successfully In WebElement :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Set Successfully In WebElement :" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}

		} catch (Exception|Error e) 	

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
	
	//==========================================================================================================================================================================================================================
	//FunctionName 		: RMA_ActionSendKeys_Utility
	//Description  		: To Send String On Pre Focussed WebElement
	//Input Parameter 	: Text Value "text" Of Type String Is To Be Set, logval Value Of The Logger (Parent Or Child Logger), objDesc Description Of The Object
	//Revision			: 0.0 - ImteyazAhmad-08-01-2016                                
	//============================================================================================
	public static void RMA_ActionSendKeys_Utility ( String text,String objDesc, int logval) throws Exception, Error
	{
		try
		{			
			Actions ObjAction = new Actions(driver);
			ObjAction.sendKeys(text).build().perform();
			Thread.sleep(1000);
			if (logval==0)
			{
				parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Set Successfully In  WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}
			else
			{
				logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Set Successfully In WebElement:" +" " + color.RMA_ChangeColor_Utility(objDesc, 4));
			}

		} catch (Exception|Error e)
		{
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			else
			{
				logger.log(LogStatus.FAIL, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(text.toUpperCase(), 3) +" " +"Is Not Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility(objDesc, 4) +" " +"And Error Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			throw(e);
		}
	}

	//============================================================================================
	//FunctionName 		: RMA_SelectAllCheckBox
	//Description  		: Select All CheckBox From The Given List Of WebElement
	//Input Parameter 	: checkBoxList: CheckBox object as a list parameter,logval Value Of The Logger (Parent Or Child Logger), ObjDescPage: Description Of The Object
	//Note			: Take The Example from the RMA_Functionality_Utility.RMA_PolicyDownload_Utility
	//Revision			: 0.0 - RenuVerma-08-23-2016                                
	//============================================================================================

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
			System.out.println("Error Occurred While Checking All CheckBoxes :"+" "+e.getMessage());
			throw (e);
		}
	}
	//============================================================================================
	//FunctionName 		: RMA_ElementWebListPartiallySelect_Utility
	//Description  		: To Select The Element Displayed In The WebList As Per The User Given Partial Value Selection
	//Input Parameter 	: Element Of Type WebElement: Element For Which The Value Is To Be Selected and SelectionElement Of Type String : Partial Value To Be Selected
	//Revision			: 0.0 - RenuVerma-01-12-2017                                 
	//============================================================================================
	public static void RMA_ElementWebListPartiallySelect_Utility(WebElement Element, String PartialValue, String ControlName, String PageName, int logval) throws Exception, Error
	{//In Case The User Wants To Select An IntegerValue Then The User Needs To Convert The Integer Value To String Using String.valueOf() Function And Then Pass As An Argument Into The Function
		try {
			boolean Flag=false;
			Select dropdown = new Select (Element);
				List<WebElement> options = dropdown.getOptions();
				for (WebElement option : options) {
				//System.out.println(option.getText()); //output "option1", "option2", "option3"
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

}
