package RozetkaSergey.TestKickStarter;

import ClasesToAllUs.TestInit;
import RozetkaSergey.KickstarterPages.KickstartPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeСurrency extends TestInit {
    @Test
    public void helpCenter (){
        KickstartPage kickstartPage = new KickstartPage(driver);
        kickstartPage.enterToKickStarter("https://www.kickstarter.com/");
        kickstartPage.listElementsOfTopMenu().get(2).click();
        kickstartPage.someElementFromPage().click();
        boolean firstValue = kickstartPage.priceList().get(1).getText().contains("$");
        Assert.assertEquals(true,firstValue);
        Select select = new Select(kickstartPage.switchMoneyButton());
        select.selectByValue("EUR");
        kickstartPage.continueButton().click();
        boolean secondValue = kickstartPage.priceList().get(0).getText().contains("€");
        Assert.assertEquals(secondValue, true);
    }
}
