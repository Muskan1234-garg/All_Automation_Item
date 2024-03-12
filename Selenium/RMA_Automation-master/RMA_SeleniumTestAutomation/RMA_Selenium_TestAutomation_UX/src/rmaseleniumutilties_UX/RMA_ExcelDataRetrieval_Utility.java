package rmaseleniumutilties_UX;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;

import org.apache.poi.ss.usermodel.Sheet;
import java.io.*;
import java.util.Date;
//Default Package Import Completed

public class RMA_ExcelDataRetrieval_Utility {
	XSSFWorkbook WorkBook;
	XSSFSheet Sheet;
	public static int col_Num = -1;

	//==================================================================================================================================================================================
	//FunctionName 		: RMA_ExcelDataRetrieval_Utility
	//Description  		: To Access The Required Excel File
	//Input Parameter 	: StrExcelPath Of The Type String Providing The Path Of The Excel To Be Fetched	 
	//Revision			: 0.0 - KumudNaithani-10-12-2015                                 
	// ==================================================================================================================================================================================
	public RMA_ExcelDataRetrieval_Utility (String StrExcelPath) //Constructor Is Created To Access The Required Excel File
	{
		try
		{
			File FilePath = new File (StrExcelPath);
			FileInputStream FileIOStream = new FileInputStream (FilePath);
			WorkBook = new XSSFWorkbook(FileIOStream);
		} catch (Exception e) 
		{
			//System.out.println("The ExcelFile Was Not Retrieved As" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
		}
	}

	//==========================================================================================================================================================================================
	//FunctionName 		: RMA_ExcelDataRetrieval_Utility
	//Description  		: To Read String Data From The Required Excel File
	//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer	 
	//Revision			: 0.0 - KumudNaithani-10-12-2015                                 
	// ==========================================================================================================================================================================================
	public String RMA_ExcelDataRead_Utility(int IntSheetNumber,int IntRow,int IntColumn)
	{
		String strTestData;
		Sheet = WorkBook.getSheetAt(IntSheetNumber); //SheetNumber Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
		strTestData = Sheet.getRow(IntRow).getCell(IntColumn).getStringCellValue(); //Desired Cell Value Is Fetched Based Upon The Row and Column
		return strTestData;
	}

	//==========================================================================================================================================================================================
	//FunctionName 		: RMA_ExcelNumDataRead_Utility
	//Description  		: To Read Numerical Data From The Required Excel File
	//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer	 
	//Revision			: 0.0 - KumudNaithani-10-12-2015                                 
	// ==========================================================================================================================================================================================
	public int RMA_ExcelNumDataRead_Utility(int IntSheetNumber,int IntRow,int IntColumn)
	{
		int intTestData;
		Sheet = WorkBook.getSheetAt(IntSheetNumber); //SheetNumber Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
		intTestData = (int) Sheet.getRow(IntRow).getCell(IntColumn).getNumericCellValue(); //Desired Cell Value Is Fetched Based Upon The Row and Column
		return intTestData;
	}

	//==========================================================================================================================================================================================
	//FunctionName 		: RMA_ExcelDateDataRead_Utility
	//Description  		: To Read Date Data From The Required Excel File
	//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer	 
	//Revision			: 0.0 - KumudNaithani-10-12-2015    
	//ModifiedBy		: 0.0 - RenuVerma-09-15-2016 Changed StrSheetNumber Data Type as  String
	// ==========================================================================================================================================================================================
	public Date RMA_ExcelDateDataRead_Utility(String StrSheetNumber,int IntRow,int IntColumn)
	{
		Date intTestData;
		Sheet = WorkBook.getSheet(StrSheetNumber); //SheetNumber Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
		intTestData = Sheet.getRow(IntRow).getCell(IntColumn).getDateCellValue(); //Desired Cell Value Is Fetched Based Upon The Row and Column
		return intTestData;
	}	

	//==========================================================================================================================================================================================
	//FunctionName 		: WriteDataToExcel
	//Description  		: To Write Data To An Excel File
	//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer, strValueToWrite, StrExcelPath Of The Type String	 
	//Revision			: 0.0 - KumudNaithani-10-12-2015                                 
	// ==========================================================================================================================================================================================
	public static void WriteDataToExcel(String StrExcelPath, String StrSheetName, int IntRowNumber, int IntCellNumber, Object strValueToWrite)
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
			if(strValueToWrite.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
				cell.setCellType(Cell.CELL_TYPE_NUMERIC);
				cell.setCellValue((int)strValueToWrite);
			}
			if(strValueToWrite.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
				cell.setCellType(Cell.CELL_TYPE_STRING);
				cell.setCellValue(strValueToWrite.toString());
			}

