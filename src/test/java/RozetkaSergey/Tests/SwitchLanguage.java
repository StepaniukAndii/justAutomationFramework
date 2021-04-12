package RozetkaSergey.Tests;

import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import RozetkaSergey.VijarPages.VijarPages1_4;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwitchLanguage extends TestInit {
    @Test
    public void switchLanguage() {
        VijarPages1_4 vijarPages1_4 = new VijarPages1_4(driver);
        vijarPages1_4.enterToVijar("https://viyar.ua/");
        vijarPages1_4.closeAdverb().click();
        vijarPages1_4.switchToUa().click();
        vijarPages1_4.closeAdverb().click();
        String lang = vijarPages1_4.newsHeaderElement().getText();
        Assert.assertEquals(lang, "Новини");
    }
}
