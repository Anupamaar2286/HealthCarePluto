package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
/**
 * this is a generic method to read data from excel
 * @param sheetName
 * @param rowNum
 * @param cellNum
 * @return
 * @throws Exception
 */
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception
	{
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		String cellValue = df.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return cellValue;
		
	}

/* 
 * Row r = sh.getRow(5); 
 * Cell c = r.getCell(4); String
 *  String cellValue=c.getStringCellValue();
 *  any data we fetch it will in String format we cannot numeric data it will throw an exception
 *  hence we have to use DataFormatter to convert any type of data to String
 */

/**
 * this a generic method to read multiple data from an excel
 * @param sheetName
 * @throws Exception
 */
public String getMultipleDataFromExcel(String sheetName)throws Exception
{
	String data =null;

	FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet(sheetName);
	DataFormatter format = new DataFormatter();
	for(int i=0; i<=sh.getLastRowNum();i++)
	{
		Row r = sh.getRow(i);
		for(int j=0; j<=r.getLastCellNum();j++)
		{
		 data = format.formatCellValue(r.getCell(j));
		}
	}
	return data;
}

public void writeDataInExcel(String sheetName, int rowNum, int cellNum, String data) throws Exception
{
	FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh=book.getSheet(sheetName);
	sh.createRow(rowNum).createCell(cellNum).setCellValue(IconstantUtility.excelPath);
	FileOutputStream fos = new FileOutputStream(IconstantUtility.excelPath);
	book.write(fos);
	
	
}

}





























