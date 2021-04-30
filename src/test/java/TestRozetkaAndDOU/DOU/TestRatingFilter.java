package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.PagesDOU.HomePage;
import TestRozetkaAndDOU.DOU.PagesDOU.JobPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRatingFilter extends TestInit {

    @Test
    public void testRatingFilter() {
        HomePage homePage = new HomePage(driver);
        JobPage jobPage = new JobPage(driver);
        openUrl(BaseDate.BASE_URL_DOU);
        homePage.getHeaderButton().get(5).click();
        jobPage.getButtonsSubhead().get(4).click();
        jobPage.getRatingFilterCompensation().click();
        jobPage.getRatingFilterTotalScore().click();
        int totalScoreNumberBiggest = Integer.parseInt(jobPage.getRatingFilterTotalScoreNumbers().get(0).getText());
        for (int i = 0; i < 14; i++) {
            int totalScoreNumber = Integer.parseInt(jobPage.getRatingFilterTotalScoreNumbers().get(i).getText());
            if (totalScoreNumber > totalScoreNumberBiggest) {
                Assert.fail();
            }
        }
        sleep(4);
    }
}
