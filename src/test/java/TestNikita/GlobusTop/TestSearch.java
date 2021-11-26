package TestNikita.GlobusTop;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends TestInit {
    @Test
    public void testSearch(){
        GlobusPage homePage = new GlobusPage(driver);
        openUrl("https://globus.top/uk");
        homePage.searchField().click();
        homePage.searchField().sendKeys("Кава");
        enter();
        Assert.assertEquals(getTextFromXpath(homePage.getElemTextOnPage()), "Кава");
        homePage.clickLogoToReturn().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://globus.top/uk");
    }
    @Test
    public void negativeSearchResultTest(){
        GlobusPage homePage = new GlobusPage(driver);
        openUrl("https://globus.top/uk");
        homePage.searchField().click();
        homePage.searchField().sendKeys("12334");
        enter();
        Assert.assertEquals(getTextFromXpath(homePage.wrongSearchMessageGetText()), "Не знайдено жодного товару");
        homePage.clickLogoToReturn().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://globus.top/uk");
    }
}
