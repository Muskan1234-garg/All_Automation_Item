package rma_appiumutilities;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed
//RMA Package Import Completed

public class RMA_Verification_Utility extends rma_appiumtestcases.BaseTest{
public static String ReturnValue;
public static String StrActualVal1;
public static String StrActualVal2;
public static int IntTable_RowsCount;
public static boolean boolvalue;
public static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();

//============================================================================================
//FunctionName 		: RMA_WebElementExist_Utility
//Description  		: To Check The Existence Of A Web Element On The Web Page
//Input Parameter 	: Element Of Type WebElement, ObjectDescription: Description Of The Object Whose Existence Is To Be Checked
//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
//============================================================================================
public static void RMA_ElementExist_Utility(WebElement Element, String ObjectDescription,int logval) throws Exception, Error
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


//============================================================================================
//FunctionName 		: RMA_AttributeFetch_Utility
//Description  		: To Fetch The Value Of The Attribute Based On The WebElement And Attribute To Fetch Provided By the User
//Input Parameter 	: Element Of Type WebElement and AttributeToFetch Of Type String
//Revision			: 0.0 - KumudNaithani-01-03-2017                                
//============================================================================================
	public static String RMA_AttributeFetch_Utility(WebElement Element, String AttributeToFetch) throws Exception, Error
	{//In Case The User Wants To Select An IntegerValue Then The User Needs To Convert The Integer Value To String Using String.valueOf() Function And Then Pass As An Argument Into The Function
		try {
			ReturnValue  = Element.getAttribute(AttributeToFetch);
		} catch (Exception|Error e) {
			throw (e);
		}
		return ReturnValue;
	}
	
//============================================================================================
//FunctionName 		: RMA_ObjectDisplayVerify_Utility
//Description  		: To Verify That Whether The Given Control Is Displayed Or Not Displayed
//Input Parameter 	: Element: Web Element Whose State Is To Be Verified, ControlName: Name Of The Control Whose State Is To Be Verified, State: Case Variable For Displayed And Not Displayed State
//Revision			: 0.0 - KumudNaithani-01-03-2017                                
//============================================================================================
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

//============================================================================================
//FunctionName 		: RMA_TextCompare
//Description  		: To Compare Two String Values 
//Input Parameter 	: ExpectedString, ActualString Containing The Values Of The Values To Be Compared And ObjDesc Contains Comparison Description To Be Passed In Log Statement, logval Specifies Whether Parent Logger Or Child Logger Is To Be Used
//Revision			: 0.0 - KumudNaithani-01-16-2017                               
//============================================================================================
public static void RMA_TextCompare(String ExpectedString, String ActualString, String ObjDesc, int logval) throws Exception, Error
{
	try {
		if (ExpectedString.equalsIgnoreCase(ActualString)){
			if (logval == 0)
			{
				parentlogger.log(LogStatus.PASS, "Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + "And Actual Value" + " " + color.RMA_ChangeColor_Utility(ActualString, 2) + " "  + "Are Same And Hence" + " " + ObjDesc + " " + "Verification Is Successful" );
			}
			else

				logger.log(LogStatus.PASS, "Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + "And Actual Value" + " " + color.RMA_ChangeColor_Utility(ActualString, 2) + " "  + "Are Same And Hence" + " " + ObjDesc + " " + "Verification Is Successful" );
		}
		else{
			if (logval == 0)
			{
				parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Expected Value", 1) + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + color.RMA_ChangeColor_Utility("And Actual Value", 1) + " " + color.RMA_ChangeColor_Utility(ActualString, 2) + " "  + color.RMA_ChangeColor_Utility("Are Not Same And Hence", 1) + " " + ObjDesc + " " + color.RMA_ChangeColor_Utility("Verification Is Not Successful", 1) ); 
			}

			else
			{
				logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Expected Value", 1) + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + color.RMA_ChangeColor_Utility("And Actual Value", 1) + " " + color.RMA_ChangeColor_Utility(ActualString, 2) + " "  + color.RMA_ChangeColor_Utility("Are Not Same And Hence", 1) + " " + ObjDesc + " " + color.RMA_ChangeColor_Utility("Verification Is Not Successful", 1) );
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

//============================================================================================
//FunctionName 		: RMA_PartialTextVerification
//Description  		: To Compare Two String Values 
//Input Parameter 	: ExpectedString, ActualString Containing The Values Of The Values To Be Compared And ObjjDesc Contains Comparison Description To Be Passed In Log Statement
//Revision			: 0.0 - KumudNaithani-01-16-2017                                 
//============================================================================================
public static void RMA_PartialTextVerification(String ExpectedString, String ActualString, String ObjDesc, int logval) throws Exception, Error
{
	try {
		if (ActualString.contains(ExpectedString)){
			if (logval == 0)
			{
				parentlogger.log(LogStatus.PASS, "Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + "Is Contained In Actual Value" + " " + color.RMA_ChangeColor_Utility(ActualString, 2) + " "  + "Hence" + " " + ObjDesc + " " + "Partial Text Verification Is Successful" );
			}
			else
			{

				logger.log(LogStatus.PASS, "Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + "Is Contained In Actual Value" + " " + color.RMA_ChangeColor_Utility(ActualString, 2) + " "  + "Hence" + " " + ObjDesc + " " + "Partial Text Verification Is Successful" );
			}
		}
		else{
			if (logval == 0)
			{
				parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Expected Value", 1) + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + color.RMA_ChangeColor_Utility("Is Not Present Partially In Actual Value", 1) + " " + color.RMA_ChangeColor_Utility(ActualString, 2) + " "  + color.RMA_ChangeColor_Utility("Hence Partial Text Verification Is Not Successful For ", 1) + " " + ObjDesc); 
			}

			else
			{
				logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Expected Value", 1) + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + color.RMA_ChangeColor_Utility("Is Not Present Partially In Actual Value", 1) + " " + color.RMA_ChangeColor_Utility(ActualString, 2) + " "  + color.RMA_ChangeColor_Utility("Hence Partial Text Verification Is Not Successful For ", 1)+ " " + ObjDesc ); 
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
}
