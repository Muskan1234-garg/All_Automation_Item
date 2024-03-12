package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Utilities_PolicySystemSetup {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Btn_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Button On RMA Application Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolSysSetup_Btn_AddNew(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("PolicySystemGrid_New")); //Unique Id  Of Add New Button On RMA Application Policy System Setup Page Is Fetched
		} catch (Exception e) {
			System.out.println("Element Not Found");
		}
		return Element;
		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Txt_PolicySystemType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy System Type TextBox On Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolSysSetup_Txt_PolicySystemType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("PolicySystemType_codelookup")); //Unique Id  Of  Which Policy System Type TextBox On Policy System Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Txt_PolicySysName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Policy System Name TextBox On Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolSysSetup_Txt_PolicySysName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("PolicySysName")); //Unique Id  Of  Policy System Name TextBox On Policy System Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Txt_MappingTablePrefix
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Mapping Table Prefix TextBox On Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolSysSetup_Txt_MappingTablePrefix(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("MappingTablePrefix")); //Unique Id  Of  Mapping Table Prefix TextBox On Policy System Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Txt_CFWURL
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  forgot password link value in Hex Format TextBox On Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	//============================================================================================
	public static WebElement RMAApp_PolSysSetup_Txt_CFWURL(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("URLParam")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Txt_WSSearchURL
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  forgot password link value in Hex Format TextBox On Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	//============================================================================================
	public static WebElement RMAApp_PolSysSetup_Txt_WSSearchURL(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("WSSearchURL")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Txt_WSInquiryURL
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  forgot password link value in Hex Format TextBox On Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	//============================================================================================
	public static WebElement RMAApp_PolSysSetup_Txt_WSInquiryURL(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("WSInquiryURL")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Chk_UseRMAForCFW
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On Use RMA User for CFW CheckBox On Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	//============================================================================================
	public static WebElement RMAApp_PolSysSetup_Chk_UseRMAForCFW(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cbUseRMAForCFW")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: WebElement RMAApp_PolSysSetup_Txt_CFWUserName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CFW User Name TextBox On Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	//============================================================================================
	public static WebElement RMAApp_PolSysSetup_Txt_CFWUserName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtCFWUserNm")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Txt_CFWUserPassword
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CFW User Password TextBox On Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	//============================================================================================
	public static WebElement RMAApp_PolSysSetup_Txt_CFWUserPassword(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtCFWUserPassword")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Lst_Version
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Version WebList On Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	//============================================================================================
	public static WebElement RMAApp_PolSysSetup_Lst_Version(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Version")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ok Button On Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	//============================================================================================
	public static WebElement RMAApp_PolSysSetup_Btn_Ok(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnOk")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Btn_AddDataDSN
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add Data DSN Button On RMA Application Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolSysSetup_Btn_AddDataDSN(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[(@id='btnAddDataDSN') or (@id='btnStagingConn')]")); //Unique Id  Of Add Data DSN Button On RMA Application Policy System Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Btn_AddDataDSN
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add Data DSN Button On RMA Application Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolAddNewDS_Rdb_DBDriver(WebDriver driver, String TypeOfDBServer)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[text()='"+TypeOfDBServer+"']/preceding::input[1]")); //Unique Id  Of Add Data DSN Button On RMA Application Policy System Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolAddNewDS_Img_Next
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add Data DSN Button On RMA Application Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolAddNewDS_Img_Next(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'NextButton')]")); //Unique Id  Of Add Data DSN Button On RMA Application Policy System Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolAddNewDS_Txt_ServerName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add Data DSN Button On RMA Application Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolAddNewDS_Txt_ServerName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DataSourceWizard_txtDataDSNServerNm")); //Unique Id  Of Add Data DSN Button On RMA Application Policy System Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolAddNewDS_Txt_DatabaseName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add Data DSN Button On RMA Application Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolAddNewDS_Txt_DatabaseName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DataSourceWizard_txtDataDSN")); //Unique Id  Of Add Data DSN Button On RMA Application Policy System Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolAddNewDS_Txt_LoginUserName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add Data DSN Button On RMA Application Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolAddNewDS_Txt_LoginUserName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DataSourceWizard_txtDataDSNUser")); //Unique Id  Of Add Data DSN Button On RMA Application Policy System Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolAddNewDS_Txt_LoginPassword
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add Data DSN Button On RMA Application Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolAddNewDS_Txt_LoginPassword(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DataSourceWizard_txtDataDSNPwd")); //Unique Id  Of Add Data DSN Button On RMA Application Policy System Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolAddNewDS_Img_Finish
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Add Data DSN Button On RMA Application Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolAddNewDS_Img_Finish(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DataSourceWizard_FinishNavigationTemplateContainerID_FinishButton")); //Unique Id  Of Add Data DSN Button On RMA Application Policy System Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolAddNewDS_Img_Finish
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Policy System Setup Table On RMA Application Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-15-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolAddNewDS_Tbl_PolicySetupTable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("PolicySystemGrid_gvData_ctl00")); //Unique Id  Of Policy System Setup On RMA Application Policy System Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Chk_CopyDataDSN
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Copy Data DSN CheckBox On RMA Application Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-04-02-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolSysSetup_Chk_CopyDataDSN(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cbCopyDataDSN")); //Unique Id  Of Copy Data DSN CheckBox On RMA Application Policy System Setup Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolSysSetup_Chk_DefaultPolicy
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Copy Data DSN CheckBox On RMA Application Policy System Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-04-02-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolSysSetup_Chk_DefaultPolicy(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DefaultPolicy")); //Unique Id  Of Copy Data DSN CheckBox On RMA Application Policy System Setup Page Is Fetched
		return Element;
	}
	
	//============================================================================================
		//FunctionName 			: RMAApp_PolSysSetup_Rdb_ClientFileFlag
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Client File Setting Radio Button On RMA Application Policy System Setup Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - DebasmitaPati-04-02-2019                                 
		// ============================================================================================
		public static WebElement RMAApp_PolSysSetup_Rdb_ClientFileFlag(WebDriver driver, String ClientFileFlag)
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[text()='"+ClientFileFlag+"']/preceding::input[1]")); //Unique Id  Of Client File Setting Radio Button On RMA Application Policy System Setup Page Is Fetched
			return Element;
		}
}