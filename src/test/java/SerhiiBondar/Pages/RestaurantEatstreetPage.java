package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestaurantEatstreetPage extends BasePage {

    public RestaurantEatstreetPage(WebDriver driver) {
        super(driver);

    }
    public WebElement burgersInAtlanta(){
        return driver.findElement(By.xpath("//h1[contains(text(),'in Atlanta')]"));

    }
}
