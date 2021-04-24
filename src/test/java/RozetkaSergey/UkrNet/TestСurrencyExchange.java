package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import org.testng.annotations.Test;

public class TestСurrencyExchange extends TestInit {
    float lastBoard = 30.0f;
    float currentRate;

    @Test
    public void currencyExchange() {
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
        ukrNetPages.buttonCurrencyExchange().click();
        String usaMoney = ukrNetPages.listOfMoney().get(0).getText();
        currentRate = Float.parseFloat(usaMoney);
        System.out.println(whatToDo());

    }

    public String whatToDo() {
        if (lastBoard > currentRate) {
            return "All good, live here!";

        }else
        return "Run from here!";
    }
}
