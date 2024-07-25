@Tests
Feature: User History Orders
  Scenario: User can see history orders
  Given User open the Middleman website
  And Click Sign in button
  When User input "shop1.middleman@mail.com" as userName and "shop123" as password and click login
  And User should find allert and click ok
  Then User should be directed to the dashboard page
  And Click history orders button
  Then User should be directed to the history orders page

