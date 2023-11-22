Feature: Hotel Room Booking 

Scenario: user login page
Given user launch the URL of the application
When user enter the username in usernamefield
And user enter the password in password field
Then user should click the login button and it will navigate to next page.

Scenario: user search hotel
Given user adactin next page will be displayed
When user fill all the details in the field
And The details of the field are
location,hotels,roomType,noOfRoom,checkInDate>","checkOutDate","adultsPerRoom>" 
and childrenPerRoom
Then User click the search button and it verify all details are filled and it  navigate the next page
But if any one fields are not filled it shows some mandatory message and it will not navigate to next page

Scenario: Select hotel
Given user adactin page select hotel will be displayed
When select the button in the list of hotel details
Then click the continue button and it will navigate to the next page

Scenario: Book a hotel
Given user adactin next page book a hotel will be displayed
When user enter the first name of the  field
 And user enter the list of field are 
lastName,billingAddres,credit Card No ,Credit Card Type , Expiry Month , Expiry Year and CVV Number 
Then Click the book now button and it will navigate to the next page It display the booking confirmation details






