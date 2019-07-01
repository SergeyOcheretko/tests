package chat.aim.steps.serenity;

import chat.aim.pages.DictionaryPage;
import chat.aim.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    public Object enterValidConfirmationCode;
    DictionaryPage dictionaryPage;
    RegisterPage registerPage;

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

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
    Assert.assertTrue(Boolean.parseBoolean("registerPageIsOpened"));registerPage.registerPageIsOpened();
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

    public void clickOnTheButtonSubmit() {
    registerPage.clickOnTheButtonSubmit();
    }
}

