package Svetlana.EatstreetTest;
import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.AllRestsPage;
import Svetlana.EatstreetPage.HomePage;
import Svetlana.EatstreetPage.RestPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class MedisonTests extends TestInit {



//    @Test
//    public void testOpenCityMedison() {
//        driver.get("https://eatstreet.com");
//        HomePage homePage=new HomePage(driver);
//        homePage.getAddressInput().sendKeys("Medison");
//        homePage.getPressFedBtn().click();
//        Assert.assertTrue(homePage.getH1().getText().contains("Medison"));
//    }
    @Test
    public void listRestsFirst() {
        driver.get("https://eatstreet.com");
        HomePage homePage = new HomePage(driver);
        homePage.getAddressInput().sendKeys("Medison");
        homePage.getFedBtn().click();
        homePage.checkPopup();
        homePage.getFedBtn().click();
        driver.manage().window().fullscreen();
        AllRestsPage allRestsPage= new AllRestsPage(driver);
        allRestsPage.getAllRests().get(2).click();
        RestPage restPage= new RestPage(driver);
        sleep(3);
        Assert.assertTrue(restPage.nameOfRest().isDisplayed());
}
}

