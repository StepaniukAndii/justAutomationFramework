package Julia.EatStreet.Test36_60;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckLogin extends TestInit {

    @Test
    public void checkBaltimoreRest(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.getBaltimoreCity().click();
        homePage.getViewAllRestBaltimoreCity().click();

        Assert.assertTrue(homePage.getBaltimoreTitle().isDisplayed());
    }

    @Test
    public void checkLogin(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.clickSignInBtn().click();
        homePage.enterEmailField().sendKeys("y.tymoshenko5@gmail.com");
        homePage.enterPassField().sendKeys("Yli123456");
        homePage.btnSingIn().click();

        Assert.assertEquals(homePage.isIncorrectText().getText(),"The login information you entered is incorrect.");
    }

    @Test
    public  void checkRestHouston() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("Houston, TX");
        homePage.getFedBtn().click();
        homePage.checkAndClouseAdressSearchAttempt();
        homePage.getAllRest().get(3).click();

        Assert.assertTrue(homePage.getRestInHouston().isDisplayed());
    }
}
