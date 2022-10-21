Feature: Checkout
  Scenario: User checkout
    Given Click continue shopping
    And Click Add To Cart
    When Click Cart
    Then Validate cart
