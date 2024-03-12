package rmaseleniumutilties_UX;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed
import rmaseleniumPOM_UX.RMA_Selenium_POM_Config_Manager_GSP;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Configuration_Manager;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
//RMA Package Import Completed

public class Assure_Configuration_Manager_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();

	//============================================================================================================================================================================
	//FunctionName 		: Assure_DataSource_Selection_Configuration_Manager
	//Description  		: Enables The User To Select Required DataSource And Verifies Whether Correct DataSouce Has Been Selected Or Not On Configuration Manager Screen
	//Input Parameter 	: StrDataSourceName, Intlogval 	 
	//Revision			: 0.0 - Parul Sharma-09-21-2020         
	//===================================================================================================================================================================
	public static void Assure_DataSource_Selection_Configuration_Manager(String StrDataSourceName,String ZoneName, int Intlogval) throws Exception, Error
	{
		String StrDataSourceLabelActual;
		//Local Variable Declaration Completed

		try {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Enables The User To Select Required DataSource"+StrDataSourceName+" And Verifies Whether Correct DataSouce Has Been Selected Or Not");
			}else{	
				logger = reports.startTest("<span id='DataSourceSelect'>Successful DataSource Selection</span>","Enables The User To Select Required DataSource"+StrDataSourceName+" And Verifies Whether Correct DataSouce Has Been Selected Or Not");
			}
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Cmb_DataSourceName(driver), "Select DataSource Combo Box On RISKMASTER Database and View Selection Page",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Cmb_DSNSourceSelection(driver, StrDataSourceName),"DataSource"+ " "+color.RMA_ChangeColor_Utility(StrDataSourceName, 3)+ " "+"Option On RISKMASTER Database and View Selection Page",Intlogval);
			// Helps The User To Select The DataSource Based On Its Name

			//-------------------------Added By Anubhuti - To Be Changed Later---------------------------------
			Thread.sleep(2000);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Cmb_ZoneName(driver), "Select Zone Combo Box On RISKMASTER Database and View Selection Page",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Cmb_ZoneSelection(driver, ZoneName),"Zone"+ " "+color.RMA_ChangeColor_Utility(StrDataSourceName, 3)+ " "+"Option On RISKMASTER Database and View Selection Page",Intlogval);
			// Helps The User To Select The Zone Based On Its Name
			//-------------------------Added By Anubhuti - To Be Changed Later---------------------------------
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Btn_Continue(driver), "Continue Button On RISKMASTER Database and View Selection Page",Intlogval);
			//RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Required Database Is Selected In RiskMaster Application DataSource Selection Page ");
			//-------------------------Commented By Anubhuti - To Be Changed Later---------------------------------
			RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Menu Page Is Loading ");

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Configuration_Manager.Assure_Configuration_Manager_Lbl_DataSource(driver)));
			StrDataSourceLabelActual = RMA_Selenium_POM_Configuration_Manager.Assure_Configuration_Manager_Lbl_DataSource(driver).getText();
			System.out.println("StrDataSourceLabelActual is "+StrDataSourceLabelActual);

			RMA_Verification_Utility.RMA_PartialTextVerification(StrDataSourceName, StrDataSourceLabelActual, "Correct DSN Selection",Intlogval);
			//-------------------------Commented By Anubhuti - To Be Changed Later---------------------------------
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful DatSource Selection", "DataSource"+ " "+ StrDataSourceName + " " +"Is Selected Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful DatSource Selection", "DataSource"+ " "+ StrDataSourceName + " " +"Is Selected Successfully")));
			}
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "DatSource Selection Fail", "DataSource"+ " "+ StrDataSourceName + " " +"Is Not Selected")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "DatSource Selection Fail", "DataSource"+ " "+ StrDataSourceName + " " +"Is Not Selected")));
			}
			throw (e);
		}
	}
	//============================================================================================================================================================================
	//FunctionName 		: Assure_Configuration_Manager_Logout_UX
	//Description  		: Enables The User To Logout From Application (Configuration Manager)
	//Input Parameter 	: Intlogval 	 
	//Revision			: 0.0 - Parul Sharma-08-11-2020
	// ===================================================================================================================================================================
	public static void Assure_Configuration_Manager_Logout_UX(int Intlogval) throws Exception, Error
	{
		try {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Enables The User To Logout From Configuration Manager");
			}else{	
				logger = reports.startTest("<span id='AppUXLogout'>Successful Logout From Application</span>","Enables The User To  Logout From Configuration Manager");
			}

			//==============================Steps To Logout From  Application Started Here===========================================================================================================================================================================================================================					
			try {
				StrRMAUXWindowHandle = driver.getWindowHandle();
				if(!RMA_Selenium_POM_Configuration_Manager.Assure_Configuration_Manager_Logout_Button(driver).equals(null))
				{
					RMA_GenericUsages_Utility.RMA_CloseAllWindowOtherThanRMA();
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Configuration_Manager.Assure_Configuration_Manager_Logout_Button(driver), "LogOut Link On Configuration Manager Page",Intlogval);
					RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Confirm");
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Configuration_Manager.Assure_Configuration_Manager_Btn_LogoutConfirm(driver),"Confirm Button On Logout Confirmation Message Popup" ,Intlogval);
				}
			} catch (Exception e) {
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(Intlogval);// If Already logout from previous Test case Just Refresh the Page
			}
			//==============================Steps To Logout From Application Completed Here===========================================================================================================================================================================================================================

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Logout From Application", "Risk Master Logged Out From Application Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Logout From Application", "Risk Master Logged Out From Application Successfully")));
			}
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Application Logout Fail", "Risk Master Is Not Logged out From Application")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver,"Application Logout Fail", "Risk Master Is Not Logged out From Application")));
			}
			throw (e);
		}
	}
	//========================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ElementWebListSelect_Utility_Config
	//Description  		: To Select The Element Displayed In The WebList As Per The User Given Selection Value
	//Input Parameter 	: Element Of Type WebElement: Element For Which The Value Is To Be Selected and SelectionElement Of Type String : Value To Be Selected
	//Revision			: 0.0 - Parul Sharma-08-11-2020                                 
	//========================================================================================================================================================================================================================================================================================================
	public static void RMA_ElementWebListSelect_Utility_Config(WebElement Element, String Value, String ControlName, String PageName, int Intlogval) throws Exception, Error
	{
		try {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Enables The User Select Value In Drop Down Field On Configuration Manager");
			}else{	
				logger = reports.startTest("<span id='ConfigManagerDropDownSelect'>Selection Of Element In Dropdown Field</span>","Enables The User To Select Value In Drop Down Field On Configuration Manager");
			}
			String Current_Val = Element.getText(); 
			if(!Current_Val.equalsIgnoreCase(Value)){
			RMA_Navigation_Utility.RMA_ObjectClick(Element, Value, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Config_Manager_GSP.RMAApp_Config_Manager_GSP_Dropdown_Window(driver,Value), ControlName, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Configuration_Manager.Assure_Configuration_Manager_Save_Button(driver),"Save Image Button On General System Parameter Setup Page",Intlogval);
			Assure_Configuration_Manager_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.SaveSuccessfully, false, "General System Parameter Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5,Intlogval,"Wait Is Added As Settings Are Saved");
			}
			else{
				parentlogger.log(LogStatus.INFO, Value+" Is Already Selected In Auto Populate Claim Date Reported Field In General System On Configuration Manager");

			}
			if (Intlogval ==0)
			{
				parentlogger.log(LogStatus.INFO, "Value Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " "+ "Is" +"::" + " " +  color.RMA_ChangeColor_Utility(Value, 3));	
			}
			else
			{
				logger.log(LogStatus.INFO, "Value Selected In" + " " + color.RMA_ChangeColor_Utility(ControlName, 4) + " " + "On"+ " "+ color.RMA_ChangeColor_Utility(PageName, 4) + " "+ "Is" +"::" + " " +  color.RMA_ChangeColor_Utility(Value, 3));
			}
		} catch (Exception|Error e) {
			if (Intlogval==0)
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

	//======================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_AutoNumber_VehicleID_Utility_Config_Manager
	//Description  		: Enables The User To Do General System Parameter Settings For AutoNumber Vehicle ID 
	//Input Parameter 	: None
	//Revision			: 0.0 - NikitaThani -02-21-2018   
	// ==========================================================================================================================================================================================================================================================
	public static void RMA_AutoNumber_VehicleID_Utility_Config_Manager(String Case , int Intlogval) throws Exception, Error
	{

		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Enables The User To Do Parameter Settings For AutoNumber Successfully");
			}else{	
				logger = reports.startTest("<span id='AutoNumberVID'>Parameter Settings For AutoNumber Vehicle ID </span>","Enables The User To Do Parameter Settings For AutoNumber Vehicle ID  Successfully");
			}

			switch(Case)
			{		
			case "check" :

				//==============================================================Steps To Navigate To General System Parameter Setup Screen Is Started Here=================================================================================================================================================================================================================================================
				RMA_GenericUsages_Utility.RMA_StaticWait(5,logval,"Wait Is Added As Settings Are Saved");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Configuration_Manager.RMAApp_Config_Manager_TabName(driver,"General System Parameter Setup"), "General System Parameter Setup Page Tab Name", logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Configuration_Manager.RMAApp_Config_Manager_Sub_Section_Name(driver,"Event"), "System Settings Tab Of General System Parameter Setup Page Tab Name", logval);			
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Configuration_Manager.RMAApp_Config_Manager_Sub_Section_Name(driver,"Event"), "System Settings Tab Of General System Parameter Setup Page Tab Name", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
				//==============================================================Steps To Navigate To General System Parameter Setup Screen Is Completed Here=================================================================================================================================================================================================================================================

				//==============================================================General System Parameter Setup Started Here=================================================================================================================================================================================================================================================
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Config_Manager_GSP.RMAApp_GenSysParaSetup_Chk_AutonumberVehicleID(driver), "check", "Autonumber Vehicle ID(VIN) Check Box", "General System Parameter Setup Page", Intlogval);
				RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.GenSysParaSetupFrame, false, "NA", "General System Parameter Setup Page", Intlogval);
				//==============================================================General System Parameter Setup Completed Here=================================================================================================================================================================================================================================================
				break;

			case "uncheck" :

				//==============================================================Steps To Navigate To General System Parameter Setup Screen Is Started Here=================================================================================================================================================================================================================================================
				rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", Intlogval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.GenSysParaSetupFrame);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
				//==============================================================Steps To Navigate To General System Parameter Setup Screen Is Completed Here=================================================================================================================================================================================================================================================

				//==============================================================General System Parameter Setup Started Here=================================================================================================================================================================================================================================================
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AutonumberVehicleID(driver), "uncheck", "Autonumber Vehicle ID(VIN) Check Box", "General System Parameter Setup Page", Intlogval);
				RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.GenSysParaSetupFrame, false, "NA", "General System Parameter Setup Page", Intlogval);
				//==============================================================General System Parameter Setup Completed Here=================================================================================================================================================================================================================================================
				break;
			}
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Parameter Setting For AutoNumber Vehicle ID", "Parameter Setting Of For AutoNumber Vehicle ID Done Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Parameter Setting For AutoNumber Vehicle ID", "Parameter Setting For AutoNumber Vehicle ID Done Successfully")));
			}
		}
		catch (Exception | Error e){
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "AutoNumber Vehicle ID Parameter Setting Fail", "Parameter Setting is Not Selected")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "AutoNumber Vehicle ID Parameter Setting Fail", "Parameter Setting is Not Selected")));
			}
			throw (e);
		}
	}

	//======================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_GenericSave_Utility
	//Description  		: Enables The User To Save Entities Like Claim, Adjustor, Employee And So On  
	//Input Parameter 	: ErrMsgVerfReq: Holds True In Case Error Message Occurrence On Save Needs To Verified, ExpErrMsg: Error Message; Separated by '~' When More Than One Error Text Needed To Be Verified
	//					 :CurrentFrame: is the frame where currently working,ObjPageDesc Stores Control And Page Description, 
	//					: Intlogval: Is The Integer Value Of The Logger Statement Variable
	//Revision			: 0.0 - Parul Sharma-08-11-2020  
	//======================================================================================================================================================================================================================================================================================================================
	public static void RMA_GenericSave_Utility(String currentFrame, boolean VerifyErrorMessage ,String ExpectedErrorMessage, String ObjPageDesc, int Intlogval) throws Exception, Error
	{
		String ErrorTxtMessage;
		try {		
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Configuration_Manager.Assure_Configuration_Manager_Save_Button(driver), "Save Image On "+ ObjPageDesc, Intlogval);// Save Button Is Clicked
			if (!(RMA_Selenium_POM_Home.RMAApp_GenericToast_ErrorMsg(driver)== null) && VerifyErrorMessage== false )
			{
				ErrorTxtMessage = RMA_Selenium_POM_Home.RMAApp_GenericToast_ErrorMsg(driver).getText();
				if (Intlogval ==0)
				{
					parentlogger.log(LogStatus.FAIL, "UnExpected Error Toast Message With Following Text Is Displayed" + " "+ color.RMA_ChangeColor_Utility(ErrorTxtMessage,1)+ " "+  color.RMA_ChangeColor_Utility("Execution Of Failure Clean Up Step Initiated",1));
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UnExpected Error Toast Message", "Toast Message Failure")));
				}
				else
				{
					logger.log(LogStatus.FAIL, "UnExpected Error Toast Message With Following Text Is Displayed" + " " +color.RMA_ChangeColor_Utility(ErrorTxtMessage,1)+ " "+  color.RMA_ChangeColor_Utility("Execution Of Failure Clean Up Step Initiated",1));
					logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UnExpected Error Toast Message", "Toast Message Failure")));
				}
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ErrorToastMsgClose(driver), "Close Button On Error Toast Message", Intlogval);// Save Button Is Clicked
				driver.switchTo().parentFrame();	
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Claim Page"+ " ", Intlogval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes",Intlogval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(currentFrame);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added To Mitigate Failure In Instances Where UX Spinner Wait Time Period Is Not Enough For The Screen To Load");
				Assert.fail();
			}
			else if (!ExpectedErrorMessage.equals("NA") )//Renu Verma:: added Code for message verification on the time of save
			{
				RMA_Verification_Utility.RMA_VerifyUXMessage(ExpectedErrorMessage, VerifyErrorMessage, ObjPageDesc, Intlogval);
			}
			else{
				//RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility(ObjPageDesc , Intlogval);// Reload Image Is Clicked And Existence Of Any Unsaved Data Is Verified
				//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(currentFrame);
			}
		} 
		catch (Exception|Error e) {
			throw (e);
		}
	}
	//============================================================================================
		//FunctionName 		: RMA_VerifyUXMessage
		//Description  		: To Verify UX Message On The RMA Application Screen
		//Input Parameter 	: ErrorMessage, ObjPageDescription, logval, IsCloseRequired 
		//Revision			: 0.0 - ParulSharma-12-23-2020                                
		//============================================================================================
		public static void RMA_VerifyUXMessage( String Message,boolean IsCloseRequired,String ObjPageDescription, int logval) throws Exception, Error
		{
			//String CurrentFrameId;
			try {
				RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Configuration_Manager.RMAApp_Generic_Msg_ToastMessage(driver, Message ), Message+ " Message On " + ObjPageDescription, logval);
				if(IsCloseRequired)
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Configuration_Manager.RMAApp_GenericBtn_ErrorToastMsgClose(driver), "Error/Warning Toast Close Button On "+ ObjPageDescription, logval);			
				Thread.sleep(3000);
			} catch (Exception|Error e) {
				throw (e);
			}
		}
}
















