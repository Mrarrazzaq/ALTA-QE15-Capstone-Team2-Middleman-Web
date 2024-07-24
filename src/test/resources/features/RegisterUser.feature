@Tests
Feature: Register Test
  Scenario Outline: User able to register new store account
    Given User open the Middleman website
    And Click Sign up button
    And User should be directed to the register page
    And User fill the form "<storeName>" as store name, "<storeEmail>" as store email, "<storePhoneNumber>" as store phone number, "<storePassword>" as store password, "<storeAddress>" as store address
    When User click register button
    And User should find allert and click ok
    Then User should be directed to the login page
    Examples:
      | storeName | storeEmail                 | storePhoneNumber | storePassword | storeAddress |
      | Store 8   | store8.middleman@gmail.com | 0812345678908     | Store123$     | Jl. Jalan 1 |