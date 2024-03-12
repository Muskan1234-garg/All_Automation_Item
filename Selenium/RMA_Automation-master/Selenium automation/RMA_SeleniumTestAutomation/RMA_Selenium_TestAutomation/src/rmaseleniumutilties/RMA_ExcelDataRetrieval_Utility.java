package rmaseleniumutilties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.*;
import java.util.Date;
//Default Package Import Completed

public class RMA_ExcelDataRetrieval_Utility {
XSSFWorkbook WorkBook;
XSSFSheet Sheet;
	
//============================================================================================
//FunctionName 		: RMA_ExcelDataRetrieval_Utility
//Description  		: To Access The Required Excel File
//Input Parameter 	: StrExcelPath Of The Type String Providing The Path Of The Excel To Be Fetched	 
//Revision			: 0.0 - KumudNaithani-10-12-2015                                 
// ============================================================================================
public RMA_ExcelDataRetrieval_Utility (String StrExcelPath) //Constructor Is Created To Access The Required Excel File
{
	try
	{
		File FilePath = new File (StrExcelPath);
		FileInputStream FileIOStream = new FileInputStream (FilePath);
		WorkBook = new XSSFWorkbook(FileIOStream);
	} catch (Exception e) 
	{
		System.out.println("The ExcelFile Was Not Retrieved As" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
	}
}

//====================================================================================================
//FunctionName 		: RMA_ExcelDataRetrieval_Utility
//Description  		: To Read String Data From The Required Excel File
//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer	 
//Revision			: 0.0 - KumudNaithani-10-12-2015                                 
// ====================================================================================================
public String RMA_ExcelDataRead_Utility(int IntSheetNumber,int IntRow,int IntColumn)
{
	String strTestData;
	Sheet = WorkBook.getSheetAt(IntSheetNumber); //SheetNumber Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
	strTestData = Sheet.getRow(IntRow).getCell(IntColumn).getStringCellValue(); //Desired Cell Value Is Fetched Based Upon The Row and Column
	return strTestData;
}
	
//====================================================================================================
//FunctionName 		: RMA_ExcelNumDataRead_Utility
//Description  		: To Read Numerical Data From The Required Excel File
//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer	 
//Revision			: 0.0 - KumudNaithani-10-12-2015                                 
// ====================================================================================================
public int RMA_ExcelNumDataRead_Utility(int IntSheetNumber,int IntRow,int IntColumn)
{
	int intTestData;
	Sheet = WorkBook.getSheetAt(IntSheetNumber); //SheetNumber Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
	intTestData = (int) Sheet.getRow(IntRow).getCell(IntColumn).getNumericCellValue(); //Desired Cell Value Is Fetched Based Upon The Row and Column
	return intTestData;
}
	
//====================================================================================================
//FunctionName 		: RMA_ExcelDateDataRead_Utility
//Description  		: To Read Date Data From The Required Excel File
//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer	 
//Revision			: 0.0 - KumudNaithani-10-12-2015    
//ModifiedBy		: 0.1 - RenuVerma-09-15-2016 Changed StrSheetNumber Data Type as  String
// ====================================================================================================
public Date RMA_ExcelDateDataRead_Utility(String StrSheetNumber,int IntRow,int IntColumn)
{
	Date intTestData;
	Sheet = WorkBook.getSheet(StrSheetNumber); //SheetNumber Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
	intTestData = Sheet.getRow(IntRow).getCell(IntColumn).getDateCellValue(); //Desired Cell Value Is Fetched Based Upon The Row and Column
	return intTestData;
}	

//====================================================================================================
//FunctionName 		: WriteDataToExcel
//Description  		: To Write Data To An Excel File
//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer, strValueToWrite, StrExcelPath Of The Type String	 
//Revision			: 0.0 - KumudNaithani-10-12-2015                                 
// ====================================================================================================
public static void WriteDataToExcel(String StrExcelPath, String StrSheetName, int IntRowNumber, int IntCellNumber, String strValueToWrite)
{
try {
	FileInputStream InputStream = new FileInputStream (StrExcelPath);
	Workbook Wb = WorkbookFactory.create(InputStream);
	//Sheet sheet = Wb.getSheetAt(IntSheetNumber);
	Sheet sheet = Wb.getSheet(StrSheetName);
	Row row = sheet.getRow(IntRowNumber);
	Cell cell = row.getCell(IntCellNumber);
	if (cell == null)
	{
		cell = row.createCell(IntCellNumber);
	}
	cell.setCellType(Cell.CELL_TYPE_STRING);
	cell.setCellValue(strValueToWrite);
	FileOutputStream OutputStream = new FileOutputStream(StrExcelPath);
	Wb.write(OutputStream);
	OutputStream.close();
	} catch (Exception e) {
		System.out.println("Exception Occurred While Writing Data To An Excel File" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
		
	}
}

//====================================================================================================
//FunctionName 		: RMA_ExcelStringDataRetrieval_Utility
//Description  		: To Read String Data From The Required Excel File
//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer	 
//Revision			: 0.0 - KumudNaithani-11-23-2015                                 
//====================================================================================================
public String RMA_ExcelStringDataRead_Utility(String StrSheetName,int IntRow,int IntColumn)
{
	String strTestData;
	Sheet = WorkBook.getSheet(StrSheetName); //SheetNumber Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
	strTestData = Sheet.getRow(IntRow).getCell(IntColumn).getStringCellValue(); //Desired Cell Value Is Fetched Based Upon The Row and Column
	return strTestData;
}

//====================================================================================================
//FunctionName 		: RMA_ExcelNumberDataRead_Utility
//Description  		: To Read Numerical Data From The Required Excel File
//Input Parameter 	: IntSheetName, IntRow, IntColumn Of The Type Integer	 
//Revision			: 0.0 - KumudNaithani-11-23-2015                                 
//====================================================================================================
public int RMA_ExcelNumberDataRead_Utility(String StrSheetName,int IntRow,int IntColumn)
{
	int intTestData;
	Sheet = WorkBook.getSheet(StrSheetName); //SheetName Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
	intTestData = (int) Sheet.getRow(IntRow).getCell(IntColumn).getNumericCellValue(); //Desired Cell Value Is Fetched Based Upon The Row and Column
	return intTestData;
}
}
	
	
	

