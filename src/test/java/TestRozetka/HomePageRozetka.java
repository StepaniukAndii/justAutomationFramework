package TestRozetka;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedList;
import java.util.List;

public class HomePageRozetka extends BasePage {

    public String gools = "Холодильник";

    public HomePageRozetka(WebDriver driver) {
        super(driver);
    }

    public WebElement searchFild() {
        return getElement("//input[@name='search']");
    }

    public WebElement getRefrigerator() {
        return getElement("//span[@class='goods-tile__title']");
    }

    public WebElement addCart() {
        return getElement("//button[@class='buy-button button button_with_icon button_color_green button_size_large']");
    }

    public WebElement getButtonFild() {
        return getElement("//button[@class='button button_color_green button_size_medium search-form__submit']");
    }

    public WebElement filterGamer() {
        return getElement("//a[text()=' Смартфони, ТВ і електроніка ']");
    }

    public WebElement getPhoneProductCatalog() {
        return getElement("//li[@class='fat-popular__item']/a[@href='https://rozetka.com.ua/ua/mobile-phones/c80003/filter/']");
    }

    public List<WebElement> getAllCheckBox() {
        return getElements("//a[@class='checkbox-filter__link']");
    }



    public WebElement productCatalog() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        captureScreen();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(getElement("//button[@id='fat-menu']")));
        return element;
    }


    public List<WebElement> getElementsRefrigerator() {
        return getElements("//div[@class='goods-tile__inner']/a[contains(@title,'Холодильник')]");
    }


}
