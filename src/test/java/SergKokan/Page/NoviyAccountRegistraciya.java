package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NoviyAccountRegistraciya extends BasePage {

    public NoviyAccountRegistraciya(WebDriver driver) {
        super(driver);
    }
    public WebElement VvodNomerTelefona() {
        return findElementByXpath("//input[@id='SignUpPhone']");
    }
    public WebElement Registraciya() {
       return findElementByXpath("//a[@class='regist']");
    }
    public WebElement VvodEmail() {
       return findElementByXpath("//input[@id='SignUpEmail']");
    }

    public WebElement closeModalWindow() {
       return waitElementToBeClickable("//div[@id='button_cross']");
    }

    public WebElement closePopUp() {
        return waitElementToBeClickable("//a[@class='bingc-active-close-button']");
    }
    public WebElement isDisplayedNoviyAccountRegistraciya() {
        return findElementByXpath("//button[contains(text(), 'зареєструватися')]");

    }

}
