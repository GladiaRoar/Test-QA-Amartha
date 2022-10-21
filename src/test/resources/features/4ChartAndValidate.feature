Feature: Validate Chart
  Scenario: User validate chart
    Given Click chart
    When validate
    Then validate success and back to home