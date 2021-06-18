package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.HeaderMenuPage;
import testRozetkaDenis.pages.HeaderPage;

import java.awt.*;

public class TestHeaderMenu extends TestInit {

    @Test
    public void checkHeaderMenu() throws AWTException {
        HeaderMenuPage hmp = new HeaderMenuPage(driver);
        HeaderPage hp = new HeaderPage(driver);
        openUrl("https://rozetka.com.ua/");
        Robot robot = new Robot();
        String openNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        for (int i = 0; i < 2; i++) {
            openMenu();
            hmp.authMenu().get(i).click();
            modalMenu();
        }
        openMenu();
        hmp.premiumMenu().click();
        sleep(1); //for proper menu button load
        for (int i = 0; i < 2; i++) {
            openMenu();
            hmp.catalogueAndCartMenu().get(i).click();
        }
        modalMenu();
        openMenu();
        hmp.helpCenterMenu().sendKeys(openNewTab);
        hmp.phoneNumberMenu().sendKeys(openNewTab);
        for (int i = 0; i < 2; i++) {
            hmp.languageMenu().click();
            sleep(1); //for proper menu button load
            openMenu();
        }
        hmp.cityMenu().click();
        modalMenu();
        openMenu();
        for (int i = 0; i < 2; i++) {
            hmp.chevronsMenu().click();
        }
        int size = hmp.infoMenu().size();
        for (int i = 0; i < size; i++) {
           hmp.infoMenu().get(i).sendKeys(openNewTab);
        }
        for (int i = 0; i < 2; i++) {
            hmp.appStoresMenu().get(0).sendKeys(openNewTab);
        }

        hmp.menuCloseMenu().click();
    }

    private void openMenu() {
        HeaderPage hp = new HeaderPage(driver);
        hp.openMenu().click();
        sleep(1); //for proper element appearance
    }

    private void modalMenu() {
        HeaderPage hp = new HeaderPage(driver);
        sleep(1); //proper modal work
        hp.modalMenuClose().click();
    }
}
