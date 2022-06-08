Feature: Add a new actor
  As a user I would like to add a new actor into my table

  Scenario: I successfully add an actor into my table
    Given I have the actor's details
    When I input data into the database
    Then I get the success return string

    Scenario: I don't have enough information
      Given I have an actors first name
      And I don't have their last name
      When I try to add them to the database
      Then I get an error message

