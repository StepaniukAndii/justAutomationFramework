package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends BasePage {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEatStreetCom() {
        return driver.findElement(By.xpath("//a[contains(text(),'geteatstreet.com')]"));
    }
}