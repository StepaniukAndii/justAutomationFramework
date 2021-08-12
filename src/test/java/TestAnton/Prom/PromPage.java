package TestAnton.Prom;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PromPage extends BasePage {
    public PromPage(WebDriver driver) {super(driver);}

    public WebElement signUpBtn() {return findElementByXpath("//a[contains(@data-qaid,'qa_register_btn')]");}
    public WebElement enterYourNameFirstField() {return findElementByXpath("//input[contains(@name,'vertical-name')]");}
    public WebElement enterEmailFirstField() {return findElementByXpath("//input[contains(@name,'vertical-email')]");}
    public WebElement enterPasswordFirstField() {return findElementByXpath("//input[contains(@name,'vertical-password')]");}
    public WebElement clickSubmitFirstBtn() {return findElementByXpath("//button[contains(@class,'theme_blue')]");}
    public WebElement deleteProfileBtn() {return findElementByXpath("//span[contains(text(),'ида')]");}
    public WebElement signInBtn() {return findElementByXpath("//a[contains(@data-qaid,'sign-in')]");}
    public WebElement signInCustomerBtn() {return findElementByXpath("//a[contains(@data-qaid,'customer')]");}
    public WebElement signInInputField() {return findElementByXpath("//input[contains(@data-qaid,'input_field')]");}
    public WebElement confirmSignInBtn() {return findElementByXpath("//button[contains(text(),'ві')]");}
    public WebElement signInEnterPasswordField() {return findElementByXpath("//input[@id='enterPassword']");}
    public WebElement getCartBtnOnHomePage() {return findElementByXpath("//button[@data-qaid='shopping_cart']");}
}
