package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;

public class NashiMagazinyPage extends BasePage {
    public boolean isDisplayedNashiMagazinyPage(){
        return findElementByXpath("//div[@class='header-top']//a[contains(text(), 'Наші магазини')]").isDisplayed();
    }

    public NashiMagazinyPage(WebDriver driver) {
        super(driver);
    }
}
