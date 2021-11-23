package org.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class DemoAutomationFromExcel extends BaseClass{
	public static void main(String[]args) throws IOException{


DemoAutomationFromExcel d = new DemoAutomationFromExcel();

d.browserlaunchMaven("http://demo.automationtesting.in/Register.html");

String excelRead = d.excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\workbook.xlsx", "MavenSheet", 1, 1);

WebElement firstname = d.locators("xpath", "//input[@placeholder='First Name']");
d.sendkeyMethod(firstname, excelRead);

	String excelRead2 = d.excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\workbook.xlsx", "MavenSheet", 2, 1);
	
	WebElement locators2 = d.locators("xpath", "//input[@placeholder='Last Name']");
	d.sendkeyMethod(locators2, excelRead2);
	

	String excelRead3 = d.excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\workbook.xlsx", "MavenSheet", 3, 1);
	
	WebElement locators3 = d.locators("xpath", "//textarea[@ng-model='Adress']");
	d.sendkeyMethod(locators3, excelRead3);
	
	String excelRead4 = d.excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\workbook.xlsx", "MavenSheet", 4, 1);
	
	WebElement locators4 = d.locators("xpath", "//input[@type='email']");
	d.sendkeyMethod(locators4, excelRead4);
	
String excelRead5 = d.excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\workbook.xlsx", "MavenSheet", 5, 1);
	
	WebElement locators5 = d.locators("xpath", "//input[@ng-model='Phone']");
	d.sendkeyMethod(locators5, excelRead5);
	
	
	
	}
}