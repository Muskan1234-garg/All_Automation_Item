package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_LOB_ResIncBalOptions{
	public static WebElement Element = null;


	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PaymentParaSetup_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_ParameterSetup_Img_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("Save")); 
		return Element;
	} 

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_Tab_ReserveIncurredBalanceOptions
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve/Incurred Balance Options Tab On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_Tab_ReserveIncurredBalanceOptions(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='LINKTABSReserveIncurredBalanceOptions']")); 
		return Element;
	} 

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_Chk_CalculateRecoveryReserveToTotalClaimReserveBalance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Calculate Recovery Reserve To Total Claim Reserve Balance CheckBox On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_Chk_CalculateRecoveryReserveToTotalClaimReserveBalance (WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='LINKTABSReserveIncurredBalanceOptions']")); 
		return Element;
	} 
	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_Chk_CalculateCollectionsinReserveBalance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Calculate Collections in Reserve Balance CheckBox On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_Chk_CalculateCollectionsinReserveBalance (WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='chkCollResBal']")); 
		return Element;
	} 

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_Chk_CalculateCollectionsinReserveBalancePerReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Calculate Collections in Reserve Balance Per Reserve CheckBox On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_Chk_CalculateCollectionsinReserveBalancePerReserve (WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='chkCollResBalPerRsv']")); 
		return Element;
	} 

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_Chk_CalculateRecoveryReserveToTotalClaimIncurredBalance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Calculate Recovery Reserve To Total Claim Incurred Balance CheckBox On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_Chk_CalculateRecoveryReserveToTotalClaimIncurredBalance (WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='chkAddRecoveryReservetoTotalIncurredAmount']")); 
		return Element;
	} 

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_Chk_CalculateCollectionsinIncurredBalance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Calculate Collections in Incurred Balance CheckBox On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_Chk_CalculateCollectionsinIncurredBalance (WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='chkCollIncBal']")); 
		return Element;
	} 



	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_Chk_CalculateCollectionsinIncurredBalance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Calculate Collections in Incurred Balance Per Reserve CheckBox On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_Chk_CalculateCollectionsinIncurredBalancePerReserve (WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='chkCollIncBalPerRsv']")); 
		return Element;
	} 
	
	//================================================================================================================================================================================================================
		//FunctionName 			: RMAApp_LOB_LstBox
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Line of Business List Box On RMA Application Line Of Business Parameter Setup Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - NidhiJha-07-24-2017                                 
		//================================================================================================================================================================================================================

		public static WebElement RMAApp_LOB_LstBox (WebDriver driver)
		{
			Element = driver.findElement(By.xpath(".//*[@id='lstLOB']")); 
			return Element;
		}

	
	
	
}
