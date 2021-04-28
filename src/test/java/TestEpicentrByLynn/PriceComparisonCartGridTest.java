package TestEpicentrByLynn;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class PriceComparisonCartGridTest extends TestInit {
    @Test
    public void priceComparisonTest() {
        HomePage homePage = new HomePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://epicentrk.ua/");
        homePage.popupWindow().click();
        homePage.searchField().sendKeys("краска\n");
        sleep(2);

        for (int i = 0; i < 5; i++) {
            js.executeScript("arguments[0].scrollIntoView();", homePage.buyBtns().get(i));
            homePage.buyBtns().get(i).click();
            sleep(1);
            js.executeScript("arguments[0].scrollIntoView();", homePage.continueShopping());
            homePage.continueShopping().click();
        }

        homePage.cartBtn().click();

        ArrayList<String> priceAL = new ArrayList<>(20);
        for (int i = 0; i < homePage.priceList().size(); i++) {
            priceAL.add(homePage.priceList().get(i).getText().split(" ₴")[0]);
        }

        ArrayList<String> pricesFromGridAL = new ArrayList<>(20);
        for (int i = 0; i < homePage.priceList().size(); i++) {
            pricesFromGridAL.add(homePage.priceList().get(i).getText().split(" ₴")[0]);
            js.executeScript("window.scrollBy(0,230)");
        }
        System.out.println(priceAL);
        System.out.println(pricesFromGridAL);
        boolean comparingPrices = pricesFromGridAL.equals(priceAL);
        System.out.println(comparingPrices);
    }
}
