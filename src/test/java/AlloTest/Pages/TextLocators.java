package AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextLocators extends BasePage {
    public TextLocators(WebDriver driver) {
        super (driver);
    }
    public WebElement buttonEntrance(){return getElement("//div[@class='user-block-authentication']");}
    public WebElement logIn(){return getElement("//li[@class='login-tab']");}
    public WebElement buttonRegistration(){return getElement("//li[@class='login-tab']");}
    public WebElement buttonAgreement(){return getElement("//a[@id='tos']");}
    public WebElement assertWord(){return getElement("//span[@class='v-modal__cmp-header-title']");}
}
