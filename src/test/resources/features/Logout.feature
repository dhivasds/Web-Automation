@Logout
Feature: Logout
  As a user
  I want to logout my account
  So that I can logout

  Scenario: As a user i want to logout form my account
    Given I am on the login page
    When I click button profile
    And I click button Logout
    Then I redirect to login