package com.dxc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility_WDS_CSVToDB {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("connection.prop");
		Properties prop = new Properties();
		prop.load(fis);

		String url = (String) prop.get("URL");
		String username = (String) prop.get("Uname");
		String password = (String) prop.get("Password");
		String excelsheetName = (String) prop.get("ExcelsheetName");

		String[] testcaseName = { "RMA_TC_001", "RMA_TC_002", "RMA_TC_003", "RMA_TC_004", "RMA_TC_005", "RMA_TC_006",
				"RMA_TC_007", "RMA_TC_008", "RMA_TC_009", "RMA_TC_010", "RMA_TC_012", "RMA_TC_013", "RMA_TC_014",
				"RMA_TC_015", "RMA_TC_016", "RMA_TC_017", "RMA_TC_018", "RMA_TC_019", "RMA_TC_020", "RMA_TC_021",
				"RMA_TC_022", "RMA_TC_023", "RMA_TC_024", "RMA_TC_025", "RMA_TC_026", "RMA_TC_027", "RMA_TC_028",
				"RMA_TC_029", "RMA_TC_030", "RMA_TC_031", "RMA_TC_032" };

		int[] testcaseNo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31, 32 };

		try {

			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Successfully connected to database");

			FileInputStream fileIn = new FileInputStream(new File(excelsheetName));
			XSSFWorkbook wb = new XSSFWorkbook(fileIn);
			XSSFSheet detailsSheet = wb.getSheet("Introduction Details");

			Row row1;
			Row row2;
			Row row3;
			Row row4;
			row1 = detailsSheet.getRow(3);
			row2 = detailsSheet.getRow(4);
			row3 = detailsSheet.getRow(5);
			row4 = detailsSheet.getRow(6);

			double ReleaseVersion = row1.getCell(1).getNumericCellValue();
			String ReleaseType = row2.getCell(1).getStringCellValue();
			String Env = row3.getCell(1).getStringCellValue();
			String APIAndWDS = row4.getCell(1).getStringCellValue();

			Date date;
			DateFormat dateFormat;
			String strDate;

			date = Calendar.getInstance().getTime();
			dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			strDate = dateFormat.format(date);

			String insertQuery = "insert into PerformanceReportWDS(ReleaseVersion,ReleaseType,Env,TestcaseNo,ExecutionType,RunCount,BreakPoint_1,BreakPoint_2,BreakPoint_3,BreakPoint_4,BreakPoint_5,BreakPoint_6,BreakPoint_7,BreakPoint_8,BreakPoint_9,BreakPoint_10,BreakPoint_11,BreakPoint_12,BreakPoint_13,CreatedDateAndTime) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement insertStatement = connection.prepareStatement(insertQuery);

			String selectQuery;
			int recordsCount = 0; //Give no of rows for particular testcase on the basis of TestcaseNo, ReleaseType, ReleaseVersion, Environment
			int bResult = 0; // It will return 1 or 0 (Yes/No)
			int bDelete = 1; // Have set this variable to get warning message only at once 
			
			for (int k = 0; k < testcaseNo.length; k++) {
				selectQuery = "select count(*) from PerformanceReportWDS where TestcaseNo = '" + testcaseNo[k]
						+ "'  AND ReleaseVersion = '" + ReleaseVersion + "'AND ReleaseType ='" + ReleaseType
						+ "'  AND  Env='" + Env + "' ";
				PreparedStatement selectStatement = connection.prepareStatement(selectQuery);

				ResultSet rs = selectStatement.executeQuery();
				rs.next();
				recordsCount = rs.getInt(1);

				if (recordsCount == 7 || recordsCount == 3) {
					if (bDelete == 1) {
						bResult = JOptionPane.showConfirmDialog(null,
								"Do you want to delete already existing data for all the testcases?", "Warning msg",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
						bDelete = 0;
					}

					if (bResult == JOptionPane.YES_NO_OPTION) {
						String deleteQuery = "delete from PerformanceReportWDS where TestcaseNo = '" + testcaseNo[k]
								+ "'  AND ReleaseVersion = '" + ReleaseVersion + "'AND ReleaseType ='" + ReleaseType
								+ "'  AND  Env='" + Env + "' ";
						PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
						deleteStatement.execute();
						System.out.println("Data has been deleted for testcase no. : " + testcaseNo[k]);
						System.out.println();
						recordsCount = 0;
					} else {
						System.out.println("Exit from Program!!");
						break;
					}
				}
			}

			if (recordsCount == 0 || recordsCount < 7 && bResult == JOptionPane.YES_NO_OPTION) {
				if (APIAndWDS.equalsIgnoreCase("Both"))  //It will insert data for 7 rows (WDS 3 rows, API 3 rows, Difference 1 row)
				{
					for (int j = 0; j < testcaseName.length; j++) {
						XSSFSheet detailsSheet1 = wb.getSheet(testcaseName[j]);

						// 1st row
						int TestcaseNo = (int) detailsSheet1.getRow(1).getCell(2).getNumericCellValue(); //TestcaseNo
						insertStatement.setFloat(1, (float) ReleaseVersion);  //ReleaseVersion
						insertStatement.setString(2, ReleaseType); //ReleaseType
						insertStatement.setString(3, Env); //Environment
						insertStatement.setInt(4, (int) TestcaseNo); //TestcaseNo
						insertStatement.setString(5, detailsSheet1.getRow(3).getCell(1).getStringCellValue());  // ExecutionType(Whether API/WDS/Difference)
						insertStatement.setString(6, detailsSheet1.getRow(4).getCell(1).getStringCellValue());  //RunCount
						for (int i = 0; i < 13; i++) {
							int iRow = 4;
							if (null != detailsSheet1.getRow(iRow).getCell(i + 2)) {
								insertStatement.setFloat(i + 7,
										(float) detailsSheet1.getRow(iRow).getCell(i + 2).getNumericCellValue());
							} else {
								insertStatement.setString(i + 7, null);
							}

						}
						insertStatement.setString(20, strDate);
						insertStatement.execute();
						// 1st row

						// 2nd row
						insertStatement.setFloat(1, (float) ReleaseVersion);
						insertStatement.setString(2, ReleaseType);
						insertStatement.setString(3, Env);
						insertStatement.setInt(4, (int) TestcaseNo);
						insertStatement.setString(5, detailsSheet1.getRow(3).getCell(1).getStringCellValue());
						insertStatement.setString(6, detailsSheet1.getRow(5).getCell(1).getStringCellValue());
						for (int i = 0; i < 13; i++) {
							int iRow = 5;
							if (null != detailsSheet1.getRow(iRow).getCell(i + 2)) {
								insertStatement.setFloat(i + 7,
										(float) detailsSheet1.getRow(iRow).getCell(i + 2).getNumericCellValue());
							} else {
								insertStatement.setString(i + 7, null);
							}
						}
						insertStatement.setString(20, strDate);
						insertStatement.execute();
						// 2nd row

						// 3rd row
						insertStatement.setFloat(1, (float) ReleaseVersion);
						insertStatement.setString(2, ReleaseType);
						insertStatement.setString(3, Env);
						insertStatement.setInt(4, (int) TestcaseNo);
						insertStatement.setString(5, detailsSheet1.getRow(3).getCell(1).getStringCellValue());
						insertStatement.setString(6, detailsSheet1.getRow(6).getCell(1).getStringCellValue());
						for (int i = 0; i < 13; i++) {
							int iRow = 6;
							if (null != detailsSheet1.getRow(iRow).getCell(i + 2)) {
								insertStatement.setFloat(i + 7,
										(float) detailsSheet1.getRow(iRow).getCell(i + 2).getNumericCellValue());
							} else {
								insertStatement.setString(i + 7, null);
							}
						}
						insertStatement.setString(20, strDate);
						insertStatement.execute();
						// 3rd row

						// 4th row
						insertStatement.setFloat(1, (float) ReleaseVersion);
						insertStatement.setString(2, ReleaseType);
						insertStatement.setString(3, Env);
						insertStatement.setInt(4, (int) TestcaseNo);
						insertStatement.setString(5, detailsSheet1.getRow(8).getCell(1).getStringCellValue());
						insertStatement.setString(6, detailsSheet1.getRow(9).getCell(1).getStringCellValue());
						for (int i = 0; i < 13; i++) {
							int iRow = 9;
							if (null != detailsSheet1.getRow(iRow).getCell(i + 2)) {
								insertStatement.setFloat(i + 7,
										(float) detailsSheet1.getRow(iRow).getCell(i + 2).getNumericCellValue());
							} else {
								insertStatement.setString(i + 7, null);
							}
						}
						insertStatement.setString(20, strDate);
						insertStatement.execute();
						// 4th row

						// 5th row
						insertStatement.setFloat(1, (float) ReleaseVersion);
						insertStatement.setString(2, ReleaseType);
						insertStatement.setString(3, Env);
						insertStatement.setInt(4, (int) TestcaseNo);
						insertStatement.setString(5, detailsSheet1.getRow(8).getCell(1).getStringCellValue());
						insertStatement.setString(6, detailsSheet1.getRow(10).getCell(1).getStringCellValue());
						for (int i = 0; i < 13; i++) {
							int iRow = 10;
							if (null != detailsSheet1.getRow(iRow).getCell(i + 2)) {
								insertStatement.setFloat(i + 7,
										(float) detailsSheet1.getRow(iRow).getCell(i + 2).getNumericCellValue());
							} else {
								insertStatement.setString(i + 7, null);
							}
						}
						insertStatement.setString(20, strDate);
						insertStatement.execute();
						// 5th row

						// 6th row
						insertStatement.setFloat(1, (float) ReleaseVersion);
						insertStatement.setString(2, ReleaseType);
						insertStatement.setString(3, Env);
						insertStatement.setInt(4, (int) TestcaseNo);
						insertStatement.setString(5, detailsSheet1.getRow(8).getCell(1).getStringCellValue());
						insertStatement.setString(6, detailsSheet1.getRow(11).getCell(1).getStringCellValue());
						for (int i = 0; i < 13; i++) {
							int iRow = 11;
							if (null != detailsSheet1.getRow(iRow).getCell(i + 2)) {
								insertStatement.setFloat(i + 7,
										(float) detailsSheet1.getRow(iRow).getCell(i + 2).getNumericCellValue());
							} else {
								insertStatement.setString(i + 7, null);
							}
						}
						insertStatement.setString(20, strDate);
						insertStatement.execute();
						// 6th row

						// 7th row
						insertStatement.setFloat(1, (float) ReleaseVersion);
						insertStatement.setString(2, ReleaseType);
						insertStatement.setString(3, Env);
						insertStatement.setInt(4, (int) TestcaseNo);
						insertStatement.setString(5, detailsSheet1.getRow(13).getCell(1).getStringCellValue());
						insertStatement.setString(6, detailsSheet1.getRow(14).getCell(1).getStringCellValue());
						for (int i = 0; i < 13; i++) {
							int iRow = 14;
							if (null != detailsSheet1.getRow(iRow).getCell(i + 2)) {
								insertStatement.setFloat(i + 7,
										(float) detailsSheet1.getRow(iRow).getCell(i + 2).getNumericCellValue());
							} else {
								insertStatement.setString(i + 7, null);
							}
						}
						insertStatement.setString(20, strDate);
						insertStatement.execute();
						// 7th row

						System.out.println("Data has been inserted for testcase no. : " + testcaseNo[j]);
						System.out.println();
					}
					wb.close();
					connection.close();
				}
			}
			if (recordsCount == 0 || recordsCount < 3 && bResult == JOptionPane.YES_NO_OPTION) {
				if (APIAndWDS.equalsIgnoreCase("WDS")) //insert data only for WDS (WDS 3 Rows)
				{
					for (int j = 0; j < testcaseName.length; j++) {
						XSSFSheet detailsSheet1 = wb.getSheet(testcaseName[j]);
						
						// 1st row
						int TestcaseNo = (int) detailsSheet1.getRow(1).getCell(2).getNumericCellValue(); //TestcaseNo
						insertStatement.setFloat(1, (float) ReleaseVersion);  //ReleaseVersion
						insertStatement.setString(2, ReleaseType); //ReleaseType
						insertStatement.setString(3, Env); //Environment
						insertStatement.setInt(4, (int) TestcaseNo); //TestcaseNo
						insertStatement.setString(5, detailsSheet1.getRow(3).getCell(1).getStringCellValue());  // ExecutionType(Whether API/WDS/Difference)
						insertStatement.setString(6, detailsSheet1.getRow(4).getCell(1).getStringCellValue());  //RunCount
						for (int i = 0; i < 13; i++) {
							int iRow = 4;
							if (null != detailsSheet1.getRow(iRow).getCell(i + 2)) {
								insertStatement.setFloat(i + 7,
										(float) detailsSheet1.getRow(iRow).getCell(i + 2).getNumericCellValue());
							} else {
								insertStatement.setString(i + 7, null);
							}

						}
						insertStatement.setString(20, strDate);
						insertStatement.execute();
						// 1st row

						// 2nd row
						insertStatement.setFloat(1, (float) ReleaseVersion);
						insertStatement.setString(2, ReleaseType);
						insertStatement.setString(3, Env);
						insertStatement.setInt(4, (int) TestcaseNo);
						insertStatement.setString(5, detailsSheet1.getRow(3).getCell(1).getStringCellValue());
						insertStatement.setString(6, detailsSheet1.getRow(5).getCell(1).getStringCellValue());
						for (int i = 0; i < 13; i++) {
							int iRow = 5;
							if (null != detailsSheet1.getRow(iRow).getCell(i + 2)) {
								insertStatement.setFloat(i + 7,
										(float) detailsSheet1.getRow(iRow).getCell(i + 2).getNumericCellValue());
							} else {
								insertStatement.setString(i + 7, null);
							}
						}
						insertStatement.setString(20, strDate);
						insertStatement.execute();
						// 2nd row

						// 3rd row
						insertStatement.setFloat(1, (float) ReleaseVersion);
						insertStatement.setString(2, ReleaseType);
						insertStatement.setString(3, Env);
						insertStatement.setInt(4, (int) TestcaseNo);
						insertStatement.setString(5, detailsSheet1.getRow(3).getCell(1).getStringCellValue());
						insertStatement.setString(6, detailsSheet1.getRow(6).getCell(1).getStringCellValue());
						for (int i = 0; i < 13; i++) {
							int iRow = 6;
							if (null != detailsSheet1.getRow(iRow).getCell(i + 2)) {
								insertStatement.setFloat(i + 7,
										(float) detailsSheet1.getRow(iRow).getCell(i + 2).getNumericCellValue());
							} else {
								insertStatement.setString(i + 7, null);
							}
						}
						insertStatement.setString(20, strDate);
						insertStatement.execute();
						// 3rd row

						System.out.println("Data has been inserted for testcase no. : " + testcaseNo[j]);
						System.out.println();
					}
				}
				wb.close();
				connection.close();

			}
		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
			e.getMessage();
		}

	}

}
