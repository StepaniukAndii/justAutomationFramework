package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.junit.Assert;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.HeaderPage;

public class TestSearch extends TestInit {

    @Test
    public void search() {
        HeaderPage headerPage = new HeaderPage(driver);
        openUrl("https://rozetka.com.ua/");
        headerPage.searchRozetka().sendKeys("Xiaomi redmi\n");
        for (int i = 0; i < 5; i++) {
            if(headerPage.productPageFunctions().goods().get(i).getText().contains("Xiaomi Redmi")) {
                System.out.println("all good.");
            } else {
                Assert.fail();
            }
        }
    }
}
