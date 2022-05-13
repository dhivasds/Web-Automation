#
#@Register
#    Feature: Register
#    As a user
#    I want to register
#    So that I can create account in AltaShop
#
#    Scenario Outline: Register Scenario
#      Given I am on the homepage page
#      When I click button signin
#      And I click text register
#      And I Input "<nama>" name
#      And I input "<email>" email
#      And I input "<password>" password
#      And I click register button
#      Then I redirect to "<page>"
#      Examples:
#        | nama| email| password | page |
#        | dhivas1   | dhivas1@gmail.com     | dhivas1 | Login   |
#        | dhivas1   | dhivas1@gmail.com     | dhivas1 | Register|
#        |           | dhivas1@gmail.com     | dhivas  | Register|
#        | randomName|                       | dhivas1 | Register|
#        | randomName| randomEmail           |         | Register|
#
##      Redirect to Login must be fix, not equals -29 April