package RazooM.AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextLocators extends BasePage {
    public TextLocators(WebDriver driver) {
        super (driver);
    }
    public WebElement buttonEntrance(){return findElementByXpath("//div[@class='user-block-authentication']");}
    public WebElement logIn(){return findElementByXpath("//li[@class='login-tab']");}
    public WebElement buttonRegistration(){return findElementByXpath("//li[@class='login-tab']");}
    public WebElement buttonAgreement(){return findElementByXpath("//a[@id='tos']");}
    public WebElement assertWord(){return findElementByXpath("//span[@class='v-modal__cmp-header-title']");}
}
