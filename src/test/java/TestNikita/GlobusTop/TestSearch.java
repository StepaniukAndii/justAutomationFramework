package TestNikita.GlobusTop;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends TestInit {
    @Test
    public void testSearch() {
        GlobusPage homePage = new GlobusPage(driver);
        driver.get("https://globus.top/uk");
        homePage.searchField().click();
        homePage.searchField().sendKeys("Кофе");
        enter();
        homePage.backToHomePageWiaLogo().click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://globus.top/uk");
        driver.quit();
    }
}
