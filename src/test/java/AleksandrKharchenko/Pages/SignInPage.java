package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void navigateSignIn() {
        driver.get("https://eatstreet.com/signin");
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement getSignInBtn() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }

    public WebElement getErrorMSG() {
        return driver.findElement(By.xpath("//span[contains(text(),'is incorrect.')]"));
    }

    public void closeModal() {
        driver.findElement(By.xpath("//button[contains(text(),'Got it')]")).click();
    }

    public WebElement getSignUpLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
    }

    public WebElement getEmailRequiredMSG() {
        return driver.findElement(By.xpath("//div[@id='email-validation-tag']"));
    }
}