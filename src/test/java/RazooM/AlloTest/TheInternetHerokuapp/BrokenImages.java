package RazooM.AlloTest.TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import RazooM.AlloTest.TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.LinkedList;
import java.util.List;

public class BrokenImages extends TestInit {

    Locators locators;
    List<WebElement> imagesList = new LinkedList<> ();

    @Test
    public void basicAuth(){
        locators = new Locators (driver);
        driver.get ("http://the-internet.herokuapp.com/");
        locators.brokenImages().click();
        getListImeges();
        checkListImeges();
    }
    private void checkListImeges() {
        for(WebElement image:imagesList){
            if (image.getAttribute("naturalWidth").equals("0"))
            {
                System.out.println(image.getAttribute("outerHTML") + " Картинка сломана");
            }
        }

    }
    private void getListImeges() {
        List<WebElement> elements = locators.listBrokenImages();
        for (WebElement token:elements){
            imagesList.add(token);
            System.out.println (token.getAttribute ("outerHTML"));
        }
        System.out.println ("---------------------------------");
    }
}