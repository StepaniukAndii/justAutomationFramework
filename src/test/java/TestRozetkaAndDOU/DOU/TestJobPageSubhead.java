package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.PagesDOU.HomePage;
import TestRozetkaAndDOU.DOU.PagesDOU.JobPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestJobPageSubhead extends TestInit {

    @Test
    public void testJobPageSubhead() {
        openUrl(BaseDate.BASE_URL_DOU);
        HomePage homePage = new HomePage(driver);
        JobPage jobPage = new JobPage(driver);
        homePage.getHeaderButton().get(5).click();
        for (WebElement element : jobPage.getButtonsSubhead()) {
            element.isDisplayed();
        }
        jobPage.getSearch().isDisplayed();
        jobPage.getCategory().isDisplayed();
        jobPage.getButtonFind().isDisplayed();
    }
}
