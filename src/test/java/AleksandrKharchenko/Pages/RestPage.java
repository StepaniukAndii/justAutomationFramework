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
        return findElementsByXpath("//ul[@id='all-rests']/li");
    }

    public void getThirdFromTheEndRest() {
        if (getAllRest().size() > 0) {
            getAllRest().get(getAllRest().size() - 3).click();
        }
    }

    public WebElement getJapaneseMsg() {
        return driver.findElement(By.xpath("//h1[contains(text(),'Japanese Food Delivery & Takeout in Las Vegas')]"));
    }

    public WebElement getTakeoutRadioBtn() {
        return driver.findElement(By.xpath("//input[@id='filters-checkbox-takeout']"));
    }

    public WebElement getItalianFoodLabel() {
        return driver.findElements(By.xpath("//label[@for='filter-cuisine-Italian Food']")).get(0);
    }

    public WebElement getSpanItalianFood() {
        return driver.findElement(By.xpath("//span[contains(@class,'active_filter')]"));
    }

    public WebElement getDeliveryMsg() {
        return driver.findElement(By.xpath("//p[contains(text(),'offering delivery only')]"));
    }

    public WebElement getIndianFoodLabel() {
        return driver.findElement(By.xpath("//label[@for='filter-cuisine-Indian Food' and @class='checkbox-input']"));
    }

    public WebElement getSpanIndianFood() {
        return driver.findElement(By.xpath("//span[contains(text(),'Indian Food')]"));
    }

    public boolean getTextInLosAngelesRestIsDisplayed() {
        return findElementByXpath("//h1[contains(text(),'Los Angeles Restaurants')]").isDisplayed();
    }
}