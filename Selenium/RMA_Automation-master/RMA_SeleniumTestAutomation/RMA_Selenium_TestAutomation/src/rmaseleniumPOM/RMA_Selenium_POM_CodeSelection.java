package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_CodeSelection {
public static WebElement Element = null;
public static List<WebElement> ElementList = null;


//============================================================================================
//FunctionName 			: RMAApp_CodeSelection_Tbl_RecordsMatching
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Record(s) Matching Criteria Text On RMA Application Code Selection Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-05-2016                                 
//============================================================================================
public static WebElement RMAApp_CodeSelection_Label_RecordsMatching(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Record(s) matching the criteria')")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_CodeSelection_Label_ZeroRecords
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zero Records Text On RMA Application Code Selection Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-05-2016                                 
//============================================================================================
public static WebElement RMAApp_CodeSelection_Label_ZeroRecords(WebDriver driver)
{
	 WebElement Element = null;
	 try{
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Zero records match the criteria')]")); 
	 }catch (Exception|Error e) {	
	 }
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_CodeSelection_Btn_ChooseHighlighted
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Choose Highlighted Button On RMA Application Code Selection Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-05-2016                                 
//============================================================================================
public static WebElement RMAApp_CodeSelection_Btn_ChooseHighlighted(WebDriver driver)
{
	 WebElement Element = null;
	try{
	Element = driver.findElement(By.xpath(".//*[@value='Choose Highlighted']")); 
	}catch (Exception|Error e) {	
	 }
	 return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_CodeSelection_Btn_AddNew
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Button On RMA Application Claim's Claimant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-06-20-2016                                 
//============================================================================================
public static WebElement RMAApp_CodeSelection_Btn_AddNew(WebDriver driver)
{
	 WebElement Element = null;
	 try{
	Element = driver.findElement(By.xpath(".//*[@value='Add New']")); 
	 }catch (Exception|Error e) {	
	 }
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_CodeSelection_Lst_FirstOption
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Option From The List On RMA Application Code Selection Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-05-2016                                 
//============================================================================================
public static WebElement RMAApp_CodeSelection_Lst_FirstOption(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='optResults']/option[1]")); 
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_CodeSelection_Btn_Cancel
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Button On RMA Application Code Selection Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-05-2016                                 
//============================================================================================
public static WebElement RMAApp_CodeSelection_Btn_Cancel(WebDriver driver)
{
	Element = driver.findElement(By.id(".//*[@value='Cancel']")); 
	return Element;
}

}
