package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_POM_GeneralSystemParameterSetUP {


	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseSubBankAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Sub Bank Account CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseSubBankAccount(WebDriver driver)
	{
		Element = driver.findElement(By.id("SubBankAcc")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Txt_HrsForWhichEnhNoteAreEditable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which "Hours for which Enhanced Notes are editable"  Text Box On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-11-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Txt_HrsForWhichEnhNoteAreEditable(WebDriver driver)
	{
		Element = driver.findElement(By.id("EnhNoteTime")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AllowDiaryPeek
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Global Peek for Diaries CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-03-01-2017                                    
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AllowDiaryPeek(WebDriver driver)
	{
		Element = driver.findElement(By.id("AllowDiaryPeek")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Lst_SortThird
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sort Third ListBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -AnubhutiVyas-08-14-2017                                    
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Lst_SortThird(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='EnhanceNotesPrintOrder3']")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseEntityPaymentApproval
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Entity Payment Approval CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseEntityPaymentApproval(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseEntityApproval")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseAccountOwnerForFunds
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Account Owner For Funds CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseAccountOwnerForFunds(WebDriver driver)
	{
		Element = driver.findElement(By.id("AccOwnrFnds")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseGeneralClaim
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use General Claim CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseGeneralClaim(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseGCLOB")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetupActivationCodeWind_Txt_ActivationCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Activation Code Textbox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-03-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetupActivationCodeWind_Txt_ActivationCode(WebDriver driver)
	{
		Element = driver.findElement(By.id("password")); 
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseWorkersCompClaim
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Workers Comp Claim CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseWorkersCompClaim(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseWCLOB")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseVehicleAccidentClaim
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Vehicle Accident Claim CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseVehicleAccidentClaim(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseVALOB")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetupActivationCodeWind_Btn_ActivationCodeOk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Activation Code Ok Button On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetupActivationCodeWind_Btn_ActivationCodeOk(WebDriver driver)
	{
		Element = driver.findElement(By.id("Ok")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Default "Assigned to" in Create Diary to Current User CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkAssignedTo")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AutoLaunchDiary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Auto Launch Diary (Non-Powerview) CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AutoLaunchDiary(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkAutoLaunchDiary")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Lnk_FundsSettings
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Account Owner For Funds CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-13-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Lnk_FundsSettings(WebDriver driver)
	{
		Element = driver.findElement(By.id("LINKTABSFundSettings"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseResTypeFilterTransactionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Reserve Type To Filter Transaction Type CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-09-13-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseResTypeFilterTransactionType(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseResFilter")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_DoNotChkSubAccDepositBalances
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Do Not Check Sub Account Deposit Balances CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_DoNotChkSubAccDepositBalances (WebDriver driver)
	{
		Element = driver.findElement(By.id("AccDepositBal"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseMasterBankAccounts 
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Do Not Check Sub Account Deposit Balances CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseMasterBankAccounts (WebDriver driver)
	{
		Element = driver.findElement(By.id("UseMasterBankAcc"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AssignChkStockToSubAccounts
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Assign Check Stock to Sub Accounts CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AssignChkStockToSubAccounts (WebDriver driver)
	{
		Element = driver.findElement(By.id("AssignSubAcc"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Multiple Addresses For Entities CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities(WebDriver driver)
	{
		Element = driver.findElement(By.id("MulAddresses")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Lst_OrgLvlForTimeZoneValidation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Org. Level for Time Zone validation ListBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -AnubhutiVyas-10-10-2017                                    
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Lst_OrgLvlForTimeZoneValidation(WebDriver driver)
	{
		Element = driver.findElement(By.id("OrgTimeZoneLevel")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_ChkBox_AllowVoidofClearedPaymentsCollections
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Void of Cleared Payments/Collections Checkbox  On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -NidhiJha-12-19-2017                                    
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_ChkBox_AllowVoidofClearedPaymentsCollections(WebDriver driver)
	{
		Element = driver.findElement(By.id("AllowVoidClearedPmts")); 
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_PreventModifyingReserveslessthanPaid
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which	Prevent Modifying Reserves less than Paid CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-12-22-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_PreventModifyingReserveslessthanPaid(WebDriver driver)
	{
		Element = driver.findElement(By.id("PrvntBelowPaidRes")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_ChkBox_PreventBackDatingofReserves
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Prevent Back Dating of Reserves Checkbox  On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -NidhiJha-12-19-2017                                    
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_ChkBox_PreventBackDatingofReserves(WebDriver driver)
	{
		Element = driver.findElement(By.id("PrvntBckDtng")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_ChkBox_PreventModifyingReservestoZero
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Prevent Modifying Reserves to Zero Checkbox  On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -NidhiJha-12-19-2017                                    
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_ChkBox_PreventModifyingReservestoZero(WebDriver driver)
	{
		Element = driver.findElement(By.id("PrvntModfyngRes")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_EnableAddModifyAddresses
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Add/Modify Addresses For Entities CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-06-13-2018                              
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_EnableAddModifyAddresses(WebDriver driver)
	{
		Element = driver.findElement(By.id("AddModifyAddress")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UserLimitForManualPay
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Add/Modify Addresses For Entities CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-07-2019                              
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UserLimitForManualPay(WebDriver driver)
	{
		Element = driver.findElement(By.name("Checkbox")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AllowSummaryForBookedReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Summary For Booked Reserve CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -ShrutiShruti-10-23-2019                                    
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AllowSummaryForBookedReserve(WebDriver driver)
	{
		Element = driver.findElement(By.id("AllowSummaryForBookedReserve")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Txt_ExeSumNotesThreshold
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Executive Summary Notes Threshold Textbox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-07-2019                              
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Txt_ExeSumNotesThreshold(WebDriver driver)
	{
		Element = driver.findElement(By.name("txtExecSummaryNotesThreshold")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Txt_ExeSumTxnSplitThreshold
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Executive Summary Transaction Split Threshold Textbox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-07-2019                              
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Txt_ExeSumTxnSplitThreshold(WebDriver driver)
	{
		Element = driver.findElement(By.name("txtExecSummarySplitThreshold")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Txt_EnhNotesThreshold
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enhanced Notes Threshold Textbox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-07-2019                              
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Txt_EnhNotesThreshold(WebDriver driver)
	{
		Element = driver.findElement(By.name("txtEnhancedNotesThreshold")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_ShowPolEnhancedNotesInClaim
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Show Policy Enhanced Notes In Claims CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-02-2020                              
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_ShowPolEnhancedNotesInClaim(WebDriver driver)
	{
		Element = driver.findElement(By.id("EnhNotePolicyInClaim")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AllowNotesAtClaimantsLevel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Notes At Claimants Level CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-02-2020                              
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AllowNotesAtClaimantsLevel(WebDriver driver)
	{
		Element = driver.findElement(By.id("AllowNotesAtClaimant")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AddPersonInvPayeeType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Person Involved To Payee Type CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AddPersonInvPayeeType(WebDriver driver)
	{
		Element = driver.findElement(By.id("AddPersonInvolvedAsPayeeType")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AddOrgHierPayeeType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Org Hierarchy To Payee Type CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AddOrgHierPayeeType(WebDriver driver)
	{
		Element = driver.findElement(By.id("AddOrgHierarchyAsPayeeType")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AddPayeeAddToSelectCheckScreen
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Payee Adress To Select Check Screen CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-27-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AddPayeeAddToSelectCheckScreen(WebDriver driver)
	{
		Element = driver.findElement(By.id("PayeeAddressSelect")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_PromptToMarkTransAsReadyToPrint
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Prompt To Mark Transaction As Ready To Print CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-12-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_PromptToMarkTransAsReadyToPrint(WebDriver driver)
	{
		Element = driver.findElement(By.id("AutoReadyToPrint")); 
		return Element;
	}
	/*
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Multiple Addresses For Entities CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities(WebDriver driver)
	{
		Element = driver.findElement(By.id("MulAddresses")); 
		return Element;
	}



	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UsePropertyClaim
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Property Claim CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UsePropertyClaim(WebDriver driver)
	{
		Element = driver.findElement(By.id("UsePCLOB")); 
		return Element;
	}




	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseNonOccupationalClaim
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use NonOccupational Claim CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseNonOccupationalClaim(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseDILOB")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseCaseManagement
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Case Management CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseCaseManagement(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseCaseMgmt")); 
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseMCMInterface
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use MCM Interface CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseMCMInterface(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseAcrosoftInterface")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseScriptEditor
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Script Editor CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseScriptEditor(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseScriptEditor")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseQualityMangaForEvent
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Quality Management For Events CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseQualityMangaForEvent(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseQualityMgt")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_DontDefultTimeFields
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Don't Default Time Fields CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_DontDefultTimeFields(WebDriver driver)
	{
		Element = driver.findElement(By.id("DefaultTime")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_DontDefultTimeFields
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Activity Log CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_EnableClaimActivityLog(WebDriver driver)
	{
		Element = driver.findElement(By.id("EnableClaimActivityLog")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseBillReviewSystem
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Bill Review System CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseBillReviewSystem(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseBRS")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseResTypeFilterTransactionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Reserve Type To Filter Transaction Type CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseResTypeFilterTransactionType(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseResFilter")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AddPersonInvPayeeType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Person Involved To Payee Type CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AddPersonInvPayeeType(WebDriver driver)
	{
		Element = driver.findElement(By.id("AddPersonInvolvedAsPayeeType")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AddOrgHierPayeeType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Org Hierarchy To Payee Type CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AddOrgHierPayeeType(WebDriver driver)
	{
		Element = driver.findElement(By.id("AddOrgHierarchyAsPayeeType")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AllowEditWCEmployeeNum
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Edit Of WC Employee Numbers CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AllowEditWCEmployeeNum(WebDriver driver)
	{
		Element = driver.findElement(By.id("AllowEditWCEmp")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_IgnoreSSNChecking
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ignore SSN Checking CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_IgnoreSSNChecking(WebDriver driver)
	{
		Element = driver.findElement(By.id("IgnoreSSNChecking")); 
		return Element;
	}




	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_DeleteAllDiariesOnClaimClosed
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete All diaries Related to Claim when Claim is closed CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_DeleteAllDiariesOnClaimClosed(WebDriver driver)
	{
		Element = driver.findElement(By.id("DeleteAllClaimDiaries")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UsePolicySysInterface
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Policy System Interface CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UsePolicySysInterface(WebDriver driver)
	{
		Element = driver.findElement(By.id("UsePolicyInterface")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseMultiCurrency
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Use Multi Currency CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseMultiCurrency(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseMultiCurrency")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Txt_SMTPMailServer
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SMTP Mail Server TextBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Txt_SMTPMailServer(WebDriver driver)
	{
		Element = driver.findElement(By.id("SmtpSvr")); 
		return Element;
	}
	 */
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Btn_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("Save")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AllowInternalPolicySearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Default "Assigned to" in Create Diary to Current User CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-17-2019                              
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AllowInternalPolicySearch(WebDriver driver)
	{
		Element = driver.findElement(By.id("AllowPolicySearch")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AllowSplitPaymentAcrossReserves
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Split Payment Across Reserves CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-03-13-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AllowSplitPaymentAcrossReserves(WebDriver driver)
	{
		Element = driver.findElement(By.id("AllowMultiSplitReserve")); 
		return Element;
	}
	/*


	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseCodeMapping
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Code Mapping CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-09-15-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_UseCodeMapping(WebDriver driver)
	{
		Element = driver.findElement(By.id("UseCodeMapping")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Txt_EventNumPrefix
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Number Prefix TextBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-10-07-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Txt_EventNumPrefix(WebDriver driver)
	{
		Element = driver.findElement(By.id("EvPrefix")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_IncludeYear
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which IncludeYear CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-10-07-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_IncludeYear(WebDriver driver)
	{
		Element = driver.findElement(By.id("EvIncludeYearFlag")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AddClaimantPI
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Claimant as Person Involved CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-11-17-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AddClaimantPI(WebDriver driver)
	{
		Element = driver.findElement(By.id("AddClaimantPI")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Chk_AllowInternalPolicySearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Internal Policy Search CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-01-04-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Chk_AllowInternalPolicySearch(WebDriver driver)
	{
		Element = driver.findElement(By.id("AllowPolicySearch")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenSysParaSetup_Txt_SelectBaseCurrency
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Base Currency TextBox On RMA Application General System Parameter Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-01-04-2017                                     
	// ============================================================================================
	public static WebElement RMAApp_GenSysParaSetup_Txt_SelectBaseCurrency(WebDriver driver)
	{
		Element = driver.findElement(By.id("basecurrencytype_codelookup")); 
		return Element;
	}


//Changes done for testing GitHub

	 */
}