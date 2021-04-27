package RazooM.AlloTest.CheckTextTests;

import RazooM.AlloTest.Pages.GooglePositionLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GooglePosition extends TestInit {

    GooglePositionLocators locators;
    boolean booLeon;
    String myWord;

    @Test
    public void googlePosition(){
        locators = new GooglePositionLocators (driver);
        openUrl ("https://www.google.com.ua/?hl=ru");
        locators.serchGoogle().sendKeys("skovorodka");
        enter();
        myWord ="https://allo.ua";
        booLeon = false;
        searchSite ();
    }
    public void searchSite(){
        int numBer = locators.serchItems().size();
        for (int i = 0; i < numBer; i++) {
            List<WebElement> tempUrl = locators.serchItems ();
            WebElement url = tempUrl.get(i);
            String tokenWord = url.getAttribute ("href");
            if(tokenWord.contains (myWord)){
                System.out.println ("Есть совпадения");
                booLeon =true;
                break;
            }
        }
        if(booLeon == false){
            clickNextList ();
        }else {
            return;
        }
    }
    public void clickNextList(){
        System.out.println ("ЕСледующий лист");
        locators.nextList().click();
        searchSite ();
    }
}