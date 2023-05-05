package Selenium_Practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead {

	public static void main(String[] args) throws Exception {

		File file = new File("F:\\Tech-Influx\\Selenium\\example_XLS.xlsx");
		FileInputStream fInput = new FileInputStream(file);

		XSSFWorkbook workBook = new XSSFWorkbook(fInput);
		XSSFSheet Sheet = workBook.getSheet("Sheet1");

		// find out Lenth of row,Column.
		int rowSize = Sheet.getLastRowNum();
		int columLenth = Sheet.getRow(0).getPhysicalNumberOfCells();
		int columIndexs = Sheet.getRow(0).getLastCellNum();
		System.out.println(rowSize);
		System.out.println(columLenth);
		System.out.println(columIndexs);

		for (int i = 1; i < rowSize; i++) {

			for (int j = 0; j < columLenth; j++) {
				XSSFCell Cell = Sheet.getRow(i).getCell(j);
				if (Cell.getCellType() == Cell.CELL_TYPE_STRING) {
					String CellValue=Cell.getStringCellValue();
					System.out.print("  "+CellValue+"  ");
				}else if(Cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					int CellValue=(int) Cell.getNumericCellValue();
					System.out.print("  "+CellValue+"  ");
					
				}
			}
			System.out.println();
			System.out.println();
		}
	}

}