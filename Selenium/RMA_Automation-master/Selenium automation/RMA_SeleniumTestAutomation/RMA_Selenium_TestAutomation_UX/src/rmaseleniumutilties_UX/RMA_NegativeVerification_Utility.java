package rmaseleniumutilties_UX;

import java.util.List;
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
}
