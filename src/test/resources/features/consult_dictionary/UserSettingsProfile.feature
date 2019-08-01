Feature: User Settings Profile
  Background:
    Given user go to the "https://192.168.217.23/index.html#/login" page
    When  enter "sergej.ocheretko1@gmail.com" in the Login field
    When  enter password "qwerty12345"
    And click on the Submit
    And Wait until loading icon appears
    And click on the user icon
    And  click on the 'Profile' button
    Then 'Edit your profile' title should be opened

  Scenario: Edit profile 1
   Given enter "asd" in the 'First name' field
   When enter "Ocheretko" in the 'Last name' field
   When enter "123445345" in the 'Phone number' field
   When enter "wqweqw123" in the 'Skype' field
   When enter "testing" in the 'What I do' field
   When enter "209" in the 'Where I Am' field
   When change time zone in the 'Time Zone' drop-down menu
   When Select file "download.jpeg" for Avatar
   When click on 'Save' button
   When click on the 'Save' button
    Then  data should be saved

  Scenario: Check validation fields in Edit Profile 2
    Given enter "l" in the 'First name' field
    When enter "2123" in the 'Last name' field
    When Should be 3 characters or more.-alert is displayed below FirstName field
    When enter "q" in the 'Phone number' field
    When Should be 3 characters or more.-alert is displayed below LastName field
    When enter "1" in the 'Skype' field
    When Phone number should include from 3 to 20 digits without special symbols-alert is displayed below Phone field
    When Must start with a (A-Za-z)...-alert is displayed below Skype field
    When enter "цуйуйцуйц" in the 'What I do' field
    When enter "209" in the 'Where I Am' field
    When Must start with a (A-Za-z)...-alert is displayed below What I do field
    Then Save button should be disabled

  Scenario: