package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFacebookLoginBtn() {
        return findElementByXpath("//form[@novalidate='novalidate']//a[@id='fblogin']");
    }

    public List<WebElement> getSignInBtn() {
        return findElementsByXpath("//button[@id='se_userLogin']");
    }

    public boolean isDisplayedErrorOlxMSG() {
        return findElementByXpath("//label[contains(text(),'обязательно для заполнения')]").isDisplayed();
    }
}
