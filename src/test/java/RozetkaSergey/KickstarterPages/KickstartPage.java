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
    public WebElement discoverButton(){return getElement("//button[@class='mr2 flex items-center type-14 keyboard-focusable soft-black hover-ksr-green-700 bg-white']");}
    public WebElement designAndTechButton (){return getElement("//li//a[contains(@aria-controls, 'aria-design-tech')]");}
    public List<WebElement> listOfh3 (){return getElements("//h3[@aria-level='3' ]");}
    public WebElement startProjectButton(){return getElement("//a[@class='hide pr3 mr2 flex-sm items-center keyboard-focusable soft-black hover-ksr-green-700']");}
    public WebElement startProjectButtomAnother (){return getElement("//a[@class='bttn bttn-primary theme--create bttn-large']");}
    public WebElement chooseAProject(){return getElement("//div[@class='navy-700']");}
    public WebElement designButton (){return getElement("//ul[@role='presentation']//li[5]");}
    public WebElement nextButton (){return getElement("//button[@class='bttn keyboard-focusable bttn-medium bttn-primary theme--support fill-bttn-icon hover-fill-bttn-icon']");}
    public WebElement describeTest(){return getElement("//h2[@class='type-28-sm black type-21 lh4 lh6-sm normal center mb2']");}
    }
