package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Funds_PrintChecks {
	public static WebElement Element;


	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Bank Account Text Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Lst_BankAccount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ddlpreBankAcc")); //Unique Id Of Bank Account ListBox On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Lst_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Distribution Type Text Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Lst_DistributionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("dllprepredistributionType")); //Unique Id Of Distribution Type ListBox On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Chk_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which From Date Check Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Chk_FromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkpreFromdate")); //Unique Id Of From Date CheckBox On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Chk_CombinedPayment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which combined Payment Check Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Chk_CombinedPayment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chk_CombinedPayment")); //Unique Id Of Combined Payment CheckBox On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Img_Print
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Button On PreCheck Register Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Img_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnPrePrint']/i")); //Unique Id Of Print Button On PreCheck Register Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Mod_EligibleMessage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Eligibility Message On Print Check Page On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Mod_EligibleMessage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='modaldataChanged ng-binding']")); //Unique Id Of Eligibility Message On Print Check Page On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Img_PrintCheck
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Button On Print Check Register Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Img_PrintCheck(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='aprintIcon']/i")); //Unique Id Of Print Button On Print Check Register Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentChecksAndEOBReports_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which OK Button On Checks And EOB Reports On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PaymentChecksAndEOBReports_Btn_Ok(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chcekBatchMsgInfoSaveIcon")); //Unique Id Of OK Button On Checks And EOB Reports On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_PrintSingleCheckMsgOk
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which OK Button On Print Check Range On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_Payment_Txt_PrintSingleCheckMsgOk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='I1']")); //Unique Id Of OK Button On Print Check Range On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Lst_Checks
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Checks Text Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Lst_Checks(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ddlpreChecksType")); //Unique Id Of Check ListBox On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Btn_SelectChecks
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Select Checks Button On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Btn_SelectChecks(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_CheckSelection")); //Unique Id Of Select Checks Button On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Btn_OKPrint
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Select Checks Button On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Btn_OKPrint(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnSaveComment']/i")); //Unique Id Of Select Checks Button On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Btn_SelectCheck
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Select Checks Button On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Chk_SelectCheck(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope']")); //Unique Id Of Select Checks Button On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Lst_CheckStock
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Button On Print Check Register Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-06-07-2018                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Lst_CheckStock(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ddlPrintCheckStock")); //Unique Id Of Print Button On Print Check Register Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PreCheck_Lst_OrderField
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Order Field On Pre Check Register Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-28-2020                                 
	//============================================================================================
	public static WebElement RMAApp_PreCheck_Lst_OrderField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ddlpreorderField")); //Unique Id Of Order Field On Pre Check Register Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Txt_FirstCheckNum
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which First Check# On Print Check Batch Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-28-2020                               
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Txt_FirstCheckNum(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtprintFirstCheckNo")); //Unique Id Of First Check# On Print Check Batch Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Txt_CheckDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Check Date On Print Check Batch Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-28-2020                                 
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Txt_CheckDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id = 'txtprintCheckDate' and @type = 'text']")); //Unique Id Of Check Date On Print Check Batch Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Txt_PrecheckDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Precheck Date On Print Check Batch Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-28-2020                                 
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Txt_PrecheckDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtprintPrecheckDate")); //Unique Id Of Precheck Date On Print Check Batch Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Txt_TotalAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Total Amount On Print Check Batch Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-28-2020                                 
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Txt_TotalAmount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtprintTotalAmount")); //Unique Id Of Total Amount On Print Check Batch Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Txt_NumOfChecks
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which # of Checks On Print Check Batch Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-28-2020                                 
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Txt_NumOfChecks(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtprintNumberofChecks")); //Unique Id Of # of Checks On Print Check Batch Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Txt_OrderField
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Order Field On Print Check Batch Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-28-2020                                 
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Txt_OrderField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtprintOrderField")); //Unique Id Of Order Field On Print Check Batch Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PreCheck_Chk_ToDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which To Date Check Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-28-2020                                   
	//============================================================================================
	public static WebElement RMAApp_PreCheck_Chk_ToDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkpreToDate")); //Unique Id Of To Date CheckBox On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PreChecks_Txt_ToDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which To Date Text Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-28-2020                                   
	//============================================================================================
	public static WebElement RMAApp_PreChecks_Txt_ToDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='txt_pretodate']//input")); //Unique Id Of To Date TextBox On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PreChecks_Txt_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which To Date Text Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-28-2020                                   
	//============================================================================================
	public static WebElement RMAApp_PreChecks_Txt_FromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='txt_prefromdate']//input")); //Unique Id Of To Date TextBox On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Precheck_Txt_TotalAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Total Amount On Precheck Register Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-28-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Precheck_Txt_TotalAmount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txt_totalAmount")); //Unique Id Of Total Amount On Precheck Register Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Precheck_Txt_NumOfPreChecks
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which # of Prechecks On Precheck Register Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-28-2020                                 
	//============================================================================================
	public static WebElement RMAApp_Precheck_Txt_NumOfPreChecks(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txt_preCheck")); //Unique Id Of # of Prechecks On Precheck Register Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Btn_CancelOnSelectChecks
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Select Checks Button On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-31-2020                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Btn_CancelOnSelectChecks(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCancelComment']/i")); //Unique Id Of Select Checks Button On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Txt_OrgHierarchy
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Org Hierarchy Field On PreCheck Register Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-04-2020                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Txt_OrgHierarchy(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_lstOrgHir']//input")); //Unique Id Of Org Hierarchy Field On PreCheck Register Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Lst_OrgHierarchyLevel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Org Hierarchy Level List On PreCheck Register Tab On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-04-2020                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Lst_OrgHierarchyLevel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ddlpreOrgLevel")); //Unique Id Of Org Hierarchy Level List On PreCheck Register Tab On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Btn_OKPrint
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Select Checks Button On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-31-2020                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Btn_CancelPrintConfirmation(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCancel']/i")); //Unique Id Of Select Checks Button On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Chk_OrderField
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Order Field On Post Checks Register Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-28-07-2020                                   
	//============================================================================================

	public static WebElement RMAApp_PrintChecks_Chk_OrderField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ddlOrderField")); //Unique Id Of Order Field On Post Checks Register Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Summary_RadioBtn
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Summary Radio Button On Post Checks Register Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-28-07-2020                                   
	//============================================================================================
	public static WebElement RMAApp_Summary_RadioBtn(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='postCheck']/div[3]/div[3]/div/div/div/div/div[2]/input")); //Unique Id Of Summary Radio Button On Post Checks Register Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SubAccount_RadioBtn
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Sub Account Radio Button On Post Checks Register Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-28-07-2020                                   
	//============================================================================================
	public static WebElement RMAApp_SubAccount_RadioBtn(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='postCheck']/div[3]/div[3]/div/div/div/div/div[3]/input")); //Unique Id Of SubAccount Radio Button On Post Checks Register Page Is Fetched
		return Element;
	}
}
