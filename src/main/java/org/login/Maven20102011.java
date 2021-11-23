package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven20102011 {
	public static void main(String[] args) throws InterruptedException {
		
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
		Thread.sleep(2000);
		
		WebElement arabicClick = we.findElement(By.xpath("//a[text()='Arabic']"));
		arabicClick.click();
		
	
	}
	}


