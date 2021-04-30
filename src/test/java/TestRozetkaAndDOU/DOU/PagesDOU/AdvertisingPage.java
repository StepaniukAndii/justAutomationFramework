package TestRozetkaAndDOU.DOU.PagesDOU;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertisingPage extends BasePage {
    public AdvertisingPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAdvertising() {
        return getElement("//div[@class='banner-fp']");
    }

    public WebElement getAdvertisingHeader() {
        return getElement("//div[@id='topinfo']/a[1]");
    }
}