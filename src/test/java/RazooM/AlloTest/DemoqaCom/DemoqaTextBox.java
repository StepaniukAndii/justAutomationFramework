package RazooM.AlloTest.DemoqaCom;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.LinkedList;
import java.util.List;

public class DemoqaTextBox extends TestInit {

    DemoqaLocators locators;
    List<String> inputInfoText;

    @Test
    public void demoqaTextBox(){
         locators = new DemoqaLocators (driver);
         driver.get ("https://demoqa.com/");
         locators.demoqaElements().click();
         locators.demoqaBoxText().click();
         inputText();
         getInfo();
    }
    private void getInfo() {
        locators.demoqaButtonSubmit().click();
        int numBer = locators.demoqaListTextBox ().size();
        List<WebElement> element = locators.demoqaListTextBox();
        for(int i=0;i<numBer;i++){
            if(inputInfoText.equals (element)){
                Assert.assertEquals (inputInfoText,element);
            }
        }
    }
    private void inputText() {
        locators.demoqaName().sendKeys("Петька");
        locators.demoqaEmail().sendKeys("qwerty@ukr.net");
        locators.demoqaAdress().sendKeys("Бла,Бла,Бла,Бла,Бла,Бла,Бла,Бла,Бла,Бла");
        locators.demoqaPermanentAddress().sendKeys("Kiev");
        String name = locators.demoqaName().getText ();
        String email = locators.demoqaName().getText ();
        String aAdress = locators.demoqaName().getText ();
        String permanent = locators.demoqaName().getText ();
        inputInfoText = new LinkedList<>();
        inputInfoText.add (name);
        inputInfoText.add (email);
        inputInfoText.add (aAdress);
        inputInfoText.add (permanent);
    }
}