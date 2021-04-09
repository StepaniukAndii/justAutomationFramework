package AlloTest.TestClases;

import AlloTest.Pages.GooglePositionLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class GooglePosition extends TestInit {

    GooglePositionLocators locators;
    boolean aBoolean;
    String token;
    String myItem;
    List<WebElement> link;

    @Test
    public void googlePosition(){
        locators = new GooglePositionLocators (driver);
        openUrl ("https://www.google.com.ua/?hl=ru");
        locators.serchGoogle().sendKeys("сковорода");
        enter();

        link = locators.serchItems();
        myItem ="https://allo.ua";
        aBoolean = false;

        if(aBoolean==false){
            useForMethod ();
        }
        if (aBoolean==true ){
            clickNextList();
        }
    }
    public void useForMethod(){
        for (int i = 0; i < link.size(); i++) {
            token = (link.get(i).getAttribute("href"));
            System.out.println (token);

            if(token.contains (myItem)){
                System.out.println ("Есть совпадения");
                aBoolean =false;
                break;
            }else {
                System.out.println ("НЕТ совпадения");
                aBoolean = true;
            }
        }
    }
    public void clickNextList(){
        System.out.println ("ЕСледующий лист");
        locators.nextList().click();
    }
}