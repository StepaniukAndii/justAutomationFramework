package RozetkaSergey.TestKickStarter;

import ClasesToAllUs.TestInit;
import RozetkaSergey.KickstarterPages.KickstartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSwitchLanguage extends TestInit {
    @Test
    public void switchLanguage (){
        KickstartPage kickstartPage = new KickstartPage(driver);
        kickstartPage.enterToKickStarter("https://www.kickstarter.com/");
        moveMouseToElement(kickstartPage.switchLanguageButton());
        Select select = new Select(kickstartPage.switchLanguageButton());
        select.selectByVisibleText("Deutsch");
        String vas = driver.findElement(By.tagName("body")).getText().toLowerCase();
        boolean umlaut = vas.contains("ä");
        System.out.println(vas);
        Assert.assertEquals(umlaut, true);
        sleep(1);

    }
}
