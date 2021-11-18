package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TermsOfUsePage extends BasePage {
    public TermsOfUsePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPrivacyLink() {
        return driver.findElements(By.xpath("//a[@href='https://eatstreet.com/privacy']")).get(0);
    }
}
