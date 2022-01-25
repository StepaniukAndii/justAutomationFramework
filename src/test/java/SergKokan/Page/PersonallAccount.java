package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;

public class PersonallAccount extends BasePage {

    public PersonallAccount(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayedPersonallAccount() {
        return findElementByXpath("//div[@class='container popUpOpen modal']//div[@class='wrap-content']").isDisplayed();
    }
}
