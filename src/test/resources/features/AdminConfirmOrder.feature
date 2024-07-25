Feature: Admin confirm order

  #Bug incoming product page cant see produk & button finish, confirm order in history order cant see
  Scenario: The user (Admin) can add products that are already available
    Given Admin open the Middleman website
    And Click Sign in button
    When Admin input "admin.middleman@gmail.com" as userName and "Admin123$" as password and click login
    And Admin should find allert and click ok
    Then Admin should be directed to the dashboard page
    When Admin click meno history order
    Then Admin click detail product
    And Admin confirm order product click button done
    Then Admin can see product in incoming product
