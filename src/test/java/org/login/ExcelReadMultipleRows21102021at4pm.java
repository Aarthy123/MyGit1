package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadMultipleRows21102021at4pm {
	public static void main(String[]args) throws IOException{

		File f = new File("C:\\Users\\madhubalan\\Desktop\\Maven\\workbook.xlsx");
		FileInputStream s = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(s);

		Sheet sh = w.getSheet("MavenSheet");

		int nr = sh.getPhysicalNumberOfRows();
		for(int i = 0; i<nr;i++){
		Row r = sh.getRow(i);

		int nc = r.getPhysicalNumberOfCells();
		for(int j =0;j<nc;j++){
		Cell c = r.getCell(j);

		int ct = c.getCellType();
		if(ct==0) {
		double nC = c.getNumericCellValue();
		long l = (long) nC;
		System.out.println(l);
		}
		else{
		String sCell = c.getStringCellValue();
		System.out.println(sCell);
		}
		}

		}
	}
}
