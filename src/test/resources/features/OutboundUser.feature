@Tests
Feature: User outbound menu
  Scenario: User able to access outbound menu
    Given User open the Middleman website
    And Click Sign in button
    When User input "shop1.middleman@mail.com" as userName and "shop123" as password and click login
    And User should find allert and click ok
    Then User should be directed to the dashboard page
    And User click outbound menu
    Then User should be directed to the outbound page

#    Bisnis Flow Outbound
  Scenario: The User can offer product to another users
    Given User open the Middleman website
    And Click Sign in button
    When User input "shop1.middleman@mail.com" as userName and "shop123" as password and click login
    And User should find allert and click ok
    Then User should be directed to the dashboard page
    And Click my product button
    Then User should be directed to the my product page
    And User choose product to sell
    And User should find allert and click ok
    Then User click outbound menu
    And User edit number of product to sell
    And User click submit outbound button
    And User should find allert and click ok
    Then User should be directed to the dashboard page

