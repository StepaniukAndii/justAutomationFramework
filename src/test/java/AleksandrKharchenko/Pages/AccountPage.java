package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFacebookLoginBtn() {
        return findElementByXpath("//form[@novalidate='novalidate']//a[@id='fblogin']");
    }
}
