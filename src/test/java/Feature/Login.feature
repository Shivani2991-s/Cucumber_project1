Feature: Login Functionality

  @SmokeTest
  Scenario: Test User Successfully Logins
    Given User is already on login Page
    When The user enter the username
    And The user enter the password
    Then User clicks on login button
    And User Home page is populated

#Data Driven example
  @RegressionTest
  Scenario Outline: to test user successfully logins using valid credentials
    Given User is already on the login page
    When User login into application with "<username>" and "<password>"
    Then User Home page is populated

    Examples: 
      | username | password |
      | abc@gmail.com | abcdef |
      | 123456 | djgjsdgk |
