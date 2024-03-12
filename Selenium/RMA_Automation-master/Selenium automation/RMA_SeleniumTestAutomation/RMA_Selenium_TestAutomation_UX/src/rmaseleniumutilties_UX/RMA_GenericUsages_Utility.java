package rmaseleniumutilties_UX;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.lang3.RandomStringUtils;
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
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

public class RMA_GenericUsages_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static int IntRandomNum;
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


	//===================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ModelDialogHandler_Utility
	//Description  		: Handles Any Type Of Windows Pop Up And Accepts Or Rejects The Same (Say Clicking On Yes Or No Button) 
	//Input Parameter 	: Instance Of The WebDriver Class 'Driver' And Value Of The String 'StrAccept', Intlogavl Of Type Integer
	//Revision		    : 0.0 - KumudNaithani-01-06-2017
	//=======================================================================================================================================================================================================================================================================================================================================
	public static void RMA_ModelDialogHandler_Utility(WebDriver driver, String StrAccept, int Intlogval)throws Exception, Error
	{  
		try {
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
			System.out.println("NoSuchElementException Exception Occurred While Handling Model Dialog" + t.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
		}
		catch (Exception|Error e) 
		{
			System.out.println("Exception Occurred While Handling Model Dialog" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
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
		try {
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
			}
		}
		catch (Exception|Error e)
		{
			System.out.println("Error has occured while changing text color :" +" " +e.getMessage());
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
			{String attribute = ele.get(IntRandomNum).getAttribute("id"); //Returns the Id of a frame.		
			if (attribute.contains(text))
			{
				break;
			}
			}

		} catch (Exception|Error e) {
			System.out.println("Error Occurred While Navigating Frame :" +" " +e.getMessage());
			throw(e);
		}

		return IntRandomNum;
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
				Thread.sleep(4000);
				strTitle = driver.getTitle();
				if (strTitle.equalsIgnoreCase(TitleName))
				{		
					TitleFound = true;
					return;
				}
			}	

			if (TitleFound == false)
			{
				System.out.println("Of All Opened Windows ,The Window With Provided Title Name :" + " " + TitleName +" " + ", Is Not Found Hence Switching To Required Window Can Not Be Done");
			}

		}catch(Exception|Error e)	
		{
			System.out.println("Error Occurred While Switching Window Based On Provided Title Name And Error Message Is :" +" " +e.getMessage());
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
			System.out.println("Error Occurred In Method RMA_DynamicFrameSwitching While Switching Frame :" +" " +e.getMessage());
			throw(e);
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
			//StringSelection is a class that can be used for copy and paste operations.
			StringSelection stringSelection = new StringSelection(PhysicalPath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
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
						System.out.println("inside window 3");

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
			globalWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(RMA_FrameNavigation(text)));

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
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;	
			String NextFrameID=jsExecutor.executeScript("return self.frameElement.nextElementSibling.id").toString();
			System.out.println(" NextFrame"+NextFrameID );
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
			System.out.println(StrAlertMessage);
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
	//FunctionName 		: RMA_Non_UXNavigation
	//Description  		: Following Function Enables The User To Migrate To Old RMA Non-UX UI
	//Input Parameter 	: ClaimLink Of Type Boolean Depicts Whether Claim Link On 
	//Revision			: 0.0 - KumudNaithani-07-18-2017                                 
	//==========================================================================================================================================================================================================================================================================================
	public static void RMA_Non_UXNavigation(boolean ClaimLink) throws Exception, Error 
	{
		try {
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			if(ClaimLink==true)
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claim(driver), "Claim Navigation Option Label On RiskMaster Application's Dashboard Page", logval);
			}
			if (RMA_Selenium_POM_VerificationMessage.NumberOfPrimaryWindows==2)
			{

			}
			else if (RMA_Selenium_POM_VerificationMessage.NumberOfPrimaryWindows==3)
			{
				RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrRMAUXWindowHandle, "NA", "NA", "NA", "Navigation TO RMA Non-UX UI", logval);	
			}
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		} catch (Exception|Error e) {
			System.out.println("Following Error Occurred While Switching Window :" +" " +e.getMessage());
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
			System.out.println("Following Error Occurred While Migrating To Dashboard From Non-UX UI :" +" " +e.getMessage());
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
			WebDriverWait wait = new WebDriverWait(driver, 7);			
			wait.until(org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent());
			alert = driver.switchTo().alert(); // A Switch To The Displayed Alert Message Is Done
			if (StrAccept == "Yes") // If The User Chooses To Accept The Alert That Is The Positive Option Say "Yes", "OK" Or "Leave The Page" Then Alert Window Is Accepted And Desired Action Is Done Like Refereshing The Page
			{
				//Thread.sleep(10000);
				alert.accept(); 
				Thread.sleep(12000);		
			}
			else
			{
				alert.dismiss(); // If The User Chooses To Decline The Alert That Is The Negative Option Say "No", "Cancel" Or "Stay On The Page" Then Alert Window Is Dismissed And Desired Action Is Done Like Staying On The Page
			} 
		}

		catch (org.openqa.selenium.TimeoutException t)
		{
			//System.out.println("Timeout Exception Handled");
			//This Catch Is Added To Handle TimeoutException
		}
		catch (NoAlertPresentException ex)
		{
			//Following Catch Has Been Added To Handle The Scenario Where Existence Of The Window's Pop Up Depends On The Application Behavior (Scenario Executed Before Function Call)
		}

		catch (Exception|Error e) 
		{
			System.out.println("Exception Occurred While Handling The Windows PopUp" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
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
				System.out.println("strTitle"+strTitle);
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
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			Thread.sleep(10000);
		} catch (Exception|Error e) {
			System.out.println("Following Error Occurred While Switching Window :" +" " +e.getMessage());
			throw (e);
		}
	}
}

