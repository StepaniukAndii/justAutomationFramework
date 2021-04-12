package AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FooterLocators extends BasePage {
    public FooterLocators(WebDriver driver) {
        super (driver);
    }
    public List<WebElement> footerCompaniList(){return getElements ("//div[@class='footer-section'][1]/div[@class='footer-section__list']/ul/li");}
    public List<WebElement> footerHelpList(){return getElements ("//div[@class='footer-section'][2]/div[@class='footer-section__list']/ul/li");}
    public List<WebElement> footerUsefulInformationList(){return getElements ("//div[@class='footer-section'][3]/div[@class='footer-section__list']/ul/li");}
}