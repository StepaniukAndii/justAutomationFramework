package TestNikita.GlobusTop;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTest extends TestInit {
    @Test
    public void testFilter() {
        GlobusPage homePage = new GlobusPage(driver);
        openUrl("https://globus.top/uk");
        homePage.catalogOnMainPage().click();
        homePage.insideFilterElemComp().click();
        Assert.assertEquals(getTextFromXpath(homePage.getElemTextOnPage()), "Комп’ютери та периферія");
        homePage.clickLogoToReturn().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://globus.top/uk");
    }
}


