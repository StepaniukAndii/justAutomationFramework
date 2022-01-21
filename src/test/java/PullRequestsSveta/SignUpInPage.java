package PullRequestsSveta;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpInPage extends BasePage {

    public SignUpInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement signUp() {
        return findElementByXpath("//a[contains(@data-ga-action,'sign')]");
    }

    public WebElement writeYourEmail() {
        return findElementByXpath("//input[@id='email']");
    }

    public WebElement writeYourEmailAgain() {
        return findElementByXpath("//input[@id='confirm']");
    }

    public WebElement writeYourPassword() {
        return findElementByXpath("//input[@id='password']");
    }

    public WebElement writeYourName() {
        return findElementByXpath("//input[@id='displayname']");
    }

    public WebElement monthOfBirthTwo() {
        return findElementByXpath("//option[contains(@value,'10')]");
    }

    public WebElement dayOfBirth() {
        return findElementByXpath("//input[contains(@id, 'day')]");
    }

    public WebElement yearOfBirth() {
        return findElementByXpath("//input[contains(@id, 'year')]");
    }

    public WebElement sex() {
        return findElementByXpath("//label[@for='gender_option_female']//span[@class='Indicator-hjfusp-0 kLhpUW']");
    }

    public WebElement confirm() {
        return findElementByXpath("//span[@class='Indicator-sc-1airx73-0 hmDuGC']");
    }

    public WebElement signUpButton() {
        return findElementByXpath("//button[@class='Button-qlcn5g-0 dmJlSg']");
    }

    public WebElement logIn() {
        return findElementByXpath("//a[contains(@data-tracking, 'log-in')]");
    }

    public WebElement logInUsername() {
        return findElementByXpath("//input[contains(@id, 'login-username')]");
    }

    public WebElement logInPassword() {
        return findElementByXpath("//input[contains(@id, 'login-password')]");
    }

    public WebElement logInButton() {
        return findElementByXpath("//button[contains(@id, 'login-button')]");
    }

    public WebElement ligInWithGoogle() {
        return findElementByXpath("//button[@data-testid='google-login']");
    }

    public WebElement logInWithGoogleEmail() {
        return findElementByXpath("//input[contains(@id, 'identifierId')]");
    }

    public void choiceOfSignUpOption() {
        if (driver.findElements(By.xpath("//a[contains(@data-ga-action,'sign')]")).size() > 0) {
            signUp().click();
        } else {
            driver.findElement(By.xpath("//button[@class='Qt5xfSWikz6CLU8Vobxs jzic9t5dn38QUOYlDka0 XkXPpDRWozMF6G8_GlLQ']")).click();
        }
    }

    public void choiceOfLogInOption() {
        if (driver.findElements(By.xpath("//a[contains(@data-tracking, 'log-in')]")).size() > 0) {
            logIn().click();
        } else {
            driver.findElement(By.xpath("//button[@data-testid='login-button']")).click();
        }
    }

    public boolean checkMessageConfirmYouAreNotARobot() {
        return findElementByXpath("//div[@aria-label='Error indicator' or @aria-label='Значок ошибки']").isDisplayed();
    }

    public boolean checkMessageWrongUsernameOrPassword() {
        return findElementByXpath("//div[@aria-live='assertive']").isDisplayed();
    }

    public boolean isDisplayedOpenAccountsGoogleCom() {
        return driver.getCurrentUrl().contains("accounts.google.com");
    }
}
