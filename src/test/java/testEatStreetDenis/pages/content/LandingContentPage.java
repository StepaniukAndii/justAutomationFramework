package testEatStreetDenis.pages.content;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingContentPage extends BasePage {
    public LandingContentPage(WebDriver driver) {
        super(driver);
    }

    public RestaurantsPage restaurantsPage() {
        return new RestaurantsPage(driver);
    }

    public WebElement deliveryCheckbox() {
        return findElementByXpath("//label [@for='home-checkbox-delivery']");
    }

    public WebElement takeoutCheckbox() {
        return findElementByXpath("//label [@for='home-checkbox-delivery']");
    }

    public WebElement searchEatStreet() {
        return findElementByXpath("//input [@id='input-food-search']");
    }

    public WebElement useMyLocation() {
        return findElementByXpath("//div [@title='Use my location']");
    }

    public WebElement locateMeModalWindowButton() {
        return findElementByXpath("//a [@id='use-my-location-btn']");
    }

    public WebElement enterAddressModalWindowButton() {
        return findElementByXpath("//a [@id='enter-address-btn']");
    }

    public WebElement getFed() {
        return findElementByXpath("//a [@id='find-restaurants']");
    }

    public WebElement liveChat() {
        return findElementByXpath("//div [@class='livechat hidden-tablet']");
    }

    public WebElement acceptCookies() {
        return findElementByXpath("//button [@class='btn']");
    }

    public List<WebElement> howItWorks() {
        return findElementsByXpath("//a [@class='how-it-works_link']");
    }

    public WebElement emailField() {
        return findElementByXpath("//input [@id='new-email']");
    }

    public WebElement closeModalWindow() {
        return findElementByXpath("//a [@id='confirm-modal-btn']");
    }

    public List<WebElement> countries() {
        return findElementsByXpath("//div [@class='cities-list']//a");
    }
}
