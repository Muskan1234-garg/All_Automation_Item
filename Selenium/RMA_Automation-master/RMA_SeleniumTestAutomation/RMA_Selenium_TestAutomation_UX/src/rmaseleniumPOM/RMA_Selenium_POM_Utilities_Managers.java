package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Utilities_Managers {
	public static WebElement Element = null;


	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Rdb_FilterFinancial
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of FilterFinancial Radio Button On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-02-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Rdb_FilterFinancial(WebDriver driver,String FinancialType)
	{
		Element = driver.findElement(By.id("rdFilter"+FinancialType.replaceAll(" ",""))); //Unique Id Of FilterFinancial Radio Button On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Rdb_FilterFinancial
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of FilterFinancial Radio Button On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-02-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Tbl_FinancialKeyGrid(WebDriver driver)
	{
		Element = driver.findElement(By.id("FinancialKeyGrid_gvData_ctl00")); //Unique Id Of FilterFinancial Radio Button On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Img_New
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of New Image On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Img_New(WebDriver driver)
	{
		Element = driver.findElement(By.id("FinancialKeyGrid_New")); //Unique Id Of New Image On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Lst_SelLOB
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Select Line Of Business List On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Lst_SelLOB(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmbLOB")); //Unique Id Of Select Line Of Business List On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Lst_SelPolicyLOB
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Select Policy LOB List On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Lst_SelPolicyLOB(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmbPolicyLOB")); //Unique Id Of Select Policy LOB List On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Lst_SelClaimType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Select Policy LOB List On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-21-2019                                  
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Lst_SelClaimType(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmbClaimType")); //Unique Id Of Select Policy LOB List On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Chk_Claimant
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Claimant Checkbox On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Chk_Claimant(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseClaimant")); //Unique Id Of Claimant Checkbox On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Chk_ReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Reserve Type Checkbox On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Chk_ReserveType(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseRsvType")); //Unique Id Of Reserve Type Checkbox On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Chk_ResSubType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Reserve-Sub Type Checkbox On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Chk_ResSubType(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseRsvSubType")); //Unique Id Of Reserve-Sub TypeCheckbox On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Chk_PolicyUnitCoverage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Policy/Unit/Coverage Checkbox On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Chk_PolicyUnitCoverage(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseCoverage")); //Unique Id Of Policy/Unit/Coverage Checkbox On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Chk_LossDisablityType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Loss/Disablity Type Checkbox On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Chk_LossDisablityType(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseLossType")); //Unique Id Of Loss/Disablity Type Checkbox On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Btn_Generic
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Button Name On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver,	ButtonName: Add code/Edite Code/Print... etc	 
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_Managers_Btn_Generic(WebDriver driver,String ButtonName)
	{
		Element = driver.findElement(By.xpath(".//*[@name='"+ButtonName+"']")); //Unique xpath of Button Name On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ManagersCodeRel_Lst_RelationshipType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Relationship Type List On RMA Application Utilities--> Managers--> Code Relationships Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver,	ButtonName: Add code/Edite Code/Print... etc	 
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersCodeRel_Lst_RelationshipType(WebDriver driver)
	{
		Element = driver.findElement(By.id("cboRelationshipType")); //Unique id of Relationship Type List On RMA Application Utilities--> Managers--> Code Relationships Setup Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ManagersCodeRel_Lst_RelationshipType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Relationship Sub Type List On RMA Application Utilities--> Managers--> Code Relationships Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersCodeRel_Lst_RelationshipSubType(WebDriver driver)
	{
		Element = driver.findElement(By.id("cboRelationshipSubType")); //Unique id of Relationship Sub Type List On RMA Application Utilities--> Managers--> Code Relationships Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ManagersCodeRel_Lst_ClaimType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Claim Type List On RMA Application Utilities--> Managers--> Code Relationships Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersCodeRel_Lst_ClaimType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstClaimType")); //Unique id of Claim Type List On RMA Application Utilities--> Managers--> Code Relationships Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ManagersCodeRel_Lst_Related
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Related List On RMA Application Utilities--> Managers--> Code Relationships Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersCodeRel_Lst_Related(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstRelatedLossComponents")); //Unique id of Related List On RMA Application Utilities--> Managers--> Code Relationships Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			:RMAApp_ManagersCodeRel_Lst_Available
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Available List On RMA Application Utilities--> Managers--> Code Relationships Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersCodeRel_Lst_Available(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstAvailableLossComponents")); //Unique id of Available List On RMA Application Utilities--> Managers--> Code Relationships Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			:RMAApp_ManagersLossCode_Lst_PolicySystemNames
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Policy System Names List On RMA Application Utilities--> Managers-->  Loss Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersLossCode_Lst_PolicySystemNames(WebDriver driver)
	{
		Element = driver.findElement(By.id("listPolicySystem")); //Unique id of Policy System Names List On RMA Application Utilities--> Managers-->  Loss Code Mapping Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			:RMAApp_ManagersLossCode_Lst_PolicyLOB
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Policy LOB List On RMA Application Utilities--> Managers-->  Loss Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersLossCode_Lst_PolicyLOB(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstPolicyClaimLOB")); //Unique id of Policy LOB List On RMA Application Utilities--> Managers-->  Loss Code Mapping Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			:RMAApp_ManagersLossCode_Lst_CoverageType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Coverage Type List On RMA Application Utilities--> Managers-->  Loss Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersLossCode_Lst_CoverageType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstCoverageType")); //Unique id of Coverage Type List On RMA Application Utilities--> Managers-->  Loss Code Mapping Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			:RMAApp_ManagersLossCode_Lst_PolSystemLossCodes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Policy System Loss Codes List On RMA Application Utilities--> Managers-->  Loss Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersLossCode_Lst_PolSystemLossCodes(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstPolicySystemLosscode")); //Unique id of Policy System Loss Codes List On RMA Application Utilities--> Managers-->  Loss Code Mapping Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			:RMAApp_ManagersLossCode_Lst_RMALossCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of RMA Loss Of Code List On RMA Application Utilities--> Managers-->  Loss Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersLossCode_Lst_RMALossCode(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstLossOfCode")); //Unique id of RMA Loss Of Code List On RMA Application Utilities--> Managers-->  Loss Code Mapping Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			:RMAApp_ManagersLossCode_Tbl_LossCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of RMA Loss Of Code Table  On RMA Application Utilities--> Managers-->  Loss Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-01-04-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersLossCode_Tbl_LossCode(WebDriver driver)
	{
		Element = driver.findElement(By.id("GridPolicyCodemapping_ctl00")); //Unique id of Loss Of Code Table On RMA Application Utilities--> Managers-->  Loss Code Mapping Page Is Fetched
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Img_Delete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Delete Image On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-10-2017                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Img_Delete(WebDriver driver)
	{
		Element = driver.findElement(By.id("FinancialKeyGrid_Delete")); //Unique Id Of Delete Image On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Btn_FinancialKeyRadioButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Radio Button On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	, ClaimType Variable Of The Type String	 
	//Revision				: 0.0 - NikitaThani-05-09-2019                                   
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Btn_FinancialKeyRadioButton(WebDriver driver,String ClaimType)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+ClaimType+"')]/ancestor::tr[1]/td/*[@type='radio']")); //Unique Id Of Radio Button On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ManagersFinanKey_Img_Edit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Edit Image On RMA Application Utilities--> Managers--> Financial Key Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-09-2019                                    
	//============================================================================================
	public static WebElement RMAApp_ManagersFinanKey_Img_Edit(WebDriver driver)
	{
		Element = driver.findElement(By.id("FinancialKeyGrid_Edit")); //Unique Id Of Edit Image On RMA Application Utilities--> Managers--> Financial Key Setup Page Is Fetched
		return Element;	
	}
}
