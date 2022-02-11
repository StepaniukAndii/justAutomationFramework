package YevtushenkoVova.Tests;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.JustEat;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JustEatTest extends TestInit {

    @Test
    public void noValid() {
        JustEat justEat = new JustEat(driver);
        justEat.openJustEat();
        justEat.banerCity().click();
        justEat.btnSinIn().click();
        justEat.inputEmail().sendKeys("fwiefj@564");
        justEat.inputPassword().sendKeys("wefwgwg");
        justEat.btnLogin().click();

        Assert.assertTrue(justEat.error().isDisplayed());
    }
}
