package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Defendant {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp__Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Defendant Last Name On RMA Application Defendant Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-06-02-2017                                 
// ============================================================================================
public static WebElement RMAApp_Defendant_Txt_LastName(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='lookup_deflastname']")); //Unique Id  Of  Defendant Last Name On RMA Application Defendant Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Defendant First Name On RMA Application Defendant Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-06-02-2017                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Txt_FirstName(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("deffirstname")); //Unique Id  Of Defendant First Name On RMA Application Defendant Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Txt_MiddleName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Defendant Middle Name On RMA Application Defendant Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-06-02-2017                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Txt_MiddleName(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("defmiddlename")); //Unique Id  Of Defendant Middle Name On RMA Application Defendant Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Txt_AttorneyLastName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Attorney Last Name On RMA Application Defendant Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-12-2017                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Txt_AttorneyLastName(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("lookup_defattlastname")); //Unique Id Of Attorney Last Name On RMA Application Defendant Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Txt_AttorneyMiddleName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Attorney Middle Name Text Box On RMA Application Defendant Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-28-2017                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Txt_AttorneyMiddleName(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("defattmiddlename")); //Unique Id Of Attorney Middle Name Text Box On RMA Application Defendant Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Txt_DefendantTitle
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DefendantTitle Text Box On RMA Application Defendant Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-28-2017                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Txt_DefendantTitle(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("deftitle")); //Unique Id Of DefendantTitle Text Box On RMA Application Defendant Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Tab_Supplementals
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Link On RMA Application Claim's Defendant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-06-02-2017                                
//============================================================================================
public static WebElement RMAApp_Defendant_Tab_Supplementals(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i")); //Unique X-path Of Supplemental Link On RMA Application Claim's Defendant Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Tab_ClaimDefendantAttorney
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Defendant Attorney Link On RMA Application Claim's Defendant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-06-02-2017 
//ModifedBy             : 0.0 - KumudNaithani-06-12-2017 : Corrected Function Name Which Was Previously RMAApp_Defendant_Tab_ClaimDefendantInfo
//============================================================================================
public static WebElement RMAApp_Defendant_Tab_ClaimDefendantAttorney(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Defendant Attorney')]/i")); //Unique X-path Of Claim Defendant Attorney Link On RMA Application Claim's Defendant Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Tab_ClaimDefendantInfo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Defendant Attorney Link On RMA Application Claim's Defendant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-06-02-2017 
//ModifedBy             : 0.0 - KumudNaithani-06-12-2017 : Corrected Function Name Which Was Previously RMAApp_Defendant_Tab_ClaimDefendantInfo
//============================================================================================
public static WebElement RMAApp_Defendant_Tab_ClaimDefendantInfo(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Defendant Info')]/i")); //Unique X-path Of Claim Defendant Attorney Link On RMA Application Claim's Defendant Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Lnk_ClaimRightHandTree
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Defendant Information Link On RMA Application Claim's Defendant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-06-02-2017                                
//============================================================================================
public static WebElement RMAApp_Defendant_Lnk_ClaimRightHandTree(WebDriver driver, String DefName)
{
	Element = null;
	try {
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+DefName+"')and @class='rightPanel-alink ng-binding']")); //Unique X-path Of Claim Defendant Information Link On RMA Application Claim's Defendant Page Is Fetched
	} catch (Exception e) {
	e.printStackTrace();
	}
	return Element;
}
}

/*//============================================================================================
	//FunctionName 			: RMAApp_Defendant_Btn_RiskMasterLogin
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which RiskMasterLogin button On RMA Application Defendant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Defendant_Btn_RiskMasterLogin(WebDriver driver)
	{
		Element = driver.findElement(By.id("adjrmsysuser_rmsyslookupbtn")); //Unique Id  Of RiskMasterLogin Button On RMA Application Defendant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Defendant_Tbl_SystemUsers
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SystemUsers Table On RMA Application Defendant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Defendant_Tbl_SystemUsers(WebDriver driver)
	{
		Element = driver.findElement(By.id("gvUserList")); //Unique Id  Of SystemUsers Table On RMA Application Defendant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Defendant_Btn_SystemUsers_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ok on SystemUsers Table On RMA Application Defendant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Defendant_Btn_SystemUsers_Ok(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnOkResrc")); //Unique Id  Of Ok on SystemUsers Table On RMA Application Defendant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Defendant_Lst_UserType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UserType List Box On System Users Window On Defendant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Defendant_Lst_UserType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstUserGroups")); //Unique Id Of UserType List Box On System Users Window On Defendant Creation Page On Is Fetched
		return Element;
	}
	
//============================================================================================
	//FunctionName 			: RMAApp_Defendant_Txt_SysUsersFirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FirstName Text Box On System Users Window On Defendant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Defendant_Txt_SysUsersFirstName(WebDriver driver)
	{
		Element = driver.findElement(By.id("firstname")); //Unique Id Of FirstName Text Box On System Users Window On Defendant Creation Page On Is Fetched
		return Element;
	}
	
	
	//============================================================================================
	//FunctionName 			: RMAApp_Defendant_Btn_AdjSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Search Button On Defendant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-28-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Defendant_Btn_AdjSearch(WebDriver driver)
	{
		Element = driver.findElement(By.id("adjlastnamebtn")); //Unique Id Of Last Name Search Button On Defendant Creation Page On Is Fetched
			return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_Defendant_Btn_Edit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Button On RMA Application Defendant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-29-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Defendant_Btn_Edit(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmdEdit2")); //Unique Id  Of Edit Button On RMA Application Defendant Creation Page Is Fetched
		return Element;
	}
	
	
}*/
