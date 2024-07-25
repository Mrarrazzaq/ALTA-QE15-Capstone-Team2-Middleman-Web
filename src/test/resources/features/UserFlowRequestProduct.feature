@Tests
#Flow bisnis dari sisi user (Store)
Feature: User Buisiness Flow
  Scenario: User able to request product stock to admin
    Given User open the Middleman website
    And Click Sign in button
    When User input "shop1.middleman@mail.com" as userName and "shop123" as password and click login
    And User should find allert and click ok
    Then User should be directed to the dashboard page
    And User choose product to request and click add button
    And User should find allert and click ok
    And User click mycart menu
    And User edit number of product to request
    Then User click next button
    And User should find allert and click ok
    Then User Redirected to payment page