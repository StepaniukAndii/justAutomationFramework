package testOLX.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement olxLogo() {
        return findElementByXpath("//a [@id='headerLogo']");
    }

    public WebElement changeLang() {
        return findElementByXpath("//a [@id='changeLang']");
    }

    public WebElement favorite() {
        return findElementByXpath("//a [@id='observed-search-link']");
    }

    public WebElement olxLogin() {
        return findElementByXpath("//a [@id='topLoginLink']");
    }

    public WebElement newPost() {
        return findElementByXpath("//a [@id='postNewAdLink']");
    }
}
