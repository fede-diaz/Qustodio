package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.PageBase;

import java.io.IOException;

public class AllDonePage extends PageBase {

    private final String all_done_message = "All done!";
    private final String confirmation_message = "This device is now protected by Qustodio.";

    public AllDonePage() throws IOException {
    }

    public void verifyConfirmationMessage() {
        Assert.assertTrue(getElement(new By.ByName(all_done_message)).isDisplayed());
        Assert.assertTrue(getElement(new By.ByName(confirmation_message)).isDisplayed());
    }
}
