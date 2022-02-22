package YevtushenkoVova.Tests;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.Allo;
import YevtushenkoVova.Pages.AlloSale;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlloTest extends TestInit {

    @Test
    public void voidEmailSignIn(){
        Allo allo = new Allo(driver);
        openUrl("https://allo.ua/");
        allo.btnProFile().click();
        sleep(2);
        allo.btnSignIn().click();

        Assert.assertTrue(allo.fieldIsRequired().isDisplayed());
    }

    @Test
    public void qqq(){
        openUrl("https://allo.ua/");
        Allo allo = new Allo(driver);
        allo.btnSale().click();

        allo.getAlloSale().btnPresent().click();
        sleep(2);

        Assert.assertEquals(driver.getCurrentUrl(),"https://allo.ua/ua/events-and-discounts/type-1/");
    }
}
