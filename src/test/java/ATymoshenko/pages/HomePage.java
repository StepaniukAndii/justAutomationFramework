package ATymoshenko.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePage extends BasePage {


    public List<WebElement> addANewAddressWindow(){
        return driver.findElements(By.xpath("//div[@class='modal-body ng-scope']"));
    }

    public List<WebElement> getListRequired() {
        return driver.findElements(By.xpath("//div[@ng-if='validationErrors[name]']"));
    }

    public WebElement addNewAddressBtn(){
        return driver.findElement(By.xpath("//a[contains(text(),'+ Add New Address')]"));
    }

    public WebElement addCurrentPasswordField() {
        return driver.findElement(By.xpath("//input[@id='currentPassword']"));
    }

    ;

    public WebElement addSignOutBtn() {
        return driver.findElement(By.xpath("//a[@id='signout']"));
    }

    public WebElement addSignInBtnOnHeader() {
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchAttempt() {
        return driver.findElements(By.xpath("//button[@class='btn']"));
    }

    public WebElement getGoItBtn() {
        return driver.findElement(By.xpath("//button[contains(text(),'Got it')]"));
    }

    public void checkAndClosePopUpWindows() {
        if (getSearchAttempt().size() > 0) {
            sleep(2);
            getSearchAttempt().get(0).click();
        }
    }

    public WebElement enterYourAddressField() {
        return driver.findElement(By.xpath("//input[@id='input-food-search']"));
    }

    public void closeModalIfExist() {
        if (driver.findElements(By.xpath("//a[@id='enter-address-btn']")).size() > 0) {
            driver.findElements(By.xpath("//a[@id='enter-address-btn']")).get(0).click();
        }
    }

    public WebElement getGetFedBtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'Get Fed')]"));
    }

    public WebElement addSignUpLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
    }

    public WebElement addEmailField() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement addPasswordField() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement addPasswordAgainField() {
        return driver.findElement(By.xpath("//input[@id='passwordAgain']"));
    }

    public WebElement addSignUpBtnOnPopUpWindow() {
        return driver.findElement(By.xpath("//button[@id='signup']"));
    }

    public WebElement myAccountIcon() {
        return driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
    }

    public WebElement addSignInBtnOnPopUpWindow() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }

    public WebElement addChangePasswordBtnOnMyAccountPage() {
        return driver.findElement(By.xpath("//a[@id='change-password']"));
    }

    public WebElement addNewPasswordField() {
        return driver.findElement(By.xpath("//input[@id='newPassword']"));
    }

    public WebElement addConfirmNewPasswordField() {
        return driver.findElement(By.xpath("//input[@id='newPasswordConfirm']"));
    }

    public WebElement addUpdatePasswordBtn() {
        return driver.findElement(By.xpath("//input[@id='confirm-modal-btn']"));
    }

    public WebElement addEditYourInfoBtn() {
        return driver.findElement(By.xpath("//a[@id='edit-info']"));
    }

    public WebElement addFirstNameFieldInChangeAccountInfoWindow() {
        return driver.findElement(By.xpath("//input[@id='firstName']"));
    }

    public WebElement addLastNameFieldInChangeAccountInfoWindow() {
        return driver.findElement(By.xpath("//input[@id='lastName']"));

    }

    public WebElement addPhoneNumberFieldInChangeAccountInfoWindow() {
        return driver.findElement(By.xpath("//input[@id='phoneNumber']"));
    }

    public WebElement addSaveBtnInChangeAccountInfoWindow() {
        return driver.findElement(By.xpath("//input[@id='confirm-modal-btn']"));
    }

    public WebElement addAboutUsBtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
    }

    public WebElement addContactUsBtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
    }

    public WebElement addCareersBtn() {
        return  driver.findElement(By.xpath("//a[contains(text(),'Careers')]"));
    }

    public WebElement addBecomeADriverBtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'Become a Driver!')]"));
    }

    public WebElement addforCustomersBtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'For Customers')]"));
    }

    public WebElement addAccessibilityStatementBtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'Accessibility Statement')]"));
    }

    public WebElement addPrivacyPolicyBtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));
    }

    public WebElement addTermsOfUseBtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'Terms of Use')]"));
    }

    public WebElement addRestaurantTermsBtnInFooter() {
        return driver.findElement(By.xpath("//a[contains(text(),'Restaurant Terms')]"));
    }

    public WebElement addStreetAddressField() {
        return driver.findElement(By.xpath("//input[@id='streetAddress']"));
    }

    public WebElement addAptSuiteField() {
        return driver.findElement(By.xpath("//input[@id='aptNumber']"));
    }

    public WebElement addBuildingNameField() {
        return driver.findElement(By.xpath("//input[@id='buildingName']"));
    }

    public WebElement addCityField() {
        return driver.findElement(By.xpath("//input[@id='city']"));
    }

    public WebElement addAddressLabelField() {
        return driver.findElement(By.xpath("//input[@id='name']"));
    }

    public WebElement addSaveBtnInAddANewAddressWindow() {
        return driver.findElement(By.xpath("//input[@id='confirm-modal-btn']"));
    }

    public WebElement addStateField() {
        return driver.findElement(By.xpath("//input[@id='state']"));
    }

    public WebElement addZipField() {
        return driver.findElement(By.xpath("//input[@id='zip']"));
    }

    public WebElement addRestAnyCity() {
        return driver.findElement(By.xpath("//a[contains(text(),'Phoenix, AZ')]"));
    }

    public List<WebElement> addAnyFoodInAnyCity() {
        return driver.findElements(By.xpath("//div[@class='cuisine-types__item__image-container']"));
    }

    public WebElement addOpenNowBtnInRestMenu() {
        return driver.findElement(By.xpath("//label[contains(text(),'Open Now')]"));
    }

    public WebElement addNewCardBtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'+ Add New Card')]"));
    }

    public WebElement addNameOfCardholderField() {
        return driver.findElement(By.xpath("//input[@id='customerName']"));
    }

    public WebElement addOkayBtnInAddNewCard() {
        return driver.findElement(By.xpath("//input[@ng-value='confirmText']"));
    }

    public WebElement creditCardNumberIsRequiredMessage() {
        return driver.findElement(By.xpath("//div[contains(text(),'Credit card number is required.')]"));
    }

    public WebElement nameOnCreditCardIsRequiredMessege() {
        return driver.findElement(By.xpath("//div[contains(text(),'Name on credit card is required.')]"));
    }

    public WebElement addCardNumberField() {
        return driver.findElement(By.xpath("//input[@id='cardNum']"));
    }

    public WebElement creditCardCVVIsRequiredMessage() {
        return driver.findElement(By.xpath("//div[contains(text(),'CVV is required.')]"));
    }

    public WebElement addCVVField() {
        return driver.findElement(By.xpath("//input[@id='cvv']"));
    }

    public WebElement cardExpirationDateIsRequiredMessage() {
        return driver.findElement(By.xpath("//div[contains(text(),'Card expiration date is required.')]"));
    }

    public WebElement addExpDateOnCardField() {
        return driver.findElement(By.xpath("//input[@id='expiry']"));
    }

    public WebElement anAddressIsRequiredForThisCreditCardMessage() {
        return driver.findElement(By.xpath("//div[contains(text(),'An address is required for this credit card.')]"));
    }

    public WebElement addAddressOnCardField() {
        return driver.findElement(By.xpath("//input[@id='address']"));
    }

    public WebElement aZipCodeIsRequiredForThisCreditCardMessage() {
        return driver.findElement(By.xpath("//div[contains(text(),'A Zip Code is required for this credit card.')]"));
    }

    public WebElement theCardThatWasEnteredIsInvalidMessage() {
        return driver.findElement(By.xpath("//div[@class='modal-body ng-binding']"));
    }

    public WebElement addDeactevateAccountBtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'Deactivate Account')]"));
    }

    public WebElement addNoBtnInDeactivateAccountWindow() {
        return driver.findElement(By.xpath("//a[@id='cancel-modal-btn']"));
    }

    public WebElement addYesBtnInDeactivateAccountWindow(){
        return driver.findElement(By.xpath("//a[contains(text(),'Yes')]"));
    }

    public WebElement addOkayBtnInDeactivatedAccountWindjw() {
        return driver.findElement(By.xpath("//a[contains(text(),'Okay')]"));
    }

    public List<WebElement> addRequiredMessegeInChangeAccountInfoWindow() {
        return driver.findElements(By.xpath("//div[@class='validation-tag validation-tag-invalid ng-binding ng-scope']"));
    }

    public WebElement addEMailFieldInChangeAccountInfoWindow() {
        return driver.findElement(By.xpath("//input[@id='emailAddress']"));
    }

    public List<WebElement> addInvalidMessegeInChangeAccountInfoWindow() {
        return driver.findElements(By.xpath("//div[@class='validation-tag validation-tag-invalid ng-binding ng-scope']"));
    }
}
