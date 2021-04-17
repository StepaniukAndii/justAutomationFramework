package AlloTest.TestURLClicabls;

import AlloTest.Pages.SmartAndTelefonsCheckBarLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class VCatalogRelatedCategoriesUrlClick  extends TestInit {

    SmartAndTelefonsCheckBarLocators locators;

    @Test
    public void vCatalogPopularUrlClick(){
        locators = new SmartAndTelefonsCheckBarLocators (driver);
        driver.navigate().to("https://allo.ua");
        locators.smartAndTell().click();
        getUrl();
    }
    private void getUrl() {
        int urlNum = locators.listURLRelatedCategories().size();
        for(int i = 0; i<urlNum; i++){
            sleep(3);
            List<WebElement> tempUrlList = locators.listURLRelatedCategories();
            WebElement element = tempUrlList.get(i);
            String url = element.getAttribute("href");
            System.out.println(url);
            element.click();
            sleep (3);
            driver.navigate().back();
        }
    }
}
