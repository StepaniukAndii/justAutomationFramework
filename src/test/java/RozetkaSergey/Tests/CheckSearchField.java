package RozetkaSergey.Tests;

import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import RozetkaSergey.VijarPages.VijarPages5_8;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckSearchField extends TestInit {
    @Test
    public void checkSearchField () {
        VijarPages5_8 vijarPages5_8 = new VijarPages5_8(driver);
        vijarPages5_8.enterToVijar("https://viyar.ua/");
        vijarPages5_8.closeAdverb().click();
        vijarPages5_8.findSearchFiel().sendKeys("Egger");
        vijarPages5_8.clickOnFind().click();
        vijarPages5_8.closeAdverb().click();
        List<String> elements = getAttributeCollection(vijarPages5_8.getElementsEgger(), "title");
        for (String elenent : elements) {
            String str  =   elenent.toLowerCase();
            if (!str.contains("egger")) {
                Assert.fail();
            }
        }
    }
}
