package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.junit.Assert;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.HeaderPage;
import testRozetkaDenis.pages.ProductPage;

import java.util.concurrent.TimeUnit;

public class TestSearch extends TestInit {

    @Test
    public void search() {
        HeaderPage hp = new HeaderPage(driver);
        ProductPage pp = new ProductPage(driver);
        openUrl("https://rozetka.com.ua/");
        hp.searchRozetka().sendKeys("Xiaomi redmi\n");
        for (int i = 0; i < 5; i++) {
            if(pp.goods().get(i).getText().contains("Xiaomi Redmi")) {
                System.out.println("all good.");
                driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            } else {
                Assert.fail();
            }
        }
    }
}
