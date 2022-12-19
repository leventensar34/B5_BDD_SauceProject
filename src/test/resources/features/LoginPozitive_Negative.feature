Feature: Login Positive and Negative Test

  @ddf
  Scenario Outline: Login in SauceDemo Positive Test
    Given The user is on the login page
    When When The user is enters "<username>" and "<password>"
    Then Then The user should be able to Login and See "<verifyName>" header
    Examples:
      | username                | password     | verifyName |
      | standard_user           | secret_sauce | PRODUCTS   |
      | locked_out_user         | secret_sauce | PRODUCTS   |
      | performance_glitch_user | secret_sauce | PRODUCTS   |
      | problem_user            | secret_sauce | PRODUCTS   |


  Scenario Outline: Login in SauceDemo Negative Test
    Given The user is on the login page
    When The user is enters "<username>" and "<password>"
    Then The User take a error "<message>"
    Examples:
      | username                | password     | message                                                                   |
      | standard_use            | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | standard_user           | secret_sauc  | Epic sadface: Username and password do not match any user in this service |
      | locked_out_us           | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user         | secret_sau   | Epic sadface: Username and password do not match any user in this service |
      | problem_u               | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | problem_user            | secret_sau   | Epic sadface: Username and password do not match any user in this service |
      | performance_glitch_us   | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | performance_glitch_user | secret_sauc  | Epic sadface: Username and password do not match any user in this service |
      |                         |              | Epic sadface: Username is required                                        |