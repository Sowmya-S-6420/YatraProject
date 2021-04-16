#Author: sowmyashanmugam64@gmail.com

@tag
Feature: Yatra functionality check	
Background: Login feature

		Given User navigates to the yatra home page
    Then Verify the logo displayed

  @tag1
  Scenario: User should be able to book a hotel
  
    When User navigates to hotel tab
    And User selects the destination
    Then Should navigate to the list of hotels section
    When User selects the minimum price 
    And Selects the maximum star rating
    Then User should be able to select the room for the first hotel displayed
    When User clicks on choose room button 
    Then User is navigated to review screen and fills traveller section
    