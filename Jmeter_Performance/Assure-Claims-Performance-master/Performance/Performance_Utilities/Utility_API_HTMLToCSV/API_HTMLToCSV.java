package com.dxc.utilityTrial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class API_HTMLToCSV {
	public static void main(String args[]) throws Exception, Error {
		String[] str = { "_1_3", "_1_4", "_1_5", "_1_6", "_5_1", "_5_2", "_5_3", "_10_1", "_10_2", "_10_3", "_20_1",
				"_20_2", "_20_3", "_50_1", "_50_2", "_50_3", "_100_1", "_100_2", "_100_3" };
		int[] row = { 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 17, 18, 19, 21, 22, 23, 25, 26, 27 };
		int k = 0;
		for (int i = 0; i < str.length; i++) {
			System.setProperty("webdriver.chrome.driver",
					"C://apache-jmeter-5.3//apache-jmeter-5.3//extras//Results//chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("headless");
			option.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(option);
			driver.get("file:///C:/apache-jmeter-5.3/apache-jmeter-5.3/extras/Results/" + args[1] + "/" + args[1]
					+ str[i] + "/index.html");
			String element1 = driver.findElement(By.cssSelector("table#statisticsTable tbody:last-child tr:last-child"))
					.getText();
			String constraint1 = driver.findElement(By.cssSelector("span#pieLabel1 div")).getText();
			driver.quit();
			String cons1 = constraint1.substring(2).trim();
			String s[] = element1.split(" ");
			float min = Float.parseFloat(s[6]) / 1000;
			float max = Float.parseFloat(s[7]) / 1000;
			String path = "C:\\apache-jmeter-5.3\\apache-jmeter-5.3\\extras\\Results\\" + args[0] + ".xlsx";
			float avg = Float.parseFloat(s[5]) / 1000;
			if (cons1.equals("100%")) {
				WriteDataToExcel(path, args[1], row[i], 4, String.format("%.2f", min));
				WriteDataToExcel(path, args[1], row[i], 5, String.format("%.2f", avg));
				WriteDataToExcel(path, args[1], row[i], 6, String.format("%.2f", max));
			}
		}

	}

	public static void WriteDataToExcel(String StrExcelPath, String StrSheetName, int IntRowNumber, int IntCellNumber,
			Object strValueToWrite) {
		try {
			FileInputStream InputStream = new FileInputStream(StrExcelPath);
			XSSFWorkbook Wb = new XSSFWorkbook(InputStream);
			XSSFSheet sheet = Wb.getSheet(StrSheetName);
			Row row = sheet.getRow(IntRowNumber);
			Cell cell = row.getCell(IntCellNumber);
			if (cell == null) {
				cell = row.createCell(IntCellNumber);
			}
			if (strValueToWrite.getClass().getSimpleName().equalsIgnoreCase("String")) {// If Manager List Selected
																						// Based On String Value
				cell.setCellType(Cell.CELL_TYPE_NUMERIC);
				cell.setCellValue(Float.parseFloat((String) strValueToWrite));
			}
			FileOutputStream OutputStream = new FileOutputStream(StrExcelPath);
			Wb.write(OutputStream);
			OutputStream.close();
			System.out.println("done writing to the sheet!");
		} catch (Exception e) {
		}
	}

}
