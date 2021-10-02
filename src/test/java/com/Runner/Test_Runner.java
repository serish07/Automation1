package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Automation1.Base_Class;
import com.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/com/adactin/feature",
		glue = "com.Sd"
//		monochrome = true,
//		dryRun = false,
//		strict = true,
//		tags = ("~regressionTest"),
//		plugin = {"html:Report/Cucumber_Report"}


)
public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() throws Throwable {
		
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		
		driver = Base_Class.getbrowser("Chrome");

	}
	
	@AfterClass
	
	public static void tear_down() {
		driver.close();

	}
	
	
	

}
