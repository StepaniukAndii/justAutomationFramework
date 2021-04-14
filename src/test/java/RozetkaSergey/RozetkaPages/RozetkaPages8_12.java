package RozetkaSergey.RozetkaPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RozetkaPages8_12 extends BasePage {
    public RozetkaPages8_12(WebDriver driver) {
        super(driver);
    }

    public WebElement closeAdverb() {
        return getElement("//span[@class='exponea-close-cross']");
    }

    public WebElement pickMainMenu() {
        return getElement("//rz-mobile-user-menu[@class='header-menu']");
    }

    public List<WebElement> goToMainMenu() {
        return getElements("//li[@class='side-menu__item']");
    }

    public List<WebElement> chooseComp() {
        return getElements("//a[text()=' Компьютеры, неттопы, моноблоки ']");
    }

    public List<WebElement> addToCard() {
        return getElements("//button[@class='buy-button goods-tile__buy-button']");
    }

    public WebElement cardDigit() {
        return getElement("//span[@class='counter counter--green']");
    }

    public void enterToRozetka(String site) {
        driver.get(site);
    }

    public WebElement goToBasket() {
        return getElement("//button[@class='header__button header__button--active']");
    }

    public WebElement clickButtonDelete() {
        return getElement("//button[@class='button button--white button--small context-menu__toggle']");
    }

    public WebElement affirmDelete() {
        return getElement("//button[@class='button button--medium button--with-icon button--link context-menu-actions__button']");
    }

    public void moveMouseToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    public WebElement returnWords (){return getElement("//h4[@class='cart-dummy__heading']");}
}
