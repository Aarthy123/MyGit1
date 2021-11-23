package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadMultipleRows22102021at10am {
	public static void main(String[]args) throws IOException{

		File f = new File("C:\\Users\\madhubalan\\Desktop\\Maven\\workbook.xlsx");

		FileInputStream fs = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fs);

		Sheet sh =w.getSheet("MavenSheet");

		int nr = sh.getPhysicalNumberOfRows();

		for(int i = 0; i < nr; i++){

		Row r = sh.getRow(i);

		int nc = r.getPhysicalNumberOfCells();

		for(int j = 0; j<nc; j++){

		Cell c = r.getCell(j);
		int ct = c.getCellType();
		if(ct==1){
		String text = c.getStringCellValue();
		System.out.println(text);
		}
		else if(DateUtil.isCellDateFormatted(c)){
		Date dcv = c.getDateCellValue();
		SimpleDateFormat df = new SimpleDateFormat("MMM/dd/yyyy");
		String format = df.format(dcv);
		System.out.println(format);
		}
		else{
		double ncv = c.getNumericCellValue();
		long l =(long)ncv;
		System.out.println(l);
		}
		}
		}
	}}