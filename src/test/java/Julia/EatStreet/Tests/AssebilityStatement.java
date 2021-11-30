package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.BoiaPage;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssebilityStatement extends TestInit {

    @Test
    public void assebilityStatement() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnAssebilityStatement().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("accessibility"));
    }

    @Test
    public void checkLinkAssebilityStatement() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnAssebilityStatement().click();
        homePage.getLinkInTextAssebilityStatement().click();
        homePage.goToTheSecondWindowTab(driver, 10);
        BoiaPage boiaPage = new BoiaPage(driver);
        boiaPage.enterYourSite().sendKeys("eatstreet.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("boia"));
    }
    @Test
    public void checkBoiaAssebilityStatement() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnAssebilityStatement().click();
        homePage.getLinkInTextAssebilityStatement().click();
        homePage.goToTheSecondWindowTab(driver, 10);
        BoiaPage boiaPage = new BoiaPage(driver);
        boiaPage.enterYourSite().sendKeys("eatstreet.com");
        boiaPage.clickSubmit().click();
        boiaPage.enterFieldBoiaSite().get(1).sendKeys("Tymoshenko");
        boiaPage.enterFieldBoiaSite().get(2).sendKeys("Yulia");
        boiaPage.enterFieldBoiaSite().get(3).sendKeys("tymoshenko@gmail.com");
        boiaPage.enterSubmit().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("eatstreet.com"));
    }
}
