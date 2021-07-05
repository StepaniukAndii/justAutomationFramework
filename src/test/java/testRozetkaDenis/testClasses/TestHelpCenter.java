package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.HelpCenterPage;

public class TestHelpCenter extends TestInit {

    @Test
    public void helpCenter() {
        HelpCenterPage helpCenterPage = new HelpCenterPage(driver);
        openUrl("https://rozetka.com.ua/");
        helpCenterPage.openHelpCenter().click();
        openFAQ(helpCenterPage);
        openSupportInfo(helpCenterPage);
        helpCenterPage.supportInfo().get(0).click();
        paymentMainThemesOpen(helpCenterPage);
        paymentSubThemesOpen(helpCenterPage);
    }

    private void paymentSubThemesOpen(HelpCenterPage helpCenterPage) {
        for (int i = 0; i < helpCenterPage.paymentSubThemes().size(); i++) {
            helpCenterPage.paymentSubThemes().get(i).sendKeys(helpCenterPage.productPageFunctions().openNewTab());

        }
    }

    private void paymentMainThemesOpen(HelpCenterPage helpCenterPage) {
        for (int i = 0; i < helpCenterPage.paymentThemes().size(); i++) {
            helpCenterPage.paymentThemes().get(i).sendKeys(helpCenterPage.productPageFunctions().openNewTab());
        }
    }

    private void openSupportInfo(HelpCenterPage helpCenterPage) {
        for (int i = 0; i < helpCenterPage.supportInfo().size(); i++) {
            helpCenterPage.supportInfo().get(i).sendKeys(helpCenterPage.productPageFunctions().openNewTab());
        }
    }

    private void openFAQ(HelpCenterPage helpCenterPage) {
        for (int i = 0; i < helpCenterPage.faq1().size(); i++) {
            helpCenterPage.faq1().get(i).sendKeys(helpCenterPage.productPageFunctions().openNewTab());
        }
    }
}
