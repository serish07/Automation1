package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.LoginPageadactin;
import com.pom.Secondpg_Adactin;
import com.pom.Sign_in;
import com.pom.login;
import com.pom.proceed;
import com.pom.shopping;

public class Page_Object_Manager {

	public WebDriver driver;

	private Sign_in s;
	private login l;
	private shopping sh;
	private proceed pro;
	private LoginPageadactin login;
	private Secondpg_Adactin second;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public Sign_in getinstances() {

		s = new Sign_in(driver);
		return s;

	}

	public login getinstancelog() {
		l = new login(driver);
		return l;
	}

	public shopping getinstanceshopping() {
		sh = new shopping(driver);
		return sh;

	}

	public proceed getinstanceproceed() {
		pro = new proceed(driver);
		return pro;

	}

	public LoginPageadactin getinstancel() {
		login = new LoginPageadactin(driver);
		return login;
	}

		public Secondpg_Adactin getinstancesec() {
			second = new Secondpg_Adactin(driver);
			return second;

	}
}
