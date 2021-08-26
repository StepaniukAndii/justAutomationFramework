package testPreplyDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public WebElement messagesBtn() {
        return findElementByXpath("//a [@data-qa-id='messages-link']");
    }

    public WebElement myLessonsBtn() {
        return findElementByXpath("//a [@data-qa-id='dashboard-lessons-link']");
    }

    public WebElement settingsProfileBtn() {
        return findElementByXpath("//a [@data-qa-id='dashboard-settings-link']");
    }

    public List<WebElement> settingsSections() {
        return findElementsByXpath("//a [@class='side-nav__item m']");
    }
    //Account
    public WebElement accountEditPhoto() {
        return findElementByXpath("//button [@class='edit-picture']");
    }

    public WebElement accountUploadPhoto() {
        return findElementByXpath("//a [@class='btn btn--block btn--success-i']");
    }

    public List<WebElement> accountUserName() {
        return findElementsByXpath("//input [@class='input']");
    }

    public WebElement accountPhone() {
        return findElementByXpath("//input [@class=' form-control']");
    }

    public WebElement accountTimezoneSelect() {
        return findElementByXpath("//select [@id='timezone']");
    }

    public List<WebElement> accountSocials() {
        return findElementsByXpath("//div [@class='social-wrap']");
    }

    public WebElement accountSaveBtn() {
        return findElementByXpath("//button [@class='btn btn--success btn--full-width-mobile']");
    }

    public WebElement accountDeleteAccBtn() {
        return findElementByXpath("//button [@data-qa-id='delete-acc-btn']");
    }
    //email
    public WebElement emailField() {
        return findElementByXpath("//input [@id='email']");
    }
    //password
    public List<WebElement> passwordChange() {
        return findElementsByXpath("//input [@type='password']");
    }
    //autoconfirmation
    public List<WebElement> autoConfirmRadioBtns() {
        return findElementsByXpath("//span [@class='radio__label']");
    }

    public WebElement autoConfirmationSaveBtn() {
        return findElementByXpath("//button [@class='btn btn--success']");
    }
    //Calendar
    public WebElement connectGoogleCalendarBtn() {
        return findElementByXpath("//a [@class='goo-calendar__button goo-calendar__button--block']");
    }
    //Notifications
    public List<WebElement> notificationsCheckboxes() {
        return findElementsByXpath("//span [@class='checkbox__label checkbox__label--with-text']");
    }

    public WebElement notificationsUnsubscribe() {
        return findElementByXpath("//button [@class='btn btn--danger btn--full-width-mobile']");
    }
}
