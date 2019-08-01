package chat.aim;

public interface Locators {
    String REG_PAGE = "//span[contains(text(),'Sign')]";

    String VALUE_PLACEHOLDER = "//div[@class='inputs-wrapper']//div[2]//div[1]//input[1]";

    String Regi = "//a[contains(text(),'Register')]";
    String Aim = "//div[@class='text-center']//h1[1]";
    String Back = "//a[contains(text(),'Back to authorization')]";
    String Empty = "//button[@type='submit']";
    String BackToAuthorization = "//a[contains(text(),'Back to authorization')]";
    String EmailRegistrationField = "//input[@placeholder='Email']";
    String CodeConfirmation = "//input[@placeholder='Email confirmation code']";
    String LoginField = "//input[@placeholder='Login']";
    String PasswordField = "//body//div[@class='inputs-wrapper']//div//div[3]//div[1]//input[1]";
    String ConfirmPasswordField = "//div[4]//div[1]//input[1]";
    String SubmitButtonAuthorization = "//button[@class='button btn btn-lg btn-success']";
    String allertAboutTooShortLogin = "//div[contains(text(),'Login must be 3 characters or more and 27 or less')]";
    String SignInToChat = "//body//h1[1]";
    String SignIn = "//input[@placeholder='Login']";
    String signInPassword = "//input[@placeholder='Password']";
    String SignInSubmit = "//button[@class='btn btn-success btn-lg btn-block']";
    String SignInIntoChat = "//div[@class='c2 c-hidden']";
    String userIcon = "//div[@class='team-name']";
    String userMenuDropdown = "//ul[@id='user-menu-menu']";
    String SignOutInTheMainMenu = "//span[contains(text(),'Sign out')]";
    String LOginCantBeEmpty = "//div[contains(text(),\"Login can't be empty\")]";
    String Unauthorized = "//div[@class='alert alert-danger']";
    String OnlyLatinSymbolsCanBeUsed = "//div[@class='text-danger']";
    String RememberMeLink = "//label[@class='login-check-text']";
    String ForgotYourPasswordLink = "//a[@class='form-forgot']";
    String ForgotPasswordTitle = "//h1[contains(text(),'Forgot password?')]";
    String SendRestInstructions = "//button[@id='submit-recovery-request']";
    String AimprosoftChatRecoveryPassword = "//body//h1[1]";
    String GeneratedPassword = "//input[@placeholder='Generated password']";
    String repeatPassword = "//div[3]//div[1]//input[1]";
    String useGeneratedPassButton = "//button[@id='submit-generated-password']";
    String ProfileButtonInTheDropDownMenu = "//span[contains(text(),'Profile')]";
    String EditYourProfileTitle = "//h1[contains(text(),'Edit your profile')]";
    String FirstNameField = "//input[@name='firstName']";
    String lastNameField="//input[@name='lastName']";
    String phoneNumberField ="//input[@name='phone']";
    String skypeField="//input[@name='skype']";
    String whatIDoField="//input[@name='whatIDo']";
    String whereIAmfield="//input[@name='whereIAm']";
    String changeTimeZone="//select[@name='timezoneProfile']";
    String timeZoneAlaska="//option[contains(text(),'(UTC-09:00) Alaska')]";
    String saveButtonInEditProfile="//button[@class='btn btn-default']";
    String dataSuccesfullyUpdated="//div[@class='statusSucces']";
    String pathToTheAvatar="//input[@type='file']";
    String SaveButtonPicture="//button[@class='btn, btn-info abtn btn btn-default']";
    String FirstNameShouldBe3CharactersOrMore="//div[@class='text-danger']";
    String LastNameShouldBe3CharactersOrMore="//div[@class='col-md-6']//div[2]//div[1]//div[1]";
    String PhoneFieldPhoneNumberShouldIncludeFromToDigitsWithoutSpecialSymbolsAlertIsDisplayedBelowPhoneField="//div[contains(text(),'Phone number should include from 3 to 20 digits wi')]";
    String SkypeFieldMustStartWithAAZaZAlertIsDisplayedBelowSkypeField="//div[contains(text(),'Must start with a (A-Za-z)...')]";
    String WhatIDoFieldMustStartWithAAZaZ="//div[5]//div[1]//div[1]";
}





















