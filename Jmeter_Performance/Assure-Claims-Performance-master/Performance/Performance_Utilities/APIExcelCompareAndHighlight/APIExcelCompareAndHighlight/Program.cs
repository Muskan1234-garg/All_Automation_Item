using System;
using System.Configuration;
using NPOI.SS.UserModel;
using NPOI.XSSF.UserModel;
using System.IO;

//ctrl+k+c --- comment
//ctrl+k , ctrl+u -->uncomment

namespace NEW
{
    class Program
    {
        static void Main(string[] args)
        {
            string sFirstExcelPath = ConfigurationManager.AppSettings["firstExcelPath"];//this must be current release sheet
            string sSecondExcelPath = ConfigurationManager.AppSettings["secondExcelPath"];//this must be current-1 release sheet

            Console.WriteLine(sFirstExcelPath);
            Console.WriteLine(sSecondExcelPath);
            Console.WriteLine("---------------------------------------------------------------------------------");

            string[] sSheetName = {"RMA_TC_001", "RMA_TC_002", "RMA_TC_003", "RMA_TC_004", "RMA_TC_005", "RMA_TC_006",
                "RMA_TC_007", "RMA_TC_008", "RMA_TC_009", "RMA_TC_010", "RMA_TC_012", "RMA_TC_013", "RMA_TC_014",
                "RMA_TC_015", "RMA_TC_016", "RMA_TC_017", "RMA_TC_018", "RMA_TC_019", "RMA_TC_020", "RMA_TC_021",
                "RMA_TC_022", "RMA_TC_023", "RMA_TC_024", "RMA_TC_025", "RMA_TC_026", "RMA_TC_027", "RMA_TC_028",
                "RMA_TC_029", "RMA_TC_030", "RMA_TC_031", "RMA_TC_032" };

            // Function for compare & highlight values over sheet 
            CompareExcelFiles(sFirstExcelPath, sSecondExcelPath, sSheetName) ;

        }

        public static IWorkbook LoadWorkbook(string sFilePath)
        {
            using (var fileStream = new FileStream(sFilePath, FileMode.Open, FileAccess.Read))
            {
                return new XSSFWorkbook(fileStream);
            }
        }

        public static void CompareExcelFiles(string sFilePath1, string sFilePath2, string[] sSheetName)
        {
            // Load the first Excel file
            IWorkbook workbook1 = LoadWorkbook(sFilePath1);

            // Load the second Excel file
            IWorkbook workbook2 = LoadWorkbook(sFilePath2);

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

            // Create a cell style and set the desired background color light green
            ICellStyle cellStyle_lightgreen = workbook1.CreateCellStyle();
            cellStyle_lightgreen.FillForegroundColor = IndexedColors.LightGreen.Index;
            cellStyle_lightgreen.FillPattern = FillPattern.SolidForeground;



            for (int i=0; i < sSheetName.Length; i++)
            {
                // Get the worksheets from first excel file
                ISheet worksheet1 = workbook1.GetSheet(sSheetName[i]);

                // Get the worksheets from second excel file
                ISheet worksheet2 = workbook2.GetSheet(sSheetName[i]);

                Console.WriteLine();
                Console.WriteLine("SheetName -> "+sSheetName[i]);
                Console.WriteLine();

                for (int row = 4; row <= 27; row++)
                {
                    for(int column=4; column<=6; column++)
                    {
                        ICell cell1 = worksheet1.GetRow(row).GetCell(column);
                        ICell cell2 = worksheet2.GetRow(row).GetCell(column);

                        if (row == 8 && row == 12 && row == 16 && row == 20 && row == 24)
                        {
                        }
                        else
                        {
                            double value1 = cell1.NumericCellValue;
                            double value2 = cell2.NumericCellValue;

                            // if difference is greater than 2 then highlight the cell with red color--> Shows performance degradation
                            if ((value1 - value2) > 2)
                            {
                                string formattedValue = string.Format("{0:F2}", value1);
                                Console.WriteLine("RED   -> " + formattedValue);
                                cell1.CellStyle = cellStyle_red;
                            }

                            // if difference is greater than 1 then highlight the cell with orange color--> Shows minor performance degradation
                            else if ((value1 - value2) > 1)
                            {
                                string formattedValue = string.Format("{0:F2}", value1);
                                Console.WriteLine("ORANGE   -> " + formattedValue);
                                cell1.CellStyle = cellStyle_orange;
                            }

                            // Chechking sheet1 value should be less than sheet2
                            // Substracting sheet2 value with sheet1 and if differnece is greater than 3 then highlight the cell with green color--> Shows performance improvement
                            else if (value1 < value2 && (value2 - value1) > 3 )
                            {
                                string formattedValue = string.Format("{0:F2}", value1);
                                Console.WriteLine("GREEN   -> " + formattedValue);
                                cell1.CellStyle = cellStyle_green;
                            }

                            // Chechking sheet1 value should be less than sheet2
                            // Substracting sheet2 value with sheet1 and if differnece is greater than 2 then highlight the cell with green color--> Shows minor performance improvement
                            else if (value1 < value2 && (value2 - value1) > 2)
                            {
                                string formattedValue = string.Format("{0:F2}", value1);
                                Console.WriteLine("LIGHTGREEN   -> " + formattedValue);
                                cell1.CellStyle = cellStyle_lightgreen;
                            }

                            else
                            {

                            }
                        }
                    }
                }
                Console.WriteLine("---------------------------------------------");
            }
           

                 // Save the modified workbook
                using (FileStream saveFileStream = new FileStream(sFilePath1, FileMode.Create, FileAccess.Write))
                {
                    workbook1.Write(saveFileStream, false);
                }
        }

       
    }
    
}



            