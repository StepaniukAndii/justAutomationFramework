package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.FooterPage;

public class TestFooter extends TestInit {

    @Test
    public void footer() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        FooterPage footerPage = new FooterPage(driver);
        openUrl("https://rozetka.com.ua/");
        footerPage.headerPageFunctions().searchRozetka().sendKeys("Xiaomi redmi\n");
        sleep(1); //for proper ad load
        disableAdInRozetka(footerPage.productPageFunctions());
        jse.executeScript("scroll(0, 11100);");
        footerPage.callCenterGraphics().sendKeys(footerPage.productPageFunctions().openNewTab());
        footerInfoOpen(footerPage);
        footerAppsOpen(footerPage);
        footerPaymentsOpen(footerPage);
        footerSocialsOpen(footerPage);
    }

    private void footerSocialsOpen(FooterPage footerPage) {
        for (int i = 0; i < footerPage.footerSocials().size(); i++) {
            footerPage.footerSocials().get(i).click(); //This method should be ALWAYS last because of incapability of creating new tab
        }
    }

    private void footerPaymentsOpen(FooterPage footerPage) {
        for (int i = 0; i < footerPage.footerPayments().size(); i++) {
            footerPage.footerPayments().get(i).click();
            sleep(1); //for proper modal window load
            footerPage.headerPageFunctions().modalMenuClose().click();
        }
    }

    private void footerAppsOpen(FooterPage footerPage) {
        for (int i = 0; i < footerPage.footerApps().size(); i++) {
            footerPage.footerApps().get(i).sendKeys(footerPage.productPageFunctions().openNewTab());
        }
    }

    private void footerInfoOpen(FooterPage footerPage) {
        for (int i = 0; i < footerPage.footerInfo().size(); i++) {
            footerPage.footerInfo().get(i).sendKeys(footerPage.productPageFunctions().openNewTab());
        }
    }
}
