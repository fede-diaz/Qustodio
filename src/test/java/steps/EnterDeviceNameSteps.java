package steps;

import cucumber.api.java.en.And;
import pages.EnterDeviceNamePage;

import java.io.IOException;

public class EnterDeviceNameSteps {

    EnterDeviceNamePage enterDeviceNamePage = new EnterDeviceNamePage();

    public EnterDeviceNameSteps() throws IOException {

    }

    @And("enter {string} as device name")
    public void completeDeviceName(String device_name) {
        enterDeviceNamePage.completeDeviceName(device_name);
    }

    @And("click on Next button in device name page")
    public void clickOnNextButton() {
        enterDeviceNamePage.clickOnNextButton();
    }
}
