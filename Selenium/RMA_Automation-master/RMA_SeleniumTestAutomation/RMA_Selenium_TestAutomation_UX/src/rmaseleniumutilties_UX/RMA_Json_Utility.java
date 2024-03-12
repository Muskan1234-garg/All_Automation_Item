package rmaseleniumutilties_UX;

import javax.net.ssl.HttpsURLConnection;
import org.json.simple.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties_UX.RMA_Verification_Utility;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
//RMA Package Import Completed

public class RMA_Json_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static rmaseleniumutilties_UX.RMA_GenericUsages_Utility color = new rmaseleniumutilties_UX.RMA_GenericUsages_Utility();
	public static String ReturnValue;
	public static String EntName;
	
	
	//====================================================================================================
		//FunctionName 		: RMA_Json_Operation_Utility
		//Description  		: Enables The User To Perform Json Operations Like Post, Put And Delete  
		//Input Parameter 	: ObjJsonOperation Stores Type Of Operation , JsonFileName Is The File Path With Input Json, Url Is The Request Url , Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger" 
		//Revision			: 0.0 - HarshVardhan-Aug 8-2019                               
		//====================================================================================================
		public static String RMA_Json_Operation_Utility(String ObjJsonOperation, JSONObject data, URL ReqUrl ,int Intlogval) throws Exception, Error
		{
			//File file = new File(JsonFileName);
			String response = null ;
			String JsonResponse = null;
			String AuthorizationT =  Authorization_Token;
			String Url = ReqUrl.toString();
	        try {

			if (Intlogval == 0)
					{
				parentlogger.log(LogStatus.INFO,ObjJsonOperation+ " Json Operation for URL " +Url+ " is performed.");
					}
			else
					{	
				logger = reports.startTest("<span id= 'JsonOperation'>Json Operation Process</span>", ObjJsonOperation+ " Json Operation for URL " +Url+ " is performed.");
					}

	        	//String Url = ReqUrl.toString();
	        	//logger = reports.startTest("<span id= 'JsonOperation'>Json Operation Process</span>", ObjJsonOperation+ " Json Operation for URL " +Url+ " is performed.");
	        	//JSONParser parser = new JSONParser(); // Please check for usage
	            //Use JSONObject for simple JSON and JSONArray for array of JSON.
	            //JSONObject data = (JSONObject) parser.parse(new FileReader(file.getAbsolutePath()));//path to the JSON file.
	            System.out.println(data.toJSONString());
	            
	            //String Authorization = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJ1bmlxdWVfbmFtZSI6Ijc2YTRhYWJiLTg2MGQtNGI0Mi05OGQ2LTAwNzNmYjIzMDVlNCIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvdXNlcmRhdGEiOiIwIiwiaXNzIjoiaHR0cDovL3d3dy5yaXNrbWFzdGVyLmNvbSIsImF1ZCI6IkhBTCIsIm5iZiI6MTU2NzM2MjU4M30.hZ-_qB18py9Znm4UndtV4_JSBehV2McSlnj7MvW1rZOTRxbJFJQxiY1IwwtfTv53tzFN23eElhPWVWfjgdtcy3_D8_ylRyImjsZOxwFsYLOkFl2pNoQrB3Ax9P7j3vLx8-6eEiO5qwLIl8urg7ZhidAu6panIBafQGia-HxqL507jWoJjROB1vZ_nfYCj8reKyxygRxrGDLnIpX1qYucgPtEZeJ0w0KNsEudEq_2hkHm39sxxtcqBhCMwalbAlbKda85RphD9paNDPjA1VUtmKoXydpJ3Yi69isC9D61KfCIxh7kCM0zkzckwLzRgCQ_Z44Ex0SM9kiCj-uE7ru5Qw";
	            
	            //URL ReqUrl = new URL(Url);
	            HttpsURLConnection conn = (HttpsURLConnection) ReqUrl.openConnection();
	            conn.setRequestMethod(ObjJsonOperation.toUpperCase());
	            conn.setRequestProperty("Content-Type", "application/json");
	            conn.setRequestProperty("Accept", "application/json");
	            conn.setRequestProperty("Authorization", AuthorizationT);

	            conn.setDoOutput(true);
	            OutputStream outStream = conn.getOutputStream(); // Check whether actually required
	            OutputStreamWriter outStreamWriter = new OutputStreamWriter(outStream, "UTF-8"); //
	            outStreamWriter.write(data.toJSONString());
	            outStreamWriter.flush();
	            //outStreamWriter.close();
	            //outStream.close();
	            System.out.println(conn.getResponseCode());
	            System.out.println(conn.getResponseMessage());
	            
	            RMA_Verification_Utility.RMA_TextCompare("OK",conn.getResponseMessage(),"Verifying Response Message In Case Of Successfull Json Operation",Intlogval);
	            
	            
	            Thread.sleep(3000);
	            
	            DataInputStream input = null;
	            input = new DataInputStream (conn.getInputStream());
	            while (null != ((response = input.readLine()))) {
	            	JsonResponse = response;    
	            	System.out.println(response);
	                //input.close ();
	                System.out.println("Input is closed");
	            }
	            //outStreamWriter.close();
	            //outStream.close();
	            if(Intlogval == 0)
				{
					parentlogger.log(LogStatus.PASS, ObjJsonOperation+ " Json Operation for URL " +Url+ " Is Completed Successfully");
					
				}
				else
				{
					logger.log(LogStatus.PASS, ObjJsonOperation+ " Json Operation for URL " +Url+ " Is Completed Successfully");
					
				}
	        
	        }
	        
	        catch (Exception|Error e) {
	        	if (Intlogval == 0)
				{
	        		parentlogger.log(LogStatus.FAIL, ObjJsonOperation+ " Json Operation for URL " +Url+ " Is Failed");
				}else{	
					logger.log(LogStatus.FAIL, ObjJsonOperation+ " Json Operation for URL " +Url+ " Is Failed");
				}
				throw (e);
			}
	        System.out.println("Check for Response");
	        System.out.println(JsonResponse);
	        return JsonResponse;
		}
		

		//====================================================================================================
		//FunctionName 		: RMA_Json_User_Creation_Utility
		//Description  		: Enables The User To Create Riskmaster User By Posting A Json  
		//Input Parameter 	: ObjJsonOperation Stores Type Of Operation , JsonFileName Is The File Path With Input Json, Url Is The Request Url , Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger" 
		//Revision			: 0.0 - HarshVardhan-Aug 8-2019                               
		//====================================================================================================
		public static int RMA_Json_User_Creation_Utility( String UserFName , String UserLName ,String ObjUsername, String ObjPassword, String UserEmail , int ManagerId, int ModuleGroupID ,int Intlogval) throws Exception, Error
		{
			
			String response1 = null;
			String response2 = null;
			int UserId;
			int DsnId = DataSource_Id ;
			URL AppUrl = new URL (RMAApp_Url);
			
			
	        try {
	        	if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO,"Enables the User To Create New User "+UserFName+" By Json Method ");
				}
				else
				{	
					logger = reports.startTest("<span id='JsonSMSUserCreate'>"+"Create User "+UserFName+" By Json Method</span>", "Enables the User To Create New User "+UserFName+" By Json Method ");
				}
	        	
	        	File file = new File(System.getProperty("user.dir")+"//RMASeleniumJsonTemplates"+"//User_Creation1.json");
	        	JSONParser parser = new JSONParser();
	            //Use JSONObject for simple JSON and JSONArray for array of JSON.
	            JSONObject data = (JSONObject) parser.parse(new FileReader(file.getAbsolutePath()));//path to the JSON file.
	            
	           URL ReqUrl1 = new URL ( AppUrl.getProtocol()+"://"+AppUrl.getAuthority()+"/RiskmasterAPI/security/users" ); 
	           data.put("lastName" , UserLName); // Updated User Last Name in JSON
	           data.put("firstName" , UserFName);// Updated User First Name in JSON
	           data.put("email",UserEmail); // Updated User Email Address
	           data.put("dataSourceId" , String.valueOf(DsnId) ) ; // Updated DSNID in JSON
	           data.put("managerCode" , String.valueOf(ManagerId) ); // Updated ManagerID in JSON

	           
	           
	           System.out.println(data.toJSONString());
	           
	           
	           //response1 = RMA_Json_Operation_Utility("POST",data,new URL ("https://riskmaster-demo.cm-csc.com/RiskmasterAPI/security/users"),Intlogval);
	           response1 = RMA_Json_Operation_Utility("POST",data,ReqUrl1,Intlogval);
	           
	           System.out.println(response1);
	           System.out.println("Check1");
	           JSONObject MyResponse1 = (JSONObject) parser.parse(response1);
	           System.out.println("Check2");
	           JSONObject UserInfo = (JSONObject) MyResponse1.get("userPermInfo"); //new JSONObject (myResponse.toJSONObject("userPermInfo");
	           System.out.println("Check3");
	           String UserName = (String) UserInfo.get("loginName");
	           System.out.println("Check4");
	           System.out.println(UserInfo.toJSONString());
	           UserId = Integer.valueOf(((Long) UserInfo.get("userId")).intValue());
	           
	           System.out.println("Check "+ UserId + UserName);
	           
	           RMA_Verification_Utility.RMA_PartialTextVerification(ObjUsername,UserName,"Verifying The Created User Has Same Login Name As Provided",Intlogval);
	           
	           //Second JSON processing started
	           
	           File file2 = new File(System.getProperty("user.dir")+"//RMASeleniumJsonTemplates"+"//User_Creation2.json");
	           System.out.println("Check5");
	           //parser = new JSONParser();
	            //Use JSONObject for simple JSON and JSONArray for array of JSON.
	           JSONObject data1 = (JSONObject) parser.parse(new FileReader(file2.getAbsolutePath()));//path to the JSON file.
	           
	           URL ReqUrl2 = new URL ( AppUrl.getProtocol()+"://"+AppUrl.getAuthority()+"/RiskmasterAPI/security/userpermissions" ); 
	           System.out.println("Check6");
	           data1.put("loginName" , ObjUsername);
	           System.out.println("Check4");
	           data1.put("password" , ObjPassword);
	           System.out.println("Check4");
	           data1.put("userPermId" , UserId);
	           System.out.println("Check4");
	           data1.put("userId" , UserId);
	           System.out.println("Check4");
	           data1.put("dsnId" , DsnId);
	           System.out.println("Check4");
	           data1.put("selectedModuleGroupId" , ModuleGroupID);
	           
	           System.out.println(data1.toJSONString());
	           
	           //response2 = RMA_Json_Operation_Utility("PUT",data1,new URL ("https://riskmaster-demo.cm-csc.com/RiskmasterAPI/security/userpermissions"),Intlogval);
	           response2 = RMA_Json_Operation_Utility("PUT",data1,ReqUrl2,Intlogval);
	            
	           JSONObject MyResponse2 = (JSONObject) parser.parse(response2);
	           
	           if(Intlogval == 0)
				{
					parentlogger.log(LogStatus.PASS, "A New User Is Created Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFName,3));
					
				}
				else
				{
					logger.log(LogStatus.PASS, "A New User Is Created Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFName,3));
					
				}
	           
	        
	        }
	        
	        catch (Exception|Error e) {
	        	
	        	if (Intlogval == 0)
				{
	        		parentlogger.log(LogStatus.FAIL, "New User Creation By Json Has Failed");
				}else{	
					logger.log(LogStatus.FAIL, "New User Creation By Json Has Failed");
				}
				throw (e);
			}
	        
	        return UserId;

		}

		
		//====================================================================================================
		//FunctionName 		: RMA_Json_User_Group_Utility
		//Description  		: Enables The User To Create Riskmaster User Group By Posting A Json 
		//Input Parameter 	: ObjJsonOperation Stores Type Of Operation , JsonFileName Is The File Path With Input Json, Url Is The Request Url , Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger" 
		//Revision			: 0.0 - HarshVardhan-Aug 8-2019                               
		//====================================================================================================
		
		
		
		public static int RMA_Json_User_Group_Creation_Utility(String GroupName , int CloneModuleId ,int Intlogval) throws Exception, Error
		{
			
			String response1 = null;
			String response2 = null;
			String response3 = null;
			String TCStatus = null;
			JSONObject data = null;
			JSONObject data1 = null;
			JSONObject data2 = null;
			int ModuleGroupID;
			int DsnId = DataSource_Id ;
			URL AppUrl = new URL (RMAApp_Url);
			
			try {
				
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO,"Enables the User To Create New Module Security Group "+GroupName+" By Json Method ");
				}
				else
				{	
					logger = reports.startTest("<span id='JsonModuleGroupCreate'>"+"Create Module Security Group "+GroupName+" By Json Method</span>", "Enables the User To Create New Module Security Group "+GroupName+" By Json Method ");
				}
	        
	        	JSONParser parser = new JSONParser();
	            //Use JSONObject for simple JSON and JSONArray for array of JSON.
	            //path to the JSON file.
	            
	            System.out.println("USer Group");
	           data = new JSONObject(); 
	           data.put("dsnId" , DsnId); 
	           System.out.println("USer Group");
	           data.put("entityType" , "Root Node Module Security Groups");
	           System.out.println("USer Group");
	           data.put("CloneModuleId" , "0" ) ;
	           System.out.println("USer Group");
	           data.put("NewGroupName" , GroupName ); 
	           
	           URL ReqUrl1 = new URL ( AppUrl.getProtocol()+"://"+AppUrl.getAuthority()+"/RiskmasterAPI/security/modules" );
	           
	           System.out.println(data.toJSONString());
	           response1 = new String();
	           //response1 = RMA_Json_Operation_Utility("POST",data,new URL ("https://riskmaster-demo.cm-csc.com/RiskmasterAPI/security/modules"),Intlogval);
	           response1 = RMA_Json_Operation_Utility("POST",data,ReqUrl1,Intlogval);
	            
	           System.out.println(response1);
	          
	           JSONObject MyResponse1 = (JSONObject) parser.parse(response1);
	           
	           
	           
	           System.out.println("First response");
	           ModuleGroupID = Integer.valueOf(((Long) MyResponse1.get("groupId")).intValue()) ;//(int) MyResponse1.get("groupId"); // Get group id of newly created group
	           System.out.println("sECOND response");
	           System.out.println(ModuleGroupID);
	           
	           if (ModuleGroupID==0)
	           {
	        	   TCStatus = "FAIL";
	           }
	           else {
	        	   TCStatus = "PASS"; 
	           }
	           
	           RMA_Verification_Utility.RMA_TextCompare("PASS",TCStatus,"Verifying That The Module Group Is Created Successfull And Has A Module Group Id",Intlogval);
	           
	           //Second JSON processing started for giving module security permissions for utility sub section
	           
	           URL ReqUrl = new URL ( AppUrl.getProtocol()+"://"+AppUrl.getAuthority()+"/RiskmasterAPI/security/access" );
	           
	           JSONArray List = new JSONArray();
	           data1 = new JSONObject(); 
	           data1.put("dsnId" , DsnId); 
	           data1.put("groupId" , ModuleGroupID);
	           data1.put("grantFromFuncId" , "100000" ) ; 
	           List.add("100000");
	           data1.put("grantFuncIDs" , List  ); 
	           System.out.println(data1.toJSONString());
	           //response2 = RMA_Json_Operation_Utility("PUT",data1,new URL ("https://riskmaster-demo.cm-csc.com/RiskmasterAPI/security/access"),Intlogval);
	           response2 = RMA_Json_Operation_Utility("PUT",data1,ReqUrl,Intlogval);
	           
	           
	        	if (response2==null) {
	        		if (Intlogval == 0)
					{
		        		parentlogger.log(LogStatus.FAIL, "Failure While Giving Permissions For All Of Utilities To The Newly Created Module Group");
					}else{	
						logger.log(LogStatus.FAIL, "Failure While Giving Permissions For All Of Utilities To The Newly Created Module Group");
					}
	        	}
	        	else {
	        		if (Intlogval == 0)
					{
		        		parentlogger.log(LogStatus.INFO, "Success While Giving Permissions For All Of Utilities To The Newly Created Module Group");
					}else{	
						logger.log(LogStatus.INFO, "Success While Giving Permissions For All Of Utilities To The Newly Created Module Group");
					}
	        	}
	        	
	        	
	        	//Third JSON processing started for giving module security permissions for RISKMASTER sub module
	           JSONArray List1 = new JSONArray();
	           data2 = new JSONObject(); 
	           data2.put("dsnId" , DsnId); 
	           data2.put("groupId" , ModuleGroupID);
	           data2.put("grantFromFuncId" , "1" ) ;
	           List1.add("1");
	           data2.put("grantFuncIDs" , List1  ); 
	           System.out.println(data.toJSONString());
	           //response3 = RMA_Json_Operation_Utility("PUT",data2,new URL ("https://riskmaster-demo.cm-csc.com/RiskmasterAPI/security/access"),Intlogval);
	           response3 = RMA_Json_Operation_Utility("PUT",data2,ReqUrl,Intlogval);
	           
	           if (response3==null) {
	        		if (Intlogval == 0)
					{
		        		parentlogger.log(LogStatus.FAIL, "Failure While Giving Permissions For All Of RISKMASTER To The Newly Created Module Group");
					}else{	
						logger.log(LogStatus.FAIL, "Failure While Giving Permissions For All Of RISKMASTER To The Newly Created Module Group");
					}
	        	}
	        	else {
	        		if (Intlogval == 0)
					{
		        		parentlogger.log(LogStatus.INFO, "Success While Giving Permissions For All Of RISKMASTER To The Newly Created Module Group");
					}else{	
						logger.log(LogStatus.INFO, "Success While Giving Permissions For All Of RISKMASTER To The Newly Created Module Group");
					}
	        	}
	         
	           
	           if(Intlogval == 0)
				{
					parentlogger.log(LogStatus.PASS, "A New Module Is Added Successfully Having Module Name:" + " " + color.RMA_ChangeColor_Utility(GroupName,3));
					
				}
				else
				{
					logger.log(LogStatus.PASS, "A New Module Is Added Successfully Having Module Name:" + " " + color.RMA_ChangeColor_Utility(GroupName,3));
					
				}
	        
	        }
	        
	        catch (Exception|Error e) {
	        	
	        	if (Intlogval == 0)
				{
	        		parentlogger.log(LogStatus.FAIL, "New Module Group Creation By Json Has Failed");
				}else{	
					logger.log(LogStatus.FAIL, "New Module Group Creation By Json Has Failed");
				}
				throw (e);
			}
	        
			return ModuleGroupID;

		}

		
		//====================================================================================================
		//FunctionName 		: RMA_Json_User_Limit_Setup_Utility
		//Description  		: Enables The User To Set Diff User Limits 
		//Input Parameter 	: ObjJsonOperation Stores Type Of Operation , JsonFileName Is The File Path With Input Json, Url Is The Request Url , Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger" 
		//Revision			: 0.0 - HarshVardhan-Aug 8-2019                               
		//====================================================================================================
		
		
		
		public static void RMA_Json_User_Limit_Setup_Utility(String ObjLineOfBusiness , String ObjLimitType , int ObjUserId , int ObjMaxAmount , int Intlogval) throws Exception, Error
		{
			
			String response1 = null;
			String response2 = null;
			JSONObject data = null;
			String LobId = null ;
			int LimitType = 0 ;
						
			switch (ObjLineOfBusiness.toUpperCase()) {
			
			
			case"GC":
				LobId = "241";
				break;
			case"WC":
				LobId = "243";
				break;
			case"DI":
				LobId = "844";
				break;
			case"PC":
				LobId = "845";
				break;
			case"VA":
				LobId = "242";
				break;
			case"HC":
				LobId = "847";
				break;
			case"LC":
				LobId = "846";
				break;
			default: 
				System.out.println("no match"); 
			}
			
			
			data = new JSONObject();
			
			switch (ObjLimitType.toUpperCase()) {
			
			
			case"RESERVERLIMITS":
				LimitType = 1;
				data.put("reserveTypeCode","0");
				break;
			case"PRINTCHECKLIMITS":
				LimitType = 2;
				break;
			case"PAYMENTLIMITS":
				LimitType = 3;
				break;
			case"PAYDETAILLIMITS":
				LimitType = 4;
				data.put("reserveTypeCode","0");
				break;
			case"PERCLAIMPAYLIMITS":
				LimitType = 7;
				data.put("reserveTypeCode","0");
				data.put("hasOverRideAuthority",false);
				data.put("preventPaymentsAboveLimits",false);
				break;
			case"PERCLAIMINCURREDLIMITS":
				LimitType = 8;
				break;
			default: 
				System.out.println("no match"); 
			}
		
	           
	           // Enabling the Limit started
	           JSONObject data1 = null;
	           data1 = new JSONObject();
	           
	           data1.put("lob",LobId);
	           data1.put("limit",LimitType);
	           data1.put("enableLimit",true);
	           
	           response2 = RMA_Json_Operation_Utility("PUT",data1,new URL ("https://riskmaster-demo.cm-csc.com/RiskmasterAPI/userprivileges"),Intlogval);
	           
	           // Enabling the limit completed
						
			try {
	        
	        	//JSONParser parser = new JSONParser();
	            //Use JSONObject for simple JSON and JSONArray for array of JSON.
	            ;//path to the JSON file.
	            
	        	URL AppUrl = new URL (RMAApp_Url);
	        	
	        	URL ReqUrl = new URL ( AppUrl.getProtocol()+"://"+AppUrl.getAuthority()+"/RiskmasterAPI/userprivileges" );
	        	
	        	 
	            
	           data.put("lob" , LobId); 
	           data.put("limit" , LimitType);
	           data.put("userId" , ObjUserId) ;
	           data.put("maxAmount" , ObjMaxAmount );
	           
	           System.out.println(data.toJSONString());


	           //response1 = RMA_Json_Operation_Utility("POST",data,new URL ("https://riskmaster-demo.cm-csc.com/RiskmasterAPI/userprivileges"),Intlogval);
	           response1 = RMA_Json_Operation_Utility("POST",data,ReqUrl,Intlogval);
	        
	        }
	        
	        catch (Exception|Error e) {
				throw (e);
			}
	        

		}


		//====================================================================================================
		//FunctionName 		: RMA_Json_User_Group_Deletion_Utility
		//Description  		: Enables The User To Delete Riskmaster User Group By Using A Json 
		//Input Parameter 	: ObjJsonOperation Stores Type Of Operation , JsonFileName Is The File Path With Input Json, Url Is The Request Url , Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger" 
		//Revision			: 0.0 - HarshVardhan-Aug 8-2019                               
		//====================================================================================================
		
		public static void RMA_Json_User_Group_Deletion_Utility(int ModuleGroupID, int Intlogval) throws Exception, Error
		{
			
			String response1 = null;
			String TCStatus = null;
			JSONObject data = null;
			
			data = new JSONObject();
			int DsnId = DataSource_Id ;
			URL AppUrl = new URL (RMAApp_Url);
			
			try {
	        
	        	//JSONParser parser = new JSONParser();
	            //Use JSONObject for simple JSON and JSONArray for array of JSON.
	            //path to the JSON file.
	           
				
	        	URL ReqUrl = new URL ( AppUrl.getProtocol()+"://"+AppUrl.getAuthority()+"/RiskmasterAPI/security/modules/"+Integer.toString(DsnId)+"/"+Integer.toString(ModuleGroupID) );
	        	
	        	
	           data.put("entityType","Module Security Group");
	           data.put("dsnId" , DsnId); 
	           data.put("groupId" , ModuleGroupID );

	           
	           System.out.println(data.toJSONString());

	           
	           response1 = RMA_Json_Operation_Utility("DELETE",data,ReqUrl,Intlogval);
	           
	        }
	        
	        catch (Exception|Error e) {
				throw (e);
			}
	        

		}
		
		
		
		//====================================================================================================
		//FunctionName 		: RMA_Json_User_Deletion_Utility
		//Description  		: Enables The User To Create Riskmaster User Group By Posting A Json 
		//Input Parameter 	: ObjJsonOperation Stores Type Of Operation , JsonFileName Is The File Path With Input Json, Url Is The Request Url , Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger" 
		//Revision			: 0.0 - HarshVardhan-Aug 8-2019                               
		//====================================================================================================
		
		public static void RMA_Json_User_Deletion_Utility(int ObjUserId , int Intlogval) throws Exception, Error
		{
			
			String response1 = null;			
			JSONObject data = null;
			
			URL AppUrl = new URL (RMAApp_Url);
			data = new JSONObject();
			
						
			try {
	        
	        	//JSONParser parser = new JSONParser();
	            //Use JSONObject for simple JSON and JSONArray for array of JSON.
	           //path to the JSON file.
	           
	        	
	        	URL ReqUrl = new URL ( AppUrl.getProtocol()+"://"+AppUrl.getAuthority()+"/riskmasterapi/security/users/"+Integer.toString(ObjUserId) );
	        	
	        	
	           data.put("entityType","User"); 
	           data.put("userId" , ObjUserId) ;
	           
	           response1 = RMA_Json_Operation_Utility("DELETE",data,ReqUrl,Intlogval);

	        
	        }
	        
	        catch (Exception|Error e) {
				throw (e);
			}
	        

		}
		
		
		
		
		
		
}





