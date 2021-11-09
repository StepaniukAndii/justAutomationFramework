package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTheAppPage extends BasePage {
    public GetTheAppPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAndroidRadioBtn() {
        return driver.findElement(By.xpath("//label[@for='radio-android']"));
    }

    public WebElement getMobileNumberField() {
        return driver.findElement(By.xpath("//input[@id='mobile-number']"));
    }

    public WebElement getTextAndroidLinkBtn() {
        return driver.findElement(By.xpath("//a[contains(@class,'btn-text-link')]"));
    }

    public WebElement getPopupSmsSent() {
        return driver.findElement(By.xpath("//div[contains(text(),'within a few minutes.')]"));
    }

    public WebElement getReceiveSmsNotifications() {
        return driver.findElement(By.xpath("//label[@class='checkbox-input']"));
    }
}
