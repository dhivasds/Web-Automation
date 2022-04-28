@Login
Feature: Login
  As a user
  I want to login
  So that I can access homepage

  Scenario Outline: Login Scenario
    Given I am on the homepage page
    When I click button signin
    And I input "<email>" email
    And I input "<password>" password
    And I click button login 
    Then I get the "<result>"
    Examples:
      | email| password | result |
      | a | a | |
      | a |   |password is required|
      |  | a |email is required|