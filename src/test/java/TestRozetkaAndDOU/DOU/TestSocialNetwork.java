package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSocialNetwork extends TestInit {

    @Test
    public void testSocialNetwork() {
        openUrl(BaseDate.BASE_URL_DOU);
        HomePage homePage = new HomePage(driver);
        homePage.getHeaderButton().get(7).click();
        if (!driver.getCurrentUrl().contains("https://www.youtube.com/channel/UC6If-LcFxUDJhgL9dmB8oMA")) {
            Assert.fail("Youtube don't work on site");
        }
        driver.navigate().back();
        if (!driver.getCurrentUrl().contains(BaseDate.BASE_URL_DOU)) {
            Assert.fail();
        }
    }
}
