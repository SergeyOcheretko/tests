package chat.aim.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import chat.aim.steps.serenity.EndUserSteps;

import java.net.URISyntaxException;

public class DefinitionSteps {


    @Steps
    EndUserSteps step;


    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        step.is_the_home_page();
    }

    @When("the user looks up the definition of the word '(.*)'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        step.looks_for(word);
    }

    @Then("they should see the definition '(.*)'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        step.should_see_definition(definition);
    }

    @Given("^user go to the \"([^\"]*)\" page$")
    public void userGoToThePage(String arg0) {
        step.userGoToThePage(arg0);
    }

    @Then("^login page is opened$")
    public void loginPageIsOpened() {
        step.loginPageIsOpened();
    }

    @Then("^user click on the Register button$")
    public void userClickOnTheRegisterButton() {
        step.userClickOnTheRegisterButton();
    }

    @And("^registration page is opened$")
    public void registrationPageIsOpened() {
        step.registrationPageIsOpened();

    }

    @Then("^user click on the Back to authorization button$")
    public void userClickOnTheBackToAuthorizationButton() {
        step.userClickOnTheBackToAuthorizationButton();
    }


    @And("^user click on the Submit button$")
    public void userClickOnTheSubmitButton() {
        step.userClickOnTheSubmitButton();
    }

    @Then("^user click on the <img alt=\"([^\"]*)\" src=\"([^\"]*)\" decoding=\"([^\"]*)\" width=\"([^\"]*)\" height=\"([^\"]*)\" class=\"([^\"]*)\" srcset=\"([^\"]*)\" data-file-width=\"([^\"]*)\" data-file-height=\"([^\"]*)\"> button$")
    public void userClickOnTheImgAltSrcDecodingWidthHeightClassSrcsetDataFileWidthDataFileHeightButton(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user click on the pictures on the right side$")
    public void userClickOnThePicturesOnTheRightSide() {
    }

    @Given("^user go to the \"([^\"]*)\" page within (\\d+) seconds$")
    public void userGoToThePageWithinSeconds(String arg0, int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^user go to the \"([^\"]*)\" page with in (\\d+) seconds$")
    public void userGoToThePageWithInSeconds(String arg0, int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^enter a valid email in the email field$")
    public void enterAValidEmailInTheEmailField() {

    }

    @Then("^user clicks on the Back to authorization link$")
    public void userClicksOnTheBackToAuthorizationLink() {
        step.userClicksOnTheBackToAuthorizationLink();
    }

    @Then("^enter email \"([^\"]*)\" in the email field$")
    public void enterEmailInTheEmailField(String email) {
        step.enterEmailInTheEmailField(email);

    }

    @Then("^second registration page is opened$")
    public void secondRegistrationPageIsOpened() {
        step.secondRegistrationPageIsOpened();
    }


    @Given("^user go to the \"([^\"]*)\"$")
    public void userGoToThe(String arg0) throws Throwable {
        step.userGoToThePage(arg0);

    }

    @Then("^register page is opened$")
    public void registerPageIsOpened() {
        step.registerPageIsOpened();

    }


    @Then("^enter valid confirmation code \"([^\"]*)\"$")
    public void enterValidConfirmationCode(String code) throws Throwable {
        step.enterValidConfirmationCode(code);
    }

    @Then("^enter login \"([^\"]*)\" in the login field$")
    public void enterLoginInTheLoginField(String login) {
        step.enterLoginInTheLoginField(login);
    }

    @Then("^enter password \"([^\"]*)\" in the password field$")
    public void enterPasswordInThePasswordField(String password) {
        step.enterPasswordInThePasswordField(password);
    }

    @Then("^enter confirm password \"([^\"]*)\" in the password field$")
    public void enterConfirmPasswordInThePasswordField(String confirmPassword) {
        step.enterConfirmPasswordInThePasswordField(confirmPassword);
    }

    @Then("^click on the button Submit$")
    public void clickOnTheButtonSubmit() {
        step.clickOnTheButtonSubmit();
    }


    @And("^enter too short login \"([^\"]*)\" in the login field$")
    public void enterTooShortLoginInTheLoginField(String LoginField) {
        step.enterTooShortLoginInTheLoginField(LoginField);
    }

    @Then("^\"([^\"]*)\" a alert message displayed below the login field\\.$")
    public void aAlertMessageDisplayedBelowTheLoginField(String AllertAboutTooShortLogin) {
        step.aAlertMessageDisplayedBelowTheLoginField(AllertAboutTooShortLogin);
    }


    @And("^Log in page is opened$")
    public void logInPageIsOpened() {
        step.logInPageIsOpened();
    }


    @Given("^enter \"([^\"]*)\" in the Login field$")
    public void enterInTheLoginField(String SignIn) {
        step.enterInTheLoginField(SignIn);
    }


    @When("^enter password \"([^\"]*)\"$")
    public void enterPassword(String signInPassword) {
        step.enterPassword(signInPassword);
    }

    @And("^click on the Submit$")
    public void clickOnTheSubmit() {
        step.clickOnTheSubmit();
    }


    @And("^click on the user icon$")
    public void clickOnTheUserIcon() {
        step.clickOnTheUserIcon();
    }

    @And("^Wait until loading icon appears$")
    public void waitUntilLoadingIconAppears() {
        step.waitUntilLoadingIconAppears();
    }


    @And("^user pop-up should be opened in the Main block$")
    public void userPopUpShouldBeOpenedInTheMainBlock() {
        step.userPopUpShouldBeOpenedInTheMainBlock();
    }

    @And("^click on the 'Sign out' butoon in the drop-down menu$")
    public void clickOnTheButoonInTheDropDownMenu() {
        step.clickOnTheButoonInTheDropDownMenu();
    }


    @Then("^Sign in to Chat' page is opened$")
    public void signInToChatPageIsOpened() {
        step.signInToChatPageIsOpened();
    }


    @When("^'Login can't be empty' allert message is displayed$")
    public void loginCanTBeEmptyAllertMessageIsDisplayed() {
        step.loginCanTBeEmptyAllertMessageIsDisplayed();
    }

    @When("^'Password can't be empty' alert is displayed$")
    public void passwordCanTBeEmptyAlertIsDisplayed() {
        step.passwordCanTBeEmptyAlertIsDisplayed();
    }

    @And("^'Sign in' button should be not clickable$")
    public void signInButtonShouldBeNotClickable() {
        step.signInButtonShouldBeNotClickable();
    }

    @And("^'Unauthorized'  alert message displayed to be above the 'Sign in chat' title$")
    public void unauthorizedAlertMessageDisplayedToBeAboveTheSignInChatTitle() {
        step.unauthorizedAlertMessageDisplayedToBeAboveTheSignInChatTitle();
    }

    @And("^'Only latin symbols can be used' alert is displayed$")
    public void onlyLatinSymbolsCanBeUsedAlertIsDisplayed() {
        step.onlyLatinSymbolsCanBeUsedAlertIsDisplayed();
    }

    @When("^click on 'Remember me on this computer' link\\.$")
    public void clickOnRememberMeOnThisComputerLink() {
        step.clickOnRememberMeOnThisComputerLink();
    }

    @Given("^click on the 'Forgot your password\\?'link$")
    public void clickOnTheForgotYourPasswordLink() {
        step.clickOnTheForgotYourPasswordLink();
    }

    @When("^'Forgot Password' page should be opened$")
    public void forgotPasswordPageShouldBeOpened() {
        step.forgotPasswordPageShouldBeOpened();
    }

    @When("^click on the 'Send Reset Instructions' button$")
    public void clickOnTheSendResetInstructionsButton() {
        step.clickOnTheSendResetInstructionsButton();
    }

    @When("^'Aimprosoft Chat Recovery Password' page should be opened$")
    public void aimprosoftChatRecoveryPasswordPageShouldBeOpened() {
    step.aimprosoftChatRecoveryPasswordPageShouldBeOpened();

    }


    @When("^enter \"([^\"]*)\" in the 'Generated Password' field$")
    public void enterInTheGeneratedPasswordField(String GeneratedPassword){
    step.enterInTheGeneratedPasswordField(GeneratedPassword);
    }

    @When("^enter \"([^\"]*)\" in the \"([^\"]*)\" field$")
    public void enterInTheField(String data, String field){
        step.enterInTheField(data, field);
    }

    @When("^repeat \"([^\"]*)\" in the 'Password' field$")
    public void repeatInThePasswordField(String repeatPassword){
    step.repeatInThePasswordField(repeatPassword);

    }

    @And("^click on the 'Use Generated Pass' button$")
    public void clickOnTheUseGeneratedPassButton() {
    step.clickOnTheUseGeneratedPassButton();
    }


    @Given("^click on the 'Profile' button$")
    public void clickOnTheProfileButton() {
    step.clickOnTheProfileButton();
    }

    @When("^'Edit your profile' title should be opened$")
    public void editYourProfileTitleShouldBeOpened() {
    step.editYourProfileTitleShouldBeOpened();
    }


    @When("^enter \"([^\"]*)\" in the 'First name' field$")
    public void enterInTheFirstNameField(String FirstNameField){
    step.enterInTheFirstNameField(FirstNameField);
    }

    @When("^enter \"([^\"]*)\" in the 'Last name' field$")
    public void enterInTheLastNameField(String LastNameField){
     step.enterInTheLastNameField(LastNameField);
    }

    @When("^enter \"([^\"]*)\" in the 'Phone number' field$")
    public void enterInThePhoneNumberField(String PhoneNumberField){
     step.enterInThePhoneNumberField(PhoneNumberField);
    }

    @When("^enter \"([^\"]*)\" in the 'Skype' field$")
    public void enterInTheSkypeField(String skypeField){
    step.enterInTheSkypeField(skypeField);
    }

    @When("^enter \"([^\"]*)\" in the 'What I do' field$")
    public void enterInTheWhatIDoField(String WhatIDoField){
    step.enterInTheWhatIDoField(WhatIDoField);
    }

    @When("^enter \"([^\"]*)\" in the 'Where I Am' field$")
    public void enterInTheWhereIAmField(String whereIAmfield){
    step.enterInTheWhereIAmField(whereIAmfield);
    }

    @When("^change time zone in the 'Time Zone' drop-down menu$")
    public void changeTimeZoneInTheTimeZoneDropDownMenu() {
    step.changeTimeZoneInTheTimeZoneDropDownMenu();
    }

    @When("^click on the 'Save' button$")
    public void clickOnTheSaveButton() {
    step.clickOnTheSaveButton();
    }

    @And("^data should be saved$")
    public void dataShouldBeSaved() {
    step.dataShouldBeSaved();
    }


    @When("^Select file \"([^\"]*)\" for Avatar$")
    public void selectFileForAvatar(String file) throws URISyntaxException {
    step.selectFileForAvatar(file);
    }

    @When("^click on 'Save' button$")
    public void clickOnSaveButton() {
    step.clickOnSaveButton();
    }

    @When("^Should be 3 characters or more\\.-alert is displayed below FirstName field$")
    public void shouldBeCharactersOrMoreAlertIsDisplayedBelowFirstNameField() {
    step.shouldBeCharactersOrMoreAlertIsDisplayedBelowFirstNameField();
    }

    @When("^Should be 3 characters or more\\.-alert is displayed below LastName field$")
    public void shouldBeCharactersOrMoreAlertIsDisplayedBelowLastNameField() {
    step.shouldBeCharactersOrMoreAlertIsDisplayedBelowLastNameField();
    }


    @When("^Phone number should include from 3 to 20 digits without special symbols-alert is displayed below Phone field$")
    public void phoneNumberShouldIncludeFromToDigitsWithoutSpecialSymbolsAlertIsDisplayedBelowPhoneField() {
    step.phoneNumberShouldIncludeFromToDigitsWithoutSpecialSymbolsAlertIsDisplayedBelowSkypeField();
    }

    @When("^Must start with a \\(A-Za-z\\)\\.\\.\\.-alert is displayed below Skype field$")
    public void mustStartWithAAZaZAlertIsDisplayedBelowSkypeField() {
    step.mustStartWithAAZaZAlertIsDisplayedBelowSkypeField();
    }

    @When("^Must start with a \\(A-Za-z\\)\\.\\.\\.-alert is displayed below What I do field$")
    public void mustStartWithAAZaZAlertIsDisplayedBelowWhatIDoField() {
    step.mustStartWithAAZaZAlertIsDisplayedBelowWhatIDoField();
    }

    @Then("^Save button should be disabled$")
    public void saveButtonShouldBeDisabled() {
    step.saveButtonShouldBeDisabled();
    }
}




