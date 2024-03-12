package rmaseleniumPOM_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_PowerView {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Lbl_PowerViewName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Power View Name HyperLink On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Lbl_PowerViewName(WebDriver driver, String PowerViewName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ng-binding' and contains(text(),'"+PowerViewName+"')]")); //Unique Id Of Power View Name HyperLink On RMA Application Power View Editor Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Chk_Entity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Any Child Entity CheckBox On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Chk_Entity(WebDriver driver, String NodeText)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='checkboxValue rowPointer ng-binding' and contains(text(),'"+NodeText+"')]/ancestor::div[1]/input")); //Unique Id Of Any Child Entity CheckBox On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Lbl_Entity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Any Child Entity Text On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Lbl_Entity(WebDriver driver, String ChildNodeText)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='checkboxValue rowPointer ng-binding' and contains(text(),'"+ChildNodeText+"')]")); //Unique Id Of Any Child Entity Text On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Btn_Save(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCreate']/i")); //Unique Id Of Save Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_DropDwn_ToolbarMainForm
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Maim Form ToolBar DropDown On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_DropDwn_ToolbarMainForm(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Span1' and contains(text(),'Toolbar Buttons')]")); //Unique Id Of Maim Form ToolBar DropDown On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Btn_RemoveToolbarButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete ToolBar Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Btn_RemoveToolbarButton(WebDriver driver, String ControlName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@title='"+ControlName+"']//ancestor::div[1]//*[@title='Delete Field']")); //Unique Id Of Delete ToolBar Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Btn_ViolationFieldDelete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Violation Field Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Btn_ViolationFieldDelete(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='I1' and @class='fa fa-close pull-right pull-right']")); //Unique Id Of Delete Violation Field Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Btn_FieldDelete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Field Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-26-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Btn_FieldDelete(WebDriver driver,String Text)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@class='ng-scope ng-binding' and contains(text(),'"+Text+"')]//ancestor::div[1]/i")); //Unique Id Of Delete Field Button On RMA Application Power View Editor Page Is Fetched
		//Element = driver.findElement(By.id("fieldDelete"));
		Element = driver.findElement(By.xpath(".//span[contains(text(),'Initials') ]//ancestor::div[@class='control-label labelspan ellipsis']/i[@title='Delete Field']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Btn_TabDelete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Tab Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-26-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Btn_TabDelete(WebDriver driver,String Text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='accordion-toggle ng-binding']/span[contains(text(),'"+Text+"')]//ancestor::span[1]/i[2]")); //Unique Id Of Delete Tab Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Btn_TabAdd
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Tab Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-26-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Btn_TabAdd(WebDriver driver,String Text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='accordion-toggle ng-binding']/div[contains(text(),'"+Text+"')]//ancestor::span[1]/i[2]")); //Unique Id Of Add Tab Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Tab_ControlPalette
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Control Palette Expend Tab On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-26-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_DropDown_ControlPalette(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='I17' and @class='pull-right fa fa-chevron-down']")); //Unique Id Of Control Palette Expend Tab On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_DropDwn_ChildNavigationMainForm
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Maim Form Child Navigation DropDown On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-27-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_DropDwn_ChildNavigationMainForm(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Span2' and contains(text(),'Child/Navigation Links')]")); //Unique Id Of Maim Form Child Navigation DropDown On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Btn_RemoveChildNavigationLinkButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Child/Navigation Link Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-27-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Btn_RemoveChildNavigationLinkButton(WebDriver driver, String ControlName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+ControlName+"')]//ancestor::div[1]/i")); //Unique Id Of Delete Child/Navigation Link Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_DropDwn_ToolbarSidePanel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Maim Form ToolBar DropDown On Side Panel On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_DropDwn_ToolbarSidePanel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Span4' and contains(text(),'Toolbar Buttons')]")); //Unique Id Of Maim Form ToolBar DropDown On Side Panel On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Lbl_FieldDelete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Label Of Child Field On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Lbl_FieldDelete(WebDriver driver,String Text)
	{
		Element = null;
		//		Element = driver.findElement(By.xpath(".//*[@class='control-label labelspan']/span[contains(text(),'"+Text+"')]")); //Unique Id Of Label On Child Field On RMA Application Power View Editor Page Is Fetched
		Element = driver.findElement(By.xpath(".//span[contains(text(),'"+Text+"')]//ancestor::div[1]/i")); //Unique Id Of Label On Child Field On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_ToggleBtn_RequiredField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Toggle Button For Required Field On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_ToggleBtn_RequiredField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-model='newField._required']//ancestor::div[1]/label")); //Unique Id Of Toggle Button On Required Field On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_ToggleBtn_ReadOnlyField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Toggle Button For ReadOnly Field On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_ToggleBtn_ReadOnlyField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-model='newField._readonly']//ancestor::div[1]/label")); //Unique Id Of Toggle Button On ReadOnly Field On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Lbl_DropDownField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Label Of Fields On DropDown Menu On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-05-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Lbl_DropDownField(WebDriver driver, String Text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='control-label labelspan toolbar-acc dragField ng-binding' and contains(text(),'"+Text+"')]")); //Unique Id Of Label Of Fields On DropDown Menu On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Txt_Caption
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Caption TextBox On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-05-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Txt_Caption(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='GroupButtonLevelProperties']/div/div/fieldset/input")); //Unique Id Of Caption TextBox On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Tab_ControlPalette
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tab On Control Palette On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-05-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Tab_ControlPalette(WebDriver driver,String Text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//div[contains(text(),'"+Text+"')]/i[@id='I1']")); //Unique Id Of Tab On Control Palette On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Area_Fields
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Fields Area On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-05-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Area_Fields(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='field']/ancestor::div[1]")); //Unique Id Of Field Area On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_DeleteField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Field Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_DeleteField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='bt_delete']")); //Unique Id Of Delete Field Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Area_ToolBarField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ToolBar Field Area On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Area_ToolBarField(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@id='btnList']/div[1]/accordion/div/div/div[2]")); //Unique Id Of ToolBar Field Area On RMA Application Power View Editor Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='btnList']/div[1]/uib-accordion/div/div/div[2]/div/div/div")); //Unique Id Of ToolBar Field Area On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_ViolationField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Violation Field Area On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_ViolationField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='violation']/div/button[normalize-space(text())='Violation']")); //Unique Id Of Violation Field Area On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Lbl_ToolBarField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Label On ToolBar Field On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Lbl_ToolBarField(WebDriver driver,String Text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='tbutton']/div/label[contains(text(),'"+Text+"')]")); //Unique Id Of Label On ToolBar Field On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_DiaryField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary Field Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_DiaryField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='bt_diary']")); //Unique Id Of Diary Field Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_RecordSummaryField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Record Summary Field Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_RecordSummaryField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='bt_recordsummary']")); //Unique Id Of Record Summary Field Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_WithholdingField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Withholding Field Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_WithholdingField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='bt_withholding']")); //Unique Id Of Withholding Field Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_DropDown_ChildSidePanel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Child/Navigation Link Side Panel Drop Down On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_DropDown_ChildSidePanel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Span5' and contains(text(),'Child/Navigation Links')]")); //Unique Id Of Child/Navigation Link Side Panel Drop Down On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_BankingInfoField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Banking Information field On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_BankingInfoField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='cmd_btnBankingInformations']")); //Unique Id Of Banking Information field On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_ViolationsField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Violations field On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_ViolationsField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='cmd_btnViolation']")); //Unique Id Of Violations field On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_DependentsField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dependents field On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_DependentsField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='cmd_btnDependent']")); //Unique Id Of Dependents field On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Area_ChildNavigation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Child/Navigation Area Field On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Area_ChildNavigation(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@id='btnList']/div[2]/accordion/div/div/div[2]")); //Unique Id Of Child/Navigation Area Field On RMA Application Power View Editor Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='btnList']/div[2]/uib-accordion/div/div/div[2]/div/div/div")); //Unique Id Of Child/Navigation Area Field On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_ControlPaletteField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Control Palette Field On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_ControlPaletteField(WebDriver driver,String Text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='btn-group-vertical ng-scope']/button[contains(text(),'"+Text+"')]")); //Unique Id Of Control Palette  Field On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_EmployeePowerview_Tab_EmploymentInfo
	//Description                     : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Employment Info Tab On RMA Application Employee Powerview Editor Page Is Fetched
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - dpati-03-01-2018                                 
	//============================================================================================
	public static WebElement RMAApp_EmployeePowerview_Tab_EmploymentInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='employmentinfo_tab']")); //Unique x-path  Of Employment Info Tab On RMA Application Employee Powerview Editor Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName                    : RMAApp_EmployeePowerview_Tab_EmploymeeInfo
	//Description                     : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Employee Info Tab On RMA Application Employee Powerview Editor Page Is Fetched
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - dpati-03-01-2018                                 
	//============================================================================================
	public static WebElement RMAApp_EmployeePowerview_Tab_EmployeeInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='employeeinfo_tab']")); //Unique x-path  Of Employment Info Tab On RMA Application Employee Powerview Editor Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName                    : RMAApp_EmployeePowerview_Lbl_DateHired
	//Description                     : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Hired Label On RMA Application Employee Powerview Editor Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - dpati-03-01-2018                                 
	//============================================================================================
	public static WebElement RMAApp_EmployeePowerview_Lbl_DateHired(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='control-label labelspan ellipsis' and @for='datehired']/span")); //Unique x-path  Of Date Hired Label On RMA Application Employee Powerview Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_EmployeePowerview_Lbl_TerminationDate
	//Description                     : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Termination Date Label On RMA Application Employee Powerview Editor Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - dpati-03-01-2018                                 
	//============================================================================================
	public static WebElement RMAApp_EmployeePowerview_Lbl_TerminationDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='control-label labelspan ellipsis' and @for='termdate']/span")); //Unique x-path  Of Termination Date Label On RMA Application Employee Powerview Editor Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName                    : RMAApp_EmployeePowerview_Lbl_LicenseNumber
	//Description                     : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which License Number Label On RMA Application Employee Powerview Editor Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - dpati-03-01-2018                                 
	//============================================================================================
	public static WebElement RMAApp_EmployeePowerview_Lbl_LicenseNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='control-label labelspan ellipsis' and @for='driverslicno']/span")); //Unique x-path  Of License Number Label On RMA Application Employee Powerview Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_EmployeePowerview_Lbl_LicenseType
	//Description                     : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which License Type Label On RMA Application Employee Powerview Editor Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - dpati-03-01-2018                                 
	//============================================================================================
	public static WebElement RMAApp_EmployeePowerview_Lbl_LicenseType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='control-label labelspan ellipsis' and @for='driverslictypecode']/span")); //Unique x-path  Of License Type Label On RMA Application Employee Powerview Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName                    : RMAApp_EmployeePowerview_Lbl_Dependent
	//Description                     : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which License Type Label On RMA Application Employee Powerview Editor Page Can Be Identified
	//Input Parameter          : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - ShrutiShruti-03-01-2018                                 
	//============================================================================================
	public static WebElement RMAApp_EmployeePowerview_Lbl_Dependent(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[normalize-space(text())='Employee Dependent']"));
		return Element;

	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_ExpandTabButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Expand Tab Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_ExpandTabButton(WebDriver driver,String Text)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@class='accordion-toggle ng-binding']/span[contains(text(),'"+Text+"')]//ancestor::span[1]/i[@id='I13']")); //Unique Id Of Expand Tab Button On RMA Application Power View Editor Page Is Fetched
		Element = driver.findElement(By.xpath(".//span[contains(text(),'"+Text+"')]/i[@id='I13']")); //Unique Id Of Expand Tab Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Txt_HelpMessage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TextBox For Help Message Field On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-03-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Txt_HelpMessage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Help Message:')]//ancestor::div[1]//textarea")); //Unique Id Of TextBox For Help Message Field On RMA Application Power View Editor Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[@ng-if='field.helpmsg']")); //Unique Id Of Help Message Image On Property Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Btn_CreatePowerView
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Power View Create Button On PowerView Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Btn_CreatePowerView(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCreate']/i")); //Unique Id Of Power View Create Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Txt_PowerViewName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Power View Name TextBox On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Txt_PowerViewName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("powerViewName")); //Unique Id Of Power View Name TextBox On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Txt_PowerViewDesc
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Power View Desciption TextBox On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Txt_PowerViewDesc(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("powerViewDesc")); //Unique Id Of Power View Description TextBox On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Btn_SavePowerView
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Power View Save Button On PowerView Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Btn_SavePowerView(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_Save")); //Unique Id Of Power View Save Button On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Chk_AvailableForms
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Available Forms CheckBox On PowerView Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Chk_AvailableForms(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Available Forms')]//ancestor::div[1]//i[1]")); //Unique Id Of Available Forms CheckBox On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Chk_UserName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Available Forms CheckBox On PowerView Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Chk_UserName(WebDriver driver, String Username)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Username+"')]//ancestor::div[1]/input[1]")); //Unique Id Of Available Forms CheckBox On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Chk_TabView
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tab View CheckBox On PowerView Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-26-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Chk_TabView(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Tab View')]//ancestor::div[1]/input")); //Unique Id Of Tab View CheckBox On RMA Application Power View Editor Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Chk_CloneBaseView
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Clone Base view CheckBox On PowerView Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-11-26-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Chk_CloneBaseView(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cloneBaseView")); //Unique Id Of Clone Base view CheckBox  On RMA Application Power View Editor Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Lbl_FieldDelete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Label Of Child Field On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_PowerView_Lbl_FieldSelect(WebDriver driver,String Text)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='control-label labelspan ellipsis']/span[contains(text(),'"+Text+"')]")); //Unique Id Of Field Label On RMA Application Power View Editor Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Lbl_ToolbarButtons
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Labels Of Toolbar Buttons On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-08-2020                                 
	// ============================================================================================
	public static List<WebElement> RMAApp_PowerView_Lbl_TotalToolbarButtons(WebDriver driver)
	{
		ElementList = null;
		ElementList = driver.findElements(By.xpath(".//*[@id='tbutton']//label")); //Unique Id Of Field Label On RMA Application Power View Editor Page Is Fetched
		return ElementList;
	}
}