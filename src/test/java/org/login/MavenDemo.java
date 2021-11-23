package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenDemo {

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver we = new ChromeDriver();
			we.get("http://demo.automationtesting.in/Register.html");
			
			WebElement firstName = we.findElement(By.xpath("//input[@placeholder='First Name']"));
			firstName.click();
			firstName.sendKeys("Raja");
			
			WebElement lastName = we.findElement(By.xpath("//input[@placeholder='Last Name']"));
			lastName.click();
			lastName.sendKeys("Kumar");
			
			WebElement address = we.findElement(By.xpath("//textarea[@ng-model='Adress']"));
			address.click();
			address.sendKeys("Chennai, TamilNadu");
			
			WebElement email = we.findElement(By.xpath("//input[@type='email']"));
			email.click();
			email.sendKeys("rajakumar@gmail.com");
			
			WebElement phone = we.findElement(By.xpath("//input[@ng-model='Phone']"));
			phone.click();
			phone.sendKeys("9898989898");
			
			WebElement gender = we.findElement(By.xpath("//input[@value='Male']"));
			gender.click();
			
			WebElement cricket= we.findElement(By.xpath("//input[@value='Cricket']"));
			cricket.click();
			
			WebElement languageclick= we.findElement(By.xpath("//div[@id='msdd']"));
		languageclick.click();
		WebElement selectLanguage = languageclick.findElement(By.xpath("//a[text()='Croatian']"));
		selectLanguage.click();
		
		WebElement selectClick = we.findElement(By.xpath("//select[@id='Skills']"));
		selectClick.click();
		
		Select s = new Select(selectClick);
		s.selectByIndex(2);
		
		
			
		}

	}

