package YevtushenkoVova.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SanFranciskoRes extends BasePage {

    public SanFranciskoRes(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> listFood(){
        return driver.findElements(By.xpath("//div[@class=\"cuisine-types__item__image-container\"]"));
    }
    public WebElement h1(){
        return findElement("//h1[contains(text(),'San Francisco Restaurants')]");
    }

}
