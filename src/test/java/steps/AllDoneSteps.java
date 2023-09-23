package steps;

import cucumber.api.java.en.Then;
import pages.AllDonePage;

import java.io.IOException;

public class AllDoneSteps {

    AllDonePage allDonePage = new AllDonePage();

    public AllDoneSteps() throws IOException {
    }

    @Then("the confirmation message is displayed")
    public void verifyConfirmationMessage() {
        allDonePage.verifyConfirmationMessage();
    }
}
