package rmaseleniumutilties_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.relevantcodes.extentreports.LogStatus;

public class RMA_NegativeVerification_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	//===================================================================================================================================================================================================================================
	//FunctionName 		: RMA_WebElementNotExist_Utility
	//Description  		: To Check The Non-Existence Of A Web Element 
	//Input Parameter 	: WebElement Element : WebElement Whose Existence Is To Be Checked And ObjectDescription : Description Of The Object Whose Existence Needs To Be Checked
	//Revision			: 0.0 - KumudNaithani-11-30-2015                                 
	//===================================================================================================================================================================================================================================
	public static void RMA_ElementNotExist_Utility(WebElement Element, String ObjectDescription,int logval) throws Exception, Error
	{

		try {
			ObjectDescription = color.RMA_ChangeColor_Utility(ObjectDescription, 4);
			if (Element == null)
			{
				if (logval ==0)
				{
					parentlogger.log(LogStatus.PASS, "Following Object:" + " " + ObjectDescription + " "+ "Is Not Found On Application Screen And Hence We Can Continue With Testing");
				}
				else
				{
					logger.log(LogStatus.PASS, "Following Object:" + " " + ObjectDescription + " "+ "Is Not Found On Application Screen And Hence We Can Continue With Testing");
				}
			}
			else
			{
				if (logval ==0)
				{
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Following Object", 1)+ " " + ObjectDescription + " "+ color.RMA_ChangeColor_Utility("Is Found On Application Screen And Hence Testing Is DisContinued", 1));
				}
				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Following Object", 1) + " " + ObjectDescription + " "+ color.RMA_ChangeColor_Utility("Is Found On Application Screen And Hence Testing Is DisContinued", 1));
				}
			}
			Assert.assertTrue(Element == null);
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Following Object"+ " " + ObjectDescription + " "+ "Negative Existence Verification Is Unsuccessful Due To Reason" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1) );
			}
			else
			{
				logger.log(LogStatus.FAIL, "Following Object"+ " " + ObjectDescription + " "+ "Negative Existence Verification Is Unsuccessful Due To Reason" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1) );
			}
			throw (e);
		}
	}

	//===================================================================================================================================================================================================================================
	//FunctionName 		: RMA_WebElementNotExist_Utility
	//Description  		: To Check The Non-Existence Of A Web Element 
	//Input Parameter 	: WebElement Element : WebElement Whose Existence Is To Be Checked And ObjectDescription : Description Of The Object Whose Existence Needs To Be Checked
	//Revision			: 0.0 - KumudNaithani-11-30-2015                                 
	//===================================================================================================================================================================================================================================
	public static void RMA_ElementNotExist_Utility1(WebElement Element, String ObjectDescription,int logval) throws Exception, Error
	{

		try {
			ObjectDescription = color.RMA_ChangeColor_Utility(ObjectDescription, 4);
			WebElement elmnt=Element;


		} catch (NoSuchElementException ee) {
			Element=null;
			if (logval ==0)
			{
				if(Element==null)
				{
					parentlogger.log(LogStatus.PASS, "Following Object:" + " " + ObjectDescription + " "+ "Is Not Found On Application Screen And Hence We Can Continue With Testing");
				}
			}
			else
			{
				logger.log(LogStatus.PASS, "Following Object:" + " " + ObjectDescription + " "+ "Is Not Found On Application Screen And Hence We Can Continue With Testing");
			}
			//throw (e);
		}
	}


	//===========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_NegVerifyMultipleDataInWebList
	//Description  		: Enables The User To Verify Two Expected Values In Two Different Columns,After Finding An Unique Row Based Upon Unique Searched Text Provided  
	//Input Parameter 	:  SearchedText: Provide Unique Text From UXGrid, UXGridDescription:GridDescription,ExpectedValue1,ExpectedCol1,ExpectedValue2,ExpectedCol2,logval
	//Revision			: 0.0 - RenuVerma-10-13-2016                               
	//===============================================================================================================================================================================================================================================
	public static void RMA_NegVerifyMultipleDataInWebList(WebElement Element,String WebListTextToBeVerified, String ObjDesc, int logval ) throws Exception,Error		
	{
		String[] TextToBeVerified= WebListTextToBeVerified.split(";");
		boolean match=false;
		try
		{	
			Select WList = new Select (Element);

			List<WebElement> options = WList.getOptions();  


			for (int i=0; i<TextToBeVerified.length; i++) 
			{  
				for(WebElement we:options)  
				{
					if (we.getText().equals(TextToBeVerified[i])){				    		
						if (logval == 0)
						{
							parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Corresponding List Element "+ color.RMA_ChangeColor_Utility(TextToBeVerified[i],1)+" Is Available In " +color.RMA_ChangeColor_Utility(ObjDesc,4)+" Hence Can Not Continue Testing.", 3) );
						}
						else
						{
							logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Corresponding List Element Is "+color.RMA_ChangeColor_Utility(TextToBeVerified[i],1)+" Is Available In " +color.RMA_ChangeColor_Utility(ObjDesc,4)+" Hence Can Not Continue Testing.", 3) );
						}
						match = true;
						Assert.assertTrue(!match);
						break ;
					}				    	
				}
				if(!match){
					if (logval == 0)
					{
						parentlogger.log(LogStatus.PASS, color.RMA_ChangeColor_Utility("Corresponding List Element "+ color.RMA_ChangeColor_Utility(TextToBeVerified[i],2)+" Is Not Available In " +color.RMA_ChangeColor_Utility(ObjDesc,4)+" Hence Continue Testing.", 3) );
					}
					else
					{
						logger.log(LogStatus.PASS, color.RMA_ChangeColor_Utility("Corresponding List Element "+ color.RMA_ChangeColor_Utility(TextToBeVerified[i],2)+" Is Not Available In " +color.RMA_ChangeColor_Utility(ObjDesc,4)+ " Hence Continue Testing.", 3) );
					}
				}

			}  
		}catch(Exception|Error e)
		{
			throw(e);
		}
	}
	//========================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_NoPartialTextVerification
	//Description  		: To Compare Two String Values 
	//Input Parameter 	: ExpectedString, ActualString Containing The Values Of The Values To Be Compared And ObjjDesc Contains Comparison Description To Be Passed In Log Statement
	//Revision			: 0.0 - RenuVerma-10-18-2018                                 
	//==============================================================================================================================================================================================================================================================================================================================================================================================
	public static void RMA_NoPartialTextVerification(String ExpectedString, String ActualString, String ObjDesc, int logval) throws Exception, Error
	{
		try {
			String ActualStringLabel;
			String ExpectedStringLabel;
			//Local Variable Declaration

			ActualStringLabel = color.RMA_ChangeColor_Utility(ActualString, 2);
			ExpectedStringLabel = color.RMA_ChangeColor_Utility(ExpectedString, 3);

			if (!ActualString.contains(ExpectedString)){
				if (logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Expected Value" + " "+ ExpectedStringLabel + " " + "Is Not Present In Actual Value" + " " + ActualStringLabel + " "  + "Hence" + " " + ObjDesc + " " + "No Partial Text Verification Is Successful" );
				}
				else
				{

					logger.log(LogStatus.PASS, "Expected Value" + " "+ ExpectedStringLabel + " " + "Is Not Present In Actual Value" + " " + ActualStringLabel + " "  + "Hence" + " " + ObjDesc + " " + "No Partial Text Verification Is Successful" );
				}
			}
			else{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Expected Value", 1) + " "+ ExpectedStringLabel + " " + color.RMA_ChangeColor_Utility("Is Present Partially In Actual Value", 1) + " " + ActualStringLabel + " "  + color.RMA_ChangeColor_Utility("Hence No Partial Text Verification Is Not Successful For ", 1) + " " + ObjDesc); 
				}

				else
				{
					logger.log(LogStatus.FAIL, color.RMA_ChangeColor_Utility("Expected Value", 1) + " "+ ExpectedStringLabel + " " + color.RMA_ChangeColor_Utility("Is Present Partially In Actual Value", 1) + " " + ActualStringLabel + " "  + color.RMA_ChangeColor_Utility("Hence No Partial Text Verification Is Not Successful For ", 1)+ " " + ObjDesc ); 
				}
			}
			Assert.assertTrue(!ActualString.contains(ExpectedString));
		} catch (Exception|Error e) {
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Partial Text Value Comparison For Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + "And Actual Value" + " " + color.RMA_ChangeColor_Utility(ActualString, 3) + " "  + "Is Not Successful And Error Occurred Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{
				logger.log(LogStatus.FAIL, "Partial Text Value Comparison For Expected Value" + " "+ color.RMA_ChangeColor_Utility(ExpectedString, 3) + " " + "And Actual Value" + " " + color.RMA_ChangeColor_Utility(ActualString, 3) + " "  + "Is Not Successful And Error Occurred Is :" +" " +color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			throw (e);
		}
	}
	//=====================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_VerifyUXGrid_Utility
	//Description  		: Enables The User To Verify Two Expected Values In Two Different Columns,After Finding An Unique Row Based Upon Unique Searched Text Provided  
	//Input Parameter 	:  SearchedText: Provide Unique Text From UXGrid, UXGridDescription:GridDescription,ExpectedColHeadersToBeVerified: Expected Col Headers To Be Verified separated by ';'(e.g. Reserve Type, Balance on Financial Reserve Grid),ExpectedValuesToBeVerified:Expected Values To Be Verified (e.g. Reserve Type value, Balance value on Financial Reserve Grid),logval
	//Revision			: 0.0 - RenuVerma-06-07-2017                               
	//=====================================================================================================================================================================================================================================================
	public static void RMA_NegativeVerifyUXGrid_Utility(String SearchedText, String UXGridDescription,  String ExpectedColHeader,int logval ) throws Exception,Error		
	{
		int FoundRow;// To find row id of search text
		int FoundCol;// to find column index of the given expected value
		String SearchedTextActual;
		try
		{					
			SearchedTextActual=null;//initialize 
			FoundRow = -1;
			FoundCol=-1;
						
			List<WebElement> UX_row = driver.findElements(By.xpath(".//*[@class='ui-grid-row ng-scope']"));// Xpath of the Row of The UX grid
	
					List<WebElement> UX_Headercolumn = driver.findElements(By.xpath(".//*[@class='ui-grid-header-cell-label ng-binding']"));// xpath for the column header
					for(int j=0; j< UX_Headercolumn.size(); j++)// run the loop for each DOM column header matching with the given expected column header
					{
						SearchedTextActual =((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", UX_Headercolumn.get(j) ).toString();
						if (SearchedTextActual.trim().equalsIgnoreCase(ExpectedColHeader.trim()))// If DOM column header is equal to given expected column header
						{
							FoundCol = j;// store value in FoundCol
							break;
						}
					}
					if(FoundCol==-1){
						if (logval == 0)
						{
							parentlogger.log(LogStatus.FAIL, "Expected Column Header : " +" " +color.RMA_ChangeColor_Utility(ExpectedColHeader,2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
						}
						else
						{
							logger.log(LogStatus.FAIL, "Expected Column Header : " +" " +color.RMA_ChangeColor_Utility(ExpectedColHeader,2) +" " +"Is Not Found In " +" " + color.RMA_ChangeColor_Utility(UXGridDescription,4) +" " +color.RMA_ChangeColor_Utility(", Hence Verification Can Not Be Done",1));
						}

						Assert.assertTrue(!SearchedTextActual.equalsIgnoreCase(ExpectedColHeader.trim()));
					}
					else{
						System.out.println("FoundCol"+FoundCol+" And uxrow:"+UX_row.size());
					for(int i = 0; i< UX_row.size(); i++) // run the loop to which DOM row matching with the given expected SearchedText
					{
						SearchedTextActual=null;//initialize 
						WebElement Element =UX_row.get(i).findElement(By.xpath(".//*[@class='ng-isolate-scope']"));// Xpath of the Row value The UX grid
						List<WebElement> UX_column = Element.findElements(By.cssSelector("div[class^='ui-grid-cell ng-scope ui-grid-coluiGrid']"));// CSS Selector of the Corresponding Column of the  Search Text row Of The UX grid
						//SearchedTextActual = UX_column.get(j).getText().trim();//Get each search text value
						System.out.println(" And UX_column:"+UX_column.size());
						SearchedTextActual =((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", UX_column.get(FoundCol) ).toString();
						System.out.println(SearchedTextActual.trim());
						System.out.println(SearchedText.trim());
						if (SearchedTextActual.trim().equalsIgnoreCase(SearchedText.trim()))// compare DOM column to the corresponding row with the given expected SearchedText
						{
							
							FoundRow = i;// Store row 
							break ;
						}

					}
					System.out.println("FoundRow"+FoundRow);
					if (FoundRow != -1)// if given searched text found
					{
						if (logval == 0)
						{
							parentlogger.log(LogStatus.FAIL, "Expected Values : " +" " +color.RMA_ChangeColor_Utility(SearchedText.toString(),3) +" Are Matched With Actual Values :"+" " +color.RMA_ChangeColor_Utility(SearchedTextActual,2) +" , In Column :" +" " +color.RMA_ChangeColor_Utility(ExpectedColHeader,4)+", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Negative Verification Is Not Successfull");
							parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UX Grid Verfication", UXGridDescription)));

						}
						else
						{
							logger.log(LogStatus.FAIL, "Expected Values : " +" " +color.RMA_ChangeColor_Utility(SearchedText.toString(),3) +" Are Matched With Actual Values :"+" " +color.RMA_ChangeColor_Utility(SearchedTextActual,2) +", In Column :" +" " +color.RMA_ChangeColor_Utility(ExpectedColHeader,4)  +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+", And Hence Negative Verification Is Not Successfull");
							parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UX Grid Verfication", UXGridDescription)));

						}
						Assert.assertTrue(FoundRow==-1);
					}
					else// if found column text value is not equal to expected value
					{
						if (logval == 0)
						{
							parentlogger.log(LogStatus.PASS, "Expected Values : " +" " +color.RMA_ChangeColor_Utility(SearchedText.toString(),3) +" Are Not Matched With Actual Values :"+" " +color.RMA_ChangeColor_Utility(SearchedTextActual,2) +" , In Column :" +" " +color.RMA_ChangeColor_Utility(ExpectedColHeader,4) +", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+color.RMA_ChangeColor_Utility(", And Hence Negative Verification Is  Successfull",2));
							parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UX Grid Verfication", UXGridDescription)));

						}
						else
						{ 
							logger.log(LogStatus.PASS, "Expected Values : " +" " +color.RMA_ChangeColor_Utility(SearchedText.toString(),3) +" Are Not Matched With Actual Values :"+" " +color.RMA_ChangeColor_Utility(SearchedTextActual,2) +" , In Column :" +" " +ExpectedColHeader+", In"+" " +color.RMA_ChangeColor_Utility(UXGridDescription,4) +" "+color.RMA_ChangeColor_Utility(", And Hence Negative Verification Is Successfull",2));
							parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "UX Grid Verfication", UXGridDescription)));

						}

					}	

				}
		}
			catch(Exception|Error e)
			{
				throw(e);
			}
		}
	}
