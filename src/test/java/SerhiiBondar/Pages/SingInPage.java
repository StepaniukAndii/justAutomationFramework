package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingInPage extends BasePage {

    public SingInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailField(){
        return driver.findElement(By.xpath("//input[@id='Email']"));
    }

    public WebElement getPasswordField(){ return driver.findElement(By.xpath("//input[@class='password']"));}

    public WebElement getLogInBtn(){
        return driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
    }

    public WebElement invalidLogInMessage(){
        return driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
    }
}
