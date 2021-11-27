package TestNikita.GlobusTop;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GlobusPage extends BasePage {

    public GlobusPage(WebDriver driver) {super(driver);}

    public WebElement closedFilter(){
        return findElementByXpath("//button[@class='btn btn-light btn-lg gt-catalog-btn']");
    }
    public WebElement openedFilter(){
        return findElementByXpath("//button[@class='btn btn-light btn-lg gt-catalog-btn']");
    }
    public WebElement insideFilterElemComp(){
        return findElementByXpath("//div//a[@data-category='900']");
    }
    public WebElement getElemTextOnPage(){
        return findElementByXpath("//div//h1[@id='page-title']");
    }
    public WebElement clickLogoToReturn(){
        return findElementByXpath("//div[@class=\"wrapper\"]/a[@class='logo']");
    }
    public WebElement searchField(){
        return findElementByXpath("//input[@name='search']");
    }
    public WebElement wrongSearchMessageGetText(){
        return findElementByXpath("//div[@class='empty-entity']");
    }

}
