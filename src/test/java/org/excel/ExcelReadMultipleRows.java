package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadMultipleRows {
	public static void main(String[]args) throws IOException{
		File f = new File ("C:\\Users\\madhubalan\\Desktop\\Maven\\workbook1.xlsx");

		FileInputStream Stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(Stream);

		Sheet s = w.getSheet("MavenSheet");

		int n = s.getPhysicalNumberOfRows();
		for(int i =0;i<n;i++){
		Row r = s.getRow(i);
		
		int m =r.getPhysicalNumberOfCells();
		for(int j = 0; j<m;j++){
		Cell c = r.getCell(j);
		
		String text = c.getStringCellValue();
		System.out.print(text);
		
		System.out.print("\t");
		}
		System.out.println("\n");
	}
}
}