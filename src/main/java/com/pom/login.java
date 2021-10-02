package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	public WebDriver driver;
	
	@FindBy(id="email")
	private WebElement username;
	
	public login(WebDriver driver2) {
     this.driver=driver2;
     PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSignin() {
		return signin;
	}

	public void setSignin(WebElement signin) {
		this.signin = signin;
	}

	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(xpath="//i[@class='icon-lock left']")
	private WebElement signin;

}
