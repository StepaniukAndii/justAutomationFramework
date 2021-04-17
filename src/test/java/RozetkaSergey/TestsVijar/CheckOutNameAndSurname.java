package RozetkaSergey.TestsVijar;

import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import RozetkaSergey.VijarPages.VijarPages5_8;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutNameAndSurname extends TestInit {
    @Test
    public void checkOutNameAndSurname (){
        VijarPages5_8 vijarPages5_8 = new VijarPages5_8(driver);
        vijarPages5_8.enterToVijar("https://viyar.ua/");
        vijarPages5_8.closeAdverb().click();
        vijarPages5_8.goToEnter().click();
        vijarPages5_8.getLogin().sendKeys(vijarPages5_8.getterLogin());
        vijarPages5_8.getPass().sendKeys(vijarPages5_8.getterPass());
        vijarPages5_8.clickEnter().click();
        vijarPages5_8.closeAdverb().click();
        vijarPages5_8.goToProfil().click();
        String surname = vijarPages5_8.getSurname().getAttribute("value");
        Assert.assertEquals(surname,"Гринчук");
        String name = vijarPages5_8.getName().getAttribute("value");
        Assert.assertEquals(name, "Сергей");
    }
}
