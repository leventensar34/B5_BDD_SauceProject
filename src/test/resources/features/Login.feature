Feature: Login and E2E Test

  @wip
  Scenario: Login and End to End Test
    Given The user is on the login page
    When The user is enters "standard_user" and "secret_sauce"
    Then The user should be able to Login and See "PRODUCTS" header
    And The user should be able to sort products "Price (low to high)"
    And The user should clicks cheapest as "7.99" and second costline as "29.99" product
    And The user open basket
    And The user click checkout
    And The user enters detailes "Jhon" "Smith" "GF123H" and finish the purchase
    Then The user verify that items are "41.02" and able to total is "Total: $41.02"

