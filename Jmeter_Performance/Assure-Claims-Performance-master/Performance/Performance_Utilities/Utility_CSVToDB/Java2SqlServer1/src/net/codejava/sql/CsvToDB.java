package net.codejava.sql;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CsvToDB {

	public static void main(String[] args) throws SQLException, IOException {

		FileInputStream fis = new FileInputStream("connection.prop");
		Properties prop = new Properties();
		prop.load(fis);

		String url = (String) prop.get("URL");
		String username = (String) prop.get("Uname");
		String password = (String) prop.get("password");
		String ExcelsheetName = (String) prop.get("ExcelsheetName");

		String[] testcaseName_PST = { "RMA_TC_001", "RMA_TC_002", "RMA_TC_003", "RMA_TC_004", "RMA_TC_005",
				"RMA_TC_006", "RMA_TC_007", "RMA_TC_008", "RMA_TC_009", "RMA_TC_010", "RMA_TC_012", "RMA_TC_013",
				"RMA_TC_014", "RMA_TC_015", "RMA_TC_016", "RMA_TC_017", "RMA_TC_018", "RMA_TC_019", "RMA_TC_020",
				"RMA_TC_021", "RMA_TC_022", "RMA_TC_023", "RMA_TC_024", "RMA_TC_025", "RMA_TC_026", "RMA_TC_027",
				"RMA_TC_028", "RMA_TC_029", "RMA_TC_030", "RMA_TC_031", "RMA_TC_032" };

		String[] testcaseName_Platform = { "RMA_TC_002", "RMA_TC_003", "RMA_TC_007", "RMA_TC_014", "RMA_TC_015",
				"RMA_TC_020", "RMA_TC_022", "RMA_TC_024", "RMA_TC_028", "RMA_TC_030" };

		String[] testcaseName;

		int[] testcaseNo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31, 32 };

		try {
			Date date;
			DateFormat dateFormat;
			String strDate;

			Connection connection = DriverManager.getConnection(url, username, password);

			System.out.println("Successfully connected to database");
			System.out.println();

			FileInputStream fileIn = new FileInputStream(new File(ExcelsheetName));
			XSSFWorkbook wb = new XSSFWorkbook(fileIn);
			XSSFSheet detailsSheet = wb.getSheet("Details");

			Row row1;
			row1 = detailsSheet.getRow(4);

			double ReleaseInExcel = row1.getCell(0).getNumericCellValue();
			String EnvInExcel = row1.getCell(1).getStringCellValue();
			int x = 1;

			String insertQuery = "insert into PerformanceReportAPI(NoOfUser,RunCount,MinValue,MeanValue,MaxValue,Release,Env,TestcaseNo,CreatedDateAndTime) values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
			String selectQuery;
			int count = 0;
			int result = 0;

			for (int k = 0; k < testcaseNo.length; k++) {
				selectQuery = "select count(*) from PerformanceReportAPI where TestcaseNo = '" + testcaseNo[k]
						+ "'  and Release = '" + ReleaseInExcel + "'  AND  Env='" + EnvInExcel + "' ";
				PreparedStatement selectStatement = connection.prepareStatement(selectQuery);

				ResultSet rs = selectStatement.executeQuery();
				rs.next();
				count = rs.getInt(1);

				if (count == 19) {
					if (x == 1) {
						result = JOptionPane.showConfirmDialog(null,
								"Do you want to delete already existing data for all the testcases?", "Warning msg",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
						x = 0;
					}

					if (result == JOptionPane.YES_NO_OPTION) {
						String deleteQuery = "delete from PerformanceReportAPI where TestcaseNo = '" + testcaseNo[k]
								+ "'  and Release = '" + ReleaseInExcel + "'  AND  Env='" + EnvInExcel + "' ";
						PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
						deleteStatement.execute();
						System.out.println("Data has been deleted for testcase no. : " + testcaseNo[k]);
						System.out.println();
						count = 0;
					} else {
						System.out.println("Exit from Program!!");
						break;
					}
				}
			}

			if (EnvInExcel.equalsIgnoreCase("PST")) {
				testcaseName = testcaseName_PST;
			} else {
				testcaseName = testcaseName_Platform;
			}
			if (count == 0 || count < 19 && result == JOptionPane.YES_NO_OPTION) {
				Row row;
				for (int j = 0; j < testcaseName.length; j++) {
					XSSFSheet testcasesSheetName = wb.getSheet(testcaseName[j]);

					for (int i = 4; i < 28; i++) {
						if (i == 8 || i == 12 || i == 16 || i == 20 || i == 24) {
						} else {

							date = Calendar.getInstance().getTime();
							dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
							strDate = dateFormat.format(date);

							row = testcasesSheetName.getRow(i);

							insertStatement.setString(1,
									String.format("%03d", (int) row.getCell(2).getNumericCellValue()));
							insertStatement.setInt(2, (int) row.getCell(3).getNumericCellValue());

							insertStatement.setFloat(3, (float) row.getCell(4).getNumericCellValue());
							insertStatement.setFloat(4, (float) row.getCell(5).getNumericCellValue());
							insertStatement.setFloat(5, (float) row.getCell(6).getNumericCellValue());
							insertStatement.setFloat(6, (float) ReleaseInExcel);

							insertStatement.setString(7, EnvInExcel);
							insertStatement.setInt(8, (int) row.getCell(7).getNumericCellValue());

							insertStatement.setString(9, strDate);

							insertStatement.execute();

						}
					}
					System.out.println("Successfully inserted data for Testcase : " + testcaseName[j]);
					System.out.println();
				}
				System.out.println(
						"Data has been successfully inserted for all the " + testcaseName.length + " testcases!!");
			}
			wb.close();
			connection.close();

		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
			e.getMessage();
		}

	}

}
