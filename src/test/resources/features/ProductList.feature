@ListProduct
Feature: List Product
  As a user
  I want to buy product
  So that I can add product to cart

Scenario: As a user i want to buy product
  Given I am on the homepage page
  When I click button BELI
  Then product successfully added to cart

Scenario: As a user i want to select category product and product empty
  Given I am on the homepage page
  When I click dropdown select category
  And I click category "kesehatan"
  Then I get "Products is empty!"

Scenario: As a user I want to click close category in a category
    Given I am on the homepage page
    When I click dropdown select category
    And I click category "kesehatan"
    And I click button close
    Then I redirect to product list






