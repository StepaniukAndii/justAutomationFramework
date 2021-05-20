package denisFoxtrotTest.mainTest.authTestPageObject.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getUserNameField(){
        return driver.findElement(By.name("user-name"));
    }

    public WebElement getPasswordField(){
        return driver.findElement(By.name("password"));
    }

    public WebElement getLogin(){
        return driver.findElement(By.name("login-button"));
    }
}
