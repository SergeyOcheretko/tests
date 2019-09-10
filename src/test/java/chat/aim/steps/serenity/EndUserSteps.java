package chat.aim.steps.serenity;

import chat.aim.Locators;
import chat.aim.pages.*;
import chat.aim.steps.WaitingForElements;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.net.URISyntaxException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

//    public Object enterValidConfirmationCode;
private DictionaryPage dictionaryPage;
    private RegisterPage registerPage;
    private WaitingForElements waiting;
    private LoginPage loginPage;
    private ForgotYourPassword forgotYourPassword;
    private UserSettingsProfile userSettingsProfile;


    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

//    @Step
//    public void should_see_definition(String definition) {
//        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
//    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }

    @Step
    public void userGoToThePage(String arg0) {
//        loginPage.open();
        registerPage.userGoToThePage(arg0);
    }

    @Step
    public void loginPageIsOpened() {
        Assert.assertTrue("registration Page Is not Opened", registerPage.loginPageIsOpened());
    }

    @Step
    public void userClickOnTheRegisterButton() {
        registerPage.userClickOnTheRegisterButton();
    }

    @Step
    public void registrationPageIsOpened() {
        Assert.assertTrue("registration page is not opened", registerPage.registrationPageIsOpened());
    }

    @Step
    public void userClickOnTheBackToAuthorizationButton() {
        registerPage.userClickOnTheBacktoauthorizationButton();
    }

    @Step
    public void userClickOnTheSubmitButton() {
        registerPage.userClickOnTheSubmitButton();

    }

    @Step
    public void userClicksOnTheBackToAuthorizationLink() {
        registerPage.userClicksOnTheBackToAuthorizationLink();


    }

    @Step
    public void enterEmailInTheEmailField(String email) {
        registerPage.enterEmailInTheEmailField(email);
    }

    @Step
    public void secondRegistrationPageIsOpened() {
        Assert.assertTrue("secondRegistrationPageIsNotOpened", registerPage.secondRegistrationPageIsOpened());
    }

    @Step
    public void registerPageIsOpened() {
        Assert.assertTrue(Boolean.parseBoolean("registerPageIsOpened"));
        registerPage.registerPageIsOpened();
    }

    @Step
    public void enterValidConfirmationCode(String code) {
        registerPage.enterValidConfirmationCode(code);
    }

    @Step
    public void enterLoginInTheLoginField(String login) {
        registerPage.enterLoginInTheLoginField(login);
    }

    @Step
    public void enterPasswordInThePasswordField(String password) {
        registerPage.enterPasswordInThePasswordField(password);
    }

    @Step
    public void enterConfirmPasswordInThePasswordField(String confirmPassword) {
        registerPage.enterConfirmPasswordInThePasswordField(confirmPassword);
    }

    @Step
    public void clickOnTheButtonSubmit() {
        registerPage.clickOnTheButtonSubmit();
    }

    @Step
    public void enterTooShortLoginInTheLoginField(String LoginField) {
        registerPage.enterTooShortLoginInTheLoginField(LoginField);
    }

    @Step
    public void aAlertMessageDisplayedBelowTheLoginField(String allertAboutTooShortLogin) {
        registerPage.aAlertMessageDisplayedBelowTheLoginField(allertAboutTooShortLogin);
    }

    @Step
    public void logInPageIsOpened() {
        Assert.assertTrue("logInPageIsNotOpened", registerPage.loginPageIsOpened());
    }

    @Step
    public void enterInTheLoginField(String signIn) {
        registerPage.enterInTheLoginField(signIn);
    }

    @Step
    public void enterPassword(String signInPassword) {
        registerPage.enterPassword(signInPassword);
    }

    @Step
    public void clickOnTheSubmit() {
        registerPage.clickOnTheSubmit();
    }

    @Step
    public void clickOnTheUserIcon() {
        registerPage.clickOnTheUserIcon();
    }

    @Step
    public void waitUntilLoadingIconAppears() {
        waiting.waitUntilElementToBeVisible(5, Locators.SignInIntoChat);
        waiting.waitUntilElementToBeInvisible(5, Locators.SignInIntoChat);
    }
    @Step
    public void userPopUpShouldBeOpenedInTheMainBlock() {
    registerPage.userPopUpShouldBeOpenedInTheMainBlock();
    }
    @Step
    public void clickOnTheButoonInTheDropDownMenu() {
    registerPage.clickOnTheButoonInTheDropDownMenu();
    }
    @Step
    public void signInToChatPageIsOpened() {
        Assert.assertTrue("", loginPage.signInToChatPageIsOpened());
    }

    @Step
    public void loginCanTBeEmptyAllertMessageIsDisplayed() {
   Assert.assertTrue("Login can't be empty",loginPage.loginCanTBeEmptyAllertMessageIsDisplayed());
    }
    @Step
    public void passwordCanTBeEmptyAlertIsDisplayed() {
    Assert.assertTrue("Password can't be empty",loginPage.passwordCanTBeEmptyAlertIsDisplayed());
    }
    @Step
    public void signInButtonShouldBeNotClickable() {
    Assert.assertTrue("signInButtonShouldBeNotClickable",loginPage.signInButtonShouldBeNotClickable());
    }
    @Step
    public void unauthorizedAlertMessageDisplayedToBeAboveTheSignInChatTitle() {
    Assert.assertTrue("Unauthorized",loginPage.unauthorizedAlertMessageDisplayedToBeAboveTheSignInChatTitle());
    }
    @Step
    public void onlyLatinSymbolsCanBeUsedAlertIsDisplayed() {
    Assert.assertTrue("Only latin symbols can be used",loginPage.onlyLatinSymbolsCanBeUsedAlertIsDisplayed());
    }
    @Step
    public void clickOnRememberMeOnThisComputerLink() {
    loginPage.clickOnRememberMeOnThisComputerLink();
    }
    @Step
    public void clickOnTheForgotYourPasswordLink() {
    forgotYourPassword.clickOnTheForgotYourPasswordLink();
    }
    @Step
    public void forgotPasswordPageShouldBeOpened() {
    Assert.assertTrue("forgotPasswordPageShouldBeOpened",forgotYourPassword.forgotPasswordPageShouldBeOpened());
    }
    @Step
    public void clickOnTheSendResetInstructionsButton() {
    forgotYourPassword.clickOnTheSendResetInstructionsButton();
    }


    public void aimprosoftChatRecoveryPasswordPageShouldBeOpened() {
   Assert.assertTrue("aimprosoftChatRecoveryPasswordPageShouldBeOpened",forgotYourPassword.aimprosoftChatRecoveryPasswordPageShouldBeOpened());
    }


    public void enterInTheGeneratedPasswordField(String GeneratedPassword) {
    forgotYourPassword.enterInTheGeneratedPasswordField(GeneratedPassword);
    }

    public void enterInTheField(String data, String field) {
        forgotYourPassword.enterInTheField(data,  field);
    }

    public void repeatInThePasswordField(String repeatPassword) {
    forgotYourPassword.repeatInThePasswordField(repeatPassword);
    }

    public void clickOnTheUseGeneratedPassButton() {
    forgotYourPassword.clickOnTheUseGeneratedPassButton();
    }


    public void clickOnTheProfileButton() {
    userSettingsProfile.clickOnTheProfileButton();
    }

    public void editYourProfileTitleShouldBeOpened() {
    Assert.assertTrue("editYourProfileTitleShouldBeOpened",userSettingsProfile.editYourProfileTitleShouldBeOpened());
    }

    public void enterInTheFirstNameField(String FirstNameField) {
    userSettingsProfile.enterInTheFirstNameField(FirstNameField);
    }

    public void enterInTheLastNameField(String lastNameField) {
    userSettingsProfile.enterInTheLastNameField(lastNameField);
    }

    public void enterInThePhoneNumberField(String PhoneNumberField ) {
    userSettingsProfile.enterInThePhoneNumberField(PhoneNumberField);
    }

    public void enterInTheSkypeField(String skypeField) {
    userSettingsProfile.enterInTheSkypeField(skypeField);
    }


    public void enterInTheWhatIDoField(String WhatIDoField) {
    userSettingsProfile.enterInTheWhatIDoField(WhatIDoField);
    }

    public void enterInTheWhereIAmField(String whereIAmfield) {
    userSettingsProfile.enterInTheWhereIAmField(whereIAmfield);
    }

    public void changeTimeZoneInTheTimeZoneDropDownMenu() {
    userSettingsProfile.changeTimeZoneInTheTimeZoneDropDownMenu();
    }

    public void clickOnTheSaveButton() {
    userSettingsProfile.clickOnTheSaveButton();
    }

    public void dataShouldBeSaved() {
    Assert.assertTrue("Data succesfully updated", userSettingsProfile.dataShouldBeSaved());
    }


    public void selectFileForAvatar(String file) throws URISyntaxException {
    userSettingsProfile.selectFileForAvatar(file);
    }

    public void clickOnSaveButton() {
    userSettingsProfile.clickOnSaveButton();
    }

    public void shouldBeCharactersOrMoreAlertIsDisplayedBelowFirstNameField() {
    Assert.assertTrue("Should be 3 characters or more.",userSettingsProfile.shouldBeCharactersOrMoreAlertIsDisplayedBelowFirstNameField());
    }

    public void shouldBeCharactersOrMoreAlertIsDisplayedBelowLastNameField() {
    Assert.assertTrue("Should be 3 characters or more.",userSettingsProfile.shouldBeCharactersOrMoreAlertIsDisplayedBelowLastNameField());
    }

    public void phoneNumberShouldIncludeFromToDigitsWithoutSpecialSymbolsAlertIsDisplayedBelowSkypeField() {
    Assert.assertTrue("Phone number should include from 3 to 20 digits without special symbols-alert is displayed below Skype field",userSettingsProfile.phoneNumberShouldIncludeFromToDigitsWithoutSpecialSymbolsAlertIsDisplayedBelowPhoneField());
    }

    public void mustStartWithAAZaZAlertIsDisplayedBelowSkypeField() {
    Assert.assertTrue("Must start with a (A-Za-z)...",userSettingsProfile.mustStartWithAAZaZAlertIsDisplayedBelowSkypeField());
    }

    public void mustStartWithAAZaZAlertIsDisplayedBelowWhatIDoField() {
    Assert.assertTrue("Must start with a (A-Za-z)...",userSettingsProfile.mustStartWithAAZaZAlertIsDisplayedBelowWhatIDoField());
    }

    public void saveButtonShouldBeDisabled() {
    Assert.assertFalse("Save button should be disabled",userSettingsProfile.saveButtonShouldBeDisabled());
    }

    public void clickOnTheLoginField() {
    userSettingsProfile.clickOnTheLoginField();
    }
}