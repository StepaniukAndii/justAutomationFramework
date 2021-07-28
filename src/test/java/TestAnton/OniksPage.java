package TestAnton;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OniksPage extends BasePage {
    public OniksPage(WebDriver driver) {super(driver);}

    public WebElement searchField() {return findElementByXpath("//ul//div[@class='search-wrap']");}
    public WebElement searchFieldLong() {return findElementByXpath("//ul//input[@id='title-search-input']");}
    public WebElement backOnHomePageButton() {return findElementByXpath("//span[@itemprop='name']");}
    public WebElement aboutUsBtnHeader() {return findElementByXpath("//ul[@class='nav navbar-nav']" +
            "//a[@href='/about/']");}
    public WebElement homePageLogoBtn() {return findElementByXpath("//img[@width='250']");}
}
