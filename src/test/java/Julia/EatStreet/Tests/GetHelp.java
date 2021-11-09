package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetHelp  extends TestInit {

    @Test
    public void getHelp() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnApplyNow().click();
        sleep(2);
        homePage.fieldApplyInYourCity().click();
        homePage.btnGetHelp().click();
        sleep(3);
        Assert.assertEquals(homePage.getHelpBot().getText(),"EatStreet Bot");

    }
}
