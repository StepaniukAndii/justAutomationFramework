package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.HeaderPage;

public class TestHeader extends TestInit {

    @Test
    public void header() {
        HeaderPage headerPage = new HeaderPage(driver);
        openUrl("https://rozetka.com.ua/");
        headerPage.logo().click();
        headerPage.ad().click();
        headerPage.catalogue().click();
        headerPage.searchRozetka().sendKeys("Search is good.");
        headerPage.microphone().click();
        headerPage.findButton().click();
        changeLanguage(headerPage);
        premiumCheck(headerPage);
        openAuthAndCart(headerPage);
    }

    private void openAuthAndCart(HeaderPage headerPage) {
        for (int i = 0; i < 2; i++) {
            headerPage.authAndCart().get(i).click();
            headerPage.modalMenuClose().click();
        }
    }

    private void premiumCheck(HeaderPage headerPage) {
        headerPage.premium().click();
        driver.navigate().refresh();
    }

    private void changeLanguage(HeaderPage headerPage) {
        for (int i = 0; i < 2; i++) {
            headerPage.langChange().click();
        }
    }
}
