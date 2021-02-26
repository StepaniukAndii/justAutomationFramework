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

    WebDriverWait wait = new WebDriverWait(driver, 10);

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

    public WebElement getPhone() {
        return wait.until(ExpectedConditions.
                elementToBeClickable(By.xpath("//a[@href='https://rozetka.com.ua/ua/mobile-phones/c80003/preset=smartfon/']")));
    }

    public WebElement getPhoneProductCatalog() {
        return wait.until(ExpectedConditions.
                elementToBeClickable(By.xpath("//a[text()='Смартфони, ТВ і електроніка']")));
    }

    public WebElement getCheckBoxApple() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='Apple']")));

    }



    public WebElement productCatalog() {
       return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='fat-menu']")));
    }


    public List<WebElement> getElementsRefrigerator() {
        return getElements("//div[@class='goods-tile__inner']/a[contains(@title,'Холодильник')]");
    }


}
