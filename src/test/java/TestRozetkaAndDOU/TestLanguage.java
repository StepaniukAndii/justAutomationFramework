package TestRozetkaAndDOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.DOU.PagesDOU.HomePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestLanguage extends TestInit {

    @Test
    public void testLanguageDOU() {
        openUrl(BaseDate.BASE_URL_DOU);
        HomePage homePage = new HomePage(driver);
        homePage.getLanguage().get(1).click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.getHeaderButton().get(1).getText(),"HOME");
        softAssert.assertEquals(homePage.getHeaderButton().get(2).getText(),"FORUM");
        softAssert.assertEquals(homePage.getHeaderButton().get(3).getText(),"ARTICLES");
        softAssert.assertEquals(homePage.getHeaderButton().get(4).getText(),"SALARIES");
        softAssert.assertEquals(homePage.getHeaderButton().get(5).getText(),"JOBS");
        softAssert.assertAll();
    }
}
