package RozetkaSergey.TestsVijar;

import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import RozetkaSergey.VijarPages.VijarPages9_12;
import org.testng.annotations.Test;

public class AddItemToBasket extends TestInit {
    @Test
    public void addItemToBasket (){
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
    }
}
