package PullRequestsSveta;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SignUpInPage extends BasePage {
    public SignUpInPage(WebDriver driver) {
        super(driver);
    }
    public WebElement signUp(){
        return (findElementByXpath("//a[contains(@data-ga-action,'sign')]"));}
    public WebElement writeYourEmail(){
        return (findElementByXpath("//input[contains(@placeholder, 'email.')]"));}
    public WebElement writeYourEmailAgain(){
        return findElementByXpath("//input[contains(@placeholder,'again')]");}
    public WebElement writeYourPassword(){
        return findElementByXpath("//input[contains(@placeholder, 'password.')]");}
    public WebElement writeYourName(){
        return findElementByXpath("//input[contains(@placeholder, 'name.')]");}
    public WebElement monthOfBirth(){
        return findElementByXpath("//select[contains(@name, 'month')]");}
    public WebElement dayOfBirth(){
        return findElementByXpath("//input[contains(@id, 'day')]");}
    public WebElement yearOfBirth(){
        return findElementByXpath("//input[contains(@id, 'year')]");}
    public WebElement sex(){
        return findElementByXpath("//span[@class='Indicator-hjfusp-0 kLhpUW']");}
    public WebElement confirm(){
        return findElementByXpath("//span[@class='Indicator-sc-1airx73-0 hmDuGC']");}
    public WebElement signUpButton(){
        return findElementByXpath("//button[@class='Button-qlcn5g-0 dmJlSg']");}
    public WebElement logIn(){
        return (findElementByXpath("//a[contains(@data-tracking, 'log-in')]"));}
    public WebElement logInUsername(){
        return findElementByXpath("//input[contains(@id, 'login-username')]");}
    public WebElement logInPassword(){
        return findElementByXpath("//input[contains(@id, 'login-password')]");}
    public WebElement logInButton(){
        return findElementByXpath("//button[contains(@id, 'login-button')]");}
    public WebElement ligInWithGoogle(){
        return findElementByXpath("//a[contains(@class, 'btn btn-block btn-default btn-google ng-binding')]");}
    public WebElement logInWithGoogleEmail(){
        return findElementByXpath("//input[contains(@id, 'identifierId')]");}
    public WebElement iAmNotARobotButton(){
        return findElementByXpath("//div[@class='recaptcha-checkbox-border']");}
    public WebElement confirmYouAreNotARobot(){
        return findElementByXpath("//div[contains(@aria-label, 'Error indicator')]");}
    public WebElement emailOrPasswordIsWrong(){
        return findElementByXpath("//p[@class='alert alert-warning']");}
    public List<WebElement> continueButton(){
        return findElementsByXpath("//span[contains(@jsname, 'V67aGc')]");}
    public WebElement cantHaveAccessToYourAccount(){
        return findElementByXpath("//h1[contains(@id, 'headingText')]");}

}
