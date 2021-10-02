
Feature: Hotel Booking In Adactin Web Application
@smokeTest
Scenario Outline: Login Page
Given user Launch the Application
When user Enter the "<Username>" in UserName Field
And user Enter the "<Password>" in Password Filed
Then user Click on the Login Button and Navigates to Search Hotel Page

Examples:
    |Username|Password|
    |ramprakash745218|Ram@4066|
    |Praveen0911|Praveen@09|
    |Suresh96|17896bsp|
    |Serish07|374B52|


@sanityTest
Scenario: Search Hotel 
When user Select the "Brisbane"
And user Select the Hotels
And user Select the Room Type
And user Select the Number of Rooms
And user Select the Check In Date
And user Select the Check Out Date
And user Select the Adult Per Room
And user select the child per Room
Then user Click on the Search button and Navigate to Select Hotel Page


@sanityTest
Scenario: Select Hotel 
When user Click on the Radio Button to Select the Hotel
Then user Click on the Continue Button and Navigates to Book Hotel Page


@sanityTest
Scenario: Book Hotel
When user Enter the FirstName in FirstName Field
And user Enter the LastName in LastName Field
And user Enter the Billing Address in Address Field
And user Enter the Credit Card No in Credit Card No Field
And user Select the Credit Card Type
And user Select the Expired Month
And user Select the Expired Year
And user Enter the CVV No in CVV Field
Then user Click on the Book Now Button and Navigates to Booking Confirmation Page


@sanityTest
Scenario: Book Confirmation
When user Click on the My Itinerary and Navigates to Book Itinerary page

@sanityTest
Scenario: Logout Page
When user click on the Logout button  