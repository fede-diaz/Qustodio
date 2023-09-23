Feature: Login

  Background:
    Given the Qustodio kids application is opened

  @login
  Scenario Outline: Account creation and login
    Given the user selects the new to Qustodio option
    When clicks on Next button in welcome page
    Then creates the following account: "<name>" as name, "<email>" as email and "<password>" as password
    And clicks on the checkbox accepting the terms
    And clicks on Next button in get started page
    And enter "<device_name>" as device name
    And click on Next button in device name page
    And enter "<device_user_name>" as device user name
    And selects year of birth
    And selects gender
    And clicks on Next button in device users page
    Then the confirmation message is displayed

    Examples:
    | name | email              | password    | device_name | device_user_name |
    | Name | somemail@gmail.com | Qustodio123 | Test device | User Name        |

  Scenario Outline: Login with existing account and user in device
    Given the user selects the already have a parent account option
    When clicks on Next button in welcome page
    And enter the following credentials: "<email>" as email and "<password>" as password
    And click on Next button in welcome back page
    And enter "<device_name>" as device name
    And click on Next button in device name page
    And selects the user "<device_user_name>"
    Then the confirmation message is displayed

    Examples:
    | email              | password    | device_name | device_user_name |
    | somemail@gmail.com | Qustodio123 | Test device | User Name        |

  Scenario Outline: Login with existing account and add user in device
    Given the user selects the already have a parent account option
    When clicks on Next button in welcome page
    And enter the following credentials: "<email>" as email and "<password>" as password
    And click on Next button in welcome back page
    And enter "<device_name>" as device name
    And click on Next button in device name page
    And selects add new user option
    And enter "<device_user_name>" as device user name
    And selects year of birth
    And selects gender
    And clicks on Next button in device users page
    Then the confirmation message is displayed

    Examples:
    | email              | password    | device_name | device_user_name |
    | somemail@gmail.com | Qustodio123 | Test device | New User Name    |