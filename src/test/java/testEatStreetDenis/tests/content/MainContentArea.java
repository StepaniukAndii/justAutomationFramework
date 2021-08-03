package testEatStreetDenis.tests.content;

import ClasesToAllUs.TestInit;
import junit.framework.Assert;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.content.LandingContentPage;

public class MainContentArea extends TestInit {

    LandingContentPage landingContentPage;

    @Test
    public void mainContent() {
        landingContentPage = new LandingContentPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        landingContentPage.acceptCookies().click();
        landingContentPage.liveChat().click();
        for (int i = 0; i < landingContentPage.howItWorks().size(); i++) {
            landingContentPage.howItWorks().get(i).sendKeys(landingContentPage.openNewTab());
        }
        //checking positive scenario for email
        emailScenarioCheckByEmailAndResult("dj1jfj1@gmail.com", "Thank You");
        //checking negative scenario
        emailScenarioCheckByEmailAndResult("sdsdwesdfw@gmail", "Whoops");
        for (int i = 0; i < 3; i++) {
            landingContentPage.countries().get(i).sendKeys(landingContentPage.openNewTab());
        }
    }

    private void emailScenarioCheckByEmailAndResult(String email, String headerResult) {
        landingContentPage.emailFieldInput().sendKeys(email);
        landingContentPage.submitBtn().click();

        Assert.assertEquals(headerResult, landingContentPage.modalWindowHeader().getText());

        landingContentPage.closeModalWindow().click();
    }
}
