package testRozetkaDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderPage extends BasePage {
    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement logo() {
        return findElementByXpath("//img [@alt='Rozetka Logo']");
    }

    public WebElement openMenu() {
        return findElementByXpath("//button [@class='header__button']");
    }

    public WebElement modalMenuClose() {
        return findElementByXpath("//button [@class='modal__close ng-star-inserted']");
    }

    public WebElement ad() {
        return findElementByXpath("//a [@class='top-information__inner ng-star-inserted']");
    }

    public WebElement catalogue() {
        return findElementByXpath("//button [@id='fat-menu']");
    }

    public WebElement searchRozetka() {
        return findElementByXpath("//input [@class='search-form__input ng-untouched ng-pristine ng-valid']");
    }

    public WebElement findButton() {
        return findElementByXpath("//button [@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']");
    }

    public WebElement microphone() {
        return findElementByXpath("//button [@class='search-form__microphone ng-star-inserted']");
    }

    public WebElement langChange() {
        return findElementByXpath("//a [@class='lang__link ng-star-inserted']");
    }

    public WebElement premium() {
        return findElementByXpath("//div [@class='premium-button']");
    }

    public List<WebElement> authAndCart() {
        return findElementsByXpath("//button [@class='header__button ng-star-inserted']");
    }

    public WebElement cartWithGoods() {
        return findElementByXpath("//button [@class='header__button ng-star-inserted header__button--active']");
    }

    public ProductPage productPageFunctions() {
        return new ProductPage(driver);
    }
}
