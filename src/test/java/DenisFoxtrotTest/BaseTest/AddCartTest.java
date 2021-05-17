package DenisFoxtrotTest.BaseTest;

import ClasesToAllUs.TestInit;
import DenisFoxtrotTest.TestClasses.HomePageFoxtrot;
import org.testng.annotations.Test;

public class AddCartTest extends TestInit {

    @Test
    public void AddFridgeToCart() {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        homePageFoxtrot.getSearch().sendKeys("Холодильники\n");
        homePageFoxtrot.findMerch().get(3).click();
        homePageFoxtrot.addToCart().click();
    }
}
