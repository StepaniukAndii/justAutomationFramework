package RozetkaSergey.TestKickStarter;

import ClasesToAllUs.TestInit;
import RozetkaSergey.KickstarterPages.KickstartPage;
import RozetkaSergey.RozetkaPages.RozetkaPages1_4;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class TestTopMenu extends TestInit {


    @Test
    public void topMenu () throws InterruptedException {
        KickstartPage kickstartPage = new KickstartPage(driver);
        kickstartPage.enterToKickStarter("https://www.kickstarter.com/");
        littleTripThrowMenu();
        sleep(1);
    }

    public void littleTripThrowMenu () throws InterruptedException {
        KickstartPage kickstartPage = new KickstartPage(driver);
        int i;
        boolean isPresent;

        for (i=0; i < kickstartPage.listElementsOfTopMenu().size(); i++){
            if (isPresent = kickstartPage.listElementsOfTopMenu().get(i).isDisplayed()) {
                Assert.assertEquals(isPresent,true);
            }
            Actions actions = new Actions(driver);
            actions.moveToElement(kickstartPage.listElementsOfTopMenu().get(i)).perform();
        }
    }
}
