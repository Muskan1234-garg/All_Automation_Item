package rmaseleniumPOM_UX;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//Default Package Import Completed

public class RMA_Selenium_POM_Login_DSNSelect_Frames extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;

	//============================================================================================
	//FunctionName              : RMAApp_Login_Txt_UserName
	//Description               : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UserName TextBox On RMA Application Login Page Can Be Identified
	//Input Parameter           : Driver Variable Of The Type WebDriver                
	//Revision                  : 0.0 - KumudNaithani-05-18-2017                                
	// ============================================================================================
	public static WebElement RMAApp_Login_Txt_UserName(WebDriver driver)
	{
		Element = null;
//		Element = driver.findElement(By.xpath(".//*[@placeholder='Username'] or [@name='username']")); //Unique Id  Of UserName Text Box on Login Page Of RMA Application Is Fetched
		Element = driver.findElement(By.xpath(".//*[@placeholder='Username']")); //Unique Id  Of UserName Text Box on Login Page Of RMA Application Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                             : RMAApp_Login_Txt_PassWord
	//Description                    : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PassWord TextBox On RMA Application Login Page Can Be Identified
	//Input Parameter           : Driver Variable Of The Type WebDriver                
	//Revision                                         : 0.0 - KumudNaithani-05-18-2017                                
	// ============================================================================================
	public static WebElement RMAApp_Login_Txt_PassWord(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@placeholder='Password']")); //Unique Id  Of PassWord Text Box On Login Page Of RMA Application Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName         : RMAApp_Dashboard_Lbl_Maintenance
	//Description          : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Maintenance Label On RMA Application Dash-board Page Can Be Identified
	//Input Parameter      : Driver Variable Of The Type WebDriver                
	//Revision             : 0.0 - KumudNaithani-05-18-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Dashboard_Lbl_Maintenance(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[text()='build'][@class='material-icons nobordericondash ng-binding ng-scope']")); //Unique Id Of Maintenance On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                                            : RMAApp_Login_Btn_Login
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Login Button On RMA Application Login Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - KumudNaithani-05-18-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Login_Btn_Login(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@data-ng-bind='mainResource.SIGN_IN']")); //Unique Id Of Login Button On Login Page Of RMA Application Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                                            : RMAApp_DSNSelect_Lbl_LoginName
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Login Name Label On RMA Application Data Source Selection Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - KumudNaithani-05-18-2017  
	//Modify By                                                     : 0.0 - RenuVerma-07-31-2018 Update the POM    
	//============================================================================================
	public static WebElement RMAApp_DSNSelect_Lbl_LoginName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-bind='userDisplayName']")); //Unique Id Of Login Name Label On RMA Application Data Source Selection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName		:	RMAApp_DSNSelect_Cmb_DataSourceName
	//Description		:	To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DataSourceName Combo Box On RMA Application DSN Selection Page Can Be Identified
	//Input Parameter	:	Driver Variable Of The Type WebDriver                
	//Revision			:	0.0 - KumudNaithani-05-18-2017      
	//Revision			:	1.0 - MishalKantawala-11-06-2023                                
	// ============================================================================================
	//Note: Following Function Only Helps The User To Click On Data Source Selection Combo Box. To Select Any Data Source Name Please Refer Function: RMAApp_DSNSelect_Cmb_DSNSourceSelection

	public static WebElement RMAApp_DSNSelect_Cmb_DataSourceName(WebDriver driver)
	{
		Element = null;
//		Element = driver.findElement(By.xpath(".//*[contains(@aria-label,'Select Datasource')]")); //Unique Id  Of DataSourceName Combo Box On RMA Application DSN Selection Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@role='trigger']")); //Unique Id  Of DataSourceName Combo Box On RMA Application DSN Selection Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName                                            : RMAApp_DSNSelect_Cmb_ZoneName
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zone Name Combo Box On RMA Application DSN Selection Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - KumudNaithani-05-18-2017                                 
	// ============================================================================================
	//Note: Following Function Only Helps The User To Click On Zone Selection Combo Box. To Select Any Zone Name Please Refer Function: RMAApp_DSNSelect_Cmb_DSNSourceSelection

	public static WebElement RMAApp_DSNSelect_Cmb_ZoneName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@placeholder='Select Zone']")); //Unique Id  Of Zone Name Combo Box On RMA Application DSN Selection Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName		:	RMAApp_DSNSelect_Cmb_DSNSourceSelection
	//Description		:	To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Required DataSource On RMA Application DSN Selection Page Can Be Identified
	//Input Parameter	:	Driver Variable Of The Type WebDriver                
	//Revision			:	0.0 - KumudNaithani-05-18-2017      
	//Revision			:	1.0 - MishalKantawala-11-06-2023
	//============================================================================================
	public static WebElement RMAApp_DSNSelect_Cmb_DSNSourceSelection(WebDriver driver, String SearchedText) throws InterruptedException
	{
		int ElementlistCount;
		int dsniterator;
		String datasourcename;
		//Local Variable Declaration

		Element = null;
//		ElementList = driver.findElements(By.xpath(".//*[@role='listbox']/md-content//*[@class='ng-scope md-ink-ripple']")); // Unique           Property Common To All The DataSource Names Is Identified And Taken In The List 
//		ElementList = driver.findElements(By.xpath(".//*[@role='listbox']/md-content//*[@class='mat-ripple mat-option-ripple']")); // Unique           Property Common To All The DataSource Names Is Identified And Taken In The List 
		ElementList = driver.findElements(By.xpath(".//*[@role='listbox']//parent::span[@class='mat-option-text']")); // Unique           Property Common To All The DataSource Names Is Identified And Taken In The List 

		globalWait.until(ExpectedConditions.elementToBeClickable(ElementList.get(0)));
		ElementlistCount = ElementList.size();
		breakloop:
			for (dsniterator=1; dsniterator<=  ElementlistCount; dsniterator++)
			{
//				datasourcename = driver.findElement(By.xpath(".//*[@role='listbox']/md-content//*[@class='mat-ripple mat-option-ripple']["+dsniterator+"]/div/span")).getText(); // DataSouce Name Presently Iterated Is Fetched
				datasourcename = driver.findElement(By.xpath(".//*[@role='listbox']//parent::span[contains(text(), '"+SearchedText+"')]")).getText();
				if (datasourcename.equalsIgnoreCase(SearchedText))
				{	
					Element = driver.findElement(By.xpath(".//*[@role='listbox']//parent::span[contains(text(), '"+SearchedText+"')]")); //Required DSN Name Is Clicked
					break breakloop;
				}
			}
		return Element;
	}	
	//============================================================================================
	//FunctionName                                            : RMAApp_DSNSelect_Cmb_ZoneSelection
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Required DataSource On RMA Application DSN Selection Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - KumudNaithani-05-18-2017                                
	//============================================================================================
	public static WebElement RMAApp_DSNSelect_Cmb_ZoneSelection(WebDriver driver, String SearchedText) throws InterruptedException
	{
		int ElementlistCount;
		int dsniterator;
		String datasourcename;
		//Local Variable Declaration

		Element = null;
		ElementList = driver.findElements(By.xpath(".//*[@role='listbox']/md-content//*[@class='ng-scope md-ink-ripple']")); // Unique           Property Common To All The DataSource Names Is Identified And Taken In The List 
		globalWait.until(ExpectedConditions.elementToBeClickable(ElementList.get(0)));
		ElementlistCount = ElementList.size();
		breakloop:
			for (dsniterator=1; dsniterator<=  ElementlistCount; dsniterator++)
			{
				datasourcename = driver.findElement(By.xpath(".//*[@role='listbox']/md-content//*[@class='ng-scope md-ink-ripple']["+dsniterator+"]/div/a")).getText(); // DataSouce Name Presently Iterated Is Fetched
				if (datasourcename.equalsIgnoreCase(SearchedText))
				{	
					Element = driver.findElement(By.xpath(".//*[@role='listbox']/md-content//*[@class='ng-scope md-ink-ripple']["+dsniterator+"]/div/a")); //Required DSN Name Is Clicked
					break breakloop;
				}
			}
		return Element;
	}

	//============================================================================================
	//FunctionName                                            : RMAApp_DSNSelect_Btn_Continue
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Continue Button On RMA Application DSN Selection Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - KumudNaithani-05-18-2017                                
	// ============================================================================================
	public static WebElement RMAApp_DSNSelect_Btn_Continue(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@aria-label='Continue']")); //Unique Id  Of Continue Button On RMA Application DSN Selection Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@data-ng-bind='mainResource.CONTINUE']")); //Unique Id  Of Continue Button On RMA Application DSN Selection Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                                            : RMAApp_Dashboard_Lbl_DataSource
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DataSource Label On RMA Application Default View Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - KumudNaithani-05-18-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Dashboard_Lbl_DataSource(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@class='account-actions ng-binding' or @class='dsnContent ng-binding']")); //Unique Id Of DataSource Label On RMA Application Default View Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@class='account-actions hidden-xs hidden-sm ng-binding' or @class='account-actions ng-binding' or @class='dsnContent ng-binding']")); //Unique Id Of DataSource Label On RMA Application Default View Page Is Fetched 
		return Element;
	}

	//============================================================================================
	//FunctionName       : RMAApp_Dashboard_Lbl_Claims
	//Description        : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claims Label On RMA Application Dash-board Page Can Be Identified
	//Input Parameter    : Driver Variable Of The Type WebDriver                
	//Revision           : 0.0 - KumudNaithani-05-18-2017 
	//Revision           : 0.0 - MishalKantawala-08-29-2023 	
	//============================================================================================
	public static WebElement RMAApp_Dashboard_Lbl_Claims(WebDriver driver)
	{
		Element = null;
//		Element = driver.findElement(By.xpath(".//*[@class='commonIcomoon icomoon-desktopclaims icon-files nobordericondash']")); //Unique Id Of Claims Label On RMA Application Default View Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[text()='description'][@class='material-icons nobordericondash ng-binding ng-scope']")); //Unique Id Of Claims Label On RMA Application Default View Page Is Fetched
		
		return Element;
	}

	//============================================================================================
	//FunctionName                                            : RMAApp_Dashboard_Lbl_Claim
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Label On RMA Application Dash-board Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - KumudNaithani-05-18-2017 
	//Revision                                                        : 1.0 - DebasmitaPati-05-16-2018   
	//============================================================================================
	public static WebElement RMAApp_Dashboard_Lbl_Claim(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@class='layout-align-center-center layout-column']/a[2]/div[2]")); //Unique Id Of Claim Label On RMA Application Default View Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[text()='perm_data_setting'][@class='material-icons nobordericondash ng-binding ng-scope']")); //Unique Id Of Utilities Label On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                                            : RMAApp_DefaultView_Img_RecentlyViewed
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Recently Viewed Image Icon On RMA Application Default View Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - KumudNaithani-05-18-2017                                 
	//============================================================================================
	public static WebElement RMAApp_DefaultView_Img_RecentlyViewed(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("recentView")); //Unique Id Of Recently Viewed Image Icon On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                                            : RMAApp_Dashboard_Lbl_SMS
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Label On RMA Application Dash-board Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - RenuVerma-07-18-2017    
	//Revision                                                        : 1.0 - DebasmitaPati-05-16-2018
	//============================================================================================
	public static WebElement RMAApp_Dashboard_Lbl_SMS(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@class='layout-align-center-center layout-column']/a[5]/div[2]")); //Unique Id Of Claim Label On RMA Application Default View Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[text()='security'][@class='material-icons nobordericondash ng-binding ng-scope']")); //Unique Id Of Security Label On RMA Application Default View Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName                                            : RMAApp_Dashboard_Lbl_DataSource
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Logout Button On RMA Application Default View Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - RenuVerma-07-18-2017                                      
	//============================================================================================
	public static WebElement RMAApp_Dashboard_Btn_Logout(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@aria-label='logout']")); //Unique xpath Of Logout Button On RMA Application Default View Page Is Fetched
		} catch (Exception e) {
			System.out.println("Logout Link is not available");
		}
		return Element;
	}

	//============================================================================================
	//FunctionName                                            : RMAApp_Dashboard_Btn_LogoutOk
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Logout Ok Button On RMA Application Default View Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - RenuVerma-09-04-2017                                      
	//============================================================================================
	public static WebElement RMAApp_Dashboard_Btn_LogoutOk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnRoll")); //Unique xpath Of Logout Ok Button On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                                            : RMAApp_UX_Btn_Logout
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Logout Button On RMA Application UX Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - NidhiJha-01-02-2018      
	//Modify By                                                     : 0.0 - RenuVerma-07-24-2018
	//Modify By                                                     : 0.0 - RenuVerma-10-26-2018 As Logout done from other than Dashboard page 
	//============================================================================================
	public static WebElement RMAApp_UX_Btn_Logout(WebDriver driver)
	{
		Element = null;
		try {
			if(driver.getTitle().equals("DXC Assure Claim"))
			{
				//Element = driver.findElement(By.xpath(".//*[text()='exit_to_app']"));// If DashBoard Page
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_Lnk_ThreeDotVertical(driver), "", logval);
				Element = driver.findElement(By.xpath(".//*[@class='dropdown-menu-dashboard']//*[contains(text(),'Logout')]"));// If DashBoard Page					
			}
			else {
				//Element = driver.findElement(By.xpath(".//*[(@ui-sref='home' and @class='user-profile')]/i")); //Unique xpath Of Logout Button On RMA Application UX Page other Than Dashboard Is Fetched
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_Lnk_ThreeDotVertical(driver), "", logval);
				//Element = driver.findElement(By.xpath(".//*[@class='dropdown-menu zone']//*[contains(text(),'Logout')]")); //Unique xpath Of Logout Button On RMA Application UX Page other Than Dashboard Is Fetched
				Element = driver.findElement(By.xpath(".//*[@class='dropdown-menu-mdi zone']//*[contains(text(),'Logout')]")); //Unique xpath Of Logout Button On RMA Application UX Page other Than Dashboard Is Fetched				
			}
		}catch (Exception e) {
			System.out.println("Log Out Button Is not Available");
			return Element;
		}
		return Element;
	}

	//============================================================================================
	//FunctionName                                            : RMAApp_DashBoard_Lbl_Utilities
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Utilities Label On RMA Application UX Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - NidhiJha-01-02-2018    
	//Modify By                                                     : 0.1 - DebasmitaPati-05-06-2018 
	//Modify By                                                     : 0.2 - RenuVerma-07-05-2018 
	//============================================================================================
	public static WebElement RMAApp_DashBoard_Lbl_Utilities(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@class='md-tile-content Dashiconclr ng-binding ng-scope' and contains(text(),'Utilities')]")); //Unique xpath Of Utilities Label On RMA Application UX Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[text()='perm_data_setting'][@class='material-icons nobordericondash ng-binding ng-scope']")); //Unique xpath Of Settings Label On RMA Application UX Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName                                            : RMAApp_Dashboard_Lbl_SMS
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Security Label On RMA Application Dash-board Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - ShrutiShruti-05-18-2018                                 
	//============================================================================================
	public static WebElement RMAApp_Dashboard_Lbl_Security(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[text()='security'][@class='material-icons nobordericondash ng-binding ng-scope']")); //Unique Id Of Security Label On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                                            : RMAApp_Dashboard_Lbl_Settings
	//Description                                   : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Security Label On RMA Application Dash-board Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                                        : 0.0 - ShrutiShruti-05-18-2018                                 
	//============================================================================================
	public static WebElement RMAApp_Dashboard_Lbl_Settings(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='md-tile-content Dashiconclr ng-binding ng-scope' and contains(text(),'Settings')]")); //Unique Id Of Security Label On RMA Application Default View Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName                             : RMAApp_DSNSelection_ZoneSelectionCard
	//Description                              : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Required Zone(Zone) On RMA Application DSN Selection Page Can Be Identified
	//Input Parameter                          : Driver Variable Of The Type WebDriver                
	//Revision                                 : 0.0 - MishalKantawala-11-01-2023                                
	//============================================================================================
	public static WebElement RMAApp_DSNSelection_ZoneSelectionCard(WebDriver driver, String ZoneSelection) throws InterruptedException
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='content childComponents']//parent::span[contains(text(), '"+ZoneSelection+"')]")); // Unique           Property Common To All The DataSource Names Is Identified And Taken In The List 
		return Element;
	}
}
