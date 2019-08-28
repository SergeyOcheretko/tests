package chat.aim.pages;


import chat.aim.Locators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://192.168.217.23/index.html#/login")
public class LoginPage extends PageObject {




    public boolean signInToChatPageIsOpened() {
        return $(Locators.SignInToChat).isDisplayed();
    }

    public boolean loginCanTBeEmptyAllertMessageIsDisplayed() {
    return $(Locators.LOginCantBeEmpty).isDisplayed();
    }

    public boolean passwordCanTBeEmptyAlertIsDisplayed() {
    return $(Locators.signInPassword).isDisplayed();
    }

    public boolean signInButtonShouldBeNotClickable() {
    return $(Locators.SignInSubmit).isDisplayed();
    }

    public boolean unauthorizedAlertMessageDisplayedToBeAboveTheSignInChatTitle() {
    return $(Locators.Unauthorized).isDisplayed();
    }

    public boolean onlyLatinSymbolsCanBeUsedAlertIsDisplayed() {
    return $(Locators.OnlyLatinSymbolsCanBeUsed).isDisplayed();
    }

    public void clickOnRememberMeOnThisComputerLink() {
    $(Locators.RememberMeLink).click();
    }
}
