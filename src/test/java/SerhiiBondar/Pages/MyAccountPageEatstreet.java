package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPageEatstreet extends BasePage {

    public MyAccountPageEatstreet(WebDriver driver) {
        super(driver);

    }
    public WebElement getDeactivateAccountBtn(){
        return driver.findElement(By.xpath("//a[contains (text(),'Deactivate Account')]"));

    }
    public WebElement getDeactivationAccountBtnYes(){
        return driver.findElement(By.xpath("//a[@id='confirm-modal-btn']"));

    }

    public WebElement getOkayBtn() {
        return driver.findElement(By.xpath("//a[@id='confirm-modal-btn']"));

    }
    public WebElement getChangePasswordBtn(){
        return driver.findElement(By.xpath("//a[@id='change-password']"));

    }
    public WebElement getCurrentPasswordField(){
        return driver.findElement(By.xpath("//input[@id='currentPassword']"));

    }
    public WebElement getNewPasswordField(){
        return driver.findElement(By.xpath("//input[@id='newPassword']"));

    }
    public WebElement getConfirmNewPasswordField(){
        return driver.findElement(By.xpath("//input[@id='newPasswordConfirm']"));

    }
    public WebElement getUpdatePasswordBtn(){
        return driver.findElement(By.xpath("//input[@id='confirm-modal-btn']"));

    }
    public WebElement getSignOutBtn(){
        return driver.findElement(By.xpath("//a[@id='signout']"));

    }
    public WebElement getEditInfoBtn(){
        return driver.findElement(By.xpath("//a[@id='edit-info']"));

    }
    public WebElement getFirstNameField(){
        return driver.findElement(By.xpath("//input[@name='firstName']"));

    }
    public WebElement getLastNameField(){
        return driver.findElement(By.xpath("//input[@name='lastName']"));

    }
    public WebElement getPhoneNumberField(){
        return driver.findElement(By.xpath("//input[@name='phoneNumber']"));

    }
    public WebElement getSaveBtn(){
        return driver.findElement(By.xpath("//input[@id='confirm-modal-btn']"));

    }
    public WebElement getUserNameDisplayed(){
        return driver.findElement(By.xpath("//h1[@id='user-name-displayed']"));

    }
}
