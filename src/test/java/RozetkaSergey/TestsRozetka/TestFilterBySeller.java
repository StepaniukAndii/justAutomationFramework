package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilterBySeller extends TestInit   {
    RozetkaPages5_34 rozetkaPages5_34;
    @Test
    public void filterBySeller (){
        rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages5_34.searchField().sendKeys("пароварка");
        enter();
        closeAdIfExist();
        String sumInRozeka = rozetkaPages5_34.digitHowMuchInRozetka().get(0).getText().replaceAll("\\p{P}",""); //this one removes all skobki
        int intValue = Integer.parseInt(sumInRozeka);
        rozetkaPages5_34.digitHowMuchInRozetka().get(0).click();
        int sizeOfGoodsAtPage = rozetkaPages5_34.digitHowMushGoodsAtPage().size();
        Assert.assertEquals(sizeOfGoodsAtPage,intValue);
    }
}
