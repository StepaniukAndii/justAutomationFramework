package TestRozetkaAndDOU.TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelpCentre extends TestInit {

    @Test
    public void testHelpCentre() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePage.getHeaderButton().get(0).click();
        homePage.getHelpCentre().click();
        homePage.getSearchFieldHelpCentre().sendKeys("оплата\n");
        String firstLink = homePage.getTextOnPgeHelpCenter().get(0).getText();
        homePage.getSearchFieldHelpCentre().clear();
        homePage.getSearchFieldHelpCentre().sendKeys("ОпЛаТа\n");
        String firstLink2 = homePage.getTextOnPgeHelpCenter().get(0).getText();
        if (!firstLink.equals(firstLink2)) {
            Assert.fail();
        }
    }
}
