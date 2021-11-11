package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverPage extends BasePage {
    public DriverPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getApplyInYourCityBtn() {
        return driver.findElement(By.xpath("//select[@onchange='location = this.value;']"));
    }

    public WebElement getMadisonInCity() {
        return driver.findElement(By.xpath("//option[contains(text(), 'Madison, WI.')]"));
    }
}