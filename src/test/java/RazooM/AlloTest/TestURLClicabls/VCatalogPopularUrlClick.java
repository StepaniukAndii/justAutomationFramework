package RazooM.AlloTest.TestURLClicabls;

import RazooM.AlloTest.Pages.SmartAndTelefonsCheckBarLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class VCatalogPopularUrlClick extends TestInit {

    SmartAndTelefonsCheckBarLocators locators;

    @Test
    public void vCatalogPopularUrlClick(){
        locators = new SmartAndTelefonsCheckBarLocators (driver);
        driver.navigate().to("https://allo.ua");
        locators.smartAndTell().click();
        getUrl();
    }
    private void getUrl() {
        int urlNum = locators.listURLPopular().size();
        for(int i = 0; i<urlNum; i++){
            sleep(1);
            List<WebElement> tempUrlList = locators.listURLPopular();
            WebElement element = tempUrlList.get(i);
            String url = element.getAttribute("href");
            System.out.println(url);
            element.click();
            sleep (1);
            driver.navigate().back();
        }
    }
}