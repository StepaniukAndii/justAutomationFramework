package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import org.testng.annotations.Test;

public class TestFilter extends TestInit {

    @Test
    public void testFilterRozetka() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePage.productCatalog().click();
        moveMouseToElement(homePage.getPhoneProductCatalog());
        homePage.getPhone().click();
        homePage.getCheckBoxApple().click();
    }
}