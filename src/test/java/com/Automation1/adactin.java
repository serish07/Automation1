
package com.Automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class adactin extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {
		
		
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		geturl(url);

		//geturl("https://adactinhotelapp.com/");
		waittime(10);
		
		String username = File_Reader_Manager.getInstance().getInstanceCR().getUsername();

		sendkey(pom.getinstancel().getUsername(), username);
		waittime(10);
		String password = File_Reader_Manager.getInstance().getInstanceCR().getPassword();
		
		sendkey(pom.getinstancel().getPassword(), password);
		ClickonElement(pom.getinstancel().getSignin());

		waittime(10);
		ClickonElement(pom.getinstancesec().getLocation());
		dropDown_single(pom.getinstancesec().getLocation(), 1);
		ClickonElement(pom.getinstancesec().getHotel());
		dropDown_single(pom.getinstancesec().getHotel(), 2);


		dropDown_single(pom.getinstancesec().getAdultroom(), 2);

		dropDown_single(pom.getinstancesec().getChildroom(), 1);

		ClickonElement(pom.getinstancesec().getSubmit());

		ClickonElement(pom.getinstancesec().getRadio());

		ClickonElement(pom.getinstancesec().getCont());

		sendkey(pom.getinstancesec().getFirst(), "Serish");
		sendkey(pom.getinstancesec().getLst(), "07");
		sendkey(pom.getinstancesec().getAddr(), "hjfhskdfndjscbskjdh");
		sendkey(pom.getinstancesec().getCardd(), "1234567890123456");
		dropDown_single(pom.getinstancesec().getTyp(), 3);
		dropDown_single(pom.getinstancesec().getMnth(), 3);
		dropDown_single(pom.getinstancesec().getYr(), 10);
		sendkey(pom.getinstancesec().getCvv(), "044");
		ClickonElement(pom.getinstancesec().getBknw());

		ClickonElement(pom.getinstancesec().getIti());

	}

	
}
