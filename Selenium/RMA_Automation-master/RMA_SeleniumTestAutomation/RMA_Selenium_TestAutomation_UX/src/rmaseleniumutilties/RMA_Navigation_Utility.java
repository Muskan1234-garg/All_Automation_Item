package rmaseleniumutilties;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

public class RMA_Navigation_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String MDIWebElementName;
	static rmaseleniumutilties_UX.RMA_GenericUsages_Utility color = new rmaseleniumutilties_UX.RMA_GenericUsages_Utility();
	//============================================================================================
	//FunctionName 		: RMA_MDIMenuClick
	//Description  		: To Click MDI Menu WebElement
	//Input Parameter 	: String :Pass Name Of MDI Menu Items To Be Clicked Separated By Semi Colon And logval value
	//Revision			: 0.0 - ImteyazAhmad-06-13-2016         
	//Modified By	: 0.0 - RenuVerma-04-14-2017: replace object click instead of action click
	//============================================================================================
	public static void RMA_MDIMenuClick(String MDIMenuItems, int logval) throws Exception,Error
	{

		try{
			String[]  MdiMenuList = MDIMenuItems.split(";");
			String JoinedElement;
			int m;
			for (String obj:MdiMenuList)
			{
				MDIWebElementName = obj;
				List<WebElement> Element = driver.findElements(By.xpath(".//*[text()='"+MDIWebElementName+"']"));
				if (Element.size() > 0)
				{				
					for (m=0; m<Element.size();m++)
					{	
						if (Element.get(m).isDisplayed())
						{
							rmaseleniumutilties_UX.RMA_Navigation_Utility.RMA_ObjectClick(Element.get(m), MDIWebElementName+" "+"On MDI Menu", logval);
							Thread.sleep(4000);
							break;
						}
					}
				}
				else
				{
					if (logval == 0)
					{
						parentlogger.log(LogStatus.FAIL, "The MDI Menu WebElement :"+" "+MDIWebElementName+" " +"Does Not Exist In MDI Menu Hence It Can Not Be Clicked, Please Check Text Provided For MDI Menu Click Method");
					}
					else
					{		
						logger.log(LogStatus.FAIL, "The MDI Menu WebElement :"+" "+MDIWebElementName+" " +"Does Not Exist In MDI Menu Hence It Can Not Be Clicked, Please Check Text Provided For MDI Menu Click Method");
					}
					Assert.fail();
				}
			}		
			JoinedElement =StringUtils.join( MdiMenuList," =>> ");

			//RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As" +" " +JoinedElement +" " +"Page Is Loaded");
			globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='pleaseWaitFrame']/img")));// Wait For Load Image To Be Disappear
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, color.RMA_ChangeColor_Utility(JoinedElement,4) +" "+"Page Is Loaded");
			}
			else
			{		
				logger.log(LogStatus.INFO, color.RMA_ChangeColor_Utility(JoinedElement,4) +" "+"Page Is Loaded");
			}

		}catch(Exception|Error e)
		{

			if (logval == 0)
			{
				parentlogger.log(LogStatus.FAIL, "The MDI Menu WebElement :"+" "+MDIWebElementName+" " +"Is Not Clicked Successfully And Error Message Is :" +" "+color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}
			else
			{		
				logger.log(LogStatus.FAIL, "The MDI Menu WebElement :"+" "+MDIWebElementName+" " +"Is Not Clicked Successfully And Error Message Is :" +" "+color.RMA_ChangeColor_Utility(e.getMessage(),1));
			}	
			throw(e);
		}
	}

	//============================================================================================================================================================
	//FunctionName 		: RMA_ToolTip_Verification
	//Description  		: To Tool Tip Information While Doing mouse hover
	//Input Parameter 	: Element:  field where do mouse hover
	//Revision			: 0.0 - ShrutiShruti-03-07-2018    
	// ==========================================================================================================================================================
	public static void RMA_ToolTip_Verification(WebElement Element, String ExpectedToolTipText, String ObjDesc, int logval) throws Exception,Error
	{	
		String ActualToolTipText;
		try{			
			// Use action class to mouse hover on given element
			Actions action = new Actions(driver);
			action.moveToElement(Element).build().perform();
			//WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));

			// To get the tool tip text and assert
			ActualToolTipText= Element.getAttribute("title");


			if (ExpectedToolTipText.equalsIgnoreCase(ActualToolTipText)){
				if (logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Expected ToolTip" + " "+ color.RMA_ChangeColor_Utility(ExpectedToolTipText, 3) + " " + "And Actual ToolTip" + " " + color.RMA_ChangeColor_Utility(ActualToolTipText, 2) + " "  + "Are Same And Hence" + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + "ToolTip Verification Is Successful" );
				}
				else
				{

					logger.log(LogStatus.PASS, "Expected ToolTip" + " "+ color.RMA_ChangeColor_Utility(ExpectedToolTipText, 3) + " " + "And Actual ToolTip" + " " + color.RMA_ChangeColor_Utility(ActualToolTipText, 2) + " "  + "Are Same And Hence" + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + "ToolTip Verification Is Successful" );
				}
			}

			else{

				if (logval == 0)
				{
					parentlogger.log(LogStatus.FAIL, "Expected ToolTip" + " "+ color.RMA_ChangeColor_Utility(ExpectedToolTipText, 3) + " " + "And Actual ToolTip" + " " + color.RMA_ChangeColor_Utility(ActualToolTipText, 2) + " "  + "Are Not Same And Hence" + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + "ToolTip Verification Is UnSuccessful" );
				}
				else
				{

					logger.log(LogStatus.FAIL, "Expected ToolTip" + " "+ color.RMA_ChangeColor_Utility(ExpectedToolTipText, 3) + " " + "And Actual ToolTip" + " " + color.RMA_ChangeColor_Utility(ActualToolTipText, 2) + " "  + "Are Not Same And Hence" + " " + color.RMA_ChangeColor_Utility(ObjDesc, 4) + " " + "ToolTip Verification Is UnSuccessful" );
				}

			}
			Assert.assertEquals(ActualToolTipText, ExpectedToolTipText);
		}
		catch(Exception|Error e){
			if (logval ==0)
			{
				parentlogger.log(LogStatus.FAIL, "Following Exception Occurred While Verifying ToolTip Content "  + e.getMessage() );  
			}
			else
			{
				logger.log(LogStatus.FAIL, "Following Exception Occurred While Verifying ToolTip Contents" +  " " + e.getMessage() );   
			}
			throw(e);
		}
	}

}

