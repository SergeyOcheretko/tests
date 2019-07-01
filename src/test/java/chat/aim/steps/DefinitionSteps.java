package chat.aim.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import chat.aim.steps.serenity.EndUserSteps;

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
    public void userGoToThePage(String arg0) throws Throwable {
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
    public void registerPageIsOpened() { step.registerPageIsOpened();

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

    @And("^click on the \"([^\"]*)\" button$")
    public void clickOnTheButton(){
    step.clickOnTheButton();g

    }
}
