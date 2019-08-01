package chat.aim.pages;

import chat.aim.Locators;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

public class UserSettingsProfile extends PageObject {
    public boolean dataShouldBeSaved;
    WaitingForElements waitingForElements = new WaitingForElements();

    public void clickOnTheProfileButton() {
        $(Locators.ProfileButtonInTheDropDownMenu).click();
    }

    public boolean editYourProfileTitleShouldBeOpened() {
        return $(Locators.EditYourProfileTitle).isDisplayed();
    }

    public void enterInTheFirstNameField(String FirstNameField) {
        $(Locators.FirstNameField).clear();
        $(Locators.FirstNameField).sendKeys(FirstNameField);
    }

    public void enterInTheLastNameField(String lastNameField) {
        $(Locators.lastNameField).clear();
        $(Locators.lastNameField).sendKeys(lastNameField);
    }

    public void enterInThePhoneNumberField(String phoneNumberField) {
        $(Locators.phoneNumberField).clear();
        $(Locators.phoneNumberField).sendKeys(phoneNumberField);
    }

    public void enterInTheSkypeField(String skypeField) {
        $(Locators.skypeField).clear();
        $(Locators.skypeField).sendKeys(skypeField);
    }

    public void enterInTheWhatIDoField(String whatIDoField) {
        $(Locators.whatIDoField).clear();
        $(Locators.whatIDoField).sendKeys(whatIDoField);
    }

    public void enterInTheWhereIAmField(String whereIAmfield) {
        $(Locators.whereIAmfield).clear();
        $(Locators.whereIAmfield).sendKeys(whereIAmfield);
    }

    public void changeTimeZoneInTheTimeZoneDropDownMenu() {
        $(Locators.changeTimeZone).click();
        $(Locators.timeZoneAlaska).click();
    }

    public void clickOnTheSaveButton() {
        $(Locators.saveButtonInEditProfile).click();
    }

    public boolean dataShouldBeSaved() {
        return $(Locators.dataSuccesfullyUpdated).isDisplayed();
    }


    public void selectFileForAvatar(String file) throws URISyntaxException {
        $(Locators.pathToTheAvatar).sendKeys(waitingForElements.getAbsolutePathOfFile(file));
    }

    public void clickOnSaveButton() {
        $(Locators.SaveButtonPicture).click();
    }


    public boolean shouldBeCharactersOrMoreAlertIsDisplayedBelowFirstNameField() {
        try {
            withTimeoutOf(500, TimeUnit.MILLISECONDS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.xpath(Locators.FirstNameShouldBe3CharactersOrMore)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean shouldBeCharactersOrMoreAlertIsDisplayedBelowLastNameField() {
        try {
            withTimeoutOf(500, TimeUnit.MILLISECONDS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.xpath(Locators.LastNameShouldBe3CharactersOrMore)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean phoneNumberShouldIncludeFromToDigitsWithoutSpecialSymbolsAlertIsDisplayedBelowPhoneField() {
        try {
            withTimeoutOf(500, TimeUnit.MILLISECONDS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.xpath(Locators.PhoneFieldPhoneNumberShouldIncludeFromToDigitsWithoutSpecialSymbolsAlertIsDisplayedBelowPhoneField)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean mustStartWithAAZaZAlertIsDisplayedBelowSkypeField() {
        try {
            withTimeoutOf(500, TimeUnit.MILLISECONDS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.xpath(Locators.SkypeFieldMustStartWithAAZaZAlertIsDisplayedBelowSkypeField)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean mustStartWithAAZaZAlertIsDisplayedBelowWhatIDoField() {
        try {
            withTimeoutOf(500, TimeUnit.MILLISECONDS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.xpath(Locators.WhatIDoFieldMustStartWithAAZaZ)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean saveButtonShouldBeDisabled() {
    return $(Locators.saveButtonInEditProfile).isCurrentlyEnabled();
    }
}


