
package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static WebDriver driver;

	//setProperty
	public static void getDriverMethod(String url){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhubalan\\eclipse-workspace\\SeleniumProject17102021\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	}

	//
	public static void browserlaunchMaven(String url){
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
	}
	
	public static WebElement locators(String locatorType, String value){
		if(locatorType.equals("id")){
		WebElement findElement = driver.findElement(By.id(value));
		return findElement;
		}
		else if(locatorType.equals("name")){
		WebElement findElement = driver.findElement(By.name(value));
		return findElement;
		}
		else{
		WebElement findElement = driver.findElement(By.xpath(value));
		return findElement;
		}
		}

	
	public static String excelRead(String path, String sheetname, int rowindex, int cellindex) throws IOException{
		File f = new File(path);
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rowindex);
		Cell cell = row.getCell(cellindex);
		int cellType = cell.getCellType();

		if(cellType==1){
		String stringCellValue = cell.getStringCellValue();
		return stringCellValue;
		}

		else if(DateUtil.isCellDateFormatted(cell)){
		Date datecellValue = cell.getDateCellValue();
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String format = s.format(datecellValue);
		return format;
		}
		else{
		double numericCellvalue = cell.getNumericCellValue();
		long l = (long)numericCellvalue;
		String valueOf = String.valueOf(l);
		return valueOf;
		}}

	//to find the locator by using id
	public WebElement  locatorsById (String locatorType, String value){
	WebElement element = driver.findElement(By.id("value"));
	return element;
	}

	//
	//to find webElement locators by name
	public WebElement locatorsByName(String locatorType, String value){
	WebElement element = driver.findElement(By.name("value"));
	return element;
	}

	//
	//to find webElement Locators by Xpath
	public WebElement locatorsByXpath(String locatorType, String value){
	WebElement element = driver.findElement(By.xpath("value")); 
	return element;
	}

	//
	//to find webElement Locators by tagName
	public WebElement locatorsBytagName(String locatorType, String value){
	WebElement element = driver.findElement(By.tagName("value"));
	return element;
	}

	
	
	//to write - sendkeys
	public static void sendkeyMethod(WebElement element, String data){
	element.sendKeys(data);
	}

	//to getTitle
	public String getTitleMethod(){
	String title = driver.getTitle();
	return title;
	}

	//to click
	public static void clickMethod(WebElement element) {
	element.click();
	}
	
	//to clear
	public void clearMethod(WebElement element) {
	element.clear();
	}


	//to get text
	public String getTextMethod(WebElement element){
	String text = element.getText();
	return text;
	}

	//to maximize the browser
	public void maximizeBrowserMethod(){
	driver.manage().window().maximize();
	}

	//to close the browser
	public void closeBrowserMethod(){
	driver.close();
	}
	

	//to close all browsers
	public void closeAllBrowsersMethod(){
	driver.quit();
	}

	//to get current url
	public String getCurrentUrlMethod(){
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
	}
	

	//to move to element MouseOver actions
	public void MoveToElementsMouseOverActions(WebElement element){
	Actions actions = new Actions(driver);
	actions.moveToElement(element).perform();
	}

	//to click - MouseOverActions
	public void clickMouseOverActions(WebElement element){
	Actions actions = new Actions(driver);
	actions.click(element).perform();
	}

	//to right click - MouseOverActions
	public void rightClickMouseOverActions(WebElement element){
	Actions actions = new Actions(driver);
	actions.contextClick(element).perform();
	}

	//to double click - MouseOverActions
	public void doubleClickMouseOverActions(WebElement element){
	Actions actions = new Actions(driver);
	actions.doubleClick(element).perform();
	}

	//to drag and drop 
	public void dragAndDropMethod(WebElement dragElement, WebElement dropElement){
	Actions actions = new Actions(driver);
	actions.dragAndDrop(dragElement, dropElement).perform();
	}

	//to Switch control toAlert and accept the Alert
	public void switchToAndAcceptMethod(){
	Alert a = driver.switchTo().alert();
	a.accept();
	}

	//to Switch control to Alert and dismiss the Alert
	public void switchToAndDismissMethod(){
	Alert a = driver.switchTo().alert();
	a.dismiss();
	}

	//to Switch control to Alert and type out text in Alert
	public void typeTextInAlertMethod(String data){
	Alert a = driver.switchTo().alert();
	a.sendKeys(data);
	}

	//to TakeScreenShot

	public void takeScreenShotMethod(String path) throws Exception{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File screenShotAs = ts.getScreenshotAs(OutputType.FILE);
	File f = new File(path);
	FileUtils.copyFile(screenShotAs, f);
	}

	//to select by index - DropDown
	public void selectByIndexMethod(WebElement element, int x){
	Select s = new Select(element);
	s.selectByIndex(x);
	}

	//to Deselect by index - Multiple Drop Down
	public void deselectByIndexMethod(WebElement element, int x){
	Select s = new Select(element);
	s.deselectByIndex(x);
	}

	//to select by Value - DropDown
	public void selectByValueMethod(WebElement element, String value){
	Select s = new Select(element);
	s.selectByValue(value);
	}

	//to Deselect by value - Multiple Drop Down
	public void deselectByValueMethod(WebElement element, String value){
	Select s = new Select(element);
	s.deselectByValue(value);
	}

	//to select by Visible Text
	public void selectByVisibleTextMethod(WebElement element, String text){
	Select s = new Select(element);
	s.selectByVisibleText(text);
	}

	//to deselect by Visible Text - Multiple DropDown
	public void deselectByVisibleTextMethod(WebElement element, String text){
	Select s = new Select(element);
	s.deselectByVisibleText(text);
	}

	//to deselect All - Multiple DropDown
	public void deselctAllMethod(WebElement element){
	Select s = new Select(element);
	s.deselectAll();
	}

	//to get the first Seleted option - multiple drop down
	public void getFirstSelectedOptionMethod(WebElement element){
	Select s = new Select(element);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	}

	//to check if the its Multiple DropDown
	public void isMultipleMethod(WebElement element){
	Select s = new Select(element);
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
	}


	
}
