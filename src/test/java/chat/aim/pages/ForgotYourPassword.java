package chat.aim.pages;

import chat.aim.Locators;
import net.serenitybdd.core.pages.PageObject;

public class ForgotYourPassword extends PageObject {
    public void clickOnTheForgotYourPasswordLink() {
     $(Locators.ForgotYourPasswordLink).click();
    }

    public boolean forgotPasswordPageShouldBeOpened() {
     return $(Locators.ForgotPasswordTitle).isDisplayed();
    }

    public void clickOnTheSendResetInstructionsButton() {
    $(Locators.SendRestInstructions).click();
    }


    public boolean aimprosoftChatRecoveryPasswordPageShouldBeOpened() {
     return $(Locators.AimprosoftChatRecoveryPassword).isDisplayed();
    }


    public void enterInTheGeneratedPasswordField(String GeneratedPassword) {
    $(Locators.GeneratedPassword).clear();
    $(Locators.GeneratedPassword).sendKeys(GeneratedPassword);
    }

    public void enterInTheField(String data, String field) {
        $(Locators.VALUE_PLACEHOLDER.replace("$1", field)).clear();
        $(Locators.VALUE_PLACEHOLDER.replace("$1", field)).sendKeys(data);
    }


    public void repeatInThePasswordField(String repeatPassword) {
    $(Locators.repeatPassword).clear();
        $(Locators.repeatPassword).sendKeys(repeatPassword);
    }

    public void clickOnTheUseGeneratedPassButton() {
    $(Locators.useGeneratedPassButton).click();
    }
}

