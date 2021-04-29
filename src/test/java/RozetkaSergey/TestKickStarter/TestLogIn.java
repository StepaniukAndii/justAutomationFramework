package RozetkaSergey.TestKickStarter;

import ClasesToAllUs.TestInit;
import RozetkaSergey.KickstarterPages.KickstartPage;
import org.testng.annotations.Test;

public class TestLogIn extends TestInit {
    String login = "grinred69@gmail.com";
    String pass = "23112010Ki";

    @Test
    public void logIn() {
        KickstartPage kickstartPage = new KickstartPage(driver);
        kickstartPage.enterToKickStarter("https://www.kickstarter.com/");
        kickstartPage.loginButton().click();
        kickstartPage.loginField().sendKeys(login);
        kickstartPage.passField().sendKeys(pass);
        enter();
        kickstartPage.logoImageButton().click();
        kickstartPage.logoOut().get(1).click();
        sleep(1);
    }
}
