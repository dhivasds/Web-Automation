
@Register
    Feature: Register
    As a user
    I want to register
    So that I can create account in AltaShop

    Scenario Outline: Register Scenario
      Given I am on the homepage page
      When I click button login
      And I click text register
      And I Input "<nama>" nama
      And I input "<email>" email
      And I input "<password>" password
      And I click register button
      Then I redirect to "<page>"
      Examples:
        | nama| email| password | page |
        | user1   | user@gmail.com | user1 | Register|
        | user   |                |                   | Register|






#  Scenario Outline: Login Scenario
#    Given I am on the login page
#    When I input "<username>" username
#    And I input "<password>" password
#    And click login button
#    Then I get the "<result>"
#    Examples:
#      | username| password | result|
#      | jambumerah      | Jambu!1          | Profile|
#      | InvalidUsername | Jambu!1          | gagal |
#      | jambumerah      | InvalidPassword  | gagal |