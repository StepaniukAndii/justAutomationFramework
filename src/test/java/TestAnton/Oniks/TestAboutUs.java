package TestAnton.Oniks;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAboutUs extends TestInit {

    @Test
    public void testAboutUs(){
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.aboutUsBtnHeader().click();
        Assert.assertEquals(homePage.getTextOnAboutUsPage().getText(), "ЦЕННОСТИ ОНИКС");
    }
}
