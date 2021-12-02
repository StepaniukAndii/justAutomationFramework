package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.Header;
import TestVanek.EatStreet.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAppearCartStartPage extends TestInit {
    Header header;
    @Test
    public void testAppearCartStartPage(){
        header = new Header(driver);
        openUrl("https://eatstreet.com/");
        header.cart().click();
        Assert.assertTrue(header.cartOptionBtn().isDisplayed());
    }
}