			FileOutputStream OutputStream = new FileOutputStream(StrExcelPath);
			Wb.write(OutputStream);
			OutputStream.close();
		} catch (Exception e) {
			//System.out.println("Exception Occurred While Writing Data To An Excel File" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It

		}
	}

	//==========================================================================================================================================================================================
	//FunctionName 		: RMA_ExcelStringDataRetrieval_Utility
	//Description  		: To Read String Data From The Required Excel File
	//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer	 
	//Revision			: 0.0 - KumudNaithani-11-23-2015                                 
	//==========================================================================================================================================================================================
	public String RMA_ExcelStringDataRead_Utility(String StrSheetName,int IntRow,int IntColumn)
	{
		String strTestData;
		Sheet = WorkBook.getSheet(StrSheetName); //SheetNumber Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
		strTestData = Sheet.getRow(IntRow).getCell(IntColumn).getStringCellValue(); //Desired Cell Value Is Fetched Based Upon The Row and Column
		return strTestData;
	}

	//==========================================================================================================================================================================================
	//FunctionName 		: RMA_ExcelNumberDataRead_Utility
	//Description  		: To Read Numerical Data From The Required Excel File
	//Input Parameter 	: IntSheetName, IntRow, IntColumn Of The Type Integer	 
	//Revision			: 0.0 - KumudNaithani-11-23-2015                                 
	//==========================================================================================================================================================================================
	public int RMA_ExcelNumberDataRead_Utility(String StrSheetName,int IntRow,int IntColumn)
	{
		int intTestData;
		Sheet = WorkBook.getSheet(StrSheetName); //SheetName Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
		intTestData = (int) Sheet.getRow(IntRow).getCell(IntColumn).getNumericCellValue(); //Desired Cell Value Is Fetched Based Upon The Row and Column
		return intTestData;
	}


	//==========================================================================================================================================================================================
	//FunctionName 		: getRowCorrespondingCellData
	//Description  		: To Read Cell value corresponding to Row Header From The Required Excel File
	//Input Parameter 	: SheetName, Row Heading Name, column number
	//Revision			: 0.0 - RenuVerma-08-30-2018                                 
	//==========================================================================================================================================================================================
	public Object getRowCorrespondingCellData(String sheetName, String rowHeadingName, int colNum) throws Exception
	{
		try
		{
			int row_Num = -1;
			Sheet = WorkBook.getSheet(sheetName);
			XSSFRow row = Sheet.getRow(0);
			XSSFCell cell = row.getCell(0);
			for(int i = 0; i <= Sheet.getLastRowNum(); i++)
			{ if(Sheet.getRow(i).getCell(0).getStringCellValue().trim().equals(rowHeadingName.trim()))
			{row_Num = i; break;}

			}
			row = Sheet.getRow(row_Num);
			cell = row.getCell(colNum);
			if(cell.getCellType() == Cell.CELL_TYPE_STRING){

				String a=cell.getStringCellValue();
				//System.out.println("Fetch Value Is: "+a);
				return cell.getStringCellValue();}
			else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC || cell.getCellType() == Cell.CELL_TYPE_FORMULA)
			{
				int cellValue = (int)cell.getNumericCellValue();
				return cellValue;
			}else if(cell.getCellType() == Cell.CELL_TYPE_BLANK)
				return "";
			else if(cell.getCellType() == Cell.CELL_TYPE_FORMULA)				
			{	
				String cellValue = String.valueOf(cell.getNumericCellValue());
				if(HSSFDateUtil.isCellDateFormatted(cell))
				{
					DateFormat df = new SimpleDateFormat("dd/MM/yy");
					Date date = cell.getDateCellValue();
					cellValue = df.format(date);
				}
				return cellValue;
			}
			else
				return String.valueOf(cell.getBooleanCellValue());
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			//return "row "+rowHeadingName+" or column "+colNum +" does not exist  in Excel";
			throw new Exception("getColumnCorrespondingCellData Is giving Error" );
		}
	}
	//==========================================================================================================================================================================================
	//FunctionName 		: getRowCorrespondingCellData
	//Description  		: To Read Cell value corresponding to Row Header From The Required Excel File
	//Input Parameter 	: SheetName, Row Heading Name, column number
	//Revision			: 0.0 - RenuVerma-08-30-2018                                 
	//==========================================================================================================================================================================================
	public Object getColumnCorrespondingCellData(String sheetName, String ColHeadingName, int rowNum) throws Exception
	{
		try
		{
			int col_Num = -1;
			Sheet = WorkBook.getSheet(sheetName);
			XSSFRow row = Sheet.getRow(0);
			XSSFCell cell = row.getCell(0);
			for(int i = 0; i <=row.getLastCellNum(); i++)
			{
				try{
					if(Sheet.getRow(0).getCell(i).getStringCellValue().trim().equals(ColHeadingName.trim()))
					{
						col_Num = i;
						break;
					}
				}
				catch(Exception e)
				{
					//e.printStackTrace();
					//return "Column "+ColHeadingName+" or row "+rowNum +" does not exist  in Excel";
					//System.out.println("Corresponding Cell Data Is giving Error While Reading the Column Heading" +ColHeadingName);
					throw new Exception("Corresponding Cell Data Is giving Error While Reading the Column Heading" +ColHeadingName);
					//break;
				}
			}
			//System.out.println("col_Num"+col_Num);
			row = Sheet.getRow(rowNum);
			//System.out.println("col_Num"+row);
			cell = row.getCell(col_Num);
			//System.out.println("col_Num"+cell);
			if(cell.getCellType() == Cell.CELL_TYPE_STRING){

				String a=cell.getStringCellValue();
				//System.out.println("Fetch Value Is: "+a);
				return cell.getStringCellValue();}
			else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC )
			{
				int cellValue = (int)cell.getNumericCellValue();
				return cellValue;
			}else if(cell.getCellType() == Cell.CELL_TYPE_BLANK){//System.out.println("cell.getCellType()"+ColHeadingName+":"+cell.getCellType());
				return "";}
			else if(cell.getCellType() == Cell.CELL_TYPE_FORMULA)				
			{	
				String cellValue = String.valueOf(cell.getNumericCellValue());
				if(HSSFDateUtil.isCellDateFormatted(cell))
				{
					DateFormat df = new SimpleDateFormat("dd/MM/yy");
					Date date = cell.getDateCellValue();
					cellValue = df.format(date);
				}
				return cellValue;
			}
			else
				return String.valueOf(cell.getBooleanCellValue());
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			//return "Column "+ColHeadingName+" or row "+rowNum +" does not exist  in Excel";
			throw new Exception("getColumnCorrespondingCellData Is giving Error" );
		}
	}
	//==========================================================================================================================================================================================
	//FunctionName 		: WriteDataToExcel
	//Description  		: To Write Data To An Excel File
	//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer, strValueToWrite, StrExcelPath Of The Type String	 
	//Revision			: 0.0 - KumudNaithani-10-12-2015                                 
	// ==========================================================================================================================================================================================
	public static void WriteDataToExcel(String StrExcelPath, String StrSheetName, int rowindex, String ColHeadingName, Object strValueToWrite) throws Exception
	{
		try {

			int row_Num=rowindex,col_Num=-1;
			FileInputStream InputStream = new FileInputStream (StrExcelPath);
			Workbook Wb = WorkbookFactory.create(InputStream);
			//Sheet sheet = Wb.getSheetAt(IntSheetNumber);
			Sheet sheet = Wb.getSheet(StrSheetName);
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			/*System.out.println("row.getLastCellNum()"+row.getLastCellNum());
				System.out.println("row.getLastRowNum()"+sheet.getLastRowNum());
				System.out.println("ColHeadingName"+ColHeadingName);*/
			for(int i = 0; i <row.getLastCellNum(); i++)
			{ 
				//System.out.println("sheet.getRow(0).getCell(i).getStringCellValue().trim()"+sheet.getRow(0).getCell(i).getStringCellValue().trim());
				if(sheet.getRow(0).getCell(i).getStringCellValue().trim().equals(ColHeadingName.trim())){
					col_Num = i;
					//System.out.println("col_Num "+ col_Num);
					break;
				}
			}

			row = sheet.getRow(row_Num);
			cell = row.getCell(col_Num);
			//System.out.println("col_Num "+ col_Num+"row_Num "+row_Num);

			if (cell == null)
			{
				cell = row.createCell(col_Num);
			}
			if(strValueToWrite.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
				cell.setCellType(Cell.CELL_TYPE_NUMERIC);
				cell.setCellValue((int)strValueToWrite);
			}
			if(strValueToWrite.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
				cell.setCellType(Cell.CELL_TYPE_STRING);
				cell.setCellValue(strValueToWrite.toString());
				//System.out.println(strValueToWrite.toString());
			}

			FileOutputStream OutputStream = new FileOutputStream(StrExcelPath);
			Wb.write(OutputStream);
			OutputStream.close();
		} catch (Exception e) {
			//System.out.println("Exception Occurred While Writing Data To An Excel File" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
			throw new Exception("Exception Occurred While Writing Data To An Excel File"+ e.getMessage());
		}
	}
	//==========================================================================================================================================================================================
	//FunctionName             : RMA_ExcelGetNumberOfRows_Utility
	//Description              : To Get Number Of Rows In Excel Sheet
	//Input Parameter   	   : IntSheetNumber
	//Revision                 : 0.0 - shrutiShruti-08-31-2010                                 
	//==========================================================================================================================================================================================
	public int RMA_ExcelGetNumberOfRows_Utility(String StrSheetName)
	{
		Sheet = WorkBook.getSheet(StrSheetName); //SheetNumber Of The Sheet From Which Data Is To Be Read Is Supplied As An Argument Is Fetched
		int header = Sheet.getLastRowNum();
		return header;
	}

	//==========================================================================================================================================================================================
	//FunctionName 		: WriteDataToText
	//Description  		: To Write Data To An Excel File
	//Input Parameter 	: IntSheetNumber, IntRow, IntColumn Of The Type Integer, strValueToWrite, StrExcelPath Of The Type String	 
	//Revision			: 0.0 - ShrutiShruti-08-21-2018                                 
	//==========================================================================================================================================================================================
	public static void WriteDataToText(String StrExcelPath,  String strValueToWrite)
	{
		try {
			File myFile = new File(StrExcelPath);
			if (!myFile.exists()) {
				myFile.createNewFile();
			}
			FileWriter writer = new FileWriter(myFile);

			writer.write(strValueToWrite);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}


