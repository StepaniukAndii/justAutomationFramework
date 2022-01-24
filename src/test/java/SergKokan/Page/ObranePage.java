package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;

public class ObranePage extends BasePage {
    public ObranePage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayedObrane() {
        return findElementByXpath("//div[@class='container popUpOpen modal']//div[@class='wrap-content']").isDisplayed();
    }
}
