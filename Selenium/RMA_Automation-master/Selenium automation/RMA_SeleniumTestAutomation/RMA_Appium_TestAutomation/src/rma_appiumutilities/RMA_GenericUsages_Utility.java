package rma_appiumutilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import javax.swing.JLabel;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rma_appiumPOM.RMA_Appium_POM_DefaultView;
//RMA Package Import Completed
import rma_appiumPOM.RMA_Appium_POM_Login_DSNSelect;

public class RMA_GenericUsages_Utility extends rma_appiumtestcases.BaseTest{
	public static JLabel label = new JLabel(); //Created JLabel instance
	public static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	public static String StrGeneratedString;
//============================================================================================
//FunctionName 		: RMA_CurrentDateInfo_Utility
//Description  		: To Retrieve The Current System Date in "yyyyMMdd"
//Input Parameter 	: None 
//Revision			: 0.0 - KumudNaithani-01-03-2017      
// ============================================================================================
public static String RMA_CurrentDateInfo_Utility() throws Exception,Error
{
	String Strdated = null;
	try
	{
		DateFormat dateformat = new SimpleDateFormat("MMddyyyy"); //Date Format Is Defined
		Date date = new Date();
		Strdated = dateformat.format(date); //Retrieved Date Is Formatted

	}catch(Exception|Error e)
	{
		System.out.println("Following Error Occurred While Generating Current Date : " +" " +e.getMessage());
		throw(e);
	}
	return Strdated;
}

//============================================================================================
//FunctionName 		: RMA_CurrentTimeInfo_Utility
//Description  		: To Retrieve The Current System Time in "hhmm" format 
//Input Parameter 	: None 
//Revision			: 0.0 - KumudNaithani-01-03-2017                               
//============================================================================================
public static String RMA_CurrentTimeInfo_Utility() throws Exception,Error
{
	String Strdated = null;
	try
	{
		DateFormat dateformat = new SimpleDateFormat("hhmm"); //Date Format Is Defined
		Date date = new Date();
		Strdated = dateformat.format(date); //Retrieved Date Is Formatted
	}catch(Exception|Error e)
	{
		System.out.println("Following Error Occurred While Generating Current Time : " +" " +e.getMessage());
			throw(e);
		}
		return Strdated;
	}

//============================================================================================
//FunctionName 		: RMA_ChangeColor
//Description  		: Changes Text Color, Parameter 1 Is For Red, 2 For Green, 3 For Blue, 4 For Orange
//Input Parameter 	: None
//Revision			: 0.0 - KumudNaithani-01-04-2017                                 
//============================================================================================
public String RMA_ChangeColor_Utility (String text, int num) throws Exception, Error {
	String colouredText = null ;
	try {
		switch(num){
		case 1: //text color is changed to Red
			label.setText("<span style='color:red'><b>" + text+ "</b></script></span>");
			colouredText = label.getText();
			break;
		case 2: //text color is changed to Green
			label.setText("<span style='color:green'><b>" + text+ "</b></script></span>");
			colouredText = label.getText();
			break;
		case 3: //text color is changed to Blue
			label.setText("<span style='color:blue'><b>" + text+ "</b></script></span>");
			colouredText = label.getText();
			break;
		case 4: //text color is changed to Orange
			label.setText("<span style='color:orange'><b>" + text+ "</b></script></span>");
			colouredText = label.getText();
			break;
		}
	}
	catch (Exception|Error e)
	{
		System.out.println("Error has occured while changing text color :" +" " +e.getMessage());
		throw(e);
	}
		return colouredText;
	}

//============================================================================================
//FunctionName 		: RMA_Random_StringGeneration_Utility
//Description  		: To Generate A Random String
//Input Parameter 	: IntStringLength Of The Type Integer Which Specifies Character Length Of The Generated Random String, AppendString Of Type String Which Is Appended To The Generated Random String
//Revision			: 0.0 - KumudNaithani-01-10-2017
//============================================================================================
public static String RMA_Random_StringGeneration_Utility(int IntStringLength, String AppendString) throws Exception, Error
{	
	//To Concatenate The Return Value To A Fixed Desired Starting Value User Needs To Call This Function Store The Value In A Variable And Then Concatenate Using + Operator
	try
	{
		String GeneratedRandomString;
		//Local Variable Declaration
		
		StrGeneratedString = null;
		//Variable Initialization Completed
		
		GeneratedRandomString = RandomStringUtils.random(IntStringLength, true, false);
		StrGeneratedString = GeneratedRandomString.toUpperCase();
		StrGeneratedString = AppendString + StrGeneratedString; //Final Value Of Address 1 After Random String Append Is Fetched
	} catch (Exception|Error e) {
		System.out.println("Random String Was Not Generated As" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Exception And Print Log Of It
		throw (e);
	}
	return StrGeneratedString;
}

//============================================================================================
//FunctionName 		: RMA_WebViewContextSwitch_Utility
//Description  		: Enables Users To Switch Context To WebView From Native View
//Input Parameter 	: logval Of Type Integer Denoting Whether Parent Or Child Logger Is To Be Used
//Revision			: 0.0 - KumudNaithani-01-05-2017                                 
//============================================================================================
public static void RMA_WebViewContextSwitch_Utility(int logval) throws Exception, Error
{
try{
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
			//System.out.println("conetxis"+contextName);
			if (contextName.contains("WEBVIEW"))
			{
				//System.out.println("reached");
				driver.context(contextName);
				Thread.sleep(2000);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.INFO, "The Context Switching To Web View From Native View Is Successfully Done");
				}
				else
				{
					logger.log(LogStatus.INFO, "The Context Switching To Web View From Native View Is Successfully Done");
				}
				break;
			}
		}

	}catch(Exception|Error e)
	{
		if (logval == 0)
		{
			parentlogger.log(LogStatus.FAIL, "The Context Switching To WebView"+" "+"Is Not Completed Successfully And Error Message Is :"+" "+color.RMA_ChangeColor_Utility(e.getMessage(), 1));
		}
		else
		{
			logger.log(LogStatus.FAIL, "The Context Switching To WebView"+" "+"Is Not Completed Successfully And Error Message Is :"+" "+color.RMA_ChangeColor_Utility(e.getMessage(), 1));
		}
		throw(e);
	}
}

