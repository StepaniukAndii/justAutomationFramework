package TestEpicentrByLynn;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class SaleLabelTest extends TestInit {
    @Test
    public void saleLabelTest() {
        HomePage homePage = new HomePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://epicentrk.ua/");
        homePage.searchField().sendKeys("двері вхідні\n");
        String lastPageString = homePage.pageNumber().get(homePage.pageNumber().size()-1).getText();
        int lastPageInt = Integer.parseInt(lastPageString);
        for (int i = 0; i < lastPageInt-1; i++) {
            js.executeScript("arguments[0].scrollIntoView();", homePage.showMore());
            homePage.showMore().click();
            sleep(4);
        }
        System.out.println(homePage.saleStickers().size());
    }
}
