package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shopping {
	public WebDriver driver;
	

	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	
	public shopping(WebDriver driver2) {
    this.driver=driver2;
    PageFactory.initElements(driver, this);
	
	}

	public WebElement getDress() {
		return dress;
	}

	public void setDress(WebElement dress) {
		this.dress = dress;
	}

	public WebElement getEvening() {
		return evening;
	}

	public void setEvening(WebElement evening) {
		this.evening = evening;
	}

	public WebElement getCheck() {
		return check;
	}

	public void setCheck(WebElement check) {
		this.check = check;
	}

	public WebElement getImg() {
		return img;
	}

	public void setImg(WebElement img) {
		this.img = img;
	}

	public WebElement getCart() {
		return cart;
	}

	public void setCart(WebElement cart) {
		this.cart = cart;
	}

	@FindBy(xpath="(//a[@title='Browse our different dresses to choose the perfect dress for an unforgettable evening!'])[1]")
   private WebElement evening;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement check;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	private WebElement img;
	
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement cart;
	
	
	
}
