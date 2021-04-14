package AlloTest.TestClases;

import AlloTest.Pages.FooterLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.WeakHashMap;

public class FooterUsefulInformation extends TestInit {

    FooterLocators locators;

    @Test
    public void FooterUsefulInformation(){
        locators = new FooterLocators (driver);
        driver.get("https://allo.ua");
        getLink();
        useLink();

    }
    private void useLink() {
    }
    private void getLink() {
        List<WebElement> list = locators.sss ();
        for(WebElement url:list){
            System.out.println (url);
            moveMouseToElement (url);
            sleep (5);
            url.click ();
        }
    }
}
