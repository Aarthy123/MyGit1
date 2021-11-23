
package org.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Adactin extends NewBaseClass{

public static void main(String[] args) throws IOException, InterruptedException {

	AdactinLoginPojo ad = new AdactinLoginPojo();
	
	
	browserLaunch("http://adactinhotelapp.com/");
	sleep(5000);
	
	
	WebElement username = ad.getUsername();
	String txtusername = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 0, 0);	
	enterText(username, txtusername);
	System.out.println(txtusername);

	
	WebElement password = ad.getPassword();
	String txtpassword = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 0, 1);
	enterText(password, txtpassword);
	
	WebElement login = ad.getLogin();
	login.click();
	
}

}