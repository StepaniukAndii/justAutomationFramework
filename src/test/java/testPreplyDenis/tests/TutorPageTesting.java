package testPreplyDenis.tests;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import testPreplyDenis.pages.LandingPage;
import testPreplyDenis.pages.ParticularTutorPage;

public class TutorPageTesting extends TestInit {

    LandingPage landingPage;
    ParticularTutorPage particularTutorPage;

    @Test
    public void tutorTest() {
        landingPage = new LandingPage(driver);
        particularTutorPage = new ParticularTutorPage(driver);
        openUrl("https://preply.com/en/tutor/337477"); //this tutor's page have all elements for proper testing
        for (int i = 0; i < particularTutorPage.aboutTutorSections().size(); i++) {
            particularTutorPage.aboutTutorSections().get(i).click();
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");

        for (int i = 0; i < particularTutorPage.moreInfo().size(); i++) {
            particularTutorPage.moreInfo().get(i).click();
        }

        js.executeScript("window.scrollBy(0,-10000)", "");

        for (int i = 0; i < particularTutorPage.resumeDetails().size(); i++) {
            particularTutorPage.resumeDetails().get(i).click();
        }
        particularTutorPage.bookTrialLessonBtn().click();
        driver.navigate().refresh();
        particularTutorPage.messageMeBtn().click();
        driver.navigate().refresh();
        particularTutorPage.saveToMyListBtn().click();
        driver.navigate().refresh();
    }
}
