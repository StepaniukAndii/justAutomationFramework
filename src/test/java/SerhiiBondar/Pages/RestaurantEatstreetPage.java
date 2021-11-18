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
}
