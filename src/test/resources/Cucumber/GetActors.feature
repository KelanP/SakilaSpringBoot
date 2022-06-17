Feature: Get actor list
  Scenario: As a user I would like to get a JSON list of actors
    Given The server has started
    When I send a request
    Then I get back the JSON of actors