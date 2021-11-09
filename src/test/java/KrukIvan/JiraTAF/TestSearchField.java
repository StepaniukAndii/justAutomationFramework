package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class TestSearchField extends TestInit {
    @Test
    public void testSearchField(){
        HomePage homepage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com");
        homepage.clickButtonGotIt().click();
        homepage.writeAddress().sendKeys("iowa city ia \n" );
        homepage.bTNEnterAddress().click();
        homepage.bTNGetFed().click();
        sleep(5);
        homepage.searchField().sendKeys("abdawku \n");
        sleep(3);
        homepage.bTNLoadMoreRestaurants().click();
    }
}
