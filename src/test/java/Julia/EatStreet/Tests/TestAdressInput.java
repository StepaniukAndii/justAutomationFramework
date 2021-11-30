package Julia.EatStreet.Tests;
import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestAdressInput extends TestInit {

    @Test
    public void testEatStreet1() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("new york");
        homePage.getFedBtn().click();
        sleep(5);
        homePage.getSelectPageRest();
        sleep(3);
        homePage.getSelect70Rest();
        Assert.assertTrue(homePage.restName().getText().contains("York City"));
    }
}
