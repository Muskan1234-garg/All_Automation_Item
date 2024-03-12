package rmaseleniumutilties_UX;

import java.io.File;
import java.net.InetAddress;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//Default Package Import Completed

public class RMA_ScreenCapture_Utility {
	static String DestinationPath; //Destination Path Has been Declared As Global Variable TO Cater Any Future Addition In The Utility

	//============================================================================================
	//FunctionName 		: RMA_ScreenShotCaptureOnFailure_Utility
	//Description  		: To Take Application ScreenShot On Failure And Store It In Desired Path
	//Input Parameter 	: Instance Of The WebDriver Class 'Driver' And Name Of The ScreenShot 'ScreenShotName'
	//Revision			: 0.0 - KumudNaithani-10-16-2015                                 
	// ============================================================================================
	public static String RMA_ScreenShotCapture_Utility(WebDriver driver, String ScreenShotName, String StrScreenShotTCName) throws Exception, Error
	{	//Following Function If Not Used In The After Method Annotation Can Help User To Just Catch The ScreenShot Of The Executed Step And Can Be Used For DeBugging Or Judging Application State
		String RMAApp_FailureScreenShotLocation;
		String dtmCurrentDateInfo;
		String dtmCurrentTimeInfo;
		//Local Variable Declaration

		dtmCurrentDateInfo = RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MMddyyyy");
		dtmCurrentTimeInfo = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("hhmm");

		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationUtilities.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_FailureScreenShotLocation = "\\\\"+InetAddress.getLocalHost().getHostAddress()+ExcelData.RMA_ExcelDataRead_Utility(0, 1, 0); //Screenshot Location Fetched From DataSheet RMA_Utilities
		System.out.println(RMAApp_FailureScreenShotLocation);
		//RMAApp_FailureScreenShotLocation = System.getProperty("user.dir")+RMAApp_FailureScreenShotLocation;
		try {
						TakesScreenshot ScreenShotCapture = (TakesScreenshot)driver;
						File FileSource = ScreenShotCapture.getScreenshotAs(OutputType.FILE);
			DestinationPath =RMAApp_FailureScreenShotLocation + StrScreenShotTCName + "_" + ScreenShotName + "_"  + dtmCurrentDateInfo+ "_"+ dtmCurrentTimeInfo + ".png";
			File DestinationLocation = new File (DestinationPath);
						FileUtils.copyFile(FileSource, DestinationLocation);

			// This code will capture screenshot of current screen 
			//BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			// This will store screenshot on Specific location
			//ImageIO.write(image, "png", DestinationLocation); 


		} catch (Exception|Error e) 
		{
			System.out.println("Exception Occurred While Taking ScreenShot On Failure" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
			throw(e);
		}
		return DestinationPath;
	}
}
