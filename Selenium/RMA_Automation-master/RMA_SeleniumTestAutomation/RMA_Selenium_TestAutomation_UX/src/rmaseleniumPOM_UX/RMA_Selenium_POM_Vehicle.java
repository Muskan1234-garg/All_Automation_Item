package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Vehicle {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_VehicleID
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which VehicleID TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_VehicleID(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Vehicle ID')]//following-sibling::input")); //Unique Id Of VehicleID TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_VehicleModel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which VehicleModel TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_VehicleModel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("vehiclemodel")); //Unique Id Of Vehicle Model TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Vehicle_Lnk_ClaimRightHandTree
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vehicle Inspection Information Link On RMA Application Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-02-2017                                
	//============================================================================================
	public static WebElement RMAApp_Vehicle_Lnk_ClaimRightHandTree(WebDriver driver, String VehText)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+VehText+"')and @class='rightPanel-alink ng-binding']")); //Unique X-path Of Vehicle Inspection Information Link On RMA Application Vehicle Page Is Fetched
		}catch(Exception|Error e){
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_PurchaseDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which PurchaseDate TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_PurchaseDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='purchasedate' and @type= 'text']")); //Unique Id Of  PurchaseDate TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_RenewalDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Renewal Date TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_RenewalDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='licensernwldate' and @type= 'text']")); //Unique Id Of Renewal Date TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_LeaseExpirationDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LeaseExpirationDate TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_LeaseExpirationDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='leaseexpiredate' and @type= 'text']")); //Unique Id Of LeaseExpirationDate TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_OriginalCost
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which OriginalCost TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_OriginalCost(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='originalcost' and @type= 'text']")); //Unique Id Of OriginalCost TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_LastServiceDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastServiceDate TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_LastServiceDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lastservicedate' and @type= 'text']")); //Unique Id Of LastServiceDate TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_DisposalDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which DisposalDate TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_DisposalDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='disposaldate' and @type= 'text']")); //Unique Id Of DisposalDate TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_LeaseAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LeaseAmount TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_LeaseAmount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='leaseamount' and @type= 'text']")); //Unique Id Of LeaseAmount TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_VehicleYear
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which VehicleYear TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_VehicleYear(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("vehicleyear")); //Unique Id Of VehicleYear TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_LeaseTerm
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LeaseTerm TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_LeaseTerm(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("leaseterm")); //Unique Id Of LeaseTerm TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Chk_LeaseFlag
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LeaseFlag CheckBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Chk_LeaseFlag(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("leaseflag")); //Unique Id Of LeaseFlag CheckBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_staterowid")); //Unique Id Of State TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_VehicleMake
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vehicle Make Text Box On RMA Application Employee Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-10-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Vehicle_Txt_VehicleMake(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("vehiclemake")); //Unique Id  Of Vehicle Make Text Box On RMA Application Employee Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_Weight
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Weight TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_Weight(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("grossweight")); //Unique Id Of Weight TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_UnitType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which UnitType TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_UnitType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_unittypecode")); //Unique Id Of UnitType TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_LeaseNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LeaseNumber TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_LeaseNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("leasenumber")); //Unique Id Of LeaseNumber TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_LicenseNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LicenseNumber TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_LicenseNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("licensenumber")); //Unique Id Of LeaseTerm TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Tab_VehicleDetail
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Vehicle Detail Tab On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Tab_VehicleDetail(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Vehicle Detail')]/i")); //Unique X-path Of Vehicle Detail Tab On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Tab_VehicleInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which VehicleInfo Tab On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Tab_VehicleInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Vehicle Info')]/i")); //Unique X-path Of VehicleInfo Tab On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Btn_VehicleLookUp
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which VehicleLookUp Image Button On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-14-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Btn_GenericVehicleLookUp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Lookup']/i")); //Unique X-path Of VehicleLookUp Image Button On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_VehicleInsp_Txt_InspectionDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which InspectionDate TextBox On Vehicle-->Inspections Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_VehicleInsp_Txt_InspectionDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='inspectiondate' and @type= 'text']")); //Unique Id Of InspectionDate TextBox On Vehicle-->Inspections Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_VehicleInsp_Btn_InspectionResult
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which InspectionResult ImageButton On Vehicle-->Inspections Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_VehicleInsp_Btn_InspectionResult(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='inspectionresult']//*[@class='input-group-btn']/button/i")); //Unique Id Of InspectionResult ImageButton On Vehicle-->Inspections Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_VehicleInspecResult_Btn_OK
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which OK ImageButton On Vehicle-->Inspections-->InspectionResults Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_VehicleInspecResult_Btn_OK(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Ok' and @name='iconOk']/i")); //Unique Id Of OK ImageButton On Vehicle-->Inspections-->InspectionResults Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_VehicleInspecResult_Txt_Content
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Content TextBox On Vehicle-->Inspections-->InspectionResults Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_VehicleInspecResult_Txt_Content(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='newTextComments']")); //Unique Id Of Content TextBox On Vehicle-->Inspections-->InspectionResults Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_VehicleInspec_Tab_InspectionData
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supplementals Tab On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_VehicleInspec_Tab_InspectionData(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Inspection Data')]/i")); //Unique X-path Of Supplementals Tab On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_VehicleInspec_Txt_LookUpFilterInspectionDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which InspectionDate Filter TextBox On VehicleInspection-->LookUpWindow Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_VehicleInspec_Txt_LookUpFilterInspectionDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[contains(text(),'Inspection Date')]//ancestor::div[2]//div[2]//*[@class = 'ng-scope']//input")); //Unique Id Of InspectionDate Filter TextBox On VehicleInspection-->LookUpWindow Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Txt_LookUpFilterVehicleID
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which VehicleID Filter TextBox On Vehicle-->LookUpWindow Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Txt_LookUpFilterVehicleID(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[contains(text(),'Vehicle Id')]//ancestor::div[2]/div[2]//*[@class = 'ng-scope']//input")); //Unique Id Of VehicleID Filter TextBox On Vehicle-->LookUpWindow Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supplementals Tab On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Tab_Supplementals(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i")); //Unique X-path Of Supplementals Tab On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_VehicleInspections_btn_Print
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Button On Vehicle Inspections Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-07-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_VehicleInspections_btn_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='complete' and @uib-tooltip='Print']/i")); //Unique Id Of Print Button On Vehicle Inspections Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_VehicleInspections_btn_Preview
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Preview Button On Vehicle Inspections Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-08-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_VehicleInspections_btn_Preview(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='complete' and @uib-tooltip='Preview']/i")); //Unique Id Of Preview Button On Vehicle Inspections Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_btn_LeaseCompany
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Lease Company Button On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-08-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_btn_LeaseCompany(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_leasingcoeid']")); //Unique Id Of Lease Company Button On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_txt_LeaseCompany
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Lease Company TextBox On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-08-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_txt_LeaseCompany(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_leasingcoeid']")); //Unique Id Of Lease Company TextBox On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_RecordSummary_btn_Print
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Record Summary Print Button On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-08-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_RecordSummary_btn_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnPrint']/i ")); //Unique Id Of Record Summary Button On Vehicle Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_RecordSummary_btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Record Summary Cancel Button On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision			: 0.0 - NikitaThani-02-08-2018    
	//Revision			: 1.0 - MishalKantawala-08-31-2021  
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_RecordSummary_btn_Cancel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnclose' and @ng-click='cancel()']")); //Unique Id Of Record Summary Cancel Button On Vehicle Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Vehicle_Accidents_Lnk_VehicleRightHandTree
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vehicle Accidents Information Link On RMA Application Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-16-2018                                
	//============================================================================================
	public static WebElement RMAApp_Vehicle_Accidents_Lnk_VehicleRightHandTree(WebDriver driver, String VehAcdText)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+VehAcdText+"']")); //Unique X-path Of Vehicle Accidents Information Link On RMA Application Vehicle Page Is Fetched
		}catch(Exception|Error e){
		}
		return Element;
	}
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Img_HelpMessage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Help Message Image On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Img_HelpMessage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='A2']/i")); //Unique Id Of Help Message Image On Vehicle Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Vehicle_Delete_SMS_Lnk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vehicle Delete Link On RMA Application Vehicle SMS Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - JannathHussain-03-09-2018                                
	//============================================================================================

	public static WebElement RMAApp_Vehicle_SMS_Delete(WebDriver driver,String Delete)
	{
		{
			Element = null;
			Element = driver.findElement(By.linkText(Delete)); //Unique Id Of Delete Link On SMS For Vehicle Maintenance Page Is Fetched
			return Element;
		}
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Vehicle_Create_New_SMS_Lnk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vehicle Create_New Link On RMA Application Vehicle SMS Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - JannathHussain-03-09-2018                                
	//============================================================================================

	public static WebElement RMAApp_Vehicle_SMS_Create(WebDriver driver,String Create)
	{
		{
			Element = null;
			Element = driver.findElement(By.linkText(Create)); //Unique Id Of Create New Link On SMS For Vehicle Maintenance Page Is Fetched
			return Element;
		}
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Vehicle_Supplemental_Fields_SMS_Lnk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vehicle Supplemental Fields Link On RMA Application Vehicle SMS Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - JannathHussain-03-09-2018                               
	//============================================================================================

	public static WebElement RMAApp_Vehicle_SMS_Supplementals(WebDriver driver,String Supplementals)
	{
		{
			Element = null;
			Element = driver.findElement(By.linkText(Supplementals)); //Unique Id Of Supplemental Fields Link On SMS For Vehicle Maintenance Page Is Fetched
			return Element;
		}
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Vehicle_Attachmentsss_SMS_Lnk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )On The Basis Of Which Vehicle Attachments Link On RMA Application Vehicle SMS Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - JannathHussain-03-09-2018                                
	//============================================================================================

	public static WebElement RMAApp_Vehicle_SMS_Attachments(WebDriver driver,String Attachments)
	{
		{
			Element = null;
			Element = driver.findElement(By.linkText(Attachments)); //Unique Id Of Attachments Link On SMS For Vehicle Maintenance Page Is Fetched
			return Element;
		}
	}

	//============================================================================================
	//FunctionName 			: RMAApp_VehicleAccident_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image For Vehicle Accident Page On RMA Application Can Be Identified 	\
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-16-2018                                
	//============================================================================================

	public static WebElement RMAApp_VehicleAccident_Img_Save(WebDriver driver)
	{
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[@id='Save']")); //Unique Id Of Save Image For Vehicle Accident Page Is Fetched
			return Element;
		}
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Vehicle_Lookup_Txt_VehicleId
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which VehicleID TextBox On Vehicle Lookup Page On RMA Application Can Be Identified 	
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-03-15-2018                                
	//============================================================================================

	public static WebElement RMAApp_Vehicle_Lookup_Txt_VehicleId(WebDriver driver)
	{
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[@class='ui-grid-filter-container ng-scope']/div[@class='ng-scope']/input")); //Unique Id Of VehicleID TextBox On Vehicle Lookup Page Is Fetched
			return Element;
		}
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Vehicle_View_SMS_Lnk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )On The Basis Of Which Vehicle View Link On RMA Application Vehicle SMS Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - JannathHussain-03-09-2018                                
	//============================================================================================

	public static WebElement RMAApp_Vehicle_SMS_View(WebDriver driver,String Attachments)
	{
		{
			Element = null;
			Element = driver.findElement(By.linkText(Attachments)); //Unique Id Of View Link On SMS For Vehicle Maintenance Page Is Fetched
			return Element;
		}
	} 

	//=================================================================================================================================================================================================
	//FunctionName           : RMAApp_MaintVehicle_Btn_LookupLastPage
	//Description            : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Page Button On Lookup Page On Maintenance -->Vehicle Page Can Be Identified
	//Input Parameter        : Driver Variable Of The Type WebDriver                
	//Revision               : 0.0 - NikitaThani-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintVehicle_Btn_LookupLastPage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-pager-last']")); //Unique Id Of Last Page Button On Lookup Page On Maintenance -->Vehicle Page Is Fetched
		return Element;
	}
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Property_Img_HelpMessage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Help Message Image On Property Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-03-16-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Property_Img_HelpMessage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='A2']")); //Unique Id Of Help Message Image On Property Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Vehicle_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Lookup Button On Vehicle Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-12-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Vehicle_Btn_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_staterowid_openlookup")); //Unique Id Of State Lookup Button On Vehicle Page Is Fetched
		return Element;
	}

}
