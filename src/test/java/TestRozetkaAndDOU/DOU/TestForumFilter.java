package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.Pages.ForumPage;
import TestRozetkaAndDOU.DOU.Pages.MainPageDOU;
import TestRozetkaAndDOU.DOU.PagesDOU.HomePage;
import org.testng.annotations.Test;

public class TestForumFilter extends TestInit {

    @Test
    public void testForumFilter() {
        openUrl(BaseDate.BASE_URL_DOU);
        HomePage homePage = new HomePage(driver);
        MainPageDOU mainPageDOU = new MainPageDOU(driver);
        ForumPage forumPage = new ForumPage(driver);
        homePage.getHeaderButton().get(2).click();
        for (int i = 1; i < 4; i++) {
            mainPageDOU.getContentMenu().get(i).click();
        }
        mainPageDOU.getContentMenu().get(0).click();
        for (int i = 0; i < forumPage.getSelectTopicChildren().size(); i++) {
            forumPage.getSelectTopic().click();
            forumPage.getSelectTopicChildren().get(i).click();
        }


    }
}