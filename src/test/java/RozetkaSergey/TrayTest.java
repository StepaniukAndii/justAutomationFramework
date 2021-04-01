package RozetkaSergey;

import ClasesToAllUs.TestInit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TrayTest extends TestInit {
    @Test
    public void ersTest() {
        googleIt("Розетка");
        entryToRozetka().click();
        searhFieldRozetka().sendKeys("Принтер");
        enter();
        sleep(3);
        resultItems().get(0).click();
        pickItem().click();
        pickBuy().click();
        addToBasket().click();
        sleep(2);
    }

    public WebElement entryToRozetka() {
        return getElement("//div[@class='yuRUbf']/a[@href='https://rozetka.com.ua/']");
    }

    public WebElement searhFieldRozetka() {
        return getElement("//input[@name='search']");
    }

    public List<WebElement> resultItems() {
        return driver.findElements(By.xpath("//a[@class='goods-tile__picture']"));
    }

    public WebElement pickItem() {
        return getElement("//button[@class='buy-button button button_with_icon button_color_green button_size_large']");
    }

    public WebElement pickBuy() {
        return getElement("//button[@class='buy-button button button_with_icon button_color_green button_size_large' ]");
    }

    public WebElement addToBasket() {
        return getElement("//a[@class='button button_size_medium button_color_gray cart-footer__continue']");
    }


    public void navigationGoogle() {
        driver.get("https://google.com");
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}


