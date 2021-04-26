package RazooM.AlloTest.TestURLClicabls;

import RazooM.AlloTest.Pages.SmartAndTelefonsCheckBarLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class VCatalogManufaktureUrlClick extends TestInit {

    SmartAndTelefonsCheckBarLocators locators;
    List<WebElement> elements;

    @Test
    public void vCatalogManufaktureUrlClic(){
        locators = new SmartAndTelefonsCheckBarLocators (driver);
        driver.navigate().to("https://allo.ua");
        locators.smartAndTell().click();
        locators.manufaktureButtonAllGoods().click ();
        clickUrl ();
    }
    private void getLink() {
        elements = new ArrayList<>();
        elements.add (locators.linkFtnesBraslet());
        elements.add (locators.linkSmartClock());
        elements.add (locators.linkFtnesElTrans());
        elements.add (locators.linkPlanshet());
    }
    private void clickUrl() {
        for(int i = 0; i<3; i++){
            sleep(3);
            getLink ();
            List<WebElement> tempUrlList = elements;
            WebElement element = tempUrlList.get(i);
            element.click();
            sleep (1);
            driver.navigate().back();
        }
    }
}