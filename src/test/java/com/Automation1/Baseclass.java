package com.Automation1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
		
	   private static final String FileUtils = null;

	public static String value;
		
		public static WebDriver driver;

		public static  WebDriver getBrowser(String launch) {
			if (launch.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "//Driver//chromedriver1.exe");
				driver = new ChromeDriver();
				
			}
			driver.manage().window().maximize();
			return driver;	
		}
		
		public static void clear_data(WebElement element) {
			element.clear();

		}
		
		//close
		public static void close() {
			driver.close();
		}
		
		//quit
		public static void quit() {
			driver.quit();

		}
		//navigate to   
		public static void navigateto(String url) {
			driver.navigate().to(url);

		}
		//navigate forward
		public static void navigateForward() {
			driver.navigate().forward();	
		}
		//navigate back
		public static void navigateBack() {
			driver.navigate().back();

		}
		//navigate refresh
		public static void navigateRefresh() {
			driver.navigate().refresh();
			
		}

		//Drop down SelectBy 
		public static void selectby(WebElement element , String type,  String values) {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("value")) {
				s.selectByValue(values);
				
			}
			else if (type.equalsIgnoreCase("index")) {
				int index = Integer.parseInt(values);
				s.selectByIndex(index);
				
			} 
			else if (type.equalsIgnoreCase("visible text")) {
				s.selectByVisibleText(values);
				
			}
			else {
				System.out.println("Invalid type");
				
			}
			
		}
			
		
		//deselectAll
		public static void deselectAll(WebElement element) {
			Select s = new Select(element);
			s.deselectAll();

		}
		//Alert
		public static void Alert(WebElement element,String type,String values ) {
			if (type.equalsIgnoreCase("simple")) {
				element.click();
				Alert a = driver.switchTo().alert();
				a.accept();
				
			}else if (type.equalsIgnoreCase("confirm")) {
				element.click();
				Alert a = driver.switchTo().alert();
				a.dismiss();
						
			}else if (type.equalsIgnoreCase("prompt")) {
				element.click();
				Alert a = driver.switchTo().alert();
				a.sendKeys(values);
						
			}else {
				System.out.println("Invalid type");
			}

		}
		
		public static void Alert_cancel(WebElement type) {
			Alert a = driver.switchTo().alert();
			a.dismiss();
			

		}
		
		

		//Mouse actions
		public static void moveto(WebElement element) {
			Actions a = new Actions(driver);
			a.moveToElement(element).perform();
		}
		public static void rightclick(WebElement element) {
			Actions a = new Actions(driver);
			a.contextClick(element).perform();

		}
		public static void drag(WebElement element) {
			Actions a = new Actions(driver);
			a.doubleClick(element).perform();

		}
		public void doubleclick(WebElement element) {
			Actions a = new Actions(driver);
			a.doubleClick(element).perform();
			
		}
		public static void leftclick(WebElement element) {
			Actions a = new Actions(driver);
			a.click().perform();
			

		}
		//Frames
		public static void frameindex(int index) {
		  driver.switchTo().frame(index);
		 
		}
		public static void framestring(String id) {
			driver.switchTo().frame(id);

		}
		public static void frameElement(WebElement element) {
			driver.switchTo().frame(element);

		}
		public static void parentframe() {
			driver.switchTo().parentFrame();

		}
		//keyBoard Actions
		public static void keyup() throws Throwable {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);	

		}
		public static void keydown() throws Throwable {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);	

		}
		public static void keyenter() throws Throwable {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);	

		}
		//is multiple
		public static boolean ismultiple(String value) {
			WebElement multiple = driver.findElement(By.xpath(value));
			Select s = new Select(multiple);
			return s.isMultiple();
		}
		//is displayed
		public static boolean isdisplayed(String value) {
			WebElement d = driver.findElement(By.xpath(value));
			return d.isDisplayed();
			
		}
		public static boolean isenable(String value) {
			WebElement e = driver.findElement(By.xpath(value));
			return e.isEnabled();
		}
		public static boolean isselected(String value) {
			WebElement s = driver.findElement(By.xpath(value));
			return s.isSelected();
		}
		//get options
		public static void getoptions(WebElement  element) {
			Select s = new Select(element);
			java.util.List<WebElement> options = s.getOptions();
			for (WebElement get : options) {
				System.out.println(get.getText());
				
			}

		}
		public static void getTitle(String title) {
			driver.getTitle();

		}
		public static void getcurrenturl() {
			driver.getCurrentUrl();
		}
		public static void geturl(String url) {
			driver.get(url);
		}
		public static void getsize(WebElement element) {
			element.getSize();
		}
		public static void gettext(WebElement element) {
			String text = element.getText();
		    System.out.println(text);
			
		}
		public static void getattribute(WebElement element, String value) {
			String attribute = element.getAttribute(value);
			System.out.println(attribute);

		}
		//wait
		public static void waitimplicit(long value) {
			driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);

		}
		//TakeScreenShot
		public static void screenshot(String filename) throws Throwable {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\Ramprakash\\eclipse-workspace\\Automation_Practice\\Screenshot\\maven.png");
	        FileUtils.copyFile(source, des);
			
		}
		//Send keys
		
		public static void inputvalues(WebElement element,String value) {
			element.sendKeys(value);
			
		}
		//click
		public static void clickonelement(WebElement element) {
			element.click();
			
		}
		//Thread Sleep
		public static void sleep(long millis) throws Throwable { 
			Thread.sleep(millis);
			
		}
		
		public static void tab() {
			Set<String> a = driver.getWindowHandles();
			for (String string : a) {
				driver.switchTo().window(string);
				
			}

		}
		
		public String particular_data_from_excel(String path , int row_index, int cell_index) throws IOException {
			
			File f = new File(path);
			FileInputStream fis = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis);
			Sheet s = w.getSheetAt(0);
			Row row = s.getRow(row_index);
			Cell cell = row.getCell(cell_index);
			CellType cellType = cell.getCellType();
			
			
			if (cellType.equals(cellType.STRING)) {
				value = cell.getStringCellValue();
				
			}else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
	 			value=Double.toString(numericCellValue);
				
			}
	        return value;
		}
		

	}



