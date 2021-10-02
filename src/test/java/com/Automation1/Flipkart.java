package com.Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\com.javaselenium\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
		
		WebElement fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(fashion).perform();
		a.contextClick().perform();
		
	}

}
