package Julia.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class StripePage extends BasePage {

    public StripePage(WebDriver driver) {
        super(driver);
    }

    public WebElement linkStripeServiseAgreement() {
        return findElementByXpath("//a[contains(text(),'Stripe Services Agreement')]");
    }

    public List<WebElement> btnSupport() {
        return findElementsByXpath("//ul[@class='external']/li");
    }
    public void goToTheSecondWindowTab(WebDriver driver, Integer seconds) {
        waitForNewTabOpened(seconds);
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void waitForNewTabOpened(Integer seconds) {
        for (int a = 0; a < seconds * 2; a++) {
            ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
            if (tabs2.size() > 1) {
                break;
            }
        }
    }

    public List<WebElement> btnGetStarted() {
        return findElementsByXpath("//div[@class='PressableCore-base Box-root']/a/div");
    }

    public WebElement stringPayment() {
        return findElementByXpath("//div[@class='Box-root Padding-bottom--24']/h1");
    }
}

