Feature: testing login functionality

  @smoke
  Scenario Outline: User checks login functionality with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to the home page

    Examples:
      | username | password |
      | Hakan    | 12345    |
      | Hasan    | 12345    |