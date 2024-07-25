#Bug tidak kembali menampilkan semua product di dashboard
Feature: Search feature
  Scenario: Admin able to search product on dashboard
    Given User open the Middleman website
    And Click Sign in button
    When Admin input "admin.middleman@gmail.com" as userName and "Admin123$" as password and click login
    And Admin should find allert and click ok
    Then Admin should be directed to the dashboard page
    When Admin click Search bar
    And Admin input "beras kencur" as search
    And Admin click search
    When Admin delete search product
    Then Admin should be directed to the dashboard page

  Scenario: User unable to find non exist product
    Given User open the Middleman website
    And Click Sign in button
    When Admin input "admin.middleman@gmail.com" as userName and "Admin123$" as password and click login
    And User should find allert and click ok
    Then User should be directed to the dashboard page
    When User click Search bar
    And User input "Matahari" as search
    And User click search
    Then User should not find any product