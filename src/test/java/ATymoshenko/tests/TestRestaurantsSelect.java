package ATymoshenko.tests;

import ATymoshenko.pages.HomePage;
import AleksandrKharchenko.Pages.DriverPage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRestaurantsSelect extends TestInit {
    @Test
    public void selectRestAnyCity() {
    HomePage homePage = new HomePage(driver);
    openUrl("https://eatstreet.com/");
    homePage.getGoItBtn().click();
    homePage.addRestAnyCity().click();

    Assert.assertTrue(driver.getCurrentUrl().contains("phoenix-az"));
    }
}
