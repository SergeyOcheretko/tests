Feature: testing registration page

  Scenario: 01.0001	Check the transition by "Register" button in menu authorization
    Given user go to the "https://chat-demo.aimprosoft.com/index.html#/login" page
    Then login page is opened
    Then user click on the Register button
    And registration page is opened

  Scenario: 01.0002	Check the transition by "Cancel" button in menu authorization
    Given user go to the "https://192.168.217.23/index.html#/registration" page
    Then registration page is opened
    Then user click on the Back to authorization button
    And login page is opened

  Scenario: 01.0003	Check the transition by "Back to authorization " button in menu authorization
    Given user go to the "https://192.168.217.23/index.html#/registration" page
    Then registration page is opened
    Then user clicks on the Back to authorization link
    And login page is opened


  Scenario: 01.0004	Check fot behavior  form empty "Email" field
    Given user go to the "https://192.168.217.23/index.html#/registration" page
    Then registration page is opened
    Then user click on the Register button
    And registration page is opened
    And user click on the Submit button


  Scenario: Check confirmation code in the email
    Given user go to the "https://192.168.217.23/index.html#/login" page
    Then login page is opened
    Then user click on the Register button
    And registration page is opened

  Scenario: 01.0009	Check for behavior to form login with a too short "Login"
    Given  user go to the "https://192.168.217.23/index.html#/registration" page
    Then registration page is opened
    Then enter email "s.ocheretko@aimprosoft.com" in the email field
    Then user click on the Submit button
    Then second registration page is opened


  Scenario: 01.0010  Check for behavior to form login with a too short "Password"
    Given  user go to the "https://192.168.217.23/index.html#/registration" page
    Then registration page is opened
    Then enter email "s.ocheretko@aimprosoft.com" in the email field
    Then user click on the Submit button
    Then second registration page is opened
    Then enter valid confirmation code "213555"
    Then enter login "SergeyOcheretko" in the login field
    Then enter password "qwerty12345" in the password field
    Then enter confirm password "qwerty12345" in the password field
    Then click on the button Submit
    And Log in page is opened

  Scenario: 01.0011 Check for behavior to form with invalid "Login"
    Given user go to the "https://192.168.217.23/index.html#/registration" page
    Then registration page is opened
    Then enter email "s.ocheretko@aimprosoft.com" in the email field
    Then user click on the Submit button
    Then second registration page is opened
    Then enter valid confirmation code "213555"
    And enter too short login "Se" in the login field
    Then enter password "qwerty12345" in the password field
    Then "Login must start with a (A-Za-z)..." a alert message displayed below the login field.

