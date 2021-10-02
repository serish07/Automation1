package com.pom;

import java.sql.Driver;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageadactin {
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	public LoginPageadactin(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
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

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement signin;

	
	
	
	

	

}
