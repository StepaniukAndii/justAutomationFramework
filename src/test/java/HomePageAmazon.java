import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageAmazon extends BasePage {

    public HomePageAmazon(WebDriver driver) {
        super(driver);
    }

    public WebElement tapToSearchField() {
        return getElement("//input[@id='twotabsearchtextbox']");
    }

    public WebElement addItemToCard() {
        return getElement("//input[@id='add-to-cart-button']");
    }

    public WebElement chooseSize() {
        return getElement("//span[@id='dropdown_selected_size_name']");
    }

    public WebElement chooseSizeLargeX() {
        return getElement("//a[@id='native_dropdown_selected_size_name_4']");
    }

    public List<WebElement> chooseItem() {
        return getElements("//div[@class='a-section aok-relative s-image-square-aspect']");
    }

    public WebElement openCard() {
        return getElement("//a[@class='nav-a nav-a-2 nav-progressive-attribute']");
    }

    public WebElement itemsInCard() {
        return getElement("//div[@class='a-scroller ewc-scroller ewc-scroller--selected a-scroller-vertical']//div[@data-cart-type='Retail_Cart']");
    }

    public WebElement openCart() {
        return getElement("//div[@class='a-scroller ewc-scroller ewc-scroller--selected a-scroller-vertical']//div[@data-cart-type='Retail_Cart']");
    }
    String bigLocator = "//div[@class='a-scroller ewc-scroller ewc-scroller--selected a-scroller-vertical']//div[@data-cart-type='Retail_Cart']";
}
