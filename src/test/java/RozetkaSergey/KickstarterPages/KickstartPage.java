package RozetkaSergey.KickstarterPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class KickstartPage extends BasePage {
    public KickstartPage(WebDriver driver) {super(driver);}
    public void enterToKickStarter (String site ) {this.driver.get(site);}
    public List<WebElement> listElementsOfTopMenu (){return getElements("//ul[@class='flex justify-center-md text-nowrap']//li");}
    public WebElement searchButton (){return getElement("//span[@class='display-none block-sm']");}
    public WebElement searchField (){return getElement("//input[@class='border-box keyboard-focusable no-outline h13 h11-md medium z-dropdown-3 w100p relative radius0 pl4 pl7-md type-18 inline-block border-none shadow-none js-search-term-gs']");}
    public WebElement switchLanguageButton(){return getElement("//select[@aria-label='Change the language you browse Kickstarter with']");}
    public WebElement copyWriteAndYear (){return getElement("//div[@class='flex items-center mb3 mb0-lg']//span");}
    public List<WebElement> listOfSocialNetworks (){return getElements("//div[@class='border-bottom border2px py8']//a");}
    public WebElement someElementFromPage (){return getElement("//img[@class='w100p block']");}
    public List<WebElement> priceList (){return getElements("//div[@class='mb4-lg']//span");}
    public WebElement switchMoneyButton(){return getElement("//select[@name='currency']");}
    public WebElement continueButton(){return getElement("//div[@class='shadow-low bg-white p4 max-h70vh auto-scroll-y clip']//button");}
    public List<WebElement> theSecondListOfPrice(){return getElements("//div[@class='mb4-lg']//span[@class='ksr-green-500']");}
    }
