package Svetlana.EatstreetTest;
import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.AllRestsPage;
import Svetlana.EatstreetPage.HomePage;
import Svetlana.EatstreetPage.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiltrationTestTakeoutOpenNow extends TestInit {
    @Test
    public void filtrationTestTakeoutOpenNow() {
        driver.get("https://eatstreet.com");
        HomePage homePage = new HomePage(driver);
        homePage.getFedBtn().click();
        homePage.getAddressInput().sendKeys("New York");
        homePage.checkPopup();
        homePage.getFedBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.pressGoItBtn().click();
        AllRestsPage allRestsPage = new AllRestsPage(driver);
        allRestsPage.getTypeOfPurchase().get(1).click();
        allRestsPage.getOpenNow().click();

        Assert.assertTrue(allRestsPage.checkOpenNow().isDisplayed());
    }
}
