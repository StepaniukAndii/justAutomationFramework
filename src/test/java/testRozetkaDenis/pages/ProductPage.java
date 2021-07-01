package testRozetkaDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> goods() {
        return findElementsByXpath("//span [@class='goods-tile__title']");
    }


    public List<WebElement> addToCart() {
        return findElementsByXpath("//app-buy-button");
    }

    public WebElement modalWindowClose() {
        return findElementByXpath("//button [@class='modal__close ng-star-inserted']");
    }

    public List<WebElement> amountOfGoodsInsideCart() {
        return findElementsByXpath("//button [@class='button button--white button--small context-menu__toggle']");
    }

    public WebElement deleteElementIsnideCart() {
        return findElementByXpath("//button [@class='button button--medium button--with-icon button--link context-menu-actions__button']");
    }

    public WebElement nextPage() {
        return findElementByXpath("//a [@class='button button_color_gray button_size_medium pagination__direction pagination__direction_type_forward ng-star-inserted']");
    }

    public WebElement disableAd() {
        return findElementByXpath("//span [@class='exponea-close-cross']");
    }

    public HeaderPage headerPageFunctions() {
        return new HeaderPage(driver);
    }

    public CharSequence openNewTab() {
        String openTab;
        return openTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
    }
}
