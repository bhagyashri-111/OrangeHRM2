Feature: Test OrangeHRM application using BDD Framework

  Scenario: Validate Login page Functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on login button
