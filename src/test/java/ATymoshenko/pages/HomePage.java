package ATymoshenko.pages;

import ClasesToAllUs.BasePage;
import com.fasterxml.jackson.core.JsonParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

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
}