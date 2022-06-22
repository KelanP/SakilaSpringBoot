Feature: Create a new customer account on the frontend
  Scenario: As a user I would like to enter in my details to register for an account
    Given the application is online and running
    When the account creation page is open
    And the user details are filled in
    Then the account creation form is submitted