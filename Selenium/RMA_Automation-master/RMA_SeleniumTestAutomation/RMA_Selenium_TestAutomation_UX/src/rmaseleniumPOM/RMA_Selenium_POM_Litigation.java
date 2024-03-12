package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Litigation {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_DocketNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DocketNumber Text Box On RMA Application Claim Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-16-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_Litigation_Txt_DocketNumber(WebDriver driver)
	{
		Element = driver.findElement(By.id("docketnumber")); //Unique Id DocketNumber Text Box On RMA Application Claim Litigation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image On RMA Application Claim Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-16-2015                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Img_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("save")); //Unique Id Of Save Image On RMA Application Claim Litigation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Img_Delete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Image On RMA Application Claim Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-16-2015                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Img_Delete(WebDriver driver)
	{
		Element = driver.findElement(By.id("Delete")); //Unique Id Of Save Image On RMA Application Claim Litigation Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Tab_AttorneyInformation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Attorney Information Tab On RMA Application Claim Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-13-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Tab_AttorneyInformation(WebDriver driver)
	{
		Element = driver.findElement(By.id("LINKTABSlitattorney")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplementals Tab On RMA Application Claim Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-13-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Tab_Supplementals(WebDriver driver)
	{
		Element = driver.findElement(By.id("LINKTABSsuppgroup")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_ExpertLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of which RMA Application Litigation-> Expert Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MahendraPSingh-02-08-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Txt_ExpertLastName(WebDriver driver)
	{
		Element = driver.findElement(By.id("expertlastname")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LitDemandOffer_Txt_Activity
	//Description  			: To Fetch Unique Property(Such As Id, X-Path, Name ) On The Basis Of Which Activity TextBox On Demand Offer Page For A Claim Litigation Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -KumudNaithani-03-02-2017                                 
	//============================================================================================
	public static WebElement RMAApp_LitDemandOffer_Txt_Activity(WebDriver driver)
	{
		Element = driver.findElement(By.id("activitycode_codelookup")); //Unique Id Of Activity TextBox On Demand Offer Page For A Claim Litigation Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LitDemandOffer_Txt_Date
	//Description  			: To Fetch Unique Property(Such As Id, X-Path, Name ) On The Basis Of Which Date TextBox On Demand Offer Page For A Claim Litigation Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -KumudNaithani-03-02-2017                                 
	//============================================================================================
	public static WebElement RMAApp_LitDemandOffer_Txt_Date(WebDriver driver)
	{
		Element = driver.findElement(By.id("demandofferdate")); //Unique Id Of Date TextBox On Demand Offer Page For A Claim Litigation Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_VenueState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Venue State  Text Box On RMA Application Claim Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-01-16-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_Litigation_Txt_VenueState(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_venuestateid']")); //Unique Id Venue State Text Box On RMA Application Claim Litigation Page Is Fetched
		return Element;
	}

}
