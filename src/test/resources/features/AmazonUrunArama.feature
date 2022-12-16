Feature: Login in Amazon

  @wip2
  Scenario: Login Amazon take artikel
    Given The User login Amazon page
    When The User click fortfahren button
    And The User to choose "Books"
    And The User choose a "java"
    And The user click searchbox
    Then The User take all price