package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddressField extends TestInit {
    @Test
    public void testAddressField(){
        HomePage homepage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com");
        homepage.clickButtonGotIt().click();
        homepage.writeAddress().sendKeys("aawdwad \n" );
        homepage.bTNEnterAddress().click();
        homepage.bTNGetFed().click();
        sleep(3);
        Assert.assertTrue(homepage.assertBTNAddress().isDisplayed());
    }
}
