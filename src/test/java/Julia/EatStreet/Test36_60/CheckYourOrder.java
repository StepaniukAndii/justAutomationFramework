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
        homePage.getViewAllRestDeKalb().click();
        homePage.clickFiltrSection().get(0).click();
        homePage.getAllRest().get(0).click();
        homePage.sectionMenu().get(12).click();
        homePage.btnAddToCard().click();
        homePage.sectionMenu().get(50).click();
        homePage.addThisItem().click();
        homePage.btnAddToCard().click();
        homePage.clickBtnProcesedToCheckout().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("signin?next=~2Fcheckout~2Forder&nextState=checkout.delivery"));
    }
}
