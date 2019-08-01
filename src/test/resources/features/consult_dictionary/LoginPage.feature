Feature: testing login page
  Background:
  Given user go to the "https://192.168.217.23/index.html#/login" page


  Scenario: 02.0001 Check login with valid password and login
    When enter "sergej.ocheretko1@gmail.com" in the Login field
    When enter password "qwerty12345"
    When click on the Submit
    And Wait until loading icon appears
    And click on the user icon
    And  user pop-up should be opened in the Main block
    And click on the 'Sign out' butoon in the drop-down menu
    Then Sign in to Chat' page is opened

  Scenario:  02.0002  Check login with blank username and password fields
#   Given  user go to the "https://192.168.217.23/index.html#/login" page
    When enter "" in the Login field
    When enter password ""
    When 'Login can't be empty' allert message is displayed
    When 'Password can't be empty' alert is displayed
    And 'Sign in' button should be not clickable

    Scenario: 02.0003 Check for behavior to form enter with a valid login and password invalid
      When enter "qwerty" in the Login field
      When enter password "zxcvbn"
      When click on the Submit
      And 'Unauthorized'  alert message displayed to be above the 'Sign in chat' title

  Scenario: Check for behavior to form with special characters in 'Password' field
     When enter "sergej.ocheretko1@gmail.com" in the Login field
     When enter password "&$%$%^%$%$^"
     When click on the Submit
     And 'Unauthorized'  alert message displayed to be above the 'Sign in chat' title

   Scenario: Check for behavior to form with special characters in 'Login' field
     When enter "&%&%%*&*" in the Login field
     When enter password "qwerty12345"
     And 'Only latin symbols can be used' alert is displayed

   Scenario: Login using upper and lower case letters in "Login" and "Password" field
     When enter "SerGej.OcheRetKo1@gmail.com" in the Login field
     When enter password "QwErtY12345"
     When click on the Submit
     And 'Unauthorized'  alert message displayed to be above the 'Sign in chat' title

   Scenario: "Enter Cyrillic in ""Login"" field during registration.
     When enter "йцуйцуйцйу" in the Login field
     When  enter password "QwErtY12345"
     And 'Only latin symbols can be used' alert is displayed

  Scenario: Log in without using the "@" symbol in the login
    When enter "sergej.ocheretko1gmail.com" in the Login field
    When enter password "qwerty12345"
    When click on the Submit
    And 'Unauthorized'  alert message displayed to be above the 'Sign in chat' title


  Scenario: Check on "Remember me on this computer" link.
     When enter "sergej.ocheretko1@gmail.com" in the Login field
     When enter password "qwerty12345"
     When click on 'Remember me on this computer' link.
     When click on the Submit
     And  Wait until loading icon appears
     And  click on the user icon
     And  user pop-up should be opened in the Main block
     And  click on the 'Sign out' butoon in the drop-down menu
     Then Sign in to Chat' page is opened

  Scenario: Check on "Remember me on this computer" link for clickable.
     When  click on 'Remember me on this computer' link.
     When click on 'Remember me on this computer' link.
     And  Wait until loading icon appears


