package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signinbtn;

	public Sign_in(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	public void setSigninbtn(WebElement signinbtn) {
		this.signinbtn = signinbtn;
	}
			
		
			
			

}
