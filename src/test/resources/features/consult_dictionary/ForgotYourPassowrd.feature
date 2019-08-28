Feature: Check on Forgot your password? link.
  Background:
   Given user go to the "https://192.168.217.23/index.html#/login" page


  Scenario: 01.000 Check on  Forgot your password? link.
     Given click on the 'Forgot your password?'link
     When 'Forgot Password' page should be opened
     When enter email "sergej.ocheretko1@gmail.com" in the email field
     When click on the 'Send Reset Instructions' button
     When 'Aimprosoft Chat Recovery Password' page should be opened
     When enter "qwerty34534" in the 'Generated Password' field
     When enter "qwerty34534" in the "Password" field
     When repeat "qwerty34534" in the 'Password' field
     When click on the 'Use Generated Pass' button
     And  Sign in to Chat' page is opened

  Scenario: 02.0001 Check login with valid password and login
    When enter "sergej.ocheretko1@gmail.com" in the Login field
    When enter password "qwerty12345"
    When click on the Submit
    And Wait until loading icon appears

