package rma_appiumutilities;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import java.io.File;
public class RMA_AppiumEssentials_Utility {
//public static AppiumServiceBuilder service;
public static AppiumDriverLocalService service;


//============================================================================================
//FunctionName 		: RMA_AppiumStop_Utility
//Description  		: Enables To Stop Appium Server Programmatically
//Input Parameter 	: None
//Revision			: 0.0 - KumudNaithani-01-05-2017                                 
//============================================================================================
public static void RMA_AppiumStop_Utility() throws Exception, Error
{
try {
	service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("C:\\Program Files (x86)\\Appium\\node.exe")).withAppiumJS(new File("C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\Appium.js")).withIPAddress("127.0.0.1").usingPort(4723));
	if (service.isRunning())
	{
		System.out.println("Already Running Appium Service Is Stopped");
		service.stop();
	}//If The Service Is Actually Running Than It Would Be Stopped
	else
	{
		System.out.println("Appium Service Is Not Running Alreday Hence No Need To Stop The Same");
	}
} catch(Exception|Error e) {
	System.out.println("Exception Occurred While Attempting To Stop Appium Server" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Un-handled Exception And Print Log Of It
}
}

//============================================================================================
//FunctionName 		: RMA_AppiumStart_Utility
//Description  		: Enables To Start Appium Server Programmatically
//Input Parameter 	: None
//Revision			: 0.0 - KumudNaithani-01-05-2017                                 
//============================================================================================
public static void RMA_AppiumStart_Utility()throws Exception, Error
{
try {
	System.out.println("Appium Service Will First Be Launched And Then Started");
	service.start();// Appium Service Is Started
	} catch (Exception|Error e) {
		System.out.println("Exception Occurred While Attempting To Start Appium Server" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Un-handled Exception And Print Log Of It
	}
}
}


