package SergKokan.Test;

import ClasesToAllUs.TestInit;
import SergKokan.Page.HomePage;
import SergKokan.Page.NoviyAccountRegistraciya;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPersonallAccount extends TestInit {
    @Test
    public void NoviyAccountRegistraciya(){
        HomePage homePage = new HomePage(driver);
        NoviyAccountRegistraciya noviyAccountRegistraciya = new NoviyAccountRegistraciya(driver);
        homePage.navigatePrego();
        homePage.PersonalAccount().click();
        noviyAccountRegistraciya.Registraciya().click();
        noviyAccountRegistraciya.VvodNomerTelefona().sendKeys("0674400057");
        noviyAccountRegistraciya.VvodEmail().sendKeys("kohan_sergey@ukr.net");
//        noviyAccountRegistraciya.closeModalWindow().click();
//        noviyAccountRegistraciya.closePopUp().click();
        Assert.assertTrue(noviyAccountRegistraciya.isDisplayedNoviyAccountRegistraciya().isDisplayed());
    }

}
