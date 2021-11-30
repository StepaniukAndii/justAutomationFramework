package Julia.EatStreet.Test36_60;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckYourOrder extends TestInit {

    @Test
    public void checkYourOrder() {
        HomePage homePage =new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.getDeKalb().click();
        sleep(5);
        homePage.getViewAllRestDeKalb().click();
        sleep(5);
        homePage.clickFiltrSection().get(0).click();
        sleep(5);
        homePage.getAllRest().get(0).click();
        sleep(3);
        homePage.sectionMenu().get(12).click();
        sleep(5);
        homePage.selectOneDropDownWindow().get(1).click();
        sleep(5);
        homePage.btnAddToCard().click();
        sleep(10);
        homePage.sectionMenu().get(101).click();
        sleep(5);
        homePage.addThisItem().click();
        sleep(5);
        homePage.btnAddToCard().click();
        sleep(10);
        homePage.clickBtnProcesedToCheckout().click();
        sleep(5);
        Assert.assertTrue(driver.getCurrentUrl().contains("signin?next=~2Fcheckout~2Forder&nextState=checkout.delivery"));


    }
}
