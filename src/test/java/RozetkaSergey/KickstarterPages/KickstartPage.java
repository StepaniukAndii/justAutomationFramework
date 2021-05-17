package RozetkaSergey.KickstarterPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class KickstartPage extends BasePage {
    public KickstartPage(WebDriver driver) {super(driver);}
    public void enterToKickStarter (String site ) {this.driver.get(site);}
    public List<WebElement> listElementsOfTopMenu (){return findElementsByXpath("//ul[@class='flex justify-center-md text-nowrap']//li");}
    public WebElement searchButton (){return findElementByXpath("//span[@class='display-none block-sm']");}
    public WebElement searchField (){return findElementByXpath("//input[@class='border-box keyboard-focusable no-outline h13 h11-md medium z-dropdown-3 w100p relative radius0 pl4 pl7-md type-18 inline-block border-none shadow-none js-search-term-gs']");}
    public WebElement switchLanguageButton(){return findElementByXpath("//select[@aria-label='Change the language you browse Kickstarter with']");}
    public WebElement copyWriteAndYear (){return findElementByXpath("//div[@class='flex items-center mb3 mb0-lg']//span");}
    public List<WebElement> listOfSocialNetworks (){return findElementsByXpath("//div[@class='border-bottom border2px py8']//a");}
    public WebElement someElementFromPage (){return findElementByXpath("//img[@class='w100p block']");}
    public List<WebElement> priceList (){return findElementsByXpath("//div[@class='mb4-lg']//span");}
    public WebElement switchMoneyButton(){return findElementByXpath("//select[@name='currency']");}
    public WebElement continueButton(){return findElementByXpath("//div[@class='shadow-low bg-white p4 max-h70vh auto-scroll-y clip']//button");}
    public WebElement discoverButton(){return findElementByXpath("//button[@class='mr2 flex items-center type-14 keyboard-focusable soft-black hover-ksr-green-700 bg-white']");}
    public WebElement designAndTechButton (){return findElementByXpath("//li//a[contains(@aria-controls, 'aria-design-tech')]");}
    public List<WebElement> listOfh3 (){return findElementsByXpath("//h3[@aria-level='3' ]");}
    public WebElement startProjectButton(){return findElementByXpath("//a[@class='hide pr3 mr2 flex-sm items-center keyboard-focusable soft-black hover-ksr-green-700']");}
    public WebElement startProjectButtomAnother (){return findElementByXpath("//a[@class='bttn bttn-primary theme--create bttn-large']");}
    public WebElement chooseAProject(){return findElementByXpath("//div[@class='navy-700']");}
    public WebElement designButton (){return findElementByXpath("//ul[@role='presentation']//li[5]");}
    public WebElement nextButton (){return findElementByXpath("//button[@class='bttn keyboard-focusable bttn-medium bttn-primary theme--support fill-bttn-icon hover-fill-bttn-icon']");}
    public WebElement describeTest(){return findElementByXpath("//h2[@class='type-28-sm black type-21 lh4 lh6-sm normal center mb2']");}
    public List<WebElement> listOfBottomMenu (){return findElementsByXpath("//div[@class='grid-container js-project-nav-scroll']//a");}
    public WebElement loginButton(){return findElementByXpath("//a[@class='soft-black hover-ksr-green-700 ml3']");}
    public WebElement loginField (){return findElementByXpath("//input[@class='full-width js-auto_focus email']");}
    public WebElement passField (){return findElementByXpath("//input[@class='full-width js-auto_focus fs-hide password']");}
    public WebElement logoImageButton(){return findElementByXpath(
            "//img[@class='avatar inline-block align-middle radius100p w6 h6 ml2 bg-grey-100']");}
    public List<WebElement> logoOut(){return findElementsByXpath(
            "//a[@class='hover-text-underline hover-cobalt-500 mr1 py1 mb1 mb0-sm link-soft-black']");}
    }
