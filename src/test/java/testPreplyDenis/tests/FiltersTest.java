package testPreplyDenis.tests;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testPreplyDenis.pages.LandingPage;
import testPreplyDenis.pages.TutorsPage;

public class FiltersTest extends TestInit {

    LandingPage landingPage;
    TutorsPage tutorsPage;

    @Test
    public void filtersTest() {
        landingPage = new LandingPage(driver);
        tutorsPage = new TutorsPage(driver);
        openUrl("https://preply.com/");
        landingPage.preplySearchField().sendKeys("English");
        landingPage.submitBtn().click();
        tutorsPage.readMore().click();
        tutorsPage.languageToLearn().click();
        tutorsPage.selectLanguageToLearn().get(4).click();
        tutorsPage.particularTutorsFilters().get(0).click();
        driver.navigate().refresh();
        tutorsPage.particularTutorsFilters().get(1).click();
        for (int i = 0; i < 5; i++) {
            tutorsPage.tutorCountryCheckboxes().get(i).click();
        }
        driver.navigate().refresh();
        tutorsPage.particularTutorsFilters().get(2).click();
        for (int i = 0; i < tutorsPage.chooseTimeForLessons().size(); i++) {
            tutorsPage.chooseTimeForLessons().get(i).click();
        }
        for (int i = 0; i < tutorsPage.chooseDaysForLessons().size(); i++) {
            tutorsPage.chooseDaysForLessons().get(i).click();
        }
        driver.navigate().refresh();
        tutorsPage.specialitiesSelect().click();
        for (int i = 0; i < 3; i++) {
            tutorsPage.specialitiesCheckboxes().get(i).click();
        }
        driver.navigate().refresh();
        tutorsPage.alsoSpeaksSelect().click();
        for (int i = 0; i < 3; i++) {
            tutorsPage.alsoSpeaksCheckboxes().get(i).click();
        }
        driver.navigate().refresh();
        tutorsPage.nativeSpeakerSelect().click();
        tutorsPage.nativeSpeakerOnly().click();
        driver.navigate().refresh();
        tutorsPage.sortingSelect().click();
        for (int i = 0; i < tutorsPage.sortBy().size(); i++) {
            tutorsPage.sortBy().get(i).click();
        }
        driver.navigate().refresh();
    }
}
