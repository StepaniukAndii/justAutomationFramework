package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeSiteLanguage extends TestInit {

    @Test
    public void testChangeSiteLanguage() {
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        homePage.getChangeRuLangBtn().click();
        Assert.assertEquals(homePage.getSignInRuText().getText(), "Войти");
        homePage.getChangeUaLangBtn().click();
        Assert.assertEquals(homePage.getSignInUaText().getText(), "Увійти");
    }
}
