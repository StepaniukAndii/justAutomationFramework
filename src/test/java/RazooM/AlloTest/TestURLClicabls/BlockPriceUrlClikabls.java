package RazooM.AlloTest.TestURLClicabls;

import RazooM.AlloTest.Pages.PageHomeAllo;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class BlockPriceUrlClikabls extends TestInit {

    PageHomeAllo locators;

    @Test
    public void vCatalogPopularUrlClick() {
        locators = new PageHomeAllo(driver);
        driver.navigate().to("https://allo.ua");
        clickUrl();
    }
    private void clickUrl() {
        moveMouseToElement(locators.buttonArrowMous());
        int number = locators.blockPriceProduks().size();
        for (int i=0;i<number;i++){
            moveMouseToElement(locators.buttonArrowMous());
            sleep (1);
            List<WebElement> tempUrl = locators.blockPriceProduks();
            WebElement url = tempUrl.get(i);
            String link =url.getAttribute("href");
            System.out.println(link);
            url.click();
            sleep (1);
            driver.navigate().back();
        }
    }
}