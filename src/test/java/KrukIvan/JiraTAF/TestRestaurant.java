package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class TestRestaurant extends TestInit {
    @Test
    public void testRestaurant(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/berkeley-ca/restaurants/king-kong-chinese-restaurant");
        homePage.clickButtonGotIt().click();
        homePage.addFood().get(0).click();
    }
}
