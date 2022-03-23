package Julia.EatStreet.Pages;

import AlyonaBoychuk.Page.HomePage;
import ClasesToAllUs.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
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

    public WebElement menuLink() {
        return findElementByXpath("//span[contains(text(), 'Інтернет-магазин')]");
    }

    public WebElement buttonSelectCity() {
        return findElementByXpath("//span[@class='btn__content']");
    }

    public void goToTheSecondWindowTab(WebDriver driver, Integer seconds) {
        waitForNewTabOpened(seconds);
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void waitForNewTabOpened(Integer seconds) {
        for (int a = 0; a < seconds * 2; a++) {
            ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
            if (tabs2.size() > 1) {
                break;
            }
        }
    }

    public WebElement btnTV() {
        return findElementByXpath("//div/a[contains(text(), 'Телебачення')]");
    }

    public WebElement btnApp() {
        return  findElementByXpath("//a[@id='app']");
    }

    public List<WebElement> btnSelectTariff() {
        return findElementsByXpath("//a[contains(text(),'Вибрати тариф')]");
    }

    public WebElement linkDergavniySektor() {
        return findElementByXpath("//span[contains(text(), 'Державному сектору')]");
    }

    public List<WebElement> btnTelefonia() {
        return findElementsByXpath("//div[@class='DropdownMenu_drop-down-menu__container__3T6Vf']");
    }

    public WebElement btnVirtualAts() {
        return findElementByXpath("//a[@id='Ats']");
    }

    public WebElement btnZamovitySms() {
        return  findElementByXpath("//a[contains(text(), 'Підключити через SMS')]");
    }

    public WebElement btnZamovity() {
        return  findElementByXpath("//button[@class='popup-trigger btn btn--blue btn--blue-business sticky-header__btn']");
    }

    public List<WebElement> fieldName() {
        return findElementsByXpath("//input[@class='application-form__input']");
    }

    public WebElement fieldPhone() {
        return driver.findElement(By.xpath("//input[@type='tel']"));
    }

    public WebElement closeWindow() {
        return findElementByXpath("//div/div[@class='application-form__close']");
    }

    public WebElement logoAtc() {
        return findElementByXpath("//div/p[@class='sections-container__product-title']");
    }

    public List<WebElement> btnPidcluchity() {
        return  findElementsByXpath("//button/span[contains(text(), 'Підключити')]");
    }

    public WebElement rbtnCoristyetesKievstar() {
        return findElementByXpath("//button/span[contains(text(), 'Ні')]");
    }

    public WebElement btnWantNumber() {
        return findElementByXpath("//button/span[contains(text(), 'Хочу')]");
    }

    public List<WebElement> btnFindShop() {
        return findElementsByXpath("//a/span[contains(text(), 'Знайти магазин')]");
    }

    public WebElement linkShopKievstar() {
        return findElementByXpath("//span[contains(text(), 'Магазини Київстар')]");
    }
}
