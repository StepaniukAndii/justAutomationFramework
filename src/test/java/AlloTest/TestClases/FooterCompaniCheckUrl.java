package AlloTest.TestClases;

import AlloTest.Pages.FooterLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FooterCompaniCheckUrl extends TestInit {

    FooterLocators locators;
    String tab;
    List<WebElement> elementList;
    List<WebElement> url;

    @Test
    public void footerCompaniCheckUrl(){
        locators = new FooterLocators(driver);
        driver.get ("https://allo.ua");
        tab = driver.getWindowHandle();
        getUrl ();
        clickUrl();
    }
    private void clickUrl() {
        for (WebElement x:url){
            System.out.println (x);
            moveMouseToElement (x);
            x.click();
            driver.switchTo().window(tab);
        }
    }
    private void getUrl() {
        elementList = locators.footerCompaniList();
        for (WebElement element:elementList){
            element.getSize ();
            url = new LinkedList<>();
            url.addAll(Collections.singleton(element));
        }
    }
}