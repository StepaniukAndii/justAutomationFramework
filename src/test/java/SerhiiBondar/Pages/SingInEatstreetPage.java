package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingInEatstreetPage extends BasePage {
    public SingInEatstreetPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getEmailField(){
        return driver.findElement(By.xpath("//input[@id='email']"));
    }
    public WebElement getPasswordField(){
        return driver.findElement(By.xpath("//input[@id='password']"));
    }
    public WebElement getSignInBtn(){
        return driver.findElement(By.xpath("//button[@id='signin']"));

    }
    public WebElement incorrectLogInInformation(){
        return driver.findElement(By.xpath("//span[contains(@class,'alert')]"));
    }
    public WebElement enterValidEmailAddressText(){
        return driver.findElement(By.xpath("//span[contains(text(), 'valid')]"));
    }
    public WebElement getSignUpLine(){
        return driver.findElement(By.xpath("//a[@ng-click='signinCtrl.recordCreateAccount()']"));
    }
    public WebElement getResetPassword(){
        return driver.findElement(By.xpath("//span[@id='forgot-password']"));
    }
    public WebElement getEmailResetPassword(){
        return driver.findElement(By.xpath("//div[@class='modal-content']//input[@name='email']"));
    }
    public WebElement getResetPasswordBtn(){
        return driver.findElement(By.xpath("//input[@id='confirm-modal-btn']"));
    }
    public WebElement getTextOnModalResetPasswordWindow(){
        return driver.findElement(By.xpath("//div[contains(text(), 'have been sent')]"));
    }



}
