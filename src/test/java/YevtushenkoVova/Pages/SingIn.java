package YevtushenkoVova.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingIn extends BasePage {

    public SingIn(WebDriver driver) {
        super(driver);
    }
    public WebElement inputEmail() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }
    public WebElement inputPassword() {

        return driver.findElement(By.xpath("//input[@id='password']"));
    }
    public WebElement getSignInBTN() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }
    public WebElement linkSingUp(){
        return driver.findElement(By.xpath("//a[@ng-click='signinCtrl.recordCreateAccount()']"));
    }
    public WebElement emailErrorRequired(){
        return  driver.findElement(By.xpath("//div[@id='email-validation-tag']"));
    }
}
