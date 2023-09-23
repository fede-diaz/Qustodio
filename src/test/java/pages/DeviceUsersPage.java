package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.PageBase;

import java.io.IOException;
import java.util.List;

public class DeviceUsersPage extends PageBase {

    private final String device_user_name_field = "//*[@LocalizedControlType='edit']";
    private final String combo_box_elements = "//*[@LocalizedControlType='combo box']";
    private final String next_button = "Next";

    public DeviceUsersPage() throws IOException {
    }

    public void completeDeviceUserName(String device_user_name) {
        completeField(new By.ByXPath(device_user_name_field), device_user_name);
    }

    public void selectsYearBirth() {
        List<WebElement> comboBoxList = getListOfElements(new By.ByXPath(combo_box_elements));
        comboBoxList.get(0).sendKeys(Keys.ARROW_DOWN);
    }

    public void selectGender() {
        List<WebElement> comboBoxList = getListOfElements(new By.ByXPath(combo_box_elements));
        comboBoxList.get(1).sendKeys(Keys.ARROW_DOWN);
    }

    public void clickOnNextButton() {
        clickOnElement(new By.ByName(next_button));
    }
}
