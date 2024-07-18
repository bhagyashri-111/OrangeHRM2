Feature: Test OrangeHRM application using BDD Framework

  Scenario: Validate Login page Functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on login button

  Scenario: Validate HomePage Functionality
    Given user is on home page Validate Home URL
    Then Validate Home Title
    And Validate Home Logo

  Scenario Outline: Validate PIMPage Functionality
    Given user is on PIM Page click on PIM link
    When User click on add employee button
    Then create employee enter "<firstname>","<middlename>" and "<lastname>"
    Then click on saveButton

    Examples: 
      | firstname | middlename | lastname |
      | Pranali   | Mohan      | Mahajan  |
      | Sayali    | Rahul      | Sonavane |
      | Shloka    | Deepak     | Shinde   |
      | Mayara    | Amit       | Shah     |
      | Rajvansh  | Sandeep    | gupta    |

      
      Scenario: Validate Admin Page
      Given user click on Admin link
      Then validate User on Admin Page
      And validate Url