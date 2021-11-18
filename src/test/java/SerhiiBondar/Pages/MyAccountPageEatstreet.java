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
    public WebElement getAddAddressBtn(){
        return driver.findElement(By.xpath("//a[@id='add-new-address']"));

    }
    public WebElement getStreetAddressField(){
        return driver.findElement(By.xpath("//input[@id='streetAddress']"));

    }
    public WebElement getCityField(){
        return driver.findElement(By.xpath("//input[@id='city']"));

    }
    public WebElement getStateField(){
        return driver.findElement(By.xpath("//input[@id='state']"));

    }
    public WebElement getZipField(){
        return driver.findElement(By.xpath("//input[@id='zip']"));

    }
    public WebElement getCityAndStateString(){
        return  driver.findElement(By.xpath("//span[@name='cityAndState']"));

    }
    public WebElement getDeleteAddressBtn(){
        return driver.findElement(By.xpath("//a[@id='delete-address']"));

    }
    public WebElement getEditAddressBtn(){
        return  driver.findElement(By.xpath("//a[@id='edit-address']"));

    }
    public WebElement getFullStreetAddressString(){
        return  driver.findElement(By.xpath("//span[@id='address-display']"));

    }
    public WebElement getAddNewCardBtn(){
        return driver.findElement(By.xpath("//a[@id='add-credit-card']"));

    }
    public WebElement getCardErrorModalWindow(){
        return driver.findElement(By.xpath("//div[contains(text(),'Card Error')]"));

    }
    public WebElement getNameOfCardholderField(){
        return driver.findElement(By.xpath("//input[@id='customerName']"));

    }
    public WebElement getCreditCardNumberField(){
        return driver.findElement(By.xpath("//input[@id='cardNum']"));

    }
    public WebElement getCvvField(){
        return driver.findElement(By.xpath("//input[@id='cvv']"));

    }
    public WebElement getExpDateField(){
        return driver.findElement(By.xpath("//input[@id='expiry']"));

    }
    public WebElement getAddressOnCardField(){
        return driver.findElement(By.xpath("//input[@id='address']"));

    }
    public WebElement getCardNickNameField(){
        return driver.findElement(By.xpath("//input[@id='name']"));

    }
    public WebElement getOkayGreenBtn(){
        return driver.findElement(By.xpath("//input[@id='confirm-modal-btn']"));

    }
    public WebElement getStreetAddressString(){
        return driver.findElement(By.xpath("//span[@id='address-display']"));

    }
    public WebElement getExpDateErrorModalWindow(){
        return driver.findElement(By.xpath("//div[contains(text(),'credit card is expired')]"));

    }


}
