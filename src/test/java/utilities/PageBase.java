package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class PageBase {

    public WebDriver driver;

    public PageBase() throws IOException {
        this.driver = ApplicationManager.getDriver();
    }

    public WebElement getElement(By element) {
        return driver.findElement(element);
    }

    public void clickOnElement(By element) {
        driver.findElement(element).click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void completeField(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    public void completeField(WebElement element, String text) {
        element.sendKeys(text);
    }

    public List<WebElement> getListOfElements(By locator) {
        return driver.findElements(locator);
    }

    public void selectElementFromCombo(WebElement element_to_select) {

    }
}
