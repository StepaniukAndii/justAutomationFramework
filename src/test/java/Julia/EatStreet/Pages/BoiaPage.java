package Julia.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoiaPage extends BasePage {


    public BoiaPage(WebDriver driver) {
        super(driver);
    }

    public WebElement enterYourSite() {
        return driver.findElement(By.xpath("//input[@class='form-control']"));
    }
}
