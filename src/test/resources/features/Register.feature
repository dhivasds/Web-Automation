
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
        | Dhivas Dharma   | dhivas4@gmail.com     | dhivas4 | redirectLogin   |
        | Dhivas Dharma   | dhivas4@gmail.com     | dhivas4 | duplicateEmail  |
        |                 | dhivas4@gmail.com     | dhivas  | nullFullname    |
        | randomName      |                       | dhivas4 | nullEmail       |
        | randomName      | randomEmail           |         | nullPassword    |

#  Register with valid email & valid password
#  Register with same date
#  Register with null Fullname, valid email & password
#  Register with null Email, valid Fullname & password
#  Register with null Password, valid Fullname & email