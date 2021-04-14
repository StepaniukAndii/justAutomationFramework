package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages1_4;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckSearchField extends TestInit {
    @Test
    public void checkSearchField (){
        RozetkaPages1_4 rozetkaPages1_4 = new RozetkaPages1_4(driver);
        rozetkaPages1_4.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages1_4.findSearchField().sendKeys("Телевизор");
        enter();
        List<String> elements = getAttributeCollection(rozetkaPages1_4.getElementsConstructor(), "title");
        for (String elenent : elements) {
            String str = elenent.toLowerCase();
            if (!str.contains("Телевизор")) {
                Assert.fail();
                sleep(1);
            }
        }
    }
}
