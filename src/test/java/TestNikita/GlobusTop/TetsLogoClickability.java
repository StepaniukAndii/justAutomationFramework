package TestNikita.GlobusTop;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TetsLogoClickability extends TestInit {
    @Test
    public void testLogoClick() {
        GlobusPage homePage = new GlobusPage(driver);
        driver.get("https://globus.top/uk");
        homePage.logoClick().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://globus.top/uk");
        driver.quit();
    }

}
