package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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

public  class NewBaseClass{

public static  WebDriver driver;

//1. BrowserLaunch

public static void browserLaunch(String url)
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get(url);
}

//2. Read Excel

public static String excelRead(String path, String sheetName, int rowIndex, int cellIndex) throws IOException
{
File f = new File(path);
FileInputStream stream = new FileInputStream(f);

Workbook w = new XSSFWorkbook(stream);
Sheet s = w.getSheet(sheetName);
Row r = s.getRow(rowIndex);
Cell c = r.getCell(cellIndex);

int cellType = c.getCellType();
if(cellType ==1)
{
String stringCellvalue = c.getStringCellValue();
return stringCellvalue;
}

else if (DateUtil.isCellDateFormatted(c))
{
Date dateCellValue = c.getDateCellValue();
SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
String format = date.format(dateCellValue);
return format;
}
else
{
double ncv = c.getNumericCellValue();
long l = (long)ncv;
String valueOf = String.valueOf(l);
return valueOf;
}
}

//3. WriteExcel

private static Object valueOf(long l) {
	// TODO Auto-generated method stub
	return null;
}

public static void writeExcel(String path, String sheetName, int rowIndex, int cellIndex, String value) throws IOException
{
File f = new File(path);
FileOutputStream os = new FileOutputStream(f);

Workbook w = new XSSFWorkbook();
Sheet s = w.createSheet(sheetName);
Row r = s.createRow(rowIndex);
Cell c = r.createCell(cellIndex);
c.setCellValue(value);
w.write(os);
}

//4. locators

public static WebElement locators(String locatorType, String value)
{
if(locatorType.equals("id"))
{
WebElement id = driver.findElement(By.id(value));
return id;
}
else if(locatorType.equals("name"))
{
WebElement name = driver.findElement(By.name(value));
return name;
}
else
{
WebElement xpath = driver.findElement(By.xpath(value));
return xpath;
}
}

//5. Maximize window

public static void maximize()
{
driver.manage().window().maximize();
}

//6. click

public static void btnclick(WebElement element)
{
element.click();
}

//7. clear

public static void clear(WebElement element)
{
element.clear();
}

//8. get Text

public static String getText(WebElement element, String value)
{
String text = element.getText();
return text;
}

//9. get Attribute

public static String getAttribute(WebElement element, String value)
{
String attribute = element.getAttribute(value);
return attribute;
}

//10. enter Text

public static void enterText(WebElement element, String text)
{
element.sendKeys(text);
}

//11. getTitle

public String getTitle()
{
String title = driver.getTitle();
return title;
}



//12.close the browser

public void closeBrowser()
{
driver.close();
}

//13. close all browsers
public void closeAllBrowsers()
{
driver.quit();
}

//14. get current url
public String getCurrentUrl()
{
String currentUrl = driver.getCurrentUrl();
return currentUrl;
}

//15. move to element MouseOver actions

public void MoveToElementsMouseOverActions(WebElement element)
{
Actions actions = new Actions(driver);
actions.moveToElement(element).perform();
}

//16.to click - MouseOverActions

public void clickMouseOverActions(WebElement element)
{
Actions actions = new Actions(driver);
actions.click(element).perform();
}


//17. right click - MouseOverActions

public void rightClickMouseOverActions(WebElement element)
{
Actions actions = new Actions(driver);
actions.contextClick(element).perform();
}

// 18. double click - MouseOverActions

public void doubleClickMouseOverActions(WebElement element)
{
Actions actions = new Actions(driver);
actions.doubleClick(element).perform();
}

//19. drag and drop 

public void dragAndDrop(WebElement dragElement, WebElement dropElement)
{
Actions actions = new Actions(driver);
actions.dragAndDrop(dragElement, dropElement).perform();
}

//20. Switch control toAlert and accept the Alert

public void switchToAndAccept()
{
Alert a = driver.switchTo().alert();
a.accept();
}

//21. Switch control to Alert and dismiss the Alert

public void switchToAndDismiss()
{
Alert a = driver.switchTo().alert();
a.dismiss();
}

//22. Switch control to Alert and type out text in Alert

public void typeTextInAlert(String data)
{
Alert a = driver.switchTo().alert();
a.sendKeys(data);
}

//23. TakeScreenShot

public void takeScreenShot(String path) throws Exception
{
TakesScreenshot ts = (TakesScreenshot)driver;
File screenShotAs = ts.getScreenshotAs(OutputType.FILE);
File f = new File(path);
FileUtils.copyFile(screenShotAs, f);
}

// 24. select by index - DropDown

public static void selectByIndexMethod(WebElement element, int x)
{
Select s = new Select(element);
s.selectByIndex(x);
}



//25.Deselect by index - Multiple Drop Down

public void deselectByIndexMethod(WebElement element, int x)
{
Select s = new Select(element);
s.deselectByIndex(x);
}

//26. Select by Value - DropDown

public static void selectByValue(WebElement element, String value)
{
Select s = new Select(element);
s.selectByValue(value);
}

//27. Deselect by value - Multiple Drop Down

public void deselectByValue(WebElement element, String value)
{
Select s = new Select(element);
s.deselectByValue(value);
}

//28. Select by Visible Text

public void selectByVisibleText(WebElement element, String text)
{
Select s = new Select(element);
s.selectByVisibleText(text);
}

//29. Deselect by Visible Text - Multiple DropDown

public void deselectByVisibleText(WebElement element, String text)
{
Select s = new Select(element);
s.deselectByVisibleText(text);
}

//30. Deselect All - Multiple DropDown

public void deselctAll(WebElement element)
{
Select s = new Select(element);
s.deselectAll();
}

//31. get First Seleted option - multiple drop down

public void getFirstSelectedOption(WebElement element)
{
Select s = new Select(element);
WebElement firstSelectedOption = s.getFirstSelectedOption();
}

//32. to check if the its Multiple DropDown

public void isMultiple(WebElement element)
{
Select s = new Select(element);
boolean multiple = s.isMultiple();
System.out.println(multiple);
}

//33. Static wait 	

public static void sleep(int value) throws InterruptedException 
{
Thread.sleep(value);
}

//34. Implicit wait
	
public static void implicitWait() 
{
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

}