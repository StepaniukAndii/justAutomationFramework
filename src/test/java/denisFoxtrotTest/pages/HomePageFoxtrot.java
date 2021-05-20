package denisFoxtrotTest.pages;

import ClasesToAllUs.BasePage;
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
        return findElementByXpath("//div [@id='cartSummary']");
    }

    public List<WebElement> deleteFromCart() {
        return findElementsByXpath("//i [@class='icon icon-trash']");
    }

    public WebElement displayCart() {
        return findElementByXpath("//a [@href='/ru/cart.html']");
    }

    public List<WebElement> increaseQuantity() {
        return findElementsByXpath("//span [@data-type='plus']");
    }

    public WebElement adPicClick() {
        return findElementByXpath("//a [@class='banners__item promo-obj js-link isTracked']");
    }

    public WebElement adCarouselClick() {
        return  findElementByXpath("//div [@class='listing-banner__container owl-carousel owl-loaded']");
    }

    public WebElement adCarouselNext() {
        return findElementByXpath("//span [@class='icon icon-carousel-next']");
    }

}
