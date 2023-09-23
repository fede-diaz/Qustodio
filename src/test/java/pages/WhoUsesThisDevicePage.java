package pages;

import org.openqa.selenium.By;
import utilities.PageBase;

import java.io.IOException;

public class WhoUsesThisDevicePage extends PageBase {

    private final String add_new_user_option = "Add new User";


    public WhoUsesThisDevicePage() throws IOException {
    }

    public void selectUser(String device_user_name) {
        clickOnElement(new By.ByName(device_user_name));
    }

    public void selectAddNewUserOption() {
        clickOnElement(new By.ByName(add_new_user_option));
    }
}
