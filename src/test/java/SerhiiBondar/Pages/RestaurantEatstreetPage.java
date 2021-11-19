package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RestaurantEatstreetPage extends BasePage {

    public RestaurantEatstreetPage(WebDriver driver) {
        super(driver);

    }
    public WebElement burgersInAtlanta(){
        return driver.findElement(By.xpath("//h1[contains(text(),'in Atlanta')]"));

    }
    public WebElement getSortOptions(){
        return driver.findElement(By.xpath("//span[contains(text(),'Sort by')]"));

    }
    public WebElement getSortByDeliveryFee(){
        return driver.findElement(By.xpath("//button[contains(text(),'Delivery Fee')]"));

    }
    public WebElement getDeliveryFeeBtn(){
        return driver.findElement(By.xpath("//button[@aria-label='delivery_fee']"));

    }
    public WebElement getRestListHeader(){
        return driver.findElement(By.xpath("//h1[contains(@class,'restaurants-list_header')]"));

    }
    public List<WebElement> getRestListContainer(){
        return driver.findElements(By.xpath("//div[@id='container']"));

    }
    public WebElement getAsianFoodBtn(){
        return driver.findElement(By.xpath("//label[contains(text(),'Asian Food')]"));

    }
    public WebElement getBBQFoodBtn(){
        return driver.findElement(By.xpath("//label[contains(text(),'BBQ')]"));

    }
}
