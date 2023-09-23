package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.PageBase;

import java.io.IOException;
import java.util.List;

public class WelcomeBackPage extends PageBase {

    private final String credentials_fields = "//*[@LocalizedControlType='edit']";
    private final String next_button = "Next";

    public WelcomeBackPage() throws IOException {
    }

    public void enterCredentials(String email, String password) {
        List<WebElement> credentials_fields_list = getListOfElements(new By.ByXPath(credentials_fields));
        completeField(credentials_fields_list.get(0), email);
        completeField(credentials_fields_list.get(1), password);
    }

    public void clickOnNextButton() {
        clickOnElement(new By.ByName(next_button));
    }
}
