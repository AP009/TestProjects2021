
@Checkout
Feature: Test Checkout feature

  Scenario: As a User I should be able to buy a product successfully
    Given User has completed registration
    When I click on the Books Category
    And click on add to cart for the product
    Then book should be added to shopping cart
    And I should be able to checkout successfully
