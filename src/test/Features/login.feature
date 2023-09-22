Feature: Bookcart Application Tests

  Scenario: Login should be success

    Given User navigate to the BookCart Application
    And User clicks on the login Button
    And User enter the username as "ortoni"
    And User enter the password as "pass1234"
    When User click on the login button
    Then Login should be success

  Scenario:Login should not be success

    Given User navigate to the BookCart Application
    Given User clicks on the login Button
    Given User enter the username as "Anirrt"
    Given User enter the password as "pass125464"
    When User click on the login button
    But Login should fail