package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.PagesDOU.HomePage;
import TestRozetkaAndDOU.DOU.PagesDOU.JobPage;
import org.testng.annotations.Test;

public class TestFirstJobOnJobPage extends TestInit {

    @Test
    public void testFirstJobOnJobPage() {
        openUrl(BaseDate.BASE_URL_DOU);
        HomePage homePage = new HomePage(driver);
        JobPage jobPage = new JobPage(driver);
        homePage.getHeaderButton().get(5).click();
        jobPage.getButtonsSubhead().get(1).click();
        for (int i = 1; i < 19; i++) {
            jobPage.getFirstJobCities().get(i).isDisplayed();
            jobPage.getFirstJobCities().get(i).click();
        }
    }
}