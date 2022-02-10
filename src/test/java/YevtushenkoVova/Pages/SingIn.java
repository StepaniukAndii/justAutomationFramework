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
    public WebElement passwordError(){
        return findElement("//span[@ng-if=\"signinCtrl.loginInvalid\"]");
    }
    public WebElement menuSignin (){
        return findElement("//a[@id=\"menu-signin\"]");
    }
    public WebElement passwordAgain(){
        return findElement("//input[@name=\"passwordAgain\"]");
    }
    public WebElement linkRestPassword(){
        return findElement("//span[@id=\"forgot-password\"]");
    }
    public WebElement windowRest(){
        return findElement("//div[@class=\"modal-header ng-binding modal-header-info\"]");
    }
}
