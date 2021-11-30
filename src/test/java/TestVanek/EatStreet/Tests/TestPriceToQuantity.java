package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.OrderOptionsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPriceToQuantity extends TestInit {
    OrderOptionsPage orderOptionsPage;

    @Test
    public void testPriceToQuantity(){
        openUrl("https://eatstreet.com/chicago-il/restaurants/ameer-kabob/options/6409580");
        orderOptionsPage = new OrderOptionsPage(driver);
        for(int i = 0; i <= 2; i++){
        orderOptionsPage.addItemBtn().click();
        }
        String price = orderOptionsPage.addToCartBtnText().get(3).getText();
        char pricePoint = price.charAt(3);
        char pricePoint1 = '4';
        Assert.assertEquals(pricePoint, pricePoint1);
    }
}
