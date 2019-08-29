package chat.aim;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features= {
        "src/test/resources/features/consult_dictionary/ForgotYourPassowrd.feature",
        "src/test/resources/features/consult_dictionary/LoginPage.feature",
},
        glue = "aim.chat")

public class DefinitionTestSuite {
}
