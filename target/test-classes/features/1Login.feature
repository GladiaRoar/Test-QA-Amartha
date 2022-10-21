Feature: Login
  Scenario: The user login
    Given Open web
    And Input username
    And Input password
    When Click login
    Then Login success