Feature: Detail Product
  As a user
  I want to access detail product
  So that i can access detail product


  Scenario: As a user i want to see detail product
    Given I am on the homepage page
    When I click button Detail
    Then get result product detail

  Scenario: As a user i want give rating 3 to product
    Given I am on the homepage page
    When I click button Detail
    And I click button 3-star
    Then the star on the product changes to 3

  Scenario: As a user i want give rating 1 to product
    Given I am on the homepage page
    When I click button Detail
    And I click button 1-star
    Then the star on the product changes to 1