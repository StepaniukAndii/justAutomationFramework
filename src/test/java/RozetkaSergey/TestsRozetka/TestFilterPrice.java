package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class TestFilterPrice extends TestInit {

    @Test
    public void testFilterPrice() {

        Actions actions = new Actions(driver);
        RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages5_34.searchField().sendKeys("пароварка");
        enter();
        closeAdIfExist();
        sleep(1);
        actions.moveToElement(driver.findElement(By.xpath("//button[@class='button button_color_gray button_size_small slider-filter__button']")));
        actions.perform();
        rozetkaPages5_34.minMaxPrice().get(0).clear();
        sleep(1);
        rozetkaPages5_34.minArgu().sendKeys("2000");
        sleep(1);
        rozetkaPages5_34.maxArgu().clear();
        rozetkaPages5_34.maxArgu().sendKeys("5000");
        sleep(1);
        rozetkaPages5_34.buttonMinMaxPriceConfirm().click();
    }
}
