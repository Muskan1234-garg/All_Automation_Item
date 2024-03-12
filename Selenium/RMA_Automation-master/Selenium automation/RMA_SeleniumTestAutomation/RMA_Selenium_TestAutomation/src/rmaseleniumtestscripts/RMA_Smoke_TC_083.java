package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Utilities_ToolsAndDesigners;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_083
//Description    : Successfully Verify Creation, Edition and Deletion Of A Search Query Using Query Designer Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-12-23-2016
//=================================================================================================

public class RMA_Smoke_TC_083 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_083_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_083_Create, Edit and Delete A Search Query Using Query Designer", "Successfully Verify Creation, Edition and Deletion Of A Search Query Using Query Designer Is Validated");
			parentlogger.assignAuthor("Renu Verma");			

			String Txt_SearchName;
			String Txt_SearchDesc;
			String Lst_SearchType;
			String Lst_SearchCatStep2;
			String Lst_FieldAvailable1Step2;
			String Lst_FieldAvailable2Step2;
			String Lst_FieldAvailable3Step2;
			String Lst_FieldAvailable4Step2;
			String Lst_SearchCatStep3;
			String Lst_FieldAvailable1Step3;
			String Lst_FieldAvailable2Step3;
			String Lst_FieldAvailable3Step3;
			String Txt_EditedSearchName;
			String PrimaryWindowHandle;
				
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_083";
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			Txt_SearchDesc= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 0); // Search Description Value Is Fetched From DataSheet RMA_TC_083
			Lst_SearchType= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 1); // Search TypeValue Is Fetched From DataSheet RMA_TC_083
			Lst_SearchCatStep2=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 2); // Search Category Value In Step Heading 2 Is Fetched From DataSheet RMA_TC_083
			Lst_FieldAvailable1Step2=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 3); // First Field Available Value In Step Heading 2 Is Fetched From DataSheet RMA_TC_083
			Lst_FieldAvailable2Step2=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 4); // Second Field Available Value In Step Heading 2 Is Fetched From DataSheet RMA_TC_083
			Lst_FieldAvailable3Step2=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 5); // Third Field Available Value In Step Heading 2 Is Fetched From DataSheet RMA_TC_083
			Lst_FieldAvailable4Step2=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 6); // Forth Field Available Value In Step Heading 2 Is Fetched From DataSheet RMA_TC_083
			Lst_SearchCatStep3=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 7); // Search Category Value In Step Heading 3 Is Fetched From DataSheet RMA_TC_083
			Lst_FieldAvailable1Step3=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 8); // First Field Available Value In Step Heading 3 Is Fetched From DataSheet RMA_TC_083
			Lst_FieldAvailable2Step3=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 9); // Second Field Available Value In Step Heading 3 Is Fetched From DataSheet RMA_TC_083
			Lst_FieldAvailable3Step3=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 10); // Second Field Available Value In Step Heading 3 Is Fetched From DataSheet RMA_TC_083
			Txt_SearchName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "TC83_ClaimSearchQuery _");
			Txt_EditedSearchName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "TC83_EditedClaimSearchQuery_");
					
			//===========================================================Creation Of Query Designer Is Started Here===========================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-ToolsandDesigners-QueryDesigner", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Query Designer");			
			PrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Create New Search View"), "Create New Search View Button On Query Designer Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lbl_StepHeading(driver).getText(), "Search Query Wizard - Step 1 of 4 (Basic Information)", "Step heading On Search Query Wizard", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Txt_SearchName(driver), "'What do you want to call your search?' TextBox on Search Query Wizard Page", Txt_SearchName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Txt_SearchDesc(driver), "'What is the description of your search? (Optional)' TextBox on Search Query Wizard Page", Txt_SearchDesc, logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_SearchType(driver), Lst_SearchType, "What type of search do you want to create? Weblist", "Search Query Wizard Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next"), "Next Button On Search Query Wizard Page", logval);
			//globalWait.until(ExpectedConditions.stalenessOf(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lbl_StepHeading(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 2 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lbl_StepHeading(driver).getText(), "Search Query Wizard - Step 2 of 4 (Query Field Selection)", "Step heading On Search Query Wizard", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_SearchCats(driver), Lst_SearchCatStep2, "Select a Category Weblist", "Search Query Wizard Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsAvailable(driver), Lst_FieldAvailable1Step2, "Fields Available for Search Weblist", "Search Query Wizard Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsAvailable(driver), Lst_FieldAvailable2Step2, "Fields Available for Search Weblist", "Search Query Wizard Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsAvailable(driver), Lst_FieldAvailable3Step2, "Fields Available for Search Weblist", "Search Query Wizard Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, " >> "), " >> Button On Search Query Wizard Page", logval);
			//globalWait.until(ExpectedConditions.stalenessOf(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsInSearch(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Value Is Available In Serach In Field");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsAvailable(driver), Lst_FieldAvailable4Step2, "Fields Available for Search Weblist", "Search Query Wizard Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, " >> "), " >> Button On Search Query Wizard Page", logval);
			//globalWait.until(ExpectedConditions.stalenessOf(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsInSearch(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Value Is Available In Serach In Field");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next"), " Next Button On Search Query Wizard Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 3 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lbl_StepHeading(driver).getText(), "Search Query Wizard - Step 3 of 4 (Display Field Selection)", "Step heading On Search Query Wizard", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_SearchCats(driver), Lst_SearchCatStep3, "Select a Category Weblist", "Search Query Wizard Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsAvailable(driver), Lst_FieldAvailable1Step3, "Fields Available for Search Weblist", "Search Query Wizard Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsAvailable(driver), Lst_FieldAvailable2Step3, "Fields Available for Search Weblist", "Search Query Wizard Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsAvailable(driver), Lst_FieldAvailable3Step3, "Fields Available for Search Weblist", "Search Query Wizard Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, " >> "), " >> Button On Search Query Wizard Page", logval);
			//globalWait.until(ExpectedConditions.stalenessOf(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsInSearch(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Value Is Available In Serach In Field");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next"), " Next Button On Search Query Wizard Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 4 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lbl_StepHeading(driver).getText(), "Search Query Wizard - Step 4 of 4 (Query Use Permissions)", "Step heading On Search Query Wizard", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Finish"), " Finish Button On Search Query Wizard Page", logval);	
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Query Designer");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,  Txt_SearchName),Txt_SearchName + " Link under Query Designer - Search Views Tables On Query Designer Page", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), " Close Image On Query Designer Page", logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Verification_Utility.RMA_VerifySingle_MultipleWebListData(RMA_POM_Search.RMAApp_Search_Lst_SearchQueryViewList(driver), Txt_SearchName, "Search Query View WebList On Claim Criteria Search Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_POM_Search.RMAApp_Search_Lst_SearchQueryViewList(driver), Txt_SearchName, "Search Query View WebList", "Claim Criteria Search Page", logval);	
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_POM_Search.RMAApp_GenericSearch_Lbl_LabelsOnSearchScreen(driver, Lst_FieldAvailable1Step2), Lst_FieldAvailable1Step2 +" On Claim Criteria Search Page" , logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_POM_Search.RMAApp_GenericSearch_Lbl_LabelsOnSearchScreen(driver, Lst_FieldAvailable2Step2), Lst_FieldAvailable2Step2 +" On Claim Criteria Search Page" , logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_POM_Search.RMAApp_GenericSearch_Lbl_LabelsOnSearchScreen(driver, Lst_FieldAvailable3Step2), Lst_FieldAvailable3Step2 +" On Claim Criteria Search Page" , logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_POM_Search.RMAApp_GenericSearch_Lbl_LabelsOnSearchScreen(driver, Lst_FieldAvailable4Step2), Lst_FieldAvailable4Step2 +" On Claim Criteria Search Page" , logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), " Close Image On Query Designer Page", logval);
		//===========================================================Creation Of Query Designer Is Ended Here===========================================================
			
			//===========================================================Edition Of Query Designer Is Started Here===========================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-ToolsandDesigners-QueryDesigner", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Query Designer");			
			PrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, Txt_SearchName), Txt_SearchName+"Link On Query Designer Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lbl_StepHeading(driver).getText(), "Search Query Wizard - Step 1 of 4 (Basic Information)", "Step heading On Search Query Wizard", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Txt_SearchName(driver), "'What do you want to call your search?' TextBox on Search Query Wizard Page", Txt_EditedSearchName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Txt_SearchDesc(driver), "'What is the description of your search? (Optional)' TextBox on Search Query Wizard Page", "Edited "+ Txt_SearchDesc, logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_SearchType(driver), Lst_SearchType, "What type of search do you want to create? Weblist", "Search Query Wizard Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next"), "Next Button On Search Query Wizard Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 2 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lbl_StepHeading(driver).getText(), "Search Query Wizard - Step 2 of 4 (Query Field Selection)", "Step heading On Search Query Wizard", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsInSearch(driver), Lst_FieldAvailable1Step2, "Fields Available for Search Weblist", "Search Query Wizard Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, " << "), " << Button On Search Query Wizard Page", logval);
			//globalWait.until(ExpectedConditions.stalenessOf(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsInSearch(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Value Is Available In Serach In Field");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next"), " Next Button On Search Query Wizard Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 3 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lbl_StepHeading(driver).getText(), "Search Query Wizard - Step 3 of 4 (Display Field Selection)", "Step heading On Search Query Wizard", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsInSearch(driver), Lst_FieldAvailable1Step3, "Fields Available for Search Weblist", "Search Query Wizard Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, " << "), " << Button On Search Query Wizard Page", logval);
			//globalWait.until(ExpectedConditions.stalenessOf(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lst_FieldsInSearch(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Value Is Available In Serach In Field");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next"), " Next Button On Search Query Wizard Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Step 4 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Lbl_StepHeading(driver).getText(), "Search Query Wizard - Step 4 of 4 (Query Use Permissions)", "Step heading On Search Query Wizard", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Finish"), " Finish Button On Search Query Wizard Page", logval);	
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Partially", "Grid Preferences related to the search will be lost for all the users.", "Query Designer Page",logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Query Designer");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,  Txt_EditedSearchName),Txt_EditedSearchName + " Link under Query Designer - Search Views Tables On Query Designer Page", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), " Close Image On Query Designer Page", logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Verification_Utility.RMA_VerifySingle_MultipleWebListData(RMA_POM_Search.RMAApp_Search_Lst_SearchQueryViewList(driver), Txt_EditedSearchName, "Search Query View WebList On Claim Criteria Search Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_POM_Search.RMAApp_Search_Lst_SearchQueryViewList(driver), Txt_EditedSearchName, "Search Query View WebList", "Claim Criteria Search Page", logval);	
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_POM_Search.RMAApp_GenericSearch_Lbl_LabelsOnSearchScreen(driver, Lst_FieldAvailable2Step2), Lst_FieldAvailable2Step2 +" On Claim Criteria Search Page" , logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_POM_Search.RMAApp_GenericSearch_Lbl_LabelsOnSearchScreen(driver, Lst_FieldAvailable3Step2), Lst_FieldAvailable3Step2 +" On Claim Criteria Search Page" , logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_POM_Search.RMAApp_GenericSearch_Lbl_LabelsOnSearchScreen(driver, Lst_FieldAvailable4Step2), Lst_FieldAvailable4Step2 +" On Claim Criteria Search Page" , logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), " Close Image On Query Designer Page", logval);
			//===========================================================Edition Of Query Designer Is Ended Here===========================================================
	
			//===========================================================Deletion Of Query Designer Is Started Here===========================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-ToolsandDesigners-QueryDesigner", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Query Designer");			
			PrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDQueryDes_Chk_QueryDesignerSearch(driver, Txt_EditedSearchName), "check", "Query Designer - Search Views Checkbox", "Query Designer Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Delete Search Views"), "Delete Search Views Button On Query Designer Page", logval);
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Partially", "Pressing 'OK' will completely remove the selected search views.", "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility("Query Designer Page", 4), logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), " Close Image On Query Designer Page", logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_NegativeVerification_Utility.RMA_NegVerifyMultipleDataInWebList(RMA_POM_Search.RMAApp_Search_Lst_SearchQueryViewList(driver), Txt_EditedSearchName, "Search Query View WebList On Claim Criteria Search Page", logval);
			//===========================================================Deletion Of Query Designer Is Ended Here===========================================================
						
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
			throw (e);
		}

	}		

	@AfterMethod
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

