package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Utilities_QueryDesigner {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Btn_CreateNewQuery
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Create New Query Button On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Btn_CreateNewQuery(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCreateNew']")); //Unique Id  Of Create New Query Button On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Txt_SearchName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Name TextBox On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Txt_SearchName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_searchname']")); //Unique Id  Of Search Name TextBox On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Ddl_SearchType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Type DropDown List On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Ddl_SearchType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_searchtype']")); //Unique Id  Of Search Type DropDown List On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Txt_SearchDescription
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Description TextBox On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Txt_SearchDescription(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_searchdesc']")); //Unique Id Of Search Description TextBox On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Txt_BasicInfoNext
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Basic Information Next Image Button On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Txt_BasicInfoNext(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_StartNavigationTemplateContainerID_StepNextButton']")); //Unique Id Of Basic Information Next Image Button On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Ddl_SearchCategory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Category DropDown List On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Ddl_SearchCategory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_searchcats']")); //Unique Id Of Search Category DropDown ListOn RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Lst_SearchFields
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Field List On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Lst_SearchFields(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_fields']")); //Unique Id Of Search Field List On RMA Application Query Designer Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Btn_AddSearchFields
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Search Field Button On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Btn_AddSearchFields(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_addField']")); //Unique Id Of Add Search Field Button On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Txt_QueryFieldSelectionNext
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Query Field Selection Next Image Button On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Txt_QueryFieldSelectionNext(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_StepNavigationTemplateContainerID_StepNextButton']")); //Unique Id Of Query Field Selection Next Image Button On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Ddl_DisplayCategory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which D Category DropDown List On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Ddl_DisplayCategory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_searchcats1']")); //Unique Id Of Display Category DropDown ListOn RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Lst_DisplayFields
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Display Field List On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Lst_DisplayFields(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_fields1']")); //Unique Id Of Search Display List On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Btn_AddDisplayFields
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Display Field Button On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Btn_AddDisplayFields(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_addField1']")); //Unique Id Of Add Display Field Button On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Txt_DisplayFieldSelectionNext
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Display Field Selection Next Image Button On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Txt_DisplayFieldSelectionNext(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_StepNavigationTemplateContainerID_StepNextButton']")); //Unique Id Of Display Field Selection Next Image Button On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Txt_DisplayFieldSelectionNext
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select All User Radio Button On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Btn_AllowAllUser(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_allowall']")); //Unique Id Of Select All User Radio Button On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Btn_SelectUser
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select User Radio Button On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Btn_SelectUser(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_selectusers']")); //Unique Id Of Select User Radio Button On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Lst_AvailableUser
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Available User List On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Lst_AvailableUser(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_usersgroups']")); //Unique Id Of Available User List On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Lst_AddUser
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Selected User List On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Lst_AddUser(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_btnAdd1']")); //Unique Id Of Add Selected User On RMA Application Query Designer Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QueryDesigner_Btn_Finish
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Finish Setup Image Button On RMA Application Query Designer Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-28-2019                                
	// ============================================================================================
	public static WebElement RMAApp_QueryDesigner_Btn_Finish(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Wizardlist_FinishNavigationTemplateContainerID_StepFinishButton']")); //Unique Id Of Finish Setup Image Button On RMA Application Query Designer Page Is Fetched
		return Element;
	}






}
