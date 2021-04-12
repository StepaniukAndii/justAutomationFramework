package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class TestRozetkaNegative extends TestInit {

    @Test
    public void testRozetkaNegative() {
        HomePage homePage= new HomePage(driver);
        openUrl("https://rozetka.com.ua/");
        RandomString randomString = new RandomString();
        homePage.searchField().sendKeys(randomString+"\n");
        ArrayList<WebElement> list = new ArrayList<>(homePage.getElementsGoods());
        int str = list.size();
        homePage.searchField().clear();
        Assert.assertEquals(str,0);
    }
}