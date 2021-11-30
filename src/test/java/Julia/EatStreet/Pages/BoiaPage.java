package Julia.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BoiaPage extends BasePage {


    public WebElement enterSubmit() {
        return driver.findElement(By.xpath("//div[@class='actions']/input"));
    }

    public BoiaPage(WebDriver driver) {
        super(driver);
    }

    public WebElement enterYourSite() {
        return driver.findElement(By.xpath("//input[@class='form-control']"));
    }

    public WebElement clickSubmit() {
        return driver.findElement(By.xpath("//span[@class='input-group-btn']"));
    }

    public List<WebElement> enterFieldBoiaSite() {
        return driver.findElements(By.xpath("//div[@class='input']/input"));
    }
}
