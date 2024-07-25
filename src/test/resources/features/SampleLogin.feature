Feature: Login Test
  Scenario: Login with valid credentials
    Given User open the web sauce demo
    When User saucedemo input "standard_user" as userName and "secret_sauce" as password and click login
    Then User saucedemo should be directed to the dashboard page