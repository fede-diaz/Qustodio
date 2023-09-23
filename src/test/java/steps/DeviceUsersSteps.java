package steps;

import cucumber.api.java.en.And;
import pages.DeviceUsersPage;

import java.io.IOException;

public class DeviceUsersSteps {

    DeviceUsersPage deviceUsersPage = new DeviceUsersPage();

    public DeviceUsersSteps() throws IOException {
    }

    @And("enter {string} as device user name")
    public void completeDeviceUserName(String device_user_name) {
        deviceUsersPage.completeDeviceUserName(device_user_name);
    }

    @And("selects year of birth")
    public void selectsYearBirth() {
        deviceUsersPage.selectsYearBirth();
    }

    @And("selects gender")
    public void selectGender() {
        deviceUsersPage.selectGender();
    }

    @And("clicks on Next button in device users page")
    public void clickOnNextButton() {
        deviceUsersPage.clickOnNextButton();
    }
}
