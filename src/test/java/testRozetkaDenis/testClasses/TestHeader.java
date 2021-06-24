package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.HeaderPage;

public class TestHeader extends TestInit {

    @Test
    public void header() {
        HeaderPage hp = new HeaderPage(driver);
        openUrl("https://rozetka.com.ua/");
        hp.logo().click();
        hp.ad().click();
        hp.catalogue().click();
        hp.searchRozetka().sendKeys("Search is good.");
        hp.microphone().click();
        hp.findButton().click();
        for (int i = 0; i < 2; i++) {
            hp.langChange().click();
        }
        hp.premium().click();
        for (int i = 0; i < 2; i++) {
            sleep(1); //for elements presence
            hp.authAndCart().get(i).click();
            hp.modalMenuClose().click();
            sleep(1); //for modal window
        }
    }
}
