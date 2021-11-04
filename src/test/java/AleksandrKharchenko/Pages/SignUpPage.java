package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailFieldSignUp() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement getPasswordFieldSignUp() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement getPasswordAgainFieldSignUp() {
        return driver.findElement(By.xpath("//input[@id='passwordAgain']"));
    }

    public WebElement getSignUpBtn() {
        return driver.findElement(By.xpath("//button[@id='signup']"));
    }

    public WebElement getMyAccountLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
    }
}
