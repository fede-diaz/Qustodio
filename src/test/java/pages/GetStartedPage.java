package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.PageBase;

import java.io.IOException;
import java.util.List;

public class GetStartedPage extends PageBase {

    private final String lists_field = "//*[@LocalizedControlType='edit']";
    private final String accept_terms_checkbox = "//*[@LocalizedControlType='check box']";
    private final String next_button = "Next";

    public GetStartedPage() throws IOException {
    }

    public void completeName(String name) {
        List<WebElement> fields_to_complete = getListOfElements(new By.ByXPath(lists_field));
        completeField(fields_to_complete.get(0), name);
    }

    public void completeEmail(String email) {
        List<WebElement> fields_to_complete = getListOfElements(new By.ByXPath(lists_field));
        completeField(fields_to_complete.get(1), email);
    }

    public void completeEmailVerification(String email) {
        List<WebElement> fields_to_complete = getListOfElements(new By.ByXPath(lists_field));
        completeField(fields_to_complete.get(2), email);
    }

    public void completePassword(String password) {
        List<WebElement> fields_to_complete = getListOfElements(new By.ByXPath(lists_field));
        completeField(fields_to_complete.get(3), password);
    }

    public void completePasswordVerification(String password) {
        List<WebElement> fields_to_complete = getListOfElements(new By.ByXPath(lists_field));
        completeField(fields_to_complete.get(4), password);
    }

    public void clickOnAcceptTermsCheckbox() {
        clickOnElement(new By.ByXPath(accept_terms_checkbox));
    }

    public void clickOnNextButton() {
        clickOnElement(new By.ByName(next_button));
    }
}
