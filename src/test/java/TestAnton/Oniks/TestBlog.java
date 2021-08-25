package TestAnton.Oniks;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBlog extends TestInit {

    @Test
    public void testBlog(){
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.getBlogBtn().click();
        Assert.assertEquals(homePage.getAboutShopText().getText(), "О магазине");
    }
}