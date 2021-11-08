package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestPage extends BasePage {
    public RestPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRestNearYou() {
        return driver.findElement(By.xpath("//p[contains(text(),'restaurants near you')]"));
    }
}