package com.Automation1;

import org.openqa.selenium.WebDriver;

import com.sdp.Page_Object_Manager;

public class Miniproject2 extends Base_Class  {
	public static WebDriver driver=getbrowser("chrome");
	
public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
    public static void main(String[] args) throws Throwable {
    

    	
    	
    	
    	geturl("http://automationpractice.com/index.php");
    	sleep(3000);
    	waittime(10);
   
        ClickonElement(pom.getinstances().getSigninbtn());
    	sleep(3000);
    	
    	sendkey(pom.getinstancelog().getUsername(), "serish1@gmail.com");
    	sendkey(pom.getinstancelog().getPassword(),"serish123");
    	ClickonElement(pom.getinstancelog().getSignin());
    	
    	waittime(10);
    	ClickonElement(pom.getinstanceshopping().getDress());
    	ClickonElement(pom.getinstanceshopping().getEvening());
    	waittime(10);
    	ClickonElement(pom.getinstanceshopping().getCheck());
    	move(pom.getinstanceshopping().getImg());
    	waittime(10);
    	ClickonElement(pom.getinstanceshopping().getCart());
    	waittime(10);
    	
    	ClickonElement(pom.getinstanceproceed().getPro());
    	ClickonElement(pom.getinstanceproceed().getProceed2());
    	waittime(10);
    	ClickonElement(pom.getinstanceproceed().getAddress());
    	ClickonElement(pom.getinstanceproceed().getCheckbox());
    	waittime(10);
    	ClickonElement(pom.getinstanceproceed().getSubmit());
    	ClickonElement(pom.getinstanceproceed().getBankwire());
    	waittime(10);
    	ClickonElement(pom.getinstanceproceed().getSubmit2());
    	
    	
    	
//    	Sign_in a = new Sign_in(driver);
//    	ClickonElement(a.getSigninbtn());
//    	
//    	login b = new login(driver);
//    	sendkey(b.getUsername(), "serish1@gmail.com");
//    	sendkey(b.getPassword(), "serish123");
//    	ClickonElement(b.getSignin());
//    	sleep(3000);
//    	
//    	shopping c=new shopping(driver);
//    	ClickonElement(c.getDress());
//    	waittime(10);
//    	ClickonElement(c.getEvening());
//        ClickonElement(c.getCheck());
//    	move(c.getImg());
//    	ClickonElement(c.getCart());
//    	waittime(10);
//    	
//    	proceed d = new proceed(driver);
//    	ClickonElement(d.getPro());
//    	ClickonElement(d.getProceed2());
//    	ClickonElement(d.getAddress());
//        ClickonElement(d.getCheckbox());
//        waittime(10);
//        ClickonElement(d.getSubmit());
//        ClickonElement(d.getBankwire());
//        waittime(10);
//        ClickonElement(d.getSubmit2());
    	
    	
        
    			
    	
    	
    	
     


    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
}}
