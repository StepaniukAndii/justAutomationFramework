package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.PagesDOU.HomePage;
import TestRozetkaAndDOU.DOU.PagesDOU.JobPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchOnJobPage extends TestInit {

    String inputInSearchFieldFirst = "QA Automation";
    String inputInSearchFieldSecond = "Automation QA";

    @Test
    public void testSearchOnJobPage() {
        HomePage homePage = new HomePage(driver);
        JobPage jobPage = new JobPage(driver);
        openUrl(BaseDate.BASE_URL_DOU);
        homePage.getHeaderButton().get(5).click();
        jobPage.getSearch().sendKeys(inputInSearchFieldFirst);
        pushBtnReturn();
        String firstVacancy = jobPage.getVacancies().get(0).getText();
        jobPage.getSearch().clear();
        jobPage.getSearch().sendKeys(inputInSearchFieldSecond);
        pushBtnReturn();
        if (!firstVacancy.contains(jobPage.getVacancies().get(0).getText())) {
            Assert.fail();
        }
    }
}