package rmaseleniumutilties_UX;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import javax.swing.JLabel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed


public class RMA_GenericUsages_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	public static Date Date1 = null;
	static int IntRandomNum=-1;
	static long RandomNum;
	static String StrGeneratedUCaseRandomString;
	static String StrAlertMessage;
	static boolean boolval=false;
	public static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	static JLabel label = new JLabel(); //Created JLabel instance
	static String genericString;
	public static String ChildWindow;
	public static WebDriverWait Wait = new WebDriverWait(driver, 3);

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_CurrentDateInfo_Utility
	//Description  		: To Retrieve The Current System Date in "yyyyMMdd"
	//Input Parameter 	: None 
	//Revision			: 0.0 - KumudNaithani-05-29-2017   
	// ===========================================================================================================================================================================================
	public static String RMA_CurrentDateInfo_Utility(String datetype) throws Exception,Error
	{
		String Strdated = null;
		try
		{
			DateFormat dateformat = new SimpleDateFormat(datetype); //Date Format Is Defined
			Date date = new Date();
			Strdated = dateformat.format(date); //Retrieved Date Is Formatted
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Generating Current Date : " +" " +e.getMessage());
			throw(e);
		}
		return Strdated;
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_CurrentTimeInfo_Utility
	//Description  		: To Retrieve The Current System Time in "hhmmss" format 
	//Input Parameter 	: None 
	//Revision			: 0.0 - KumudNaithani-10-22-2015      
	//ModifiedBy		: 0.0 - RenuVerma-10-13-2016 current format as hhmm                          
	//===========================================================================================================================================================================================
	public static String RMA_CurrentTimeInfo_Utility(String TimeFormatType) throws Exception,Error
	{
		String Strdated = null;
		try
		{
			DateFormat dateformat = new SimpleDateFormat(TimeFormatType); //Date Format Is Defined
			Date date = new Date();
			Strdated = dateformat.format(date); //Retrieved Date Is Formatted
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Generating Current Time : " +" " +e.getMessage());
			throw(e);
		}
		return Strdated;
	}


	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetWorkingDaysBetweenTwoDates_Utility
	//Description  		: To get the Working days in Between 2 dates
	//Input Parameter 	: None 
	//Revision			: 0.0 - ShrutiShruti-07-16-2018      
	//===========================================================================================================================================================================================
	public static int RMA_GetWorkingDaysBetweenTwoDates_Utility(Date StartDate, Date EndDate) throws Exception,Error
	{

		try
		{
			Calendar startCal;  
			Calendar endCal;  
			startCal = Calendar.getInstance();  
			startCal.setTime(StartDate);  
			endCal = Calendar.getInstance();  
			endCal.setTime(EndDate);  
			int workDays = 0;  

			//Return 0 if start and end are the same  
			if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {  
				return 0;  
			}  
			if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {  
				startCal.setTime(EndDate);  
				endCal.setTime(StartDate);  
			}  
			do {  
				if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY   
						&& startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {  
					++workDays;  
				}  
				startCal.add(Calendar.DAY_OF_MONTH, 1);  
			} while (startCal.getTimeInMillis() <= endCal.getTimeInMillis());  
			return workDays;  
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Calculating Working Days : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetNumberOfDaysPaid_Utility
	//Description  		: To Get Number Of Days Paid According TO NonOcc Payments
	//Input Parameter 	: None 
	//Revision			: 0.0 - ShrutiShruti-07-18-2018      
	//===========================================================================================================================================================================================
	public static int RMA_GetNumberOfDaysPaid_Utility(String StartDate) throws Exception,Error
	{ int DaysPaid=0;
	try
	{
		Date date = new Date();
		date = new SimpleDateFormat("MM/dd/yyyy").parse(StartDate);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		int daysofweek = calendar.get(Calendar.DAY_OF_WEEK);

		if(daysofweek==2)
			DaysPaid = 5;
		else if(daysofweek==3)
			DaysPaid = 4;
		else if(daysofweek==4)
			DaysPaid = 3;
		else if(daysofweek==5)
			DaysPaid = 2;
		else if(daysofweek==6)
			DaysPaid = 1;
		else DaysPaid=0;
	}catch(Exception|Error e)
	{
		System.out.println("Following Error Occurred While Calculating Working Days : " +" " +e.getMessage());
		throw(e);
	}
	return DaysPaid;
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetDateAfterAddingWorkingDays_Utility
	//Description  		: To Add N Working Days To A Date
	//Input Parameter 	: None 
	//Revision			: 0.0 - ShrutiShruti-07-16-2018      
	//===========================================================================================================================================================================================
	public static String RMA_GetDateAfterAddingWorkingDays_Utility(String StartDate, int WorkingDays) throws Exception,Error
	{

		try
		{
			Date date= new Date();
			String ModifiedDate=null;

			Date1=(Date) new SimpleDateFormat("MM/dd/yyyy").parse(StartDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(Date1);

			int startdayofweek = calendar.get(Calendar.DAY_OF_WEEK);

			if((startdayofweek==7)||(startdayofweek==1))
			{                   
				do{
					int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);
					if(dayofweek==7)
					{
						calendar.add(Calendar.DAY_OF_WEEK, 1);
						WorkingDays = WorkingDays-0;
					}
					else{
						calendar.add(Calendar.DAY_OF_WEEK, 1);
						WorkingDays = WorkingDays-1;
					}
				}while(WorkingDays>0);
			}
			else
			{                   
				do{
					int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);
					if((dayofweek==7)||(dayofweek==1))
					{
						calendar.add(Calendar.DAY_OF_WEEK, 1);
						WorkingDays = WorkingDays-0;
					}
					else{
						calendar.add(Calendar.DAY_OF_WEEK, 1);
						WorkingDays = WorkingDays-1;
					}
				}while(WorkingDays>0);
			}
			int lastdayofweek = calendar.get(Calendar.DAY_OF_WEEK);
			if(lastdayofweek==7)
			{
				calendar.add(Calendar.DAY_OF_WEEK, 2);
			}
			date = calendar.getTime();
			DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
			ModifiedDate = dateformat.format(date);
			return ModifiedDate;  
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Calculating Working Days : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetDateFromString_Utility
	//Description  		: To get Date From String Type
	//Input Parameter 	: None 
	//Revision			: 0.0 - ShrutiShruti-07-16-2018      
	//===========================================================================================================================================================================================
	public static Date RMA_GetDateFromString_Utility(String StrDate,String DateFormat) throws Exception,Error
	{

		try
		{
			Date1=(Date) new SimpleDateFormat(DateFormat).parse(StrDate);  
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Converting Date from String Value : " +" " +e.getMessage());
			throw(e);
		}

		return Date1;
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetDateAfterAddingSpecificDay_Utility
	//Description  		: To get Date From String Type
	//Input Parameter 	: None 
	//Revision			: 0.0 - ShrutiShruti-07-16-2018      
	//===========================================================================================================================================================================================
	public static String RMA_GetDateAfterAddingSpecificDay_Utility(String StrDate,int DayNumber) throws Exception,Error
	{

		try
		{
			String ModifiedDate = null;
			Calendar ToDate = Calendar.getInstance();
			Date date = new Date();
			date = new SimpleDateFormat("MM/dd/yyyy").parse(StrDate);
			ToDate.setTime(date);
			ToDate.set(Calendar.DAY_OF_WEEK, DayNumber);
			date = ToDate.getTime();
			SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
			ModifiedDate = dateformat.format(date);

			return ModifiedDate;
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Converting Date from String Value : " +" " +e.getMessage());
			throw(e);
		}

	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_AddNumberOfDaysInADate_Utility
	//Description  		: To get N Number Of Days In A Date
	//Input Parameter 	: None 
	//Revision			: 0.0 - ShrutiShruti-07-17-2018      
	//===========================================================================================================================================================================================
	public static String RMA_AddNumberOfDaysInADate_Utility(String StrDate,String DateFormat, int NumberOfDays) throws Exception,Error
	{

		try
		{
			Date date = new Date();
			String ModifiedDate;
			Date1=(Date) new SimpleDateFormat("MM/dd/yyyy").parse(StrDate);  
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(Date1);
			calendar.add(Calendar.DAY_OF_WEEK, NumberOfDays);
			date = calendar.getTime();
			DateFormat dateformat = new SimpleDateFormat(DateFormat);
			ModifiedDate = dateformat.format(date);
			return ModifiedDate;
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Converting Date from String Value : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetNumberOfWeeks_Utility
	//Description  		: To Get Number Of Weeks Between 2 Dates
	//Input Parameter 	: None 
	//Revision			: 0.0 - ShrutiShruti-07-17-2018      
	//===========================================================================================================================================================================================
	public static int RMA_GetNumberOfWeeks_Utility(String StartDate,String EndDate) throws Exception,Error
	{

		try
		{
			int WeekNumber;
			float Temp;
			Date startdate = new Date();
			startdate = new SimpleDateFormat("MM/dd/yyyy").parse(StartDate);
			Date enddate = new Date();
			enddate = new SimpleDateFormat("MM/dd/yyyy").parse(EndDate);
			Calendar StartCal = Calendar.getInstance();
			Calendar EndCal = Calendar.getInstance();
			StartCal.setTime(startdate);
			EndCal.setTime(enddate);

			long Diff = enddate.getTime()-startdate.getTime();
			float daycount = (float)Diff/(24*60*60*1000);
			Temp = (daycount/7);
			WeekNumber = (int) Math.ceil(Temp);
			return WeekNumber;
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Getting Week Number In Between 2 Dates : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ModelDialogHandler_Utility
	//Description  		: Handles Any Type Of Windows Pop Up And Accepts Or Rejects The Same (Say Clicking On Yes Or No Button) 
	//Input Parameter 	: Instance Of The WebDriver Class 'Driver' And Value Of The String 'StrAccept', Intlogavl Of Type Integer
	//Revision		    : 0.0 - KumudNaithani-01-06-2017
	//=======================================================================================================================================================================================================================================================================================================================================
	public static void RMA_ModelDialogHandler_Utility(WebDriver driver, String StrAccept, int Intlogval)throws Exception, Error
	{  
		try {
			if(RMA_Selenium_POM_Home.RMAApp_Generic_ModalDialog(driver)!=null)
				Wait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_Generic_ModalDialog(driver)));// Wait For Modal Dialog To Be Present
			if (StrAccept == "Yes") // If The User Chooses To Accept The Modal Dialog That Is The Positive Option Say "Yes", "OK" Or "Leave The Page" Then Modal Dialog Is Accepted And Desired Action Is Done Like Refereshing The Page
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ModalDialogOK(driver), "OK Button On Modal Dialog On Risk Master Application",Intlogval);	
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ModalDialogCancel(driver), "Cancel Button On Modal Dialog On Risk Master Application",Intlogval);	 // If The User Chooses To Decline The Modal Dialog That Is The Negative Option Say "No", "Cancel" Or "Stay On The Page" Then Modal Dialog Is Dismissed And Desired Action Is Done Like Staying On The Page
			} 
		}
		catch (org.openqa.selenium.NoSuchElementException t)
		{
			//System.out.println("NoSuchElementException Exception Occurred While Handling Model Dialog" + t.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
		}
		catch (Exception|Error e) 
		{
			//System.out.println("Exception Occurred While Handling Model Dialog" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
			throw (e);
		}
	}

	//=================================================================================================================================================================================================================================
	//FunctionName 		: RMA_RandomIntGeneration_Utility
	//Description  		: To Generate A Random Number Based On The Maximum And Minimum Integer Limit Provided
	//Input Parameter 	: IntMinRange, IntMaxRange Of The Type Integer To Specify The Range Of The Generated Random Number
	//Revision			: 0.0 - KumudNaithani-11-02-2015                                 
	//=================================================================================================================================================================================================================================
	public static int RMA_RandomIntGeneration_Utility(int IntMinRange, int IntMaxRange) throws Exception, Error
	{
		// To Concatenate The Return Value To A Fixed Desired Starting Value User Needs To Call This Function Store The Value In A Variable And Then Concatenate Using + Operator
		try 
		{
			Random rand = new Random();
			IntRandomNum = rand.nextInt((IntMaxRange - IntMinRange) + 1) + IntMinRange; // Since nextInt Is Exclusive Of The Maximum Value So 1 Is Added To Make It Inclusive	
		} catch (Exception|Error e) {
			System.out.println("Random Number Was Not Generated As" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Exception And Print Log Of It
			throw (e);
		}
		return IntRandomNum;
	}

	//=================================================================================================================================================================================================================================
	//FunctionName 		: RMA_RandomLongGeneration_Utility
	//Description  		: To Generate A Random Number Based On The Maximum And Minimum long Limit Provided
	//Input Parameter 	: inRange,MaxRange Of The Type Long To Specify The Range Of The Generated Random Number
	//Revision			: 0.0 - RenuVerma-05-31-2017                                
	//=================================================================================================================================================================================================================================
	public static long RMA_RandomLongGeneration_Utility(long MinRange, long MaxRange) throws Exception, Error
	{
		// To Concatenate The Return Value To A Fixed Desired Starting Value User Needs To Call This Function Store The Value In A Variable And Then Concatenate Using + Operator
		RandomNum=0;
		try 
		{
			RandomNum = ThreadLocalRandom.current().nextLong(MinRange, MaxRange);
		} catch (Exception|Error e) {
			System.out.println("Random Number Was Not Generated As" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Exception And Print Log Of It
			throw (e);
		}
		return RandomNum;
	}

	//=============================================================================================================================================================================================================================
	//FunctionName 		: RMA_RandomStringGeneration_Utility
	//Description  		: To Generate A Random String
	//Input Parameter 	: IntStringLength Of The Type Integer Which Specifies Character Length Of The Generated Random String, AppendString Of Type String Which Is Appended To The Generated Random String
	//Revision			: 0.0 - KumudNaithani-12-17-2015 - Added Code To Append Any String Provided By The User To The Generated Random String
	//					: 0.1 - KumudNaithani-11-02-2015
	//================================================================================================================================================================================================================================
	public static String RMA_RandomStringGeneration_Utility(int IntStringLength, String AppendString) throws Exception, Error
	{	
		//To Concatenate The Return Value To A Fixed Desired Starting Value User Needs To Call This Function Store The Value In A Variable And Then Concatenate Using + Operator
		try
		{
			String GeneratedRandomString = RandomStringUtils.random(IntStringLength, true, false);
			StrGeneratedUCaseRandomString = GeneratedRandomString.toUpperCase();
			StrGeneratedUCaseRandomString = AppendString + StrGeneratedUCaseRandomString; //Final Value Of Address 1 After Random String Append Is Fetched
		} catch (Exception|Error e) {
			System.out.println("Random String Was Not Generated As" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Exception And Print Log Of It
			throw (e);
		}
		return StrGeneratedUCaseRandomString;
	}

	//==========================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_WebPageRefresh_Utility
	//Description  		: Refreshes The RMA WebPage 
	//Input Parameter 	: None
	//Revision			: 0.0 - KumudNaithani-11-02-2015                                 
	//==========================================================================================================================================================================================================================================================================================
	public static void RMA_WebPageRefresh_Utility(int logval) throws Exception, Error 
	{	
		try {
			String StrAccept = "Yes";
			driver.navigate().refresh(); //Web page Is Refreshed
			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO, "Web Page Is Refreshed");
			}
			else{
				logger.log(LogStatus.INFO, "Web Page Is Refreshed");
			}

			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes");
			RMA_ModelDialogHandler_Utility(driver, StrAccept, logval); //Alert Window Is Refreshed

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Windows PopUp That Appears On Web Page Refresh Is Accepted And WebPage Is Leaved");
			}
			else{
				logger.log(LogStatus.INFO, "Windows PopUp That Appears On Web Page Refresh Is Accepted And WebPage Is Leaved");
			}

			//Thread.sleep(10000);
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Page Frame Is Created
			//Thread.sleep(5000);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("cphMainBody_uwtPortal_frame0"); //A Switch To The Frame Containing RMA Application Menu Option Is Done

		} catch (Exception|Error e) {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.FAIL, "Web Page Was Not Refreshed Due To Following Reason:" + " " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else{
				logger.log(LogStatus.FAIL, "Web Page Was Not Refreshed Due To Following Reason:" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1)); //Try Catch Statement Is Used To Handle Any Type Of Un-handled Exception And Print Log Of It
			}
			throw (e);
		}
	}

	//==========================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_WindowSwitching_Utility
	//Description  		: To Switch The Multiple Windows That Are Opened In RMA Application
	//Input Parameter 	: None
	//Revision			: 0.0 - KumudNaithani-11-30-2015                                 
	//==========================================================================================================================================================================================================================================================================================
	public static void RMA_WindowSwitching_Utility() throws Exception, Error 
	{
		try {
			globalWait.until(ExpectedConditions.numberOfWindowsToBe(2));
			String StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
			Set<String> strWindowHandles = driver.getWindowHandles(); //Entire Set Of The Present Window Handles Is Fetched
			Iterator<String>windowiterator = strWindowHandles.iterator(); //Entire Set Of The Present Window Handles Is Iterated
			while (windowiterator.hasNext())
			{
				String ChildWindow = windowiterator.next();
				if (!StrPrimaryWindowHandle.equalsIgnoreCase(ChildWindow)) //If The Fetched Child Window Is Not Equal To the Parent Window Then A Switch To The Child Window Is Done
				{
					driver.switchTo().window(ChildWindow);
					//System.out.println("reached");
				}
			}
		} catch (Exception|Error e) {
			System.out.println("Following Error Occurred While Switching Window :" +" " +e.getMessage());
			throw (e);
		}
	}

	//==========================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_WindowSwitching_Utility_NonUX
	//Description  		: To Switch Window Back To The RMA UX Application
	//Input Parameter 	: None
	//Revision			: 0.0 - KumudNaithani-07-18-2017                                 
	//==========================================================================================================================================================================================================================================================================================
	public static void RMA_WindowSwitching_Utility_NonUX() throws Exception, Error 
	{
		try {
			globalWait.until(ExpectedConditions.numberOfWindowsToBe(2));
			Set<String> strWindowHandles = driver.getWindowHandles(); //Entire Set Of The Present Window Handles Is Fetched
			Iterator<String>windowiterator = strWindowHandles.iterator(); //Entire Set Of The Present Window Handles Is Iterated
			while (windowiterator.hasNext())
			{
				String ChildWindow = windowiterator.next();
				if (!StrRMAWindowHandle.equalsIgnoreCase(ChildWindow)) //If The Fetched Child Window Is Not Equal To the Parent Window Then A Switch To The Child Window Is Done
				{
					driver.switchTo().window(ChildWindow);
					//System.out.println("reached");
				}
			}
		} catch (Exception|Error e) {
			System.out.println("Following Error Occurred While Switching Window :" +" " +e.getMessage());
			throw (e);
		}
	}

	//===================================================================================================================================================================================================================
	//FunctionName 		: RMA_ChangeColor
	//Description  		: Changes Text Color, Parameter 1 Is For Red, 2 For Green, 3 For Blue, 4 For Orange
	//Input Parameter 	: None
	//Revision			: 0.0 - ImteyazAhmad-11-30-2015                                 
	//=================================================================================================================================================================================================================
	public String RMA_ChangeColor_Utility (String text, int num) throws Exception, Error {
		String colouredText = null ;
		String text1=null;
		try {
			//			switch(num){
			//			case 1: //text color is changed to Red As an Error
			//				label.setText("<span style='color:red'><b>" + text+ "</b></script></span>");
			//				colouredText = label.getText();
			//				break;
			//			case 2: //text color is changed to Green as Application Generated
			//				label.setText("<span style='color:green'><b>" + text+ "</b></script></span>");
			//				colouredText = label.getText();
			//				break;
			//			case 3: //text color is changed to Blue as User Input
			//				label.setText("<span style='color:blue'><b>" + text+ "</b></script></span>");
			//				colouredText = label.getText();
			//				break;
			//			case 4: //text color is changed to Orange as Control Name
			//				label.setText("<span style='color:orange'><b>" + text+ "</b></script></span>");
			//				colouredText = label.getText();
			//				break;
			//			case 5: //text color is changed to Pink as Steps start and end
			//				label.setText("<span style='color:DEEPPINK'><b>" + text+ "</b></script></span>");
			//				colouredText = label.getText();
			//				break;
			//			}
			// Above Code Commented For Adding Code For Displaying MC Symbols  

			if(text.isEmpty()) {
				switch(num){
				case 1: //text color is changed to Red As an Error
					label.setText("<span style='color:red'><b>" + text+ "</b></script></span>");
					colouredText = label.getText();
					break;
				case 2: //text color is changed to Green as Application Generated
					label.setText("<span style='color:green'><b>" + text+ "</b></script></span>");
					colouredText = label.getText();
					break;
				case 3: //text color is changed to Blue as User Input
					label.setText("<span style='color:blue'><b>" + text+ "</b></script></span>");
					colouredText = label.getText();
					break;
				case 4: //text color is changed to Orange as Control Name
					label.setText("<span style='color:orange'><b>" + text+ "</b></script></span>");
					colouredText = label.getText();
					break;
				case 5: //text color is changed to Pink as Steps start and end
					label.setText("<span style='color:DEEPPINK'><b>" + text+ "</b></script></span>");
					colouredText = label.getText();
					break;
				}
			}
			else if (!text.isEmpty()){
				text1 = text.substring(0, 1);
				if(!(text1.equals("$") || text1.equals("\u20AC") || text1.equals("\u00A3") || text1.equals("\u20B9"))){
					switch(num){
					case 1: //text color is changed to Red As an Error
						label.setText("<span style='color:red'><b>" + text+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 2: //text color is changed to Green as Application Generated
						label.setText("<span style='color:green'><b>" + text+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 3: //text color is changed to Blue as User Input
						label.setText("<span style='color:blue'><b>" + text+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 4: //text color is changed to Orange as Control Name
						label.setText("<span style='color:orange'><b>" + text+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 5: //text color is changed to Pink as Steps start and end
						label.setText("<span style='color:DEEPPINK'><b>" + text+ "</b></script></span>");
						colouredText = label.getText();
						break;
					}
				}

				else if(text1.equals("$")){
					switch(num){
					case 1: //text color is changed to Red As an Error
						label.setText("<span style='color:red'><b>" + text+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 2: //text color is changed to Green as Application Generated
						label.setText("<span style='color:green'><b>" + text+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 3: //text color is changed to Blue as User Input
						label.setText("<span style='color:blue'><b>" + text+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 4: //text color is changed to Orange as Control Name
						label.setText("<span style='color:orange'><b>" + text+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 5: //text color is changed to Pink as Steps start and end
						label.setText("<span style='color:DEEPPINK'><b>" + text+ "</b></script></span>");
						colouredText = label.getText();
						break;
					}

				}
				else if(text1.equals("\u00A3")){
					String newfirst = text.replace("\u00A3", "&pound;");
					switch(num){
					case 1: //text color is changed to Red As an Erro r
						label.setText("<span style='color:red'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 2: //text color is changed to Green as Application Generated
						label.setText("<span style='color:green'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 3: //text color is changed to Blue as User Input
						label.setText("<span style='color:blue'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 4: //text color is changed to Orange as Control Name
						label.setText("<span style='color:orange'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 5: //text color is changed to Pink as Steps start and end
						label.setText("<span style='color:DEEPPINK'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					}
				}
				else if(text1.equals("\u20AC")){
					String newfirst = text.replace("\u20AC", "&#8364;");
					switch(num){
					case 1: //text color is changed to Red As an Error
						label.setText("<span style='color:red'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 2: //text color is changed to Green as Application Generated
						label.setText("<span style='color:green'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 3: //text color is changed to Blue as User Input
						label.setText("<span style='color:blue'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 4: //text color is changed to Orange as Control Name
						label.setText("<span style='color:orange'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 5: //text color is changed to Pink as Steps start and end
						label.setText("<span style='color:DEEPPINK'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					}
				}
				else if (text1.equalsIgnoreCase("\u20B9")){
					String newfirst = text.replace("\u20B9", "&#8377;");
					switch(num){
					case 1: //text color is changed to Red As an Error
						label.setText("<span style='color:red'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 2: //text color is changed to Green as Application Generated
						label.setText("<span style='color:green'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 3: //text color is changed to Blue as User Input
						label.setText("<span style='color:blue'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 4: //text color is changed to Orange as Control Name
						label.setText("<span style='color:orange'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					case 5: //text color is changed to Pink as Steps start and end
						label.setText("<span style='color:DEEPPINK'><b>" + newfirst+ "</b></script></span>");
						colouredText = label.getText();
						break;
					}
				}
			}

		}
		catch (Exception|Error e)
		{
			//System.out.println("Error has occured while changing text color :" +" " +e.getMessage());
			throw(e);
		}
		return colouredText;
	}

	//==================================================================================================================================================
	//FunctionName 		: RMA_FrameNavigation
	//Description  		: Enables The User To Navigate To A Particular Frame On The Basis Of A Static Value Present In The Frame ID
	//Input Parameter 	: String Text Contains The Static Value Present In The Frame ID
	//Revision			: 0.0 - KumudNaithani-11-08-2015                                 
	//=================================================================================================================================================
	public static int RMA_FrameNavigation (String text) throws Exception, Error {
		try {
			List<WebElement> ele  = driver.findElements(By.tagName("IFRAME"));
			int ListSize = ele.size();
			for (IntRandomNum=0; IntRandomNum<ListSize; IntRandomNum++)
			{
				String attribute = String.valueOf(ele.get(IntRandomNum).getAttribute("id")); //Returns the Id of a frame.		
				//System.out.println(attribute+" and "+text);
				//System.out.println(text);
				if (attribute.contains(text)||text.equalsIgnoreCase(attribute))
				{
					//System.out.println("in");
					break;
				}
			}
			return IntRandomNum;
		} catch (Exception|Error e) {
			//System.out.println("Error Occurred While Navigating Frame :" +color.RMA_ChangeColor_Utility(text, 1)+" " +e.getMessage());
			throw new Exception("Error Occurred While Navigating Frame :" +color.RMA_ChangeColor_Utility(text, 1)+" " +e.getMessage());
		}		
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_StaticWait
	//Description  		: Provide Static Wait
	//Input Parameter 	: Provide Time In Seconds For Which Application Would Wait For 
	//Revision			: 0.0 - KumudNaithani-11-08-2015                                 
	//===========================================================================================================================================================================================
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

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_WindowSwitchingBasedOnTitle
	//Description  		: To Switch To Particular Window Based On Title Name
	//Input Parameter 	: Provide Title Name As String Parameter Of Window To Be Switched To 
	//Revision			: 0.0 - ImteyazAhmad-02-02-2016  
	//Modified By		: 1.0 - ShrutiShruti-08-16-2018 
	//===========================================================================================================================================================================================
	public static void RMA_WindowSwitchingBasedOnTitle (String TitleName) throws Exception, Error {
		try{
			String strTitle;
			Boolean TitleFound;
			TitleFound = false;
			TitleName = TitleName.trim();
			Set<String> strWindowHandles = driver.getWindowHandles(); //Entire Set Of The Present Window Handles Is Fetched
			Iterator<String> windowiterator = strWindowHandles.iterator(); //Entire Set Of The Present Window Handles Is Iterated
			while (windowiterator.hasNext())
			{
				String ChildWindow = windowiterator.next();					
				driver.switchTo().window(ChildWindow);
				//Thread.sleep(4000);
				strTitle = driver.getTitle();
				if (strTitle.contains(TitleName))
				{		
					TitleFound = true;
					return;
				}
			}	

			if (TitleFound == false)
			{
				//	System.out.println("Of All Opened Windows ,The Window With Provided Title Name :" + " " + TitleName +" " + ", Is Not Found Hence Switching To Required Window Can Not Be Done");
				Assert.fail("Of All Opened Windows ,The Window With Provided Title Name :" + " " + TitleName +" " + ", Is Not Found Hence Switching To Required Window Can Not Be Done");

			}

		}catch(Exception|Error e)	
		{
			//System.out.println("Error Occurred While Switching Window Based On Provided Title Name And Error Message Is :" +" " +e.getMessage());
			throw(e);
		}
	}

	//=======================================================================================================================================================================================================================================
	//FunctionName 		: RMA_CloseWindowBasedOnTitle
	//Description  		: To Close A Particular Window Based On Title Name
	//Input Parameter 	: Provide Title Name As String Parameter Of Window To Be Closed 
	//Revision			: 0.0 - ImteyazAhmad-02-02-2016 
	//====================================================================================================================================================================================================================================
	//Note: Please Refrain From Using Following Function As Titles Might Changes And If Present Too Selenium Is Not Able To Identify

	public static void RMA_CloseWindowBasedOnTitle (String TitleName) throws Exception, Error {
		try{
			String strTitle;
			Boolean TitleFound;
			TitleFound = false;
			TitleName = TitleName.toUpperCase();
			TitleName = TitleName.trim();
			Set<String> strWindowHandles = driver.getWindowHandles(); //Entire Set Of The Present Window Handles Is Fetched
			Iterator<String> windowiterator = strWindowHandles.iterator(); //Entire Set Of The Present Window Handles Is Iterated
			while (windowiterator.hasNext())
			{
				String ChildWindow = windowiterator.next();					
				driver.switchTo().window(ChildWindow);
				//Thread.sleep(4000);
				strTitle = driver.getTitle();
				strTitle = strTitle.toUpperCase();
				if (strTitle.contains(TitleName))
				{	
					driver.close();
					TitleFound = true;
					return;
				}
			}		
			if (TitleFound == false)
			{
				System.out.println("Of All Opened Windows ,The Window With Provided Title Name :" + " " + TitleName +" " + ", Is Not Found Hence Required Window Can Not Be Closed");
			}

		}catch(Exception|Error e)	
		{
			System.out.println("Error Occurred While Closing Window Based On Provided Title Name And Error Message Is :" +" " +e.getMessage());
			throw(e);
		}
	}
	//===========================================================================================================================================================================
	//FunctionName 		: RMA_GetDataFromDataBase
	//Description  		: To Update,Delete,Match,Match Partially,Fetch Record From DataBase
	//Input Parameter 	: Provide DsnName,SqlQuery,OperationType,ExpectedValue,ColumnName,logval
	//Revision			: 0.0 - ImteyazAhmad-02-15-2016                                 
	//=============================================================================================================================================================================
	public static String RMA_GetDataFromDataBase(String DsnName, String SqlQuery, String OperationType, String ExpectedValue, String ColumnName, int logval) throws Exception,Error
	{
		try
		{
			ResultSet Results;
			Connection Conn;
			String ConnectionString;
			String UserName;
			String Password;
			String Value;
			String DataBaseName;
			int RecordNumber;
			boolean Found;

			Found = false;
			Conn = null;
			DataBaseName = null;
			DsnName = DsnName.trim();
			SqlQuery = SqlQuery.trim().toUpperCase();
			OperationType = OperationType.trim().toUpperCase();
			ExpectedValue = ExpectedValue.trim().toUpperCase();
			ColumnName = ColumnName.trim().toUpperCase();

			if (DsnName.equalsIgnoreCase("RMA_SeleniumAutomation1_ACOFF"))
			{
				DataBaseName = "RMACDR154_SeleniumAutomation1_ACOFF";
			}

			else if(DsnName.equalsIgnoreCase("RMA_SeleniumAutomation2_ACOFF"))
			{
				DataBaseName = "RMACDR154_SeleniumAutomation2_ACOFF";
			}      
			DataBaseName = DataBaseName.trim();			
			ConnectionString = "jdbc:sqlserver://20.201.110.208:1433;DatabaseName="+DataBaseName;
			UserName = "sa";
			Password = "csc1234$";	

			//Loading the required JDBC Driver class 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
			//Creating a connection to the database 
			Conn = DriverManager.getConnection(ConnectionString,UserName,Password); 
			if (Conn == null)
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("The Connection To Database Is Not Established",1));
				}
				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("The Connection To Database Is Not Established",1));
				}

			}
			Statement Stat = Conn.createStatement();

			switch (OperationType)
			{
			case  "UPDATE" :

				RecordNumber = Stat.executeUpdate(SqlQuery);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "The Update Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On DSN :" +" " + DsnName +",  " + "And Number Of Rows Updated Is :" +" " +color.RMA_ChangeColor_Utility(String.valueOf(RecordNumber),2));

				}
				else 
				{
					logger.log(LogStatus.PASS, "The Update Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On DSN :" +" " + DsnName +",  " + "And Number Of Rows Updated Is :" +" " +color.RMA_ChangeColor_Utility(String.valueOf(RecordNumber),2));
				}
				break;

			case "DELETE" :

				RecordNumber = Stat.executeUpdate(SqlQuery);
				if (logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "The Delete Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On DSN :" +" " + DsnName +",  " + "And Number Of Rows Deleted Is :" +" " +color.RMA_ChangeColor_Utility(String.valueOf(RecordNumber),2));

				}
				else 
				{
					logger.log(LogStatus.PASS, "The Delete Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On DSN :" +" " + DsnName +",  " + "And Number Of Rows Deleted Is :" +" " +color.RMA_ChangeColor_Utility(String.valueOf(RecordNumber),2));
				}

				break;

			case "MATCH" :

				Results = Stat.executeQuery(SqlQuery);
				if (Results.next())
				{
					do
					{
						Value = Results.getString(ColumnName);
						if (Value.trim().equalsIgnoreCase(ExpectedValue))
						{
							if (logval == 0)
							{
								parentlogger.log(LogStatus.PASS, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " + "And Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue,3) +",  " + "Is Matched With Actual Value :" +" " +color.RMA_ChangeColor_Utility(Value,2));
							}
							else
							{
								logger.log(LogStatus.PASS, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " + "And Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue,3) +",  " + "Is Matched With Actual Value :" +" " +color.RMA_ChangeColor_Utility(Value,2));
							}
							Found = true;
							break;
						}

					} while (Results.next());

					if (Found == false)
					{						
						if (logval == 0)
						{
							parentlogger.log(LogStatus.FAIL, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " + "But Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue,3) +"  " +color.RMA_ChangeColor_Utility(", Does Not Exists In ResultSet Hence Verification Can Not Be Done",1));
						}
						else
						{
							logger.log(LogStatus.FAIL, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " + "But Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue,3) +"  " +color.RMA_ChangeColor_Utility(", Does Not Exists In ResultSet Hence Verification Can Not Be Done",1));
						}	
					}
				}
				else
				{
					if (logval == 0)
					{
						parentlogger.log(LogStatus.FAIL, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " +color.RMA_ChangeColor_Utility("But ResultSet Has No Record Hence Verification Can Not Be Done",1));
					}
					else
					{
						logger.log(LogStatus.FAIL, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " +color.RMA_ChangeColor_Utility("But ResultSet Has No Record Hence Verification Can Not Be Done",1));
					}					
				}

				break;

			case "MATCH PARTIALLY" :

				Results = Stat.executeQuery(SqlQuery);
				if (Results.next())
				{
					do
					{
						Value = Results.getString(ColumnName);
						if (Value.trim().toUpperCase().contains(ExpectedValue))
						{
							if (logval == 0)
							{
								parentlogger.log(LogStatus.PASS, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " + "And Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue,3) +",  " + "Is Available InActual Value :" +" " +color.RMA_ChangeColor_Utility(Value,2));
							}
							else
							{
								logger.log(LogStatus.PASS, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " + "And Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue,3) +",  " + "Is Available In Actual Value :" +" " +color.RMA_ChangeColor_Utility(Value,2));
							}
							Found = true;
							break;
						}

					} while (Results.next());

					if (Found == false)
					{						
						if (logval == 0)
						{
							parentlogger.log(LogStatus.FAIL, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " + "But Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue,3) +"  " +color.RMA_ChangeColor_Utility(", Does Not Exists In ResultSet Hence Verification Can Not Be Done",1));
						}
						else
						{
							logger.log(LogStatus.FAIL, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " + "But Expected Value : " +" " +color.RMA_ChangeColor_Utility(ExpectedValue,3) +"  " +color.RMA_ChangeColor_Utility(", Does Not Exists In ResultSet Hence Verification Can Not Be Done",1));
						}	
					}
				}
				else
				{
					if (logval == 0)
					{
						parentlogger.log(LogStatus.FAIL, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " +color.RMA_ChangeColor_Utility("But ResultSet Has No Record Hence Verification Can Not Be Done",1));
					}
					else
					{
						logger.log(LogStatus.FAIL, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " +color.RMA_ChangeColor_Utility("But ResultSet Has No Record Hence Verification Can Not Be Done",1));
					}					
				}
				break;

			case "FETCH" :

				Results = Stat.executeQuery(SqlQuery);
				if (Results.next())
				{					
					Value = Results.getString(ColumnName);                      
					if (logval == 0)
					{
						parentlogger.log(LogStatus.PASS, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " + " And Fetched Value Is :" +" " +color.RMA_ChangeColor_Utility(Value,2));
					}
					else
					{
						logger.log(LogStatus.PASS, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " + " And Fetched Value Is :" +" " +color.RMA_ChangeColor_Utility(Value,2));
					}					
					return Value;
				}

				else
				{
					if (logval == 0)
					{
						parentlogger.log(LogStatus.FAIL, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " +color.RMA_ChangeColor_Utility("But ResultSet Has No Record Hence Value Can Not Be Fetched ",1));
					}
					else
					{
						logger.log(LogStatus.FAIL, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Executed Successfully On Dsn :" +" " + DsnName +",  " +color.RMA_ChangeColor_Utility("But ResultSet Has No Record Hence Value Can Not Be Fetched",1));
					}	
				}
				break;				
			}

		}catch(Exception|Error e)
		{
			if (logval == 0)
			{
				parentlogger.log(LogStatus.FAIL, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Not Executed Successfully, And Error Message Is : " +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1 ));
			}
			else
			{
				logger.log(LogStatus.FAIL, "The Sql Query :" +" " +color.RMA_ChangeColor_Utility(SqlQuery,3) +",  " +"Is Not Executed Successfully, And Error Message Is : " +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1 ));	
			}
			throw(e);
		}
		return null;
	}	

	//=================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ModalDialogTextVerify_Utility
	//Description  		: Handles ModalDialog, Compares The Message Displayed And Accepts Or Rejects The Dialog (Say Clicking On Yes Or No Button) 
	//Input Parameter 	: Instance Of The WebDriver Class 'Driver', Value Of The String 'StrAccept', CompareFlg Value According To Which Partial Or Full Comparison Of The Message Text Is Done
	//Revision		    : 0.0-KumudNaithani-01-06-2017                              
	//==================================================================================================================================================================================================================================
	public static boolean RMA_ModalDialogTextVerify_Utility(String StrAccept, String CompareFlg, String ExpMsg, String ModalDialogMsg, int Intlogval)throws Exception, Error
	{
		boolval = false;  
		try {
			if(RMA_Selenium_POM_Home.RMAApp_Generic_ModalDialog(driver)!=null)
				Wait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_Generic_ModalDialog(driver)));// Wait For Modal Dialog To Be Present
			StrAlertMessage = RMA_Selenium_POM_Home.RMAApp_Generic_ModalDialog(driver).getText();
			//Thread.sleep(5000);
			if (StrAccept == "Yes") // If The User Chooses To Accept The Modal Dialog That Is The Positive Option Say "Yes", "OK" Or "Leave The Page" Then Modal Dialog Is Accepted And Desired Action Is Done Like Refereshing The Page
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ModalDialogOK(driver), "OK Button On Modal Dialog On Risk Master Application",Intlogval);	
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ModalDialogCancel(driver), "Cancel Button On Modal Dialog On Risk Master Application",Intlogval);	 // If The User Chooses To Decline The Modal Dialog That Is The Negative Option Say "No", "Cancel" Or "Stay On The Page" Then Modal Dialog Is Dismissed And Desired Action Is Done Like Staying On The Page
			} 
			if (CompareFlg == "Complete")
			{
				RMA_Verification_Utility.RMA_TextCompare(ExpMsg, StrAlertMessage,ModalDialogMsg, Intlogval);
			}
			else
			{
				RMA_Verification_Utility.RMA_PartialTextVerification(ExpMsg, StrAlertMessage, ModalDialogMsg, Intlogval);
			}
		}

		catch (org.openqa.selenium.NoSuchElementException t)
		{
			boolval = true; 
			System.out.println("NoSuchElementException Exception Occurred While Handling Model Dialog" + t.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
		}
		catch (Exception|Error e) 
		{
			System.out.println("Exception Occurred While Handling Model Dialog" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
			throw (e);
		}
		return boolval;
	}

	//========================================================================================================================================
	//FunctionName 		: RMA_DynamicFrameSwitching
	//Description  		: Enables The User To Navigate To A Particular Frame On The Basis Of A Static Value Present In The Frame ID
	//Input Parameter 	: String Text Contains The Static Value Present In The Frame ID
	//Revision			: 0.0 - ImteyazAhmad-06-21-2016                                
	//===========================================================================================================================================
	public static void RMA_DynamicFrameSwitching (String text) throws Exception, Error {
		try {
			globalWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(RMA_FrameNavigation(text)));
		} catch (Exception|Error e) {
			//System.out.println("Error Occurred In Method RMA_DynamicFrameSwitching While Switching Frame :" +" " +e.getMessage());
			throw new Exception("Frame Swithing For Frame " +text+" Is Not Done Due to Error: "+e.getMessage() );
			//throw(e);
		}
	}

	//===============================================================================================================================================================================================================================
	//FunctionName 		: RMA_Upload_Save_File
	//Description  		: Enables The User To Upload File To Browser From Physical Path Of Machine
	//Input Parameter 	: String : PhysicalPath
	//Revision			: 0.0 - ImteyazAhmad-06-22-2016            
	//Modified By	     :0.0 - RenuVerma-02-201-2017 Function Name changed as this function can also use for save file
	//=====================================================================================================================================================================================================================================
	public static void RMA_Upload_Save_File (String PhysicalPath) throws Exception, Error {
		try {
			//StringSelection is a class that can be used for copy and paste operations.'
			System.out.println("Save File On Given Location");
			StringSelection stringSelection = new StringSelection(PhysicalPath);
			Thread.sleep(2000);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			Thread.sleep(2000);
			//native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot();		
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		} catch (Exception|Error e) {
			System.out.println("Error Occurred In Method RMA_UploadFile While Uploading File :" +" " +e.getMessage());
			throw(e);
		}
	}

	//=====================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_MultipleWindowSwitching_Utility
	//Description  		: To Switch The Multiple Windows That Are Opened In RMA Application
	//Input Parameter 	: int Window : Number Of Window To Be Switched (If Two Windows Are Already opened And A Third Window Needs To Be Opened Then Number Would Be 3), PrimWindowHndl,SecWindowHandl,ThrdWindowHndl,FifthPrimWindowHndl,FourthPrimWindowHndl : Window Handles Of The Window Already Present
	//					: WindowDesc : Description Of The Window To Be Switched, logval: Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - KumudNaithani-06-11-2016                                 
	//Modified By		: 0.0 - RenuVerma-01-23-2017 Added Dynamic wait as per window count availability
	//=============================================================================================================================================================================================================================================================================================================================
	public static String RMA_MultipleWindowSwitching_Utility(int Window, String PrimWindowHndl, String SecWindowHandl, String ThrdWindowHndl, String FourthPrimWindowHndl, String FifthPrimWindowHndl, String WindowDesc, int logval ) throws Exception, Error 
	{
		Set<String> strHandles;
		Iterator<String>windowiterator;
		globalWait.until(ExpectedConditions.numberOfWindowsToBe(Window));// Wait added As per Window Counts to be available
		strHandles = driver.getWindowHandles(); //Entire Set Of The Present Window Handles Is Fetched
		windowiterator = strHandles.iterator(); //Entire Set Of The Present Window Handles Is Iterated
		//System.out.println("size of the windows" + strHandles.size() );
		try {
			switch (Window)
			{
			case 3:
				while (windowiterator.hasNext())
				{
					ChildWindow = windowiterator.next();
					if (!PrimWindowHndl.equalsIgnoreCase(ChildWindow) && !SecWindowHandl.equalsIgnoreCase(ChildWindow)) //If The Fetched Child Window Is Not Equal To the Parent Window Then A Switch To The Child Window Is Done
					{

						driver.switchTo().window(ChildWindow);
						//System.out.println("inside window 3");

					}
				}

				break;

			case 4:
				while (windowiterator.hasNext())
				{
					ChildWindow = windowiterator.next();
					if (!PrimWindowHndl.equalsIgnoreCase(ChildWindow) && !SecWindowHandl.equalsIgnoreCase(ChildWindow) && !ThrdWindowHndl.equalsIgnoreCase(ChildWindow)) //If The Fetched Child Window Is Not Equal To the Parent Window Then A Switch To The Child Window Is Done
					{

						driver.switchTo().window(ChildWindow);

					}

				}

				break;

			case 5:
				while (windowiterator.hasNext())
				{
					ChildWindow = windowiterator.next();
					if (!PrimWindowHndl.equalsIgnoreCase(ChildWindow) && !SecWindowHandl.equalsIgnoreCase(ChildWindow) && !ThrdWindowHndl.equalsIgnoreCase(ChildWindow) && !FourthPrimWindowHndl.equalsIgnoreCase(ChildWindow)) //If The Fetched Child Window Is Not Equal To the Parent Window Then A Switch To The Child Window Is Done
					{

						driver.switchTo().window(ChildWindow);

					}

				}

				break;

			case 6:
				while (windowiterator.hasNext())
				{
					ChildWindow = windowiterator.next();
					if (!PrimWindowHndl.equalsIgnoreCase(ChildWindow) && !SecWindowHandl.equalsIgnoreCase(ChildWindow) && !ThrdWindowHndl.equalsIgnoreCase(ChildWindow) && !FourthPrimWindowHndl.equalsIgnoreCase(ChildWindow) && !FifthPrimWindowHndl.equalsIgnoreCase(ChildWindow)) //If The Fetched Child Window Is Not Equal To the Parent Window Then A Switch To The Child Window Is Done
					{

						driver.switchTo().window(ChildWindow);

					}

				}

				break;

			default:

				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Window+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Window+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}

			}


			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Switch To The Following Window Is Done" +  " " + color.RMA_ChangeColor_Utility(WindowDesc,4));	
			}
			else
			{
				logger.log(LogStatus.INFO, "Switch To The Following Window Is Done" +  " " + color.RMA_ChangeColor_Utility(WindowDesc,4));	
			}

			return 	ChildWindow;

		} catch (Exception|Error e) {
			System.out.println("Following Error Occurred While Switching Window :" +" " +e.getMessage());
			throw (e);
		}
	}
	//==========================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ErrorMessageOnSave
	//Description  		: User Is Able To Verify Error Message While Saving
	//Input Parameter 	: VerifyErrorMessage: Pass true(When Want To Match Error Message While Saving) or false(When Not Want to Match Error Message While Saving),
	//ExpectedErrorMessage: Pass The Error Message Separated by '~' When More Than One, logval
	//Revision			: 0.0 - RenuVerma-07-13-2016                                
	//===============================================================================================================================================================================================================================================================================================================================================
	public static void RMA_ErrorMessageOnSave (boolean VerifyErrorMessage,String ExpectedErrorMessage, int logval) throws Exception, Error {
		/*	try {	
			boolean matchFound;
			//Thread.sleep(3000);
			if(VerifyErrorMessage==true)
			{
				RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_ErrorMessage_Heading(driver), "RMA Application Error Message Heading",logval);// Check Error Message On Screen	
				List<WebElement> lis = driver.findElements(By.xpath(".//*[contains(text(),'Following Errors have been reported:')]/following::table/tbody/tr/td[2]/ul/li"));
				String[] ErrorMsgLists=ExpectedErrorMessage.split("~");

				for (String ErrorMsg: ErrorMsgLists)
				{
					matchFound=false;
					for (WebElement li : lis) 
					{
						String ErrormessageActual=li.getText();
						//Match check
						if (ErrormessageActual.contains(ErrorMsg.trim()))
						{
							if (logval == 0)
							{
								parentlogger.log(LogStatus.PASS, "Expected Value of Error Message" + " "+ color.RMA_ChangeColor_Utility(ErrorMsg.trim(), 3) + " Is Contained In Actual Value of Error Message" + " " + color.RMA_ChangeColor_Utility(ErrormessageActual, 2) + " "  + "Hence Error Message Found Successful" );
							}
							else
							{

								logger.log(LogStatus.PASS, "Expected Value of Error Message" + " "+ color.RMA_ChangeColor_Utility(ErrorMsg.trim(), 3) + " Is Contained In Actual Valueof Error Message" + " " + color.RMA_ChangeColor_Utility(ErrormessageActual, 2) + " "  + "Hence Error Message Found Successful" );
							}
							matchFound=true;						
							break;
						}						
					}

					//Not matched		
					if(!matchFound)
					{										
						if (logval == 0)
						{
							parentlogger.log(LogStatus.FAIL, "Expected Value of Error Message" + " "+ color.RMA_ChangeColor_Utility(ErrorMsg.trim(), 1) + " Is Not Contained On RMA Application Error List, Hence Error Message Not Found!");
						}
						else
						{		
							logger.log(LogStatus.FAIL, "Expected Value of Error Message" + " "+ color.RMA_ChangeColor_Utility(ErrorMsg.trim(), 1) + " Is Not Contained On RMA Application Error List, Hence Error Message Not Found!");
						}
					}
				}
			}
			else
			{
				RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_ErrorMessage_Heading(driver), "RMA Application Error Message Heading",logval);
			}
		}
		catch (Exception|Error e) {
			System.out.println("Error Occurred In Method ErrorMessage While Reading and Verifying The Error Message :" +" " +e.getMessage());
			throw(e);
		}*/
	}

	//===================================================================================================================================================================================
	//FunctionName 		: RMA_ConditionalFrameSwitching
	//Description  		: Enables The User To Navigate To A Particular Frame Only If The User Is Not Inside That Frame 
	//Input Parameter 	: String Text Contains The Static Value Present In The Frame ID
	//Revision			: 0.0 - KumudNaithani-06-21-2016   
	//==================================================================================================================================================================================
	public static void RMA_ConditionalFrameSwitching (String text) throws Exception, Error {
		try {
			WebDriverWait globalWaitforFrame=new WebDriverWait(driver, 2);
			globalWaitforFrame.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(RMA_FrameNavigation(text)));

		}catch (org.openqa.selenium.TimeoutException t)
		{
			System.out.println("Timeout Exception Handled");
		}	
		catch (NoSuchFrameException ex) {
			System.out.println("Since It Is An Conditional Frame Switching Function No Frame Found Exception Is Catched And Not Thrown" );
		}
		catch (Exception|Error e) {
			System.out.println("Error Occurred In Method RMA_ConditionalFrameSwitching While Switching" +" " + text+ " "+"Frame :"+  " "+e.getMessage());
			throw(e);
		}
	}

	//========================================================================================================================================================================================================
	//FunctionName 		: RMA_DynamicPollingWait
	//Description  		: Enables The User To Wait Dynamically For An Element 
	//Input Parameter 	: LocatorType And LocatorValue To Be Passed
	//Revision			: 0.0 - ImteyazAhmad-07-25-2016                                
	//===========================================================================================================================================================================================

	public static Boolean RMA_DynamicPollingWait(String LocatorType,String LocatorValue) throws Exception,Error
	{
		LocatorType = LocatorType.toUpperCase();
		switch (LocatorType)
		{
		case "ID":
			for(int i=0;i<20;i++)
			{
				try{
					WebElement Element = driver.findElement(By.id(LocatorValue));
					if (Element.isDisplayed() && Element.isEnabled())
					{
						boolval= true;
						break;
					}
					throw new Exception();
				}

				catch(Exception|Error e)
				{				
					Thread.sleep(250);				
				}
			}
			break;

		case "XPATH":
			for(int i=0;i<10;i++)
			{
				try{
					WebElement Element = driver.findElement(By.xpath(LocatorValue));
					if (Element.isDisplayed() && Element.isEnabled())
					{
						boolval= true;
						break;
					}
					throw new Exception();
				}
				catch(Exception|Error e)
				{				
					Thread.sleep(250);				
				}
			}
			break;

		case "LINKTEXT":
			for(int i=0;i<10;i++)
			{
				try{
					WebElement Element = driver.findElement(By.linkText(LocatorValue));
					if (Element.isDisplayed() && Element.isEnabled())
					{
						boolval= true;
						break;
					}
					throw new Exception();
				}
				catch(Exception|Error e)
				{				
					Thread.sleep(250);				
				}
			}
			break;

		case "PARTIALLINKTEXT":
			for(int i=0;i<10;i++)
			{
				try{
					WebElement Element = driver.findElement(By.partialLinkText(LocatorValue));
					if (Element.isDisplayed() && Element.isEnabled())
					{
						boolval= true;
						break;
					}
					throw new Exception();
				}
				catch(Exception|Error e)
				{				
					Thread.sleep(250);				
				}
			}
			break;
		}
		return boolval;	
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_WebPageCopyPaste_Utility
	//Description  		: To Copy And Paste The Contents Of The Entire WebPage
	//Input Parameter 	: logval: Value Of The Logger, Parent Or Child Logger
	//Revision			: 0.0 - KumudNaithani-07-25-2016                                
	//===========================================================================================================================================================================================
	public static String RMA_WebPageCopyPaste_Utility(int logval) throws Exception, Error
	{
		Robot robot;
		String WebpageContents;
		Clipboard clipboard;
		try {
			clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			Transferable contents = clipboard.getContents(null);
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(10000);    
			contents = clipboard.getContents(null);
			WebpageContents = (String)contents.getTransferData(DataFlavor.stringFlavor);

		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Following Exception Pccurred While Fetching Web Page Contents"  + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1) );  
			}
			else
			{
				logger.log(LogStatus.FAIL, "Following Exception Pccurred While Fetching Web Page Contents" +  " " + color.RMA_ChangeColor_Utility(e.getMessage(),1) );   
			}
			throw(e);
		}

		return WebpageContents;
	}
	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_CloseAllWindowOtherThanRMA
	//Description  		: Enables The User To Close All Windows Other Than RMA 
	//Input Parameter 	: None
	//Revision			: 0.0 - ImteyazAhmad-07-25-2016                                
	//===========================================================================================================================================================================================
	public static void RMA_CloseAllWindowOtherThanRMA() throws Exception,Error
	{
		try
		{   
			ChildWindow = null;
			boolval = false;		
			Set<String> strWindowHandles = driver.getWindowHandles();
			Iterator<String>windowiterator = strWindowHandles.iterator(); //Entire Set Of The Present Window Handles Is Iterated
			if (strWindowHandles.size() > 1)
			{   
				boolval = true;
				while (windowiterator.hasNext())
				{
					ChildWindow = windowiterator.next();

					if (!StrRMAWindowHandle.equalsIgnoreCase(ChildWindow))
					{
						try
						{
							driver.switchTo().window(ChildWindow);
							driver.close();
						}catch(Exception|Error e)
						{
							System.out.println("Error Occurred In Method  RMA_CloseAllWindowOtherThanRMA,Inner TryCatch Block, Is :"+" "+e.getMessage());
						}
					}
				}
			}

		}catch (Exception|Error e)

		{
			System.out.println("Error Occurred In Method  RMA_CloseAllWindowOtherThanRMA Is :"+" "+e.getMessage());
			throw (e);
		}
		finally
		{			
			if (!StrRMAWindowHandle.equalsIgnoreCase(ChildWindow))
			{	
				if (boolval == true)
				{
					driver.switchTo().window(StrRMAWindowHandle);
				}
			}	
		}
	}
	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_CloseAllWindowOtherThanRMA
	//Description  		: Enables The User To Close All Windows Other Than RMA 
	//Input Parameter 	: None
	//Revision			: 0.0 - ImteyazAhmad-07-25-2016                                
	//===========================================================================================================================================================================================
	public static void RMA_CloseAllWindowOtherThanGivenWindow(String Type,String WindowHandle) throws Exception,Error
	{
		try
		{   
			ChildWindow = null;
			boolval = false;		
			Set<String> strWindowHandles = driver.getWindowHandles();
			Iterator<String>windowiterator = strWindowHandles.iterator(); //Entire Set Of The Present Window Handles Is Iterated
			switch(Type){	
			case "WindowHandle":
				if (strWindowHandles.size() > 1)
				{   
					boolval = true;
					while (windowiterator.hasNext())
					{
						ChildWindow = windowiterator.next();

						if (!WindowHandle.equalsIgnoreCase(ChildWindow))
						{
							try
							{
								driver.switchTo().window(ChildWindow);
								driver.close();
							}catch(Exception|Error e)
							{
								System.out.println("Error Occurred In Method  RMA_CloseAllWindowOtherThanRMA,Inner TryCatch Block, Is :"+" "+e.getMessage());
							}
						}
					}
				}
			case "Title":
				if (strWindowHandles.size() > 1)
				{   
					boolval = true;
					while (windowiterator.hasNext())
					{
						ChildWindow = windowiterator.next();
						driver.switchTo().window(ChildWindow);

						if (!WindowHandle.equalsIgnoreCase(driver.getTitle()))
						{
							try
							{
								//driver.switchTo().window(ChildWindow);
								driver.close();
							}catch(Exception|Error e)
							{
								System.out.println("Error Occurred In Method  RMA_CloseAllWindowOtherThanRMA,Inner TryCatch Block, Is :"+" "+e.getMessage());
							}
						}
						else{
							RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle(WindowHandle);
						}
					}
				}
			}
		}catch (Exception|Error e)

		{
			System.out.println("Error Occurred In Method  RMA_CloseAllWindowOtherThanRMA Is :"+" "+e.getMessage());
			throw (e);
		}
		finally
		{			
			if (!StrRMAWindowHandle.equalsIgnoreCase(ChildWindow))
			{	
				if (boolval == true)
				{
					driver.switchTo().window(StrRMAWindowHandle);
				}
			}	
		}
	}
	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_CloseAllWindowOtherThanRMA
	//Description  		: Wait Till Desired Browser Is Not Closed 
	//Input Parameter 	: Driver
	//Revision			: 0.0 - RenuVerma-08-22-2016                                
	//===========================================================================================================================================================================================
	public static void RMA_WaitForDriverToClose(WebDriver driver) {
		try {
			globalWait.until(ExpectedConditions.not(new ExpectedCondition<Boolean>() {
				@Override
				public Boolean apply(WebDriver driver) {
					try {
						driver.getTitle();
						return true;
					} catch (Exception ex) {
						System.out.println("Couldn't Connect Driver / Driver Closed");
						return false;
					}
				}
			}));
		} catch (org.openqa.selenium.TimeoutException ex) {
			System.out.println("Timeout Same Window Again");

		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetCurrentFrameID
	//Description  		: Get The Current Frame ID
	//Input Parameter 	: None
	//Example			: Take The Example from the RMA_Smoke_58
	//Revision			: 0.0 - RenuVerma-10-07-2016                                
	//===========================================================================================================================================================================================

	public static String RMA_GetCurrentFrameID() throws Exception {
		try{   
			String CurrentFrameID;
			JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;	
			String flag=jsExecutor.executeScript("return !self.frameElement").toString();// Return true when no Frame is available
			if(flag=="true"){
				CurrentFrameID="TopWebFrame";// String return as no frame available 
			}
			else{
				CurrentFrameID= jsExecutor.executeScript("return self.frameElement.id").toString();// return IDs of the frame Element
			}
			return  CurrentFrameID;
		}	
		catch(Exception e){
			System.out.println("Error Occurred While Getting Current Frame :"+" "+e.getMessage());
			throw (e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_SwitchNextFrameID
	//Description  		: Select Switch To Next Sibling Frame 
	//Input Parameter 	: Current Frame ID
	//Revision			: 0.0 - RenuVerma-10-07-2016                                
	//===========================================================================================================================================================================================
	public static String RMA_SwitchNextFrameID(String CurrentFrameID) throws Exception {
		try{  
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(CurrentFrameID);
			JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;	
			String NextFrameID=jsExecutor.executeScript("return self.frameElement.nextElementSibling.id").toString();
			//System.out.println(" NextFrame"+NextFrameID );
			driver.switchTo().parentFrame();
			RMA_DynamicFrameSwitching(NextFrameID);
			return NextFrameID;
		}	
		catch(Exception e){
			System.out.println("Error Occurred While Getting Current Frame :"+" "+e.getMessage());
			throw (e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_FutureDateInfo_Utility
	//Description  		: To Retrieve The Past/Future System Date in desired format
	//Input Parameter 	: Past: '-' sign in front of month/day/year, Future: no sign in front of month
	//Revision			: 0.0 - RenuVerma-10-21-2015     
	//ModifyBy			:0.0 - RenuVerma-05-31-2017 Added parameter to generate date on the basis of parameter
	// ===========================================================================================================================================================================================
	public static String RMA_PastFutureDateInfo_Utility(int NumberOfMonth, int NumberOfDay, int NumberOfYear, String datetype) throws Exception,Error
	{
		String PFDate = null;
		try
		{
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			cal.add(Calendar.MONTH, NumberOfMonth);
			cal.add(Calendar.DATE, NumberOfDay);
			cal.add(Calendar.YEAR, NumberOfYear);
			Date PastFutureDate=cal.getTime();
			PFDate=  new SimpleDateFormat(datetype).format(PastFutureDate);
			//Retrieved Date Is Formatted

		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Generating Current Date : " +" " +e.getMessage());
			throw(e);
		}
		return PFDate;
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_PastFutureTimeInfo_Utility
	//Description  		: To Retrieve The Past/Future System Time
	//Input Parameter 	: ReducedIncreasedTime Of Type Integer Encompassing The Amount Of Time To Be Increased Or Decreased; Past: '-' sign in front of Time
	//Revision			: 0.0 - KumudNaithani-06-11-2017     
	// ===========================================================================================================================================================================================
	public static String RMA_PastFutureTimeInfo_Utility(int ReducedIncreasedTime) throws Exception,Error
	{
		Calendar now;
		String PastTime;
		try
		{
			now = Calendar.getInstance();
			now.add(Calendar.MINUTE, ReducedIncreasedTime);
			PastTime=  now.get(Calendar.HOUR_OF_DAY) + ":"+ now.get(Calendar.MINUTE);// Time Value Is Fetched in 24 Hour Format
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Generating Reduced Or Increased Time : " +" " +e.getMessage());
			throw(e);
		}
		return PastTime;
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_TimeConversion_Utility
	//Description  		: To Convert Time Value Into A Specific Format
	//Input Parameter 	: Time Value To Be Converted, TimeFormat To Be Converted Both Of Type String
	//Revision			: 0.0 - KumudNaithani-06-12-2017     
	// ===========================================================================================================================================================================================
	public static String RMA_TimeConversion_Utility(String TimeValue, String TimeFormat) throws Exception,Error
	{
		SimpleDateFormat toFullDate;
		Date date;
		String shorttime;
		try
		{
			toFullDate = new SimpleDateFormat("HH:mm");
			date = toFullDate.parse(TimeValue); //Obtained TimeValue Is Parsed
			toFullDate = new SimpleDateFormat(TimeFormat);
			shorttime = toFullDate.format(date);
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Generating Time In The Specified Format : " +" " +e.getMessage());
			throw(e);
		}
		return shorttime;
	}

	//========================================================================================================================================================================================
	//FunctionName 		: RMA_LoggerHyperlink
	//Description  		: To Retrieve HTML string for logger Hyperlink text
	//Input Parameter 	: IDName: Unique id name to whom hyper-link, TextToBeHyperlink: Text which want as hyperlink, indexNo= Passing Index Of Occurrence Staring From '0'
	//Revision			: 0.0 - RenuVerma-11-04-2016                                 
	// =====================================================================================================================================================================================
	public static String RMA_LoggerHyperlink(String idName, String TextToBeHyperlink, int indexNo) throws Exception,Error
	{
		genericString=null;
		try
		{
			genericString= "<a href='#"+ idName+"' onclick=\"document.querySelectorAll('#test-details-wrapper #"+idName+"')["+indexNo+"].scrollIntoView();\"> "+TextToBeHyperlink+"</a>";
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Generating HyperLink Text : " +" " +e.getMessage());
			throw(e);
		}
		return genericString;
	}

	//=========================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ColorCode_hex2Rgb
	//Description  		: To Retrieve RGB color code From Hex Color Code
	//Input Parameter 	: colorStr: String Of Hex Color Code
	//Revision			: 0.0 - RenuVerma-11-16-2016                                 
	// =========================================================================================================================================================================================================================================================================================================================================================================================

	public static String RMA_ColorCode_hex2Rgb(String colorStr) {
		Color c = new Color( Integer.valueOf(colorStr.substring(1, 3), 16), Integer.valueOf(colorStr.substring(3, 5), 16), Integer.valueOf(colorStr.substring(5, 7), 16));// i.e. #000000 Hex code convert as rgb("0","0","0") :-- colorStr.substring(1, 3)=00  and colorStr.substring(3, 5)=00 and  colorStr.substring(5, 7)=00
		StringBuffer sb = new StringBuffer();
		sb.append("rgb(");
		sb.append(c.getRed());// get integer value of red color and append into the string
		sb.append(", ");
		sb.append(c.getGreen());// get integer value of Green color and append into the string
		sb.append(", ");
		sb.append(c.getBlue());// get integer value of Blue color and append into the string
		sb.append(")");
		return sb.toString();
	}	
	//========================================================================================================================================================================================
	//FunctionName 		: RMA_CheckVerificationNGGridColumnHeader
	//Description  		: To Check Verification NG Grid Column Header
	//Input Parameter 	: ExpectedColHeadersToBeVerified: Array of Expected Column Header; GridName: Grid Name of NG grid; Intlogval
	//Revision			: 0.0 - RenuVerma-06-14-2017                                 
	// =====================================================================================================================================================================================
	public static void RMA_CheckVerificationNGGridColumnHeader(String[] ExpectedColHeadersToBeVerified, String GridName, int Intlogval) throws Exception,Error
	{
		try
		{
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of "+GridName+" NG Grid Table",Intlogval);
			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Btn_RestoreState(driver), "Restore State Button In Column Selection Header On Reserves NG Grid Table", Intlogval);
			for(int i=0;i<ExpectedColHeadersToBeVerified.length;i++){
				if(RMA_Selenium_POM_Home.RMAApp_NGGrid_ReserveNGGridCheckUnCheckClmNames(driver, ExpectedColHeadersToBeVerified[i]).getAttribute("class").equalsIgnoreCase("ui-grid-menu-item ng-binding"))
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_ReserveNGGridCheckUnCheckClmNames(driver, ExpectedColHeadersToBeVerified[i]), "Check "+ color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[i],4) + " Column In Column Header Of "+GridName+" NG Grid Table",Intlogval);
				else {
					if (Intlogval == 0)
						parentlogger.log(LogStatus.INFO,  color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[i],4) + " " + " Is Checked State Hence Not Clicked");
					else
						logger.log(LogStatus.INFO,  color.RMA_ChangeColor_Utility(ExpectedColHeadersToBeVerified[i],4) + " " + " Is Checked State Hence Not Clicked");
				}
			}	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of Reserves NG Grid Table",Intlogval);

		}catch(Exception|Error e)
		{
			throw(e);
		}
	}
	//============================================================================================
	//FunctionName 		: RMA_WindMsgHandlerAndTextVerify_Utility
	//Description  		: Handles Any Type Of Windows Pop Up, Reads And Compares The Message Displayed And Accepts Or Rejects The Same (Say Clicking On Yes Or No Button) 
	//Input Parameter 	: Instance Of The WebDriver Class 'Driver', Value Of The String 'StrAccept', CompareFlg Value According To Which Partial Or Full Comparison Of The Message Text Is Done
	////Revision		: 0.1 - KumudNaithani-02-22-2016                                
	//============================================================================================
	public static boolean RMA_WindMsgHandlerAndTextVerify_Utility(String StrAccept, String CompareFlg, String ExpMsg, String PopUpVerifyMessage, int logval)throws Exception, Error
	{
		Alert alert;
		boolval = false; //RenuVerma: Added Intialiaze value 
		try {
			WebDriverWait wait = new WebDriverWait(driver, 8);			
			wait.until(org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent());
			alert = driver.switchTo().alert(); // A Switch To The Displayed Alert Message Is Done
			StrAlertMessage = alert.getText();
			//System.out.println(StrAlertMessage);
			if (StrAccept == "Yes") // If The User Chooses To Accept The Alert That Is The Positive Option Say "Yes", "OK" Or "Leave The Page" Then Alert Window Is Accepted And Desired Action Is Done Like Refereshing The Page
			{
				//Thread.sleep(10000);
				alert.accept(); 
				Thread.sleep(7000);		
				System.out.println("Yes");
			}
			else
			{
				alert.dismiss(); // If The User Chooses To Decline The Alert That Is The Negative Option Say "No", "Cancel" Or "Stay On The Page" Then Alert Window Is Dismissed And Desired Action Is Done Like Staying On The Page
			} 
			if (CompareFlg == "Complete")
			{
				RMA_Verification_Utility.RMA_TextCompare(ExpMsg, StrAlertMessage, PopUpVerifyMessage, logval);
			}
			else
			{
				RMA_Verification_Utility.RMA_PartialTextVerification(ExpMsg, StrAlertMessage, PopUpVerifyMessage, logval);
			}
		}

		catch (org.openqa.selenium.TimeoutException t)
		{
			boolval = true; //Following Catch Has Been Added To Handle The Scenario Where Existence Of The Window's Pop Up Depends On The Application Behavior (Scenario Executed Before Function Call)
			System.out.println("Exception Occurred While Handling The Windows PopUp" + t.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
		}
		catch (Exception|Error e) 
		{
			System.out.println("Exception Occurred While Handling The Windows PopUp" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
			throw (e);
		}
		return boolval;
	}

	//==========================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_Utilities_Navigation
	//Description  		: Following Function Enables The User To Migrate To Utilities
	//Input Parameter 	: ClaimLink Of Type Boolean Depicts Whether Claim Link On 
	//Revision			: 0.0 - KumudNaithani-07-18-2017 
	//Modified By		: 1.0 - AnubhutiVyas-08/29/2018
	//==========================================================================================================================================================================================================================================================================================
	public static void RMA_Utilities_Navigation(boolean ClaimLink) throws Exception, Error 
	{
		try {
			if(driver.getWindowHandles().size()>1){// Renu: If only One window is available Then No need to switch
				Thread.sleep(3000);
				driver.switchTo().window(StrRMAWindowHandle);
			}
			if(ClaimLink==true)
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DashBoard_Lbl_Utilities(driver), "Utility Navigation Option Label On RiskMaster Application's Dashboard Page", logval);
			}
			if (driver.getWindowHandles().size()==2)
			{
				RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			}
			else if (driver.getWindowHandles().size()==RMA_Selenium_POM_VerificationMessage.NumberOfPrimaryWindows)
			{
				RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrRMAUXWindowHandle, "NA", "NA", "NA", "Navigation TO RMA Utilities Page", logval);	
			}
			//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		} catch (Exception|Error e) {
			//System.out.println("Following Error Occurred While Switching Window :" +" " +e.getMessage());
			throw (e);
		}
	}


	//==========================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_Non_UX_Dashboard_Navigation
	//Description  		: Following Function Enables The User To Migrate To RMA Dashboard Non-UX UI
	//Input Parameter 	: None
	//Revision			: 0.0 - NidhiJha-07-20-2017                                 
	//==========================================================================================================================================================================================================================================================================================
	public static void RMA_Non_UX_Dashboard_Navigation(int Intlogval) throws Exception, Error 
	{
		try {
			if(!(RMA_GenericUsages_Utility.RMA_GetCurrentFrameID().equalsIgnoreCase(ParentFrame)))
			{
				driver.switchTo().parentFrame();
			} 
			driver.switchTo().parentFrame();
			if (RMA_Selenium_POM_VerificationMessage.NumberOfPrimaryWindows==2)
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultUIWindow_Img_Home(driver), "Home Image On RMA UI Default View", Intlogval);
			}
			else if (RMA_Selenium_POM_VerificationMessage.NumberOfPrimaryWindows==3)
			{
				RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes");
				driver.close();
			}

		} catch (Exception|Error e) {
			//System.out.println("Following Error Occurred While Migrating To Dashboard From Non-UX UI :" +" " +e.getMessage());
			throw (e);
		}
	}

	//==========================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_WebPageRefresh_Utility_UX
	//Description  		: Refreshes The RMA WebPage On New UX Screens
	//Input Parameter 	: None
	//Revision			: 0.0 - NidhiJha-07-20-2017                                 
	//==========================================================================================================================================================================================================================================================================================
	public static void RMA_WebPageRefresh_Utility_UX(int logval) throws Exception, Error 
	{	
		try {

			driver.navigate().refresh(); //Web page Is Refreshed
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes");

			if (logval ==0)
			{
				parentlogger.log(LogStatus.INFO, "Web Page Is Refreshed");
			}
			else{
				logger.log(LogStatus.INFO, "Web Page Is Refreshed");
			}

		} catch (Exception|Error e) {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.FAIL, "Web Page Was Not Refreshed Due To Following Reason:" + " " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else{
				logger.log(LogStatus.FAIL, "Web Page Was Not Refreshed Due To Following Reason:" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1)); //Try Catch Statement Is Used To Handle Any Type Of Un-handled Exception And Print Log Of It
			}
			throw (e);
		}
	}


	//============================================================================================
	//FunctionName 		: RMA_WindowsMessageHandler_Utility
	//Description  		: Handles Any Type Of Windows Pop Up And Accepts Or Rejects The Same (Say Clicking On Yes Or No Button) 
	//Input Parameter 	: Instance Of The WebDriver Class 'Driver' And Value Of The String 'StrAccept'
	////Revision		: 0.1 - KumudNaithani-12-17-2015 - Added try catch specific to NoAlertPresentException exception
	//					: 0.0 - KumudNaithani-10-20-2015 
	//                  : 0.2 - ImteyazAhmad- 06-22-2016- Added Catch to handle TimeoutException 
	//============================================================================================
	public static void RMA_WindowsMessageHandler_Utility(WebDriver driver, String StrAccept)throws Exception, Error
	{
		Alert alert;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 4);			
			wait.until(org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent());
			alert = driver.switchTo().alert(); // A Switch To The Displayed Alert Message Is Done
			if (StrAccept == "Yes") // If The User Chooses To Accept The Alert That Is The Positive Option Say "Yes", "OK" Or "Leave The Page" Then Alert Window Is Accepted And Desired Action Is Done Like Refereshing The Page
			{
				//Thread.sleep(10000);
				alert.accept(); 
				//Thread.sleep(4000);		
			}
			else
			{
				alert.dismiss(); // If The User Chooses To Decline The Alert That Is The Negative Option Say "No", "Cancel" Or "Stay On The Page" Then Alert Window Is Dismissed And Desired Action Is Done Like Staying On The Page
			} 
		}

		catch (org.openqa.selenium.TimeoutException t)
		{
			////System.out.println("Timeout Exception Handled");
			//This Catch Is Added To Handle TimeoutException
		}
		catch (NoAlertPresentException ex)
		{
			//Following Catch Has Been Added To Handle The Scenario Where Existence Of The Window's Pop Up Depends On The Application Behavior (Scenario Executed Before Function Call)
		}

		catch (Exception|Error e) 
		{
			//System.out.println("Exception Occurred While Handling The Windows PopUp" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
			throw (e);
		}

	}

	//==========================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_Non_UXNavigation
	//Description  		: Following Function Enables The User To Migrate To Old RMA Non-UX UI
	//Revision			: 0.0 - RenuVerma-09-18-2017                                 
	//==========================================================================================================================================================================================================================================================================================
	public static void RMA_Non_UXNavigation() throws Exception, Error 
	{
		try {
			String TitleName="RISKMASTER Accelerator";
			String strTitle;
			Boolean TitleFound;
			TitleFound = false;
			TitleName = TitleName.trim();
			Iterator<String> windowiterator = driver.getWindowHandles().iterator(); //Entire Set Of The Present Window Handles Is Iterated
			while (windowiterator.hasNext())
			{
				String ChildWindow = windowiterator.next();					
				driver.switchTo().window(ChildWindow);
				strTitle = driver.getTitle();
				//System.out.println("strTitle"+strTitle);
				if (strTitle.equalsIgnoreCase(TitleName))
				{	
					TitleFound = true;
					RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
					break;
				}
			}	
			if (TitleFound == false)
			{
				driver.switchTo().window(StrRMAWindowHandle);		
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claim(driver), "Claim Navigation Option Label On RiskMaster Application's Dashboard Page", logval);
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle(TitleName);
			}
			//RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			Thread.sleep(10000);
		} catch (Exception|Error e) {
			//System.out.println("Following Error Occurred While Switching Window :" +" " +e.getMessage());
			throw (e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName             : RMA_SetADayInNextMonthOfAGivenDate_Utility
	//Description              : To Set A Day In Next Month Of A Given Date 
	//Input Parameter   	   : None 
	//Revision                 : 0.0 - DebasmitaPati-07-18-2018      
	//===========================================================================================================================================================================================
	public static String RMA_SetADayInNextMonthOfAGivenDate_Utility(String StrDate, int Day) throws Exception,Error
	{

		try
		{
			String ModifiedDate= null;
			Calendar calendar = Calendar.getInstance();
			Date date = new Date();
			date = new SimpleDateFormat("MM/dd/yyyy").parse(StrDate);

			calendar.setTime(date);
			calendar.add(Calendar.MONTH, 1);
			calendar.set(Calendar.DAY_OF_MONTH,Day);
			date = calendar.getTime();
			DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
			ModifiedDate = dateformat.format(date);
			return ModifiedDate;  
		}catch(Exception|Error e)
		{
			//System.out.println("Following Error Occurred While Calculating A Day Of Next Month Of A Given Date : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName             : RMA_GetFirstDayOfNextMonthOfAGivenDate_Utility
	//Description              : To Get The First Day Of Next Month Of A Given Date 
	//Input Parameter   		: None 
	//Revision                 : 0.0 - DebasmitaPati-07-18-2018      
	//===========================================================================================================================================================================================
	public static String ARMA_GetFirstDayOfNextMonthOfAGivenDate_Utility(String StrDate) throws Exception,Error
	{

		try
		{
			String ModifiedDate= null;
			Calendar calendar = Calendar.getInstance();
			Date date = new Date();
			date = new SimpleDateFormat("MM/dd/yyyy").parse(StrDate);

			calendar.setTime(date);
			calendar.add(Calendar.MONTH, 1);
			calendar.set(Calendar.DAY_OF_MONTH,1);
			date = calendar.getTime();
			DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
			ModifiedDate = dateformat.format(date);
			return ModifiedDate;  
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Calculating First Day Of Next Month Of A Given Date : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName             : RMA_GetActualDaysInAMonthOfAGivenDate_Utility
	//Description              : To Get The Actual Number Of Days In a Month Of A Given Date 
	//Input Parameter   		: None 
	//Revision                 : 0.0 - DebasmitaPati-07-18-2018      
	//===========================================================================================================================================================================================
	public static int RMA_GetActualDaysInAMonthOfAGivenDate_Utility(String StrDate) throws Exception,Error
	{
		int ActualDays = 0;
		try
		{
			Calendar calendar = Calendar.getInstance();
			Date date = new Date();
			date = new SimpleDateFormat("MM/dd/yyyy").parse(StrDate);

			calendar.setTime(date);
			ActualDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Calculating First Day Of Next Month Of A Given Date : " +" " +e.getMessage());
			throw(e);
		}
		return ActualDays;
	}

	//===========================================================================================================================================================================================
	//FunctionName             : RMA_GetLastDayInAMonthOfAGivenDate_Utility
	//Description              : To Get The Actual Number Of Days In a Month Of A Given Date 
	//Input Parameter   		: None 
	//Revision                 : 0.0 - DebasmitaPati-07-18-2018      
	//===========================================================================================================================================================================================
	public static String RMA_GetLastDayInAMonthOfAGivenDate_Utility(String StrDate) throws Exception,Error
	{
		try
		{
			String ModifiedDate= null;
			Calendar calendar = Calendar.getInstance();
			Date date = new Date();
			date = new SimpleDateFormat("MM/dd/yyyy").parse(StrDate);

			calendar.setTime(date);
			int ActualDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			calendar.set(Calendar.DAY_OF_MONTH,ActualDays);
			date = calendar.getTime();
			DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
			ModifiedDate = dateformat.format(date);
			return ModifiedDate;         	     
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Calculating First Day Of Next Month Of A Given Date : " +" " +e.getMessage());
			throw(e);
		}

	}


	//===========================================================================================================================================================================================
	//FunctionName             : RMA_GetDayFromDate_Utility
	//Description              : To Get Days Paid In A Month 
	//Input Parameter   	   : None 
	//Revision                 : 0.0 - DebasmitaPati-07-18-2018      
	//===========================================================================================================================================================================================
	public static int RMA_GetDayFromDate_Utility(String StrDate) throws Exception,Error
	{
		int Days = 0;
		try
		{        	   
			Date date = new Date();
			date = new SimpleDateFormat("MM/dd/yyyy").parse(StrDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			Days = calendar.get(Calendar.DAY_OF_MONTH);

		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Calculating Days In A Month : " +" " +e.getMessage());
			throw(e);
		}
		return Days;
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetNumberOfMonths_Utility
	//Description  		: To Get Number Of Months Between 2 Dates
	//Input Parameter 	: None 
	//Revision			: 0.0 - DebasmitaPati-07-19-2018      
	//===========================================================================================================================================================================================
	public static int RMA_GetNumberOfMonths_Utility(String StartDate,String EndDate) throws Exception,Error
	{

		try
		{

			int MonthsBetween;
			int YearDiff;
			Date startdate = new Date();
			startdate = new SimpleDateFormat("MM/dd/yyyy").parse(StartDate);
			Date enddate = new Date();
			enddate = new SimpleDateFormat("MM/dd/yyyy").parse(EndDate);
			Calendar StartCalendar = Calendar.getInstance();
			Calendar EndCalendar = Calendar.getInstance();
			StartCalendar.setTime(startdate);
			EndCalendar.setTime(enddate);

			YearDiff = EndCalendar.get(Calendar.YEAR)- StartCalendar.get(Calendar.YEAR);
			MonthsBetween = EndCalendar.get(Calendar.MONTH)-StartCalendar.get(Calendar.MONTH) +12*YearDiff;

			//if(EndCalendar.get(Calendar.DAY_OF_MONTH) >= StartCalendar.get(Calendar.DAY_OF_MONTH))
			MonthsBetween = MonthsBetween + 1;
			return MonthsBetween;
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Getting Number of Months In Between 2 Dates : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_NumberFormat_Utility
	//Description  		: To Change The Format Of A Number
	//Input Parameter 	: None 
	//Revision			: 0.0 - DebasmitaPati-07-19-2018      
	//===========================================================================================================================================================================================
	public static String RMA_NumberFormat_Utility(Double Num) throws Exception,Error
	{

		try
		{			
			NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
			String FormatedNum = defaultFormat.format(Num);
			return FormatedNum;		    
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Changing The Number Format : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_RoundedValue_Utility
	//Description  		: To Round A Big Decimal Number To 2 Decimal Points
	//Input Parameter 	: None 
	//Revision			: 0.0 - DebasmitaPati-07-19-2018      
	//===========================================================================================================================================================================================
	public static Double RMA_RoundedValue_Utility(double Num) throws Exception,Error
	{

		try
		{			
			double RoundedValue = Math.round(Num*100.00)/100.00;
			return RoundedValue;		    
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Rounding The Number To 2 Decimal Points : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_FormatANumber_Utility
	//Description  		: To Convert A Double Number In 1000 Format With Currency Sign
	//Input Parameter 	: None 
	//Revision			: 0.0 - DebasmitaPati-07-19-2018      
	//===========================================================================================================================================================================================
	public static String RMA_FormatANumber_Utility(double Num) throws Exception,Error
	{

		try
		{			
			String FormatedNum = String.format("$%,.2f", Num);
			return FormatedNum;		    
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Changing The Number Format : " +" " +e.getMessage());
			throw(e);
		}
	}
	//===========================================================================================================================================================================================
	//FunctionName             : RMA_GetDaysPaidInMonth_Utility
	//Description              : To Get Days Paid In A Month 
	//Input Parameter   	   : None 
	//Revision                 : 0.0 - DebasmitaPati-07-18-2018      
	//===========================================================================================================================================================================================
	public static int RMA_GetDaysPaidInMonth_Utility(String StrDate) throws Exception,Error
	{
		int DaysPaid = 0;
		try
		{        	   
			Date date = new Date();
			date = new SimpleDateFormat("MM/dd/yyyy").parse(StrDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			DaysPaid = ((calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) - (calendar.get(Calendar.DAY_OF_MONTH)))+1;

		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Calculating Days Paid In A Month : " +" " +e.getMessage());
			throw(e);
		}
		return DaysPaid;
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetNumberOfDaysPaidForLastPayment_Utility
	//Description  		: To Get Number Of Days Paid According TO NonOcc Payments
	//Input Parameter 	: None 
	//Revision			: 0.0 - ShrutiShruti-07-20-2018      
	//===========================================================================================================================================================================================
	public static int RMA_GetNumberOfDaysPaidForLastPayment_Utility(String StartDate) throws Exception,Error
	{ int DaysPaid=0;
	try
	{
		Date date = new Date();
		date = new SimpleDateFormat("MM/dd/yyyy").parse(StartDate);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		int daysofweek = calendar.get(Calendar.DAY_OF_WEEK);

		if(daysofweek==2)
			DaysPaid = 1;
		else if(daysofweek==3)
			DaysPaid = 2;
		else if(daysofweek==4)
			DaysPaid = 3;
		else if(daysofweek==5)
			DaysPaid = 4;
		else if(daysofweek==6)
			DaysPaid = 5;
		else if(daysofweek==7)
			DaysPaid = 5;
	}catch(Exception|Error e)
	{
		System.out.println("Following Error Occurred While Calculating Working Days : " +" " +e.getMessage());
		throw(e);
	}
	return DaysPaid;
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetDateAfterAddingDayNumber_Utility
	//Description  		: To get Date From String Type
	//Input Parameter 	: None 
	//Revision			: 0.0 - ShrutiShruti-07-18-2018      
	//===========================================================================================================================================================================================
	public static String RMA_GetDateAfterAddingDayNumberException_Utility(String StrDate,String DateType, int DayNumber) throws Exception,Error
	{

		try
		{
			String ModifiedDate = null;
			Calendar ToDate = Calendar.getInstance();
			Date date = new Date();
			date = new SimpleDateFormat("MM/dd/yyyy").parse(StrDate);
			ToDate.setTime(date);

			if((ToDate.get(Calendar.DAY_OF_WEEK))==1)
			{	
				ToDate.add(Calendar.DAY_OF_WEEK, -1);
			}			
			ToDate.set(Calendar.DAY_OF_WEEK, DayNumber);
			date = ToDate.getTime();
			SimpleDateFormat dateformat = new SimpleDateFormat(DateType);
			ModifiedDate = dateformat.format(date);

			return ModifiedDate;
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Adding Days To Specific Date : " +" " +e.getMessage());
			throw(e);
		}

	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_VerifyDateLiesBeforeSpecificDate_Utility
	//Description  		: To get Date From String Type
	//Input Parameter 	: None 
	//Revision			: 0.0 - ShrutiShruti-07-18-2018      
	//===========================================================================================================================================================================================
	public static void RMA_VerifyDateLiesBeforeSpecificDate_Utility(String StrDate,String CheckDate) throws Exception,Error
	{

		try
		{
			Calendar StrCal = Calendar.getInstance();
			Date date = new Date();
			date = new SimpleDateFormat("MM/dd/yyyy").parse(StrDate);
			StrCal.setTime(date);

			Calendar CheckCal = Calendar.getInstance();
			Date checkdate = new Date();
			checkdate = new SimpleDateFormat("MM/dd/yyyy").parse(CheckDate);
			CheckCal.setTime(checkdate);

			if(CheckCal.before(StrCal))
				parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(CheckDate, 4)+": Lies Before "+color.RMA_ChangeColor_Utility(StrDate, 4));
			else 
			{
				parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(CheckDate, 4)+": Do Not Lies Before "+color.RMA_ChangeColor_Utility(StrDate, 4));
				Assert.fail();
			}
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While While Verifying Date : " +" " +e.getMessage());
			throw(e);
		}

	}

	//==============================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_DateLiesInBetweenVerify_Utility
	//Description  		: To Verify That Whether A Date Lies Between Two Given Dates Or Not
	//Input Parameter 	: Element: Web Element Whose State Is To Be Verified
	//Revision			: 0.0 - ShrutiShruti-07-20-2018                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_DateLiesInBetweenVerify_Utility (String StartDate, String EndDate, String CheckDate, int logval) throws Exception, Error
	{
		try {
			Date startdate = new Date();
			startdate = new SimpleDateFormat("MM/dd/yyyy").parse(StartDate);
			Date enddate = new Date();
			enddate = new SimpleDateFormat("MM/dd/yyyy").parse(EndDate);
			Date checkdate = new Date();
			checkdate = new SimpleDateFormat("MM/dd/yyyy").parse(CheckDate);

			Calendar StartCal = Calendar.getInstance();
			Calendar EndCal = Calendar.getInstance();
			Calendar CheckCal = Calendar.getInstance();
			StartCal.setTime(startdate);
			EndCal.setTime(enddate);
			CheckCal.setTime(checkdate);

			if((StartCal.before(CheckCal))&&((CheckCal.before(EndCal))||(CheckCal.equals(EndCal))))
			{
				parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(CheckDate, 4)+": Lies Between "+color.RMA_ChangeColor_Utility(StartDate, 4)+" and "+color.RMA_ChangeColor_Utility(EndDate, 4));	

			}
			else
			{
				parentlogger.log(LogStatus.PASS,  color.RMA_ChangeColor_Utility(CheckDate, 4)+": Doesn't Lies Between "+color.RMA_ChangeColor_Utility(StartDate, 4)+" and "+color.RMA_ChangeColor_Utility(EndDate, 4));	
				Assert.fail();
			}
		}
		catch (Exception|Error e) {
			if (logval ==0){
				parentlogger.log(LogStatus.FAIL,  "Date Verification Could Not Not Be Done For" + " " + color.RMA_ChangeColor_Utility(CheckDate, 4)+ "Due To Error" + color.RMA_ChangeColor_Utility(e.getMessage(),1));	
			}
			else{
				logger.log(LogStatus.FAIL,  "Date Verification Could Not Be Done For" + " " + color.RMA_ChangeColor_Utility(CheckDate, 4) +  "Due To Error" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));		
			}
			throw (e);
		}
	}
	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_WaitToDomLoad
	//Description  		: Wait Till Desired Browser Is Not Closed 
	//Input Parameter 	: Driver
	//Revision			: 0.0 - RenuVerma-09-05-2018                                
	//===========================================================================================================================================================================================
	public static void RMA_WaitToDomLoad(WebDriver driver) {
		try {
			final JavascriptExecutor js = (JavascriptExecutor)driver;
			//globalWait.until(ExpectedConditions.not(new ExpectedCondition<Boolean>()
			globalWait.until(ExpectedConditions.not(new ExpectedCondition<Boolean>() {
				@Override
				public Boolean apply(WebDriver driver) {
					try {
						js.executeScript("return document.readyState").toString().equals("complete");
						return false;
					} catch (Exception ex) {
						System.out.println("Couldn't Load document");
						return true;
					}
				}
			}));
		} catch (org.openqa.selenium.TimeoutException ex) {
			System.out.println("Timeout Again");

		}
	}
	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_SetCalendarDate
	//Description  		: To Set A Date In Calendar
	//Input Parameter 	: None 
	//Revision			: 0.0 - DebasmitaPati-10-09-2018      
	//===========================================================================================================================================================================================
	public static Calendar RMA_SetCalendarDate(String StrDate) throws Exception,Error
	{

		try
		{
			Date date = RMA_GetDateFromString_Utility(StrDate,"MM/dd/yyyy");
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			return calendar;				  
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Set A Date On Calendar : " +" " +e.getMessage());
			throw(e);
		}
	}
	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetCalendarDate
	//Description  		: To Set A Date In Calendar
	//Input Parameter 	: None 
	//Revision			: 0.0 - DebasmitaPati-10-10-2018      
	//===========================================================================================================================================================================================
	public static Date RMA_GetCalendarDate(Calendar Calendar) throws Exception,Error
	{

		try
		{
			Date date = new Date();	
			date = Calendar.getTime();						
			return date;				  
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Get A Date From Calendar : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_FormatADate_Utility
	//Description  		: To Format A Date
	//Input Parameter 	: None 
	//Revision			: 0.0 - DebasmitaPati-10-11-2018      
	//===========================================================================================================================================================================================
	public static String RMA_FormatADate_Utility(Date StrDate,String DateFormat) throws Exception,Error
	{

		try
		{		
			String FormatedDate;
			DateFormat dateformat = new SimpleDateFormat(DateFormat); //DateFormat="MM/dd/yyyy"
			FormatedDate = dateformat.format(StrDate);
			return FormatedDate;		    
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Formatting A Date : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetDaysCountBetweenTwoDates_Utility
	//Description  		: To Set A Date In Calendar
	//Input Parameter 	: None 
	//Revision			: 0.0 - DebasmitaPati-10-11-2018      
	//===========================================================================================================================================================================================
	public static int RMA_GetDaysCountBetweenTwoDates_Utility(String StartDate, String Enddate) throws Exception,Error
	{

		try
		{
			int DaysCount = 0;
			Date startdate = RMA_GetDateFromString_Utility(StartDate,"MM/dd/yyyy");
			Date enddate = RMA_GetDateFromString_Utility(Enddate,"MM/dd/yyyy");
			long Diff = enddate.getTime()-startdate.getTime();
			float daycounttemp = (float)Diff/(24*60*60*1000);
			DaysCount = (int)daycounttemp;		
			return DaysCount;	
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Calculating Days Count Between Two Given Dates : " +" " +e.getMessage());
			throw(e);
		}
	}


	//===========================================================================================================================================================================================
	//FunctionName             : RMA_GetDayOfWeekFromDate_Utility
	//Description              : To Get Day Of Week From A Given Date
	//Input Parameter   	   : None 
	//Revision                 : 0.0 - DebasmitaPati-10-12-2018       
	//===========================================================================================================================================================================================
	public static int RMA_GetDayOfWeekFromDate_Utility(String StrDate) throws Exception,Error
	{
		try
		{   
			int DayOfWeek;
			Calendar calendar = RMA_SetCalendarDate(StrDate);
			DayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			return DayOfWeek;

		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred To Get The Day Of A Week For A Given Date : " +" " +e.getMessage());
			throw(e);
		}

	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_AddNumberOfMonthsInADate_Utility
	//Description  		: To Get A Date After Adding N Number Of Months
	//Input Parameter 	: None 
	//Revision			: 0.0 - DebasmitaPati-10-12-2018      
	//===========================================================================================================================================================================================
	public static String RMA_AddNumberOfMonthsInADate_Utility(String StrDate,int NumberOfMonths) throws Exception,Error
	{

		try
		{
			String ModifiedDate;			
			Calendar calendar = RMA_SetCalendarDate(StrDate);
			calendar.add(Calendar.MONTH, NumberOfMonths);
			Date date = RMA_GetCalendarDate(calendar);
			ModifiedDate = RMA_FormatADate_Utility(date,"MM/dd/yyyy");
			return ModifiedDate;
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Adding Months In A Date : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_CompareTwoDates_Utility
	//Description  		: To Compare Two Given Dates
	//Input Parameter 	: None 
	//Revision			: 0.0 - DebasmitaPati-10-15-2018      
	//===========================================================================================================================================================================================
	public static boolean RMA_CompareTwoDates_Utility(String Case, String Date1,String Date2) throws Exception,Error
	{
		boolean Found=false;
		try
		{
			Calendar calendar1 = RMA_SetCalendarDate(Date1);
			Calendar calendar2 = RMA_SetCalendarDate(Date2);
			switch (Case){

			case "GreaterThanEqualTo":		

				if (calendar1.equals(calendar2) || (calendar1.after(calendar2)))
					Found = true;
				else
					Found = false;

				break;


			case "LessThanEqualTo":		

				if (calendar1.equals(calendar2) || (calendar1.before(calendar2)))
					Found = true;
				else
					Found = false;

				break;

			}				
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Comparing Two Given Dates : " +" " +e.getMessage());
			throw(e);
		}
		return Found;
	}
	//===========================================================================================================================================================================================
	//FunctionName             : RMA_SetADayInNextWeekOfAGivenDate_Utility
	//Description              : To Set A Day In Next Week Of A Given Date 
	//Input Parameter   	   : None 
	//Revision                 : 0.0 - DebasmitaPati-10-16-2018      
	//===========================================================================================================================================================================================
	public static String RMA_SetADayInNextWeekOfAGivenDate_Utility(String StrDate, int Day) throws Exception,Error
	{

		try
		{
			String ModifiedDate= null;
			Calendar calendar = RMA_SetCalendarDate(StrDate);
			calendar.add(Calendar.WEEK_OF_MONTH, 1);
			calendar.set(Calendar.DAY_OF_WEEK,Day);
			Date date = RMA_GetCalendarDate(calendar);
			ModifiedDate = RMA_FormatADate_Utility(date,"MM/dd/yyyy");
			return ModifiedDate;  
		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Calculating A Day Of Next Week Of A Given Date : " +" " +e.getMessage());
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName             : RMA_GetDaysPaidForBiWeeklyPlan_Utility
	//Description              : To Get Days Paid For First And Last Non Occ Payment For BiWeekly Payment Schedule Selected In Disability Plan
	//Input Parameter   	   : None 
	//Revision                 : 0.0 - DebasmitaPati-10-16-2018      
	//===========================================================================================================================================================================================
	public static int RMA_GetDaysPaidForBiWeeklyPlan_Utility(String Case, String FromDate, String ToDate) throws Exception,Error
	{
		int DaysPaid = 0;
		try{

			switch (Case){

			case "FirstPayment":	
				int FdayofWeek = RMA_GetDayOfWeekFromDate_Utility(FromDate);

				if((FdayofWeek == Calendar.SUNDAY) || (FdayofWeek == Calendar.MONDAY))
					DaysPaid = 10;
				else if(FdayofWeek == Calendar.TUESDAY)
					DaysPaid = 9;
				else if(FdayofWeek == Calendar.WEDNESDAY)
					DaysPaid = 8;
				else if(FdayofWeek == Calendar.THURSDAY)
					DaysPaid = 7;
				else if(FdayofWeek == Calendar.FRIDAY)
					DaysPaid = 6;
				else DaysPaid=5;  	
				break;

			case "LastPayment":				
				int TdayofWeek = RMA_GetDayOfWeekFromDate_Utility(ToDate);
				int DaysCount = RMA_GetDaysCountBetweenTwoDates_Utility(FromDate, ToDate);		

				if (DaysCount <= 7)
				{
					if(TdayofWeek == Calendar.MONDAY)
						DaysPaid = 1;
					else if(TdayofWeek == Calendar.TUESDAY)
						DaysPaid = 2;
					else if(TdayofWeek == Calendar.WEDNESDAY)
						DaysPaid = 3;
					else if(TdayofWeek == Calendar.THURSDAY)
						DaysPaid = 4;
					else DaysPaid=5;  	
				} else
				{
					if(TdayofWeek == Calendar.MONDAY)
						DaysPaid = 6;
					else if(TdayofWeek == Calendar.TUESDAY)
						DaysPaid = 7;
					else if(TdayofWeek == Calendar.WEDNESDAY)
						DaysPaid = 8;
					else if(TdayofWeek == Calendar.THURSDAY)
						DaysPaid = 9;
					else DaysPaid=10;  	
				}
				break;
			}
		}	   
		catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Calculating Days Paid : " +" " +e.getMessage());
			throw(e);
		}    
		return DaysPaid;    
	}
	//===========================================================================================================================================================================================
	//FunctionName             : RMA_FetchParameterValueOfClass_Utility
	//Description              : Fetch the Value of the Parameter of the class
	//Input Parameter   	   : None 
	//Revision                 : 0.0 - RenuVerma-01-02-2018      
	//===========================================================================================================================================================================================
	public static Object RMA_FetchParameterValueOfClass_Utility(String ClassNameWithParameter)throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException
	{

		try
		{
			System.out.println(ClassNameWithParameter);
			String a[]=ClassNameWithParameter.split("::");
			String ClassName=a[0];
			String Parameter=a[1];
			Object ReturnValue=null;

			Class<?> temp= Class.forName(ClassName);// To initialize the class variable
			Field field =temp.getDeclaredField(StringUtils.substringBefore(Parameter, "["));
			field.setAccessible(true);// parameter in the class should access
			if(field.getType().isArray()){// check the parameter data-type
				int index=Integer.parseInt(StringUtils.substringBetween(Parameter, "[", "]"));// find out the index number
				Object[] object=(Object[])field.get(Parameter);	// create a object for field value
				ReturnValue=object[index];//find the value of the array from the given index
				System.out.println(object[index].toString());}
			else {
				ReturnValue=(Object)field.get(Parameter);	// get the value of the field
				System.out.println(ReturnValue.toString());			}
			return ReturnValue;

		}catch(Exception|Error e)
		{
			System.out.println("Following Error Occurred While Fetching The value From Parameter Of The Class : " +" " +e.getMessage());
			throw(e);
		}
	}

	//========================================================================================================================================================================================
	//FunctionName 		: RMA_VerifyNGGridCustomization
	//Description  		: To Verify NG Grid Edit Column Functionality
	//Input Parameter 	: ColumnName: Column Name Of NG Grid Which Needs To Be Customized; UpdatedName: Updated Name Of Column; Intlogval
	//Revision			: 0.0 - DebasmitaPati-04-24-2019                                 
	// =====================================================================================================================================================================================
	public static void RMA_VerifyNGGridCustomization(String ColumnName, String UpdatedName, String NGGridName, int Intlogval) throws Exception,Error
	{
		try
		{
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of "+NGGridName+" Grid Table",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Btn_RestoreState(driver), "Restore State Button In Column Selection Header On "+NGGridName+" Grid Table", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of "+NGGridName+" Grid Table",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_EditColumn(driver), "Edit Column Button In Column Selection Header On "+NGGridName+" Grid Table", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_NGGrid_Txt_EditColumName(driver, ColumnName), ColumnName +"TextBox On Edit Column Header Page", UpdatedName, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Edit Column Header Page", Intlogval);// Save Button Is Clicked
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval); // Wait For UX Page Load Bar To Disappear
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, UpdatedName), "Updated Column Name "+UpdatedName+" On "+NGGridName, Intlogval);	
			RMA_Navigation_Utility.RMA_ScrollIntoView(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, UpdatedName), "Scroll To View Updated Column Name "+UpdatedName+" On "+NGGridName, Intlogval);
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Column Name Update", "Column Name Updated Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Column Name Update", "Column Name Updated Successfully")));
			}
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of "+NGGridName+" Grid Table",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Btn_RestoreState(driver), "Restore State Button In Column Selection Header On "+NGGridName+" Grid Table", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
		}catch(Exception|Error e)
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Column Name Update Failed", "Column Name Is Not Updated")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Column Name Update Failed", "Column Name Is Not Updated")));
			}
			throw(e);
		}
	}
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_DateLiesInBetweenVerify_Utility
	//Description  		: To Get Name Of Month Of A Particular Date
	//Input Parameter 	: Element: Web Element Whose State Is To Be Verified
	//Revision			: 0.0 - ShrutiShruti-05-20-2019                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static String RMA_GetNameOfMonth_Utility (String CheckDate, int logval) throws Exception, Error
	{	String MonthName=null;
	try {
		Date checkdate = new Date();
		checkdate = new SimpleDateFormat("MM/dd/yyyy").parse(CheckDate);
		Calendar StartCal = Calendar.getInstance();
		StartCal.setTime(checkdate);
		int month = StartCal.get(Calendar.MONTH);
		switch(month)
		{
		case 0: MonthName = "January";
		break;
		case 1: MonthName = "February";
		break;
		case 2: MonthName = "March";
		break;
		case 3: MonthName = "April";
		break;
		case 4: MonthName = "May";
		break;
		case 5: MonthName = "June";
		break;
		case 6: MonthName = "July";
		break;
		case 7: MonthName = "August";
		break;
		case 8: MonthName = "September";
		break;
		case 9: MonthName = "October";
		break;
		case 10: MonthName = "November";
		break;
		case 11: MonthName = "December";
		break;
		default: parentlogger.log(LogStatus.FAIL,  "Month Name Fetch Could Not Be Done For" + " " + color.RMA_ChangeColor_Utility(CheckDate, 4));
		}
	}
	catch (Exception|Error e) {
		if (logval ==0){
			parentlogger.log(LogStatus.FAIL,  "Month Name Fetch Could Not Be Done For" + " " + color.RMA_ChangeColor_Utility(CheckDate, 4)+ "Due To Error" + color.RMA_ChangeColor_Utility(e.getMessage(),1));	
		}
		else{
			logger.log(LogStatus.FAIL,  "Month Name Fetch Could Not Be Done For" + " " + color.RMA_ChangeColor_Utility(CheckDate, 4) +  "Due To Error" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));		
		}
		throw (e);
	}return MonthName;
	}

	//==============================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_GetNameOfDay_Utility
	//Description  		: To Get Name Of Day Of A Particular Date
	//Input Parameter 	: Element: Web Element Whose State Is To Be Verified
	//Revision			: 0.0 - ShrutiShruti-05-21-2019                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static String RMA_GetNameOfDay_Utility (String CheckDate, int logval) throws Exception, Error
	{	String DayName=null;
	try {
		Date checkdate = new Date();
		checkdate = new SimpleDateFormat("MM/dd/yyyy").parse(CheckDate);
		Calendar StartCal = Calendar.getInstance();
		StartCal.setTime(checkdate);
		int day = StartCal.get(Calendar.DAY_OF_WEEK);
		switch(day)
		{
		case 1: DayName = "Sunday";
		break;
		case 2: DayName = "Monday";
		break;
		case 3: DayName = "Tuesday";
		break;
		case 4: DayName = "Wednesday";
		break;
		case 5: DayName = "Thursday";
		break;
		case 6: DayName = "Friday";
		break;
		case 7: DayName = "Saturday";
		break;
		default: parentlogger.log(LogStatus.FAIL,  "Day Name Fetch Could Not Be Done For" + " " + color.RMA_ChangeColor_Utility(CheckDate, 4));
		}
	}
	catch (Exception|Error e) {
		if (logval ==0){
			parentlogger.log(LogStatus.FAIL,  "Day Name Fetch Could Not Be Done For" + " " + color.RMA_ChangeColor_Utility(CheckDate, 4)+ "Due To Error" + color.RMA_ChangeColor_Utility(e.getMessage(),1));	
		}
		else{
			logger.log(LogStatus.FAIL,  "Day Name Fetch Could Not Be Done For" + " " + color.RMA_ChangeColor_Utility(CheckDate, 4) +  "Due To Error" + " " + color.RMA_ChangeColor_Utility(e.getMessage(),1));		
		}
		throw (e);
	}return DayName;
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_RoundedValue_Utility
	//Description  		: To Round OFF Decimal number Based On Decimal Digit Present
	//Input Parameter 	: Number
	//Revision			: 0.0 - ParulSharma-11-25-2019      
	//===========================================================================================================================================================================================

	public static Double RMA_RoundedValue_Utility1(double Num) throws Exception,Error
	{
		try
		{
			double RoundedValue1;
			String doubleAsString = String.valueOf(Num);
			int indexOfDecimal = doubleAsString.indexOf(".");
			double numdecimal = Double.parseDouble(doubleAsString.substring(indexOfDecimal));
			if(numdecimal >0.5 && numdecimal <0.6){
				RoundedValue1 = Math.round(Num);
				return RoundedValue1;		    
			}
			else{
				double RoundedValue = Math.round(Num*100.00)/100.00;
				return RoundedValue;	
			}  
		}catch(Exception|Error e)
		{
			throw(e);
		}
	}

	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_MultiCurrencyNumberFormat_Utility
	//Description  		: To Format A number And Append Currency Symbol To The Argument Passed
	//Input Parameter 	: Number And Currency Symbol 
	//Revision			: 0.0 - ParulSharma-11-26-2019      
	//===========================================================================================================================================================================================
	public static String RMA_MultiCurrencyNumberFormat_Utility(double Num ,String Currency_Symbol1) throws Exception,Error
	{
		String RoundedValue = null;
		try
		{	
			if(!(Currency_Symbol1.equals("$") || Currency_Symbol1.equals("\u20AC") || Currency_Symbol1.equals("\u00A3") )){
				Format format22 = com.ibm.icu.text.NumberFormat.getCurrencyInstance(new Locale("en", "in"));
				RoundedValue = Currency_Symbol1+format22.format(new BigDecimal(Num));
				String strArray[] = RoundedValue.split("Rs. ");
				RoundedValue = Currency_Symbol1+" "+strArray[1];
			}			
			else{
				DecimalFormat df = new DecimalFormat("#,##,##0.00");
				RoundedValue = Currency_Symbol1+df.format(Num);
			}
			return RoundedValue;		    
		}catch(Exception|Error e)
		{
			throw(e);
		}
	}
	
	//===========================================================================================================================================================================================
	//FunctionName 		: RMA_GetDoubleFromString_Utility
	//Description  		: To Format A number And Append Currency Symbol To The Argument Passed
	//Input Parameter 	: Number And Currency Symbol 
	//Revision			: 0.0 - ShrutiShruti-02-12-2020      
	//===========================================================================================================================================================================================
	public static String RMA_GetDoubleFromString_Utility(String Value) throws Exception,Error
	{
		String StringValue = null;
		try
		{	
			char[] c = new char[]{};
			c = Value.trim().toCharArray();
			int j = 0;
			char[] ch = new char[c.length];
			for(int i =0; i < c.length;i++)
			{
				if((Character.isDigit(c[i]))||(c[i]=='.'))
				{	
					ch[j] = c[i];
					j++;
				}
			}
			StringValue = String.valueOf(ch);
			return StringValue;		    
		}catch(Exception|Error e)
		{
			throw(e);
		}
	}
}