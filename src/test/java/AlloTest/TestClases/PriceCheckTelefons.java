package AlloTest.TestClases;

import AlloTest.Pages.LocatorsForPriceCheckTelefons;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.LinkedList;
import java.util.List;

public class PriceCheckTelefons extends TestInit {

    @Test
    public void priceCheckTelefons() {
        LocatorsForPriceCheckTelefons locator = new LocatorsForPriceCheckTelefons (driver);
        openUrl ("https://allo.ua/ru/");
        locator.smartAndTelefons ().click ();
        locator.telefons ().click ();
        locator.valuePriceOne ().clear ();
        locator.valuePriceOne ().sendKeys ("2000");
        locator.valuePriceTwo ().clear ();
        locator.valuePriceTwo ().sendKeys ("5000");
        locator.showFilterTelefons ().click ();
        sleep (10);
        for (WebElement element : locator.priceTelefons ()) {
            int x;
            String str = element.getText();
            while (str.contains(" ")) {
                str = str.replace(" ", "");
            }
            x=Integer.parseInt(str);
            if(x > 5000){
                Assert.fail();
            }
            if(x< 2000){
                Assert.fail();
            }
        }
        System.out.println ("Цены на телефоны  от 2000х, до 5000ти тысячь");
    }
}
