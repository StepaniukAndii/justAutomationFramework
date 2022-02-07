package Pashkovsky;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public WebElement inputPhone() {
        return findElementByXpath("//input");
    }

    public WebElement getBtnSend() {
        return findElementByXpath("//button[@ class='button button_color_green button_size_medium search-form__submit ng-star-inserted']");
    }

    public WebElement selectPhone() {
        return findElementByXpath("//span[ text()=' Мобильный телефон Xiaomi 11 Lite 5G NE 8/128GB Truffle Black ']");
    }

    public WebElement getBtnBuy() {
        return findElementByXpath("//ul/li//button[contains(text(),'Купить')]");
    }

    public WebElement btnOformitZakaz() {
        return findElementByXpath("//div/a[@class='button button_size_large button_color_green cart-receipt__submit ng-star-inserted' ]");
    }

    public WebElement clouseDropWindow() {
        return findElementByXpath("//span[@class=\"exponea-close-cross\"]");
    }
}
