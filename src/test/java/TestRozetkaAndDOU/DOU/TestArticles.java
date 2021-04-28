package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.PagesDOU.ArticlesPage;
import TestRozetkaAndDOU.DOU.PagesDOU.HomePage;
import TestRozetkaAndDOU.DOU.PagesDOU.MainPageDOU;
import org.testng.annotations.Test;

public class TestArticles extends TestInit {

    @Test
    public void testSelectCategory() {
        openUrl(BaseDate.BASE_URL_DOU);
        HomePage homePage = new HomePage(driver);
        MainPageDOU mainPageDOU = new MainPageDOU(driver);
        ArticlesPage articlesPage = new ArticlesPage(driver);
        homePage.getHeaderButton().get(3).click();
        articlesPage.getCategory().isDisplayed();
        for (int i = 0; i < 8; i++) {
            articlesPage.getCategory().click();
            articlesPage.getCategoryChildren().get(i).click();
        }
        for (int i = 0; i < 4; i++) {
            mainPageDOU.getContentMenu().get(i).click();
        }
    }
}
