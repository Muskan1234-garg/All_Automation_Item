package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Entity;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_083
//Description    : Create, Edit And Delete Of Entity (MMSEA Claim Party Entity,OSHA Establishment,Police Agency,Providers,Rehab. Job Placement Provider Firms,Rehab. Provider Firms,SALVAGE YARD) From Maintenance Screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-11-10-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_QTPRegression_TC_083 extends RMA_TC_BaseTest {
	@Test
	public void RMA_QTPRegression_TC_083_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_083_Create, Edit And Delete Of Entity From Maintenance Screen_3", " Create, Edit And Delete Of Entity From Maintenance Screen Is Validated");
			parentlogger.assignAuthor("Anubhhuti Vyas");

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_083";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			String StrEntityLastName;
			String StrEntityAddressType;
			String StrAddress1;
			String StrAddress2;
			String StrAddress3;
			String StrAddress4;
			int IntZipCode;
			String StrCounty;
			String StrCity;
			//Local Variable Declaration Is Completed Here

			StrAddress1 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address1_");
			StrAddress2 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address2_");	
			StrAddress3 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address3_");	
			StrAddress4 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address4_");	
			StrCounty = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "County_");
			StrCity = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "City_");
			IntZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(10000,99999);
			//Local Variable Initialization Is Completed Here

		//================================Entity Creation Started For Type Of Entity As "MMSEA Claim Party Entity"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New Entity Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("MMSEA Claim Party Entity", 2));
			testcall1 = true;
			StrEntityLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Entity", "MMSEA Claim Party Entity", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Entity Is Created With Entity LastName::"+ " " + color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Entity From Maintenance Screen Is Successfully Created
			//============================================================New Entity Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_OperatingAs(driver), "OperatingAs Tab On Entity Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_ContactInfo(driver), "Contact Info Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_EntityIDType(driver), "EntityIDType Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Supplementals(driver), "Supplementals Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Addresses(driver), "Addresses Tab On Entity Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+" To Create New Entity From Maintenance Screen");
			testcall2 = true;
			StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Entity Address From Entity Screen");
			testcall3 = true;
			StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("HADDR","Entity", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created Entity Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("MMSEA Claim Party Entity", 2));
			testcall4 = true;
			StrEntityLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("Entity", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following Entity Is Successful, Edited Entity LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
			// New Entity From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created Entity Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of Entity From Maintenance Screen With Entity Type:" + " " + color.RMA_ChangeColor_Utility("MMSEA Claim Party Entity", 2) + " Is Successfully Verified");
			//==========================================================Delete Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================Entity Creation Completed For Type Of Entity As "MMSEA Claim Party Entity"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

		//================================Entity Creation Started For Type Of Entity As "OSHA Establishment"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			StrAddress1 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address1_");
			StrAddress2 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address2_");	
			StrAddress3 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address3_");	
			StrAddress4 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address4_");	
			StrCounty = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "County_");
			StrCity = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "City_");
			IntZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(10000,99999);
			//Local Variable Initialization Is Completed Here

			//===========================================================New Entity Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("OSHA Establishment", 2));
			testcall1 = true;
			StrEntityLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Entity", "OSHA Establishment", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Entity Is Created With Entity LastName::"+ " " + color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Entity From Maintenance Screen Is Successfully Created
			//============================================================New Entity Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_OperatingAs(driver), "OperatingAs Tab On Entity Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_ContactInfo(driver), "Contact Info Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_EntityIDType(driver), "EntityIDType Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Supplementals(driver), "Supplementals Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Addresses(driver), "Addresses Tab On Entity Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+" To Create New Entity From Maintenance Screen");
			testcall2 = true;
			StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Entity Address From Entity Screen");
			testcall3 = true;
			StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created Entity Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("OSHA Establishment", 2));
			testcall4 = true;
			StrEntityLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("Entity", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following Entity Is Successful, Edited Entity LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
			// New Entity From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created Entity Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of Entity From Maintenance Screen With Entity Type:" + " " + color.RMA_ChangeColor_Utility("OSHA Establishment", 2) + " Is Successfully Verified");
			//==========================================================Delete Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================Entity Creation Completed For Type Of Entity As "OSHA Establishment"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

		//================================Entity Creation Started For Type Of Entity As "Police Agency"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New Entity Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("Police Agency", 2));
			testcall1 = true;
			StrEntityLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Entity", "Police Agency", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Entity Is Created With Entity LastName::"+ " " + color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Entity From Maintenance Screen Is Successfully Created
			//============================================================New Entity Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_OperatingAs(driver), "OperatingAs Tab On Entity Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_ContactInfo(driver), "Contact Info Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_EntityIDType(driver), "EntityIDType Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Supplementals(driver), "Supplementals Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Addresses(driver), "Addresses Tab On Entity Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+" To Create New Entity From Maintenance Screen");
			testcall2 = true;
			StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Entity Address From Entity Screen");
			testcall3 = true;
			StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created Entity Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("Police Agency", 2));
			testcall4 = true;
			StrEntityLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("Entity", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following Entity Is Successful, Edited Entity LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
			// New Entity From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created Entity Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of Entity From Maintenance Screen With Entity Type:" + " " + color.RMA_ChangeColor_Utility("Police Agency", 2) + " Is Successfully Verified");
			//==========================================================Delete Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================Entity Creation Completed For Type Of Entity As "Police Agency"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

		//================================Entity Creation Started For Type Of Entity As "Providers"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New Entity Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("Providers", 2));
			testcall1 = true;
			StrEntityLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Entity", "Providers", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Entity Is Created With Entity LastName::"+ " " + color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Entity From Maintenance Screen Is Successfully Created
			//============================================================New Entity Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_OperatingAs(driver), "OperatingAs Tab On Entity Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_ContactInfo(driver), "Contact Info Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_EntityIDType(driver), "EntityIDType Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Supplementals(driver), "Supplementals Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Addresses(driver), "Addresses Tab On Entity Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+" To Create New Entity From Maintenance Screen");
			testcall2 = true;
			StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Entity Address From Entity Screen");
			testcall3 = true;
			StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created Entity Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("Providers", 2));
			testcall4 = true;
			StrEntityLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("Entity", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following Entity Is Successful, Edited Entity LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
			// New Entity From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created Entity Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of Entity From Maintenance Screen With Entity Type:" + " " + color.RMA_ChangeColor_Utility("Providers", 2) + " Is Successfully Verified");
			//==========================================================Delete Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================Entity Creation Completed For Type Of Entity As "Providers"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================
			
		//================================Entity Creation Started For Type Of Entity As "Rehab. Job Placement Provider Firms"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================
			
			//===========================================================New Entity Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("Rehab. Job Placement Provider Firms", 2));
			testcall1 = true;
			StrEntityLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Entity", "Rehab. Job Placement Provider Firms", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Entity Is Created With Entity LastName::"+ " " + color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Entity From Maintenance Screen Is Successfully Created
			//============================================================New Entity Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_OperatingAs(driver), "OperatingAs Tab On Entity Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_ContactInfo(driver), "Contact Info Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_EntityIDType(driver), "EntityIDType Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Supplementals(driver), "Supplementals Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Addresses(driver), "Addresses Tab On Entity Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+" To Create New Entity From Maintenance Screen");
			testcall2 = true;
			StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Entity Address From Entity Screen");
			testcall3 = true;
			StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created Entity Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("Rehab. Job Placement Provider Firms", 2));
			testcall4 = true;
			StrEntityLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("Entity", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following Entity Is Successful, Edited Entity LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
			// New Entity From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created Entity Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of Entity From Maintenance Screen With Entity Type:" + " " + color.RMA_ChangeColor_Utility("Rehab. Job Placement Provider Firms", 2) + " Is Successfully Verified");
			//==========================================================Delete Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================Entity Creation Completed For Type Of Entity As "Rehab. Job Placement Provider Firms"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================	
		
			//================================Entity Creation Started For Type Of Entity As "Rehab. Provider Firms"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New Entity Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("Rehab. Provider Firms", 2));
			testcall1 = true;
			StrEntityLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Entity", "Rehab. Provider Firms", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Entity Is Created With Entity LastName::"+ " " + color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Entity From Maintenance Screen Is Successfully Created
			//============================================================New Entity Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_OperatingAs(driver), "OperatingAs Tab On Entity Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_ContactInfo(driver), "Contact Info Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_EntityIDType(driver), "EntityIDType Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Supplementals(driver), "Supplementals Tab On Entity Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Addresses(driver), "Addresses Tab On Entity Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+" To Create New Entity From Maintenance Screen");
			testcall2 = true;
			StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Entity Address From Entity Screen");
			testcall3 = true;
			StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created Entity Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("Rehab. Provider Firms", 2));
			testcall4 = true;
			StrEntityLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("Entity", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following Entity Is Successful, Edited Entity LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
			// New Entity From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created Entity Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of Entity From Maintenance Screen With Entity Type:" + " " + color.RMA_ChangeColor_Utility("Rehab. Provider Firms", 2) + " Is Successfully Verified");
			//==========================================================Delete Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================Entity Creation Completed For Type Of Entity As "Rehab. Provider Firms"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================
		
		//================================Entity Creation Started For Type Of Entity As "SALVAGE YARD"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================	
				
			//===========================================================New Entity Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("SALVAGE YARD", 2));
				testcall1 = true;
				StrEntityLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Entity", "SALVAGE YARD", "SSN",logval1);
				loggerval1 = logger.toString();
				parentlogger.appendChild(logger);
				parentlogger.log(LogStatus.INFO, "New Entity Is Created With Entity LastName::"+ " " + color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
				CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				// New Entity From Maintenance Screen Is Successfully Created
				//============================================================New Entity Creation Is Completed Here================================================================================================================================================================================================================================================================

				//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_OperatingAs(driver), "OperatingAs Tab On Entity Creation Page",logval);	
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_ContactInfo(driver), "Contact Info Tab On Entity Creation Page",logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_EntityIDType(driver), "EntityIDType Tab On Entity Creation Page",logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Supplementals(driver), "Supplementals Tab On Entity Creation Page",logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Addresses(driver), "Addresses Tab On Entity Creation Page",logval);
				//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

				//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
				parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+" To Create New Entity From Maintenance Screen");
				testcall2 = true;
				StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
				loggerval2 = logger.toString();
				parentlogger.appendChild(logger);
				parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
				// New Address From Entiy -> Addresses Tab Is Successfully Created
				//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================
				
				//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Entity.RMAApp_Entity_Tab_Entity(driver), "Entity Tab On Entity Creation Page",logval);
				parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Entity Address From Entity Screen");
				testcall3 = true;
				StrEntityAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("Entity","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
				loggerval3 = logger.toString();
				parentlogger.appendChild(logger);
				parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrEntityAddressType, 2));
				// New Address From Entiy -> Addresses Tab Is Successfully Verified
				//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

				//==========================================================Edit Of Created Entity Is Started Here===========================================================================================================================================================================================================================================================================================
				parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created Entity From Maintenance Screen of Type:" + " " + color.RMA_ChangeColor_Utility("SALVAGE YARD", 2));
				testcall4 = true;
				StrEntityLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("Entity", "NA" ,CurrentFrameID,logval1);
				loggerval4 = logger.toString();
				parentlogger.appendChild(logger);
				parentlogger.log(LogStatus.PASS, "Edit Of Following Entity Is Successful, Edited Entity LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrEntityLastName, 2));
				// New Entity From Maintenance Screen Is Successfully Edited
				//==========================================================Edit Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

				//==========================================================Delete Of Created Entity Is Started Here=========================================================================================================================================================================================================================================================================================
				RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", false, logval);
				RMA_Functionality_Utility.RMA_GenericDelete_Utility("Entity Creation Page", true, logval);
				parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of Entity From Maintenance Screen With Entity Type:" + " " + color.RMA_ChangeColor_Utility("SALVAGE YARD", 2) + " Is Successfully Verified");
				//==========================================================Delete Of Created Entity Is Completed Here==========================================================================================================================================================================================================================================================================================

				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

			//================================Entity Creation Completed For Type Of Entity As "SALVAGE YARD"========================================================================================================================================================================================================================================================================================================================
			//====================================================================================================================================================================================================================================================================================================================================================================================================================				

		}catch(Exception|Error e)
		{
			ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Not Handled Exception And Print Log Of It
			ErrorMessageType = e.toString();
			if (ExceptionRecorded.contains("Command"))
			{
				ErrorMessage = ExceptionRecorded.split("Command");
				FinalErrorMessage = ErrorMessage[0];
			}
			else
			{
				FinalErrorMessage = ExceptionRecorded;
			}
			StackTraceElement[] TraceElement = e.getStackTrace();
			for (StackTraceElement ObjectName : TraceElement)
			{
				if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
				{
					FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); 
					break;
				}
			}
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Entity_AddressAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Entity_AddressVerification_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MainenanceEditEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			throw (e);
		}
	}

	@AfterMethod
	public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
	{
		try {
			String TestCaseName;
			if (ITestResult.FAILURE == result.getStatus())
			{
				TestCaseName = result.getName();
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval);
			}
		} catch (Exception|Error e) {	
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}	
		finally
		{
			try {
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				driver.switchTo().parentFrame();
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

