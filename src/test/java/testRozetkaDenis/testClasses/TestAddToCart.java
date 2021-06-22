package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.HeaderPage;
import testRozetkaDenis.pages.ProductPage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestAddToCart extends TestInit {


    @Test
    public void addToCart() {
        HeaderPage hp = new HeaderPage(driver);
        ProductPage pp = new ProductPage(driver);
        openUrl("https://rozetka.com.ua/");
        hp.searchRozetka().sendKeys("Xiaomi redmi\n");
        if(pp.removeAdd().isDisplayed()) {
            pp.removeAdd().click();
        } else {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            pp.removeAdd().click();
        }
        for (int i = 0; i < 4; i++) {
            adding();
            pp.nextGoodsPage().click();
            sleep(2); //for proper page load
        }
        for (int i = 0; i < 4; i++) {
            adding();
            pp.previousGoodsPage().click();
            sleep(2); //for proper page load
        }
    }

    private void adding() {
        Random random = new Random();
        int add = random.nextInt(5);
        ProductPage pp = new ProductPage(driver);
        for (int i = 0; i < 5; i++) {
            pp.addToCart().get(add).click();
            add++;
        }
    }
}
