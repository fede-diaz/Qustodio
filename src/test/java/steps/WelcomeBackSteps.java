package steps;

import cucumber.api.java.en.And;
import pages.WelcomeBackPage;
import java.io.IOException;

public class WelcomeBackSteps {

    WelcomeBackPage welcomeBackPage = new WelcomeBackPage();

    public WelcomeBackSteps() throws IOException {
    }

    @And("enter the following credentials: {string} as email and {string} as password")
    public void enterCredentials(String email, String password) {
        welcomeBackPage.enterCredentials(email, password);
    }

    @And("click on Next button in welcome back page")
    public void clickOnNextButton() {
        welcomeBackPage.clickOnNextButton();
    }
}
