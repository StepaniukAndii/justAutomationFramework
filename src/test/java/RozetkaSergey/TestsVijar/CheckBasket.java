package RozetkaSergey.TestsVijar;

import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import RozetkaSergey.VijarPages.VijarPages9_12;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBasket extends TestInit    {
    @Test
    public void checkBasket (){

        VijarPages9_12 vijarPages9_12 =new VijarPages9_12(driver);
        vijarPages9_12.enterToVijar("https://viyar.ua/");
        vijarPages9_12.closeAdverb().click();
        vijarPages9_12.topBar2().click();
        vijarPages9_12.clickOnSamorezy().click();
        vijarPages9_12.closeAdverb().click();
        vijarPages9_12.getItems().get(0).click();
        vijarPages9_12.closeAdverb().click();
        vijarPages9_12.pickBuy().get(0).click();
        String boltFirstPrice = vijarPages9_12.getPrice().getText();
        double convertetBoltFirstPrice = Double.parseDouble(boltFirstPrice);
        vijarPages9_12.pickBuy2().get(0).click();
        vijarPages9_12.checkOut().click();
        vijarPages9_12.addItemToCard().click();
        getElement("//input[@class='onlyNumber pull-left']").sendKeys("0");
        sleep(1);
        double fullBoltsPrice = convertetBoltFirstPrice*30*10/10;
        getElement("//h2[@class='lk_heading_content']").click();
        sleep(1);
        String  totalOrderPrise = vijarPages9_12.getTheSecondPrice().getText().split(" ")[0];
        double convertedTotalPrise = Double.parseDouble(totalOrderPrise);
        Assert.assertEquals(fullBoltsPrice,convertedTotalPrise);
    }

}