//============================================================================================
//FunctionName 		: RMA_NativeViewContextSwitch_Utility
//Description  		: Enables Users To Switch Context To Native View From WEB View
//Input Parameter 	: logval Of Type Integer Denoting Whether Parent Or Child Logger Is To Be Used
//Revision			: 0.0 - KumudNaithani-01-05-2017                                 
//============================================================================================
public static void RMA_NativeViewContextSwitch_Utility(int logval) throws Exception, Error
{
try{
	driver.context(NativeContext);
	Thread.sleep(2000);
	if (logval == 0)
	{
		parentlogger.log(LogStatus.INFO, "The Context Switching To Native View From Web View Is Successfully Done");
	}
	else
	{
		logger.log(LogStatus.INFO, "The Context Switching To Native View From Web View Is Successfully Done");
	}
	}catch(Exception|Error e)
	{
		if (logval == 0)
		{
			parentlogger.log(LogStatus.FAIL, "The Context Switching To NativeView From Web View"+" "+"Is Not Completed Successfully And Error Message Is :"+" "+color.RMA_ChangeColor_Utility(e.getMessage(), 1));
		}
		else
		{
			logger.log(LogStatus.FAIL, "The Context Switching To NativeView From Web View"+" "+"Is Not Completed Successfully And Error Message Is :"+" "+color.RMA_ChangeColor_Utility(e.getMessage(), 1));
		}
		throw(e);
	}
}

//============================================================================================
//FunctionName 		: RMA_StaticWait
//Description  		: Provide Static Wait
//Input Parameter 	: Provide Time In Seconds For Which Application Would Wait For 
//Revision			: 0.0 - KumudNaithani-01-12-2017                                 
//============================================================================================
public static void RMA_StaticWait (int sec, int logval, String WaitReason) throws Exception, Error {
	try{
		int sec1=sec*1000;
		Thread.sleep(sec1);
		if (logval == 0)
		{
			parentlogger.log(LogStatus.INFO, "Successfully Waited For :" +" " +sec +" " +"Seconds" +" " + "Due To Reason::" +  " " + color.RMA_ChangeColor_Utility(WaitReason,4) );	
		}
		else
		{
			logger.log(LogStatus.INFO, "Successfully Waited For :" +" " +sec +" " +"Seconds" +" " + "Due To Reason::" +  " " + color.RMA_ChangeColor_Utility(WaitReason,4) );
		}
	}catch(Exception|Error e)	
	{
		if (logval ==0)
		{
			parentlogger.log(LogStatus.FAIL ,"Error Occurred While Wait :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
		}
		else
		{
			logger.log(LogStatus.FAIL ,"Error Occurred While Wait :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw(e);
		}
}
	
//============================================================================================
//FunctionName 		: RMA_AppReloadUtility
//Description  		: Reloads RMA Mobile Application
//Input Parameter 	: Provide Time In Seconds For Which Application Would Wait For 
//Revision			: 0.0 - KumudNaithani-01-12-2017                                 
//============================================================================================
public static void RMA_HomeViewUtility(int logval) throws Exception, Error {
	try {
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Btn_Home(), "Home Image Button On RMA Mobile App Default View",logval);
		globalWait.until(ExpectedConditions.visibilityOf((RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Tasks())));
		
		if (logval ==0)
		{
			parentlogger.log(LogStatus.INFO ,"RMA Mobile Application's Default View Is Successfully Loaded");
		}
		else
		{
			logger.log(LogStatus.INFO ,"RMA Mobile Application's Default View Is Successfully Loaded");
		}
			
	}catch(Exception|Error e)	
	{
		if (logval ==0)
		{
			parentlogger.log(LogStatus.FAIL ,"Following Error Occurred While Loading Default View Of RMA Mobile Application:" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
		}
		else
		{
			logger.log(LogStatus.FAIL ,"Following Error Occurred While Loading Default View Of RMA Mobile Application:" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
		}
			throw(e);
		}
	}

//====================================================================================================================================================================================================================================================
//FunctionName 		: RMA_Hyperlink
//Description  		: Enables User To Provide A Unique HyperLink Text To A Particular String Through Which It Can Be Accessed As A Link
//Input Parameter 	: ID: Unique ID Provides To The String To Be Accessed As A HyperLink, HyperLinkString: String To Be Accessed As A HyperLink, Index= Index Number Of The HyperLink String To Be Accessed In Case Of Multiple Occurrences
//Revision			: 0.0 - KumudNaithani-14-02-2017                                 
// =====================================================================================================================================================================================================================================================
public static String RMA_Hyperlink(String ID, String HyperLinkString, int Index) throws Exception,Error
{
	try
	{
		StrGeneratedString=null;
		StrGeneratedString= "<a href='#"+ ID+"' onclick=\"document.querySelectorAll('#test-details-wrapper #"+ID+"')["+Index+"].scrollIntoView();\"> "+HyperLinkString+"</a>";
	}catch(Exception|Error e)
	{
		System.out.println("Following Error Occurred While Generating HyperLink For String:"+ " "+ HyperLinkString +" " +e.getMessage());
		throw(e);
	}
	return StrGeneratedString;
}
}


