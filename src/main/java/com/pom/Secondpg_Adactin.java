package com.pom;

import javax.tools.DocumentationTool.Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Secondpg_Adactin {
	public WebDriver driver;
	
	
	@FindBy(id="location")
	private WebElement location;
	
	public Secondpg_Adactin(WebDriver driver2) {
	    this.driver=driver2;
	    PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public void setRoom_type(WebElement room_type) {
		this.room_type = room_type;
	}

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	public void setNumberofrooms(WebElement numberofrooms) {
		this.numberofrooms = numberofrooms;
	}

	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room_type;

	@FindBy(id="room_nos")
	private WebElement numberofrooms;
	
	@FindBy(id="datepick_in")
	private WebElement datepickin;
	
	public WebElement getDatepickin() {
		return datepickin;
	}

	public void setDatepickin(WebElement datepickin) {
		this.datepickin = datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public void setDatepickout(WebElement datepickout) {
		this.datepickout = datepickout;
	}

	@FindBy(id="datepick_out")
	private WebElement datepickout;
	
	@FindBy (id ="adult_room")
	private WebElement adultroom;
	
	public WebElement getAdultroom() {
		return adultroom;
	}

	public void setAdultroom(WebElement adultroom) {
		this.adultroom = adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public void setChildroom(WebElement childroom) {
		this.childroom = childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	@FindBy(id = "child_room")
	private WebElement childroom;
	
	@FindBy (id ="Submit")
	private WebElement submit;
	
	
	public WebElement getRadio() {
		return radio;
	}

	public void setRadio(WebElement radio) {
		this.radio = radio;
	}

	@FindBy(id = "radiobutton_1")
	private WebElement radio;
	

	@FindBy(id = "continue")
	private WebElement cont;

	public WebElement getCont() {
		return cont;
	}

	public void setCont(WebElement cont) {
		this.cont = cont;
	}
	
	
	public WebElement getFirst() {
		return first;
	}

	public void setFirst(WebElement first) {
		this.first = first;
	}

	public WebElement getLst() {
		return lst;
	}

	public void setLst(WebElement lst) {
		this.lst = lst;
	}

	public WebElement getAddr() {
		return addr;
	}

	public void setAddr(WebElement addr) {
		this.addr = addr;
	}

	public WebElement getCardd() {
		return cardd;
	}

	public void setCardd(WebElement cardd) {
		this.cardd = cardd;
	}

	public WebElement getTyp() {
		return typ;
	}

	public void setTyp(WebElement typ) {
		this.typ = typ;
	}

	public WebElement getMnth() {
		return mnth;
	}

	public void setMnth(WebElement mnth) {
		this.mnth = mnth;
	}

	public WebElement getYr() {
		return yr;
	}

	public void setYr(WebElement yr) {
		this.yr = yr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public WebElement getBknw() {
		return bknw;
	}

	public void setBknw(WebElement bknw) {
		this.bknw = bknw;
	}

	@FindBy(id="first_name")
	private WebElement first;
	
	@FindBy(id = "last_name")
	private WebElement lst;
	
	@FindBy (id="address")
	private WebElement addr;
	
	@FindBy (id ="cc_num")
	private WebElement cardd; 
	
	@FindBy (id="cc_type")
	private WebElement typ;
	
	@FindBy (id="cc_exp_month")
	private WebElement mnth;
	
	@FindBy (id="cc_exp_year")
	private WebElement yr;
	
	@FindBy (id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy (id ="book_now")
	private WebElement bknw;
	
	
    public WebElement getIti() {
		return iti;
	}

	public void setIti(WebElement iti) {
		this.iti = iti;
	}

	@FindBy (id = "my_itinerary")
	private WebElement iti;
	
	
	
//	WebElement days = driver.findElement(By.name("days"));
//	Select a = new Select(days);
//	a.selectByValue("4");

}
