#@Tests
Feature: My product admin can manage product

  Scenario Outline: The user (Admin) can add products that are already available
    Given Admin open the Middleman website
    And Click Sign in button
    When Admin input "admin.middleman@gmail.com" as userName and "Admin123$" as password and click login
    And Admin should find allert and click ok
    Then Admin should be directed to the dashboard page
    Then Admin click Add product button
    Then Admin can see Add Product Pop-Up
    And Click field input "<file>" for product image
    And Admin input Product Name field "<productname>", input Unit field "<unit>", input Stock field "<stock>", input Price field "<price>"
    And Click add button
    And User should find allert and click ok
#    Then Admin should see an Alert "success adding a product"
#    When Admin click OK on alert
#    Then Admin shold see the "<productname>" in my product
    Examples:
    |file           |productname       |unit|stock  |price |
    |BawangMerah.jpg|Laos Canada        |kg  |1000   |20000 |


    #Negative not input picture
#  Scenario Outline: The user (Admin) can add products that are already available and not input picture
#    Given Admin open the Middleman website
#    And Click Sign in button
#    When Admin input "admin.middleman@gmail.com" as userName and "Admin123$" as password and click login
#    And Admin should find allert and click ok
#    Then Admin should be directed to the dashboard page
#    Then Admin click Add product button
#    Then Admin can see Add Product Pop-Up
#    And Click field input "<file>" for product image
#    And Admin input Product Name field "<productname>", input Unit field "<unit>", input Stock field "<stock>", input Price field "<price>"
#    And Click add button
#    And User should find allert and click ok
#    Then Admin shold see product "<nameelement>" required validation message
#    Examples:
#      |file            |productname          |unit|stock  |price |nameelement   |
#      |BawangMerah.jpg |Laos Malay           |kg  |1000   |20000 |name          |

#  Scenario Outline: The user (Admin) can update stock item by + button
#    Given Admin open the Middleman website
#    And Click Sign in button
#    When Admin input "admin.middleman@gmail.com" as userName and "Admin123$" as password and click login
#    And Admin should find allert and click ok
#    Then Admin should be directed to the dashboard page
#    When Admin click button + at the page cart with name "<productName>"
#    Then Admin should see an Alert "success creating a cart"
#    When Admin click OK on alert
#    And Admin click inbound page
#    Then Admin can see Add "<productName>" has been added
#    When Admin click submit button
#    Then Admin should see an Alert "success input data"
#    When Admin click OK on alert
#    Then Admin should be directed to the dashboard page
#    And Admin should see the "<productName>" in my product has been increased
#    Examples:
#    |productName|
#    |Celana Sakti3|





