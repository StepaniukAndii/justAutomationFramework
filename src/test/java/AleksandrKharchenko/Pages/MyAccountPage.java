package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.Alert;
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

    public WebElement getAddNewAddressBtn() {
        return driver.findElement(By.xpath("//a[@id='add-new-address']"));
    }

    public WebElement getAptNumberField() {
        return driver.findElement(By.xpath("//input[@id='aptNumber']"));
    }

    public WebElement getBuildingNameField() {
        return driver.findElement(By.xpath("//input[@id='buildingName']"));
    }

    public WebElement getCityField() {
        return driver.findElement(By.xpath("//input[@id='city']"));
    }

    public WebElement getStateField() {
        return driver.findElement(By.xpath("//input[@id='state']"));
    }

    public WebElement getZipField() {
        return driver.findElement(By.xpath("//input[@id='zip']"));
    }

    public WebElement getAddressLabelField() {
        return driver.findElement(By.xpath("//input[@id='name']"));
    }

    public WebElement getSaveBtnAddress() {
        return driver.findElement(By.xpath("//input[@id='confirm-modal-btn']"));
    }

    public WebElement getStreetAddressRequiredMSG() {
        return driver.findElement(By.xpath("//div[@id='streetAddress-validation-tag']"));
    }

    public WebElement getStreetAddressField() {
        return driver.findElement(By.xpath("//input[@id='streetAddress']"));
    }

    public WebElement getCityRequiredMSG() {
        return driver.findElement(By.xpath("//div[@id='city-validation-tag']"));
    }
}