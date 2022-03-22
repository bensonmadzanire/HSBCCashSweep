Feature: Feedback link display

  Scenario: Checking the Feedback link display
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click configuration tab
    And   I click feedback link