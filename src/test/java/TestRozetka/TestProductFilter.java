package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import org.testng.annotations.Test;

public class TestProductFilter extends TestInit {

    @Test
    public void testProductFilter() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePage.searchField().click();
        homePage.searchField().sendKeys(homePage.gools+"\n");
        System.out.println(homePage.getElementsGoods());
        homePage.getElementsGoods().get(0).click();
        for (int i = 1; i < homePage.getProductHeading().size(); i++) {
            homePage.getButtonProductFilter().get(i).click();
        }
    }
}
