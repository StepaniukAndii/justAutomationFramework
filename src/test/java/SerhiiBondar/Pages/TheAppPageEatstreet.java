package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TheAppPageEatstreet extends BasePage {
    public TheAppPageEatstreet(WebDriver driver) {
        super(driver);

    }
    public WebElement getAndroidBtn(){
        return driver.findElement(By.xpath("//label[contains(@class,'android')]"));

    }
    public WebElement getCheckBoxReceiveSms(){
        return driver.findElement(By.xpath("//label[@class='checkbox-input']"));

    }
    public WebElement getMobileNumberField(){
        return driver.findElement(By.xpath("//input[@id='mobile-number']"));

    }
    public WebElement getTextLinkOrangeBtn(){
        return driver.findElement(By.xpath("//a[contains(@class,'btn--orange')]"));

    }
    public WebElement SmsNotificationModalWindow(){
        return driver.findElement(By.xpath("//div[@class='modal-content']"));

    }
    public WebElement SmsNotification(){
        return driver.findElement(By.xpath("//div[contains(@class,'modal-header')]"));

    }
    public WebElement SmsActionInformation(){
        return driver.findElement(By.xpath("//div[contains(@class,'modal-body')]"));

    }
    public WebElement getOkayBtn(){
        return driver.findElement(By.xpath("//a[@id='confirm-modal-btn']"));

    }

}
