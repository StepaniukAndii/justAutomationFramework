package DenisFoxtrotTest.BaseTest;

import ClasesToAllUs.TestInit;
import DenisFoxtrotTest.TestClasses.HomePageFoxtrot;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.Random;

public class AddCartTest extends TestInit {

    @Test
    public void AddFridgeToCart() throws AWTException {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        homePageFoxtrot.getSearch().sendKeys("Холодильники\n");
        Random rand = new Random();
        int upperbound = 4;
        int p = rand.nextInt(upperbound);
        for (int i = 0; i < 3; i++) {
            for (int m = 0; m < 5; m++) {
                homePageFoxtrot.findMerch().get(m).click();
                homePageFoxtrot.addToCart().click();
                driver.navigate().back();
                p++;
                sleep(2);
            }
            homePageFoxtrot.nextPage().click();
            sleep(2);
        }

    }
}
