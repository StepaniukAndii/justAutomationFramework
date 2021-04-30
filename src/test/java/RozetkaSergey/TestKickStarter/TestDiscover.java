package RozetkaSergey.TestKickStarter;

import ClasesToAllUs.TestInit;
import RozetkaSergey.KickstarterPages.KickstartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDiscover extends TestInit   {
    @Test
    public void discoverTest (){
        KickstartPage kickstartPage = new KickstartPage(driver);
        kickstartPage.enterToKickStarter("https://www.kickstarter.com/");
        kickstartPage.discoverButton().click();
        kickstartPage.designAndTechButton().click();
        boolean value = kickstartPage.listOfh3().get(0).getText().contains("Design");
        Assert.assertEquals(value,true);
    }
}
