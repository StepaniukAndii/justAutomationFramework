package SergKokan.Test;

import ClasesToAllUs.TestInit;
import SergKokan.Page.DostavkaPage;
import SergKokan.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLinkDostavka extends TestInit {
    @Test
    public void LinkDostavka(){
        HomePage homePage = new HomePage(driver);
        DostavkaPage dostavkaPage = new DostavkaPage(driver);
        openUrl("https://prego.ua/");
        homePage.Dostavka().click();
        Assert.assertTrue(dostavkaPage.isDisplayedTextDostavka());


    }


}
