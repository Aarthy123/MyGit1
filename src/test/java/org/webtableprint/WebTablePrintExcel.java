package org.webtableprint;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePrintExcel{


public static void main(String[]args) throws IOException{

File f = new File("C:\\Users\\madhubalan\\Desktop\\Maven\\ToughTask1234.xlsx");
FileOutputStream os = new FileOutputStream(f);
Workbook wb = new XSSFWorkbook();
Sheet s1 = wb.createSheet("ICCdetails");

WebDriverManager.chromedriver().setup();
WebDriver we = new ChromeDriver();

we.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
WebElement table = we.findElement(By.tagName("table"));

WebElement tHead = table.findElement(By.tagName("thead"));

WebElement tRow = tHead.findElement(By.tagName("tr"));

//for (int i = 0; i <=tRow.size(); i++) {
	

//Row row = s1.createRow(i);
List<WebElement> tHead1 = tRow.findElements(By.tagName("th"));
for(int t1h = 0;t1h<tHead1.size();t1h++){
WebElement alltHead = tHead1.get(t1h);
String textalltHead = alltHead.getText();
//System.out.print(textalltHead+"\t");
//Cell createCell = row.createCell(t1h);
//createCell.setCellValue(textalltHead);


WebElement tBody = table.findElement(By.tagName("tbody"));

List<WebElement> tRow1 = tBody.findElements(By.tagName("tr"));
for (int t1r = 0; t1r<tRow1.size();t1r++){
WebElement alltRow = tRow1.get(t1r);

List<WebElement> tData = alltRow.findElements(By.tagName("td"));
for(int t1d=0;t1d<tData.size();t1d++){
WebElement alltData = tData.get(t1d);
//Cell cell = row.createCell(t1d);
String textall = alltData.getText();
System.out.println(textall);
//cell.setCellValue(textall);




}
}
}
}
//wb.write(os);
}
