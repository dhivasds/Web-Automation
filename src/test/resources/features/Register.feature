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
#      And I Input "<nama>" nama
#      And I input "<email>" email
#      And I input "<password>" password
#      And I click register button
#      Then I redirect to "<page>"
#      Examples:
#        | nama| email| password | page |
#        | user11   | user11@gmail.com | user11 | Login|
#        | user11   |  |  | Register|
