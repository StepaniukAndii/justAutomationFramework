package AlloTest.TestClases;

import AlloTest.Pages.FooterLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FooterCompaniCheckUrl extends TestInit {

    FooterLocators locators;
    String token;
    List<String> url;

    @Test
    public void footerCompaniCheckUrl(){
        locators = new FooterLocators(driver);
        driver.get ("https://allo.ua");
        getLink();
    }
    private void getLink() {
        List<WebElement> link = locators.footerCompaniList ();
        for (int i = 0; i < link.size(); i++) {
            token = (link.get(i).getAttribute("href"));
            url = new LinkedList<> ();
            url.addAll(Collections.singleton (token));
        }
    }
}
