package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RestPage extends BasePage {
    public RestPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRestNearYou() {
        return driver.findElement(By.xpath("//p[contains(text(),'restaurants near you')]"));
    }

    public List<WebElement> getAllPageRest() {
        return driver.findElements(By.xpath("//ul[contains(@class,'pagination__pages')]/li"));
    }

    public void getLastPageRest() {
        if (getAllPageRest().size() > 0) {
            getAllPageRest().get(getAllPageRest().size() - 1).click();
        }
    }

    public List<WebElement> getAllRest() {
        return driver.findElements(By.xpath("//ul[@id='all-rests']/li"));
    }

    public void getThirdFromTheEndRest() {
        if (getAllRest().size() > 0) {
            getAllRest().get(getAllRest().size() - 3).click();
        }
    }

    public WebElement getJapaneseMsg() {
        return driver.findElement(By.xpath("//h1[contains(text(),'Japanese Food Delivery & Takeout in Las Vegas')]"));
    }
}