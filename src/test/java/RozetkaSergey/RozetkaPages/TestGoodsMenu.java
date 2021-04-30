package RozetkaSergey.RozetkaPages;

import ClasesToAllUs.TestInit;
import RozetkaSergey.KickstarterPages.KickstartPage;
import org.testng.annotations.Test;

public class TestGoodsMenu extends TestInit {
    int[] digit = {0, 2, 3, 4, 5};

    @Test
    public void goodsMenu() {

        KickstartPage kickstartPage = new KickstartPage(driver);
        kickstartPage.enterToKickStarter("https://www.kickstarter.com/");
        kickstartPage.listElementsOfTopMenu().get(2).click();
        kickstartPage.someElementFromPage().click();
        int[] digit = {0, 2, 3, 4, 5};
        for (int i = 0; i < digit.length; i++) {
            kickstartPage.listOfBottomMenu().get(digit[i]).click();
        }
    }
}
