package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File F=new File(".\\Testdata1\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fis=new FileInputStream(F);
		Workbook work=WorkbookFactory.create(fis);
		String test = work.getSheet("Sheet3").getRow(1).getCell(2).getStringCellValue();
		System.out.println(test);
		

	}

}
