package RozetkaSergey.TestKickStarter;

import ClasesToAllUs.TestInit;
import RozetkaSergey.KickstarterPages.KickstartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckLinksBelow extends TestInit {
    @Test
    public void checkLinksBelow (){
        KickstartPage kickstartPage = new KickstartPage(driver);
        kickstartPage.enterToKickStarter("https://www.kickstarter.com/");
        moveMouseToElement(kickstartPage.listOfSocialNetworks().get(0));
        kickstartPage.listOfSocialNetworks().get(0).click();
        String url = driver.getCurrentUrl();
        boolean ss = url.contains("facebook");
        Assert.assertEquals(ss,true);
        driver.navigate().back();
        kickstartPage.listOfSocialNetworks().get(1).click();
        url = driver.getCurrentUrl();
        ss = url.contains("instagram");
        System.out.println(url);
        Assert.assertEquals(ss,true);
        sleep(1);
    }
}
