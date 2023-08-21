Feature: Login Page Test

  Scenario: Login With Invalid Username Test
    Given User access url HRM
    When User enter invalid username
    And User enter valid password
    And User click button login
    Then User get text invalid credentials

  Scenario: Login With Empty Username Test
    Given User access url HRM
    When User emptying username
    And User enter valid password
    And User click button login
    Then User get text username required

  Scenario: Login With Empty Password Test
    Given User access url HRM
    When User enter valid username
    And User emptying password
    And User click button login
    Then User get text password required

  Scenario: Login Valid Test
    Given User access url HRM
    When User enter valid username
    And User enter valid password
    And User click button login
    Then User get text title page dashboard