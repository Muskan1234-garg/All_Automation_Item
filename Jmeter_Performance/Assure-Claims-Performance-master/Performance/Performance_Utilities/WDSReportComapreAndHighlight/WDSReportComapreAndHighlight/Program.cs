using System;
using System.Configuration;
using NPOI.SS.UserModel;
using NPOI.XSSF.UserModel;
using System.IO;

//ctrl+k+c --- comment
//ctrl+k , ctrl+u -->uncomment

namespace WDSReportComapreAndHighlight
{
    class Program
    {
        static void Main(string[] args)
        {
            string sFirstExcelPath = ConfigurationManager.AppSettings["firstExcelPath"]; //this must be current release sheet
            string sSecondExcelPath = ConfigurationManager.AppSettings["secondExcelPath"];//this must be current-1 release sheet
            string sReleaseType = ConfigurationManager.AppSettings["releaseType"];//User need to specify whether it is final or mid release 

            Console.WriteLine(sFirstExcelPath);
            Console.WriteLine(sSecondExcelPath);
            Console.WriteLine(sReleaseType);
            Console.WriteLine("-------------------------------------------------------------------------------------");

            string[] sSheetName = {"RMA_TC_001", "RMA_TC_002", "RMA_TC_003", "RMA_TC_004", "RMA_TC_005", "RMA_TC_006",
                "RMA_TC_007", "RMA_TC_008", "RMA_TC_009", "RMA_TC_010", "RMA_TC_012", "RMA_TC_013", "RMA_TC_014",
                "RMA_TC_015", "RMA_TC_016", "RMA_TC_017", "RMA_TC_018", "RMA_TC_019", "RMA_TC_020", "RMA_TC_021",
                "RMA_TC_022", "RMA_TC_023", "RMA_TC_024", "RMA_TC_025", "RMA_TC_026", "RMA_TC_027", "RMA_TC_028",
                "RMA_TC_029", "RMA_TC_030", "RMA_TC_031", "RMA_TC_032" };

            int[] iBreakpoints = {13, 13, 9, 9, 8, 8, 9, 9, 9, 10, 10, 8, 6, 5, 6, 5, 7, 13, 5, 7, 4, 6, 8, 7, 7, 7, 7, 5, 11, 8, 7 };

           // Function for compare & highlight values over sheet 
           CompareExcelFiles(sFirstExcelPath, sSecondExcelPath, sSheetName, iBreakpoints, sReleaseType);

        }

        public static IWorkbook LoadWorkbook(string sFilePath)
        {
            using (var fileStream = new FileStream(sFilePath, FileMode.Open, FileAccess.Read))
            {
                return new XSSFWorkbook(fileStream);
            }
        }

