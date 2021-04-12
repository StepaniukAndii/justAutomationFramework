package RozetkaSergey.TestsVijar;

import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import RozetkaSergey.VijarPages.VijarPages9_12;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteFromBasket extends TestInit {
    @Test
    public void deleteFromBasket(){
        VijarPages9_12 vijarPages9_12 =new VijarPages9_12(driver);
        vijarPages9_12.enterToVijar("https://viyar.ua/");
        vijarPages9_12.closeAdverb().click();
        vijarPages9_12.topBar2().click();
        vijarPages9_12.clickOnSamorezy().click();
        vijarPages9_12.closeAdverb().click();
        vijarPages9_12.getItems().get(0).click();
        vijarPages9_12.closeAdverb().click();
        vijarPages9_12.pickBuy().get(0).click();
        vijarPages9_12.pickBuy2().get(0).click();
        vijarPages9_12.ordering().click();
        vijarPages9_12.deliteItemFromBasket().click();
        String value = vijarPages9_12.getfromseitText().getText();
        Assert.assertEquals(value,"В вашей корзине ещё нет товаров.");
        sleep(1);
    }
   }
