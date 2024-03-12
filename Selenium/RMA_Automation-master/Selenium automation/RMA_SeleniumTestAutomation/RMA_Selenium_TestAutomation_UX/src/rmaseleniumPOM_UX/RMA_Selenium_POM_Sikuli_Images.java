package rmaseleniumPOM_UX;

import org.sikuli.script.Pattern;
public class RMA_Selenium_POM_Sikuli_Images {

	public static Pattern pattern;

	//============================================================================================
	//FunctionName 			: RMAApp_Comment_Btn_Print
	//Description  			: To Fetch Unique Images On The Basis Of Which Print Button On RMA Application Comment Page Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-06-16-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_Comment_Btn_Print()
	{
		pattern = null;
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\Print.JPG");//Unique Images Of Print Button On RMA Application Comment Page Is Fetched
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ChromeDownload_Img_DownloadIcon
	//Description  			: To Fetch Unique Images On The Basis Of Which Open Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-09-014-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_ChromeDownload_Img_DownloadIcon()
	{
		pattern = null;
		try {
			pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\DownloadPdfChrome.jpeg");//Unique Images Of Open Button On RMA Application Download/Save Notification PopUp Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ChromeDownload_Img_PdfIcon
	//Description  			: To Fetch Unique Images On The Basis Of Which Open Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-09-05-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_ChromeDownload_Img_PdfIcon()
	{
		pattern = null;
		try {
			pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\PdfSymbol.JPG");//Unique Images Of Open Button On RMA Application Download/Save Notification PopUp Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Print_Btn_Cancel
	//Description  			: To Fetch Unique Images On The Basis Of Which Open Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-06-16-2017                             
	// ============================================================================================
	public static Pattern RMAApp_Print_Btn_Cancel()
	{
		pattern = null;
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\Cancel1.png");//Unique Images Of Open Button On RMA Application Download/Save Notification PopUp Is Fetched
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ChromeDownload_Img_MoveToVisibleDownloadButton
	//Description  			: To Fetch Unique Images On The Basis Of Which Open Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-09-014-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_ChromeDownload_Img_MoveToVisibleDownloadButton()
	{
		pattern = null;
		try {
			pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\MoveToVisibleDownloadButton.jpeg");//Unique Images Of Open Button On RMA Application Download/Save Notification PopUp Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ViewDownloads_Btn_Open
	//Description  			: To Fetch Unique Images On The Basis Of Which Open Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-09-05-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_Download_Btn_Open()
	{
		pattern = null;
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\Open.jpeg");//Unique Images Of Open Button On RMA Application Download/Save Notification PopUp Is Fetched
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ChromeDownload_Img_CloseDownloadBarButton
	//Description  			: To Fetch Unique Images On The Basis Of Which Close Button On RMA Application Chrome Download Bar Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - AnubhutiVyas-10-25-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_ChromeDownload_Img_CloseDownloadBarButton()
	{
		pattern = null;
		try {
			pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\CloseDownloadBarChrome.jpg");//Unique Images Of Close Button On RMA Application Chrome Download Bar Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pattern;
	} 
	/*//============================================================================================
	//FunctionName 			: RMAApp_XMLImport_Btn_GenerateTemplate
	//Description  			: To Fetch Unique Images On The Basis Of Which Generate Template Button On RMA Application Utilities--> Technicians--> XML Import--> XML Import Template Generation Page Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-12-22-2016                                 
	// ============================================================================================
	public static Pattern RMAApp_XMLImport_Btn_GenerateTemplate()
	{
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\GenerateTemplate.jpeg");//Unique Images Of Generate Template Button On RMA Application Utilities--> Technicians--> XML Import--> XML Import Template Generation Page Is Fetched
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_XMLImport_Text_XMLDownload
	//Description  			: To Fetch Unique Images On The Basis Of Which XML Download Text On RMA Application Utilities--> Technicians--> XML Import--> XML Import Template Generation Page Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-12-22-2016                                 
	// ============================================================================================
	public static Pattern RMAApp_XMLImport_Text_XMLDownload(String RMAApp_BrowserName)
	{
		if(RMAApp_BrowserName.equalsIgnoreCase("IE"))
		{
			pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\XMLDownload_IE.jpeg");//Unique Images Of XML Download Text On RMA Application Utilities--> Technicians--> XML Import--> XML Import Template Generation Page Is Fetched
		}
		if(RMAApp_BrowserName.equalsIgnoreCase("Chrome"))
		{
			pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\XMLDownload_Chorme.jpeg");//Unique Images Of XML Download Text On RMA Application Utilities--> Technicians--> XML Import--> XML Import Template Generation Page Is Fetched
		}
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SavePopUp_Btn_Save
	//Description  			: To Fetch Unique Images On The Basis Of Which Save Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-12-22-2016                                 
	// ============================================================================================
	public static Pattern RMAApp_SavePopUp_Btn_Save()
	{
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\Save.jpeg");//Unique Images Of Save Button On RMA Application Download/Save Notification PopUp Is Fetched
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PopUp_Btn_CloseX
	//Description  			: To Fetch Unique Images On The Basis Of Which Close X Image On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-12-22-2016                                 
	// ============================================================================================
	public static Pattern RMAApp_PopUp_Btn_CloseX()
	{
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\CloseX.jpeg");//Unique Images Of Close X Image On RMA Application Download/Save Notification PopUp Is Fetched
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ViewDownloads_Btn_Open
	//Description  			: To Fetch Unique Images On The Basis Of Which Open Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-01-23-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_Download_Btn_Open()
	{
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\Open.jpeg");//Unique Images Of Open Button On RMA Application Download/Save Notification PopUp Is Fetched
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SaveAsPopUp_Btn_OK
	//Description  			: To Fetch Unique Images On The Basis Of Which OK Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-01-23-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_SaveAsPopUp_Btn_OK()
	{
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\OK.jpeg");//Unique Images Of OK Button On RMA Application Download/Save Notification PopUp Is Fetched
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Downloads_Btn_SaveOptionArrow
	//Description  			: To Fetch Unique Images On The Basis Of Which OK Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-01-23-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_Downloads_Btn_SaveOptionArrow()
	{
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\SaveOptionArrow.JPG");//Unique Images Of OK Button On RMA Application Download/Save Notification PopUp Is Fetched
		return pattern;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Downloads_Btn_SaveOptionArrow
	//Description  			: To Fetch Unique Images On The Basis Of Which ClearList Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-01-23-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_Downloads_Btn_ClearList()
	{
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\ClearList.JPG");//Unique Images Of ClearList Button On RMA Application Download/Save Notification PopUp Is Fetched
		return pattern;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Downloads_Btn_SaveAs
	//Description  			: To Fetch Unique Images On The Basis Of Which SaveAs Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-01-23-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_Downloads_Btn_SaveAs()
	{
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\SaveAs.JPG");//Unique Images Of SaveAs Button On RMA Application Download/Save Notification PopUp Is Fetched
		return pattern;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PDF_Txt_Password
	//Description  			: To Fetch Unique Images On The Basis Of Which SaveAs Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-01-23-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_PDF_Txt_Password()
	{
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\textBox.JPG");//Unique Images Of SaveAs Button On RMA Application Download/Save Notification PopUp Is Fetched
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Screen_Img_Close
	//Description  			: To Fetch Unique Images On The Basis Of Which Close Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-01-23-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_Screen_Img_Close()
	{
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\CloseWindow.JPG");//Unique Images Of close Button On RMA Application Download/Save Notification PopUp Is Fetched
		return pattern;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ChromeDownload_Img_PdfIcon
	//Description  			: To Fetch Unique Images On The Basis Of Which Open Button On RMA Application RMA Application Download/Save Notification PopUp Can Be Identified
	//Input Parameter 		: pattern Variable Of The Type Pattern		 
	//Revision				: 0.0 - RenuVerma-01-23-2017                                 
	// ============================================================================================
	public static Pattern RMAApp_ChromeDownload_Img_PdfIcon()
	{
		pattern= new Pattern(System.getProperty("user.dir")+"\\RMASeleniumTestImages\\PdfSymbol.JPG");//Unique Images Of Open Button On RMA Application Download/Save Notification PopUp Is Fetched
		return pattern;
	}*/
}