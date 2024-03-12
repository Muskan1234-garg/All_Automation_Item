package rmaseleniumutilties_UX;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

public class RMA_Navigation_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String MenuOptionName;
	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	//==============================================================================================================================================================================================================================================
	//FunctionName 		: RMA_WebCheckBoxSelect_Utility
	//Description  		: To Check The Web CheckBox If It Is Not Checked
	//Input Parameter 	: Element Of Type WebElement: Element To Be Checked Or Unchecked and AttributeToFetch Of Type String: Attribute Value To Be Fetched And String State: Should Be Check Or Uncheck Depending On Whether User Wants To Check Or Not Check The CheckBox 
	//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
	//==============================================================================================================================================================================================================================================
	public static void RMA_WebCheckBoxSelect_Utility(WebElement Element,String State, String ControlName, String PageDesc, int logval) throws Exception, Error
	{
		try {
			String AttributeValue;
			ControlName = color.RMA_ChangeColor_Utility(ControlName, 4);
			PageDesc = color.RMA_ChangeColor_Utility(PageDesc, 4);
			switch (State){
			case "check":
				AttributeValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(Element, "checked");
				if (AttributeValue != null)
				{
					if (logval == 0)
					{
						parentlogger.log(LogStatus.INFO,  ControlName + " " + "On" + " " + PageDesc+ " "+ "Is Already Checked");
					}
					else
					{
						logger.log(LogStatus.INFO,  ControlName + " " + "On" + " " + PageDesc+ " "+ "Is Already Checked");
					}
				}
				if (AttributeValue == null){
					AttributeValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(Element, "disabled");
					if (AttributeValue == null){
						globalWait.until(ExpectedConditions.elementToBeClickable(Element));
						((JavascriptExecutor) driver).executeScript("arguments[0].click();", Element );
						//Element.click();
						if (logval == 0)
						{
							parentlogger.log(LogStatus.INFO,  ControlName + " " + "On" + " " + PageDesc+ " "+ "Is Successfully Checked");
						}
						else
						{
							logger.log(LogStatus.INFO,  ControlName + " " + "On" + " " + PageDesc+ " "+ "Is Successfully Checked");
						}
					}
					else{
						if (logval == 0)
						{
							parentlogger.log(LogStatus.FAIL,  ControlName + " " + "On" + " " + PageDesc+ " "+ color.RMA_ChangeColor_Utility("Cannot Be Checked As It Is In Disabled State",1));
						}
						else
						{
							logger.log(LogStatus.FAIL,  ControlName + " " + "On" + " " + PageDesc+ " "+ color.RMA_ChangeColor_Utility("Cannot Be Checked As It Is In Disabled State",1));	
						}
					}

				}
				break;
			case "uncheck":
				AttributeValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(Element, "checked");
				if (AttributeValue == null){
					if (logval == 0)
					{
						parentlogger.log(LogStatus.INFO,  ControlName + " " + "On" + " " + PageDesc+ " "+ "Is Already Unchecked");
					}
					else
					{
						logger.log(LogStatus.INFO,  ControlName + " " + "On" + " " + PageDesc+ " "+ "Is Already Unchecked");
					}
				}

				if (AttributeValue != null){
					AttributeValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(Element, "disabled");
					if (AttributeValue == null){
						Element.click();
						if (logval == 0){
							parentlogger.log(LogStatus.INFO,  ControlName + " " + "On" + " " + PageDesc+ " "+ "Is Successfully UnChecked");
						}
						else
						{
							logger.log(LogStatus.INFO,  ControlName + " " + "On" + " " + PageDesc+ " "+ "Is Successfully UnChecked");
						}
					}
					else
					{
						if (logval ==0)
						{
							parentlogger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On" + " " + PageDesc+ " "+ color.RMA_ChangeColor_Utility("Cannot Be Unchecked As It Is In Disabled State",1));
						}
						else
						{
							logger.log(LogStatus.FAIL,  ControlName + " " + "On" + " " + PageDesc+ " "+ color.RMA_ChangeColor_Utility("Cannot Be Unchecked As It Is In Disabled State",1));
						}
					}
				}	
			}
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL,  ControlName + " " + "On" + " " + color.RMA_ChangeColor_Utility(PageDesc, 4)+ " "+ color.RMA_ChangeColor_Utility("CouldNot Be Checked Or Unchecked As Following Error Was Encountered",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL,  ControlName + " " + "On" + " " + color.RMA_ChangeColor_Utility(PageDesc, 4)+ " "+ color.RMA_ChangeColor_Utility("CouldNot Be Checked Or Unchecked As Following Error Was Encountered",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}

	//====================================================================================================================================================================================================
	//FunctionName 		: RMA_WebLinkSelect
	//Description  		: To Click On The Link Element Based On The Link Text Provided
	//Input Parameter 	: Link Text Of The Type String 
	//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
	//====================================================================================================================================================================================================
	public static void RMA_WebLinkSelect(String LinkText, String ControlDesc, int logval) throws Exception, Error
	{
		try {
			globalWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText(LinkText))));
			driver.findElement(By.linkText(LinkText)).click();
			ControlDesc = color.RMA_ChangeColor_Utility(ControlDesc, 4);
			LinkText = color.RMA_ChangeColor_Utility(LinkText, 4);
			//RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Thread.sleep(5000);
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO,  "Following Link:" + " " + LinkText + " " +  "On" + ControlDesc + " " + "Is Successfully Clicked");
			}
			else
			{		
				logger.log(LogStatus.INFO,  "Following Link:" + " " + LinkText + " " +  "On" + ControlDesc + " " + "Is Successfully Clicked");
			}
		} catch (Exception|Error e) {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(LinkText, 4) + " " + "Is Not Clicked And Hence The Step Is A Fail" + " " + "Due To Reason" + color.RMA_ChangeColor_Utility(e.getMessage(),1) );		
			}
			else
			{
				logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(LinkText, 4) + " " + "Is Not Clicked And Hence The Step Is A Fail" + " " + "Due To Reason" + color.RMA_ChangeColor_Utility(e.getMessage(),1) );	
			}
			throw (e);
		}
	}

	//======================================================================================================================================================================================
	//FunctionName 		: RMA_WebPartialLinkSelect
	//Description  		: To Click On The Link Element Based On The Partial Link Text Provided
	//Input Parameter 	: PartialLinkText And ControlDesc Of The Type String, logval Of The Type Integer
	//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
	//======================================================================================================================================================================================
	public static void RMA_WebPartialLinkSelect(String PartialLinkText, String ControlDesc, int logval) throws Exception, Error
	{
		try {
			ControlDesc = color.RMA_ChangeColor_Utility(ControlDesc, 4);
			String ParLinkText = color.RMA_ChangeColor_Utility(PartialLinkText, 4);
			//globalWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText(PartialLinkText))));
			Thread.sleep(8000);
			driver.findElement(By.partialLinkText(PartialLinkText)).click();
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO,  "Following Link:" + " " + ParLinkText + " " +  "On" + " "+ ControlDesc + " " + "Is Successfully Clicked");
			}
			else
			{		
				logger.log(LogStatus.INFO,  "Following Link:" + " " + ParLinkText + " " +  "On" + " "+ ControlDesc + " " + "Is Successfully Clicked");
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


	//==================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ObjectClick
	//Description  		: To Click On The Web Element And Provide Suitable Logger Statement
	//Input Parameter 	: Element Of Type WebElement: Element To Be Clicked and ControlDesc: Control Name To Be Clicked
	//Revision			: 0.0 - KumudNaithani-12-18-2015                                 
	//==================================================================================================================================================================================================================================================================================================
	public static void RMA_ObjectClick(WebElement Element, String ControlDesc,int logval) throws Exception, Error
	{
		String ControlDescLabel; 
		ControlDescLabel = color.RMA_ChangeColor_Utility(ControlDesc, 4);
		try {
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			Element.click();
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Clicked");
			}
			else{
				logger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Clicked");
			}
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Clicked And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.INFO,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Clicked And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}

	//================================================================================================================================================================================================================================================================================================
	//FunctionName 		:RMA_ObjectDoubleClick
	//Description  		: To DoubleClick On The Web Element And Provide Suitable Logger Statement
	//Input Parameter 	: Element Of Type WebElement: Element To Be DoubleClicked and ControlDesc: Control Name To Be Clicked
	//Revision			: 0.0 - KumudNaithani-12-18-2015                                 
	//================================================================================================================================================================================================================================================================================================
	public static void RMA_ObjectDoubleClick(WebElement Element, String ControlDesc,int logval) throws Exception, Error
	{
		String ControlDescLabel; 
		ControlDescLabel = color.RMA_ChangeColor_Utility(ControlDesc, 4);
		try {
			Actions oAction = new Actions(driver);
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			oAction.doubleClick(Element).build().perform();
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully DoubleClicked");
			}
			else{
				logger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully DoubleClicked");
			}
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " " + "Is Not Successfully DoubleClicked And The Error Message Is" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.INFO,  ControlDescLabel + " " + "Is Not Successfully DoubleClicked And The Error Message Is" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}


	//================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_SelectWTObjectByValue_Utility
	//Description  		: To select object of Type CheckBox,RadioButton,Link
	//Input Parameter 	: Element Of Type WebElement and SearchText and Class Of Type String
	//Revision			: 0.0 - ImteyazAhmad-12-02-2015                                 
	//================================================================================================================================================================================================================================================================================================
	public static void RMA_SelectWTObjectByValue_Utility(WebElement Element, String SearchedText,  String Class, int logval) throws Exception, Error
	{

		try{
			Class = Class.toUpperCase();
			String Found = "False";
			List<WebElement> tableRows = Element.findElements(By.tagName("tr"));
			switch(Class){
			case "WEBCHECKBOX" :		
				outerloop:
					for (int i=0; i<= tableRows.size()-1; i++)
					{
						List<WebElement> tablecol = tableRows.get(i).findElements(By.tagName("td"));
						for (int j =0; j<=tablecol.size()-1;j++)
						{
							String text = tablecol.get(j).getText();	
							if (text.equalsIgnoreCase(SearchedText)) 
							{
								tablecol.get(0).findElement(By.tagName("input")).click();// Updated By Renu As input box is not able to click on FK screen
								int Rows = Integer.valueOf(i) + 1;
								if (logval ==0){
									parentlogger.log(LogStatus.INFO, "The CheckBox Is Selected Successfully Correspoding To Unique Text :" +" " + color.RMA_ChangeColor_Utility(SearchedText,4) +" " +"Available In Row No : " +" " + Rows);	
								}
								else
								{
									logger.log(LogStatus.INFO, "The CheckBox Is Selected Successfully Correspoding To Unique Text :" +" " + color.RMA_ChangeColor_Utility(SearchedText,4) +" " +"Available In Row No : " +" " + Rows);
								}
								Found ="True";
								break outerloop;
							}
						}
					} 
			if (Found == "False")
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("The provided text :" , 1) +" "+color.RMA_ChangeColor_Utility(SearchedText, 4) +" "+color.RMA_ChangeColor_Utility("is not available in table hence corresponding CheckBox can not be selected ", 1) );
				}
				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("The provided text :" , 1) +" "+color.RMA_ChangeColor_Utility(SearchedText, 4) +" "+color.RMA_ChangeColor_Utility("is not available in table hence corresponding CheckBox can not be selected ", 1) );
				}
				Assert.fail();
			}
			break;
			case "RADIOBUTTON" :
				outerloop:
					for (int i=0; i<= tableRows.size()-1; i++)
					{
						List<WebElement> tablecol = tableRows.get(i).findElements(By.tagName("td"));
						for (int j =0; j<=tablecol.size()-1;j++)
						{
							String text = tablecol.get(j).getText();							
							if (text.equalsIgnoreCase(SearchedText)) 
							{
								//tablecol.get(0).click();	//Commented as this is not worked if Table row is big in size as input box is in corner
								tablecol.get(0).findElement(By.tagName("input")).click();// Updated By Renu As input box is not able to click on FK screen
								int Rows = Integer.valueOf(i) + 1;
								if (logval == 0)
								{
									parentlogger.log(LogStatus.INFO, "The RadioButton is selected successfully corresponding to unique text :" +" " + color.RMA_ChangeColor_Utility(SearchedText,4) +"  " +"available in row no :" +"  " +Rows );
								}
								else
								{
									logger.log(LogStatus.INFO, "The RadioButton is selected successfully corresponding to unique text :" +" " + color.RMA_ChangeColor_Utility(SearchedText,4) +"  " +"available in row no :" +"  " +Rows );
								}
								Found = "True";
								break outerloop;
							}
						}
					} 
			if (Found =="False") 
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("The provided text :" , 1) +" "+color.RMA_ChangeColor_Utility(SearchedText, 4) +color.RMA_ChangeColor_Utility("is not available in table hence corresponding  RadioButton can not be selected ", 1) );
				}
				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("The provided text :" , 1) +" "+color.RMA_ChangeColor_Utility(SearchedText, 4) +color.RMA_ChangeColor_Utility("is not available in table hence corresponding  RadioButton can not be selected ", 1) );
				}
				Assert.fail();
			}
			break;
			case "LINK" :
				outerloop:
					for (int i=0; i<= tableRows.size()-1; i++)
					{
						List<WebElement> tablecol = tableRows.get(i).findElements(By.tagName("td"));
						for (int j =0; j<=tablecol.size()-1;j++)
						{
							String text = tablecol.get(j).getText();	
							if (text.equalsIgnoreCase(SearchedText)) 
							{
								tablecol.get(0).click(); // Updated By RenuVerma As This j value is set instead of  0
								int Rows = Integer.valueOf(i) + 1;
								if (logval == 0)
								{
									parentlogger.log(LogStatus.INFO, "The Link with text: " +" " +color.RMA_ChangeColor_Utility(SearchedText, 4) +" is available in table" +", " +" "  +"in row no :" +"  " +Rows +" and clicked successfully");
								}
								else
								{
									logger.log(LogStatus.INFO, "The Link with text: " +" " +color.RMA_ChangeColor_Utility(SearchedText, 4) +" is available in table" +", " +" "  +"in row no :" +"  " +Rows +" and clicked successfully");
								}
								Found = "True";
								break outerloop;
							}
						}
					}
			if (Found == "False") 
			{
				if (logval == 0)
				{

					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("The Link with text :",1) +" " +color.RMA_ChangeColor_Utility(SearchedText, 4) +color.RMA_ChangeColor_Utility(" is not available in table and hence it can not be selected",1) );
				}
				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("The Link with text :",1) +" " +color.RMA_ChangeColor_Utility(SearchedText, 4) +color.RMA_ChangeColor_Utility(" is not available in table and hence it can not be selected",1) );
				}
				Assert.fail();
			}
			break;
			}
		}catch(Exception|Error e)
		{
			if(logval == 0)
			{
				parentlogger.log(LogStatus.FAIL,color.RMA_ChangeColor_Utility("Error Occurred While Using Method : RMA_SelectWTObjectByValue_Utility and Error Message is :" , 1) +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL,color.RMA_ChangeColor_Utility("Error Occurred While Using Method : RMA_SelectWTObjectByValue_Utility and Error Message is :" , 1) +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw(e);
		}
	}	
	//==========================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_RadioButtonSelect_Utility
	//Description  		: To Check The Web CheckBox If It Is Not Checked
	//Input Parameter 	: Element Of Type WebElement: Element To Be Selected , ControlName of Type String: Name of Radio Button Being Selected, logval: logger type being used
	//Revision			: 0.0 - ImteyazAhmad-01-08-2016                                
	//==========================================================================================================================================================================================================================================================================
	public static void RMA_RadioButtonSelect_Utility(WebElement Element, String ControlName,  int logval) throws Exception, Error
	{
		try {
			String AttributeValue;
			ControlName = color.RMA_ChangeColor_Utility(ControlName, 4);			
			AttributeValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(Element, "disabled");			
			if (AttributeValue != null)
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, ControlName +" " +color.RMA_ChangeColor_Utility("is Disabled Hence Selection Can Not Be Done", 1));
				}
				else
				{
					logger.log(LogStatus.FAIL, ControlName +" " +color.RMA_ChangeColor_Utility("is Disabled Hence Selection Can Not Be Done", 1));
				}
			}

			else
			{
				Element.click();//Radio Button Is Selected
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, ControlName +" " +"is Selected Successfully");
				}
				else
				{
					logger.log(LogStatus.INFO, ControlName +" " +"is Selected Successfully");
				}					
			}
		} catch (Exception|Error e) {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.FAIL,  ControlName + " " + color.RMA_ChangeColor_Utility("Could Not Be Selected  As Following Error Was Encountered",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL,  ControlName + " " + color.RMA_ChangeColor_Utility("Could Not Be Selected As Following Error Was Encountered",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}


	//==========================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ObjectRightClick
	//Description  		: To RightClick On The Web Element And Provide Suitable Logger Statement
	//Input Parameter 	: Element Of Type WebElement: Element To Be Clicked, ControlDesc: Control Name To Be Right Clicked, ElementRightClick: Element To Be RightClicked, ObjDesc: Control Name To Be Clicked, logval: log parameters
	//Revision			: 0.0 - KumudNaithani-12-24-2015                                 
	//==========================================================================================================================================================================================================================================================================
	public static void RMA_ObjectRightClick(WebElement ElementRightClick, String ControlDesc, int logval) throws Exception, Error
	{
		String ControlDescLabel; 
		ControlDescLabel = color.RMA_ChangeColor_Utility(ControlDesc, 4);
		try {
			Actions oAction = new Actions(driver); //Actions Object Is Instantiated
			globalWait.until(ExpectedConditions.elementToBeClickable(ElementRightClick));
			oAction.moveToElement(ElementRightClick); //Mouse Movement To The Element To Be Right Clicked Is Done
			oAction.contextClick(ElementRightClick).build().perform(); //Element Is Right Clicked
			Thread.sleep(3000);//added Wait to Loaded element of right click-- RenuVerma
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Right Clicked");
			}		
			else
			{
				logger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Right Clicked");
			}
		} catch (Exception|Error e) {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.FAIL,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Right Clicked",1));	
			}
			else
			{		
				logger.log(LogStatus.FAIL,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Right Clicked",1));
			}
			throw (e);
		}
	}

	//============================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ObjectActionsClick
	//Description  		: To Click On The Web Element Using Actions Object And Provide Suitable Logger Statement
	//Input Parameter 	: Element Of Type WebElement: Element To Be Clicked and ControlDesc: Control Name To Be Clicked
	//Revision			: 0.0 - KumudNaithani-05-17-2016                                
	//============================================================================================================================================================================================================================================================
	public static void RMA_ObjectActionsClick(WebElement Element, String ControlDesc,int logval) throws Exception, Error
	{
		String ControlDescLabel; 
		ControlDescLabel = color.RMA_ChangeColor_Utility(ControlDesc, 4);
		try {
			Actions action = new Actions(driver);
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			action.moveToElement(Element).click().perform();
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Clicked");
			}
			else{
				logger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Clicked");
			}
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Clicked And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.INFO,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Clicked And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}

	//====================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ObjectJavaScriptClick
	//Description  		: To Click On The Web Element Using JavaScript And Provide Suitable Logger Statement
	//Input Parameter 	: Element Of Type WebElement: Element To Be Clicked and ControlDesc: Control Name To Be Clicked
	//Revision			: 0.0 - ImteyazAhmad-05-24-2016                                
	//====================================================================================================================================================================================================================================================================================================
	public static void RMA_ObjectJavaScriptClick(WebElement Element, String ControlDesc,int logval) throws Exception, Error
	{
		String ControlDescLabel; 
		ControlDescLabel = color.RMA_ChangeColor_Utility(ControlDesc, 4);
		try {
			globalWait.until(ExpectedConditions.elementToBeClickable(Element));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Element );
			Thread.sleep(3000);
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Clicked");
			}
			else
			{
				logger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Clicked");
			}
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Clicked And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.INFO,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Clicked And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}

	//===========================================================================================================================================================================================================
	//FunctionName 		: RMA_MenuOptionClick
	//Description  		: To Click Menu Options On RMA Application Default View
	//Input Parameter 	: MDIMenuItem :MDI Menu Items To Be Clicked Separated By SemiColon; Intlogval
	//Revision			: 0.0 - ImteyazAhmad-06-13-2016         
	//Modified By	    : 0.0 - RenuVerma-04-14-2017: replaced object click instead of action click
	//Modified By	    : 0.1 - KumudNaithani-04-14-2017: Modified As Per The New UX Menu Options
	//==========================================================================================================================================================================================================================
	public static void RMA_MenuOptionClick(String MDIMenuItems, int Intlogval) throws Exception,Error
	{
		String JoinedElement;
		int MenuOptionCount;
		//Local Variable Declaration

		try{
			String[]  MdiMenuList = MDIMenuItems.split(";");
			for (String obj:MdiMenuList)
			{ 
				MenuOptionName = obj;
				List<WebElement> Element = driver.findElements(By.linkText(MenuOptionName));
				if (Element.size() > 0)
				{for (MenuOptionCount=0; MenuOptionCount<Element.size();MenuOptionCount++)
				{	
					if (Element.get(MenuOptionCount).isDisplayed())
					{
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(Element.get(MenuOptionCount), MenuOptionName+" "+"Menu Option",Intlogval);
						break;
					}}
				}
				else
				{if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.FAIL, "Following Menu Option :"+" "+MenuOptionName+" " +"Does Not Exist Hence It Can Not Be Clicked, Please Check Text Provided For RMA_MenuOptionClick");
				}
				else
				{		
					logger.log(LogStatus.FAIL, "Following Menu Option :"+" "+MenuOptionName+" " +"Does Not Exist  Hence It Can Not Be Clicked, Please Check Text Provided For RMA_MenuOptionClick");
				}
				Assert.fail();
				}
			}		
			JoinedElement =StringUtils.join( MdiMenuList," =>> ");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);// Wait For UX Page Load Bar To Disappear
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, color.RMA_ChangeColor_Utility(JoinedElement,4) +" "+"Page Is Loaded");
			}
			else
			{		
				logger.log(LogStatus.INFO, color.RMA_ChangeColor_Utility(JoinedElement,4) +" "+"Page Is Loaded");
			}

		}catch(Exception|Error e)
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, "Following Menu Option :"+" "+MenuOptionName+" " +"Is Not Clicked Successfully And Error Message Is :" +" "+color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{		
				logger.log(LogStatus.FAIL, "Following Menu Option :"+" "+MenuOptionName+" " +"Is Not Clicked Successfully And Error Message Is :" +" "+color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}	
			throw(e);
		}
	}
	//===================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_SikuliObjectClick
	//Description  		: To Click The Pattern Of Screen Using Sikuli
	//Input Parameter 	: P Of Type Pattern: Pattern To Be Clicked and ControlDesc: Control Name To Be Clicked
	//Revision			: 0.0 - RenuVerma-12-27-2016                                 
	//===================================================================================================================================================================================================================================================================================================================
	public static void RMA_SikuliObjectClick(Pattern pattern, String ControlDesc,int logval) throws Exception, Error
	{
		String ControlDescLabel; 
		Screen screen=new Screen();
		ControlDescLabel = color.RMA_ChangeColor_Utility(ControlDesc, 4);
		try {
			screen.wait(pattern);
			screen.click(pattern);
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Clicked");
			}
			else{
				logger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Clicked");
			}
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Clicked And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.INFO,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Clicked And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}

	//===================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_SikuliObjectMouseMove
	//Description  		: Mouse Move To The Pattern Of Screen Using Sikuli
	//Input Parameter 	: P Of Type Pattern: Pattern To Be Clicked and ControlDesc: Control Name To Be Clicked
	//Revision			: 0.0 - RenuVerma-09-15-2017                                 
	//===================================================================================================================================================================================================================================================================================================================
	public static void RMA_SikuliObjectMouseMove(Pattern pattern, String ControlDesc,int logval) throws Exception, Error
	{
		String ControlDescLabel; 
		Screen screen=new Screen();
		ControlDescLabel = color.RMA_ChangeColor_Utility(ControlDesc, 4);
		try {
			screen.wait(pattern);
			screen.mouseMove(pattern);
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Clicked");
			}
			else{
				logger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Clicked");
			}
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Clicked And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.INFO,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Clicked And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}

	//================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_SelectWTObjectsByValue_Utility
	//Description  		: To select object of Type CheckBox,RadioButton,Link
	//Input Parameter 	: Element Of Type WebElement and SearchText and Class Of Type String
	//Revision			: 0.0 - NidhiJha-11-09-2015                                 
	//================================================================================================================================================================================================================================================================================================
	public static void RMA_SelectSpecifiedPositionWTObjectsByValue_Utility(WebElement Element, String SearchedText,  String Class,int checkboxposition, int logval) throws Exception, Error
	{

		try{
			Class = Class.toUpperCase();
			String Found = "False";
			List<WebElement> tableRows = Element.findElements(By.tagName("tr"));
			switch(Class){
			case "WEBCHECKBOX" :		
				outerloop:
					for (int i=0; i<= tableRows.size()-1; i++)
					{
						List<WebElement> tablecol = tableRows.get(i).findElements(By.tagName("td"));
						for (int j =0; j<=tablecol.size()-1;j++)
						{
							String text = tablecol.get(j).getText();	
							if (text.equalsIgnoreCase(SearchedText)) 
							{
								List<WebElement> elementcount = tableRows.get(i).findElements(By.xpath(".//*[@type='checkbox']"));
								//All Elements Of Type CheckBox Are Stored 

								RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(elementcount.get(checkboxposition), "check", "Claimant CheckBox", "Policy Download Page", logval);
								//CheckBox Specified In The Checkboxposition Is Checked 

								int Rows = Integer.valueOf(i) + 1;

								if (logval ==0){
									parentlogger.log(LogStatus.INFO, "The CheckBox Is Selected Successfully Correspoding To Unique Text :" +" " + color.RMA_ChangeColor_Utility(SearchedText,4) +" " +"Available In Row No : " +" " + Rows);	
								}
								else
								{
									logger.log(LogStatus.INFO, "The CheckBox Is Selected Successfully Correspoding To Unique Text :" +" " + color.RMA_ChangeColor_Utility(SearchedText,4) +" " +"Available In Row No : " +" " + Rows);
								}
								Found ="True";
								break outerloop;
							}
						}
					} 
			if (Found == "False")
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("The provided text :" , 1) +" "+color.RMA_ChangeColor_Utility(SearchedText, 4) +" "+color.RMA_ChangeColor_Utility("is not available in table hence corresponding CheckBox can not be selected ", 1) );
				}
				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("The provided text :" , 1) +" "+color.RMA_ChangeColor_Utility(SearchedText, 4) +" "+color.RMA_ChangeColor_Utility("is not available in table hence corresponding CheckBox can not be selected ", 1) );
				}
				Assert.fail();
			}
			break;
			//doing changes for only webcheckbox case


			}
		}catch(Exception|Error e)
		{
			if(logval == 0)
			{
				parentlogger.log(LogStatus.FAIL,color.RMA_ChangeColor_Utility("Error Occurred While Using Method : RMA_SelectWTObjectByValue_Utility and Error Message is :" , 1) +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL,color.RMA_ChangeColor_Utility("Error Occurred While Using Method : RMA_SelectWTObjectByValue_Utility and Error Message is :" , 1) +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw(e);
		}
	}

	//==================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ObjectDragAndDrop
	//Description  		: To Drag An Element And Drop It At A Specific Location
	//Input Parameter 	: Element To be Dragged: ElementFrom, Element Where It To Be Dropped: ElementDrop and Description Of Page : PageDesc
	//Revision			: 0.0 - ShrutiShruti-03-05-2018                                 
	//==================================================================================================================================================================================================================================================================================================
	public static void RMA_ObjectDragAndDrop(WebElement ElementFrom, WebElement ElementTo,String ControlDesc,String ControlDesc1,String PageDesc,int logval) throws Exception, Error
	{
		String ControlDescLabel;
		String ControlDescLabel1;
		ControlDescLabel = color.RMA_ChangeColor_Utility(ControlDesc, 4);
		ControlDescLabel1 = color.RMA_ChangeColor_Utility(ControlDesc1, 4);
		try {
			globalWait.until(ExpectedConditions.elementToBeClickable(ElementFrom));
			globalWait.until(ExpectedConditions.elementToBeClickable(ElementTo));

			Actions action = new Actions(driver);
			action.clickAndHold(ElementFrom).moveToElement(ElementTo).release(ElementTo).build().perform(); 
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Dragged And Dropped At " +ControlDescLabel1+ " On " +PageDesc);
			}
			else{
				logger.log(LogStatus.INFO,  ControlDescLabel + " "  +"Is Successfully Dragged And Dropped At " +ControlDescLabel1+ " On " +PageDesc);
			}
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Dragged And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.INFO,  ControlDescLabel + " " + color.RMA_ChangeColor_Utility("Is Not Successfully Dragged And The Error Message Is",1) + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}

}
