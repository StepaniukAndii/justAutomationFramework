package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEditYourInfoBtn() {
        return driver.findElement(By.xpath("//a[@id='edit-info']"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.xpath("//input[@id='firstName']"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.xpath("//input[@id='lastName']"));
    }

    public WebElement getEmailAddress() {
        return driver.findElement(By.xpath("//input[@id='emailAddress']"));
    }

    public WebElement getPhoneNumber() {
        return driver.findElement(By.xpath("//input[@id='phoneNumber']"));
    }

    public WebElement getSaveBtn() {
        return driver.findElement(By.xpath("//input[@id='confirm-modal-btn']"));
    }

    public WebElement getHeadingName() {
        return driver.findElement(By.xpath("//h1[contains(text(),'Jack Daniels')]"));
    }

    public WebElement getChangePasswordBtn() {
        return driver.findElement(By.xpath("//a[@id='change-password']"));
    }

    public WebElement getCurrentPasswordLink() {
        return driver.findElement(By.xpath("//input[@id='currentPassword']"));
    }

    public WebElement getNewPasswordField() {
        return driver.findElement(By.xpath("//input[@id='newPassword']"));
    }

    public WebElement getConfirmNewPasswordField() {
        return driver.findElement(By.xpath("//input[@id='newPasswordConfirm']"));
    }

    public WebElement getUpdatePasswordBtn() {
        return driver.findElement(By.xpath("//input[@id='confirm-modal-btn']"));
    }

    public WebElement getSignOutBtn() {
        return driver.findElement(By.xpath("//a[@id='signout']"));
    }

    public WebElement getDeactivateAccountBtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'Deactivate Account')]"));
    }

    public WebElement getAccountDeactivationYesBtn() {
        return driver.findElement(By.xpath("//a[@id='confirm-modal-btn']"));
    }

    public WebElement getInfoAboutDeactivation() {
        return driver.findElement(By.xpath("//div[contains(text(),'has been deactivated.')]"));
    }
}