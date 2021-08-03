package testEatStreetDenis.tests.footer.support;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.footer.SupportPage;

public class GetHelpTest extends TestInit {

    SupportPage supportPage;

    @Test
    public void getHelp() {
        supportPage = new SupportPage(driver);
        openUrl("https://qa2.eatstreet.com/support-request-modal");

        supportPage.getHelpFirstName().sendKeys("First");
        supportPage.getHelpLastName().sendKeys("Last");
        supportPage.getHelpEmail().sendKeys("sg@gmail.com");
        supportPage.getHelpPhone().sendKeys("16505130514");
        supportPage.getHelpMessage().sendKeys("Test Message");
        supportPage.submit().click();
        supportPage.getHelpSubject().click();
        supportPage.getHelpSubjectList().get(2).click();
        supportPage.getHelpChargeAmount().sendKeys("300.00");
        supportPage.getHelpChargeDate().sendKeys("12/23/2020");
        supportPage.getHelpNameOnCard().sendKeys("Name");
        supportPage.landingContentPage().acceptCookies().click();
        supportPage.submit().click();
    }
}
