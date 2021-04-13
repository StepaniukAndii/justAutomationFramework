package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TesFilterTile extends TestInit {

    @Test
    public void tesFilterTile() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.ua");
        homePage.searchFild().sendKeys("телефон\n");
        homePage.getButtonFilterLittleTile().click();
        int sizeLittleBloc = homePage.getElementsGoods().get(0).getSize().height;
        homePage.getButtonFilterBigTile().click();
        int sizeBigBloc = homePage.getElementsGoods().get(0).getSize().height;
        if (sizeLittleBloc>sizeBigBloc) {
            Assert.fail();
        }
    }
}
