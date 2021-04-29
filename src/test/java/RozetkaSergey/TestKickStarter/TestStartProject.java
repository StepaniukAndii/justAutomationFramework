package RozetkaSergey.TestKickStarter;

import ClasesToAllUs.TestInit;
import RozetkaSergey.KickstarterPages.KickstartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStartProject extends TestInit {
    String str2 = "Describe what you’ll be creating.";

    @Test
    public void startProject() {
        KickstartPage kickstartPage = new KickstartPage(driver);
        kickstartPage.enterToKickStarter("https://www.kickstarter.com/");
        kickstartPage.startProjectButton().click();
        kickstartPage.startProjectButtomAnother().click();
        kickstartPage.chooseAProject().click();
        kickstartPage.designButton().click();
        kickstartPage.nextButton().click();
        String str = kickstartPage.describeTest().getText();
        Assert.assertEquals(str, str2);
    }
}
