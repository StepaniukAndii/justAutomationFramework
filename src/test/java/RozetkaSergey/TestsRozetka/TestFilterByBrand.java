package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestFilterByBrand extends TestInit {
    @Test
    public void filterByBrend() {
        RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages5_34.searchField().sendKeys("пароварка");
        enter();
        closeAdIfExist();
        rozetkaPages5_34.brauneButton().click();
        List<String> elements = getAttributeCollection(rozetkaPages5_34.listOfBraungoods(),"title");
        for (String elenent : elements) {
            String str = elenent.toLowerCase();
            if (!str.contains("braun")) {
                Assert.fail();
                sleep(1);
            }
        }
    }
}
