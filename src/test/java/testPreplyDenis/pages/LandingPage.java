package testPreplyDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends BasePage {
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public WebElement headerLogo() {
        return findElementByXpath("//div [contains(@class, 'header_logoImg__2j7b6')]");
    }

    public List<WebElement> headerButtons() {
        return findElementsByXpath("//a [contains(@class, 'header_link__3Jd0t styles_link__1Bu32')]");
    }

    public WebElement changeLanguageAndCurrency() {
        return findElementByXpath("//div [contains(@class,'styles_dropdownToggler__7V8FR')]");
    }

    public List<WebElement> selectorsOfLanguageAndCurrency() {
        return findElementsByXpath("//select [@class='styles_headerSelect__sgyfO']");
    }

    public List<WebElement> selectLanguage() {
        return findElementsByXpath("//select [@data-qa-id='lang-dropdown']//option [@value]");
    }

    public List<WebElement> selectCurrency() {
        return findElementsByXpath("//select [@data-qa-id='currency-dropdown']//option[@value]");
    }
}
