package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.WelcomePage;

import java.io.IOException;

public class WelcomePageSteps {

    WelcomePage welcomePage = new WelcomePage();

    public WelcomePageSteps() throws IOException {

    }

    @Given("the Qustodio kids application is opened")
    public void qustodioKidsAppOpened() {
        welcomePage.verifyQustodioKidsAppOpened();
    }

    @Given("the user selects the new to Qustodio option")
    public void selectNewToQustodioOption() {
        welcomePage.selectNewToQustodioOption();
    }

    @When("clicks on Next button in welcome page")
    public void clickOnNextButton() {
        welcomePage.clickOnNextButton();
    }

    @Given("the user selects the already have a parent account option")
    public void SelectAlreadyUserOption() {
        welcomePage.selectAlreadyUserOption();
    }
}