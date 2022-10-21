Feature: Filter
  Scenario: User filter by price high to low
    Given Click filter
    When Select low to high
    Then Filter success
