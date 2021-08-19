package testPreplyDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleAuth extends BasePage {
    public GoogleAuth(WebDriver driver) {
        super(driver);
    }

    public WebElement googleEmail() {
        return findElementByXpath("//input [@type='email']");
    }

    public WebElement next() {
        return findElementByXpath("//button [@jscontroller='soHxf']");
    }

    public WebElement googlePassword() {
        return findElementByXpath("//input [@type='password']");
    }
}
