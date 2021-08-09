package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogoBtn extends TestInit {

    @Test
    public void testLogoBtn() {
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        homePage.nowPopularList().get(0).click();
        homePage.behindTheRatingBtn().getText();
        Assert.assertEquals(homePage.behindTheRatingBtn().getText(), "За рейтингом");
        homePage.backOnHomePageLogoBtn().click();
        Assert.assertEquals(homePage.nowPopularText().getText(), "Зараз популярно");
    }
}
