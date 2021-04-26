package TestRozetkaAndDOU.TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.Pages.HomePage;
import org.testng.annotations.Test;

public class TestFilter extends TestInit {

    @Test
    public void testFilterRozetka() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePage.productCatalog().click();
        moveMouseToElement(homePage.getPhoneProductCatalog().get(1));
        homePage.getPhone().click();
        homePage.getCheckBoxApple().click();
    }
}