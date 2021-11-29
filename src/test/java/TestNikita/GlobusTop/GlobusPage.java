package TestNikita.GlobusTop;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GlobusPage extends BasePage {

    public GlobusPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogOnMainPage() {
        return findElementByXpath("//button[@class='btn btn-light btn-lg gt-catalog-btn']");
    } // catalog on the main page

    public WebElement openCatalogBtn() {
        return findElementByXpath("//button[@class='btn btn-light btn-lg gt-catalog-btn']");
    } // btn witch opens detailed catalog

    public WebElement insideFilterElemComp() {
        return findElementByXpath("//div//a[@data-category='900']");
    }

    public WebElement getElemTextOnPage() {
        return findElementByXpath("//div//h1[@id='page-title']");
    }

    public WebElement clickLogoToReturn() {
        return findElementByXpath("//div[@class=\"wrapper\"]/a[@class='logo']");
    }

    public WebElement searchField() {
        return findElementByXpath("//input[@name='search']");
    }

    public WebElement wrongSearchMessageGetText() {
        return findElementByXpath("//div[@class='empty-entity']");
    }

    public List<WebElement> listOfMainFilterElements() {
        return findElementsByXpath("//div[@class='sticky-wrapper']//div[@class='categories-list']/a");
    }
}
