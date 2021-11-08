package KrukIvan.JiraTAF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement clickButtonGotIt() {
        return driver.findElement(By.xpath("//button[@class='btn']"));
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
    public WebElement getErrorMSG(){
        return driver.findElement(By.xpath("//span[contains(text(),'is incorrect.')]"));
    }
}
