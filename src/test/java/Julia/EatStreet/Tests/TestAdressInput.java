package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.annotations.Test;

public class TestAdressInput extends TestInit {

    private void novigateEatStreet() {
        driver.get("https://eatstreet.com/");
    }

    @Test
    public void testEatStreet1() {
        HomePage homePage = new HomePage(driver);
        novigateEatStreet();
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("Miami");
        homePage.getFedBtn().click();
        homePage.getFedBtn().click();
        sleep(5);

    }
}
