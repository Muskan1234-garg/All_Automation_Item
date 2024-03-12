package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_LOBClaimOptions {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_LOBParaSetup_Lnk_ClaimOptions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Options On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-07-21-2017                              
	//============================================================================================
	public static WebElement RMAApp_LOBParaSetup_Lnk_ClaimOptions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='LINKTABSClaimOptions']")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_LOBClaimOptions_Chk_AllowDuplicateClaimChecking
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Duplicate Claim Checking CheckBox On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	//============================================================================================
	public static WebElement RMAApp_LOBClaimOptions_Chk_AllowDuplicateClaimChecking(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkDuplicate")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBClaimOptions_Lst_DupCriteriaSelect
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Duplicate Claim Criteria List Box On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-07-21-2017                                 
	//============================================================================================
	public static WebElement RMAApp_LOBClaimOptions_Lst_DupCriteriaSelect(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstDupClaimCriteria")); 
		return Element;
	} 
	//============================================================================================
	//FunctionName 			: RMAApp_LOBParameterOptions_TxtBox_Number_Of_Days
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Number Of Days Text Box On LOB Options  On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-07-21-2017                                 
	//============================================================================================
	public static WebElement RMAApp_LOBParameterOptions_TxtBox_Number_Of_Days(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='txtHowMany']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBParameterOptions_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Button On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-07-21-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LOBParameterOptions_Btn_Ok(WebDriver driver)
	{
		Element = driver.findElement(By.id("Button1")); //Unique Id Of Supervisor Approval Configuration Tab On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
		return Element;
	}

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOBParaSetUp_Lst_LOB
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Line of Business List Box On RMA Application Line Of Business Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-07-24-2017                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOBParaSetUp_Lst_LOB(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lstLOB']"));		
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_LOBClaimOptions_Lnk_ClaimOptions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Options On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-07-21-2017                              
	//============================================================================================
	public static WebElement RMAApp_LOBClaimOptions_Lnk_ClaimOptions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='LINKTABSClaimOptions']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBParaSetup_Lnk_ReserveIncurredOptions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve/Incurred Balance Options On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                              
	//============================================================================================
	public static WebElement RMAApp_LOBParaSetup_Lnk_ReserveIncurredOptions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='LINKTABSReserveIncurredBalanceOptions']")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_LOBReserveIncurredBalanceOptions_Chk_ReserveBalanceOptions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve/Incurred Balance Options On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                              
	//============================================================================================
	public static WebElement RMAApp_LOBReserveIncurredBalanceOptions_Chk_ReserveBalanceOptions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='chkCollResBal']")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_LOBReserveIncurredBalanceOptions_Chk_IncurredBalanceOptions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve/Incurred Balance Options On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                              
	//============================================================================================
	public static WebElement RMAApp_LOBReserveIncurredBalanceOptions_Chk_IncurredBalanceOptions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='chkCollIncBal']")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_LOBReserveIncurredBalanceOptions_Chk_ReserveBalancePerReserveOptions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve/Incurred Balance Options On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                              
	//============================================================================================
	public static WebElement RMAApp_LOBReserveIncurredBalanceOptions_Chk_ReserveBalancePerReserveOptions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='chkCollResBalPerRsv']")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_LOBReserveIncurredBalanceOptions_Chk_IncurredBalancePerReserveOptions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve/Incurred Balance Options On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                              
	//============================================================================================
	public static WebElement RMAApp_LOBReserveIncurredBalanceOptions_Chk_IncurredBalancePerReserveOptions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='chkCollIncBalPerRsv']")); 
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_LOBParaSetup_Lnk_ReserveOptions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Options On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                              
	//============================================================================================
	public static WebElement RMAApp_LOBParaSetup_Lnk_ReserveOptions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='LINKTABSReserveOptions']")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_LOB_Btn_ReserveTypeLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOB_Btn_ReserveTypeLookup(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstReserveTypes_multicodebtn")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBReserveOptions_Chk_AutoAdjustOpenClaim
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBReserveOptions_Chk_AutoAdjustOpenClaim(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkAutoAdjust")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBReserveOptions_Chk_AutoAdjustPreResrv
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBReserveOptions_Chk_AutoAdjustPreResrv(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkAutoAdjustNegative")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBReserveOptions_Chk_CollectionReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBReserveOptions_Chk_CollectionReserve(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkPrevColl")); 
		return Element;
	}

	//FunctionName 			: RMAApp_LOBReserveOptions_Chk_UseReserveWorkSheet
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBReserveOptions_Chk_UseReserveWorkSheet(WebDriver driver)
	{
		Element = driver.findElement(By.id("ChkUseRSW")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBReserveOptions_Chk_InsufficientReserveFunds
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBReserveOptions_Chk_InsufficientReserveFunds(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkInsuff")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBReserveOptions_Chk_InsufficientAutoPay
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBReserveOptions_Chk_InsufficientAutoPay(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkInsuffAutoPay")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBReserveOptions_Chk_NegativeReserveAdjstmnt
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBReserveOptions_Chk_NegativeReserveAdjstmnt(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkNegtiveRA")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBReserveOptions_Chk_NonRecoveryPerReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBReserveOptions_Chk_NonRecoveryPerReserve(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkPrevCollPerRes")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBResIncurdOptions_Btn_PerReserveTypeRecoveryLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per ReserveType Reserve Balance  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBResIncurdOptions_Btn_PerReserveTypeRecoveryLookup(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstPerRsvTypeRecovery_multicodebtn")); 
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_LOBResIncurdOptions__Lst_PerReserveTypeRecovery
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per ReserveType Reserve Balance  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBResIncurdOptions__Lst_PerReserveTypeRecovery(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@id='lstPerRsvTypeRecovery_multicode']/option[1]")); 
		}catch (Exception|Error e){	 
		}	
		return Element;			
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBResIncurdOptions__Btn_PerReserveTypeRecoveryRemove
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per ReserveType For Incurred Balance Removed On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBResIncurdOptions__Btn_PerReserveTypeRecoveryRemove(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstPerRsvTypeRecovery_multicodebtndel")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBResIncurdOptions__Btn_PerReserveTypeIncurredLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per ReserveType Reserve Balance  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBResIncurdOptions__Btn_PerReserveTypeIncurredLookup(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstPerRsvTypeIncurred_multicodebtn")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBResIncurdOptions__Lst_PerReserveTypeIncurred
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per ReserveType Reserve Balance  Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBResIncurdOptions__Lst_PerReserveTypeIncurred(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@id='lstPerRsvTypeIncurred_multicode']/option[1]")); 
		}catch (Exception|Error e){	 
		}		
		return Element;		
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBResIncurdOptions__Btn_PerReserveTypeIncurredRemove
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per ReserveType For Incurred Balance Removed On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBResIncurdOptions__Btn_PerReserveTypeIncurredRemove(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstPerRsvTypeIncurred_multicodebtndel")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBResIncurdOptions__Rbtn_ResBalToZero
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per ReserveType For Incurred Balance Removed On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-24-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBResIncurdOptions__Rbtn_ResBalToZero(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkRBZero")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBResIncurdOptions__Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per ReserveType For Incurred Balance Removed On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBResIncurdOptions__Btn_Ok(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnOk2")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBResIncurdOptions__Rbtn_NegtvResBalToZero
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per ReserveType For Incurred Balance Removed On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-24-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBResIncurdOptions__Rbtn_NegtvResBalToZero(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkNRBZero")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBResIncurdOptions__Rbtn_DoNothing
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per ReserveType For Incurred Balance Removed On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-10-24-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBResIncurdOptions__Rbtn_DoNothing(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkDoNothing")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBAutoCloseOptions_Btn_AutoCloseTransTypesRemove
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction type Remove Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBAutoCloseOptions_Btn_AutoCloseTransTypesRemove(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstAutoClose_multicodebtndel")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LOBParaSetup_Lnk_AutoCloseOptions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Auto Close Options On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-08-18-2017                              
	//============================================================================================
	public static WebElement RMAApp_LOBParaSetup_Lnk_AutoCloseOptions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='LINKTABSAutoCloseOptions']")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_LOBAutoCloseOptions_Btn_AutoCloseTransTypes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per Transaction type Button On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_LOBAutoCloseOptions_Btn_AutoCloseTransTypes(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstAutoClose_multicodebtn")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_LOBClaimOptions_Chk_UseEnhancedNotes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Enhanced Notes Checkbox On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-08-13-2018                                     
	//============================================================================================
	public static WebElement RMAApp_LOBClaimOptions_Chk_UseEnhancedNotes(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkEnhNotes")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_LOBClaimOptions_Chk_UseMultipleDisabilityClasses
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Multiple Disability Classes Checkbox On Line Of Business Parameter Set Up Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-28-2020                                     
	//============================================================================================
	public static WebElement RMAApp_LOBClaimOptions_Chk_UseMultipleDisabilityClasses(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkMultipleClasses")); 
		return Element;
	}
}
