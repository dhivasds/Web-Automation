
@Register
    Feature: Register
    As a user
    I want to register
    So that I can create account in AltaShop

    Scenario Outline: Register Scenario
      Given I am on the homepage page
      When I click button signin
      And I click text register
      And I Input "<nama>" name
      And I input "<email>" email
      And I input "<password>" password
      And I click register button
      Then I get result "<result>"
      Examples:
        | nama| email| password | result |
        | Dhivas Dharma   | dhivas3@gmail.com     | dhivas3 | redirectLogin   |
        | Dhivas Dharma   | dhivas3@gmail.com     | dhivas3 | duplicateEmail  |
        |                 | dhivas3@gmail.com     | dhivas  | nullFullname    |
        | randomName      |                       | dhivas3 | nullEmail       |
        | randomName      | randomEmail           |         | nullPassword    |

#  Register with valid email & valid password
#  Register with same date
#  Register with null Fullname, valid email & password
#  Register with null Email, valid Fullname & password
#  Register with null Password, valid Fullname & email