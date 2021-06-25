Feature: User is able to log in on swag labs
  Scenario: User can see items on swag shop
    Given User opens Chrome
    And User is on login page
    Then User enters his username
    And User enters his password
    And User clicks on login
    Then Swag shop page is displayed