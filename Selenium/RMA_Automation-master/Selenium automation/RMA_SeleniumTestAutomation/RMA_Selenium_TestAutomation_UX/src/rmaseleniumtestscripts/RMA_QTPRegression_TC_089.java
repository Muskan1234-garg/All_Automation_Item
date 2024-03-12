package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_People;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_089
//Description    : Create, Edit And Delete Of People (Other Patients,Other People,Other Physicians,Other Witness,Out of Business,Owner Not Insured,Passenger,Payor,Plan Sponsor,Policy Insured) From Maintenance Screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-11-14-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_QTPRegression_TC_089 extends RMA_TC_BaseTest {
	@Test
	public void RMA_QTPRegression_TC_089_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_089_Create, Edit And Delete Of People From Maintenance Screen_5", " Create, Edit And Delete Of People From Maintenance Screen Is Validated");
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
			StrScreenShotTCName = "RMA_QTPRegression_TC_089";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			String StrPeopleLastName;
			String StrPeopleAddressType;
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

		//================================People Creation Started For Type Of People As "Other Patients"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New People Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Other Patients", 2));
			testcall1 = true;
			StrPeopleLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("People", "Other Patients", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New People Is Created With People LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New People From Maintenance Screen Is Successfully Created
			//============================================================New People Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For People Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_OperatingAs(driver), "OperatingAs Tab On People Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_ContactInfo(driver), "Contact Info Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_EntityIDType(driver), "EntityIDType Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Supplementals(driver), "Supplementals Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Addresses(driver), "Addresses Tab On People Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+"  To Create New Address From People Screen");
			testcall2 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_People(driver), "People Tab On People Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Address From People Screen");
			testcall3 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created People Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Other Patients", 2));
			testcall4 = true;
			StrPeopleLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("People", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following People Is Successful, Edited People LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			// New People From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created People Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of People From Maintenance Screen With People Type: " + " " + color.RMA_ChangeColor_Utility("Other Patients", 2) + " Is Successfully Verified");

			//==========================================================Delete Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================People Creation Completed For Type Of People As "Other Patients"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

		//================================People Creation Started For Type Of People As "Other People"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New People Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Other People", 2));
			testcall1 = true;
			StrPeopleLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("People", "Other People", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New People Is Created With People LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New People From Maintenance Screen Is Successfully Created
			//============================================================New People Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For People Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_OperatingAs(driver), "OperatingAs Tab On People Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_ContactInfo(driver), "Contact Info Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_EntityIDType(driver), "EntityIDType Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Supplementals(driver), "Supplementals Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Addresses(driver), "Addresses Tab On People Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+"  To Create New Address From People Screen");
			testcall2 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_People(driver), "People Tab On People Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Address From People Screen");
			testcall3 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created People Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Other People", 2));
			testcall4 = true;
			StrPeopleLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("People", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following People Is Successful, Edited People LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			// New People From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created People Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of People From Maintenance Screen With People Type: " + " " + color.RMA_ChangeColor_Utility("Other People", 2) + " Is Successfully Verified");

			//==========================================================Delete Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================People Creation Completed For Type Of People As "Other People"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

		//================================People Creation Started For Type Of People As "Other Physicians"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New People Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Other Physicians", 2));
			testcall1 = true;
			StrPeopleLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("People", "Other Physicians", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New People Is Created With People LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New People From Maintenance Screen Is Successfully Created
			//============================================================New People Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For People Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_OperatingAs(driver), "OperatingAs Tab On People Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_ContactInfo(driver), "Contact Info Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_EntityIDType(driver), "EntityIDType Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Supplementals(driver), "Supplementals Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Addresses(driver), "Addresses Tab On People Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+"  To Create New Address From People Screen");
			testcall2 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_People(driver), "People Tab On People Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Address From People Screen");
			testcall3 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created People Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Other Physicians", 2));
			testcall4 = true;
			StrPeopleLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("People", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following People Is Successful, Edited People LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			// New People From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created People Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of People From Maintenance Screen With People Type: " + " " + color.RMA_ChangeColor_Utility("Other Physicians", 2) + " Is Successfully Verified");

			//==========================================================Delete Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================People Creation Completed For Type Of People As "Other Physicians"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

		//================================People Creation Started For Type Of People As "Other Witness"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New People Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Other Witness", 2));
			testcall1 = true;
			StrPeopleLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("People", "Other Witness", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New People Is Created With People LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New People From Maintenance Screen Is Successfully Created
			//============================================================New People Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For People Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_OperatingAs(driver), "OperatingAs Tab On People Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_ContactInfo(driver), "Contact Info Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_EntityIDType(driver), "EntityIDType Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Supplementals(driver), "Supplementals Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Addresses(driver), "Addresses Tab On People Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+"  To Create New Address From People Screen");
			testcall2 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_People(driver), "People Tab On People Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Address From People Screen");
			testcall3 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created People Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Other Witness", 2));
			testcall4 = true;
			StrPeopleLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("People", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following People Is Successful, Edited People LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			// New People From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created People Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of People From Maintenance Screen With People Type: " + " " + color.RMA_ChangeColor_Utility("Other Witness", 2) + " Is Successfully Verified");

			//==========================================================Delete Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================People Creation Completed For Type Of People As "Other Witness"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

		//================================People Creation Started For Type Of People As "Out of Business"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New People Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Out of Business", 2));
			testcall1 = true;
			StrPeopleLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("People", "Out of Business", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New People Is Created With People LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New People From Maintenance Screen Is Successfully Created
			//============================================================New People Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For People Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_OperatingAs(driver), "OperatingAs Tab On People Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_ContactInfo(driver), "Contact Info Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_EntityIDType(driver), "EntityIDType Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Supplementals(driver), "Supplementals Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Addresses(driver), "Addresses Tab On People Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+"  To Create New Address From People Screen");
			testcall2 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_People(driver), "People Tab On People Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Address From People Screen");
			testcall3 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created People Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Out of Business", 2));
			testcall4 = true;
			StrPeopleLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("People", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following People Is Successful, Edited People LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			// New People From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created People Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of People From Maintenance Screen With People Type: " + " " + color.RMA_ChangeColor_Utility("Out of Business", 2) + " Is Successfully Verified");

			//==========================================================Delete Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================People Creation Completed For Type Of People As "Out of Business"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

		//================================People Creation Started For Type Of People As "Owner Not Insured"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New People Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Owner Not Insured", 2));
			testcall1 = true;
			StrPeopleLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("People", "Owner Not Insured", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New People Is Created With People LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New People From Maintenance Screen Is Successfully Created
			//============================================================New People Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For People Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_OperatingAs(driver), "OperatingAs Tab On People Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_ContactInfo(driver), "Contact Info Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_EntityIDType(driver), "EntityIDType Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Supplementals(driver), "Supplementals Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Addresses(driver), "Addresses Tab On People Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+"  To Create New Address From People Screen");
			testcall2 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_People(driver), "People Tab On People Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Address From People Screen");
			testcall3 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created People Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Owner Not Insured", 2));
			testcall4 = true;
			StrPeopleLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("People", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following People Is Successful, Edited People LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			// New People From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created People Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of People From Maintenance Screen With People Type: " + " " + color.RMA_ChangeColor_Utility("Owner Not Insured", 2) + " Is Successfully Verified");

			//==========================================================Delete Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================People Creation Completed For Type Of People As "Owner Not Insured"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

		//================================People Creation Started For Type Of People As "Passenger"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New People Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Passenger", 2));
			testcall1 = true;
			StrPeopleLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("People", "Passenger", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New People Is Created With People LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New People From Maintenance Screen Is Successfully Created
			//============================================================New People Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For People Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_OperatingAs(driver), "OperatingAs Tab On People Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_ContactInfo(driver), "Contact Info Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_EntityIDType(driver), "EntityIDType Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Supplementals(driver), "Supplementals Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Addresses(driver), "Addresses Tab On People Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+"  To Create New Address From People Screen");
			testcall2 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_People(driver), "People Tab On People Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Address From People Screen");
			testcall3 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created People Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Passenger", 2));
			testcall4 = true;
			StrPeopleLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("People", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following People Is Successful, Edited People LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			// New People From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created People Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of People From Maintenance Screen With People Type: " + " " + color.RMA_ChangeColor_Utility("Passenger", 2) + " Is Successfully Verified");

			//==========================================================Delete Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================People Creation Completed For Type Of People As "Passenger"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

		//================================People Creation Started For Type Of People As "Payor"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New People Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Payor", 2));
			testcall1 = true;
			StrPeopleLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("People", "Payor", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New People Is Created With People LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New People From Maintenance Screen Is Successfully Created
			//============================================================New People Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For People Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_OperatingAs(driver), "OperatingAs Tab On People Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_ContactInfo(driver), "Contact Info Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_EntityIDType(driver), "EntityIDType Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Supplementals(driver), "Supplementals Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Addresses(driver), "Addresses Tab On People Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+"  To Create New Address From People Screen");
			testcall2 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_People(driver), "People Tab On People Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Address From People Screen");
			testcall3 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created People Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Payor", 2));
			testcall4 = true;
			StrPeopleLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("People", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following People Is Successful, Edited People LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			// New People From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created People Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of People From Maintenance Screen With People Type: " + " " + color.RMA_ChangeColor_Utility("Payor", 2) + " Is Successfully Verified");

			//==========================================================Delete Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================People Creation Completed For Type Of People As "Payor"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

		//================================People Creation Started For Type Of People As "Plan Sponsor"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New People Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Plan Sponsor", 2));
			testcall1 = true;
			StrPeopleLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("People", "Plan Sponsor", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New People Is Created With People LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New People From Maintenance Screen Is Successfully Created
			//============================================================New People Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For People Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_OperatingAs(driver), "OperatingAs Tab On People Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_ContactInfo(driver), "Contact Info Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_EntityIDType(driver), "EntityIDType Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Supplementals(driver), "Supplementals Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Addresses(driver), "Addresses Tab On People Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+"  To Create New Address From People Screen");
			testcall2 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_People(driver), "People Tab On People Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Address From People Screen");
			testcall3 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created People Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Plan Sponsor", 2));
			testcall4 = true;
			StrPeopleLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("People", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following People Is Successful, Edited People LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			// New People From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created People Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of People From Maintenance Screen With People Type: " + " " + color.RMA_ChangeColor_Utility("Plan Sponsor", 2) + " Is Successfully Verified");

			//==========================================================Delete Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================People Creation Completed For Type Of People As "Plan Sponsor"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

		//================================People Creation Started For Type Of People As "Policy Insured"========================================================================================================================================================================================================================================================================================================================
		//====================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================New People Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Policy Insured", 2));
			testcall1 = true;
			StrPeopleLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("People", "Policy Insured", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New People Is Created With People LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New People From Maintenance Screen Is Successfully Created
			//============================================================New People Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification That All Tabs Are Present For People Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_OperatingAs(driver), "OperatingAs Tab On People Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_ContactInfo(driver), "Contact Info Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_EntityIDType(driver), "EntityIDType Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Supplementals(driver), "Supplementals Tab On People Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_Addresses(driver), "Addresses Tab On People Creation Page",logval);
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================

			//===========================================================New Address Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressAddition", "RMA_Entity_AddressAddition_Utility",0)+"  To Create New Address From People Screen");
			testcall2 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressAddition_Utility(CurrentFrameID,"People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Created With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Created
			//============================================================New Address Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Address Verification Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_People.RMAApp_People_Tab_People(driver), "People Tab On People Creation Page",logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddressVerification", "RMA_Entity_AddressVerification_Utility",0)+" To Verify New Address From People Screen");
			testcall3 = true;
			StrPeopleAddressType=RMA_Maintenance_Functionality_Utility.RMA_Entity_AddressVerification_Utility("People","HADDR", StrAddress1,StrAddress2,StrAddress3,StrAddress4,StrCity,StrCounty,"Alberta",IntZipCode, "Austria",logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Address Is Verified With Address Type:"+ " " + color.RMA_ChangeColor_Utility(StrPeopleAddressType, 2));
			// New Address From Entiy -> Addresses Tab Is Successfully Verified
			//============================================================New Address Verification Is Completed Here================================================================================================================================================================================================================================================================

			//==========================================================Edit Of Created People Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created People From Maintenance Screen of Type: " + " " + color.RMA_ChangeColor_Utility("Policy Insured", 2));
			testcall4 = true;
			StrPeopleLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("People", "NA" ,CurrentFrameID,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following People Is Successful, Edited People LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrPeopleLastName, 2));
			// New People From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			//==========================================================Delete Of Created People Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("People Creation Page", true, logval);
			parentlogger.log(LogStatus.INFO, "Create ,Edit ,Delete Of People From Maintenance Screen With People Type: " + " " + color.RMA_ChangeColor_Utility("Policy Insured", 2) + " Is Successfully Verified");

			//==========================================================Delete Of Created People Is Completed Here==========================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		//================================People Creation Completed For Type Of People As "Policy Insured"========================================================================================================================================================================================================================================================================================================================
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

