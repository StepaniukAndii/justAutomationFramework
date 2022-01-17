package YevtushenkoVova.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super (driver);
    }
    public WebElement clickButtonGotIt() {
        return findElement("//button[@class='btn']");
    }
    public WebElement openPageSingIn(){
        return findElement("//a[@id='menu-signin']");
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
    public WebElement getMyAccound(){
        return driver.findElement(By.xpath("//a[@id='menu-my-account']"));
    }
}

