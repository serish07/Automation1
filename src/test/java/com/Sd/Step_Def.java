package com.Sd;

import com.Automation1.Base_Class;
import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_Def extends Base_Class {
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Launch the Application$")
	public void user_Launch_the_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		geturl(url);

		waittime(10);
		
	}

	@When("^user Enter the \"([^\"]*)\" in UserName Field$")
	public void user_Enter_the_in_UserName_Field(String arg1) throws Throwable {
		String username = File_Reader_Manager.getInstance().getInstanceCR().getUsername();

		sendkey(pom.getinstancel().getUsername(), username);
		waittime(10);
	}

	@When("^user Enter the \"([^\"]*)\" in Password Filed$")
	public void user_Enter_the_in_Password_Filed(String arg1) throws Throwable {
String password = File_Reader_Manager.getInstance().getInstanceCR().getPassword();
		
		sendkey(pom.getinstancel().getPassword(), password);
	}

	@Then("^user Click on the Login Button and Navigates to Search Hotel Page$")
	public void user_Click_on_the_Login_Button_and_Navigates_to_Search_Hotel_Page() throws Throwable {
		ClickonElement(pom.getinstancel().getSignin());

		waittime(10);	   
	}

	@When("^user Select the \"([^\"]*)\"$")
	public void user_Select_the(String arg1) throws Throwable {
	    
	}

	@When("^user Select the Hotels$")
	public void user_Select_the_Hotels() throws Throwable {
	    	}

	@When("^user Select the Room Type$")
	public void user_Select_the_Room_Type() throws Throwable {
	  
	}

	@When("^user Select the Number of Rooms$")
	public void user_Select_the_Number_of_Rooms() throws Throwable {
	    
	}

	@When("^user Select the Check In Date$")
	public void user_Select_the_Check_In_Date() throws Throwable {
	   	}

	@When("^user Select the Check Out Date$")
	public void user_Select_the_Check_Out_Date() throws Throwable {
	   
	}

	@When("^user Select the Adult Per Room$")
	public void user_Select_the_Adult_Per_Room() throws Throwable {
	    
	}

	@When("^user select the child per Room$")
	public void user_select_the_child_per_Room() throws Throwable {
	   
	}

	@Then("^user Click on the Search button and Navigate to Select Hotel Page$")
	public void user_Click_on_the_Search_button_and_Navigate_to_Select_Hotel_Page() throws Throwable {
	   
	}

	@When("^user Click on the Radio Button to Select the Hotel$")
	public void user_Click_on_the_Radio_Button_to_Select_the_Hotel() throws Throwable {
	   
	}

	@Then("^user Click on the Continue Button and Navigates to Book Hotel Page$")
	public void user_Click_on_the_Continue_Button_and_Navigates_to_Book_Hotel_Page() throws Throwable {
	    
	}

	@When("^user Enter the FirstName in FirstName Field$")
	public void user_Enter_the_FirstName_in_FirstName_Field() throws Throwable {
	   
	}

	@When("^user Enter the LastName in LastName Field$")
	public void user_Enter_the_LastName_in_LastName_Field() throws Throwable {
	  
	}

	@When("^user Enter the Billing Address in Address Field$")
	public void user_Enter_the_Billing_Address_in_Address_Field() throws Throwable {
	    	}

	@When("^user Enter the Credit Card No in Credit Card No Field$")
	public void user_Enter_the_Credit_Card_No_in_Credit_Card_No_Field() throws Throwable {
	  
	}

	@When("^user Select the Credit Card Type$")
	public void user_Select_the_Credit_Card_Type() throws Throwable {
	   
	}

	@When("^user Select the Expired Month$")
	public void user_Select_the_Expired_Month() throws Throwable {
	   	}

	@When("^user Select the Expired Year$")
	public void user_Select_the_Expired_Year() throws Throwable {
	   	}

	@When("^user Enter the CVV No in CVV Field$")
	public void user_Enter_the_CVV_No_in_CVV_Field() throws Throwable {
	    	}

	@Then("^user Click on the Book Now Button and Navigates to Booking Confirmation Page$")
	public void user_Click_on_the_Book_Now_Button_and_Navigates_to_Booking_Confirmation_Page() throws Throwable {
	    
	}

	@When("^user Click on the My Itinerary and Navigates to Book Itinerary page$")
	public void user_Click_on_the_My_Itinerary_and_Navigates_to_Book_Itinerary_page() throws Throwable {
	   
	}

	@When("^user click on the Logout button$")
	public void user_click_on_the_Logout_button() throws Throwable {
	    	}


}
