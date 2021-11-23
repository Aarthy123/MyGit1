package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public static void main(String[]args) throws IOException{

		File f = new File("C:\\Users\\madhubalan\\Desktop\\WriteExcel22102021.xlsx");
		FileOutputStream os = new FileOutputStream(f);
		Workbook w = new XSSFWorkbook();

		Sheet s = w.createSheet("NewSheet1");
		Row r = s.createRow(0);
		Cell c = r.createCell(1);
		c.setCellValue("Class Task");
		w.write(os);

		}

}
