package RozetkaSergey;

import ClasesToAllUs.BasePage;
import TestAmazon.Pages.HomePage.HomePageAmazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageVijar extends BasePage {

    public HomePageVijar(WebDriver driver) {
        super(driver);
    }
    public void enterToGoogle(String site) {
        driver.get(site);
    }
    public WebElement googleField() {
        return getElement("//input[@class='gLFyf gsfi']");
    }
}
