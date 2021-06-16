package TestAmazon.Pages.HomePage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageAmazon extends BasePage {

    public HomePageAmazon(WebDriver driver) {
        super(driver);
    }

    public WebElement tapToSearchField() {
        return findElementByXpath("//input[@id='twotabsearchtextbox']");
    }

    public WebElement addItemToCard() {
        return findElementByXpath("//input[@id='add-to-cart-button']");
    }

    public WebElement chooseSize() {
        return findElementByXpath("//span[@id='dropdown_selected_size_name']");
    }

    public WebElement chooseSizeLargeX() {
        return findElementByXpath("//a[@id='native_dropdown_selected_size_name_4']");
    }

    public List<WebElement> chooseItem() {
        return findElementsByXpath("//div[@class='a-section aok-relative s-image-square-aspect']");
    }

    public WebElement openCard() {
        return findElementByXpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute']");
    }

    public WebElement itemsInCard() {
        return findElementByXpath("//div[@class='a-scroller ewc-scroller ewc-scroller--selected a-scroller-vertical']//div[@data-cart-type='Retail_Cart']");
    }

    public WebElement openCart() {
        return findElementByXpath("//div[@class='a-scroller ewc-scroller ewc-scroller--selected a-scroller-vertical']//div[@data-cart-type='Retail_Cart']");
    }
    public String bigLocator = "//div[@class='a-scroller ewc-scroller ewc-scroller--selected a-scroller-vertical']//div[@data-cart-type='Retail_Cart']";

    public WebElement sortByPrice() {
        return findElementByXpath("//div[@class='a-carousel-col a-carousel-center']//*[contains(text(),'$25 to $50')]");
    }

    public WebElement clickToPageNumb3() {
        return findElementByXpath("//li[@class='a-normal']//*[contains(text(),'3')]");
    }
}
