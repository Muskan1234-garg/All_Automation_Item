package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_PrintChecks {
	public static WebElement Element;


	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Bank Account Text Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Lst_BankAccount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ddlpreBankAcc")); //Unique Id Of Bank Account ListBox On Print Checks Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_PreCheckRegister_Img_Print
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Image On Pre Check Register Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PreCheckRegister_Img_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnPrePrint")); //Unique Id Of Print Image On Pre Check Register Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Txt_CheckBatch
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Check Batch Text Box On Print Check Batch Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Txt_CheckBatch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtprintCheckBatch")); //Unique Id Of Print Image On Print Check Batch Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Img_Print
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Image On Print Check Batch Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Img_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='aprintIcon']/i")); //Unique Id Of Print Image On Print Check Batch Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Txt_AlertMsg
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Alert Message On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Txt_AlertMsg(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='modal-body modaldataHeight ng-scope']/p"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Btn_PrintCheckOk
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Ok Button On Alert Message On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017            
	//Revision				: 0.0 - MishalKantawala-05-19-2021                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Btn_PrintCheckOk(WebDriver driver)
	{
		Element = null;
		// Element = driver.findElement(By.xpath(".//*[@id='btnRoll']/i"));   //Old POM
		Element = driver.findElement(By.xpath(".//*[@id='btnRoll'and (@aria-label='Ok' or @role='button')]/i"));   //New POM
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PreCheckRegister_Img_ChecksAndEOBReportsOk
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Ok Image On Checks And EOB Reports Of Print Check Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PreCheckRegister_Img_ChecksAndEOBReportsOk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chcekBatchMsgInfoSaveIcon")); //Unique Id Of Print Image On Pre Check Register Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Lst_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Distribution Type List Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-09-04-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Lst_DistributionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("dllprepredistributionType")); //Unique Id Of Bank Account ListBox On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Chk_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which From Date On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-09-04-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Chk_FromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkpreFromdate")); //Unique Id Of From Date On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Chk_CombinedPayments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Combined Payment On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-09-04-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Chk_CombinedPayments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chk_CombinedPayment")); //Unique Id Of Combined Payment On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Img_Print
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Image On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Img_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnPrePrint']")); //Unique Id Of Print Image On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Img_ChecksAndEOBReportsOk
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Ok Image On Checks And EOB Reports Of Print Check Batch Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-10-03-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Img_ChecksAndEOBReportsOk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("I6")); //Ok Image On Checks And EOB Reports Of Print Check Batch Tab Is Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Img_PrintChecksOk
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Ok Image On Print Check Batch Tab Is Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-10-03-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Img_PrintChecksOk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("I1")); //Ok Image On Print Check Batch Tab Is Identified
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PreCheckRegister_Btn_CheckSelection
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Checks Selection Button On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-05-28-2018                                   
	//============================================================================================
	public static WebElement RMAApp_PreCheckRegister_Btn_CheckSelection(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_CheckSelection")); //Unique Id Of Checks Selection Button On Print Checks Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PreCheckRegister_Lst_Checks
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Checks List Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-05-28-2018                                   
	//============================================================================================
	public static WebElement RMAApp_PreCheckRegister_Lst_Checks(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ddlpreChecksType")); //Unique Id Of Checks ListBox On Print Checks Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_SelectChecks_Img_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Cancel Image On Print Checks->Select Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-06-08-2018                               
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_SelectChecks_Img_Cancel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCancelComment']")); //Unique Id Of Cancel Image On Print Checks -> Select Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Chk_IncludeAutoPayments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Auto Payment On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-09-04-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Chk_IncludeAutoPayments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chk_autoPayment")); //Unique Id Of Auto Payment On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Chk_IncludeAutoCheck
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which From Date On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-07-2019                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Chk_IncludeAutoCheck(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chk_autoPayment")); //Unique Id Of From Date On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Lst_PostDistributionType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Distribution Type List Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -VartikaSood-28-07-2020                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Lst_PostDistributionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ddlPostDistributionType")); //Unique Id Of Bank Account ListBox On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Lst_CheckBatch
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Check Batch Number On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -VartikaSood-28-07-2020                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Lst_CheckBatch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Text10")); //Unique Id Of Check Batch Number On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Chk_NumberOfPayments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which NUmber Of Payments On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-28-07-2020                                  
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Chk_NumberOfPayments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Text14")); //Unique Id Of Number of Payments On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_PostCheckDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Post Check Date On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-28-07-2020                                 
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_PostCheckDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Text13")); //Unique Id Of Post Check Date On Print Checks Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_PreCheckDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Pre Check Date On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-28-07-2020                                 
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_PreCheckDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtprintPrecheckDate")); //Unique Id Of Pre Check Date On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Chk_NumberOfChecks
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Number Of Checks On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-28-07-2020                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Chk_NumberOfChecks(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Text11")); //Unique Id Of From Date On Print Checks Page Is Fetched
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Lst_PostBankAccount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Bank Account Text Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - VartikaSood-28-07-2020                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Lst_PostBankAccount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ddlpostBankAcc")); //Unique Id Of Bank Account ListBox On Print Checks Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_PostCheckRegister_Img_Print
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Image On Post Check Register Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -VartikaSood-28-07-2020                                   
	//============================================================================================
	public static WebElement RMAApp_PostCheckRegister_Img_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='A2']/i")); //Unique Id Of Print Image On Post Check Register Page Is Fetched
		return Element;
	}


}
