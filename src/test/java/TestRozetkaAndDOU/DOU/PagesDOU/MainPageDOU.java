package TestRozetkaAndDOU.DOU.PagesDOU;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPageDOU extends BasePage {
    public MainPageDOU(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getContentMenu() {
        return findElementsByXpath("//ul[@class='b-content-menu']/li");
    }
}