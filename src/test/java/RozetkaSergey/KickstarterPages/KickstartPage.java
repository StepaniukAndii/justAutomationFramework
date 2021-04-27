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
}
