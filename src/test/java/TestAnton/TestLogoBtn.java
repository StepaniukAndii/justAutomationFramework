package TestAnton;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class TestLogoBtn extends TestInit {
    @Test
    public void testLogoBtn() {
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.aboutUsBtnHeader().click();
        homePage.homePageLogoBtn().click();
    }
}
