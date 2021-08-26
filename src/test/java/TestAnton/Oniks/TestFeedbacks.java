package TestAnton.Oniks;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFeedbacks extends TestInit {

    @Test
    public void testFeedbacks(){
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.getFeedbacksBtn().click();
        Assert.assertEquals(homePage.getFeedbacksText().getText(), "Отзывы");
    }
}