        public static void CompareExcelFiles(string sFilePath1, string sFilePath2, string[] sSheetName, int[] iBreakpoint, string sReleaseType)
        {
            // Load the first Excel file
            IWorkbook workbook1 = LoadWorkbook(sFilePath1);

            // Load the second Excel file
            IWorkbook workbook2 = LoadWorkbook(sFilePath2);

            ISheet firstExcelWorksheets;
            ISheet secondExcelWorksheets;

            int k = 0; // to initialize break point array

            for (int j = 0; j < sSheetName.Length; j++)
            {
                // Get the worksheets from first excel file
                firstExcelWorksheets = workbook1.GetSheet(sSheetName[j]);

                // Get the worksheets from second excel file
                secondExcelWorksheets = workbook2.GetSheet(sSheetName[j]);

                // Store value of averages[7th row] in array from first excel
                double[] firstArrayValues = new double[13];

                // Store value of averages[7th row] in array from first excel
                double[] secondArrayValues = new double[13];

                // Get the values of the averages[7th row] for first, second excel file
                for (int i = 0; i < iBreakpoint[k]; i++)
                {
                    firstArrayValues[i] = firstExcelWorksheets.GetRow(6).GetCell(i + 2).NumericCellValue;
                    secondArrayValues[i] = secondExcelWorksheets.GetRow(6).GetCell(i + 2).NumericCellValue;
                }

                // Create a cell style and set the desired background color red
                ICellStyle cellStyle_red = workbook1.CreateCellStyle();
                cellStyle_red.FillForegroundColor = IndexedColors.Red.Index;
                cellStyle_red.FillPattern = FillPattern.SolidForeground;

                // Create a cell style and set the desired background color orange
                ICellStyle cellStyle_orange = workbook1.CreateCellStyle();
                cellStyle_orange.FillForegroundColor = IndexedColors.LightOrange.Index;
                cellStyle_orange.FillPattern = FillPattern.SolidForeground;


                // Create a cell style and set the desired background color green
                ICellStyle cellStyle_green = workbook1.CreateCellStyle();
                cellStyle_green.FillForegroundColor = IndexedColors.BrightGreen.Index;
                cellStyle_green.FillPattern = FillPattern.SolidForeground;

                Console.WriteLine("SheetName -->" + sSheetName[j]);
                Console.WriteLine();

                for (int i = 0; i < iBreakpoint[k]; i++)
                {

                    // if difference is greater than 2 then highlight the cell with red color--> Shows performance degradation
                    if ((firstArrayValues[i] - secondArrayValues[i]) > 2 && firstArrayValues[i] != 0D)
                    {
                        // Apply the cell style to the cell
                        ICell cell = firstExcelWorksheets.GetRow(6).GetCell(i + 2);
                        string formattedValue = string.Format("{0:F2}", cell.NumericCellValue);
                        Console.WriteLine("RED    -> " + formattedValue);
                        cell.SetCellValue(formattedValue);
                        cell.CellStyle = cellStyle_red;
                    }

                    // if difference is greater than 1 then highlight the cell with orange color--> Shows minor performance degradation
                    else if ((firstArrayValues[i] - secondArrayValues[i]) > 1 && firstArrayValues[i] != 0D)
                    {

                        // Apply the cell style to the cell
                        ICell cell = firstExcelWorksheets.GetRow(6).GetCell(i + 2);
                        string formattedValue = string.Format("{0:F2}", cell.NumericCellValue);
                        Console.WriteLine("ORANGE -> " + formattedValue);
                        cell.SetCellValue(formattedValue);
                        cell.CellStyle = cellStyle_orange;
                    }

                    // Chechking sheet1 value should be less than sheet2
                    // Substracting sheet2 value with sheet1 and if differnece is greater than 0.70 then highlight the cell with green color--> Shows performance improvement
                    else if ((firstArrayValues[i] < secondArrayValues[i]) && (secondArrayValues[i] - firstArrayValues[i]) > 0.70 && firstArrayValues[i] != 0D)
                    {
                        ICell cell = firstExcelWorksheets.GetRow(6).GetCell(i + 2);
                        string formattedValue = string.Format("{0:F2}", cell.NumericCellValue);
                        Console.WriteLine("GREEN  -> " + formattedValue);
                        cell.SetCellValue(formattedValue);
                        cell.CellStyle = cellStyle_green;
                    }
                    else { }
                }

                //if release type is not equal to mid release then it will compare 15th row also,hence it is for final release
                if (!(sReleaseType.Equals("Mid Release", StringComparison.OrdinalIgnoreCase)))
                {

                    // Store value of averages[15th row] in array from first excel
                    double[] firstArrayValues1 = new double[13];

                    // Store value of averages[15th row] in array from second excel
                    double[] secondArrayValues1 = new double[13];

                    // Get the values of the averages[15th row] for first,second excel file
                    for (int i = 0; i < iBreakpoint[k]; i++)
                    {
                        firstArrayValues1[i] = firstExcelWorksheets.GetRow(14).GetCell(i + 2).NumericCellValue;
                        secondArrayValues1[i] = secondExcelWorksheets.GetRow(14).GetCell(i + 2).NumericCellValue;
                    }

                    for (int i = 0; i < iBreakpoint[k]; i++)
                    {

                        // if difference is greater than 2 then highlight the cell with red color--> Shows performance degradation
                        if ((firstArrayValues1[i] - secondArrayValues1[i]) > 2 && firstArrayValues1[i] != 0D)
                        {
                            ICell cell = firstExcelWorksheets.GetRow(14).GetCell(i + 2);
                            string formattedValue = string.Format("{0:F2}", cell.NumericCellValue);
                            cell.SetCellValue(formattedValue);
                            Console.WriteLine("RED    -> " + formattedValue);
                            cell.CellStyle = cellStyle_red;
                        }

                        // if difference is greater than 1 then highlight the cell with orange color--> Shows minor performance degradation
                        else if ((firstArrayValues1[i] - secondArrayValues1[i]) > 1 && firstArrayValues1[i] != 0D)
                        {

                            // Apply the cell style to the cell
                            ICell cell = firstExcelWorksheets.GetRow(14).GetCell(i + 2);
                            string formattedValue = string.Format("{0:F2}", cell.NumericCellValue);
                            Console.WriteLine("ORANGE -> " + formattedValue);
                            cell.SetCellValue(formattedValue);
                            cell.CellStyle = cellStyle_orange;
                        }

                        // Chechking sheet1 value should be less than sheet2
                        // Substracting sheet2 value with sheet1 and if differnece is greater than 0.70 then highlight the cell with green color--> Shows performance improvement
                        else if ((firstArrayValues1[i] < secondArrayValues1[i]) && (secondArrayValues1[i] - firstArrayValues1[i]) > 0.70 && firstArrayValues1[i] != 0D)
                        {
                            ICell cell = firstExcelWorksheets.GetRow(14).GetCell(i + 2);
                            string formattedValue = string.Format("{0:F2}", cell.NumericCellValue);
                            cell.SetCellValue(formattedValue);
                            Console.WriteLine("GREEN  -> " + formattedValue);
                            cell.CellStyle = cellStyle_green;
                        }
                        else { }
                    }
                }

                k++; // increasing value of breakpoint array after each iteration
               // Console.WriteLine("Testcase No."+ k);
                Console.WriteLine("------------------------------");
                // Save the changes to the Excel file
                using (FileStream saveFileStream = new FileStream(sFilePath1, FileMode.Create, FileAccess.Write))
                {
                    workbook1.Write(saveFileStream, false);
                }

            }
        }
    }

}
