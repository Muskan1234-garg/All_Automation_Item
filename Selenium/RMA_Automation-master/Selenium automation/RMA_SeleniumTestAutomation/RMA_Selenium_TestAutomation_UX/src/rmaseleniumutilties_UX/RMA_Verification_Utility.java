package rmaseleniumutilties_UX;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.testng.Assert;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.StandardDecryptionMaterial;
import org.apache.pdfbox.util.PDFTextStripper;
import com.relevantcodes.extentreports.LogStatus;
import org.sikuli.script.Screen;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Sikuli_Images;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;

public class RMA_Verification_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	public static String ReturnValue;
	public static String StrActualVal1;
	public static String StrActualVal2;
	public static int IntTable_RowsCount;
	public static boolean boolvalue;

	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();

	//==============================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_WebElementExist_Utility
	//Description  		: To Check The Existence Of A Web Element On The Web Page
	//Input Parameter 	: None
	//Revision			: 0.0 - KumudNaithani-11-30-2015                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_ElementExist_Utility(WebElement Element, String ObjectDescription, int logval) throws Exception, Error
	{
		try {
			if (Element != null)
			{
				if (logval ==0)
				{
					parentlogger.log(LogStatus.PASS, "Following Object:" + " " + color.RMA_ChangeColor_Utility(ObjectDescription, 4) + " "+ "Is Found On Application Screen And Hence We Can Continue With Testing");
				}
				else
				{
					logger.log(LogStatus.PASS, "Following Object:" + " " + color.RMA_ChangeColor_Utility(ObjectDescription, 4) + " "+ "Is Found On Application Screen And Hence We Can Continue With Testing");
				}
			}
			else
			{
				if (logval ==0)
				{
					parentlogger.log(LogStatus.FAIL, "Following Object:" + " " + color.RMA_ChangeColor_Utility(ObjectDescription, 4) + " "+ color.RMA_ChangeColor_Utility("Is Not Found On Application Screen And Hence Testing Is DisContinued", 1));	
				}
				else
				{
					logger.log(LogStatus.FAIL, "Following Object:" + " " + color.RMA_ChangeColor_Utility(ObjectDescription, 4) + " "+ color.RMA_ChangeColor_Utility("Is Not Found On Application Screen And Hence Testing Is DisContinued", 1));
				}
			}
			Assert.assertTrue(Element != null);
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Existence Verification For Following Object :" + " " + color.RMA_ChangeColor_Utility(ObjectDescription, 4) + " "+ "Failed As Following Error Occurred" + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Existence Verification For Following Object :" + " " + color.RMA_ChangeColor_Utility(ObjectDescription, 4) + " "+ "Failed As Following Error Occurred" + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			throw (e);
		}
	}

	//==========================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_AttributeFetch_Utility
	//Description  		: To Fetch The Value Of The Attribute Based On The WebElement And Attribute To Fetch Provided By the User
	//Input Parameter 	: Element Of Type WebElement and AttributeToFetch Of Type String
	//Revision			: 0.0 - KumudNaithani-12-02-2015                                 
	//====================================================================================================================================================================================================================================================================================
	public static String RMA_AttributeFetch_Utility(WebElement Element, String AttributeToFetch) throws Exception, Error
	{//In Case The User Wants To Select An IntegerValue Then The User Needs To Convert The Integer Value To String Using String.valueOf() Function And Then Pass As An Argument Into The Function
		try {
			ReturnValue  = Element.getAttribute(AttributeToFetch);
		} catch (Exception|Error e) {
			throw (e);
		}
		return ReturnValue;
	}

	//==============================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_EnbDisbStateVerify_Utility
	//Description  		: To Verify The Enabled Or Disabled State Of The Given Control
	//Input Parameter 	: Element: Web Element Whose State Is To Be Verified
	//Revision			: 0.0 - KumudNaithani-12-04-2015                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_EnbDisbStateVerify_Utility (WebElement Element, String State, String ControlName, int logval) throws Exception, Error
	{
		try {
			switch (State){
			case "enable":
				if (Element.isEnabled())
				{ 
					if (logval ==0)
					{
						parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In Enabled State And Hence Enabled State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");	
					}
					else
					{
						logger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In Enabled State And Hence Enabled State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
				}
				else
				{
					if (logval ==0)
					{
						parentlogger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Disabled State And Hence Enabled State Verification For", 1)  + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
					else
					{
						logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Disabled State And Hence Enabled State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
				}
				Assert.assertTrue(Element.isEnabled());
				break;
			case "disable":
				if (!Element.isEnabled())
				{
					if (logval ==0)
					{
						parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In Disabled State And Hence Disabled State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is Successful");
					}
					else
					{
						logger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In Disabled State And Hence Disabled State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is Successful");
					}
				}
				else
				{
					if (logval ==0)
					{
						parentlogger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Enabled State And Hence Disabled State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
					else
					{
						logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Enabled State And Hence Disabled State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
				}
				Assert.assertFalse(Element.isEnabled());
				break;

			}
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL,  "Enabled/Disabled State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Was Unsuccessful Due To Following Reason" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL,  "Enabled/Disabled State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Was Unsuccessful Due To Following Reason" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}

	//==============================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_SelectDeselecStateVerify_Utility
	//Description  		: To Verify The Selected Or DeSelected State Of The Given Control
	//Input Parameter 	: Element: Web Element Whose State Is To Be Verified
	//Revision			: 0.0 - KumudNaithani-12-04-2015                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_SelectDeselecStateVerification_Utility (WebElement Element, String State, String ControlName, int logval) throws Exception, Error
	{
		try {
			switch (State){
			case "select":
				if (Element.isSelected())
				{
					if (logval ==0)
					{
						parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In Selected State And Hence Selected State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
					else
					{
						logger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In Selected State And Hence Selected State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
				}
				else
				{
					if (logval ==0)
					{
						parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Deselected State And Hence Selected State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));	
					}
					else{
						logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Deselected State And Hence Selected State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
				}
				Assert.assertTrue(Element.isSelected());
				break;
			case "deselect":
				if (!Element.isSelected())
				{
					if (logval==0){
						parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In DeSelected State And Hence Deselected State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");	
					}
					else{
						logger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In DeSelected State And Hence Deselected State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
				}
				else
				{
					if (logval ==0){
						parentlogger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Selected State And Hence Deselected State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));	
					}
					else{
						logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Selected State And Hence Deselected State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
				}
				Assert.assertFalse(Element.isSelected());
				break;

			}
		} catch (Exception|Error e) {
			if (logval ==0){
				parentlogger.log(LogStatus.FAIL,  "Selected Or Deselected State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) +  "CouldNot Be Done Due To Error" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));	
			}
			else{
				logger.log(LogStatus.FAIL,  "Selected Or Deselected State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) +  "CouldNot Be Done Due To Error" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));	
			}
			throw (e);
		}
	}

	//==============================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ObjectDisplayVerify_Utility
	//Description  		: To Verify That Whether The Given Control Is Displayed Or Not Displayed
	//Input Parameter 	: Element: Web Element Whose State Is To Be Verified
	//Revision			: 0.0 - KumudNaithani-12-07-2015                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_ObjectDisplayVerify_Utility (WebElement Element, String State, String ControlName, int logval) throws Exception, Error
	{//Note:: User Should Use Not Displayed Case Only When The Control Is Present In Hidden State On Application Screen At Present
		try {
			switch (State){
			case "displayed": 
				if (Element.isDisplayed())

				{
					if (logval == 0)
					{
						parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is Displayed On Application Screen And Hence Displayed State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
					else{
						logger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is Displayed On Application Screen And Hence Displayed State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
				}
				else
				{
					if (logval==0)
					{
						parentlogger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is Not Displayed On Application Screen And Hence Displayed State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
					else
					{
						logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is Not Displayed On Application Screen And Hence Displayed State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
				}
				Assert.assertTrue(Element.isDisplayed());
				break;
			case "notdisplayed":
				if (!Element.isDisplayed())
				{
					if (logval ==0)
					{
						parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is Not Displayed On Application Screen And Hence Not Displayed State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");	
					}
					else
					{
						logger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is Not Displayed On Application Screen And Hence Not Displayed State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
				}
				else
				{
					if (logval ==0)
					{
						parentlogger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is Displayed On Application Screen And Hence Not Displayed State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
					else
					{
						logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is Not Displayed On Application Screen And Hence Not Displayed State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
				}
				Assert.assertFalse(Element.isDisplayed());
				break;

			}
		} catch (Exception|Error e) {
			if (logval ==0){
				parentlogger.log(LogStatus.FAIL,  "Displayed/NotDisplayed State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) +  "CouldNot Be Done Due To Error" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));	
			}
			else{
				logger.log(LogStatus.FAIL,  "Displayed/NotDisplayed State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) +  "CouldNot Be Done Due To Error" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));		
			}
			throw (e);
		}
	}

	//=============================================================================================================================================================================================================================================v
	//FunctionName 		: RMA_TextCompare
	//Description  		: To Compare Two String Values 
	//Input Parameter 	: ExpectedString, ActualString Containing The Values Of The Values To Be Compared And ObjjDesc Contains Comparison Description To Be Passed In Log Statement
	//Revision			: 0.0 - KumudNaithani-12-07-2015                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_TextCompare(String ExpectedString, String ActualString, String ObjDesc, int logval) throws Exception, Error
	{
		try {
			String ActualStringLabel;
			String ExpectedStringLabel;
			//Local Variable Declaration

			ActualStringLabel = color.RMA_ChangeColor_Utility(ActualString, 2);
			ExpectedStringLabel = color.RMA_ChangeColor_Utility(ExpectedString, 3);

			if (ExpectedString.equalsIgnoreCase(ActualString)){
				if (logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Expected Value" + " "+ ExpectedStringLabel + " " + "And Actual Value" + " " + ActualStringLabel + " "  + "Are Same And Hence" + " " + ObjDesc + " " + "Verification Is Successful" );
				}
				else

					logger.log(LogStatus.PASS, "Expected Value" + " "+ ExpectedStringLabel + " " + "And Actual Value" + " " + ActualStringLabel + " "  + "Are Same And Hence" + " " + ObjDesc + " " + "Verification Is Successful" );
			}
			else{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Expected Value", 1) + " "+ ExpectedStringLabel + " " + color.RMA_ChangeColor_Utility("And Actual Value", 1) + " " + ActualStringLabel + " "  + color.RMA_ChangeColor_Utility("Are Not Same And Hence", 1) + " " + ObjDesc + " " + color.RMA_ChangeColor_Utility("Verification Is Not Successful", 1) ); 
				}

				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Expected Value", 1) + " "+ ExpectedStringLabel + " " + color.RMA_ChangeColor_Utility("And Actual Value", 1) + " " + ActualStringLabel + " "  + color.RMA_ChangeColor_Utility("Are Not Same And Hence", 1) + " " + ObjDesc + " " + color.RMA_ChangeColor_Utility("Verification Is Not Successful", 1) );
				}
			}
			Assert.assertTrue(ExpectedString.equalsIgnoreCase(ActualString));
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Value Comparison For Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + "And Actual Value" + " " + color.RMA_ChangeColor_Utility(ActualString, 3) + " "  + "Is Not Successful And Error Occurred Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Value Comparison For Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + "And Actual Value" + " " + color.RMA_ChangeColor_Utility(ActualString, 3) + " "  + "Is Not Successful And Error Occurred Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}

	//========================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_PartialTextVerification
	//Description  		: To Compare Two String Values 
	//Input Parameter 	: ExpectedString, ActualString Containing The Values Of The Values To Be Compared And ObjjDesc Contains Comparison Description To Be Passed In Log Statement
	//Revision			: 0.0 - KumudNaithani-12-07-2015                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_PartialTextVerification(String ExpectedString, String ActualString, String ObjDesc, int logval) throws Exception, Error
	{
		try {
			String ActualStringLabel;
			String ExpectedStringLabel;
			//Local Variable Declaration

			ActualStringLabel = color.RMA_ChangeColor_Utility(ActualString, 2);
			ExpectedStringLabel = color.RMA_ChangeColor_Utility(ExpectedString, 3);

			if (ActualString.contains(ExpectedString)){
				if (logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Expected Value" + " "+ ExpectedStringLabel + " " + "Is Contained In Actual Value" + " " + ActualStringLabel + " "  + "Hence" + " " + ObjDesc + " " + "Partial Text Verification Is Successful" );
				}
				else
				{

					logger.log(LogStatus.PASS, "Expected Value" + " "+ ExpectedStringLabel + " " + "Is Contained In Actual Value" + " " + ActualStringLabel + " "  + "Hence" + " " + ObjDesc + " " + "Partial Text Verification Is Successful" );
				}
			}
			else{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Expected Value", 1) + " "+ ExpectedStringLabel + " " + color.RMA_ChangeColor_Utility("Is Not Present Partially In Actual Value", 1) + " " + ActualStringLabel + " "  + color.RMA_ChangeColor_Utility("Hence Partial Text Verification Is Not Successful For ", 1) + " " + ObjDesc); 
				}

				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Expected Value", 1) + " "+ ExpectedStringLabel + " " + color.RMA_ChangeColor_Utility("Is Not Present Partially In Actual Value", 1) + " " + ActualStringLabel + " "  + color.RMA_ChangeColor_Utility("Hence Partial Text Verification Is Not Successful For ", 1)+ " " + ObjDesc ); 
				}
			}
			Assert.assertTrue(ActualString.contains(ExpectedString));
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Partial Text Value Comparison For Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + "And Actual Value" + " " + color.RMA_ChangeColor_Utility(ActualString, 3) + " "  + "Is Not Successful And Error Occurred Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Partial Text Value Comparison For Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + "And Actual Value" + " " + color.RMA_ChangeColor_Utility(ActualString, 3) + " "  + "Is Not Successful And Error Occurred Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}

	//======================================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_UnsavedChangeVerification_Utility
	//Description  		: Enables The User To Verify The Existence Of Any Unsaved Change In The Application On WebPage Reload  
	//Input Parameter 	: ObjPageDesc Stores Control And Page Description, logval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger" 
	//Revision			: : 0.0 - KumudNaithani-05-23-2017                               
	//======================================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_UnsavedChangeVerification_Utility(String ObjPageDesc, int Intlogval) throws Exception, Error
	{
		try {
			String Expmsg;
			String ExpBoolVal = Boolean.toString(true);
			Expmsg = "Data has been changed. Are you sure want to move?";
			driver.switchTo().parentFrame(); 
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On" + " "+ObjPageDesc+ " ", Intlogval);
			boolvalue = RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("Yes", "Partial", Expmsg, "Message To Verify Unsaved Data Existence For" + " "+ ObjPageDesc, Intlogval);
			if(ExpBoolVal == Boolean.toString(boolvalue)){
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpBoolVal, 3) + " " + "And Actual Value" + " " + color.RMA_ChangeColor_Utility(Boolean.toString(boolvalue), 2) + " "  + "Are Same And Hence" + " " + "No Modal Dialog With Message Related To Unsaved Data Is Present On" + " "+color.RMA_ChangeColor_Utility(ObjPageDesc, 4));
				}
				else
				{

					logger.log(LogStatus.PASS, "Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpBoolVal, 3) + " " + "And Actual Value" + " " + color.RMA_ChangeColor_Utility(Boolean.toString(boolvalue), 2) + " "  + "Are Same And Hence" + " " + "No Modal Dialog With Message Related To Unsaved Data Is Present On" + " "+color.RMA_ChangeColor_Utility(ObjPageDesc, 4));
				}
			}

			else
			{
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.FAIL, "Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpBoolVal, 3) + " " + "And Actual Value" + " " + color.RMA_ChangeColor_Utility(Boolean.toString(boolvalue), 2) + " "  + "Are Not Same And Hence" + " " + "Modal Dialog With Message Related To Unsaved Data Is Present On" + " "+color.RMA_ChangeColor_Utility(ObjPageDesc, 4));
				}
				else
				{

					logger.log(LogStatus.FAIL, "Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpBoolVal, 3) + " " + "And Actual Value" + " " + color.RMA_ChangeColor_Utility(Boolean.toString(boolvalue), 2) + " "  + "Are Not Same And Hence" + " " + "Modal Dialog With Message Related To Unsaved Data Is Present On" + " "+color.RMA_ChangeColor_Utility(ObjPageDesc, 4));
				}	
			}
			Assert.assertTrue(ExpBoolVal.equalsIgnoreCase(Boolean.toString(boolvalue)));
		} catch (Exception|Error e) {
			throw (e);
		}
	}

	//======================================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_VerifyUXGridSingleText_Utility
	//Description  		: Enables The User To Verify Single Expected Values In A Column,After Finding An Unique Row Based Upon Unique Searched Text Provided  
	//Input Parameter 	:  SearchedText: Provide Unique Text From UXGrid, UXGridDescription:GridDescription,ExpectedValue1,ExpectedCol1,logval
	//Revision			: 0.0 - KumudNaithani-06-22-2016                               
	//======================================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_VerifyUXGridSingleText_Utility(String SearchedText, String UXGridDescription, String ExpectedValue1, int ExpectedCol1, int logval ) throws Exception,Error		
	{
		try
		{	
			String ActualText1 = null;
			String SearchedTextActual;
			int FoundRow = 0;
			boolean Found = false;

			List<WebElement> UX_row = driver.findElements(By.xpath(".//*[@class='ui-grid-row ng-scope']"));
			outerloop:
				for(int i = 0; i< UX_row.size(); i++)
				{
					WebElement Element =UX_row.get(i).findElement(By.xpath(".//*[@class='ng-isolate-scope']"));
					List<WebElement> UX_column = Element.findElements(By.cssSelector("div[class^='ui-grid-cell ng-scope ui-grid-coluiGrid']"));
					for(int j=0; j< UX_column.size(); j++)
					{
						SearchedTextActual = UX_column.get(j).getText().trim();
						if (SearchedTextActual.equalsIgnoreCase(SearchedText.trim()))
						{
							FoundRow = i;
							Found = true;
							break outerloop;
						}
					}
				}

			if (Found == true)
			{
				WebElement Element =UX_row.get(FoundRow).findElement(By.xpath(".//*[@class='ng-isolate-scope']"));
				List<WebElement> UX_column = Element.findElements(By.cssSelector("div[class^='ui-grid-cell ng-scope ui-grid-coluiGrid']"));
				ActualText1 = UX_column.get(ExpectedCol1-1).getText().trim();
				if (ActualText1.equalsIgnoreCase(ExpectedValue1.trim()))
				{
					if (logval == 0)
					{
						parentlogger.log(LogStatus.PASS, "Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue1,3) +" "+"Is Matched With Actual Value :"+" " +color.RMA_ChangeColor_Utility(ActualText1,2) +" " +",In Column :" +" " +ExpectedCol1 +" " +"Corresponding To Indentifier SearchedText :" +" "  +color.RMA_ChangeColor_Utility(SearchedText,2) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Verification Is Successfull");
						parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UX Grid Verfication", UXGridDescription)));
					}
					else
					{
						logger.log(LogStatus.PASS, "Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue1,3) +" "+"Is Matched With Actual Value :"+" " +color.RMA_ChangeColor_Utility(ActualText1,2) +" " +",In Column :" +" " +ExpectedCol1 +" " +"Corresponding To Indentifier SearchedText :" +" "  +color.RMA_ChangeColor_Utility(SearchedText,2) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Verification Is Successfull");
						logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UX Grid Verfication", UXGridDescription)));
					}
				}
				else
				{
					if (logval == 0)
					{
						parentlogger.log(LogStatus.FAIL, "Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue1,3) +" "+"Is Not Matched With Actual Value :"+" " +color.RMA_ChangeColor_Utility(ActualText1,2) +" " +",In Column :" +" " +ExpectedCol1 +" " +"Corresponding To Indentifier SearchedText :" +" "  +color.RMA_ChangeColor_Utility(SearchedText,2) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Verification Is Unsuccessfull");
					}
					else
					{ 
						logger.log(LogStatus.FAIL, "Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue1,3) +" "+"Is Not Matched With Actual Value :"+" " +color.RMA_ChangeColor_Utility(ActualText1,2) +" " +",In Column :" +" " +ExpectedCol1 +" " +"Corresponding To Indentifier SearchedText :" +" "  +color.RMA_ChangeColor_Utility(SearchedText,2) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Verification Is Unsuccessfull");
					}
					Assert.fail();
				}	
			}

			else
			{			
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, "SearchedText : " +" " +color.RMA_ChangeColor_Utility(SearchedText,2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
				}
				else
				{
					logger.log(LogStatus.FAIL, "SearchedText : " +" " +color.RMA_ChangeColor_Utility(SearchedText,2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
				}
				Assert.fail();
			}

		}catch(Exception|Error e)

		{
			throw(e);
		}
	}

	//======================================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_VerifyUXRowColumnCount_Utility
	//Description  		: Enables The User To Verify  Row Count And Column Count 
	//Input Parameter 	:  SearchedText: Provide Unique Text From UXGrid, UXGridDescription:GridDescription,logval
	//Revision			: 0.0 - AbhishekRai-11-08-2017                               
	//======================================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_VerifyUXRowColumnCount_Utility(String SearchType,int SearchTypeCount, String UXGridDescription, int logval ) throws Exception,Error		
	{
		try
		{
			int UX_ActualCount =0;				
			boolean Found = false;

			switch (SearchType)
			{
			case "row":
				List<WebElement> UX_row = driver.findElements(By.xpath(".//*[@class='ui-grid-row ng-scope']"));
				UX_ActualCount = UX_row.size();
				Found = true;
				break;

			case "column":
				List<WebElement> UX_column = driver.findElements(By.xpath(".//*[@class='ui-grid-cell-contents ui-grid-header-cell-primary-focus']"));
				UX_ActualCount = UX_column.size();
				Found = true;
				break;
			}
			if (Found == true)
			{					
				if (UX_ActualCount == SearchTypeCount)
				{
					if (logval == 0)
					{
						parentlogger.log(LogStatus.PASS, "Expected " + SearchType.toUpperCase() + " Value : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(SearchTypeCount),3) +" "+"Is Matched With Actual" + SearchType.toUpperCase() + "  Value :"+" " +color.RMA_ChangeColor_Utility(String.valueOf(UX_ActualCount),2) +" " +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Verification Is Successfull");
						parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UX Grid Verfication", UXGridDescription)));
					}
					else
					{
						logger.log(LogStatus.PASS, "Expected " + SearchType.toUpperCase() + "  Value : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(SearchTypeCount),3) +" "+"Is Matched With Actual " + SearchType.toUpperCase() + "   Value :"+" " +color.RMA_ChangeColor_Utility(String.valueOf(UX_ActualCount),2) +" " +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Verification Is Successfull");
						logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UX Grid Verfication", UXGridDescription)));
					}
				}
				else
				{
					if (logval == 0)
					{
						parentlogger.log(LogStatus.FAIL, "Expected " + SearchType.toUpperCase() + "  Value : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(SearchTypeCount),3) +" "+"Is Not Matched With Actual " + SearchType.toUpperCase() + "   Value :"+" " +color.RMA_ChangeColor_Utility(String.valueOf(UX_ActualCount),2) +" " +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Verification Is Unsuccessfull");
					}
					else
					{ 
						logger.log(LogStatus.FAIL, "Expected " + SearchType.toUpperCase() + "  Value : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(SearchTypeCount),3) +" "+"Is Not Matched With Actual " + SearchType.toUpperCase() + "   Value :"+" " +color.RMA_ChangeColor_Utility(String.valueOf(UX_ActualCount),2) +" " +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Verification Is Unsuccessfull");
					}
					Assert.fail();
				}	
			}

			else
			{			
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, "SearchedText : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(SearchTypeCount),2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
				}
				else
				{
					logger.log(LogStatus.FAIL, "SearchedText : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(SearchTypeCount),2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
				}
				Assert.fail();
			}

		}catch(Exception|Error e)

		{
			throw(e);
		}
	}


	//=====================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_VerifyRecordNotExistInUXGrid_Utility
	//Description  		: Enables The User To Verify Records Does Not Exist In UXGrid  
	//Input Parameter 	:  SearchedText: Name Of The Record To Be Validated For Non Existence, UXGridDescription:GridDescription, logval
	//Revision			: 0.0 - ImteyazAhmad-08-24-2016                               
	//=====================================================================================================================================================================================================================================================
	public static void RMA_VerifyRecordNotExistInUXGrid_Utility(String SearchedText, String UXGridDescription, int logval ) throws Exception,Error		
	{
		try
		{	
			String SearchedTextActual;
			boolean Found = false;

			List<WebElement> UX_row = driver.findElements(By.xpath(".//*[@class='ui-grid-row ng-scope']"));
			
			if (UX_row.size() < 1 )
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "The Record"+" "+color.RMA_ChangeColor_Utility(SearchedText, 3) +" "+"Does Not Exist In"+" "+color.RMA_ChangeColor_Utility(UXGridDescription, 4)+" "+"Hence Testing Can Be Continued");
				}
				else
				{
					logger.log(LogStatus.PASS, "The Record"+" "+color.RMA_ChangeColor_Utility(SearchedText, 3) +" "+"Does Not Exist In"+" "+color.RMA_ChangeColor_Utility(UXGridDescription, 4)+" "+"Hence Testing Can Be Continued");
				}
			}
			else
			{
				outerloop:
					for(int i = 0; i< UX_row.size(); i++)
					{
						WebElement Element =UX_row.get(i).findElement(By.xpath(".//*[@class='ng-isolate-scope']"));
						List<WebElement> UX_column = Element.findElements(By.cssSelector("div[class^='ui-grid-cell ng-scope ui-grid-coluiGrid']"));
						for(int j=0; j< UX_column.size(); j++)
						{
							SearchedTextActual = UX_column.get(j).getText().trim();
							if (SearchedTextActual.equalsIgnoreCase(SearchedText.trim()))
							{
								Found = true;
								break outerloop;
							}
						}
					}

			if (Found == false)
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "The Record"+" "+color.RMA_ChangeColor_Utility(SearchedText, 3) +" "+"Does Not Exist In"+" "+color.RMA_ChangeColor_Utility(UXGridDescription, 4)+" "+"Hence Testing Can Be Continued");
				}
				else
				{
					logger.log(LogStatus.PASS, "The Record"+" "+color.RMA_ChangeColor_Utility(SearchedText, 3) +" "+"Does Not Exist In"+" "+color.RMA_ChangeColor_Utility(UXGridDescription, 4)+" "+"Hence Testing Can Be Continued");
				}
			}

			else
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, "The Record"+" "+color.RMA_ChangeColor_Utility(SearchedText, 3) +" "+"Exists In"+" "+color.RMA_ChangeColor_Utility(UXGridDescription, 4)+" "+color.RMA_ChangeColor_Utility("Hence Testing Can Not Be Continued",1));
				}
				else
				{
					logger.log(LogStatus.FAIL, "The Record"+" "+color.RMA_ChangeColor_Utility(SearchedText, 3) +" "+"Exists In"+" "+color.RMA_ChangeColor_Utility(UXGridDescription, 4)+" "+color.RMA_ChangeColor_Utility("Hence Testing Can Not Be Continued",1));
				}
				Assert.fail();
			}

			}

		}catch(Exception|Error e)

		{
			throw(e);
		}
	}

	//==============================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_SikuliPatternExist_Utility
	//Description  		: To Check The Existence Of A Pattern On The Screen
	//Input Parameter 	: pattern: To check the pattern on the screen,ObjectDescription: describe the object description, logval
	//Revision			: 0.0 - RenuVerma-12-27-2016                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static boolean RMA_SikuliPatternExist_Utility(Pattern pattern, String ObjectDescription, int logval) throws Exception, Error
	{
		boolean Found=false;
		try {
			Screen screen=new Screen();
			if (screen.exists(pattern) != null)
			{
				if (logval ==0)
				{
					parentlogger.log(LogStatus.PASS, "Following Object:" + " " + color.RMA_ChangeColor_Utility(ObjectDescription, 4) + " "+ "Is Found On Application Screen And Hence We Can Continue With Testing");
				}
				else
				{
					logger.log(LogStatus.PASS, "Following Object:" + " " + color.RMA_ChangeColor_Utility(ObjectDescription, 4) + " "+ "Is Found On Application Screen And Hence We Can Continue With Testing");
				}
				Found=true;
			}
			else
			{
				if (logval ==0)
				{
					parentlogger.log(LogStatus.FAIL, "Following Object:" + " " + color.RMA_ChangeColor_Utility(ObjectDescription, 4) + " "+ color.RMA_ChangeColor_Utility("Is Not Found On Application Screen And Hence Testing Is DisContinued", 1));	
				}
				else
				{
					logger.log(LogStatus.FAIL, "Following Object:" + " " + color.RMA_ChangeColor_Utility(ObjectDescription, 4) + " "+ color.RMA_ChangeColor_Utility("Is Not Found On Application Screen And Hence Testing Is DisContinued", 1));
				}
				Found=false;
			}
			Assert.assertTrue(pattern != null);
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Existence Verification For Following Object :" + " " + color.RMA_ChangeColor_Utility(ObjectDescription, 4) + " "+ "Failed As Following Error Occurred" + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Existence Verification For Following Object :" + " " + color.RMA_ChangeColor_Utility(ObjectDescription, 4) + " "+ "Failed As Following Error Occurred" + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			throw (e);
		}
		return Found;
	}
	//=============================================================================================================================================================================================================================================
	//FunctionName 		: RMA_VerifyLoadingBarDisappered
	//Description  		: To Verify Loading Bar on The Application Screen
	//Input Parameter 	: None
	//Revision			: 0.0 - RenuVerma-12-30-2015                                 
	//=============================================================================================================================================================================================================================================
	public static void RMA_VerifyLoadingBarDisappered( int logval) throws Exception, Error
	{
		String CurrentFrameId;
		try {
			CurrentFrameId=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			driver.switchTo().parentFrame();
			globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='pleaseWaitFrame']/img")));// Wait For Load Image To Be Disappear
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameId);					
			if (logval ==0)
			{
				parentlogger.log(LogStatus.PASS, "Loading Bar Is Getting Dissappeared From Application Screen, Hence We Can Continue With Testing");
			}
			else
			{
				logger.log(LogStatus.PASS, "Loading Bar Is Getting Dissappeared From Application Screen, Hence We Can Continue With Testing");
			}
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Existence Verification For Following Object :" + " " + color.RMA_ChangeColor_Utility("Loading Bar", 4) + " "+ "Failed As Following Error Occurred" + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Existence Verification For Following Object :" + " " + color.RMA_ChangeColor_Utility("Loading Bar", 4) + " "+ "Failed As Following Error Occurred" + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			throw (e);
		}
	}
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_CheckedUncheckedStateVerification_Utility
	//Description  		: To Verify The Checked And Unchecked State Of The Given Control
	//Input Parameter 	: Element: Web Element Whose State Is To Be Verified, State: checked and unchecked, ControlName: Name of the control, logval
	//Revision			: 0.0 - RenuVerma-01-25-2017                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_CheckedUncheckedStateVerification_Utility (WebElement Element, String State, String ControlName, int logval) throws Exception, Error
	{
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;	
			String flag=jsExecutor.executeScript("return arguments[0].checked;", Element).toString() ;
			switch (State){			
			case "checked":		
			{
				if (flag=="true")
				{
					if (logval ==0)
					{
						parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In Checked State And Hence Checked State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
					else
					{
						logger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In Checked State And Hence Checked State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
				}
				else
				{
					if (logval ==0)
					{
						parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Unchecked State And Hence Checked State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));	
					}
					else{
						logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Unchecked State And Hence Checked State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
				}
				Assert.assertTrue(flag=="true");
				break;
			}
			case "unchecked":
			{
				if (flag=="false")
				{
					if (logval==0){
						parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In Unchecked State And Hence Unchecked State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");	
					}
					else{
						logger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In Unchecked State And Hence Unchecked State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
				}
				else
				{
					if (logval ==0){
						parentlogger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Checked State And Hence Unchecked State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));	
					}
					else{
						logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Checked State And Hence Unchecked State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
				}
				Assert.assertFalse(flag=="true");
				break;
			}
			default:
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "State Variable" + " "+State+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "State Variable" + " "+State+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}

			}
		} catch (Exception|Error e) {
			if (logval ==0){
				parentlogger.log(LogStatus.FAIL,  "Checked Or Unchecked State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) +  "CouldNot Be Done Due To Error" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));	
			}
			else{
				logger.log(LogStatus.FAIL,  "Checked Or Unchecked State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) +  "CouldNot Be Done Due To Error" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));	
			}
			throw (e);
		}
	}
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_VerifyUXSpinnerDisappered
	//Description  		: To Verify UX Spinner Is Getting Disappeared on The RMA Application Screen
	//Input Parameter 	: None
	//Revision			: 0.0 - RenuVerma-03-01-2017                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_VerifyUXSpinnerDisappered( int logval) throws Exception, Error
	{
		//String CurrentFrameId;
		try {
			//CurrentFrameId=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//driver.switchTo().parentFrame();
			WebDriverWait WebDriverWait = new WebDriverWait(driver, 20);
			WebDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("spinner")));// Wait For Load Image To Be Disappear
			//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameId);					
			if (logval ==0)
			{
				parentlogger.log(LogStatus.PASS, "UX Spinner Not Present On Application Screen, Hence We Can Continue With Testing");
			}
			else
			{
				logger.log(LogStatus.PASS, "UX Spinner Is Not Present On Application Screen, Hence We Can Continue With Testing");
			}
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Existence Verification For Following Object :" + " " + color.RMA_ChangeColor_Utility("UX Spinner", 4) + " "+ "Failed As Following Error Occurred" + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Existence Verification For Following Object :" + " " + color.RMA_ChangeColor_Utility("UX Spinner", 4) + " "+ "Failed As Following Error Occurred" + color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}

			throw (e);
		}
	}
	//============================================================================================================================================================
	//FunctionName 		: RMA_ToolTip_Verification
	//Description  		: To Tool Tip Information While Doing mouse hover
	//Input Parameter 	: Element:  field where do mouse hover
	//Revision			: 0.0 - RenuVerma-04-19-2017    
	//Modified By       : 0.0 - KumudNaithani-05-17-2017-Changed Function Definition And Name To Include Steps To Verify Tool-Tip Apart From Fetching The Same
	// ==========================================================================================================================================================
	public static void RMA_ToolTip_Verification(WebElement Element, String ExpectedToolTipText, String ObjDesc, int logval) throws Exception,Error
	{	
		String ActualToolTipText;
		try{			
			// Use action class to mouse hover on given element
			Actions action = new Actions(driver);
			action.moveToElement(Element).build().perform();
			//WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));

			// To get the tool tip text and assert
			ActualToolTipText= Element.getAttribute("uib-tooltip");

			//Assert.assertEquals("We ask for your age only for statistical purposes.", toolTipText);	
			
			if (ExpectedToolTipText.equalsIgnoreCase(ActualToolTipText)){
				if (logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Expected ToolTip" + " "+ color.RMA_ChangeColor_Utility(ExpectedToolTipText, 3) + " " + "And Actual ToolTip" + " " + color.RMA_ChangeColor_Utility(ActualToolTipText, 2) + " "  + "Are Same And Hence" + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + "ToolTip Verification Is Successful" );
				}
				else
				{

					logger.log(LogStatus.PASS, "Expected ToolTip" + " "+ color.RMA_ChangeColor_Utility(ExpectedToolTipText, 3) + " " + "And Actual ToolTip" + " " + color.RMA_ChangeColor_Utility(ActualToolTipText, 2) + " "  + "Are Same And Hence" + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + "ToolTip Verification Is Successful" );
				}
			}

			else{

				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, "Expected ToolTip" + " "+ color.RMA_ChangeColor_Utility(ExpectedToolTipText, 3) + " " + "And Actual ToolTip" + " " + color.RMA_ChangeColor_Utility(ActualToolTipText, 2) + " "  + "Are Not Same And Hence" + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + "ToolTip Verification Is UnSuccessful" );
				}
				else
				{

					logger.log(LogStatus.FAIL, "Expected ToolTip" + " "+ color.RMA_ChangeColor_Utility(ExpectedToolTipText, 3) + " " + "And Actual ToolTip" + " " + color.RMA_ChangeColor_Utility(ActualToolTipText, 2) + " "  + "Are Not Same And Hence" + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + "ToolTip Verification Is UnSuccessful" );
				}

			}
			Assert.assertEquals(ActualToolTipText, ExpectedToolTipText);
		}
		catch(Exception|Error e){
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Following Exception Occurred While Verifying ToolTip Content "  + e.getMessage() );  
			}
			else
			{
				logger.log(LogStatus.FAIL, "Following Exception Occurred While Verifying ToolTip Contents" +  " " + e.getMessage() );   
			}
			throw(e);
		}
	}
	//=====================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_VerifyUXGrid_Utility
	//Description  		: Enables The User To Verify Two Expected Values In Two Different Columns,After Finding An Unique Row Based Upon Unique Searched Text Provided  
	//Input Parameter 	:  SearchedText: Provide Unique Text From UXGrid, UXGridDescription:GridDescription,ExpectedColHeadersToBeVerified: Expected Col Headers To Be Verified separated by ';'(e.g. Reserve Type, Balance on Financial Reserve Grid),ExpectedValuesToBeVerified:Expected Values To Be Verified (e.g. Reserve Type value, Balance value on Financial Reserve Grid),logval
	//Revision			: 0.0 - RenuVerma-06-07-2017                               
	//=====================================================================================================================================================================================================================================================
	public static void RMA_VerifyUXGrid_Utility(String SearchedText, String UXGridDescription,  String[] ExpectedColHeadersToBeVerified, Object[] ExpectedValuesToBeVerified,int logval ) throws Exception,Error		
	{
		int FoundRow;// To find row id of search text
		String ActualText;
		int FoundCol;// to find column index of the given expected value
		String SearchedTextActual;
		try
		{					
			if(ExpectedColHeadersToBeVerified.length==ExpectedValuesToBeVerified.length)// Check the length of the given Column header should equal to Given Column Values
			{
				SearchedTextActual=null;//initialize 
				FoundRow = -1;

				List<WebElement> UX_row = driver.findElements(By.xpath(".//*[@class='ui-grid-row ng-scope']"));// Xpath of the Row of The UX grid
				outerloop:
					for(int i = 0; i< UX_row.size(); i++) // run the loop to which DOM row matching with the given expected SearchedText
					{
						WebElement Element =UX_row.get(i).findElement(By.xpath(".//*[@class='ng-isolate-scope']"));// Xpath of the Row value The UX grid
						List<WebElement> UX_column = Element.findElements(By.cssSelector("div[class^='ui-grid-cell ng-scope ui-grid-coluiGrid']"));// CSS Selector of the Corresponding Column of the  Search Text row Of The UX grid
						for(int j=0; j< UX_column.size(); j++)// run the loop to which DOM column to the corresponding row matching with the given expected SearchedText
						{
							//SearchedTextActual = UX_column.get(j).getText().trim();//Get each search text value
							SearchedTextActual =((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", UX_column.get(j) ).toString();
							if (SearchedTextActual.trim().equalsIgnoreCase(SearchedText.trim()))// compare DOM column to the corresponding row with the given expected SearchedText
							{
								FoundRow = i;// Store row 
								break outerloop;
							}
						}
					}
				for(int k=0;k<ExpectedColHeadersToBeVerified.length;k++)// Outer loop for given column size and find expected value column no
				{
					FoundCol=-1;
					ActualText = null;
					SearchedTextActual=null;//re initialize again

					List<WebElement> UX_Headercolumn = driver.findElements(By.xpath(".//*[@class='ui-grid-header-cell-label ng-binding']"));// xpath for the column header
					for(int j=0; j< UX_Headercolumn.size(); j++)// run the loop for each DOM column header matching with the given expected column header
					{
						SearchedTextActual =((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", UX_Headercolumn.get(j) ).toString();
						if (SearchedTextActual.trim().equalsIgnoreCase(ExpectedColHeadersToBeVerified[k].trim()))// If DOM column header is equal to given expected column header
						{
							FoundCol = j;// store value in FoundCol
							break;
						}
					}
					if(FoundCol==-1){
						if (logval == 0)
						{
							parentlogger.log(LogStatus.FAIL, "Expected Column Header : " +" " +color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[k],2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
						}
						else
						{
							logger.log(LogStatus.FAIL, "Expected Column Header : " +" " +color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[k],2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
						}

						Assert.assertTrue(SearchedTextActual.equalsIgnoreCase(ExpectedColHeadersToBeVerified[k].trim()));
					}

					if (FoundRow != -1)// if given searched text found
					{
						WebElement Element =UX_row.get(FoundRow).findElement(By.xpath(".//*[@class='ng-isolate-scope']"));// Xpath of the Found Row value The UX grid
						List<WebElement> UX_column = Element.findElements(By.cssSelector("div[class^='ui-grid-cell ng-scope ui-grid-coluiGrid']"));// CSS Selector of the Corresponding Column of the found row Of The UX grid
						ActualText =((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", UX_column.get(FoundCol)).toString();
						if (ActualText.trim().equalsIgnoreCase(String.valueOf(ExpectedValuesToBeVerified[k]).trim()))// if found column text value is equal to expected value
						{
							if (logval == 0)
							{
								parentlogger.log(LogStatus.PASS, "Expected Values : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(ExpectedValuesToBeVerified[k]),3) +" Are Matched With Actual Values :"+" " +color.RMA_ChangeColor_Utility(ActualText,2) +" , In Column :" +" " +color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[k],4) +" " +"And " +" " +" " +"Respectively, Corresponding To Indentifier SearchedText :" +" "  +color.RMA_ChangeColor_Utility(SearchedText,2) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Verification Is Successfull");
							}
							else
							{
								logger.log(LogStatus.PASS, "Expected Values : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(ExpectedValuesToBeVerified[k]),3) +" Are Matched With Actual Values :"+" " +color.RMA_ChangeColor_Utility(ActualText,2) +", In Column :" +" " +color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[k],4) +" " +"And " +" " +" " +"Respectively, Corresponding To Indentifier SearchedText :" +" "  +color.RMA_ChangeColor_Utility(SearchedText,2) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Verification Is Successfull");
							}
						}
						else// if found column text value is not equal to expected value
						{
							if (logval == 0)
							{
								parentlogger.log(LogStatus.FAIL, "Expected Values : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(ExpectedValuesToBeVerified[k]),3) +" Are Not Matched With Actual Values :"+" " +color.RMA_ChangeColor_Utility(ActualText,2) +" , In Column :" +" " +color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[k],4) +" " +"And " +" "  +" " +"Respectively, Corresponding To Indentifier SearchedText :" +" "  +color.RMA_ChangeColor_Utility(SearchedText,2) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+color.RMA_ChangeColor_Utility(", And Hence Verification Is Not Successfull",1));
							}
							else
							{ 
								logger.log(LogStatus.FAIL, "Expected Values : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(ExpectedValuesToBeVerified[k]),3) +" Are Not Matched With Actual Values :"+" " +color.RMA_ChangeColor_Utility(ActualText,2) +" , In Column :" +" " +ExpectedColHeadersToBeVerified[k] +" " +"And " +" "  +" " +"Respectively, Corresponding To Indentifier SearchedText :" +" "  +color.RMA_ChangeColor_Utility(SearchedText,2) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+color.RMA_ChangeColor_Utility(", And Hence Verification Is Not Successfull",1));
							}
							Assert.assertTrue(ActualText.equalsIgnoreCase(ExpectedValuesToBeVerified[k].toString().trim()));
						}	
					}
					else// if Search Text not found in any row text value 
					{			
						if (logval == 0)
						{
							parentlogger.log(LogStatus.FAIL, "SearchedText : " +" " +color.RMA_ChangeColor_Utility(SearchedText,2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
						}
						else
						{
							logger.log(LogStatus.FAIL, "SearchedText : " +" " +color.RMA_ChangeColor_Utility(SearchedText,2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
						}
						Assert.assertTrue(FoundRow!= -1);
					}
				}
				if (logval == 0)//Final screen shot
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UX Grid Verfication", UXGridDescription)));
				}
				else
				{ 
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UX Grid Verfication", UXGridDescription)));
				}
			}
			else{  //if  Check the length of the given Column header is not equal to Given Column Values
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, "Expected Values To Be Verified : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(ExpectedValuesToBeVerified.length),2) +" " +"Is Not Equal To Expected Column Headers To Be Verified: " +" " + color.RMA_ChangeColor_Utility(String.valueOf(ExpectedColHeadersToBeVerified.length),2) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
				}
				else
				{
					logger.log(LogStatus.FAIL, "Expected Values To Be Verified : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(ExpectedValuesToBeVerified.length),2) +" " +"Is Not Equal To Expected Column Headers To Be Verified: " +" " + color.RMA_ChangeColor_Utility(String.valueOf(ExpectedColHeadersToBeVerified.length),2) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
				}
				Assert.assertTrue(ExpectedColHeadersToBeVerified.length==ExpectedValuesToBeVerified.length);
			}
		}
		catch(Exception|Error e)
		{
			throw(e);
		}
	}
	//=====================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_VerifyUXGridPartially_Utility
	//Description  		: Enables The User To Verify Two Expected Values In Two Different Columns,After Finding An Unique Row Based Upon Unique Searched Text Provided  
	//Input Parameter 	:  SearchedText: Provide Unique Text From UXGrid, UXGridDescription:GridDescription,ExpectedColHeadersToBeVerified: Expected Col Headers To Be Verified separated by ';'(e.g. Reserve Type, Balance on Financial Reserve Grid),ExpectedValuesToBeVerified:Expected Values To Be Verified (e.g. Reserve Type value, Balance value on Financial Reserve Grid),logval
	//Revision			: 0.0 - RenuVerma-06-07-2017                               
	//=====================================================================================================================================================================================================================================================
	public static void RMA_VerifyUXGridPartially_Utility(String SearchedText, String UXGridDescription,  String[] ExpectedColHeadersToBeVerified, Object[] ExpectedPartialValuesToBeVerified,int logval ) throws Exception,Error		
	{
		int FoundRow;// To find row id of search text
		String ActualText;
		int FoundCol;// to find column index of the given expected value
		String SearchedTextActual;
		try
		{					
			if(ExpectedColHeadersToBeVerified.length==ExpectedPartialValuesToBeVerified.length)// Check the length of the given Column header should equal to Given Column Values
			{
				SearchedTextActual=null;//initialize 
				FoundRow = -1;

				List<WebElement> UX_row = driver.findElements(By.xpath(".//*[@class='ui-grid-row ng-scope']"));// Xpath of the Row of The UX grid
				outerloop:
					for(int i = 0; i< UX_row.size(); i++) // run the loop to which DOM row matching with the given expected SearchedText
					{
						WebElement Element =UX_row.get(i).findElement(By.xpath(".//*[@class='ng-isolate-scope']"));// Xpath of the Row value The UX grid
						List<WebElement> UX_column = Element.findElements(By.cssSelector("div[class^='ui-grid-cell ng-scope ui-grid-coluiGrid']"));// CSS Selector of the Corresponding Column of the  Search Text row Of The UX grid
						for(int j=0; j< UX_column.size(); j++)// run the loop to which DOM column to the corresponding row matching with the given expected SearchedText
						{
							//SearchedTextActual = UX_column.get(j).getText().trim();//Get each search text value
							SearchedTextActual =((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", UX_column.get(j) ).toString();
							if (SearchedTextActual.trim().equalsIgnoreCase(SearchedText.trim()))// compare DOM column to the corresponding row with the given expected SearchedText
							{
								FoundRow = i;// Store row 
								break outerloop;
							}
						}
					}
				for(int k=0;k<ExpectedColHeadersToBeVerified.length;k++)// Outer loop for given column size and find expected value column no
				{
					FoundCol=-1;
					ActualText = null;
					SearchedTextActual=null;//re initialize again

					//System.out.println("ExpectedColHeadersToBeVerified Is : "+ExpectedColHeadersToBeVerified[k]+" and k is:"+k);
					List<WebElement> UX_Headercolumn = driver.findElements(By.xpath(".//*[@class='ui-grid-header-cell-label ng-binding']"));// xpath for the column header
					for(int j=0; j< UX_Headercolumn.size(); j++)// run the loop for each DOM column header matching with the given expected column header
					{
						SearchedTextActual =((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", UX_Headercolumn.get(j) ).toString();
						//System.out.println("SearchedTextActual Is : "+SearchedTextActual+"and ExpectedColHeadersToBeVerified is "+ExpectedColHeadersToBeVerified[k]+"and j"+j +"and k"+k);
						if (SearchedTextActual.trim().equalsIgnoreCase(ExpectedColHeadersToBeVerified[k].trim()))// If DOM column header is equal to given expected column header
						{
							FoundCol = j;// store value in FoundCol
							break;
						}
					}
					if(FoundCol==-1){
						if (logval == 0)
						{
							parentlogger.log(LogStatus.FAIL, "Expected Column Header : " +" " +color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[k],2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
						}
						else
						{
							logger.log(LogStatus.FAIL, "Expected Column Header : " +" " +color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[k],2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));

						}

						Assert.assertTrue(SearchedTextActual.equalsIgnoreCase(ExpectedColHeadersToBeVerified[k].trim()));
					}

					if (FoundRow != -1)// if given searched text found
					{
						WebElement Element =UX_row.get(FoundRow).findElement(By.xpath(".//*[@class='ng-isolate-scope']"));// Xpath of the Found Row value The UX grid
						List<WebElement> UX_column = Element.findElements(By.cssSelector("div[class^='ui-grid-cell ng-scope ui-grid-coluiGrid']"));// CSS Selector of the Corresponding Column of the found row Of The UX grid
						ActualText =((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", UX_column.get(FoundCol)).toString();
						if (ActualText.trim().contains(String.valueOf(ExpectedPartialValuesToBeVerified[k]).trim()))// if found column text value is contains expected value
						{
							if (logval == 0)
							{
								parentlogger.log(LogStatus.PASS, "Expected Values : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(ExpectedPartialValuesToBeVerified[k]),3) +" Are Contains With Actual Values :"+" " +color.RMA_ChangeColor_Utility(ActualText,2) +" , In Column :" +" " +color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[k],4) +" " +"And " +" " +" " +"Respectively, Corresponding To Indentifier SearchedText :" +" "  +color.RMA_ChangeColor_Utility(SearchedText,2) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Verification Is Successfull");
							}
							else
							{
								logger.log(LogStatus.PASS, "Expected Values : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(ExpectedPartialValuesToBeVerified[k]),3) +" Are Contains With Actual Values :"+" " +color.RMA_ChangeColor_Utility(ActualText,2) +", In Column :" +" " +color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[k],4) +" " +"And " +" " +" " +"Respectively, Corresponding To Indentifier SearchedText :" +" "  +color.RMA_ChangeColor_Utility(SearchedText,2) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Verification Is Successfull");
							}
						}
						else// if found column text value is contains to expected value
						{
							if (logval == 0)
							{
								parentlogger.log(LogStatus.FAIL, "Expected Values : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(ExpectedPartialValuesToBeVerified[k]),3) +" Are Not Contains With Actual Values :"+" " +color.RMA_ChangeColor_Utility(ActualText,2) +" , In Column :" +" " +color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[k],4) +" " +"And " +" "  +" " +"Respectively, Corresponding To Indentifier SearchedText :" +" "  +color.RMA_ChangeColor_Utility(SearchedText,2) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+color.RMA_ChangeColor_Utility(", And Hence Verification Is Not Successfull",1));

							}
							else
							{ 
								logger.log(LogStatus.FAIL, "Expected Values : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(ExpectedPartialValuesToBeVerified[k]),3) +" Are Not Contains With Actual Values :"+" " +color.RMA_ChangeColor_Utility(ActualText,2) +" , In Column :" +" " +ExpectedColHeadersToBeVerified[k] +" " +"And " +" "  +" " +"Respectively, Corresponding To Indentifier SearchedText :" +" "  +color.RMA_ChangeColor_Utility(SearchedText,2) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+color.RMA_ChangeColor_Utility(", And Hence Verification Is Not Successfull",1));

							}
							Assert.assertTrue(ActualText.contains(ExpectedPartialValuesToBeVerified[k].toString().trim()));
						}	
					}
					else// if Search Text not found in any row text value 
					{			
						if (logval == 0)
						{
							parentlogger.log(LogStatus.FAIL, "SearchedText : " +" " +color.RMA_ChangeColor_Utility(SearchedText,2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
						}
						else
						{
							logger.log(LogStatus.FAIL, "SearchedText : " +" " +color.RMA_ChangeColor_Utility(SearchedText,2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
						}
						Assert.assertTrue(FoundRow!= -1);
					}
				}
				if (logval == 0)//Final screen shot
				{
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UX Grid Verfication", UXGridDescription)));
				}
				else
				{ 
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UX Grid Verfication", UXGridDescription)));
				}
			}
			else{  //if  Check the length of the given Column header is not equal to Given Column Values
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, "Expected Values To Be Verified : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(ExpectedPartialValuesToBeVerified.length),2) +" " +"Is Not Equal To Expected Column Headers To Be Verified: " +" " + color.RMA_ChangeColor_Utility(String.valueOf(ExpectedColHeadersToBeVerified.length),2) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
				}
				else
				{
					logger.log(LogStatus.FAIL, "Expected Values To Be Verified : " +" " +color.RMA_ChangeColor_Utility(String.valueOf(ExpectedPartialValuesToBeVerified.length),2) +" " +"Is Not Equal To Expected Column Headers To Be Verified: " +" " + color.RMA_ChangeColor_Utility(String.valueOf(ExpectedColHeadersToBeVerified.length),2) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
				}
				Assert.assertTrue(ExpectedColHeadersToBeVerified.length==ExpectedPartialValuesToBeVerified.length);
			}
		}
		catch(Exception|Error e)
		{
			throw(e);
		}
	}
	//============================================================================================
	//FunctionName 		: RMA_TableSingleTextVerify_Utility
	//Description  		: To Verify The Text In A Table Based On The User Provided Search Value
	//Input Parameter 	: Element: Table Element, SearchText: Text To Be Searched, col1: Column In Which The Value Is To Be Verified, ExpVal1: Value To Be Verified, TableName: Name oF The Table
	//Revision			: 0.0 - KumudNaithani-12-18-2015                                 
	//============================================================================================
	public static void RMA_TableSingleTextVerify_Utility(WebElement Element, String SearchText, int col1, String ExpVal1, String TableName, int logval) throws Exception, Error
	{
		try {
			int IntTable_RowsCount;
			int IntTable_ColumnsCount;
			String IntTable_CellText;
			//Local Variable Declaration

			List<WebElement> table_rows = Element.findElements(By.tagName("tr")); //All The Row Elements Of The Table Are Fetched In A List
			IntTable_RowsCount = table_rows.size(); //RowCount Is Stored In Variable IntTable_RowsCount
			breakloop:
				for (int row=0; row<IntTable_RowsCount; row++){ //Loop Is Iterated Through All The Rows Of The Table
					List<WebElement> table_rows_columns = table_rows.get(row).findElements(By.tagName("td")); //All The Column Elements Of The Table Are Fetched In A List
					IntTable_ColumnsCount = table_rows_columns.size(); //Count Of The Number Of Columns In The Row Is Taken
					for (int column=0; column<IntTable_ColumnsCount; column++){//Loop Is Iterated Through All The Columns Of The Row
						IntTable_CellText = table_rows_columns.get(column).getText(); //Value In The Particular Cell Of A Table Is Fetched
						if (SearchText.equalsIgnoreCase(IntTable_CellText)){
							StrActualVal1 = table_rows_columns.get(col1).getText();
							if (StrActualVal1.equalsIgnoreCase(ExpVal1)){
								if (logval==0)
								{
									parentlogger.log(LogStatus.PASS, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "+ "And Searched Text Value::" + " " + color.RMA_ChangeColor_Utility(SearchText, 4)+ " "+ "Expected Value::" + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " +  "Is Equal To Actual Value" + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + "And" +" " + "Hence Table Value Verification Is Successful" );
								}
								else
								{
									logger.log(LogStatus.PASS, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "  + "And Searched Text Value::" + " " + color.RMA_ChangeColor_Utility(SearchText, 4)+ " " + "Expected Value::" + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " +  "Is Equal To Actual Value" + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + "And" +" " + "Hence Table Value Verification Is Successful" );
								}
							}
							else{
								if (logval==0)
								{
									parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("For Table::", 1) + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + color.RMA_ChangeColor_Utility("And Searched Text Value::", 1)+ " "+ color.RMA_ChangeColor_Utility(SearchText, 4)+ " "+color.RMA_ChangeColor_Utility("Expected Value::", 1) + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " + color.RMA_ChangeColor_Utility("Is Not Equal To Actual Value", 1) + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + color.RMA_ChangeColor_Utility("Hence Table Value Verification Is Not Successful", 1) );   
								}
								else
								{
									logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("For Table::", 1) + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + color.RMA_ChangeColor_Utility("And Searched Text Value::", 1)+ " "+ color.RMA_ChangeColor_Utility(SearchText, 4)+ " "+color.RMA_ChangeColor_Utility("Expected Value::", 1) + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " + color.RMA_ChangeColor_Utility("Is Not Equal To Actual Value", 1) + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + color.RMA_ChangeColor_Utility("Hence Table Value Verification Is Not Successful", 1) );  
								}								
							}
							break breakloop;
						}
					}
				}

			Assert.assertTrue(StrActualVal1.equalsIgnoreCase(ExpVal1));
		} catch (Exception|Error e) {
			if (logval==0)
			{
				parentlogger.log(LogStatus.FAIL, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + "Value Verification Is Not Successful Due To The Following Reason" + color.RMA_ChangeColor_Utility(e.getMessage(),1) );  
			}
			else
			{
				logger.log(LogStatus.FAIL, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + "Value Verification Is Not Successful Due To The Following Reason" + color.RMA_ChangeColor_Utility(e.getMessage(),1) ); 
			}

			throw (e);
		}
	}
	//============================================================================================
	//FunctionName 		: RMA_FilterNGGridVerify_Utility
	//Description  		: To Verify The Text In Test NG Grid After Filtering The Grid On The Basis Of The User Provided Input
	//Input Parameter 	: Element1, Table Element, SearchText: Text On The Basis Of Which Test NG Grid Is To Be Filtered, String ExpVal1: Expected Value In The Grid, ObDesc: Description Of the NG Grid, logval: logger value, 
	//Revision			: 0.0 - KumudNaithani-12-28-2015                                 
	//============================================================================================
	public static void RMA_FilterNGGridVerify_Utility(String ExpVal1, String ObjDesc, WebElement Element1, int logval) throws Exception, Error
	{

		try {
			StrActualVal1 = Element1.getText();
			if (StrActualVal1.equalsIgnoreCase(ExpVal1)){
				if (logval == 0){
					parentlogger.log(LogStatus.PASS, "For NG Grid Table::" + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4)+ " " + "Expected Value::" + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " + "Is Equal To Actual Value" + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + "And" +" " + "Hence Table Value Verification Is Successful" );
				}
				else
				{
					logger.log(LogStatus.PASS, "For NG Grid Table::" + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + "Expected Value::" + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " + "Is Equal To Actual Value" + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + "And" +" " + "Hence Table Value Verification Is Successful" );
				}
			}
			else
			{
				if (logval == 0){
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("For NG Grid Table::", 1) + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + color.RMA_ChangeColor_Utility("Expected Value::", 1) + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " + color.RMA_ChangeColor_Utility("Is Not Equal To Actual Value", 1) + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " +color.RMA_ChangeColor_Utility("Hence Table Value Verification Is Unsuccessful", 1) );
				}
				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("For NG Grid Table::", 1) + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + color.RMA_ChangeColor_Utility("Expected Value::", 1) + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " + color.RMA_ChangeColor_Utility("Is Not Equal To Actual Value", 1) + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + color.RMA_ChangeColor_Utility("Hence Table Value Verification Is Unsuccessful", 1) );
				}

				Assert.assertEquals(StrActualVal1, ExpVal1);

			}
		} catch (Exception|Error e) {
			if (logval==0)
			{
				parentlogger.log(LogStatus.FAIL, "For NG Grid::" + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + "Value Verification Is Not Successful Due To The Following Reason" + color.RMA_ChangeColor_Utility(e.getMessage(),1) );  
			}
			else
			{
				logger.log(LogStatus.FAIL, "For NG Grid::" + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + "Value Verification Is Not Successful Due To The Following Reason" + color.RMA_ChangeColor_Utility(e.getMessage(),1) ); 
			}
			throw (e);
		}
	}
	//============================================================================================
	//FunctionName 		: RMA_RowColCountVerify_Utility
	//Description  		: To Verify Number Of Rows And Column In A Table Based On The User Provided Row And Column Count
	//Input Parameter 	: Element: Table Element, SearchText: Text To Be Searched, col1 and col2: Columns In Which The Value Is To Be Verified, ExpVal1, ExpVall2: Values To Be Verified, TableName: Name Of The Table
	//Revision			: 0.0 - KumudNaithani-02-01-2016                                
	//============================================================================================
	public static int RMA_RowColCountVerify_Utility(WebElement Element, int ExpCol, int ExpRow, boolean RowVerify , boolean ColVerify, String TableName, int logval) throws Exception, Error
	{
		try {
			int IntTable_ColumnsCount;
			//Local Variable Declaration

			List<WebElement> table_rows = Element.findElements(By.tagName("tr")); //All The Row Elements Of The Table Are Fetched In A List
			IntTable_RowsCount = table_rows.size(); //RowCount Is Stored In Variable IntTable_RowsCount
			for (int row=0; row<IntTable_RowsCount; row++){ //Loop Is Iterated Through All The Rows Of The Table
				List<WebElement> table_rows_columns = table_rows.get(row).findElements(By.tagName("td")); //All The Column Elements Of The Table Are Fetched In A List
				IntTable_ColumnsCount = table_rows_columns.size(); //Count Of The Number Of Columns In The Row Is Taken
				if (ColVerify == true)
				{
					if (ExpCol == IntTable_ColumnsCount){

						if (logval==0)
						{
							parentlogger.log(LogStatus.PASS, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "+ "Expected Column Count::" + " " + color.RMA_ChangeColor_Utility(String.valueOf(ExpRow), 3)+ " "+ "And Actual Column Count::" + " " + color.RMA_ChangeColor_Utility(String.valueOf(IntTable_RowsCount), 2) + " " + "Are Equal Hence Column Count Verification Is Successful" );  
						}
						else
						{
							logger.log(LogStatus.PASS, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "+ "Expected Column Count::" + " " + color.RMA_ChangeColor_Utility(String.valueOf(ExpRow), 3)+ " "+ "And Actual Column Count::" + " " + color.RMA_ChangeColor_Utility(String.valueOf(IntTable_RowsCount), 2) + " " + "Are Equal Hence Column Count Verification Is Successful" );
						}
					}

					else
					{
						if (logval==0)
						{
							parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("For Table::", 1) + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "+ color.RMA_ChangeColor_Utility("Expected Column Count::", 1) + " " + color.RMA_ChangeColor_Utility(String.valueOf(ExpRow), 3)+ " "+ color.RMA_ChangeColor_Utility("And Actual Column Count::", 1) + " " + color.RMA_ChangeColor_Utility(String.valueOf(IntTable_RowsCount), 2) + " " + color.RMA_ChangeColor_Utility("Are Not Equal Hence Column Count Verification Is Successful", 1) );  
						}
						else
						{
							logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("For Table::", 1) + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "+ color.RMA_ChangeColor_Utility("Expected Column Count::", 1) + " " + color.RMA_ChangeColor_Utility(String.valueOf(ExpRow), 3)+ " "+  color.RMA_ChangeColor_Utility("And Actual Column Count::", 1) + color.RMA_ChangeColor_Utility(String.valueOf(IntTable_RowsCount), 2) + " " + color.RMA_ChangeColor_Utility("Are Not Equal Hence Column Count Verification Is Successful", 1));
						}
					}

					Assert.assertTrue(ExpCol == IntTable_ColumnsCount);
				}
			}

			if (RowVerify == true)
			{
				if (ExpRow == IntTable_RowsCount){

					if (logval==0)
					{
						parentlogger.log(LogStatus.PASS, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "+ "Expected Row Count::" + " " + color.RMA_ChangeColor_Utility(String.valueOf(ExpRow), 3)+ " "+ "And Actual Row Count::" + " " + color.RMA_ChangeColor_Utility(String.valueOf(IntTable_RowsCount), 2) + " " + "Are Equal Hence Row Count Verification Is Successful" );  
					}
					else
					{
						logger.log(LogStatus.PASS, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "+ "Expected Row Count::" + " " + color.RMA_ChangeColor_Utility(String.valueOf(ExpRow), 3)+ " "+ "And Actual Row Count::" + " " + color.RMA_ChangeColor_Utility(String.valueOf(IntTable_RowsCount), 2) + " " + "Are Equal Hence Row Count Verification Is Successful" );
					}
				}

				else
				{
					if (logval==0)
					{
						parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("For Table::", 1) + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "+ color.RMA_ChangeColor_Utility("Expected Row Count::", 1) + " " + color.RMA_ChangeColor_Utility(String.valueOf(ExpRow), 3)+ " "+ color.RMA_ChangeColor_Utility("And Actual Row Count::", 1) + " " + color.RMA_ChangeColor_Utility(String.valueOf(IntTable_RowsCount), 2) + " " + color.RMA_ChangeColor_Utility("Are Not Equal Hence Row Count Verification Is Successful", 1) );  
					}
					else
					{
						logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("For Table::", 1) + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "+ color.RMA_ChangeColor_Utility("Expected Row Count::", 1) + " " + color.RMA_ChangeColor_Utility(String.valueOf(ExpRow), 3)+ " "+  color.RMA_ChangeColor_Utility("And Actual Row Count::", 1) + color.RMA_ChangeColor_Utility(String.valueOf(IntTable_RowsCount), 2) + " " + color.RMA_ChangeColor_Utility("Are Not Equal Hence Row Count Verification Is Successful", 1));
					}
				}
				Assert.assertTrue(ExpRow == IntTable_RowsCount);	
			}


		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + "Column And Row Count Verification Failed Due To Reason:" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1) );  
			}
			else
			{
				logger.log(LogStatus.FAIL, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + "Column And Row Count Verification Failed Due To Reason:" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1) );   
			}
			throw(e);
		}

		return IntTable_RowsCount;
	}
	//====================================================================================================
	//FunctionName 		: RMA_VerifySingle_MultipleWebListData
	//Description  		: Enables The User To Verify Single/Multiple Data Values In The WebList 
	//Input Parameter 	: Element, WebListTextToBeVerified: Text/List To Be Verified, ObjDesc, logval 
	//Revision			: 0.0 - RenuVerma-10-13-2016                               
	//====================================================================================================
	public static void RMA_VerifySingle_MultipleWebListData(WebElement Element,String WebListTextToBeVerified, String ObjDesc, int logval ) throws Exception,Error		
	{
		String[] TextToBeVerified= WebListTextToBeVerified.split(";");// User Input should be separated by ';'

		try
		{	
			Select WList = new Select (Element); // Create an Select Object

			List<WebElement> options = WList.getOptions(); 

			for (int i=0; i<TextToBeVerified.length; i++) // Outer loop runs till the given Text Value count
			{  
				boolean match=false;// initialize match value as false for each TextToBeVerified array value
				innerloop:
					for(WebElement we:options)  // Loop runs till the WebList Options count
					{
						if (we.getText().equals(TextToBeVerified[i])){
							if (logval == 0)
							{
								parentlogger.log(LogStatus.PASS, color.RMA_ChangeColor_Utility("Corresponding List Element "+ color.RMA_ChangeColor_Utility(TextToBeVerified[i],2)+" Is Available In " +color.RMA_ChangeColor_Utility(ObjDesc,4)+ " Hence Can Continue Testing." , 3) );
							}
							else
							{
								logger.log(LogStatus.PASS, color.RMA_ChangeColor_Utility("Corresponding List Element Is "+color.RMA_ChangeColor_Utility(TextToBeVerified[i],2)+" Is Available In " +color.RMA_ChangeColor_Utility(ObjDesc,4)+ " Hence Can Continue Testing.", 3) );
							}	
							match = true;
							break innerloop;
						}						
					}// Inner Loops ends here
				if(!match){// Check match value for false condition
					if (logval == 0)
					{
						parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Corresponding List Element "+ color.RMA_ChangeColor_Utility(TextToBeVerified[i],1)+" Is Not Available In " +color.RMA_ChangeColor_Utility(ObjDesc,4)+" Hence Can Not Continue Testing.", 3) );
					}
					else
					{
						logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Corresponding List Element "+ color.RMA_ChangeColor_Utility(TextToBeVerified[i],1)+" Is Not Available In " +color.RMA_ChangeColor_Utility(ObjDesc,4)+" Hence Can Not Continue Testing.", 3) );
					}
					Assert.assertTrue(match);
				}

			}  
		}catch(Exception|Error e)
		{
			throw(e);
		}
	}
	//============================================================================================
	//FunctionName 		: RMA_VerifyRowDataForTwoColTablePartially
	//Description  		: To Verify The Text In Particular Column of  A Table Based On The User Provided Two Search Value, 
	//Input Parameter 	: Element: Table Element, SearchText1: Text1 To Be Searched,SearchText2: Text2 To Be Searched, ExpectedValue: Expected value To Be Verified,  ExpectedCol: Column In Which The Value Is To Be Verified, ObjDes: Name oF The Table
	//Revision			: 0.0 - ImteyazAhmad-02-04-2016                                
	//============================================================================================
	public static void RMA_VerifyRowDataForTwoColTablePartially(WebElement Element,String SrchedText1, String SrchedText2, String ExpectedValue, int ExpectedCol, String ObjDes, int logval ) throws Exception,Error
	{
		try
		{
			SrchedText1 = SrchedText1.toUpperCase();
			SrchedText2 = SrchedText2.toUpperCase();
			ExpectedValue = ExpectedValue.toUpperCase();
			ExpectedValue = ExpectedValue.trim();
			String Found = "False";			
			List<WebElement> TableRows = Element.findElements(By.tagName("tr"));
			loop:
				for (int i=0; i<TableRows.size(); i++)				
				{	
					List<WebElement> TableCol = TableRows.get(i).findElements(By.tagName("td"));				
					if (RMA_CheckTextInRowExistsTablePartially(TableCol,  SrchedText1) && RMA_CheckTextInRowExistsTablePartially(TableCol, SrchedText2))
					{ 
						String Text = TableCol.get(ExpectedCol-1).getText();
						Text = Text.toUpperCase();
						if (Text.contains(ExpectedValue))
						{
							Found ="True";
							if (logval == 0)
							{
								parentlogger.log(LogStatus.PASS, "Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue,3) +" " +"Available In Actual Value :"+" " +color.RMA_ChangeColor_Utility(Text,2) +" " +",In Column :" +" " +ExpectedCol +" " +",Corresponding To Indentifiers SearchedText1 :" +" "  +color.RMA_ChangeColor_Utility(SrchedText1,2) +" " +"And SearchedText2 :" +" " +color.RMA_ChangeColor_Utility(SrchedText2,2)+" " +", In"+" " +color.RMA_ChangeColor_Utility(ObjDes,4) +" "+", And Hence Verification Is Successfull");
							}

							else
							{
								logger.log(LogStatus.PASS, "Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue,3) +" " +"Available In Actual Value :"+" " +color.RMA_ChangeColor_Utility(Text,2) +" " +",In Column :" +" " +ExpectedCol +" " +",Corresponding To Indentifiers SearchedText1 :" +" "  +color.RMA_ChangeColor_Utility(SrchedText1,2) +" " +"And SearchedText2 :" +" " +color.RMA_ChangeColor_Utility(SrchedText2,2)+" " +", In"+" " +color.RMA_ChangeColor_Utility(ObjDes,4) +" "+", And Hence Verification Is Successfull");	
							}


						}
						else 
						{
							String ErrorMsg1 = "Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue,3) +" " +",Is Not Available In Actual Value :"+" " +color.RMA_ChangeColor_Utility(Text,2) +" " +",In Column :" +" " +ExpectedCol +" " +",Corresponding To Indentifiers SearchedText1 :" +" " +color.RMA_ChangeColor_Utility(SrchedText1,2) +" " +"And SearchedText2 : " +" " +color.RMA_ChangeColor_Utility(SrchedText2,2)+" " +", In"+" " +color.RMA_ChangeColor_Utility(ObjDes,4)+" "+" , And Hence Verification Is Not Successfull";
							if (logval == 0)
							{
								parentlogger.log(LogStatus.FAIL,color.RMA_ChangeColor_Utility(ErrorMsg1, 1) );
								Assert.fail();
							}

							else
							{
								logger.log(LogStatus.FAIL,color.RMA_ChangeColor_Utility(ErrorMsg1, 1) );
								Assert.fail();
							}
						}				
						break loop;
					}
				}

			if (Found == "False")
			{
				String Errormsg = "Corresponding Identifiers SearchedText1 :" +" " +SrchedText1 +" And SearchedText2 :" +" " +SrchedText2 +" "+"  Do Not Exists In Same Row Of Table " +" " +color.RMA_ChangeColor_Utility(ObjDes,4);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility(Errormsg, 1) );
					Assert.fail();
				}
				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility(Errormsg, 1) );
					Assert.fail();
				}
			}

		}catch(Exception|Error e)
		{
			if (logval == 0)
			{
				parentlogger.log(LogStatus.FAIL, " Error Has Occurred While Calling Method : RMA_VerifyRowDataForTwoCol_NgGrid and Error Message Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(), 1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Error Has Occurred While Calling Method : RMA_VerifyRowDataForTwoCol_NgGrid and Error Message Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(), 1));
			}			
			throw(e);
		}
	}
	//============================================================================================
	//FunctionName 		: RMA_CheckTextInRowExistsTablePartially
	//Description  		: To Verify The Text In Particular Row of  A Table Based On The User Provided Search Value, 
	//Input Parameter 	: SearchedText: Text To Be Searched, TableCol : Collection of WebElement With Tag td
	//Revision			: 0.0 - ImteyazAhmad-12-29-2015                                 
	//============================================================================================
	private static Boolean RMA_CheckTextInRowExistsTablePartially(List<WebElement> TableCol , String SearchedText)
	{
		Boolean TextFound = true;
		Boolean TextNotFound = false;
		SearchedText = SearchedText.trim();

		for (int j = 0; j<TableCol.size(); j++)
		{
			String CellTextValue =  TableCol.get(j).getText();
			CellTextValue = CellTextValue.toUpperCase();
			if (CellTextValue.contains(SearchedText))
			{
				return TextFound;
			}
		}
		return TextNotFound;
	}
	//============================================================================================
	//FunctionName 		: RMA_VerifyUXErrorMessage
	//Description  		: To Verify UX Error Message On The RMA Application Screen
	//Input Parameter 	: ErrorMessage, ObjPageDescription, logval, IsCloseRequired 
	//Revision			: 0.0 - RenuVerma-04-17-2017                                 
	//============================================================================================
	public static void RMA_VerifyUXMessage( String Message,boolean IsCloseRequired,String ObjPageDescription, int logval) throws Exception, Error
	{
		//String CurrentFrameId;
		try {
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Msg_ToastMessage(driver, Message ), Message+ " Message On " + ObjPageDescription, logval);
			if(IsCloseRequired)
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ErrorToastMsgClose(driver), "Error Toast Close Button On "+ ObjPageDescription, logval);			
			Thread.sleep(3000);
		} catch (Exception|Error e) {
			throw (e);
		}
	}
	//====================================================================================================
	//FunctionName 		: RMA_VerifySelectedSingle_MultipleWebListData
	//Description  		: Enables The User To Verify Single/Multiple Selected Data Values In The WebList 
	//Input Parameter 	: Element, WebListTextToBeVerified: Text/List To Be Verified, ObjDesc, logval 
	//Revision			: 0.0 - RenuVerma-10-13-2016                               
	//====================================================================================================
	public static void RMA_VerifySelectedSingle_MultipleWebListData(WebElement Element,String WebListTextToBeVerified, String ObjDesc, int logval ) throws Exception,Error		
	{
		String[] TextToBeVerified= WebListTextToBeVerified.split(";");// User Input should be separated by ';'

		try
		{	
			Select WList = new Select (Element); // Create an Select Object

			List<WebElement> options = WList.getAllSelectedOptions(); // Get All Selected Value in WebList

			for (int i=0; i<TextToBeVerified.length; i++) // Outer loop runs till the given Text Value count
			{  
				boolean match=false;// initialize match value as false for each TextToBeVerified array value
				innerloop:
					for(WebElement we:options)  // Loop runs till the WebList Options count
					{
						if (we.getText().equals(TextToBeVerified[i])){
							if (logval == 0)
							{
								parentlogger.log(LogStatus.PASS, color.RMA_ChangeColor_Utility("Corresponding List Element "+ color.RMA_ChangeColor_Utility(TextToBeVerified[i],2)+" Is Selected In " +color.RMA_ChangeColor_Utility(ObjDesc,4)+ " Hence Can Continue Testing." , 3) );
							}
							else
							{
								logger.log(LogStatus.PASS, color.RMA_ChangeColor_Utility("Corresponding List Element Is "+color.RMA_ChangeColor_Utility(TextToBeVerified[i],2)+" Is Selected In " +color.RMA_ChangeColor_Utility(ObjDesc,4)+ " Hence Can Continue Testing.", 3) );
							}	
							match = true;
							break innerloop;
						}						
					}// Inner Loops ends here
				if(!match){// Check match value for false condition
					if (logval == 0)
					{
						parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Corresponding List Element "+ color.RMA_ChangeColor_Utility(TextToBeVerified[i],1)+" Is Not Selected In " +color.RMA_ChangeColor_Utility(ObjDesc,4)+" Hence Can Not Continue Testing.", 3) );
					}
					else
					{
						logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Corresponding List Element "+ color.RMA_ChangeColor_Utility(TextToBeVerified[i],1)+" Is Not Selected In " +color.RMA_ChangeColor_Utility(ObjDesc,4)+" Hence Can Not Continue Testing.", 3) );
					}
					Assert.assertTrue(match);
				}

			}  
		}catch(Exception|Error e)
		{
			throw(e);
		}
	}

	//============================================================================================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName	: RMA_TableVerifyText_Utility
	//Description	: To Verify Any Two Text Values (In Two Different Columns) In A Table Based On The User Provided Search Value
	//Input Parameter	: Element: Table Element, SearchText: Text To Be Searched, col1 and col2: Columns In Which The Value Is To Be Verified, ExpVal1, ExpVall2: Values To Be Verified, TableName: Name Of The Table
	//Revision	: 0.0 - KumudNaithani-12-02-2015                                 
	//============================================================================================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_TableVerifyText_Utility(WebElement Element, String SearchText, int col1, String ExpVal1, int col2, String ExpVal2, String TableName, int logval) throws Exception, Error
	{
		try {
			int IntTable_RowsCount;
			int IntTable_ColumnsCount;
			String IntTable_CellText;
			//Local Variable Declaration

			List<WebElement> reservetable_rows = Element.findElements(By.tagName("tr")); //All The Row Elements Of The Table Are Fetched In A List
			IntTable_RowsCount = reservetable_rows.size(); //RowCount Is Stored In Variable IntTable_RowsCount

			breakloop:
				for (int row=0; row<IntTable_RowsCount; row++){ //Loop Is Iterated Through All The Rows Of The Table
					List<WebElement> table_rows_columns = reservetable_rows.get(row).findElements(By.tagName("td")); //All The Column Elements Of The Table Are Fetched In A List
					IntTable_ColumnsCount = table_rows_columns.size(); //Count Of The Number Of Columns In The Row Is Taken
					for (int column=0; column<IntTable_ColumnsCount; column++){//Loop Is Iterated Through All The Columns Of The Row
						IntTable_CellText = table_rows_columns.get(column).getText(); //Value In The Particular Cell Of A Table Is Fetched
						if (SearchText.equalsIgnoreCase(IntTable_CellText)){
							StrActualVal1 = table_rows_columns.get(col1).getText();
							StrActualVal2 = table_rows_columns.get(col2).getText();
							if (StrActualVal1.equalsIgnoreCase(ExpVal1) && StrActualVal2.equalsIgnoreCase(ExpVal2)){
								if (logval ==0)
								{
									parentlogger.log(LogStatus.PASS, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "+ "And Searched Text Value::" + " " + color.RMA_ChangeColor_Utility(SearchText, 4)+ " "+ "Expected Values::" + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " + "And" + " " + color.RMA_ChangeColor_Utility(ExpVal2, 3) + " " + "Are Equal To Actual Values" + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + "And" + " " +  color.RMA_ChangeColor_Utility(StrActualVal2, 2) + " " + "Hence Table Value Verification Is Successful" );  
								}
								else
								{
									logger.log(LogStatus.PASS, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + "And Searched Text Value::" + " " + color.RMA_ChangeColor_Utility(SearchText, 4)+ " " + "Expected Values::" + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " + "And" + " " + color.RMA_ChangeColor_Utility(ExpVal2, 3) + " " + "Are Equal To Actual Values" + " " +   color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + "And" + " " +  color.RMA_ChangeColor_Utility(StrActualVal2, 2)+ " " + "Hence Table Value Verification Is Successful" );
								}
							}
							else{

								if (logval ==0)
								{
									parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("For Table::", 1) + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + color.RMA_ChangeColor_Utility("And Searched Text Value::", 1)+ " "+ color.RMA_ChangeColor_Utility(SearchText, 4)+ color.RMA_ChangeColor_Utility("Expected Values::", 1) + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " +  color.RMA_ChangeColor_Utility("And", 1) + " " + color.RMA_ChangeColor_Utility(ExpVal2, 3) + " " + color.RMA_ChangeColor_Utility("Are Not Equal To Actual Values::", 1) + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + color.RMA_ChangeColor_Utility("And", 1) + " " +  color.RMA_ChangeColor_Utility(StrActualVal2, 2) + " " + color.RMA_ChangeColor_Utility("Hence Table Value Verification Is Not Successful", 1) );  
								}
								else
								{
									logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("For Table::", 1) + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + color.RMA_ChangeColor_Utility("And Searched Text Value::", 1)+ " "+ color.RMA_ChangeColor_Utility(SearchText, 4)+ color.RMA_ChangeColor_Utility("Expected Values::", 1) + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " + color.RMA_ChangeColor_Utility("And", 1) + " " + color.RMA_ChangeColor_Utility(ExpVal2, 3) + " " + color.RMA_ChangeColor_Utility("Are Not Equal To Actual Values::", 1) + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + color.RMA_ChangeColor_Utility("And", 1) + " " +  color.RMA_ChangeColor_Utility(StrActualVal2, 2) + " " + color.RMA_ChangeColor_Utility("Hence Table Value Verification Is Not Successful", 1));   
								}
							}
							break breakloop;
						}
					}
				}

			Assert.assertTrue((StrActualVal1.equalsIgnoreCase(ExpVal1)) && (StrActualVal2.equalsIgnoreCase(ExpVal2)));
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + "Table Value Verification Failed Due To Reason:" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1) );  
			}
			else
			{
				logger.log(LogStatus.FAIL, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + "Table Value Verification Failed Due To Reason:" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1) );   
			}
			throw(e);
		}
	}

	//============================================================================================
	//FunctionName       : RMA_TableSingleTextPartialVerify_Utility
	//Description        : To Verify The Text In A Table Based On The User Provided Search Value
	//Input Parameter    : Element: Table Element, SearchText: Text To Be Searched, col1: Column In Which The Value Is To Be Verified, ExpVal1: Value To Be Verified, TableName: Name oF The Table
	//Revision           : 0.0 - KumudNaithani-12-18-2015                                 
	//============================================================================================
	public static void RMA_TableSingleTextPartialVerify_Utility(WebElement Element, String SearchText, int col1, String ExpVal1, String TableName, int logval) throws Exception, Error
	{
		try {
			int IntTable_RowsCount;
			int IntTable_ColumnsCount;
			String IntTable_CellText;
			//Local Variable Declaration

			List<WebElement> table_rows = Element.findElements(By.tagName("tr")); //All The Row Elements Of The Table Are Fetched In A List
			IntTable_RowsCount = table_rows.size(); //RowCount Is Stored In Variable IntTable_RowsCount
			breakloop:
				for (int row=0; row<IntTable_RowsCount; row++){ //Loop Is Iterated Through All The Rows Of The Table
					List<WebElement> table_rows_columns = table_rows.get(row).findElements(By.tagName("td")); //All The Column Elements Of The Table Are Fetched In A List
					IntTable_ColumnsCount = table_rows_columns.size(); //Count Of The Number Of Columns In The Row Is Taken
					for (int column=0; column<IntTable_ColumnsCount; column++){//Loop Is Iterated Through All The Columns Of The Row
						IntTable_CellText = table_rows_columns.get(column).getText(); //Value In The Particular Cell Of A Table Is Fetched
						if (SearchText.equalsIgnoreCase(IntTable_CellText)){
							StrActualVal1 = table_rows_columns.get(col1).getText();
							if (StrActualVal1.contains(ExpVal1)){
								if (logval==0)
								{
									parentlogger.log(LogStatus.PASS, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "+ "And Searched Text Value::" + " " + color.RMA_ChangeColor_Utility(SearchText, 4)+ " "+ "Expected Value::" + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " +  "Is Equal To Actual Value" + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + "And" +" " + "Hence Table Value Verification Is Successful" );
								}
								else
								{
									logger.log(LogStatus.PASS, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " "  + "And Searched Text Value::" + " " + color.RMA_ChangeColor_Utility(SearchText, 4)+ " " + "Expected Value::" + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " +  "Is Equal To Actual Value" + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + "And" +" " + "Hence Table Value Verification Is Successful" );
								}
							}
							else{
								if (logval==0)
								{
									parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("For Table::", 1) + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + color.RMA_ChangeColor_Utility("And Searched Text Value::", 1)+ " "+ color.RMA_ChangeColor_Utility(SearchText, 4)+ " "+color.RMA_ChangeColor_Utility("Expected Value::", 1) + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " + color.RMA_ChangeColor_Utility("Is Not Equal To Actual Value", 1) + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + color.RMA_ChangeColor_Utility("Hence Table Value Verification Is Not Successful", 1) );   
								}
								else
								{
									logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("For Table::", 1) + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + color.RMA_ChangeColor_Utility("And Searched Text Value::", 1)+ " "+ color.RMA_ChangeColor_Utility(SearchText, 4)+ " "+color.RMA_ChangeColor_Utility("Expected Value::", 1) + " " + color.RMA_ChangeColor_Utility(ExpVal1, 3) + " " + color.RMA_ChangeColor_Utility("Is Not Equal To Actual Value", 1) + " " +  color.RMA_ChangeColor_Utility(StrActualVal1, 2) + " " + color.RMA_ChangeColor_Utility("Hence Table Value Verification Is Not Successful", 1) );  
								}                                                      
							}
							break breakloop;
						}
					}
				}

			Assert.assertTrue(StrActualVal1.equalsIgnoreCase(ExpVal1));
		} catch (Exception|Error e) {
			if (logval==0)
			{
				parentlogger.log(LogStatus.FAIL, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + "Value Verification Is Not Successful Due To The Following Reason" + color.RMA_ChangeColor_Utility(e.getMessage(),1) );  
			}
			else
			{
				logger.log(LogStatus.FAIL, "For Table::" + " " + color.RMA_ChangeColor_Utility(TableName, 4) + " " + "Value Verification Is Not Successful Due To The Following Reason" + color.RMA_ChangeColor_Utility(e.getMessage(),1) ); 
			}

			throw (e);
		}
	}

	//============================================================================================
	//FunctionName 		: RMA_ReadOnlyWriteStateVerification_Utility
	//Description  		: To Verify The ReadOnly And Write State Of The Given Control
	//Input Parameter 	: Element: Web Element Whose State Is To Be Verified, State: readonly and Write, ControlName: Name of the control, logval
	//Revision			: 0.0 - RenuVerma-05-25-2017                                 
	//============================================================================================
	public static void RMA_ReadOnlyWriteStateVerification_Utility (WebElement Element, String State, String ControlName, int logval) throws Exception, Error
	{
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;	
			String flag=jsExecutor.executeScript("return arguments[0].readOnly;", Element).toString() ;
			switch (State){			
			case "readonly":		
			{
				if(flag.equals("true"))
				{
					if (logval ==0)
					{
						parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In ReadOnly State And Hence ReadOnly State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
					else
					{
						logger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In ReadOnly State And Hence ReadOnly State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
				}
				else {
					if (logval ==0)
					{
						parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Write State And Hence ReadOnly State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));	
					}
					else{
						logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In Write State And Hence ReadOnly State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
				}
				Assert.assertEquals(flag, "true");
				break;
			}
			case "write":
			{
				if(flag=="false"){
					if (logval==0){
						parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In Write State And Hence Write State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");	
					}
					else{
						logger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "Is In  Write State And Hence Write State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + "Is Successful");
					}
				}
				else {					
					if (logval ==0){
						parentlogger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In ReadOnly State And Hence Write State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));	
					}
					else{
						logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility(ControlName, 4) + " " + color.RMA_ChangeColor_Utility("Is In ReadOnly State And Hence Write State Verification For", 1) + " " + color.RMA_ChangeColor_Utility(ControlName, 4)+ " " + color.RMA_ChangeColor_Utility("Is Unsuccessful", 1));
					}
				}
				Assert.assertNotEquals(flag, "true");
				break;
			}
			default:
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "State Variable" + " "+State+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "State Variable" + " "+State+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}

			}
		} catch (Exception|Error e) {
			if (logval ==0){
				parentlogger.log(LogStatus.FAIL,  "ReadOnly Or Write State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) +  " CouldNot Be Done Due To Error" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));	
			}
			else{
				logger.log(LogStatus.FAIL,  "ReadOnly Or Write State Verification For" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) +  " CouldNot Be Done Due To Error" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));	
			}
			throw (e);
		}
	}

	//======================================================================================================================================================================================================================================================
	//FunctionName 		: PDFReaderContentVerification_Utility
	//Description  		: Enables The User To ReadPDF
	//Input Parameter 	: logval: To Indicate The Value Of The Logger To Be Used (Parent Or Child Logger),PDFPassword,ContentToBeVerified
	//Revision			: 0.0 - RenuVerma-06-27-2017   
	//ModifiyBy			: 0.0 - RenuVerma-09-15-2017   Updated functionality to make is more generic from all scenario of pdf 
	// ==========================================================================================================================================================================================================================================================

	public static String PDFReaderContentVerification_Utility(String PDFPassword,Object[] ContentToBeVerified, int Intlogval) throws Exception, Error{

		/*if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO,"User Is Able To Verify PDF Content" );	
			}
			else
			{
				logger = reports.startTest("<span id='PDFReaderContentVerification_Utility'>PDF Content Verification</span>", "User Is Able To Verify PDF Content");
			}*/
		Screen screen=new Screen();// Declare a Sikuli Screen 
		String FileName;
		FileName="TestFile"+RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MMddyyyy")+RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("HHmmss");// Create Unique File Name
		PDFTextStripper pdfStripper = null;   
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		String parsedText = null;
		Robot robot=new Robot();
		String PhysicalPath=System.getProperty("user.dir")+"\\RMATestInputFile\\DownloadTestFile\\"+FileName;// File Location to Store the File

		try {

			//Save Automatically PDF File after clicking link the On IE Browser  
			if(RMAApp_BrowserName.equalsIgnoreCase("IE")&&  (screen.exists(RMA_Selenium_POM_Sikuli_Images.RMAApp_Download_Btn_Open())!=null))// when IE browser driver is Used
			{
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Open Button Is appeared On IE Notification Popup");
				RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_Download_Btn_Open(), "Open Button On IE Notification Popup", logval);// On the nOtification bar click Open Image 
				RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As PDF Is Getting Opened");

				if(!PDFPassword.equalsIgnoreCase("NA")){// If Pdf Is Password Protected
					RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PDF Authentication Popup Is Getting Opened");
					RMA_Input_Utility.RMA_ActionSetValue_Utility("Password TextBox on PDF Authentication Popup",PDFPassword,  logval);
					//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_PDF_Txt_Password(), "Password TextBox on PDF Authentication Popup", logval);
					screen.type(PDFPassword);	// Enter The password
					if(logval == 0)
					{
						parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
					}
					else
					{
						logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
					}
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Typed Password On TextBox Successfully");
					//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_SaveAsPopUp_Btn_OK(), "Ok Button on PDF Authentication Popup", logval);	// Ok Is Clicked

					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
				}

				//Save Through Robot class
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(3000);
				RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath);// Give the File Location on Save As Popop
				Thread.sleep(5000);
				// Closs PDF after Save 
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_F4);
				robot.keyRelease(KeyEvent.VK_F4);
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			}

			//Save Automatically PDF File after clicking link the On Chrome Browser  
			else if(RMAApp_BrowserName.equalsIgnoreCase("Chrome") && (screen.exists(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_PdfIcon())!=null))//  when Chrome driver is Used
			{
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As File Is Getting Downloaded");
				RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_PdfIcon(), "Downloaded PDF File Icon on Chrome Browser", logval);// Click Pdf Image below of the browser
				RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As PDF Is Getting Opened");
				if(!PDFPassword.equalsIgnoreCase("NA")){// If Pdf Is Password Protected
					RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PDF Authentication Popup Is Getting Opened");
					RMA_Input_Utility.RMA_ActionSetValue_Utility("Password TextBox on PDF Authentication Popup",PDFPassword,  logval);
					//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_PDF_Txt_Password(), "Password TextBox on PDF Authentication Popup", logval);
					screen.type(PDFPassword);	// Enter The password
					if(logval == 0)
					{
						parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
					}
					else
					{
						logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
					}
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Typed Password On TextBox Successfully");
					//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_SaveAsPopUp_Btn_OK(), "Ok Button on PDF Authentication Popup", logval);	// Ok Is Clicked

					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
				}				
				//Save Through Robot class
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(3000);
				RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath);// Give the File Location on Save As Popop
				Thread.sleep(5000);
				// Closs PDF after Save 
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_F4);
				robot.keyRelease(KeyEvent.VK_F4);
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_CONTROL);					
			}


			//Save PDF File From Browser If PDF Opens on Browser Started Here
			else if(screen.exists(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_MoveToVisibleDownloadButton())!=null)//  when Chrome driver is Used
			{
				if(!PDFPassword.equalsIgnoreCase("NA")){// If Pdf Is Password Protected
					RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PDF Authentication Popup Is Getting Opened");
					RMA_Input_Utility.RMA_ActionSetValue_Utility("Password TextBox on PDF Authentication Popup",PDFPassword,  logval);
					//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_PDF_Txt_Password(), "Password TextBox on PDF Authentication Popup", logval);
					screen.type(PDFPassword);	// Enter The password
					if(logval == 0)
					{
						parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
					}
					else
					{
						logger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(PDFPassword, 3) +" " +"Is Set Successfully In Pattern:" +" " + color.RMA_ChangeColor_Utility("Password Textbox On PDF Authentication Popup" , 4));
					}
					RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Typed Password On TextBox Successfully");
					//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_SaveAsPopUp_Btn_OK(), "Ok Button on PDF Authentication Popup", logval);	// Ok Is Clicked

					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
				}
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As File Is Getting Downloaded");
				RMA_Navigation_Utility.RMA_SikuliObjectMouseMove(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_MoveToVisibleDownloadButton(), "Move to View Download Icon On Chrome Browser", logval);// To Mouse Move On Top Of The PDF Browser to See the DownLoad Button
				RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_DownloadIcon(), "Download PDF File Icon on PDF Browser", logval);// Click On Download Button
				Thread.sleep(3000);
				RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath); // Give the File Location on Save As Popop
				Thread.sleep(5000);
				// Closs PDF after Save 
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_F4);
				robot.keyRelease(KeyEvent.VK_F4);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			}

			// If Save As pop-up appears after link click
			else {
				Thread.sleep(3000);
				RMA_GenericUsages_Utility.RMA_Upload_Save_File(PhysicalPath);// Give the File Location on Save As Popop
				Thread.sleep(5000);
			}
			//Save PDF File From Browser Ended Here

			//PDF Reader Through PDFBox Started Here
			File file = new File(PhysicalPath+".pdf");
			PDFParser parser = new PDFParser(new FileInputStream(file));// Parser to Parse Input File
			parser.parse(); //Parse Input File
			cosDoc = parser.getDocument();
			pdfStripper = new PDFTextStripper(); // PDFTextStripper to text extraction
			pdfStripper.setStartPage(1);
			pdfStripper.setEndPage(1);
			pdDoc = new PDDocument(cosDoc);

			//If PDF Password Protected
			boolean isOriginalDocEncrypted = pdDoc.isEncrypted();
			if (isOriginalDocEncrypted) {
				pdDoc.openProtection(new StandardDecryptionMaterial(PDFPassword));
			}

			parsedText = pdfStripper.getText(pdDoc);
			//PDF Reader Through PDFBox Ended Here

			//PDF Verification Started Here
			for(int i=0;i<ContentToBeVerified.length;i++){
				RMA_Verification_Utility.RMA_PartialTextVerification(ContentToBeVerified[i].toString(),parsedText,ContentToBeVerified[i].toString()+" Value Verification", Intlogval);	
			}
			//PDF Verification Ended Here
			if(RMAApp_BrowserName.equalsIgnoreCase("Chrome"))
			{
				RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_CloseDownloadBarButton(), "Close Button On Chrome Download Bar", logval);// Close the Download Bar Of Chrome
				//Thread.sleep(3000);
			}
		} catch (IOException e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver,"PDF Content Verification Fail", "User Is Not Able To Verify PDF Content")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "PDF Content Verification Fail","User Is Not Able To Verify PDF Content")));
			}
			System.err.println("Unable to open PDF Parser. " + e.getMessage());
			try {
				if (cosDoc != null)
					cosDoc.close();
				if (pdDoc != null)
					pdDoc.close();
			} catch (Exception|Error e1) {
				throw (e1);
			}
			throw (e);
		}
		return parsedText;
	}

	//============================================================================================
	//FunctionName 		: RMA_VerifyUXErrorMessage
	//Description  		: To Verify UX Error Message On The RMA Application Screen
	//Input Parameter 	: ErrorMessage, ObjPageDescription, logval, IsCloseRequired 
	//Revision			: 0.0 - ShrutiShruti-02-26-2018                                 
	//============================================================================================
	public static void RMA_VerifyUXErrorMessage( String Message,boolean IsCloseRequired,String ObjPageDescription, int logval) throws Exception, Error
	{
		//String CurrentFrameId;
		try {
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_GenericToast_ErrorMsg(driver), Message+ " Message On " + ObjPageDescription, logval);
			if(IsCloseRequired)
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ErrorToastMsgClose(driver), "Error Toast Close Button On "+ ObjPageDescription, logval);			
			Thread.sleep(3000);
		} catch (Exception|Error e) {
			throw (e);
		}
	}
}
