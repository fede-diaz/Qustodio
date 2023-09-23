package steps;

import cucumber.api.java.en.And;
import pages.WhoUsesThisDevicePage;

import java.io.IOException;

public class WhoUsesThisDeviceSteps {

    WhoUsesThisDevicePage whoUsesThisDevicePage = new WhoUsesThisDevicePage();

    public WhoUsesThisDeviceSteps() throws IOException {
    }

    @And("selects the user {string}")
    public void selectUser(String device_user_name) {
        whoUsesThisDevicePage.selectUser(device_user_name);
    }

    @And("selects add new user option")
    public void selectAddNewUserOption() {
        whoUsesThisDevicePage.selectAddNewUserOption();
    }
}
