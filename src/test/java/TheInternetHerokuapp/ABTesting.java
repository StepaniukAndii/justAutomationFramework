package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ABTesting extends TestInit {

    Locators locators;
    WebElement element;
    List<String> listWords;
    String text;
    boolean tempBooleon;

    @Test
    public void  aBTesting(){
        locators = new Locators(driver);
        driver.get ("http://the-internet.herokuapp.com/");
        locators.aBTesting().click();
        getText();
        listWordsForCheckText();
        resultatCheckText();
        Assert.assertTrue (true,"Совпало");
    }
    private void listWordsForCheckText() {
        listWords = new ArrayList<> ();
        listWords.add ("Also");
        listWords.add ("nown");
        listWords.add ("This is a way");
        listWords.add ("which businesses");
        listWords.add ("to simultaneously");
        listWords.add ("different versions of a page");
    }
    private void resultatCheckText() {
        for(String token:listWords){
           if(text.contains (token)){
              System.out.println ("Совпадение");
              tempBooleon = true;
           }
        }
    }
    private void getText() {
        element = locators.abgetText ();
        text = element.getText ();
        System.out.println (text);
    }
}