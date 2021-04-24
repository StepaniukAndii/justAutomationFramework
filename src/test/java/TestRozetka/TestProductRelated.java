package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class TestProductRelated extends TestInit {

    @Test
    public void testProductRelated() {
        HomePage homePage = new HomePage(driver);
        openUrl(BaseDate.BASE_URL);
        homePage.searchField().sendKeys(homePage.gools);
        pushBtnReturn();
        homePage.getElementsGoods().get(0).click();
        List<String> listTitle = getAttributeCollection(homePage.getLiteTile(),"title");
        for (int i = 0; i < 15; i++) {
            if (!listTitle.get(i).toLowerCase().contains("холодильник")) {
                Assert.fail();
            }
        }
    }
}