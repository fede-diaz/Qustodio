package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import pages.GetStartedPage;

import java.io.IOException;

public class GetStartedSteps {

    GetStartedPage getStartedPage = new GetStartedPage();

    public GetStartedSteps() throws IOException {
    }

    @Then("creates the following account: {string} as name, {string} as email and {string} as password")
    public void completeAllFields(String name, String email, String password) {
        getStartedPage.completeName(name);
        getStartedPage.completeEmail(email);
        getStartedPage.completeEmailVerification(email);
        getStartedPage.completePassword(password);
        getStartedPage.completePasswordVerification(password);
    }

    @And("clicks on the checkbox accepting the terms")
    public void acceptTerms() {
        getStartedPage.clickOnAcceptTermsCheckbox();
    }

    @And("clicks on Next button in get started page")
    public void clickOnNextButton() {
        getStartedPage.clickOnNextButton();
    }
}
