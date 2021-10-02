package com.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proceed {
	public WebDriver driver;
	
	
	
	public proceed(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPro() {
		return pro;
	}

	public void setPro(WebElement pro) {
		this.pro = pro;
	}

	public WebElement getProceed2() {
		return proceed2;
	}

	public void setProceed2(WebElement proceed2) {
		this.proceed2 = proceed2;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(WebElement checkbox) {
		this.checkbox = checkbox;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public WebElement getBankwire() {
		return bankwire;
	}

	public void setBankwire(WebElement bankwire) {
		this.bankwire = bankwire;
	}

	public WebElement getSubmit2() {
		return submit2;
	}

	public void setSubmit2(WebElement submit2) {
		this.submit2 = submit2;
	}

	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement pro;
	

	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed2;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement address;
	
	@FindBy (xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement submit;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bankwire;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement submit2;
	
	

}
