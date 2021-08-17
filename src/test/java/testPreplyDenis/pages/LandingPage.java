package testPreplyDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends BasePage {
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public WebElement preplySearchField() {
        return findElementByXpath("//input [@data-qa-id='full-text-search-no-subject-input']");
    }

    public WebElement submitBtn() {
        return findElementByXpath("//button [@data-qa-id='full-text-submit-btn']");
    }

    public WebElement showMore() {
        return findElementByXpath("//div [contains(@class, 'toggler___3cEeK')]");
    }

    public List<WebElement> languagesTutors() {
        return findElementsByXpath("//a [contains(@class,'title___2PfVY linkIt___1kA3P')]");
    }

    public List<WebElement> aboutLearningBtns() {
        return findElementsByXpath("//a [contains(@class,'Button_button__qXZ5J Button_l__3M9Ff')]");
    }

    public WebElement becomeATutorBtn() {
        return findElementByXpath("//a [contains(@class,'btn___3NTpS')]");
    }

    public WebElement howItWorksLink() {
        return findElementByXpath("//a [contains(@class,'link___2Ig2i')]");
    }

    public List<WebElement> additionalInfo() {
        return findElementsByXpath("//li [contains(@class,'linksBlockItem___2LFcl')]//a");
    }
}
