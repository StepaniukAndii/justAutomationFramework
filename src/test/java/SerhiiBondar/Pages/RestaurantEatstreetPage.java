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
        return driver.findElements(By.xpath("//span[contains(@class,'active_filter')]"));

    }
    public WebElement getAsianFoodBtn(){
        return driver.findElement(By.xpath("//label[contains(text(),'Asian Food')]"));

    }
    public WebElement getBBQFoodBtn(){
        return driver.findElement(By.xpath("//label[contains(text(),'BBQ')]"));

    }
    public WebElement getFilterRating4PlusBtn(){
        return driver.findElement(By.xpath("//label[@for='filter-Rating 4+']"));

    }
    public List<WebElement> getRestList(){
        return driver.findElements(By.xpath("//li[@class='li li--rest-list border-bottom-last-1 ng-scope ng-isolate-scope']"));

    }
    public List<WebElement> restRatings(){
        return driver.findElements(By.xpath("//span[contains(@class,'ratings-has-reviews')]"));

    }
    public WebElement reviewQuantity(){
        return driver.findElement(By.xpath("//div[contains(text(),'Review')]"));

    }
    public WebElement getHoursLink(){
        return driver.findElement(By.xpath("//label[@for='info']"));

    }
    public WebElement workingHoursTable(){
        return driver.findElement(By.xpath("//table[contains(@class,'table--hours')]"));

    }
    public WebElement getDeliveryBtn(){
        return driver.findElement(By.xpath("//label[@id='delivery-checkbox']"));

    }
    public WebElement getTakeOutBtn(){
        return driver.findElement(By.xpath("//label[@id='takeout-checkbox']"));

    }
    public WebElement getDeliveryRadioBtn(){
        return driver.findElement(By.xpath("//input[@id='filters-checkbox-delivery']"));

    }
    public WebElement getTakeoutRadioBtn(){
        return driver.findElement(By.xpath("//input[@id='filters-checkbox-takeout']"));

    }
    public List<WebElement> RestInfoList(){
        return driver.findElements(By.xpath("//li[contains(@class,'restaurant__info__list__item')]"));

    }
    public WebElement getStartGroupOrderBtn(){
        return driver.findElement(By.xpath("//a[contains(@class,'btn--group-order')]"));

    }
    public WebElement groupOrderModalWindow(){
        return driver.findElement(By.xpath("//form[contains(@name,'form')]"));

    }

}
