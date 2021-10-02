package com.Automation1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.ActionMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getbrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\Automation1\\Webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();}
		return driver;
	}

	public static void geturl(String url) {
	driver.get(url);}
	
	public static void navigateurl(String value) {
	driver.navigate().to(value);	}
	
	public static void navigateback() {
    driver.navigate().back();}
	
	public static void navigateforward() {
    driver.navigate().forward();
	}
	
	public static void navigaterefresh() {
    driver.navigate().refresh();
	}
	
	public static void sendkey(WebElement els, String value) {
    els.sendKeys(value);
	}
	
	public static void waittime(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);}
	
	
	public static void ClickonElement(WebElement element) {
    element.click();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
     driver.quit();
	}
	
	public static void alert(WebElement element,String type,String input) {

	if (type.equalsIgnoreCase("simple")) {
		element.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.getText();
	}	
	else if (type.equalsIgnoreCase("confirm")) {
		element.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
	}
	else if (type.equalsIgnoreCase("prompt")) {
		element.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(input);
	}
	else {
		System.out.println("Invalid type");
	}}
	
	public static void move(WebElement element) {
		 Actions a=new Actions(driver);
		 a.moveToElement(element).build().perform();
	}
	
	public static void action(WebElement element,String type,String input,WebElement src,WebElement dest) {
	   Actions act=new Actions(driver);
	   if (type.equalsIgnoreCase("click")) {
		act.click(element).perform();
	}else if (type.equalsIgnoreCase("double click")) {
		act.doubleClick(element).perform();
	}
	else if (type.equalsIgnoreCase("moveToElement")) {
		act.moveToElement(element).perform();
	}else if (type.equalsIgnoreCase("Drag and Drop")) {
		act.dragAndDrop(src, dest).perform();
	}else if (type.equalsIgnoreCase("Click and hold")) {
		act.contextClick(element).perform();
	}else if (type.equalsIgnoreCase("sendkeys")) {
		element.sendKeys(input);
	}else {
		System.out.println("invalid type");
	}
	}
  public static void frames(WebElement element,String input,int size,String type) {
       if (type.equalsIgnoreCase("next frame")) {
		driver.switchTo().frame(element);
       
	} else if (type.equalsIgnoreCase("Default")) {
		driver.switchTo().defaultContent();
	}  
	else if (type.equalsIgnoreCase("size")) {
		System.out.println(element.getSize());
	} else {
		System.out.println("invalid type");
	}
  }
     public static void robot(String type) throws Throwable { 
	  Robot r = new Robot();
	  if (type.equalsIgnoreCase("keypress")) {
		r.keyPress(KeyEvent.VK_DOWN);
	} else if (type.equalsIgnoreCase("keyRelease")) {
		r.keyPress(KeyEvent.VK_DOWN);
	}
else {
	System.out.println("invalid type");
}
}    public static void windowHandles() {
	
}
    public static void dropDown_single(WebElement element, int type) {
	Select s = new Select(element);
	
		//s.selectByValue(values);
		s.selectByIndex(type);
}
    
    public static void dropDown_single(WebElement element,String values) {
	Select s = new Select(element);
	
		s.selectByValue(values);
		//s.selectByIndex(type);
}
		
//   
//    public static void dropDown_single(WebElement element,String type,int index,String values) {
//    	Select s = new Select(element);
//    	if (type.equalsIgnoreCase("value")) {
//    		s.selectByValue(values);
//			}
//    	else if (type.equalsIgnoreCase("index")) {
//			s.selectByIndex(index);
//		}
//    	else if (type.equalsIgnoreCase("visible")) {
//			s.selectByVisibleText(values);
//		}else {
//			System.out.println("invalid type");
//		}
    	
     
    public static void sleep(int value) throws Throwable {
    	Thread.sleep(value);

	}   
       
    

   
    	
    	
    }
    
    
    
    
    
          
       
       
       
       
	
	

	
	
	
	
	
	
	
	
	

