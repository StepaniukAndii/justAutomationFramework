package RozetkaSergey.UkrNetPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UkrNetPages extends BasePage {
    public UkrNetPages(WebDriver driver) {super(driver);}
    public void enterToUkrNet (String site) {driver.get(site);}
    public WebElement searchFieldWindow (){return getElement("//input[@id='search-input']");}
    public List<WebElement> listOfRequest () {return getElements("//a[@class='gs-title']");}
    public WebElement buttonGoLogo (){return getElement("//a[@class='sLogo'] ");}
    public WebElement buttonСhangeCity (){return getElement("//a[@class='otherCity']");}
}
