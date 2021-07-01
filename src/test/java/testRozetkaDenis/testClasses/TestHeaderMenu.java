package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.HeaderMenuPage;

public class TestHeaderMenu extends TestInit {

    @Test
    public void checkHeaderMenu() {
        HeaderMenuPage headerMenuPage = new HeaderMenuPage(driver);
        openUrl("https://rozetka.com.ua/");
        authentication(headerMenuPage);
        openMenu(headerMenuPage);
        headerMenuPage.premiumMenu().click();
        sleep(1); //for proper menu button load
        catalogueAndCart(headerMenuPage);
        closeModalMenu(headerMenuPage);
        openMenu(headerMenuPage);
        headerMenuPage.helpCenterMenu().sendKeys(headerMenuPage.productPageFunctions().openNewTab());
        headerMenuPage.phoneNumberMenu().sendKeys(headerMenuPage.productPageFunctions().openNewTab());
        languageChange(headerMenuPage);
        headerMenuPage.cityMenu().click();
        closeModalMenu(headerMenuPage);
        openMenu(headerMenuPage);
        partnersAndServicesOpen(headerMenuPage);
        sleep(1); //time for finding elements
        partnersAndServicesInfo(headerMenuPage);
        appStoreLinks(headerMenuPage);
        headerMenuPage.menuCloseMenu().click();
    }

    private void appStoreLinks(HeaderMenuPage headerMenuPage) {
        for (int i = 0; i < 2; i++) {
            headerMenuPage.appStoresMenu().get(0).sendKeys(headerMenuPage.productPageFunctions().openNewTab());
        }
    }

    private void partnersAndServicesInfo(HeaderMenuPage headerMenuPage) {
        for (int i = 0; i < headerMenuPage.infoMenu().size(); i++) {
            headerMenuPage.infoMenu().get(i).sendKeys(headerMenuPage.productPageFunctions().openNewTab());
        }
    }

    private void partnersAndServicesOpen(HeaderMenuPage headerMenuPage) {
        for (int i = 0; i < 2; i++) {
            headerMenuPage.chevronsMenu().click();
        }

    }

    private void languageChange(HeaderMenuPage headerMenuPage) {
        for (int i = 0; i < 2; i++) {
            headerMenuPage.languageMenu().click();
            sleep(1); //for proper menu button load
            openMenu(headerMenuPage);
        }
    }

    private void catalogueAndCart(HeaderMenuPage headerMenuPage) {
        for (int i = 0; i < 2; i++) {
            openMenu(headerMenuPage);
            headerMenuPage.catalogueAndCartMenu().get(i).click();
        }
    }

    private void authentication(HeaderMenuPage headerMenuPage) {
        for (int i = 0; i < 2; i++) {
            openMenu(headerMenuPage);
            headerMenuPage.authMenu().get(i).click();
            closeModalMenu(headerMenuPage);
        }
    }

    private void openMenu(HeaderMenuPage headerMenuPage) {
        headerMenuPage.headerPageFunctions().openMenu().click();
        sleep(1); //for proper element appearance
    }


    private void closeModalMenu(HeaderMenuPage headerMenuPage) {
        sleep(1); //proper modal work
        headerMenuPage.headerPageFunctions().modalMenuClose().click();
    }
}
