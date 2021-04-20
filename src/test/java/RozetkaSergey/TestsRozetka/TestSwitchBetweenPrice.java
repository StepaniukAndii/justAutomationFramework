package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSwitchBetweenPrice extends TestInit  {
    RozetkaPages5_34 rozetkaPages5_34;
    @Test
    public void switchBetweenPrice (){
        boolean value;

        rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        closeAdIfExist();
        rozetkaPages5_34.searchField().sendKeys("пароварка");
        enter();
        sleep(1);
        Select select = new Select(driver.findElement(By.xpath("//select[@class='select-css ng-untouched ng-pristine ng-valid']")));
        select.selectByValue("2: expensive");
        sleep(2);
        String theBiggestPrice = rozetkaPages5_34.listOfPrices().get(0).getText().replaceAll(" ", "");
        int theBiggestPriceInt = Integer.parseInt(theBiggestPrice);
        select.selectByValue("1: cheap");
        sleep(2);
        String theLowestPrice = rozetkaPages5_34.listOfPrices().get(0).getText().replaceAll(" ", "");
        int theLowestPriceInt = Integer.parseInt(theLowestPrice);
        value = theLowestPriceInt < theBiggestPriceInt;
        Assert.assertEquals(value,true);
    }

}
