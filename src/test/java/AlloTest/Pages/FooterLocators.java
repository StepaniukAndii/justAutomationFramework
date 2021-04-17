package AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FooterLocators extends BasePage {
    public FooterLocators(WebDriver driver) {
        super (driver);
    }
    public List<WebElement> footerCompaniList(){return getElements ("//div[@class='footer-section'][1]/div[@class='footer-section__list']/ul/li/a");}
    public List<WebElement> footerHelpList(){return getElements ("//div[@class='footer-section'][2]/div[@class='footer-section__list']/ul/li");}
    public List<WebElement> footerUsefulInformationList(){return getElements ("//div[@class='footer-section'][3]/div[@class='footer-section__list']/ul/li");}
    public WebElement feedBack(){return getElement ("//div[@class='main-button-block']");}
    public List<WebElement> feedBackList(){return getElements ("//div[@class='contact-us-additional-buttons active']/a/span");}
    public WebElement helpLinkOne(){return getElement ("//div[@class='footer-section'][2]/div[@class='footer-section__list']/ul/li/a[text()='Питання та відповіді']");}
    public WebElement helpLinkToo(){return getElement ("//div[@class='footer-section'][2]/div[@class='footer-section__list']/ul/li/a[text()='Доставка та оплата']");}
    public WebElement helpLinkTry(){return getElement ("//div[@class='footer-section'][2]/div[@class='footer-section__list']/ul/li/a[text()='Купити в кредит']");}
    public WebElement helpLinkFor(){return getElement ("//div[@class='footer-section'][2]/div[@class='footer-section__list']/ul/li/a[text()='Оплата частинами']");}
    public WebElement helpLinkFive(){return getElement ("//div[@class='footer-section'][2]/div[@class='footer-section__list']/ul/li/a[text()='Залиште відгук про нашу роботу']");}
    public  List<WebElement> sss(){return getElements ("//div[@class='footer-section'][3]/div[@class='footer-section__list']/ul/li");}
}
