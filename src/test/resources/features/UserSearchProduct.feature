@Tests
#Bug tidak kembali menampilkan semua product di dashboard
Feature: Search feature
  Scenario: User able to search product on dashboard
    Given User open the Middleman website
    And Click Sign in button
    When User input "shop1.middleman@mail.com" as userName and "shop123" as password and click login
    And User should find allert and click ok
    Then User should be directed to the dashboard page
    When User click Search bar
    And User input "Laos" as search
    And User click search
    When User delete search product
    Then All product on dashborad should be displayed

    Scenario: User unable to find non exist product
      Given User open the Middleman website
      And Click Sign in button
      When User input "shop1.middleman@mail.com" as userName and "shop123" as password and click login
      And User should find allert and click ok
      Then User should be directed to the dashboard page
      When User click Search bar
      And User input "Matahari" as search
      And User click search
      Then User should not find any product

      #Bug tidak kembali menampilkan semua product di user product
      Scenario: User able to search product on my product
        Given User open the Middleman website
        And Click Sign in button
        When User input "shop1.middleman@mail.com" as userName and "shop123" as password and click login
        And User should find allert and click ok
        Then User should be directed to the dashboard page
        And Click my product button
        Then User should be directed to the my product page
        When User click Search bar
        And User input "product 1" as search
        And User click search
        When User delete search product
        Then All product on my product should be displayed

