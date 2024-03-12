package com.dxc.wdsUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class APIInWDS_HTMLToCSV {
	public static void main(String[] args) {
		String bp[][] = {
				{ "1_Login", "2_ClaimZone", "3_DisplayGCScreen", "4_PolicyStagingPageOpened", "5_SearchPolicy",
					"6_InquirePolicy", "7_DownloadPolicy", "8_SaveGC", "9_DisplayReserveScreen", "10_SaveReserve",
					"11_DisplayCollectionScreen", "12_SaveCollection", "13_Logout" }, //1

			{ "1_Login", "2_ClaimZone", "3_DisplayGCScreen", "4_PolicyStagingPageOpened", "5_SearchPolicy",
					"6_InquirePolicy", "7_DownloadPolicy", "8_SaveGC", "9_DisplayReserveScreen",
					"10_SaveExpenseReserve", "11_DisplayPaymentScreen", "12_SavePayment", "13_Logout" },//2

			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaim", "5_OpenClaimDetailPage",
					"6_OpenFInancialReserveList", "7_EditSelectedReserve", "8_SaveUpdatedReserve", "9_Logout" },//3

			{ "1_Login", "2_ClaimZone", "3_StandardClaimSearchScreen", "4_SearchGCClaim", "5_DisplayClaimRecord",
					"6_DisplayReserveListingScreen", "7_DisplayPaymentScreen", "8_SavePayment", "9_Logout" },//4

			{ "1_Login", "2_ClaimZone", "3_DisplayPolicySystemDownloadScreen", "4_SearchPolicy", "5_InquirePolicy",
					"6_DownloadPolicy", "7_SaveGC", "8_Logout" },//5

			{ "1_Login", "2_ClaimZone", "3_DisplayPolicySystemDownloadScreen", "4_PolicySearch", "5_InquirePolicy",
					"6_DownloadPolicy", "7_SaveWC", "8_Logout" },//6

			{ "1_Login", "2_ClaimZone", "3_DisplayNewWCScreen", "4_SaveWC", "5_DisplayReserveScreen",
					"6_SaveReserve", "7_DisplayCollectionScreen", "8_SaveCollection", "9_Logout" },//7

			{ "1_Login", "2_ClaimZone", "3_CreateNewWCClaim", "4_SaveWCClaim", "5_ShowReserveListing",
					"6_SaveExpenseReserve", "7_ShowPaymentScreen", "8_SaveExpensePayment", "9_Logout" },//8

			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaim", "5_OpenClaimDetailPage",
					"6_OpenFinancialReserveListing", "7_OpenExistingReserve", "8_SaveModifedExistingReserve",
					"9_Logout" },//9

			{ "1_Login", "2_ClaimZone", "3_StandardClaimSearchScreen", "4_StandardClaimSearchScreen",
					"5_DisplayClaimRecord", "6_DisplayReserveScreen", "7_SaveReserve", "8_DisplayPaymentScreen",
					"9_SavePayment", "10_Logout" },//10

			{ "1_Login", "2_ClaimsZone", "3_DisplayPrintCheckScreen", "4_PrintPreCheckRegister", "5_PrintCheck",
					"6_Logout" },//11

			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaim", "5_OpenClaimDetailPage",
					"6_OpenNewLitigationScreen", "7_SaveLitigation", "8_OpenLitigationAgain",
					"9_SaveModifiedLitigation", "10_Logout" },//12

			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaim", "5_OpenClaimDetailPage",
					"6_OpenLiabilityLossPage", "7_SaveLiabilityLoss", "8_Logout" },//13
		
			{ "1_Login", "2_MaintenanceZone", "3_OpenEmployeeSearch", "4_SearchSpecificEmployee",
					"5_LoadEmployeeDetailPage", "6_Logout" },//14

		        { "1_Login", "2_ClaimZone", "3_OpenGeneralClaim", "4_OpenOrg.Hierarchy", "5_Logout" },//15
		
			{ "1_Login", "2_ClaimZone", "3_ShowCreateNewEventPage", "4_SaveEvent", "5_OpenRecentEvent",
					"6_Logout" },//16

			{ "1_Login", "2_ClaimZone", "3_ShowDiaryList", "4_SaveDiary", "5_Logout" },//17

			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaim", "5_OpenClaimDetailPage",
					"6_OpenExecutiveSummary", "7_Logout" },//18

			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaim", "5_OpenClaimDetailPage",
					"6_OpenEnhancedNotes", "7_ClickToCreateNewEnhancedNotes", "8_SaveEnhancedNotes",
					"9_BackToEnhancedNotes", "10_ClickToEditEnhancedNotes", "11_SaveModifiedEnhancedNotes",
					"12_BackToEnhancedNotes", "13_Logout" },//19

			{ "1_Login", "2_MaintenanceZone", "3_CreateEntityPageLoaded", "4_SaveEntity", "5_Logout" },//20

			{ "1_Login", "2_MaintenanceZone", "3_OpenEntitySearch", "4_SearchSpecificEntity",
					"5_OpenEntityDetailPage", "6_SavedModifiedEntity", "7_Logout" },//21

			{ "1_Login", "2_ClaimZone", "3_ShowDiaryCalendar", "4_Logout" },//22
			
			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaimViaClaiamant",
					"5_OpenClaimDetailPage", "6_Logout" },//23
			
			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaim", "5_OpenClaimDetailPage",
					"6_OpenClaimCommentsPopup", "7_OpenClaimCommentSummaryPopup", "8_Logout" },//24
			
			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaim", "5_OpenClaimDetailPage",
					"6_OpenClaimLevelDiaries", "7_Logout" },//25
			
			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaim", "5_OpenClaimDetailPage",
					"6_OpenEnhancedNotes", "7_Logout" },//26

			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaim", "5_OpenClaimDetailPage",
					"6_OpenAttachments", "7_Logout" },//27

			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaim", "5_OpenClaimDetailPage",
					"6_OpenTransactionHistory", "7_Logout" },//28

			{ "1_Login", "2_ClaimZone", "3_OpenDiarySearch", "4_SearchSpecificDiaries", "5_Logout" },//29

			{ "1_Login", "2_ClaimZone", "3_OpenClaimSearchPage", "4_SearchSpecificClaim", "5_OpenClaimDetailPage",
					"6_OpenAttachmentPopup", "7_ClickToAddNewAttachment", "8_SaveAttachment", "9_EditAttachment",
					"10_SaveEditedAttachment", "11_Logout" },//30

			{ "1_Login", "2_MaintenanceZone", "3_OpenOrg.Hierarchy", "4_AddNewOrgHierarchy",
					"5_SaveNewOrgHierarchy", "6_EditOrgHierarchy", "7_SaveModifiedOrgHierarchy", "8_Logout" },//31

			{ "1_Login", "2_ClaimZone", "3_OpenNewGeneralClaimScreen", "4_SaveNewGeneralClaim",
					"5_OpenAddNewClaimantScreen", "6_SaveNewClaimant", "7_Logout" },//32

			
		};
		int i = Integer.parseInt(args[2]);
		T(args, bp[i]);

	}

	public static void T(String[] args, String bp[]) {
		for (int v = 3; v <= 4; v++) {
			System.setProperty("webdriver.chrome.driver",
					"C://apache-jmeter-5.3//apache-jmeter-5.3//extras//Results//chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("headless");
			option.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(option);
			driver.get("file:///C:/apache-jmeter-5.3/apache-jmeter-5.3/extras/Results/" + args[1] + "/" + args[1]
					+ "_1_" + v + "/index.html");
			String constraint1 = driver.findElement(By.cssSelector("span#pieLabel1 div")).getText();
			String cons1 = constraint1.substring(2).trim();
			for (int i = 1; i <= bp.length + 1; i++) {
				String s = driver
						.findElement(By.xpath(
								"//table[@id='statisticsTable']//tbody[@aria-live='polite']//tr[" + i + "]//td[1]"))
						.getText();
				String s1 = driver
						.findElement(By.xpath(
								"//table[@id='statisticsTable']//tbody[@aria-live='polite']//tr[" + i + "]//td[6]"))
						.getText();
				String path = "C:/apache-jmeter-5.3/apache-jmeter-5.3/extras/Results/" + args[0] + ".xlsx";
				if (!s.equals("Transaction Controller")) {
					int j = linearSearch(bp, s);
					if (cons1.equals("100%")) {
						WriteDataToExcel(path, args[1], v + 6, j + 2,
								String.format("%.2f", Float.parseFloat(s1) / 1000));
					}
				}
			}
			driver.quit();
		}
	}

	public static int linearSearch(String s[], String key) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(key)) {
				return i;
			}
		}
		return -1;
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
