package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.PagesDOU.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeader extends TestInit {

    @Test(priority = 1)
    public void testHeaderIsDisplayed() {
        HomePage homePage = new HomePage(driver);
        openUrl(BaseDate.BASE_URL_DOU);
        for (WebElement element : homePage.getHeaderButton()) {
            element.isDisplayed();
        }
        homePage.getSearchField().isDisplayed();
        homePage.getLoginLink().isDisplayed();
    }

    @Test(priority = 2)
    public void testHeaderFunctionality() {
        HomePage homePage = new HomePage(driver);
        openUrl(BaseDate.BASE_URL_DOU);
        for (int i = 1; i<homePage.getHeaderButton().size()-2;i++) {
            homePage.getHeaderButton().get(i).click();
        }
        homePage.getSearchField().click();
        homePage.getLoginLink().click();
    }

    @Test(priority = 0)
    public void testHeaderNames() {
        HomePage homePage = new HomePage(driver);
        openUrl(BaseDate.BASE_URL_DOU);
        Assert.assertEquals("ГЛАВНАЯ",homePage.getHeaderButton().get(1).getText());
        Assert.assertEquals("ФОРУМ",homePage.getHeaderButton().get(2).getText());
        Assert.assertEquals("ЛЕНТА",homePage.getHeaderButton().get(3).getText());
        Assert.assertEquals("ЗАРПЛАТЫ",homePage.getHeaderButton().get(4).getText());
        Assert.assertEquals("РАБОТА",homePage.getHeaderButton().get(5).getText());
        Assert.assertEquals("КАЛЕНДАРЬ",homePage.getHeaderButton().get(6).getText());
        Assert.assertEquals("YOUTUBE",homePage.getHeaderButton().get(7).getText());

    }
}