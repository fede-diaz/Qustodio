package pages;

import org.openqa.selenium.By;
import utilities.PageBase;

import java.io.IOException;

public class EnterDeviceNamePage extends PageBase {

    private final String device_name_field = "//*[@LocalizedControlType='edit']";
    private final String next_button = "Next";

    public EnterDeviceNamePage() throws IOException {}

    public void completeDeviceName(String device_name) {
        completeField(new By.ByXPath(device_name_field), device_name);
    }

    public void clickOnNextButton() {
        clickOnElement(new By.ByName(next_button));
    }
}
