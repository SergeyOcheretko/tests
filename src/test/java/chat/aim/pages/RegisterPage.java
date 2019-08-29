package chat.aim.pages;

import chat.aim.Locators;
import net.serenitybdd.core.pages.PageObject;

public class RegisterPage extends PageObject {
    public void userGoToThePage(String arg0) {

        getDriver().get(arg0);

    }

    public boolean loginPageIsOpened() {
        return $(Locators.REG_PAGE).isDisplayed();
    }

    public void userClickOnTheRegisterButton() {
        $(Locators.Regi).click();
    }

    public boolean registrationPageIsOpened() {
        return $(Locators.Aim).isDisplayed();
    }

    public void userClickOnTheBacktoauthorizationButton() {
        $(Locators.Back).click();
    }

    public void userClickOnTheSubmitButton() {
        $(Locators.Empty).click();
    }

    public void userClicksOnTheBackToAuthorizationLink() {
        $(Locators.BackToAuthorization).click();
    }

    public void enterEmailInTheEmailField(String email) {
        $(Locators.EmailRegistrationField).clear();
        $(Locators.EmailRegistrationField).sendKeys(email);
    }


    public boolean secondRegistrationPageIsOpened() {
        return $(Locators.CodeConfirmation).isDisplayed();
    }

    public void registerPageIsOpened() {
        return;
    }

    public void enterValidConfirmationCode(String code) {
        $(Locators.CodeConfirmation).clear();
        $(Locators.CodeConfirmation).sendKeys(code);

    }

    public void enterLoginInTheLoginField(String login) {
        $(Locators.LoginField).clear();
        $(Locators.LoginField).sendKeys(login);
    }

    public void enterPasswordInThePasswordField(String password) {
        $(Locators.PasswordField).clear();
        $(Locators.PasswordField).sendKeys(password);
    }

    public void enterConfirmPasswordInThePasswordField(String confirmPassword) {
        $(Locators.ConfirmPasswordField).clear();
        $(Locators.ConfirmPasswordField).sendKeys(confirmPassword);
    }


    public void clickOnTheButtonSubmit() {
        $(Locators.SubmitButtonAuthorization).click();
    }


    public void enterTooShortLoginInTheLoginField(String tooShortLogin) {
        $(Locators.LoginField).clear();
        $(Locators.LoginField).sendKeys(tooShortLogin);

    }

    public boolean aAlertMessageDisplayedBelowTheLoginField(String allertAboutTooShortLogin) {
        return $(Locators.allertAboutTooShortLogin).isDisplayed();
    }


    public boolean logInPageIsOpened(String SignInToChat) {
        return $(Locators.SignInToChat).isDisplayed();
    }


    public void enterInTheLoginField(String signIn) {
        $(Locators.SignIn).clear();
        $(Locators.SignIn).sendKeys(signIn);

    }

    public void enterPasswordInThePassword(String signInPassword) {
        $(Locators.signInPassword).clear();
        $(Locators.signInPassword).sendKeys(signInPassword);
    }


    public void enterPassword(String signInPassword) {
        $(Locators.signInPassword).clear();
        $(Locators.signInPassword).sendKeys(signInPassword);
    }

    public void clickOnTheSubmit() {
        $(Locators.SignInSubmit).click();
    }


    public void clickOnTheUserIcon() {
        $(Locators.userIcon).click();
    }


    public void userPopUpShouldBeOpenedInTheMainBlock() {
    $(Locators.userMenuDropdown).isDisplayed();


    }

    public void clickOnTheButoonInTheDropDownMenu() {
    $(Locators.SignOutInTheMainMenu).click();
    }
}

