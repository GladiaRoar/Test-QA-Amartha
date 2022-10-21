Feature: Validate
  Scenario: Validate web
    Given Get text title
    And Get text banner
    When Validate
    Then Validate success