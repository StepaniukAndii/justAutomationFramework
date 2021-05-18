package DenisFoxtrotTest.TestClasses;

import ClasesToAllUs.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageFoxtrot extends BasePage {

    public HomePageFoxtrot(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearch() {
        return findElementByXpath("//input[@type='search']");
    }

    public List<WebElement> findMerch() {
        return findElementsByXpath("//a[@class='card__title']");
    }

    public WebElement addToCart() {
        return findElementByXpath("//div[@class='button buy-button product-box__main-buy__button product-buy-button']");
    }
    public WebElement nextPage() {
        return findElementByXpath("//i [@class='icon icon-chevron-right']");
    }
    public WebElement checkCart() {
        return findElementByXpath("//span [@id='cartItemsCount']");
    }
}
