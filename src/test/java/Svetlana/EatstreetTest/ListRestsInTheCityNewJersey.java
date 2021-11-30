package Svetlana.EatstreetTest;
import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.AllRestsPage;
import Svetlana.EatstreetPage.HomePage;
import Svetlana.EatstreetPage.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListRestsInTheCityNewJersey extends TestInit {

    @Test
    public void listRestsInTheCityNewJersey(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getFedBtn().click();
        homePage.getAddressInput().sendKeys("New York");
        homePage.checkPopup();
        homePage.getFedBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.pressGoItBtn().click();
        AllRestsPage allRestsPage=new AllRestsPage(driver);
        Assert.assertTrue(allRestsPage.checkAllRests().isDisplayed());
    }
}


