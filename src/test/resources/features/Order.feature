@Order
Feature: Order
  As a user
  I want to buy products
  So that I can see product in cart

  Scenario: As a user i want to buy product and i see the price
    Given I am on the login page
    When I click button BELI
    And I click button cart
    Then I get result product "Total Bayar"

  Scenario: As a user i want to increase the number of products in the cart
    Given I am on the login page
    When I click button BELI
    And I click button cart
    And I click button "+"
    Then I get result product "increase"

  Scenario: As a user I want to reduce the number of products in the cart
    Given I am on the login page
    When I click button BELI
    And I click button cart
    And I click button "-"
    Then I get result product "decincrease"