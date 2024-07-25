@Tests
Feature: User Product

  Scenario Outline: User can add new product
    Given User open the Middleman website
    And Click Sign in button
    When User input "shop1.middleman@mail.com" as userName and "shop123" as password and click login
    And User should find allert and click ok
    Then User should be directed to the dashboard page
    And Click my product button
    Then User should be directed to the my product page
    And User click add new product button
    Then User should found add new product pop up
    And User input product name "<name>", input unit "<unit>", input stock "<stock>", input price "<price>"
    And User click input product image "<image>"
    And User click save add product button
    And User should find allert and click ok
    And User should be directed to the my product page
    Then User should see the "<name>" in my product
    Examples:
      | name      | unit | stock | price | image           |
      | product 11 | pcs  | 10000 | 1000  | BawangMerah.jpg |

    Scenario Outline: User unable to add new product with existing data
      Given User open the Middleman website
      And Click Sign in button
      When User input "shop1.middleman@mail.com" as userName and "shop123" as password and click login
      And User should find allert and click ok
      Then User should be directed to the dashboard page
      And Click my product button
      Then User should be directed to the my product page
      And User click add new product button
      Then User should found add new product pop up
      And User input product name "<name>", input unit "<unit>", input stock "<stock>", input price "<price>"
      And User click input product image "<image>"
      And User click save add product button
      And User should find error alert "there is an error in internal server"
      And User should be directed to the my product page
      Examples:
        | name      | unit | stock | price | image           |
        | product 10 | pcs  | 10000 | 1000  | BawangMerah.jpg |

      Scenario Outline: User not able to add new product with uncomplete data
        Given User open the Middleman website
        And Click Sign in button
        When User input "shop1.middleman@mail.com" as userName and "shop123" as password and click login
        And User should find allert and click ok
        Then User should be directed to the dashboard page
        And Click my product button
        Then User should be directed to the my product page
        And User click add new product button
        Then User should found add new product pop up
        And User input product name "<name>", input unit "<unit>", input stock "<stock>", input price "<price>"
        And User click input product image "<image>"
        And User click save add product button
        And User should find error alert "wrong input"
        And User should be directed to the my product page
        Examples:
          | name      | unit | stock | price | image           |
          |           | pcs  | 10000 | 1000  | BawangMerah.jpg |