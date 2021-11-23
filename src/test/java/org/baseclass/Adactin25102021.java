package org.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Adactin25102021 extends BaseClass{
public static void main(String[]args) throws IOException{

Adactin25102021 a = new Adactin25102021();
a.browserlaunchMaven("http://adactinhotelapp.com/");
String username = a.excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\workbook.xlsx", "Adactin", 0,0);
WebElement txtusername = a.locators("id","username");
a.sendkeyMethod(txtusername, username);
String password = a.excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\workbook.xlsx", "Adactin", 0,1);
WebElement txtPassword = a.locators("id","password");
a.sendkeyMethod(txtPassword, password);
WebElement btnlogin = a.locators("id","login");
btnlogin.click();
WebElement btnlocation = a.locators("id","location");
a.selectByIndexMethod(btnlocation, 0);

}
}