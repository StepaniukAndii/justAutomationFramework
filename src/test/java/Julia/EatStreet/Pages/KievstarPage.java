package Julia.EatStreet.Pages;

import AlyonaBoychuk.Page.HomePage;
import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.List;

public class KievstarPage extends BasePage {

    public KievstarPage(WebDriver driver) {
        super(driver);
    }

    public WebElement menuLinkTariffs() {
        return findElementByXpath("//a[contains(text(), 'Мобільний зв’язок')]");
    }

    public List<WebElement> menuLinkHomeInternet() {
        return findElementsByXpath("//a[contains(text(), 'Домашній Інтернет')]");
    }

    public List<WebElement> menuLinkTV() {
        return findElementsByXpath("//a[contains(text(), 'Телебачення')]");
    }

    public List<WebElement> menuLink4G() {
        return findElementsByXpath("//a[contains(text(), 'Все разом')]");
    }

    public WebElement menuLinkForBisssnes() {
        return findElementByXpath("//a[contains(text(), 'Тарифи для бізнесу')]");
    }
}
