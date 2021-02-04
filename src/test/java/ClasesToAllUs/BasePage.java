package ClasesToAllUs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(String locator) {
        return driver.findElement (By.xpath (locator));
    }
    public List<WebElement> getElements(String locator) {
        return driver.findElements(By.xpath(locator));
    }
}
