package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xlsheet {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Testdata\\New Microsoft Excel Worksheet.xlsx");
		Workbook workbook =WorkbookFactory.create(fis);
		String testdata=workbook.getSheet("Sheet3").getRow(4).getCell(2).getStringCellValue();
		System.out.println(testdata);
	}

}
