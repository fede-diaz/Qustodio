package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.PageBase;

import java.io.IOException;

public class WelcomePage extends PageBase {

    private final String welcome_message = "Welcome";
    private final String new_to_qustodio_option = "I'm new to Qustodio";
    private final String already_user_option = "I already have a parent account";
    private final String next_button = "Next";

    public WelcomePage() throws IOException {
    }

    public void verifyQustodioKidsAppOpened() {
        Assert.assertTrue(getElement(new By.ByName(welcome_message)).isDisplayed());
    }

    public void selectNewToQustodioOption() {
        clickOnElement(new By.ByName(new_to_qustodio_option));
    }

    public void clickOnNextButton() {
        clickOnElement(new By.ByName(next_button));
    }

    public void selectAlreadyUserOption() {
        clickOnElement(new By.ByName(already_user_option));
    }
}