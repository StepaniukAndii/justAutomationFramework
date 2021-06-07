package testOLX.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    public WebElement olxLogin() {
        return findElementByXpath("//a [@id='topLoginLink']");
    }

    public WebElement newPost() {
        return findElementByXpath("//a [@id='postNewAdLink']");
    }

    public List<WebElement> footerButtons() {
        return findElementsByXpath("//a [@class='link gray']");
    }

    public List<WebElement> footerPolicyButtons() {
        return findElementsByXpath("//a [@class='link gray inlblk rel']");
    }

    public WebElement partners() {
        return findElementByXpath("//span [@class='inlblk']");
    }

    public WebElement closeCookies() {
        return findElementByXpath("//button [@class='cookie-close abs cookiesBarClose']");
    }

    public WebElement searchHeader() {
        return findElementByXpath("//input [@id='headerSearch']");
    }

    public WebElement loginAuthClose() {
        return findElementByXpath("//a [@data-cy='search_results_button_close_observed_search_info_message']");
    }

    public WebElement favorite() {
        return findElementByXpath("//a [@id='observed-search-link']");
    }
}
