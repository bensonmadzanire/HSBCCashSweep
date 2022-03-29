Feature: Adding the new account

  Scenario: Adding the new account adding the account code field only
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click configuration tab
    And   I enter the accountcode as "HH200H5"
    And   I click save button

  Scenario: Adding the new account adding the account code  and the minimum field only
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click configuration tab
    And   I enter the accountcode as "HH200H4"
    And   I enter the minimumvalue as "1000"
    And   I click save button

  Scenario: Saving the data without entering the mandatory fields
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click configuration tab
    And   I click save button
    And   I click dismiss pop up message
    And   i click the accounts tab
    And   I enter Bloombergcode as "HH224K"
