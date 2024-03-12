package rma_appiumutilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

//Default Package Import Completed

public class RMA_ExcelDataRetrieval_Utility {
XSSFWorkbook WorkBook;
XSSFSheet Sheet;
		
//============================================================================================
//FunctionName 		: RMA_ExcelDataRetrieval_Utility
//Description  		: To Access The Required Excel File
//Input Parameter 	: StrExcelPath Of The Type String Providing The Path Of The Excel To Be Fetched	 
//Revision			: 0.0 - KumudNaithani-11-22-2016                                 
// ============================================================================================
public RMA_ExcelDataRetrieval_Utility (String StrExcelPath) throws Exception, Error //Constructor Is Created To Access The Required Excel File
{
	try
	{
		File FilePath = new File (StrExcelPath);
		FileInputStream FileIOStream = new FileInputStream (FilePath);
		WorkBook = new XSSFWorkbook(FileIOStream);
	} catch (Exception|Error e) 
	{
		System.out.println("The ExcelFile Was Not Retrieved As" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
		throw(e);
	}
	}

//====================================================================================================
//FunctionName 		: RMA_ExcelStringDataRetrieval_Utility
//Description  		: To Read String Data From The Required Excel File
//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer	 
//Revision			: 0.0 - KumudNaithani-11-23-2016                                 
//====================================================================================================
public String RMA_ExcelStringDataRead_Utility(String StrSheetName,int IntRow,int IntColumn)throws Exception, Error
{
	try {
		String strTestData;
		Sheet = WorkBook.getSheet(StrSheetName); //SheetNumber Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
		strTestData = Sheet.getRow(IntRow).getCell(IntColumn).getStringCellValue(); //Desired Cell Value Is Fetched Based Upon The Row and Column
		return strTestData;
	} catch (Exception|Error e) {
		throw(e);
	}
}

//====================================================================================================
//FunctionName 		: RMA_ExcelNumberDataRead_Utility
//Description  		: To Read Numerical Data From The Required Excel File
//Input Parameter 	: IntSheetName, IntRow, IntColumn Of The Type Integer	 
//Revision			: 0.0 - KumudNaithani-11-24-2016                                 
//====================================================================================================
public int RMA_ExcelNumberDataRead_Utility(String StrSheetName,int IntRow,int IntColumn)
{
	int intTestData;
	Sheet = WorkBook.getSheet(StrSheetName); //SheetName Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
	intTestData = (int) Sheet.getRow(IntRow).getCell(IntColumn).getNumericCellValue(); //Desired Cell Value Is Fetched Based Upon The Row and Column
	return intTestData;
}
}
