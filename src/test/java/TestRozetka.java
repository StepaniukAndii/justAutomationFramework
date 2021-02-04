import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestRozetka extends TestInit{

    @Test
    public void testRozetka() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);

        openUrl("https://rozetka.com.ua");
        homePageRozetka.surchFild().click();
        homePageRozetka.surchFild().sendKeys("холодильник\n");
        homePageRozetka.getRefrigerator().click();
        homePageRozetka.addInBaskets().click();
        Assert.assertTrue((homePageRozetka.findElement("//a[@class='cart-product__title']")).isDisplayed());
    }
}
