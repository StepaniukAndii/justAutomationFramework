package RozetkaSergey.TestKickStarter;

import ClasesToAllUs.TestInit;
import RozetkaSergey.KickstarterPages.KickstartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class TestSearchMenu extends TestInit {

    @Test
    public void searchMenu() {
        KickstartPage kickstartPage = new KickstartPage(driver);
        kickstartPage.enterToKickStarter("https://www.kickstarter.com/");
        kickstartPage.searchButton().click();
        kickstartPage.searchField().sendKeys("bike");
        enter();
        String vas = driver.findElement(By.tagName("body")).getText().toLowerCase();
        boolean bike = vas.contains("bike");
        Assert.assertEquals(bike, true);
    }
}
